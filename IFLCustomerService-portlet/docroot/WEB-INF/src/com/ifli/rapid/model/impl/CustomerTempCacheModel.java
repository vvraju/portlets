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

import com.ifli.rapid.model.CustomerTemp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CustomerTemp in entity cache.
 *
 * @author Satya Kola
 * @see CustomerTemp
 * @generated
 */
public class CustomerTempCacheModel implements CacheModel<CustomerTemp>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{CUSTOMER_ID=");
		sb.append(CUSTOMER_ID);
		sb.append(", CUSTOMER_SALUTATION=");
		sb.append(CUSTOMER_SALUTATION);
		sb.append(", CUSTOMER_FIRST_NAME=");
		sb.append(CUSTOMER_FIRST_NAME);
		sb.append(", CUSTOMER_LAST_NAME=");
		sb.append(CUSTOMER_LAST_NAME);
		sb.append(", CUSTOMER_MIDDLE_NAME=");
		sb.append(CUSTOMER_MIDDLE_NAME);
		sb.append(", CUSTOMER_DATE_OF_BIRTH=");
		sb.append(CUSTOMER_DATE_OF_BIRTH);
		sb.append(", CUSTOMER_EMAIL_ADDR=");
		sb.append(CUSTOMER_EMAIL_ADDR);
		sb.append(", PRIMARY_ADDRESS_LINE_1=");
		sb.append(PRIMARY_ADDRESS_LINE_1);
		sb.append(", PRIMARY_ADDRESS_LINE_2=");
		sb.append(PRIMARY_ADDRESS_LINE_2);
		sb.append(", PRIMARY_ADDRESS_LINE_3=");
		sb.append(PRIMARY_ADDRESS_LINE_3);
		sb.append(", PRIMARY_ADDRESS_CITY=");
		sb.append(PRIMARY_ADDRESS_CITY);
		sb.append(", PRIMARY_ADDRESS_STATE=");
		sb.append(PRIMARY_ADDRESS_STATE);
		sb.append(", PIMARY_ADDRESS_PINCODE=");
		sb.append(PIMARY_ADDRESS_PINCODE);
		sb.append(", PHONE_NUMBER_1=");
		sb.append(PHONE_NUMBER_1);
		sb.append(", PHONE_NUMBER_2=");
		sb.append(PHONE_NUMBER_2);
		sb.append(", PHONE_NUMBER_3=");
		sb.append(PHONE_NUMBER_3);
		sb.append(", LOGIN_NAME=");
		sb.append(LOGIN_NAME);
		sb.append(", GENDER=");
		sb.append(GENDER);
		sb.append(", MARITAL_STATUS=");
		sb.append(MARITAL_STATUS);
		sb.append(", COUNTRY=");
		sb.append(COUNTRY);
		sb.append(", PRIMARY_ADDRESS_STATE_ID=");
		sb.append(PRIMARY_ADDRESS_STATE_ID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerTemp toEntityModel() {
		CustomerTempImpl customerTempImpl = new CustomerTempImpl();

		if (CUSTOMER_ID == null) {
			customerTempImpl.setCUSTOMER_ID(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_ID(CUSTOMER_ID);
		}

		if (CUSTOMER_SALUTATION == null) {
			customerTempImpl.setCUSTOMER_SALUTATION(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
		}

		if (CUSTOMER_FIRST_NAME == null) {
			customerTempImpl.setCUSTOMER_FIRST_NAME(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
		}

		if (CUSTOMER_LAST_NAME == null) {
			customerTempImpl.setCUSTOMER_LAST_NAME(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
		}

		if (CUSTOMER_MIDDLE_NAME == null) {
			customerTempImpl.setCUSTOMER_MIDDLE_NAME(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
		}

		if (CUSTOMER_DATE_OF_BIRTH == null) {
			customerTempImpl.setCUSTOMER_DATE_OF_BIRTH(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
		}

		if (CUSTOMER_EMAIL_ADDR == null) {
			customerTempImpl.setCUSTOMER_EMAIL_ADDR(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
		}

		if (PRIMARY_ADDRESS_LINE_1 == null) {
			customerTempImpl.setPRIMARY_ADDRESS_LINE_1(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
		}

		if (PRIMARY_ADDRESS_LINE_2 == null) {
			customerTempImpl.setPRIMARY_ADDRESS_LINE_2(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
		}

		if (PRIMARY_ADDRESS_LINE_3 == null) {
			customerTempImpl.setPRIMARY_ADDRESS_LINE_3(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
		}

		if (PRIMARY_ADDRESS_CITY == null) {
			customerTempImpl.setPRIMARY_ADDRESS_CITY(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
		}

		if (PRIMARY_ADDRESS_STATE == null) {
			customerTempImpl.setPRIMARY_ADDRESS_STATE(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
		}

		customerTempImpl.setPIMARY_ADDRESS_PINCODE(PIMARY_ADDRESS_PINCODE);

		if (PHONE_NUMBER_1 == null) {
			customerTempImpl.setPHONE_NUMBER_1(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPHONE_NUMBER_1(PHONE_NUMBER_1);
		}

		if (PHONE_NUMBER_2 == null) {
			customerTempImpl.setPHONE_NUMBER_2(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPHONE_NUMBER_2(PHONE_NUMBER_2);
		}

		if (PHONE_NUMBER_3 == null) {
			customerTempImpl.setPHONE_NUMBER_3(StringPool.BLANK);
		}
		else {
			customerTempImpl.setPHONE_NUMBER_3(PHONE_NUMBER_3);
		}

		if (LOGIN_NAME == null) {
			customerTempImpl.setLOGIN_NAME(StringPool.BLANK);
		}
		else {
			customerTempImpl.setLOGIN_NAME(LOGIN_NAME);
		}

		if (GENDER == null) {
			customerTempImpl.setGENDER(StringPool.BLANK);
		}
		else {
			customerTempImpl.setGENDER(GENDER);
		}

		if (MARITAL_STATUS == null) {
			customerTempImpl.setMARITAL_STATUS(StringPool.BLANK);
		}
		else {
			customerTempImpl.setMARITAL_STATUS(MARITAL_STATUS);
		}

		if (COUNTRY == null) {
			customerTempImpl.setCOUNTRY(StringPool.BLANK);
		}
		else {
			customerTempImpl.setCOUNTRY(COUNTRY);
		}

		customerTempImpl.setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);

		customerTempImpl.resetOriginalValues();

		return customerTempImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CUSTOMER_ID = objectInput.readUTF();
		CUSTOMER_SALUTATION = objectInput.readUTF();
		CUSTOMER_FIRST_NAME = objectInput.readUTF();
		CUSTOMER_LAST_NAME = objectInput.readUTF();
		CUSTOMER_MIDDLE_NAME = objectInput.readUTF();
		CUSTOMER_DATE_OF_BIRTH = objectInput.readUTF();
		CUSTOMER_EMAIL_ADDR = objectInput.readUTF();
		PRIMARY_ADDRESS_LINE_1 = objectInput.readUTF();
		PRIMARY_ADDRESS_LINE_2 = objectInput.readUTF();
		PRIMARY_ADDRESS_LINE_3 = objectInput.readUTF();
		PRIMARY_ADDRESS_CITY = objectInput.readUTF();
		PRIMARY_ADDRESS_STATE = objectInput.readUTF();
		PIMARY_ADDRESS_PINCODE = objectInput.readInt();
		PHONE_NUMBER_1 = objectInput.readUTF();
		PHONE_NUMBER_2 = objectInput.readUTF();
		PHONE_NUMBER_3 = objectInput.readUTF();
		LOGIN_NAME = objectInput.readUTF();
		GENDER = objectInput.readUTF();
		MARITAL_STATUS = objectInput.readUTF();
		COUNTRY = objectInput.readUTF();
		PRIMARY_ADDRESS_STATE_ID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (CUSTOMER_ID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_ID);
		}

		if (CUSTOMER_SALUTATION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_SALUTATION);
		}

		if (CUSTOMER_FIRST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_FIRST_NAME);
		}

		if (CUSTOMER_LAST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_LAST_NAME);
		}

		if (CUSTOMER_MIDDLE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_MIDDLE_NAME);
		}

		if (CUSTOMER_DATE_OF_BIRTH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_DATE_OF_BIRTH);
		}

		if (CUSTOMER_EMAIL_ADDR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CUSTOMER_EMAIL_ADDR);
		}

		if (PRIMARY_ADDRESS_LINE_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_ADDRESS_LINE_1);
		}

		if (PRIMARY_ADDRESS_LINE_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_ADDRESS_LINE_2);
		}

		if (PRIMARY_ADDRESS_LINE_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_ADDRESS_LINE_3);
		}

		if (PRIMARY_ADDRESS_CITY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_ADDRESS_CITY);
		}

		if (PRIMARY_ADDRESS_STATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_ADDRESS_STATE);
		}

		objectOutput.writeInt(PIMARY_ADDRESS_PINCODE);

		if (PHONE_NUMBER_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PHONE_NUMBER_1);
		}

		if (PHONE_NUMBER_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PHONE_NUMBER_2);
		}

		if (PHONE_NUMBER_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PHONE_NUMBER_3);
		}

