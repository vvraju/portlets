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
import com.ifli.rapid.service.ServiceRequestMasterLocalServiceUtil;

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
public class ServiceRequestMasterClp extends BaseModelImpl<ServiceRequestMaster>
	implements ServiceRequestMaster {
	public ServiceRequestMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceRequestMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceRequestMaster.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Type", getType());
		attributes.put("ContactId", getContactId());
		attributes.put("addressTypeId", getAddressTypeId());
		attributes.put("address", getAddress());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("MobileNo", getMobileNo());
		attributes.put("description", getDescription());
		attributes.put("startPreferedTime", getStartPreferedTime());
		attributes.put("endPreferedTime", getEndPreferedTime());
		attributes.put("PreferedDate", getPreferedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Id = (String)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Type = (String)attributes.get("Type");

		if (Type != null) {
			setType(Type);
		}

		String ContactId = (String)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String addressTypeId = (String)attributes.get("addressTypeId");

		if (addressTypeId != null) {
			setAddressTypeId(addressTypeId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Integer PolicyNo = (Integer)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		String MobileNo = (String)attributes.get("MobileNo");

		if (MobileNo != null) {
			setMobileNo(MobileNo);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date startPreferedTime = (Date)attributes.get("startPreferedTime");

		if (startPreferedTime != null) {
			setStartPreferedTime(startPreferedTime);
		}

		Date endPreferedTime = (Date)attributes.get("endPreferedTime");

		if (endPreferedTime != null) {
			setEndPreferedTime(endPreferedTime);
		}

		Date PreferedDate = (Date)attributes.get("PreferedDate");

		if (PreferedDate != null) {
			setPreferedDate(PreferedDate);
		}
	}

	@Override
	public String getId() {
		return _Id;
	}

	@Override
	public void setId(String Id) {
		_Id = Id;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setId", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _Type;
	}

	@Override
	public void setType(String Type) {
		_Type = Type;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, Type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(String ContactId) {
		_ContactId = ContactId;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressTypeId() {
		return _addressTypeId;
	}

	@Override
	public void setAddressTypeId(String addressTypeId) {
		_addressTypeId = addressTypeId;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressTypeId", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, addressTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPolicyNo() {
		return _PolicyNo;
	}

	@Override
	public void setPolicyNo(int PolicyNo) {
		_PolicyNo = PolicyNo;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyNo", int.class);

				method.invoke(_serviceRequestMasterRemoteModel, PolicyNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMobileNo() {
		return _MobileNo;
	}

	@Override
	public void setMobileNo(String MobileNo) {
		_MobileNo = MobileNo;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setMobileNo", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, MobileNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_serviceRequestMasterRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartPreferedTime() {
		return _startPreferedTime;
	}

	@Override
	public void setStartPreferedTime(Date startPreferedTime) {
		_startPreferedTime = startPreferedTime;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setStartPreferedTime",
						Date.class);

				method.invoke(_serviceRequestMasterRemoteModel,
					startPreferedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndPreferedTime() {
		return _endPreferedTime;
	}

	@Override
	public void setEndPreferedTime(Date endPreferedTime) {
		_endPreferedTime = endPreferedTime;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setEndPreferedTime", Date.class);

				method.invoke(_serviceRequestMasterRemoteModel, endPreferedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPreferedDate() {
		return _PreferedDate;
	}

	@Override
	public void setPreferedDate(Date PreferedDate) {
		_PreferedDate = PreferedDate;

		if (_serviceRequestMasterRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRequestMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferedDate", Date.class);

				method.invoke(_serviceRequestMasterRemoteModel, PreferedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getServiceRequestMasterRemoteModel() {
		return _serviceRequestMasterRemoteModel;
	}

	public void setServiceRequestMasterRemoteModel(
		BaseModel<?> serviceRequestMasterRemoteModel) {
		_serviceRequestMasterRemoteModel = serviceRequestMasterRemoteModel;
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

		Class<?> remoteModelClass = _serviceRequestMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_serviceRequestMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceRequestMasterLocalServiceUtil.addServiceRequestMaster(this);
		}
		else {
			ServiceRequestMasterLocalServiceUtil.updateServiceRequestMaster(this);
		}
	}

	@Override
	public ServiceRequestMaster toEscapedModel() {
		return (ServiceRequestMaster)ProxyUtil.newProxyInstance(ServiceRequestMaster.class.getClassLoader(),
			new Class[] { ServiceRequestMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceRequestMasterClp clone = new ServiceRequestMasterClp();

		clone.setId(getId());
		clone.setType(getType());
		clone.setContactId(getContactId());
		clone.setAddressTypeId(getAddressTypeId());
		clone.setAddress(getAddress());
		clone.setPolicyNo(getPolicyNo());
		clone.setMobileNo(getMobileNo());
		clone.setDescription(getDescription());
		clone.setStartPreferedTime(getStartPreferedTime());
		clone.setEndPreferedTime(getEndPreferedTime());
		clone.setPreferedDate(getPreferedDate());

		return clone;
	}

	@Override
	public int compareTo(ServiceRequestMaster serviceRequestMaster) {
		String primaryKey = serviceRequestMaster.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceRequestMasterClp)) {
			return false;
		}

		ServiceRequestMasterClp serviceRequestMaster = (ServiceRequestMasterClp)obj;

		String primaryKey = serviceRequestMaster.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Type=");
		sb.append(getType());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", addressTypeId=");
		sb.append(getAddressTypeId());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", PolicyNo=");
		sb.append(getPolicyNo());
		sb.append(", MobileNo=");
		sb.append(getMobileNo());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", startPreferedTime=");
		sb.append(getStartPreferedTime());
		sb.append(", endPreferedTime=");
		sb.append(getEndPreferedTime());
		sb.append(", PreferedDate=");
		sb.append(getPreferedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ServiceRequestMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressTypeId</column-name><column-value><![CDATA[");
		sb.append(getAddressTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyNo</column-name><column-value><![CDATA[");
		sb.append(getPolicyNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MobileNo</column-name><column-value><![CDATA[");
		sb.append(getMobileNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startPreferedTime</column-name><column-value><![CDATA[");
		sb.append(getStartPreferedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endPreferedTime</column-name><column-value><![CDATA[");
		sb.append(getEndPreferedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PreferedDate</column-name><column-value><![CDATA[");
		sb.append(getPreferedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _Id;
	private String _Type;
	private String _ContactId;
	private String _addressTypeId;
	private String _address;
	private int _PolicyNo;
	private String _MobileNo;
	private String _description;
	private Date _startPreferedTime;
	private Date _endPreferedTime;
	private Date _PreferedDate;
	private BaseModel<?> _serviceRequestMasterRemoteModel;
}