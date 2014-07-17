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
import com.ifl.rapid.customer.service.LocMstBranchLocationLocalServiceUtil;

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
public class LocMstBranchLocationClp extends BaseModelImpl<LocMstBranchLocation>
	implements LocMstBranchLocation {
	public LocMstBranchLocationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LocMstBranchLocation.class;
	}

	@Override
	public String getModelClassName() {
		return LocMstBranchLocation.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _BranchId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setBranchId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _BranchId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("BranchId", getBranchId());
		attributes.put("BranchName", getBranchName());
		attributes.put("BranchOpeningTime", getBranchOpeningTime());
		attributes.put("BranchClosingTime", getBranchClosingTime());
		attributes.put("AddressFirstLine", getAddressFirstLine());
		attributes.put("AddressSecondLine", getAddressSecondLine());
		attributes.put("PrimaryContactNo", getPrimaryContactNo());
		attributes.put("OtherContactNo", getOtherContactNo());
		attributes.put("FaxNumber", getFaxNumber());
		attributes.put("LocationId", getLocationId());
		attributes.put("LocationId_old", getLocationId_old());
		attributes.put("Longitude", getLongitude());
		attributes.put("Latitude", getLatitude());
		attributes.put("BranchCode", getBranchCode());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer BranchId = (Integer)attributes.get("BranchId");

		if (BranchId != null) {
			setBranchId(BranchId);
		}

		String BranchName = (String)attributes.get("BranchName");

		if (BranchName != null) {
			setBranchName(BranchName);
		}

		String BranchOpeningTime = (String)attributes.get("BranchOpeningTime");

		if (BranchOpeningTime != null) {
			setBranchOpeningTime(BranchOpeningTime);
		}

		String BranchClosingTime = (String)attributes.get("BranchClosingTime");

		if (BranchClosingTime != null) {
			setBranchClosingTime(BranchClosingTime);
		}

		String AddressFirstLine = (String)attributes.get("AddressFirstLine");

		if (AddressFirstLine != null) {
			setAddressFirstLine(AddressFirstLine);
		}

		String AddressSecondLine = (String)attributes.get("AddressSecondLine");

		if (AddressSecondLine != null) {
			setAddressSecondLine(AddressSecondLine);
		}

		String PrimaryContactNo = (String)attributes.get("PrimaryContactNo");

		if (PrimaryContactNo != null) {
			setPrimaryContactNo(PrimaryContactNo);
		}

		String OtherContactNo = (String)attributes.get("OtherContactNo");

		if (OtherContactNo != null) {
			setOtherContactNo(OtherContactNo);
		}

		String FaxNumber = (String)attributes.get("FaxNumber");

		if (FaxNumber != null) {
			setFaxNumber(FaxNumber);
		}

		Integer LocationId = (Integer)attributes.get("LocationId");

		if (LocationId != null) {
			setLocationId(LocationId);
		}

		String LocationId_old = (String)attributes.get("LocationId_old");

		if (LocationId_old != null) {
			setLocationId_old(LocationId_old);
		}

		Double Longitude = (Double)attributes.get("Longitude");

		if (Longitude != null) {
			setLongitude(Longitude);
		}

		Double Latitude = (Double)attributes.get("Latitude");

		if (Latitude != null) {
			setLatitude(Latitude);
		}

		String BranchCode = (String)attributes.get("BranchCode");

		if (BranchCode != null) {
			setBranchCode(BranchCode);
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
	public int getBranchId() {
		return _BranchId;
	}

	@Override
	public void setBranchId(int BranchId) {
		_BranchId = BranchId;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setBranchId", int.class);

				method.invoke(_locMstBranchLocationRemoteModel, BranchId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranchName() {
		return _BranchName;
	}

	@Override
	public void setBranchName(String BranchName) {
		_BranchName = BranchName;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setBranchName", String.class);

				method.invoke(_locMstBranchLocationRemoteModel, BranchName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranchOpeningTime() {
		return _BranchOpeningTime;
	}

	@Override
	public void setBranchOpeningTime(String BranchOpeningTime) {
		_BranchOpeningTime = BranchOpeningTime;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setBranchOpeningTime",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel,
					BranchOpeningTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranchClosingTime() {
		return _BranchClosingTime;
	}

	@Override
	public void setBranchClosingTime(String BranchClosingTime) {
		_BranchClosingTime = BranchClosingTime;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setBranchClosingTime",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel,
					BranchClosingTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressFirstLine() {
		return _AddressFirstLine;
	}

	@Override
	public void setAddressFirstLine(String AddressFirstLine) {
		_AddressFirstLine = AddressFirstLine;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressFirstLine",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel, AddressFirstLine);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressSecondLine() {
		return _AddressSecondLine;
	}

	@Override
	public void setAddressSecondLine(String AddressSecondLine) {
		_AddressSecondLine = AddressSecondLine;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressSecondLine",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel,
					AddressSecondLine);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPrimaryContactNo() {
		return _PrimaryContactNo;
	}

	@Override
	public void setPrimaryContactNo(String PrimaryContactNo) {
		_PrimaryContactNo = PrimaryContactNo;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setPrimaryContactNo",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel, PrimaryContactNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOtherContactNo() {
		return _OtherContactNo;
	}

	@Override
	public void setOtherContactNo(String OtherContactNo) {
		_OtherContactNo = OtherContactNo;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setOtherContactNo",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel, OtherContactNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFaxNumber() {
		return _FaxNumber;
	}

	@Override
	public void setFaxNumber(String FaxNumber) {
		_FaxNumber = FaxNumber;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setFaxNumber", String.class);

				method.invoke(_locMstBranchLocationRemoteModel, FaxNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLocationId() {
		return _LocationId;
	}

	@Override
	public void setLocationId(int LocationId) {
		_LocationId = LocationId;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId", int.class);

				method.invoke(_locMstBranchLocationRemoteModel, LocationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocationId_old() {
		return _LocationId_old;
	}

	@Override
	public void setLocationId_old(String LocationId_old) {
		_LocationId_old = LocationId_old;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId_old",
						String.class);

				method.invoke(_locMstBranchLocationRemoteModel, LocationId_old);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLongitude", double.class);

				method.invoke(_locMstBranchLocationRemoteModel, Longitude);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setLatitude", double.class);

				method.invoke(_locMstBranchLocationRemoteModel, Latitude);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranchCode() {
		return _BranchCode;
	}

	@Override
	public void setBranchCode(String BranchCode) {
		_BranchCode = BranchCode;

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setBranchCode", String.class);

				method.invoke(_locMstBranchLocationRemoteModel, BranchCode);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_locMstBranchLocationRemoteModel, CreatedBy);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_locMstBranchLocationRemoteModel, CreatedDate);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_locMstBranchLocationRemoteModel, ModifiedBy);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_locMstBranchLocationRemoteModel, ModifiedDate);
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

		if (_locMstBranchLocationRemoteModel != null) {
			try {
				Class<?> clazz = _locMstBranchLocationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_locMstBranchLocationRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLocMstBranchLocationRemoteModel() {
		return _locMstBranchLocationRemoteModel;
	}

	public void setLocMstBranchLocationRemoteModel(
		BaseModel<?> locMstBranchLocationRemoteModel) {
		_locMstBranchLocationRemoteModel = locMstBranchLocationRemoteModel;
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

		Class<?> remoteModelClass = _locMstBranchLocationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_locMstBranchLocationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LocMstBranchLocationLocalServiceUtil.addLocMstBranchLocation(this);
		}
		else {
			LocMstBranchLocationLocalServiceUtil.updateLocMstBranchLocation(this);
		}
	}

	@Override
	public LocMstBranchLocation toEscapedModel() {
		return (LocMstBranchLocation)ProxyUtil.newProxyInstance(LocMstBranchLocation.class.getClassLoader(),
			new Class[] { LocMstBranchLocation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LocMstBranchLocationClp clone = new LocMstBranchLocationClp();

		clone.setBranchId(getBranchId());
		clone.setBranchName(getBranchName());
		clone.setBranchOpeningTime(getBranchOpeningTime());
		clone.setBranchClosingTime(getBranchClosingTime());
		clone.setAddressFirstLine(getAddressFirstLine());
		clone.setAddressSecondLine(getAddressSecondLine());
		clone.setPrimaryContactNo(getPrimaryContactNo());
		clone.setOtherContactNo(getOtherContactNo());
		clone.setFaxNumber(getFaxNumber());
		clone.setLocationId(getLocationId());
		clone.setLocationId_old(getLocationId_old());
		clone.setLongitude(getLongitude());
		clone.setLatitude(getLatitude());
		clone.setBranchCode(getBranchCode());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(LocMstBranchLocation locMstBranchLocation) {
		int primaryKey = locMstBranchLocation.getPrimaryKey();

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

		if (!(obj instanceof LocMstBranchLocationClp)) {
			return false;
		}

		LocMstBranchLocationClp locMstBranchLocation = (LocMstBranchLocationClp)obj;

		int primaryKey = locMstBranchLocation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{BranchId=");
		sb.append(getBranchId());
		sb.append(", BranchName=");
		sb.append(getBranchName());
		sb.append(", BranchOpeningTime=");
		sb.append(getBranchOpeningTime());
		sb.append(", BranchClosingTime=");
		sb.append(getBranchClosingTime());
		sb.append(", AddressFirstLine=");
		sb.append(getAddressFirstLine());
		sb.append(", AddressSecondLine=");
		sb.append(getAddressSecondLine());
		sb.append(", PrimaryContactNo=");
		sb.append(getPrimaryContactNo());
		sb.append(", OtherContactNo=");
		sb.append(getOtherContactNo());
		sb.append(", FaxNumber=");
		sb.append(getFaxNumber());
		sb.append(", LocationId=");
		sb.append(getLocationId());
		sb.append(", LocationId_old=");
		sb.append(getLocationId_old());
		sb.append(", Longitude=");
		sb.append(getLongitude());
		sb.append(", Latitude=");
		sb.append(getLatitude());
		sb.append(", BranchCode=");
		sb.append(getBranchCode());
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
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.LocMstBranchLocation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>BranchId</column-name><column-value><![CDATA[");
		sb.append(getBranchId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BranchName</column-name><column-value><![CDATA[");
		sb.append(getBranchName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BranchOpeningTime</column-name><column-value><![CDATA[");
		sb.append(getBranchOpeningTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BranchClosingTime</column-name><column-value><![CDATA[");
		sb.append(getBranchClosingTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressFirstLine</column-name><column-value><![CDATA[");
		sb.append(getAddressFirstLine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressSecondLine</column-name><column-value><![CDATA[");
		sb.append(getAddressSecondLine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PrimaryContactNo</column-name><column-value><![CDATA[");
		sb.append(getPrimaryContactNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OtherContactNo</column-name><column-value><![CDATA[");
		sb.append(getOtherContactNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FaxNumber</column-name><column-value><![CDATA[");
		sb.append(getFaxNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LocationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LocationId_old</column-name><column-value><![CDATA[");
		sb.append(getLocationId_old());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Longitude</column-name><column-value><![CDATA[");
		sb.append(getLongitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Latitude</column-name><column-value><![CDATA[");
		sb.append(getLatitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BranchCode</column-name><column-value><![CDATA[");
		sb.append(getBranchCode());
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

	private int _BranchId;
	private String _BranchName;
	private String _BranchOpeningTime;
	private String _BranchClosingTime;
	private String _AddressFirstLine;
	private String _AddressSecondLine;
	private String _PrimaryContactNo;
	private String _OtherContactNo;
	private String _FaxNumber;
	private int _LocationId;
	private String _LocationId_old;
	private double _Longitude;
	private double _Latitude;
	private String _BranchCode;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private BaseModel<?> _locMstBranchLocationRemoteModel;
}