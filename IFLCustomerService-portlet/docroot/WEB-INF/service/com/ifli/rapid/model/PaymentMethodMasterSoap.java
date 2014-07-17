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
public class PaymentMethodMasterSoap implements Serializable {
	public static PaymentMethodMasterSoap toSoapModel(PaymentMethodMaster model) {
		PaymentMethodMasterSoap soapModel = new PaymentMethodMasterSoap();

		soapModel.setPaymentMethodID(model.getPaymentMethodID());
		soapModel.setPaymentMethodKey(model.getPaymentMethodKey());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPriority(model.getPriority());

		return soapModel;
	}

	public static PaymentMethodMasterSoap[] toSoapModels(
		PaymentMethodMaster[] models) {
		PaymentMethodMasterSoap[] soapModels = new PaymentMethodMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentMethodMasterSoap[][] toSoapModels(
		PaymentMethodMaster[][] models) {
		PaymentMethodMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentMethodMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentMethodMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentMethodMasterSoap[] toSoapModels(
		List<PaymentMethodMaster> models) {
		List<PaymentMethodMasterSoap> soapModels = new ArrayList<PaymentMethodMasterSoap>(models.size());

		for (PaymentMethodMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentMethodMasterSoap[soapModels.size()]);
	}

	public PaymentMethodMasterSoap() {
	}

	public String getPrimaryKey() {
		return _PaymentMethodID;
	}

	public void setPrimaryKey(String pk) {
		setPaymentMethodID(pk);
	}

	public String getPaymentMethodID() {
		return _PaymentMethodID;
	}

	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;
	}

	public String getPaymentMethodKey() {
		return _PaymentMethodKey;
	}

	public void setPaymentMethodKey(String PaymentMethodKey) {
		_PaymentMethodKey = PaymentMethodKey;
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

	private String _PaymentMethodID;
	private String _PaymentMethodKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
}