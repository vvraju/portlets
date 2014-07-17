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
 * This class is a wrapper for {@link City}.
 * </p>
 *
 * @author Satya Kola
 * @see City
 * @generated
 */
public class CityWrapper implements City, ModelWrapper<City> {
	public CityWrapper(City city) {
		_city = city;
	}

	@Override
	public Class<?> getModelClass() {
		return City.class;
	}

	@Override
	public String getModelClassName() {
		return City.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CityId", getCityId());
		attributes.put("CityCode", getCityCode());
		attributes.put("CityName", getCityName());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("StateId", getStateId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		String CityCode = (String)attributes.get("CityCode");

		if (CityCode != null) {
			setCityCode(CityCode);
		}

		String CityName = (String)attributes.get("CityName");

		if (CityName != null) {
			setCityName(CityName);
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

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}
	}

	/**
	* Returns the primary key of this city.
	*
	* @return the primary key of this city
	*/
	@Override
	public int getPrimaryKey() {
		return _city.getPrimaryKey();
	}

	/**
	* Sets the primary key of this city.
	*
	* @param primaryKey the primary key of this city
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_city.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the city ID of this city.
	*
	* @return the city ID of this city
	*/
	@Override
	public int getCityId() {
		return _city.getCityId();
	}

	/**
	* Sets the city ID of this city.
	*
	* @param CityId the city ID of this city
	*/
	@Override
	public void setCityId(int CityId) {
		_city.setCityId(CityId);
	}

	/**
	* Returns the city code of this city.
	*
	* @return the city code of this city
	*/
	@Override
	public java.lang.String getCityCode() {
		return _city.getCityCode();
	}

	/**
	* Sets the city code of this city.
	*
	* @param CityCode the city code of this city
	*/
	@Override
	public void setCityCode(java.lang.String CityCode) {
		_city.setCityCode(CityCode);
	}

	/**
	* Returns the city name of this city.
	*
	* @return the city name of this city
	*/
	@Override
	public java.lang.String getCityName() {
		return _city.getCityName();
	}

	/**
	* Sets the city name of this city.
	*
	* @param CityName the city name of this city
	*/
	@Override
	public void setCityName(java.lang.String CityName) {
		_city.setCityName(CityName);
	}

	/**
	* Returns the is active of this city.
	*
	* @return the is active of this city
	*/
	@Override
	public int getIsActive() {
		return _city.getIsActive();
	}

	/**
	* Sets the is active of this city.
	*
	* @param IsActive the is active of this city
	*/
	@Override
	public void setIsActive(int IsActive) {
		_city.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this city.
	*
	* @return the created by of this city
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _city.getCreatedBy();
	}

	/**
	* Sets the created by of this city.
	*
	* @param CreatedBy the created by of this city
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_city.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this city.
	*
	* @return the created date of this city
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _city.getCreatedDate();
	}

	/**
	* Sets the created date of this city.
	*
	* @param CreatedDate the created date of this city
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_city.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this city.
	*
	* @return the modified date of this city
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _city.getModifiedDate();
	}

	/**
	* Sets the modified date of this city.
	*
	* @param ModifiedDate the modified date of this city
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_city.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this city.
	*
	* @return the modified by of this city
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _city.getModifiedBy();
	}

	/**
	* Sets the modified by of this city.
	*
	* @param ModifiedBy the modified by of this city
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_city.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the state ID of this city.
	*
	* @return the state ID of this city
	*/
	@Override
	public int getStateId() {
		return _city.getStateId();
	}

	/**
	* Sets the state ID of this city.
	*
	* @param StateId the state ID of this city
	*/
	@Override
	public void setStateId(int StateId) {
		_city.setStateId(StateId);
	}

	@Override
	public boolean isNew() {
		return _city.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_city.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _city.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_city.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _city.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _city.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_city.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _city.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_city.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_city.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_city.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CityWrapper((City)_city.clone());
	}

	@Override
	public int compareTo(com.ifl.rapid.customer.model.City city) {
		return _city.compareTo(city);
	}

	@Override
	public int hashCode() {
		return _city.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.City> toCacheModel() {
		return _city.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.City toEscapedModel() {
		return new CityWrapper(_city.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.City toUnescapedModel() {
		return new CityWrapper(_city.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _city.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _city.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_city.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CityWrapper)) {
			return false;
		}

		CityWrapper cityWrapper = (CityWrapper)obj;

		if (Validator.equals(_city, cityWrapper._city)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public City getWrappedCity() {
		return _city;
	}

	@Override
	public City getWrappedModel() {
		return _city;
	}

	@Override
	public void resetOriginalValues() {
		_city.resetOriginalValues();
	}

	private City _city;
}