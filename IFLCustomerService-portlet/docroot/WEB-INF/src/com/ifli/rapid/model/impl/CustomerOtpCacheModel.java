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

import com.ifli.rapid.model.CustomerOtp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomerOtp in entity cache.
 *
 * @author Satya Kola
 * @see CustomerOtp
 * @generated
 */
public class CustomerOtpCacheModel implements CacheModel<CustomerOtp>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", EMAIL_OTP=");
		sb.append(EMAIL_OTP);
		sb.append(", PHONE_OTP=");
		sb.append(PHONE_OTP);
		sb.append(", STATUS=");
		sb.append(STATUS);
		sb.append(", ADDED_DATE=");
		sb.append(ADDED_DATE);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerOtp toEntityModel() {
		CustomerOtpImpl customerOtpImpl = new CustomerOtpImpl();

		customerOtpImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (EMAIL_OTP == null) {
			customerOtpImpl.setEMAIL_OTP(StringPool.BLANK);
		}
		else {
			customerOtpImpl.setEMAIL_OTP(EMAIL_OTP);
		}

		if (PHONE_OTP == null) {
			customerOtpImpl.setPHONE_OTP(StringPool.BLANK);
		}
		else {
			customerOtpImpl.setPHONE_OTP(PHONE_OTP);
		}

		if (STATUS == null) {
			customerOtpImpl.setSTATUS(StringPool.BLANK);
		}
		else {
			customerOtpImpl.setSTATUS(STATUS);
		}

		if (ADDED_DATE == Long.MIN_VALUE) {
			customerOtpImpl.setADDED_DATE(null);
		}
		else {
			customerOtpImpl.setADDED_DATE(new Date(ADDED_DATE));
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			customerOtpImpl.setUPDATED_DATE(null);
		}
		else {
			customerOtpImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		customerOtpImpl.resetOriginalValues();

		return customerOtpImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CUSTOMER_ID = objectInput.readInt();
		EMAIL_OTP = objectInput.readUTF();
		PHONE_OTP = objectInput.readUTF();
		STATUS = objectInput.readUTF();
		ADDED_DATE = objectInput.readLong();
		UPDATED_DATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(CUSTOMER_ID);

		if (EMAIL_OTP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EMAIL_OTP);
		}

		if (PHONE_OTP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PHONE_OTP);
		}

		if (STATUS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATUS);
		}

		objectOutput.writeLong(ADDED_DATE);
		objectOutput.writeLong(UPDATED_DATE);
	}

	public int CUSTOMER_ID;
	public String EMAIL_OTP;
	public String PHONE_OTP;
	public String STATUS;
	public long ADDED_DATE;
	public long UPDATED_DATE;
}