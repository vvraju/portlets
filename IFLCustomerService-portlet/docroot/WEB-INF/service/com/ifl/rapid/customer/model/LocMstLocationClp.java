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
import com.ifl.rapid.customer.service.LocMstLocationLocalServiceUtil;

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
public class LocMstLocationClp extends BaseModelImpl<LocMstLocation>
	implements LocMstLocation {
	public LocMstLocationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LocMstLocation.class;
	}

	@Override
	public String getModelClassName() {
		return LocMstLocation.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _LocationId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setLocationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _LocationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LocationId", getLocationId());
		attributes.put("StateId", getStateId());
		attributes.put("CityId", getCityId());
		attributes.put("PinCode", getPinCode());
		attributes.put("AreaName", getAreaName());
		attributes.put("Latitude", getLatitude());
		attributes.put("Longitude", getLongitude());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer LocationId = (Integer)attributes.get("LocationId");

		if (LocationId != null) {
			setLocationId(LocationId);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}

		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		Integer PinCode = (Integer)attributes.get("PinCode");

		if (PinCode != null) {
			setPinCode(PinCode);
		}

		String AreaName = (String)attributes.get("AreaName");

		if (AreaName != null) {
			setAreaName(AreaName);
		}

		Double Latitude = (Double)attributes.get("Latitude");

		if (Latitude != null) {
			setLatitude(Latitude);
		}

		Double Longitude = (Double)attributes.get("Longitude");

		if (Longitude != null) {
			setLongitude(Longitude);
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
	public int getLocationId() {
		return _LocationId;
	}

	@Override
	public void setLocationId(int LocationId) {
		_LocationId = LocationId;

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId", int.class);

				method.invoke(_locMstLocationRemoteModel, LocationId);
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

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setStateId", int.class);

				method.invoke(_locMstLocationRemoteModel, StateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCityId() {
		return _CityId;
	}

	@Override
	public void setCityId(int CityId) {
		_CityId = CityId;

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setCityId", int.class);

				method.invoke(_locMstLocationRemoteModel, CityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPinCode() {
		return _PinCode;
	}

	@Override
	public void setPinCode(int PinCode) {
		_PinCode = PinCode;

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setPinCode", int.class);

				method.invoke(_locMstLocationRemoteModel, PinCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAreaName() {
		return _AreaName;
	}

	@Override
	public void setAreaName(String AreaName) {
		_AreaName = AreaName;

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setAreaName", String.class);

				method.invoke(_locMstLocationRemoteModel, AreaName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLatitude() {
		return _Latitude;
	}

	@Override
	public void setLatitude(double Latitude) {
		_Latitude = Latitude;

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLatitude", double.class);

				method.invoke(_locMstLocationRemoteModel, Latitude);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLongitude() {
		return _Longitude;
	}

	@Override
	public void setLongitude(double Longitude) {
		_Longitude = Longitude;

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLongitude", double.class);

				method.invoke(_locMstLocationRemoteModel, Longitude);
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

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_locMstLocationRemoteModel, CreatedBy);
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

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_locMstLocationRemoteModel, CreatedDate);
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

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_locMstLocationRemoteModel, ModifiedBy);
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

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_locMstLocationRemoteModel, ModifiedDate);
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

		if (_locMstLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_locMstLocationRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLocMstLocationRemoteModel() {
		return _locMstLocationRemoteModel;
	}

	public void setLocMstLocationRemoteModel(
		BaseModel<?> locMstLocationRemoteModel) {
		_locMstLocationRemoteModel = locMstLocationRemoteModel;
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

		Class<?> remoteModelClass = _locMstLocationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_locMstLocationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LocMstLocationLocalServiceUtil.addLocMstLocation(this);
		}
		else {
			LocMstLocationLocalServiceUtil.updateLocMstLocation(this);
		}
	}

	@Override
	public LocMstLocation toEscapedModel() {
		return (LocMstLocation)ProxyUtil.newProxyInstance(LocMstLocation.class.getClassLoader(),
			new Class[] { LocMstLocation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LocMstLocationClp clone = new LocMstLocationClp();

		clone.setLocationId(getLocationId());
		clone.setStateId(getStateId());
		clone.setCityId(getCityId());
		clone.setPinCode(getPinCode());
		clone.setAreaName(getAreaName());
		clone.setLatitude(getLatitude());
		clone.setLongitude(getLongitude());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(LocMstLocation locMstLocation) {
		int primaryKey = locMstLocation.getPrimaryKey();

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

		if (!(obj instanceof LocMstLocationClp)) {
			return false;
		}

		LocMstLocationClp locMstLocation = (LocMstLocationClp)obj;

		int primaryKey = locMstLocation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{LocationId=");
		sb.append(getLocationId());
		sb.append(", StateId=");
		sb.append(getStateId());
		sb.append(", CityId=");
		sb.append(getCityId());
		sb.append(", PinCode=");
		sb.append(getPinCode());
		sb.append(", AreaName=");
		sb.append(getAreaName());
		sb.append(", Latitude=");
		sb.append(getLatitude());
		sb.append(", Longitude=");
		sb.append(getLongitude());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.LocMstLocation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>LocationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CityId</column-name><column-value><![CDATA[");
		sb.append(getCityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PinCode</column-name><column-value><![CDATA[");
		sb.append(getPinCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AreaName</column-name><column-value><![CDATA[");
		sb.append(getAreaName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Latitude</column-name><column-value><![CDATA[");
		sb.append(getLatitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Longitude</column-name><column-value><![CDATA[");
		sb.append(getLongitude());
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

	private int _LocationId;
	private int _StateId;
	private int _CityId;
	private int _PinCode;
	private String _AreaName;
	private double _Latitude;
	private double _Longitude;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private BaseModel<?> _locMstLocationRemoteModel;
}