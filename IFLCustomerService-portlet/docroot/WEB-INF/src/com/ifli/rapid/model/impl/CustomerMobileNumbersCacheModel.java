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

import com.ifli.rapid.model.CustomerMobileNumbers;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomerMobileNumbers in entity cache.
 *
 * @author Satya Kola
 * @see CustomerMobileNumbers
 * @generated
 */
public class CustomerMobileNumbersCacheModel implements CacheModel<CustomerMobileNumbers>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ID=");
		sb.append(ID);
		sb.append(", CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", MOBILE_NUMBER=");
		sb.append(MOBILE_NUMBER);
		sb.append(", INSERTED_BY=");
		sb.append(INSERTED_BY);
		sb.append(", INSERTED_DATE=");
		sb.append(INSERTED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerMobileNumbers toEntityModel() {
		CustomerMobileNumbersImpl customerMobileNumbersImpl = new CustomerMobileNumbersImpl();

		customerMobileNumbersImpl.setID(ID);
		customerMobileNumbersImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (MOBILE_NUMBER == null) {
			customerMobileNumbersImpl.setMOBILE_NUMBER(StringPool.BLANK);
		}
		else {
			customerMobileNumbersImpl.setMOBILE_NUMBER(MOBILE_NUMBER);
		}

		if (INSERTED_BY == null) {
			customerMobileNumbersImpl.setINSERTED_BY(StringPool.BLANK);
		}
		else {
			customerMobileNumbersImpl.setINSERTED_BY(INSERTED_BY);
		}

		if (INSERTED_DATE == Long.MIN_VALUE) {
			customerMobileNumbersImpl.setINSERTED_DATE(null);
		}
		else {
			customerMobileNumbersImpl.setINSERTED_DATE(new Date(INSERTED_DATE));
		}

		if (UPDATED_BY == null) {
			customerMobileNumbersImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			customerMobileNumbersImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			customerMobileNumbersImpl.setUPDATED_DATE(null);
		}
		else {
			customerMobileNumbersImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		customerMobileNumbersImpl.resetOriginalValues();

		return customerMobileNumbersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ID = objectInput.readInt();
		CUSTOMER_ID = objectInput.readInt();
		MOBILE_NUMBER = objectInput.readUTF();
		INSERTED_BY = objectInput.readUTF();
		INSERTED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(ID);
		objectOutput.writeInt(CUSTOMER_ID);

		if (MOBILE_NUMBER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MOBILE_NUMBER);
		}

		if (INSERTED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INSERTED_BY);
		}

		objectOutput.writeLong(INSERTED_DATE);

		if (UPDATED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UPDATED_BY);
		}

		objectOutput.writeLong(UPDATED_DATE);
	}

	public int ID;
	public int CUSTOMER_ID;
	public String MOBILE_NUMBER;
	public String INSERTED_BY;
	public long INSERTED_DATE;
	public String UPDATED_BY;
	public long UPDATED_DATE;
}