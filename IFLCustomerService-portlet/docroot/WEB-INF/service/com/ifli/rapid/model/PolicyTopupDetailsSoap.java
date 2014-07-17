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
public class PolicyTopupDetailsSoap implements Serializable {
	public static PolicyTopupDetailsSoap toSoapModel(PolicyTopupDetails model) {
		PolicyTopupDetailsSoap soapModel = new PolicyTopupDetailsSoap();

		soapModel.setTOPUP_ID(model.getTOPUP_ID());
		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setQRC_ASR_ID(model.getQRC_ASR_ID());
		soapModel.setFUND_ID(model.getFUND_ID());
		soapModel.setFUND_VALUE(model.getFUND_VALUE());
		soapModel.setTOPUP_VALUE(model.getTOPUP_VALUE());
		soapModel.setTOT_VALUE(model.getTOT_VALUE());
		soapModel.setTOPUP_PERCENTAGE(model.getTOPUP_PERCENTAGE());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static PolicyTopupDetailsSoap[] toSoapModels(
		PolicyTopupDetails[] models) {
		PolicyTopupDetailsSoap[] soapModels = new PolicyTopupDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyTopupDetailsSoap[][] toSoapModels(
		PolicyTopupDetails[][] models) {
		PolicyTopupDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyTopupDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyTopupDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyTopupDetailsSoap[] toSoapModels(
		List<PolicyTopupDetails> models) {
		List<PolicyTopupDetailsSoap> soapModels = new ArrayList<PolicyTopupDetailsSoap>(models.size());

		for (PolicyTopupDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyTopupDetailsSoap[soapModels.size()]);
	}

	public PolicyTopupDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _TOPUP_ID;
	}

	public void setPrimaryKey(int pk) {
		setTOPUP_ID(pk);
	}

	public int getTOPUP_ID() {
		return _TOPUP_ID;
	}

	public void setTOPUP_ID(int TOPUP_ID) {
		_TOPUP_ID = TOPUP_ID;
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

	public int getFUND_ID() {
		return _FUND_ID;
	}

	public void setFUND_ID(int FUND_ID) {
		_FUND_ID = FUND_ID;
	}

	public double getFUND_VALUE() {
		return _FUND_VALUE;
	}

	public void setFUND_VALUE(double FUND_VALUE) {
		_FUND_VALUE = FUND_VALUE;
	}

	public double getTOPUP_VALUE() {
		return _TOPUP_VALUE;
	}

	public void setTOPUP_VALUE(double TOPUP_VALUE) {
		_TOPUP_VALUE = TOPUP_VALUE;
	}

	public double getTOT_VALUE() {
		return _TOT_VALUE;
	}

	public void setTOT_VALUE(double TOT_VALUE) {
		_TOT_VALUE = TOT_VALUE;
	}

	public double getTOPUP_PERCENTAGE() {
		return _TOPUP_PERCENTAGE;
	}

	public void setTOPUP_PERCENTAGE(double TOPUP_PERCENTAGE) {
		_TOPUP_PERCENTAGE = TOPUP_PERCENTAGE;
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

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	private int _TOPUP_ID;
	private String _POLICY_ID;
	private int _QRC_ASR_ID;
	private int _FUND_ID;
	private double _FUND_VALUE;
	private double _TOPUP_VALUE;
	private double _TOT_VALUE;
	private double _TOPUP_PERCENTAGE;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
}