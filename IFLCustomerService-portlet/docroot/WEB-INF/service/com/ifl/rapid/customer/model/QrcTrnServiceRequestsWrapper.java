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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QrcTrnServiceRequests}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnServiceRequests
 * @generated
 */
public class QrcTrnServiceRequestsWrapper implements QrcTrnServiceRequests,
	ModelWrapper<QrcTrnServiceRequests> {
	public QrcTrnServiceRequestsWrapper(
		QrcTrnServiceRequests qrcTrnServiceRequests) {
		_qrcTrnServiceRequests = qrcTrnServiceRequests;
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

	/**
	* Returns the primary key of this qrc trn service requests.
	*
	* @return the primary key of this qrc trn service requests
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcTrnServiceRequests.getPrimaryKey();
	}

	/**
	* Sets the primary key of this qrc trn service requests.
	*
	* @param primaryKey the primary key of this qrc trn service requests
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcTrnServiceRequests.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the service request ID of this qrc trn service requests.
	*
	* @return the service request ID of this qrc trn service requests
	*/
	@Override
	public int getServiceRequestId() {
		return _qrcTrnServiceRequests.getServiceRequestId();
	}

	/**
	* Sets the service request ID of this qrc trn service requests.
	*
	* @param ServiceRequestId the service request ID of this qrc trn service requests
	*/
	@Override
	public void setServiceRequestId(int ServiceRequestId) {
		_qrcTrnServiceRequests.setServiceRequestId(ServiceRequestId);
	}

	/**
	* Returns the contact ID of this qrc trn service requests.
	*
	* @return the contact ID of this qrc trn service requests
	*/
	@Override
	public int getContactId() {
		return _qrcTrnServiceRequests.getContactId();
	}

	/**
	* Sets the contact ID of this qrc trn service requests.
	*
	* @param ContactId the contact ID of this qrc trn service requests
	*/
	@Override
	public void setContactId(int ContactId) {
		_qrcTrnServiceRequests.setContactId(ContactId);
	}

	/**
	* Returns the sr ID of this qrc trn service requests.
	*
	* @return the sr ID of this qrc trn service requests
	*/
	@Override
	public java.lang.String getSrId() {
		return _qrcTrnServiceRequests.getSrId();
	}

	/**
	* Sets the sr ID of this qrc trn service requests.
	*
	* @param SrId the sr ID of this qrc trn service requests
	*/
	@Override
	public void setSrId(java.lang.String SrId) {
		_qrcTrnServiceRequests.setSrId(SrId);
	}

	/**
	* Returns the process ID of this qrc trn service requests.
	*
	* @return the process ID of this qrc trn service requests
	*/
	@Override
	public java.lang.String getProcessId() {
		return _qrcTrnServiceRequests.getProcessId();
	}

	/**
	* Sets the process ID of this qrc trn service requests.
	*
	* @param ProcessId the process ID of this qrc trn service requests
	*/
	@Override
	public void setProcessId(java.lang.String ProcessId) {
		_qrcTrnServiceRequests.setProcessId(ProcessId);
	}

	/**
	* Returns the source of this qrc trn service requests.
	*
	* @return the source of this qrc trn service requests
	*/
	@Override
	public java.lang.String getSource() {
		return _qrcTrnServiceRequests.getSource();
	}

	/**
	* Sets the source of this qrc trn service requests.
	*
	* @param Source the source of this qrc trn service requests
	*/
	@Override
	public void setSource(java.lang.String Source) {
		_qrcTrnServiceRequests.setSource(Source);
	}

	/**
	* Returns the channel of this qrc trn service requests.
	*
	* @return the channel of this qrc trn service requests
	*/
	@Override
	public java.lang.String getChannel() {
		return _qrcTrnServiceRequests.getChannel();
	}

	/**
	* Sets the channel of this qrc trn service requests.
	*
	* @param Channel the channel of this qrc trn service requests
	*/
	@Override
	public void setChannel(java.lang.String Channel) {
		_qrcTrnServiceRequests.setChannel(Channel);
	}

	/**
	* Returns the priority of this qrc trn service requests.
	*
	* @return the priority of this qrc trn service requests
	*/
	@Override
	public java.lang.String getPriority() {
		return _qrcTrnServiceRequests.getPriority();
	}

	/**
	* Sets the priority of this qrc trn service requests.
	*
	* @param Priority the priority of this qrc trn service requests
	*/
	@Override
	public void setPriority(java.lang.String Priority) {
		_qrcTrnServiceRequests.setPriority(Priority);
	}

	/**
	* Returns the policy no of this qrc trn service requests.
	*
	* @return the policy no of this qrc trn service requests
	*/
	@Override
	public java.lang.String getPolicyNo() {
		return _qrcTrnServiceRequests.getPolicyNo();
	}

	/**
	* Sets the policy no of this qrc trn service requests.
	*
	* @param PolicyNo the policy no of this qrc trn service requests
	*/
	@Override
	public void setPolicyNo(java.lang.String PolicyNo) {
		_qrcTrnServiceRequests.setPolicyNo(PolicyNo);
	}

	/**
	* Returns the case details of this qrc trn service requests.
	*
	* @return the case details of this qrc trn service requests
	*/
	@Override
	public java.lang.String getCaseDetails() {
		return _qrcTrnServiceRequests.getCaseDetails();
	}

	/**
	* Sets the case details of this qrc trn service requests.
	*
	* @param CaseDetails the case details of this qrc trn service requests
	*/
	@Override
	public void setCaseDetails(java.lang.String CaseDetails) {
		_qrcTrnServiceRequests.setCaseDetails(CaseDetails);
	}

	/**
	* Returns the is manual of this qrc trn service requests.
	*
	* @return the is manual of this qrc trn service requests
	*/
	@Override
	public java.lang.String getIsManual() {
		return _qrcTrnServiceRequests.getIsManual();
	}

	/**
	* Sets the is manual of this qrc trn service requests.
	*
	* @param IsManual the is manual of this qrc trn service requests
	*/
	@Override
	public void setIsManual(java.lang.String IsManual) {
		_qrcTrnServiceRequests.setIsManual(IsManual);
	}

	/**
	* Returns the is l a updated of this qrc trn service requests.
	*
	* @return the is l a updated of this qrc trn service requests
	*/
	@Override
	public java.lang.String getIsLAUpdated() {
		return _qrcTrnServiceRequests.getIsLAUpdated();
	}

	/**
	* Sets the is l a updated of this qrc trn service requests.
	*
	* @param IsLAUpdated the is l a updated of this qrc trn service requests
	*/
	@Override
	public void setIsLAUpdated(java.lang.String IsLAUpdated) {
		_qrcTrnServiceRequests.setIsLAUpdated(IsLAUpdated);
	}

	/**
	* Returns the comments of this qrc trn service requests.
	*
	* @return the comments of this qrc trn service requests
	*/
	@Override
	public java.lang.String getComments() {
		return _qrcTrnServiceRequests.getComments();
	}

	/**
	* Sets the comments of this qrc trn service requests.
	*
	* @param Comments the comments of this qrc trn service requests
	*/
	@Override
	public void setComments(java.lang.String Comments) {
		_qrcTrnServiceRequests.setComments(Comments);
	}

	/**
	* Returns the is sign verified of this qrc trn service requests.
	*
	* @return the is sign verified of this qrc trn service requests
	*/
	@Override
	public java.lang.String getIsSignVerified() {
		return _qrcTrnServiceRequests.getIsSignVerified();
	}

	/**
	* Sets the is sign verified of this qrc trn service requests.
	*
	* @param IsSignVerified the is sign verified of this qrc trn service requests
	*/
	@Override
	public void setIsSignVerified(java.lang.String IsSignVerified) {
		_qrcTrnServiceRequests.setIsSignVerified(IsSignVerified);
	}

	/**
	* Returns the request ID of this qrc trn service requests.
	*
	* @return the request ID of this qrc trn service requests
	*/
	@Override
	public int getRequestId() {
		return _qrcTrnServiceRequests.getRequestId();
	}

	/**
	* Sets the request ID of this qrc trn service requests.
	*
	* @param RequestId the request ID of this qrc trn service requests
	*/
	@Override
	public void setRequestId(int RequestId) {
		_qrcTrnServiceRequests.setRequestId(RequestId);
	}

	/**
	* Returns the assigned to of this qrc trn service requests.
	*
	* @return the assigned to of this qrc trn service requests
	*/
	@Override
	public int getAssignedTo() {
		return _qrcTrnServiceRequests.getAssignedTo();
	}

	/**
	* Sets the assigned to of this qrc trn service requests.
	*
	* @param AssignedTo the assigned to of this qrc trn service requests
	*/
	@Override
	public void setAssignedTo(int AssignedTo) {
		_qrcTrnServiceRequests.setAssignedTo(AssignedTo);
	}

	/**
	* Returns the created contact ID of this qrc trn service requests.
	*
	* @return the created contact ID of this qrc trn service requests
	*/
	@Override
	public int getCreatedContactId() {
		return _qrcTrnServiceRequests.getCreatedContactId();
	}

	/**
	* Sets the created contact ID of this qrc trn service requests.
	*
	* @param CreatedContactId the created contact ID of this qrc trn service requests
	*/
	@Override
	public void setCreatedContactId(int CreatedContactId) {
		_qrcTrnServiceRequests.setCreatedContactId(CreatedContactId);
	}

	/**
	* Returns the history ID of this qrc trn service requests.
	*
	* @return the history ID of this qrc trn service requests
	*/
	@Override
	public int getHistoryId() {
		return _qrcTrnServiceRequests.getHistoryId();
	}

	/**
	* Sets the history ID of this qrc trn service requests.
	*
	* @param HistoryId the history ID of this qrc trn service requests
	*/
	@Override
	public void setHistoryId(int HistoryId) {
		_qrcTrnServiceRequests.setHistoryId(HistoryId);
	}

	/**
	* Returns the address type ID of this qrc trn service requests.
	*
	* @return the address type ID of this qrc trn service requests
	*/
	@Override
	public int getAddressTypeId() {
		return _qrcTrnServiceRequests.getAddressTypeId();
	}

	/**
	* Sets the address type ID of this qrc trn service requests.
	*
	* @param AddressTypeId the address type ID of this qrc trn service requests
	*/
	@Override
	public void setAddressTypeId(int AddressTypeId) {
		_qrcTrnServiceRequests.setAddressTypeId(AddressTypeId);
	}

	/**
	* Returns the is active of this qrc trn service requests.
	*
	* @return the is active of this qrc trn service requests
	*/
	@Override
	public int getIsActive() {
		return _qrcTrnServiceRequests.getIsActive();
	}

	/**
	* Sets the is active of this qrc trn service requests.
	*
	* @param IsActive the is active of this qrc trn service requests
	*/
	@Override
	public void setIsActive(int IsActive) {
		_qrcTrnServiceRequests.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this qrc trn service requests.
	*
	* @return the created by of this qrc trn service requests
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _qrcTrnServiceRequests.getCreatedBy();
	}

	/**
	* Sets the created by of this qrc trn service requests.
	*
	* @param CreatedBy the created by of this qrc trn service requests
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_qrcTrnServiceRequests.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this qrc trn service requests.
	*
	* @return the created date of this qrc trn service requests
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _qrcTrnServiceRequests.getCreatedDate();
	}

	/**
	* Sets the created date of this qrc trn service requests.
	*
	* @param CreatedDate the created date of this qrc trn service requests
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_qrcTrnServiceRequests.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this qrc trn service requests.
	*
	* @return the modified date of this qrc trn service requests
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _qrcTrnServiceRequests.getModifiedDate();
	}

	/**
	* Sets the modified date of this qrc trn service requests.
	*
	* @param ModifiedDate the modified date of this qrc trn service requests
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_qrcTrnServiceRequests.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this qrc trn service requests.
	*
	* @return the modified by of this qrc trn service requests
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _qrcTrnServiceRequests.getModifiedBy();
	}

	/**
	* Sets the modified by of this qrc trn service requests.
	*
	* @param ModifiedBy the modified by of this qrc trn service requests
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_qrcTrnServiceRequests.setModifiedBy(ModifiedBy);
	}

	@Override
	public boolean isNew() {
		return _qrcTrnServiceRequests.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcTrnServiceRequests.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcTrnServiceRequests.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcTrnServiceRequests.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcTrnServiceRequests.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcTrnServiceRequests.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcTrnServiceRequests.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcTrnServiceRequests.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcTrnServiceRequests.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcTrnServiceRequests.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcTrnServiceRequests.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QrcTrnServiceRequestsWrapper((QrcTrnServiceRequests)_qrcTrnServiceRequests.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.QrcTrnServiceRequests qrcTrnServiceRequests) {
		return _qrcTrnServiceRequests.compareTo(qrcTrnServiceRequests);
	}

	@Override
	public int hashCode() {
		return _qrcTrnServiceRequests.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.QrcTrnServiceRequests> toCacheModel() {
		return _qrcTrnServiceRequests.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnServiceRequests toEscapedModel() {
		return new QrcTrnServiceRequestsWrapper(_qrcTrnServiceRequests.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.QrcTrnServiceRequests toUnescapedModel() {
		return new QrcTrnServiceRequestsWrapper(_qrcTrnServiceRequests.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcTrnServiceRequests.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcTrnServiceRequests.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcTrnServiceRequests.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QrcTrnServiceRequestsWrapper)) {
			return false;
		}

		QrcTrnServiceRequestsWrapper qrcTrnServiceRequestsWrapper = (QrcTrnServiceRequestsWrapper)obj;

		if (Validator.equals(_qrcTrnServiceRequests,
					qrcTrnServiceRequestsWrapper._qrcTrnServiceRequests)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QrcTrnServiceRequests getWrappedQrcTrnServiceRequests() {
		return _qrcTrnServiceRequests;
	}

	@Override
	public QrcTrnServiceRequests getWrappedModel() {
		return _qrcTrnServiceRequests;
	}

	@Override
	public void resetOriginalValues() {
		_qrcTrnServiceRequests.resetOriginalValues();
	}

	private QrcTrnServiceRequests _qrcTrnServiceRequests;
}