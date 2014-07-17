/**
 * 
 */
package com.ifli.rapid.services.util;

import com.billdesk.pgidsk.PGIUtil;
import com.ifli.rapid.model.Customer;
import com.ifli.rapid.model.PaymentDetails;
import com.ifli.rapid.model.PaymentGatewayMaster;
import com.ifli.rapid.model.PaymentMethodMaster;
import com.ifli.rapid.model.PaymentMethodType;
import com.ifli.rapid.model.PaymentOptionMaster;
import com.ifli.rapid.model.PaymentOptionTypes;
import com.ifli.rapid.model.PaymentTransactionStatusMaster;
import com.ifli.rapid.model.impl.PaymentDetailsImpl;
import com.ifli.rapid.model.impl.PaymentTransactionStatusMasterImpl;
import com.ifli.rapid.service.CustomerLocalServiceUtil;
import com.ifli.rapid.service.PaymentDetailsLocalServiceUtil;
import com.ifli.rapid.service.PaymentGatewayMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentMethodMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentMethodTypeLocalServiceUtil;
import com.ifli.rapid.service.PaymentOptionMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentOptionTypesLocalServiceUtil;
import com.ifli.rapid.service.PaymentTransactionStatusMasterLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PaymentDto;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.ResourceBundle;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.common.util.StringUtils;

/**
 * @author admin
 *
 */
public class PaymentControllerHelper {

	private Log logger = LogFactoryUtil.getLog(PaymentControllerHelper.class);
	private static ResourceBundle bundle = ResourceBundle.getBundle(Constants.RESOURCE_BUNDLE_NAME);
	
