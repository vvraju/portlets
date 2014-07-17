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

import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PREMIUM_PAID_CERTIFICATE in entity cache.
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATE
 * @generated
 */
public class PREMIUM_PAID_CERTIFICATECacheModel implements CacheModel<PREMIUM_PAID_CERTIFICATE>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", Financial_Year=");
		sb.append(Financial_Year);
		sb.append(", Generation_Date=");
		sb.append(Generation_Date);
		sb.append(", OwnerName=");
		sb.append(OwnerName);
		sb.append(", Addrs1=");
		sb.append(Addrs1);
		sb.append(", Addrs2=");
		sb.append(Addrs2);
		sb.append(", Addrs3=");
		sb.append(Addrs3);
		sb.append(", Addrs4=");
		sb.append(Addrs4);
		sb.append(", Addrs5=");
		sb.append(Addrs5);
		sb.append(", Postcode=");
		sb.append(Postcode);
		sb.append(", MobilePhoneNo=");
		sb.append(MobilePhoneNo);
		sb.append(", Email_ID=");
		sb.append(Email_ID);
		sb.append(", Client_ID=");
		sb.append(Client_ID);
		sb.append(", Contract_Type_Desc=");
		sb.append(Contract_Type_Desc);
		sb.append(", ContrNo=");
		sb.append(ContrNo);
		sb.append(", Installment_Prem=");
		sb.append(Installment_Prem);
		sb.append(", Billing_Frequency=");
		sb.append(Billing_Frequency);
		sb.append(", SumAssured=");
		sb.append(SumAssured);
		sb.append(", Total_Pre_Paid=");
		sb.append(Total_Pre_Paid);
		sb.append(", Total_Pre_Due=");
		sb.append(Total_Pre_Due);
		sb.append(", Coverage=");
		sb.append(Coverage);
		sb.append(", Fin_Year=");
		sb.append(Fin_Year);
		sb.append(", LETTERCTL=");
		sb.append(LETTERCTL);
		sb.append(", LOCPATH=");
		sb.append(LOCPATH);
		sb.append(", DOCIDNUM=");
		sb.append(DOCIDNUM);
		sb.append(", status=");
		sb.append(status);
		sb.append(", lastProcessedDate=");
		sb.append(lastProcessedDate);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", GLCODE=");
		sb.append(GLCODE);
		sb.append(", BRANCH_CODE=");
		sb.append(BRANCH_CODE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PREMIUM_PAID_CERTIFICATE toEntityModel() {
		PREMIUM_PAID_CERTIFICATEImpl premium_paid_certificateImpl = new PREMIUM_PAID_CERTIFICATEImpl();

		premium_paid_certificateImpl.setID(ID);

		if (Financial_Year == null) {
			premium_paid_certificateImpl.setFinancial_Year(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setFinancial_Year(Financial_Year);
		}

		if (Generation_Date == null) {
			premium_paid_certificateImpl.setGeneration_Date(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setGeneration_Date(Generation_Date);
		}

		if (OwnerName == null) {
			premium_paid_certificateImpl.setOwnerName(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setOwnerName(OwnerName);
		}

		if (Addrs1 == null) {
			premium_paid_certificateImpl.setAddrs1(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setAddrs1(Addrs1);
		}

		if (Addrs2 == null) {
			premium_paid_certificateImpl.setAddrs2(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setAddrs2(Addrs2);
		}

		if (Addrs3 == null) {
			premium_paid_certificateImpl.setAddrs3(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setAddrs3(Addrs3);
		}

		if (Addrs4 == null) {
			premium_paid_certificateImpl.setAddrs4(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setAddrs4(Addrs4);
		}

		if (Addrs5 == null) {
			premium_paid_certificateImpl.setAddrs5(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setAddrs5(Addrs5);
		}

		if (Postcode == null) {
			premium_paid_certificateImpl.setPostcode(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setPostcode(Postcode);
		}

		if (MobilePhoneNo == null) {
			premium_paid_certificateImpl.setMobilePhoneNo(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setMobilePhoneNo(MobilePhoneNo);
		}

		if (Email_ID == null) {
			premium_paid_certificateImpl.setEmail_ID(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setEmail_ID(Email_ID);
		}

		if (Client_ID == null) {
			premium_paid_certificateImpl.setClient_ID(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setClient_ID(Client_ID);
		}

		if (Contract_Type_Desc == null) {
			premium_paid_certificateImpl.setContract_Type_Desc(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setContract_Type_Desc(Contract_Type_Desc);
		}

		if (ContrNo == null) {
			premium_paid_certificateImpl.setContrNo(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setContrNo(ContrNo);
		}

		if (Installment_Prem == null) {
			premium_paid_certificateImpl.setInstallment_Prem(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setInstallment_Prem(Installment_Prem);
		}

		if (Billing_Frequency == null) {
			premium_paid_certificateImpl.setBilling_Frequency(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setBilling_Frequency(Billing_Frequency);
		}

		if (SumAssured == null) {
			premium_paid_certificateImpl.setSumAssured(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setSumAssured(SumAssured);
		}

		if (Total_Pre_Paid == null) {
			premium_paid_certificateImpl.setTotal_Pre_Paid(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setTotal_Pre_Paid(Total_Pre_Paid);
		}

		if (Total_Pre_Due == null) {
			premium_paid_certificateImpl.setTotal_Pre_Due(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setTotal_Pre_Due(Total_Pre_Due);
		}

		if (Coverage == null) {
			premium_paid_certificateImpl.setCoverage(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setCoverage(Coverage);
		}

		premium_paid_certificateImpl.setFin_Year(Fin_Year);

		if (LETTERCTL == null) {
			premium_paid_certificateImpl.setLETTERCTL(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setLETTERCTL(LETTERCTL);
		}

		if (LOCPATH == null) {
			premium_paid_certificateImpl.setLOCPATH(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setLOCPATH(LOCPATH);
		}

		if (DOCIDNUM == null) {
			premium_paid_certificateImpl.setDOCIDNUM(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setDOCIDNUM(DOCIDNUM);
		}

		if (status == null) {
			premium_paid_certificateImpl.setStatus(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setStatus(status);
		}

		if (lastProcessedDate == null) {
			premium_paid_certificateImpl.setLastProcessedDate(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setLastProcessedDate(lastProcessedDate);
		}

		if (createDate == null) {
			premium_paid_certificateImpl.setCreateDate(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setCreateDate(createDate);
		}

		if (GLCODE == null) {
			premium_paid_certificateImpl.setGLCODE(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setGLCODE(GLCODE);
		}

		if (BRANCH_CODE == null) {
			premium_paid_certificateImpl.setBRANCH_CODE(StringPool.BLANK);
		}
		else {
			premium_paid_certificateImpl.setBRANCH_CODE(BRANCH_CODE);
		}

		premium_paid_certificateImpl.resetOriginalValues();

		return premium_paid_certificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readLong();
		Financial_Year = objectInput.readUTF();
		Generation_Date = objectInput.readUTF();
		OwnerName = objectInput.readUTF();
		Addrs1 = objectInput.readUTF();
		Addrs2 = objectInput.readUTF();
		Addrs3 = objectInput.readUTF();
		Addrs4 = objectInput.readUTF();
		Addrs5 = objectInput.readUTF();
		Postcode = objectInput.readUTF();
		MobilePhoneNo = objectInput.readUTF();
		Email_ID = objectInput.readUTF();
		Client_ID = objectInput.readUTF();
		Contract_Type_Desc = objectInput.readUTF();
		ContrNo = objectInput.readUTF();
		Installment_Prem = objectInput.readUTF();
		Billing_Frequency = objectInput.readUTF();
		SumAssured = objectInput.readUTF();
		Total_Pre_Paid = objectInput.readUTF();
		Total_Pre_Due = objectInput.readUTF();
		Coverage = objectInput.readUTF();
		Fin_Year = objectInput.readInt();
		LETTERCTL = objectInput.readUTF();
		LOCPATH = objectInput.readUTF();
		DOCIDNUM = objectInput.readUTF();
		status = objectInput.readUTF();
		lastProcessedDate = objectInput.readUTF();
		createDate = objectInput.readUTF();
		GLCODE = objectInput.readUTF();
		BRANCH_CODE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ID);

		if (Financial_Year == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Financial_Year);
		}

		if (Generation_Date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Generation_Date);
		}

		if (OwnerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OwnerName);
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

		if (MobilePhoneNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MobilePhoneNo);
		}

		if (Email_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Email_ID);
		}

		if (Client_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Client_ID);
		}

		if (Contract_Type_Desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Contract_Type_Desc);
		}

		if (ContrNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ContrNo);
		}

		if (Installment_Prem == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Installment_Prem);
		}

		if (Billing_Frequency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Billing_Frequency);
		}

		if (SumAssured == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SumAssured);
		}

		if (Total_Pre_Paid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Total_Pre_Paid);
		}

		if (Total_Pre_Due == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Total_Pre_Due);
		}

		if (Coverage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Coverage);
		}

		objectOutput.writeInt(Fin_Year);

		if (LETTERCTL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LETTERCTL);
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

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (lastProcessedDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastProcessedDate);
		}

		if (createDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createDate);
		}

		if (GLCODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GLCODE);
		}

		if (BRANCH_CODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BRANCH_CODE);
		}
	}

	public long ID;
	public String Financial_Year;
	public String Generation_Date;
	public String OwnerName;
	public String Addrs1;
	public String Addrs2;
	public String Addrs3;
	public String Addrs4;
	public String Addrs5;
	public String Postcode;
	public String MobilePhoneNo;
	public String Email_ID;
	public String Client_ID;
	public String Contract_Type_Desc;
	public String ContrNo;
	public String Installment_Prem;
	public String Billing_Frequency;
	public String SumAssured;
	public String Total_Pre_Paid;
	public String Total_Pre_Due;
	public String Coverage;
	public int Fin_Year;
	public String LETTERCTL;
	public String LOCPATH;
	public String DOCIDNUM;
	public String status;
	public String lastProcessedDate;
	public String createDate;
	public String GLCODE;
	public String BRANCH_CODE;
}