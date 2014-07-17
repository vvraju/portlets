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

import com.ifli.rapid.model.PaymentTransactionStatusMaster;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentTransactionStatusMaster in entity cache.
 *
 * @author Satya Kola
 * @see PaymentTransactionStatusMaster
 * @generated
 */
public class PaymentTransactionStatusMasterCacheModel implements CacheModel<PaymentTransactionStatusMaster>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{TransactionStatusID=");
		sb.append(TransactionStatusID);
		sb.append(", StatusCode=");
		sb.append(StatusCode);
		sb.append(", StatusName=");
		sb.append(StatusName);
		sb.append(", StatusDesc=");
		sb.append(StatusDesc);
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
	public PaymentTransactionStatusMaster toEntityModel() {
		PaymentTransactionStatusMasterImpl paymentTransactionStatusMasterImpl = new PaymentTransactionStatusMasterImpl();

		paymentTransactionStatusMasterImpl.setTransactionStatusID(TransactionStatusID);
		paymentTransactionStatusMasterImpl.setStatusCode(StatusCode);

		if (StatusName == null) {
			paymentTransactionStatusMasterImpl.setStatusName(StringPool.BLANK);
		}
		else {
			paymentTransactionStatusMasterImpl.setStatusName(StatusName);
		}

		if (StatusDesc == null) {
			paymentTransactionStatusMasterImpl.setStatusDesc(StringPool.BLANK);
		}
		else {
			paymentTransactionStatusMasterImpl.setStatusDesc(StatusDesc);
		}

		paymentTransactionStatusMasterImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			paymentTransactionStatusMasterImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentTransactionStatusMasterImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentTransactionStatusMasterImpl.setCreatedDate(null);
		}
		else {
			paymentTransactionStatusMasterImpl.setCreatedDate(new Date(
					CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentTransactionStatusMasterImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentTransactionStatusMasterImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentTransactionStatusMasterImpl.setModifiedDate(null);
		}
		else {
			paymentTransactionStatusMasterImpl.setModifiedDate(new Date(
					ModifiedDate));
		}

		paymentTransactionStatusMasterImpl.resetOriginalValues();

		return paymentTransactionStatusMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		TransactionStatusID = objectInput.readInt();
		StatusCode = objectInput.readInt();
		StatusName = objectInput.readUTF();
		StatusDesc = objectInput.readUTF();
		IsActive = objectInput.readBoolean();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(TransactionStatusID);
		objectOutput.writeInt(StatusCode);

		if (StatusName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(StatusName);
		}

		if (StatusDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(StatusDesc);
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
	}

	public int TransactionStatusID;
	public int StatusCode;
	public String StatusName;
	public String StatusDesc;
	public boolean IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
}