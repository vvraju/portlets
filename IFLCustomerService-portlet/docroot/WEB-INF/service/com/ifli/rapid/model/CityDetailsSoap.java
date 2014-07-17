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
public class CityDetailsSoap implements Serializable {
	public static CityDetailsSoap toSoapModel(CityDetails model) {
		CityDetailsSoap soapModel = new CityDetailsSoap();

		soapModel.setCITY_ID(model.getCITY_ID());
		soapModel.setCITY_CODE(model.getCITY_CODE());
		soapModel.setCITY_NAME(model.getCITY_NAME());
		soapModel.setSTATE_ID(model.getSTATE_ID());
		soapModel.setIS_ACTIVE(model.getIS_ACTIVE());

		return soapModel;
	}

	public static CityDetailsSoap[] toSoapModels(CityDetails[] models) {
		CityDetailsSoap[] soapModels = new CityDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CityDetailsSoap[][] toSoapModels(CityDetails[][] models) {
		CityDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CityDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CityDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CityDetailsSoap[] toSoapModels(List<CityDetails> models) {
		List<CityDetailsSoap> soapModels = new ArrayList<CityDetailsSoap>(models.size());

		for (CityDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CityDetailsSoap[soapModels.size()]);
	}

	public CityDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _CITY_ID;
	}

	public void setPrimaryKey(int pk) {
		setCITY_ID(pk);
	}

	public int getCITY_ID() {
		return _CITY_ID;
	}

	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;
	}

	public String getCITY_CODE() {
		return _CITY_CODE;
	}

	public void setCITY_CODE(String CITY_CODE) {
		_CITY_CODE = CITY_CODE;
	}

	public String getCITY_NAME() {
		return _CITY_NAME;
	}

	public void setCITY_NAME(String CITY_NAME) {
		_CITY_NAME = CITY_NAME;
	}

	public int getSTATE_ID() {
		return _STATE_ID;
	}

	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;
	}

	public String getIS_ACTIVE() {
		return _IS_ACTIVE;
	}

	public void setIS_ACTIVE(String IS_ACTIVE) {
		_IS_ACTIVE = IS_ACTIVE;
	}

	private int _CITY_ID;
	private String _CITY_CODE;
	private String _CITY_NAME;
	private int _STATE_ID;
	private String _IS_ACTIVE;
}