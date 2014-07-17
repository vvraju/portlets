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
public class Recommended_ProductsSoap implements Serializable {
	public static Recommended_ProductsSoap toSoapModel(
		Recommended_Products model) {
		Recommended_ProductsSoap soapModel = new Recommended_ProductsSoap();

		soapModel.setPRODUCT_ID(model.getPRODUCT_ID());
		soapModel.setPRODUCT_NAME(model.getPRODUCT_NAME());
		soapModel.setIMG_URL(model.getIMG_URL());

		return soapModel;
	}

	public static Recommended_ProductsSoap[] toSoapModels(
		Recommended_Products[] models) {
		Recommended_ProductsSoap[] soapModels = new Recommended_ProductsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Recommended_ProductsSoap[][] toSoapModels(
		Recommended_Products[][] models) {
		Recommended_ProductsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Recommended_ProductsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Recommended_ProductsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Recommended_ProductsSoap[] toSoapModels(
		List<Recommended_Products> models) {
		List<Recommended_ProductsSoap> soapModels = new ArrayList<Recommended_ProductsSoap>(models.size());

		for (Recommended_Products model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Recommended_ProductsSoap[soapModels.size()]);
	}

	public Recommended_ProductsSoap() {
	}

	public int getPrimaryKey() {
		return _PRODUCT_ID;
	}

	public void setPrimaryKey(int pk) {
		setPRODUCT_ID(pk);
	}

	public int getPRODUCT_ID() {
		return _PRODUCT_ID;
	}

	public void setPRODUCT_ID(int PRODUCT_ID) {
		_PRODUCT_ID = PRODUCT_ID;
	}

	public String getPRODUCT_NAME() {
		return _PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String PRODUCT_NAME) {
		_PRODUCT_NAME = PRODUCT_NAME;
	}

	public String getIMG_URL() {
		return _IMG_URL;
	}

	public void setIMG_URL(String IMG_URL) {
		_IMG_URL = IMG_URL;
	}

	private int _PRODUCT_ID;
	private String _PRODUCT_NAME;
	private String _IMG_URL;
}