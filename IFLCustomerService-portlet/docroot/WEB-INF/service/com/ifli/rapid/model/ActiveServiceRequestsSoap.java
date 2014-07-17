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
 * This class is used by SOAP remote services, specifically {@link com.ifli.rapid.service.http.ActiveServiceRequestsServiceSoap}.
 *
 * @author Satya Kola
 * @see com.ifli.rapid.service.http.ActiveServiceRequestsServiceSoap
 * @generated
 */
public class ActiveServiceRequestsSoap implements Serializable {
	public static ActiveServiceRequestsSoap toSoapModel(
		ActiveServiceRequests model) {
		ActiveServiceRequestsSoap soapModel = new ActiveServiceRequestsSoap();

		soapModel.setQRC_ASR_ID(model.getQRC_ASR_ID());
		soapModel.setTYPE_ID(model.getTYPE_ID());
		soapModel.setSUB_TYPE_ID(model.getSUB_TYPE_ID());
		soapModel.setASSIGNED_TO(model.getASSIGNED_TO());
		soapModel.setHANDLED_BY(model.getHANDLED_BY());
		soapModel.setSTATUS_ID(model.getSTATUS_ID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setCUST_SR_NUMBER(model.getCUST_SR_NUMBER());
		soapModel.setADDITIONAL_DATA_XML(model.getADDITIONAL_DATA_XML());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());

		return soapModel;
	}

	public static ActiveServiceRequestsSoap[] toSoapModels(
		ActiveServiceRequests[] models) {
		ActiveServiceRequestsSoap[] soapModels = new ActiveServiceRequestsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActiveServiceRequestsSoap[][] toSoapModels(
		ActiveServiceRequests[][] models) {
		ActiveServiceRequestsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActiveServiceRequestsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActiveServiceRequestsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActiveServiceRequestsSoap[] toSoapModels(
		List<ActiveServiceRequests> models) {
		List<ActiveServiceRequestsSoap> soapModels = new ArrayList<ActiveServiceRequestsSoap>(models.size());

		for (ActiveServiceRequests model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActiveServiceRequestsSoap[soapModels.size()]);
	}

	public ActiveServiceRequestsSoap() {
	}

	public int getPrimaryKey() {
		return _QRC_ASR_ID;
	}

	public void setPrimaryKey(int pk) {
		setQRC_ASR_ID(pk);
	}

	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;
	}

	public int getTYPE_ID() {
		return _TYPE_ID;
	}

	public void setTYPE_ID(int TYPE_ID) {
		_TYPE_ID = TYPE_ID;
	}

	public int getSUB_TYPE_ID() {
		return _SUB_TYPE_ID;
	}

	public void setSUB_TYPE_ID(int SUB_TYPE_ID) {
		_SUB_TYPE_ID = SUB_TYPE_ID;
	}

	public int getASSIGNED_TO() {
		return _ASSIGNED_TO;
	}

	public void setASSIGNED_TO(int ASSIGNED_TO) {
		_ASSIGNED_TO = ASSIGNED_TO;
	}

	public int getHANDLED_BY() {
		return _HANDLED_BY;
	}

	public void setHANDLED_BY(int HANDLED_BY) {
		_HANDLED_BY = HANDLED_BY;
	}

	public int getSTATUS_ID() {
		return _STATUS_ID;
	}

	public void setSTATUS_ID(int STATUS_ID) {
		_STATUS_ID = STATUS_ID;
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public String getCUST_SR_NUMBER() {
		return _CUST_SR_NUMBER;
	}

	public void setCUST_SR_NUMBER(String CUST_SR_NUMBER) {
		_CUST_SR_NUMBER = CUST_SR_NUMBER;
	}

	public String getADDITIONAL_DATA_XML() {
		return _ADDITIONAL_DATA_XML;
	}

	public void setADDITIONAL_DATA_XML(String ADDITIONAL_DATA_XML) {
		_ADDITIONAL_DATA_XML = ADDITIONAL_DATA_XML;
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

	private int _QRC_ASR_ID;
	private int _TYPE_ID;
	private int _SUB_TYPE_ID;
	private int _ASSIGNED_TO;
	private int _HANDLED_BY;
	private int _STATUS_ID;
	private int _CUSTOMER_ID;
	private String _CUST_SR_NUMBER;
	private String _ADDITIONAL_DATA_XML;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
}