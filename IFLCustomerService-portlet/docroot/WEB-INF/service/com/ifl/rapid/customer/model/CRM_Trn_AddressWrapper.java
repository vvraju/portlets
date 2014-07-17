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
 * This class is a wrapper for {@link CRM_Trn_Address}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_Address
 * @generated
 */
public class CRM_Trn_AddressWrapper implements CRM_Trn_Address,
	ModelWrapper<CRM_Trn_Address> {
	public CRM_Trn_AddressWrapper(CRM_Trn_Address crm_Trn_Address) {
		_crm_Trn_Address = crm_Trn_Address;
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_Address.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_Address.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AddressId", getAddressId());
		attributes.put("ContactId", getContactId());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("AddressLine1", getAddressLine1());
		attributes.put("AddressLine2", getAddressLine2());
		attributes.put("AddressLine3", getAddressLine3());
		attributes.put("District", getDistrict());
		attributes.put("StateId", getStateId());
		attributes.put("CityId", getCityId());
		attributes.put("Pincode", getPincode());
		attributes.put("CountryId", getCountryId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer AddressId = (Integer)attributes.get("AddressId");

		if (AddressId != null) {
			setAddressId(AddressId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
		}

		String AddressLine1 = (String)attributes.get("AddressLine1");

		if (AddressLine1 != null) {
			setAddressLine1(AddressLine1);
		}

		String AddressLine2 = (String)attributes.get("AddressLine2");

		if (AddressLine2 != null) {
			setAddressLine2(AddressLine2);
		}

		String AddressLine3 = (String)attributes.get("AddressLine3");

		if (AddressLine3 != null) {
			setAddressLine3(AddressLine3);
		}

		String District = (String)attributes.get("District");

		if (District != null) {
			setDistrict(District);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}

		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		String Pincode = (String)attributes.get("Pincode");

		if (Pincode != null) {
			setPincode(Pincode);
		}

		Integer CountryId = (Integer)attributes.get("CountryId");

		if (CountryId != null) {
			setCountryId(CountryId);
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
	* Returns the primary key of this c r m_ trn_ address.
	*
	* @return the primary key of this c r m_ trn_ address
	*/
	@Override
	public int getPrimaryKey() {
		return _crm_Trn_Address.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c r m_ trn_ address.
	*
	* @param primaryKey the primary key of this c r m_ trn_ address
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_crm_Trn_Address.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the address ID of this c r m_ trn_ address.
	*
	* @return the address ID of this c r m_ trn_ address
	*/
	@Override
	public int getAddressId() {
		return _crm_Trn_Address.getAddressId();
	}

	/**
	* Sets the address ID of this c r m_ trn_ address.
	*
	* @param AddressId the address ID of this c r m_ trn_ address
	*/
	@Override
	public void setAddressId(int AddressId) {
		_crm_Trn_Address.setAddressId(AddressId);
	}

	/**
	* Returns the contact ID of this c r m_ trn_ address.
	*
	* @return the contact ID of this c r m_ trn_ address
	*/
	@Override
	public int getContactId() {
		return _crm_Trn_Address.getContactId();
	}

	/**
	* Sets the contact ID of this c r m_ trn_ address.
	*
	* @param ContactId the contact ID of this c r m_ trn_ address
	*/
	@Override
	public void setContactId(int ContactId) {
		_crm_Trn_Address.setContactId(ContactId);
	}

	/**
	* Returns the address type ID of this c r m_ trn_ address.
	*
	* @return the address type ID of this c r m_ trn_ address
	*/
	@Override
	public int getAddressTypeId() {
		return _crm_Trn_Address.getAddressTypeId();
	}

	/**
	* Sets the address type ID of this c r m_ trn_ address.
	*
	* @param AddressTypeId the address type ID of this c r m_ trn_ address
	*/
	@Override
	public void setAddressTypeId(int AddressTypeId) {
		_crm_Trn_Address.setAddressTypeId(AddressTypeId);
	}

	/**
	* Returns the address line1 of this c r m_ trn_ address.
	*
	* @return the address line1 of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getAddressLine1() {
		return _crm_Trn_Address.getAddressLine1();
	}

	/**
	* Sets the address line1 of this c r m_ trn_ address.
	*
	* @param AddressLine1 the address line1 of this c r m_ trn_ address
	*/
	@Override
	public void setAddressLine1(java.lang.String AddressLine1) {
		_crm_Trn_Address.setAddressLine1(AddressLine1);
	}

	/**
	* Returns the address line2 of this c r m_ trn_ address.
	*
	* @return the address line2 of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getAddressLine2() {
		return _crm_Trn_Address.getAddressLine2();
	}

	/**
	* Sets the address line2 of this c r m_ trn_ address.
	*
	* @param AddressLine2 the address line2 of this c r m_ trn_ address
	*/
	@Override
	public void setAddressLine2(java.lang.String AddressLine2) {
		_crm_Trn_Address.setAddressLine2(AddressLine2);
	}

	/**
	* Returns the address line3 of this c r m_ trn_ address.
	*
	* @return the address line3 of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getAddressLine3() {
		return _crm_Trn_Address.getAddressLine3();
	}

	/**
	* Sets the address line3 of this c r m_ trn_ address.
	*
	* @param AddressLine3 the address line3 of this c r m_ trn_ address
	*/
	@Override
	public void setAddressLine3(java.lang.String AddressLine3) {
		_crm_Trn_Address.setAddressLine3(AddressLine3);
	}

	/**
	* Returns the district of this c r m_ trn_ address.
	*
	* @return the district of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getDistrict() {
		return _crm_Trn_Address.getDistrict();
	}

	/**
	* Sets the district of this c r m_ trn_ address.
	*
	* @param District the district of this c r m_ trn_ address
	*/
	@Override
	public void setDistrict(java.lang.String District) {
		_crm_Trn_Address.setDistrict(District);
	}

	/**
	* Returns the state ID of this c r m_ trn_ address.
	*
	* @return the state ID of this c r m_ trn_ address
	*/
	@Override
	public int getStateId() {
		return _crm_Trn_Address.getStateId();
	}

	/**
	* Sets the state ID of this c r m_ trn_ address.
	*
	* @param StateId the state ID of this c r m_ trn_ address
	*/
	@Override
	public void setStateId(int StateId) {
		_crm_Trn_Address.setStateId(StateId);
	}

	/**
	* Returns the city ID of this c r m_ trn_ address.
	*
	* @return the city ID of this c r m_ trn_ address
	*/
	@Override
	public int getCityId() {
		return _crm_Trn_Address.getCityId();
	}

	/**
	* Sets the city ID of this c r m_ trn_ address.
	*
	* @param CityId the city ID of this c r m_ trn_ address
	*/
	@Override
	public void setCityId(int CityId) {
		_crm_Trn_Address.setCityId(CityId);
	}

	/**
	* Returns the pincode of this c r m_ trn_ address.
	*
	* @return the pincode of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getPincode() {
		return _crm_Trn_Address.getPincode();
	}

	/**
	* Sets the pincode of this c r m_ trn_ address.
	*
	* @param Pincode the pincode of this c r m_ trn_ address
	*/
	@Override
	public void setPincode(java.lang.String Pincode) {
		_crm_Trn_Address.setPincode(Pincode);
	}

	/**
	* Returns the country ID of this c r m_ trn_ address.
	*
	* @return the country ID of this c r m_ trn_ address
	*/
	@Override
	public int getCountryId() {
		return _crm_Trn_Address.getCountryId();
	}

	/**
	* Sets the country ID of this c r m_ trn_ address.
	*
	* @param CountryId the country ID of this c r m_ trn_ address
	*/
	@Override
	public void setCountryId(int CountryId) {
		_crm_Trn_Address.setCountryId(CountryId);
	}

	/**
	* Returns the is active of this c r m_ trn_ address.
	*
	* @return the is active of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getIsActive() {
		return _crm_Trn_Address.getIsActive();
	}

	/**
	* Sets the is active of this c r m_ trn_ address.
	*
	* @param IsActive the is active of this c r m_ trn_ address
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_crm_Trn_Address.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this c r m_ trn_ address.
	*
	* @return the created by of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _crm_Trn_Address.getCreatedBy();
	}

	/**
	* Sets the created by of this c r m_ trn_ address.
	*
	* @param CreatedBy the created by of this c r m_ trn_ address
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_crm_Trn_Address.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this c r m_ trn_ address.
	*
	* @return the created date of this c r m_ trn_ address
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _crm_Trn_Address.getCreatedDate();
	}

	/**
	* Sets the created date of this c r m_ trn_ address.
	*
	* @param CreatedDate the created date of this c r m_ trn_ address
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_crm_Trn_Address.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this c r m_ trn_ address.
	*
	* @return the modified by of this c r m_ trn_ address
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _crm_Trn_Address.getModifiedBy();
	}

	/**
	* Sets the modified by of this c r m_ trn_ address.
	*
	* @param ModifiedBy the modified by of this c r m_ trn_ address
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_crm_Trn_Address.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this c r m_ trn_ address.
	*
	* @return the modified date of this c r m_ trn_ address
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _crm_Trn_Address.getModifiedDate();
	}

	/**
	* Sets the modified date of this c r m_ trn_ address.
	*
	* @param ModifiedDate the modified date of this c r m_ trn_ address
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_crm_Trn_Address.setModifiedDate(ModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _crm_Trn_Address.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crm_Trn_Address.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crm_Trn_Address.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crm_Trn_Address.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crm_Trn_Address.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crm_Trn_Address.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crm_Trn_Address.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crm_Trn_Address.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crm_Trn_Address.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crm_Trn_Address.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crm_Trn_Address.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CRM_Trn_AddressWrapper((CRM_Trn_Address)_crm_Trn_Address.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.CRM_Trn_Address crm_Trn_Address) {
		return _crm_Trn_Address.compareTo(crm_Trn_Address);
	}

	@Override
	public int hashCode() {
		return _crm_Trn_Address.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.CRM_Trn_Address> toCacheModel() {
		return _crm_Trn_Address.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Address toEscapedModel() {
		return new CRM_Trn_AddressWrapper(_crm_Trn_Address.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Address toUnescapedModel() {
		return new CRM_Trn_AddressWrapper(_crm_Trn_Address.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crm_Trn_Address.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crm_Trn_Address.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crm_Trn_Address.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRM_Trn_AddressWrapper)) {
			return false;
		}

		CRM_Trn_AddressWrapper crm_Trn_AddressWrapper = (CRM_Trn_AddressWrapper)obj;

		if (Validator.equals(_crm_Trn_Address,
					crm_Trn_AddressWrapper._crm_Trn_Address)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CRM_Trn_Address getWrappedCRM_Trn_Address() {
		return _crm_Trn_Address;
	}

	@Override
	public CRM_Trn_Address getWrappedModel() {
		return _crm_Trn_Address;
	}

	@Override
	public void resetOriginalValues() {
		_crm_Trn_Address.resetOriginalValues();
	}

	private CRM_Trn_Address _crm_Trn_Address;
}