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
public class POLICY_DOC_TYPESSoap implements Serializable {
	public static POLICY_DOC_TYPESSoap toSoapModel(POLICY_DOC_TYPES model) {
		POLICY_DOC_TYPESSoap soapModel = new POLICY_DOC_TYPESSoap();

		soapModel.setID(model.getID());
		soapModel.setDOC_NAME(model.getDOC_NAME());

		return soapModel;
	}

	public static POLICY_DOC_TYPESSoap[] toSoapModels(POLICY_DOC_TYPES[] models) {
		POLICY_DOC_TYPESSoap[] soapModels = new POLICY_DOC_TYPESSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static POLICY_DOC_TYPESSoap[][] toSoapModels(
		POLICY_DOC_TYPES[][] models) {
		POLICY_DOC_TYPESSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new POLICY_DOC_TYPESSoap[models.length][models[0].length];
		}
		else {
			soapModels = new POLICY_DOC_TYPESSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static POLICY_DOC_TYPESSoap[] toSoapModels(
		List<POLICY_DOC_TYPES> models) {
		List<POLICY_DOC_TYPESSoap> soapModels = new ArrayList<POLICY_DOC_TYPESSoap>(models.size());

		for (POLICY_DOC_TYPES model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new POLICY_DOC_TYPESSoap[soapModels.size()]);
	}

	public POLICY_DOC_TYPESSoap() {
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

	public String getDOC_NAME() {
		return _DOC_NAME;
	}

	public void setDOC_NAME(String DOC_NAME) {
		_DOC_NAME = DOC_NAME;
	}

	private int _ID;
	private String _DOC_NAME;
}