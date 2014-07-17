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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class BranchDetailsSoap implements Serializable {
	public static BranchDetailsSoap toSoapModel(BranchDetails model) {
		BranchDetailsSoap soapModel = new BranchDetailsSoap();

		soapModel.setBRANCH_ID(model.getBRANCH_ID());
		soapModel.setLOCATION_ID(model.getLOCATION_ID());
		soapModel.setBRANCH_NAME(model.getBRANCH_NAME());
		soapModel.setBRANCH_OPENING_TIME(model.getBRANCH_OPENING_TIME());
		soapModel.setBRANCH_CLOSING_TIME(model.getBRANCH_CLOSING_TIME());
		soapModel.setADDRESS_FIRST_LINE(model.getADDRESS_FIRST_LINE());
		soapModel.setADDRESS_SECOND_LINE(model.getADDRESS_SECOND_LINE());
		soapModel.setCITY(model.getCITY());
		soapModel.setSTATE(model.getSTATE());
		soapModel.setPIN(model.getPIN());
		soapModel.setPRIMARY_CONTACT_NO(model.getPRIMARY_CONTACT_NO());
		soapModel.setOTHER_CONTACT_NO(model.getOTHER_CONTACT_NO());
		soapModel.setFAX_NUMBER(model.getFAX_NUMBER());
		soapModel.setBRANCH_CODE(model.getBRANCH_CODE());
		soapModel.setWORK_TIMINGS(model.getWORK_TIMINGS());

		return soapModel;
	}

	public static BranchDetailsSoap[] toSoapModels(BranchDetails[] models) {
		BranchDetailsSoap[] soapModels = new BranchDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BranchDetailsSoap[][] toSoapModels(BranchDetails[][] models) {
		BranchDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BranchDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BranchDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BranchDetailsSoap[] toSoapModels(List<BranchDetails> models) {
		List<BranchDetailsSoap> soapModels = new ArrayList<BranchDetailsSoap>(models.size());

		for (BranchDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BranchDetailsSoap[soapModels.size()]);
	}

	public BranchDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _BRANCH_ID;
	}

	public void setPrimaryKey(int pk) {
		setBRANCH_ID(pk);
	}

	public int getBRANCH_ID() {
		return _BRANCH_ID;
	}

	public void setBRANCH_ID(int BRANCH_ID) {
		_BRANCH_ID = BRANCH_ID;
	}

	public int getLOCATION_ID() {
		return _LOCATION_ID;
	}

	public void setLOCATION_ID(int LOCATION_ID) {
		_LOCATION_ID = LOCATION_ID;
	}

	public String getBRANCH_NAME() {
		return _BRANCH_NAME;
	}

	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;
	}

	public String getBRANCH_OPENING_TIME() {
		return _BRANCH_OPENING_TIME;
	}

	public void setBRANCH_OPENING_TIME(String BRANCH_OPENING_TIME) {
		_BRANCH_OPENING_TIME = BRANCH_OPENING_TIME;
	}

	public String getBRANCH_CLOSING_TIME() {
		return _BRANCH_CLOSING_TIME;
	}

	public void setBRANCH_CLOSING_TIME(String BRANCH_CLOSING_TIME) {
		_BRANCH_CLOSING_TIME = BRANCH_CLOSING_TIME;
	}

	public String getADDRESS_FIRST_LINE() {
		return _ADDRESS_FIRST_LINE;
	}

	public void setADDRESS_FIRST_LINE(String ADDRESS_FIRST_LINE) {
		_ADDRESS_FIRST_LINE = ADDRESS_FIRST_LINE;
	}

	public String getADDRESS_SECOND_LINE() {
		return _ADDRESS_SECOND_LINE;
	}

	public void setADDRESS_SECOND_LINE(String ADDRESS_SECOND_LINE) {
		_ADDRESS_SECOND_LINE = ADDRESS_SECOND_LINE;
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

	public String getPIN() {
		return _PIN;
	}

	public void setPIN(String PIN) {
		_PIN = PIN;
	}

	public String getPRIMARY_CONTACT_NO() {
		return _PRIMARY_CONTACT_NO;
	}

	public void setPRIMARY_CONTACT_NO(String PRIMARY_CONTACT_NO) {
		_PRIMARY_CONTACT_NO = PRIMARY_CONTACT_NO;
	}

	public String getOTHER_CONTACT_NO() {
		return _OTHER_CONTACT_NO;
	}

	public void setOTHER_CONTACT_NO(String OTHER_CONTACT_NO) {
		_OTHER_CONTACT_NO = OTHER_CONTACT_NO;
	}

	public String getFAX_NUMBER() {
		return _FAX_NUMBER;
	}

	public void setFAX_NUMBER(String FAX_NUMBER) {
		_FAX_NUMBER = FAX_NUMBER;
	}

	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;
	}

	public String getWORK_TIMINGS() {
		return _WORK_TIMINGS;
	}

	public void setWORK_TIMINGS(String WORK_TIMINGS) {
		_WORK_TIMINGS = WORK_TIMINGS;
	}

	private int _BRANCH_ID;
	private int _LOCATION_ID;
	private String _BRANCH_NAME;
	private String _BRANCH_OPENING_TIME;
	private String _BRANCH_CLOSING_TIME;
	private String _ADDRESS_FIRST_LINE;
	private String _ADDRESS_SECOND_LINE;
	private String _CITY;
	private String _STATE;
	private String _PIN;
	private String _PRIMARY_CONTACT_NO;
	private String _OTHER_CONTACT_NO;
	private String _FAX_NUMBER;
	private String _BRANCH_CODE;
	private String _WORK_TIMINGS;
}