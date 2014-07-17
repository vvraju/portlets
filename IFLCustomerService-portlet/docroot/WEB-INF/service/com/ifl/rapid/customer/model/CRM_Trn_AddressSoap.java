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
public class CRM_Trn_AddressSoap implements Serializable {
	public static CRM_Trn_AddressSoap toSoapModel(CRM_Trn_Address model) {
		CRM_Trn_AddressSoap soapModel = new CRM_Trn_AddressSoap();

		soapModel.setAddressId(model.getAddressId());
		soapModel.setContactId(model.getContactId());
		soapModel.setAddressTypeId(model.getAddressTypeId());
		soapModel.setAddressLine1(model.getAddressLine1());
		soapModel.setAddressLine2(model.getAddressLine2());
		soapModel.setAddressLine3(model.getAddressLine3());
		soapModel.setDistrict(model.getDistrict());
		soapModel.setStateId(model.getStateId());
		soapModel.setCityId(model.getCityId());
		soapModel.setPincode(model.getPincode());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CRM_Trn_AddressSoap[] toSoapModels(CRM_Trn_Address[] models) {
		CRM_Trn_AddressSoap[] soapModels = new CRM_Trn_AddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_AddressSoap[][] toSoapModels(
		CRM_Trn_Address[][] models) {
		CRM_Trn_AddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CRM_Trn_AddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CRM_Trn_AddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_AddressSoap[] toSoapModels(
		List<CRM_Trn_Address> models) {
		List<CRM_Trn_AddressSoap> soapModels = new ArrayList<CRM_Trn_AddressSoap>(models.size());

		for (CRM_Trn_Address model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CRM_Trn_AddressSoap[soapModels.size()]);
	}

	public CRM_Trn_AddressSoap() {
	}

	public int getPrimaryKey() {
		return _AddressId;
	}

	public void setPrimaryKey(int pk) {
		setAddressId(pk);
	}

	public int getAddressId() {
		return _AddressId;
	}

	public void setAddressId(int AddressId) {
		_AddressId = AddressId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public int getAddressTypeId() {
		return _AddressTypeId;
	}

	public void setAddressTypeId(int AddressTypeId) {
		_AddressTypeId = AddressTypeId;
	}

	public String getAddressLine1() {
		return _AddressLine1;
	}

	public void setAddressLine1(String AddressLine1) {
		_AddressLine1 = AddressLine1;
	}

	public String getAddressLine2() {
		return _AddressLine2;
	}

	public void setAddressLine2(String AddressLine2) {
		_AddressLine2 = AddressLine2;
	}

	public String getAddressLine3() {
		return _AddressLine3;
	}

	public void setAddressLine3(String AddressLine3) {
		_AddressLine3 = AddressLine3;
	}

	public String getDistrict() {
		return _District;
	}

	public void setDistrict(String District) {
		_District = District;
	}

	public int getStateId() {
		return _StateId;
	}

	public void setStateId(int StateId) {
		_StateId = StateId;
	}

	public int getCityId() {
		return _CityId;
	}

	public void setCityId(int CityId) {
		_CityId = CityId;
	}

	public String getPincode() {
		return _Pincode;
	}

	public void setPincode(String Pincode) {
		_Pincode = Pincode;
	}

	public int getCountryId() {
		return _CountryId;
	}

	public void setCountryId(int CountryId) {
		_CountryId = CountryId;
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

	private int _AddressId;
	private int _ContactId;
	private int _AddressTypeId;
	private String _AddressLine1;
	private String _AddressLine2;
	private String _AddressLine3;
	private String _District;
	private int _StateId;
	private int _CityId;
	private String _Pincode;
	private int _CountryId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
}