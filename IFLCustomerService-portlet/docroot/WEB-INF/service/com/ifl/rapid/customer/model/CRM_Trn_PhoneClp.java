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

import com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalServiceUtil;
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
public class CRM_Trn_PhoneClp extends BaseModelImpl<CRM_Trn_Phone>
	implements CRM_Trn_Phone {
	public CRM_Trn_PhoneClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_Phone.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_Phone.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _PhoneId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPhoneId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PhoneId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PhoneId", getPhoneId());
		attributes.put("ContactId", getContactId());
		attributes.put("PhoneType", getPhoneType());
		attributes.put("PhoneNumber", getPhoneNumber());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PhoneId = (Integer)attributes.get("PhoneId");

		if (PhoneId != null) {
			setPhoneId(PhoneId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer PhoneType = (Integer)attributes.get("PhoneType");

		if (PhoneType != null) {
			setPhoneType(PhoneType);
		}

		String PhoneNumber = (String)attributes.get("PhoneNumber");

		if (PhoneNumber != null) {
			setPhoneNumber(PhoneNumber);
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
	public int getPhoneId() {
		return _PhoneId;
	}

	@Override
	public void setPhoneId(int PhoneId) {
		_PhoneId = PhoneId;

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneId", int.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, PhoneId);
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

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPhoneType() {
		return _PhoneType;
	}

	@Override
	public void setPhoneType(int PhoneType) {
		_PhoneType = PhoneType;

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneType", int.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, PhoneType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhoneNumber() {
		return _PhoneNumber;
	}

	@Override
	public void setPhoneNumber(String PhoneNumber) {
		_PhoneNumber = PhoneNumber;

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneNumber", String.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, PhoneNumber);
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

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, CreatedBy);
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

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, CreatedDate);
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

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, ModifiedBy);
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

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, ModifiedDate);
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

		if (_crm_Trn_PhoneRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_crm_Trn_PhoneRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCRM_Trn_PhoneRemoteModel() {
		return _crm_Trn_PhoneRemoteModel;
	}

	public void setCRM_Trn_PhoneRemoteModel(
		BaseModel<?> crm_Trn_PhoneRemoteModel) {
		_crm_Trn_PhoneRemoteModel = crm_Trn_PhoneRemoteModel;
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

		Class<?> remoteModelClass = _crm_Trn_PhoneRemoteModel.getClass();

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

		Object returnValue = method.invoke(_crm_Trn_PhoneRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRM_Trn_PhoneLocalServiceUtil.addCRM_Trn_Phone(this);
		}
		else {
			CRM_Trn_PhoneLocalServiceUtil.updateCRM_Trn_Phone(this);
		}
	}

	@Override
	public CRM_Trn_Phone toEscapedModel() {
		return (CRM_Trn_Phone)ProxyUtil.newProxyInstance(CRM_Trn_Phone.class.getClassLoader(),
			new Class[] { CRM_Trn_Phone.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CRM_Trn_PhoneClp clone = new CRM_Trn_PhoneClp();

		clone.setPhoneId(getPhoneId());
		clone.setContactId(getContactId());
		clone.setPhoneType(getPhoneType());
		clone.setPhoneNumber(getPhoneNumber());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(CRM_Trn_Phone crm_Trn_Phone) {
		int primaryKey = crm_Trn_Phone.getPrimaryKey();

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

		if (!(obj instanceof CRM_Trn_PhoneClp)) {
			return false;
		}

		CRM_Trn_PhoneClp crm_Trn_Phone = (CRM_Trn_PhoneClp)obj;

		int primaryKey = crm_Trn_Phone.getPrimaryKey();

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

		sb.append("{PhoneId=");
		sb.append(getPhoneId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", PhoneType=");
		sb.append(getPhoneType());
		sb.append(", PhoneNumber=");
		sb.append(getPhoneNumber());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.CRM_Trn_Phone");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PhoneId</column-name><column-value><![CDATA[");
		sb.append(getPhoneId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhoneType</column-name><column-value><![CDATA[");
		sb.append(getPhoneType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
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

	private int _PhoneId;
	private int _ContactId;
	private int _PhoneType;
	private String _PhoneNumber;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private BaseModel<?> _crm_Trn_PhoneRemoteModel;
}