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

import com.ifli.rapid.service.ChequePaymentRequestLocalServiceUtil;
import com.ifli.rapid.service.ClpSerializer;

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
public class ChequePaymentRequestClp extends BaseModelImpl<ChequePaymentRequest>
	implements ChequePaymentRequest {
	public ChequePaymentRequestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ChequePaymentRequest.class;
	}

	@Override
	public String getModelClassName() {
		return ChequePaymentRequest.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _ServiceRequestID;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setServiceRequestID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ServiceRequestID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ServiceRequestID", getServiceRequestID());
		attributes.put("ServiceRequestMasterId", getServiceRequestMasterId());
		attributes.put("description", getDescription());
		attributes.put("contactId", getContactId());
		attributes.put("startPreferedTime", getStartPreferedTime());
		attributes.put("endPreferedTime", getEndPreferedTime());
		attributes.put("PreferedDate", getPreferedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String ServiceRequestID = (String)attributes.get("ServiceRequestID");

		if (ServiceRequestID != null) {
			setServiceRequestID(ServiceRequestID);
		}

		String ServiceRequestMasterId = (String)attributes.get(
				"ServiceRequestMasterId");

		if (ServiceRequestMasterId != null) {
			setServiceRequestMasterId(ServiceRequestMasterId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String contactId = (String)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
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
	public String getServiceRequestID() {
		return _ServiceRequestID;
	}

	@Override
	public void setServiceRequestID(String ServiceRequestID) {
		_ServiceRequestID = ServiceRequestID;

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceRequestID",
						String.class);

				method.invoke(_chequePaymentRequestRemoteModel, ServiceRequestID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceRequestMasterId() {
		return _ServiceRequestMasterId;
	}

	@Override
	public void setServiceRequestMasterId(String ServiceRequestMasterId) {
		_ServiceRequestMasterId = ServiceRequestMasterId;

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceRequestMasterId",
						String.class);

				method.invoke(_chequePaymentRequestRemoteModel,
					ServiceRequestMasterId);
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

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_chequePaymentRequestRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(String contactId) {
		_contactId = contactId;

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", String.class);

				method.invoke(_chequePaymentRequestRemoteModel, contactId);
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

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setStartPreferedTime",
						Date.class);

				method.invoke(_chequePaymentRequestRemoteModel,
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

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setEndPreferedTime", Date.class);

				method.invoke(_chequePaymentRequestRemoteModel, endPreferedTime);
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

		if (_chequePaymentRequestRemoteModel != null) {
			try {
				Class<?> clazz = _chequePaymentRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferedDate", Date.class);

				method.invoke(_chequePaymentRequestRemoteModel, PreferedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getChequePaymentRequestRemoteModel() {
		return _chequePaymentRequestRemoteModel;
	}

	public void setChequePaymentRequestRemoteModel(
		BaseModel<?> chequePaymentRequestRemoteModel) {
		_chequePaymentRequestRemoteModel = chequePaymentRequestRemoteModel;
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

		Class<?> remoteModelClass = _chequePaymentRequestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_chequePaymentRequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ChequePaymentRequestLocalServiceUtil.addChequePaymentRequest(this);
		}
		else {
			ChequePaymentRequestLocalServiceUtil.updateChequePaymentRequest(this);
		}
	}

	@Override
	public ChequePaymentRequest toEscapedModel() {
		return (ChequePaymentRequest)ProxyUtil.newProxyInstance(ChequePaymentRequest.class.getClassLoader(),
			new Class[] { ChequePaymentRequest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ChequePaymentRequestClp clone = new ChequePaymentRequestClp();

		clone.setServiceRequestID(getServiceRequestID());
		clone.setServiceRequestMasterId(getServiceRequestMasterId());
		clone.setDescription(getDescription());
		clone.setContactId(getContactId());
		clone.setStartPreferedTime(getStartPreferedTime());
		clone.setEndPreferedTime(getEndPreferedTime());
		clone.setPreferedDate(getPreferedDate());

		return clone;
	}

	@Override
	public int compareTo(ChequePaymentRequest chequePaymentRequest) {
		String primaryKey = chequePaymentRequest.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ChequePaymentRequestClp)) {
			return false;
		}

		ChequePaymentRequestClp chequePaymentRequest = (ChequePaymentRequestClp)obj;

		String primaryKey = chequePaymentRequest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{ServiceRequestID=");
		sb.append(getServiceRequestID());
		sb.append(", ServiceRequestMasterId=");
		sb.append(getServiceRequestMasterId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contactId=");
		sb.append(getContactId());
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
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ChequePaymentRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ServiceRequestID</column-name><column-value><![CDATA[");
		sb.append(getServiceRequestID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceRequestMasterId</column-name><column-value><![CDATA[");
		sb.append(getServiceRequestMasterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
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

	private String _ServiceRequestID;
	private String _ServiceRequestMasterId;
	private String _description;
	private String _contactId;
	private Date _startPreferedTime;
	private Date _endPreferedTime;
	private Date _PreferedDate;
	private BaseModel<?> _chequePaymentRequestRemoteModel;
}