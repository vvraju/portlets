package com.ifli.rapid.services.util;


import com.ecs.epg.sfa.java.EPGCryptLib;
import com.ecs.epg.sfa.java.EPGMerchantEncryptionLib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

public class BobResponse {

	static Logger logger = Logger.getLogger(BobResponse.class);

	private static ResourceBundle bundle = ResourceBundle.getBundle("sfa");
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("env-rapid");

	public Hashtable<String, String> getBobResponse(String responseData) {
		logger.info("BobResponse.getBobResponse().START");
		// String responseMethod = request.getMethod();
		String merchantId = resourceBundle.getString("ifl.payment.bob.merchantid");
		String keyDirectorPath = bundle.getString("BOB.Key.Directory");/*
																		 * "D:/IFLI/payment/"
																		 * "/opt/jboss-eap-6.1/standalone/IFLI_Config/BOB/"
																		 */
		String finalResponseData = null;

		Hashtable<String, String> responseTable = null;
		// if (responseMethod.equalsIgnoreCase("post")) {

		// String responseData = request.getParameter("DATA");
		if (responseData != null) {
			try {
				finalResponseData = validateEncryptedData(responseData, keyDirectorPath, merchantId);
			} catch (Exception e) {
				logger.error("Exception Caught :: ", e);
			}
			responseTable = new Hashtable<String, String>();

			StringTokenizer token = new StringTokenizer(finalResponseData, "&");
			while (token.hasMoreElements()) {
				String strData = (String) token.nextElement();
				StringTokenizer oObj1 = new StringTokenizer(strData, "=");
				String strKey = (String) oObj1.nextElement();
				String strValue = (String) oObj1.nextElement();
				logger.info("BobResponse.getBobResponse() strKey=" + strKey + " strValue=" + strValue);
				responseTable.put(strKey, strValue);
			}
			;
		}
		// }
		logger.info("BobResponse.getBobResponse().END");
		return responseTable;
	}

	@SuppressWarnings("finally")
	private String validateEncryptedData(String astrResponseData, String astrDirectoryPath, String strMerchantId) throws Exception {
		logger.info("BobResponse.validateEncryptedData().START");
		EPGMerchantEncryptionLib oEncryptionLib = new EPGMerchantEncryptionLib();
		String astrClearData = null;
		try {
			FileInputStream oFileInputStream = new FileInputStream(new File(astrDirectoryPath + strMerchantId + ".key"));
			BufferedReader oBuffRead = new BufferedReader(new InputStreamReader(oFileInputStream));
			String strModulus = oBuffRead.readLine();
			logger.info("strModulus1::::::::" + strModulus);
			if (strModulus == null) {
				throw new Exception("Invalid credentials. Transaction cannot be processed");
			}
			strModulus = decryptMerchantKey(strModulus, strMerchantId);
			logger.info("strModulus2::::::::" + strModulus);
			if (strModulus == null) {
				throw new Exception("Invalid credentials. Transaction cannot be processed");
			}
			String strExponent = oBuffRead.readLine();
			logger.info("strExponent1::::::::" + strExponent);
			if (strExponent == null) {
				throw new Exception("Invalid credentials. Transaction cannot be processed");
			}
			strExponent = decryptMerchantKey(strExponent, strMerchantId);
			logger.info("strExponent2::::::::" + strExponent);
			if (strExponent == null) {
				throw new Exception("Invalid credentials. Transaction cannot be processed");
			}
			astrClearData = oEncryptionLib.decryptDataWithPrivateKeyContents(astrResponseData, strModulus, strExponent);

			logger.info("astrClearData::::::::" + astrClearData);

		} catch (Exception oEx) {
			logger.error("Exception Caught :: ", oEx);
		} finally {
			return astrClearData;
		}
	}

	private String decryptMerchantKey(String astrData, String astrMerchantId) throws Exception {
		return (decryptData(astrData, (astrMerchantId + astrMerchantId).substring(0, 16)));
	}

	private String decryptData(String strData, String strKey) throws Exception {
		if (strData == null || strData == "") {
			return null;
		}
		if (strKey == null || strKey == "") {
			return null;
		}
		EPGCryptLib moEPGCryptLib = new EPGCryptLib();
		String strDecrypt = moEPGCryptLib.Decrypt1(strKey, strData);
		logger.info("BobResponse.decryptData().END");
		return strDecrypt;
	}

