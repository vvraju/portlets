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

import com.ifl.rapid.customer.model.QrcTrnHistory;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QrcTrnHistory in entity cache.
 *
 * @author Satya Kola
 * @see QrcTrnHistory
 * @generated
 */
public class QrcTrnHistoryCacheModel implements CacheModel<QrcTrnHistory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{HistoryId=");
		sb.append(HistoryId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", CreatedContactId=");
		sb.append(CreatedContactId);
		sb.append(", RequestType=");
		sb.append(RequestType);
		sb.append(", ChangeRequestType=");
		sb.append(ChangeRequestType);
		sb.append(", PickupDate=");
		sb.append(PickupDate);
		sb.append(", PickupTime=");
		sb.append(PickupTime);
		sb.append(", XMLData=");
		sb.append(XMLData);
		sb.append(", AddressTypeId=");
		sb.append(AddressTypeId);
		sb.append(", BranchId=");
		sb.append(BranchId);
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
	public QrcTrnHistory toEntityModel() {
		QrcTrnHistoryImpl qrcTrnHistoryImpl = new QrcTrnHistoryImpl();

		qrcTrnHistoryImpl.setHistoryId(HistoryId);
		qrcTrnHistoryImpl.setContactId(ContactId);
		qrcTrnHistoryImpl.setCreatedContactId(CreatedContactId);

		if (RequestType == null) {
			qrcTrnHistoryImpl.setRequestType(StringPool.BLANK);
		}
		else {
			qrcTrnHistoryImpl.setRequestType(RequestType);
		}

		if (ChangeRequestType == null) {
			qrcTrnHistoryImpl.setChangeRequestType(StringPool.BLANK);
		}
		else {
			qrcTrnHistoryImpl.setChangeRequestType(ChangeRequestType);
		}

		if (PickupDate == Long.MIN_VALUE) {
			qrcTrnHistoryImpl.setPickupDate(null);
		}
		else {
			qrcTrnHistoryImpl.setPickupDate(new Date(PickupDate));
		}

		if (PickupTime == null) {
			qrcTrnHistoryImpl.setPickupTime(StringPool.BLANK);
		}
		else {
			qrcTrnHistoryImpl.setPickupTime(PickupTime);
		}

		if (XMLData == null) {
			qrcTrnHistoryImpl.setXMLData(StringPool.BLANK);
		}
		else {
			qrcTrnHistoryImpl.setXMLData(XMLData);
		}

		qrcTrnHistoryImpl.setAddressTypeId(AddressTypeId);
		qrcTrnHistoryImpl.setBranchId(BranchId);
		qrcTrnHistoryImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			qrcTrnHistoryImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			qrcTrnHistoryImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			qrcTrnHistoryImpl.setCreatedDate(null);
		}
		else {
			qrcTrnHistoryImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			qrcTrnHistoryImpl.setModifiedDate(null);
		}
		else {
			qrcTrnHistoryImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			qrcTrnHistoryImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			qrcTrnHistoryImpl.setModifiedBy(ModifiedBy);
		}

		qrcTrnHistoryImpl.resetOriginalValues();

		return qrcTrnHistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		HistoryId = objectInput.readInt();
		ContactId = objectInput.readInt();
		CreatedContactId = objectInput.readInt();
		RequestType = objectInput.readUTF();
		ChangeRequestType = objectInput.readUTF();
		PickupDate = objectInput.readLong();
		PickupTime = objectInput.readUTF();
		XMLData = objectInput.readUTF();
		AddressTypeId = objectInput.readInt();
		BranchId = objectInput.readInt();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(HistoryId);
		objectOutput.writeInt(ContactId);
		objectOutput.writeInt(CreatedContactId);

		if (RequestType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RequestType);
		}

		if (ChangeRequestType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ChangeRequestType);
		}

		objectOutput.writeLong(PickupDate);

		if (PickupTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PickupTime);
		}

		if (XMLData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMLData);
		}

		objectOutput.writeInt(AddressTypeId);
		objectOutput.writeInt(BranchId);
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

	public int HistoryId;
	public int ContactId;
	public int CreatedContactId;
	public String RequestType;
	public String ChangeRequestType;
	public long PickupDate;
	public String PickupTime;
	public String XMLData;
	public int AddressTypeId;
	public int BranchId;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
}