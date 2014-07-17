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
import com.ifli.rapid.service.customerMailIdsLocalServiceUtil;

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
public class customerMailIdsClp extends BaseModelImpl<customerMailIds>
	implements customerMailIds {
	public customerMailIdsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return customerMailIds.class;
	}

	@Override
	public String getModelClassName() {
		return customerMailIds.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("EMAIL_ID", getEMAIL_ID());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String EMAIL_ID = (String)attributes.get("EMAIL_ID");

		if (EMAIL_ID != null) {
			setEMAIL_ID(EMAIL_ID);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setID", int.class);

				method.invoke(_customerMailIdsRemoteModel, ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_customerMailIdsRemoteModel, CUSTOMER_ID);
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

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setEMAIL_ID", String.class);

				method.invoke(_customerMailIdsRemoteModel, EMAIL_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	@Override
	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_customerMailIdsRemoteModel, INSERTED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	@Override
	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_customerMailIdsRemoteModel, INSERTED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	@Override
	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_customerMailIdsRemoteModel, UPDATED_BY);
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

		if (_customerMailIdsRemoteModel != null) {
			try {
				Class<?> clazz = _customerMailIdsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_customerMailIdsRemoteModel, UPDATED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcustomerMailIdsRemoteModel() {
		return _customerMailIdsRemoteModel;
	}

	public void setcustomerMailIdsRemoteModel(
		BaseModel<?> customerMailIdsRemoteModel) {
		_customerMailIdsRemoteModel = customerMailIdsRemoteModel;
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

		Class<?> remoteModelClass = _customerMailIdsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerMailIdsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			customerMailIdsLocalServiceUtil.addcustomerMailIds(this);
		}
		else {
			customerMailIdsLocalServiceUtil.updatecustomerMailIds(this);
		}
	}

	@Override
	public customerMailIds toEscapedModel() {
		return (customerMailIds)ProxyUtil.newProxyInstance(customerMailIds.class.getClassLoader(),
			new Class[] { customerMailIds.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		customerMailIdsClp clone = new customerMailIdsClp();

		clone.setID(getID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setEMAIL_ID(getEMAIL_ID());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());

		return clone;
	}

	@Override
	public int compareTo(customerMailIds customerMailIds) {
		int primaryKey = customerMailIds.getPrimaryKey();

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

		if (!(obj instanceof customerMailIdsClp)) {
			return false;
		}

		customerMailIdsClp customerMailIds = (customerMailIdsClp)obj;

		int primaryKey = customerMailIds.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", EMAIL_ID=");
		sb.append(getEMAIL_ID());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.customerMailIds");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EMAIL_ID</column-name><column-value><![CDATA[");
		sb.append(getEMAIL_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_BY</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_DATE</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _ID;
	private int _CUSTOMER_ID;
	private String _EMAIL_ID;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private BaseModel<?> _customerMailIdsRemoteModel;
}