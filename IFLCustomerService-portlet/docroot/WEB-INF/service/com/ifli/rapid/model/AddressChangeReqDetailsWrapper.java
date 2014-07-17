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
 * This class is a wrapper for {@link AddressChangeReqDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see AddressChangeReqDetails
 * @generated
 */
public class AddressChangeReqDetailsWrapper implements AddressChangeReqDetails,
	ModelWrapper<AddressChangeReqDetails> {
	public AddressChangeReqDetailsWrapper(
		AddressChangeReqDetails addressChangeReqDetails) {
		_addressChangeReqDetails = addressChangeReqDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return AddressChangeReqDetails.class;
	}

	@Override
	public String getModelClassName() {
		return AddressChangeReqDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ADDR_CHANGE_DETAILS_ID", getADDR_CHANGE_DETAILS_ID());
		attributes.put("REQUEST_SUBMIT_TYPE", getREQUEST_SUBMIT_TYPE());
		attributes.put("SERVICE_REQUEST_ID", getSERVICE_REQUEST_ID());
		attributes.put("SUB_TYPE", getSUB_TYPE());
		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("SUBMIT_AT_BRANCH", getSUBMIT_AT_BRANCH());
		attributes.put("PICKUP_DATE", getPICKUP_DATE());
		attributes.put("PICKUP_TIME", getPICKUP_TIME());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ADDR_CHANGE_DETAILS_ID = (Integer)attributes.get(
				"ADDR_CHANGE_DETAILS_ID");

		if (ADDR_CHANGE_DETAILS_ID != null) {
			setADDR_CHANGE_DETAILS_ID(ADDR_CHANGE_DETAILS_ID);
		}

		String REQUEST_SUBMIT_TYPE = (String)attributes.get(
				"REQUEST_SUBMIT_TYPE");

		if (REQUEST_SUBMIT_TYPE != null) {
			setREQUEST_SUBMIT_TYPE(REQUEST_SUBMIT_TYPE);
		}

		Integer SERVICE_REQUEST_ID = (Integer)attributes.get(
				"SERVICE_REQUEST_ID");

		if (SERVICE_REQUEST_ID != null) {
			setSERVICE_REQUEST_ID(SERVICE_REQUEST_ID);
		}

		Integer SUB_TYPE = (Integer)attributes.get("SUB_TYPE");

		if (SUB_TYPE != null) {
			setSUB_TYPE(SUB_TYPE);
		}

		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		Integer SUBMIT_AT_BRANCH = (Integer)attributes.get("SUBMIT_AT_BRANCH");

		if (SUBMIT_AT_BRANCH != null) {
			setSUBMIT_AT_BRANCH(SUBMIT_AT_BRANCH);
		}

		Date PICKUP_DATE = (Date)attributes.get("PICKUP_DATE");

		if (PICKUP_DATE != null) {
			setPICKUP_DATE(PICKUP_DATE);
		}

		String PICKUP_TIME = (String)attributes.get("PICKUP_TIME");

		if (PICKUP_TIME != null) {
			setPICKUP_TIME(PICKUP_TIME);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}
	}

	/**
	* Returns the primary key of this address change req details.
	*
	* @return the primary key of this address change req details
	*/
	@Override
	public int getPrimaryKey() {
		return _addressChangeReqDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this address change req details.
	*
	* @param primaryKey the primary key of this address change req details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_addressChangeReqDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details.
	*
	* @return the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details
	*/
	@Override
	public int getADDR_CHANGE_DETAILS_ID() {
		return _addressChangeReqDetails.getADDR_CHANGE_DETAILS_ID();
	}

	/**
	* Sets the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details.
	*
	* @param ADDR_CHANGE_DETAILS_ID the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details
	*/
	@Override
	public void setADDR_CHANGE_DETAILS_ID(int ADDR_CHANGE_DETAILS_ID) {
		_addressChangeReqDetails.setADDR_CHANGE_DETAILS_ID(ADDR_CHANGE_DETAILS_ID);
	}

	/**
	* Returns the r e q u e s t_ s u b m i t_ t y p e of this address change req details.
	*
	* @return the r e q u e s t_ s u b m i t_ t y p e of this address change req details
	*/
	@Override
	public java.lang.String getREQUEST_SUBMIT_TYPE() {
		return _addressChangeReqDetails.getREQUEST_SUBMIT_TYPE();
	}

	/**
	* Sets the r e q u e s t_ s u b m i t_ t y p e of this address change req details.
	*
	* @param REQUEST_SUBMIT_TYPE the r e q u e s t_ s u b m i t_ t y p e of this address change req details
	*/
	@Override
	public void setREQUEST_SUBMIT_TYPE(java.lang.String REQUEST_SUBMIT_TYPE) {
		_addressChangeReqDetails.setREQUEST_SUBMIT_TYPE(REQUEST_SUBMIT_TYPE);
	}

	/**
	* Returns the s e r v i c e_ r e q u e s t_ i d of this address change req details.
	*
	* @return the s e r v i c e_ r e q u e s t_ i d of this address change req details
	*/
	@Override
	public int getSERVICE_REQUEST_ID() {
		return _addressChangeReqDetails.getSERVICE_REQUEST_ID();
	}

	/**
	* Sets the s e r v i c e_ r e q u e s t_ i d of this address change req details.
	*
	* @param SERVICE_REQUEST_ID the s e r v i c e_ r e q u e s t_ i d of this address change req details
	*/
	@Override
	public void setSERVICE_REQUEST_ID(int SERVICE_REQUEST_ID) {
		_addressChangeReqDetails.setSERVICE_REQUEST_ID(SERVICE_REQUEST_ID);
	}

	/**
	* Returns the s u b_ t y p e of this address change req details.
	*
	* @return the s u b_ t y p e of this address change req details
	*/
	@Override
	public int getSUB_TYPE() {
		return _addressChangeReqDetails.getSUB_TYPE();
	}

	/**
	* Sets the s u b_ t y p e of this address change req details.
	*
	* @param SUB_TYPE the s u b_ t y p e of this address change req details
	*/
	@Override
	public void setSUB_TYPE(int SUB_TYPE) {
		_addressChangeReqDetails.setSUB_TYPE(SUB_TYPE);
	}

	/**
	* Returns the a d d r e s s_ t y p e_ i d of this address change req details.
	*
	* @return the a d d r e s s_ t y p e_ i d of this address change req details
	*/
	@Override
	public int getADDRESS_TYPE_ID() {
		return _addressChangeReqDetails.getADDRESS_TYPE_ID();
	}

	/**
	* Sets the a d d r e s s_ t y p e_ i d of this address change req details.
	*
	* @param ADDRESS_TYPE_ID the a d d r e s s_ t y p e_ i d of this address change req details
	*/
	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_addressChangeReqDetails.setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
	}

	/**
	* Returns the c u s t o m e r_ i d of this address change req details.
	*
	* @return the c u s t o m e r_ i d of this address change req details
	*/
	@Override
	public int getCUSTOMER_ID() {
		return _addressChangeReqDetails.getCUSTOMER_ID();
	}

	/**
	* Sets the c u s t o m e r_ i d of this address change req details.
	*
	* @param CUSTOMER_ID the c u s t o m e r_ i d of this address change req details
	*/
	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_addressChangeReqDetails.setCUSTOMER_ID(CUSTOMER_ID);
	}

	/**
	* Returns the s u b m i t_ a t_ b r a n c h of this address change req details.
	*
	* @return the s u b m i t_ a t_ b r a n c h of this address change req details
	*/
	@Override
	public int getSUBMIT_AT_BRANCH() {
		return _addressChangeReqDetails.getSUBMIT_AT_BRANCH();
	}

	/**
	* Sets the s u b m i t_ a t_ b r a n c h of this address change req details.
	*
	* @param SUBMIT_AT_BRANCH the s u b m i t_ a t_ b r a n c h of this address change req details
	*/
	@Override
	public void setSUBMIT_AT_BRANCH(int SUBMIT_AT_BRANCH) {
		_addressChangeReqDetails.setSUBMIT_AT_BRANCH(SUBMIT_AT_BRANCH);
	}

	/**
	* Returns the p i c k u p_ d a t e of this address change req details.
	*
	* @return the p i c k u p_ d a t e of this address change req details
	*/
	@Override
	public java.util.Date getPICKUP_DATE() {
		return _addressChangeReqDetails.getPICKUP_DATE();
	}

	/**
	* Sets the p i c k u p_ d a t e of this address change req details.
	*
	* @param PICKUP_DATE the p i c k u p_ d a t e of this address change req details
	*/
	@Override
	public void setPICKUP_DATE(java.util.Date PICKUP_DATE) {
		_addressChangeReqDetails.setPICKUP_DATE(PICKUP_DATE);
	}

	/**
	* Returns the p i c k u p_ t i m e of this address change req details.
	*
	* @return the p i c k u p_ t i m e of this address change req details
	*/
	@Override
	public java.lang.String getPICKUP_TIME() {
		return _addressChangeReqDetails.getPICKUP_TIME();
	}

	/**
	* Sets the p i c k u p_ t i m e of this address change req details.
	*
	* @param PICKUP_TIME the p i c k u p_ t i m e of this address change req details
	*/
	@Override
	public void setPICKUP_TIME(java.lang.String PICKUP_TIME) {
		_addressChangeReqDetails.setPICKUP_TIME(PICKUP_TIME);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this address change req details.
	*
	* @return the i n s e r t e d_ d a t e of this address change req details
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _addressChangeReqDetails.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this address change req details.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this address change req details
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_addressChangeReqDetails.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this address change req details.
	*
	* @return the i n s e r t e d_ b y of this address change req details
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _addressChangeReqDetails.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this address change req details.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this address change req details
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_addressChangeReqDetails.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this address change req details.
	*
	* @return the u p d a t e d_ d a t e of this address change req details
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _addressChangeReqDetails.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this address change req details.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this address change req details
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_addressChangeReqDetails.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this address change req details.
	*
	* @return the u p d a t e d_ b y of this address change req details
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _addressChangeReqDetails.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this address change req details.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this address change req details
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_addressChangeReqDetails.setUPDATED_BY(UPDATED_BY);
	}

	@Override
	public boolean isNew() {
		return _addressChangeReqDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_addressChangeReqDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _addressChangeReqDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_addressChangeReqDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _addressChangeReqDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _addressChangeReqDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_addressChangeReqDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _addressChangeReqDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_addressChangeReqDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_addressChangeReqDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_addressChangeReqDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AddressChangeReqDetailsWrapper((AddressChangeReqDetails)_addressChangeReqDetails.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails) {
		return _addressChangeReqDetails.compareTo(addressChangeReqDetails);
	}

	@Override
	public int hashCode() {
		return _addressChangeReqDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.AddressChangeReqDetails> toCacheModel() {
		return _addressChangeReqDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails toEscapedModel() {
		return new AddressChangeReqDetailsWrapper(_addressChangeReqDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.AddressChangeReqDetails toUnescapedModel() {
		return new AddressChangeReqDetailsWrapper(_addressChangeReqDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _addressChangeReqDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _addressChangeReqDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressChangeReqDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressChangeReqDetailsWrapper)) {
			return false;
		}

		AddressChangeReqDetailsWrapper addressChangeReqDetailsWrapper = (AddressChangeReqDetailsWrapper)obj;

		if (Validator.equals(_addressChangeReqDetails,
					addressChangeReqDetailsWrapper._addressChangeReqDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AddressChangeReqDetails getWrappedAddressChangeReqDetails() {
		return _addressChangeReqDetails;
	}

	@Override
	public AddressChangeReqDetails getWrappedModel() {
		return _addressChangeReqDetails;
	}

	@Override
	public void resetOriginalValues() {
		_addressChangeReqDetails.resetOriginalValues();
	}

	private AddressChangeReqDetails _addressChangeReqDetails;
}