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
 * This class is a wrapper for {@link CRM_Trn_PolicyAddress}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddress
 * @generated
 */
public class CRM_Trn_PolicyAddressWrapper implements CRM_Trn_PolicyAddress,
	ModelWrapper<CRM_Trn_PolicyAddress> {
	public CRM_Trn_PolicyAddressWrapper(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		_crm_Trn_PolicyAddress = crm_Trn_PolicyAddress;
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_PolicyAddress.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_PolicyAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PolicyAddressId", getPolicyAddressId());
		attributes.put("ContactId", getContactId());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("AddressId", getAddressId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PolicyAddressId = (Integer)attributes.get("PolicyAddressId");

		if (PolicyAddressId != null) {
			setPolicyAddressId(PolicyAddressId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String PolicyNo = (String)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		Integer AddressId = (Integer)attributes.get("AddressId");

		if (AddressId != null) {
			setAddressId(AddressId);
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

	/**
	* Returns the primary key of this c r m_ trn_ policy address.
	*
	* @return the primary key of this c r m_ trn_ policy address
	*/
	@Override
	public int getPrimaryKey() {
		return _crm_Trn_PolicyAddress.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c r m_ trn_ policy address.
	*
	* @param primaryKey the primary key of this c r m_ trn_ policy address
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_crm_Trn_PolicyAddress.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the policy address ID of this c r m_ trn_ policy address.
	*
	* @return the policy address ID of this c r m_ trn_ policy address
	*/
	@Override
	public int getPolicyAddressId() {
		return _crm_Trn_PolicyAddress.getPolicyAddressId();
	}

	/**
	* Sets the policy address ID of this c r m_ trn_ policy address.
	*
	* @param PolicyAddressId the policy address ID of this c r m_ trn_ policy address
	*/
	@Override
	public void setPolicyAddressId(int PolicyAddressId) {
		_crm_Trn_PolicyAddress.setPolicyAddressId(PolicyAddressId);
	}

	/**
	* Returns the contact ID of this c r m_ trn_ policy address.
	*
	* @return the contact ID of this c r m_ trn_ policy address
	*/
	@Override
	public int getContactId() {
		return _crm_Trn_PolicyAddress.getContactId();
	}

	/**
	* Sets the contact ID of this c r m_ trn_ policy address.
	*
	* @param ContactId the contact ID of this c r m_ trn_ policy address
	*/
	@Override
	public void setContactId(int ContactId) {
		_crm_Trn_PolicyAddress.setContactId(ContactId);
	}

	/**
	* Returns the policy no of this c r m_ trn_ policy address.
	*
	* @return the policy no of this c r m_ trn_ policy address
	*/
	@Override
	public java.lang.String getPolicyNo() {
		return _crm_Trn_PolicyAddress.getPolicyNo();
	}

	/**
	* Sets the policy no of this c r m_ trn_ policy address.
	*
	* @param PolicyNo the policy no of this c r m_ trn_ policy address
	*/
	@Override
	public void setPolicyNo(java.lang.String PolicyNo) {
		_crm_Trn_PolicyAddress.setPolicyNo(PolicyNo);
	}

	/**
	* Returns the address ID of this c r m_ trn_ policy address.
	*
	* @return the address ID of this c r m_ trn_ policy address
	*/
	@Override
	public int getAddressId() {
		return _crm_Trn_PolicyAddress.getAddressId();
	}

	/**
	* Sets the address ID of this c r m_ trn_ policy address.
	*
	* @param AddressId the address ID of this c r m_ trn_ policy address
	*/
	@Override
	public void setAddressId(int AddressId) {
		_crm_Trn_PolicyAddress.setAddressId(AddressId);
	}

	/**
	* Returns the is active of this c r m_ trn_ policy address.
	*
	* @return the is active of this c r m_ trn_ policy address
	*/
	@Override
	public java.lang.String getIsActive() {
		return _crm_Trn_PolicyAddress.getIsActive();
	}

	/**
	* Sets the is active of this c r m_ trn_ policy address.
	*
	* @param IsActive the is active of this c r m_ trn_ policy address
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_crm_Trn_PolicyAddress.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this c r m_ trn_ policy address.
	*
	* @return the created by of this c r m_ trn_ policy address
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _crm_Trn_PolicyAddress.getCreatedBy();
	}

	/**
	* Sets the created by of this c r m_ trn_ policy address.
	*
	* @param CreatedBy the created by of this c r m_ trn_ policy address
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_crm_Trn_PolicyAddress.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this c r m_ trn_ policy address.
	*
	* @return the created date of this c r m_ trn_ policy address
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _crm_Trn_PolicyAddress.getCreatedDate();
	}

	/**
	* Sets the created date of this c r m_ trn_ policy address.
	*
	* @param CreatedDate the created date of this c r m_ trn_ policy address
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_crm_Trn_PolicyAddress.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this c r m_ trn_ policy address.
	*
	* @return the modified by of this c r m_ trn_ policy address
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _crm_Trn_PolicyAddress.getModifiedBy();
	}

	/**
	* Sets the modified by of this c r m_ trn_ policy address.
	*
	* @param ModifiedBy the modified by of this c r m_ trn_ policy address
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_crm_Trn_PolicyAddress.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this c r m_ trn_ policy address.
	*
	* @return the modified date of this c r m_ trn_ policy address
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _crm_Trn_PolicyAddress.getModifiedDate();
	}

	/**
	* Sets the modified date of this c r m_ trn_ policy address.
	*
	* @param ModifiedDate the modified date of this c r m_ trn_ policy address
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_crm_Trn_PolicyAddress.setModifiedDate(ModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _crm_Trn_PolicyAddress.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crm_Trn_PolicyAddress.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crm_Trn_PolicyAddress.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crm_Trn_PolicyAddress.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crm_Trn_PolicyAddress.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crm_Trn_PolicyAddress.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crm_Trn_PolicyAddress.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crm_Trn_PolicyAddress.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crm_Trn_PolicyAddress.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crm_Trn_PolicyAddress.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crm_Trn_PolicyAddress.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CRM_Trn_PolicyAddressWrapper((CRM_Trn_PolicyAddress)_crm_Trn_PolicyAddress.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		return _crm_Trn_PolicyAddress.compareTo(crm_Trn_PolicyAddress);
	}

	@Override
	public int hashCode() {
		return _crm_Trn_PolicyAddress.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> toCacheModel() {
		return _crm_Trn_PolicyAddress.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress toEscapedModel() {
		return new CRM_Trn_PolicyAddressWrapper(_crm_Trn_PolicyAddress.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress toUnescapedModel() {
		return new CRM_Trn_PolicyAddressWrapper(_crm_Trn_PolicyAddress.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crm_Trn_PolicyAddress.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crm_Trn_PolicyAddress.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crm_Trn_PolicyAddress.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRM_Trn_PolicyAddressWrapper)) {
			return false;
		}

		CRM_Trn_PolicyAddressWrapper crm_Trn_PolicyAddressWrapper = (CRM_Trn_PolicyAddressWrapper)obj;

		if (Validator.equals(_crm_Trn_PolicyAddress,
					crm_Trn_PolicyAddressWrapper._crm_Trn_PolicyAddress)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CRM_Trn_PolicyAddress getWrappedCRM_Trn_PolicyAddress() {
		return _crm_Trn_PolicyAddress;
	}

	@Override
	public CRM_Trn_PolicyAddress getWrappedModel() {
		return _crm_Trn_PolicyAddress;
	}

	@Override
	public void resetOriginalValues() {
		_crm_Trn_PolicyAddress.resetOriginalValues();
	}

	private CRM_Trn_PolicyAddress _crm_Trn_PolicyAddress;
}