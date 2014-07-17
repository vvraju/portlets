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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CRM_Trn_Contact}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_Contact
 * @generated
 */
public class CRM_Trn_ContactWrapper implements CRM_Trn_Contact,
	ModelWrapper<CRM_Trn_Contact> {
	public CRM_Trn_ContactWrapper(CRM_Trn_Contact crm_Trn_Contact) {
		_crm_Trn_Contact = crm_Trn_Contact;
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_Contact.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_Contact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ContactId", getContactId());
		attributes.put("Salutation", getSalutation());
		attributes.put("FirstName", getFirstName());
		attributes.put("MiddleName", getMiddleName());
		attributes.put("LastName", getLastName());
		attributes.put("PANNo", getPANNo());
		attributes.put("Gender", getGender());
		attributes.put("BloodGroup", getBloodGroup());
		attributes.put("DateOfBirth", getDateOfBirth());
		attributes.put("MaritalStatus", getMaritalStatus());
		attributes.put("QualificationId", getQualificationId());
		attributes.put("OccupationId", getOccupationId());
		attributes.put("SourceId", getSourceId());
		attributes.put("CategoryId", getCategoryId());
		attributes.put("ReferredBy", getReferredBy());
		attributes.put("ContactTypeId", getContactTypeId());
		attributes.put("DNDActivated", getDNDActivated());
		attributes.put("PoliticallyExposed", getPoliticallyExposed());
		attributes.put("EIANumber", getEIANumber());
		attributes.put("SeqGenerator", getSeqGenerator());
		attributes.put("ReferenceNo", getReferenceNo());
		attributes.put("EIAServiceProvider", getEIAServiceProvider());
		attributes.put("AadharCardNo", getAadharCardNo());
		attributes.put("WeddingAnniversary", getWeddingAnniversary());
		attributes.put("Photograph", getPhotograph());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String Salutation = (String)attributes.get("Salutation");

		if (Salutation != null) {
			setSalutation(Salutation);
		}

		String FirstName = (String)attributes.get("FirstName");

		if (FirstName != null) {
			setFirstName(FirstName);
		}

		String MiddleName = (String)attributes.get("MiddleName");

		if (MiddleName != null) {
			setMiddleName(MiddleName);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}

		String PANNo = (String)attributes.get("PANNo");

		if (PANNo != null) {
			setPANNo(PANNo);
		}

		String Gender = (String)attributes.get("Gender");

		if (Gender != null) {
			setGender(Gender);
		}

		String BloodGroup = (String)attributes.get("BloodGroup");

		if (BloodGroup != null) {
			setBloodGroup(BloodGroup);
		}

		Date DateOfBirth = (Date)attributes.get("DateOfBirth");

		if (DateOfBirth != null) {
			setDateOfBirth(DateOfBirth);
		}

		String MaritalStatus = (String)attributes.get("MaritalStatus");

		if (MaritalStatus != null) {
			setMaritalStatus(MaritalStatus);
		}

		Integer QualificationId = (Integer)attributes.get("QualificationId");

		if (QualificationId != null) {
			setQualificationId(QualificationId);
		}

		Integer OccupationId = (Integer)attributes.get("OccupationId");

		if (OccupationId != null) {
			setOccupationId(OccupationId);
		}

		Integer SourceId = (Integer)attributes.get("SourceId");

		if (SourceId != null) {
			setSourceId(SourceId);
		}

		Integer CategoryId = (Integer)attributes.get("CategoryId");

		if (CategoryId != null) {
			setCategoryId(CategoryId);
		}

		Integer ReferredBy = (Integer)attributes.get("ReferredBy");

		if (ReferredBy != null) {
			setReferredBy(ReferredBy);
		}

		Integer ContactTypeId = (Integer)attributes.get("ContactTypeId");

		if (ContactTypeId != null) {
			setContactTypeId(ContactTypeId);
		}

		Boolean DNDActivated = (Boolean)attributes.get("DNDActivated");

		if (DNDActivated != null) {
			setDNDActivated(DNDActivated);
		}

		Boolean PoliticallyExposed = (Boolean)attributes.get(
				"PoliticallyExposed");

		if (PoliticallyExposed != null) {
			setPoliticallyExposed(PoliticallyExposed);
		}

		String EIANumber = (String)attributes.get("EIANumber");

		if (EIANumber != null) {
			setEIANumber(EIANumber);
		}

		Integer SeqGenerator = (Integer)attributes.get("SeqGenerator");

		if (SeqGenerator != null) {
			setSeqGenerator(SeqGenerator);
		}

		String ReferenceNo = (String)attributes.get("ReferenceNo");

		if (ReferenceNo != null) {
			setReferenceNo(ReferenceNo);
		}

		String EIAServiceProvider = (String)attributes.get("EIAServiceProvider");

		if (EIAServiceProvider != null) {
			setEIAServiceProvider(EIAServiceProvider);
		}

		String AadharCardNo = (String)attributes.get("AadharCardNo");

		if (AadharCardNo != null) {
			setAadharCardNo(AadharCardNo);
		}

		Date WeddingAnniversary = (Date)attributes.get("WeddingAnniversary");

		if (WeddingAnniversary != null) {
			setWeddingAnniversary(WeddingAnniversary);
		}

		Blob Photograph = (Blob)attributes.get("Photograph");

		if (Photograph != null) {
			setPhotograph(Photograph);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}
	}

	/**
	* Returns the primary key of this c r m_ trn_ contact.
	*
	* @return the primary key of this c r m_ trn_ contact
	*/
	@Override
	public int getPrimaryKey() {
		return _crm_Trn_Contact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c r m_ trn_ contact.
	*
	* @param primaryKey the primary key of this c r m_ trn_ contact
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_crm_Trn_Contact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contact ID of this c r m_ trn_ contact.
	*
	* @return the contact ID of this c r m_ trn_ contact
	*/
	@Override
	public int getContactId() {
		return _crm_Trn_Contact.getContactId();
	}

	/**
	* Sets the contact ID of this c r m_ trn_ contact.
	*
	* @param ContactId the contact ID of this c r m_ trn_ contact
	*/
	@Override
	public void setContactId(int ContactId) {
		_crm_Trn_Contact.setContactId(ContactId);
	}

	/**
	* Returns the salutation of this c r m_ trn_ contact.
	*
	* @return the salutation of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getSalutation() {
		return _crm_Trn_Contact.getSalutation();
	}

	/**
	* Sets the salutation of this c r m_ trn_ contact.
	*
	* @param Salutation the salutation of this c r m_ trn_ contact
	*/
	@Override
	public void setSalutation(java.lang.String Salutation) {
		_crm_Trn_Contact.setSalutation(Salutation);
	}

	/**
	* Returns the first name of this c r m_ trn_ contact.
	*
	* @return the first name of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getFirstName() {
		return _crm_Trn_Contact.getFirstName();
	}

	/**
	* Sets the first name of this c r m_ trn_ contact.
	*
	* @param FirstName the first name of this c r m_ trn_ contact
	*/
	@Override
	public void setFirstName(java.lang.String FirstName) {
		_crm_Trn_Contact.setFirstName(FirstName);
	}

	/**
	* Returns the middle name of this c r m_ trn_ contact.
	*
	* @return the middle name of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _crm_Trn_Contact.getMiddleName();
	}

	/**
	* Sets the middle name of this c r m_ trn_ contact.
	*
	* @param MiddleName the middle name of this c r m_ trn_ contact
	*/
	@Override
	public void setMiddleName(java.lang.String MiddleName) {
		_crm_Trn_Contact.setMiddleName(MiddleName);
	}

	/**
	* Returns the last name of this c r m_ trn_ contact.
	*
	* @return the last name of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getLastName() {
		return _crm_Trn_Contact.getLastName();
	}

	/**
	* Sets the last name of this c r m_ trn_ contact.
	*
	* @param LastName the last name of this c r m_ trn_ contact
	*/
	@Override
	public void setLastName(java.lang.String LastName) {
		_crm_Trn_Contact.setLastName(LastName);
	}

	/**
	* Returns the p a n no of this c r m_ trn_ contact.
	*
	* @return the p a n no of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getPANNo() {
		return _crm_Trn_Contact.getPANNo();
	}

	/**
	* Sets the p a n no of this c r m_ trn_ contact.
	*
	* @param PANNo the p a n no of this c r m_ trn_ contact
	*/
	@Override
	public void setPANNo(java.lang.String PANNo) {
		_crm_Trn_Contact.setPANNo(PANNo);
	}

	/**
	* Returns the gender of this c r m_ trn_ contact.
	*
	* @return the gender of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getGender() {
		return _crm_Trn_Contact.getGender();
	}

	/**
	* Sets the gender of this c r m_ trn_ contact.
	*
	* @param Gender the gender of this c r m_ trn_ contact
	*/
	@Override
	public void setGender(java.lang.String Gender) {
		_crm_Trn_Contact.setGender(Gender);
	}

	/**
	* Returns the blood group of this c r m_ trn_ contact.
	*
	* @return the blood group of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getBloodGroup() {
		return _crm_Trn_Contact.getBloodGroup();
	}

	/**
	* Sets the blood group of this c r m_ trn_ contact.
	*
	* @param BloodGroup the blood group of this c r m_ trn_ contact
	*/
	@Override
	public void setBloodGroup(java.lang.String BloodGroup) {
		_crm_Trn_Contact.setBloodGroup(BloodGroup);
	}

	/**
	* Returns the date of birth of this c r m_ trn_ contact.
	*
	* @return the date of birth of this c r m_ trn_ contact
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _crm_Trn_Contact.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this c r m_ trn_ contact.
	*
	* @param DateOfBirth the date of birth of this c r m_ trn_ contact
	*/
	@Override
	public void setDateOfBirth(java.util.Date DateOfBirth) {
		_crm_Trn_Contact.setDateOfBirth(DateOfBirth);
	}

	/**
	* Returns the marital status of this c r m_ trn_ contact.
	*
	* @return the marital status of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getMaritalStatus() {
		return _crm_Trn_Contact.getMaritalStatus();
	}

	/**
	* Sets the marital status of this c r m_ trn_ contact.
	*
	* @param MaritalStatus the marital status of this c r m_ trn_ contact
	*/
	@Override
	public void setMaritalStatus(java.lang.String MaritalStatus) {
		_crm_Trn_Contact.setMaritalStatus(MaritalStatus);
	}

	/**
	* Returns the qualification ID of this c r m_ trn_ contact.
	*
	* @return the qualification ID of this c r m_ trn_ contact
	*/
	@Override
	public int getQualificationId() {
		return _crm_Trn_Contact.getQualificationId();
	}

	/**
	* Sets the qualification ID of this c r m_ trn_ contact.
	*
	* @param QualificationId the qualification ID of this c r m_ trn_ contact
	*/
	@Override
	public void setQualificationId(int QualificationId) {
		_crm_Trn_Contact.setQualificationId(QualificationId);
	}

	/**
	* Returns the occupation ID of this c r m_ trn_ contact.
	*
	* @return the occupation ID of this c r m_ trn_ contact
	*/
	@Override
	public int getOccupationId() {
		return _crm_Trn_Contact.getOccupationId();
	}

	/**
	* Sets the occupation ID of this c r m_ trn_ contact.
	*
	* @param OccupationId the occupation ID of this c r m_ trn_ contact
	*/
	@Override
	public void setOccupationId(int OccupationId) {
		_crm_Trn_Contact.setOccupationId(OccupationId);
	}

	/**
	* Returns the source ID of this c r m_ trn_ contact.
	*
	* @return the source ID of this c r m_ trn_ contact
	*/
	@Override
	public int getSourceId() {
		return _crm_Trn_Contact.getSourceId();
	}

	/**
	* Sets the source ID of this c r m_ trn_ contact.
	*
	* @param SourceId the source ID of this c r m_ trn_ contact
	*/
	@Override
	public void setSourceId(int SourceId) {
		_crm_Trn_Contact.setSourceId(SourceId);
	}

	/**
	* Returns the category ID of this c r m_ trn_ contact.
	*
	* @return the category ID of this c r m_ trn_ contact
	*/
	@Override
	public int getCategoryId() {
		return _crm_Trn_Contact.getCategoryId();
	}

	/**
	* Sets the category ID of this c r m_ trn_ contact.
	*
	* @param CategoryId the category ID of this c r m_ trn_ contact
	*/
	@Override
	public void setCategoryId(int CategoryId) {
		_crm_Trn_Contact.setCategoryId(CategoryId);
	}

	/**
	* Returns the referred by of this c r m_ trn_ contact.
	*
	* @return the referred by of this c r m_ trn_ contact
	*/
	@Override
	public int getReferredBy() {
		return _crm_Trn_Contact.getReferredBy();
	}

	/**
	* Sets the referred by of this c r m_ trn_ contact.
	*
	* @param ReferredBy the referred by of this c r m_ trn_ contact
	*/
	@Override
	public void setReferredBy(int ReferredBy) {
		_crm_Trn_Contact.setReferredBy(ReferredBy);
	}

	/**
	* Returns the contact type ID of this c r m_ trn_ contact.
	*
	* @return the contact type ID of this c r m_ trn_ contact
	*/
	@Override
	public int getContactTypeId() {
		return _crm_Trn_Contact.getContactTypeId();
	}

	/**
	* Sets the contact type ID of this c r m_ trn_ contact.
	*
	* @param ContactTypeId the contact type ID of this c r m_ trn_ contact
	*/
	@Override
	public void setContactTypeId(int ContactTypeId) {
		_crm_Trn_Contact.setContactTypeId(ContactTypeId);
	}

	/**
	* Returns the d n d activated of this c r m_ trn_ contact.
	*
	* @return the d n d activated of this c r m_ trn_ contact
	*/
	@Override
	public boolean getDNDActivated() {
		return _crm_Trn_Contact.getDNDActivated();
	}

	/**
	* Returns <code>true</code> if this c r m_ trn_ contact is d n d activated.
	*
	* @return <code>true</code> if this c r m_ trn_ contact is d n d activated; <code>false</code> otherwise
	*/
	@Override
	public boolean isDNDActivated() {
		return _crm_Trn_Contact.isDNDActivated();
	}

	/**
	* Sets whether this c r m_ trn_ contact is d n d activated.
	*
	* @param DNDActivated the d n d activated of this c r m_ trn_ contact
	*/
	@Override
	public void setDNDActivated(boolean DNDActivated) {
		_crm_Trn_Contact.setDNDActivated(DNDActivated);
	}

	/**
	* Returns the politically exposed of this c r m_ trn_ contact.
	*
	* @return the politically exposed of this c r m_ trn_ contact
	*/
	@Override
	public boolean getPoliticallyExposed() {
		return _crm_Trn_Contact.getPoliticallyExposed();
	}

	/**
	* Returns <code>true</code> if this c r m_ trn_ contact is politically exposed.
	*
	* @return <code>true</code> if this c r m_ trn_ contact is politically exposed; <code>false</code> otherwise
	*/
	@Override
	public boolean isPoliticallyExposed() {
		return _crm_Trn_Contact.isPoliticallyExposed();
	}

	/**
	* Sets whether this c r m_ trn_ contact is politically exposed.
	*
	* @param PoliticallyExposed the politically exposed of this c r m_ trn_ contact
	*/
	@Override
	public void setPoliticallyExposed(boolean PoliticallyExposed) {
		_crm_Trn_Contact.setPoliticallyExposed(PoliticallyExposed);
	}

	/**
	* Returns the e i a number of this c r m_ trn_ contact.
	*
	* @return the e i a number of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getEIANumber() {
		return _crm_Trn_Contact.getEIANumber();
	}

	/**
	* Sets the e i a number of this c r m_ trn_ contact.
	*
	* @param EIANumber the e i a number of this c r m_ trn_ contact
	*/
	@Override
	public void setEIANumber(java.lang.String EIANumber) {
		_crm_Trn_Contact.setEIANumber(EIANumber);
	}

	/**
	* Returns the seq generator of this c r m_ trn_ contact.
	*
	* @return the seq generator of this c r m_ trn_ contact
	*/
	@Override
	public int getSeqGenerator() {
		return _crm_Trn_Contact.getSeqGenerator();
	}

	/**
	* Sets the seq generator of this c r m_ trn_ contact.
	*
	* @param SeqGenerator the seq generator of this c r m_ trn_ contact
	*/
	@Override
	public void setSeqGenerator(int SeqGenerator) {
		_crm_Trn_Contact.setSeqGenerator(SeqGenerator);
	}

	/**
	* Returns the reference no of this c r m_ trn_ contact.
	*
	* @return the reference no of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getReferenceNo() {
		return _crm_Trn_Contact.getReferenceNo();
	}

	/**
	* Sets the reference no of this c r m_ trn_ contact.
	*
	* @param ReferenceNo the reference no of this c r m_ trn_ contact
	*/
	@Override
	public void setReferenceNo(java.lang.String ReferenceNo) {
		_crm_Trn_Contact.setReferenceNo(ReferenceNo);
	}

	/**
	* Returns the e i a service provider of this c r m_ trn_ contact.
	*
	* @return the e i a service provider of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getEIAServiceProvider() {
		return _crm_Trn_Contact.getEIAServiceProvider();
	}

	/**
	* Sets the e i a service provider of this c r m_ trn_ contact.
	*
	* @param EIAServiceProvider the e i a service provider of this c r m_ trn_ contact
	*/
	@Override
	public void setEIAServiceProvider(java.lang.String EIAServiceProvider) {
		_crm_Trn_Contact.setEIAServiceProvider(EIAServiceProvider);
	}

	/**
	* Returns the aadhar card no of this c r m_ trn_ contact.
	*
	* @return the aadhar card no of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getAadharCardNo() {
		return _crm_Trn_Contact.getAadharCardNo();
	}

	/**
	* Sets the aadhar card no of this c r m_ trn_ contact.
	*
	* @param AadharCardNo the aadhar card no of this c r m_ trn_ contact
	*/
	@Override
	public void setAadharCardNo(java.lang.String AadharCardNo) {
		_crm_Trn_Contact.setAadharCardNo(AadharCardNo);
	}

	/**
	* Returns the wedding anniversary of this c r m_ trn_ contact.
	*
	* @return the wedding anniversary of this c r m_ trn_ contact
	*/
	@Override
	public java.util.Date getWeddingAnniversary() {
		return _crm_Trn_Contact.getWeddingAnniversary();
	}

	/**
	* Sets the wedding anniversary of this c r m_ trn_ contact.
	*
	* @param WeddingAnniversary the wedding anniversary of this c r m_ trn_ contact
	*/
	@Override
	public void setWeddingAnniversary(java.util.Date WeddingAnniversary) {
		_crm_Trn_Contact.setWeddingAnniversary(WeddingAnniversary);
	}

	/**
	* Returns the photograph of this c r m_ trn_ contact.
	*
	* @return the photograph of this c r m_ trn_ contact
	*/
	@Override
	public java.sql.Blob getPhotograph() {
		return _crm_Trn_Contact.getPhotograph();
	}

	/**
	* Sets the photograph of this c r m_ trn_ contact.
	*
	* @param Photograph the photograph of this c r m_ trn_ contact
	*/
	@Override
	public void setPhotograph(java.sql.Blob Photograph) {
		_crm_Trn_Contact.setPhotograph(Photograph);
	}

	/**
	* Returns the created by of this c r m_ trn_ contact.
	*
	* @return the created by of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _crm_Trn_Contact.getCreatedBy();
	}

	/**
	* Sets the created by of this c r m_ trn_ contact.
	*
	* @param CreatedBy the created by of this c r m_ trn_ contact
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_crm_Trn_Contact.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this c r m_ trn_ contact.
	*
	* @return the created date of this c r m_ trn_ contact
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _crm_Trn_Contact.getCreatedDate();
	}

	/**
	* Sets the created date of this c r m_ trn_ contact.
	*
	* @param CreatedDate the created date of this c r m_ trn_ contact
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_crm_Trn_Contact.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this c r m_ trn_ contact.
	*
	* @return the modified by of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _crm_Trn_Contact.getModifiedBy();
	}

	/**
	* Sets the modified by of this c r m_ trn_ contact.
	*
	* @param ModifiedBy the modified by of this c r m_ trn_ contact
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_crm_Trn_Contact.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this c r m_ trn_ contact.
	*
	* @return the modified date of this c r m_ trn_ contact
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _crm_Trn_Contact.getModifiedDate();
	}

	/**
	* Sets the modified date of this c r m_ trn_ contact.
	*
	* @param ModifiedDate the modified date of this c r m_ trn_ contact
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_crm_Trn_Contact.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the is active of this c r m_ trn_ contact.
	*
	* @return the is active of this c r m_ trn_ contact
	*/
	@Override
	public java.lang.String getIsActive() {
		return _crm_Trn_Contact.getIsActive();
	}

	/**
	* Sets the is active of this c r m_ trn_ contact.
	*
	* @param IsActive the is active of this c r m_ trn_ contact
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_crm_Trn_Contact.setIsActive(IsActive);
	}

	@Override
	public boolean isNew() {
		return _crm_Trn_Contact.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crm_Trn_Contact.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crm_Trn_Contact.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crm_Trn_Contact.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crm_Trn_Contact.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crm_Trn_Contact.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crm_Trn_Contact.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crm_Trn_Contact.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crm_Trn_Contact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crm_Trn_Contact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crm_Trn_Contact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CRM_Trn_ContactWrapper((CRM_Trn_Contact)_crm_Trn_Contact.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.CRM_Trn_Contact crm_Trn_Contact) {
		return _crm_Trn_Contact.compareTo(crm_Trn_Contact);
	}

	@Override
	public int hashCode() {
		return _crm_Trn_Contact.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.CRM_Trn_Contact> toCacheModel() {
		return _crm_Trn_Contact.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Contact toEscapedModel() {
		return new CRM_Trn_ContactWrapper(_crm_Trn_Contact.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.CRM_Trn_Contact toUnescapedModel() {
		return new CRM_Trn_ContactWrapper(_crm_Trn_Contact.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crm_Trn_Contact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crm_Trn_Contact.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crm_Trn_Contact.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRM_Trn_ContactWrapper)) {
			return false;
		}

		CRM_Trn_ContactWrapper crm_Trn_ContactWrapper = (CRM_Trn_ContactWrapper)obj;

		if (Validator.equals(_crm_Trn_Contact,
					crm_Trn_ContactWrapper._crm_Trn_Contact)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CRM_Trn_Contact getWrappedCRM_Trn_Contact() {
		return _crm_Trn_Contact;
	}

	@Override
	public CRM_Trn_Contact getWrappedModel() {
		return _crm_Trn_Contact;
	}

	@Override
	public void resetOriginalValues() {
		_crm_Trn_Contact.resetOriginalValues();
	}

	private CRM_Trn_Contact _crm_Trn_Contact;
}