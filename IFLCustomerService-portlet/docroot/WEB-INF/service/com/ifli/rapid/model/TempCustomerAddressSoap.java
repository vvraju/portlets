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
public class TempCustomerAddressSoap implements Serializable {
	public static TempCustomerAddressSoap toSoapModel(TempCustomerAddress model) {
		TempCustomerAddressSoap soapModel = new TempCustomerAddressSoap();

		soapModel.setCUSTOMER_ADDRESS_ID(model.getCUSTOMER_ADDRESS_ID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setADDRESS_LINE_1(model.getADDRESS_LINE_1());
		soapModel.setADDRESS_LINE_2(model.getADDRESS_LINE_2());
		soapModel.setADDRESS_LINE_3(model.getADDRESS_LINE_3());
		soapModel.setCHANGE_REQUEST_TYPE(model.getCHANGE_REQUEST_TYPE());
		soapModel.setCITY(model.getCITY());
		soapModel.setSTATE(model.getSTATE());
		soapModel.setCITY_ID(model.getCITY_ID());
		soapModel.setSTATE_ID(model.getSTATE_ID());
		soapModel.setPIN_CODE(model.getPIN_CODE());
		soapModel.setCHANGE_REQUEST_FOR(model.getCHANGE_REQUEST_FOR());
		soapModel.setADDRESS_TYPE_ID(model.getADDRESS_TYPE_ID());
		soapModel.setADDR_STATUS(model.getADDR_STATUS());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setQRC_ASR_ID(model.getQRC_ASR_ID());

		return soapModel;
	}

	public static TempCustomerAddressSoap[] toSoapModels(
		TempCustomerAddress[] models) {
		TempCustomerAddressSoap[] soapModels = new TempCustomerAddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempCustomerAddressSoap[][] toSoapModels(
		TempCustomerAddress[][] models) {
		TempCustomerAddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempCustomerAddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempCustomerAddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempCustomerAddressSoap[] toSoapModels(
		List<TempCustomerAddress> models) {
		List<TempCustomerAddressSoap> soapModels = new ArrayList<TempCustomerAddressSoap>(models.size());

		for (TempCustomerAddress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempCustomerAddressSoap[soapModels.size()]);
	}

	public TempCustomerAddressSoap() {
	}

	public int getPrimaryKey() {
		return _CUSTOMER_ADDRESS_ID;
	}

	public void setPrimaryKey(int pk) {
		setCUSTOMER_ADDRESS_ID(pk);
	}

	public int getCUSTOMER_ADDRESS_ID() {
		return _CUSTOMER_ADDRESS_ID;
	}

	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_CUSTOMER_ADDRESS_ID = CUSTOMER_ADDRESS_ID;
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public String getADDRESS_LINE_1() {
		return _ADDRESS_LINE_1;
	}

	public void setADDRESS_LINE_1(String ADDRESS_LINE_1) {
		_ADDRESS_LINE_1 = ADDRESS_LINE_1;
	}

	public String getADDRESS_LINE_2() {
		return _ADDRESS_LINE_2;
	}

	public void setADDRESS_LINE_2(String ADDRESS_LINE_2) {
		_ADDRESS_LINE_2 = ADDRESS_LINE_2;
	}

	public String getADDRESS_LINE_3() {
		return _ADDRESS_LINE_3;
	}

	public void setADDRESS_LINE_3(String ADDRESS_LINE_3) {
		_ADDRESS_LINE_3 = ADDRESS_LINE_3;
	}

	public String getCHANGE_REQUEST_TYPE() {
		return _CHANGE_REQUEST_TYPE;
	}

	public void setCHANGE_REQUEST_TYPE(String CHANGE_REQUEST_TYPE) {
		_CHANGE_REQUEST_TYPE = CHANGE_REQUEST_TYPE;
	}

	public String getCITY() {
		return _CITY;
	}

	public void setCITY(String CITY) {
		_CITY = CITY;
	}

	public String getSTATE() {
		return _STATE;
	}

	public void setSTATE(String STATE) {
		_STATE = STATE;
	}

	public int getCITY_ID() {
		return _CITY_ID;
	}

	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;
	}

	public int getSTATE_ID() {
		return _STATE_ID;
	}

	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;
	}

	public String getPIN_CODE() {
		return _PIN_CODE;
	}

	public void setPIN_CODE(String PIN_CODE) {
		_PIN_CODE = PIN_CODE;
	}

	public int getCHANGE_REQUEST_FOR() {
		return _CHANGE_REQUEST_FOR;
	}

	public void setCHANGE_REQUEST_FOR(int CHANGE_REQUEST_FOR) {
		_CHANGE_REQUEST_FOR = CHANGE_REQUEST_FOR;
	}

	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;
	}

	public String getADDR_STATUS() {
		return _ADDR_STATUS;
	}

	public void setADDR_STATUS(String ADDR_STATUS) {
		_ADDR_STATUS = ADDR_STATUS;
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

	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;
	}

	private int _CUSTOMER_ADDRESS_ID;
	private int _CUSTOMER_ID;
	private String _ADDRESS_LINE_1;
	private String _ADDRESS_LINE_2;
	private String _ADDRESS_LINE_3;
	private String _CHANGE_REQUEST_TYPE;
	private String _CITY;
	private String _STATE;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _PIN_CODE;
	private int _CHANGE_REQUEST_FOR;
	private int _ADDRESS_TYPE_ID;
	private String _ADDR_STATUS;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private int _QRC_ASR_ID;
}