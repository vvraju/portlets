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

import com.ifl.rapid.customer.service.CRM_Trn_AddressLocalServiceUtil;
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
public class CRM_Trn_AddressClp extends BaseModelImpl<CRM_Trn_Address>
	implements CRM_Trn_Address {
	public CRM_Trn_AddressClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_Address.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_Address.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _AddressId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _AddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AddressId", getAddressId());
		attributes.put("ContactId", getContactId());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("AddressLine1", getAddressLine1());
		attributes.put("AddressLine2", getAddressLine2());
		attributes.put("AddressLine3", getAddressLine3());
		attributes.put("District", getDistrict());
		attributes.put("StateId", getStateId());
		attributes.put("CityId", getCityId());
		attributes.put("Pincode", getPincode());
		attributes.put("CountryId", getCountryId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer AddressId = (Integer)attributes.get("AddressId");

		if (AddressId != null) {
			setAddressId(AddressId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
		}

		String AddressLine1 = (String)attributes.get("AddressLine1");

		if (AddressLine1 != null) {
			setAddressLine1(AddressLine1);
		}

		String AddressLine2 = (String)attributes.get("AddressLine2");

		if (AddressLine2 != null) {
			setAddressLine2(AddressLine2);
		}

		String AddressLine3 = (String)attributes.get("AddressLine3");

		if (AddressLine3 != null) {
			setAddressLine3(AddressLine3);
		}

		String District = (String)attributes.get("District");

		if (District != null) {
			setDistrict(District);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}

		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		String Pincode = (String)attributes.get("Pincode");

		if (Pincode != null) {
			setPincode(Pincode);
		}

		Integer CountryId = (Integer)attributes.get("CountryId");

		if (CountryId != null) {
			setCountryId(CountryId);
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
	public int getAddressId() {
		return _AddressId;
	}

	@Override
	public void setAddressId(int AddressId) {
		_AddressId = AddressId;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressId", int.class);

				method.invoke(_crm_Trn_AddressRemoteModel, AddressId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_ContactId = ContactId;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_crm_Trn_AddressRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAddressTypeId() {
		return _AddressTypeId;
	}

	@Override
	public void setAddressTypeId(int AddressTypeId) {
		_AddressTypeId = AddressTypeId;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressTypeId", int.class);

				method.invoke(_crm_Trn_AddressRemoteModel, AddressTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressLine1() {
		return _AddressLine1;
	}

	@Override
	public void setAddressLine1(String AddressLine1) {
		_AddressLine1 = AddressLine1;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressLine1", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, AddressLine1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressLine2() {
		return _AddressLine2;
	}

	@Override
	public void setAddressLine2(String AddressLine2) {
		_AddressLine2 = AddressLine2;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressLine2", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, AddressLine2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressLine3() {
		return _AddressLine3;
	}

	@Override
	public void setAddressLine3(String AddressLine3) {
		_AddressLine3 = AddressLine3;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressLine3", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, AddressLine3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrict() {
		return _District;
	}

	@Override
	public void setDistrict(String District) {
		_District = District;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrict", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, District);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setStateId", int.class);

				method.invoke(_crm_Trn_AddressRemoteModel, StateId);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCityId", int.class);

				method.invoke(_crm_Trn_AddressRemoteModel, CityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPincode() {
		return _Pincode;
	}

	@Override
	public void setPincode(String Pincode) {
		_Pincode = Pincode;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setPincode", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, Pincode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCountryId() {
		return _CountryId;
	}

	@Override
	public void setCountryId(int CountryId) {
		_CountryId = CountryId;

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryId", int.class);

				method.invoke(_crm_Trn_AddressRemoteModel, CountryId);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, IsActive);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, CreatedBy);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_crm_Trn_AddressRemoteModel, CreatedDate);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_crm_Trn_AddressRemoteModel, ModifiedBy);
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

		if (_crm_Trn_AddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_AddressRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_crm_Trn_AddressRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCRM_Trn_AddressRemoteModel() {
		return _crm_Trn_AddressRemoteModel;
	}

	public void setCRM_Trn_AddressRemoteModel(
		BaseModel<?> crm_Trn_AddressRemoteModel) {
		_crm_Trn_AddressRemoteModel = crm_Trn_AddressRemoteModel;
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

		Class<?> remoteModelClass = _crm_Trn_AddressRemoteModel.getClass();

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

		Object returnValue = method.invoke(_crm_Trn_AddressRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRM_Trn_AddressLocalServiceUtil.addCRM_Trn_Address(this);
		}
		else {
			CRM_Trn_AddressLocalServiceUtil.updateCRM_Trn_Address(this);
		}
	}

	@Override
	public CRM_Trn_Address toEscapedModel() {
		return (CRM_Trn_Address)ProxyUtil.newProxyInstance(CRM_Trn_Address.class.getClassLoader(),
			new Class[] { CRM_Trn_Address.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CRM_Trn_AddressClp clone = new CRM_Trn_AddressClp();

		clone.setAddressId(getAddressId());
		clone.setContactId(getContactId());
		clone.setAddressTypeId(getAddressTypeId());
		clone.setAddressLine1(getAddressLine1());
		clone.setAddressLine2(getAddressLine2());
		clone.setAddressLine3(getAddressLine3());
		clone.setDistrict(getDistrict());
		clone.setStateId(getStateId());
		clone.setCityId(getCityId());
		clone.setPincode(getPincode());
		clone.setCountryId(getCountryId());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(CRM_Trn_Address crm_Trn_Address) {
		int primaryKey = crm_Trn_Address.getPrimaryKey();

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

		if (!(obj instanceof CRM_Trn_AddressClp)) {
			return false;
		}

		CRM_Trn_AddressClp crm_Trn_Address = (CRM_Trn_AddressClp)obj;

		int primaryKey = crm_Trn_Address.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{AddressId=");
		sb.append(getAddressId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", AddressTypeId=");
		sb.append(getAddressTypeId());
		sb.append(", AddressLine1=");
		sb.append(getAddressLine1());
		sb.append(", AddressLine2=");
		sb.append(getAddressLine2());
		sb.append(", AddressLine3=");
		sb.append(getAddressLine3());
		sb.append(", District=");
		sb.append(getDistrict());
		sb.append(", StateId=");
		sb.append(getStateId());
		sb.append(", CityId=");
		sb.append(getCityId());
		sb.append(", Pincode=");
		sb.append(getPincode());
		sb.append(", CountryId=");
		sb.append(getCountryId());
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
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.CRM_Trn_Address");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>AddressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressTypeId</column-name><column-value><![CDATA[");
		sb.append(getAddressTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressLine1</column-name><column-value><![CDATA[");
		sb.append(getAddressLine1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressLine2</column-name><column-value><![CDATA[");
		sb.append(getAddressLine2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressLine3</column-name><column-value><![CDATA[");
		sb.append(getAddressLine3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>District</column-name><column-value><![CDATA[");
		sb.append(getDistrict());
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
			"<column><column-name>Pincode</column-name><column-value><![CDATA[");
		sb.append(getPincode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CountryId</column-name><column-value><![CDATA[");
		sb.append(getCountryId());
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

	private int _AddressId;
	private int _ContactId;
	private int _AddressTypeId;
	private String _AddressLine1;
	private String _AddressLine2;
	private String _AddressLine3;
	private String _District;
	private int _StateId;
	private int _CityId;
	private String _Pincode;
	private int _CountryId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private BaseModel<?> _crm_Trn_AddressRemoteModel;
}