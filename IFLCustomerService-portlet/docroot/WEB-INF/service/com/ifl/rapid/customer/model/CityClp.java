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

import com.ifl.rapid.customer.service.CityLocalServiceUtil;
import com.ifl.rapid.customer.service.ClpSerializer;

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
public class CityClp extends BaseModelImpl<City> implements City {
	public CityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return City.class;
	}

	@Override
	public String getModelClassName() {
		return City.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _CityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CityId", getCityId());
		attributes.put("CityCode", getCityCode());
		attributes.put("CityName", getCityName());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("StateId", getStateId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		String CityCode = (String)attributes.get("CityCode");

		if (CityCode != null) {
			setCityCode(CityCode);
		}

		String CityName = (String)attributes.get("CityName");

		if (CityName != null) {
			setCityName(CityName);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

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

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}
	}

	@Override
	public int getCityId() {
		return _CityId;
	}

	@Override
	public void setCityId(int CityId) {
		_CityId = CityId;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCityId", int.class);

				method.invoke(_cityRemoteModel, CityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityCode() {
		return _CityCode;
	}

	@Override
	public void setCityCode(String CityCode) {
		_CityCode = CityCode;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCityCode", String.class);

				method.invoke(_cityRemoteModel, CityCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityName() {
		return _CityName;
	}

	@Override
	public void setCityName(String CityName) {
		_CityName = CityName;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCityName", String.class);

				method.invoke(_cityRemoteModel, CityName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(int IsActive) {
		_IsActive = IsActive;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_cityRemoteModel, IsActive);
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

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_cityRemoteModel, CreatedBy);
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

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_cityRemoteModel, CreatedDate);
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

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_cityRemoteModel, ModifiedDate);
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

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_cityRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStateId() {
		return _StateId;
	}

	@Override
	public void setStateId(int StateId) {
		_StateId = StateId;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setStateId", int.class);

				method.invoke(_cityRemoteModel, StateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCityRemoteModel() {
		return _cityRemoteModel;
	}

	public void setCityRemoteModel(BaseModel<?> cityRemoteModel) {
		_cityRemoteModel = cityRemoteModel;
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

		Class<?> remoteModelClass = _cityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CityLocalServiceUtil.addCity(this);
		}
		else {
			CityLocalServiceUtil.updateCity(this);
		}
	}

	@Override
	public City toEscapedModel() {
		return (City)ProxyUtil.newProxyInstance(City.class.getClassLoader(),
			new Class[] { City.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CityClp clone = new CityClp();

		clone.setCityId(getCityId());
		clone.setCityCode(getCityCode());
		clone.setCityName(getCityName());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setStateId(getStateId());

		return clone;
	}

	@Override
	public int compareTo(City city) {
		int primaryKey = city.getPrimaryKey();

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

		if (!(obj instanceof CityClp)) {
			return false;
		}

		CityClp city = (CityClp)obj;

		int primaryKey = city.getPrimaryKey();

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

		sb.append("{CityId=");
		sb.append(getCityId());
		sb.append(", CityCode=");
		sb.append(getCityCode());
		sb.append(", CityName=");
		sb.append(getCityName());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", StateId=");
		sb.append(getStateId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.City");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CityId</column-name><column-value><![CDATA[");
		sb.append(getCityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CityCode</column-name><column-value><![CDATA[");
		sb.append(getCityCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CityName</column-name><column-value><![CDATA[");
		sb.append(getCityName());
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
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _CityId;
	private String _CityCode;
	private String _CityName;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private int _StateId;
	private BaseModel<?> _cityRemoteModel;
}