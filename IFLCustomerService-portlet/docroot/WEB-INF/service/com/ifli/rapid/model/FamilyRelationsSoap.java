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
public class FamilyRelationsSoap implements Serializable {
	public static FamilyRelationsSoap toSoapModel(FamilyRelations model) {
		FamilyRelationsSoap soapModel = new FamilyRelationsSoap();

		soapModel.setRELATION_ID(model.getRELATION_ID());
		soapModel.setRELATION_NAME(model.getRELATION_NAME());

		return soapModel;
	}

	public static FamilyRelationsSoap[] toSoapModels(FamilyRelations[] models) {
		FamilyRelationsSoap[] soapModels = new FamilyRelationsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FamilyRelationsSoap[][] toSoapModels(
		FamilyRelations[][] models) {
		FamilyRelationsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FamilyRelationsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FamilyRelationsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FamilyRelationsSoap[] toSoapModels(
		List<FamilyRelations> models) {
		List<FamilyRelationsSoap> soapModels = new ArrayList<FamilyRelationsSoap>(models.size());

		for (FamilyRelations model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FamilyRelationsSoap[soapModels.size()]);
	}

	public FamilyRelationsSoap() {
	}

	public int getPrimaryKey() {
		return _RELATION_ID;
	}

	public void setPrimaryKey(int pk) {
		setRELATION_ID(pk);
	}

	public int getRELATION_ID() {
		return _RELATION_ID;
	}

	public void setRELATION_ID(int RELATION_ID) {
		_RELATION_ID = RELATION_ID;
	}

	public String getRELATION_NAME() {
		return _RELATION_NAME;
	}

	public void setRELATION_NAME(String RELATION_NAME) {
		_RELATION_NAME = RELATION_NAME;
	}

	private int _RELATION_ID;
	private String _RELATION_NAME;
}