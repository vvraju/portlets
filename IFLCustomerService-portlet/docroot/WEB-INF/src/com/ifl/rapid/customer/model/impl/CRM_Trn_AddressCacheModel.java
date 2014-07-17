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

import com.ifl.rapid.customer.model.CRM_Trn_Address;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CRM_Trn_Address in entity cache.
 *
 * @author Satya Kola
 * @see CRM_Trn_Address
 * @generated
 */
public class CRM_Trn_AddressCacheModel implements CacheModel<CRM_Trn_Address>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{AddressId=");
		sb.append(AddressId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", AddressTypeId=");
		sb.append(AddressTypeId);
		sb.append(", AddressLine1=");
		sb.append(AddressLine1);
		sb.append(", AddressLine2=");
		sb.append(AddressLine2);
		sb.append(", AddressLine3=");
		sb.append(AddressLine3);
		sb.append(", District=");
		sb.append(District);
		sb.append(", StateId=");
		sb.append(StateId);
		sb.append(", CityId=");
		sb.append(CityId);
		sb.append(", Pincode=");
		sb.append(Pincode);
		sb.append(", CountryId=");
		sb.append(CountryId);
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
	public CRM_Trn_Address toEntityModel() {
		CRM_Trn_AddressImpl crm_Trn_AddressImpl = new CRM_Trn_AddressImpl();

		crm_Trn_AddressImpl.setAddressId(AddressId);
		crm_Trn_AddressImpl.setContactId(ContactId);
		crm_Trn_AddressImpl.setAddressTypeId(AddressTypeId);

		if (AddressLine1 == null) {
			crm_Trn_AddressImpl.setAddressLine1(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setAddressLine1(AddressLine1);
		}

		if (AddressLine2 == null) {
			crm_Trn_AddressImpl.setAddressLine2(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setAddressLine2(AddressLine2);
		}

		if (AddressLine3 == null) {
			crm_Trn_AddressImpl.setAddressLine3(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setAddressLine3(AddressLine3);
		}

		if (District == null) {
			crm_Trn_AddressImpl.setDistrict(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setDistrict(District);
		}

		crm_Trn_AddressImpl.setStateId(StateId);
		crm_Trn_AddressImpl.setCityId(CityId);

		if (Pincode == null) {
			crm_Trn_AddressImpl.setPincode(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setPincode(Pincode);
		}

		crm_Trn_AddressImpl.setCountryId(CountryId);

		if (IsActive == null) {
			crm_Trn_AddressImpl.setIsActive(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setIsActive(IsActive);
		}

		if (CreatedBy == null) {
			crm_Trn_AddressImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			crm_Trn_AddressImpl.setCreatedDate(null);
		}
		else {
			crm_Trn_AddressImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			crm_Trn_AddressImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			crm_Trn_AddressImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			crm_Trn_AddressImpl.setModifiedDate(null);
		}
		else {
			crm_Trn_AddressImpl.setModifiedDate(new Date(ModifiedDate));
		}

		crm_Trn_AddressImpl.resetOriginalValues();

		return crm_Trn_AddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		AddressId = objectInput.readInt();
		ContactId = objectInput.readInt();
		AddressTypeId = objectInput.readInt();
		AddressLine1 = objectInput.readUTF();
		AddressLine2 = objectInput.readUTF();
		AddressLine3 = objectInput.readUTF();
		District = objectInput.readUTF();
		StateId = objectInput.readInt();
		CityId = objectInput.readInt();
		Pincode = objectInput.readUTF();
		CountryId = objectInput.readInt();
		IsActive = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(AddressId);
		objectOutput.writeInt(ContactId);
		objectOutput.writeInt(AddressTypeId);

		if (AddressLine1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AddressLine1);
		}

		if (AddressLine2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AddressLine2);
		}

		if (AddressLine3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AddressLine3);
		}

		if (District == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(District);
		}

		objectOutput.writeInt(StateId);
		objectOutput.writeInt(CityId);

		if (Pincode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Pincode);
		}

		objectOutput.writeInt(CountryId);

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

	public int AddressId;
	public int ContactId;
	public int AddressTypeId;
	public String AddressLine1;
	public String AddressLine2;
	public String AddressLine3;
	public String District;
	public int StateId;
	public int CityId;
	public String Pincode;
	public int CountryId;
	public String IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
}