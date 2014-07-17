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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LocMstLocation service. Represents a row in the &quot;Loc_Mst_Location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifl.rapid.customer.model.impl.LocMstLocationImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see LocMstLocation
 * @see com.ifl.rapid.customer.model.impl.LocMstLocationImpl
 * @see com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl
 * @generated
 */
public interface LocMstLocationModel extends BaseModel<LocMstLocation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a loc mst location model instance should use the {@link LocMstLocation} interface instead.
	 */

	/**
	 * Returns the primary key of this loc mst location.
	 *
	 * @return the primary key of this loc mst location
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this loc mst location.
	 *
	 * @param primaryKey the primary key of this loc mst location
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the location ID of this loc mst location.
	 *
	 * @return the location ID of this loc mst location
	 */
	public int getLocationId();

	/**
	 * Sets the location ID of this loc mst location.
	 *
	 * @param LocationId the location ID of this loc mst location
	 */
	public void setLocationId(int LocationId);

	/**
	 * Returns the state ID of this loc mst location.
	 *
	 * @return the state ID of this loc mst location
	 */
	public int getStateId();

	/**
	 * Sets the state ID of this loc mst location.
	 *
	 * @param StateId the state ID of this loc mst location
	 */
	public void setStateId(int StateId);

	/**
	 * Returns the city ID of this loc mst location.
	 *
	 * @return the city ID of this loc mst location
	 */
	public int getCityId();

	/**
	 * Sets the city ID of this loc mst location.
	 *
	 * @param CityId the city ID of this loc mst location
	 */
	public void setCityId(int CityId);

	/**
	 * Returns the pin code of this loc mst location.
	 *
	 * @return the pin code of this loc mst location
	 */
	public int getPinCode();

	/**
	 * Sets the pin code of this loc mst location.
	 *
	 * @param PinCode the pin code of this loc mst location
	 */
	public void setPinCode(int PinCode);

	/**
	 * Returns the area name of this loc mst location.
	 *
	 * @return the area name of this loc mst location
	 */
	@AutoEscape
	public String getAreaName();

	/**
	 * Sets the area name of this loc mst location.
	 *
	 * @param AreaName the area name of this loc mst location
	 */
	public void setAreaName(String AreaName);

	/**
	 * Returns the latitude of this loc mst location.
	 *
	 * @return the latitude of this loc mst location
	 */
	public double getLatitude();

	/**
	 * Sets the latitude of this loc mst location.
	 *
	 * @param Latitude the latitude of this loc mst location
	 */
	public void setLatitude(double Latitude);

	/**
	 * Returns the longitude of this loc mst location.
	 *
	 * @return the longitude of this loc mst location
	 */
	public double getLongitude();

	/**
	 * Sets the longitude of this loc mst location.
	 *
	 * @param Longitude the longitude of this loc mst location
	 */
	public void setLongitude(double Longitude);

	/**
	 * Returns the created by of this loc mst location.
	 *
	 * @return the created by of this loc mst location
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this loc mst location.
	 *
	 * @param CreatedBy the created by of this loc mst location
	 */
	public void setCreatedBy(String CreatedBy);

	/**
	 * Returns the created date of this loc mst location.
	 *
	 * @return the created date of this loc mst location
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this loc mst location.
	 *
	 * @param CreatedDate the created date of this loc mst location
	 */
	public void setCreatedDate(Date CreatedDate);

	/**
	 * Returns the modified by of this loc mst location.
	 *
	 * @return the modified by of this loc mst location
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this loc mst location.
	 *
	 * @param ModifiedBy the modified by of this loc mst location
	 */
	public void setModifiedBy(String ModifiedBy);

	/**
	 * Returns the modified date of this loc mst location.
	 *
	 * @return the modified date of this loc mst location
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this loc mst location.
	 *
	 * @param ModifiedDate the modified date of this loc mst location
	 */
	public void setModifiedDate(Date ModifiedDate);

	/**
	 * Returns the is active of this loc mst location.
	 *
	 * @return the is active of this loc mst location
	 */
	@AutoEscape
	public String getIsActive();

	/**
	 * Sets the is active of this loc mst location.
	 *
	 * @param IsActive the is active of this loc mst location
	 */
	public void setIsActive(String IsActive);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LocMstLocation locMstLocation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LocMstLocation> toCacheModel();

	@Override
	public LocMstLocation toEscapedModel();

	@Override
	public LocMstLocation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}