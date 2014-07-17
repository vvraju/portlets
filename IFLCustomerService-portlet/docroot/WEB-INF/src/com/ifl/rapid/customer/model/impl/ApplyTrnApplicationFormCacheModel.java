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

import com.ifl.rapid.customer.model.ApplyTrnApplicationForm;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ApplyTrnApplicationForm in entity cache.
 *
 * @author Satya Kola
 * @see ApplyTrnApplicationForm
 * @generated
 */
public class ApplyTrnApplicationFormCacheModel implements CacheModel<ApplyTrnApplicationForm>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{ApplicationFormId=");
		sb.append(ApplicationFormId);
		sb.append(", QuoteId=");
		sb.append(QuoteId);
		sb.append(", ApplicationRefNo=");
		sb.append(ApplicationRefNo);
		sb.append(", SeqGenerator=");
		sb.append(SeqGenerator);
		sb.append(", LTRFFormRefNo=");
		sb.append(LTRFFormRefNo);
		sb.append(", PremiumAmount=");
		sb.append(PremiumAmount);
		sb.append(", IsMedicalRequired=");
		sb.append(IsMedicalRequired);
		sb.append(", ShortPremium=");
		sb.append(ShortPremium);
		sb.append(", PremiumDueDate=");
		sb.append(PremiumDueDate);
		sb.append(", PolicyNo=");
		sb.append(PolicyNo);
		sb.append(", PolicyElapsedDate=");
		sb.append(PolicyElapsedDate);
		sb.append(", PolicyIssueDate=");
		sb.append(PolicyIssueDate);
		sb.append(", Status=");
		sb.append(Status);
		sb.append(", Completion=");
		sb.append(Completion);
		sb.append(", IsLapsed=");
		sb.append(IsLapsed);
		sb.append(", NextPremiumDueDate=");
		sb.append(NextPremiumDueDate);
		sb.append(", PolicyStatus=");
		sb.append(PolicyStatus);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApplyTrnApplicationForm toEntityModel() {
		ApplyTrnApplicationFormImpl applyTrnApplicationFormImpl = new ApplyTrnApplicationFormImpl();

		if (ApplicationFormId == null) {
			applyTrnApplicationFormImpl.setApplicationFormId(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setApplicationFormId(ApplicationFormId);
		}

		if (QuoteId == null) {
			applyTrnApplicationFormImpl.setQuoteId(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setQuoteId(QuoteId);
		}

		if (ApplicationRefNo == null) {
			applyTrnApplicationFormImpl.setApplicationRefNo(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setApplicationRefNo(ApplicationRefNo);
		}

		applyTrnApplicationFormImpl.setSeqGenerator(SeqGenerator);

		if (LTRFFormRefNo == null) {
			applyTrnApplicationFormImpl.setLTRFFormRefNo(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setLTRFFormRefNo(LTRFFormRefNo);
		}

		applyTrnApplicationFormImpl.setPremiumAmount(PremiumAmount);
		applyTrnApplicationFormImpl.setIsMedicalRequired(IsMedicalRequired);
		applyTrnApplicationFormImpl.setShortPremium(ShortPremium);

		if (PremiumDueDate == Long.MIN_VALUE) {
			applyTrnApplicationFormImpl.setPremiumDueDate(null);
		}
		else {
			applyTrnApplicationFormImpl.setPremiumDueDate(new Date(
					PremiumDueDate));
		}

		if (PolicyNo == null) {
			applyTrnApplicationFormImpl.setPolicyNo(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setPolicyNo(PolicyNo);
		}

		if (PolicyElapsedDate == Long.MIN_VALUE) {
			applyTrnApplicationFormImpl.setPolicyElapsedDate(null);
		}
		else {
			applyTrnApplicationFormImpl.setPolicyElapsedDate(new Date(
					PolicyElapsedDate));
		}

		if (PolicyIssueDate == Long.MIN_VALUE) {
			applyTrnApplicationFormImpl.setPolicyIssueDate(null);
		}
		else {
			applyTrnApplicationFormImpl.setPolicyIssueDate(new Date(
					PolicyIssueDate));
		}

		if (Status == null) {
			applyTrnApplicationFormImpl.setStatus(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setStatus(Status);
		}

		applyTrnApplicationFormImpl.setCompletion(Completion);
		applyTrnApplicationFormImpl.setIsLapsed(IsLapsed);

		if (NextPremiumDueDate == Long.MIN_VALUE) {
			applyTrnApplicationFormImpl.setNextPremiumDueDate(null);
		}
		else {
			applyTrnApplicationFormImpl.setNextPremiumDueDate(new Date(
					NextPremiumDueDate));
		}

		if (PolicyStatus == null) {
			applyTrnApplicationFormImpl.setPolicyStatus(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setPolicyStatus(PolicyStatus);
		}

		applyTrnApplicationFormImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			applyTrnApplicationFormImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			applyTrnApplicationFormImpl.setCreatedDate(null);
		}
		else {
			applyTrnApplicationFormImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			applyTrnApplicationFormImpl.setModifiedDate(null);
		}
		else {
			applyTrnApplicationFormImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			applyTrnApplicationFormImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			applyTrnApplicationFormImpl.setModifiedBy(ModifiedBy);
		}

		applyTrnApplicationFormImpl.resetOriginalValues();

		return applyTrnApplicationFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ApplicationFormId = objectInput.readUTF();
		QuoteId = objectInput.readUTF();
		ApplicationRefNo = objectInput.readUTF();
		SeqGenerator = objectInput.readInt();
		LTRFFormRefNo = objectInput.readUTF();
		PremiumAmount = objectInput.readDouble();
		IsMedicalRequired = objectInput.readInt();
		ShortPremium = objectInput.readDouble();
		PremiumDueDate = objectInput.readLong();
		PolicyNo = objectInput.readUTF();
		PolicyElapsedDate = objectInput.readLong();
		PolicyIssueDate = objectInput.readLong();
		Status = objectInput.readUTF();
		Completion = objectInput.readInt();
		IsLapsed = objectInput.readInt();
		NextPremiumDueDate = objectInput.readLong();
		PolicyStatus = objectInput.readUTF();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (ApplicationFormId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ApplicationFormId);
		}

		if (QuoteId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QuoteId);
		}

		if (ApplicationRefNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ApplicationRefNo);
		}

		objectOutput.writeInt(SeqGenerator);

		if (LTRFFormRefNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LTRFFormRefNo);
		}

		objectOutput.writeDouble(PremiumAmount);
		objectOutput.writeInt(IsMedicalRequired);
		objectOutput.writeDouble(ShortPremium);
		objectOutput.writeLong(PremiumDueDate);

		if (PolicyNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PolicyNo);
		}

		objectOutput.writeLong(PolicyElapsedDate);
		objectOutput.writeLong(PolicyIssueDate);

		if (Status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Status);
		}

		objectOutput.writeInt(Completion);
		objectOutput.writeInt(IsLapsed);
		objectOutput.writeLong(NextPremiumDueDate);

		if (PolicyStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PolicyStatus);
		}

		objectOutput.writeInt(IsActive);

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
	}

	public String ApplicationFormId;
	public String QuoteId;
	public String ApplicationRefNo;
	public int SeqGenerator;
	public String LTRFFormRefNo;
	public double PremiumAmount;
	public int IsMedicalRequired;
	public double ShortPremium;
	public long PremiumDueDate;
	public String PolicyNo;
	public long PolicyElapsedDate;
	public long PolicyIssueDate;
	public String Status;
	public int Completion;
	public int IsLapsed;
	public long NextPremiumDueDate;
	public String PolicyStatus;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
}