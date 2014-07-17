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
public class PolicyPremPercentageSoap implements Serializable {
	public static PolicyPremPercentageSoap toSoapModel(
		PolicyPremPercentage model) {
		PolicyPremPercentageSoap soapModel = new PolicyPremPercentageSoap();

		soapModel.setPREM_PERCENTAGE_ID(model.getPREM_PERCENTAGE_ID());
		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setFUND_ID(model.getFUND_ID());
		soapModel.setFUND_PERCENTAGE(model.getFUND_PERCENTAGE());

		return soapModel;
	}

	public static PolicyPremPercentageSoap[] toSoapModels(
		PolicyPremPercentage[] models) {
		PolicyPremPercentageSoap[] soapModels = new PolicyPremPercentageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyPremPercentageSoap[][] toSoapModels(
		PolicyPremPercentage[][] models) {
		PolicyPremPercentageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyPremPercentageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyPremPercentageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyPremPercentageSoap[] toSoapModels(
		List<PolicyPremPercentage> models) {
		List<PolicyPremPercentageSoap> soapModels = new ArrayList<PolicyPremPercentageSoap>(models.size());

		for (PolicyPremPercentage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyPremPercentageSoap[soapModels.size()]);
	}

	public PolicyPremPercentageSoap() {
	}

	public int getPrimaryKey() {
		return _PREM_PERCENTAGE_ID;
	}

	public void setPrimaryKey(int pk) {
		setPREM_PERCENTAGE_ID(pk);
	}

	public int getPREM_PERCENTAGE_ID() {
		return _PREM_PERCENTAGE_ID;
	}

	public void setPREM_PERCENTAGE_ID(int PREM_PERCENTAGE_ID) {
		_PREM_PERCENTAGE_ID = PREM_PERCENTAGE_ID;
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

	public int getFUND_PERCENTAGE() {
		return _FUND_PERCENTAGE;
	}

	public void setFUND_PERCENTAGE(int FUND_PERCENTAGE) {
		_FUND_PERCENTAGE = FUND_PERCENTAGE;
	}

	private int _PREM_PERCENTAGE_ID;
	private String _POLICY_ID;
	private int _FUND_ID;
	private int _FUND_PERCENTAGE;
}