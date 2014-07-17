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
 * This class is a wrapper for {@link LocMstLocation}.
 * </p>
 *
 * @author Satya Kola
 * @see LocMstLocation
 * @generated
 */
public class LocMstLocationWrapper implements LocMstLocation,
	ModelWrapper<LocMstLocation> {
	public LocMstLocationWrapper(LocMstLocation locMstLocation) {
		_locMstLocation = locMstLocation;
	}

	@Override
	public Class<?> getModelClass() {
		return LocMstLocation.class;
	}

	@Override
	public String getModelClassName() {
		return LocMstLocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LocationId", getLocationId());
		attributes.put("StateId", getStateId());
		attributes.put("CityId", getCityId());
		attributes.put("PinCode", getPinCode());
		attributes.put("AreaName", getAreaName());
		attributes.put("Latitude", getLatitude());
		attributes.put("Longitude", getLongitude());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer LocationId = (Integer)attributes.get("LocationId");

		if (LocationId != null) {
			setLocationId(LocationId);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}

		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		Integer PinCode = (Integer)attributes.get("PinCode");

		if (PinCode != null) {
			setPinCode(PinCode);
		}

		String AreaName = (String)attributes.get("AreaName");

		if (AreaName != null) {
			setAreaName(AreaName);
		}

		Double Latitude = (Double)attributes.get("Latitude");

		if (Latitude != null) {
			setLatitude(Latitude);
		}

		Double Longitude = (Double)attributes.get("Longitude");

		if (Longitude != null) {
			setLongitude(Longitude);
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
	* Returns the primary key of this loc mst location.
	*
	* @return the primary key of this loc mst location
	*/
	@Override
	public int getPrimaryKey() {
		return _locMstLocation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loc mst location.
	*
	* @param primaryKey the primary key of this loc mst location
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_locMstLocation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the location ID of this loc mst location.
	*
	* @return the location ID of this loc mst location
	*/
	@Override
	public int getLocationId() {
		return _locMstLocation.getLocationId();
	}

	/**
	* Sets the location ID of this loc mst location.
	*
	* @param LocationId the location ID of this loc mst location
	*/
	@Override
	public void setLocationId(int LocationId) {
		_locMstLocation.setLocationId(LocationId);
	}

	/**
	* Returns the state ID of this loc mst location.
	*
	* @return the state ID of this loc mst location
	*/
	@Override
	public int getStateId() {
		return _locMstLocation.getStateId();
	}

	/**
	* Sets the state ID of this loc mst location.
	*
	* @param StateId the state ID of this loc mst location
	*/
	@Override
	public void setStateId(int StateId) {
		_locMstLocation.setStateId(StateId);
	}

	/**
	* Returns the city ID of this loc mst location.
	*
	* @return the city ID of this loc mst location
	*/
	@Override
	public int getCityId() {
		return _locMstLocation.getCityId();
	}

	/**
	* Sets the city ID of this loc mst location.
	*
	* @param CityId the city ID of this loc mst location
	*/
	@Override
	public void setCityId(int CityId) {
		_locMstLocation.setCityId(CityId);
	}

	/**
	* Returns the pin code of this loc mst location.
	*
	* @return the pin code of this loc mst location
	*/
	@Override
	public int getPinCode() {
		return _locMstLocation.getPinCode();
	}

	/**
	* Sets the pin code of this loc mst location.
	*
	* @param PinCode the pin code of this loc mst location
	*/
	@Override
	public void setPinCode(int PinCode) {
		_locMstLocation.setPinCode(PinCode);
	}

	/**
	* Returns the area name of this loc mst location.
	*
	* @return the area name of this loc mst location
	*/
	@Override
	public java.lang.String getAreaName() {
		return _locMstLocation.getAreaName();
	}

	/**
	* Sets the area name of this loc mst location.
	*
	* @param AreaName the area name of this loc mst location
	*/
	@Override
	public void setAreaName(java.lang.String AreaName) {
		_locMstLocation.setAreaName(AreaName);
	}

	/**
	* Returns the latitude of this loc mst location.
	*
	* @return the latitude of this loc mst location
	*/
	@Override
	public double getLatitude() {
		return _locMstLocation.getLatitude();
	}

	/**
	* Sets the latitude of this loc mst location.
	*
	* @param Latitude the latitude of this loc mst location
	*/
	@Override
	public void setLatitude(double Latitude) {
		_locMstLocation.setLatitude(Latitude);
	}

	/**
	* Returns the longitude of this loc mst location.
	*
	* @return the longitude of this loc mst location
	*/
	@Override
	public double getLongitude() {
		return _locMstLocation.getLongitude();
	}

	/**
	* Sets the longitude of this loc mst location.
	*
	* @param Longitude the longitude of this loc mst location
	*/
	@Override
	public void setLongitude(double Longitude) {
		_locMstLocation.setLongitude(Longitude);
	}

	/**
	* Returns the created by of this loc mst location.
	*
	* @return the created by of this loc mst location
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _locMstLocation.getCreatedBy();
	}

	/**
	* Sets the created by of this loc mst location.
	*
	* @param CreatedBy the created by of this loc mst location
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_locMstLocation.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this loc mst location.
	*
	* @return the created date of this loc mst location
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _locMstLocation.getCreatedDate();
	}

	/**
	* Sets the created date of this loc mst location.
	*
	* @param CreatedDate the created date of this loc mst location
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_locMstLocation.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this loc mst location.
	*
	* @return the modified by of this loc mst location
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _locMstLocation.getModifiedBy();
	}

	/**
	* Sets the modified by of this loc mst location.
	*
	* @param ModifiedBy the modified by of this loc mst location
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_locMstLocation.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this loc mst location.
	*
	* @return the modified date of this loc mst location
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _locMstLocation.getModifiedDate();
	}

	/**
	* Sets the modified date of this loc mst location.
	*
	* @param ModifiedDate the modified date of this loc mst location
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_locMstLocation.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this loc mst location.
	*
	* @return the is active of this loc mst location
	*/
	@Override
	public java.lang.String getIsActive() {
		return _locMstLocation.getIsActive();
	}

	/**
	* Sets the is active of this loc mst location.
	*
	* @param IsActive the is active of this loc mst location
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_locMstLocation.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _locMstLocation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_locMstLocation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _locMstLocation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_locMstLocation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _locMstLocation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _locMstLocation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_locMstLocation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _locMstLocation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_locMstLocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_locMstLocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_locMstLocation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LocMstLocationWrapper((LocMstLocation)_locMstLocation.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.LocMstLocation locMstLocation) {
		return _locMstLocation.compareTo(locMstLocation);
	}

	@Override
	public int hashCode() {
		return _locMstLocation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.LocMstLocation> toCacheModel() {
		return _locMstLocation.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.LocMstLocation toEscapedModel() {
		return new LocMstLocationWrapper(_locMstLocation.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.LocMstLocation toUnescapedModel() {
		return new LocMstLocationWrapper(_locMstLocation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _locMstLocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _locMstLocation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_locMstLocation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LocMstLocationWrapper)) {
			return false;
		}

		LocMstLocationWrapper locMstLocationWrapper = (LocMstLocationWrapper)obj;

		if (Validator.equals(_locMstLocation,
					locMstLocationWrapper._locMstLocation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LocMstLocation getWrappedLocMstLocation() {
		return _locMstLocation;
	}

	@Override
	public LocMstLocation getWrappedModel() {
		return _locMstLocation;
	}

	@Override
	public void resetOriginalValues() {
		_locMstLocation.resetOriginalValues();
	}

	private LocMstLocation _locMstLocation;
}