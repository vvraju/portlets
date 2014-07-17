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
public class CitySoap implements Serializable {
	public static CitySoap toSoapModel(City model) {
		CitySoap soapModel = new CitySoap();

		soapModel.setCityId(model.getCityId());
		soapModel.setCityCode(model.getCityCode());
		soapModel.setCityName(model.getCityName());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setStateId(model.getStateId());

		return soapModel;
	}

	public static CitySoap[] toSoapModels(City[] models) {
		CitySoap[] soapModels = new CitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CitySoap[][] toSoapModels(City[][] models) {
		CitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CitySoap[] toSoapModels(List<City> models) {
		List<CitySoap> soapModels = new ArrayList<CitySoap>(models.size());

		for (City model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CitySoap[soapModels.size()]);
	}

	public CitySoap() {
	}

	public int getPrimaryKey() {
		return _CityId;
	}

	public void setPrimaryKey(int pk) {
		setCityId(pk);
	}

	public int getCityId() {
		return _CityId;
	}

	public void setCityId(int CityId) {
		_CityId = CityId;
	}

	public String getCityCode() {
		return _CityCode;
	}

	public void setCityCode(String CityCode) {
		_CityCode = CityCode;
	}

	public String getCityName() {
		return _CityName;
	}

	public void setCityName(String CityName) {
		_CityName = CityName;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
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

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public int getStateId() {
		return _StateId;
	}

	public void setStateId(int StateId) {
		_StateId = StateId;
	}

	private int _CityId;
	private String _CityCode;
	private String _CityName;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private int _StateId;
}