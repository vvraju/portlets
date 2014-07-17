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
public class PolicyFundSwitchDetailsSoap implements Serializable {
	public static PolicyFundSwitchDetailsSoap toSoapModel(
		PolicyFundSwitchDetails model) {
		PolicyFundSwitchDetailsSoap soapModel = new PolicyFundSwitchDetailsSoap();

		soapModel.setFUND_SWITCH_ID(model.getFUND_SWITCH_ID());
		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setQRC_ASR_ID(model.getQRC_ASR_ID());
		soapModel.setFUND_FROM(model.getFUND_FROM());
		soapModel.setFUND_TO(model.getFUND_TO());
		soapModel.setPRECENTAGE_OF_UNITS(model.getPRECENTAGE_OF_UNITS());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());

		return soapModel;
	}

	public static PolicyFundSwitchDetailsSoap[] toSoapModels(
		PolicyFundSwitchDetails[] models) {
		PolicyFundSwitchDetailsSoap[] soapModels = new PolicyFundSwitchDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyFundSwitchDetailsSoap[][] toSoapModels(
		PolicyFundSwitchDetails[][] models) {
		PolicyFundSwitchDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyFundSwitchDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyFundSwitchDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyFundSwitchDetailsSoap[] toSoapModels(
		List<PolicyFundSwitchDetails> models) {
		List<PolicyFundSwitchDetailsSoap> soapModels = new ArrayList<PolicyFundSwitchDetailsSoap>(models.size());

		for (PolicyFundSwitchDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyFundSwitchDetailsSoap[soapModels.size()]);
	}

	public PolicyFundSwitchDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _FUND_SWITCH_ID;
	}

	public void setPrimaryKey(int pk) {
		setFUND_SWITCH_ID(pk);
	}

	public int getFUND_SWITCH_ID() {
		return _FUND_SWITCH_ID;
	}

	public void setFUND_SWITCH_ID(int FUND_SWITCH_ID) {
		_FUND_SWITCH_ID = FUND_SWITCH_ID;
	}

	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;
	}

	public String getFUND_FROM() {
		return _FUND_FROM;
	}

	public void setFUND_FROM(String FUND_FROM) {
		_FUND_FROM = FUND_FROM;
	}

	public String getFUND_TO() {
		return _FUND_TO;
	}

	public void setFUND_TO(String FUND_TO) {
		_FUND_TO = FUND_TO;
	}

	public double getPRECENTAGE_OF_UNITS() {
		return _PRECENTAGE_OF_UNITS;
	}

	public void setPRECENTAGE_OF_UNITS(double PRECENTAGE_OF_UNITS) {
		_PRECENTAGE_OF_UNITS = PRECENTAGE_OF_UNITS;
	}

	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;
	}

	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;
	}

	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;
	}

	private int _FUND_SWITCH_ID;
	private String _POLICY_ID;
	private int _QRC_ASR_ID;
	private String _FUND_FROM;
	private String _FUND_TO;
	private double _PRECENTAGE_OF_UNITS;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
}