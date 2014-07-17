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
public class PaymentMethodTypeSoap implements Serializable {
	public static PaymentMethodTypeSoap toSoapModel(PaymentMethodType model) {
		PaymentMethodTypeSoap soapModel = new PaymentMethodTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setPaymentMethodID(model.getPaymentMethodID());
		soapModel.setGatewayID(model.getGatewayID());
		soapModel.setTypeKey(model.getTypeKey());
		soapModel.setDescription(model.getDescription());
		soapModel.setBankId(model.getBankId());
		soapModel.setActive(model.getActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static PaymentMethodTypeSoap[] toSoapModels(
		PaymentMethodType[] models) {
		PaymentMethodTypeSoap[] soapModels = new PaymentMethodTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentMethodTypeSoap[][] toSoapModels(
		PaymentMethodType[][] models) {
		PaymentMethodTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentMethodTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentMethodTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentMethodTypeSoap[] toSoapModels(
		List<PaymentMethodType> models) {
		List<PaymentMethodTypeSoap> soapModels = new ArrayList<PaymentMethodTypeSoap>(models.size());

		for (PaymentMethodType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentMethodTypeSoap[soapModels.size()]);
	}

	public PaymentMethodTypeSoap() {
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

	public String getPaymentMethodID() {
		return _PaymentMethodID;
	}

	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;
	}

	public String getGatewayID() {
		return _GatewayID;
	}

	public void setGatewayID(String GatewayID) {
		_GatewayID = GatewayID;
	}

	public String getTypeKey() {
		return _TypeKey;
	}

	public void setTypeKey(String TypeKey) {
		_TypeKey = TypeKey;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public String getBankId() {
		return _BankId;
	}

	public void setBankId(String BankId) {
		_BankId = BankId;
	}

	public boolean getActive() {
		return _Active;
	}

	public boolean isActive() {
		return _Active;
	}

	public void setActive(boolean Active) {
		_Active = Active;
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

	public String getType() {
		return _Type;
	}

	public void setType(String Type) {
		_Type = Type;
	}

	private String _Id;
	private String _PaymentMethodID;
	private String _GatewayID;
	private String _TypeKey;
	private String _Description;
	private String _BankId;
	private boolean _Active;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _Type;
}