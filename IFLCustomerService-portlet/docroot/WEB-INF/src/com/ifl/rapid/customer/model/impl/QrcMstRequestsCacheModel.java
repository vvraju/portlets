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

import com.ifl.rapid.customer.model.QrcMstRequests;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QrcMstRequests in entity cache.
 *
 * @author Satya Kola
 * @see QrcMstRequests
 * @generated
 */
public class QrcMstRequestsCacheModel implements CacheModel<QrcMstRequests>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{RequestId=");
		sb.append(RequestId);
		sb.append(", Category=");
		sb.append(Category);
		sb.append(", CallType=");
		sb.append(CallType);
		sb.append(", CallSubType=");
		sb.append(CallSubType);
		sb.append(", Keyword=");
		sb.append(Keyword);
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
	public QrcMstRequests toEntityModel() {
		QrcMstRequestsImpl qrcMstRequestsImpl = new QrcMstRequestsImpl();

		qrcMstRequestsImpl.setRequestId(RequestId);

		if (Category == null) {
			qrcMstRequestsImpl.setCategory(StringPool.BLANK);
		}
		else {
			qrcMstRequestsImpl.setCategory(Category);
		}

		if (CallType == null) {
			qrcMstRequestsImpl.setCallType(StringPool.BLANK);
		}
		else {
			qrcMstRequestsImpl.setCallType(CallType);
		}

		if (CallSubType == null) {
			qrcMstRequestsImpl.setCallSubType(StringPool.BLANK);
		}
		else {
			qrcMstRequestsImpl.setCallSubType(CallSubType);
		}

		if (Keyword == null) {
			qrcMstRequestsImpl.setKeyword(StringPool.BLANK);
		}
		else {
			qrcMstRequestsImpl.setKeyword(Keyword);
		}

		qrcMstRequestsImpl.setIsActive(IsActive);

		if (CreatedBy == null) {
			qrcMstRequestsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			qrcMstRequestsImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			qrcMstRequestsImpl.setCreatedDate(null);
		}
		else {
			qrcMstRequestsImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			qrcMstRequestsImpl.setModifiedDate(null);
		}
		else {
			qrcMstRequestsImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			qrcMstRequestsImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			qrcMstRequestsImpl.setModifiedBy(ModifiedBy);
		}

		qrcMstRequestsImpl.resetOriginalValues();

		return qrcMstRequestsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		RequestId = objectInput.readInt();
		Category = objectInput.readUTF();
		CallType = objectInput.readUTF();
		CallSubType = objectInput.readUTF();
		Keyword = objectInput.readUTF();
		IsActive = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(RequestId);

		if (Category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Category);
		}

		if (CallType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CallType);
		}

		if (CallSubType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CallSubType);
		}

		if (Keyword == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Keyword);
		}

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

	public int RequestId;
	public String Category;
	public String CallType;
	public String CallSubType;
	public String Keyword;
	public int IsActive;
	public String CreatedBy;
	public long CreatedDate;
	public long ModifiedDate;
	public String ModifiedBy;
}