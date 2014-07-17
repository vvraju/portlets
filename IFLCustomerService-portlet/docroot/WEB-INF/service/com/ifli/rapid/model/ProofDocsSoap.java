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
public class ProofDocsSoap implements Serializable {
	public static ProofDocsSoap toSoapModel(ProofDocs model) {
		ProofDocsSoap soapModel = new ProofDocsSoap();

		soapModel.setID(model.getID());
		soapModel.setDOC_TYPE(model.getDOC_TYPE());
		soapModel.setDOC_NAME(model.getDOC_NAME());

		return soapModel;
	}

	public static ProofDocsSoap[] toSoapModels(ProofDocs[] models) {
		ProofDocsSoap[] soapModels = new ProofDocsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProofDocsSoap[][] toSoapModels(ProofDocs[][] models) {
		ProofDocsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProofDocsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProofDocsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProofDocsSoap[] toSoapModels(List<ProofDocs> models) {
		List<ProofDocsSoap> soapModels = new ArrayList<ProofDocsSoap>(models.size());

		for (ProofDocs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProofDocsSoap[soapModels.size()]);
	}

	public ProofDocsSoap() {
	}

	public long getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(long pk) {
		setID(pk);
	}

	public long getID() {
		return _ID;
	}

	public void setID(long ID) {
		_ID = ID;
	}

	public String getDOC_TYPE() {
		return _DOC_TYPE;
	}

	public void setDOC_TYPE(String DOC_TYPE) {
		_DOC_TYPE = DOC_TYPE;
	}

	public String getDOC_NAME() {
		return _DOC_NAME;
	}

	public void setDOC_NAME(String DOC_NAME) {
		_DOC_NAME = DOC_NAME;
	}

	private long _ID;
	private String _DOC_TYPE;
	private String _DOC_NAME;
}