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
public class QrcMstRequestsSoap implements Serializable {
	public static QrcMstRequestsSoap toSoapModel(QrcMstRequests model) {
		QrcMstRequestsSoap soapModel = new QrcMstRequestsSoap();

		soapModel.setRequestId(model.getRequestId());
		soapModel.setCategory(model.getCategory());
		soapModel.setCallType(model.getCallType());
		soapModel.setCallSubType(model.getCallSubType());
		soapModel.setKeyword(model.getKeyword());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static QrcMstRequestsSoap[] toSoapModels(QrcMstRequests[] models) {
		QrcMstRequestsSoap[] soapModels = new QrcMstRequestsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QrcMstRequestsSoap[][] toSoapModels(QrcMstRequests[][] models) {
		QrcMstRequestsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QrcMstRequestsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QrcMstRequestsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QrcMstRequestsSoap[] toSoapModels(List<QrcMstRequests> models) {
		List<QrcMstRequestsSoap> soapModels = new ArrayList<QrcMstRequestsSoap>(models.size());

		for (QrcMstRequests model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QrcMstRequestsSoap[soapModels.size()]);
	}

	public QrcMstRequestsSoap() {
	}

	public int getPrimaryKey() {
		return _RequestId;
	}

	public void setPrimaryKey(int pk) {
		setRequestId(pk);
	}

	public int getRequestId() {
		return _RequestId;
	}

	public void setRequestId(int RequestId) {
		_RequestId = RequestId;
	}

	public String getCategory() {
		return _Category;
	}

	public void setCategory(String Category) {
		_Category = Category;
	}

	public String getCallType() {
		return _CallType;
	}

	public void setCallType(String CallType) {
		_CallType = CallType;
	}

	public String getCallSubType() {
		return _CallSubType;
	}

	public void setCallSubType(String CallSubType) {
		_CallSubType = CallSubType;
	}

	public String getKeyword() {
		return _Keyword;
	}

	public void setKeyword(String Keyword) {
		_Keyword = Keyword;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
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

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	private int _RequestId;
	private String _Category;
	private String _CallType;
	private String _CallSubType;
	private String _Keyword;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}