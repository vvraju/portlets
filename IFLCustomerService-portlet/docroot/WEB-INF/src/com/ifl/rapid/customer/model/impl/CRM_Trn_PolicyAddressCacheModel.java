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

import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CRM_Trn_PolicyAddress in entity cache.
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddress
 * @generated
 */
public class CRM_Trn_PolicyAddressCacheModel implements CacheModel<CRM_Trn_PolicyAddress>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{PolicyAddressId=");
		sb.append(PolicyAddressId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", PolicyNo=");
		sb.append(PolicyNo);
		sb.append(", AddressId=");
		sb.append(AddressId);
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
	public CRM_Trn_PolicyAddress toEntityModel() {
		CRM_Trn_PolicyAddressImpl crm_Trn_PolicyAddressImpl = new CRM_Trn_PolicyAddressImpl();

		crm_Trn_PolicyAddressImpl.setPolicyAddressId(PolicyAddressId);
		crm_Trn_PolicyAddressImpl.setContactId(ContactId);

		if (PolicyNo == null) {
			crm_Trn_PolicyAddressImpl.setPolicyNo(StringPool.BLANK);
		}
		else {
			crm_Trn_PolicyAddressImpl.setPolicyNo(PolicyNo);
		}

		crm_Trn_PolicyAddressImpl.setAddressId(AddressId);

		if (IsActive == null) {
			crm_Trn_PolicyAddressImpl.setIsActive(StringPool.BLANK);
		}
		else {
			crm_Trn_PolicyAddressImpl.setIsActive(IsActive);
		}

		if (CreatedBy == null) {
			crm_Trn_PolicyAddressImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_PolicyAddressImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			crm_Trn_PolicyAddressImpl.setCreatedDate(null);
		}
		else {
			crm_Trn_PolicyAddressImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			crm_Trn_PolicyAddressImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_PolicyAddressImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			crm_Trn_PolicyAddressImpl.setModifiedDate(null);
		}
		else {
			crm_Trn_PolicyAddressImpl.setModifiedDate(new Date(ModifiedDate));
		}

		crm_Trn_PolicyAddressImpl.resetOriginalValues();

		return crm_Trn_PolicyAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PolicyAddressId = objectInput.readInt();
		ContactId = objectInput.readInt();
		PolicyNo = objectInput.readUTF();
		AddressId = objectInput.readInt();
		IsActive = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PolicyAddressId);
		objectOutput.writeInt(ContactId);

		if (PolicyNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PolicyNo);
		}

		objectOutput.writeInt(AddressId);

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

	public int PolicyAddressId;
	public int ContactId;
	public String PolicyNo;
	public int AddressId;
	public String IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
}