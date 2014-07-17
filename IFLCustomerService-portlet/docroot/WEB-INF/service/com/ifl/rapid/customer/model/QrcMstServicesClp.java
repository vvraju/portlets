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

package com.ifl.rapid.customer.model;

import com.ifl.rapid.customer.service.ClpSerializer;
import com.ifl.rapid.customer.service.QrcMstServicesLocalServiceUtil;

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
public class QrcMstServicesClp extends BaseModelImpl<QrcMstServices>
	implements QrcMstServices {
	public QrcMstServicesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstServices.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstServices.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ServiceId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ServiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ServiceId", getServiceId());
		attributes.put("ServiceName", getServiceName());
		attributes.put("Description", getDescription());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ServiceId = (Integer)attributes.get("ServiceId");

		if (ServiceId != null) {
			setServiceId(ServiceId);
		}

		String ServiceName = (String)attributes.get("ServiceName");

		if (ServiceName != null) {
			setServiceName(ServiceName);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}
	}

	@Override
	public int getServiceId() {
		return _ServiceId;
	}

	@Override
	public void setServiceId(int ServiceId) {
		_ServiceId = ServiceId;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceId", int.class);

				method.invoke(_qrcMstServicesRemoteModel, ServiceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceName() {
		return _ServiceName;
	}

	@Override
	public void setServiceName(String ServiceName) {
		_ServiceName = ServiceName;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceName", String.class);

				method.invoke(_qrcMstServicesRemoteModel, ServiceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _Description;
	}

	@Override
	public void setDescription(String Description) {
		_Description = Description;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_qrcMstServicesRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _CreatedBy;
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_qrcMstServicesRemoteModel, CreatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_qrcMstServicesRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _ModifiedBy;
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_qrcMstServicesRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_qrcMstServicesRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(String IsActive) {
		_IsActive = IsActive;

		if (_qrcMstServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_qrcMstServicesRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQrcMstServicesRemoteModel() {
		return _qrcMstServicesRemoteModel;
	}

	public void setQrcMstServicesRemoteModel(
		BaseModel<?> qrcMstServicesRemoteModel) {
		_qrcMstServicesRemoteModel = qrcMstServicesRemoteModel;
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

		Class<?> remoteModelClass = _qrcMstServicesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcMstServicesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QrcMstServicesLocalServiceUtil.addQrcMstServices(this);
		}
		else {
			QrcMstServicesLocalServiceUtil.updateQrcMstServices(this);
		}
	}

	@Override
	public QrcMstServices toEscapedModel() {
		return (QrcMstServices)ProxyUtil.newProxyInstance(QrcMstServices.class.getClassLoader(),
			new Class[] { QrcMstServices.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QrcMstServicesClp clone = new QrcMstServicesClp();

		clone.setServiceId(getServiceId());
		clone.setServiceName(getServiceName());
		clone.setDescription(getDescription());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(QrcMstServices qrcMstServices) {
		int primaryKey = qrcMstServices.getPrimaryKey();

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

		if (!(obj instanceof QrcMstServicesClp)) {
			return false;
		}

		QrcMstServicesClp qrcMstServices = (QrcMstServicesClp)obj;

		int primaryKey = qrcMstServices.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{ServiceId=");
		sb.append(getServiceId());
		sb.append(", ServiceName=");
		sb.append(getServiceName());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcMstServices");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ServiceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _ServiceId;
	private String _ServiceName;
	private String _Description;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private BaseModel<?> _qrcMstServicesRemoteModel;
}