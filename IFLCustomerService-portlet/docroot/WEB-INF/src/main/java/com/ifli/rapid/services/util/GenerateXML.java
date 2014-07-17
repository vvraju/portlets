package com.ifli.rapid.services.util;



import com.ifl.premium.LRNWRDocument.LRNWR;
import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE;
import com.ifli.rapid.model.RENEWAL_PREMIUM;
import com.preRec.EachType;
import com.preRec.LRNWRDocument;
import com.preRec.LRNWRType;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GenerateXML {

	
	public static String generatePremiumPaidCertificateXML(List<PREMIUM_PAID_CERTIFICATE> beanList)
	{
		String finalXML="";
		LRNWRDocument document = LRNWRDocument.Factory.newInstance();
		LRNWRType lrnwrType = document.addNewLRNWR();
		
		PREMIUM_PAID_CERTIFICATE bean = beanList.get(0);
		if (bean.getLETTERCTL() == null) {
			lrnwrType.setLETTERCTL("");
		} else {
			lrnwrType.setLETTERCTL(bean.getLETTERCTL());
		}
		if (bean.getLOCPATH() == null) {
			lrnwrType.setLOCPATH("");
		} else {
			lrnwrType.setLOCPATH(bean.getLOCPATH());
		}
		if (bean.getDOCIDNUM() == null) {
			lrnwrType.setDOCIDNUM("");
		} else {
			lrnwrType.setDOCIDNUM(bean.getDOCIDNUM());
		}
		if (bean.getFinancial_Year() == null) {
			lrnwrType.setFinancialYear("");
		} else {
			lrnwrType.setFinancialYear(bean.getFinancial_Year());
		}
		if (bean.getAddrs1() == null) {
			lrnwrType.setAddrs1("");
		} else {
			lrnwrType.setAddrs1(bean.getAddrs1());
		}
		if (bean.getAddrs2() == null) {
			lrnwrType.setAddrs2("");
		} else {
			lrnwrType.setAddrs2(bean.getAddrs2());
		}
		if (bean.getAddrs3() == null) {
			lrnwrType.setAddrs3("");
		} else {
			lrnwrType.setAddrs3(bean.getAddrs3());
		}
		if (bean.getAddrs4() == null) {
			lrnwrType.setAddrs4("");
		} else {
			lrnwrType.setAddrs4(bean.getAddrs4());
		}
		if (bean.getAddrs5() == null) {
			lrnwrType.setAddrs5("");
		} else {
			lrnwrType.setAddrs5(bean.getAddrs5());
		}
		if (bean.getPostcode() == null) {
			lrnwrType.setPostcode("");
		} else {
			lrnwrType.setPostcode(bean.getPostcode());
		}
		if (bean.getMobilePhoneNo() == null) {
			lrnwrType.setMobilePhoneNo("");
		} else {
			lrnwrType.setMobilePhoneNo(bean.getMobilePhoneNo());
		}
		if (bean.getEmail_ID() == null) {
			lrnwrType.setEmailID("");
		} else {
			lrnwrType.setEmailID(bean.getEmail_ID());
		}
		if (bean.getClient_ID() == null) {
			lrnwrType.setClientID("");
		} else {
			lrnwrType.setClientID(bean.getClient_ID());
		}
		if (bean.getGeneration_Date() == null || bean.getGeneration_Date().equals("")) {
			bean.setGeneration_Date(toString(new Date()));
			lrnwrType.setGenerationDate(toString(new Date()));
		} else {
			lrnwrType.setGenerationDate(bean.getGeneration_Date());
		}
		if (bean.getOwnerName() == null) {
			lrnwrType.setOwnerName("");
		} else {
			lrnwrType.setOwnerName(bean.getOwnerName());
		}
		Iterator itrMainList = beanList.iterator();
		String[] totalPaid = new String[beanList.size()];
		int i = 0;
		while (itrMainList.hasNext()) {

			PREMIUM_PAID_CERTIFICATE preCert = (PREMIUM_PAID_CERTIFICATE) itrMainList.next();
			EachType eachType = lrnwrType.addNewEach();
			if (preCert.getContract_Type_Desc() == null) {
				eachType.setContractTypeDesc("");
			} else {
				eachType.setContractTypeDesc(preCert.getContract_Type_Desc());
			}
			if (preCert.getContrNo() == null) {
				eachType.setContrNo("");
			} else {
				eachType.setContrNo(preCert.getContrNo());
			}
			if (preCert.getInstallment_Prem() == null) {
				eachType.setInstallmentPrem("");
			} else {
				eachType.setInstallmentPrem(preCert.getInstallment_Prem());
			}
			if (preCert.getBilling_Frequency() == null) {
				eachType.setBillingFrequency("");
			} else {
				eachType.setBillingFrequency(preCert.getBilling_Frequency());
			}
			if (preCert.getSumAssured() == null) {
				eachType.setSumAssured("");
			} else {
				eachType.setSumAssured(preCert.getSumAssured());
			}
			if (preCert.getTotal_Pre_Paid() == null) {
				eachType.setTotalPrePaid("");
			} else {
				eachType.setTotalPrePaid(preCert.getTotal_Pre_Paid());
				totalPaid[i] = preCert.getTotal_Pre_Paid();

			}
			if (preCert.getTotal_Pre_Due() == null) {
				eachType.setTotalPreDue("");
			} else {
				eachType.setTotalPreDue(preCert.getTotal_Pre_Due());
			}
			if (preCert.getCoverage() == null) {
				eachType.setCoverage("");
			} else {
				eachType.setCoverage(preCert.getCoverage());
			}

			i++;

		}
		lrnwrType.setTotalInstallment(getTotalInstallment(totalPaid));
		finalXML = PolicyConstats.XML_PROLOG + document.xmlText();
		return finalXML;
		
		
		
	}
	
	public static String toString(Date date) {
		//logger.info("CommonImpl.toString.Method Execution Started");
		String s = null;
		try {
			DateFormat formatter;
			formatter = new SimpleDateFormat(PolicyConstats.dateFormat_ddMMyyyy);
			s = formatter.format(date);
			//logger.debug("CommonImpl.toString():Date:"+s);
		} catch (Exception e) {
			//logger.error(e, e.getCause());
			e.printStackTrace();
		}
		return s;
	}
	
	/**
	 * This method helps to calculate the total installment for premium paid
	 * certificate.
	 * 
	 * @param totalPaid
	 * @return String (Total Installment)
	 */
	private static String getTotalInstallment(String[] totalPaid) {
		//logger.info("CommonImpl.getTotalInstallment.Method Execution Started");
		DecimalFormat df = new DecimalFormat("##.00");
		double totalInstallment = 0;
		for (int i = 0; i < totalPaid.length; i++) {

			totalInstallment = totalInstallment
					+ Double.parseDouble(totalPaid[i]);

		}
		return String.valueOf(df.format(totalInstallment));
	}

	public static String generateRenewalPremiumXML(List<RENEWAL_PREMIUM> rplist) {
		RENEWAL_PREMIUM bean=rplist.get(0);
		String finalXML="";
		
		com.ifl.premium.LRNWRDocument lRNWRDocument = com.ifl.premium.LRNWRDocument.Factory.newInstance();
		LRNWR abc = lRNWRDocument.addNewLRNWR();
		if (bean.getLETTERCT() == null) {
			abc.setLETTERCTL("");
		} else {
			abc.setLETTERCTL(bean.getLETTERCT());
		}
		 
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	   
		Calendar calendar=Calendar.getInstance();
		String generationDate=df.format(calendar.getTime());
		System.out.println("CommonImpl.genrateXML.Premium Receipt.GenerationDate:"+generationDate);
		abc.setLOCPATH(generationDate);
		
		if (bean.getDOCIDNUM() == null) {
			abc.setDOCIDNUM("");
		} else {
			abc.setDOCIDNUM(bean.getDOCIDNUM());
		}
		if (bean.getCLNTNUM() == null) {
			abc.setCLNTNUM("");
		} else {
			abc.setCLNTNUM(bean.getCLNTNUM());
		}
		if (bean.getOwnerName() == null) {
			abc.setOwnerName("");
		} else {
			abc.setOwnerName(bean.getOwnerName());
		}
		if (bean.getAddrs1() == null) {
			abc.setAddrs1("");
		} else {
			abc.setAddrs1(bean.getAddrs1());
		}
		if (bean.getAddrs2() == null) {
			abc.setAddrs2("");
		} else {
			abc.setAddrs2(bean.getAddrs2());
		}
		if (bean.getAddrs3() == null) {
			abc.setAddrs3("");
		} else {
			abc.setAddrs3(bean.getAddrs3());
		}
		if (bean.getAddrs4() == null) {
			abc.setAddrs4("");
		} else {
			abc.setAddrs4(bean.getAddrs4());
		}
		if (bean.getAddrs5() == null) {
			abc.setAddrs5("");
		} else {
			abc.setAddrs5(bean.getAddrs5());
		}
		if (bean.getPostcode()== null) {
			abc.setPostcode("");
		} else {
			abc.setPostcode(bean.getPostcode());
		}
		if (bean.getDocument_Number() == null) {
			abc.setDocumentNumber("");
		} else {
			abc.setDocumentNumber(bean.getDocument_Number());
		}
		if (bean.getContrNo() == null) {
			abc.setContrNo("");
		} else {
			abc.setContrNo(bean.getContrNo());
		}
		if (bean.getNext_Premium_due_Date() == null) {
			abc.setNextPremiumDueDate("");
		} else {
			abc.setNextPremiumDueDate(bean.getNext_Premium_due_Date());
		}
		if (bean.getTotal_Premium() == null) {
			abc.setTotalPremium("");
		} else {
			abc.setTotalPremium(bean.getTotal_Premium());
		}

		if (bean.getMainCovr_Risk_Cess_Term() == null) {
			abc.setMainCovrRiskCessTerm("");
		} else {
			abc.setMainCovrRiskCessTerm(bean.getMainCovr_Risk_Cess_Term());
		}
		if (bean.getMainCovr_Prem_Cess_Term() == null) {
			abc.setMainCovrPremCessTerm("");
		} else {
			abc.setMainCovrPremCessTerm(bean.getMainCovr_Prem_Cess_Term());
		}
		if (bean.getContract_Commencement_Date() == null) {
			abc.setContractCommencementDate("");
		} else {
			abc.setContractCommencementDate(bean.getContract_Commencement_Date());
		}
		if (bean.getBilling_Date() == null) {
			abc.setBillingDate("");
		} else {
			abc.setBillingDate(bean.getBilling_Date());
		}
		if (bean.getPayment_Desc() == null) {
			if (bean.getPayment_Description()== null) {
				abc.setPaymentDesc("");
			} else {
				abc.setPaymentDesc(bean.getPayment_Description());
			}
		} else {
			abc.setPaymentDesc(bean.getPayment_Desc());
		}
		if (bean.getReceipt_Date() == null) {
			abc.setReceiptDate("");
		} else {
			abc.setReceiptDate(bean.getReceipt_Date());
		}
		if (bean.getPayment_Mode()== null) {
			abc.setPaymentMode("");
		} else {
			abc.setPaymentMode(bean.getPayment_Mode());
		}
		if (bean.getPayment_Description() == null) {
			if (bean.getPayment_Desc() == null) {
				abc.setPaymentDescription("");
			} else {
				abc.setPaymentDescription(bean.getPayment_Desc());
			}
			// abc.setPaymentDescription("");
		} else {
			abc.setPaymentDescription(bean.getPayment_Description());
		}
		if (bean.getReceipt_Amount() == null) {
			abc.setReceiptAmount("");
		} else {
			abc.setReceiptAmount(bean.getReceipt_Amount());
		}
		if (bean.getContract_Type() == null) {
			abc.setContractType("");
		} else {
			abc.setContractType(bean.getContract_Type());
		}
		if (bean.getContract_Type_Desc() == null) {
			abc.setContractTypeDesc("");
		} else {
			abc.setContractTypeDesc(bean.getContract_Type_Desc());
		}
		if (bean.getCurrent_Bill_Frequency() == null) {
			abc.setCurrentBillFrequency("");
		} else {
			abc.setCurrentBillFrequency(bean.getCurrent_Bill_Frequency());
		}
		if (bean.getSuspense_Amount() == null) {
			abc.setSuspenseAmount("");
		} else {
			abc.setSuspenseAmount(bean.getSuspense_Amount());
		}
		if (bean.getFooter_Details() == null) {
			abc.setFooterDetails("");
		} else {
			abc.setFooterDetails(bean.getFooter_Details());
		}		
		if (bean.getMobilePhoneNo() == null) {
			abc.setMobilePhone("");
		} else {
			abc.setMobilePhone(bean.getMobilePhoneNo());
		}
		if (bean.getMobilePhoneNo() == null) {
			abc.setMobilePhoneNo("");
		} else {
			abc.setMobilePhoneNo(bean.getMobilePhoneNo());
		}
		if (bean.getCheque_Number() == null) {
			abc.setChequeNumber(PolicyConstats.NA);  // "" Changed to "NA" -29thAugust12 by Soham Shinde
		} 
		else 
		{ 
			//Below logic Added on 29thAugust12-By Soham Shinde
			String chequeNumber=bean.getCheque_Number();
			if(chequeNumber.equals(PolicyConstats.renewalReceiptChequeNumber219)){
				chequeNumber=PolicyConstats.renewalReceiptChequeNumberAppendedValue000+chequeNumber;
				abc.setChequeNumber(chequeNumber);
			}
			else if(chequeNumber.equals(PolicyConstats.renewalReceiptChequeNumber999999)){
				chequeNumber=PolicyConstats.NA;
				//logger.debug("CommonImpl.genrateXML()::Updated Cheque Number 999999:"+chequeNumber);
				abc.setChequeNumber(chequeNumber);
			}
			else{
				abc.setChequeNumber(bean.getCheque_Number());		
			}	
		}
		if (bean.getTemp_Rcptno() == null) {
			abc.setTempRcptno("");
		} else {
			abc.setTempRcptno(bean.getTemp_Rcptno());
		}
		if (bean.getAgent_Bank_Branch_Code() == null) {
			abc.setAgentBankBranchCode("");
		} else {
			abc.setAgentBankBranchCode(bean.getAgent_Bank_Branch_Code());
		}
		if (bean.getAgent_Bank_name()== null) {
			abc.setAgentBankName("");
		} else {
			abc.setAgentBankName(bean.getAgent_Bank_name());
		}
		if (bean.getAgent_Branch_name() == null) {
			abc.setAgentBranchName("");
		} else {
			abc.setAgentBranchName(bean.getAgent_Branch_name());
		}
		if (bean.getEmail_id() == null) {
			abc.setEmailId("");
		} else {
			abc.setEmailId(bean.getEmail_id());
		}
		if (bean.getCAMPAIGN()== null) {
			abc.setCAMPAIGN("");
		} else {
			abc.setCAMPAIGN(bean.getCAMPAIGN());
		}
		if (bean.getBank_Name() == null) {
			abc.setBankName("");
		} else {
			abc.setBankName(bean.getBank_Name());
		}
		if (bean.getLife_Name() == null) {
			abc.setLifeName("");
		} else {
			abc.setLifeName(bean.getLife_Name());
		}
	//	abc.setTotalPremiumWords(EnglishNumberToWords.convertNumberToWords(bean.getReceiptAmount()));
		String convertedAmount=NumToWords.convertNumberToWords(bean.getReceipt_Amount());
		//logger.debug("CommonImpl.genrateXML()::Amount in Words:"+convertedAmount);	
		abc.setTotalPremiumWords(convertedAmount);
		String xml  = String.valueOf(lRNWRDocument.getLRNWR());
		// validate(lRNWRDocument.getLRNWR());
		//finalXML=PolicyConstats.XML_PROLOG+xml;
		finalXML="";
		finalXML = (PolicyConstats.XML_PROLOG).concat(xml.replaceAll(PolicyConstats.xml_fragment, PolicyConstats.LRNWR));
		return finalXML;
	}
	
	
}
