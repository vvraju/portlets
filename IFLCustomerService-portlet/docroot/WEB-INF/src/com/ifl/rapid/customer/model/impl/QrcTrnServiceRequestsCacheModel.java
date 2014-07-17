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

import com.ifl.rapid.customer.model.QrcTrnServiceRequests;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QrcTrnServiceRequests in entity cache.
 *
 * @author Satya Kola
 * @see QrcTrnServiceRequests
 * @generated
 */
public class QrcTrnServiceRequestsCacheModel implements CacheModel<QrcTrnServiceRequests>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{ServiceRequestId=");
		sb.append(ServiceRequestId);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", SrId=");
		sb.append(SrId);
		sb.append(", ProcessId=");
		sb.append(ProcessId);
		sb.append(", Source=");
		sb.append(Source);
		sb.append(", Channel=");
		sb.append(Channel);
		sb.append(", Priority=");
		sb.append(Priority);
		sb.append(", PolicyNo=");
		sb.append(PolicyNo);
		sb.append(", CaseDetails=");
		sb.append(CaseDetails);
		sb.append(", IsManual=");
		sb.append(IsManual);
		sb.append(", IsLAUpdated=");
		sb.append(IsLAUpdated);
		sb.append(", Comments=");
		sb.append(Comments);
		sb.append(", IsSignVerified=");
		sb.append(IsSignVerified);
		sb.append(", RequestId=");
		sb.append(RequestId);
		sb.append(", AssignedTo=");
		sb.append(AssignedTo);
		sb.append(", CreatedContactId=");
		sb.append(CreatedContactId);
		sb.append(", HistoryId=");
		sb.append(HistoryId);
		sb.append(", AddressTypeId=");
		sb.append(AddressTypeId);
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
	public QrcTrnServiceRequests toEntityModel() {
		QrcTrnServiceRequestsImpl qrcTrnServiceRequestsImpl = new QrcTrnServiceRequestsImpl();

		qrcTrnServiceRequestsImpl.setServiceRequestId(ServiceRequestId);
		qrcTrnServiceRequestsImpl.setContactId(ContactId);

		if (SrId == null) {
			qrcTrnServiceRequestsImpl.setSrId(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setSrId(SrId);
		}

		if (ProcessId == null) {
			qrcTrnServiceRequestsImpl.setProcessId(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setProcessId(ProcessId);
		}

		if (Source == null) {
			qrcTrnServiceRequestsImpl.setSource(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setSource(Source);
		}

		if (Channel == null) {
			qrcTrnServiceRequestsImpl.setChannel(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setChannel(Channel);
		}

		if (Priority == null) {
			qrcTrnServiceRequestsImpl.setPriority(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setPriority(Priority);
		}

		if (PolicyNo == null) {
			qrcTrnServiceRequestsImpl.setPolicyNo(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setPolicyNo(PolicyNo);
		}

		if (CaseDetails == null) {
			qrcTrnServiceRequestsImpl.setCaseDetails(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setCaseDetails(CaseDetails);
		}

		if (IsManual == null) {
			qrcTrnServiceRequestsImpl.setIsManual(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setIsManual(IsManual);
		}

		if (IsLAUpdated == null) {
			qrcTrnServiceRequestsImpl.setIsLAUpdated(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setIsLAUpdated(IsLAUpdated);
		}

		if (Comments == null) {
			qrcTrnServiceRequestsImpl.setComments(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setComments(Comments);
		}

		if (IsSignVerified == null) {
			qrcTrnServiceRequestsImpl.setIsSignVerified(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setIsSignVerified(IsSignVerified);
		}

		qrcTrnServiceRequestsImpl.setRequestId(RequestId);
		qrcTrnServiceRequestsImpl.setAssignedTo(AssignedTo);
		qrcTrnServiceRequestsImpl.setCreatedContactId(CreatedContactId);
		qrcTrnServiceRequestsImpl.setHistoryId(HistoryId);
		qrcTrnServiceRequestsImpl.setAddressTypeId(AddressTypeId);
		qrcTrnServiceRequestsImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			qrcTrnServiceRequestsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			qrcTrnServiceRequestsImpl.setCreatedDate(null);
		}
		else {
			qrcTrnServiceRequestsImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			qrcTrnServiceRequestsImpl.setModifiedDate(null);
		}
		else {
			qrcTrnServiceRequestsImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			qrcTrnServiceRequestsImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			qrcTrnServiceRequestsImpl.setModifiedBy(ModifiedBy);
		}

		qrcTrnServiceRequestsImpl.resetOriginalValues();

		return qrcTrnServiceRequestsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ServiceRequestId = objectInput.readInt();
		ContactId = objectInput.readInt();
		SrId = objectInput.readUTF();
		ProcessId = objectInput.readUTF();
		Source = objectInput.readUTF();
		Channel = objectInput.readUTF();
		Priority = objectInput.readUTF();
		PolicyNo = objectInput.readUTF();
		CaseDetails = objectInput.readUTF();
		IsManual = objectInput.readUTF();
		IsLAUpdated = objectInput.readUTF();
		Comments = objectInput.readUTF();
		IsSignVerified = objectInput.readUTF();
		RequestId = objectInput.readInt();
		AssignedTo = objectInput.readInt();
		CreatedContactId = objectInput.readInt();
		HistoryId = objectInput.readInt();
		AddressTypeId = objectInput.readInt();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ServiceRequestId);
		objectOutput.writeInt(ContactId);

		if (SrId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SrId);
		}

		if (ProcessId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProcessId);
		}

		if (Source == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Source);
		}

		if (Channel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Channel);
		}

		if (Priority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Priority);
		}

		if (PolicyNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PolicyNo);
		}

		if (CaseDetails == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CaseDetails);
		}

		if (IsManual == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsManual);
		}

		if (IsLAUpdated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsLAUpdated);
		}

		if (Comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Comments);
		}

		if (IsSignVerified == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsSignVerified);
		}

		objectOutput.writeInt(RequestId);
		objectOutput.writeInt(AssignedTo);
		objectOutput.writeInt(CreatedContactId);
		objectOutput.writeInt(HistoryId);
		objectOutput.writeInt(AddressTypeId);
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

	public int ServiceRequestId;
	public int ContactId;
	public String SrId;
	public String ProcessId;
	public String Source;
	public String Channel;
	public String Priority;
	public String PolicyNo;
	public String CaseDetails;
	public String IsManual;
	public String IsLAUpdated;
	public String Comments;
	public String IsSignVerified;
	public int RequestId;
	public int AssignedTo;
	public int CreatedContactId;
	public int HistoryId;
	public int AddressTypeId;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
}