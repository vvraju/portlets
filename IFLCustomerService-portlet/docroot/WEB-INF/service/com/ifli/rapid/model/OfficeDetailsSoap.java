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
public class OfficeDetailsSoap implements Serializable {
	public static OfficeDetailsSoap toSoapModel(OfficeDetails model) {
		OfficeDetailsSoap soapModel = new OfficeDetailsSoap();

		soapModel.setOFFICE_ID(model.getOFFICE_ID());
		soapModel.setOFFICE_NAME(model.getOFFICE_NAME());

		return soapModel;
	}

	public static OfficeDetailsSoap[] toSoapModels(OfficeDetails[] models) {
		OfficeDetailsSoap[] soapModels = new OfficeDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OfficeDetailsSoap[][] toSoapModels(OfficeDetails[][] models) {
		OfficeDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OfficeDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OfficeDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OfficeDetailsSoap[] toSoapModels(List<OfficeDetails> models) {
		List<OfficeDetailsSoap> soapModels = new ArrayList<OfficeDetailsSoap>(models.size());

		for (OfficeDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OfficeDetailsSoap[soapModels.size()]);
	}

	public OfficeDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _OFFICE_ID;
	}

	public void setPrimaryKey(int pk) {
		setOFFICE_ID(pk);
	}

	public int getOFFICE_ID() {
		return _OFFICE_ID;
	}

	public void setOFFICE_ID(int OFFICE_ID) {
		_OFFICE_ID = OFFICE_ID;
	}

	public String getOFFICE_NAME() {
		return _OFFICE_NAME;
	}

	public void setOFFICE_NAME(String OFFICE_NAME) {
		_OFFICE_NAME = OFFICE_NAME;
	}

	private int _OFFICE_ID;
	private String _OFFICE_NAME;
}