package com.ifli.rapid.services.util;



import com.billdesk.pgidsk.PGIUtil;
import com.ecs.epg.sfa.java.BillToAddress;
import com.ecs.epg.sfa.java.MPIData;
import com.ecs.epg.sfa.java.Merchant;
import com.ecs.epg.sfa.java.PGReserveData;
import com.ecs.epg.sfa.java.PGResponse;
import com.ecs.epg.sfa.java.PostLib;
import com.ecs.epg.sfa.java.ShipToAddress;
import com.ifli.rapid.model.Customer;
import com.ifli.rapid.services.helper.beans.PaymentDto;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class BobRequest {
	static Logger logger = Logger.getLogger(BobRequest.class);
	private static ResourceBundle bundle = ResourceBundle.getBundle(Constants.RESOURCE_BUNDLE_NAME);

	public String generateBobRequest(String bankId, String itemCode, String policyNo, String policyHolderName, String amount, Customer contact,
			HttpServletResponse response, String returnUrl, String mobileNumber) {
		logger.info("BobRequest.generateBobRequest().START");
		String gatewayUrl = null;
		BillToAddress billToAddress = new BillToAddress();
		ShipToAddress shipToAddress = new ShipToAddress();
		Merchant merchant = new Merchant();
		MPIData mpiData = new MPIData();
		PostLib postLib = null;
		PGReserveData pgReserveData = new PGReserveData();
		String email = contact.getCUSTOMER_EMAIL_ADDR();
		String merchantId = bundle.getString("ifl.payment.bob.merchantid");
		try {
			postLib = new PostLib("BOB");
		} catch (Exception ex) {
			logger.error("Exception Caught :: ", ex);
		}

		/* for mobile num */

		/*
		 * mobileNumber = isShortPremium ? PaymentIntegrationConstant.EXT1 :
		 * mobileNumber;
		 */
		logger.info("mobileNumber for setMerchantDetails() :: " + mobileNumber);
		logger.info("amount::" + amount);

		merchant.setMerchantDetails(merchantId, merchantId, merchantId, "", System.currentTimeMillis() + "", policyNo, returnUrl, "post", "INR",
				contact.getCUSTOMER_ID()+"", "req.Sale", amount, "GMT+05:30", mobileNumber, "true", "Ext3", "Ext4", "Ext5");

		mpiData.setMPIRequestDetails(
				convertIntoPaise(amount),
				"INR" + amount,
				"356",
				"2",
				"",
				"",
				"",
				"",
				"0",
				"",
				"image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/vnd.ms-powerpoint, application/vnd.ms-excel, application/msword, application/x-shockwave-flash, */*",
				"Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0)");

		logger.info("mobileNumber for setReserveObj() to set in Reserve6 :: " + mobileNumber);

		pgReserveData.setReserveObj(policyHolderName, email, amount, policyNo, contact.getCUSTOMER_ID()+"", mobileNumber, "", "", "", "");

		PGResponse pgResponse = postLib.postSSL(billToAddress, shipToAddress, merchant, mpiData, response, pgReserveData);
		logger.info("PG RESPONSE ::: " + pgResponse);
		gatewayUrl = pgResponse.getRedirectionUrl();
		logger.info("BOB gateWay URL::::::::"+gatewayUrl);
		return gatewayUrl;
	}

	public String getBillDeskUrl(PaymentDto paymentDto, Customer contact, String bankId, String itemCode, String returnUrl) {
		String gatewayUrl;
		StringBuilder billDeskRequest = new StringBuilder();
		billDeskRequest.append(PaymentIntegrationConstant.INDIAFIRST);
		billDeskRequest.append(paymentDto.getApplicationNo() != null ? paymentDto.getApplicationNo() : paymentDto.getPolicyNo()
				+ PaymentIntegrationConstant.VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(paymentDto.getPremiumAmount() + PaymentIntegrationConstant.VERTICAL_BAR);
		billDeskRequest.append(bankId + PaymentIntegrationConstant.VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.INR);
		billDeskRequest.append(itemCode + PaymentIntegrationConstant.VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.R);
		billDeskRequest.append(PaymentIntegrationConstant.INDIAFIRST_VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.F);
		billDeskRequest.append(contact.getCUSTOMER_FIRST_NAME() + " " + contact.getCUSTOMER_LAST_NAME() + PaymentIntegrationConstant.VERTICAL_BAR);
		billDeskRequest.append(contact.getCUSTOMER_ID()+"" + PaymentIntegrationConstant.VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.BILLDESK_VERTICAL_BAR);

		billDeskRequest.append(paymentDto.getMobile() + PaymentIntegrationConstant.VERTICAL_BAR);
		if(paymentDto.getPaymentId() !=null){
		billDeskRequest.append(paymentDto.getPaymentId()+"" + PaymentIntegrationConstant.VERTICAL_BAR);
		}else{
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		}
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(PaymentIntegrationConstant.NA_VERTICAL_BAR);
		billDeskRequest.append(returnUrl);
		
		//billDeskRequest.append("INDIAFIRST|50000000|NA|5150.0|AM2|NA|NA|INR|DIRECT|R|indiafirst|NA|NA|F|Manoj Kushwaha|67154CE4-CA67-4CF2-94DB-023028FD375D|BILLDESK|9028605616|NA|NA|NA|http://uat.indiafirstlife.com/rapid/PaymentResponse.html");
		String checksum = PGIUtil.doDigest(billDeskRequest.toString(), bundle.getString("ifl.billdesk.checksum.password"));
		billDeskRequest.append(PaymentIntegrationConstant.VERTICAL_BAR + checksum);

		gatewayUrl = billDeskRequest.toString();
		logger.info("gatewayUrl :: " + gatewayUrl);
		return gatewayUrl;
	}

	
	private String convertIntoPaise(String amount) {
		logger.info("BobRequest.convertIntoPaise() amount:" + amount);
		int rupees = 0;
		int paise = 0;
		String[] amt = amount.split("\\.");
		if (amt.length == 2) {
			rupees = Integer.parseInt(amt[0]);
			paise = Integer.parseInt(amt[1]);
		} else {
			rupees = Integer.parseInt(amt[0]);
		}

		return Integer.toString(rupees * 100 + paise);
	}
}