	/*public static PdfDto generateReceipt(PaymentDetails paymentDetails) {
		String receiptName = "";
		if (paymentDetails.getProposalDetails().getApplicationForm() != null) {
			receiptName = resourceBundle.getString("ifl.payment.receipt.name.app");
			receiptName = receiptName.replace("<No>", paymentDetails.getProposalDetails().getApplicationForm().getApplicationRefNo() + "");
		}
		PdfDto pdfDto = new PdfDto();
		PdfTemplateDto pdfTemplateDto = new PdfTemplateDto();
		PdfFileInfoDto pdfFileInfoDto = new PdfFileInfoDto();
		pdfTemplateDto.setFileName("PaymentReciept.vm");
		pdfTemplateDto.setLocation("/IFLI_Config/Payment/");
		pdfFileInfoDto.setDownloadFileName(receiptName+".pdf");
		pdfFileInfoDto.setFileLocation(resourceBundle.getString("ifl.omnidocs.local.document.location.prefix") + "Payment_Receipts");
		pdfFileInfoDto.setFilePattern(receiptName);

		String appNo = "";
		if (!StringUtils.isEmpty(paymentDetails.getProposalDetails().getPolicyNo() + "")) {
			appNo = paymentDetails.getProposalDetails().getPolicyNo() + "";
		} else if (paymentDetails.getProposalDetails().getApplicationForm() != null) {
			appNo = paymentDetails.getProposalDetails().getApplicationForm().getApplicationRefNo() + "";
		}
		String mobile = DaoUtility.getPhoneNumber(paymentDetails.getProposalDetails().getContact(), "RAPID.PHONE.MOBILE");

		PdfContents pdfContents = null;

		Set<PdfContents> pdfContentsSet = new LinkedHashSet<PdfContents>();

		pdfContents = new PdfContents();
		pdfContents.setFieldName("appNo");
		pdfContents.setFieldValue(appNo + "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("customerName");
		pdfContents.setFieldValue(paymentDetails.getProposalDetails().getContact().getFirstName() + " "
				+ paymentDetails.getProposalDetails().getContact().getLastName() + "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("addressLine1");
		pdfContents.setFieldValue("" address.getAddressLine1() );
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("addressLine2");
		pdfContents.setFieldValue("" address.getAddressLine2() );
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("addressLine3");
		pdfContents.setFieldValue("" address.getAddressLine3() );
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("city");
		pdfContents.setFieldValue("" address.getCityId().getName() );
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("state");
		pdfContents.setFieldValue(""
									 * address.getStateId().getName()
									 );
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("pinCode");
		pdfContents.setFieldValue("" address.getPincode() );
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("mobileNo");
		pdfContents.setFieldValue(mobile);
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("receiptNumber");
		pdfContents.setFieldValue(paymentDetails.getPaymentReceiptNo() != null ? paymentDetails.getPaymentReceiptNo() + "" : "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("receiptDate");
		pdfContents.setFieldValue(new Date() + "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("adviserName");
		pdfContents.setFieldValue("");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("adviserCode");
		pdfContents.setFieldValue("");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("planName");
		pdfContents.setFieldValue("");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("premiumAmount");
		pdfContents.setFieldValue(paymentDetails.getPremiumAmount() + "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("totalPremiumAmount");
		pdfContents.setFieldValue(paymentDetails.getPremiumAmount() + "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("amountInWords");
		pdfContents.setFieldValue(GenerateRandomNumber.numberToWord(paymentDetails.getPremiumAmount() + ""));
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("instrumentNo");
		pdfContents.setFieldValue("");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("transactionId");
		pdfContents.setFieldValue(paymentDetails.getTransactionReferenceNo() != null ? paymentDetails.getTransactionReferenceNo() + "" : "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("bankName");
		pdfContents.setFieldValue(paymentDetails.getBankName() != null ? paymentDetails.getBankName() + "" : "");
		pdfContentsSet.add(pdfContents);

		pdfContents = new PdfContents();
		pdfContents.setFieldName("branchName");
		pdfContents.setFieldValue("");
		pdfContentsSet.add(pdfContents);

		pdfDto.setPdfTemplate(pdfTemplateDto);
		pdfDto.setPdfContents(pdfContentsSet);
		pdfDto.setPdfFileInfo(pdfFileInfoDto);
		return pdfDto;
	}*/
}
