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

import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.TempCustomerLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class TempCustomerClp extends BaseModelImpl<TempCustomer>
	implements TempCustomer {
	public TempCustomerClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempCustomer.class;
	}

	@Override
	public String getModelClassName() {
		return TempCustomer.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCUSTOMER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("CUSTOMER_SALUTATION", getCUSTOMER_SALUTATION());
		attributes.put("CUSTOMER_FIRST_NAME", getCUSTOMER_FIRST_NAME());
		attributes.put("CUSTOMER_LAST_NAME", getCUSTOMER_LAST_NAME());
		attributes.put("CUSTOMER_MIDDLE_NAME", getCUSTOMER_MIDDLE_NAME());
		attributes.put("CUSTOMER_DATE_OF_BIRTH", getCUSTOMER_DATE_OF_BIRTH());
		attributes.put("CUSTOMER_EMAIL_ADDR", getCUSTOMER_EMAIL_ADDR());
		attributes.put("OFFICE_NAME", getOFFICE_NAME());
		attributes.put("DESIGNATION", getDESIGNATION());
		attributes.put("DEPARTMENT", getDEPARTMENT());
		attributes.put("PRIMARY_ADDRESS_LINE_1", getPRIMARY_ADDRESS_LINE_1());
		attributes.put("PRIMARY_ADDRESS_LINE_2", getPRIMARY_ADDRESS_LINE_2());
		attributes.put("PRIMARY_ADDRESS_LINE_3", getPRIMARY_ADDRESS_LINE_3());
		attributes.put("PRIMARY_ADDRESS_CITY", getPRIMARY_ADDRESS_CITY());
		attributes.put("PRIMARY_ADDRESS_STATE", getPRIMARY_ADDRESS_STATE());
		attributes.put("PRIMARY_ADDRESS_PINCODE", getPRIMARY_ADDRESS_PINCODE());
		attributes.put("PHONE_NUMBER_1", getPHONE_NUMBER_1());
		attributes.put("PHONE_NUMBER_2", getPHONE_NUMBER_2());
		attributes.put("PHONE_NUMBER_3", getPHONE_NUMBER_3());
		attributes.put("LOGIN_NAME", getLOGIN_NAME());
		attributes.put("GENDER", getGENDER());
		attributes.put("MARITAL_STATUS", getMARITAL_STATUS());
		attributes.put("COUNTRY", getCOUNTRY());
		attributes.put("PRIMARY_ADDRESS_STATE_ID", getPRIMARY_ADDRESS_STATE_ID());
		attributes.put("PRIMARY_ADDRESS_CITY_ID", getPRIMARY_ADDRESS_CITY_ID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("PANCARD", getPANCARD());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String CUSTOMER_SALUTATION = (String)attributes.get(
				"CUSTOMER_SALUTATION");

		if (CUSTOMER_SALUTATION != null) {
			setCUSTOMER_SALUTATION(CUSTOMER_SALUTATION);
		}

		String CUSTOMER_FIRST_NAME = (String)attributes.get(
				"CUSTOMER_FIRST_NAME");

		if (CUSTOMER_FIRST_NAME != null) {
			setCUSTOMER_FIRST_NAME(CUSTOMER_FIRST_NAME);
		}

		String CUSTOMER_LAST_NAME = (String)attributes.get("CUSTOMER_LAST_NAME");

		if (CUSTOMER_LAST_NAME != null) {
			setCUSTOMER_LAST_NAME(CUSTOMER_LAST_NAME);
		}

		String CUSTOMER_MIDDLE_NAME = (String)attributes.get(
				"CUSTOMER_MIDDLE_NAME");

		if (CUSTOMER_MIDDLE_NAME != null) {
			setCUSTOMER_MIDDLE_NAME(CUSTOMER_MIDDLE_NAME);
		}

		String CUSTOMER_DATE_OF_BIRTH = (String)attributes.get(
				"CUSTOMER_DATE_OF_BIRTH");

		if (CUSTOMER_DATE_OF_BIRTH != null) {
			setCUSTOMER_DATE_OF_BIRTH(CUSTOMER_DATE_OF_BIRTH);
		}

		String CUSTOMER_EMAIL_ADDR = (String)attributes.get(
				"CUSTOMER_EMAIL_ADDR");

		if (CUSTOMER_EMAIL_ADDR != null) {
			setCUSTOMER_EMAIL_ADDR(CUSTOMER_EMAIL_ADDR);
		}

		String OFFICE_NAME = (String)attributes.get("OFFICE_NAME");

		if (OFFICE_NAME != null) {
			setOFFICE_NAME(OFFICE_NAME);
		}

		String DESIGNATION = (String)attributes.get("DESIGNATION");

		if (DESIGNATION != null) {
			setDESIGNATION(DESIGNATION);
		}

		String DEPARTMENT = (String)attributes.get("DEPARTMENT");

		if (DEPARTMENT != null) {
			setDEPARTMENT(DEPARTMENT);
		}

		String PRIMARY_ADDRESS_LINE_1 = (String)attributes.get(
				"PRIMARY_ADDRESS_LINE_1");

		if (PRIMARY_ADDRESS_LINE_1 != null) {
			setPRIMARY_ADDRESS_LINE_1(PRIMARY_ADDRESS_LINE_1);
		}

		String PRIMARY_ADDRESS_LINE_2 = (String)attributes.get(
				"PRIMARY_ADDRESS_LINE_2");

		if (PRIMARY_ADDRESS_LINE_2 != null) {
			setPRIMARY_ADDRESS_LINE_2(PRIMARY_ADDRESS_LINE_2);
		}

		String PRIMARY_ADDRESS_LINE_3 = (String)attributes.get(
				"PRIMARY_ADDRESS_LINE_3");

		if (PRIMARY_ADDRESS_LINE_3 != null) {
			setPRIMARY_ADDRESS_LINE_3(PRIMARY_ADDRESS_LINE_3);
		}

		String PRIMARY_ADDRESS_CITY = (String)attributes.get(
				"PRIMARY_ADDRESS_CITY");

		if (PRIMARY_ADDRESS_CITY != null) {
			setPRIMARY_ADDRESS_CITY(PRIMARY_ADDRESS_CITY);
		}

		String PRIMARY_ADDRESS_STATE = (String)attributes.get(
				"PRIMARY_ADDRESS_STATE");

		if (PRIMARY_ADDRESS_STATE != null) {
			setPRIMARY_ADDRESS_STATE(PRIMARY_ADDRESS_STATE);
		}

		String PRIMARY_ADDRESS_PINCODE = (String)attributes.get(
				"PRIMARY_ADDRESS_PINCODE");

		if (PRIMARY_ADDRESS_PINCODE != null) {
			setPRIMARY_ADDRESS_PINCODE(PRIMARY_ADDRESS_PINCODE);
		}

		String PHONE_NUMBER_1 = (String)attributes.get("PHONE_NUMBER_1");

		if (PHONE_NUMBER_1 != null) {
			setPHONE_NUMBER_1(PHONE_NUMBER_1);
		}

		String PHONE_NUMBER_2 = (String)attributes.get("PHONE_NUMBER_2");

		if (PHONE_NUMBER_2 != null) {
			setPHONE_NUMBER_2(PHONE_NUMBER_2);
		}

		String PHONE_NUMBER_3 = (String)attributes.get("PHONE_NUMBER_3");

		if (PHONE_NUMBER_3 != null) {
			setPHONE_NUMBER_3(PHONE_NUMBER_3);
		}

		String LOGIN_NAME = (String)attributes.get("LOGIN_NAME");

		if (LOGIN_NAME != null) {
			setLOGIN_NAME(LOGIN_NAME);
		}

		String GENDER = (String)attributes.get("GENDER");

		if (GENDER != null) {
			setGENDER(GENDER);
		}

		String MARITAL_STATUS = (String)attributes.get("MARITAL_STATUS");

		if (MARITAL_STATUS != null) {
			setMARITAL_STATUS(MARITAL_STATUS);
		}

		String COUNTRY = (String)attributes.get("COUNTRY");

		if (COUNTRY != null) {
			setCOUNTRY(COUNTRY);
		}

		Integer PRIMARY_ADDRESS_STATE_ID = (Integer)attributes.get(
				"PRIMARY_ADDRESS_STATE_ID");

		if (PRIMARY_ADDRESS_STATE_ID != null) {
			setPRIMARY_ADDRESS_STATE_ID(PRIMARY_ADDRESS_STATE_ID);
		}

		Integer PRIMARY_ADDRESS_CITY_ID = (Integer)attributes.get(
				"PRIMARY_ADDRESS_CITY_ID");

		if (PRIMARY_ADDRESS_CITY_ID != null) {
			setPRIMARY_ADDRESS_CITY_ID(PRIMARY_ADDRESS_CITY_ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String PANCARD = (String)attributes.get("PANCARD");

		if (PANCARD != null) {
			setPANCARD(PANCARD);
		}
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_SALUTATION() {
		return _CUSTOMER_SALUTATION;
	}

	@Override
	public void setCUSTOMER_SALUTATION(String CUSTOMER_SALUTATION) {
		_CUSTOMER_SALUTATION = CUSTOMER_SALUTATION;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_SALUTATION",
						String.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_SALUTATION);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_FIRST_NAME() {
		return _CUSTOMER_FIRST_NAME;
	}

	@Override
	public void setCUSTOMER_FIRST_NAME(String CUSTOMER_FIRST_NAME) {
		_CUSTOMER_FIRST_NAME = CUSTOMER_FIRST_NAME;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_FIRST_NAME",
						String.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_FIRST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_LAST_NAME() {
		return _CUSTOMER_LAST_NAME;
	}

	@Override
	public void setCUSTOMER_LAST_NAME(String CUSTOMER_LAST_NAME) {
		_CUSTOMER_LAST_NAME = CUSTOMER_LAST_NAME;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_LAST_NAME",
						String.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_LAST_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_MIDDLE_NAME() {
		return _CUSTOMER_MIDDLE_NAME;
	}

	@Override
	public void setCUSTOMER_MIDDLE_NAME(String CUSTOMER_MIDDLE_NAME) {
		_CUSTOMER_MIDDLE_NAME = CUSTOMER_MIDDLE_NAME;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_MIDDLE_NAME",
						String.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_MIDDLE_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_DATE_OF_BIRTH() {
		return _CUSTOMER_DATE_OF_BIRTH;
	}

	@Override
	public void setCUSTOMER_DATE_OF_BIRTH(String CUSTOMER_DATE_OF_BIRTH) {
		_CUSTOMER_DATE_OF_BIRTH = CUSTOMER_DATE_OF_BIRTH;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_DATE_OF_BIRTH",
						String.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_DATE_OF_BIRTH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_EMAIL_ADDR() {
		return _CUSTOMER_EMAIL_ADDR;
	}

	@Override
	public void setCUSTOMER_EMAIL_ADDR(String CUSTOMER_EMAIL_ADDR) {
		_CUSTOMER_EMAIL_ADDR = CUSTOMER_EMAIL_ADDR;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_EMAIL_ADDR",
						String.class);

				method.invoke(_tempCustomerRemoteModel, CUSTOMER_EMAIL_ADDR);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOFFICE_NAME() {
		return _OFFICE_NAME;
	}

	@Override
	public void setOFFICE_NAME(String OFFICE_NAME) {
		_OFFICE_NAME = OFFICE_NAME;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setOFFICE_NAME", String.class);

				method.invoke(_tempCustomerRemoteModel, OFFICE_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDESIGNATION() {
		return _DESIGNATION;
	}

	@Override
	public void setDESIGNATION(String DESIGNATION) {
		_DESIGNATION = DESIGNATION;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setDESIGNATION", String.class);

				method.invoke(_tempCustomerRemoteModel, DESIGNATION);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDEPARTMENT() {
		return _DEPARTMENT;
	}

	@Override
	public void setDEPARTMENT(String DEPARTMENT) {
		_DEPARTMENT = DEPARTMENT;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setDEPARTMENT", String.class);

				method.invoke(_tempCustomerRemoteModel, DEPARTMENT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_ADDRESS_LINE_1() {
		return _PRIMARY_ADDRESS_LINE_1;
	}

	@Override
	public void setPRIMARY_ADDRESS_LINE_1(String PRIMARY_ADDRESS_LINE_1) {
		_PRIMARY_ADDRESS_LINE_1 = PRIMARY_ADDRESS_LINE_1;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_LINE_1",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_LINE_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_ADDRESS_LINE_2() {
		return _PRIMARY_ADDRESS_LINE_2;
	}

	@Override
	public void setPRIMARY_ADDRESS_LINE_2(String PRIMARY_ADDRESS_LINE_2) {
		_PRIMARY_ADDRESS_LINE_2 = PRIMARY_ADDRESS_LINE_2;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_LINE_2",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_LINE_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_ADDRESS_LINE_3() {
		return _PRIMARY_ADDRESS_LINE_3;
	}

	@Override
	public void setPRIMARY_ADDRESS_LINE_3(String PRIMARY_ADDRESS_LINE_3) {
		_PRIMARY_ADDRESS_LINE_3 = PRIMARY_ADDRESS_LINE_3;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_LINE_3",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_LINE_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_ADDRESS_CITY() {
		return _PRIMARY_ADDRESS_CITY;
	}

	@Override
	public void setPRIMARY_ADDRESS_CITY(String PRIMARY_ADDRESS_CITY) {
		_PRIMARY_ADDRESS_CITY = PRIMARY_ADDRESS_CITY;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_CITY",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_CITY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_ADDRESS_STATE() {
		return _PRIMARY_ADDRESS_STATE;
	}

	@Override
	public void setPRIMARY_ADDRESS_STATE(String PRIMARY_ADDRESS_STATE) {
		_PRIMARY_ADDRESS_STATE = PRIMARY_ADDRESS_STATE;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_STATE",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_STATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_ADDRESS_PINCODE() {
		return _PRIMARY_ADDRESS_PINCODE;
	}

	@Override
	public void setPRIMARY_ADDRESS_PINCODE(String PRIMARY_ADDRESS_PINCODE) {
		_PRIMARY_ADDRESS_PINCODE = PRIMARY_ADDRESS_PINCODE;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_PINCODE",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_PINCODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPHONE_NUMBER_1() {
		return _PHONE_NUMBER_1;
	}

	@Override
	public void setPHONE_NUMBER_1(String PHONE_NUMBER_1) {
		_PHONE_NUMBER_1 = PHONE_NUMBER_1;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_NUMBER_1",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PHONE_NUMBER_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPHONE_NUMBER_2() {
		return _PHONE_NUMBER_2;
	}

	@Override
	public void setPHONE_NUMBER_2(String PHONE_NUMBER_2) {
		_PHONE_NUMBER_2 = PHONE_NUMBER_2;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_NUMBER_2",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PHONE_NUMBER_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPHONE_NUMBER_3() {
		return _PHONE_NUMBER_3;
	}

	@Override
	public void setPHONE_NUMBER_3(String PHONE_NUMBER_3) {
		_PHONE_NUMBER_3 = PHONE_NUMBER_3;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_NUMBER_3",
						String.class);

				method.invoke(_tempCustomerRemoteModel, PHONE_NUMBER_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLOGIN_NAME() {
		return _LOGIN_NAME;
	}

	@Override
	public void setLOGIN_NAME(String LOGIN_NAME) {
		_LOGIN_NAME = LOGIN_NAME;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setLOGIN_NAME", String.class);

				method.invoke(_tempCustomerRemoteModel, LOGIN_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGENDER() {
		return _GENDER;
	}

	@Override
	public void setGENDER(String GENDER) {
		_GENDER = GENDER;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setGENDER", String.class);

				method.invoke(_tempCustomerRemoteModel, GENDER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMARITAL_STATUS() {
		return _MARITAL_STATUS;
	}

	@Override
	public void setMARITAL_STATUS(String MARITAL_STATUS) {
		_MARITAL_STATUS = MARITAL_STATUS;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setMARITAL_STATUS",
						String.class);

				method.invoke(_tempCustomerRemoteModel, MARITAL_STATUS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCOUNTRY() {
		return _COUNTRY;
	}

	@Override
	public void setCOUNTRY(String COUNTRY) {
		_COUNTRY = COUNTRY;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCOUNTRY", String.class);

				method.invoke(_tempCustomerRemoteModel, COUNTRY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPRIMARY_ADDRESS_STATE_ID() {
		return _PRIMARY_ADDRESS_STATE_ID;
	}

	@Override
	public void setPRIMARY_ADDRESS_STATE_ID(int PRIMARY_ADDRESS_STATE_ID) {
		_PRIMARY_ADDRESS_STATE_ID = PRIMARY_ADDRESS_STATE_ID;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_STATE_ID",
						int.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPRIMARY_ADDRESS_CITY_ID() {
		return _PRIMARY_ADDRESS_CITY_ID;
	}

	@Override
	public void setPRIMARY_ADDRESS_CITY_ID(int PRIMARY_ADDRESS_CITY_ID) {
		_PRIMARY_ADDRESS_CITY_ID = PRIMARY_ADDRESS_CITY_ID;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_CITY_ID",
						int.class);

				method.invoke(_tempCustomerRemoteModel, PRIMARY_ADDRESS_CITY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_tempCustomerRemoteModel, QRC_ASR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPANCARD() {
		return _PANCARD;
	}

	@Override
	public void setPANCARD(String PANCARD) {
		_PANCARD = PANCARD;

		if (_tempCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _tempCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPANCARD", String.class);

				method.invoke(_tempCustomerRemoteModel, PANCARD);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempCustomerRemoteModel() {
		return _tempCustomerRemoteModel;
	}

	public void setTempCustomerRemoteModel(BaseModel<?> tempCustomerRemoteModel) {
		_tempCustomerRemoteModel = tempCustomerRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _tempCustomerRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_tempCustomerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCustomerLocalServiceUtil.addTempCustomer(this);
		}
		else {
			TempCustomerLocalServiceUtil.updateTempCustomer(this);
		}
	}

	@Override
	public TempCustomer toEscapedModel() {
		return (TempCustomer)ProxyUtil.newProxyInstance(TempCustomer.class.getClassLoader(),
			new Class[] { TempCustomer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCustomerClp clone = new TempCustomerClp();

		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setCUSTOMER_SALUTATION(getCUSTOMER_SALUTATION());
		clone.setCUSTOMER_FIRST_NAME(getCUSTOMER_FIRST_NAME());
		clone.setCUSTOMER_LAST_NAME(getCUSTOMER_LAST_NAME());
		clone.setCUSTOMER_MIDDLE_NAME(getCUSTOMER_MIDDLE_NAME());
		clone.setCUSTOMER_DATE_OF_BIRTH(getCUSTOMER_DATE_OF_BIRTH());
		clone.setCUSTOMER_EMAIL_ADDR(getCUSTOMER_EMAIL_ADDR());
		clone.setOFFICE_NAME(getOFFICE_NAME());
		clone.setDESIGNATION(getDESIGNATION());
		clone.setDEPARTMENT(getDEPARTMENT());
		clone.setPRIMARY_ADDRESS_LINE_1(getPRIMARY_ADDRESS_LINE_1());
		clone.setPRIMARY_ADDRESS_LINE_2(getPRIMARY_ADDRESS_LINE_2());
		clone.setPRIMARY_ADDRESS_LINE_3(getPRIMARY_ADDRESS_LINE_3());
		clone.setPRIMARY_ADDRESS_CITY(getPRIMARY_ADDRESS_CITY());
		clone.setPRIMARY_ADDRESS_STATE(getPRIMARY_ADDRESS_STATE());
		clone.setPRIMARY_ADDRESS_PINCODE(getPRIMARY_ADDRESS_PINCODE());
		clone.setPHONE_NUMBER_1(getPHONE_NUMBER_1());
		clone.setPHONE_NUMBER_2(getPHONE_NUMBER_2());
		clone.setPHONE_NUMBER_3(getPHONE_NUMBER_3());
		clone.setLOGIN_NAME(getLOGIN_NAME());
		clone.setGENDER(getGENDER());
		clone.setMARITAL_STATUS(getMARITAL_STATUS());
		clone.setCOUNTRY(getCOUNTRY());
		clone.setPRIMARY_ADDRESS_STATE_ID(getPRIMARY_ADDRESS_STATE_ID());
		clone.setPRIMARY_ADDRESS_CITY_ID(getPRIMARY_ADDRESS_CITY_ID());
		clone.setQRC_ASR_ID(getQRC_ASR_ID());
		clone.setPANCARD(getPANCARD());

		return clone;
	}

	@Override
	public int compareTo(TempCustomer tempCustomer) {
		int primaryKey = tempCustomer.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCustomerClp)) {
			return false;
		}

		TempCustomerClp tempCustomer = (TempCustomerClp)obj;

		int primaryKey = tempCustomer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", CUSTOMER_SALUTATION=");
		sb.append(getCUSTOMER_SALUTATION());
		sb.append(", CUSTOMER_FIRST_NAME=");
		sb.append(getCUSTOMER_FIRST_NAME());
		sb.append(", CUSTOMER_LAST_NAME=");
		sb.append(getCUSTOMER_LAST_NAME());
		sb.append(", CUSTOMER_MIDDLE_NAME=");
		sb.append(getCUSTOMER_MIDDLE_NAME());
		sb.append(", CUSTOMER_DATE_OF_BIRTH=");
		sb.append(getCUSTOMER_DATE_OF_BIRTH());
		sb.append(", CUSTOMER_EMAIL_ADDR=");
		sb.append(getCUSTOMER_EMAIL_ADDR());
		sb.append(", OFFICE_NAME=");
		sb.append(getOFFICE_NAME());
		sb.append(", DESIGNATION=");
		sb.append(getDESIGNATION());
		sb.append(", DEPARTMENT=");
		sb.append(getDEPARTMENT());
		sb.append(", PRIMARY_ADDRESS_LINE_1=");
		sb.append(getPRIMARY_ADDRESS_LINE_1());
		sb.append(", PRIMARY_ADDRESS_LINE_2=");
		sb.append(getPRIMARY_ADDRESS_LINE_2());
		sb.append(", PRIMARY_ADDRESS_LINE_3=");
		sb.append(getPRIMARY_ADDRESS_LINE_3());
		sb.append(", PRIMARY_ADDRESS_CITY=");
		sb.append(getPRIMARY_ADDRESS_CITY());
		sb.append(", PRIMARY_ADDRESS_STATE=");
		sb.append(getPRIMARY_ADDRESS_STATE());
		sb.append(", PRIMARY_ADDRESS_PINCODE=");
		sb.append(getPRIMARY_ADDRESS_PINCODE());
		sb.append(", PHONE_NUMBER_1=");
		sb.append(getPHONE_NUMBER_1());
		sb.append(", PHONE_NUMBER_2=");
		sb.append(getPHONE_NUMBER_2());
		sb.append(", PHONE_NUMBER_3=");
		sb.append(getPHONE_NUMBER_3());
		sb.append(", LOGIN_NAME=");
		sb.append(getLOGIN_NAME());
		sb.append(", GENDER=");
		sb.append(getGENDER());
		sb.append(", MARITAL_STATUS=");
		sb.append(getMARITAL_STATUS());
		sb.append(", COUNTRY=");
		sb.append(getCOUNTRY());
		sb.append(", PRIMARY_ADDRESS_STATE_ID=");
		sb.append(getPRIMARY_ADDRESS_STATE_ID());
		sb.append(", PRIMARY_ADDRESS_CITY_ID=");
		sb.append(getPRIMARY_ADDRESS_CITY_ID());
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append(", PANCARD=");
		sb.append(getPANCARD());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.TempCustomer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_SALUTATION</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_SALUTATION());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_FIRST_NAME</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_FIRST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_LAST_NAME</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_LAST_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_MIDDLE_NAME</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_MIDDLE_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_DATE_OF_BIRTH</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_DATE_OF_BIRTH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_EMAIL_ADDR</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_EMAIL_ADDR());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OFFICE_NAME</column-name><column-value><![CDATA[");
		sb.append(getOFFICE_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DESIGNATION</column-name><column-value><![CDATA[");
		sb.append(getDESIGNATION());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DEPARTMENT</column-name><column-value><![CDATA[");
		sb.append(getDEPARTMENT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_LINE_1</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_LINE_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_LINE_2</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_LINE_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_LINE_3</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_LINE_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_CITY</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_CITY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_STATE</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_STATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_PINCODE</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_PINCODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PHONE_NUMBER_1</column-name><column-value><![CDATA[");
		sb.append(getPHONE_NUMBER_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PHONE_NUMBER_2</column-name><column-value><![CDATA[");
		sb.append(getPHONE_NUMBER_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PHONE_NUMBER_3</column-name><column-value><![CDATA[");
		sb.append(getPHONE_NUMBER_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOGIN_NAME</column-name><column-value><![CDATA[");
		sb.append(getLOGIN_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GENDER</column-name><column-value><![CDATA[");
		sb.append(getGENDER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MARITAL_STATUS</column-name><column-value><![CDATA[");
		sb.append(getMARITAL_STATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>COUNTRY</column-name><column-value><![CDATA[");
		sb.append(getCOUNTRY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_STATE_ID</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_STATE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_ADDRESS_CITY_ID</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_ADDRESS_CITY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PANCARD</column-name><column-value><![CDATA[");
		sb.append(getPANCARD());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _tempCustomerRemoteModel;
}