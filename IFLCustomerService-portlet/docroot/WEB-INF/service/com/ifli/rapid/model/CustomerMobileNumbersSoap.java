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
public class CustomerMobileNumbersSoap implements Serializable {
	public static CustomerMobileNumbersSoap toSoapModel(
		CustomerMobileNumbers model) {
		CustomerMobileNumbersSoap soapModel = new CustomerMobileNumbersSoap();

		soapModel.setID(model.getID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setMOBILE_NUMBER(model.getMOBILE_NUMBER());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());

		return soapModel;
	}

	public static CustomerMobileNumbersSoap[] toSoapModels(
		CustomerMobileNumbers[] models) {
		CustomerMobileNumbersSoap[] soapModels = new CustomerMobileNumbersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomerMobileNumbersSoap[][] toSoapModels(
		CustomerMobileNumbers[][] models) {
		CustomerMobileNumbersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomerMobileNumbersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomerMobileNumbersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomerMobileNumbersSoap[] toSoapModels(
		List<CustomerMobileNumbers> models) {
		List<CustomerMobileNumbersSoap> soapModels = new ArrayList<CustomerMobileNumbersSoap>(models.size());

		for (CustomerMobileNumbers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomerMobileNumbersSoap[soapModels.size()]);
	}

	public CustomerMobileNumbersSoap() {
	}

	public int getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(int pk) {
		setID(pk);
	}

	public int getID() {
		return _ID;
	}

	public void setID(int ID) {
		_ID = ID;
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public String getMOBILE_NUMBER() {
		return _MOBILE_NUMBER;
	}

	public void setMOBILE_NUMBER(String MOBILE_NUMBER) {
		_MOBILE_NUMBER = MOBILE_NUMBER;
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

	private int _ID;
	private int _CUSTOMER_ID;
	private String _MOBILE_NUMBER;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
}