		if (LOGIN_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LOGIN_NAME);
		}

		if (GENDER == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GENDER);
		}

		if (MARITAL_STATUS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MARITAL_STATUS);
		}

		if (COUNTRY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COUNTRY);
		}

		objectOutput.writeInt(PRIMARY_ADDRESS_STATE_ID);
	}

	public String CUSTOMER_ID;
	public String CUSTOMER_SALUTATION;
	public String CUSTOMER_FIRST_NAME;
	public String CUSTOMER_LAST_NAME;
	public String CUSTOMER_MIDDLE_NAME;
	public String CUSTOMER_DATE_OF_BIRTH;
	public String CUSTOMER_EMAIL_ADDR;
	public String PRIMARY_ADDRESS_LINE_1;
	public String PRIMARY_ADDRESS_LINE_2;
	public String PRIMARY_ADDRESS_LINE_3;
	public String PRIMARY_ADDRESS_CITY;
	public String PRIMARY_ADDRESS_STATE;
	public int PIMARY_ADDRESS_PINCODE;
	public String PHONE_NUMBER_1;
	public String PHONE_NUMBER_2;
	public String PHONE_NUMBER_3;
	public String LOGIN_NAME;
	public String GENDER;
	public String MARITAL_STATUS;
	public String COUNTRY;
	public int PRIMARY_ADDRESS_STATE_ID;
}