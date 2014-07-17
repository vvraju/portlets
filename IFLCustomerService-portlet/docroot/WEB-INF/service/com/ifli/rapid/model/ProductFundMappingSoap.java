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
public class ProductFundMappingSoap implements Serializable {
	public static ProductFundMappingSoap toSoapModel(ProductFundMapping model) {
		ProductFundMappingSoap soapModel = new ProductFundMappingSoap();

		soapModel.setID(model.getID());
		soapModel.setPRODUCT_CODE(model.getPRODUCT_CODE());
		soapModel.setFUND_CODE(model.getFUND_CODE());

		return soapModel;
	}

	public static ProductFundMappingSoap[] toSoapModels(
		ProductFundMapping[] models) {
		ProductFundMappingSoap[] soapModels = new ProductFundMappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProductFundMappingSoap[][] toSoapModels(
		ProductFundMapping[][] models) {
		ProductFundMappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProductFundMappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProductFundMappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProductFundMappingSoap[] toSoapModels(
		List<ProductFundMapping> models) {
		List<ProductFundMappingSoap> soapModels = new ArrayList<ProductFundMappingSoap>(models.size());

		for (ProductFundMapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProductFundMappingSoap[soapModels.size()]);
	}

	public ProductFundMappingSoap() {
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

	public String getPRODUCT_CODE() {
		return _PRODUCT_CODE;
	}

	public void setPRODUCT_CODE(String PRODUCT_CODE) {
		_PRODUCT_CODE = PRODUCT_CODE;
	}

	public String getFUND_CODE() {
		return _FUND_CODE;
	}

	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;
	}

	private int _ID;
	private String _PRODUCT_CODE;
	private String _FUND_CODE;
}