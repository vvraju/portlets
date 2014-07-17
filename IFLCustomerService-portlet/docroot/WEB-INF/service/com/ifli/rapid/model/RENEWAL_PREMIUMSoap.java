/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.ifli.rapid.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class RENEWAL_PREMIUMSoap implements Serializable {
	public static RENEWAL_PREMIUMSoap toSoapModel(RENEWAL_PREMIUM model) {
		RENEWAL_PREMIUMSoap soapModel = new RENEWAL_PREMIUMSoap();

		soapModel.setID_old(model.getID_old());
		soapModel.setLETTERCT(model.getLETTERCT());
		soapModel.setLOCPATH(model.getLOCPATH());
		soapModel.setDOCIDNUM(model.getDOCIDNUM());
		soapModel.setCLNTNUM(model.getCLNTNUM());
		soapModel.setOwnerName(model.getOwnerName());
		soapModel.setAddrs5(model.getAddrs5());
		soapModel.setPostcode(model.getPostcode());
		soapModel.setDocument_Number(model.getDocument_Number());
		soapModel.setContrNo(model.getContrNo());
		soapModel.setNext_Premium_due_Date(model.getNext_Premium_due_Date());
		soapModel.setTotal_Premium(model.getTotal_Premium());
		soapModel.setMainCovr_Risk_Cess_Term(model.getMainCovr_Risk_Cess_Term());
		soapModel.setMainCovr_Prem_Cess_Term(model.getMainCovr_Prem_Cess_Term());
		soapModel.setContract_Commencement_Date(model.getContract_Commencement_Date());
		soapModel.setBilling_Date(model.getBilling_Date());
		soapModel.setPayment_Desc(model.getPayment_Desc());
		soapModel.setReceipt_Date(model.getReceipt_Date());
		soapModel.setPayment_Mode(model.getPayment_Mode());
		soapModel.setPayment_Description(model.getPayment_Description());
		soapModel.setReceipt_Amount(model.getReceipt_Amount());
		soapModel.setContract_Type(model.getContract_Type());
		soapModel.setContract_Type_Desc(model.getContract_Type_Desc());
		soapModel.setCurrent_Bill_Frequency(model.getCurrent_Bill_Frequency());
		soapModel.setSuspense_Amount(model.getSuspense_Amount());
		soapModel.setFooter_Details(model.getFooter_Details());
		soapModel.setAddrs1(model.getAddrs1());
		soapModel.setAddrs2(model.getAddrs2());
		soapModel.setAddrs3(model.getAddrs3());
		soapModel.setAddrs4(model.getAddrs4());
		soapModel.setTemp_Rcptno(model.getTemp_Rcptno());
		soapModel.setLife_Name(model.getLife_Name());
		soapModel.setCAMPAIGN(model.getCAMPAIGN());
		soapModel.setAgent_Bank_Branch_Code(model.getAgent_Bank_Branch_Code());
		soapModel.setAgent_Branch_name(model.getAgent_Branch_name());
		soapModel.setAgent_Bank_name(model.getAgent_Bank_name());
		soapModel.setMobile_phone(model.getMobile_phone());
		soapModel.setEmail_id(model.getEmail_id());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setBatchMode(model.getBatchMode());
		soapModel.setStatus(model.getStatus());
		soapModel.setLastProcessedDate(model.getLastProcessedDate());
		soapModel.setMobilePhoneNo(model.getMobilePhoneNo());
		soapModel.setCheque_Number(model.getCheque_Number());
		soapModel.setBank_Name(model.getBank_Name());
		soapModel.setEmailAddr(model.getEmailAddr());
		soapModel.setID(model.getID());
		soapModel.setBDM(model.getBDM());
		soapModel.setTerm(model.getTerm());
		soapModel.setCampaign_Code(model.getCampaign_Code());

		return soapModel;
	}

	public static RENEWAL_PREMIUMSoap[] toSoapModels(RENEWAL_PREMIUM[] models) {
		RENEWAL_PREMIUMSoap[] soapModels = new RENEWAL_PREMIUMSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RENEWAL_PREMIUMSoap[][] toSoapModels(
		RENEWAL_PREMIUM[][] models) {
		RENEWAL_PREMIUMSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RENEWAL_PREMIUMSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RENEWAL_PREMIUMSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RENEWAL_PREMIUMSoap[] toSoapModels(
		List<RENEWAL_PREMIUM> models) {
		List<RENEWAL_PREMIUMSoap> soapModels = new ArrayList<RENEWAL_PREMIUMSoap>(models.size());

		for (RENEWAL_PREMIUM model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RENEWAL_PREMIUMSoap[soapModels.size()]);
	}

	public RENEWAL_PREMIUMSoap() {
	}

	public long getPrimaryKey() {
		return _ID_old;
	}

	public void setPrimaryKey(long pk) {
		setID_old(pk);
	}

	public long getID_old() {
		return _ID_old;
	}

	public void setID_old(long ID_old) {
		_ID_old = ID_old;
	}

	public String getLETTERCT() {
		return _LETTERCT;
	}

	public void setLETTERCT(String LETTERCT) {
		_LETTERCT = LETTERCT;
	}

	public String getLOCPATH() {
		return _LOCPATH;
	}

	public void setLOCPATH(String LOCPATH) {
		_LOCPATH = LOCPATH;
	}

	public String getDOCIDNUM() {
		return _DOCIDNUM;
	}

	public void setDOCIDNUM(String DOCIDNUM) {
		_DOCIDNUM = DOCIDNUM;
	}

	public String getCLNTNUM() {
		return _CLNTNUM;
	}

	public void setCLNTNUM(String CLNTNUM) {
		_CLNTNUM = CLNTNUM;
	}

	public String getOwnerName() {
		return _OwnerName;
	}

	public void setOwnerName(String OwnerName) {
		_OwnerName = OwnerName;
	}

	public String getAddrs5() {
		return _Addrs5;
	}

	public void setAddrs5(String Addrs5) {
		_Addrs5 = Addrs5;
	}

	public String getPostcode() {
		return _Postcode;
	}

	public void setPostcode(String Postcode) {
		_Postcode = Postcode;
	}

	public String getDocument_Number() {
		return _Document_Number;
	}

	public void setDocument_Number(String Document_Number) {
		_Document_Number = Document_Number;
	}

	public String getContrNo() {
		return _ContrNo;
	}

	public void setContrNo(String ContrNo) {
		_ContrNo = ContrNo;
	}

	public String getNext_Premium_due_Date() {
		return _Next_Premium_due_Date;
	}

	public void setNext_Premium_due_Date(String Next_Premium_due_Date) {
		_Next_Premium_due_Date = Next_Premium_due_Date;
	}

	public String getTotal_Premium() {
		return _Total_Premium;
	}

	public void setTotal_Premium(String Total_Premium) {
		_Total_Premium = Total_Premium;
	}

	public String getMainCovr_Risk_Cess_Term() {
		return _MainCovr_Risk_Cess_Term;
	}

	public void setMainCovr_Risk_Cess_Term(String MainCovr_Risk_Cess_Term) {
		_MainCovr_Risk_Cess_Term = MainCovr_Risk_Cess_Term;
	}

	public String getMainCovr_Prem_Cess_Term() {
		return _MainCovr_Prem_Cess_Term;
	}

	public void setMainCovr_Prem_Cess_Term(String MainCovr_Prem_Cess_Term) {
		_MainCovr_Prem_Cess_Term = MainCovr_Prem_Cess_Term;
	}

	public String getContract_Commencement_Date() {
		return _Contract_Commencement_Date;
	}

	public void setContract_Commencement_Date(String Contract_Commencement_Date) {
		_Contract_Commencement_Date = Contract_Commencement_Date;
	}

	public String getBilling_Date() {
		return _Billing_Date;
	}

	public void setBilling_Date(String Billing_Date) {
		_Billing_Date = Billing_Date;
	}

	public String getPayment_Desc() {
		return _Payment_Desc;
	}

	public void setPayment_Desc(String Payment_Desc) {
		_Payment_Desc = Payment_Desc;
	}

	public String getReceipt_Date() {
		return _Receipt_Date;
	}

	public void setReceipt_Date(String Receipt_Date) {
		_Receipt_Date = Receipt_Date;
	}

	public String getPayment_Mode() {
		return _Payment_Mode;
	}

	public void setPayment_Mode(String Payment_Mode) {
		_Payment_Mode = Payment_Mode;
	}

	public String getPayment_Description() {
		return _Payment_Description;
	}

	public void setPayment_Description(String Payment_Description) {
		_Payment_Description = Payment_Description;
	}

	public String getReceipt_Amount() {
		return _Receipt_Amount;
	}

	public void setReceipt_Amount(String Receipt_Amount) {
		_Receipt_Amount = Receipt_Amount;
	}

	public String getContract_Type() {
		return _Contract_Type;
	}

	public void setContract_Type(String Contract_Type) {
		_Contract_Type = Contract_Type;
	}

	public String getContract_Type_Desc() {
		return _Contract_Type_Desc;
	}

	public void setContract_Type_Desc(String Contract_Type_Desc) {
		_Contract_Type_Desc = Contract_Type_Desc;
	}

	public String getCurrent_Bill_Frequency() {
		return _Current_Bill_Frequency;
	}

	public void setCurrent_Bill_Frequency(String Current_Bill_Frequency) {
		_Current_Bill_Frequency = Current_Bill_Frequency;
	}

	public String getSuspense_Amount() {
		return _Suspense_Amount;
	}

	public void setSuspense_Amount(String Suspense_Amount) {
		_Suspense_Amount = Suspense_Amount;
	}

	public String getFooter_Details() {
		return _Footer_Details;
	}

	public void setFooter_Details(String Footer_Details) {
		_Footer_Details = Footer_Details;
	}

	public String getAddrs1() {
		return _Addrs1;
	}

	public void setAddrs1(String Addrs1) {
		_Addrs1 = Addrs1;
	}

	public String getAddrs2() {
		return _Addrs2;
	}

	public void setAddrs2(String Addrs2) {
		_Addrs2 = Addrs2;
	}

	public String getAddrs3() {
		return _Addrs3;
	}

	public void setAddrs3(String Addrs3) {
		_Addrs3 = Addrs3;
	}

	public String getAddrs4() {
		return _Addrs4;
	}

	public void setAddrs4(String Addrs4) {
		_Addrs4 = Addrs4;
	}

	public String getTemp_Rcptno() {
		return _Temp_Rcptno;
	}

	public void setTemp_Rcptno(String Temp_Rcptno) {
		_Temp_Rcptno = Temp_Rcptno;
	}

	public String getLife_Name() {
		return _Life_Name;
	}

	public void setLife_Name(String Life_Name) {
		_Life_Name = Life_Name;
	}

	public String getCAMPAIGN() {
		return _CAMPAIGN;
	}

	public void setCAMPAIGN(String CAMPAIGN) {
		_CAMPAIGN = CAMPAIGN;
	}

	public String getAgent_Bank_Branch_Code() {
		return _Agent_Bank_Branch_Code;
	}

	public void setAgent_Bank_Branch_Code(String Agent_Bank_Branch_Code) {
		_Agent_Bank_Branch_Code = Agent_Bank_Branch_Code;
	}

	public String getAgent_Branch_name() {
		return _Agent_Branch_name;
	}

	public void setAgent_Branch_name(String Agent_Branch_name) {
		_Agent_Branch_name = Agent_Branch_name;
	}

	public String getAgent_Bank_name() {
		return _Agent_Bank_name;
	}

	public void setAgent_Bank_name(String Agent_Bank_name) {
		_Agent_Bank_name = Agent_Bank_name;
	}

	public String getMobile_phone() {
		return _Mobile_phone;
	}

	public void setMobile_phone(String Mobile_phone) {
		_Mobile_phone = Mobile_phone;
	}

	public String getEmail_id() {
		return _Email_id;
	}

	public void setEmail_id(String Email_id) {
		_Email_id = Email_id;
	}

	public String getCreateDate() {
		return _CreateDate;
	}

	public void setCreateDate(String CreateDate) {
		_CreateDate = CreateDate;
	}

	public String getBatchMode() {
		return _BatchMode;
	}

	public void setBatchMode(String BatchMode) {
		_BatchMode = BatchMode;
	}

	public String getStatus() {
		return _Status;
	}

	public void setStatus(String Status) {
		_Status = Status;
	}

	public String getLastProcessedDate() {
		return _LastProcessedDate;
	}

	public void setLastProcessedDate(String LastProcessedDate) {
		_LastProcessedDate = LastProcessedDate;
	}

	public String getMobilePhoneNo() {
		return _MobilePhoneNo;
	}

	public void setMobilePhoneNo(String MobilePhoneNo) {
		_MobilePhoneNo = MobilePhoneNo;
	}

	public String getCheque_Number() {
		return _Cheque_Number;
	}

	public void setCheque_Number(String Cheque_Number) {
		_Cheque_Number = Cheque_Number;
	}

	public String getBank_Name() {
		return _Bank_Name;
	}

	public void setBank_Name(String Bank_Name) {
		_Bank_Name = Bank_Name;
	}

	public String getEmailAddr() {
		return _EmailAddr;
	}

	public void setEmailAddr(String EmailAddr) {
		_EmailAddr = EmailAddr;
	}

	public int getID() {
		return _ID;
	}

	public void setID(int ID) {
		_ID = ID;
	}

	public String getBDM() {
		return _BDM;
	}

	public void setBDM(String BDM) {
		_BDM = BDM;
	}

	public String getTerm() {
		return _Term;
	}

	public void setTerm(String Term) {
		_Term = Term;
	}

	public String getCampaign_Code() {
		return _Campaign_Code;
	}

	public void setCampaign_Code(String Campaign_Code) {
		_Campaign_Code = Campaign_Code;
	}

	private long _ID_old;
	private String _LETTERCT;
	private String _LOCPATH;
	private String _DOCIDNUM;
	private String _CLNTNUM;
	private String _OwnerName;
	private String _Addrs5;
	private String _Postcode;
	private String _Document_Number;
	private String _ContrNo;
	private String _Next_Premium_due_Date;
	private String _Total_Premium;
	private String _MainCovr_Risk_Cess_Term;
	private String _MainCovr_Prem_Cess_Term;
	private String _Contract_Commencement_Date;
	private String _Billing_Date;
	private String _Payment_Desc;
	private String _Receipt_Date;
	private String _Payment_Mode;
	private String _Payment_Description;
	private String _Receipt_Amount;
	private String _Contract_Type;
	private String _Contract_Type_Desc;
	private String _Current_Bill_Frequency;
	private String _Suspense_Amount;
	private String _Footer_Details;
	private String _Addrs1;
	private String _Addrs2;
	private String _Addrs3;
	private String _Addrs4;
	private String _Temp_Rcptno;
	private String _Life_Name;
	private String _CAMPAIGN;
	private String _Agent_Bank_Branch_Code;
	private String _Agent_Branch_name;
	private String _Agent_Bank_name;
	private String _Mobile_phone;
	private String _Email_id;
	private String _CreateDate;
	private String _BatchMode;
	private String _Status;
	private String _LastProcessedDate;
	private String _MobilePhoneNo;
	private String _Cheque_Number;
	private String _Bank_Name;
	private String _EmailAddr;
	private int _ID;
	private String _BDM;
	private String _Term;
	private String _Campaign_Code;
}