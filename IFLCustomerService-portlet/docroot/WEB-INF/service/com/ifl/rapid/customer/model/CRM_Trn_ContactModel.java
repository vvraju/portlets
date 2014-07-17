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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.sql.Blob;

import java.util.Date;

/**
 * The base model interface for the CRM_Trn_Contact service. Represents a row in the &quot;CRM_Trn_Contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_Contact
 * @see com.ifl.rapid.customer.model.impl.CRM_Trn_ContactImpl
 * @see com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl
 * @generated
 */
public interface CRM_Trn_ContactModel extends BaseModel<CRM_Trn_Contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a c r m_ trn_ contact model instance should use the {@link CRM_Trn_Contact} interface instead.
	 */

	/**
	 * Returns the primary key of this c r m_ trn_ contact.
	 *
	 * @return the primary key of this c r m_ trn_ contact
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this c r m_ trn_ contact.
	 *
	 * @param primaryKey the primary key of this c r m_ trn_ contact
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the contact ID of this c r m_ trn_ contact.
	 *
	 * @return the contact ID of this c r m_ trn_ contact
	 */
	public int getContactId();

	/**
	 * Sets the contact ID of this c r m_ trn_ contact.
	 *
	 * @param ContactId the contact ID of this c r m_ trn_ contact
	 */
	public void setContactId(int ContactId);

	/**
	 * Returns the salutation of this c r m_ trn_ contact.
	 *
	 * @return the salutation of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getSalutation();

	/**
	 * Sets the salutation of this c r m_ trn_ contact.
	 *
	 * @param Salutation the salutation of this c r m_ trn_ contact
	 */
	public void setSalutation(String Salutation);

	/**
	 * Returns the first name of this c r m_ trn_ contact.
	 *
	 * @return the first name of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this c r m_ trn_ contact.
	 *
	 * @param FirstName the first name of this c r m_ trn_ contact
	 */
	public void setFirstName(String FirstName);

	/**
	 * Returns the middle name of this c r m_ trn_ contact.
	 *
	 * @return the middle name of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getMiddleName();

	/**
	 * Sets the middle name of this c r m_ trn_ contact.
	 *
	 * @param MiddleName the middle name of this c r m_ trn_ contact
	 */
	public void setMiddleName(String MiddleName);

	/**
	 * Returns the last name of this c r m_ trn_ contact.
	 *
	 * @return the last name of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this c r m_ trn_ contact.
	 *
	 * @param LastName the last name of this c r m_ trn_ contact
	 */
	public void setLastName(String LastName);

	/**
	 * Returns the p a n no of this c r m_ trn_ contact.
	 *
	 * @return the p a n no of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getPANNo();

	/**
	 * Sets the p a n no of this c r m_ trn_ contact.
	 *
	 * @param PANNo the p a n no of this c r m_ trn_ contact
	 */
	public void setPANNo(String PANNo);

	/**
	 * Returns the gender of this c r m_ trn_ contact.
	 *
	 * @return the gender of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this c r m_ trn_ contact.
	 *
	 * @param Gender the gender of this c r m_ trn_ contact
	 */
	public void setGender(String Gender);

	/**
	 * Returns the blood group of this c r m_ trn_ contact.
	 *
	 * @return the blood group of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getBloodGroup();

	/**
	 * Sets the blood group of this c r m_ trn_ contact.
	 *
	 * @param BloodGroup the blood group of this c r m_ trn_ contact
	 */
	public void setBloodGroup(String BloodGroup);

	/**
	 * Returns the date of birth of this c r m_ trn_ contact.
	 *
	 * @return the date of birth of this c r m_ trn_ contact
	 */
	public Date getDateOfBirth();

	/**
	 * Sets the date of birth of this c r m_ trn_ contact.
	 *
	 * @param DateOfBirth the date of birth of this c r m_ trn_ contact
	 */
	public void setDateOfBirth(Date DateOfBirth);

	/**
	 * Returns the marital status of this c r m_ trn_ contact.
	 *
	 * @return the marital status of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getMaritalStatus();

	/**
	 * Sets the marital status of this c r m_ trn_ contact.
	 *
	 * @param MaritalStatus the marital status of this c r m_ trn_ contact
	 */
	public void setMaritalStatus(String MaritalStatus);

	/**
	 * Returns the qualification ID of this c r m_ trn_ contact.
	 *
	 * @return the qualification ID of this c r m_ trn_ contact
	 */
	public int getQualificationId();

	/**
	 * Sets the qualification ID of this c r m_ trn_ contact.
	 *
	 * @param QualificationId the qualification ID of this c r m_ trn_ contact
	 */
	public void setQualificationId(int QualificationId);

	/**
	 * Returns the occupation ID of this c r m_ trn_ contact.
	 *
	 * @return the occupation ID of this c r m_ trn_ contact
	 */
	public int getOccupationId();

	/**
	 * Sets the occupation ID of this c r m_ trn_ contact.
	 *
	 * @param OccupationId the occupation ID of this c r m_ trn_ contact
	 */
	public void setOccupationId(int OccupationId);

	/**
	 * Returns the source ID of this c r m_ trn_ contact.
	 *
	 * @return the source ID of this c r m_ trn_ contact
	 */
	public int getSourceId();

	/**
	 * Sets the source ID of this c r m_ trn_ contact.
	 *
	 * @param SourceId the source ID of this c r m_ trn_ contact
	 */
	public void setSourceId(int SourceId);

	/**
	 * Returns the category ID of this c r m_ trn_ contact.
	 *
	 * @return the category ID of this c r m_ trn_ contact
	 */
	public int getCategoryId();

	/**
	 * Sets the category ID of this c r m_ trn_ contact.
	 *
	 * @param CategoryId the category ID of this c r m_ trn_ contact
	 */
	public void setCategoryId(int CategoryId);

	/**
	 * Returns the referred by of this c r m_ trn_ contact.
	 *
	 * @return the referred by of this c r m_ trn_ contact
	 */
	public int getReferredBy();

	/**
	 * Sets the referred by of this c r m_ trn_ contact.
	 *
	 * @param ReferredBy the referred by of this c r m_ trn_ contact
	 */
	public void setReferredBy(int ReferredBy);

	/**
	 * Returns the contact type ID of this c r m_ trn_ contact.
	 *
	 * @return the contact type ID of this c r m_ trn_ contact
	 */
	public int getContactTypeId();

	/**
	 * Sets the contact type ID of this c r m_ trn_ contact.
	 *
	 * @param ContactTypeId the contact type ID of this c r m_ trn_ contact
	 */
	public void setContactTypeId(int ContactTypeId);

	/**
	 * Returns the d n d activated of this c r m_ trn_ contact.
	 *
	 * @return the d n d activated of this c r m_ trn_ contact
	 */
	public boolean getDNDActivated();

	/**
	 * Returns <code>true</code> if this c r m_ trn_ contact is d n d activated.
	 *
	 * @return <code>true</code> if this c r m_ trn_ contact is d n d activated; <code>false</code> otherwise
	 */
	public boolean isDNDActivated();

	/**
	 * Sets whether this c r m_ trn_ contact is d n d activated.
	 *
	 * @param DNDActivated the d n d activated of this c r m_ trn_ contact
	 */
	public void setDNDActivated(boolean DNDActivated);

	/**
	 * Returns the politically exposed of this c r m_ trn_ contact.
	 *
	 * @return the politically exposed of this c r m_ trn_ contact
	 */
	public boolean getPoliticallyExposed();

	/**
	 * Returns <code>true</code> if this c r m_ trn_ contact is politically exposed.
	 *
	 * @return <code>true</code> if this c r m_ trn_ contact is politically exposed; <code>false</code> otherwise
	 */
	public boolean isPoliticallyExposed();

	/**
	 * Sets whether this c r m_ trn_ contact is politically exposed.
	 *
	 * @param PoliticallyExposed the politically exposed of this c r m_ trn_ contact
	 */
	public void setPoliticallyExposed(boolean PoliticallyExposed);

	/**
	 * Returns the e i a number of this c r m_ trn_ contact.
	 *
	 * @return the e i a number of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getEIANumber();

	/**
	 * Sets the e i a number of this c r m_ trn_ contact.
	 *
	 * @param EIANumber the e i a number of this c r m_ trn_ contact
	 */
	public void setEIANumber(String EIANumber);

	/**
	 * Returns the seq generator of this c r m_ trn_ contact.
	 *
	 * @return the seq generator of this c r m_ trn_ contact
	 */
	public int getSeqGenerator();

	/**
	 * Sets the seq generator of this c r m_ trn_ contact.
	 *
	 * @param SeqGenerator the seq generator of this c r m_ trn_ contact
	 */
	public void setSeqGenerator(int SeqGenerator);

	/**
	 * Returns the reference no of this c r m_ trn_ contact.
	 *
	 * @return the reference no of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getReferenceNo();

	/**
	 * Sets the reference no of this c r m_ trn_ contact.
	 *
	 * @param ReferenceNo the reference no of this c r m_ trn_ contact
	 */
	public void setReferenceNo(String ReferenceNo);

	/**
	 * Returns the e i a service provider of this c r m_ trn_ contact.
	 *
	 * @return the e i a service provider of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getEIAServiceProvider();

	/**
	 * Sets the e i a service provider of this c r m_ trn_ contact.
	 *
	 * @param EIAServiceProvider the e i a service provider of this c r m_ trn_ contact
	 */
	public void setEIAServiceProvider(String EIAServiceProvider);

	/**
	 * Returns the aadhar card no of this c r m_ trn_ contact.
	 *
	 * @return the aadhar card no of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getAadharCardNo();

	/**
	 * Sets the aadhar card no of this c r m_ trn_ contact.
	 *
	 * @param AadharCardNo the aadhar card no of this c r m_ trn_ contact
	 */
	public void setAadharCardNo(String AadharCardNo);

	/**
	 * Returns the wedding anniversary of this c r m_ trn_ contact.
	 *
	 * @return the wedding anniversary of this c r m_ trn_ contact
	 */
	public Date getWeddingAnniversary();

	/**
	 * Sets the wedding anniversary of this c r m_ trn_ contact.
	 *
	 * @param WeddingAnniversary the wedding anniversary of this c r m_ trn_ contact
	 */
	public void setWeddingAnniversary(Date WeddingAnniversary);

	/**
	 * Returns the photograph of this c r m_ trn_ contact.
	 *
	 * @return the photograph of this c r m_ trn_ contact
	 */
	public Blob getPhotograph();

	/**
	 * Sets the photograph of this c r m_ trn_ contact.
	 *
	 * @param Photograph the photograph of this c r m_ trn_ contact
	 */
	public void setPhotograph(Blob Photograph);

	/**
	 * Returns the created by of this c r m_ trn_ contact.
	 *
	 * @return the created by of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this c r m_ trn_ contact.
	 *
	 * @param CreatedBy the created by of this c r m_ trn_ contact
	 */
	public void setCreatedBy(String CreatedBy);

	/**
	 * Returns the created date of this c r m_ trn_ contact.
	 *
	 * @return the created date of this c r m_ trn_ contact
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this c r m_ trn_ contact.
	 *
	 * @param CreatedDate the created date of this c r m_ trn_ contact
	 */
	public void setCreatedDate(Date CreatedDate);

	/**
	 * Returns the modified by of this c r m_ trn_ contact.
	 *
	 * @return the modified by of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this c r m_ trn_ contact.
	 *
	 * @param ModifiedBy the modified by of this c r m_ trn_ contact
	 */
	public void setModifiedBy(String ModifiedBy);

	/**
	 * Returns the modified date of this c r m_ trn_ contact.
	 *
	 * @return the modified date of this c r m_ trn_ contact
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this c r m_ trn_ contact.
	 *
	 * @param ModifiedDate the modified date of this c r m_ trn_ contact
	 */
	public void setModifiedDate(Date ModifiedDate);

	/**
	 * Returns the is active of this c r m_ trn_ contact.
	 *
	 * @return the is active of this c r m_ trn_ contact
	 */
	@AutoEscape
	public String getIsActive();

	/**
	 * Sets the is active of this c r m_ trn_ contact.
	 *
	 * @param IsActive the is active of this c r m_ trn_ contact
	 */
	public void setIsActive(String IsActive);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CRM_Trn_Contact crm_Trn_Contact);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CRM_Trn_Contact> toCacheModel();

	@Override
	public CRM_Trn_Contact toEscapedModel();

	@Override
	public CRM_Trn_Contact toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}