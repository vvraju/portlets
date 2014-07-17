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

import com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalServiceUtil;
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
public class CRM_Trn_PolicyAddressClp extends BaseModelImpl<CRM_Trn_PolicyAddress>
	implements CRM_Trn_PolicyAddress {
	public CRM_Trn_PolicyAddressClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_PolicyAddress.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_PolicyAddress.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _PolicyAddressId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPolicyAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PolicyAddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PolicyAddressId", getPolicyAddressId());
		attributes.put("ContactId", getContactId());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("AddressId", getAddressId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PolicyAddressId = (Integer)attributes.get("PolicyAddressId");

		if (PolicyAddressId != null) {
			setPolicyAddressId(PolicyAddressId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String PolicyNo = (String)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		Integer AddressId = (Integer)attributes.get("AddressId");

		if (AddressId != null) {
			setAddressId(AddressId);
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
	public int getPolicyAddressId() {
		return _PolicyAddressId;
	}

	@Override
	public void setPolicyAddressId(int PolicyAddressId) {
		_PolicyAddressId = PolicyAddressId;

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyAddressId", int.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, PolicyAddressId);
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

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPolicyNo() {
		return _PolicyNo;
	}

	@Override
	public void setPolicyNo(String PolicyNo) {
		_PolicyNo = PolicyNo;

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyNo", String.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, PolicyNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAddressId() {
		return _AddressId;
	}

	@Override
	public void setAddressId(int AddressId) {
		_AddressId = AddressId;

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressId", int.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, AddressId);
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

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, IsActive);
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

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, CreatedBy);
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

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, CreatedDate);
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

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, ModifiedBy);
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

		if (_crm_Trn_PolicyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_PolicyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_crm_Trn_PolicyAddressRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCRM_Trn_PolicyAddressRemoteModel() {
		return _crm_Trn_PolicyAddressRemoteModel;
	}

	public void setCRM_Trn_PolicyAddressRemoteModel(
		BaseModel<?> crm_Trn_PolicyAddressRemoteModel) {
		_crm_Trn_PolicyAddressRemoteModel = crm_Trn_PolicyAddressRemoteModel;
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

		Class<?> remoteModelClass = _crm_Trn_PolicyAddressRemoteModel.getClass();

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

		Object returnValue = method.invoke(_crm_Trn_PolicyAddressRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRM_Trn_PolicyAddressLocalServiceUtil.addCRM_Trn_PolicyAddress(this);
		}
		else {
			CRM_Trn_PolicyAddressLocalServiceUtil.updateCRM_Trn_PolicyAddress(this);
		}
	}

	@Override
	public CRM_Trn_PolicyAddress toEscapedModel() {
		return (CRM_Trn_PolicyAddress)ProxyUtil.newProxyInstance(CRM_Trn_PolicyAddress.class.getClassLoader(),
			new Class[] { CRM_Trn_PolicyAddress.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CRM_Trn_PolicyAddressClp clone = new CRM_Trn_PolicyAddressClp();

		clone.setPolicyAddressId(getPolicyAddressId());
		clone.setContactId(getContactId());
		clone.setPolicyNo(getPolicyNo());
		clone.setAddressId(getAddressId());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		int primaryKey = crm_Trn_PolicyAddress.getPrimaryKey();

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

		if (!(obj instanceof CRM_Trn_PolicyAddressClp)) {
			return false;
		}

		CRM_Trn_PolicyAddressClp crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddressClp)obj;

		int primaryKey = crm_Trn_PolicyAddress.getPrimaryKey();

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

		sb.append("{PolicyAddressId=");
		sb.append(getPolicyAddressId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", PolicyNo=");
		sb.append(getPolicyNo());
		sb.append(", AddressId=");
		sb.append(getAddressId());
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
		sb.append("com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PolicyAddressId</column-name><column-value><![CDATA[");
		sb.append(getPolicyAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyNo</column-name><column-value><![CDATA[");
		sb.append(getPolicyNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
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

	private int _PolicyAddressId;
	private int _ContactId;
	private String _PolicyNo;
	private int _AddressId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private BaseModel<?> _crm_Trn_PolicyAddressRemoteModel;
}