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
import com.ifl.rapid.customer.service.QrcTrnServiceRequestsLocalServiceUtil;

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
public class QrcTrnServiceRequestsClp extends BaseModelImpl<QrcTrnServiceRequests>
	implements QrcTrnServiceRequests {
	public QrcTrnServiceRequestsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnServiceRequests.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnServiceRequests.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ServiceRequestId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setServiceRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ServiceRequestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ServiceRequestId", getServiceRequestId());
		attributes.put("ContactId", getContactId());
		attributes.put("SrId", getSrId());
		attributes.put("ProcessId", getProcessId());
		attributes.put("Source", getSource());
		attributes.put("Channel", getChannel());
		attributes.put("Priority", getPriority());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("CaseDetails", getCaseDetails());
		attributes.put("IsManual", getIsManual());
		attributes.put("IsLAUpdated", getIsLAUpdated());
		attributes.put("Comments", getComments());
		attributes.put("IsSignVerified", getIsSignVerified());
		attributes.put("RequestId", getRequestId());
		attributes.put("AssignedTo", getAssignedTo());
		attributes.put("CreatedContactId", getCreatedContactId());
		attributes.put("HistoryId", getHistoryId());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ServiceRequestId = (Integer)attributes.get("ServiceRequestId");

		if (ServiceRequestId != null) {
			setServiceRequestId(ServiceRequestId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String SrId = (String)attributes.get("SrId");

		if (SrId != null) {
			setSrId(SrId);
		}

		String ProcessId = (String)attributes.get("ProcessId");

		if (ProcessId != null) {
			setProcessId(ProcessId);
		}

		String Source = (String)attributes.get("Source");

		if (Source != null) {
			setSource(Source);
		}

		String Channel = (String)attributes.get("Channel");

		if (Channel != null) {
			setChannel(Channel);
		}

		String Priority = (String)attributes.get("Priority");

		if (Priority != null) {
			setPriority(Priority);
		}

		String PolicyNo = (String)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		String CaseDetails = (String)attributes.get("CaseDetails");

		if (CaseDetails != null) {
			setCaseDetails(CaseDetails);
		}

		String IsManual = (String)attributes.get("IsManual");

		if (IsManual != null) {
			setIsManual(IsManual);
		}

		String IsLAUpdated = (String)attributes.get("IsLAUpdated");

		if (IsLAUpdated != null) {
			setIsLAUpdated(IsLAUpdated);
		}

		String Comments = (String)attributes.get("Comments");

		if (Comments != null) {
			setComments(Comments);
		}

		String IsSignVerified = (String)attributes.get("IsSignVerified");

		if (IsSignVerified != null) {
			setIsSignVerified(IsSignVerified);
		}

		Integer RequestId = (Integer)attributes.get("RequestId");

		if (RequestId != null) {
			setRequestId(RequestId);
		}

		Integer AssignedTo = (Integer)attributes.get("AssignedTo");

		if (AssignedTo != null) {
			setAssignedTo(AssignedTo);
		}

		Integer CreatedContactId = (Integer)attributes.get("CreatedContactId");

		if (CreatedContactId != null) {
			setCreatedContactId(CreatedContactId);
		}

		Integer HistoryId = (Integer)attributes.get("HistoryId");

		if (HistoryId != null) {
			setHistoryId(HistoryId);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
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
	public int getServiceRequestId() {
		return _ServiceRequestId;
	}

	@Override
	public void setServiceRequestId(int ServiceRequestId) {
		_ServiceRequestId = ServiceRequestId;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceRequestId", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel,
					ServiceRequestId);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSrId() {
		return _SrId;
	}

	@Override
	public void setSrId(String SrId) {
		_SrId = SrId;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setSrId", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, SrId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProcessId() {
		return _ProcessId;
	}

	@Override
	public void setProcessId(String ProcessId) {
		_ProcessId = ProcessId;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessId", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, ProcessId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSource() {
		return _Source;
	}

	@Override
	public void setSource(String Source) {
		_Source = Source;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setSource", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, Source);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChannel() {
		return _Channel;
	}

	@Override
	public void setChannel(String Channel) {
		_Channel = Channel;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setChannel", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, Channel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPriority() {
		return _Priority;
	}

	@Override
	public void setPriority(String Priority) {
		_Priority = Priority;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, Priority);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyNo", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, PolicyNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCaseDetails() {
		return _CaseDetails;
	}

	@Override
	public void setCaseDetails(String CaseDetails) {
		_CaseDetails = CaseDetails;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCaseDetails", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, CaseDetails);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsManual() {
		return _IsManual;
	}

	@Override
	public void setIsManual(String IsManual) {
		_IsManual = IsManual;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsManual", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, IsManual);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsLAUpdated() {
		return _IsLAUpdated;
	}

	@Override
	public void setIsLAUpdated(String IsLAUpdated) {
		_IsLAUpdated = IsLAUpdated;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsLAUpdated", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, IsLAUpdated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComments() {
		return _Comments;
	}

	@Override
	public void setComments(String Comments) {
		_Comments = Comments;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, Comments);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsSignVerified() {
		return _IsSignVerified;
	}

	@Override
	public void setIsSignVerified(String IsSignVerified) {
		_IsSignVerified = IsSignVerified;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsSignVerified",
						String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, IsSignVerified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRequestId() {
		return _RequestId;
	}

	@Override
	public void setRequestId(int RequestId) {
		_RequestId = RequestId;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestId", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, RequestId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAssignedTo() {
		return _AssignedTo;
	}

	@Override
	public void setAssignedTo(int AssignedTo) {
		_AssignedTo = AssignedTo;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setAssignedTo", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, AssignedTo);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedContactId", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel,
					CreatedContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHistoryId() {
		return _HistoryId;
	}

	@Override
	public void setHistoryId(int HistoryId) {
		_HistoryId = HistoryId;

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setHistoryId", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, HistoryId);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressTypeId", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, AddressTypeId);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, IsActive);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, CreatedBy);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, CreatedDate);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, ModifiedDate);
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

		if (_qrcTrnServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_qrcTrnServiceRequestsRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQrcTrnServiceRequestsRemoteModel() {
		return _qrcTrnServiceRequestsRemoteModel;
	}

	public void setQrcTrnServiceRequestsRemoteModel(
		BaseModel<?> qrcTrnServiceRequestsRemoteModel) {
		_qrcTrnServiceRequestsRemoteModel = qrcTrnServiceRequestsRemoteModel;
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

		Class<?> remoteModelClass = _qrcTrnServiceRequestsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcTrnServiceRequestsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QrcTrnServiceRequestsLocalServiceUtil.addQrcTrnServiceRequests(this);
		}
		else {
			QrcTrnServiceRequestsLocalServiceUtil.updateQrcTrnServiceRequests(this);
		}
	}

	@Override
	public QrcTrnServiceRequests toEscapedModel() {
		return (QrcTrnServiceRequests)ProxyUtil.newProxyInstance(QrcTrnServiceRequests.class.getClassLoader(),
			new Class[] { QrcTrnServiceRequests.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QrcTrnServiceRequestsClp clone = new QrcTrnServiceRequestsClp();

		clone.setServiceRequestId(getServiceRequestId());
		clone.setContactId(getContactId());
		clone.setSrId(getSrId());
		clone.setProcessId(getProcessId());
		clone.setSource(getSource());
		clone.setChannel(getChannel());
		clone.setPriority(getPriority());
		clone.setPolicyNo(getPolicyNo());
		clone.setCaseDetails(getCaseDetails());
		clone.setIsManual(getIsManual());
		clone.setIsLAUpdated(getIsLAUpdated());
		clone.setComments(getComments());
		clone.setIsSignVerified(getIsSignVerified());
		clone.setRequestId(getRequestId());
		clone.setAssignedTo(getAssignedTo());
		clone.setCreatedContactId(getCreatedContactId());
		clone.setHistoryId(getHistoryId());
		clone.setAddressTypeId(getAddressTypeId());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(QrcTrnServiceRequests qrcTrnServiceRequests) {
		int primaryKey = qrcTrnServiceRequests.getPrimaryKey();

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

		if (!(obj instanceof QrcTrnServiceRequestsClp)) {
			return false;
		}

		QrcTrnServiceRequestsClp qrcTrnServiceRequests = (QrcTrnServiceRequestsClp)obj;

		int primaryKey = qrcTrnServiceRequests.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

		sb.append("{ServiceRequestId=");
		sb.append(getServiceRequestId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", SrId=");
		sb.append(getSrId());
		sb.append(", ProcessId=");
		sb.append(getProcessId());
		sb.append(", Source=");
		sb.append(getSource());
		sb.append(", Channel=");
		sb.append(getChannel());
		sb.append(", Priority=");
		sb.append(getPriority());
		sb.append(", PolicyNo=");
		sb.append(getPolicyNo());
		sb.append(", CaseDetails=");
		sb.append(getCaseDetails());
		sb.append(", IsManual=");
		sb.append(getIsManual());
		sb.append(", IsLAUpdated=");
		sb.append(getIsLAUpdated());
		sb.append(", Comments=");
		sb.append(getComments());
		sb.append(", IsSignVerified=");
		sb.append(getIsSignVerified());
		sb.append(", RequestId=");
		sb.append(getRequestId());
		sb.append(", AssignedTo=");
		sb.append(getAssignedTo());
		sb.append(", CreatedContactId=");
		sb.append(getCreatedContactId());
		sb.append(", HistoryId=");
		sb.append(getHistoryId());
		sb.append(", AddressTypeId=");
		sb.append(getAddressTypeId());
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
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcTrnServiceRequests");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ServiceRequestId</column-name><column-value><![CDATA[");
		sb.append(getServiceRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SrId</column-name><column-value><![CDATA[");
		sb.append(getSrId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProcessId</column-name><column-value><![CDATA[");
		sb.append(getProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Source</column-name><column-value><![CDATA[");
		sb.append(getSource());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Channel</column-name><column-value><![CDATA[");
		sb.append(getChannel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyNo</column-name><column-value><![CDATA[");
		sb.append(getPolicyNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CaseDetails</column-name><column-value><![CDATA[");
		sb.append(getCaseDetails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsManual</column-name><column-value><![CDATA[");
		sb.append(getIsManual());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsLAUpdated</column-name><column-value><![CDATA[");
		sb.append(getIsLAUpdated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsSignVerified</column-name><column-value><![CDATA[");
		sb.append(getIsSignVerified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RequestId</column-name><column-value><![CDATA[");
		sb.append(getRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AssignedTo</column-name><column-value><![CDATA[");
		sb.append(getAssignedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedContactId</column-name><column-value><![CDATA[");
		sb.append(getCreatedContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HistoryId</column-name><column-value><![CDATA[");
		sb.append(getHistoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressTypeId</column-name><column-value><![CDATA[");
		sb.append(getAddressTypeId());
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

	private int _ServiceRequestId;
	private int _ContactId;
	private String _SrId;
	private String _ProcessId;
	private String _Source;
	private String _Channel;
	private String _Priority;
	private String _PolicyNo;
	private String _CaseDetails;
	private String _IsManual;
	private String _IsLAUpdated;
	private String _Comments;
	private String _IsSignVerified;
	private int _RequestId;
	private int _AssignedTo;
	private int _CreatedContactId;
	private int _HistoryId;
	private int _AddressTypeId;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private BaseModel<?> _qrcTrnServiceRequestsRemoteModel;
}