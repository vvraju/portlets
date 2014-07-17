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
public class StateDetailsSoap implements Serializable {
	public static StateDetailsSoap toSoapModel(StateDetails model) {
		StateDetailsSoap soapModel = new StateDetailsSoap();

		soapModel.setSTATE_ID(model.getSTATE_ID());
		soapModel.setSTATE_NAME(model.getSTATE_NAME());
		soapModel.setSTATE_CODE(model.getSTATE_CODE());
		soapModel.setBRANCH_FLAG(model.getBRANCH_FLAG());
		soapModel.setMEDICAL_CENTER_FLAG(model.getMEDICAL_CENTER_FLAG());
		soapModel.setDROP_BOX_FLAG(model.getDROP_BOX_FLAG());

		return soapModel;
	}

	public static StateDetailsSoap[] toSoapModels(StateDetails[] models) {
		StateDetailsSoap[] soapModels = new StateDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StateDetailsSoap[][] toSoapModels(StateDetails[][] models) {
		StateDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StateDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StateDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StateDetailsSoap[] toSoapModels(List<StateDetails> models) {
		List<StateDetailsSoap> soapModels = new ArrayList<StateDetailsSoap>(models.size());

		for (StateDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StateDetailsSoap[soapModels.size()]);
	}

	public StateDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _STATE_ID;
	}

	public void setPrimaryKey(int pk) {
		setSTATE_ID(pk);
	}

	public int getSTATE_ID() {
		return _STATE_ID;
	}

	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;
	}

	public String getSTATE_NAME() {
		return _STATE_NAME;
	}

	public void setSTATE_NAME(String STATE_NAME) {
		_STATE_NAME = STATE_NAME;
	}

	public String getSTATE_CODE() {
		return _STATE_CODE;
	}

	public void setSTATE_CODE(String STATE_CODE) {
		_STATE_CODE = STATE_CODE;
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

	private int _STATE_ID;
	private String _STATE_NAME;
	private String _STATE_CODE;
	private String _BRANCH_FLAG;
	private String _MEDICAL_CENTER_FLAG;
	private String _DROP_BOX_FLAG;
}