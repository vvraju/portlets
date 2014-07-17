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
public class QrcTrnOtpSoap implements Serializable {
	public static QrcTrnOtpSoap toSoapModel(QrcTrnOtp model) {
		QrcTrnOtpSoap soapModel = new QrcTrnOtpSoap();

		soapModel.setOtp_Id(model.getOtp_Id());
		soapModel.setOtp(model.getOtp());
		soapModel.setContactId(model.getContactId());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static QrcTrnOtpSoap[] toSoapModels(QrcTrnOtp[] models) {
		QrcTrnOtpSoap[] soapModels = new QrcTrnOtpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QrcTrnOtpSoap[][] toSoapModels(QrcTrnOtp[][] models) {
		QrcTrnOtpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QrcTrnOtpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QrcTrnOtpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QrcTrnOtpSoap[] toSoapModels(List<QrcTrnOtp> models) {
		List<QrcTrnOtpSoap> soapModels = new ArrayList<QrcTrnOtpSoap>(models.size());

		for (QrcTrnOtp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QrcTrnOtpSoap[soapModels.size()]);
	}

	public QrcTrnOtpSoap() {
	}

	public int getPrimaryKey() {
		return _Otp_Id;
	}

	public void setPrimaryKey(int pk) {
		setOtp_Id(pk);
	}

	public int getOtp_Id() {
		return _Otp_Id;
	}

	public void setOtp_Id(int Otp_Id) {
		_Otp_Id = Otp_Id;
	}

	public String getOtp() {
		return _Otp;
	}

	public void setOtp(String Otp) {
		_Otp = Otp;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
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

	public String getIsActive() {
		return _IsActive;
	}

	public void setIsActive(String IsActive) {
		_IsActive = IsActive;
	}

	private int _Otp_Id;
	private String _Otp;
	private int _ContactId;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}