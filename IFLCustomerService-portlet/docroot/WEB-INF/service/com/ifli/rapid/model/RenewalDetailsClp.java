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
import com.ifli.rapid.service.RenewalDetailsLocalServiceUtil;

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
public class RenewalDetailsClp extends BaseModelImpl<RenewalDetails>
	implements RenewalDetails {
	public RenewalDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return RenewalDetails.class;
	}

	@Override
	public String getModelClassName() {
		return RenewalDetails.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _POLICY_ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPOLICY_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _POLICY_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("EMAIL_ID", getEMAIL_ID());
		attributes.put("MOBILE_NUMBER", getMOBILE_NUMBER());
		attributes.put("POLICY_STATUS", getPOLICY_STATUS());
		attributes.put("PRODUCT_NAME", getPRODUCT_NAME());
		attributes.put("DATE", getDATE());
		attributes.put("POLICY_EXPIRY_DATE", getPOLICY_EXPIRY_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long POLICY_ID = (Long)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		String EMAIL_ID = (String)attributes.get("EMAIL_ID");

		if (EMAIL_ID != null) {
			setEMAIL_ID(EMAIL_ID);
		}

		String MOBILE_NUMBER = (String)attributes.get("MOBILE_NUMBER");

		if (MOBILE_NUMBER != null) {
			setMOBILE_NUMBER(MOBILE_NUMBER);
		}

		String POLICY_STATUS = (String)attributes.get("POLICY_STATUS");

		if (POLICY_STATUS != null) {
			setPOLICY_STATUS(POLICY_STATUS);
		}

		String PRODUCT_NAME = (String)attributes.get("PRODUCT_NAME");

		if (PRODUCT_NAME != null) {
			setPRODUCT_NAME(PRODUCT_NAME);
		}

		Date DATE = (Date)attributes.get("DATE");

		if (DATE != null) {
			setDATE(DATE);
		}

		Date POLICY_EXPIRY_DATE = (Date)attributes.get("POLICY_EXPIRY_DATE");

		if (POLICY_EXPIRY_DATE != null) {
			setPOLICY_EXPIRY_DATE(POLICY_EXPIRY_DATE);
		}
	}

	@Override
	public long getPOLICY_ID() {
		return _POLICY_ID;
	}

	@Override
	public void setPOLICY_ID(long POLICY_ID) {
		_POLICY_ID = POLICY_ID;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", long.class);

				method.invoke(_renewalDetailsRemoteModel, POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEMAIL_ID() {
		return _EMAIL_ID;
	}

	@Override
	public void setEMAIL_ID(String EMAIL_ID) {
		_EMAIL_ID = EMAIL_ID;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEMAIL_ID", String.class);

				method.invoke(_renewalDetailsRemoteModel, EMAIL_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMOBILE_NUMBER() {
		return _MOBILE_NUMBER;
	}

	@Override
	public void setMOBILE_NUMBER(String MOBILE_NUMBER) {
		_MOBILE_NUMBER = MOBILE_NUMBER;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setMOBILE_NUMBER", String.class);

				method.invoke(_renewalDetailsRemoteModel, MOBILE_NUMBER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_STATUS() {
		return _POLICY_STATUS;
	}

	@Override
	public void setPOLICY_STATUS(String POLICY_STATUS) {
		_POLICY_STATUS = POLICY_STATUS;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_STATUS", String.class);

				method.invoke(_renewalDetailsRemoteModel, POLICY_STATUS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRODUCT_NAME() {
		return _PRODUCT_NAME;
	}

	@Override
	public void setPRODUCT_NAME(String PRODUCT_NAME) {
		_PRODUCT_NAME = PRODUCT_NAME;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPRODUCT_NAME", String.class);

				method.invoke(_renewalDetailsRemoteModel, PRODUCT_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDATE() {
		return _DATE;
	}

	@Override
	public void setDATE(Date DATE) {
		_DATE = DATE;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDATE", Date.class);

				method.invoke(_renewalDetailsRemoteModel, DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPOLICY_EXPIRY_DATE() {
		return _POLICY_EXPIRY_DATE;
	}

	@Override
	public void setPOLICY_EXPIRY_DATE(Date POLICY_EXPIRY_DATE) {
		_POLICY_EXPIRY_DATE = POLICY_EXPIRY_DATE;

		if (_renewalDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _renewalDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_EXPIRY_DATE",
						Date.class);

				method.invoke(_renewalDetailsRemoteModel, POLICY_EXPIRY_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRenewalDetailsRemoteModel() {
		return _renewalDetailsRemoteModel;
	}

	public void setRenewalDetailsRemoteModel(
		BaseModel<?> renewalDetailsRemoteModel) {
		_renewalDetailsRemoteModel = renewalDetailsRemoteModel;
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

		Class<?> remoteModelClass = _renewalDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_renewalDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RenewalDetailsLocalServiceUtil.addRenewalDetails(this);
		}
		else {
			RenewalDetailsLocalServiceUtil.updateRenewalDetails(this);
		}
	}

	@Override
	public RenewalDetails toEscapedModel() {
		return (RenewalDetails)ProxyUtil.newProxyInstance(RenewalDetails.class.getClassLoader(),
			new Class[] { RenewalDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RenewalDetailsClp clone = new RenewalDetailsClp();

		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setEMAIL_ID(getEMAIL_ID());
		clone.setMOBILE_NUMBER(getMOBILE_NUMBER());
		clone.setPOLICY_STATUS(getPOLICY_STATUS());
		clone.setPRODUCT_NAME(getPRODUCT_NAME());
		clone.setDATE(getDATE());
		clone.setPOLICY_EXPIRY_DATE(getPOLICY_EXPIRY_DATE());

		return clone;
	}

	@Override
	public int compareTo(RenewalDetails renewalDetails) {
		long primaryKey = renewalDetails.getPrimaryKey();

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

		if (!(obj instanceof RenewalDetailsClp)) {
			return false;
		}

		RenewalDetailsClp renewalDetails = (RenewalDetailsClp)obj;

		long primaryKey = renewalDetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", EMAIL_ID=");
		sb.append(getEMAIL_ID());
		sb.append(", MOBILE_NUMBER=");
		sb.append(getMOBILE_NUMBER());
		sb.append(", POLICY_STATUS=");
		sb.append(getPOLICY_STATUS());
		sb.append(", PRODUCT_NAME=");
		sb.append(getPRODUCT_NAME());
		sb.append(", DATE=");
		sb.append(getDATE());
		sb.append(", POLICY_EXPIRY_DATE=");
		sb.append(getPOLICY_EXPIRY_DATE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.RenewalDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EMAIL_ID</column-name><column-value><![CDATA[");
		sb.append(getEMAIL_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MOBILE_NUMBER</column-name><column-value><![CDATA[");
		sb.append(getMOBILE_NUMBER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_STATUS</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_STATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRODUCT_NAME</column-name><column-value><![CDATA[");
		sb.append(getPRODUCT_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DATE</column-name><column-value><![CDATA[");
		sb.append(getDATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_EXPIRY_DATE</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_EXPIRY_DATE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _POLICY_ID;
	private String _EMAIL_ID;
	private String _MOBILE_NUMBER;
	private String _POLICY_STATUS;
	private String _PRODUCT_NAME;
	private Date _DATE;
	private Date _POLICY_EXPIRY_DATE;
	private BaseModel<?> _renewalDetailsRemoteModel;
}