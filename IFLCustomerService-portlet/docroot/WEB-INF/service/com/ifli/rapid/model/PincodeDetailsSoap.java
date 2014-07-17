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
public class PincodeDetailsSoap implements Serializable {
	public static PincodeDetailsSoap toSoapModel(PincodeDetails model) {
		PincodeDetailsSoap soapModel = new PincodeDetailsSoap();

		soapModel.setPIN_ID(model.getPIN_ID());
		soapModel.setCITY_ID(model.getCITY_ID());
		soapModel.setSTATE_ID(model.getSTATE_ID());
		soapModel.setPIN_CODE(model.getPIN_CODE());

		return soapModel;
	}

	public static PincodeDetailsSoap[] toSoapModels(PincodeDetails[] models) {
		PincodeDetailsSoap[] soapModels = new PincodeDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PincodeDetailsSoap[][] toSoapModels(PincodeDetails[][] models) {
		PincodeDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PincodeDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PincodeDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PincodeDetailsSoap[] toSoapModels(List<PincodeDetails> models) {
		List<PincodeDetailsSoap> soapModels = new ArrayList<PincodeDetailsSoap>(models.size());

		for (PincodeDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PincodeDetailsSoap[soapModels.size()]);
	}

	public PincodeDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _PIN_ID;
	}

	public void setPrimaryKey(int pk) {
		setPIN_ID(pk);
	}

	public int getPIN_ID() {
		return _PIN_ID;
	}

	public void setPIN_ID(int PIN_ID) {
		_PIN_ID = PIN_ID;
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

	public String getPIN_CODE() {
		return _PIN_CODE;
	}

	public void setPIN_CODE(String PIN_CODE) {
		_PIN_CODE = PIN_CODE;
	}

	private int _PIN_ID;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _PIN_CODE;
}