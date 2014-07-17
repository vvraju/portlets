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
import com.ifli.rapid.service.PincodeDetailsLocalServiceUtil;

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
public class PincodeDetailsClp extends BaseModelImpl<PincodeDetails>
	implements PincodeDetails {
	public PincodeDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PincodeDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PincodeDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _PIN_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPIN_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PIN_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PIN_ID", getPIN_ID());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("PIN_CODE", getPIN_CODE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PIN_ID = (Integer)attributes.get("PIN_ID");

		if (PIN_ID != null) {
			setPIN_ID(PIN_ID);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String PIN_CODE = (String)attributes.get("PIN_CODE");

		if (PIN_CODE != null) {
			setPIN_CODE(PIN_CODE);
		}
	}

	@Override
	public int getPIN_ID() {
		return _PIN_ID;
	}

	@Override
	public void setPIN_ID(int PIN_ID) {
		_PIN_ID = PIN_ID;

		if (_pincodeDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _pincodeDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPIN_ID", int.class);

				method.invoke(_pincodeDetailsRemoteModel, PIN_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCITY_ID() {
		return _CITY_ID;
	}

	@Override
	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;

		if (_pincodeDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _pincodeDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY_ID", int.class);

				method.invoke(_pincodeDetailsRemoteModel, CITY_ID);
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

		if (_pincodeDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _pincodeDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_ID", int.class);

				method.invoke(_pincodeDetailsRemoteModel, STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPIN_CODE() {
		return _PIN_CODE;
	}

	@Override
	public void setPIN_CODE(String PIN_CODE) {
		_PIN_CODE = PIN_CODE;

		if (_pincodeDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _pincodeDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPIN_CODE", String.class);

				method.invoke(_pincodeDetailsRemoteModel, PIN_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPincodeDetailsRemoteModel() {
		return _pincodeDetailsRemoteModel;
	}

	public void setPincodeDetailsRemoteModel(
		BaseModel<?> pincodeDetailsRemoteModel) {
		_pincodeDetailsRemoteModel = pincodeDetailsRemoteModel;
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

		Class<?> remoteModelClass = _pincodeDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_pincodeDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PincodeDetailsLocalServiceUtil.addPincodeDetails(this);
		}
		else {
			PincodeDetailsLocalServiceUtil.updatePincodeDetails(this);
		}
	}

	@Override
	public PincodeDetails toEscapedModel() {
		return (PincodeDetails)ProxyUtil.newProxyInstance(PincodeDetails.class.getClassLoader(),
			new Class[] { PincodeDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PincodeDetailsClp clone = new PincodeDetailsClp();

		clone.setPIN_ID(getPIN_ID());
		clone.setCITY_ID(getCITY_ID());
		clone.setSTATE_ID(getSTATE_ID());
		clone.setPIN_CODE(getPIN_CODE());

		return clone;
	}

	@Override
	public int compareTo(PincodeDetails pincodeDetails) {
		int primaryKey = pincodeDetails.getPrimaryKey();

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

		if (!(obj instanceof PincodeDetailsClp)) {
			return false;
		}

		PincodeDetailsClp pincodeDetails = (PincodeDetailsClp)obj;

		int primaryKey = pincodeDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{PIN_ID=");
		sb.append(getPIN_ID());
		sb.append(", CITY_ID=");
		sb.append(getCITY_ID());
		sb.append(", STATE_ID=");
		sb.append(getSTATE_ID());
		sb.append(", PIN_CODE=");
		sb.append(getPIN_CODE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PincodeDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PIN_ID</column-name><column-value><![CDATA[");
		sb.append(getPIN_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY_ID</column-name><column-value><![CDATA[");
		sb.append(getCITY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PIN_CODE</column-name><column-value><![CDATA[");
		sb.append(getPIN_CODE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _PIN_ID;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _PIN_CODE;
	private BaseModel<?> _pincodeDetailsRemoteModel;
}