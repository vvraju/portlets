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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class LocMstLocationSoap implements Serializable {
	public static LocMstLocationSoap toSoapModel(LocMstLocation model) {
		LocMstLocationSoap soapModel = new LocMstLocationSoap();

		soapModel.setLocationId(model.getLocationId());
		soapModel.setStateId(model.getStateId());
		soapModel.setCityId(model.getCityId());
		soapModel.setPinCode(model.getPinCode());
		soapModel.setAreaName(model.getAreaName());
		soapModel.setLatitude(model.getLatitude());
		soapModel.setLongitude(model.getLongitude());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static LocMstLocationSoap[] toSoapModels(LocMstLocation[] models) {
		LocMstLocationSoap[] soapModels = new LocMstLocationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LocMstLocationSoap[][] toSoapModels(LocMstLocation[][] models) {
		LocMstLocationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LocMstLocationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LocMstLocationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LocMstLocationSoap[] toSoapModels(List<LocMstLocation> models) {
		List<LocMstLocationSoap> soapModels = new ArrayList<LocMstLocationSoap>(models.size());

		for (LocMstLocation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LocMstLocationSoap[soapModels.size()]);
	}

	public LocMstLocationSoap() {
	}

	public int getPrimaryKey() {
		return _LocationId;
	}

	public void setPrimaryKey(int pk) {
		setLocationId(pk);
	}

	public int getLocationId() {
		return _LocationId;
	}

	public void setLocationId(int LocationId) {
		_LocationId = LocationId;
	}

	public int getStateId() {
		return _StateId;
	}

	public void setStateId(int StateId) {
		_StateId = StateId;
	}

	public int getCityId() {
		return _CityId;
	}

	public void setCityId(int CityId) {
		_CityId = CityId;
	}

	public int getPinCode() {
		return _PinCode;
	}

	public void setPinCode(int PinCode) {
		_PinCode = PinCode;
	}

	public String getAreaName() {
		return _AreaName;
	}

	public void setAreaName(String AreaName) {
		_AreaName = AreaName;
	}

	public double getLatitude() {
		return _Latitude;
	}

	public void setLatitude(double Latitude) {
		_Latitude = Latitude;
	}

	public double getLongitude() {
		return _Longitude;
	}

	public void setLongitude(double Longitude) {
		_Longitude = Longitude;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public Date getCreatedDate() {
		return _CreatedDate;
	}

	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getIsActive() {
		return _IsActive;
	}

	public void setIsActive(String IsActive) {
		_IsActive = IsActive;
	}

	private int _LocationId;
	private int _StateId;
	private int _CityId;
	private int _PinCode;
	private String _AreaName;
	private double _Latitude;
	private double _Longitude;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}