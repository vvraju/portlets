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
public class CRM_Trn_PolicyAddressSoap implements Serializable {
	public static CRM_Trn_PolicyAddressSoap toSoapModel(
		CRM_Trn_PolicyAddress model) {
		CRM_Trn_PolicyAddressSoap soapModel = new CRM_Trn_PolicyAddressSoap();

		soapModel.setPolicyAddressId(model.getPolicyAddressId());
		soapModel.setContactId(model.getContactId());
		soapModel.setPolicyNo(model.getPolicyNo());
		soapModel.setAddressId(model.getAddressId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CRM_Trn_PolicyAddressSoap[] toSoapModels(
		CRM_Trn_PolicyAddress[] models) {
		CRM_Trn_PolicyAddressSoap[] soapModels = new CRM_Trn_PolicyAddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_PolicyAddressSoap[][] toSoapModels(
		CRM_Trn_PolicyAddress[][] models) {
		CRM_Trn_PolicyAddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CRM_Trn_PolicyAddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CRM_Trn_PolicyAddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_PolicyAddressSoap[] toSoapModels(
		List<CRM_Trn_PolicyAddress> models) {
		List<CRM_Trn_PolicyAddressSoap> soapModels = new ArrayList<CRM_Trn_PolicyAddressSoap>(models.size());

		for (CRM_Trn_PolicyAddress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CRM_Trn_PolicyAddressSoap[soapModels.size()]);
	}

	public CRM_Trn_PolicyAddressSoap() {
	}

	public int getPrimaryKey() {
		return _PolicyAddressId;
	}

	public void setPrimaryKey(int pk) {
		setPolicyAddressId(pk);
	}

	public int getPolicyAddressId() {
		return _PolicyAddressId;
	}

	public void setPolicyAddressId(int PolicyAddressId) {
		_PolicyAddressId = PolicyAddressId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public String getPolicyNo() {
		return _PolicyNo;
	}

	public void setPolicyNo(String PolicyNo) {
		_PolicyNo = PolicyNo;
	}

	public int getAddressId() {
		return _AddressId;
	}

	public void setAddressId(int AddressId) {
		_AddressId = AddressId;
	}

	public String getIsActive() {
		return _IsActive;
	}

	public void setIsActive(String IsActive) {
		_IsActive = IsActive;
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

	private int _PolicyAddressId;
	private int _ContactId;
	private String _PolicyNo;
	private int _AddressId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
}