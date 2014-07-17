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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RENEWAL_PREMIUM}.
 * </p>
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUM
 * @generated
 */
public class RENEWAL_PREMIUMWrapper implements RENEWAL_PREMIUM,
	ModelWrapper<RENEWAL_PREMIUM> {
	public RENEWAL_PREMIUMWrapper(RENEWAL_PREMIUM renewal_premium) {
		_renewal_premium = renewal_premium;
	}

	@Override
	public Class<?> getModelClass() {
		return RENEWAL_PREMIUM.class;
	}

	@Override
	public String getModelClassName() {
		return RENEWAL_PREMIUM.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID_old", getID_old());
		attributes.put("LETTERCT", getLETTERCT());
		attributes.put("LOCPATH", getLOCPATH());
		attributes.put("DOCIDNUM", getDOCIDNUM());
		attributes.put("CLNTNUM", getCLNTNUM());
		attributes.put("OwnerName", getOwnerName());
		attributes.put("Addrs5", getAddrs5());
		attributes.put("Postcode", getPostcode());
		attributes.put("Document_Number", getDocument_Number());
		attributes.put("ContrNo", getContrNo());
		attributes.put("Next_Premium_due_Date", getNext_Premium_due_Date());
		attributes.put("Total_Premium", getTotal_Premium());
		attributes.put("MainCovr_Risk_Cess_Term", getMainCovr_Risk_Cess_Term());
		attributes.put("MainCovr_Prem_Cess_Term", getMainCovr_Prem_Cess_Term());
		attributes.put("Contract_Commencement_Date",
			getContract_Commencement_Date());
		attributes.put("Billing_Date", getBilling_Date());
		attributes.put("Payment_Desc", getPayment_Desc());
		attributes.put("Receipt_Date", getReceipt_Date());
		attributes.put("Payment_Mode", getPayment_Mode());
		attributes.put("Payment_Description", getPayment_Description());
		attributes.put("Receipt_Amount", getReceipt_Amount());
		attributes.put("Contract_Type", getContract_Type());
		attributes.put("Contract_Type_Desc", getContract_Type_Desc());
		attributes.put("Current_Bill_Frequency", getCurrent_Bill_Frequency());
		attributes.put("Suspense_Amount", getSuspense_Amount());
		attributes.put("Footer_Details", getFooter_Details());
		attributes.put("Addrs1", getAddrs1());
		attributes.put("Addrs2", getAddrs2());
		attributes.put("Addrs3", getAddrs3());
		attributes.put("Addrs4", getAddrs4());
		attributes.put("Temp_Rcptno", getTemp_Rcptno());
		attributes.put("Life_Name", getLife_Name());
		attributes.put("CAMPAIGN", getCAMPAIGN());
		attributes.put("Agent_Bank_Branch_Code", getAgent_Bank_Branch_Code());
		attributes.put("Agent_Branch_name", getAgent_Branch_name());
		attributes.put("Agent_Bank_name", getAgent_Bank_name());
		attributes.put("Mobile_phone", getMobile_phone());
		attributes.put("Email_id", getEmail_id());
		attributes.put("CreateDate", getCreateDate());
		attributes.put("BatchMode", getBatchMode());
		attributes.put("Status", getStatus());
		attributes.put("LastProcessedDate", getLastProcessedDate());
		attributes.put("MobilePhoneNo", getMobilePhoneNo());
		attributes.put("Cheque_Number", getCheque_Number());
		attributes.put("Bank_Name", getBank_Name());
		attributes.put("EmailAddr", getEmailAddr());
		attributes.put("ID", getID());
		attributes.put("BDM", getBDM());
		attributes.put("Term", getTerm());
		attributes.put("Campaign_Code", getCampaign_Code());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ID_old = (Long)attributes.get("ID_old");

		if (ID_old != null) {
			setID_old(ID_old);
		}

		String LETTERCT = (String)attributes.get("LETTERCT");

		if (LETTERCT != null) {
			setLETTERCT(LETTERCT);
		}

		String LOCPATH = (String)attributes.get("LOCPATH");

		if (LOCPATH != null) {
			setLOCPATH(LOCPATH);
		}

		String DOCIDNUM = (String)attributes.get("DOCIDNUM");

		if (DOCIDNUM != null) {
			setDOCIDNUM(DOCIDNUM);
		}

		String CLNTNUM = (String)attributes.get("CLNTNUM");

		if (CLNTNUM != null) {
			setCLNTNUM(CLNTNUM);
		}

		String OwnerName = (String)attributes.get("OwnerName");

		if (OwnerName != null) {
			setOwnerName(OwnerName);
		}

		String Addrs5 = (String)attributes.get("Addrs5");

		if (Addrs5 != null) {
			setAddrs5(Addrs5);
		}

		String Postcode = (String)attributes.get("Postcode");

		if (Postcode != null) {
			setPostcode(Postcode);
		}

		String Document_Number = (String)attributes.get("Document_Number");

		if (Document_Number != null) {
			setDocument_Number(Document_Number);
		}

		String ContrNo = (String)attributes.get("ContrNo");

		if (ContrNo != null) {
			setContrNo(ContrNo);
		}

		String Next_Premium_due_Date = (String)attributes.get(
				"Next_Premium_due_Date");

		if (Next_Premium_due_Date != null) {
			setNext_Premium_due_Date(Next_Premium_due_Date);
		}

		String Total_Premium = (String)attributes.get("Total_Premium");

		if (Total_Premium != null) {
			setTotal_Premium(Total_Premium);
		}

		String MainCovr_Risk_Cess_Term = (String)attributes.get(
				"MainCovr_Risk_Cess_Term");

		if (MainCovr_Risk_Cess_Term != null) {
			setMainCovr_Risk_Cess_Term(MainCovr_Risk_Cess_Term);
		}

		String MainCovr_Prem_Cess_Term = (String)attributes.get(
				"MainCovr_Prem_Cess_Term");

		if (MainCovr_Prem_Cess_Term != null) {
			setMainCovr_Prem_Cess_Term(MainCovr_Prem_Cess_Term);
		}

		String Contract_Commencement_Date = (String)attributes.get(
				"Contract_Commencement_Date");

		if (Contract_Commencement_Date != null) {
			setContract_Commencement_Date(Contract_Commencement_Date);
		}

		String Billing_Date = (String)attributes.get("Billing_Date");

		if (Billing_Date != null) {
			setBilling_Date(Billing_Date);
		}

		String Payment_Desc = (String)attributes.get("Payment_Desc");

		if (Payment_Desc != null) {
			setPayment_Desc(Payment_Desc);
		}

		String Receipt_Date = (String)attributes.get("Receipt_Date");

		if (Receipt_Date != null) {
			setReceipt_Date(Receipt_Date);
		}

		String Payment_Mode = (String)attributes.get("Payment_Mode");

		if (Payment_Mode != null) {
			setPayment_Mode(Payment_Mode);
		}

		String Payment_Description = (String)attributes.get(
				"Payment_Description");

		if (Payment_Description != null) {
			setPayment_Description(Payment_Description);
		}

		String Receipt_Amount = (String)attributes.get("Receipt_Amount");

		if (Receipt_Amount != null) {
			setReceipt_Amount(Receipt_Amount);
		}

		String Contract_Type = (String)attributes.get("Contract_Type");

		if (Contract_Type != null) {
			setContract_Type(Contract_Type);
		}

		String Contract_Type_Desc = (String)attributes.get("Contract_Type_Desc");

		if (Contract_Type_Desc != null) {
			setContract_Type_Desc(Contract_Type_Desc);
		}

		String Current_Bill_Frequency = (String)attributes.get(
				"Current_Bill_Frequency");

		if (Current_Bill_Frequency != null) {
			setCurrent_Bill_Frequency(Current_Bill_Frequency);
		}

		String Suspense_Amount = (String)attributes.get("Suspense_Amount");

		if (Suspense_Amount != null) {
			setSuspense_Amount(Suspense_Amount);
		}

		String Footer_Details = (String)attributes.get("Footer_Details");

		if (Footer_Details != null) {
			setFooter_Details(Footer_Details);
		}

		String Addrs1 = (String)attributes.get("Addrs1");

		if (Addrs1 != null) {
			setAddrs1(Addrs1);
		}

		String Addrs2 = (String)attributes.get("Addrs2");

		if (Addrs2 != null) {
			setAddrs2(Addrs2);
		}

		String Addrs3 = (String)attributes.get("Addrs3");

		if (Addrs3 != null) {
			setAddrs3(Addrs3);
		}

		String Addrs4 = (String)attributes.get("Addrs4");

		if (Addrs4 != null) {
			setAddrs4(Addrs4);
		}

		String Temp_Rcptno = (String)attributes.get("Temp_Rcptno");

		if (Temp_Rcptno != null) {
			setTemp_Rcptno(Temp_Rcptno);
		}

		String Life_Name = (String)attributes.get("Life_Name");

		if (Life_Name != null) {
			setLife_Name(Life_Name);
		}

		String CAMPAIGN = (String)attributes.get("CAMPAIGN");

		if (CAMPAIGN != null) {
			setCAMPAIGN(CAMPAIGN);
		}

		String Agent_Bank_Branch_Code = (String)attributes.get(
				"Agent_Bank_Branch_Code");

		if (Agent_Bank_Branch_Code != null) {
			setAgent_Bank_Branch_Code(Agent_Bank_Branch_Code);
		}

		String Agent_Branch_name = (String)attributes.get("Agent_Branch_name");

		if (Agent_Branch_name != null) {
			setAgent_Branch_name(Agent_Branch_name);
		}

		String Agent_Bank_name = (String)attributes.get("Agent_Bank_name");

		if (Agent_Bank_name != null) {
			setAgent_Bank_name(Agent_Bank_name);
		}

		String Mobile_phone = (String)attributes.get("Mobile_phone");

		if (Mobile_phone != null) {
			setMobile_phone(Mobile_phone);
		}

		String Email_id = (String)attributes.get("Email_id");

		if (Email_id != null) {
			setEmail_id(Email_id);
		}

		String CreateDate = (String)attributes.get("CreateDate");

		if (CreateDate != null) {
			setCreateDate(CreateDate);
		}

		String BatchMode = (String)attributes.get("BatchMode");

		if (BatchMode != null) {
			setBatchMode(BatchMode);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		String LastProcessedDate = (String)attributes.get("LastProcessedDate");

		if (LastProcessedDate != null) {
			setLastProcessedDate(LastProcessedDate);
		}

		String MobilePhoneNo = (String)attributes.get("MobilePhoneNo");

		if (MobilePhoneNo != null) {
			setMobilePhoneNo(MobilePhoneNo);
		}

		String Cheque_Number = (String)attributes.get("Cheque_Number");

		if (Cheque_Number != null) {
			setCheque_Number(Cheque_Number);
		}

		String Bank_Name = (String)attributes.get("Bank_Name");

		if (Bank_Name != null) {
			setBank_Name(Bank_Name);
		}

		String EmailAddr = (String)attributes.get("EmailAddr");

		if (EmailAddr != null) {
			setEmailAddr(EmailAddr);
		}

		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String BDM = (String)attributes.get("BDM");

		if (BDM != null) {
			setBDM(BDM);
		}

		String Term = (String)attributes.get("Term");

		if (Term != null) {
			setTerm(Term);
		}

		String Campaign_Code = (String)attributes.get("Campaign_Code");

		if (Campaign_Code != null) {
			setCampaign_Code(Campaign_Code);
		}
	}

	/**
	* Returns the primary key of this r e n e w a l_ p r e m i u m.
	*
	* @return the primary key of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public long getPrimaryKey() {
		return _renewal_premium.getPrimaryKey();
	}

	/**
	* Sets the primary key of this r e n e w a l_ p r e m i u m.
	*
	* @param primaryKey the primary key of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_renewal_premium.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d_old of this r e n e w a l_ p r e m i u m.
	*
	* @return the i d_old of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public long getID_old() {
		return _renewal_premium.getID_old();
	}

	/**
	* Sets the i d_old of this r e n e w a l_ p r e m i u m.
	*
	* @param ID_old the i d_old of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setID_old(long ID_old) {
		_renewal_premium.setID_old(ID_old);
	}

	/**
	* Returns the l e t t e r c t of this r e n e w a l_ p r e m i u m.
	*
	* @return the l e t t e r c t of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getLETTERCT() {
		return _renewal_premium.getLETTERCT();
	}

	/**
	* Sets the l e t t e r c t of this r e n e w a l_ p r e m i u m.
	*
	* @param LETTERCT the l e t t e r c t of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setLETTERCT(java.lang.String LETTERCT) {
		_renewal_premium.setLETTERCT(LETTERCT);
	}

	/**
	* Returns the l o c p a t h of this r e n e w a l_ p r e m i u m.
	*
	* @return the l o c p a t h of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getLOCPATH() {
		return _renewal_premium.getLOCPATH();
	}

	/**
	* Sets the l o c p a t h of this r e n e w a l_ p r e m i u m.
	*
	* @param LOCPATH the l o c p a t h of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setLOCPATH(java.lang.String LOCPATH) {
		_renewal_premium.setLOCPATH(LOCPATH);
	}

	/**
	* Returns the d o c i d n u m of this r e n e w a l_ p r e m i u m.
	*
	* @return the d o c i d n u m of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getDOCIDNUM() {
		return _renewal_premium.getDOCIDNUM();
	}

	/**
	* Sets the d o c i d n u m of this r e n e w a l_ p r e m i u m.
	*
	* @param DOCIDNUM the d o c i d n u m of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setDOCIDNUM(java.lang.String DOCIDNUM) {
		_renewal_premium.setDOCIDNUM(DOCIDNUM);
	}

	/**
	* Returns the c l n t n u m of this r e n e w a l_ p r e m i u m.
	*
	* @return the c l n t n u m of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getCLNTNUM() {
		return _renewal_premium.getCLNTNUM();
	}

	/**
	* Sets the c l n t n u m of this r e n e w a l_ p r e m i u m.
	*
	* @param CLNTNUM the c l n t n u m of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setCLNTNUM(java.lang.String CLNTNUM) {
		_renewal_premium.setCLNTNUM(CLNTNUM);
	}

	/**
	* Returns the owner name of this r e n e w a l_ p r e m i u m.
	*
	* @return the owner name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getOwnerName() {
		return _renewal_premium.getOwnerName();
	}

	/**
	* Sets the owner name of this r e n e w a l_ p r e m i u m.
	*
	* @param OwnerName the owner name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setOwnerName(java.lang.String OwnerName) {
		_renewal_premium.setOwnerName(OwnerName);
	}

	/**
	* Returns the addrs5 of this r e n e w a l_ p r e m i u m.
	*
	* @return the addrs5 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAddrs5() {
		return _renewal_premium.getAddrs5();
	}

	/**
	* Sets the addrs5 of this r e n e w a l_ p r e m i u m.
	*
	* @param Addrs5 the addrs5 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAddrs5(java.lang.String Addrs5) {
		_renewal_premium.setAddrs5(Addrs5);
	}

	/**
	* Returns the postcode of this r e n e w a l_ p r e m i u m.
	*
	* @return the postcode of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getPostcode() {
		return _renewal_premium.getPostcode();
	}

	/**
	* Sets the postcode of this r e n e w a l_ p r e m i u m.
	*
	* @param Postcode the postcode of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setPostcode(java.lang.String Postcode) {
		_renewal_premium.setPostcode(Postcode);
	}

	/**
	* Returns the document_ number of this r e n e w a l_ p r e m i u m.
	*
	* @return the document_ number of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getDocument_Number() {
		return _renewal_premium.getDocument_Number();
	}

	/**
	* Sets the document_ number of this r e n e w a l_ p r e m i u m.
	*
	* @param Document_Number the document_ number of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setDocument_Number(java.lang.String Document_Number) {
		_renewal_premium.setDocument_Number(Document_Number);
	}

	/**
	* Returns the contr no of this r e n e w a l_ p r e m i u m.
	*
	* @return the contr no of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getContrNo() {
		return _renewal_premium.getContrNo();
	}

	/**
	* Sets the contr no of this r e n e w a l_ p r e m i u m.
	*
	* @param ContrNo the contr no of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setContrNo(java.lang.String ContrNo) {
		_renewal_premium.setContrNo(ContrNo);
	}

	/**
	* Returns the next_ premium_due_ date of this r e n e w a l_ p r e m i u m.
	*
	* @return the next_ premium_due_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getNext_Premium_due_Date() {
		return _renewal_premium.getNext_Premium_due_Date();
	}

	/**
	* Sets the next_ premium_due_ date of this r e n e w a l_ p r e m i u m.
	*
	* @param Next_Premium_due_Date the next_ premium_due_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setNext_Premium_due_Date(java.lang.String Next_Premium_due_Date) {
		_renewal_premium.setNext_Premium_due_Date(Next_Premium_due_Date);
	}

	/**
	* Returns the total_ premium of this r e n e w a l_ p r e m i u m.
	*
	* @return the total_ premium of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getTotal_Premium() {
		return _renewal_premium.getTotal_Premium();
	}

	/**
	* Sets the total_ premium of this r e n e w a l_ p r e m i u m.
	*
	* @param Total_Premium the total_ premium of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setTotal_Premium(java.lang.String Total_Premium) {
		_renewal_premium.setTotal_Premium(Total_Premium);
	}

	/**
	* Returns the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m.
	*
	* @return the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getMainCovr_Risk_Cess_Term() {
		return _renewal_premium.getMainCovr_Risk_Cess_Term();
	}

	/**
	* Sets the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m.
	*
	* @param MainCovr_Risk_Cess_Term the main covr_ risk_ cess_ term of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setMainCovr_Risk_Cess_Term(
		java.lang.String MainCovr_Risk_Cess_Term) {
		_renewal_premium.setMainCovr_Risk_Cess_Term(MainCovr_Risk_Cess_Term);
	}

	/**
	* Returns the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m.
	*
	* @return the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getMainCovr_Prem_Cess_Term() {
		return _renewal_premium.getMainCovr_Prem_Cess_Term();
	}

	/**
	* Sets the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m.
	*
	* @param MainCovr_Prem_Cess_Term the main covr_ prem_ cess_ term of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setMainCovr_Prem_Cess_Term(
		java.lang.String MainCovr_Prem_Cess_Term) {
		_renewal_premium.setMainCovr_Prem_Cess_Term(MainCovr_Prem_Cess_Term);
	}

	/**
	* Returns the contract_ commencement_ date of this r e n e w a l_ p r e m i u m.
	*
	* @return the contract_ commencement_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getContract_Commencement_Date() {
		return _renewal_premium.getContract_Commencement_Date();
	}

	/**
	* Sets the contract_ commencement_ date of this r e n e w a l_ p r e m i u m.
	*
	* @param Contract_Commencement_Date the contract_ commencement_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setContract_Commencement_Date(
		java.lang.String Contract_Commencement_Date) {
		_renewal_premium.setContract_Commencement_Date(Contract_Commencement_Date);
	}

	/**
	* Returns the billing_ date of this r e n e w a l_ p r e m i u m.
	*
	* @return the billing_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getBilling_Date() {
		return _renewal_premium.getBilling_Date();
	}

	/**
	* Sets the billing_ date of this r e n e w a l_ p r e m i u m.
	*
	* @param Billing_Date the billing_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setBilling_Date(java.lang.String Billing_Date) {
		_renewal_premium.setBilling_Date(Billing_Date);
	}

	/**
	* Returns the payment_ desc of this r e n e w a l_ p r e m i u m.
	*
	* @return the payment_ desc of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getPayment_Desc() {
		return _renewal_premium.getPayment_Desc();
	}

	/**
	* Sets the payment_ desc of this r e n e w a l_ p r e m i u m.
	*
	* @param Payment_Desc the payment_ desc of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setPayment_Desc(java.lang.String Payment_Desc) {
		_renewal_premium.setPayment_Desc(Payment_Desc);
	}

	/**
	* Returns the receipt_ date of this r e n e w a l_ p r e m i u m.
	*
	* @return the receipt_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getReceipt_Date() {
		return _renewal_premium.getReceipt_Date();
	}

	/**
	* Sets the receipt_ date of this r e n e w a l_ p r e m i u m.
	*
	* @param Receipt_Date the receipt_ date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setReceipt_Date(java.lang.String Receipt_Date) {
		_renewal_premium.setReceipt_Date(Receipt_Date);
	}

	/**
	* Returns the payment_ mode of this r e n e w a l_ p r e m i u m.
	*
	* @return the payment_ mode of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getPayment_Mode() {
		return _renewal_premium.getPayment_Mode();
	}

	/**
	* Sets the payment_ mode of this r e n e w a l_ p r e m i u m.
	*
	* @param Payment_Mode the payment_ mode of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setPayment_Mode(java.lang.String Payment_Mode) {
		_renewal_premium.setPayment_Mode(Payment_Mode);
	}

	/**
	* Returns the payment_ description of this r e n e w a l_ p r e m i u m.
	*
	* @return the payment_ description of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getPayment_Description() {
		return _renewal_premium.getPayment_Description();
	}

	/**
	* Sets the payment_ description of this r e n e w a l_ p r e m i u m.
	*
	* @param Payment_Description the payment_ description of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setPayment_Description(java.lang.String Payment_Description) {
		_renewal_premium.setPayment_Description(Payment_Description);
	}

	/**
	* Returns the receipt_ amount of this r e n e w a l_ p r e m i u m.
	*
	* @return the receipt_ amount of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getReceipt_Amount() {
		return _renewal_premium.getReceipt_Amount();
	}

	/**
	* Sets the receipt_ amount of this r e n e w a l_ p r e m i u m.
	*
	* @param Receipt_Amount the receipt_ amount of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setReceipt_Amount(java.lang.String Receipt_Amount) {
		_renewal_premium.setReceipt_Amount(Receipt_Amount);
	}

	/**
	* Returns the contract_ type of this r e n e w a l_ p r e m i u m.
	*
	* @return the contract_ type of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getContract_Type() {
		return _renewal_premium.getContract_Type();
	}

	/**
	* Sets the contract_ type of this r e n e w a l_ p r e m i u m.
	*
	* @param Contract_Type the contract_ type of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setContract_Type(java.lang.String Contract_Type) {
		_renewal_premium.setContract_Type(Contract_Type);
	}

	/**
	* Returns the contract_ type_ desc of this r e n e w a l_ p r e m i u m.
	*
	* @return the contract_ type_ desc of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getContract_Type_Desc() {
		return _renewal_premium.getContract_Type_Desc();
	}

	/**
	* Sets the contract_ type_ desc of this r e n e w a l_ p r e m i u m.
	*
	* @param Contract_Type_Desc the contract_ type_ desc of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setContract_Type_Desc(java.lang.String Contract_Type_Desc) {
		_renewal_premium.setContract_Type_Desc(Contract_Type_Desc);
	}

	/**
	* Returns the current_ bill_ frequency of this r e n e w a l_ p r e m i u m.
	*
	* @return the current_ bill_ frequency of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getCurrent_Bill_Frequency() {
		return _renewal_premium.getCurrent_Bill_Frequency();
	}

	/**
	* Sets the current_ bill_ frequency of this r e n e w a l_ p r e m i u m.
	*
	* @param Current_Bill_Frequency the current_ bill_ frequency of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setCurrent_Bill_Frequency(
		java.lang.String Current_Bill_Frequency) {
		_renewal_premium.setCurrent_Bill_Frequency(Current_Bill_Frequency);
	}

	/**
	* Returns the suspense_ amount of this r e n e w a l_ p r e m i u m.
	*
	* @return the suspense_ amount of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getSuspense_Amount() {
		return _renewal_premium.getSuspense_Amount();
	}

	/**
	* Sets the suspense_ amount of this r e n e w a l_ p r e m i u m.
	*
	* @param Suspense_Amount the suspense_ amount of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setSuspense_Amount(java.lang.String Suspense_Amount) {
		_renewal_premium.setSuspense_Amount(Suspense_Amount);
	}

	/**
	* Returns the footer_ details of this r e n e w a l_ p r e m i u m.
	*
	* @return the footer_ details of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getFooter_Details() {
		return _renewal_premium.getFooter_Details();
	}

	/**
	* Sets the footer_ details of this r e n e w a l_ p r e m i u m.
	*
	* @param Footer_Details the footer_ details of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setFooter_Details(java.lang.String Footer_Details) {
		_renewal_premium.setFooter_Details(Footer_Details);
	}

	/**
	* Returns the addrs1 of this r e n e w a l_ p r e m i u m.
	*
	* @return the addrs1 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAddrs1() {
		return _renewal_premium.getAddrs1();
	}

	/**
	* Sets the addrs1 of this r e n e w a l_ p r e m i u m.
	*
	* @param Addrs1 the addrs1 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAddrs1(java.lang.String Addrs1) {
		_renewal_premium.setAddrs1(Addrs1);
	}

	/**
	* Returns the addrs2 of this r e n e w a l_ p r e m i u m.
	*
	* @return the addrs2 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAddrs2() {
		return _renewal_premium.getAddrs2();
	}

	/**
	* Sets the addrs2 of this r e n e w a l_ p r e m i u m.
	*
	* @param Addrs2 the addrs2 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAddrs2(java.lang.String Addrs2) {
		_renewal_premium.setAddrs2(Addrs2);
	}

	/**
	* Returns the addrs3 of this r e n e w a l_ p r e m i u m.
	*
	* @return the addrs3 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAddrs3() {
		return _renewal_premium.getAddrs3();
	}

	/**
	* Sets the addrs3 of this r e n e w a l_ p r e m i u m.
	*
	* @param Addrs3 the addrs3 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAddrs3(java.lang.String Addrs3) {
		_renewal_premium.setAddrs3(Addrs3);
	}

	/**
	* Returns the addrs4 of this r e n e w a l_ p r e m i u m.
	*
	* @return the addrs4 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAddrs4() {
		return _renewal_premium.getAddrs4();
	}

	/**
	* Sets the addrs4 of this r e n e w a l_ p r e m i u m.
	*
	* @param Addrs4 the addrs4 of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAddrs4(java.lang.String Addrs4) {
		_renewal_premium.setAddrs4(Addrs4);
	}

	/**
	* Returns the temp_ rcptno of this r e n e w a l_ p r e m i u m.
	*
	* @return the temp_ rcptno of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getTemp_Rcptno() {
		return _renewal_premium.getTemp_Rcptno();
	}

	/**
	* Sets the temp_ rcptno of this r e n e w a l_ p r e m i u m.
	*
	* @param Temp_Rcptno the temp_ rcptno of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setTemp_Rcptno(java.lang.String Temp_Rcptno) {
		_renewal_premium.setTemp_Rcptno(Temp_Rcptno);
	}

	/**
	* Returns the life_ name of this r e n e w a l_ p r e m i u m.
	*
	* @return the life_ name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getLife_Name() {
		return _renewal_premium.getLife_Name();
	}

	/**
	* Sets the life_ name of this r e n e w a l_ p r e m i u m.
	*
	* @param Life_Name the life_ name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setLife_Name(java.lang.String Life_Name) {
		_renewal_premium.setLife_Name(Life_Name);
	}

	/**
	* Returns the c a m p a i g n of this r e n e w a l_ p r e m i u m.
	*
	* @return the c a m p a i g n of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getCAMPAIGN() {
		return _renewal_premium.getCAMPAIGN();
	}

	/**
	* Sets the c a m p a i g n of this r e n e w a l_ p r e m i u m.
	*
	* @param CAMPAIGN the c a m p a i g n of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setCAMPAIGN(java.lang.String CAMPAIGN) {
		_renewal_premium.setCAMPAIGN(CAMPAIGN);
	}

	/**
	* Returns the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m.
	*
	* @return the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAgent_Bank_Branch_Code() {
		return _renewal_premium.getAgent_Bank_Branch_Code();
	}

	/**
	* Sets the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m.
	*
	* @param Agent_Bank_Branch_Code the agent_ bank_ branch_ code of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAgent_Bank_Branch_Code(
		java.lang.String Agent_Bank_Branch_Code) {
		_renewal_premium.setAgent_Bank_Branch_Code(Agent_Bank_Branch_Code);
	}

	/**
	* Returns the agent_ branch_name of this r e n e w a l_ p r e m i u m.
	*
	* @return the agent_ branch_name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAgent_Branch_name() {
		return _renewal_premium.getAgent_Branch_name();
	}

	/**
	* Sets the agent_ branch_name of this r e n e w a l_ p r e m i u m.
	*
	* @param Agent_Branch_name the agent_ branch_name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAgent_Branch_name(java.lang.String Agent_Branch_name) {
		_renewal_premium.setAgent_Branch_name(Agent_Branch_name);
	}

	/**
	* Returns the agent_ bank_name of this r e n e w a l_ p r e m i u m.
	*
	* @return the agent_ bank_name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getAgent_Bank_name() {
		return _renewal_premium.getAgent_Bank_name();
	}

	/**
	* Sets the agent_ bank_name of this r e n e w a l_ p r e m i u m.
	*
	* @param Agent_Bank_name the agent_ bank_name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setAgent_Bank_name(java.lang.String Agent_Bank_name) {
		_renewal_premium.setAgent_Bank_name(Agent_Bank_name);
	}

	/**
	* Returns the mobile_phone of this r e n e w a l_ p r e m i u m.
	*
	* @return the mobile_phone of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getMobile_phone() {
		return _renewal_premium.getMobile_phone();
	}

	/**
	* Sets the mobile_phone of this r e n e w a l_ p r e m i u m.
	*
	* @param Mobile_phone the mobile_phone of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setMobile_phone(java.lang.String Mobile_phone) {
		_renewal_premium.setMobile_phone(Mobile_phone);
	}

	/**
	* Returns the email_id of this r e n e w a l_ p r e m i u m.
	*
	* @return the email_id of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getEmail_id() {
		return _renewal_premium.getEmail_id();
	}

	/**
	* Sets the email_id of this r e n e w a l_ p r e m i u m.
	*
	* @param Email_id the email_id of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setEmail_id(java.lang.String Email_id) {
		_renewal_premium.setEmail_id(Email_id);
	}

	/**
	* Returns the create date of this r e n e w a l_ p r e m i u m.
	*
	* @return the create date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getCreateDate() {
		return _renewal_premium.getCreateDate();
	}

	/**
	* Sets the create date of this r e n e w a l_ p r e m i u m.
	*
	* @param CreateDate the create date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setCreateDate(java.lang.String CreateDate) {
		_renewal_premium.setCreateDate(CreateDate);
	}

	/**
	* Returns the batch mode of this r e n e w a l_ p r e m i u m.
	*
	* @return the batch mode of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getBatchMode() {
		return _renewal_premium.getBatchMode();
	}

	/**
	* Sets the batch mode of this r e n e w a l_ p r e m i u m.
	*
	* @param BatchMode the batch mode of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setBatchMode(java.lang.String BatchMode) {
		_renewal_premium.setBatchMode(BatchMode);
	}

	/**
	* Returns the status of this r e n e w a l_ p r e m i u m.
	*
	* @return the status of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getStatus() {
		return _renewal_premium.getStatus();
	}

	/**
	* Sets the status of this r e n e w a l_ p r e m i u m.
	*
	* @param Status the status of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setStatus(java.lang.String Status) {
		_renewal_premium.setStatus(Status);
	}

	/**
	* Returns the last processed date of this r e n e w a l_ p r e m i u m.
	*
	* @return the last processed date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getLastProcessedDate() {
		return _renewal_premium.getLastProcessedDate();
	}

	/**
	* Sets the last processed date of this r e n e w a l_ p r e m i u m.
	*
	* @param LastProcessedDate the last processed date of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setLastProcessedDate(java.lang.String LastProcessedDate) {
		_renewal_premium.setLastProcessedDate(LastProcessedDate);
	}

	/**
	* Returns the mobile phone no of this r e n e w a l_ p r e m i u m.
	*
	* @return the mobile phone no of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getMobilePhoneNo() {
		return _renewal_premium.getMobilePhoneNo();
	}

	/**
	* Sets the mobile phone no of this r e n e w a l_ p r e m i u m.
	*
	* @param MobilePhoneNo the mobile phone no of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setMobilePhoneNo(java.lang.String MobilePhoneNo) {
		_renewal_premium.setMobilePhoneNo(MobilePhoneNo);
	}

	/**
	* Returns the cheque_ number of this r e n e w a l_ p r e m i u m.
	*
	* @return the cheque_ number of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getCheque_Number() {
		return _renewal_premium.getCheque_Number();
	}

	/**
	* Sets the cheque_ number of this r e n e w a l_ p r e m i u m.
	*
	* @param Cheque_Number the cheque_ number of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setCheque_Number(java.lang.String Cheque_Number) {
		_renewal_premium.setCheque_Number(Cheque_Number);
	}

	/**
	* Returns the bank_ name of this r e n e w a l_ p r e m i u m.
	*
	* @return the bank_ name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getBank_Name() {
		return _renewal_premium.getBank_Name();
	}

	/**
	* Sets the bank_ name of this r e n e w a l_ p r e m i u m.
	*
	* @param Bank_Name the bank_ name of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setBank_Name(java.lang.String Bank_Name) {
		_renewal_premium.setBank_Name(Bank_Name);
	}

	/**
	* Returns the email addr of this r e n e w a l_ p r e m i u m.
	*
	* @return the email addr of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getEmailAddr() {
		return _renewal_premium.getEmailAddr();
	}

	/**
	* Sets the email addr of this r e n e w a l_ p r e m i u m.
	*
	* @param EmailAddr the email addr of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setEmailAddr(java.lang.String EmailAddr) {
		_renewal_premium.setEmailAddr(EmailAddr);
	}

	/**
	* Returns the i d of this r e n e w a l_ p r e m i u m.
	*
	* @return the i d of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public int getID() {
		return _renewal_premium.getID();
	}

	/**
	* Sets the i d of this r e n e w a l_ p r e m i u m.
	*
	* @param ID the i d of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setID(int ID) {
		_renewal_premium.setID(ID);
	}

	/**
	* Returns the b d m of this r e n e w a l_ p r e m i u m.
	*
	* @return the b d m of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getBDM() {
		return _renewal_premium.getBDM();
	}

	/**
	* Sets the b d m of this r e n e w a l_ p r e m i u m.
	*
	* @param BDM the b d m of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setBDM(java.lang.String BDM) {
		_renewal_premium.setBDM(BDM);
	}

	/**
	* Returns the term of this r e n e w a l_ p r e m i u m.
	*
	* @return the term of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getTerm() {
		return _renewal_premium.getTerm();
	}

	/**
	* Sets the term of this r e n e w a l_ p r e m i u m.
	*
	* @param Term the term of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setTerm(java.lang.String Term) {
		_renewal_premium.setTerm(Term);
	}

	/**
	* Returns the campaign_ code of this r e n e w a l_ p r e m i u m.
	*
	* @return the campaign_ code of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public java.lang.String getCampaign_Code() {
		return _renewal_premium.getCampaign_Code();
	}

	/**
	* Sets the campaign_ code of this r e n e w a l_ p r e m i u m.
	*
	* @param Campaign_Code the campaign_ code of this r e n e w a l_ p r e m i u m
	*/
	@Override
	public void setCampaign_Code(java.lang.String Campaign_Code) {
		_renewal_premium.setCampaign_Code(Campaign_Code);
	}

	@Override
	public boolean isNew() {
		return _renewal_premium.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_renewal_premium.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _renewal_premium.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_renewal_premium.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _renewal_premium.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _renewal_premium.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_renewal_premium.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _renewal_premium.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_renewal_premium.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_renewal_premium.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_renewal_premium.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RENEWAL_PREMIUMWrapper((RENEWAL_PREMIUM)_renewal_premium.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium) {
		return _renewal_premium.compareTo(renewal_premium);
	}

	@Override
	public int hashCode() {
		return _renewal_premium.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.RENEWAL_PREMIUM> toCacheModel() {
		return _renewal_premium.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.RENEWAL_PREMIUM toEscapedModel() {
		return new RENEWAL_PREMIUMWrapper(_renewal_premium.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.RENEWAL_PREMIUM toUnescapedModel() {
		return new RENEWAL_PREMIUMWrapper(_renewal_premium.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _renewal_premium.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _renewal_premium.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_renewal_premium.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RENEWAL_PREMIUMWrapper)) {
			return false;
		}

		RENEWAL_PREMIUMWrapper renewal_premiumWrapper = (RENEWAL_PREMIUMWrapper)obj;

		if (Validator.equals(_renewal_premium,
					renewal_premiumWrapper._renewal_premium)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RENEWAL_PREMIUM getWrappedRENEWAL_PREMIUM() {
		return _renewal_premium;
	}

	@Override
	public RENEWAL_PREMIUM getWrappedModel() {
		return _renewal_premium;
	}

	@Override
	public void resetOriginalValues() {
		_renewal_premium.resetOriginalValues();
	}

	private RENEWAL_PREMIUM _renewal_premium;
}