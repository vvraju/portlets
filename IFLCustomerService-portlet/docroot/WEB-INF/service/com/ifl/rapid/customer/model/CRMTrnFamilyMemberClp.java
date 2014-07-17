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

import com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalServiceUtil;
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
public class CRMTrnFamilyMemberClp extends BaseModelImpl<CRMTrnFamilyMember>
	implements CRMTrnFamilyMember {
	public CRMTrnFamilyMemberClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CRMTrnFamilyMember.class;
	}

	@Override
	public String getModelClassName() {
		return CRMTrnFamilyMember.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _FamilyMemberId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setFamilyMemberId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FamilyMemberId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FamilyMemberId", getFamilyMemberId());
		attributes.put("ContactId", getContactId());
		attributes.put("MemberId", getMemberId());
		attributes.put("RelationshipId", getRelationshipId());
		attributes.put("FinanciallyDependent", getFinanciallyDependent());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FamilyMemberId = (Integer)attributes.get("FamilyMemberId");

		if (FamilyMemberId != null) {
			setFamilyMemberId(FamilyMemberId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer MemberId = (Integer)attributes.get("MemberId");

		if (MemberId != null) {
			setMemberId(MemberId);
		}

		Integer RelationshipId = (Integer)attributes.get("RelationshipId");

		if (RelationshipId != null) {
			setRelationshipId(RelationshipId);
		}

		String FinanciallyDependent = (String)attributes.get(
				"FinanciallyDependent");

		if (FinanciallyDependent != null) {
			setFinanciallyDependent(FinanciallyDependent);
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
	public int getFamilyMemberId() {
		return _FamilyMemberId;
	}

	@Override
	public void setFamilyMemberId(int FamilyMemberId) {
		_FamilyMemberId = FamilyMemberId;

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setFamilyMemberId", int.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, FamilyMemberId);
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

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMemberId() {
		return _MemberId;
	}

	@Override
	public void setMemberId(int MemberId) {
		_MemberId = MemberId;

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setMemberId", int.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, MemberId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRelationshipId() {
		return _RelationshipId;
	}

	@Override
	public void setRelationshipId(int RelationshipId) {
		_RelationshipId = RelationshipId;

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setRelationshipId", int.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, RelationshipId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFinanciallyDependent() {
		return _FinanciallyDependent;
	}

	@Override
	public void setFinanciallyDependent(String FinanciallyDependent) {
		_FinanciallyDependent = FinanciallyDependent;

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setFinanciallyDependent",
						String.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel,
					FinanciallyDependent);
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

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, IsActive);
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

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, CreatedBy);
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

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, CreatedDate);
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

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, ModifiedBy);
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

		if (_crmTrnFamilyMemberRemoteModel != null) {
			try {
				Class<?> clazz = _crmTrnFamilyMemberRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_crmTrnFamilyMemberRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCRMTrnFamilyMemberRemoteModel() {
		return _crmTrnFamilyMemberRemoteModel;
	}

	public void setCRMTrnFamilyMemberRemoteModel(
		BaseModel<?> crmTrnFamilyMemberRemoteModel) {
		_crmTrnFamilyMemberRemoteModel = crmTrnFamilyMemberRemoteModel;
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

		Class<?> remoteModelClass = _crmTrnFamilyMemberRemoteModel.getClass();

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

		Object returnValue = method.invoke(_crmTrnFamilyMemberRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRMTrnFamilyMemberLocalServiceUtil.addCRMTrnFamilyMember(this);
		}
		else {
			CRMTrnFamilyMemberLocalServiceUtil.updateCRMTrnFamilyMember(this);
		}
	}

	@Override
	public CRMTrnFamilyMember toEscapedModel() {
		return (CRMTrnFamilyMember)ProxyUtil.newProxyInstance(CRMTrnFamilyMember.class.getClassLoader(),
			new Class[] { CRMTrnFamilyMember.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CRMTrnFamilyMemberClp clone = new CRMTrnFamilyMemberClp();

		clone.setFamilyMemberId(getFamilyMemberId());
		clone.setContactId(getContactId());
		clone.setMemberId(getMemberId());
		clone.setRelationshipId(getRelationshipId());
		clone.setFinanciallyDependent(getFinanciallyDependent());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(CRMTrnFamilyMember crmTrnFamilyMember) {
		int primaryKey = crmTrnFamilyMember.getPrimaryKey();

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

		if (!(obj instanceof CRMTrnFamilyMemberClp)) {
			return false;
		}

		CRMTrnFamilyMemberClp crmTrnFamilyMember = (CRMTrnFamilyMemberClp)obj;

		int primaryKey = crmTrnFamilyMember.getPrimaryKey();

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

		sb.append("{FamilyMemberId=");
		sb.append(getFamilyMemberId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", MemberId=");
		sb.append(getMemberId());
		sb.append(", RelationshipId=");
		sb.append(getRelationshipId());
		sb.append(", FinanciallyDependent=");
		sb.append(getFinanciallyDependent());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.CRMTrnFamilyMember");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FamilyMemberId</column-name><column-value><![CDATA[");
		sb.append(getFamilyMemberId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MemberId</column-name><column-value><![CDATA[");
		sb.append(getMemberId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RelationshipId</column-name><column-value><![CDATA[");
		sb.append(getRelationshipId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FinanciallyDependent</column-name><column-value><![CDATA[");
		sb.append(getFinanciallyDependent());
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

	private int _FamilyMemberId;
	private int _ContactId;
	private int _MemberId;
	private int _RelationshipId;
	private String _FinanciallyDependent;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private BaseModel<?> _crmTrnFamilyMemberRemoteModel;
}