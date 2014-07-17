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

package com.ifl.rapid.customer.model;

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
public class Config_Mst_GenericMasterSoap implements Serializable {
	public static Config_Mst_GenericMasterSoap toSoapModel(
		Config_Mst_GenericMaster model) {
		Config_Mst_GenericMasterSoap soapModel = new Config_Mst_GenericMasterSoap();

		soapModel.setGenericMasterId(model.getGenericMasterId());
		soapModel.setMasterType(model.getMasterType());
		soapModel.setMasterId(model.getMasterId());
		soapModel.setMasterKey(model.getMasterKey());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static Config_Mst_GenericMasterSoap[] toSoapModels(
		Config_Mst_GenericMaster[] models) {
		Config_Mst_GenericMasterSoap[] soapModels = new Config_Mst_GenericMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Config_Mst_GenericMasterSoap[][] toSoapModels(
		Config_Mst_GenericMaster[][] models) {
		Config_Mst_GenericMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Config_Mst_GenericMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Config_Mst_GenericMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Config_Mst_GenericMasterSoap[] toSoapModels(
		List<Config_Mst_GenericMaster> models) {
		List<Config_Mst_GenericMasterSoap> soapModels = new ArrayList<Config_Mst_GenericMasterSoap>(models.size());

		for (Config_Mst_GenericMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Config_Mst_GenericMasterSoap[soapModels.size()]);
	}

	public Config_Mst_GenericMasterSoap() {
	}

	public int getPrimaryKey() {
		return _GenericMasterId;
	}

	public void setPrimaryKey(int pk) {
		setGenericMasterId(pk);
	}

	public int getGenericMasterId() {
		return _GenericMasterId;
	}

	public void setGenericMasterId(int GenericMasterId) {
		_GenericMasterId = GenericMasterId;
	}

	public String getMasterType() {
		return _MasterType;
	}

	public void setMasterType(String MasterType) {
		_MasterType = MasterType;
	}

	public int getMasterId() {
		return _MasterId;
	}

	public void setMasterId(int MasterId) {
		_MasterId = MasterId;
	}

	public String getMasterKey() {
		return _MasterKey;
	}

	public void setMasterKey(String MasterKey) {
		_MasterKey = MasterKey;
	}

	public String getIsActive() {
		return _IsActive;
	}

	public void setIsActive(String IsActive) {
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

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	private int _GenericMasterId;
	private String _MasterType;
	private int _MasterId;
	private String _MasterKey;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _Description;
}