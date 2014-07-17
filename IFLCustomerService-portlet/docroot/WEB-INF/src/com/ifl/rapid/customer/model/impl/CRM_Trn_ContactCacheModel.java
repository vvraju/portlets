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

import com.ifl.rapid.customer.model.CRM_Trn_Contact;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CRM_Trn_Contact in entity cache.
 *
 * @author Satya Kola
 * @see CRM_Trn_Contact
 * @generated
 */
public class CRM_Trn_ContactCacheModel implements CacheModel<CRM_Trn_Contact>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{ContactId=");
		sb.append(ContactId);
		sb.append(", Salutation=");
		sb.append(Salutation);
		sb.append(", FirstName=");
		sb.append(FirstName);
		sb.append(", MiddleName=");
		sb.append(MiddleName);
		sb.append(", LastName=");
		sb.append(LastName);
		sb.append(", PANNo=");
		sb.append(PANNo);
		sb.append(", Gender=");
		sb.append(Gender);
		sb.append(", BloodGroup=");
		sb.append(BloodGroup);
		sb.append(", DateOfBirth=");
		sb.append(DateOfBirth);
		sb.append(", MaritalStatus=");
		sb.append(MaritalStatus);
		sb.append(", QualificationId=");
		sb.append(QualificationId);
		sb.append(", OccupationId=");
		sb.append(OccupationId);
		sb.append(", SourceId=");
		sb.append(SourceId);
		sb.append(", CategoryId=");
		sb.append(CategoryId);
		sb.append(", ReferredBy=");
		sb.append(ReferredBy);
		sb.append(", ContactTypeId=");
		sb.append(ContactTypeId);
		sb.append(", DNDActivated=");
		sb.append(DNDActivated);
		sb.append(", PoliticallyExposed=");
		sb.append(PoliticallyExposed);
		sb.append(", EIANumber=");
		sb.append(EIANumber);
		sb.append(", SeqGenerator=");
		sb.append(SeqGenerator);
		sb.append(", ReferenceNo=");
		sb.append(ReferenceNo);
		sb.append(", EIAServiceProvider=");
		sb.append(EIAServiceProvider);
		sb.append(", AadharCardNo=");
		sb.append(AadharCardNo);
		sb.append(", WeddingAnniversary=");
		sb.append(WeddingAnniversary);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CRM_Trn_Contact toEntityModel() {
		CRM_Trn_ContactImpl crm_Trn_ContactImpl = new CRM_Trn_ContactImpl();

		crm_Trn_ContactImpl.setContactId(ContactId);

		if (Salutation == null) {
			crm_Trn_ContactImpl.setSalutation(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setSalutation(Salutation);
		}

		if (FirstName == null) {
			crm_Trn_ContactImpl.setFirstName(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setFirstName(FirstName);
		}

		if (MiddleName == null) {
			crm_Trn_ContactImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setMiddleName(MiddleName);
		}

		if (LastName == null) {
			crm_Trn_ContactImpl.setLastName(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setLastName(LastName);
		}

		if (PANNo == null) {
			crm_Trn_ContactImpl.setPANNo(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setPANNo(PANNo);
		}

		if (Gender == null) {
			crm_Trn_ContactImpl.setGender(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setGender(Gender);
		}

		if (BloodGroup == null) {
			crm_Trn_ContactImpl.setBloodGroup(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setBloodGroup(BloodGroup);
		}

		if (DateOfBirth == Long.MIN_VALUE) {
			crm_Trn_ContactImpl.setDateOfBirth(null);
		}
		else {
			crm_Trn_ContactImpl.setDateOfBirth(new Date(DateOfBirth));
		}

		if (MaritalStatus == null) {
			crm_Trn_ContactImpl.setMaritalStatus(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setMaritalStatus(MaritalStatus);
		}

		crm_Trn_ContactImpl.setQualificationId(QualificationId);
		crm_Trn_ContactImpl.setOccupationId(OccupationId);
		crm_Trn_ContactImpl.setSourceId(SourceId);
		crm_Trn_ContactImpl.setCategoryId(CategoryId);
		crm_Trn_ContactImpl.setReferredBy(ReferredBy);
		crm_Trn_ContactImpl.setContactTypeId(ContactTypeId);
		crm_Trn_ContactImpl.setDNDActivated(DNDActivated);
		crm_Trn_ContactImpl.setPoliticallyExposed(PoliticallyExposed);

		if (EIANumber == null) {
			crm_Trn_ContactImpl.setEIANumber(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setEIANumber(EIANumber);
		}

		crm_Trn_ContactImpl.setSeqGenerator(SeqGenerator);

		if (ReferenceNo == null) {
			crm_Trn_ContactImpl.setReferenceNo(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setReferenceNo(ReferenceNo);
		}

		if (EIAServiceProvider == null) {
			crm_Trn_ContactImpl.setEIAServiceProvider(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setEIAServiceProvider(EIAServiceProvider);
		}

		if (AadharCardNo == null) {
			crm_Trn_ContactImpl.setAadharCardNo(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setAadharCardNo(AadharCardNo);
		}

		if (WeddingAnniversary == Long.MIN_VALUE) {
			crm_Trn_ContactImpl.setWeddingAnniversary(null);
		}
		else {
			crm_Trn_ContactImpl.setWeddingAnniversary(new Date(
					WeddingAnniversary));
		}

		if (CreatedBy == null) {
			crm_Trn_ContactImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			crm_Trn_ContactImpl.setCreatedDate(null);
		}
		else {
			crm_Trn_ContactImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			crm_Trn_ContactImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			crm_Trn_ContactImpl.setModifiedDate(null);
		}
		else {
			crm_Trn_ContactImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (IsActive == null) {
			crm_Trn_ContactImpl.setIsActive(StringPool.BLANK);
		}
		else {
			crm_Trn_ContactImpl.setIsActive(IsActive);
		}

		crm_Trn_ContactImpl.resetOriginalValues();

		return crm_Trn_ContactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ContactId = objectInput.readInt();
		Salutation = objectInput.readUTF();
		FirstName = objectInput.readUTF();
		MiddleName = objectInput.readUTF();
		LastName = objectInput.readUTF();
		PANNo = objectInput.readUTF();
		Gender = objectInput.readUTF();
		BloodGroup = objectInput.readUTF();
		DateOfBirth = objectInput.readLong();
		MaritalStatus = objectInput.readUTF();
		QualificationId = objectInput.readInt();
		OccupationId = objectInput.readInt();
		SourceId = objectInput.readInt();
		CategoryId = objectInput.readInt();
		ReferredBy = objectInput.readInt();
		ContactTypeId = objectInput.readInt();
		DNDActivated = objectInput.readBoolean();
		PoliticallyExposed = objectInput.readBoolean();
		EIANumber = objectInput.readUTF();
		SeqGenerator = objectInput.readInt();
		ReferenceNo = objectInput.readUTF();
		EIAServiceProvider = objectInput.readUTF();
		AadharCardNo = objectInput.readUTF();
		WeddingAnniversary = objectInput.readLong();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ContactId);

		if (Salutation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Salutation);
		}

		if (FirstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FirstName);
		}

		if (MiddleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MiddleName);
		}

		if (LastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LastName);
		}

		if (PANNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PANNo);
		}

		if (Gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Gender);
		}

		if (BloodGroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BloodGroup);
		}

		objectOutput.writeLong(DateOfBirth);

		if (MaritalStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaritalStatus);
		}

		objectOutput.writeInt(QualificationId);
		objectOutput.writeInt(OccupationId);
		objectOutput.writeInt(SourceId);
		objectOutput.writeInt(CategoryId);
		objectOutput.writeInt(ReferredBy);
		objectOutput.writeInt(ContactTypeId);
		objectOutput.writeBoolean(DNDActivated);
		objectOutput.writeBoolean(PoliticallyExposed);

		if (EIANumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EIANumber);
		}

		objectOutput.writeInt(SeqGenerator);

		if (ReferenceNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReferenceNo);
		}

		if (EIAServiceProvider == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EIAServiceProvider);
		}

		if (AadharCardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AadharCardNo);
		}

		objectOutput.writeLong(WeddingAnniversary);

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}

		objectOutput.writeLong(ModifiedDate);

		if (IsActive == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsActive);
		}
	}

	public int ContactId;
	public String Salutation;
	public String FirstName;
	public String MiddleName;
	public String LastName;
	public String PANNo;
	public String Gender;
	public String BloodGroup;
	public long DateOfBirth;
	public String MaritalStatus;
	public int QualificationId;
	public int OccupationId;
	public int SourceId;
	public int CategoryId;
	public int ReferredBy;
	public int ContactTypeId;
	public boolean DNDActivated;
	public boolean PoliticallyExposed;
	public String EIANumber;
	public int SeqGenerator;
	public String ReferenceNo;
	public String EIAServiceProvider;
	public String AadharCardNo;
	public long WeddingAnniversary;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}