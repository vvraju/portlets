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

import com.ifl.rapid.customer.service.CRMTrnContactCommunicationLocalServiceUtil;
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
public class CRMTrnContactCommunicationClp extends BaseModelImpl<CRMTrnContactCommunication>
	implements CRMTrnContactCommunication {
	public CRMTrnContactCommunicationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CRMTrnContactCommunication.class;
	}

	@Override
	public String getModelClassName() {
		return CRMTrnContactCommunication.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ContactCommunicationId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setContactCommunicationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ContactCommunicationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ContactCommunicationId", getContactCommunicationId());
		attributes.put("ContactId", getContactId());
		attributes.put("CommunicationMedium", getCommunicationMedium());
		attributes.put("CommunicationMediumId", getCommunicationMediumId());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ContactCommunicationId = (Integer)attributes.get(
				"ContactCommunicationId");

		if (ContactCommunicationId != null) {
			setContactCommunicationId(ContactCommunicationId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer CommunicationMedium = (Integer)attributes.get(
				"CommunicationMedium");

		if (CommunicationMedium != null) {
			setCommunicationMedium(CommunicationMedium);
		}

		String CommunicationMediumId = (String)attributes.get(
				"CommunicationMediumId");

		if (CommunicationMediumId != null) {
			setCommunicationMediumId(CommunicationMediumId);
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
	public int getContactCommunicationId() {
		return _ContactCommunicationId;
	}

	@Override
	public void setContactCommunicationId(int ContactCommunicationId) {
		_ContactCommunicationId = ContactCommunicationId;

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setContactCommunicationId",
						int.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel,
					ContactCommunicationId);
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

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCommunicationMedium() {
		return _CommunicationMedium;
	}

	@Override
	public void setCommunicationMedium(int CommunicationMedium) {
		_CommunicationMedium = CommunicationMedium;

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCommunicationMedium",
						int.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel,
					CommunicationMedium);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommunicationMediumId() {
		return _CommunicationMediumId;
	}

	@Override
	public void setCommunicationMediumId(String CommunicationMediumId) {
		_CommunicationMediumId = CommunicationMediumId;

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCommunicationMediumId",
						String.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel,
					CommunicationMediumId);
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

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel, CreatedBy);
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

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel,
					CreatedDate);
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

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel, ModifiedBy);
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

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel,
					ModifiedDate);
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

		if (_crmTrnContactCommunicationRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnContactCommunicationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_crmTrnContactCommunicationRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public com.ifl.rapid.customer.model.CRMTrnContactCommunication findByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium) {
		try {
			String methodName = "findByContactIdAndCommunicationMedium";

			Class<?>[] parameterTypes = new Class<?>[] { int.class, int.class };

			Object[] parameterValues = new Object[] {
					ContactId, CommunicationMedium
				};

			com.ifl.rapid.customer.model.CRMTrnContactCommunication returnObj = (com.ifl.rapid.customer.model.CRMTrnContactCommunication)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getCRMTrnContactCommunicationRemoteModel() {
		return _crmTrnContactCommunicationRemoteModel;
	}

	public void setCRMTrnContactCommunicationRemoteModel(
		BaseModel<?> crmTrnContactCommunicationRemoteModel) {
		_crmTrnContactCommunicationRemoteModel = crmTrnContactCommunicationRemoteModel;
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

		Class<?> remoteModelClass = _crmTrnContactCommunicationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_crmTrnContactCommunicationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRMTrnContactCommunicationLocalServiceUtil.addCRMTrnContactCommunication(this);
		}
		else {
			CRMTrnContactCommunicationLocalServiceUtil.updateCRMTrnContactCommunication(this);
		}
	}

	@Override
	public CRMTrnContactCommunication toEscapedModel() {
		return (CRMTrnContactCommunication)ProxyUtil.newProxyInstance(CRMTrnContactCommunication.class.getClassLoader(),
			new Class[] { CRMTrnContactCommunication.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CRMTrnContactCommunicationClp clone = new CRMTrnContactCommunicationClp();

		clone.setContactCommunicationId(getContactCommunicationId());
		clone.setContactId(getContactId());
		clone.setCommunicationMedium(getCommunicationMedium());
		clone.setCommunicationMediumId(getCommunicationMediumId());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(CRMTrnContactCommunication crmTrnContactCommunication) {
		int primaryKey = crmTrnContactCommunication.getPrimaryKey();

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

		if (!(obj instanceof CRMTrnContactCommunicationClp)) {
			return false;
		}

		CRMTrnContactCommunicationClp crmTrnContactCommunication = (CRMTrnContactCommunicationClp)obj;

		int primaryKey = crmTrnContactCommunication.getPrimaryKey();

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

		sb.append("{ContactCommunicationId=");
		sb.append(getContactCommunicationId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", CommunicationMedium=");
		sb.append(getCommunicationMedium());
		sb.append(", CommunicationMediumId=");
		sb.append(getCommunicationMediumId());
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
		sb.append("com.ifl.rapid.customer.model.CRMTrnContactCommunication");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ContactCommunicationId</column-name><column-value><![CDATA[");
		sb.append(getContactCommunicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CommunicationMedium</column-name><column-value><![CDATA[");
		sb.append(getCommunicationMedium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CommunicationMediumId</column-name><column-value><![CDATA[");
		sb.append(getCommunicationMediumId());
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

	private int _ContactCommunicationId;
	private int _ContactId;
	private int _CommunicationMedium;
	private String _CommunicationMediumId;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private BaseModel<?> _crmTrnContactCommunicationRemoteModel;
}