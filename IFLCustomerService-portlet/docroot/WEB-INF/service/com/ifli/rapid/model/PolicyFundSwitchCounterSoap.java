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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class PolicyFundSwitchCounterSoap implements Serializable {
	public static PolicyFundSwitchCounterSoap toSoapModel(
		PolicyFundSwitchCounter model) {
		PolicyFundSwitchCounterSoap soapModel = new PolicyFundSwitchCounterSoap();

		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setFUND_SWITCH_COUNTER(model.getFUND_SWITCH_COUNTER());
		soapModel.setFUND_SWITCH_YEAR(model.getFUND_SWITCH_YEAR());

		return soapModel;
	}

	public static PolicyFundSwitchCounterSoap[] toSoapModels(
		PolicyFundSwitchCounter[] models) {
		PolicyFundSwitchCounterSoap[] soapModels = new PolicyFundSwitchCounterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyFundSwitchCounterSoap[][] toSoapModels(
		PolicyFundSwitchCounter[][] models) {
		PolicyFundSwitchCounterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyFundSwitchCounterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyFundSwitchCounterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyFundSwitchCounterSoap[] toSoapModels(
		List<PolicyFundSwitchCounter> models) {
		List<PolicyFundSwitchCounterSoap> soapModels = new ArrayList<PolicyFundSwitchCounterSoap>(models.size());

		for (PolicyFundSwitchCounter model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyFundSwitchCounterSoap[soapModels.size()]);
	}

	public PolicyFundSwitchCounterSoap() {
	}

	public String getPrimaryKey() {
		return _POLICY_ID;
	}

	public void setPrimaryKey(String pk) {
		setPOLICY_ID(pk);
	}

	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public int getFUND_SWITCH_COUNTER() {
		return _FUND_SWITCH_COUNTER;
	}

	public void setFUND_SWITCH_COUNTER(int FUND_SWITCH_COUNTER) {
		_FUND_SWITCH_COUNTER = FUND_SWITCH_COUNTER;
	}

	public Date getFUND_SWITCH_YEAR() {
		return _FUND_SWITCH_YEAR;
	}

	public void setFUND_SWITCH_YEAR(Date FUND_SWITCH_YEAR) {
		_FUND_SWITCH_YEAR = FUND_SWITCH_YEAR;
	}

	private String _POLICY_ID;
	private int _FUND_SWITCH_COUNTER;
	private Date _FUND_SWITCH_YEAR;
}