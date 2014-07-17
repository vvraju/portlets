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

import com.ifli.rapid.model.ServiceRequestMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceRequestMaster in entity cache.
 *
 * @author Satya Kola
 * @see ServiceRequestMaster
 * @generated
 */
public class ServiceRequestMasterCacheModel implements CacheModel<ServiceRequestMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Type=");
		sb.append(Type);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", addressTypeId=");
		sb.append(addressTypeId);
		sb.append(", address=");
		sb.append(address);
		sb.append(", PolicyNo=");
		sb.append(PolicyNo);
		sb.append(", MobileNo=");
		sb.append(MobileNo);
		sb.append(", description=");
		sb.append(description);
		sb.append(", startPreferedTime=");
		sb.append(startPreferedTime);
		sb.append(", endPreferedTime=");
		sb.append(endPreferedTime);
		sb.append(", PreferedDate=");
		sb.append(PreferedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceRequestMaster toEntityModel() {
		ServiceRequestMasterImpl serviceRequestMasterImpl = new ServiceRequestMasterImpl();

		if (Id == null) {
			serviceRequestMasterImpl.setId(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setId(Id);
		}

		if (Type == null) {
			serviceRequestMasterImpl.setType(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setType(Type);
		}

		if (ContactId == null) {
			serviceRequestMasterImpl.setContactId(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setContactId(ContactId);
		}

		if (addressTypeId == null) {
			serviceRequestMasterImpl.setAddressTypeId(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setAddressTypeId(addressTypeId);
		}

		if (address == null) {
			serviceRequestMasterImpl.setAddress(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setAddress(address);
		}

		serviceRequestMasterImpl.setPolicyNo(PolicyNo);

		if (MobileNo == null) {
			serviceRequestMasterImpl.setMobileNo(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setMobileNo(MobileNo);
		}

		if (description == null) {
			serviceRequestMasterImpl.setDescription(StringPool.BLANK);
		}
		else {
			serviceRequestMasterImpl.setDescription(description);
		}

		if (startPreferedTime == Long.MIN_VALUE) {
			serviceRequestMasterImpl.setStartPreferedTime(null);
		}
		else {
			serviceRequestMasterImpl.setStartPreferedTime(new Date(
					startPreferedTime));
		}

		if (endPreferedTime == Long.MIN_VALUE) {
			serviceRequestMasterImpl.setEndPreferedTime(null);
		}
		else {
			serviceRequestMasterImpl.setEndPreferedTime(new Date(
					endPreferedTime));
		}

		if (PreferedDate == Long.MIN_VALUE) {
			serviceRequestMasterImpl.setPreferedDate(null);
		}
		else {
			serviceRequestMasterImpl.setPreferedDate(new Date(PreferedDate));
		}

		serviceRequestMasterImpl.resetOriginalValues();

		return serviceRequestMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readUTF();
		Type = objectInput.readUTF();
		ContactId = objectInput.readUTF();
		addressTypeId = objectInput.readUTF();
		address = objectInput.readUTF();
		PolicyNo = objectInput.readInt();
		MobileNo = objectInput.readUTF();
		description = objectInput.readUTF();
		startPreferedTime = objectInput.readLong();
		endPreferedTime = objectInput.readLong();
		PreferedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (Id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Id);
		}

		if (Type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Type);
		}

		if (ContactId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ContactId);
		}

		if (addressTypeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addressTypeId);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeInt(PolicyNo);

		if (MobileNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MobileNo);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(startPreferedTime);
		objectOutput.writeLong(endPreferedTime);
		objectOutput.writeLong(PreferedDate);
	}

	public String Id;
	public String Type;
	public String ContactId;
	public String addressTypeId;
	public String address;
	public int PolicyNo;
	public String MobileNo;
	public String description;
	public long startPreferedTime;
	public long endPreferedTime;
	public long PreferedDate;
}