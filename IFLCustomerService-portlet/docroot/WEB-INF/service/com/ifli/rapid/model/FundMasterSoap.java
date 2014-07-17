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
public class FundMasterSoap implements Serializable {
	public static FundMasterSoap toSoapModel(FundMaster model) {
		FundMasterSoap soapModel = new FundMasterSoap();

		soapModel.setFUND_ID(model.getFUND_ID());
		soapModel.setFUND_NAME(model.getFUND_NAME());
		soapModel.setFUND_CODE(model.getFUND_CODE());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());

		return soapModel;
	}

	public static FundMasterSoap[] toSoapModels(FundMaster[] models) {
		FundMasterSoap[] soapModels = new FundMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FundMasterSoap[][] toSoapModels(FundMaster[][] models) {
		FundMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FundMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FundMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FundMasterSoap[] toSoapModels(List<FundMaster> models) {
		List<FundMasterSoap> soapModels = new ArrayList<FundMasterSoap>(models.size());

		for (FundMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FundMasterSoap[soapModels.size()]);
	}

	public FundMasterSoap() {
	}

	public int getPrimaryKey() {
		return _FUND_ID;
	}

	public void setPrimaryKey(int pk) {
		setFUND_ID(pk);
	}

	public int getFUND_ID() {
		return _FUND_ID;
	}

	public void setFUND_ID(int FUND_ID) {
		_FUND_ID = FUND_ID;
	}

	public String getFUND_NAME() {
		return _FUND_NAME;
	}

	public void setFUND_NAME(String FUND_NAME) {
		_FUND_NAME = FUND_NAME;
	}

	public String getFUND_CODE() {
		return _FUND_CODE;
	}

	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;
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

	private int _FUND_ID;
	private String _FUND_NAME;
	private String _FUND_CODE;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
}