	@SuppressWarnings("unchecked")
	public String[] savePaymentTemp(com.ifli.rapid.services.helper.beans.PaymentDto paymentDto, ResourceRequest request, ResourceResponse response){
		String[] gatewayUrl = new String[4];
		try{
			paymentDto.setRedirectURL(bundle.getString("ifl.payment.returnurl"));
			Customer contact = CustomerLocalServiceUtil.getCustomer(Integer.parseInt(paymentDto.getContactId()));

			if (contact != null) {
				PaymentOptionMaster optionMaster = null;
				try {
					optionMaster = PaymentOptionMasterLocalServiceUtil.getPaymentOptionMaster(paymentDto.getPaymentOptionId());
				} catch (Exception e) {
					logger.error("Exception While fetching PaymentOptionMaster:" + e.toString());
				}

				PaymentMethodMaster methodMaster = null;
				try {
					methodMaster = PaymentMethodMasterLocalServiceUtil.getPaymentMethodMaster(paymentDto.getPaymentMethodId());
				} catch (Exception e) {
					logger.error("Exception While fetching PaymentMethodMaster:" + e.toString());
				}

				PaymentMethodType paymentMethodType = null;
				if (methodMaster != null && methodMaster.getPaymentMethodKey().toUpperCase().contains("IMPS")) {
					
					DynamicQuery query1 = DynamicQueryFactoryUtil.forClass(PaymentMethodType.class);
					query1.add(PropertyFactoryUtil.forName("PaymentMethodID").eq(methodMaster.getPaymentMethodID()));
					List<PaymentMethodType> pmt = null;
					try {
						pmt = PaymentMethodTypeLocalServiceUtil.dynamicQuery(query1);
					} catch (Exception e) {
						logger.error("Exception in FundswitchController - saveFundswitch() : " + e.getMessage(), e);
					}
					
					if(pmt != null && !pmt.isEmpty()){
					for (PaymentMethodType type : pmt) {
						paymentMethodType = type;
						break;
					}
					}
				} else {
					try {
						paymentMethodType = PaymentMethodTypeLocalServiceUtil.getPaymentMethodType(paymentDto.getPaymentMethodDetailsId());
					} catch (Exception e) {
						logger.error("Exception While fetching PaymentMethodType:" + e.toString());
					}
				}

				if (paymentMethodType == null) {
					logger.info("Invalid paymentMethodId or paymentMethodDetailsId");
				} else {
					PaymentDetails paymentDetails = new PaymentDetailsImpl();
					paymentDetails.setPremiumAmount(Double.valueOf(paymentDto.getPremiumAmount()));
					paymentDetails.setPaymentOptionId(optionMaster.getPaymentOptionId());
					paymentDetails.setPaymentMethodID(methodMaster.getPaymentMethodID());
					paymentDetails.setBankName(paymentMethodType.getBankId());
					paymentDetails.setCreatedBy("ifli");
					paymentDetails.setCreatedDate(new Date());

					boolean isSuccesss = false;

					PaymentOptionTypes paymentOptionTypes = null;
					if (!StringUtils.isEmpty(paymentDto.getPaymentOptionTypeId())) {
						try {
							paymentOptionTypes = PaymentOptionTypesLocalServiceUtil.getPaymentOptionTypes(paymentDto.getPaymentOptionTypeId());
						} catch (Exception e) {
							logger.error("Exception While fetching PaymentOptionTypes:" + e.toString());
						}

						if (paymentOptionTypes != null) {
							if (!StringUtils.isEmpty(paymentOptionTypes.getOptionTypesKey())) {
							 if (paymentOptionTypes.getOptionTypesKey().equalsIgnoreCase("RAPID.PAYMENTOPTIONTYPES.TP")) {
									paymentDetails = PaymentDetailsLocalServiceUtil.addPaymentDetails(paymentDetails);
									
									isSuccesss = true;
								} else {
									paymentDetails =  PaymentDetailsLocalServiceUtil.addPaymentDetails(paymentDetails);
								
									isSuccesss = true;
								}
							} else {
								logger.info("Payment OptionTypeKey is null");
							}
						} else {
							logger.info("Invalid PaymentOptionTypeId");
						}
					} else {
						paymentDetails =  PaymentDetailsLocalServiceUtil.addPaymentDetails(paymentDetails);
						isSuccesss = true;
					}
					if (isSuccesss) {
						paymentDto.setPaymentId(paymentDetails.getPaymentId()+"");
						PaymentGatewayMaster paymentGatewayMaster = PaymentGatewayMasterLocalServiceUtil.getPaymentGatewayMaster(paymentMethodType.getGatewayID());
						//System.out.println("=---------------------get gateway----------------------"+paymentMethodType.getGatewayID());
						gatewayUrl[0] = paymentDetails.getPaymentId()+"";
						gatewayUrl[1] = generateGatewayUrl(paymentDto, contact, paymentMethodType, request, response, paymentGatewayMaster);
						//System.err.println("-----------gateway url string 2-----------"+gatewayUrl[1]);
					
						if (paymentGatewayMaster != null && paymentGatewayMaster.getGatewayKey() != null && paymentGatewayMaster.getGatewayKey().equalsIgnoreCase("RAPID.GURL.BOB")) {
							gatewayUrl[2] = gatewayUrl[1];
							gatewayUrl[3] = "BOB";
						} else {
							gatewayUrl[2] = bundle.getString("ifl.payment.billdesk.url");
							gatewayUrl[3] = "BillDesk";
						}

					} else {
						logger.error("PaymentRequest is not Save");
					}
				}
			} else {
				logger.error("Contact not Available for Contact::" + paymentDto.getContactId());
			}
		} catch(Exception e){
			logger.error("Error in PaymentController.savePaymentTemp() ");
		}
		return gatewayUrl;
	}
	
	
	
	private String generateGatewayUrl(com.ifli.rapid.services.helper.beans.PaymentDto paymentDto, Customer contact, PaymentMethodType paymentMethodType,
			ResourceRequest request, ResourceResponse response, PaymentGatewayMaster paymentGatewayMaster) {
		logger.info("paymentDto::" + paymentDto);
		String gatewayUrl = "";
		String returnUrl = paymentDto.getRedirectURL();
		BobRequest bobRequest = new BobRequest();
		HttpServletResponse response1 = null;
		String mobile = contact.getPHONE_NUMBER_1();
		logger.info("returnUrl::" + returnUrl);
		if (paymentGatewayMaster.getGatewayKey().equalsIgnoreCase("RAPID.GURL.BOB")) {
			gatewayUrl = bobRequest.generateBobRequest(paymentMethodType.getBankId(), paymentGatewayMaster.getItemCode(),
					paymentDto.getApplicationNo(), contact.getCUSTOMER_FIRST_NAME() + " " + contact.getCUSTOMER_LAST_NAME(), paymentDto.getPremiumAmount(), contact,
					response1, returnUrl, mobile);
		} else {
			paymentDto.setMobile(mobile);
			String bankId = paymentMethodType.getBankId();
			String itemCode = paymentGatewayMaster.getItemCode();
			gatewayUrl = bobRequest.getBillDeskUrl(paymentDto, contact, bankId, itemCode, returnUrl);
		}
		return gatewayUrl;
	}


