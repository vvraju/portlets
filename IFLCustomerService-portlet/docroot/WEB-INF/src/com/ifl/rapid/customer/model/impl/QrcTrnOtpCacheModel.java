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

import com.ifl.rapid.customer.model.QrcTrnOtp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QrcTrnOtp in entity cache.
 *
 * @author Satya Kola
 * @see QrcTrnOtp
 * @generated
 */
public class QrcTrnOtpCacheModel implements CacheModel<QrcTrnOtp>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{Otp_Id=");
		sb.append(Otp_Id);
		sb.append(", Otp=");
		sb.append(Otp);
		sb.append(", ContactId=");
		sb.append(ContactId);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", IsActive=");
		sb.append(IsActive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QrcTrnOtp toEntityModel() {
		QrcTrnOtpImpl qrcTrnOtpImpl = new QrcTrnOtpImpl();

		qrcTrnOtpImpl.setOtp_Id(Otp_Id);

		if (Otp == null) {
			qrcTrnOtpImpl.setOtp(StringPool.BLANK);
		}
		else {
			qrcTrnOtpImpl.setOtp(Otp);
		}

		qrcTrnOtpImpl.setContactId(ContactId);

		if (CreatedBy == null) {
			qrcTrnOtpImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			qrcTrnOtpImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			qrcTrnOtpImpl.setCreatedDate(null);
		}
		else {
			qrcTrnOtpImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			qrcTrnOtpImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			qrcTrnOtpImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			qrcTrnOtpImpl.setModifiedDate(null);
		}
		else {
			qrcTrnOtpImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (IsActive == null) {
			qrcTrnOtpImpl.setIsActive(StringPool.BLANK);
		}
		else {
			qrcTrnOtpImpl.setIsActive(IsActive);
		}

		qrcTrnOtpImpl.resetOriginalValues();

		return qrcTrnOtpImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Otp_Id = objectInput.readInt();
		Otp = objectInput.readUTF();
		ContactId = objectInput.readInt();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		IsActive = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(Otp_Id);

		if (Otp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Otp);
		}

		objectOutput.writeInt(ContactId);

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

		if (IsActive == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IsActive);
		}
	}

	public int Otp_Id;
	public String Otp;
	public int ContactId;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String IsActive;
}