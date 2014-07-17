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
public class ChequePaymentRequestSoap implements Serializable {
	public static ChequePaymentRequestSoap toSoapModel(
		ChequePaymentRequest model) {
		ChequePaymentRequestSoap soapModel = new ChequePaymentRequestSoap();

		soapModel.setServiceRequestID(model.getServiceRequestID());
		soapModel.setServiceRequestMasterId(model.getServiceRequestMasterId());
		soapModel.setDescription(model.getDescription());
		soapModel.setContactId(model.getContactId());
		soapModel.setStartPreferedTime(model.getStartPreferedTime());
		soapModel.setEndPreferedTime(model.getEndPreferedTime());
		soapModel.setPreferedDate(model.getPreferedDate());

		return soapModel;
	}

	public static ChequePaymentRequestSoap[] toSoapModels(
		ChequePaymentRequest[] models) {
		ChequePaymentRequestSoap[] soapModels = new ChequePaymentRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ChequePaymentRequestSoap[][] toSoapModels(
		ChequePaymentRequest[][] models) {
		ChequePaymentRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ChequePaymentRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ChequePaymentRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ChequePaymentRequestSoap[] toSoapModels(
		List<ChequePaymentRequest> models) {
		List<ChequePaymentRequestSoap> soapModels = new ArrayList<ChequePaymentRequestSoap>(models.size());

		for (ChequePaymentRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ChequePaymentRequestSoap[soapModels.size()]);
	}

	public ChequePaymentRequestSoap() {
	}

	public String getPrimaryKey() {
		return _ServiceRequestID;
	}

	public void setPrimaryKey(String pk) {
		setServiceRequestID(pk);
	}

	public String getServiceRequestID() {
		return _ServiceRequestID;
	}

	public void setServiceRequestID(String ServiceRequestID) {
		_ServiceRequestID = ServiceRequestID;
	}

	public String getServiceRequestMasterId() {
		return _ServiceRequestMasterId;
	}

	public void setServiceRequestMasterId(String ServiceRequestMasterId) {
		_ServiceRequestMasterId = ServiceRequestMasterId;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getContactId() {
		return _contactId;
	}

	public void setContactId(String contactId) {
		_contactId = contactId;
	}

	public Date getStartPreferedTime() {
		return _startPreferedTime;
	}

	public void setStartPreferedTime(Date startPreferedTime) {
		_startPreferedTime = startPreferedTime;
	}

	public Date getEndPreferedTime() {
		return _endPreferedTime;
	}

	public void setEndPreferedTime(Date endPreferedTime) {
		_endPreferedTime = endPreferedTime;
	}

	public Date getPreferedDate() {
		return _PreferedDate;
	}

	public void setPreferedDate(Date PreferedDate) {
		_PreferedDate = PreferedDate;
	}

	private String _ServiceRequestID;
	private String _ServiceRequestMasterId;
	private String _description;
	private String _contactId;
	private Date _startPreferedTime;
	private Date _endPreferedTime;
	private Date _PreferedDate;
}