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
public class customerMailIdsSoap implements Serializable {
	public static customerMailIdsSoap toSoapModel(customerMailIds model) {
		customerMailIdsSoap soapModel = new customerMailIdsSoap();

		soapModel.setID(model.getID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setEMAIL_ID(model.getEMAIL_ID());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());

		return soapModel;
	}

	public static customerMailIdsSoap[] toSoapModels(customerMailIds[] models) {
		customerMailIdsSoap[] soapModels = new customerMailIdsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static customerMailIdsSoap[][] toSoapModels(
		customerMailIds[][] models) {
		customerMailIdsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new customerMailIdsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new customerMailIdsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static customerMailIdsSoap[] toSoapModels(
		List<customerMailIds> models) {
		List<customerMailIdsSoap> soapModels = new ArrayList<customerMailIdsSoap>(models.size());

		for (customerMailIds model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new customerMailIdsSoap[soapModels.size()]);
	}

	public customerMailIdsSoap() {
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

	public String getEMAIL_ID() {
		return _EMAIL_ID;
	}

	public void setEMAIL_ID(String EMAIL_ID) {
		_EMAIL_ID = EMAIL_ID;
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
	private String _EMAIL_ID;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
}