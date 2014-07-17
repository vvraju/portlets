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

package com.ifli.rapid.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class TempCustomerSoap implements Serializable {
	public static TempCustomerSoap toSoapModel(TempCustomer model) {
		TempCustomerSoap soapModel = new TempCustomerSoap();

		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setCUSTOMER_SALUTATION(model.getCUSTOMER_SALUTATION());
		soapModel.setCUSTOMER_FIRST_NAME(model.getCUSTOMER_FIRST_NAME());
		soapModel.setCUSTOMER_LAST_NAME(model.getCUSTOMER_LAST_NAME());
		soapModel.setCUSTOMER_MIDDLE_NAME(model.getCUSTOMER_MIDDLE_NAME());
		soapModel.setCUSTOMER_DATE_OF_BIRTH(model.getCUSTOMER_DATE_OF_BIRTH());
		soapModel.setCUSTOMER_EMAIL_ADDR(model.getCUSTOMER_EMAIL_ADDR());
		soapModel.setOFFICE_NAME(model.getOFFICE_NAME());
		soapModel.setDESIGNATION(model.getDESIGNATION());
		soapModel.setDEPARTMENT(model.getDEPARTMENT());
		soapModel.setPRIMARY_ADDRESS_LINE_1(model.getPRIMARY_ADDRESS_LINE_1());
		soapModel.setPRIMARY_ADDRESS_LINE_2(model.getPRIMARY_ADDRESS_LINE_2());
		soapModel.setPRIMARY_ADDRESS_LINE_3(model.getPRIMARY_ADDRESS_LINE_3());
		soapModel.setPRIMARY_ADDRESS_CITY(model.getPRIMARY_ADDRESS_CITY());
		soapModel.setPRIMARY_ADDRESS_STATE(model.getPRIMARY_ADDRESS_STATE());
		soapModel.setPRIMARY_ADDRESS_PINCODE(model.getPRIMARY_ADDRESS_PINCODE());
		soapModel.setPHONE_NUMBER_1(model.getPHONE_NUMBER_1());
		soapModel.setPHONE_NUMBER_2(model.getPHONE_NUMBER_2());
		soapModel.setPHONE_NUMBER_3(model.getPHONE_NUMBER_3());
		soapModel.setLOGIN_NAME(model.getLOGIN_NAME());
		soapModel.setGENDER(model.getGENDER());
		soapModel.setMARITAL_STATUS(model.getMARITAL_STATUS());
		soapModel.setCOUNTRY(model.getCOUNTRY());
		soapModel.setPRIMARY_ADDRESS_STATE_ID(model.getPRIMARY_ADDRESS_STATE_ID());
		soapModel.setPRIMARY_ADDRESS_CITY_ID(model.getPRIMARY_ADDRESS_CITY_ID());
		soapModel.setQRC_ASR_ID(model.getQRC_ASR_ID());
		soapModel.setPANCARD(model.getPANCARD());

		return soapModel;
	}

	public static TempCustomerSoap[] toSoapModels(TempCustomer[] models) {
		TempCustomerSoap[] soapModels = new TempCustomerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempCustomerSoap[][] toSoapModels(TempCustomer[][] models) {
		TempCustomerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempCustomerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempCustomerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempCustomerSoap[] toSoapModels(List<TempCustomer> models) {
		List<TempCustomerSoap> soapModels = new ArrayList<TempCustomerSoap>(models.size());

		for (TempCustomer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempCustomerSoap[soapModels.size()]);
	}

	public TempCustomerSoap() {
	}

	public int getPrimaryKey() {
		return _CUSTOMER_ID;
	}

	public void setPrimaryKey(int pk) {
		setCUSTOMER_ID(pk);
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public String getCUSTOMER_SALUTATION() {
		return _CUSTOMER_SALUTATION;
	}

	public void setCUSTOMER_SALUTATION(String CUSTOMER_SALUTATION) {
		_CUSTOMER_SALUTATION = CUSTOMER_SALUTATION;
	}

	public String getCUSTOMER_FIRST_NAME() {
		return _CUSTOMER_FIRST_NAME;
	}

	public void setCUSTOMER_FIRST_NAME(String CUSTOMER_FIRST_NAME) {
		_CUSTOMER_FIRST_NAME = CUSTOMER_FIRST_NAME;
	}

	public String getCUSTOMER_LAST_NAME() {
		return _CUSTOMER_LAST_NAME;
	}

	public void setCUSTOMER_LAST_NAME(String CUSTOMER_LAST_NAME) {
		_CUSTOMER_LAST_NAME = CUSTOMER_LAST_NAME;
	}

	public String getCUSTOMER_MIDDLE_NAME() {
		return _CUSTOMER_MIDDLE_NAME;
	}

	public void setCUSTOMER_MIDDLE_NAME(String CUSTOMER_MIDDLE_NAME) {
		_CUSTOMER_MIDDLE_NAME = CUSTOMER_MIDDLE_NAME;
	}

	public String getCUSTOMER_DATE_OF_BIRTH() {
		return _CUSTOMER_DATE_OF_BIRTH;
	}

	public void setCUSTOMER_DATE_OF_BIRTH(String CUSTOMER_DATE_OF_BIRTH) {
		_CUSTOMER_DATE_OF_BIRTH = CUSTOMER_DATE_OF_BIRTH;
	}

	public String getCUSTOMER_EMAIL_ADDR() {
		return _CUSTOMER_EMAIL_ADDR;
	}

	public void setCUSTOMER_EMAIL_ADDR(String CUSTOMER_EMAIL_ADDR) {
		_CUSTOMER_EMAIL_ADDR = CUSTOMER_EMAIL_ADDR;
	}

	public String getOFFICE_NAME() {
		return _OFFICE_NAME;
	}

	public void setOFFICE_NAME(String OFFICE_NAME) {
		_OFFICE_NAME = OFFICE_NAME;
	}

	public String getDESIGNATION() {
		return _DESIGNATION;
	}

	public void setDESIGNATION(String DESIGNATION) {
		_DESIGNATION = DESIGNATION;
	}

	public String getDEPARTMENT() {
		return _DEPARTMENT;
	}

	public void setDEPARTMENT(String DEPARTMENT) {
		_DEPARTMENT = DEPARTMENT;
	}

	public String getPRIMARY_ADDRESS_LINE_1() {
		return _PRIMARY_ADDRESS_LINE_1;
	}

	public void setPRIMARY_ADDRESS_LINE_1(String PRIMARY_ADDRESS_LINE_1) {
		_PRIMARY_ADDRESS_LINE_1 = PRIMARY_ADDRESS_LINE_1;
	}

	public String getPRIMARY_ADDRESS_LINE_2() {
		return _PRIMARY_ADDRESS_LINE_2;
	}

	public void setPRIMARY_ADDRESS_LINE_2(String PRIMARY_ADDRESS_LINE_2) {
		_PRIMARY_ADDRESS_LINE_2 = PRIMARY_ADDRESS_LINE_2;
	}

	public String getPRIMARY_ADDRESS_LINE_3() {
		return _PRIMARY_ADDRESS_LINE_3;
	}

	public void setPRIMARY_ADDRESS_LINE_3(String PRIMARY_ADDRESS_LINE_3) {
		_PRIMARY_ADDRESS_LINE_3 = PRIMARY_ADDRESS_LINE_3;
	}

	public String getPRIMARY_ADDRESS_CITY() {
		return _PRIMARY_ADDRESS_CITY;
	}

	public void setPRIMARY_ADDRESS_CITY(String PRIMARY_ADDRESS_CITY) {
		_PRIMARY_ADDRESS_CITY = PRIMARY_ADDRESS_CITY;
	}

	public String getPRIMARY_ADDRESS_STATE() {
		return _PRIMARY_ADDRESS_STATE;
	}

	public void setPRIMARY_ADDRESS_STATE(String PRIMARY_ADDRESS_STATE) {
		_PRIMARY_ADDRESS_STATE = PRIMARY_ADDRESS_STATE;
	}

	public String getPRIMARY_ADDRESS_PINCODE() {
		return _PRIMARY_ADDRESS_PINCODE;
	}

	public void setPRIMARY_ADDRESS_PINCODE(String PRIMARY_ADDRESS_PINCODE) {
		_PRIMARY_ADDRESS_PINCODE = PRIMARY_ADDRESS_PINCODE;
	}

	public String getPHONE_NUMBER_1() {
		return _PHONE_NUMBER_1;
	}

	public void setPHONE_NUMBER_1(String PHONE_NUMBER_1) {
		_PHONE_NUMBER_1 = PHONE_NUMBER_1;
	}

	public String getPHONE_NUMBER_2() {
		return _PHONE_NUMBER_2;
	}

	public void setPHONE_NUMBER_2(String PHONE_NUMBER_2) {
		_PHONE_NUMBER_2 = PHONE_NUMBER_2;
	}

	public String getPHONE_NUMBER_3() {
		return _PHONE_NUMBER_3;
	}

	public void setPHONE_NUMBER_3(String PHONE_NUMBER_3) {
		_PHONE_NUMBER_3 = PHONE_NUMBER_3;
	}

	public String getLOGIN_NAME() {
		return _LOGIN_NAME;
	}

	public void setLOGIN_NAME(String LOGIN_NAME) {
		_LOGIN_NAME = LOGIN_NAME;
	}

	public String getGENDER() {
		return _GENDER;
	}

	public void setGENDER(String GENDER) {
		_GENDER = GENDER;
	}

	public String getMARITAL_STATUS() {
		return _MARITAL_STATUS;
	}

	public void setMARITAL_STATUS(String MARITAL_STATUS) {
		_MARITAL_STATUS = MARITAL_STATUS;
	}

	public String getCOUNTRY() {
		return _COUNTRY;
	}

	public void setCOUNTRY(String COUNTRY) {
		_COUNTRY = COUNTRY;
	}

	public int getPRIMARY_ADDRESS_STATE_ID() {
		return _PRIMARY_ADDRESS_STATE_ID;
	}

	public void setPRIMARY_ADDRESS_STATE_ID(int PRIMARY_ADDRESS_STATE_ID) {
		_PRIMARY_ADDRESS_STATE_ID = PRIMARY_ADDRESS_STATE_ID;
	}

	public int getPRIMARY_ADDRESS_CITY_ID() {
		return _PRIMARY_ADDRESS_CITY_ID;
	}

	public void setPRIMARY_ADDRESS_CITY_ID(int PRIMARY_ADDRESS_CITY_ID) {
		_PRIMARY_ADDRESS_CITY_ID = PRIMARY_ADDRESS_CITY_ID;
	}

	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;
	}

	public String getPANCARD() {
		return _PANCARD;
	}

	public void setPANCARD(String PANCARD) {
		_PANCARD = PANCARD;
	}

	private int _CUSTOMER_ID;
	private String _CUSTOMER_SALUTATION;
	private String _CUSTOMER_FIRST_NAME;
	private String _CUSTOMER_LAST_NAME;
	private String _CUSTOMER_MIDDLE_NAME;
	private String _CUSTOMER_DATE_OF_BIRTH;
	private String _CUSTOMER_EMAIL_ADDR;
	private String _OFFICE_NAME;
	private String _DESIGNATION;
	private String _DEPARTMENT;
	private String _PRIMARY_ADDRESS_LINE_1;
	private String _PRIMARY_ADDRESS_LINE_2;
	private String _PRIMARY_ADDRESS_LINE_3;
	private String _PRIMARY_ADDRESS_CITY;
	private String _PRIMARY_ADDRESS_STATE;
	private String _PRIMARY_ADDRESS_PINCODE;
	private String _PHONE_NUMBER_1;
	private String _PHONE_NUMBER_2;
	private String _PHONE_NUMBER_3;
	private String _LOGIN_NAME;
	private String _GENDER;
	private String _MARITAL_STATUS;
	private String _COUNTRY;
	private int _PRIMARY_ADDRESS_STATE_ID;
	private int _PRIMARY_ADDRESS_CITY_ID;
	private int _QRC_ASR_ID;
	private String _PANCARD;
}