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

import com.ifli.rapid.model.Customer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author Satya Kola
 * @see Customer
 * @generated
 */
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

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
		sb.append(", OFFICE_NAME=");
		sb.append(OFFICE_NAME);
		sb.append(", DESIGNATION=");
		sb.append(DESIGNATION);
		sb.append(", DEPARTMENT=");
		sb.append(DEPARTMENT);
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
		sb.append(", PRIMARY_ADDRESS_PINCODE=");
		sb.append(PRIMARY_ADDRESS_PINCODE);
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
		sb.append(", PRIMARY_ADDRESS_CITY_ID=");
		sb.append(PRIMARY_ADDRESS_CITY_ID);
		sb.append(", ADDED_BY=");
		sb.append(ADDED_BY);
		sb.append(", ADDED_DATE=");
		sb.append(ADDED_DATE);
		sb.append(", UPDATED_BY=");
		sb.append(UPDATED_BY);
		sb.append(", UPDATED_DATE=");
		sb.append(UPDATED_DATE);
		sb.append(", PANCARD=");
		sb.append(PANCARD);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (CUSTOMER_SALUTATION == null) {
			customerImpl.setCUSTOMER_SALUTATION(StringPool.BLANK);
		}
		else {
			customerImpl.setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
		}

		if (CUSTOMER_FIRST_NAME == null) {
			customerImpl.setCUSTOMER_FIRST_NAME(StringPool.BLANK);
		}
		else {
			customerImpl.setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
		}

		if (CUSTOMER_LAST_NAME == null) {
			customerImpl.setCUSTOMER_LAST_NAME(StringPool.BLANK);
		}
		else {
			customerImpl.setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
		}

		if (CUSTOMER_MIDDLE_NAME == null) {
			customerImpl.setCUSTOMER_MIDDLE_NAME(StringPool.BLANK);
		}
		else {
			customerImpl.setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
		}

		if (CUSTOMER_DATE_OF_BIRTH == null) {
			customerImpl.setCUSTOMER_DATE_OF_BIRTH(StringPool.BLANK);
		}
		else {
			customerImpl.setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
		}

		if (CUSTOMER_EMAIL_ADDR == null) {
			customerImpl.setCUSTOMER_EMAIL_ADDR(StringPool.BLANK);
		}
		else {
			customerImpl.setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
		}

		if (OFFICE_NAME == null) {
			customerImpl.setOFFICE_NAME(StringPool.BLANK);
		}
		else {
			customerImpl.setOFFICE_NAME(OFFICE_NAME);
		}

		if (DESIGNATION == null) {
			customerImpl.setDESIGNATION(StringPool.BLANK);
		}
		else {
			customerImpl.setDESIGNATION(DESIGNATION);
		}

		if (DEPARTMENT == null) {
			customerImpl.setDEPARTMENT(StringPool.BLANK);
		}
		else {
			customerImpl.setDEPARTMENT(DEPARTMENT);
		}

		if (PRIMARY_ADDRESS_LINE_1 == null) {
			customerImpl.setPRIMARY_ADDRESS_LINE_1(StringPool.BLANK);
		}
		else {
			customerImpl.setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
		}

		if (PRIMARY_ADDRESS_LINE_2 == null) {
			customerImpl.setPRIMARY_ADDRESS_LINE_2(StringPool.BLANK);
		}
		else {
			customerImpl.setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
		}

		if (PRIMARY_ADDRESS_LINE_3 == null) {
			customerImpl.setPRIMARY_ADDRESS_LINE_3(StringPool.BLANK);
		}
		else {
			customerImpl.setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
		}

		if (PRIMARY_ADDRESS_CITY == null) {
			customerImpl.setPRIMARY_ADDRESS_CITY(StringPool.BLANK);
		}
		else {
			customerImpl.setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
		}

		if (PRIMARY_ADDRESS_STATE == null) {
			customerImpl.setPRIMARY_ADDRESS_STATE(StringPool.BLANK);
		}
		else {
			customerImpl.setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
		}

		if (PRIMARY_ADDRESS_PINCODE == null) {
			customerImpl.setPRIMARY_ADDRESS_PINCODE(StringPool.BLANK);
		}
		else {
			customerImpl.setPRIMARY_ADDRESS_PINCODE(PRIMARY_ADDRESS_PINCODE);
		}

		if (PHONE_NUMBER_1 == null) {
			customerImpl.setPHONE_NUMBER_1(StringPool.BLANK);
		}
		else {
			customerImpl.setPHONE_NUMBER_1(PHONE_NUMBER_1);
		}

		if (PHONE_NUMBER_2 == null) {
			customerImpl.setPHONE_NUMBER_2(StringPool.BLANK);
		}
		else {
			customerImpl.setPHONE_NUMBER_2(PHONE_NUMBER_2);
		}

		if (PHONE_NUMBER_3 == null) {
			customerImpl.setPHONE_NUMBER_3(StringPool.BLANK);
		}
		else {
			customerImpl.setPHONE_NUMBER_3(PHONE_NUMBER_3);
		}

		if (LOGIN_NAME == null) {
			customerImpl.setLOGIN_NAME(StringPool.BLANK);
		}
		else {
			customerImpl.setLOGIN_NAME(LOGIN_NAME);
		}

		if (GENDER == null) {
			customerImpl.setGENDER(StringPool.BLANK);
		}
		else {
			customerImpl.setGENDER(GENDER);
		}

		if (MARITAL_STATUS == null) {
			customerImpl.setMARITAL_STATUS(StringPool.BLANK);
		}
		else {
			customerImpl.setMARITAL_STATUS(MARITAL_STATUS);
		}

		if (COUNTRY == null) {
			customerImpl.setCOUNTRY(StringPool.BLANK);
		}
		else {
			customerImpl.setCOUNTRY(COUNTRY);
		}

		customerImpl.setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);
		customerImpl.setPRIMARY_ADDRESS_CITY_ID(PRIMARY_ADDRESS_CITY_ID);

		if (ADDED_BY == null) {
			customerImpl.setADDED_BY(StringPool.BLANK);
		}
		else {
			customerImpl.setADDED_BY(ADDED_BY);
		}

		if (ADDED_DATE == Long.MIN_VALUE) {
			customerImpl.setADDED_DATE(null);
		}
		else {
			customerImpl.setADDED_DATE(new Date(ADDED_DATE));
		}

		if (UPDATED_BY == null) {
			customerImpl.setUPDATED_BY(StringPool.BLANK);
		}
		else {
			customerImpl.setUPDATED_BY(UPDATED_BY);
		}

		if (UPDATED_DATE == Long.MIN_VALUE) {
			customerImpl.setUPDATED_DATE(null);
		}
		else {
			customerImpl.setUPDATED_DATE(new Date(UPDATED_DATE));
		}

		if (PANCARD == null) {
			customerImpl.setPANCARD(StringPool.BLANK);
		}
		else {
			customerImpl.setPANCARD(PANCARD);
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CUSTOMER_ID = objectInput.readInt();
		CUSTOMER_SALUTATION = objectInput.readUTF();
		CUSTOMER_FIRST_NAME = objectInput.readUTF();
		CUSTOMER_LAST_NAME = objectInput.readUTF();
		CUSTOMER_MIDDLE_NAME = objectInput.readUTF();
		CUSTOMER_DATE_OF_BIRTH = objectInput.readUTF();
		CUSTOMER_EMAIL_ADDR = objectInput.readUTF();
		OFFICE_NAME = objectInput.readUTF();
		DESIGNATION = objectInput.readUTF();
		DEPARTMENT = objectInput.readUTF();
		PRIMARY_ADDRESS_LINE_1 = objectInput.readUTF();
		PRIMARY_ADDRESS_LINE_2 = objectInput.readUTF();
		PRIMARY_ADDRESS_LINE_3 = objectInput.readUTF();
		PRIMARY_ADDRESS_CITY = objectInput.readUTF();
		PRIMARY_ADDRESS_STATE = objectInput.readUTF();
		PRIMARY_ADDRESS_PINCODE = objectInput.readUTF();
		PHONE_NUMBER_1 = objectInput.readUTF();
		PHONE_NUMBER_2 = objectInput.readUTF();
		PHONE_NUMBER_3 = objectInput.readUTF();
		LOGIN_NAME = objectInput.readUTF();
		GENDER = objectInput.readUTF();
		MARITAL_STATUS = objectInput.readUTF();
		COUNTRY = objectInput.readUTF();
		PRIMARY_ADDRESS_STATE_ID = objectInput.readInt();
		PRIMARY_ADDRESS_CITY_ID = objectInput.readInt();
		ADDED_BY = objectInput.readUTF();
		ADDED_DATE = objectInput.readLong();
		UPDATED_BY = objectInput.readUTF();
		UPDATED_DATE = objectInput.readLong();
		PANCARD = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(CUSTOMER_ID);

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

		if (OFFICE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OFFICE_NAME);
		}

		if (DESIGNATION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DESIGNATION);
		}

		if (DEPARTMENT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DEPARTMENT);
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

		if (PRIMARY_ADDRESS_PINCODE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PRIMARY_ADDRESS_PINCODE);
		}

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
		objectOutput.writeInt(PRIMARY_ADDRESS_CITY_ID);

		if (ADDED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDED_BY);
		}

		objectOutput.writeLong(ADDED_DATE);

		if (UPDATED_BY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UPDATED_BY);
		}

		objectOutput.writeLong(UPDATED_DATE);

		if (PANCARD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PANCARD);
		}
	}

	public int CUSTOMER_ID;
	public String CUSTOMER_SALUTATION;
	public String CUSTOMER_FIRST_NAME;
	public String CUSTOMER_LAST_NAME;
	public String CUSTOMER_MIDDLE_NAME;
	public String CUSTOMER_DATE_OF_BIRTH;
	public String CUSTOMER_EMAIL_ADDR;
	public String OFFICE_NAME;
	public String DESIGNATION;
	public String DEPARTMENT;
	public String PRIMARY_ADDRESS_LINE_1;
	public String PRIMARY_ADDRESS_LINE_2;
	public String PRIMARY_ADDRESS_LINE_3;
	public String PRIMARY_ADDRESS_CITY;
	public String PRIMARY_ADDRESS_STATE;
	public String PRIMARY_ADDRESS_PINCODE;
	public String PHONE_NUMBER_1;
	public String PHONE_NUMBER_2;
	public String PHONE_NUMBER_3;
	public String LOGIN_NAME;
	public String GENDER;
	public String MARITAL_STATUS;
	public String COUNTRY;
	public int PRIMARY_ADDRESS_STATE_ID;
	public int PRIMARY_ADDRESS_CITY_ID;
	public String ADDED_BY;
	public long ADDED_DATE;
	public String UPDATED_BY;
	public long UPDATED_DATE;
	public String PANCARD;
}