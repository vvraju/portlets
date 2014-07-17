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
import com.ifli.rapid.service.LocationDetailsLocalServiceUtil;

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
public class LocationDetailsClp extends BaseModelImpl<LocationDetails>
	implements LocationDetails {
	public LocationDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LocationDetails.class;
	}

	@Override
	public String getModelClassName() {
		return LocationDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _LOCATION_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setLOCATION_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _LOCATION_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LOCATION_ID", getLOCATION_ID());
		attributes.put("LOCATION_NAME", getLOCATION_NAME());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("LATITUDE", getLATITUDE());
		attributes.put("LONGITUDE", getLONGITUDE());
		attributes.put("BRANCH_FLAG", getBRANCH_FLAG());
		attributes.put("MEDICAL_CENTER_FLAG", getMEDICAL_CENTER_FLAG());
		attributes.put("DROP_BOX_FLAG", getDROP_BOX_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer LOCATION_ID = (Integer)attributes.get("LOCATION_ID");

		if (LOCATION_ID != null) {
			setLOCATION_ID(LOCATION_ID);
		}

		String LOCATION_NAME = (String)attributes.get("LOCATION_NAME");

		if (LOCATION_NAME != null) {
			setLOCATION_NAME(LOCATION_NAME);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String LATITUDE = (String)attributes.get("LATITUDE");

		if (LATITUDE != null) {
			setLATITUDE(LATITUDE);
		}

		String LONGITUDE = (String)attributes.get("LONGITUDE");

		if (LONGITUDE != null) {
			setLONGITUDE(LONGITUDE);
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
	public int getLOCATION_ID() {
		return _LOCATION_ID;
	}

	@Override
	public void setLOCATION_ID(int LOCATION_ID) {
		_LOCATION_ID = LOCATION_ID;

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLOCATION_ID", int.class);

				method.invoke(_locationDetailsRemoteModel, LOCATION_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLOCATION_NAME() {
		return _LOCATION_NAME;
	}

	@Override
	public void setLOCATION_NAME(String LOCATION_NAME) {
		_LOCATION_NAME = LOCATION_NAME;

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLOCATION_NAME", String.class);

				method.invoke(_locationDetailsRemoteModel, LOCATION_NAME);
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

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY_ID", int.class);

				method.invoke(_locationDetailsRemoteModel, CITY_ID);
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

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE_ID", int.class);

				method.invoke(_locationDetailsRemoteModel, STATE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLATITUDE() {
		return _LATITUDE;
	}

	@Override
	public void setLATITUDE(String LATITUDE) {
		_LATITUDE = LATITUDE;

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLATITUDE", String.class);

				method.invoke(_locationDetailsRemoteModel, LATITUDE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLONGITUDE() {
		return _LONGITUDE;
	}

	@Override
	public void setLONGITUDE(String LONGITUDE) {
		_LONGITUDE = LONGITUDE;

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLONGITUDE", String.class);

				method.invoke(_locationDetailsRemoteModel, LONGITUDE);
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

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_FLAG", String.class);

				method.invoke(_locationDetailsRemoteModel, BRANCH_FLAG);
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

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setMEDICAL_CENTER_FLAG",
						String.class);

				method.invoke(_locationDetailsRemoteModel, MEDICAL_CENTER_FLAG);
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

		if (_locationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _locationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDROP_BOX_FLAG", String.class);

				method.invoke(_locationDetailsRemoteModel, DROP_BOX_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLocationDetailsRemoteModel() {
		return _locationDetailsRemoteModel;
	}

	public void setLocationDetailsRemoteModel(
		BaseModel<?> locationDetailsRemoteModel) {
		_locationDetailsRemoteModel = locationDetailsRemoteModel;
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

		Class<?> remoteModelClass = _locationDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_locationDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LocationDetailsLocalServiceUtil.addLocationDetails(this);
		}
		else {
			LocationDetailsLocalServiceUtil.updateLocationDetails(this);
		}
	}

	@Override
	public LocationDetails toEscapedModel() {
		return (LocationDetails)ProxyUtil.newProxyInstance(LocationDetails.class.getClassLoader(),
			new Class[] { LocationDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LocationDetailsClp clone = new LocationDetailsClp();

		clone.setLOCATION_ID(getLOCATION_ID());
		clone.setLOCATION_NAME(getLOCATION_NAME());
		clone.setCITY_ID(getCITY_ID());
		clone.setSTATE_ID(getSTATE_ID());
		clone.setLATITUDE(getLATITUDE());
		clone.setLONGITUDE(getLONGITUDE());
		clone.setBRANCH_FLAG(getBRANCH_FLAG());
		clone.setMEDICAL_CENTER_FLAG(getMEDICAL_CENTER_FLAG());
		clone.setDROP_BOX_FLAG(getDROP_BOX_FLAG());

		return clone;
	}

	@Override
	public int compareTo(LocationDetails locationDetails) {
		int primaryKey = locationDetails.getPrimaryKey();

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

		if (!(obj instanceof LocationDetailsClp)) {
			return false;
		}

		LocationDetailsClp locationDetails = (LocationDetailsClp)obj;

		int primaryKey = locationDetails.getPrimaryKey();

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

		sb.append("{LOCATION_ID=");
		sb.append(getLOCATION_ID());
		sb.append(", LOCATION_NAME=");
		sb.append(getLOCATION_NAME());
		sb.append(", CITY_ID=");
		sb.append(getCITY_ID());
		sb.append(", STATE_ID=");
		sb.append(getSTATE_ID());
		sb.append(", LATITUDE=");
		sb.append(getLATITUDE());
		sb.append(", LONGITUDE=");
		sb.append(getLONGITUDE());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.LocationDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>LOCATION_ID</column-name><column-value><![CDATA[");
		sb.append(getLOCATION_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCATION_NAME</column-name><column-value><![CDATA[");
		sb.append(getLOCATION_NAME());
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
			"<column><column-name>LATITUDE</column-name><column-value><![CDATA[");
		sb.append(getLATITUDE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LONGITUDE</column-name><column-value><![CDATA[");
		sb.append(getLONGITUDE());
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

	private int _LOCATION_ID;
	private String _LOCATION_NAME;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _LATITUDE;
	private String _LONGITUDE;
	private String _BRANCH_FLAG;
	private String _MEDICAL_CENTER_FLAG;
	private String _DROP_BOX_FLAG;
	private BaseModel<?> _locationDetailsRemoteModel;
}