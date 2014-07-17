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
import com.ifli.rapid.service.OfficeDetailsLocalServiceUtil;

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
public class OfficeDetailsClp extends BaseModelImpl<OfficeDetails>
	implements OfficeDetails {
	public OfficeDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return OfficeDetails.class;
	}

	@Override
	public String getModelClassName() {
		return OfficeDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _OFFICE_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setOFFICE_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _OFFICE_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("OFFICE_ID", getOFFICE_ID());
		attributes.put("OFFICE_NAME", getOFFICE_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer OFFICE_ID = (Integer)attributes.get("OFFICE_ID");

		if (OFFICE_ID != null) {
			setOFFICE_ID(OFFICE_ID);
		}

		String OFFICE_NAME = (String)attributes.get("OFFICE_NAME");

		if (OFFICE_NAME != null) {
			setOFFICE_NAME(OFFICE_NAME);
		}
	}

	@Override
	public int getOFFICE_ID() {
		return _OFFICE_ID;
	}

	@Override
	public void setOFFICE_ID(int OFFICE_ID) {
		_OFFICE_ID = OFFICE_ID;

		if (_officeDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _officeDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setOFFICE_ID", int.class);

				method.invoke(_officeDetailsRemoteModel, OFFICE_ID);
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

		if (_officeDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _officeDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setOFFICE_NAME", String.class);

				method.invoke(_officeDetailsRemoteModel, OFFICE_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOfficeDetailsRemoteModel() {
		return _officeDetailsRemoteModel;
	}

	public void setOfficeDetailsRemoteModel(
		BaseModel<?> officeDetailsRemoteModel) {
		_officeDetailsRemoteModel = officeDetailsRemoteModel;
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

		Class<?> remoteModelClass = _officeDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_officeDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OfficeDetailsLocalServiceUtil.addOfficeDetails(this);
		}
		else {
			OfficeDetailsLocalServiceUtil.updateOfficeDetails(this);
		}
	}

	@Override
	public OfficeDetails toEscapedModel() {
		return (OfficeDetails)ProxyUtil.newProxyInstance(OfficeDetails.class.getClassLoader(),
			new Class[] { OfficeDetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OfficeDetailsClp clone = new OfficeDetailsClp();

		clone.setOFFICE_ID(getOFFICE_ID());
		clone.setOFFICE_NAME(getOFFICE_NAME());

		return clone;
	}

	@Override
	public int compareTo(OfficeDetails officeDetails) {
		int primaryKey = officeDetails.getPrimaryKey();

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

		if (!(obj instanceof OfficeDetailsClp)) {
			return false;
		}

		OfficeDetailsClp officeDetails = (OfficeDetailsClp)obj;

		int primaryKey = officeDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{OFFICE_ID=");
		sb.append(getOFFICE_ID());
		sb.append(", OFFICE_NAME=");
		sb.append(getOFFICE_NAME());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.OfficeDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>OFFICE_ID</column-name><column-value><![CDATA[");
		sb.append(getOFFICE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OFFICE_NAME</column-name><column-value><![CDATA[");
		sb.append(getOFFICE_NAME());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _OFFICE_ID;
	private String _OFFICE_NAME;
	private BaseModel<?> _officeDetailsRemoteModel;
}