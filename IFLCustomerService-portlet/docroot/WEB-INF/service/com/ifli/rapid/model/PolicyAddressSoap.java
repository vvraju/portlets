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
public class PolicyAddressSoap implements Serializable {
	public static PolicyAddressSoap toSoapModel(PolicyAddress model) {
		PolicyAddressSoap soapModel = new PolicyAddressSoap();

		soapModel.setID(model.getID());
		soapModel.setPOLICY_ID(model.getPOLICY_ID());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setCUSTOMER_ADDRESS_ID(model.getCUSTOMER_ADDRESS_ID());
		soapModel.setPINCODE(model.getPINCODE());
		soapModel.setCITY(model.getCITY());
		soapModel.setSTATE(model.getSTATE());
		soapModel.setADDRESS_LINE_1(model.getADDRESS_LINE_1());
		soapModel.setADDRESS_LINE_2(model.getADDRESS_LINE_2());
		soapModel.setADDRESS_LINE_3(model.getADDRESS_LINE_3());

		return soapModel;
	}

	public static PolicyAddressSoap[] toSoapModels(PolicyAddress[] models) {
		PolicyAddressSoap[] soapModels = new PolicyAddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolicyAddressSoap[][] toSoapModels(PolicyAddress[][] models) {
		PolicyAddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolicyAddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolicyAddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolicyAddressSoap[] toSoapModels(List<PolicyAddress> models) {
		List<PolicyAddressSoap> soapModels = new ArrayList<PolicyAddressSoap>(models.size());

		for (PolicyAddress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolicyAddressSoap[soapModels.size()]);
	}

	public PolicyAddressSoap() {
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

	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	public String getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public int getCUSTOMER_ADDRESS_ID() {
		return _CUSTOMER_ADDRESS_ID;
	}

	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_CUSTOMER_ADDRESS_ID = CUSTOMER_ADDRESS_ID;
	}

	public String getPINCODE() {
		return _PINCODE;
	}

	public void setPINCODE(String PINCODE) {
		_PINCODE = PINCODE;
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

	private int _ID;
	private String _POLICY_ID;
	private String _CUSTOMER_ID;
	private int _CUSTOMER_ADDRESS_ID;
	private String _PINCODE;
	private String _CITY;
	private String _STATE;
	private String _ADDRESS_LINE_1;
	private String _ADDRESS_LINE_2;
	private String _ADDRESS_LINE_3;
}