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

import com.ifli.rapid.model.RenewalDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RenewalDetails in entity cache.
 *
 * @author Satya Kola
 * @see RenewalDetails
 * @generated
 */
public class RenewalDetailsCacheModel implements CacheModel<RenewalDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{POLICY_ID=");
		sb.append(POLICY_ID);
		sb.append(", EMAIL_ID=");
		sb.append(EMAIL_ID);
		sb.append(", MOBILE_NUMBER=");
		sb.append(MOBILE_NUMBER);
		sb.append(", POLICY_STATUS=");
		sb.append(POLICY_STATUS);
		sb.append(", PRODUCT_NAME=");
		sb.append(PRODUCT_NAME);
		sb.append(", DATE=");
		sb.append(DATE);
		sb.append(", POLICY_EXPIRY_DATE=");
		sb.append(POLICY_EXPIRY_DATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RenewalDetails toEntityModel() {
		RenewalDetailsImpl renewalDetailsImpl = new RenewalDetailsImpl();

		renewalDetailsImpl.setPOLICY_ID(POLICY_ID);

		if (EMAIL_ID == null) {
			renewalDetailsImpl.setEMAIL_ID(StringPool.BLANK);
		}
		else {
			renewalDetailsImpl.setEMAIL_ID(EMAIL_ID);
		}

		if (MOBILE_NUMBER == null) {
			renewalDetailsImpl.setMOBILE_NUMBER(StringPool.BLANK);
		}
		else {
			renewalDetailsImpl.setMOBILE_NUMBER(MOBILE_NUMBER);
		}

		if (POLICY_STATUS == null) {
			renewalDetailsImpl.setPOLICY_STATUS(StringPool.BLANK);
		}
		else {
			renewalDetailsImpl.setPOLICY_STATUS(POLICY_STATUS);
		}

		if (PRODUCT_NAME == null) {
			renewalDetailsImpl.setPRODUCT_NAME(StringPool.BLANK);
		}
		else {
			renewalDetailsImpl.setPRODUCT_NAME(PRODUCT_NAME);
		}

		if (DATE == Long.MIN_VALUE) {
			renewalDetailsImpl.setDATE(null);
		}
		else {
			renewalDetailsImpl.setDATE(new Date(DATE));
		}

		if (POLICY_EXPIRY_DATE == Long.MIN_VALUE) {
			renewalDetailsImpl.setPOLICY_EXPIRY_DATE(null);
		}
		else {
			renewalDetailsImpl.setPOLICY_EXPIRY_DATE(new Date(
					POLICY_EXPIRY_DATE));
		}

		renewalDetailsImpl.resetOriginalValues();

		return renewalDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		POLICY_ID = objectInput.readLong();
		EMAIL_ID = objectInput.readUTF();
		MOBILE_NUMBER = objectInput.readUTF();
		POLICY_STATUS = objectInput.readUTF();
		PRODUCT_NAME = objectInput.readUTF();
		DATE = objectInput.readLong();
		POLICY_EXPIRY_DATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(POLICY_ID);

		if (EMAIL_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EMAIL_ID);
		}

		if (MOBILE_NUMBER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MOBILE_NUMBER);
		}

		if (POLICY_STATUS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(POLICY_STATUS);
		}

		if (PRODUCT_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRODUCT_NAME);
		}

		objectOutput.writeLong(DATE);
		objectOutput.writeLong(POLICY_EXPIRY_DATE);
	}

	public long POLICY_ID;
	public String EMAIL_ID;
	public String MOBILE_NUMBER;
	public String POLICY_STATUS;
	public String PRODUCT_NAME;
	public long DATE;
	public long POLICY_EXPIRY_DATE;
}