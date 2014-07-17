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
public class PaymentTransactionStatusMasterSoap implements Serializable {
	public static PaymentTransactionStatusMasterSoap toSoapModel(
		PaymentTransactionStatusMaster model) {
		PaymentTransactionStatusMasterSoap soapModel = new PaymentTransactionStatusMasterSoap();

		soapModel.setTransactionStatusID(model.getTransactionStatusID());
		soapModel.setStatusCode(model.getStatusCode());
		soapModel.setStatusName(model.getStatusName());
		soapModel.setStatusDesc(model.getStatusDesc());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static PaymentTransactionStatusMasterSoap[] toSoapModels(
		PaymentTransactionStatusMaster[] models) {
		PaymentTransactionStatusMasterSoap[] soapModels = new PaymentTransactionStatusMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentTransactionStatusMasterSoap[][] toSoapModels(
		PaymentTransactionStatusMaster[][] models) {
		PaymentTransactionStatusMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentTransactionStatusMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentTransactionStatusMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentTransactionStatusMasterSoap[] toSoapModels(
		List<PaymentTransactionStatusMaster> models) {
		List<PaymentTransactionStatusMasterSoap> soapModels = new ArrayList<PaymentTransactionStatusMasterSoap>(models.size());

		for (PaymentTransactionStatusMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentTransactionStatusMasterSoap[soapModels.size()]);
	}

	public PaymentTransactionStatusMasterSoap() {
	}

	public int getPrimaryKey() {
		return _TransactionStatusID;
	}

	public void setPrimaryKey(int pk) {
		setTransactionStatusID(pk);
	}

	public int getTransactionStatusID() {
		return _TransactionStatusID;
	}

	public void setTransactionStatusID(int TransactionStatusID) {
		_TransactionStatusID = TransactionStatusID;
	}

	public int getStatusCode() {
		return _StatusCode;
	}

	public void setStatusCode(int StatusCode) {
		_StatusCode = StatusCode;
	}

	public String getStatusName() {
		return _StatusName;
	}

	public void setStatusName(String StatusName) {
		_StatusName = StatusName;
	}

	public String getStatusDesc() {
		return _StatusDesc;
	}

	public void setStatusDesc(String StatusDesc) {
		_StatusDesc = StatusDesc;
	}

	public boolean getIsActive() {
		return _IsActive;
	}

	public boolean isIsActive() {
		return _IsActive;
	}

	public void setIsActive(boolean IsActive) {
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

	private int _TransactionStatusID;
	private int _StatusCode;
	private String _StatusName;
	private String _StatusDesc;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
}