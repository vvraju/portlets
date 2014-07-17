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

import com.ifli.rapid.model.PaymentGatewayMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentGatewayMaster in entity cache.
 *
 * @author Satya Kola
 * @see PaymentGatewayMaster
 * @generated
 */
public class PaymentGatewayMasterCacheModel implements CacheModel<PaymentGatewayMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{GatewayID=");
		sb.append(GatewayID);
		sb.append(", GatewayDescription=");
		sb.append(GatewayDescription);
		sb.append(", GatewayKey=");
		sb.append(GatewayKey);
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
		sb.append(", Priority=");
		sb.append(Priority);
		sb.append(", ItemCode=");
		sb.append(ItemCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentGatewayMaster toEntityModel() {
		PaymentGatewayMasterImpl paymentGatewayMasterImpl = new PaymentGatewayMasterImpl();

		if (GatewayID == null) {
			paymentGatewayMasterImpl.setGatewayID(StringPool.BLANK);
		}
		else {
			paymentGatewayMasterImpl.setGatewayID(GatewayID);
		}

		if (GatewayDescription == null) {
			paymentGatewayMasterImpl.setGatewayDescription(StringPool.BLANK);
		}
		else {
			paymentGatewayMasterImpl.setGatewayDescription(GatewayDescription);
		}

		if (GatewayKey == null) {
			paymentGatewayMasterImpl.setGatewayKey(StringPool.BLANK);
		}
		else {
			paymentGatewayMasterImpl.setGatewayKey(GatewayKey);
		}

		paymentGatewayMasterImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			paymentGatewayMasterImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentGatewayMasterImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentGatewayMasterImpl.setCreatedDate(null);
		}
		else {
			paymentGatewayMasterImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentGatewayMasterImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentGatewayMasterImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentGatewayMasterImpl.setModifiedDate(null);
		}
		else {
			paymentGatewayMasterImpl.setModifiedDate(new Date(ModifiedDate));
		}

		paymentGatewayMasterImpl.setPriority(Priority);

		if (ItemCode == null) {
			paymentGatewayMasterImpl.setItemCode(StringPool.BLANK);
		}
		else {
			paymentGatewayMasterImpl.setItemCode(ItemCode);
		}

		paymentGatewayMasterImpl.resetOriginalValues();

		return paymentGatewayMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		GatewayID = objectInput.readUTF();
		GatewayDescription = objectInput.readUTF();
		GatewayKey = objectInput.readUTF();
		IsActive = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Priority = objectInput.readInt();
		ItemCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (GatewayID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GatewayID);
		}

		if (GatewayDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GatewayDescription);
		}

		if (GatewayKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GatewayKey);
		}

		objectOutput.writeBoolean(IsActive);

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
		objectOutput.writeInt(Priority);

		if (ItemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ItemCode);
		}
	}

	public String GatewayID;
	public String GatewayDescription;
	public String GatewayKey;
	public boolean IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public int Priority;
	public String ItemCode;
}