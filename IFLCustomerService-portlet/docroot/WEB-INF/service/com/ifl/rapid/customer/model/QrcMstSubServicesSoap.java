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
public class QrcMstSubServicesSoap implements Serializable {
	public static QrcMstSubServicesSoap toSoapModel(QrcMstSubServices model) {
		QrcMstSubServicesSoap soapModel = new QrcMstSubServicesSoap();

		soapModel.setSubServiceId(model.getSubServiceId());
		soapModel.setSubServiceName(model.getSubServiceName());
		soapModel.setSubServiceUrl(model.getSubServiceUrl());
		soapModel.setServiceId(model.getServiceId());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static QrcMstSubServicesSoap[] toSoapModels(
		QrcMstSubServices[] models) {
		QrcMstSubServicesSoap[] soapModels = new QrcMstSubServicesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QrcMstSubServicesSoap[][] toSoapModels(
		QrcMstSubServices[][] models) {
		QrcMstSubServicesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QrcMstSubServicesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QrcMstSubServicesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QrcMstSubServicesSoap[] toSoapModels(
		List<QrcMstSubServices> models) {
		List<QrcMstSubServicesSoap> soapModels = new ArrayList<QrcMstSubServicesSoap>(models.size());

		for (QrcMstSubServices model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QrcMstSubServicesSoap[soapModels.size()]);
	}

	public QrcMstSubServicesSoap() {
	}

	public int getPrimaryKey() {
		return _SubServiceId;
	}

	public void setPrimaryKey(int pk) {
		setSubServiceId(pk);
	}

	public int getSubServiceId() {
		return _SubServiceId;
	}

	public void setSubServiceId(int SubServiceId) {
		_SubServiceId = SubServiceId;
	}

	public String getSubServiceName() {
		return _SubServiceName;
	}

	public void setSubServiceName(String SubServiceName) {
		_SubServiceName = SubServiceName;
	}

	public String getSubServiceUrl() {
		return _SubServiceUrl;
	}

	public void setSubServiceUrl(String SubServiceUrl) {
		_SubServiceUrl = SubServiceUrl;
	}

	public int getServiceId() {
		return _ServiceId;
	}

	public void setServiceId(int ServiceId) {
		_ServiceId = ServiceId;
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

	private int _SubServiceId;
	private String _SubServiceName;
	private String _SubServiceUrl;
	private int _ServiceId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
}