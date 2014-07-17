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
 * This class is a wrapper for {@link CRM_Trn_Phone}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_Phone
 * @generated
 */
public class CRM_Trn_PhoneWrapper implements CRM_Trn_Phone,
	ModelWrapper<CRM_Trn_Phone> {
	public CRM_Trn_PhoneWrapper(CRM_Trn_Phone crm_Trn_Phone) {
		_crm_Trn_Phone = crm_Trn_Phone;
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_Phone.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_Phone.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PhoneId", getPhoneId());
		attributes.put("ContactId", getContactId());
		attributes.put("PhoneType", getPhoneType());
		attributes.put("PhoneNumber", getPhoneNumber());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PhoneId = (Integer)attributes.get("PhoneId");

		if (PhoneId != null) {
			setPhoneId(PhoneId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer PhoneType = (Integer)attributes.get("PhoneType");

		if (PhoneType != null) {
			setPhoneType(PhoneType);
		}

		String PhoneNumber = (String)attributes.get("PhoneNumber");

		if (PhoneNumber != null) {
			setPhoneNumber(PhoneNumber);
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
	* Returns the primary key of this c r m_ trn_ phone.
	*
	* @return the primary key of this c r m_ trn_ phone
	*/
	@Override
	public int getPrimaryKey() {
		return _crm_Trn_Phone.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c r m_ trn_ phone.
	*
	* @param primaryKey the primary key of this c r m_ trn_ phone
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_crm_Trn_Phone.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the phone ID of this c r m_ trn_ phone.
	*
	* @return the phone ID of this c r m_ trn_ phone
	*/
	@Override
	public int getPhoneId() {
		return _crm_Trn_Phone.getPhoneId();
	}

	/**
	* Sets the phone ID of this c r m_ trn_ phone.
	*
	* @param PhoneId the phone ID of this c r m_ trn_ phone
	*/
	@Override
	public void setPhoneId(int PhoneId) {
		_crm_Trn_Phone.setPhoneId(PhoneId);
	}

	/**
	* Returns the contact ID of this c r m_ trn_ phone.
	*
	* @return the contact ID of this c r m_ trn_ phone
	*/
	@Override
	public int getContactId() {
		return _crm_Trn_Phone.getContactId();
	}

	/**
	* Sets the contact ID of this c r m_ trn_ phone.
	*
	* @param ContactId the contact ID of this c r m_ trn_ phone
	*/
	@Override
	public void setContactId(int ContactId) {
		_crm_Trn_Phone.setContactId(ContactId);
	}

	/**
	* Returns the phone type of this c r m_ trn_ phone.
	*
	* @return the phone type of this c r m_ trn_ phone
	*/
	@Override
	public int getPhoneType() {
		return _crm_Trn_Phone.getPhoneType();
	}

	/**
	* Sets the phone type of this c r m_ trn_ phone.
	*
	* @param PhoneType the phone type of this c r m_ trn_ phone
	*/
	@Override
	public void setPhoneType(int PhoneType) {
		_crm_Trn_Phone.setPhoneType(PhoneType);
	}

	/**
	* Returns the phone number of this c r m_ trn_ phone.
	*
	* @return the phone number of this c r m_ trn_ phone
	*/
	@Override
	public java.lang.String getPhoneNumber() {
		return _crm_Trn_Phone.getPhoneNumber();
	}

	/**
	* Sets the phone number of this c r m_ trn_ phone.
	*
	* @param PhoneNumber the phone number of this c r m_ trn_ phone
	*/
	@Override
	public void setPhoneNumber(java.lang.String PhoneNumber) {
		_crm_Trn_Phone.setPhoneNumber(PhoneNumber);
	}

	/**
	* Returns the created by of this c r m_ trn_ phone.
	*
	* @return the created by of this c r m_ trn_ phone
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _crm_Trn_Phone.getCreatedBy();
	}

	/**
	* Sets the created by of this c r m_ trn_ phone.
	*
	* @param CreatedBy the created by of this c r m_ trn_ phone
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_crm_Trn_Phone.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this c r m_ trn_ phone.
	*
	* @return the created date of this c r m_ trn_ phone
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _crm_Trn_Phone.getCreatedDate();
	}

	/**
	* Sets the created date of this c r m_ trn_ phone.
	*
	* @param CreatedDate the created date of this c r m_ trn_ phone
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_crm_Trn_Phone.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this c r m_ trn_ phone.
	*
	* @return the modified by of this c r m_ trn_ phone
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _crm_Trn_Phone.getModifiedBy();
	}

	/**
	* Sets the modified by of this c r m_ trn_ phone.
	*
	* @param ModifiedBy the modified by of this c r m_ trn_ phone
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_crm_Trn_Phone.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this c r m_ trn_ phone.
	*
	* @return the modified date of this c r m_ trn_ phone
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _crm_Trn_Phone.getModifiedDate();
	}

	/**
	* Sets the modified date of this c r m_ trn_ phone.
	*
	* @param ModifiedDate the modified date of this c r m_ trn_ phone
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_crm_Trn_Phone.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this c r m_ trn_ phone.
	*
	* @return the is active of this c r m_ trn_ phone
	*/
	@Override
	public java.lang.String getIsActive() {
		return _crm_Trn_Phone.getIsActive();
	}

	/**
	* Sets the is active of this c r m_ trn_ phone.
	*
	* @param IsActive the is active of this c r m_ trn_ phone
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_crm_Trn_Phone.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _crm_Trn_Phone.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crm_Trn_Phone.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crm_Trn_Phone.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crm_Trn_Phone.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crm_Trn_Phone.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crm_Trn_Phone.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crm_Trn_Phone.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crm_Trn_Phone.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crm_Trn_Phone.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crm_Trn_Phone.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crm_Trn_Phone.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CRM_Trn_PhoneWrapper((CRM_Trn_Phone)_crm_Trn_Phone.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone) {
		return _crm_Trn_Phone.compareTo(crm_Trn_Phone);
	}

	@Override
	public int hashCode() {
		return _crm_Trn_Phone.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.CRM_Trn_Phone> toCacheModel() {
		return _crm_Trn_Phone.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone toEscapedModel() {
		return new CRM_Trn_PhoneWrapper(_crm_Trn_Phone.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Phone toUnescapedModel() {
		return new CRM_Trn_PhoneWrapper(_crm_Trn_Phone.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crm_Trn_Phone.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crm_Trn_Phone.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crm_Trn_Phone.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRM_Trn_PhoneWrapper)) {
			return false;
		}

		CRM_Trn_PhoneWrapper crm_Trn_PhoneWrapper = (CRM_Trn_PhoneWrapper)obj;

		if (Validator.equals(_crm_Trn_Phone, crm_Trn_PhoneWrapper._crm_Trn_Phone)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CRM_Trn_Phone getWrappedCRM_Trn_Phone() {
		return _crm_Trn_Phone;
	}

	@Override
	public CRM_Trn_Phone getWrappedModel() {
		return _crm_Trn_Phone;
	}

	@Override
	public void resetOriginalValues() {
		_crm_Trn_Phone.resetOriginalValues();
	}

	private CRM_Trn_Phone _crm_Trn_Phone;
}