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

import com.ifli.rapid.model.PaymentOptionTypes;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentOptionTypes in entity cache.
 *
 * @author Satya Kola
 * @see PaymentOptionTypes
 * @generated
 */
public class PaymentOptionTypesCacheModel implements CacheModel<PaymentOptionTypes>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{PaymentOptionTypesId=");
		sb.append(PaymentOptionTypesId);
		sb.append(", PaymentOptionId=");
		sb.append(PaymentOptionId);
		sb.append(", OptionTypesKey=");
		sb.append(OptionTypesKey);
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
		sb.append(", PaymentOptionTypeDesc=");
		sb.append(PaymentOptionTypeDesc);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentOptionTypes toEntityModel() {
		PaymentOptionTypesImpl paymentOptionTypesImpl = new PaymentOptionTypesImpl();

		if (PaymentOptionTypesId == null) {
			paymentOptionTypesImpl.setPaymentOptionTypesId(StringPool.BLANK);
		}
		else {
			paymentOptionTypesImpl.setPaymentOptionTypesId(PaymentOptionTypesId);
		}

		if (PaymentOptionId == null) {
			paymentOptionTypesImpl.setPaymentOptionId(StringPool.BLANK);
		}
		else {
			paymentOptionTypesImpl.setPaymentOptionId(PaymentOptionId);
		}

		if (OptionTypesKey == null) {
			paymentOptionTypesImpl.setOptionTypesKey(StringPool.BLANK);
		}
		else {
			paymentOptionTypesImpl.setOptionTypesKey(OptionTypesKey);
		}

		paymentOptionTypesImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			paymentOptionTypesImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentOptionTypesImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentOptionTypesImpl.setCreatedDate(null);
		}
		else {
			paymentOptionTypesImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentOptionTypesImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentOptionTypesImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentOptionTypesImpl.setModifiedDate(null);
		}
		else {
			paymentOptionTypesImpl.setModifiedDate(new Date(ModifiedDate));
		}

		paymentOptionTypesImpl.setPriority(Priority);

		if (PaymentOptionTypeDesc == null) {
			paymentOptionTypesImpl.setPaymentOptionTypeDesc(StringPool.BLANK);
		}
		else {
			paymentOptionTypesImpl.setPaymentOptionTypeDesc(PaymentOptionTypeDesc);
		}

		paymentOptionTypesImpl.resetOriginalValues();

		return paymentOptionTypesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PaymentOptionTypesId = objectInput.readUTF();
		PaymentOptionId = objectInput.readUTF();
		OptionTypesKey = objectInput.readUTF();
		IsActive = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Priority = objectInput.readInt();
		PaymentOptionTypeDesc = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (PaymentOptionTypesId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionTypesId);
		}

		if (PaymentOptionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionId);
		}

		if (OptionTypesKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OptionTypesKey);
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

		if (PaymentOptionTypeDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionTypeDesc);
		}
	}

	public String PaymentOptionTypesId;
	public String PaymentOptionId;
	public String OptionTypesKey;
	public boolean IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public int Priority;
	public String PaymentOptionTypeDesc;
}