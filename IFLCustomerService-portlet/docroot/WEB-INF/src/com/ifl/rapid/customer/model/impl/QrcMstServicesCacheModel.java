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

import com.ifl.rapid.customer.model.QrcMstServices;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QrcMstServices in entity cache.
 *
 * @author Satya Kola
 * @see QrcMstServices
 * @generated
 */
public class QrcMstServicesCacheModel implements CacheModel<QrcMstServices>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{ServiceId=");
		sb.append(ServiceId);
		sb.append(", ServiceName=");
		sb.append(ServiceName);
		sb.append(", Description=");
		sb.append(Description);
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
	public QrcMstServices toEntityModel() {
		QrcMstServicesImpl qrcMstServicesImpl = new QrcMstServicesImpl();

		qrcMstServicesImpl.setServiceId(ServiceId);

		if (ServiceName == null) {
			qrcMstServicesImpl.setServiceName(StringPool.BLANK);
		}
		else {
			qrcMstServicesImpl.setServiceName(ServiceName);
		}

		if (Description == null) {
			qrcMstServicesImpl.setDescription(StringPool.BLANK);
		}
		else {
			qrcMstServicesImpl.setDescription(Description);
		}

		if (CreatedBy == null) {
			qrcMstServicesImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			qrcMstServicesImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			qrcMstServicesImpl.setCreatedDate(null);
		}
		else {
			qrcMstServicesImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			qrcMstServicesImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			qrcMstServicesImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			qrcMstServicesImpl.setModifiedDate(null);
		}
		else {
			qrcMstServicesImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (IsActive == null) {
			qrcMstServicesImpl.setIsActive(StringPool.BLANK);
		}
		else {
			qrcMstServicesImpl.setIsActive(IsActive);
		}

		qrcMstServicesImpl.resetOriginalValues();

		return qrcMstServicesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ServiceId = objectInput.readInt();
		ServiceName = objectInput.readUTF();
		Description = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ServiceId);

		if (ServiceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ServiceName);
		}

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
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

	public int ServiceId;
	public String ServiceName;
	public String Description;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}