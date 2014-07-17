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

import com.ifli.rapid.model.ChequePaymentRequest;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ChequePaymentRequest in entity cache.
 *
 * @author Satya Kola
 * @see ChequePaymentRequest
 * @generated
 */
public class ChequePaymentRequestCacheModel implements CacheModel<ChequePaymentRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ServiceRequestID=");
		sb.append(ServiceRequestID);
		sb.append(", ServiceRequestMasterId=");
		sb.append(ServiceRequestMasterId);
		sb.append(", description=");
		sb.append(description);
		sb.append(", contactId=");
		sb.append(contactId);
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
	public ChequePaymentRequest toEntityModel() {
		ChequePaymentRequestImpl chequePaymentRequestImpl = new ChequePaymentRequestImpl();

		if (ServiceRequestID == null) {
			chequePaymentRequestImpl.setServiceRequestID(StringPool.BLANK);
		}
		else {
			chequePaymentRequestImpl.setServiceRequestID(ServiceRequestID);
		}

		if (ServiceRequestMasterId == null) {
			chequePaymentRequestImpl.setServiceRequestMasterId(StringPool.BLANK);
		}
		else {
			chequePaymentRequestImpl.setServiceRequestMasterId(ServiceRequestMasterId);
		}

		if (description == null) {
			chequePaymentRequestImpl.setDescription(StringPool.BLANK);
		}
		else {
			chequePaymentRequestImpl.setDescription(description);
		}

		if (contactId == null) {
			chequePaymentRequestImpl.setContactId(StringPool.BLANK);
		}
		else {
			chequePaymentRequestImpl.setContactId(contactId);
		}

		if (startPreferedTime == Long.MIN_VALUE) {
			chequePaymentRequestImpl.setStartPreferedTime(null);
		}
		else {
			chequePaymentRequestImpl.setStartPreferedTime(new Date(
					startPreferedTime));
		}

		if (endPreferedTime == Long.MIN_VALUE) {
			chequePaymentRequestImpl.setEndPreferedTime(null);
		}
		else {
			chequePaymentRequestImpl.setEndPreferedTime(new Date(
					endPreferedTime));
		}

		if (PreferedDate == Long.MIN_VALUE) {
			chequePaymentRequestImpl.setPreferedDate(null);
		}
		else {
			chequePaymentRequestImpl.setPreferedDate(new Date(PreferedDate));
		}

		chequePaymentRequestImpl.resetOriginalValues();

		return chequePaymentRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ServiceRequestID = objectInput.readUTF();
		ServiceRequestMasterId = objectInput.readUTF();
		description = objectInput.readUTF();
		contactId = objectInput.readUTF();
		startPreferedTime = objectInput.readLong();
		endPreferedTime = objectInput.readLong();
		PreferedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (ServiceRequestID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ServiceRequestID);
		}

		if (ServiceRequestMasterId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ServiceRequestMasterId);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (contactId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactId);
		}

		objectOutput.writeLong(startPreferedTime);
		objectOutput.writeLong(endPreferedTime);
		objectOutput.writeLong(PreferedDate);
	}

	public String ServiceRequestID;
	public String ServiceRequestMasterId;
	public String description;
	public String contactId;
	public long startPreferedTime;
	public long endPreferedTime;
	public long PreferedDate;
}