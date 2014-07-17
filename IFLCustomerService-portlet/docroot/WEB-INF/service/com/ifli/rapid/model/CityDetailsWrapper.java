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
 * This class is a wrapper for {@link CityDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see CityDetails
 * @generated
 */
public class CityDetailsWrapper implements CityDetails,
	ModelWrapper<CityDetails> {
	public CityDetailsWrapper(CityDetails cityDetails) {
		_cityDetails = cityDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return CityDetails.class;
	}

	@Override
	public String getModelClassName() {
		return CityDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("CITY_CODE", getCITY_CODE());
		attributes.put("CITY_NAME", getCITY_NAME());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("IS_ACTIVE", getIS_ACTIVE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		String CITY_CODE = (String)attributes.get("CITY_CODE");

		if (CITY_CODE != null) {
			setCITY_CODE(CITY_CODE);
		}

		String CITY_NAME = (String)attributes.get("CITY_NAME");

		if (CITY_NAME != null) {
			setCITY_NAME(CITY_NAME);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String IS_ACTIVE = (String)attributes.get("IS_ACTIVE");

		if (IS_ACTIVE != null) {
			setIS_ACTIVE(IS_ACTIVE);
		}
	}

	/**
	* Returns the primary key of this city details.
	*
	* @return the primary key of this city details
	*/
	@Override
	public int getPrimaryKey() {
		return _cityDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this city details.
	*
	* @param primaryKey the primary key of this city details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_cityDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the c i t y_ i d of this city details.
	*
	* @return the c i t y_ i d of this city details
	*/
	@Override
	public int getCITY_ID() {
		return _cityDetails.getCITY_ID();
	}

	/**
	* Sets the c i t y_ i d of this city details.
	*
	* @param CITY_ID the c i t y_ i d of this city details
	*/
	@Override
	public void setCITY_ID(int CITY_ID) {
		_cityDetails.setCITY_ID(CITY_ID);
	}

	/**
	* Returns the c i t y_ c o d e of this city details.
	*
	* @return the c i t y_ c o d e of this city details
	*/
	@Override
	public java.lang.String getCITY_CODE() {
		return _cityDetails.getCITY_CODE();
	}

	/**
	* Sets the c i t y_ c o d e of this city details.
	*
	* @param CITY_CODE the c i t y_ c o d e of this city details
	*/
	@Override
	public void setCITY_CODE(java.lang.String CITY_CODE) {
		_cityDetails.setCITY_CODE(CITY_CODE);
	}

	/**
	* Returns the c i t y_ n a m e of this city details.
	*
	* @return the c i t y_ n a m e of this city details
	*/
	@Override
	public java.lang.String getCITY_NAME() {
		return _cityDetails.getCITY_NAME();
	}

	/**
	* Sets the c i t y_ n a m e of this city details.
	*
	* @param CITY_NAME the c i t y_ n a m e of this city details
	*/
	@Override
	public void setCITY_NAME(java.lang.String CITY_NAME) {
		_cityDetails.setCITY_NAME(CITY_NAME);
	}

	/**
	* Returns the s t a t e_ i d of this city details.
	*
	* @return the s t a t e_ i d of this city details
	*/
	@Override
	public int getSTATE_ID() {
		return _cityDetails.getSTATE_ID();
	}

	/**
	* Sets the s t a t e_ i d of this city details.
	*
	* @param STATE_ID the s t a t e_ i d of this city details
	*/
	@Override
	public void setSTATE_ID(int STATE_ID) {
		_cityDetails.setSTATE_ID(STATE_ID);
	}

	/**
	* Returns the i s_ a c t i v e of this city details.
	*
	* @return the i s_ a c t i v e of this city details
	*/
	@Override
	public java.lang.String getIS_ACTIVE() {
		return _cityDetails.getIS_ACTIVE();
	}

	/**
	* Sets the i s_ a c t i v e of this city details.
	*
	* @param IS_ACTIVE the i s_ a c t i v e of this city details
	*/
	@Override
	public void setIS_ACTIVE(java.lang.String IS_ACTIVE) {
		_cityDetails.setIS_ACTIVE(IS_ACTIVE);
	}

	@Override
	public boolean isNew() {
		return _cityDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cityDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cityDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cityDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cityDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cityDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cityDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cityDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cityDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cityDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cityDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CityDetailsWrapper((CityDetails)_cityDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.CityDetails cityDetails) {
		return _cityDetails.compareTo(cityDetails);
	}

	@Override
	public int hashCode() {
		return _cityDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.CityDetails> toCacheModel() {
		return _cityDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.CityDetails toEscapedModel() {
		return new CityDetailsWrapper(_cityDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.CityDetails toUnescapedModel() {
		return new CityDetailsWrapper(_cityDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cityDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cityDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cityDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CityDetailsWrapper)) {
			return false;
		}

		CityDetailsWrapper cityDetailsWrapper = (CityDetailsWrapper)obj;

		if (Validator.equals(_cityDetails, cityDetailsWrapper._cityDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CityDetails getWrappedCityDetails() {
		return _cityDetails;
	}

	@Override
	public CityDetails getWrappedModel() {
		return _cityDetails;
	}

	@Override
	public void resetOriginalValues() {
		_cityDetails.resetOriginalValues();
	}

	private CityDetails _cityDetails;
}