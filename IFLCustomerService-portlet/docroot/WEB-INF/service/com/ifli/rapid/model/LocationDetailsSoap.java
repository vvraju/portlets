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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class LocationDetailsSoap implements Serializable {
	public static LocationDetailsSoap toSoapModel(LocationDetails model) {
		LocationDetailsSoap soapModel = new LocationDetailsSoap();

		soapModel.setLOCATION_ID(model.getLOCATION_ID());
		soapModel.setLOCATION_NAME(model.getLOCATION_NAME());
		soapModel.setCITY_ID(model.getCITY_ID());
		soapModel.setSTATE_ID(model.getSTATE_ID());
		soapModel.setLATITUDE(model.getLATITUDE());
		soapModel.setLONGITUDE(model.getLONGITUDE());
		soapModel.setBRANCH_FLAG(model.getBRANCH_FLAG());
		soapModel.setMEDICAL_CENTER_FLAG(model.getMEDICAL_CENTER_FLAG());
		soapModel.setDROP_BOX_FLAG(model.getDROP_BOX_FLAG());

		return soapModel;
	}

	public static LocationDetailsSoap[] toSoapModels(LocationDetails[] models) {
		LocationDetailsSoap[] soapModels = new LocationDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LocationDetailsSoap[][] toSoapModels(
		LocationDetails[][] models) {
		LocationDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LocationDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LocationDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LocationDetailsSoap[] toSoapModels(
		List<LocationDetails> models) {
		List<LocationDetailsSoap> soapModels = new ArrayList<LocationDetailsSoap>(models.size());

		for (LocationDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LocationDetailsSoap[soapModels.size()]);
	}

	public LocationDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _LOCATION_ID;
	}

	public void setPrimaryKey(int pk) {
		setLOCATION_ID(pk);
	}

	public int getLOCATION_ID() {
		return _LOCATION_ID;
	}

	public void setLOCATION_ID(int LOCATION_ID) {
		_LOCATION_ID = LOCATION_ID;
	}

	public String getLOCATION_NAME() {
		return _LOCATION_NAME;
	}

	public void setLOCATION_NAME(String LOCATION_NAME) {
		_LOCATION_NAME = LOCATION_NAME;
	}

	public int getCITY_ID() {
		return _CITY_ID;
	}

	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;
	}

	public int getSTATE_ID() {
		return _STATE_ID;
	}

	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;
	}

	public String getLATITUDE() {
		return _LATITUDE;
	}

	public void setLATITUDE(String LATITUDE) {
		_LATITUDE = LATITUDE;
	}

	public String getLONGITUDE() {
		return _LONGITUDE;
	}

	public void setLONGITUDE(String LONGITUDE) {
		_LONGITUDE = LONGITUDE;
	}

	public String getBRANCH_FLAG() {
		return _BRANCH_FLAG;
	}

	public void setBRANCH_FLAG(String BRANCH_FLAG) {
		_BRANCH_FLAG = BRANCH_FLAG;
	}

	public String getMEDICAL_CENTER_FLAG() {
		return _MEDICAL_CENTER_FLAG;
	}

	public void setMEDICAL_CENTER_FLAG(String MEDICAL_CENTER_FLAG) {
		_MEDICAL_CENTER_FLAG = MEDICAL_CENTER_FLAG;
	}

	public String getDROP_BOX_FLAG() {
		return _DROP_BOX_FLAG;
	}

	public void setDROP_BOX_FLAG(String DROP_BOX_FLAG) {
		_DROP_BOX_FLAG = DROP_BOX_FLAG;
	}

	private int _LOCATION_ID;
	private String _LOCATION_NAME;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _LATITUDE;
	private String _LONGITUDE;
	private String _BRANCH_FLAG;
	private String _MEDICAL_CENTER_FLAG;
	private String _DROP_BOX_FLAG;
}