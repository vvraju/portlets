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

package com.ifl.rapid.customer.model.impl;

import com.ifl.rapid.customer.model.ApplyTrnQuoteDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ApplyTrnQuoteDetails in entity cache.
 *
 * @author Satya Kola
 * @see ApplyTrnQuoteDetails
 * @generated
 */
public class ApplyTrnQuoteDetailsCacheModel implements CacheModel<ApplyTrnQuoteDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{QuoteId=");
		sb.append(QuoteId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", ProductId=");
		sb.append(ProductId);
		sb.append(", PremiumTypeId=");
		sb.append(PremiumTypeId);
		sb.append(", PremiumFrequencyId=");
		sb.append(PremiumFrequencyId);
		sb.append(", AssuredTerm=");
		sb.append(AssuredTerm);
		sb.append(", AssuredAge=");
		sb.append(AssuredAge);
		sb.append(", DataXml=");
		sb.append(DataXml);
		sb.append(", DeathBenefitOption=");
		sb.append(DeathBenefitOption);
		sb.append(", ExpiryDate=");
		sb.append(ExpiryDate);
		sb.append(", IsStaff=");
		sb.append(IsStaff);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append(", PolicyOption=");
		sb.append(PolicyOption);
		sb.append(", PayingTerm=");
		sb.append(PayingTerm);
		sb.append(", ProposalStartDate=");
		sb.append(ProposalStartDate);
		sb.append(", RefNo=");
		sb.append(RefNo);
		sb.append(", PlanTerm=");
		sb.append(PlanTerm);
		sb.append(", PremiumTerm=");
		sb.append(PremiumTerm);
		sb.append(", PremiumAmount=");
		sb.append(PremiumAmount);
		sb.append(", SumAssured=");
		sb.append(SumAssured);
		sb.append(", SummaryXml=");
		sb.append(SummaryXml);
		sb.append(", PdfLocation=");
		sb.append(PdfLocation);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", pdfDataXml=");
		sb.append(pdfDataXml);
		sb.append(", IsSmoker=");
		sb.append(IsSmoker);
		sb.append(", SignatureFilePath=");
		sb.append(SignatureFilePath);
		sb.append(", BDMSignatureFilePath=");
		sb.append(BDMSignatureFilePath);
		sb.append(", BDMId=");
		sb.append(BDMId);
		sb.append(", IsAssisted=");
		sb.append(IsAssisted);
		sb.append(", InputXML=");
		sb.append(InputXML);
		sb.append(", LeadId=");
		sb.append(LeadId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApplyTrnQuoteDetails toEntityModel() {
		ApplyTrnQuoteDetailsImpl applyTrnQuoteDetailsImpl = new ApplyTrnQuoteDetailsImpl();

		if (QuoteId == null) {
			applyTrnQuoteDetailsImpl.setQuoteId(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setQuoteId(QuoteId);
		}

		applyTrnQuoteDetailsImpl.setContactId(ContactId);

		if (ProductId == null) {
			applyTrnQuoteDetailsImpl.setProductId(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setProductId(ProductId);
		}

		if (PremiumTypeId == null) {
			applyTrnQuoteDetailsImpl.setPremiumTypeId(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setPremiumTypeId(PremiumTypeId);
		}

		if (PremiumFrequencyId == null) {
			applyTrnQuoteDetailsImpl.setPremiumFrequencyId(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setPremiumFrequencyId(PremiumFrequencyId);
		}

		applyTrnQuoteDetailsImpl.setAssuredTerm(AssuredTerm);
		applyTrnQuoteDetailsImpl.setAssuredAge(AssuredAge);

		if (DataXml == null) {
			applyTrnQuoteDetailsImpl.setDataXml(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setDataXml(DataXml);
		}

		applyTrnQuoteDetailsImpl.setDeathBenefitOption(DeathBenefitOption);

		if (ExpiryDate == Long.MIN_VALUE) {
			applyTrnQuoteDetailsImpl.setExpiryDate(null);
		}
		else {
			applyTrnQuoteDetailsImpl.setExpiryDate(new Date(ExpiryDate));
		}

		if (IsStaff == null) {
			applyTrnQuoteDetailsImpl.setIsStaff(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setIsStaff(IsStaff);
		}

		applyTrnQuoteDetailsImpl.setIsActive(IsActive);
		applyTrnQuoteDetailsImpl.setPolicyOption(PolicyOption);
		applyTrnQuoteDetailsImpl.setPayingTerm(PayingTerm);

		if (ProposalStartDate == null) {
			applyTrnQuoteDetailsImpl.setProposalStartDate(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setProposalStartDate(ProposalStartDate);
		}

		applyTrnQuoteDetailsImpl.setRefNo(RefNo);
		applyTrnQuoteDetailsImpl.setPlanTerm(PlanTerm);
		applyTrnQuoteDetailsImpl.setPremiumTerm(PremiumTerm);
		applyTrnQuoteDetailsImpl.setPremiumAmount(PremiumAmount);
		applyTrnQuoteDetailsImpl.setSumAssured(SumAssured);

		if (SummaryXml == null) {
			applyTrnQuoteDetailsImpl.setSummaryXml(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setSummaryXml(SummaryXml);
		}

		if (PdfLocation == null) {
			applyTrnQuoteDetailsImpl.setPdfLocation(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setPdfLocation(PdfLocation);
		}

		if (CreatedBy == null) {
			applyTrnQuoteDetailsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			applyTrnQuoteDetailsImpl.setCreatedDate(null);
		}
		else {
			applyTrnQuoteDetailsImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			applyTrnQuoteDetailsImpl.setModifiedDate(null);
		}
		else {
			applyTrnQuoteDetailsImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			applyTrnQuoteDetailsImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setModifiedBy(ModifiedBy);
		}

		if (pdfDataXml == null) {
			applyTrnQuoteDetailsImpl.setPdfDataXml(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setPdfDataXml(pdfDataXml);
		}

		applyTrnQuoteDetailsImpl.setIsSmoker(IsSmoker);

		if (SignatureFilePath == null) {
			applyTrnQuoteDetailsImpl.setSignatureFilePath(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setSignatureFilePath(SignatureFilePath);
		}

		if (BDMSignatureFilePath == null) {
			applyTrnQuoteDetailsImpl.setBDMSignatureFilePath(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setBDMSignatureFilePath(BDMSignatureFilePath);
		}

		applyTrnQuoteDetailsImpl.setBDMId(BDMId);
		applyTrnQuoteDetailsImpl.setIsAssisted(IsAssisted);

		if (InputXML == null) {
			applyTrnQuoteDetailsImpl.setInputXML(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setInputXML(InputXML);
		}

		if (LeadId == null) {
			applyTrnQuoteDetailsImpl.setLeadId(StringPool.BLANK);
		}
		else {
			applyTrnQuoteDetailsImpl.setLeadId(LeadId);
		}

		applyTrnQuoteDetailsImpl.resetOriginalValues();

		return applyTrnQuoteDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		QuoteId = objectInput.readUTF();
		ContactId = objectInput.readInt();
		ProductId = objectInput.readUTF();
		PremiumTypeId = objectInput.readUTF();
		PremiumFrequencyId = objectInput.readUTF();
		AssuredTerm = objectInput.readInt();
		AssuredAge = objectInput.readInt();
		DataXml = objectInput.readUTF();
		DeathBenefitOption = objectInput.readInt();
		ExpiryDate = objectInput.readLong();
		IsStaff = objectInput.readUTF();
		IsActive = objectInput.readInt();
		PolicyOption = objectInput.readInt();
		PayingTerm = objectInput.readInt();
		ProposalStartDate = objectInput.readUTF();
		RefNo = objectInput.readInt();
		PlanTerm = objectInput.readInt();
		PremiumTerm = objectInput.readInt();
		PremiumAmount = objectInput.readDouble();
		SumAssured = objectInput.readDouble();
		SummaryXml = objectInput.readUTF();
		PdfLocation = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		pdfDataXml = objectInput.readUTF();
		IsSmoker = objectInput.readInt();
		SignatureFilePath = objectInput.readUTF();
		BDMSignatureFilePath = objectInput.readUTF();
		BDMId = objectInput.readInt();
		IsAssisted = objectInput.readInt();
		InputXML = objectInput.readUTF();
		LeadId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (QuoteId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QuoteId);
		}

		objectOutput.writeInt(ContactId);

		if (ProductId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProductId);
		}

		if (PremiumTypeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PremiumTypeId);
		}

		if (PremiumFrequencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PremiumFrequencyId);
		}

		objectOutput.writeInt(AssuredTerm);
		objectOutput.writeInt(AssuredAge);

		if (DataXml == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DataXml);
		}

		objectOutput.writeInt(DeathBenefitOption);
		objectOutput.writeLong(ExpiryDate);

		if (IsStaff == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsStaff);
		}

		objectOutput.writeInt(IsActive);
		objectOutput.writeInt(PolicyOption);
		objectOutput.writeInt(PayingTerm);

		if (ProposalStartDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProposalStartDate);
		}

		objectOutput.writeInt(RefNo);
		objectOutput.writeInt(PlanTerm);
		objectOutput.writeInt(PremiumTerm);
		objectOutput.writeDouble(PremiumAmount);
		objectOutput.writeDouble(SumAssured);

		if (SummaryXml == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SummaryXml);
		}

		if (PdfLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PdfLocation);
		}

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);
		objectOutput.writeLong(ModifiedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}

		if (pdfDataXml == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pdfDataXml);
		}

		objectOutput.writeInt(IsSmoker);

		if (SignatureFilePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SignatureFilePath);
		}

		if (BDMSignatureFilePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BDMSignatureFilePath);
		}

		objectOutput.writeInt(BDMId);
		objectOutput.writeInt(IsAssisted);

		if (InputXML == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(InputXML);
		}

		if (LeadId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LeadId);
		}
	}

	public String QuoteId;
	public int ContactId;
	public String ProductId;
	public String PremiumTypeId;
	public String PremiumFrequencyId;
	public int AssuredTerm;
	public int AssuredAge;
	public String DataXml;
	public int DeathBenefitOption;
	public long ExpiryDate;
	public String IsStaff;
	public int IsActive;
	public int PolicyOption;
	public int PayingTerm;
	public String ProposalStartDate;
	public int RefNo;
	public int PlanTerm;
	public int PremiumTerm;
	public double PremiumAmount;
	public double SumAssured;
	public String SummaryXml;
	public String PdfLocation;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
	public String pdfDataXml;
	public int IsSmoker;
	public String SignatureFilePath;
	public String BDMSignatureFilePath;
	public int BDMId;
	public int IsAssisted;
	public String InputXML;
	public String LeadId;
}