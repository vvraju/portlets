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
public class CustomerOtpSoap implements Serializable {
	public static CustomerOtpSoap toSoapModel(CustomerOtp model) {
		CustomerOtpSoap soapModel = new CustomerOtpSoap();

		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setEMAIL_OTP(model.getEMAIL_OTP());
		soapModel.setPHONE_OTP(model.getPHONE_OTP());
		soapModel.setSTATUS(model.getSTATUS());
		soapModel.setADDED_DATE(model.getADDED_DATE());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());

		return soapModel;
	}

	public static CustomerOtpSoap[] toSoapModels(CustomerOtp[] models) {
		CustomerOtpSoap[] soapModels = new CustomerOtpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomerOtpSoap[][] toSoapModels(CustomerOtp[][] models) {
		CustomerOtpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomerOtpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomerOtpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomerOtpSoap[] toSoapModels(List<CustomerOtp> models) {
		List<CustomerOtpSoap> soapModels = new ArrayList<CustomerOtpSoap>(models.size());

		for (CustomerOtp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomerOtpSoap[soapModels.size()]);
	}

	public CustomerOtpSoap() {
	}

	public int getPrimaryKey() {
		return _CUSTOMER_ID;
	}

	public void setPrimaryKey(int pk) {
		setCUSTOMER_ID(pk);
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public String getEMAIL_OTP() {
		return _EMAIL_OTP;
	}

	public void setEMAIL_OTP(String EMAIL_OTP) {
		_EMAIL_OTP = EMAIL_OTP;
	}

	public String getPHONE_OTP() {
		return _PHONE_OTP;
	}

	public void setPHONE_OTP(String PHONE_OTP) {
		_PHONE_OTP = PHONE_OTP;
	}

	public String getSTATUS() {
		return _STATUS;
	}

	public void setSTATUS(String STATUS) {
		_STATUS = STATUS;
	}

	public Date getADDED_DATE() {
		return _ADDED_DATE;
	}

	public void setADDED_DATE(Date ADDED_DATE) {
		_ADDED_DATE = ADDED_DATE;
	}

	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	private int _CUSTOMER_ID;
	private String _EMAIL_OTP;
	private String _PHONE_OTP;
	private String _STATUS;
	private Date _ADDED_DATE;
	private Date _UPDATED_DATE;
}