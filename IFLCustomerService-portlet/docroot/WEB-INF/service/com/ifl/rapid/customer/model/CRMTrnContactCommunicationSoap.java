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
public class CRMTrnContactCommunicationSoap implements Serializable {
	public static CRMTrnContactCommunicationSoap toSoapModel(
		CRMTrnContactCommunication model) {
		CRMTrnContactCommunicationSoap soapModel = new CRMTrnContactCommunicationSoap();

		soapModel.setContactCommunicationId(model.getContactCommunicationId());
		soapModel.setContactId(model.getContactId());
		soapModel.setCommunicationMedium(model.getCommunicationMedium());
		soapModel.setCommunicationMediumId(model.getCommunicationMediumId());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static CRMTrnContactCommunicationSoap[] toSoapModels(
		CRMTrnContactCommunication[] models) {
		CRMTrnContactCommunicationSoap[] soapModels = new CRMTrnContactCommunicationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CRMTrnContactCommunicationSoap[][] toSoapModels(
		CRMTrnContactCommunication[][] models) {
		CRMTrnContactCommunicationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CRMTrnContactCommunicationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CRMTrnContactCommunicationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CRMTrnContactCommunicationSoap[] toSoapModels(
		List<CRMTrnContactCommunication> models) {
		List<CRMTrnContactCommunicationSoap> soapModels = new ArrayList<CRMTrnContactCommunicationSoap>(models.size());

		for (CRMTrnContactCommunication model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CRMTrnContactCommunicationSoap[soapModels.size()]);
	}

	public CRMTrnContactCommunicationSoap() {
	}

	public int getPrimaryKey() {
		return _ContactCommunicationId;
	}

	public void setPrimaryKey(int pk) {
		setContactCommunicationId(pk);
	}

	public int getContactCommunicationId() {
		return _ContactCommunicationId;
	}

	public void setContactCommunicationId(int ContactCommunicationId) {
		_ContactCommunicationId = ContactCommunicationId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public int getCommunicationMedium() {
		return _CommunicationMedium;
	}

	public void setCommunicationMedium(int CommunicationMedium) {
		_CommunicationMedium = CommunicationMedium;
	}

	public String getCommunicationMediumId() {
		return _CommunicationMediumId;
	}

	public void setCommunicationMediumId(String CommunicationMediumId) {
		_CommunicationMediumId = CommunicationMediumId;
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

	public String getIsActive() {
		return _IsActive;
	}

	public void setIsActive(String IsActive) {
		_IsActive = IsActive;
	}

	private int _ContactCommunicationId;
	private int _ContactId;
	private int _CommunicationMedium;
	private String _CommunicationMediumId;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}