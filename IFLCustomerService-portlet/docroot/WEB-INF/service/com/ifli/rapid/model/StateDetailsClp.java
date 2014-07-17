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
import com.ifli.rapid.service.StateDetailsLocalServiceUtil;

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
public class StateDetailsClp extends BaseModelImpl<StateDetails>
	implements StateDetails {
	public StateDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StateDetails.class;
	}

	@Override
	public String getModelClassName() {
		return StateDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _STATE_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSTATE_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _STATE_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("STATE_NAME", getSTATE_NAME());
		attributes.put("STATE_CODE", getSTATE_CODE());
		attributes.put("BRANCH_FLAG", getBRANCH_FLAG());
		attributes.put("MEDICAL_CENTER_FLAG", getMEDICAL_CENTER_FLAG());
		attributes.put("DROP_BOX_FLAG", getDROP_BOX_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String STATE_NAME = (String)attributes.get("STATE_NAME");

		if (STATE_NAME != null) {
			setSTATE_NAME(STATE_NAME);
		}

		String STATE_CODE = (String)attributes.get("STATE_CODE");

		if (STATE_CODE != null) {
			setSTATE_CODE(STATE_CODE);
		}

		String BRANCH_FLAG = (String)attributes.get("BRANCH_FLAG");

		if (BRANCH_FLAG != null) {
			setBRANCH_FLAG(BRANCH_FLAG);
		}

		String MEDICAL_CENTER_FLAG = (String)attributes.get(
				"MEDICAL_CENTER_FLAG");

		if (MEDICAL_CENTER_FLAG != null) {
			setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
		}

		String DROP_BOX_FLAG = (String)attributes.get("DROP_BOX_FLAG");

		if (DROP_BOX_FLAG != null) {
			setDROP_BOX_FLAG(DROP_BOX_FLAG);
		}
	}

	@Override
	public int getSTATE_ID() {
		return _STATE_ID;
	}

	@Override
	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;

		if (_stateDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _stateDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_ID", int.class);

				method.invoke(_stateDetailsRemoteModel, STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSTATE_NAME() {
		return _STATE_NAME;
	}

	@Override
	public void setSTATE_NAME(String STATE_NAME) {
		_STATE_NAME = STATE_NAME;

		if (_stateDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _stateDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_NAME", String.class);

				method.invoke(_stateDetailsRemoteModel, STATE_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSTATE_CODE() {
		return _STATE_CODE;
	}

	@Override
	public void setSTATE_CODE(String STATE_CODE) {
		_STATE_CODE = STATE_CODE;

		if (_stateDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _stateDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_CODE", String.class);

				method.invoke(_stateDetailsRemoteModel, STATE_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_FLAG() {
		return _BRANCH_FLAG;
	}

	@Override
	public void setBRANCH_FLAG(String BRANCH_FLAG) {
		_BRANCH_FLAG = BRANCH_FLAG;

		if (_stateDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _stateDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_FLAG", String.class);

				method.invoke(_stateDetailsRemoteModel, BRANCH_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMEDICAL_CENTER_FLAG() {
		return _MEDICAL_CENTER_FLAG;
	}

	@Override
	public void setMEDICAL_CENTER_FLAG(String MEDICAL_CENTER_FLAG) {
		_MEDICAL_CENTER_FLAG = MEDICAL_CENTER_FLAG;

		if (_stateDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _stateDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setMEDICAL_CENTER_FLAG",
						String.class);

				method.invoke(_stateDetailsRemoteModel, MEDICAL_CENTER_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDROP_BOX_FLAG() {
		return _DROP_BOX_FLAG;
	}

	@Override
	public void setDROP_BOX_FLAG(String DROP_BOX_FLAG) {
		_DROP_BOX_FLAG = DROP_BOX_FLAG;

		if (_stateDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _stateDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDROP_BOX_FLAG", String.class);

				method.invoke(_stateDetailsRemoteModel, DROP_BOX_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStateDetailsRemoteModel() {
		return _stateDetailsRemoteModel;
	}

	public void setStateDetailsRemoteModel(BaseModel<?> stateDetailsRemoteModel) {
		_stateDetailsRemoteModel = stateDetailsRemoteModel;
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

		Class<?> remoteModelClass = _stateDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_stateDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StateDetailsLocalServiceUtil.addStateDetails(this);
		}
		else {
			StateDetailsLocalServiceUtil.updateStateDetails(this);
		}
	}

	@Override
	public StateDetails toEscapedModel() {
		return (StateDetails)ProxyUtil.newProxyInstance(StateDetails.class.getClassLoader(),
			new Class[] { StateDetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StateDetailsClp clone = new StateDetailsClp();

		clone.setSTATE_ID(getSTATE_ID());
		clone.setSTATE_NAME(getSTATE_NAME());
		clone.setSTATE_CODE(getSTATE_CODE());
		clone.setBRANCH_FLAG(getBRANCH_FLAG());
		clone.setMEDICAL_CENTER_FLAG(getMEDICAL_CENTER_FLAG());
		clone.setDROP_BOX_FLAG(getDROP_BOX_FLAG());

		return clone;
	}

	@Override
	public int compareTo(StateDetails stateDetails) {
		int primaryKey = stateDetails.getPrimaryKey();

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

		if (!(obj instanceof StateDetailsClp)) {
			return false;
		}

		StateDetailsClp stateDetails = (StateDetailsClp)obj;

		int primaryKey = stateDetails.getPrimaryKey();

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

		sb.append("{STATE_ID=");
		sb.append(getSTATE_ID());
		sb.append(", STATE_NAME=");
		sb.append(getSTATE_NAME());
		sb.append(", STATE_CODE=");
		sb.append(getSTATE_CODE());
		sb.append(", BRANCH_FLAG=");
		sb.append(getBRANCH_FLAG());
		sb.append(", MEDICAL_CENTER_FLAG=");
		sb.append(getMEDICAL_CENTER_FLAG());
		sb.append(", DROP_BOX_FLAG=");
		sb.append(getDROP_BOX_FLAG());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.StateDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>STATE_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE_NAME</column-name><column-value><![CDATA[");
		sb.append(getSTATE_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE_CODE</column-name><column-value><![CDATA[");
		sb.append(getSTATE_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_FLAG</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_FLAG());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MEDICAL_CENTER_FLAG</column-name><column-value><![CDATA[");
		sb.append(getMEDICAL_CENTER_FLAG());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DROP_BOX_FLAG</column-name><column-value><![CDATA[");
		sb.append(getDROP_BOX_FLAG());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _STATE_ID;
	private String _STATE_NAME;
	private String _STATE_CODE;
	private String _BRANCH_FLAG;
	private String _MEDICAL_CENTER_FLAG;
	private String _DROP_BOX_FLAG;
	private BaseModel<?> _stateDetailsRemoteModel;
}