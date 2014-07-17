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
 * This class is a wrapper for {@link LocationDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see LocationDetails
 * @generated
 */
public class LocationDetailsWrapper implements LocationDetails,
	ModelWrapper<LocationDetails> {
	public LocationDetailsWrapper(LocationDetails locationDetails) {
		_locationDetails = locationDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return LocationDetails.class;
	}

	@Override
	public String getModelClassName() {
		return LocationDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LOCATION_ID", getLOCATION_ID());
		attributes.put("LOCATION_NAME", getLOCATION_NAME());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("LATITUDE", getLATITUDE());
		attributes.put("LONGITUDE", getLONGITUDE());
		attributes.put("BRANCH_FLAG", getBRANCH_FLAG());
		attributes.put("MEDICAL_CENTER_FLAG", getMEDICAL_CENTER_FLAG());
		attributes.put("DROP_BOX_FLAG", getDROP_BOX_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer LOCATION_ID = (Integer)attributes.get("LOCATION_ID");

		if (LOCATION_ID != null) {
			setLOCATION_ID(LOCATION_ID);
		}

		String LOCATION_NAME = (String)attributes.get("LOCATION_NAME");

		if (LOCATION_NAME != null) {
			setLOCATION_NAME(LOCATION_NAME);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String LATITUDE = (String)attributes.get("LATITUDE");

		if (LATITUDE != null) {
			setLATITUDE(LATITUDE);
		}

		String LONGITUDE = (String)attributes.get("LONGITUDE");

		if (LONGITUDE != null) {
			setLONGITUDE(LONGITUDE);
		}

		String BRANCH_FLAG = (String)attributes.get("BRANCH_FLAG");

		if (BRANCH_FLAG != null) {
			setBRANCH_FLAG(BRANCH_FLAG);
		}

		String MEDICAL_CENTER_FLAG = (String)attributes.get(
				"MEDICAL_CENTER_FLAG");

		if (MEDICAL_CENTER_FLAG != null) {
			setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
		}

		String DROP_BOX_FLAG = (String)attributes.get("DROP_BOX_FLAG");

		if (DROP_BOX_FLAG != null) {
			setDROP_BOX_FLAG(DROP_BOX_FLAG);
		}
	}

	/**
	* Returns the primary key of this location details.
	*
	* @return the primary key of this location details
	*/
	@Override
	public int getPrimaryKey() {
		return _locationDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this location details.
	*
	* @param primaryKey the primary key of this location details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_locationDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the l o c a t i o n_ i d of this location details.
	*
	* @return the l o c a t i o n_ i d of this location details
	*/
	@Override
	public int getLOCATION_ID() {
		return _locationDetails.getLOCATION_ID();
	}

	/**
	* Sets the l o c a t i o n_ i d of this location details.
	*
	* @param LOCATION_ID the l o c a t i o n_ i d of this location details
	*/
	@Override
	public void setLOCATION_ID(int LOCATION_ID) {
		_locationDetails.setLOCATION_ID(LOCATION_ID);
	}

	/**
	* Returns the l o c a t i o n_ n a m e of this location details.
	*
	* @return the l o c a t i o n_ n a m e of this location details
	*/
	@Override
	public java.lang.String getLOCATION_NAME() {
		return _locationDetails.getLOCATION_NAME();
	}

	/**
	* Sets the l o c a t i o n_ n a m e of this location details.
	*
	* @param LOCATION_NAME the l o c a t i o n_ n a m e of this location details
	*/
	@Override
	public void setLOCATION_NAME(java.lang.String LOCATION_NAME) {
		_locationDetails.setLOCATION_NAME(LOCATION_NAME);
	}

	/**
	* Returns the c i t y_ i d of this location details.
	*
	* @return the c i t y_ i d of this location details
	*/
	@Override
	public int getCITY_ID() {
		return _locationDetails.getCITY_ID();
	}

	/**
	* Sets the c i t y_ i d of this location details.
	*
	* @param CITY_ID the c i t y_ i d of this location details
	*/
	@Override
	public void setCITY_ID(int CITY_ID) {
		_locationDetails.setCITY_ID(CITY_ID);
	}

	/**
	* Returns the s t a t e_ i d of this location details.
	*
	* @return the s t a t e_ i d of this location details
	*/
	@Override
	public int getSTATE_ID() {
		return _locationDetails.getSTATE_ID();
	}

	/**
	* Sets the s t a t e_ i d of this location details.
	*
	* @param STATE_ID the s t a t e_ i d of this location details
	*/
	@Override
	public void setSTATE_ID(int STATE_ID) {
		_locationDetails.setSTATE_ID(STATE_ID);
	}

	/**
	* Returns the l a t i t u d e of this location details.
	*
	* @return the l a t i t u d e of this location details
	*/
	@Override
	public java.lang.String getLATITUDE() {
		return _locationDetails.getLATITUDE();
	}

	/**
	* Sets the l a t i t u d e of this location details.
	*
	* @param LATITUDE the l a t i t u d e of this location details
	*/
	@Override
	public void setLATITUDE(java.lang.String LATITUDE) {
		_locationDetails.setLATITUDE(LATITUDE);
	}

	/**
	* Returns the l o n g i t u d e of this location details.
	*
	* @return the l o n g i t u d e of this location details
	*/
	@Override
	public java.lang.String getLONGITUDE() {
		return _locationDetails.getLONGITUDE();
	}

	/**
	* Sets the l o n g i t u d e of this location details.
	*
	* @param LONGITUDE the l o n g i t u d e of this location details
	*/
	@Override
	public void setLONGITUDE(java.lang.String LONGITUDE) {
		_locationDetails.setLONGITUDE(LONGITUDE);
	}

	/**
	* Returns the b r a n c h_ f l a g of this location details.
	*
	* @return the b r a n c h_ f l a g of this location details
	*/
	@Override
	public java.lang.String getBRANCH_FLAG() {
		return _locationDetails.getBRANCH_FLAG();
	}

	/**
	* Sets the b r a n c h_ f l a g of this location details.
	*
	* @param BRANCH_FLAG the b r a n c h_ f l a g of this location details
	*/
	@Override
	public void setBRANCH_FLAG(java.lang.String BRANCH_FLAG) {
		_locationDetails.setBRANCH_FLAG(BRANCH_FLAG);
	}

	/**
	* Returns the m e d i c a l_ c e n t e r_ f l a g of this location details.
	*
	* @return the m e d i c a l_ c e n t e r_ f l a g of this location details
	*/
	@Override
	public java.lang.String getMEDICAL_CENTER_FLAG() {
		return _locationDetails.getMEDICAL_CENTER_FLAG();
	}

	/**
	* Sets the m e d i c a l_ c e n t e r_ f l a g of this location details.
	*
	* @param MEDICAL_CENTER_FLAG the m e d i c a l_ c e n t e r_ f l a g of this location details
	*/
	@Override
	public void setMEDICAL_CENTER_FLAG(java.lang.String MEDICAL_CENTER_FLAG) {
		_locationDetails.setMEDICAL_CENTER_FLAG(MEDICAL_CENTER_FLAG);
	}

	/**
	* Returns the d r o p_ b o x_ f l a g of this location details.
	*
	* @return the d r o p_ b o x_ f l a g of this location details
	*/
	@Override
	public java.lang.String getDROP_BOX_FLAG() {
		return _locationDetails.getDROP_BOX_FLAG();
	}

	/**
	* Sets the d r o p_ b o x_ f l a g of this location details.
	*
	* @param DROP_BOX_FLAG the d r o p_ b o x_ f l a g of this location details
	*/
	@Override
	public void setDROP_BOX_FLAG(java.lang.String DROP_BOX_FLAG) {
		_locationDetails.setDROP_BOX_FLAG(DROP_BOX_FLAG);
	}

	@Override
	public boolean isNew() {
		return _locationDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_locationDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _locationDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_locationDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _locationDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _locationDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_locationDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _locationDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_locationDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_locationDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_locationDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LocationDetailsWrapper((LocationDetails)_locationDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.LocationDetails locationDetails) {
		return _locationDetails.compareTo(locationDetails);
	}

	@Override
	public int hashCode() {
		return _locationDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.LocationDetails> toCacheModel() {
		return _locationDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.LocationDetails toEscapedModel() {
		return new LocationDetailsWrapper(_locationDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.LocationDetails toUnescapedModel() {
		return new LocationDetailsWrapper(_locationDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _locationDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _locationDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_locationDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LocationDetailsWrapper)) {
			return false;
		}

		LocationDetailsWrapper locationDetailsWrapper = (LocationDetailsWrapper)obj;

		if (Validator.equals(_locationDetails,
					locationDetailsWrapper._locationDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LocationDetails getWrappedLocationDetails() {
		return _locationDetails;
	}

	@Override
	public LocationDetails getWrappedModel() {
		return _locationDetails;
	}

	@Override
	public void resetOriginalValues() {
		_locationDetails.resetOriginalValues();
	}

	private LocationDetails _locationDetails;
}