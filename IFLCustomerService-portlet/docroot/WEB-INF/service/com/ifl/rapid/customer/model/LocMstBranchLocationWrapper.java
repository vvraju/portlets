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
 * This class is a wrapper for {@link LocMstBranchLocation}.
 * </p>
 *
 * @author Satya Kola
 * @see LocMstBranchLocation
 * @generated
 */
public class LocMstBranchLocationWrapper implements LocMstBranchLocation,
	ModelWrapper<LocMstBranchLocation> {
	public LocMstBranchLocationWrapper(
		LocMstBranchLocation locMstBranchLocation) {
		_locMstBranchLocation = locMstBranchLocation;
	}

	@Override
	public Class<?> getModelClass() {
		return LocMstBranchLocation.class;
	}

	@Override
	public String getModelClassName() {
		return LocMstBranchLocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("BranchId", getBranchId());
		attributes.put("BranchName", getBranchName());
		attributes.put("BranchOpeningTime", getBranchOpeningTime());
		attributes.put("BranchClosingTime", getBranchClosingTime());
		attributes.put("AddressFirstLine", getAddressFirstLine());
		attributes.put("AddressSecondLine", getAddressSecondLine());
		attributes.put("PrimaryContactNo", getPrimaryContactNo());
		attributes.put("OtherContactNo", getOtherContactNo());
		attributes.put("FaxNumber", getFaxNumber());
		attributes.put("LocationId", getLocationId());
		attributes.put("LocationId_old", getLocationId_old());
		attributes.put("Longitude", getLongitude());
		attributes.put("Latitude", getLatitude());
		attributes.put("BranchCode", getBranchCode());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer BranchId = (Integer)attributes.get("BranchId");

		if (BranchId != null) {
			setBranchId(BranchId);
		}

		String BranchName = (String)attributes.get("BranchName");

		if (BranchName != null) {
			setBranchName(BranchName);
		}

		String BranchOpeningTime = (String)attributes.get("BranchOpeningTime");

		if (BranchOpeningTime != null) {
			setBranchOpeningTime(BranchOpeningTime);
		}

		String BranchClosingTime = (String)attributes.get("BranchClosingTime");

		if (BranchClosingTime != null) {
			setBranchClosingTime(BranchClosingTime);
		}

		String AddressFirstLine = (String)attributes.get("AddressFirstLine");

		if (AddressFirstLine != null) {
			setAddressFirstLine(AddressFirstLine);
		}

		String AddressSecondLine = (String)attributes.get("AddressSecondLine");

		if (AddressSecondLine != null) {
			setAddressSecondLine(AddressSecondLine);
		}

		String PrimaryContactNo = (String)attributes.get("PrimaryContactNo");

		if (PrimaryContactNo != null) {
			setPrimaryContactNo(PrimaryContactNo);
		}

		String OtherContactNo = (String)attributes.get("OtherContactNo");

		if (OtherContactNo != null) {
			setOtherContactNo(OtherContactNo);
		}

		String FaxNumber = (String)attributes.get("FaxNumber");

		if (FaxNumber != null) {
			setFaxNumber(FaxNumber);
		}

		Integer LocationId = (Integer)attributes.get("LocationId");

		if (LocationId != null) {
			setLocationId(LocationId);
		}

		String LocationId_old = (String)attributes.get("LocationId_old");

		if (LocationId_old != null) {
			setLocationId_old(LocationId_old);
		}

		Double Longitude = (Double)attributes.get("Longitude");

		if (Longitude != null) {
			setLongitude(Longitude);
		}

		Double Latitude = (Double)attributes.get("Latitude");

		if (Latitude != null) {
			setLatitude(Latitude);
		}

		String BranchCode = (String)attributes.get("BranchCode");

		if (BranchCode != null) {
			setBranchCode(BranchCode);
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
	* Returns the primary key of this loc mst branch location.
	*
	* @return the primary key of this loc mst branch location
	*/
	@Override
	public int getPrimaryKey() {
		return _locMstBranchLocation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loc mst branch location.
	*
	* @param primaryKey the primary key of this loc mst branch location
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_locMstBranchLocation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the branch ID of this loc mst branch location.
	*
	* @return the branch ID of this loc mst branch location
	*/
	@Override
	public int getBranchId() {
		return _locMstBranchLocation.getBranchId();
	}

	/**
	* Sets the branch ID of this loc mst branch location.
	*
	* @param BranchId the branch ID of this loc mst branch location
	*/
	@Override
	public void setBranchId(int BranchId) {
		_locMstBranchLocation.setBranchId(BranchId);
	}

	/**
	* Returns the branch name of this loc mst branch location.
	*
	* @return the branch name of this loc mst branch location
	*/
	@Override
	public java.lang.String getBranchName() {
		return _locMstBranchLocation.getBranchName();
	}

	/**
	* Sets the branch name of this loc mst branch location.
	*
	* @param BranchName the branch name of this loc mst branch location
	*/
	@Override
	public void setBranchName(java.lang.String BranchName) {
		_locMstBranchLocation.setBranchName(BranchName);
	}

	/**
	* Returns the branch opening time of this loc mst branch location.
	*
	* @return the branch opening time of this loc mst branch location
	*/
	@Override
	public java.lang.String getBranchOpeningTime() {
		return _locMstBranchLocation.getBranchOpeningTime();
	}

	/**
	* Sets the branch opening time of this loc mst branch location.
	*
	* @param BranchOpeningTime the branch opening time of this loc mst branch location
	*/
	@Override
	public void setBranchOpeningTime(java.lang.String BranchOpeningTime) {
		_locMstBranchLocation.setBranchOpeningTime(BranchOpeningTime);
	}

	/**
	* Returns the branch closing time of this loc mst branch location.
	*
	* @return the branch closing time of this loc mst branch location
	*/
	@Override
	public java.lang.String getBranchClosingTime() {
		return _locMstBranchLocation.getBranchClosingTime();
	}

	/**
	* Sets the branch closing time of this loc mst branch location.
	*
	* @param BranchClosingTime the branch closing time of this loc mst branch location
	*/
	@Override
	public void setBranchClosingTime(java.lang.String BranchClosingTime) {
		_locMstBranchLocation.setBranchClosingTime(BranchClosingTime);
	}

	/**
	* Returns the address first line of this loc mst branch location.
	*
	* @return the address first line of this loc mst branch location
	*/
	@Override
	public java.lang.String getAddressFirstLine() {
		return _locMstBranchLocation.getAddressFirstLine();
	}

	/**
	* Sets the address first line of this loc mst branch location.
	*
	* @param AddressFirstLine the address first line of this loc mst branch location
	*/
	@Override
	public void setAddressFirstLine(java.lang.String AddressFirstLine) {
		_locMstBranchLocation.setAddressFirstLine(AddressFirstLine);
	}

	/**
	* Returns the address second line of this loc mst branch location.
	*
	* @return the address second line of this loc mst branch location
	*/
	@Override
	public java.lang.String getAddressSecondLine() {
		return _locMstBranchLocation.getAddressSecondLine();
	}

	/**
	* Sets the address second line of this loc mst branch location.
	*
	* @param AddressSecondLine the address second line of this loc mst branch location
	*/
	@Override
	public void setAddressSecondLine(java.lang.String AddressSecondLine) {
		_locMstBranchLocation.setAddressSecondLine(AddressSecondLine);
	}

	/**
	* Returns the primary contact no of this loc mst branch location.
	*
	* @return the primary contact no of this loc mst branch location
	*/
	@Override
	public java.lang.String getPrimaryContactNo() {
		return _locMstBranchLocation.getPrimaryContactNo();
	}

	/**
	* Sets the primary contact no of this loc mst branch location.
	*
	* @param PrimaryContactNo the primary contact no of this loc mst branch location
	*/
	@Override
	public void setPrimaryContactNo(java.lang.String PrimaryContactNo) {
		_locMstBranchLocation.setPrimaryContactNo(PrimaryContactNo);
	}

	/**
	* Returns the other contact no of this loc mst branch location.
	*
	* @return the other contact no of this loc mst branch location
	*/
	@Override
	public java.lang.String getOtherContactNo() {
		return _locMstBranchLocation.getOtherContactNo();
	}

	/**
	* Sets the other contact no of this loc mst branch location.
	*
	* @param OtherContactNo the other contact no of this loc mst branch location
	*/
	@Override
	public void setOtherContactNo(java.lang.String OtherContactNo) {
		_locMstBranchLocation.setOtherContactNo(OtherContactNo);
	}

	/**
	* Returns the fax number of this loc mst branch location.
	*
	* @return the fax number of this loc mst branch location
	*/
	@Override
	public java.lang.String getFaxNumber() {
		return _locMstBranchLocation.getFaxNumber();
	}

	/**
	* Sets the fax number of this loc mst branch location.
	*
	* @param FaxNumber the fax number of this loc mst branch location
	*/
	@Override
	public void setFaxNumber(java.lang.String FaxNumber) {
		_locMstBranchLocation.setFaxNumber(FaxNumber);
	}

	/**
	* Returns the location ID of this loc mst branch location.
	*
	* @return the location ID of this loc mst branch location
	*/
	@Override
	public int getLocationId() {
		return _locMstBranchLocation.getLocationId();
	}

	/**
	* Sets the location ID of this loc mst branch location.
	*
	* @param LocationId the location ID of this loc mst branch location
	*/
	@Override
	public void setLocationId(int LocationId) {
		_locMstBranchLocation.setLocationId(LocationId);
	}

	/**
	* Returns the location id_old of this loc mst branch location.
	*
	* @return the location id_old of this loc mst branch location
	*/
	@Override
	public java.lang.String getLocationId_old() {
		return _locMstBranchLocation.getLocationId_old();
	}

	/**
	* Sets the location id_old of this loc mst branch location.
	*
	* @param LocationId_old the location id_old of this loc mst branch location
	*/
	@Override
	public void setLocationId_old(java.lang.String LocationId_old) {
		_locMstBranchLocation.setLocationId_old(LocationId_old);
	}

	/**
	* Returns the longitude of this loc mst branch location.
	*
	* @return the longitude of this loc mst branch location
	*/
	@Override
	public double getLongitude() {
		return _locMstBranchLocation.getLongitude();
	}

	/**
	* Sets the longitude of this loc mst branch location.
	*
	* @param Longitude the longitude of this loc mst branch location
	*/
	@Override
	public void setLongitude(double Longitude) {
		_locMstBranchLocation.setLongitude(Longitude);
	}

	/**
	* Returns the latitude of this loc mst branch location.
	*
	* @return the latitude of this loc mst branch location
	*/
	@Override
	public double getLatitude() {
		return _locMstBranchLocation.getLatitude();
	}

	/**
	* Sets the latitude of this loc mst branch location.
	*
	* @param Latitude the latitude of this loc mst branch location
	*/
	@Override
	public void setLatitude(double Latitude) {
		_locMstBranchLocation.setLatitude(Latitude);
	}

	/**
	* Returns the branch code of this loc mst branch location.
	*
	* @return the branch code of this loc mst branch location
	*/
	@Override
	public java.lang.String getBranchCode() {
		return _locMstBranchLocation.getBranchCode();
	}

	/**
	* Sets the branch code of this loc mst branch location.
	*
	* @param BranchCode the branch code of this loc mst branch location
	*/
	@Override
	public void setBranchCode(java.lang.String BranchCode) {
		_locMstBranchLocation.setBranchCode(BranchCode);
	}

	/**
	* Returns the created by of this loc mst branch location.
	*
	* @return the created by of this loc mst branch location
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _locMstBranchLocation.getCreatedBy();
	}

	/**
	* Sets the created by of this loc mst branch location.
	*
	* @param CreatedBy the created by of this loc mst branch location
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_locMstBranchLocation.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this loc mst branch location.
	*
	* @return the created date of this loc mst branch location
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _locMstBranchLocation.getCreatedDate();
	}

	/**
	* Sets the created date of this loc mst branch location.
	*
	* @param CreatedDate the created date of this loc mst branch location
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_locMstBranchLocation.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this loc mst branch location.
	*
	* @return the modified by of this loc mst branch location
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _locMstBranchLocation.getModifiedBy();
	}

	/**
	* Sets the modified by of this loc mst branch location.
	*
	* @param ModifiedBy the modified by of this loc mst branch location
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_locMstBranchLocation.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this loc mst branch location.
	*
	* @return the modified date of this loc mst branch location
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _locMstBranchLocation.getModifiedDate();
	}

	/**
	* Sets the modified date of this loc mst branch location.
	*
	* @param ModifiedDate the modified date of this loc mst branch location
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_locMstBranchLocation.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this loc mst branch location.
	*
	* @return the is active of this loc mst branch location
	*/
	@Override
	public java.lang.String getIsActive() {
		return _locMstBranchLocation.getIsActive();
	}

	/**
	* Sets the is active of this loc mst branch location.
	*
	* @param IsActive the is active of this loc mst branch location
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_locMstBranchLocation.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _locMstBranchLocation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_locMstBranchLocation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _locMstBranchLocation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_locMstBranchLocation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _locMstBranchLocation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _locMstBranchLocation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_locMstBranchLocation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _locMstBranchLocation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_locMstBranchLocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_locMstBranchLocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_locMstBranchLocation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LocMstBranchLocationWrapper((LocMstBranchLocation)_locMstBranchLocation.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.LocMstBranchLocation locMstBranchLocation) {
		return _locMstBranchLocation.compareTo(locMstBranchLocation);
	}

	@Override
	public int hashCode() {
		return _locMstBranchLocation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.LocMstBranchLocation> toCacheModel() {
		return _locMstBranchLocation.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.LocMstBranchLocation toEscapedModel() {
		return new LocMstBranchLocationWrapper(_locMstBranchLocation.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.LocMstBranchLocation toUnescapedModel() {
		return new LocMstBranchLocationWrapper(_locMstBranchLocation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _locMstBranchLocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _locMstBranchLocation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_locMstBranchLocation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LocMstBranchLocationWrapper)) {
			return false;
		}

		LocMstBranchLocationWrapper locMstBranchLocationWrapper = (LocMstBranchLocationWrapper)obj;

		if (Validator.equals(_locMstBranchLocation,
					locMstBranchLocationWrapper._locMstBranchLocation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LocMstBranchLocation getWrappedLocMstBranchLocation() {
		return _locMstBranchLocation;
	}

	@Override
	public LocMstBranchLocation getWrappedModel() {
		return _locMstBranchLocation;
	}

	@Override
	public void resetOriginalValues() {
		_locMstBranchLocation.resetOriginalValues();
	}

	private LocMstBranchLocation _locMstBranchLocation;
}