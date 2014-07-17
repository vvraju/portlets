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
public class PaymentGatewayMasterSoap implements Serializable {
	public static PaymentGatewayMasterSoap toSoapModel(
		PaymentGatewayMaster model) {
		PaymentGatewayMasterSoap soapModel = new PaymentGatewayMasterSoap();

		soapModel.setGatewayID(model.getGatewayID());
		soapModel.setGatewayDescription(model.getGatewayDescription());
		soapModel.setGatewayKey(model.getGatewayKey());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPriority(model.getPriority());
		soapModel.setItemCode(model.getItemCode());

		return soapModel;
	}

	public static PaymentGatewayMasterSoap[] toSoapModels(
		PaymentGatewayMaster[] models) {
		PaymentGatewayMasterSoap[] soapModels = new PaymentGatewayMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentGatewayMasterSoap[][] toSoapModels(
		PaymentGatewayMaster[][] models) {
		PaymentGatewayMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentGatewayMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentGatewayMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentGatewayMasterSoap[] toSoapModels(
		List<PaymentGatewayMaster> models) {
		List<PaymentGatewayMasterSoap> soapModels = new ArrayList<PaymentGatewayMasterSoap>(models.size());

		for (PaymentGatewayMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentGatewayMasterSoap[soapModels.size()]);
	}

	public PaymentGatewayMasterSoap() {
	}

	public String getPrimaryKey() {
		return _GatewayID;
	}

	public void setPrimaryKey(String pk) {
		setGatewayID(pk);
	}

	public String getGatewayID() {
		return _GatewayID;
	}

	public void setGatewayID(String GatewayID) {
		_GatewayID = GatewayID;
	}

	public String getGatewayDescription() {
		return _GatewayDescription;
	}

	public void setGatewayDescription(String GatewayDescription) {
		_GatewayDescription = GatewayDescription;
	}

	public String getGatewayKey() {
		return _GatewayKey;
	}

	public void setGatewayKey(String GatewayKey) {
		_GatewayKey = GatewayKey;
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

	public int getPriority() {
		return _Priority;
	}

	public void setPriority(int Priority) {
		_Priority = Priority;
	}

	public String getItemCode() {
		return _ItemCode;
	}

	public void setItemCode(String ItemCode) {
		_ItemCode = ItemCode;
	}

	private String _GatewayID;
	private String _GatewayDescription;
	private String _GatewayKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private String _ItemCode;
}