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
public class CustomerFamilyDetailsSoap implements Serializable {
	public static CustomerFamilyDetailsSoap toSoapModel(
		CustomerFamilyDetails model) {
		CustomerFamilyDetailsSoap soapModel = new CustomerFamilyDetailsSoap();

		soapModel.setCUSTOMER_FAMILY_ID(model.getCUSTOMER_FAMILY_ID());
		soapModel.setPERSON_NAME(model.getPERSON_NAME());
		soapModel.setRELATION(model.getRELATION());
		soapModel.setDEPENDENT(model.getDEPENDENT());
		soapModel.setAGE(model.getAGE());
		soapModel.setCUSTOMER_ID(model.getCUSTOMER_ID());
		soapModel.setADDED_BY(model.getADDED_BY());
		soapModel.setADDED_DATE(model.getADDED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());

		return soapModel;
	}

	public static CustomerFamilyDetailsSoap[] toSoapModels(
		CustomerFamilyDetails[] models) {
		CustomerFamilyDetailsSoap[] soapModels = new CustomerFamilyDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomerFamilyDetailsSoap[][] toSoapModels(
		CustomerFamilyDetails[][] models) {
		CustomerFamilyDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomerFamilyDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomerFamilyDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomerFamilyDetailsSoap[] toSoapModels(
		List<CustomerFamilyDetails> models) {
		List<CustomerFamilyDetailsSoap> soapModels = new ArrayList<CustomerFamilyDetailsSoap>(models.size());

		for (CustomerFamilyDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomerFamilyDetailsSoap[soapModels.size()]);
	}

	public CustomerFamilyDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _CUSTOMER_FAMILY_ID;
	}

	public void setPrimaryKey(int pk) {
		setCUSTOMER_FAMILY_ID(pk);
	}

	public int getCUSTOMER_FAMILY_ID() {
		return _CUSTOMER_FAMILY_ID;
	}

	public void setCUSTOMER_FAMILY_ID(int CUSTOMER_FAMILY_ID) {
		_CUSTOMER_FAMILY_ID = CUSTOMER_FAMILY_ID;
	}

	public String getPERSON_NAME() {
		return _PERSON_NAME;
	}

	public void setPERSON_NAME(String PERSON_NAME) {
		_PERSON_NAME = PERSON_NAME;
	}

	public String getRELATION() {
		return _RELATION;
	}

	public void setRELATION(String RELATION) {
		_RELATION = RELATION;
	}

	public String getDEPENDENT() {
		return _DEPENDENT;
	}

	public void setDEPENDENT(String DEPENDENT) {
		_DEPENDENT = DEPENDENT;
	}

	public int getAGE() {
		return _AGE;
	}

	public void setAGE(int AGE) {
		_AGE = AGE;
	}

	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	public String getADDED_BY() {
		return _ADDED_BY;
	}

	public void setADDED_BY(String ADDED_BY) {
		_ADDED_BY = ADDED_BY;
	}

	public Date getADDED_DATE() {
		return _ADDED_DATE;
	}

	public void setADDED_DATE(Date ADDED_DATE) {
		_ADDED_DATE = ADDED_DATE;
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

	private int _CUSTOMER_FAMILY_ID;
	private String _PERSON_NAME;
	private String _RELATION;
	private String _DEPENDENT;
	private int _AGE;
	private int _CUSTOMER_ID;
	private String _ADDED_BY;
	private Date _ADDED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
}