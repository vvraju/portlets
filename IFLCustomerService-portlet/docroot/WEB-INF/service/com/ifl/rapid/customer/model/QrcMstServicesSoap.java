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
public class QrcMstServicesSoap implements Serializable {
	public static QrcMstServicesSoap toSoapModel(QrcMstServices model) {
		QrcMstServicesSoap soapModel = new QrcMstServicesSoap();

		soapModel.setServiceId(model.getServiceId());
		soapModel.setServiceName(model.getServiceName());
		soapModel.setDescription(model.getDescription());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static QrcMstServicesSoap[] toSoapModels(QrcMstServices[] models) {
		QrcMstServicesSoap[] soapModels = new QrcMstServicesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QrcMstServicesSoap[][] toSoapModels(QrcMstServices[][] models) {
		QrcMstServicesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QrcMstServicesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QrcMstServicesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QrcMstServicesSoap[] toSoapModels(List<QrcMstServices> models) {
		List<QrcMstServicesSoap> soapModels = new ArrayList<QrcMstServicesSoap>(models.size());

		for (QrcMstServices model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QrcMstServicesSoap[soapModels.size()]);
	}

	public QrcMstServicesSoap() {
	}

	public int getPrimaryKey() {
		return _ServiceId;
	}

	public void setPrimaryKey(int pk) {
		setServiceId(pk);
	}

	public int getServiceId() {
		return _ServiceId;
	}

	public void setServiceId(int ServiceId) {
		_ServiceId = ServiceId;
	}

	public String getServiceName() {
		return _ServiceName;
	}

	public void setServiceName(String ServiceName) {
		_ServiceName = ServiceName;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
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

	private int _ServiceId;
	private String _ServiceName;
	private String _Description;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}