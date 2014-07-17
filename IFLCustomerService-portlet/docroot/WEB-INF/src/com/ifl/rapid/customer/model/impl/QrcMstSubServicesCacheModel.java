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

import com.ifl.rapid.customer.model.QrcMstSubServices;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QrcMstSubServices in entity cache.
 *
 * @author Satya Kola
 * @see QrcMstSubServices
 * @generated
 */
public class QrcMstSubServicesCacheModel implements CacheModel<QrcMstSubServices>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{SubServiceId=");
		sb.append(SubServiceId);
		sb.append(", SubServiceName=");
		sb.append(SubServiceName);
		sb.append(", SubServiceUrl=");
		sb.append(SubServiceUrl);
		sb.append(", ServiceId=");
		sb.append(ServiceId);
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
	public QrcMstSubServices toEntityModel() {
		QrcMstSubServicesImpl qrcMstSubServicesImpl = new QrcMstSubServicesImpl();

		qrcMstSubServicesImpl.setSubServiceId(SubServiceId);

		if (SubServiceName == null) {
			qrcMstSubServicesImpl.setSubServiceName(StringPool.BLANK);
		}
		else {
			qrcMstSubServicesImpl.setSubServiceName(SubServiceName);
		}

		if (SubServiceUrl == null) {
			qrcMstSubServicesImpl.setSubServiceUrl(StringPool.BLANK);
		}
		else {
			qrcMstSubServicesImpl.setSubServiceUrl(SubServiceUrl);
		}

		qrcMstSubServicesImpl.setServiceId(ServiceId);

		if (IsActive == null) {
			qrcMstSubServicesImpl.setIsActive(StringPool.BLANK);
		}
		else {
			qrcMstSubServicesImpl.setIsActive(IsActive);
		}

		if (CreatedBy == null) {
			qrcMstSubServicesImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			qrcMstSubServicesImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			qrcMstSubServicesImpl.setCreatedDate(null);
		}
		else {
			qrcMstSubServicesImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			qrcMstSubServicesImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			qrcMstSubServicesImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			qrcMstSubServicesImpl.setModifiedDate(null);
		}
		else {
			qrcMstSubServicesImpl.setModifiedDate(new Date(ModifiedDate));
		}

		qrcMstSubServicesImpl.resetOriginalValues();

		return qrcMstSubServicesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SubServiceId = objectInput.readInt();
		SubServiceName = objectInput.readUTF();
		SubServiceUrl = objectInput.readUTF();
		ServiceId = objectInput.readInt();
		IsActive = objectInput.readUTF();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(SubServiceId);

		if (SubServiceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SubServiceName);
		}

		if (SubServiceUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SubServiceUrl);
		}

		objectOutput.writeInt(ServiceId);

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

	public int SubServiceId;
	public String SubServiceName;
	public String SubServiceUrl;
	public int ServiceId;
	public String IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
}