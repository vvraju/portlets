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
public class AddressChangeReqDetailsSoap implements Serializable {
	public static AddressChangeReqDetailsSoap toSoapModel(
		AddressChangeReqDetails model) {
		AddressChangeReqDetailsSoap soapModel = new AddressChangeReqDetailsSoap();

		soapModel.setADDR_CHANGE_DETAILS_ID(model.getADDR_CHANGE_DETAILS_ID());
		soapModel.setREQUEST_SUBMIT_TYPE(model.getREQUEST_SUBMIT_TYPE());
		soapModel.setSERVICE_REQUEST_ID(model.getSERVICE_REQUEST_ID());
		soapModel.setSUB_TYPE(model.getSUB_TYPE());
		soapModel.setADDRESS_TYPE_ID(model.getADDRESS_TYPE_ID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setSUBMIT_AT_BRANCH(model.getSUBMIT_AT_BRANCH());
		soapModel.setPICKUP_DATE(model.getPICKUP_DATE());
		soapModel.setPICKUP_TIME(model.getPICKUP_TIME());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());

		return soapModel;
	}

	public static AddressChangeReqDetailsSoap[] toSoapModels(
		AddressChangeReqDetails[] models) {
		AddressChangeReqDetailsSoap[] soapModels = new AddressChangeReqDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AddressChangeReqDetailsSoap[][] toSoapModels(
		AddressChangeReqDetails[][] models) {
		AddressChangeReqDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AddressChangeReqDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AddressChangeReqDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AddressChangeReqDetailsSoap[] toSoapModels(
		List<AddressChangeReqDetails> models) {
		List<AddressChangeReqDetailsSoap> soapModels = new ArrayList<AddressChangeReqDetailsSoap>(models.size());

		for (AddressChangeReqDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AddressChangeReqDetailsSoap[soapModels.size()]);
	}

	public AddressChangeReqDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _ADDR_CHANGE_DETAILS_ID;
	}

	public void setPrimaryKey(int pk) {
		setADDR_CHANGE_DETAILS_ID(pk);
	}

	public int getADDR_CHANGE_DETAILS_ID() {
		return _ADDR_CHANGE_DETAILS_ID;
	}

	public void setADDR_CHANGE_DETAILS_ID(int ADDR_CHANGE_DETAILS_ID) {
		_ADDR_CHANGE_DETAILS_ID = ADDR_CHANGE_DETAILS_ID;
	}

	public String getREQUEST_SUBMIT_TYPE() {
		return _REQUEST_SUBMIT_TYPE;
	}

	public void setREQUEST_SUBMIT_TYPE(String REQUEST_SUBMIT_TYPE) {
		_REQUEST_SUBMIT_TYPE = REQUEST_SUBMIT_TYPE;
	}

	public int getSERVICE_REQUEST_ID() {
		return _SERVICE_REQUEST_ID;
	}

	public void setSERVICE_REQUEST_ID(int SERVICE_REQUEST_ID) {
		_SERVICE_REQUEST_ID = SERVICE_REQUEST_ID;
	}

	public int getSUB_TYPE() {
		return _SUB_TYPE;
	}

	public void setSUB_TYPE(int SUB_TYPE) {
		_SUB_TYPE = SUB_TYPE;
	}

	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public int getSUBMIT_AT_BRANCH() {
		return _SUBMIT_AT_BRANCH;
	}

	public void setSUBMIT_AT_BRANCH(int SUBMIT_AT_BRANCH) {
		_SUBMIT_AT_BRANCH = SUBMIT_AT_BRANCH;
	}

	public Date getPICKUP_DATE() {
		return _PICKUP_DATE;
	}

	public void setPICKUP_DATE(Date PICKUP_DATE) {
		_PICKUP_DATE = PICKUP_DATE;
	}

	public String getPICKUP_TIME() {
		return _PICKUP_TIME;
	}

	public void setPICKUP_TIME(String PICKUP_TIME) {
		_PICKUP_TIME = PICKUP_TIME;
	}

	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;
	}

	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;
	}

	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;
	}

	private int _ADDR_CHANGE_DETAILS_ID;
	private String _REQUEST_SUBMIT_TYPE;
	private int _SERVICE_REQUEST_ID;
	private int _SUB_TYPE;
	private int _ADDRESS_TYPE_ID;
	private int _CUSTOMER_ID;
	private int _SUBMIT_AT_BRANCH;
	private Date _PICKUP_DATE;
	private String _PICKUP_TIME;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
}