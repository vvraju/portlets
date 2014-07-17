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

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ifl.rapid.customer.service.http.CRM_Trn_ContactServiceSoap}.
 *
 * @author Satya Kola
 * @see com.ifl.rapid.customer.service.http.CRM_Trn_ContactServiceSoap
 * @generated
 */
public class CRM_Trn_ContactSoap implements Serializable {
	public static CRM_Trn_ContactSoap toSoapModel(CRM_Trn_Contact model) {
		CRM_Trn_ContactSoap soapModel = new CRM_Trn_ContactSoap();

		soapModel.setContactId(model.getContactId());
		soapModel.setSalutation(model.getSalutation());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setPANNo(model.getPANNo());
		soapModel.setGender(model.getGender());
		soapModel.setBloodGroup(model.getBloodGroup());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setMaritalStatus(model.getMaritalStatus());
		soapModel.setQualificationId(model.getQualificationId());
		soapModel.setOccupationId(model.getOccupationId());
		soapModel.setSourceId(model.getSourceId());
		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setReferredBy(model.getReferredBy());
		soapModel.setContactTypeId(model.getContactTypeId());
		soapModel.setDNDActivated(model.getDNDActivated());
		soapModel.setPoliticallyExposed(model.getPoliticallyExposed());
		soapModel.setEIANumber(model.getEIANumber());
		soapModel.setSeqGenerator(model.getSeqGenerator());
		soapModel.setReferenceNo(model.getReferenceNo());
		soapModel.setEIAServiceProvider(model.getEIAServiceProvider());
		soapModel.setAadharCardNo(model.getAadharCardNo());
		soapModel.setWeddingAnniversary(model.getWeddingAnniversary());
		soapModel.setPhotograph(model.getPhotograph());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.getIsActive());

		return soapModel;
	}

	public static CRM_Trn_ContactSoap[] toSoapModels(CRM_Trn_Contact[] models) {
		CRM_Trn_ContactSoap[] soapModels = new CRM_Trn_ContactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_ContactSoap[][] toSoapModels(
		CRM_Trn_Contact[][] models) {
		CRM_Trn_ContactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CRM_Trn_ContactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CRM_Trn_ContactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CRM_Trn_ContactSoap[] toSoapModels(
		List<CRM_Trn_Contact> models) {
		List<CRM_Trn_ContactSoap> soapModels = new ArrayList<CRM_Trn_ContactSoap>(models.size());

		for (CRM_Trn_Contact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CRM_Trn_ContactSoap[soapModels.size()]);
	}

	public CRM_Trn_ContactSoap() {
	}

	public int getPrimaryKey() {
		return _ContactId;
	}

	public void setPrimaryKey(int pk) {
		setContactId(pk);
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public String getSalutation() {
		return _Salutation;
	}

	public void setSalutation(String Salutation) {
		_Salutation = Salutation;
	}

	public String getFirstName() {
		return _FirstName;
	}

	public void setFirstName(String FirstName) {
		_FirstName = FirstName;
	}

	public String getMiddleName() {
		return _MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		_MiddleName = MiddleName;
	}

	public String getLastName() {
		return _LastName;
	}

	public void setLastName(String LastName) {
		_LastName = LastName;
	}

	public String getPANNo() {
		return _PANNo;
	}

	public void setPANNo(String PANNo) {
		_PANNo = PANNo;
	}

	public String getGender() {
		return _Gender;
	}

	public void setGender(String Gender) {
		_Gender = Gender;
	}

	public String getBloodGroup() {
		return _BloodGroup;
	}

	public void setBloodGroup(String BloodGroup) {
		_BloodGroup = BloodGroup;
	}

	public Date getDateOfBirth() {
		return _DateOfBirth;
	}

	public void setDateOfBirth(Date DateOfBirth) {
		_DateOfBirth = DateOfBirth;
	}

	public String getMaritalStatus() {
		return _MaritalStatus;
	}

	public void setMaritalStatus(String MaritalStatus) {
		_MaritalStatus = MaritalStatus;
	}

	public int getQualificationId() {
		return _QualificationId;
	}

	public void setQualificationId(int QualificationId) {
		_QualificationId = QualificationId;
	}

	public int getOccupationId() {
		return _OccupationId;
	}

	public void setOccupationId(int OccupationId) {
		_OccupationId = OccupationId;
	}

	public int getSourceId() {
		return _SourceId;
	}

	public void setSourceId(int SourceId) {
		_SourceId = SourceId;
	}

	public int getCategoryId() {
		return _CategoryId;
	}

	public void setCategoryId(int CategoryId) {
		_CategoryId = CategoryId;
	}

	public int getReferredBy() {
		return _ReferredBy;
	}

	public void setReferredBy(int ReferredBy) {
		_ReferredBy = ReferredBy;
	}

	public int getContactTypeId() {
		return _ContactTypeId;
	}

	public void setContactTypeId(int ContactTypeId) {
		_ContactTypeId = ContactTypeId;
	}

	public boolean getDNDActivated() {
		return _DNDActivated;
	}

	public boolean isDNDActivated() {
		return _DNDActivated;
	}

	public void setDNDActivated(boolean DNDActivated) {
		_DNDActivated = DNDActivated;
	}

	public boolean getPoliticallyExposed() {
		return _PoliticallyExposed;
	}

	public boolean isPoliticallyExposed() {
		return _PoliticallyExposed;
	}

	public void setPoliticallyExposed(boolean PoliticallyExposed) {
		_PoliticallyExposed = PoliticallyExposed;
	}

	public String getEIANumber() {
		return _EIANumber;
	}

	public void setEIANumber(String EIANumber) {
		_EIANumber = EIANumber;
	}

	public int getSeqGenerator() {
		return _SeqGenerator;
	}

	public void setSeqGenerator(int SeqGenerator) {
		_SeqGenerator = SeqGenerator;
	}

	public String getReferenceNo() {
		return _ReferenceNo;
	}

	public void setReferenceNo(String ReferenceNo) {
		_ReferenceNo = ReferenceNo;
	}

	public String getEIAServiceProvider() {
		return _EIAServiceProvider;
	}

	public void setEIAServiceProvider(String EIAServiceProvider) {
		_EIAServiceProvider = EIAServiceProvider;
	}

	public String getAadharCardNo() {
		return _AadharCardNo;
	}

	public void setAadharCardNo(String AadharCardNo) {
		_AadharCardNo = AadharCardNo;
	}

	public Date getWeddingAnniversary() {
		return _WeddingAnniversary;
	}

	public void setWeddingAnniversary(Date WeddingAnniversary) {
		_WeddingAnniversary = WeddingAnniversary;
	}

	public Blob getPhotograph() {
		return _Photograph;
	}

	public void setPhotograph(Blob Photograph) {
		_Photograph = Photograph;
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

	private int _ContactId;
	private String _Salutation;
	private String _FirstName;
	private String _MiddleName;
	private String _LastName;
	private String _PANNo;
	private String _Gender;
	private String _BloodGroup;
	private Date _DateOfBirth;
	private String _MaritalStatus;
	private int _QualificationId;
	private int _OccupationId;
	private int _SourceId;
	private int _CategoryId;
	private int _ReferredBy;
	private int _ContactTypeId;
	private boolean _DNDActivated;
	private boolean _PoliticallyExposed;
	private String _EIANumber;
	private int _SeqGenerator;
	private String _ReferenceNo;
	private String _EIAServiceProvider;
	private String _AadharCardNo;
	private Date _WeddingAnniversary;
	private Blob _Photograph;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
}