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
import com.ifl.rapid.customer.service.QrcMstSubServicesLocalServiceUtil;

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
public class QrcMstSubServicesClp extends BaseModelImpl<QrcMstSubServices>
	implements QrcMstSubServices {
	public QrcMstSubServicesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstSubServices.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstSubServices.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _SubServiceId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSubServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _SubServiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SubServiceId", getSubServiceId());
		attributes.put("SubServiceName", getSubServiceName());
		attributes.put("SubServiceUrl", getSubServiceUrl());
		attributes.put("ServiceId", getServiceId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SubServiceId = (Integer)attributes.get("SubServiceId");

		if (SubServiceId != null) {
			setSubServiceId(SubServiceId);
		}

		String SubServiceName = (String)attributes.get("SubServiceName");

		if (SubServiceName != null) {
			setSubServiceName(SubServiceName);
		}

		String SubServiceUrl = (String)attributes.get("SubServiceUrl");

		if (SubServiceUrl != null) {
			setSubServiceUrl(SubServiceUrl);
		}

		Integer ServiceId = (Integer)attributes.get("ServiceId");

		if (ServiceId != null) {
			setServiceId(ServiceId);
		}

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
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
	}

	@Override
	public int getSubServiceId() {
		return _SubServiceId;
	}

	@Override
	public void setSubServiceId(int SubServiceId) {
		_SubServiceId = SubServiceId;

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setSubServiceId", int.class);

				method.invoke(_qrcMstSubServicesRemoteModel, SubServiceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubServiceName() {
		return _SubServiceName;
	}

	@Override
	public void setSubServiceName(String SubServiceName) {
		_SubServiceName = SubServiceName;

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setSubServiceName",
						String.class);

				method.invoke(_qrcMstSubServicesRemoteModel, SubServiceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubServiceUrl() {
		return _SubServiceUrl;
	}

	@Override
	public void setSubServiceUrl(String SubServiceUrl) {
		_SubServiceUrl = SubServiceUrl;

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setSubServiceUrl", String.class);

				method.invoke(_qrcMstSubServicesRemoteModel, SubServiceUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getServiceId() {
		return _ServiceId;
	}

	@Override
	public void setServiceId(int ServiceId) {
		_ServiceId = ServiceId;

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceId", int.class);

				method.invoke(_qrcMstSubServicesRemoteModel, ServiceId);
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

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_qrcMstSubServicesRemoteModel, IsActive);
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

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_qrcMstSubServicesRemoteModel, CreatedBy);
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

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_qrcMstSubServicesRemoteModel, CreatedDate);
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

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_qrcMstSubServicesRemoteModel, ModifiedBy);
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

		if (_qrcMstSubServicesRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstSubServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_qrcMstSubServicesRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQrcMstSubServicesRemoteModel() {
		return _qrcMstSubServicesRemoteModel;
	}

	public void setQrcMstSubServicesRemoteModel(
		BaseModel<?> qrcMstSubServicesRemoteModel) {
		_qrcMstSubServicesRemoteModel = qrcMstSubServicesRemoteModel;
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

		Class<?> remoteModelClass = _qrcMstSubServicesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcMstSubServicesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QrcMstSubServicesLocalServiceUtil.addQrcMstSubServices(this);
		}
		else {
			QrcMstSubServicesLocalServiceUtil.updateQrcMstSubServices(this);
		}
	}

	@Override
	public QrcMstSubServices toEscapedModel() {
		return (QrcMstSubServices)ProxyUtil.newProxyInstance(QrcMstSubServices.class.getClassLoader(),
			new Class[] { QrcMstSubServices.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QrcMstSubServicesClp clone = new QrcMstSubServicesClp();

		clone.setSubServiceId(getSubServiceId());
		clone.setSubServiceName(getSubServiceName());
		clone.setSubServiceUrl(getSubServiceUrl());
		clone.setServiceId(getServiceId());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(QrcMstSubServices qrcMstSubServices) {
		int primaryKey = qrcMstSubServices.getPrimaryKey();

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

		if (!(obj instanceof QrcMstSubServicesClp)) {
			return false;
		}

		QrcMstSubServicesClp qrcMstSubServices = (QrcMstSubServicesClp)obj;

		int primaryKey = qrcMstSubServices.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{SubServiceId=");
		sb.append(getSubServiceId());
		sb.append(", SubServiceName=");
		sb.append(getSubServiceName());
		sb.append(", SubServiceUrl=");
		sb.append(getSubServiceUrl());
		sb.append(", ServiceId=");
		sb.append(getServiceId());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcMstSubServices");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>SubServiceId</column-name><column-value><![CDATA[");
		sb.append(getSubServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SubServiceName</column-name><column-value><![CDATA[");
		sb.append(getSubServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SubServiceUrl</column-name><column-value><![CDATA[");
		sb.append(getSubServiceUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
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

		sb.append("</model>");

		return sb.toString();
	}

	private int _SubServiceId;
	private String _SubServiceName;
	private String _SubServiceUrl;
	private int _ServiceId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private BaseModel<?> _qrcMstSubServicesRemoteModel;
}