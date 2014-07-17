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
import com.ifli.rapid.service.CustomerOtpLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class CustomerOtpClp extends BaseModelImpl<CustomerOtp>
	implements CustomerOtp {
	public CustomerOtpClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerOtp.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerOtp.class.getName();
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
		attributes.put("EMAIL_OTP", getEMAIL_OTP());
		attributes.put("PHONE_OTP", getPHONE_OTP());
		attributes.put("STATUS", getSTATUS());
		attributes.put("ADDED_DATE", getADDED_DATE());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String EMAIL_OTP = (String)attributes.get("EMAIL_OTP");

		if (EMAIL_OTP != null) {
			setEMAIL_OTP(EMAIL_OTP);
		}

		String PHONE_OTP = (String)attributes.get("PHONE_OTP");

		if (PHONE_OTP != null) {
			setPHONE_OTP(PHONE_OTP);
		}

		String STATUS = (String)attributes.get("STATUS");

		if (STATUS != null) {
			setSTATUS(STATUS);
		}

		Date ADDED_DATE = (Date)attributes.get("ADDED_DATE");

		if (ADDED_DATE != null) {
			setADDED_DATE(ADDED_DATE);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_customerOtpRemoteModel != null) {
			try {
				Class<?> clazz = _customerOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_customerOtpRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEMAIL_OTP() {
		return _EMAIL_OTP;
	}

	@Override
	public void setEMAIL_OTP(String EMAIL_OTP) {
		_EMAIL_OTP = EMAIL_OTP;

		if (_customerOtpRemoteModel != null) {
			try {
				Class<?> clazz = _customerOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setEMAIL_OTP", String.class);

				method.invoke(_customerOtpRemoteModel, EMAIL_OTP);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPHONE_OTP() {
		return _PHONE_OTP;
	}

	@Override
	public void setPHONE_OTP(String PHONE_OTP) {
		_PHONE_OTP = PHONE_OTP;

		if (_customerOtpRemoteModel != null) {
			try {
				Class<?> clazz = _customerOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setPHONE_OTP", String.class);

				method.invoke(_customerOtpRemoteModel, PHONE_OTP);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSTATUS() {
		return _STATUS;
	}

	@Override
	public void setSTATUS(String STATUS) {
		_STATUS = STATUS;

		if (_customerOtpRemoteModel != null) {
			try {
				Class<?> clazz = _customerOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATUS", String.class);

				method.invoke(_customerOtpRemoteModel, STATUS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getADDED_DATE() {
		return _ADDED_DATE;
	}

	@Override
	public void setADDED_DATE(Date ADDED_DATE) {
		_ADDED_DATE = ADDED_DATE;

		if (_customerOtpRemoteModel != null) {
			try {
				Class<?> clazz = _customerOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setADDED_DATE", Date.class);

				method.invoke(_customerOtpRemoteModel, ADDED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	@Override
	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;

		if (_customerOtpRemoteModel != null) {
			try {
				Class<?> clazz = _customerOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_customerOtpRemoteModel, UPDATED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomerOtpRemoteModel() {
		return _customerOtpRemoteModel;
	}

	public void setCustomerOtpRemoteModel(BaseModel<?> customerOtpRemoteModel) {
		_customerOtpRemoteModel = customerOtpRemoteModel;
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

		Class<?> remoteModelClass = _customerOtpRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerOtpRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerOtpLocalServiceUtil.addCustomerOtp(this);
		}
		else {
			CustomerOtpLocalServiceUtil.updateCustomerOtp(this);
		}
	}

	@Override
	public CustomerOtp toEscapedModel() {
		return (CustomerOtp)ProxyUtil.newProxyInstance(CustomerOtp.class.getClassLoader(),
			new Class[] { CustomerOtp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerOtpClp clone = new CustomerOtpClp();

		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setEMAIL_OTP(getEMAIL_OTP());
		clone.setPHONE_OTP(getPHONE_OTP());
		clone.setSTATUS(getSTATUS());
		clone.setADDED_DATE(getADDED_DATE());
		clone.setUPDATED_DATE(getUPDATED_DATE());

		return clone;
	}

	@Override
	public int compareTo(CustomerOtp customerOtp) {
		int primaryKey = customerOtp.getPrimaryKey();

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

		if (!(obj instanceof CustomerOtpClp)) {
			return false;
		}

		CustomerOtpClp customerOtp = (CustomerOtpClp)obj;

		int primaryKey = customerOtp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", EMAIL_OTP=");
		sb.append(getEMAIL_OTP());
		sb.append(", PHONE_OTP=");
		sb.append(getPHONE_OTP());
		sb.append(", STATUS=");
		sb.append(getSTATUS());
		sb.append(", ADDED_DATE=");
		sb.append(getADDED_DATE());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.CustomerOtp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EMAIL_OTP</column-name><column-value><![CDATA[");
		sb.append(getEMAIL_OTP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PHONE_OTP</column-name><column-value><![CDATA[");
		sb.append(getPHONE_OTP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATUS</column-name><column-value><![CDATA[");
		sb.append(getSTATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDED_DATE</column-name><column-value><![CDATA[");
		sb.append(getADDED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _CUSTOMER_ID;
	private String _EMAIL_OTP;
	private String _PHONE_OTP;
	private String _STATUS;
	private Date _ADDED_DATE;
	private Date _UPDATED_DATE;
	private BaseModel<?> _customerOtpRemoteModel;
}