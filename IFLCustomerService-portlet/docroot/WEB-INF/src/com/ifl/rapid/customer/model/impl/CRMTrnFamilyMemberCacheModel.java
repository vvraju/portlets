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

import com.ifl.rapid.customer.model.CRMTrnFamilyMember;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CRMTrnFamilyMember in entity cache.
 *
 * @author Satya Kola
 * @see CRMTrnFamilyMember
 * @generated
 */
public class CRMTrnFamilyMemberCacheModel implements CacheModel<CRMTrnFamilyMember>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{FamilyMemberId=");
		sb.append(FamilyMemberId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", MemberId=");
		sb.append(MemberId);
		sb.append(", RelationshipId=");
		sb.append(RelationshipId);
		sb.append(", FinanciallyDependent=");
		sb.append(FinanciallyDependent);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CRMTrnFamilyMember toEntityModel() {
		CRMTrnFamilyMemberImpl crmTrnFamilyMemberImpl = new CRMTrnFamilyMemberImpl();

		crmTrnFamilyMemberImpl.setFamilyMemberId(FamilyMemberId);
		crmTrnFamilyMemberImpl.setContactId(ContactId);
		crmTrnFamilyMemberImpl.setMemberId(MemberId);
		crmTrnFamilyMemberImpl.setRelationshipId(RelationshipId);

		if (FinanciallyDependent == null) {
			crmTrnFamilyMemberImpl.setFinanciallyDependent(StringPool.BLANK);
		}
		else {
			crmTrnFamilyMemberImpl.setFinanciallyDependent(FinanciallyDependent);
		}

		if (IsActive == null) {
			crmTrnFamilyMemberImpl.setIsActive(StringPool.BLANK);
		}
		else {
			crmTrnFamilyMemberImpl.setIsActive(IsActive);
		}

		if (CreatedBy == null) {
			crmTrnFamilyMemberImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			crmTrnFamilyMemberImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			crmTrnFamilyMemberImpl.setCreatedDate(null);
		}
		else {
			crmTrnFamilyMemberImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			crmTrnFamilyMemberImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			crmTrnFamilyMemberImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			crmTrnFamilyMemberImpl.setModifiedDate(null);
		}
		else {
			crmTrnFamilyMemberImpl.setModifiedDate(new Date(ModifiedDate));
		}

		crmTrnFamilyMemberImpl.resetOriginalValues();

		return crmTrnFamilyMemberImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		FamilyMemberId = objectInput.readInt();
		ContactId = objectInput.readInt();
		MemberId = objectInput.readInt();
		RelationshipId = objectInput.readInt();
		FinanciallyDependent = objectInput.readUTF();
		IsActive = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(FamilyMemberId);
		objectOutput.writeInt(ContactId);
		objectOutput.writeInt(MemberId);
		objectOutput.writeInt(RelationshipId);

		if (FinanciallyDependent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FinanciallyDependent);
		}

		if (IsActive == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsActive);
		}

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
	}

	public int FamilyMemberId;
	public int ContactId;
	public int MemberId;
	public int RelationshipId;
	public String FinanciallyDependent;
	public String IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
}