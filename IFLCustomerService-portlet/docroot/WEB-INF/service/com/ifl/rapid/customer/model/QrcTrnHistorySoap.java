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
public class QrcTrnHistorySoap implements Serializable {
	public static QrcTrnHistorySoap toSoapModel(QrcTrnHistory model) {
		QrcTrnHistorySoap soapModel = new QrcTrnHistorySoap();

		soapModel.setHistoryId(model.getHistoryId());
		soapModel.setContactId(model.getContactId());
		soapModel.setCreatedContactId(model.getCreatedContactId());
		soapModel.setRequestType(model.getRequestType());
		soapModel.setChangeRequestType(model.getChangeRequestType());
		soapModel.setPickupDate(model.getPickupDate());
		soapModel.setPickupTime(model.getPickupTime());
		soapModel.setXMLData(model.getXMLData());
		soapModel.setAddressTypeId(model.getAddressTypeId());
		soapModel.setBranchId(model.getBranchId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static QrcTrnHistorySoap[] toSoapModels(QrcTrnHistory[] models) {
		QrcTrnHistorySoap[] soapModels = new QrcTrnHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QrcTrnHistorySoap[][] toSoapModels(QrcTrnHistory[][] models) {
		QrcTrnHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QrcTrnHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new QrcTrnHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QrcTrnHistorySoap[] toSoapModels(List<QrcTrnHistory> models) {
		List<QrcTrnHistorySoap> soapModels = new ArrayList<QrcTrnHistorySoap>(models.size());

		for (QrcTrnHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QrcTrnHistorySoap[soapModels.size()]);
	}

	public QrcTrnHistorySoap() {
	}

	public int getPrimaryKey() {
		return _HistoryId;
	}

	public void setPrimaryKey(int pk) {
		setHistoryId(pk);
	}

	public int getHistoryId() {
		return _HistoryId;
	}

	public void setHistoryId(int HistoryId) {
		_HistoryId = HistoryId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public int getCreatedContactId() {
		return _CreatedContactId;
	}

	public void setCreatedContactId(int CreatedContactId) {
		_CreatedContactId = CreatedContactId;
	}

	public String getRequestType() {
		return _RequestType;
	}

	public void setRequestType(String RequestType) {
		_RequestType = RequestType;
	}

	public String getChangeRequestType() {
		return _ChangeRequestType;
	}

	public void setChangeRequestType(String ChangeRequestType) {
		_ChangeRequestType = ChangeRequestType;
	}

	public Date getPickupDate() {
		return _PickupDate;
	}

	public void setPickupDate(Date PickupDate) {
		_PickupDate = PickupDate;
	}

	public String getPickupTime() {
		return _PickupTime;
	}

	public void setPickupTime(String PickupTime) {
		_PickupTime = PickupTime;
	}

	public String getXMLData() {
		return _XMLData;
	}

	public void setXMLData(String XMLData) {
		_XMLData = XMLData;
	}

	public int getAddressTypeId() {
		return _AddressTypeId;
	}

	public void setAddressTypeId(int AddressTypeId) {
		_AddressTypeId = AddressTypeId;
	}

	public int getBranchId() {
		return _BranchId;
	}

	public void setBranchId(int BranchId) {
		_BranchId = BranchId;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
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

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	private int _HistoryId;
	private int _ContactId;
	private int _CreatedContactId;
	private String _RequestType;
	private String _ChangeRequestType;
	private Date _PickupDate;
	private String _PickupTime;
	private String _XMLData;
	private int _AddressTypeId;
	private int _BranchId;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}