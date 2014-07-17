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
import com.ifli.rapid.service.ServiceMasterLocalServiceUtil;

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
public class ServiceMasterClp extends BaseModelImpl<ServiceMaster>
	implements ServiceMaster {
	public ServiceMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _SERVICE_MASTER_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSERVICE_MASTER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _SERVICE_MASTER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SERVICE_MASTER_ID", getSERVICE_MASTER_ID());
		attributes.put("SERVICE_MASTER_NAME", getSERVICE_MASTER_NAME());
		attributes.put("SERVICE_MASTER_DESC", getSERVICE_MASTER_DESC());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SERVICE_MASTER_ID = (Integer)attributes.get("SERVICE_MASTER_ID");

		if (SERVICE_MASTER_ID != null) {
			setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
		}

		String SERVICE_MASTER_NAME = (String)attributes.get(
				"SERVICE_MASTER_NAME");

		if (SERVICE_MASTER_NAME != null) {
			setSERVICE_MASTER_NAME(SERVICE_MASTER_NAME);
		}

		String SERVICE_MASTER_DESC = (String)attributes.get(
				"SERVICE_MASTER_DESC");

		if (SERVICE_MASTER_DESC != null) {
			setSERVICE_MASTER_DESC(SERVICE_MASTER_DESC);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}
	}

	@Override
	public int getSERVICE_MASTER_ID() {
		return _SERVICE_MASTER_ID;
	}

	@Override
	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_SERVICE_MASTER_ID = SERVICE_MASTER_ID;

		if (_serviceMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSERVICE_MASTER_ID",
						int.class);

				method.invoke(_serviceMasterRemoteModel, SERVICE_MASTER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSERVICE_MASTER_NAME() {
		return _SERVICE_MASTER_NAME;
	}

	@Override
	public void setSERVICE_MASTER_NAME(String SERVICE_MASTER_NAME) {
		_SERVICE_MASTER_NAME = SERVICE_MASTER_NAME;

		if (_serviceMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSERVICE_MASTER_NAME",
						String.class);

				method.invoke(_serviceMasterRemoteModel, SERVICE_MASTER_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSERVICE_MASTER_DESC() {
		return _SERVICE_MASTER_DESC;
	}

	@Override
	public void setSERVICE_MASTER_DESC(String SERVICE_MASTER_DESC) {
		_SERVICE_MASTER_DESC = SERVICE_MASTER_DESC;

		if (_serviceMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSERVICE_MASTER_DESC",
						String.class);

				method.invoke(_serviceMasterRemoteModel, SERVICE_MASTER_DESC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getACTIVE_FLAG() {
		return _ACTIVE_FLAG;
	}

	@Override
	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;

		if (_serviceMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setACTIVE_FLAG", String.class);

				method.invoke(_serviceMasterRemoteModel, ACTIVE_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getServiceMasterRemoteModel() {
		return _serviceMasterRemoteModel;
	}

	public void setServiceMasterRemoteModel(
		BaseModel<?> serviceMasterRemoteModel) {
		_serviceMasterRemoteModel = serviceMasterRemoteModel;
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

		Class<?> remoteModelClass = _serviceMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_serviceMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceMasterLocalServiceUtil.addServiceMaster(this);
		}
		else {
			ServiceMasterLocalServiceUtil.updateServiceMaster(this);
		}
	}

	@Override
	public ServiceMaster toEscapedModel() {
		return (ServiceMaster)ProxyUtil.newProxyInstance(ServiceMaster.class.getClassLoader(),
			new Class[] { ServiceMaster.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceMasterClp clone = new ServiceMasterClp();

		clone.setSERVICE_MASTER_ID(getSERVICE_MASTER_ID());
		clone.setSERVICE_MASTER_NAME(getSERVICE_MASTER_NAME());
		clone.setSERVICE_MASTER_DESC(getSERVICE_MASTER_DESC());
		clone.setACTIVE_FLAG(getACTIVE_FLAG());

		return clone;
	}

	@Override
	public int compareTo(ServiceMaster serviceMaster) {
		int primaryKey = serviceMaster.getPrimaryKey();

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

		if (!(obj instanceof ServiceMasterClp)) {
			return false;
		}

		ServiceMasterClp serviceMaster = (ServiceMasterClp)obj;

		int primaryKey = serviceMaster.getPrimaryKey();

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

		sb.append("{SERVICE_MASTER_ID=");
		sb.append(getSERVICE_MASTER_ID());
		sb.append(", SERVICE_MASTER_NAME=");
		sb.append(getSERVICE_MASTER_NAME());
		sb.append(", SERVICE_MASTER_DESC=");
		sb.append(getSERVICE_MASTER_DESC());
		sb.append(", ACTIVE_FLAG=");
		sb.append(getACTIVE_FLAG());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ServiceMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>SERVICE_MASTER_ID</column-name><column-value><![CDATA[");
		sb.append(getSERVICE_MASTER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SERVICE_MASTER_NAME</column-name><column-value><![CDATA[");
		sb.append(getSERVICE_MASTER_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SERVICE_MASTER_DESC</column-name><column-value><![CDATA[");
		sb.append(getSERVICE_MASTER_DESC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ACTIVE_FLAG</column-name><column-value><![CDATA[");
		sb.append(getACTIVE_FLAG());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _SERVICE_MASTER_ID;
	private String _SERVICE_MASTER_NAME;
	private String _SERVICE_MASTER_DESC;
	private String _ACTIVE_FLAG;
	private BaseModel<?> _serviceMasterRemoteModel;
}