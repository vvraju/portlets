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
 * This class is a wrapper for {@link AddressType}.
 * </p>
 *
 * @author Satya Kola
 * @see AddressType
 * @generated
 */
public class AddressTypeWrapper implements AddressType,
	ModelWrapper<AddressType> {
	public AddressTypeWrapper(AddressType addressType) {
		_addressType = addressType;
	}

	@Override
	public Class<?> getModelClass() {
		return AddressType.class;
	}

	@Override
	public String getModelClassName() {
		return AddressType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());
		attributes.put("ADDRESS_TYPE_DESC", getADDRESS_TYPE_DESC());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}

		String ADDRESS_TYPE_DESC = (String)attributes.get("ADDRESS_TYPE_DESC");

		if (ADDRESS_TYPE_DESC != null) {
			setADDRESS_TYPE_DESC(ADDRESS_TYPE_DESC);
		}
	}

	/**
	* Returns the primary key of this address type.
	*
	* @return the primary key of this address type
	*/
	@Override
	public int getPrimaryKey() {
		return _addressType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this address type.
	*
	* @param primaryKey the primary key of this address type
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_addressType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the a d d r e s s_ t y p e_ i d of this address type.
	*
	* @return the a d d r e s s_ t y p e_ i d of this address type
	*/
	@Override
	public int getADDRESS_TYPE_ID() {
		return _addressType.getADDRESS_TYPE_ID();
	}

	/**
	* Sets the a d d r e s s_ t y p e_ i d of this address type.
	*
	* @param ADDRESS_TYPE_ID the a d d r e s s_ t y p e_ i d of this address type
	*/
	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_addressType.setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
	}

	/**
	* Returns the i n s e r t e d_ b y of this address type.
	*
	* @return the i n s e r t e d_ b y of this address type
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _addressType.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this address type.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this address type
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_addressType.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this address type.
	*
	* @return the i n s e r t e d_ d a t e of this address type
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _addressType.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this address type.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this address type
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_addressType.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this address type.
	*
	* @return the u p d a t e d_ b y of this address type
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _addressType.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this address type.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this address type
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_addressType.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this address type.
	*
	* @return the u p d a t e d_ d a t e of this address type
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _addressType.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this address type.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this address type
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_addressType.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the a c t i v e_ f l a g of this address type.
	*
	* @return the a c t i v e_ f l a g of this address type
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _addressType.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this address type.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this address type
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_addressType.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	/**
	* Returns the a d d r e s s_ t y p e_ d e s c of this address type.
	*
	* @return the a d d r e s s_ t y p e_ d e s c of this address type
	*/
	@Override
	public java.lang.String getADDRESS_TYPE_DESC() {
		return _addressType.getADDRESS_TYPE_DESC();
	}

	/**
	* Sets the a d d r e s s_ t y p e_ d e s c of this address type.
	*
	* @param ADDRESS_TYPE_DESC the a d d r e s s_ t y p e_ d e s c of this address type
	*/
	@Override
	public void setADDRESS_TYPE_DESC(java.lang.String ADDRESS_TYPE_DESC) {
		_addressType.setADDRESS_TYPE_DESC(ADDRESS_TYPE_DESC);
	}

	@Override
	public boolean isNew() {
		return _addressType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_addressType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _addressType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_addressType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _addressType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _addressType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_addressType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _addressType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_addressType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_addressType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_addressType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AddressTypeWrapper((AddressType)_addressType.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.AddressType addressType) {
		return _addressType.compareTo(addressType);
	}

	@Override
	public int hashCode() {
		return _addressType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.AddressType> toCacheModel() {
		return _addressType.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.AddressType toEscapedModel() {
		return new AddressTypeWrapper(_addressType.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.AddressType toUnescapedModel() {
		return new AddressTypeWrapper(_addressType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _addressType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _addressType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressTypeWrapper)) {
			return false;
		}

		AddressTypeWrapper addressTypeWrapper = (AddressTypeWrapper)obj;

		if (Validator.equals(_addressType, addressTypeWrapper._addressType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AddressType getWrappedAddressType() {
		return _addressType;
	}

	@Override
	public AddressType getWrappedModel() {
		return _addressType;
	}

	@Override
	public void resetOriginalValues() {
		_addressType.resetOriginalValues();
	}

	private AddressType _addressType;
}