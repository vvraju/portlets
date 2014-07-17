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
public class PolicyPremRedirectionDetailsSoap implements Serializable {
	public static PolicyPremRedirectionDetailsSoap toSoapModel(
		PolicyPremRedirectionDetails model) {
		PolicyPremRedirectionDetailsSoap soapModel = new PolicyPremRedirectionDetailsSoap();

		soapModel.setPREM_REDIRECTION_ID(model.getPREM_REDIRECTION_ID());
		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setTRANSACTION_AUDIT_ID(model.getTRANSACTION_AUDIT_ID());
		soapModel.setFUND_CODE(model.getFUND_CODE());
		soapModel.setALLOCATION_PERCENTAGE(model.getALLOCATION_PERCENTAGE());
		soapModel.setSENT_TO_ODS_FLAG(model.getSENT_TO_ODS_FLAG());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());

		return soapModel;
	}

	public static PolicyPremRedirectionDetailsSoap[] toSoapModels(
		PolicyPremRedirectionDetails[] models) {
		PolicyPremRedirectionDetailsSoap[] soapModels = new PolicyPremRedirectionDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyPremRedirectionDetailsSoap[][] toSoapModels(
		PolicyPremRedirectionDetails[][] models) {
		PolicyPremRedirectionDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyPremRedirectionDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyPremRedirectionDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyPremRedirectionDetailsSoap[] toSoapModels(
		List<PolicyPremRedirectionDetails> models) {
		List<PolicyPremRedirectionDetailsSoap> soapModels = new ArrayList<PolicyPremRedirectionDetailsSoap>(models.size());

		for (PolicyPremRedirectionDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyPremRedirectionDetailsSoap[soapModels.size()]);
	}

	public PolicyPremRedirectionDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _PREM_REDIRECTION_ID;
	}

	public void setPrimaryKey(int pk) {
		setPREM_REDIRECTION_ID(pk);
	}

	public int getPREM_REDIRECTION_ID() {
		return _PREM_REDIRECTION_ID;
	}

	public void setPREM_REDIRECTION_ID(int PREM_REDIRECTION_ID) {
		_PREM_REDIRECTION_ID = PREM_REDIRECTION_ID;
	}

	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public int getTRANSACTION_AUDIT_ID() {
		return _TRANSACTION_AUDIT_ID;
	}

	public void setTRANSACTION_AUDIT_ID(int TRANSACTION_AUDIT_ID) {
		_TRANSACTION_AUDIT_ID = TRANSACTION_AUDIT_ID;
	}

	public String getFUND_CODE() {
		return _FUND_CODE;
	}

	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;
	}

	public double getALLOCATION_PERCENTAGE() {
		return _ALLOCATION_PERCENTAGE;
	}

	public void setALLOCATION_PERCENTAGE(double ALLOCATION_PERCENTAGE) {
		_ALLOCATION_PERCENTAGE = ALLOCATION_PERCENTAGE;
	}

	public String getSENT_TO_ODS_FLAG() {
		return _SENT_TO_ODS_FLAG;
	}

	public void setSENT_TO_ODS_FLAG(String SENT_TO_ODS_FLAG) {
		_SENT_TO_ODS_FLAG = SENT_TO_ODS_FLAG;
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

	private int _PREM_REDIRECTION_ID;
	private String _POLICY_ID;
	private int _TRANSACTION_AUDIT_ID;
	private String _FUND_CODE;
	private double _ALLOCATION_PERCENTAGE;
	private String _SENT_TO_ODS_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
}