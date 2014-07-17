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
public class CRMTrnFamilyMemberSoap implements Serializable {
	public static CRMTrnFamilyMemberSoap toSoapModel(CRMTrnFamilyMember model) {
		CRMTrnFamilyMemberSoap soapModel = new CRMTrnFamilyMemberSoap();

		soapModel.setFamilyMemberId(model.getFamilyMemberId());
		soapModel.setContactId(model.getContactId());
		soapModel.setMemberId(model.getMemberId());
		soapModel.setRelationshipId(model.getRelationshipId());
		soapModel.setFinanciallyDependent(model.getFinanciallyDependent());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CRMTrnFamilyMemberSoap[] toSoapModels(
		CRMTrnFamilyMember[] models) {
		CRMTrnFamilyMemberSoap[] soapModels = new CRMTrnFamilyMemberSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CRMTrnFamilyMemberSoap[][] toSoapModels(
		CRMTrnFamilyMember[][] models) {
		CRMTrnFamilyMemberSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CRMTrnFamilyMemberSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CRMTrnFamilyMemberSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CRMTrnFamilyMemberSoap[] toSoapModels(
		List<CRMTrnFamilyMember> models) {
		List<CRMTrnFamilyMemberSoap> soapModels = new ArrayList<CRMTrnFamilyMemberSoap>(models.size());

		for (CRMTrnFamilyMember model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CRMTrnFamilyMemberSoap[soapModels.size()]);
	}

	public CRMTrnFamilyMemberSoap() {
	}

	public int getPrimaryKey() {
		return _FamilyMemberId;
	}

	public void setPrimaryKey(int pk) {
		setFamilyMemberId(pk);
	}

	public int getFamilyMemberId() {
		return _FamilyMemberId;
	}

	public void setFamilyMemberId(int FamilyMemberId) {
		_FamilyMemberId = FamilyMemberId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public int getMemberId() {
		return _MemberId;
	}

	public void setMemberId(int MemberId) {
		_MemberId = MemberId;
	}

	public int getRelationshipId() {
		return _RelationshipId;
	}

	public void setRelationshipId(int RelationshipId) {
		_RelationshipId = RelationshipId;
	}

	public String getFinanciallyDependent() {
		return _FinanciallyDependent;
	}

	public void setFinanciallyDependent(String FinanciallyDependent) {
		_FinanciallyDependent = FinanciallyDependent;
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

	private int _FamilyMemberId;
	private int _ContactId;
	private int _MemberId;
	private int _RelationshipId;
	private String _FinanciallyDependent;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
}