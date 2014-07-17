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
public class StateSoap implements Serializable {
	public static StateSoap toSoapModel(State model) {
		StateSoap soapModel = new StateSoap();

		soapModel.setStateId(model.getStateId());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setStateName(model.getStateName());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static StateSoap[] toSoapModels(State[] models) {
		StateSoap[] soapModels = new StateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StateSoap[][] toSoapModels(State[][] models) {
		StateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StateSoap[] toSoapModels(List<State> models) {
		List<StateSoap> soapModels = new ArrayList<StateSoap>(models.size());

		for (State model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StateSoap[soapModels.size()]);
	}

	public StateSoap() {
	}

	public int getPrimaryKey() {
		return _StateId;
	}

	public void setPrimaryKey(int pk) {
		setStateId(pk);
	}

	public int getStateId() {
		return _StateId;
	}

	public void setStateId(int StateId) {
		_StateId = StateId;
	}

	public String getStateCode() {
		return _StateCode;
	}

	public void setStateCode(String StateCode) {
		_StateCode = StateCode;
	}

	public String getStateName() {
		return _StateName;
	}

	public void setStateName(String StateName) {
		_StateName = StateName;
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

	private int _StateId;
	private String _StateCode;
	private String _StateName;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}