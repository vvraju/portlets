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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ChequePaymentRequest}.
 * </p>
 *
 * @author Satya Kola
 * @see ChequePaymentRequest
 * @generated
 */
public class ChequePaymentRequestWrapper implements ChequePaymentRequest,
	ModelWrapper<ChequePaymentRequest> {
	public ChequePaymentRequestWrapper(
		ChequePaymentRequest chequePaymentRequest) {
		_chequePaymentRequest = chequePaymentRequest;
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

	/**
	* Returns the primary key of this cheque payment request.
	*
	* @return the primary key of this cheque payment request
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _chequePaymentRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cheque payment request.
	*
	* @param primaryKey the primary key of this cheque payment request
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_chequePaymentRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the service request i d of this cheque payment request.
	*
	* @return the service request i d of this cheque payment request
	*/
	@Override
	public java.lang.String getServiceRequestID() {
		return _chequePaymentRequest.getServiceRequestID();
	}

	/**
	* Sets the service request i d of this cheque payment request.
	*
	* @param ServiceRequestID the service request i d of this cheque payment request
	*/
	@Override
	public void setServiceRequestID(java.lang.String ServiceRequestID) {
		_chequePaymentRequest.setServiceRequestID(ServiceRequestID);
	}

	/**
	* Returns the service request master ID of this cheque payment request.
	*
	* @return the service request master ID of this cheque payment request
	*/
	@Override
	public java.lang.String getServiceRequestMasterId() {
		return _chequePaymentRequest.getServiceRequestMasterId();
	}

	/**
	* Sets the service request master ID of this cheque payment request.
	*
	* @param ServiceRequestMasterId the service request master ID of this cheque payment request
	*/
	@Override
	public void setServiceRequestMasterId(
		java.lang.String ServiceRequestMasterId) {
		_chequePaymentRequest.setServiceRequestMasterId(ServiceRequestMasterId);
	}

	/**
	* Returns the description of this cheque payment request.
	*
	* @return the description of this cheque payment request
	*/
	@Override
	public java.lang.String getDescription() {
		return _chequePaymentRequest.getDescription();
	}

	/**
	* Sets the description of this cheque payment request.
	*
	* @param description the description of this cheque payment request
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_chequePaymentRequest.setDescription(description);
	}

	/**
	* Returns the contact ID of this cheque payment request.
	*
	* @return the contact ID of this cheque payment request
	*/
	@Override
	public java.lang.String getContactId() {
		return _chequePaymentRequest.getContactId();
	}

	/**
	* Sets the contact ID of this cheque payment request.
	*
	* @param contactId the contact ID of this cheque payment request
	*/
	@Override
	public void setContactId(java.lang.String contactId) {
		_chequePaymentRequest.setContactId(contactId);
	}

	/**
	* Returns the start prefered time of this cheque payment request.
	*
	* @return the start prefered time of this cheque payment request
	*/
	@Override
	public java.util.Date getStartPreferedTime() {
		return _chequePaymentRequest.getStartPreferedTime();
	}

	/**
	* Sets the start prefered time of this cheque payment request.
	*
	* @param startPreferedTime the start prefered time of this cheque payment request
	*/
	@Override
	public void setStartPreferedTime(java.util.Date startPreferedTime) {
		_chequePaymentRequest.setStartPreferedTime(startPreferedTime);
	}

	/**
	* Returns the end prefered time of this cheque payment request.
	*
	* @return the end prefered time of this cheque payment request
	*/
	@Override
	public java.util.Date getEndPreferedTime() {
		return _chequePaymentRequest.getEndPreferedTime();
	}

	/**
	* Sets the end prefered time of this cheque payment request.
	*
	* @param endPreferedTime the end prefered time of this cheque payment request
	*/
	@Override
	public void setEndPreferedTime(java.util.Date endPreferedTime) {
		_chequePaymentRequest.setEndPreferedTime(endPreferedTime);
	}

	/**
	* Returns the prefered date of this cheque payment request.
	*
	* @return the prefered date of this cheque payment request
	*/
	@Override
	public java.util.Date getPreferedDate() {
		return _chequePaymentRequest.getPreferedDate();
	}

	/**
	* Sets the prefered date of this cheque payment request.
	*
	* @param PreferedDate the prefered date of this cheque payment request
	*/
	@Override
	public void setPreferedDate(java.util.Date PreferedDate) {
		_chequePaymentRequest.setPreferedDate(PreferedDate);
	}

	@Override
	public boolean isNew() {
		return _chequePaymentRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_chequePaymentRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _chequePaymentRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_chequePaymentRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _chequePaymentRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _chequePaymentRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_chequePaymentRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _chequePaymentRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_chequePaymentRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_chequePaymentRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_chequePaymentRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ChequePaymentRequestWrapper((ChequePaymentRequest)_chequePaymentRequest.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest) {
		return _chequePaymentRequest.compareTo(chequePaymentRequest);
	}

	@Override
	public int hashCode() {
		return _chequePaymentRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ChequePaymentRequest> toCacheModel() {
		return _chequePaymentRequest.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ChequePaymentRequest toEscapedModel() {
		return new ChequePaymentRequestWrapper(_chequePaymentRequest.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ChequePaymentRequest toUnescapedModel() {
		return new ChequePaymentRequestWrapper(_chequePaymentRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _chequePaymentRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _chequePaymentRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_chequePaymentRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ChequePaymentRequestWrapper)) {
			return false;
		}

		ChequePaymentRequestWrapper chequePaymentRequestWrapper = (ChequePaymentRequestWrapper)obj;

		if (Validator.equals(_chequePaymentRequest,
					chequePaymentRequestWrapper._chequePaymentRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ChequePaymentRequest getWrappedChequePaymentRequest() {
		return _chequePaymentRequest;
	}

	@Override
	public ChequePaymentRequest getWrappedModel() {
		return _chequePaymentRequest;
	}

	@Override
	public void resetOriginalValues() {
		_chequePaymentRequest.resetOriginalValues();
	}

	private ChequePaymentRequest _chequePaymentRequest;
}