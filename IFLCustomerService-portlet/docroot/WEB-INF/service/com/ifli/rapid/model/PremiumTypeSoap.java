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
public class PremiumTypeSoap implements Serializable {
	public static PremiumTypeSoap toSoapModel(PremiumType model) {
		PremiumTypeSoap soapModel = new PremiumTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setActive(model.getActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPriority(model.getPriority());

		return soapModel;
	}

	public static PremiumTypeSoap[] toSoapModels(PremiumType[] models) {
		PremiumTypeSoap[] soapModels = new PremiumTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PremiumTypeSoap[][] toSoapModels(PremiumType[][] models) {
		PremiumTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PremiumTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PremiumTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PremiumTypeSoap[] toSoapModels(List<PremiumType> models) {
		List<PremiumTypeSoap> soapModels = new ArrayList<PremiumTypeSoap>(models.size());

		for (PremiumType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PremiumTypeSoap[soapModels.size()]);
	}

	public PremiumTypeSoap() {
	}

	public String getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(String pk) {
		setId(pk);
	}

	public String getId() {
		return _Id;
	}

	public void setId(String Id) {
		_Id = Id;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public boolean getActive() {
		return _Active;
	}

	public boolean isActive() {
		return _Active;
	}

	public void setActive(boolean Active) {
		_Active = Active;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public Date getCreatedDate() {
		return _CreatedDate;
	}

	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public int getPriority() {
		return _Priority;
	}

	public void setPriority(int Priority) {
		_Priority = Priority;
	}

	private String _Id;
	private String _Name;
	private boolean _Active;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
}