	public void bobResp(PaymentDto paymentDto,  String responseData) throws Exception {
		
		
		logger.info("paymentDto.getIsBobRequest():::" + paymentDto.getIsBobRequest());
		com.ifli.rapid.services.util.BobResponse bobResponse = new com.ifli.rapid.services.util.BobResponse();
		
		PaymentTransactionStatusMaster paymentTransactionStatusMaster = new PaymentTransactionStatusMasterImpl();
		paymentTransactionStatusMaster.setCreatedBy("IFLI");
		paymentTransactionStatusMaster.setCreatedDate(new Date());
		
		
		Hashtable<String, String> responseTable = bobResponse.getBobResponse(responseData);
		if (responseTable.get("RespCode").equals("0")) {
			paymentTransactionStatusMaster.setStatusCode(0);
			paymentTransactionStatusMaster.setStatusName("Success");
		} else {
			paymentTransactionStatusMaster.setStatusCode(1);
			paymentTransactionStatusMaster.setStatusName("Fail");
		}
		PaymentDetails paymentDetails = new PaymentDetailsImpl();// TODO: need to get payment details from taking payment is from respose msg
		paymentTransactionStatusMaster = PaymentTransactionStatusMasterLocalServiceUtil.addPaymentTransactionStatusMaster(paymentTransactionStatusMaster);
		paymentDetails.setTransactionStatusID(paymentTransactionStatusMaster.getTransactionStatusID());
		paymentDetails.setTransactionReferenceNo(responseTable.get("ePGTxnID"));
		paymentDetails.setBobMerchantTxnId(responseTable.get("TxnID"));
		PaymentDetailsLocalServiceUtil.updatePaymentDetails(paymentDetails);
	}
	
	public void billDeskResp(PaymentDetails paymentDetails, String responseData) throws Exception {
		logger.info("response::" + responseData);
		int last_index = responseData.lastIndexOf("|");
		String firstStringMsg = responseData.substring(0, last_index);
		String lastStringMsg = responseData.substring(last_index + 1);
		logger.info("PaymentDAO.storeResponse(): FIRST_STRING_MSG: " + firstStringMsg + ", LAST_STRING_MSG: " + lastStringMsg);
		String strHash = PGIUtil.doDigest(firstStringMsg, bundle.getString("ifl.billdesk.checksum.password"));
		logger.info("PaymentDAO.storeResponse(): strHash == received: " + strHash + " == " + lastStringMsg);
		if (strHash.equals(lastStringMsg)) {
			String[] paymentResponse = responseData.split("\\|");
			logger.info("paymentResponse[14]::" + paymentResponse[14]);
			
			PaymentTransactionStatusMaster paymentTransactionStatusMaster = new PaymentTransactionStatusMasterImpl();
			paymentTransactionStatusMaster.setCreatedBy("IFLI");
			paymentTransactionStatusMaster.setCreatedDate(new Date());
			
			if (paymentResponse[14].equals("0300")) {
				paymentTransactionStatusMaster.setStatusCode(0);
				paymentTransactionStatusMaster.setStatusName("Success");
			} else {
			paymentTransactionStatusMaster.setStatusCode(1);
			paymentTransactionStatusMaster.setStatusName("Fail");
			}
			paymentTransactionStatusMaster = PaymentTransactionStatusMasterLocalServiceUtil.addPaymentTransactionStatusMaster(paymentTransactionStatusMaster);
			paymentDetails.setTransactionStatusID(paymentTransactionStatusMaster.getTransactionStatusID());
			//paymentDetails.setPaymentReceiptNo(receiptNo);
			paymentDetails.setTransactionReferenceNo(paymentResponse[2]);
			paymentDetails.setBillDeskMerchantId(paymentResponse[0]);
			PaymentDetailsLocalServiceUtil.updatePaymentDetails(paymentDetails);
		} else {
			logger.info("Check Sum Value is not Matched");
			throw new WebServiceException("Check Sum Value is not Matched");
		}
	}
}
