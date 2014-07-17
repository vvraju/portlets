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
public class QRCUserSoap implements Serializable {
	public static QRCUserSoap toSoapModel(QRCUser model) {
		QRCUserSoap soapModel = new QRCUserSoap();

		soapModel.setQRC_USER_ID(model.getQRC_USER_ID());
		soapModel.setUSER_NAME(model.getUSER_NAME());
		soapModel.setTEAM_ID(model.getTEAM_ID());
		soapModel.setUSER_DETAILS(model.getUSER_DETAILS());
		soapModel.setACTIVE_FLAG(model.getACTIVE_FLAG());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setDELETED_DATE(model.getDELETED_DATE());
		soapModel.setDELETED_BY(model.getDELETED_BY());

		return soapModel;
	}

	public static QRCUserSoap[] toSoapModels(QRCUser[] models) {
		QRCUserSoap[] soapModels = new QRCUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QRCUserSoap[][] toSoapModels(QRCUser[][] models) {
		QRCUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QRCUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QRCUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QRCUserSoap[] toSoapModels(List<QRCUser> models) {
		List<QRCUserSoap> soapModels = new ArrayList<QRCUserSoap>(models.size());

		for (QRCUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QRCUserSoap[soapModels.size()]);
	}

	public QRCUserSoap() {
	}

	public int getPrimaryKey() {
		return _QRC_USER_ID;
	}

	public void setPrimaryKey(int pk) {
		setQRC_USER_ID(pk);
	}

	public int getQRC_USER_ID() {
		return _QRC_USER_ID;
	}

	public void setQRC_USER_ID(int QRC_USER_ID) {
		_QRC_USER_ID = QRC_USER_ID;
	}

	public String getUSER_NAME() {
		return _USER_NAME;
	}

	public void setUSER_NAME(String USER_NAME) {
		_USER_NAME = USER_NAME;
	}

	public int getTEAM_ID() {
		return _TEAM_ID;
	}

	public void setTEAM_ID(int TEAM_ID) {
		_TEAM_ID = TEAM_ID;
	}

	public int getUSER_DETAILS() {
		return _USER_DETAILS;
	}

	public void setUSER_DETAILS(int USER_DETAILS) {
		_USER_DETAILS = USER_DETAILS;
	}

	public String getACTIVE_FLAG() {
		return _ACTIVE_FLAG;
	}

	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;
	}

	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;
	}

	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;
	}

	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;
	}

	public Date getDELETED_DATE() {
		return _DELETED_DATE;
	}

	public void setDELETED_DATE(Date DELETED_DATE) {
		_DELETED_DATE = DELETED_DATE;
	}

	public String getDELETED_BY() {
		return _DELETED_BY;
	}

	public void setDELETED_BY(String DELETED_BY) {
		_DELETED_BY = DELETED_BY;
	}

	private int _QRC_USER_ID;
	private String _USER_NAME;
	private int _TEAM_ID;
	private int _USER_DETAILS;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
}