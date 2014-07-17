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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PincodeDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see PincodeDetails
 * @generated
 */
public class PincodeDetailsWrapper implements PincodeDetails,
	ModelWrapper<PincodeDetails> {
	public PincodeDetailsWrapper(PincodeDetails pincodeDetails) {
		_pincodeDetails = pincodeDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return PincodeDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PincodeDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PIN_ID", getPIN_ID());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("PIN_CODE", getPIN_CODE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PIN_ID = (Integer)attributes.get("PIN_ID");

		if (PIN_ID != null) {
			setPIN_ID(PIN_ID);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String PIN_CODE = (String)attributes.get("PIN_CODE");

		if (PIN_CODE != null) {
			setPIN_CODE(PIN_CODE);
		}
	}

	/**
	* Returns the primary key of this pincode details.
	*
	* @return the primary key of this pincode details
	*/
	@Override
	public int getPrimaryKey() {
		return _pincodeDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this pincode details.
	*
	* @param primaryKey the primary key of this pincode details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_pincodeDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p i n_ i d of this pincode details.
	*
	* @return the p i n_ i d of this pincode details
	*/
	@Override
	public int getPIN_ID() {
		return _pincodeDetails.getPIN_ID();
	}

	/**
	* Sets the p i n_ i d of this pincode details.
	*
	* @param PIN_ID the p i n_ i d of this pincode details
	*/
	@Override
	public void setPIN_ID(int PIN_ID) {
		_pincodeDetails.setPIN_ID(PIN_ID);
	}

	/**
	* Returns the c i t y_ i d of this pincode details.
	*
	* @return the c i t y_ i d of this pincode details
	*/
	@Override
	public int getCITY_ID() {
		return _pincodeDetails.getCITY_ID();
	}

	/**
	* Sets the c i t y_ i d of this pincode details.
	*
	* @param CITY_ID the c i t y_ i d of this pincode details
	*/
	@Override
	public void setCITY_ID(int CITY_ID) {
		_pincodeDetails.setCITY_ID(CITY_ID);
	}

	/**
	* Returns the s t a t e_ i d of this pincode details.
	*
	* @return the s t a t e_ i d of this pincode details
	*/
	@Override
	public int getSTATE_ID() {
		return _pincodeDetails.getSTATE_ID();
	}

	/**
	* Sets the s t a t e_ i d of this pincode details.
	*
	* @param STATE_ID the s t a t e_ i d of this pincode details
	*/
	@Override
	public void setSTATE_ID(int STATE_ID) {
		_pincodeDetails.setSTATE_ID(STATE_ID);
	}

	/**
	* Returns the p i n_ c o d e of this pincode details.
	*
	* @return the p i n_ c o d e of this pincode details
	*/
	@Override
	public java.lang.String getPIN_CODE() {
		return _pincodeDetails.getPIN_CODE();
	}

	/**
	* Sets the p i n_ c o d e of this pincode details.
	*
	* @param PIN_CODE the p i n_ c o d e of this pincode details
	*/
	@Override
	public void setPIN_CODE(java.lang.String PIN_CODE) {
		_pincodeDetails.setPIN_CODE(PIN_CODE);
	}

	@Override
	public boolean isNew() {
		return _pincodeDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_pincodeDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _pincodeDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pincodeDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _pincodeDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _pincodeDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_pincodeDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _pincodeDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_pincodeDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_pincodeDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_pincodeDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PincodeDetailsWrapper((PincodeDetails)_pincodeDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.PincodeDetails pincodeDetails) {
		return _pincodeDetails.compareTo(pincodeDetails);
	}

	@Override
	public int hashCode() {
		return _pincodeDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PincodeDetails> toCacheModel() {
		return _pincodeDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PincodeDetails toEscapedModel() {
		return new PincodeDetailsWrapper(_pincodeDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PincodeDetails toUnescapedModel() {
		return new PincodeDetailsWrapper(_pincodeDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _pincodeDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pincodeDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_pincodeDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PincodeDetailsWrapper)) {
			return false;
		}

		PincodeDetailsWrapper pincodeDetailsWrapper = (PincodeDetailsWrapper)obj;

		if (Validator.equals(_pincodeDetails,
					pincodeDetailsWrapper._pincodeDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PincodeDetails getWrappedPincodeDetails() {
		return _pincodeDetails;
	}

	@Override
	public PincodeDetails getWrappedModel() {
		return _pincodeDetails;
	}

	@Override
	public void resetOriginalValues() {
		_pincodeDetails.resetOriginalValues();
	}

	private PincodeDetails _pincodeDetails;
}