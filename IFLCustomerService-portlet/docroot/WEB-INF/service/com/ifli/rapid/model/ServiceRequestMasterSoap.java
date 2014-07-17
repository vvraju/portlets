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
public class ServiceRequestMasterSoap implements Serializable {
	public static ServiceRequestMasterSoap toSoapModel(
		ServiceRequestMaster model) {
		ServiceRequestMasterSoap soapModel = new ServiceRequestMasterSoap();

		soapModel.setId(model.getId());
		soapModel.setType(model.getType());
		soapModel.setContactId(model.getContactId());
		soapModel.setAddressTypeId(model.getAddressTypeId());
		soapModel.setAddress(model.getAddress());
		soapModel.setPolicyNo(model.getPolicyNo());
		soapModel.setMobileNo(model.getMobileNo());
		soapModel.setDescription(model.getDescription());
		soapModel.setStartPreferedTime(model.getStartPreferedTime());
		soapModel.setEndPreferedTime(model.getEndPreferedTime());
		soapModel.setPreferedDate(model.getPreferedDate());

		return soapModel;
	}

	public static ServiceRequestMasterSoap[] toSoapModels(
		ServiceRequestMaster[] models) {
		ServiceRequestMasterSoap[] soapModels = new ServiceRequestMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceRequestMasterSoap[][] toSoapModels(
		ServiceRequestMaster[][] models) {
		ServiceRequestMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceRequestMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceRequestMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceRequestMasterSoap[] toSoapModels(
		List<ServiceRequestMaster> models) {
		List<ServiceRequestMasterSoap> soapModels = new ArrayList<ServiceRequestMasterSoap>(models.size());

		for (ServiceRequestMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceRequestMasterSoap[soapModels.size()]);
	}

	public ServiceRequestMasterSoap() {
	}

	public String getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(String pk) {
		setId(pk);
	}

	public String getId() {
		return _Id;
	}

	public void setId(String Id) {
		_Id = Id;
	}

	public String getType() {
		return _Type;
	}

	public void setType(String Type) {
		_Type = Type;
	}

	public String getContactId() {
		return _ContactId;
	}

	public void setContactId(String ContactId) {
		_ContactId = ContactId;
	}

	public String getAddressTypeId() {
		return _addressTypeId;
	}

	public void setAddressTypeId(String addressTypeId) {
		_addressTypeId = addressTypeId;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public int getPolicyNo() {
		return _PolicyNo;
	}

	public void setPolicyNo(int PolicyNo) {
		_PolicyNo = PolicyNo;
	}

	public String getMobileNo() {
		return _MobileNo;
	}

	public void setMobileNo(String MobileNo) {
		_MobileNo = MobileNo;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getStartPreferedTime() {
		return _startPreferedTime;
	}

	public void setStartPreferedTime(Date startPreferedTime) {
		_startPreferedTime = startPreferedTime;
	}

	public Date getEndPreferedTime() {
		return _endPreferedTime;
	}

	public void setEndPreferedTime(Date endPreferedTime) {
		_endPreferedTime = endPreferedTime;
	}

	public Date getPreferedDate() {
		return _PreferedDate;
	}

	public void setPreferedDate(Date PreferedDate) {
		_PreferedDate = PreferedDate;
	}

	private String _Id;
	private String _Type;
	private String _ContactId;
	private String _addressTypeId;
	private String _address;
	private int _PolicyNo;
	private String _MobileNo;
	private String _description;
	private Date _startPreferedTime;
	private Date _endPreferedTime;
	private Date _PreferedDate;
}