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
import com.ifli.rapid.service.PremiumFrequencyMasterLocalServiceUtil;

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
public class PremiumFrequencyMasterClp extends BaseModelImpl<PremiumFrequencyMaster>
	implements PremiumFrequencyMaster {
	public PremiumFrequencyMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PremiumFrequencyMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PremiumFrequencyMaster.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _PremiumFrequencyId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPremiumFrequencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PremiumFrequencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PremiumFrequencyId", getPremiumFrequencyId());
		attributes.put("PremiumFrequencyDescription",
			getPremiumFrequencyDescription());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PremiumFrequencyId = (String)attributes.get("PremiumFrequencyId");

		if (PremiumFrequencyId != null) {
			setPremiumFrequencyId(PremiumFrequencyId);
		}

		String PremiumFrequencyDescription = (String)attributes.get(
				"PremiumFrequencyDescription");

		if (PremiumFrequencyDescription != null) {
			setPremiumFrequencyDescription(PremiumFrequencyDescription);
		}

		Boolean IsActive = (Boolean)attributes.get("IsActive");

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

		Integer Priority = (Integer)attributes.get("Priority");

		if (Priority != null) {
			setPriority(Priority);
		}
	}

	@Override
	public String getPremiumFrequencyId() {
		return _PremiumFrequencyId;
	}

	@Override
	public void setPremiumFrequencyId(String PremiumFrequencyId) {
		_PremiumFrequencyId = PremiumFrequencyId;

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumFrequencyId",
						String.class);

				method.invoke(_premiumFrequencyMasterRemoteModel,
					PremiumFrequencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPremiumFrequencyDescription() {
		return _PremiumFrequencyDescription;
	}

	@Override
	public void setPremiumFrequencyDescription(
		String PremiumFrequencyDescription) {
		_PremiumFrequencyDescription = PremiumFrequencyDescription;

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumFrequencyDescription",
						String.class);

				method.invoke(_premiumFrequencyMasterRemoteModel,
					PremiumFrequencyDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsActive() {
		return _IsActive;
	}

	@Override
	public boolean isIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(boolean IsActive) {
		_IsActive = IsActive;

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", boolean.class);

				method.invoke(_premiumFrequencyMasterRemoteModel, IsActive);
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

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_premiumFrequencyMasterRemoteModel, CreatedBy);
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

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_premiumFrequencyMasterRemoteModel, CreatedDate);
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

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_premiumFrequencyMasterRemoteModel, ModifiedBy);
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

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_premiumFrequencyMasterRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPriority() {
		return _Priority;
	}

	@Override
	public void setPriority(int Priority) {
		_Priority = Priority;

		if (_premiumFrequencyMasterRemoteModel != null) {
			try {
				Class<?> clazz = _premiumFrequencyMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", int.class);

				method.invoke(_premiumFrequencyMasterRemoteModel, Priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPremiumFrequencyMasterRemoteModel() {
		return _premiumFrequencyMasterRemoteModel;
	}

	public void setPremiumFrequencyMasterRemoteModel(
		BaseModel<?> premiumFrequencyMasterRemoteModel) {
		_premiumFrequencyMasterRemoteModel = premiumFrequencyMasterRemoteModel;
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

		Class<?> remoteModelClass = _premiumFrequencyMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_premiumFrequencyMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PremiumFrequencyMasterLocalServiceUtil.addPremiumFrequencyMaster(this);
		}
		else {
			PremiumFrequencyMasterLocalServiceUtil.updatePremiumFrequencyMaster(this);
		}
	}

	@Override
	public PremiumFrequencyMaster toEscapedModel() {
		return (PremiumFrequencyMaster)ProxyUtil.newProxyInstance(PremiumFrequencyMaster.class.getClassLoader(),
			new Class[] { PremiumFrequencyMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PremiumFrequencyMasterClp clone = new PremiumFrequencyMasterClp();

		clone.setPremiumFrequencyId(getPremiumFrequencyId());
		clone.setPremiumFrequencyDescription(getPremiumFrequencyDescription());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setPriority(getPriority());

		return clone;
	}

	@Override
	public int compareTo(PremiumFrequencyMaster premiumFrequencyMaster) {
		String primaryKey = premiumFrequencyMaster.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PremiumFrequencyMasterClp)) {
			return false;
		}

		PremiumFrequencyMasterClp premiumFrequencyMaster = (PremiumFrequencyMasterClp)obj;

		String primaryKey = premiumFrequencyMaster.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PremiumFrequencyId=");
		sb.append(getPremiumFrequencyId());
		sb.append(", PremiumFrequencyDescription=");
		sb.append(getPremiumFrequencyDescription());
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
		sb.append(", Priority=");
		sb.append(getPriority());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PremiumFrequencyMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PremiumFrequencyId</column-name><column-value><![CDATA[");
		sb.append(getPremiumFrequencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumFrequencyDescription</column-name><column-value><![CDATA[");
		sb.append(getPremiumFrequencyDescription());
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
			"<column><column-name>Priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _PremiumFrequencyId;
	private String _PremiumFrequencyDescription;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private BaseModel<?> _premiumFrequencyMasterRemoteModel;
}