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

import com.ifli.rapid.model.PaymentOptionMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentOptionMaster in entity cache.
 *
 * @author Satya Kola
 * @see PaymentOptionMaster
 * @generated
 */
public class PaymentOptionMasterCacheModel implements CacheModel<PaymentOptionMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{PaymentOptionId=");
		sb.append(PaymentOptionId);
		sb.append(", PaymentOptionKey=");
		sb.append(PaymentOptionKey);
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
		sb.append(", PaymentOptionDesc=");
		sb.append(PaymentOptionDesc);
		sb.append(", isProcessPayment=");
		sb.append(isProcessPayment);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentOptionMaster toEntityModel() {
		PaymentOptionMasterImpl paymentOptionMasterImpl = new PaymentOptionMasterImpl();

		if (PaymentOptionId == null) {
			paymentOptionMasterImpl.setPaymentOptionId(StringPool.BLANK);
		}
		else {
			paymentOptionMasterImpl.setPaymentOptionId(PaymentOptionId);
		}

		if (PaymentOptionKey == null) {
			paymentOptionMasterImpl.setPaymentOptionKey(StringPool.BLANK);
		}
		else {
			paymentOptionMasterImpl.setPaymentOptionKey(PaymentOptionKey);
		}

		paymentOptionMasterImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			paymentOptionMasterImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentOptionMasterImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentOptionMasterImpl.setCreatedDate(null);
		}
		else {
			paymentOptionMasterImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentOptionMasterImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentOptionMasterImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentOptionMasterImpl.setModifiedDate(null);
		}
		else {
			paymentOptionMasterImpl.setModifiedDate(new Date(ModifiedDate));
		}

		paymentOptionMasterImpl.setPriority(Priority);

		if (PaymentOptionDesc == null) {
			paymentOptionMasterImpl.setPaymentOptionDesc(StringPool.BLANK);
		}
		else {
			paymentOptionMasterImpl.setPaymentOptionDesc(PaymentOptionDesc);
		}

		paymentOptionMasterImpl.setIsProcessPayment(isProcessPayment);

		paymentOptionMasterImpl.resetOriginalValues();

		return paymentOptionMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PaymentOptionId = objectInput.readUTF();
		PaymentOptionKey = objectInput.readUTF();
		IsActive = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Priority = objectInput.readInt();
		PaymentOptionDesc = objectInput.readUTF();
		isProcessPayment = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (PaymentOptionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionId);
		}

		if (PaymentOptionKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionKey);
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

		if (PaymentOptionDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionDesc);
		}

		objectOutput.writeBoolean(isProcessPayment);
	}

	public String PaymentOptionId;
	public String PaymentOptionKey;
	public boolean IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public int Priority;
	public String PaymentOptionDesc;
	public boolean isProcessPayment;
}