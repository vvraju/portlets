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
public class QRCSubTypeMasterSoap implements Serializable {
	public static QRCSubTypeMasterSoap toSoapModel(QRCSubTypeMaster model) {
		QRCSubTypeMasterSoap soapModel = new QRCSubTypeMasterSoap();

		soapModel.setQRC_SUB_TYPE_ID(model.getQRC_SUB_TYPE_ID());
		soapModel.setQRC_TYPE_ID(model.getQRC_TYPE_ID());
		soapModel.setSUB_TYPE_DESC(model.getSUB_TYPE_DESC());
		soapModel.setACTIVE_FLAG(model.getACTIVE_FLAG());
		soapModel.setINSERTED_DATE(model.getINSERTED_DATE());
		soapModel.setINSERTED_BY(model.getINSERTED_BY());
		soapModel.setUPDATED_DATE(model.getUPDATED_DATE());
		soapModel.setUPDATED_BY(model.getUPDATED_BY());
		soapModel.setDELETED_DATE(model.getDELETED_DATE());
		soapModel.setDELETED_BY(model.getDELETED_BY());

		return soapModel;
	}

	public static QRCSubTypeMasterSoap[] toSoapModels(QRCSubTypeMaster[] models) {
		QRCSubTypeMasterSoap[] soapModels = new QRCSubTypeMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QRCSubTypeMasterSoap[][] toSoapModels(
		QRCSubTypeMaster[][] models) {
		QRCSubTypeMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QRCSubTypeMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QRCSubTypeMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QRCSubTypeMasterSoap[] toSoapModels(
		List<QRCSubTypeMaster> models) {
		List<QRCSubTypeMasterSoap> soapModels = new ArrayList<QRCSubTypeMasterSoap>(models.size());

		for (QRCSubTypeMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QRCSubTypeMasterSoap[soapModels.size()]);
	}

	public QRCSubTypeMasterSoap() {
	}

	public int getPrimaryKey() {
		return _QRC_SUB_TYPE_ID;
	}

	public void setPrimaryKey(int pk) {
		setQRC_SUB_TYPE_ID(pk);
	}

	public int getQRC_SUB_TYPE_ID() {
		return _QRC_SUB_TYPE_ID;
	}

	public void setQRC_SUB_TYPE_ID(int QRC_SUB_TYPE_ID) {
		_QRC_SUB_TYPE_ID = QRC_SUB_TYPE_ID;
	}

	public int getQRC_TYPE_ID() {
		return _QRC_TYPE_ID;
	}

	public void setQRC_TYPE_ID(int QRC_TYPE_ID) {
		_QRC_TYPE_ID = QRC_TYPE_ID;
	}

	public String getSUB_TYPE_DESC() {
		return _SUB_TYPE_DESC;
	}

	public void setSUB_TYPE_DESC(String SUB_TYPE_DESC) {
		_SUB_TYPE_DESC = SUB_TYPE_DESC;
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

	private int _QRC_SUB_TYPE_ID;
	private int _QRC_TYPE_ID;
	private String _SUB_TYPE_DESC;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
}