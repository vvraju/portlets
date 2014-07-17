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
public class PaymentOptionMasterSoap implements Serializable {
	public static PaymentOptionMasterSoap toSoapModel(PaymentOptionMaster model) {
		PaymentOptionMasterSoap soapModel = new PaymentOptionMasterSoap();

		soapModel.setPaymentOptionId(model.getPaymentOptionId());
		soapModel.setPaymentOptionKey(model.getPaymentOptionKey());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPriority(model.getPriority());
		soapModel.setPaymentOptionDesc(model.getPaymentOptionDesc());
		soapModel.setIsProcessPayment(model.getIsProcessPayment());

		return soapModel;
	}

	public static PaymentOptionMasterSoap[] toSoapModels(
		PaymentOptionMaster[] models) {
		PaymentOptionMasterSoap[] soapModels = new PaymentOptionMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentOptionMasterSoap[][] toSoapModels(
		PaymentOptionMaster[][] models) {
		PaymentOptionMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentOptionMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentOptionMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentOptionMasterSoap[] toSoapModels(
		List<PaymentOptionMaster> models) {
		List<PaymentOptionMasterSoap> soapModels = new ArrayList<PaymentOptionMasterSoap>(models.size());

		for (PaymentOptionMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentOptionMasterSoap[soapModels.size()]);
	}

	public PaymentOptionMasterSoap() {
	}

	public String getPrimaryKey() {
		return _PaymentOptionId;
	}

	public void setPrimaryKey(String pk) {
		setPaymentOptionId(pk);
	}

	public String getPaymentOptionId() {
		return _PaymentOptionId;
	}

	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;
	}

	public String getPaymentOptionKey() {
		return _PaymentOptionKey;
	}

	public void setPaymentOptionKey(String PaymentOptionKey) {
		_PaymentOptionKey = PaymentOptionKey;
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

	public String getPaymentOptionDesc() {
		return _PaymentOptionDesc;
	}

	public void setPaymentOptionDesc(String PaymentOptionDesc) {
		_PaymentOptionDesc = PaymentOptionDesc;
	}

	public boolean getIsProcessPayment() {
		return _isProcessPayment;
	}

	public boolean isIsProcessPayment() {
		return _isProcessPayment;
	}

	public void setIsProcessPayment(boolean isProcessPayment) {
		_isProcessPayment = isProcessPayment;
	}

	private String _PaymentOptionId;
	private String _PaymentOptionKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private String _PaymentOptionDesc;
	private boolean _isProcessPayment;
}