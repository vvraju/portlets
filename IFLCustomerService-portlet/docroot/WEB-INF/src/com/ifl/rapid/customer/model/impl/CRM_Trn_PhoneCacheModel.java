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

import com.ifl.rapid.customer.model.CRM_Trn_Phone;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CRM_Trn_Phone in entity cache.
 *
 * @author Satya Kola
 * @see CRM_Trn_Phone
 * @generated
 */
public class CRM_Trn_PhoneCacheModel implements CacheModel<CRM_Trn_Phone>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{PhoneId=");
		sb.append(PhoneId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", PhoneType=");
		sb.append(PhoneType);
		sb.append(", PhoneNumber=");
		sb.append(PhoneNumber);
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
	public CRM_Trn_Phone toEntityModel() {
		CRM_Trn_PhoneImpl crm_Trn_PhoneImpl = new CRM_Trn_PhoneImpl();

		crm_Trn_PhoneImpl.setPhoneId(PhoneId);
		crm_Trn_PhoneImpl.setContactId(ContactId);
		crm_Trn_PhoneImpl.setPhoneType(PhoneType);

		if (PhoneNumber == null) {
			crm_Trn_PhoneImpl.setPhoneNumber(StringPool.BLANK);
		}
		else {
			crm_Trn_PhoneImpl.setPhoneNumber(PhoneNumber);
		}

		if (CreatedBy == null) {
			crm_Trn_PhoneImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_PhoneImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			crm_Trn_PhoneImpl.setCreatedDate(null);
		}
		else {
			crm_Trn_PhoneImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			crm_Trn_PhoneImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_PhoneImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			crm_Trn_PhoneImpl.setModifiedDate(null);
		}
		else {
			crm_Trn_PhoneImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (IsActive == null) {
			crm_Trn_PhoneImpl.setIsActive(StringPool.BLANK);
		}
		else {
			crm_Trn_PhoneImpl.setIsActive(IsActive);
		}

		crm_Trn_PhoneImpl.resetOriginalValues();

		return crm_Trn_PhoneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PhoneId = objectInput.readInt();
		ContactId = objectInput.readInt();
		PhoneType = objectInput.readInt();
		PhoneNumber = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PhoneId);
		objectOutput.writeInt(ContactId);
		objectOutput.writeInt(PhoneType);

		if (PhoneNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PhoneNumber);
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

		if (IsActive == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsActive);
		}
	}

	public int PhoneId;
	public int ContactId;
	public int PhoneType;
	public String PhoneNumber;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}