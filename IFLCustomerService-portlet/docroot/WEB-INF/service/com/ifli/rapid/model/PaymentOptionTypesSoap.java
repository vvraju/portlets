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
public class PaymentOptionTypesSoap implements Serializable {
	public static PaymentOptionTypesSoap toSoapModel(PaymentOptionTypes model) {
		PaymentOptionTypesSoap soapModel = new PaymentOptionTypesSoap();

		soapModel.setPaymentOptionTypesId(model.getPaymentOptionTypesId());
		soapModel.setPaymentOptionId(model.getPaymentOptionId());
		soapModel.setOptionTypesKey(model.getOptionTypesKey());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPriority(model.getPriority());
		soapModel.setPaymentOptionTypeDesc(model.getPaymentOptionTypeDesc());

		return soapModel;
	}

	public static PaymentOptionTypesSoap[] toSoapModels(
		PaymentOptionTypes[] models) {
		PaymentOptionTypesSoap[] soapModels = new PaymentOptionTypesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentOptionTypesSoap[][] toSoapModels(
		PaymentOptionTypes[][] models) {
		PaymentOptionTypesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentOptionTypesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentOptionTypesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentOptionTypesSoap[] toSoapModels(
		List<PaymentOptionTypes> models) {
		List<PaymentOptionTypesSoap> soapModels = new ArrayList<PaymentOptionTypesSoap>(models.size());

		for (PaymentOptionTypes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentOptionTypesSoap[soapModels.size()]);
	}

	public PaymentOptionTypesSoap() {
	}

	public String getPrimaryKey() {
		return _PaymentOptionTypesId;
	}

	public void setPrimaryKey(String pk) {
		setPaymentOptionTypesId(pk);
	}

	public String getPaymentOptionTypesId() {
		return _PaymentOptionTypesId;
	}

	public void setPaymentOptionTypesId(String PaymentOptionTypesId) {
		_PaymentOptionTypesId = PaymentOptionTypesId;
	}

	public String getPaymentOptionId() {
		return _PaymentOptionId;
	}

	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;
	}

	public String getOptionTypesKey() {
		return _OptionTypesKey;
	}

	public void setOptionTypesKey(String OptionTypesKey) {
		_OptionTypesKey = OptionTypesKey;
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

	public String getPaymentOptionTypeDesc() {
		return _PaymentOptionTypeDesc;
	}

	public void setPaymentOptionTypeDesc(String PaymentOptionTypeDesc) {
		_PaymentOptionTypeDesc = PaymentOptionTypeDesc;
	}

	private String _PaymentOptionTypesId;
	private String _PaymentOptionId;
	private String _OptionTypesKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private String _PaymentOptionTypeDesc;
}