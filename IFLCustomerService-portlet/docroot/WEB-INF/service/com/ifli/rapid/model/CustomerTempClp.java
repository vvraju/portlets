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
import com.ifli.rapid.service.CustomerTempLocalServiceUtil;

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
public class CustomerTempClp extends BaseModelImpl<CustomerTemp>
	implements CustomerTemp {
	public CustomerTempClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerTemp.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerTemp.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setCUSTOMER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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
		attributes.put("PRIMARY_ADDRESS_LINE_1", getPRIMARY_ADDRESS_LINE_1());
		attributes.put("PRIMARY_ADDRESS_LINE_2", getPRIMARY_ADDRESS_LINE_2());
		attributes.put("PRIMARY_ADDRESS_LINE_3", getPRIMARY_ADDRESS_LINE_3());
		attributes.put("PRIMARY_ADDRESS_CITY", getPRIMARY_ADDRESS_CITY());
		attributes.put("PRIMARY_ADDRESS_STATE", getPRIMARY_ADDRESS_STATE());
		attributes.put("PIMARY_ADDRESS_PINCODE", getPIMARY_ADDRESS_PINCODE());
		attributes.put("PHONE_NUMBER_1", getPHONE_NUMBER_1());
		attributes.put("PHONE_NUMBER_2", getPHONE_NUMBER_2());
		attributes.put("PHONE_NUMBER_3", getPHONE_NUMBER_3());
		attributes.put("LOGIN_NAME", getLOGIN_NAME());
		attributes.put("GENDER", getGENDER());
		attributes.put("MARITAL_STATUS", getMARITAL_STATUS());
		attributes.put("COUNTRY", getCOUNTRY());
		attributes.put("PRIMARY_ADDRESS_STATE_ID", getPRIMARY_ADDRESS_STATE_ID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

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

		Integer PIMARY_ADDRESS_PINCODE = (Integer)attributes.get(
				"PIMARY_ADDRESS_PINCODE");

		if (PIMARY_ADDRESS_PINCODE != null) {
			setPIMARY_ADDRESS_PINCODE(PIMARY_ADDRESS_PINCODE);
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
	}

	@Override
	public String getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(String CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_ID);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_SALUTATION",
						String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_SALUTATION);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_FIRST_NAME",
						String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_FIRST_NAME);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_LAST_NAME",
						String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_LAST_NAME);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_MIDDLE_NAME",
						String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_MIDDLE_NAME);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_DATE_OF_BIRTH",
						String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_DATE_OF_BIRTH);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_EMAIL_ADDR",
						String.class);

				method.invoke(_customerTempRemoteModel, CUSTOMER_EMAIL_ADDR);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_LINE_1",
						String.class);

				method.invoke(_customerTempRemoteModel, PRIMARY_ADDRESS_LINE_1);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_LINE_2",
						String.class);

				method.invoke(_customerTempRemoteModel, PRIMARY_ADDRESS_LINE_2);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_LINE_3",
						String.class);

				method.invoke(_customerTempRemoteModel, PRIMARY_ADDRESS_LINE_3);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_CITY",
						String.class);

				method.invoke(_customerTempRemoteModel, PRIMARY_ADDRESS_CITY);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_STATE",
						String.class);

				method.invoke(_customerTempRemoteModel, PRIMARY_ADDRESS_STATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPIMARY_ADDRESS_PINCODE() {
		return _PIMARY_ADDRESS_PINCODE;
	}

	@Override
	public void setPIMARY_ADDRESS_PINCODE(int PIMARY_ADDRESS_PINCODE) {
		_PIMARY_ADDRESS_PINCODE = PIMARY_ADDRESS_PINCODE;

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPIMARY_ADDRESS_PINCODE",
						int.class);

				method.invoke(_customerTempRemoteModel, PIMARY_ADDRESS_PINCODE);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_NUMBER_1",
						String.class);

				method.invoke(_customerTempRemoteModel, PHONE_NUMBER_1);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_NUMBER_2",
						String.class);

				method.invoke(_customerTempRemoteModel, PHONE_NUMBER_2);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_NUMBER_3",
						String.class);

				method.invoke(_customerTempRemoteModel, PHONE_NUMBER_3);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setLOGIN_NAME", String.class);

				method.invoke(_customerTempRemoteModel, LOGIN_NAME);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setGENDER", String.class);

				method.invoke(_customerTempRemoteModel, GENDER);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setMARITAL_STATUS",
						String.class);

				method.invoke(_customerTempRemoteModel, MARITAL_STATUS);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setCOUNTRY", String.class);

				method.invoke(_customerTempRemoteModel, COUNTRY);
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

		if (_customerTempRemoteModel != null) {
			try {
				Class<?> clazz = _customerTempRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_ADDRESS_STATE_ID",
						int.class);

				method.invoke(_customerTempRemoteModel, PRIMARY_ADDRESS_STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomerTempRemoteModel() {
		return _customerTempRemoteModel;
	}

	public void setCustomerTempRemoteModel(BaseModel<?> customerTempRemoteModel) {
		_customerTempRemoteModel = customerTempRemoteModel;
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

		Class<?> remoteModelClass = _customerTempRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerTempRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerTempLocalServiceUtil.addCustomerTemp(this);
		}
		else {
			CustomerTempLocalServiceUtil.updateCustomerTemp(this);
		}
	}

	@Override
	public CustomerTemp toEscapedModel() {
		return (CustomerTemp)ProxyUtil.newProxyInstance(CustomerTemp.class.getClassLoader(),
			new Class[] { CustomerTemp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerTempClp clone = new CustomerTempClp();

		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setCUSTOMER_SALUTATION(getCUSTOMER_SALUTATION());
		clone.setCUSTOMER_FIRST_NAME(getCUSTOMER_FIRST_NAME());
		clone.setCUSTOMER_LAST_NAME(getCUSTOMER_LAST_NAME());
		clone.setCUSTOMER_MIDDLE_NAME(getCUSTOMER_MIDDLE_NAME());
		clone.setCUSTOMER_DATE_OF_BIRTH(getCUSTOMER_DATE_OF_BIRTH());
		clone.setCUSTOMER_EMAIL_ADDR(getCUSTOMER_EMAIL_ADDR());
		clone.setPRIMARY_ADDRESS_LINE_1(getPRIMARY_ADDRESS_LINE_1());
		clone.setPRIMARY_ADDRESS_LINE_2(getPRIMARY_ADDRESS_LINE_2());
		clone.setPRIMARY_ADDRESS_LINE_3(getPRIMARY_ADDRESS_LINE_3());
		clone.setPRIMARY_ADDRESS_CITY(getPRIMARY_ADDRESS_CITY());
		clone.setPRIMARY_ADDRESS_STATE(getPRIMARY_ADDRESS_STATE());
		clone.setPIMARY_ADDRESS_PINCODE(getPIMARY_ADDRESS_PINCODE());
		clone.setPHONE_NUMBER_1(getPHONE_NUMBER_1());
		clone.setPHONE_NUMBER_2(getPHONE_NUMBER_2());
		clone.setPHONE_NUMBER_3(getPHONE_NUMBER_3());
		clone.setLOGIN_NAME(getLOGIN_NAME());
		clone.setGENDER(getGENDER());
		clone.setMARITAL_STATUS(getMARITAL_STATUS());
		clone.setCOUNTRY(getCOUNTRY());
		clone.setPRIMARY_ADDRESS_STATE_ID(getPRIMARY_ADDRESS_STATE_ID());

		return clone;
	}

	@Override
	public int compareTo(CustomerTemp customerTemp) {
		String primaryKey = customerTemp.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerTempClp)) {
			return false;
		}

		CustomerTempClp customerTemp = (CustomerTempClp)obj;

		String primaryKey = customerTemp.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

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
		sb.append(", PIMARY_ADDRESS_PINCODE=");
		sb.append(getPIMARY_ADDRESS_PINCODE());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.CustomerTemp");
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
			"<column><column-name>PIMARY_ADDRESS_PINCODE</column-name><column-value><![CDATA[");
		sb.append(getPIMARY_ADDRESS_PINCODE());
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

		sb.append("</model>");

		return sb.toString();
	}

	private String _CUSTOMER_ID;
	private String _CUSTOMER_SALUTATION;
	private String _CUSTOMER_FIRST_NAME;
	private String _CUSTOMER_LAST_NAME;
	private String _CUSTOMER_MIDDLE_NAME;
	private String _CUSTOMER_DATE_OF_BIRTH;
	private String _CUSTOMER_EMAIL_ADDR;
	private String _PRIMARY_ADDRESS_LINE_1;
	private String _PRIMARY_ADDRESS_LINE_2;
	private String _PRIMARY_ADDRESS_LINE_3;
	private String _PRIMARY_ADDRESS_CITY;
	private String _PRIMARY_ADDRESS_STATE;
	private int _PIMARY_ADDRESS_PINCODE;
	private String _PHONE_NUMBER_1;
	private String _PHONE_NUMBER_2;
	private String _PHONE_NUMBER_3;
	private String _LOGIN_NAME;
	private String _GENDER;
	private String _MARITAL_STATUS;
	private String _COUNTRY;
	private int _PRIMARY_ADDRESS_STATE_ID;
	private BaseModel<?> _customerTempRemoteModel;
}