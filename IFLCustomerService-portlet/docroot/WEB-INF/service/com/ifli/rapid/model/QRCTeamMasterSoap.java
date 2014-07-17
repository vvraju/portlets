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
public class QRCTeamMasterSoap implements Serializable {
	public static QRCTeamMasterSoap toSoapModel(QRCTeamMaster model) {
		QRCTeamMasterSoap soapModel = new QRCTeamMasterSoap();

		soapModel.setQRC_TM_ID(model.getQRC_TM_ID());
		soapModel.setTM_DESC(model.getTM_DESC());
		soapModel.setACTIVE_FLAG(model.getACTIVE_FLAG());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setDELETED_DATE(model.getDELETED_DATE());
		soapModel.setDELETED_BY(model.getDELETED_BY());

		return soapModel;
	}

	public static QRCTeamMasterSoap[] toSoapModels(QRCTeamMaster[] models) {
		QRCTeamMasterSoap[] soapModels = new QRCTeamMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QRCTeamMasterSoap[][] toSoapModels(QRCTeamMaster[][] models) {
		QRCTeamMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QRCTeamMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QRCTeamMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QRCTeamMasterSoap[] toSoapModels(List<QRCTeamMaster> models) {
		List<QRCTeamMasterSoap> soapModels = new ArrayList<QRCTeamMasterSoap>(models.size());

		for (QRCTeamMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QRCTeamMasterSoap[soapModels.size()]);
	}

	public QRCTeamMasterSoap() {
	}

	public int getPrimaryKey() {
		return _QRC_TM_ID;
	}

	public void setPrimaryKey(int pk) {
		setQRC_TM_ID(pk);
	}

	public int getQRC_TM_ID() {
		return _QRC_TM_ID;
	}

	public void setQRC_TM_ID(int QRC_TM_ID) {
		_QRC_TM_ID = QRC_TM_ID;
	}

	public String getTM_DESC() {
		return _TM_DESC;
	}

	public void setTM_DESC(String TM_DESC) {
		_TM_DESC = TM_DESC;
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

	private int _QRC_TM_ID;
	private String _TM_DESC;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
}