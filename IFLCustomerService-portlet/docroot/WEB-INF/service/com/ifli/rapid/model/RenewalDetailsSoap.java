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
public class RenewalDetailsSoap implements Serializable {
	public static RenewalDetailsSoap toSoapModel(RenewalDetails model) {
		RenewalDetailsSoap soapModel = new RenewalDetailsSoap();

		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setEMAIL_ID(model.getEMAIL_ID());
		soapModel.setMOBILE_NUMBER(model.getMOBILE_NUMBER());
		soapModel.setPOLICY_STATUS(model.getPOLICY_STATUS());
		soapModel.setPRODUCT_NAME(model.getPRODUCT_NAME());
		soapModel.setDATE(model.getDATE());
		soapModel.setPOLICY_EXPIRY_DATE(model.getPOLICY_EXPIRY_DATE());

		return soapModel;
	}

	public static RenewalDetailsSoap[] toSoapModels(RenewalDetails[] models) {
		RenewalDetailsSoap[] soapModels = new RenewalDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RenewalDetailsSoap[][] toSoapModels(RenewalDetails[][] models) {
		RenewalDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RenewalDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RenewalDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RenewalDetailsSoap[] toSoapModels(List<RenewalDetails> models) {
		List<RenewalDetailsSoap> soapModels = new ArrayList<RenewalDetailsSoap>(models.size());

		for (RenewalDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RenewalDetailsSoap[soapModels.size()]);
	}

	public RenewalDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _POLICY_ID;
	}

	public void setPrimaryKey(long pk) {
		setPOLICY_ID(pk);
	}

	public long getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(long POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public String getEMAIL_ID() {
		return _EMAIL_ID;
	}

	public void setEMAIL_ID(String EMAIL_ID) {
		_EMAIL_ID = EMAIL_ID;
	}

	public String getMOBILE_NUMBER() {
		return _MOBILE_NUMBER;
	}

	public void setMOBILE_NUMBER(String MOBILE_NUMBER) {
		_MOBILE_NUMBER = MOBILE_NUMBER;
	}

	public String getPOLICY_STATUS() {
		return _POLICY_STATUS;
	}

	public void setPOLICY_STATUS(String POLICY_STATUS) {
		_POLICY_STATUS = POLICY_STATUS;
	}

	public String getPRODUCT_NAME() {
		return _PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String PRODUCT_NAME) {
		_PRODUCT_NAME = PRODUCT_NAME;
	}

	public Date getDATE() {
		return _DATE;
	}

	public void setDATE(Date DATE) {
		_DATE = DATE;
	}

	public Date getPOLICY_EXPIRY_DATE() {
		return _POLICY_EXPIRY_DATE;
	}

	public void setPOLICY_EXPIRY_DATE(Date POLICY_EXPIRY_DATE) {
		_POLICY_EXPIRY_DATE = POLICY_EXPIRY_DATE;
	}

	private long _POLICY_ID;
	private String _EMAIL_ID;
	private String _MOBILE_NUMBER;
	private String _POLICY_STATUS;
	private String _PRODUCT_NAME;
	private Date _DATE;
	private Date _POLICY_EXPIRY_DATE;
}