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
import com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalServiceUtil;

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
public class Config_Mst_GenericMasterClp extends BaseModelImpl<Config_Mst_GenericMaster>
	implements Config_Mst_GenericMaster {
	public Config_Mst_GenericMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Config_Mst_GenericMaster.class;
	}

	@Override
	public String getModelClassName() {
		return Config_Mst_GenericMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _GenericMasterId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setGenericMasterId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _GenericMasterId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GenericMasterId", getGenericMasterId());
		attributes.put("MasterType", getMasterType());
		attributes.put("MasterId", getMasterId());
		attributes.put("MasterKey", getMasterKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer GenericMasterId = (Integer)attributes.get("GenericMasterId");

		if (GenericMasterId != null) {
			setGenericMasterId(GenericMasterId);
		}

		String MasterType = (String)attributes.get("MasterType");

		if (MasterType != null) {
			setMasterType(MasterType);
		}

		Integer MasterId = (Integer)attributes.get("MasterId");

		if (MasterId != null) {
			setMasterId(MasterId);
		}

		String MasterKey = (String)attributes.get("MasterKey");

		if (MasterKey != null) {
			setMasterKey(MasterKey);
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

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	@Override
	public int getGenericMasterId() {
		return _GenericMasterId;
	}

	@Override
	public void setGenericMasterId(int GenericMasterId) {
		_GenericMasterId = GenericMasterId;

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setGenericMasterId", int.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel,
					GenericMasterId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasterType() {
		return _MasterType;
	}

	@Override
	public void setMasterType(String MasterType) {
		_MasterType = MasterType;

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterType", String.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, MasterType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMasterId() {
		return _MasterId;
	}

	@Override
	public void setMasterId(int MasterId) {
		_MasterId = MasterId;

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterId", int.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, MasterId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasterKey() {
		return _MasterKey;
	}

	@Override
	public void setMasterKey(String MasterKey) {
		_MasterKey = MasterKey;

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterKey", String.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, MasterKey);
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

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, IsActive);
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

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, CreatedBy);
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

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, CreatedDate);
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

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, ModifiedBy);
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

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, ModifiedDate);
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

		if (_config_Mst_GenericMasterRemoteModel != null) {
			try {
				Class<?> clazz = _config_Mst_GenericMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_config_Mst_GenericMasterRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getConfig_Mst_GenericMasterRemoteModel() {
		return _config_Mst_GenericMasterRemoteModel;
	}

	public void setConfig_Mst_GenericMasterRemoteModel(
		BaseModel<?> config_Mst_GenericMasterRemoteModel) {
		_config_Mst_GenericMasterRemoteModel = config_Mst_GenericMasterRemoteModel;
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

		Class<?> remoteModelClass = _config_Mst_GenericMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_config_Mst_GenericMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Config_Mst_GenericMasterLocalServiceUtil.addConfig_Mst_GenericMaster(this);
		}
		else {
			Config_Mst_GenericMasterLocalServiceUtil.updateConfig_Mst_GenericMaster(this);
		}
	}

	@Override
	public Config_Mst_GenericMaster toEscapedModel() {
		return (Config_Mst_GenericMaster)ProxyUtil.newProxyInstance(Config_Mst_GenericMaster.class.getClassLoader(),
			new Class[] { Config_Mst_GenericMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Config_Mst_GenericMasterClp clone = new Config_Mst_GenericMasterClp();

		clone.setGenericMasterId(getGenericMasterId());
		clone.setMasterType(getMasterType());
		clone.setMasterId(getMasterId());
		clone.setMasterKey(getMasterKey());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(Config_Mst_GenericMaster config_Mst_GenericMaster) {
		int primaryKey = config_Mst_GenericMaster.getPrimaryKey();

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

		if (!(obj instanceof Config_Mst_GenericMasterClp)) {
			return false;
		}

		Config_Mst_GenericMasterClp config_Mst_GenericMaster = (Config_Mst_GenericMasterClp)obj;

		int primaryKey = config_Mst_GenericMaster.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{GenericMasterId=");
		sb.append(getGenericMasterId());
		sb.append(", MasterType=");
		sb.append(getMasterType());
		sb.append(", MasterId=");
		sb.append(getMasterId());
		sb.append(", MasterKey=");
		sb.append(getMasterKey());
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
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.Config_Mst_GenericMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>GenericMasterId</column-name><column-value><![CDATA[");
		sb.append(getGenericMasterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MasterType</column-name><column-value><![CDATA[");
		sb.append(getMasterType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MasterId</column-name><column-value><![CDATA[");
		sb.append(getMasterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MasterKey</column-name><column-value><![CDATA[");
		sb.append(getMasterKey());
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
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _GenericMasterId;
	private String _MasterType;
	private int _MasterId;
	private String _MasterKey;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _Description;
	private BaseModel<?> _config_Mst_GenericMasterRemoteModel;
}