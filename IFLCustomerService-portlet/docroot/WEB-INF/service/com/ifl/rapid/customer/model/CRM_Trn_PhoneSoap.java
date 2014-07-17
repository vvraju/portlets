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
public class CRM_Trn_PhoneSoap implements Serializable {
	public static CRM_Trn_PhoneSoap toSoapModel(CRM_Trn_Phone model) {
		CRM_Trn_PhoneSoap soapModel = new CRM_Trn_PhoneSoap();

		soapModel.setPhoneId(model.getPhoneId());
		soapModel.setContactId(model.getContactId());
		soapModel.setPhoneType(model.getPhoneType());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static CRM_Trn_PhoneSoap[] toSoapModels(CRM_Trn_Phone[] models) {
		CRM_Trn_PhoneSoap[] soapModels = new CRM_Trn_PhoneSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_PhoneSoap[][] toSoapModels(CRM_Trn_Phone[][] models) {
		CRM_Trn_PhoneSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CRM_Trn_PhoneSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CRM_Trn_PhoneSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_PhoneSoap[] toSoapModels(List<CRM_Trn_Phone> models) {
		List<CRM_Trn_PhoneSoap> soapModels = new ArrayList<CRM_Trn_PhoneSoap>(models.size());

		for (CRM_Trn_Phone model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CRM_Trn_PhoneSoap[soapModels.size()]);
	}

	public CRM_Trn_PhoneSoap() {
	}

	public int getPrimaryKey() {
		return _PhoneId;
	}

	public void setPrimaryKey(int pk) {
		setPhoneId(pk);
	}

	public int getPhoneId() {
		return _PhoneId;
	}

	public void setPhoneId(int PhoneId) {
		_PhoneId = PhoneId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public int getPhoneType() {
		return _PhoneType;
	}

	public void setPhoneType(int PhoneType) {
		_PhoneType = PhoneType;
	}

	public String getPhoneNumber() {
		return _PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		_PhoneNumber = PhoneNumber;
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

	private int _PhoneId;
	private int _ContactId;
	private int _PhoneType;
	private String _PhoneNumber;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}