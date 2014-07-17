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
public class NavHistorySoap implements Serializable {
	public static NavHistorySoap toSoapModel(NavHistory model) {
		NavHistorySoap soapModel = new NavHistorySoap();

		soapModel.setNAV_HISTORY_ID(model.getNAV_HISTORY_ID());
		soapModel.setDATE(model.getDATE());
		soapModel.setNAV(model.getNAV());
		soapModel.setSALE_PRICE(model.getSALE_PRICE());
		soapModel.setPURCHASE_PRICE(model.getPURCHASE_PRICE());
		soapModel.setFUND_CODE(model.getFUND_CODE());
		soapModel.setFUND_NAME(model.getFUND_NAME());

		return soapModel;
	}

	public static NavHistorySoap[] toSoapModels(NavHistory[] models) {
		NavHistorySoap[] soapModels = new NavHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NavHistorySoap[][] toSoapModels(NavHistory[][] models) {
		NavHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NavHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new NavHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NavHistorySoap[] toSoapModels(List<NavHistory> models) {
		List<NavHistorySoap> soapModels = new ArrayList<NavHistorySoap>(models.size());

		for (NavHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NavHistorySoap[soapModels.size()]);
	}

	public NavHistorySoap() {
	}

	public long getPrimaryKey() {
		return _NAV_HISTORY_ID;
	}

	public void setPrimaryKey(long pk) {
		setNAV_HISTORY_ID(pk);
	}

	public long getNAV_HISTORY_ID() {
		return _NAV_HISTORY_ID;
	}

	public void setNAV_HISTORY_ID(long NAV_HISTORY_ID) {
		_NAV_HISTORY_ID = NAV_HISTORY_ID;
	}

	public Date getDATE() {
		return _DATE;
	}

	public void setDATE(Date DATE) {
		_DATE = DATE;
	}

	public double getNAV() {
		return _NAV;
	}

	public void setNAV(double NAV) {
		_NAV = NAV;
	}

	public double getSALE_PRICE() {
		return _SALE_PRICE;
	}

	public void setSALE_PRICE(double SALE_PRICE) {
		_SALE_PRICE = SALE_PRICE;
	}

	public double getPURCHASE_PRICE() {
		return _PURCHASE_PRICE;
	}

	public void setPURCHASE_PRICE(double PURCHASE_PRICE) {
		_PURCHASE_PRICE = PURCHASE_PRICE;
	}

	public String getFUND_CODE() {
		return _FUND_CODE;
	}

	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;
	}

	public String getFUND_NAME() {
		return _FUND_NAME;
	}

	public void setFUND_NAME(String FUND_NAME) {
		_FUND_NAME = FUND_NAME;
	}

	private long _NAV_HISTORY_ID;
	private Date _DATE;
	private double _NAV;
	private double _SALE_PRICE;
	private double _PURCHASE_PRICE;
	private String _FUND_CODE;
	private String _FUND_NAME;
}