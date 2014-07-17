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

import com.ifli.rapid.model.TempCustomer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TempCustomer in entity cache.
 *
 * @author Satya Kola
 * @see TempCustomer
 * @generated
 */
public class TempCustomerCacheModel implements CacheModel<TempCustomer>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

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
		sb.append(", QRC_ASR_ID=");
		sb.append(QRC_ASR_ID);
		sb.append(", PANCARD=");
		sb.append(PANCARD);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempCustomer toEntityModel() {
		TempCustomerImpl tempCustomerImpl = new TempCustomerImpl();

		tempCustomerImpl.setCUSTOMER_ID(CUSTOMER_ID);

		if (CUSTOMER_SALUTATION == null) {
			tempCustomerImpl.setCUSTOMER_SALUTATION(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
		}

		if (CUSTOMER_FIRST_NAME == null) {
			tempCustomerImpl.setCUSTOMER_FIRST_NAME(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
		}

		if (CUSTOMER_LAST_NAME == null) {
			tempCustomerImpl.setCUSTOMER_LAST_NAME(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
		}

		if (CUSTOMER_MIDDLE_NAME == null) {
			tempCustomerImpl.setCUSTOMER_MIDDLE_NAME(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
		}

		if (CUSTOMER_DATE_OF_BIRTH == null) {
			tempCustomerImpl.setCUSTOMER_DATE_OF_BIRTH(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
		}

		if (CUSTOMER_EMAIL_ADDR == null) {
			tempCustomerImpl.setCUSTOMER_EMAIL_ADDR(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
		}

		if (OFFICE_NAME == null) {
			tempCustomerImpl.setOFFICE_NAME(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setOFFICE_NAME(OFFICE_NAME);
		}

		if (DESIGNATION == null) {
			tempCustomerImpl.setDESIGNATION(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setDESIGNATION(DESIGNATION);
		}

		if (DEPARTMENT == null) {
			tempCustomerImpl.setDEPARTMENT(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setDEPARTMENT(DEPARTMENT);
		}

		if (PRIMARY_ADDRESS_LINE_1 == null) {
			tempCustomerImpl.setPRIMARY_ADDRESS_LINE_1(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
		}

		if (PRIMARY_ADDRESS_LINE_2 == null) {
			tempCustomerImpl.setPRIMARY_ADDRESS_LINE_2(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
		}

		if (PRIMARY_ADDRESS_LINE_3 == null) {
			tempCustomerImpl.setPRIMARY_ADDRESS_LINE_3(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
		}

		if (PRIMARY_ADDRESS_CITY == null) {
			tempCustomerImpl.setPRIMARY_ADDRESS_CITY(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
		}

		if (PRIMARY_ADDRESS_STATE == null) {
			tempCustomerImpl.setPRIMARY_ADDRESS_STATE(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
		}

		if (PRIMARY_ADDRESS_PINCODE == null) {
			tempCustomerImpl.setPRIMARY_ADDRESS_PINCODE(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPRIMARY_ADDRESS_PINCODE(PRIMARY_ADDRESS_PINCODE);
		}

		if (PHONE_NUMBER_1 == null) {
			tempCustomerImpl.setPHONE_NUMBER_1(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPHONE_NUMBER_1(PHONE_NUMBER_1);
		}

		if (PHONE_NUMBER_2 == null) {
			tempCustomerImpl.setPHONE_NUMBER_2(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPHONE_NUMBER_2(PHONE_NUMBER_2);
		}

		if (PHONE_NUMBER_3 == null) {
			tempCustomerImpl.setPHONE_NUMBER_3(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPHONE_NUMBER_3(PHONE_NUMBER_3);
		}

		if (LOGIN_NAME == null) {
			tempCustomerImpl.setLOGIN_NAME(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setLOGIN_NAME(LOGIN_NAME);
		}

		if (GENDER == null) {
			tempCustomerImpl.setGENDER(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setGENDER(GENDER);
		}

		if (MARITAL_STATUS == null) {
			tempCustomerImpl.setMARITAL_STATUS(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setMARITAL_STATUS(MARITAL_STATUS);
		}

		if (COUNTRY == null) {
			tempCustomerImpl.setCOUNTRY(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setCOUNTRY(COUNTRY);
		}

		tempCustomerImpl.setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);
		tempCustomerImpl.setPRIMARY_ADDRESS_CITY_ID(PRIMARY_ADDRESS_CITY_ID);
		tempCustomerImpl.setQRC_ASR_ID(QRC_ASR_ID);

		if (PANCARD == null) {
			tempCustomerImpl.setPANCARD(StringPool.BLANK);
		}
		else {
			tempCustomerImpl.setPANCARD(PANCARD);
		}

		tempCustomerImpl.resetOriginalValues();

		return tempCustomerImpl;
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
		QRC_ASR_ID = objectInput.readInt();
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
		objectOutput.writeInt(QRC_ASR_ID);

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
	public int QRC_ASR_ID;
	public String PANCARD;
}