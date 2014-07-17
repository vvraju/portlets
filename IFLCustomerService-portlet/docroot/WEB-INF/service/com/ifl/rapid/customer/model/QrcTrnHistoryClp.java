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
import com.ifl.rapid.customer.service.QrcTrnHistoryLocalServiceUtil;

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
public class QrcTrnHistoryClp extends BaseModelImpl<QrcTrnHistory>
	implements QrcTrnHistory {
	public QrcTrnHistoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnHistory.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnHistory.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _HistoryId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setHistoryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _HistoryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("HistoryId", getHistoryId());
		attributes.put("ContactId", getContactId());
		attributes.put("CreatedContactId", getCreatedContactId());
		attributes.put("RequestType", getRequestType());
		attributes.put("ChangeRequestType", getChangeRequestType());
		attributes.put("PickupDate", getPickupDate());
		attributes.put("PickupTime", getPickupTime());
		attributes.put("XMLData", getXMLData());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("BranchId", getBranchId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer HistoryId = (Integer)attributes.get("HistoryId");

		if (HistoryId != null) {
			setHistoryId(HistoryId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer CreatedContactId = (Integer)attributes.get("CreatedContactId");

		if (CreatedContactId != null) {
			setCreatedContactId(CreatedContactId);
		}

		String RequestType = (String)attributes.get("RequestType");

		if (RequestType != null) {
			setRequestType(RequestType);
		}

		String ChangeRequestType = (String)attributes.get("ChangeRequestType");

		if (ChangeRequestType != null) {
			setChangeRequestType(ChangeRequestType);
		}

		Date PickupDate = (Date)attributes.get("PickupDate");

		if (PickupDate != null) {
			setPickupDate(PickupDate);
		}

		String PickupTime = (String)attributes.get("PickupTime");

		if (PickupTime != null) {
			setPickupTime(PickupTime);
		}

		String XMLData = (String)attributes.get("XMLData");

		if (XMLData != null) {
			setXMLData(XMLData);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
		}

		Integer BranchId = (Integer)attributes.get("BranchId");

		if (BranchId != null) {
			setBranchId(BranchId);
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
	}

	@Override
	public int getHistoryId() {
		return _HistoryId;
	}

	@Override
	public void setHistoryId(int HistoryId) {
		_HistoryId = HistoryId;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setHistoryId", int.class);

				method.invoke(_qrcTrnHistoryRemoteModel, HistoryId);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_qrcTrnHistoryRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCreatedContactId() {
		return _CreatedContactId;
	}

	@Override
	public void setCreatedContactId(int CreatedContactId) {
		_CreatedContactId = CreatedContactId;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedContactId", int.class);

				method.invoke(_qrcTrnHistoryRemoteModel, CreatedContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestType() {
		return _RequestType;
	}

	@Override
	public void setRequestType(String RequestType) {
		_RequestType = RequestType;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestType", String.class);

				method.invoke(_qrcTrnHistoryRemoteModel, RequestType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChangeRequestType() {
		return _ChangeRequestType;
	}

	@Override
	public void setChangeRequestType(String ChangeRequestType) {
		_ChangeRequestType = ChangeRequestType;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setChangeRequestType",
						String.class);

				method.invoke(_qrcTrnHistoryRemoteModel, ChangeRequestType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPickupDate() {
		return _PickupDate;
	}

	@Override
	public void setPickupDate(Date PickupDate) {
		_PickupDate = PickupDate;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPickupDate", Date.class);

				method.invoke(_qrcTrnHistoryRemoteModel, PickupDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPickupTime() {
		return _PickupTime;
	}

	@Override
	public void setPickupTime(String PickupTime) {
		_PickupTime = PickupTime;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setPickupTime", String.class);

				method.invoke(_qrcTrnHistoryRemoteModel, PickupTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMLData() {
		return _XMLData;
	}

	@Override
	public void setXMLData(String XMLData) {
		_XMLData = XMLData;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setXMLData", String.class);

				method.invoke(_qrcTrnHistoryRemoteModel, XMLData);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressTypeId", int.class);

				method.invoke(_qrcTrnHistoryRemoteModel, AddressTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBranchId() {
		return _BranchId;
	}

	@Override
	public void setBranchId(int BranchId) {
		_BranchId = BranchId;

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setBranchId", int.class);

				method.invoke(_qrcTrnHistoryRemoteModel, BranchId);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_qrcTrnHistoryRemoteModel, IsActive);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_qrcTrnHistoryRemoteModel, CreatedBy);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_qrcTrnHistoryRemoteModel, CreatedDate);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_qrcTrnHistoryRemoteModel, ModifiedDate);
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

		if (_qrcTrnHistoryRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnHistoryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_qrcTrnHistoryRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQrcTrnHistoryRemoteModel() {
		return _qrcTrnHistoryRemoteModel;
	}

	public void setQrcTrnHistoryRemoteModel(
		BaseModel<?> qrcTrnHistoryRemoteModel) {
		_qrcTrnHistoryRemoteModel = qrcTrnHistoryRemoteModel;
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

		Class<?> remoteModelClass = _qrcTrnHistoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcTrnHistoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QrcTrnHistoryLocalServiceUtil.addQrcTrnHistory(this);
		}
		else {
			QrcTrnHistoryLocalServiceUtil.updateQrcTrnHistory(this);
		}
	}

	@Override
	public QrcTrnHistory toEscapedModel() {
		return (QrcTrnHistory)ProxyUtil.newProxyInstance(QrcTrnHistory.class.getClassLoader(),
			new Class[] { QrcTrnHistory.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QrcTrnHistoryClp clone = new QrcTrnHistoryClp();

		clone.setHistoryId(getHistoryId());
		clone.setContactId(getContactId());
		clone.setCreatedContactId(getCreatedContactId());
		clone.setRequestType(getRequestType());
		clone.setChangeRequestType(getChangeRequestType());
		clone.setPickupDate(getPickupDate());
		clone.setPickupTime(getPickupTime());
		clone.setXMLData(getXMLData());
		clone.setAddressTypeId(getAddressTypeId());
		clone.setBranchId(getBranchId());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(QrcTrnHistory qrcTrnHistory) {
		int primaryKey = qrcTrnHistory.getPrimaryKey();

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

		if (!(obj instanceof QrcTrnHistoryClp)) {
			return false;
		}

		QrcTrnHistoryClp qrcTrnHistory = (QrcTrnHistoryClp)obj;

		int primaryKey = qrcTrnHistory.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{HistoryId=");
		sb.append(getHistoryId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", CreatedContactId=");
		sb.append(getCreatedContactId());
		sb.append(", RequestType=");
		sb.append(getRequestType());
		sb.append(", ChangeRequestType=");
		sb.append(getChangeRequestType());
		sb.append(", PickupDate=");
		sb.append(getPickupDate());
		sb.append(", PickupTime=");
		sb.append(getPickupTime());
		sb.append(", XMLData=");
		sb.append(getXMLData());
		sb.append(", AddressTypeId=");
		sb.append(getAddressTypeId());
		sb.append(", BranchId=");
		sb.append(getBranchId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcTrnHistory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>HistoryId</column-name><column-value><![CDATA[");
		sb.append(getHistoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedContactId</column-name><column-value><![CDATA[");
		sb.append(getCreatedContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RequestType</column-name><column-value><![CDATA[");
		sb.append(getRequestType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ChangeRequestType</column-name><column-value><![CDATA[");
		sb.append(getChangeRequestType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PickupDate</column-name><column-value><![CDATA[");
		sb.append(getPickupDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PickupTime</column-name><column-value><![CDATA[");
		sb.append(getPickupTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMLData</column-name><column-value><![CDATA[");
		sb.append(getXMLData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressTypeId</column-name><column-value><![CDATA[");
		sb.append(getAddressTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BranchId</column-name><column-value><![CDATA[");
		sb.append(getBranchId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private int _HistoryId;
	private int _ContactId;
	private int _CreatedContactId;
	private String _RequestType;
	private String _ChangeRequestType;
	private Date _PickupDate;
	private String _PickupTime;
	private String _XMLData;
	private int _AddressTypeId;
	private int _BranchId;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private BaseModel<?> _qrcTrnHistoryRemoteModel;
}