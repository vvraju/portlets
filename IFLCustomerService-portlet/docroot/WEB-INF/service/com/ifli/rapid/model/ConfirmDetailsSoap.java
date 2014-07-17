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
public class ConfirmDetailsSoap implements Serializable {
	public static ConfirmDetailsSoap toSoapModel(ConfirmDetails model) {
		ConfirmDetailsSoap soapModel = new ConfirmDetailsSoap();

		soapModel.setID(model.getID());
		soapModel.setQRC_ASR_ID(model.getQRC_ASR_ID());
		soapModel.setApproval_Status(model.getApproval_Status());
		soapModel.setComments(model.getComments());
		soapModel.setSign_Flag(model.getSign_Flag());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());

		return soapModel;
	}

	public static ConfirmDetailsSoap[] toSoapModels(ConfirmDetails[] models) {
		ConfirmDetailsSoap[] soapModels = new ConfirmDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConfirmDetailsSoap[][] toSoapModels(ConfirmDetails[][] models) {
		ConfirmDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConfirmDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConfirmDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConfirmDetailsSoap[] toSoapModels(List<ConfirmDetails> models) {
		List<ConfirmDetailsSoap> soapModels = new ArrayList<ConfirmDetailsSoap>(models.size());

		for (ConfirmDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConfirmDetailsSoap[soapModels.size()]);
	}

	public ConfirmDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _ID;
	}

	public void setPrimaryKey(int pk) {
		setID(pk);
	}

	public int getID() {
		return _ID;
	}

	public void setID(int ID) {
		_ID = ID;
	}

	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;
	}

	public String getApproval_Status() {
		return _Approval_Status;
	}

	public void setApproval_Status(String Approval_Status) {
		_Approval_Status = Approval_Status;
	}

	public String getComments() {
		return _Comments;
	}

	public void setComments(String Comments) {
		_Comments = Comments;
	}

	public String getSign_Flag() {
		return _Sign_Flag;
	}

	public void setSign_Flag(String Sign_Flag) {
		_Sign_Flag = Sign_Flag;
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

	private int _ID;
	private int _QRC_ASR_ID;
	private String _Approval_Status;
	private String _Comments;
	private String _Sign_Flag;
	private String _CreatedBy;
	private Date _CreatedDate;
}