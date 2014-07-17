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
public class PremiumFrequencyMasterSoap implements Serializable {
	public static PremiumFrequencyMasterSoap toSoapModel(
		PremiumFrequencyMaster model) {
		PremiumFrequencyMasterSoap soapModel = new PremiumFrequencyMasterSoap();

		soapModel.setPremiumFrequencyId(model.getPremiumFrequencyId());
		soapModel.setPremiumFrequencyDescription(model.getPremiumFrequencyDescription());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPriority(model.getPriority());

		return soapModel;
	}

	public static PremiumFrequencyMasterSoap[] toSoapModels(
		PremiumFrequencyMaster[] models) {
		PremiumFrequencyMasterSoap[] soapModels = new PremiumFrequencyMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PremiumFrequencyMasterSoap[][] toSoapModels(
		PremiumFrequencyMaster[][] models) {
		PremiumFrequencyMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PremiumFrequencyMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PremiumFrequencyMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PremiumFrequencyMasterSoap[] toSoapModels(
		List<PremiumFrequencyMaster> models) {
		List<PremiumFrequencyMasterSoap> soapModels = new ArrayList<PremiumFrequencyMasterSoap>(models.size());

		for (PremiumFrequencyMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PremiumFrequencyMasterSoap[soapModels.size()]);
	}

	public PremiumFrequencyMasterSoap() {
	}

	public String getPrimaryKey() {
		return _PremiumFrequencyId;
	}

	public void setPrimaryKey(String pk) {
		setPremiumFrequencyId(pk);
	}

	public String getPremiumFrequencyId() {
		return _PremiumFrequencyId;
	}

	public void setPremiumFrequencyId(String PremiumFrequencyId) {
		_PremiumFrequencyId = PremiumFrequencyId;
	}

	public String getPremiumFrequencyDescription() {
		return _PremiumFrequencyDescription;
	}

	public void setPremiumFrequencyDescription(
		String PremiumFrequencyDescription) {
		_PremiumFrequencyDescription = PremiumFrequencyDescription;
	}

	public boolean getIsActive() {
		return _IsActive;
	}

	public boolean isIsActive() {
		return _IsActive;
	}

	public void setIsActive(boolean IsActive) {
		_IsActive = IsActive;
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

	private String _PremiumFrequencyId;
	private String _PremiumFrequencyDescription;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
}