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

import com.ifli.rapid.model.PaymentMethodType;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentMethodType in entity cache.
 *
 * @author Satya Kola
 * @see PaymentMethodType
 * @generated
 */
public class PaymentMethodTypeCacheModel implements CacheModel<PaymentMethodType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", PaymentMethodID=");
		sb.append(PaymentMethodID);
		sb.append(", GatewayID=");
		sb.append(GatewayID);
		sb.append(", TypeKey=");
		sb.append(TypeKey);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", BankId=");
		sb.append(BankId);
		sb.append(", Active=");
		sb.append(Active);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", Type=");
		sb.append(Type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentMethodType toEntityModel() {
		PaymentMethodTypeImpl paymentMethodTypeImpl = new PaymentMethodTypeImpl();

		if (Id == null) {
			paymentMethodTypeImpl.setId(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setId(Id);
		}

		if (PaymentMethodID == null) {
			paymentMethodTypeImpl.setPaymentMethodID(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setPaymentMethodID(PaymentMethodID);
		}

		if (GatewayID == null) {
			paymentMethodTypeImpl.setGatewayID(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setGatewayID(GatewayID);
		}

		if (TypeKey == null) {
			paymentMethodTypeImpl.setTypeKey(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setTypeKey(TypeKey);
		}

		if (Description == null) {
			paymentMethodTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setDescription(Description);
		}

		if (BankId == null) {
			paymentMethodTypeImpl.setBankId(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setBankId(BankId);
		}

		paymentMethodTypeImpl.setActive(Active);

		if (CreatedBy == null) {
			paymentMethodTypeImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentMethodTypeImpl.setCreatedDate(null);
		}
		else {
			paymentMethodTypeImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentMethodTypeImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentMethodTypeImpl.setModifiedDate(null);
		}
		else {
			paymentMethodTypeImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (Type == null) {
			paymentMethodTypeImpl.setType(StringPool.BLANK);
		}
		else {
			paymentMethodTypeImpl.setType(Type);
		}

		paymentMethodTypeImpl.resetOriginalValues();

		return paymentMethodTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readUTF();
		PaymentMethodID = objectInput.readUTF();
		GatewayID = objectInput.readUTF();
		TypeKey = objectInput.readUTF();
		Description = objectInput.readUTF();
		BankId = objectInput.readUTF();
		Active = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Type = objectInput.readUTF();
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

		if (PaymentMethodID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentMethodID);
		}

		if (GatewayID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GatewayID);
		}

		if (TypeKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TypeKey);
		}

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}

		if (BankId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BankId);
		}

		objectOutput.writeBoolean(Active);

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

		if (Type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Type);
		}
	}

	public String Id;
	public String PaymentMethodID;
	public String GatewayID;
	public String TypeKey;
	public String Description;
	public String BankId;
	public boolean Active;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String Type;
}