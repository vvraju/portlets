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

package com.ifli.rapid.model.impl;

import com.ifli.rapid.model.RENEWAL_PREMIUM;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RENEWAL_PREMIUM in entity cache.
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUM
 * @generated
 */
public class RENEWAL_PREMIUMCacheModel implements CacheModel<RENEWAL_PREMIUM>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(101);

		sb.append("{ID_old=");
		sb.append(ID_old);
		sb.append(", LETTERCT=");
		sb.append(LETTERCT);
		sb.append(", LOCPATH=");
		sb.append(LOCPATH);
		sb.append(", DOCIDNUM=");
		sb.append(DOCIDNUM);
		sb.append(", CLNTNUM=");
		sb.append(CLNTNUM);
		sb.append(", OwnerName=");
		sb.append(OwnerName);
		sb.append(", Addrs5=");
		sb.append(Addrs5);
		sb.append(", Postcode=");
		sb.append(Postcode);
		sb.append(", Document_Number=");
		sb.append(Document_Number);
		sb.append(", ContrNo=");
		sb.append(ContrNo);
		sb.append(", Next_Premium_due_Date=");
		sb.append(Next_Premium_due_Date);
		sb.append(", Total_Premium=");
		sb.append(Total_Premium);
		sb.append(", MainCovr_Risk_Cess_Term=");
		sb.append(MainCovr_Risk_Cess_Term);
		sb.append(", MainCovr_Prem_Cess_Term=");
		sb.append(MainCovr_Prem_Cess_Term);
		sb.append(", Contract_Commencement_Date=");
		sb.append(Contract_Commencement_Date);
		sb.append(", Billing_Date=");
		sb.append(Billing_Date);
		sb.append(", Payment_Desc=");
		sb.append(Payment_Desc);
		sb.append(", Receipt_Date=");
		sb.append(Receipt_Date);
		sb.append(", Payment_Mode=");
		sb.append(Payment_Mode);
		sb.append(", Payment_Description=");
		sb.append(Payment_Description);
		sb.append(", Receipt_Amount=");
		sb.append(Receipt_Amount);
		sb.append(", Contract_Type=");
		sb.append(Contract_Type);
		sb.append(", Contract_Type_Desc=");
		sb.append(Contract_Type_Desc);
		sb.append(", Current_Bill_Frequency=");
		sb.append(Current_Bill_Frequency);
		sb.append(", Suspense_Amount=");
		sb.append(Suspense_Amount);
		sb.append(", Footer_Details=");
		sb.append(Footer_Details);
		sb.append(", Addrs1=");
		sb.append(Addrs1);
		sb.append(", Addrs2=");
		sb.append(Addrs2);
		sb.append(", Addrs3=");
		sb.append(Addrs3);
		sb.append(", Addrs4=");
		sb.append(Addrs4);
		sb.append(", Temp_Rcptno=");
		sb.append(Temp_Rcptno);
		sb.append(", Life_Name=");
		sb.append(Life_Name);
		sb.append(", CAMPAIGN=");
		sb.append(CAMPAIGN);
		sb.append(", Agent_Bank_Branch_Code=");
		sb.append(Agent_Bank_Branch_Code);
		sb.append(", Agent_Branch_name=");
		sb.append(Agent_Branch_name);
		sb.append(", Agent_Bank_name=");
		sb.append(Agent_Bank_name);
		sb.append(", Mobile_phone=");
		sb.append(Mobile_phone);
		sb.append(", Email_id=");
		sb.append(Email_id);
		sb.append(", CreateDate=");
		sb.append(CreateDate);
		sb.append(", BatchMode=");
		sb.append(BatchMode);
		sb.append(", Status=");
		sb.append(Status);
		sb.append(", LastProcessedDate=");
		sb.append(LastProcessedDate);
		sb.append(", MobilePhoneNo=");
		sb.append(MobilePhoneNo);
		sb.append(", Cheque_Number=");
		sb.append(Cheque_Number);
		sb.append(", Bank_Name=");
		sb.append(Bank_Name);
		sb.append(", EmailAddr=");
		sb.append(EmailAddr);
		sb.append(", ID=");
		sb.append(ID);
		sb.append(", BDM=");
		sb.append(BDM);
		sb.append(", Term=");
		sb.append(Term);
		sb.append(", Campaign_Code=");
		sb.append(Campaign_Code);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RENEWAL_PREMIUM toEntityModel() {
		RENEWAL_PREMIUMImpl renewal_premiumImpl = new RENEWAL_PREMIUMImpl();

		renewal_premiumImpl.setID_old(ID_old);

		if (LETTERCT == null) {
			renewal_premiumImpl.setLETTERCT(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setLETTERCT(LETTERCT);
		}

		if (LOCPATH == null) {
			renewal_premiumImpl.setLOCPATH(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setLOCPATH(LOCPATH);
		}

		if (DOCIDNUM == null) {
			renewal_premiumImpl.setDOCIDNUM(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setDOCIDNUM(DOCIDNUM);
		}

		if (CLNTNUM == null) {
			renewal_premiumImpl.setCLNTNUM(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setCLNTNUM(CLNTNUM);
		}

		if (OwnerName == null) {
			renewal_premiumImpl.setOwnerName(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setOwnerName(OwnerName);
		}

		if (Addrs5 == null) {
			renewal_premiumImpl.setAddrs5(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAddrs5(Addrs5);
		}

		if (Postcode == null) {
			renewal_premiumImpl.setPostcode(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setPostcode(Postcode);
		}

		if (Document_Number == null) {
			renewal_premiumImpl.setDocument_Number(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setDocument_Number(Document_Number);
		}

		if (ContrNo == null) {
			renewal_premiumImpl.setContrNo(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setContrNo(ContrNo);
		}

		if (Next_Premium_due_Date == null) {
			renewal_premiumImpl.setNext_Premium_due_Date(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setNext_Premium_due_Date(Next_Premium_due_Date);
		}

		if (Total_Premium == null) {
			renewal_premiumImpl.setTotal_Premium(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setTotal_Premium(Total_Premium);
		}

		if (MainCovr_Risk_Cess_Term == null) {
			renewal_premiumImpl.setMainCovr_Risk_Cess_Term(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setMainCovr_Risk_Cess_Term(MainCovr_Risk_Cess_Term);
		}

		if (MainCovr_Prem_Cess_Term == null) {
			renewal_premiumImpl.setMainCovr_Prem_Cess_Term(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setMainCovr_Prem_Cess_Term(MainCovr_Prem_Cess_Term);
		}

		if (Contract_Commencement_Date == null) {
			renewal_premiumImpl.setContract_Commencement_Date(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setContract_Commencement_Date(Contract_Commencement_Date);
		}

		if (Billing_Date == null) {
			renewal_premiumImpl.setBilling_Date(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setBilling_Date(Billing_Date);
		}

		if (Payment_Desc == null) {
			renewal_premiumImpl.setPayment_Desc(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setPayment_Desc(Payment_Desc);
		}

		if (Receipt_Date == null) {
			renewal_premiumImpl.setReceipt_Date(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setReceipt_Date(Receipt_Date);
		}

		if (Payment_Mode == null) {
			renewal_premiumImpl.setPayment_Mode(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setPayment_Mode(Payment_Mode);
		}

		if (Payment_Description == null) {
			renewal_premiumImpl.setPayment_Description(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setPayment_Description(Payment_Description);
		}

		if (Receipt_Amount == null) {
			renewal_premiumImpl.setReceipt_Amount(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setReceipt_Amount(Receipt_Amount);
		}

		if (Contract_Type == null) {
			renewal_premiumImpl.setContract_Type(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setContract_Type(Contract_Type);
		}

		if (Contract_Type_Desc == null) {
			renewal_premiumImpl.setContract_Type_Desc(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setContract_Type_Desc(Contract_Type_Desc);
		}

		if (Current_Bill_Frequency == null) {
			renewal_premiumImpl.setCurrent_Bill_Frequency(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setCurrent_Bill_Frequency(Current_Bill_Frequency);
		}

		if (Suspense_Amount == null) {
			renewal_premiumImpl.setSuspense_Amount(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setSuspense_Amount(Suspense_Amount);
		}

		if (Footer_Details == null) {
			renewal_premiumImpl.setFooter_Details(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setFooter_Details(Footer_Details);
		}

		if (Addrs1 == null) {
			renewal_premiumImpl.setAddrs1(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAddrs1(Addrs1);
		}

		if (Addrs2 == null) {
			renewal_premiumImpl.setAddrs2(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAddrs2(Addrs2);
		}

		if (Addrs3 == null) {
			renewal_premiumImpl.setAddrs3(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAddrs3(Addrs3);
		}

		if (Addrs4 == null) {
			renewal_premiumImpl.setAddrs4(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAddrs4(Addrs4);
		}

		if (Temp_Rcptno == null) {
			renewal_premiumImpl.setTemp_Rcptno(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setTemp_Rcptno(Temp_Rcptno);
		}

		if (Life_Name == null) {
			renewal_premiumImpl.setLife_Name(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setLife_Name(Life_Name);
		}

		if (CAMPAIGN == null) {
			renewal_premiumImpl.setCAMPAIGN(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setCAMPAIGN(CAMPAIGN);
		}

		if (Agent_Bank_Branch_Code == null) {
			renewal_premiumImpl.setAgent_Bank_Branch_Code(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAgent_Bank_Branch_Code(Agent_Bank_Branch_Code);
		}

		if (Agent_Branch_name == null) {
			renewal_premiumImpl.setAgent_Branch_name(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAgent_Branch_name(Agent_Branch_name);
		}

		if (Agent_Bank_name == null) {
			renewal_premiumImpl.setAgent_Bank_name(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setAgent_Bank_name(Agent_Bank_name);
		}

		if (Mobile_phone == null) {
			renewal_premiumImpl.setMobile_phone(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setMobile_phone(Mobile_phone);
		}

		if (Email_id == null) {
			renewal_premiumImpl.setEmail_id(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setEmail_id(Email_id);
		}

		if (CreateDate == null) {
			renewal_premiumImpl.setCreateDate(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setCreateDate(CreateDate);
		}

		if (BatchMode == null) {
			renewal_premiumImpl.setBatchMode(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setBatchMode(BatchMode);
		}

		if (Status == null) {
			renewal_premiumImpl.setStatus(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setStatus(Status);
		}

		if (LastProcessedDate == null) {
			renewal_premiumImpl.setLastProcessedDate(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setLastProcessedDate(LastProcessedDate);
		}

		if (MobilePhoneNo == null) {
			renewal_premiumImpl.setMobilePhoneNo(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setMobilePhoneNo(MobilePhoneNo);
		}

		if (Cheque_Number == null) {
			renewal_premiumImpl.setCheque_Number(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setCheque_Number(Cheque_Number);
		}

		if (Bank_Name == null) {
			renewal_premiumImpl.setBank_Name(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setBank_Name(Bank_Name);
		}

		if (EmailAddr == null) {
			renewal_premiumImpl.setEmailAddr(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setEmailAddr(EmailAddr);
		}

		renewal_premiumImpl.setID(ID);

		if (BDM == null) {
			renewal_premiumImpl.setBDM(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setBDM(BDM);
		}

		if (Term == null) {
			renewal_premiumImpl.setTerm(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setTerm(Term);
		}

		if (Campaign_Code == null) {
			renewal_premiumImpl.setCampaign_Code(StringPool.BLANK);
		}
		else {
			renewal_premiumImpl.setCampaign_Code(Campaign_Code);
		}

		renewal_premiumImpl.resetOriginalValues();

		return renewal_premiumImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID_old = objectInput.readLong();
		LETTERCT = objectInput.readUTF();
		LOCPATH = objectInput.readUTF();
		DOCIDNUM = objectInput.readUTF();
		CLNTNUM = objectInput.readUTF();
		OwnerName = objectInput.readUTF();
		Addrs5 = objectInput.readUTF();
		Postcode = objectInput.readUTF();
		Document_Number = objectInput.readUTF();
		ContrNo = objectInput.readUTF();
		Next_Premium_due_Date = objectInput.readUTF();
		Total_Premium = objectInput.readUTF();
		MainCovr_Risk_Cess_Term = objectInput.readUTF();
		MainCovr_Prem_Cess_Term = objectInput.readUTF();
		Contract_Commencement_Date = objectInput.readUTF();
		Billing_Date = objectInput.readUTF();
		Payment_Desc = objectInput.readUTF();
		Receipt_Date = objectInput.readUTF();
		Payment_Mode = objectInput.readUTF();
		Payment_Description = objectInput.readUTF();
		Receipt_Amount = objectInput.readUTF();
		Contract_Type = objectInput.readUTF();
		Contract_Type_Desc = objectInput.readUTF();
		Current_Bill_Frequency = objectInput.readUTF();
		Suspense_Amount = objectInput.readUTF();
		Footer_Details = objectInput.readUTF();
		Addrs1 = objectInput.readUTF();
		Addrs2 = objectInput.readUTF();
		Addrs3 = objectInput.readUTF();
		Addrs4 = objectInput.readUTF();
		Temp_Rcptno = objectInput.readUTF();
		Life_Name = objectInput.readUTF();
		CAMPAIGN = objectInput.readUTF();
		Agent_Bank_Branch_Code = objectInput.readUTF();
		Agent_Branch_name = objectInput.readUTF();
		Agent_Bank_name = objectInput.readUTF();
		Mobile_phone = objectInput.readUTF();
		Email_id = objectInput.readUTF();
		CreateDate = objectInput.readUTF();
		BatchMode = objectInput.readUTF();
		Status = objectInput.readUTF();
		LastProcessedDate = objectInput.readUTF();
		MobilePhoneNo = objectInput.readUTF();
		Cheque_Number = objectInput.readUTF();
		Bank_Name = objectInput.readUTF();
		EmailAddr = objectInput.readUTF();
		ID = objectInput.readInt();
		BDM = objectInput.readUTF();
		Term = objectInput.readUTF();
		Campaign_Code = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ID_old);

		if (LETTERCT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LETTERCT);
		}

		if (LOCPATH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LOCPATH);
		}

		if (DOCIDNUM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DOCIDNUM);
		}

		if (CLNTNUM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CLNTNUM);
		}

		if (OwnerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OwnerName);
		}

		if (Addrs5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Addrs5);
		}

		if (Postcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Postcode);
		}

		if (Document_Number == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Document_Number);
		}

		if (ContrNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ContrNo);
		}

		if (Next_Premium_due_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Next_Premium_due_Date);
		}

		if (Total_Premium == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Total_Premium);
		}

		if (MainCovr_Risk_Cess_Term == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MainCovr_Risk_Cess_Term);
		}

		if (MainCovr_Prem_Cess_Term == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MainCovr_Prem_Cess_Term);
		}

		if (Contract_Commencement_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Contract_Commencement_Date);
		}

		if (Billing_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Billing_Date);
		}

		if (Payment_Desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Payment_Desc);
		}

		if (Receipt_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Receipt_Date);
		}

		if (Payment_Mode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Payment_Mode);
		}

		if (Payment_Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Payment_Description);
		}

		if (Receipt_Amount == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Receipt_Amount);
		}

		if (Contract_Type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Contract_Type);
		}

		if (Contract_Type_Desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Contract_Type_Desc);
		}

		if (Current_Bill_Frequency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Current_Bill_Frequency);
		}

		if (Suspense_Amount == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Suspense_Amount);
		}

		if (Footer_Details == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Footer_Details);
		}

		if (Addrs1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Addrs1);
		}

		if (Addrs2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Addrs2);
		}

		if (Addrs3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Addrs3);
		}

		if (Addrs4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Addrs4);
		}

		if (Temp_Rcptno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Temp_Rcptno);
		}

		if (Life_Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Life_Name);
		}

		if (CAMPAIGN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CAMPAIGN);
		}

		if (Agent_Bank_Branch_Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Agent_Bank_Branch_Code);
		}

		if (Agent_Branch_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Agent_Branch_name);
		}

		if (Agent_Bank_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Agent_Bank_name);
		}

		if (Mobile_phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Mobile_phone);
		}

		if (Email_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Email_id);
		}

		if (CreateDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreateDate);
		}

		if (BatchMode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BatchMode);
		}

		if (Status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Status);
		}

		if (LastProcessedDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LastProcessedDate);
		}

		if (MobilePhoneNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MobilePhoneNo);
		}

		if (Cheque_Number == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Cheque_Number);
		}

		if (Bank_Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Bank_Name);
		}

		if (EmailAddr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EmailAddr);
		}

		objectOutput.writeInt(ID);

		if (BDM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BDM);
		}

		if (Term == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Term);
		}

		if (Campaign_Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Campaign_Code);
		}
	}

	public long ID_old;
	public String LETTERCT;
	public String LOCPATH;
	public String DOCIDNUM;
	public String CLNTNUM;
	public String OwnerName;
	public String Addrs5;
	public String Postcode;
	public String Document_Number;
	public String ContrNo;
	public String Next_Premium_due_Date;
	public String Total_Premium;
	public String MainCovr_Risk_Cess_Term;
	public String MainCovr_Prem_Cess_Term;
	public String Contract_Commencement_Date;
	public String Billing_Date;
	public String Payment_Desc;
	public String Receipt_Date;
	public String Payment_Mode;
	public String Payment_Description;
	public String Receipt_Amount;
	public String Contract_Type;
	public String Contract_Type_Desc;
	public String Current_Bill_Frequency;
	public String Suspense_Amount;
	public String Footer_Details;
	public String Addrs1;
	public String Addrs2;
	public String Addrs3;
	public String Addrs4;
	public String Temp_Rcptno;
	public String Life_Name;
	public String CAMPAIGN;
	public String Agent_Bank_Branch_Code;
	public String Agent_Branch_name;
	public String Agent_Bank_name;
	public String Mobile_phone;
	public String Email_id;
	public String CreateDate;
	public String BatchMode;
	public String Status;
	public String LastProcessedDate;
	public String MobilePhoneNo;
	public String Cheque_Number;
	public String Bank_Name;
	public String EmailAddr;
	public int ID;
	public String BDM;
	public String Term;
	public String Campaign_Code;
}