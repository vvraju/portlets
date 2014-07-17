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
import com.ifli.rapid.service.ServiceSubMasterLocalServiceUtil;

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
public class ServiceSubMasterClp extends BaseModelImpl<ServiceSubMaster>
	implements ServiceSubMaster {
	public ServiceSubMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceSubMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceSubMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _SUBMASTER_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSUBMASTER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _SUBMASTER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SUBMASTER_ID", getSUBMASTER_ID());
		attributes.put("SUBMASTER_NAME", getSUBMASTER_NAME());
		attributes.put("SUBMASTER_URL", getSUBMASTER_URL());
		attributes.put("SERVICE_MASTER_ID", getSERVICE_MASTER_ID());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SUBMASTER_ID = (Integer)attributes.get("SUBMASTER_ID");

		if (SUBMASTER_ID != null) {
			setSUBMASTER_ID(SUBMASTER_ID);
		}

		String SUBMASTER_NAME = (String)attributes.get("SUBMASTER_NAME");

		if (SUBMASTER_NAME != null) {
			setSUBMASTER_NAME(SUBMASTER_NAME);
		}

		String SUBMASTER_URL = (String)attributes.get("SUBMASTER_URL");

		if (SUBMASTER_URL != null) {
			setSUBMASTER_URL(SUBMASTER_URL);
		}

		Integer SERVICE_MASTER_ID = (Integer)attributes.get("SERVICE_MASTER_ID");

		if (SERVICE_MASTER_ID != null) {
			setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}
	}

	@Override
	public int getSUBMASTER_ID() {
		return _SUBMASTER_ID;
	}

	@Override
	public void setSUBMASTER_ID(int SUBMASTER_ID) {
		_SUBMASTER_ID = SUBMASTER_ID;

		if (_serviceSubMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceSubMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSUBMASTER_ID", int.class);

				method.invoke(_serviceSubMasterRemoteModel, SUBMASTER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSUBMASTER_NAME() {
		return _SUBMASTER_NAME;
	}

	@Override
	public void setSUBMASTER_NAME(String SUBMASTER_NAME) {
		_SUBMASTER_NAME = SUBMASTER_NAME;

		if (_serviceSubMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceSubMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSUBMASTER_NAME",
						String.class);

				method.invoke(_serviceSubMasterRemoteModel, SUBMASTER_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSUBMASTER_URL() {
		return _SUBMASTER_URL;
	}

	@Override
	public void setSUBMASTER_URL(String SUBMASTER_URL) {
		_SUBMASTER_URL = SUBMASTER_URL;

		if (_serviceSubMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceSubMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSUBMASTER_URL", String.class);

				method.invoke(_serviceSubMasterRemoteModel, SUBMASTER_URL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSERVICE_MASTER_ID() {
		return _SERVICE_MASTER_ID;
	}

	@Override
	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_SERVICE_MASTER_ID = SERVICE_MASTER_ID;

		if (_serviceSubMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceSubMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSERVICE_MASTER_ID",
						int.class);

				method.invoke(_serviceSubMasterRemoteModel, SERVICE_MASTER_ID);
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

		if (_serviceSubMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceSubMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setACTIVE_FLAG", String.class);

				method.invoke(_serviceSubMasterRemoteModel, ACTIVE_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getServiceSubMasterRemoteModel() {
		return _serviceSubMasterRemoteModel;
	}

	public void setServiceSubMasterRemoteModel(
		BaseModel<?> serviceSubMasterRemoteModel) {
		_serviceSubMasterRemoteModel = serviceSubMasterRemoteModel;
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

		Class<?> remoteModelClass = _serviceSubMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_serviceSubMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceSubMasterLocalServiceUtil.addServiceSubMaster(this);
		}
		else {
			ServiceSubMasterLocalServiceUtil.updateServiceSubMaster(this);
		}
	}

	@Override
	public ServiceSubMaster toEscapedModel() {
		return (ServiceSubMaster)ProxyUtil.newProxyInstance(ServiceSubMaster.class.getClassLoader(),
			new Class[] { ServiceSubMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceSubMasterClp clone = new ServiceSubMasterClp();

		clone.setSUBMASTER_ID(getSUBMASTER_ID());
		clone.setSUBMASTER_NAME(getSUBMASTER_NAME());
		clone.setSUBMASTER_URL(getSUBMASTER_URL());
		clone.setSERVICE_MASTER_ID(getSERVICE_MASTER_ID());
		clone.setACTIVE_FLAG(getACTIVE_FLAG());

		return clone;
	}

	@Override
	public int compareTo(ServiceSubMaster serviceSubMaster) {
		int primaryKey = serviceSubMaster.getPrimaryKey();

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

		if (!(obj instanceof ServiceSubMasterClp)) {
			return false;
		}

		ServiceSubMasterClp serviceSubMaster = (ServiceSubMasterClp)obj;

		int primaryKey = serviceSubMaster.getPrimaryKey();

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

		sb.append("{SUBMASTER_ID=");
		sb.append(getSUBMASTER_ID());
		sb.append(", SUBMASTER_NAME=");
		sb.append(getSUBMASTER_NAME());
		sb.append(", SUBMASTER_URL=");
		sb.append(getSUBMASTER_URL());
		sb.append(", SERVICE_MASTER_ID=");
		sb.append(getSERVICE_MASTER_ID());
		sb.append(", ACTIVE_FLAG=");
		sb.append(getACTIVE_FLAG());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ServiceSubMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>SUBMASTER_ID</column-name><column-value><![CDATA[");
		sb.append(getSUBMASTER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUBMASTER_NAME</column-name><column-value><![CDATA[");
		sb.append(getSUBMASTER_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUBMASTER_URL</column-name><column-value><![CDATA[");
		sb.append(getSUBMASTER_URL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SERVICE_MASTER_ID</column-name><column-value><![CDATA[");
		sb.append(getSERVICE_MASTER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ACTIVE_FLAG</column-name><column-value><![CDATA[");
		sb.append(getACTIVE_FLAG());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _SUBMASTER_ID;
	private String _SUBMASTER_NAME;
	private String _SUBMASTER_URL;
	private int _SERVICE_MASTER_ID;
	private String _ACTIVE_FLAG;
	private BaseModel<?> _serviceSubMasterRemoteModel;
}