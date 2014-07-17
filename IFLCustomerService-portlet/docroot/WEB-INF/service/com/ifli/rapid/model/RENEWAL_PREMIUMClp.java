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

import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.RENEWAL_PREMIUMLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class RENEWAL_PREMIUMClp extends BaseModelImpl<RENEWAL_PREMIUM>
	implements RENEWAL_PREMIUM {
	public RENEWAL_PREMIUMClp() {
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
	public long getPrimaryKey() {
		return _ID_old;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setID_old(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID_old;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getID_old() {
		return _ID_old;
	}

	@Override
	public void setID_old(long ID_old) {
		_ID_old = ID_old;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setID_old", long.class);

				method.invoke(_renewal_premiumRemoteModel, ID_old);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLETTERCT() {
		return _LETTERCT;
	}

	@Override
	public void setLETTERCT(String LETTERCT) {
		_LETTERCT = LETTERCT;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setLETTERCT", String.class);

				method.invoke(_renewal_premiumRemoteModel, LETTERCT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLOCPATH() {
		return _LOCPATH;
	}

	@Override
	public void setLOCPATH(String LOCPATH) {
		_LOCPATH = LOCPATH;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setLOCPATH", String.class);

				method.invoke(_renewal_premiumRemoteModel, LOCPATH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDOCIDNUM() {
		return _DOCIDNUM;
	}

	@Override
	public void setDOCIDNUM(String DOCIDNUM) {
		_DOCIDNUM = DOCIDNUM;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setDOCIDNUM", String.class);

				method.invoke(_renewal_premiumRemoteModel, DOCIDNUM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCLNTNUM() {
		return _CLNTNUM;
	}

	@Override
	public void setCLNTNUM(String CLNTNUM) {
		_CLNTNUM = CLNTNUM;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setCLNTNUM", String.class);

				method.invoke(_renewal_premiumRemoteModel, CLNTNUM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOwnerName() {
		return _OwnerName;
	}

	@Override
	public void setOwnerName(String OwnerName) {
		_OwnerName = OwnerName;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnerName", String.class);

				method.invoke(_renewal_premiumRemoteModel, OwnerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs5() {
		return _Addrs5;
	}

	@Override
	public void setAddrs5(String Addrs5) {
		_Addrs5 = Addrs5;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs5", String.class);

				method.invoke(_renewal_premiumRemoteModel, Addrs5);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPostcode() {
		return _Postcode;
	}

	@Override
	public void setPostcode(String Postcode) {
		_Postcode = Postcode;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setPostcode", String.class);

				method.invoke(_renewal_premiumRemoteModel, Postcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocument_Number() {
		return _Document_Number;
	}

	@Override
	public void setDocument_Number(String Document_Number) {
		_Document_Number = Document_Number;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setDocument_Number",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Document_Number);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContrNo() {
		return _ContrNo;
	}

	@Override
	public void setContrNo(String ContrNo) {
		_ContrNo = ContrNo;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setContrNo", String.class);

				method.invoke(_renewal_premiumRemoteModel, ContrNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNext_Premium_due_Date() {
		return _Next_Premium_due_Date;
	}

	@Override
	public void setNext_Premium_due_Date(String Next_Premium_due_Date) {
		_Next_Premium_due_Date = Next_Premium_due_Date;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setNext_Premium_due_Date",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Next_Premium_due_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTotal_Premium() {
		return _Total_Premium;
	}

	@Override
	public void setTotal_Premium(String Total_Premium) {
		_Total_Premium = Total_Premium;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setTotal_Premium", String.class);

				method.invoke(_renewal_premiumRemoteModel, Total_Premium);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMainCovr_Risk_Cess_Term() {
		return _MainCovr_Risk_Cess_Term;
	}

	@Override
	public void setMainCovr_Risk_Cess_Term(String MainCovr_Risk_Cess_Term) {
		_MainCovr_Risk_Cess_Term = MainCovr_Risk_Cess_Term;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setMainCovr_Risk_Cess_Term",
						String.class);

				method.invoke(_renewal_premiumRemoteModel,
					MainCovr_Risk_Cess_Term);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMainCovr_Prem_Cess_Term() {
		return _MainCovr_Prem_Cess_Term;
	}

	@Override
	public void setMainCovr_Prem_Cess_Term(String MainCovr_Prem_Cess_Term) {
		_MainCovr_Prem_Cess_Term = MainCovr_Prem_Cess_Term;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setMainCovr_Prem_Cess_Term",
						String.class);

				method.invoke(_renewal_premiumRemoteModel,
					MainCovr_Prem_Cess_Term);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContract_Commencement_Date() {
		return _Contract_Commencement_Date;
	}

	@Override
	public void setContract_Commencement_Date(String Contract_Commencement_Date) {
		_Contract_Commencement_Date = Contract_Commencement_Date;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setContract_Commencement_Date",
						String.class);

				method.invoke(_renewal_premiumRemoteModel,
					Contract_Commencement_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBilling_Date() {
		return _Billing_Date;
	}

	@Override
	public void setBilling_Date(String Billing_Date) {
		_Billing_Date = Billing_Date;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setBilling_Date", String.class);

				method.invoke(_renewal_premiumRemoteModel, Billing_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayment_Desc() {
		return _Payment_Desc;
	}

	@Override
	public void setPayment_Desc(String Payment_Desc) {
		_Payment_Desc = Payment_Desc;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setPayment_Desc", String.class);

				method.invoke(_renewal_premiumRemoteModel, Payment_Desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceipt_Date() {
		return _Receipt_Date;
	}

	@Override
	public void setReceipt_Date(String Receipt_Date) {
		_Receipt_Date = Receipt_Date;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setReceipt_Date", String.class);

				method.invoke(_renewal_premiumRemoteModel, Receipt_Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayment_Mode() {
		return _Payment_Mode;
	}

	@Override
	public void setPayment_Mode(String Payment_Mode) {
		_Payment_Mode = Payment_Mode;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setPayment_Mode", String.class);

				method.invoke(_renewal_premiumRemoteModel, Payment_Mode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayment_Description() {
		return _Payment_Description;
	}

	@Override
	public void setPayment_Description(String Payment_Description) {
		_Payment_Description = Payment_Description;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setPayment_Description",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Payment_Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceipt_Amount() {
		return _Receipt_Amount;
	}

	@Override
	public void setReceipt_Amount(String Receipt_Amount) {
		_Receipt_Amount = Receipt_Amount;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setReceipt_Amount",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Receipt_Amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContract_Type() {
		return _Contract_Type;
	}

	@Override
	public void setContract_Type(String Contract_Type) {
		_Contract_Type = Contract_Type;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setContract_Type", String.class);

				method.invoke(_renewal_premiumRemoteModel, Contract_Type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContract_Type_Desc() {
		return _Contract_Type_Desc;
	}

	@Override
	public void setContract_Type_Desc(String Contract_Type_Desc) {
		_Contract_Type_Desc = Contract_Type_Desc;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setContract_Type_Desc",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Contract_Type_Desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrent_Bill_Frequency() {
		return _Current_Bill_Frequency;
	}

	@Override
	public void setCurrent_Bill_Frequency(String Current_Bill_Frequency) {
		_Current_Bill_Frequency = Current_Bill_Frequency;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrent_Bill_Frequency",
						String.class);

				method.invoke(_renewal_premiumRemoteModel,
					Current_Bill_Frequency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSuspense_Amount() {
		return _Suspense_Amount;
	}

	@Override
	public void setSuspense_Amount(String Suspense_Amount) {
		_Suspense_Amount = Suspense_Amount;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setSuspense_Amount",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Suspense_Amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFooter_Details() {
		return _Footer_Details;
	}

	@Override
	public void setFooter_Details(String Footer_Details) {
		_Footer_Details = Footer_Details;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setFooter_Details",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Footer_Details);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs1() {
		return _Addrs1;
	}

	@Override
	public void setAddrs1(String Addrs1) {
		_Addrs1 = Addrs1;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs1", String.class);

				method.invoke(_renewal_premiumRemoteModel, Addrs1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs2() {
		return _Addrs2;
	}

	@Override
	public void setAddrs2(String Addrs2) {
		_Addrs2 = Addrs2;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs2", String.class);

				method.invoke(_renewal_premiumRemoteModel, Addrs2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs3() {
		return _Addrs3;
	}

	@Override
	public void setAddrs3(String Addrs3) {
		_Addrs3 = Addrs3;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs3", String.class);

				method.invoke(_renewal_premiumRemoteModel, Addrs3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddrs4() {
		return _Addrs4;
	}

	@Override
	public void setAddrs4(String Addrs4) {
		_Addrs4 = Addrs4;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAddrs4", String.class);

				method.invoke(_renewal_premiumRemoteModel, Addrs4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTemp_Rcptno() {
		return _Temp_Rcptno;
	}

	@Override
	public void setTemp_Rcptno(String Temp_Rcptno) {
		_Temp_Rcptno = Temp_Rcptno;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setTemp_Rcptno", String.class);

				method.invoke(_renewal_premiumRemoteModel, Temp_Rcptno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLife_Name() {
		return _Life_Name;
	}

	@Override
	public void setLife_Name(String Life_Name) {
		_Life_Name = Life_Name;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setLife_Name", String.class);

				method.invoke(_renewal_premiumRemoteModel, Life_Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCAMPAIGN() {
		return _CAMPAIGN;
	}

	@Override
	public void setCAMPAIGN(String CAMPAIGN) {
		_CAMPAIGN = CAMPAIGN;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setCAMPAIGN", String.class);

				method.invoke(_renewal_premiumRemoteModel, CAMPAIGN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAgent_Bank_Branch_Code() {
		return _Agent_Bank_Branch_Code;
	}

	@Override
	public void setAgent_Bank_Branch_Code(String Agent_Bank_Branch_Code) {
		_Agent_Bank_Branch_Code = Agent_Bank_Branch_Code;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAgent_Bank_Branch_Code",
						String.class);

				method.invoke(_renewal_premiumRemoteModel,
					Agent_Bank_Branch_Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAgent_Branch_name() {
		return _Agent_Branch_name;
	}

	@Override
	public void setAgent_Branch_name(String Agent_Branch_name) {
		_Agent_Branch_name = Agent_Branch_name;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAgent_Branch_name",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Agent_Branch_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAgent_Bank_name() {
		return _Agent_Bank_name;
	}

	@Override
	public void setAgent_Bank_name(String Agent_Bank_name) {
		_Agent_Bank_name = Agent_Bank_name;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setAgent_Bank_name",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, Agent_Bank_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMobile_phone() {
		return _Mobile_phone;
	}

	@Override
	public void setMobile_phone(String Mobile_phone) {
		_Mobile_phone = Mobile_phone;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setMobile_phone", String.class);

				method.invoke(_renewal_premiumRemoteModel, Mobile_phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail_id() {
		return _Email_id;
	}

	@Override
	public void setEmail_id(String Email_id) {
		_Email_id = Email_id;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail_id", String.class);

				method.invoke(_renewal_premiumRemoteModel, Email_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreateDate() {
		return _CreateDate;
	}

	@Override
	public void setCreateDate(String CreateDate) {
		_CreateDate = CreateDate;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", String.class);

				method.invoke(_renewal_premiumRemoteModel, CreateDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBatchMode() {
		return _BatchMode;
	}

	@Override
	public void setBatchMode(String BatchMode) {
		_BatchMode = BatchMode;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setBatchMode", String.class);

				method.invoke(_renewal_premiumRemoteModel, BatchMode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _Status;
	}

	@Override
	public void setStatus(String Status) {
		_Status = Status;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_renewal_premiumRemoteModel, Status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastProcessedDate() {
		return _LastProcessedDate;
	}

	@Override
	public void setLastProcessedDate(String LastProcessedDate) {
		_LastProcessedDate = LastProcessedDate;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setLastProcessedDate",
						String.class);

				method.invoke(_renewal_premiumRemoteModel, LastProcessedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMobilePhoneNo() {
		return _MobilePhoneNo;
	}

	@Override
	public void setMobilePhoneNo(String MobilePhoneNo) {
		_MobilePhoneNo = MobilePhoneNo;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setMobilePhoneNo", String.class);

				method.invoke(_renewal_premiumRemoteModel, MobilePhoneNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheque_Number() {
		return _Cheque_Number;
	}

	@Override
	public void setCheque_Number(String Cheque_Number) {
		_Cheque_Number = Cheque_Number;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setCheque_Number", String.class);

				method.invoke(_renewal_premiumRemoteModel, Cheque_Number);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBank_Name() {
		return _Bank_Name;
	}

	@Override
	public void setBank_Name(String Bank_Name) {
		_Bank_Name = Bank_Name;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setBank_Name", String.class);

				method.invoke(_renewal_premiumRemoteModel, Bank_Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailAddr() {
		return _EmailAddr;
	}

	@Override
	public void setEmailAddr(String EmailAddr) {
		_EmailAddr = EmailAddr;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailAddr", String.class);

				method.invoke(_renewal_premiumRemoteModel, EmailAddr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setID", int.class);

				method.invoke(_renewal_premiumRemoteModel, ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBDM() {
		return _BDM;
	}

	@Override
	public void setBDM(String BDM) {
		_BDM = BDM;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setBDM", String.class);

				method.invoke(_renewal_premiumRemoteModel, BDM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTerm() {
		return _Term;
	}

	@Override
	public void setTerm(String Term) {
		_Term = Term;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setTerm", String.class);

				method.invoke(_renewal_premiumRemoteModel, Term);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCampaign_Code() {
		return _Campaign_Code;
	}

	@Override
	public void setCampaign_Code(String Campaign_Code) {
		_Campaign_Code = Campaign_Code;

		if (_renewal_premiumRemoteModel != null) {
			try {
				Class<?> clazz = _renewal_premiumRemoteModel.getClass();

				Method method = clazz.getMethod("setCampaign_Code", String.class);

				method.invoke(_renewal_premiumRemoteModel, Campaign_Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRENEWAL_PREMIUMRemoteModel() {
		return _renewal_premiumRemoteModel;
	}

	public void setRENEWAL_PREMIUMRemoteModel(
		BaseModel<?> renewal_premiumRemoteModel) {
		_renewal_premiumRemoteModel = renewal_premiumRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _renewal_premiumRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_renewal_premiumRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RENEWAL_PREMIUMLocalServiceUtil.addRENEWAL_PREMIUM(this);
		}
		else {
			RENEWAL_PREMIUMLocalServiceUtil.updateRENEWAL_PREMIUM(this);
		}
	}

	@Override
	public RENEWAL_PREMIUM toEscapedModel() {
		return (RENEWAL_PREMIUM)ProxyUtil.newProxyInstance(RENEWAL_PREMIUM.class.getClassLoader(),
			new Class[] { RENEWAL_PREMIUM.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RENEWAL_PREMIUMClp clone = new RENEWAL_PREMIUMClp();

		clone.setID_old(getID_old());
		clone.setLETTERCT(getLETTERCT());
		clone.setLOCPATH(getLOCPATH());
		clone.setDOCIDNUM(getDOCIDNUM());
		clone.setCLNTNUM(getCLNTNUM());
		clone.setOwnerName(getOwnerName());
		clone.setAddrs5(getAddrs5());
		clone.setPostcode(getPostcode());
		clone.setDocument_Number(getDocument_Number());
		clone.setContrNo(getContrNo());
		clone.setNext_Premium_due_Date(getNext_Premium_due_Date());
		clone.setTotal_Premium(getTotal_Premium());
		clone.setMainCovr_Risk_Cess_Term(getMainCovr_Risk_Cess_Term());
		clone.setMainCovr_Prem_Cess_Term(getMainCovr_Prem_Cess_Term());
		clone.setContract_Commencement_Date(getContract_Commencement_Date());
		clone.setBilling_Date(getBilling_Date());
		clone.setPayment_Desc(getPayment_Desc());
		clone.setReceipt_Date(getReceipt_Date());
		clone.setPayment_Mode(getPayment_Mode());
		clone.setPayment_Description(getPayment_Description());
		clone.setReceipt_Amount(getReceipt_Amount());
		clone.setContract_Type(getContract_Type());
		clone.setContract_Type_Desc(getContract_Type_Desc());
		clone.setCurrent_Bill_Frequency(getCurrent_Bill_Frequency());
		clone.setSuspense_Amount(getSuspense_Amount());
		clone.setFooter_Details(getFooter_Details());
		clone.setAddrs1(getAddrs1());
		clone.setAddrs2(getAddrs2());
		clone.setAddrs3(getAddrs3());
		clone.setAddrs4(getAddrs4());
		clone.setTemp_Rcptno(getTemp_Rcptno());
		clone.setLife_Name(getLife_Name());
		clone.setCAMPAIGN(getCAMPAIGN());
		clone.setAgent_Bank_Branch_Code(getAgent_Bank_Branch_Code());
		clone.setAgent_Branch_name(getAgent_Branch_name());
		clone.setAgent_Bank_name(getAgent_Bank_name());
		clone.setMobile_phone(getMobile_phone());
		clone.setEmail_id(getEmail_id());
		clone.setCreateDate(getCreateDate());
		clone.setBatchMode(getBatchMode());
		clone.setStatus(getStatus());
		clone.setLastProcessedDate(getLastProcessedDate());
		clone.setMobilePhoneNo(getMobilePhoneNo());
		clone.setCheque_Number(getCheque_Number());
		clone.setBank_Name(getBank_Name());
		clone.setEmailAddr(getEmailAddr());
		clone.setID(getID());
		clone.setBDM(getBDM());
		clone.setTerm(getTerm());
		clone.setCampaign_Code(getCampaign_Code());

		return clone;
	}

	@Override
	public int compareTo(RENEWAL_PREMIUM renewal_premium) {
		long primaryKey = renewal_premium.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RENEWAL_PREMIUMClp)) {
			return false;
		}

		RENEWAL_PREMIUMClp renewal_premium = (RENEWAL_PREMIUMClp)obj;

		long primaryKey = renewal_premium.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(101);

		sb.append("{ID_old=");
		sb.append(getID_old());
		sb.append(", LETTERCT=");
		sb.append(getLETTERCT());
		sb.append(", LOCPATH=");
		sb.append(getLOCPATH());
		sb.append(", DOCIDNUM=");
		sb.append(getDOCIDNUM());
		sb.append(", CLNTNUM=");
		sb.append(getCLNTNUM());
		sb.append(", OwnerName=");
		sb.append(getOwnerName());
		sb.append(", Addrs5=");
		sb.append(getAddrs5());
		sb.append(", Postcode=");
		sb.append(getPostcode());
		sb.append(", Document_Number=");
		sb.append(getDocument_Number());
		sb.append(", ContrNo=");
		sb.append(getContrNo());
		sb.append(", Next_Premium_due_Date=");
		sb.append(getNext_Premium_due_Date());
		sb.append(", Total_Premium=");
		sb.append(getTotal_Premium());
		sb.append(", MainCovr_Risk_Cess_Term=");
		sb.append(getMainCovr_Risk_Cess_Term());
		sb.append(", MainCovr_Prem_Cess_Term=");
		sb.append(getMainCovr_Prem_Cess_Term());
		sb.append(", Contract_Commencement_Date=");
		sb.append(getContract_Commencement_Date());
		sb.append(", Billing_Date=");
		sb.append(getBilling_Date());
		sb.append(", Payment_Desc=");
		sb.append(getPayment_Desc());
		sb.append(", Receipt_Date=");
		sb.append(getReceipt_Date());
		sb.append(", Payment_Mode=");
		sb.append(getPayment_Mode());
		sb.append(", Payment_Description=");
		sb.append(getPayment_Description());
		sb.append(", Receipt_Amount=");
		sb.append(getReceipt_Amount());
		sb.append(", Contract_Type=");
		sb.append(getContract_Type());
		sb.append(", Contract_Type_Desc=");
		sb.append(getContract_Type_Desc());
		sb.append(", Current_Bill_Frequency=");
		sb.append(getCurrent_Bill_Frequency());
		sb.append(", Suspense_Amount=");
		sb.append(getSuspense_Amount());
		sb.append(", Footer_Details=");
		sb.append(getFooter_Details());
		sb.append(", Addrs1=");
		sb.append(getAddrs1());
		sb.append(", Addrs2=");
		sb.append(getAddrs2());
		sb.append(", Addrs3=");
		sb.append(getAddrs3());
		sb.append(", Addrs4=");
		sb.append(getAddrs4());
		sb.append(", Temp_Rcptno=");
		sb.append(getTemp_Rcptno());
		sb.append(", Life_Name=");
		sb.append(getLife_Name());
		sb.append(", CAMPAIGN=");
		sb.append(getCAMPAIGN());
		sb.append(", Agent_Bank_Branch_Code=");
		sb.append(getAgent_Bank_Branch_Code());
		sb.append(", Agent_Branch_name=");
		sb.append(getAgent_Branch_name());
		sb.append(", Agent_Bank_name=");
		sb.append(getAgent_Bank_name());
		sb.append(", Mobile_phone=");
		sb.append(getMobile_phone());
		sb.append(", Email_id=");
		sb.append(getEmail_id());
		sb.append(", CreateDate=");
		sb.append(getCreateDate());
		sb.append(", BatchMode=");
		sb.append(getBatchMode());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append(", LastProcessedDate=");
		sb.append(getLastProcessedDate());
		sb.append(", MobilePhoneNo=");
		sb.append(getMobilePhoneNo());
		sb.append(", Cheque_Number=");
		sb.append(getCheque_Number());
		sb.append(", Bank_Name=");
		sb.append(getBank_Name());
		sb.append(", EmailAddr=");
		sb.append(getEmailAddr());
		sb.append(", ID=");
		sb.append(getID());
		sb.append(", BDM=");
		sb.append(getBDM());
		sb.append(", Term=");
		sb.append(getTerm());
		sb.append(", Campaign_Code=");
		sb.append(getCampaign_Code());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(154);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.RENEWAL_PREMIUM");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID_old</column-name><column-value><![CDATA[");
		sb.append(getID_old());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LETTERCT</column-name><column-value><![CDATA[");
		sb.append(getLETTERCT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCPATH</column-name><column-value><![CDATA[");
		sb.append(getLOCPATH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DOCIDNUM</column-name><column-value><![CDATA[");
		sb.append(getDOCIDNUM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CLNTNUM</column-name><column-value><![CDATA[");
		sb.append(getCLNTNUM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OwnerName</column-name><column-value><![CDATA[");
		sb.append(getOwnerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs5</column-name><column-value><![CDATA[");
		sb.append(getAddrs5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Postcode</column-name><column-value><![CDATA[");
		sb.append(getPostcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Document_Number</column-name><column-value><![CDATA[");
		sb.append(getDocument_Number());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContrNo</column-name><column-value><![CDATA[");
		sb.append(getContrNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Next_Premium_due_Date</column-name><column-value><![CDATA[");
		sb.append(getNext_Premium_due_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Total_Premium</column-name><column-value><![CDATA[");
		sb.append(getTotal_Premium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MainCovr_Risk_Cess_Term</column-name><column-value><![CDATA[");
		sb.append(getMainCovr_Risk_Cess_Term());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MainCovr_Prem_Cess_Term</column-name><column-value><![CDATA[");
		sb.append(getMainCovr_Prem_Cess_Term());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Contract_Commencement_Date</column-name><column-value><![CDATA[");
		sb.append(getContract_Commencement_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Billing_Date</column-name><column-value><![CDATA[");
		sb.append(getBilling_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Payment_Desc</column-name><column-value><![CDATA[");
		sb.append(getPayment_Desc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Receipt_Date</column-name><column-value><![CDATA[");
		sb.append(getReceipt_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Payment_Mode</column-name><column-value><![CDATA[");
		sb.append(getPayment_Mode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Payment_Description</column-name><column-value><![CDATA[");
		sb.append(getPayment_Description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Receipt_Amount</column-name><column-value><![CDATA[");
		sb.append(getReceipt_Amount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Contract_Type</column-name><column-value><![CDATA[");
		sb.append(getContract_Type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Contract_Type_Desc</column-name><column-value><![CDATA[");
		sb.append(getContract_Type_Desc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Current_Bill_Frequency</column-name><column-value><![CDATA[");
		sb.append(getCurrent_Bill_Frequency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Suspense_Amount</column-name><column-value><![CDATA[");
		sb.append(getSuspense_Amount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Footer_Details</column-name><column-value><![CDATA[");
		sb.append(getFooter_Details());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs1</column-name><column-value><![CDATA[");
		sb.append(getAddrs1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs2</column-name><column-value><![CDATA[");
		sb.append(getAddrs2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs3</column-name><column-value><![CDATA[");
		sb.append(getAddrs3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Addrs4</column-name><column-value><![CDATA[");
		sb.append(getAddrs4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Temp_Rcptno</column-name><column-value><![CDATA[");
		sb.append(getTemp_Rcptno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Life_Name</column-name><column-value><![CDATA[");
		sb.append(getLife_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CAMPAIGN</column-name><column-value><![CDATA[");
		sb.append(getCAMPAIGN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Agent_Bank_Branch_Code</column-name><column-value><![CDATA[");
		sb.append(getAgent_Bank_Branch_Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Agent_Branch_name</column-name><column-value><![CDATA[");
		sb.append(getAgent_Branch_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Agent_Bank_name</column-name><column-value><![CDATA[");
		sb.append(getAgent_Bank_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Mobile_phone</column-name><column-value><![CDATA[");
		sb.append(getMobile_phone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Email_id</column-name><column-value><![CDATA[");
		sb.append(getEmail_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreateDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BatchMode</column-name><column-value><![CDATA[");
		sb.append(getBatchMode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LastProcessedDate</column-name><column-value><![CDATA[");
		sb.append(getLastProcessedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MobilePhoneNo</column-name><column-value><![CDATA[");
		sb.append(getMobilePhoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Cheque_Number</column-name><column-value><![CDATA[");
		sb.append(getCheque_Number());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Bank_Name</column-name><column-value><![CDATA[");
		sb.append(getBank_Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EmailAddr</column-name><column-value><![CDATA[");
		sb.append(getEmailAddr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BDM</column-name><column-value><![CDATA[");
		sb.append(getBDM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Term</column-name><column-value><![CDATA[");
		sb.append(getTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Campaign_Code</column-name><column-value><![CDATA[");
		sb.append(getCampaign_Code());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _renewal_premiumRemoteModel;
}