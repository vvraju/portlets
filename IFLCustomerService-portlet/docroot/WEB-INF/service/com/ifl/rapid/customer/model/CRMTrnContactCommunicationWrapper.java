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
 * This class is a wrapper for {@link CRMTrnContactCommunication}.
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnContactCommunication
 * @generated
 */
public class CRMTrnContactCommunicationWrapper
	implements CRMTrnContactCommunication,
		ModelWrapper<CRMTrnContactCommunication> {
	public CRMTrnContactCommunicationWrapper(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		_crmTrnContactCommunication = crmTrnContactCommunication;
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

	/**
	* Returns the primary key of this c r m trn contact communication.
	*
	* @return the primary key of this c r m trn contact communication
	*/
	@Override
	public int getPrimaryKey() {
		return _crmTrnContactCommunication.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c r m trn contact communication.
	*
	* @param primaryKey the primary key of this c r m trn contact communication
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_crmTrnContactCommunication.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contact communication ID of this c r m trn contact communication.
	*
	* @return the contact communication ID of this c r m trn contact communication
	*/
	@Override
	public int getContactCommunicationId() {
		return _crmTrnContactCommunication.getContactCommunicationId();
	}

	/**
	* Sets the contact communication ID of this c r m trn contact communication.
	*
	* @param ContactCommunicationId the contact communication ID of this c r m trn contact communication
	*/
	@Override
	public void setContactCommunicationId(int ContactCommunicationId) {
		_crmTrnContactCommunication.setContactCommunicationId(ContactCommunicationId);
	}

	/**
	* Returns the contact ID of this c r m trn contact communication.
	*
	* @return the contact ID of this c r m trn contact communication
	*/
	@Override
	public int getContactId() {
		return _crmTrnContactCommunication.getContactId();
	}

	/**
	* Sets the contact ID of this c r m trn contact communication.
	*
	* @param ContactId the contact ID of this c r m trn contact communication
	*/
	@Override
	public void setContactId(int ContactId) {
		_crmTrnContactCommunication.setContactId(ContactId);
	}

	/**
	* Returns the communication medium of this c r m trn contact communication.
	*
	* @return the communication medium of this c r m trn contact communication
	*/
	@Override
	public int getCommunicationMedium() {
		return _crmTrnContactCommunication.getCommunicationMedium();
	}

	/**
	* Sets the communication medium of this c r m trn contact communication.
	*
	* @param CommunicationMedium the communication medium of this c r m trn contact communication
	*/
	@Override
	public void setCommunicationMedium(int CommunicationMedium) {
		_crmTrnContactCommunication.setCommunicationMedium(CommunicationMedium);
	}

	/**
	* Returns the communication medium ID of this c r m trn contact communication.
	*
	* @return the communication medium ID of this c r m trn contact communication
	*/
	@Override
	public java.lang.String getCommunicationMediumId() {
		return _crmTrnContactCommunication.getCommunicationMediumId();
	}

	/**
	* Sets the communication medium ID of this c r m trn contact communication.
	*
	* @param CommunicationMediumId the communication medium ID of this c r m trn contact communication
	*/
	@Override
	public void setCommunicationMediumId(java.lang.String CommunicationMediumId) {
		_crmTrnContactCommunication.setCommunicationMediumId(CommunicationMediumId);
	}

	/**
	* Returns the created by of this c r m trn contact communication.
	*
	* @return the created by of this c r m trn contact communication
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _crmTrnContactCommunication.getCreatedBy();
	}

	/**
	* Sets the created by of this c r m trn contact communication.
	*
	* @param CreatedBy the created by of this c r m trn contact communication
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_crmTrnContactCommunication.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this c r m trn contact communication.
	*
	* @return the created date of this c r m trn contact communication
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _crmTrnContactCommunication.getCreatedDate();
	}

	/**
	* Sets the created date of this c r m trn contact communication.
	*
	* @param CreatedDate the created date of this c r m trn contact communication
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_crmTrnContactCommunication.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this c r m trn contact communication.
	*
	* @return the modified by of this c r m trn contact communication
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _crmTrnContactCommunication.getModifiedBy();
	}

	/**
	* Sets the modified by of this c r m trn contact communication.
	*
	* @param ModifiedBy the modified by of this c r m trn contact communication
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_crmTrnContactCommunication.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this c r m trn contact communication.
	*
	* @return the modified date of this c r m trn contact communication
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _crmTrnContactCommunication.getModifiedDate();
	}

	/**
	* Sets the modified date of this c r m trn contact communication.
	*
	* @param ModifiedDate the modified date of this c r m trn contact communication
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_crmTrnContactCommunication.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this c r m trn contact communication.
	*
	* @return the is active of this c r m trn contact communication
	*/
	@Override
	public java.lang.String getIsActive() {
		return _crmTrnContactCommunication.getIsActive();
	}

	/**
	* Sets the is active of this c r m trn contact communication.
	*
	* @param IsActive the is active of this c r m trn contact communication
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_crmTrnContactCommunication.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _crmTrnContactCommunication.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crmTrnContactCommunication.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crmTrnContactCommunication.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmTrnContactCommunication.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crmTrnContactCommunication.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crmTrnContactCommunication.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crmTrnContactCommunication.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crmTrnContactCommunication.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crmTrnContactCommunication.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crmTrnContactCommunication.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crmTrnContactCommunication.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CRMTrnContactCommunicationWrapper((CRMTrnContactCommunication)_crmTrnContactCommunication.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.CRMTrnContactCommunication crmTrnContactCommunication) {
		return _crmTrnContactCommunication.compareTo(crmTrnContactCommunication);
	}

	@Override
	public int hashCode() {
		return _crmTrnContactCommunication.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.CRMTrnContactCommunication> toCacheModel() {
		return _crmTrnContactCommunication.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.CRMTrnContactCommunication toEscapedModel() {
		return new CRMTrnContactCommunicationWrapper(_crmTrnContactCommunication.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.CRMTrnContactCommunication toUnescapedModel() {
		return new CRMTrnContactCommunicationWrapper(_crmTrnContactCommunication.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crmTrnContactCommunication.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmTrnContactCommunication.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmTrnContactCommunication.persist();
	}

	/**
	* Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	*
	* @param ContactId the contact ID
	* @param CommunicationMedium the communication medium
	* @return the matching c r m trn contact communication
	* @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a matching c r m trn contact communication could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifl.rapid.customer.model.CRMTrnContactCommunication findByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crmTrnContactCommunication.findByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRMTrnContactCommunicationWrapper)) {
			return false;
		}

		CRMTrnContactCommunicationWrapper crmTrnContactCommunicationWrapper = (CRMTrnContactCommunicationWrapper)obj;

		if (Validator.equals(_crmTrnContactCommunication,
					crmTrnContactCommunicationWrapper._crmTrnContactCommunication)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CRMTrnContactCommunication getWrappedCRMTrnContactCommunication() {
		return _crmTrnContactCommunication;
	}

	@Override
	public CRMTrnContactCommunication getWrappedModel() {
		return _crmTrnContactCommunication;
	}

	@Override
	public void resetOriginalValues() {
		_crmTrnContactCommunication.resetOriginalValues();
	}

	private CRMTrnContactCommunication _crmTrnContactCommunication;
}