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
public class AddressTypeSoap implements Serializable {
	public static AddressTypeSoap toSoapModel(AddressType model) {
		AddressTypeSoap soapModel = new AddressTypeSoap();

		soapModel.setADDRESS_TYPE_ID(model.getADDRESS_TYPE_ID());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setACTIVE_FLAG(model.getACTIVE_FLAG());
		soapModel.setADDRESS_TYPE_DESC(model.getADDRESS_TYPE_DESC());

		return soapModel;
	}

	public static AddressTypeSoap[] toSoapModels(AddressType[] models) {
		AddressTypeSoap[] soapModels = new AddressTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AddressTypeSoap[][] toSoapModels(AddressType[][] models) {
		AddressTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AddressTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AddressTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AddressTypeSoap[] toSoapModels(List<AddressType> models) {
		List<AddressTypeSoap> soapModels = new ArrayList<AddressTypeSoap>(models.size());

		for (AddressType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AddressTypeSoap[soapModels.size()]);
	}

	public AddressTypeSoap() {
	}

	public int getPrimaryKey() {
		return _ADDRESS_TYPE_ID;
	}

	public void setPrimaryKey(int pk) {
		setADDRESS_TYPE_ID(pk);
	}

	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;
	}

	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;
	}

	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;
	}

	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;
	}

	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	public String getACTIVE_FLAG() {
		return _ACTIVE_FLAG;
	}

	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;
	}

	public String getADDRESS_TYPE_DESC() {
		return _ADDRESS_TYPE_DESC;
	}

	public void setADDRESS_TYPE_DESC(String ADDRESS_TYPE_DESC) {
		_ADDRESS_TYPE_DESC = ADDRESS_TYPE_DESC;
	}

	private int _ADDRESS_TYPE_ID;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private String _ACTIVE_FLAG;
	private String _ADDRESS_TYPE_DESC;
}