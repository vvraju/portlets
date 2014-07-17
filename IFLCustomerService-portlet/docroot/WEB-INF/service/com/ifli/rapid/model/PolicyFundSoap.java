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
public class PolicyFundSoap implements Serializable {
	public static PolicyFundSoap toSoapModel(PolicyFund model) {
		PolicyFundSoap soapModel = new PolicyFundSoap();

		soapModel.setPOLICY_FUND_ID(model.getPOLICY_FUND_ID());
		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setFUND_ID(model.getFUND_ID());
		soapModel.setFUND_UNITS(model.getFUND_UNITS());
		soapModel.setNAV(model.getNAV());
		soapModel.setTOTAL_FUND(model.getTOTAL_FUND());

		return soapModel;
	}

	public static PolicyFundSoap[] toSoapModels(PolicyFund[] models) {
		PolicyFundSoap[] soapModels = new PolicyFundSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyFundSoap[][] toSoapModels(PolicyFund[][] models) {
		PolicyFundSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyFundSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyFundSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyFundSoap[] toSoapModels(List<PolicyFund> models) {
		List<PolicyFundSoap> soapModels = new ArrayList<PolicyFundSoap>(models.size());

		for (PolicyFund model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyFundSoap[soapModels.size()]);
	}

	public PolicyFundSoap() {
	}

	public int getPrimaryKey() {
		return _POLICY_FUND_ID;
	}

	public void setPrimaryKey(int pk) {
		setPOLICY_FUND_ID(pk);
	}

	public int getPOLICY_FUND_ID() {
		return _POLICY_FUND_ID;
	}

	public void setPOLICY_FUND_ID(int POLICY_FUND_ID) {
		_POLICY_FUND_ID = POLICY_FUND_ID;
	}

	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public int getFUND_ID() {
		return _FUND_ID;
	}

	public void setFUND_ID(int FUND_ID) {
		_FUND_ID = FUND_ID;
	}

	public double getFUND_UNITS() {
		return _FUND_UNITS;
	}

	public void setFUND_UNITS(double FUND_UNITS) {
		_FUND_UNITS = FUND_UNITS;
	}

	public double getNAV() {
		return _NAV;
	}

	public void setNAV(double NAV) {
		_NAV = NAV;
	}

	public double getTOTAL_FUND() {
		return _TOTAL_FUND;
	}

	public void setTOTAL_FUND(double TOTAL_FUND) {
		_TOTAL_FUND = TOTAL_FUND;
	}

	private int _POLICY_FUND_ID;
	private String _POLICY_ID;
	private int _FUND_ID;
	private double _FUND_UNITS;
	private double _NAV;
	private double _TOTAL_FUND;
}