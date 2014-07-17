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

import com.ifli.rapid.model.PaymentMethodMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentMethodMaster in entity cache.
 *
 * @author Satya Kola
 * @see PaymentMethodMaster
 * @generated
 */
public class PaymentMethodMasterCacheModel implements CacheModel<PaymentMethodMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PaymentMethodID=");
		sb.append(PaymentMethodID);
		sb.append(", PaymentMethodKey=");
		sb.append(PaymentMethodKey);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentMethodMaster toEntityModel() {
		PaymentMethodMasterImpl paymentMethodMasterImpl = new PaymentMethodMasterImpl();

		if (PaymentMethodID == null) {
			paymentMethodMasterImpl.setPaymentMethodID(StringPool.BLANK);
		}
		else {
			paymentMethodMasterImpl.setPaymentMethodID(PaymentMethodID);
		}

		if (PaymentMethodKey == null) {
			paymentMethodMasterImpl.setPaymentMethodKey(StringPool.BLANK);
		}
		else {
			paymentMethodMasterImpl.setPaymentMethodKey(PaymentMethodKey);
		}

		paymentMethodMasterImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			paymentMethodMasterImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentMethodMasterImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentMethodMasterImpl.setCreatedDate(null);
		}
		else {
			paymentMethodMasterImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentMethodMasterImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentMethodMasterImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentMethodMasterImpl.setModifiedDate(null);
		}
		else {
			paymentMethodMasterImpl.setModifiedDate(new Date(ModifiedDate));
		}

		paymentMethodMasterImpl.setPriority(Priority);

		paymentMethodMasterImpl.resetOriginalValues();

		return paymentMethodMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PaymentMethodID = objectInput.readUTF();
		PaymentMethodKey = objectInput.readUTF();
		IsActive = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		Priority = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (PaymentMethodID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentMethodID);
		}

		if (PaymentMethodKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentMethodKey);
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
	}

	public String PaymentMethodID;
	public String PaymentMethodKey;
	public boolean IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public int Priority;
}