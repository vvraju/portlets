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

import com.ifli.rapid.service.CityDetailsLocalServiceUtil;
import com.ifli.rapid.service.ClpSerializer;

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
public class CityDetailsClp extends BaseModelImpl<CityDetails>
	implements CityDetails {
	public CityDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CityDetails.class;
	}

	@Override
	public String getModelClassName() {
		return CityDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _CITY_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCITY_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CITY_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("CITY_CODE", getCITY_CODE());
		attributes.put("CITY_NAME", getCITY_NAME());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("IS_ACTIVE", getIS_ACTIVE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		String CITY_CODE = (String)attributes.get("CITY_CODE");

		if (CITY_CODE != null) {
			setCITY_CODE(CITY_CODE);
		}

		String CITY_NAME = (String)attributes.get("CITY_NAME");

		if (CITY_NAME != null) {
			setCITY_NAME(CITY_NAME);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String IS_ACTIVE = (String)attributes.get("IS_ACTIVE");

		if (IS_ACTIVE != null) {
			setIS_ACTIVE(IS_ACTIVE);
		}
	}

	@Override
	public int getCITY_ID() {
		return _CITY_ID;
	}

	@Override
	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;

		if (_cityDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _cityDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY_ID", int.class);

				method.invoke(_cityDetailsRemoteModel, CITY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCITY_CODE() {
		return _CITY_CODE;
	}

	@Override
	public void setCITY_CODE(String CITY_CODE) {
		_CITY_CODE = CITY_CODE;

		if (_cityDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _cityDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY_CODE", String.class);

				method.invoke(_cityDetailsRemoteModel, CITY_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCITY_NAME() {
		return _CITY_NAME;
	}

	@Override
	public void setCITY_NAME(String CITY_NAME) {
		_CITY_NAME = CITY_NAME;

		if (_cityDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _cityDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY_NAME", String.class);

				method.invoke(_cityDetailsRemoteModel, CITY_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSTATE_ID() {
		return _STATE_ID;
	}

	@Override
	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;

		if (_cityDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _cityDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_ID", int.class);

				method.invoke(_cityDetailsRemoteModel, STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIS_ACTIVE() {
		return _IS_ACTIVE;
	}

	@Override
	public void setIS_ACTIVE(String IS_ACTIVE) {
		_IS_ACTIVE = IS_ACTIVE;

		if (_cityDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _cityDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setIS_ACTIVE", String.class);

				method.invoke(_cityDetailsRemoteModel, IS_ACTIVE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCityDetailsRemoteModel() {
		return _cityDetailsRemoteModel;
	}

	public void setCityDetailsRemoteModel(BaseModel<?> cityDetailsRemoteModel) {
		_cityDetailsRemoteModel = cityDetailsRemoteModel;
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

		Class<?> remoteModelClass = _cityDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cityDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CityDetailsLocalServiceUtil.addCityDetails(this);
		}
		else {
			CityDetailsLocalServiceUtil.updateCityDetails(this);
		}
	}

	@Override
	public CityDetails toEscapedModel() {
		return (CityDetails)ProxyUtil.newProxyInstance(CityDetails.class.getClassLoader(),
			new Class[] { CityDetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CityDetailsClp clone = new CityDetailsClp();

		clone.setCITY_ID(getCITY_ID());
		clone.setCITY_CODE(getCITY_CODE());
		clone.setCITY_NAME(getCITY_NAME());
		clone.setSTATE_ID(getSTATE_ID());
		clone.setIS_ACTIVE(getIS_ACTIVE());

		return clone;
	}

	@Override
	public int compareTo(CityDetails cityDetails) {
		int primaryKey = cityDetails.getPrimaryKey();

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

		if (!(obj instanceof CityDetailsClp)) {
			return false;
		}

		CityDetailsClp cityDetails = (CityDetailsClp)obj;

		int primaryKey = cityDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{CITY_ID=");
		sb.append(getCITY_ID());
		sb.append(", CITY_CODE=");
		sb.append(getCITY_CODE());
		sb.append(", CITY_NAME=");
		sb.append(getCITY_NAME());
		sb.append(", STATE_ID=");
		sb.append(getSTATE_ID());
		sb.append(", IS_ACTIVE=");
		sb.append(getIS_ACTIVE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.CityDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CITY_ID</column-name><column-value><![CDATA[");
		sb.append(getCITY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY_CODE</column-name><column-value><![CDATA[");
		sb.append(getCITY_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY_NAME</column-name><column-value><![CDATA[");
		sb.append(getCITY_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IS_ACTIVE</column-name><column-value><![CDATA[");
		sb.append(getIS_ACTIVE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _CITY_ID;
	private String _CITY_CODE;
	private String _CITY_NAME;
	private int _STATE_ID;
	private String _IS_ACTIVE;
	private BaseModel<?> _cityDetailsRemoteModel;
}