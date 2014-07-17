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

import com.ifl.rapid.customer.service.CRM_Trn_ContactLocalServiceUtil;
import com.ifl.rapid.customer.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class CRM_Trn_ContactClp extends BaseModelImpl<CRM_Trn_Contact>
	implements CRM_Trn_Contact {
	public CRM_Trn_ContactClp() {
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
	public int getPrimaryKey() {
		return _ContactId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setContactId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ContactId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_ContactId = ContactId;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSalutation() {
		return _Salutation;
	}

	@Override
	public void setSalutation(String Salutation) {
		_Salutation = Salutation;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setSalutation", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, Salutation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstName() {
		return _FirstName;
	}

	@Override
	public void setFirstName(String FirstName) {
		_FirstName = FirstName;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, FirstName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMiddleName() {
		return _MiddleName;
	}

	@Override
	public void setMiddleName(String MiddleName) {
		_MiddleName = MiddleName;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, MiddleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastName() {
		return _LastName;
	}

	@Override
	public void setLastName(String LastName) {
		_LastName = LastName;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, LastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPANNo() {
		return _PANNo;
	}

	@Override
	public void setPANNo(String PANNo) {
		_PANNo = PANNo;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setPANNo", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, PANNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _Gender;
	}

	@Override
	public void setGender(String Gender) {
		_Gender = Gender;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, Gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBloodGroup() {
		return _BloodGroup;
	}

	@Override
	public void setBloodGroup(String BloodGroup) {
		_BloodGroup = BloodGroup;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setBloodGroup", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, BloodGroup);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _DateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date DateOfBirth) {
		_DateOfBirth = DateOfBirth;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_crm_Trn_ContactRemoteModel, DateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritalStatus() {
		return _MaritalStatus;
	}

	@Override
	public void setMaritalStatus(String MaritalStatus) {
		_MaritalStatus = MaritalStatus;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritalStatus", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, MaritalStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQualificationId() {
		return _QualificationId;
	}

	@Override
	public void setQualificationId(int QualificationId) {
		_QualificationId = QualificationId;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setQualificationId", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, QualificationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOccupationId() {
		return _OccupationId;
	}

	@Override
	public void setOccupationId(int OccupationId) {
		_OccupationId = OccupationId;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setOccupationId", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, OccupationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSourceId() {
		return _SourceId;
	}

	@Override
	public void setSourceId(int SourceId) {
		_SourceId = SourceId;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setSourceId", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, SourceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCategoryId() {
		return _CategoryId;
	}

	@Override
	public void setCategoryId(int CategoryId) {
		_CategoryId = CategoryId;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryId", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, CategoryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReferredBy() {
		return _ReferredBy;
	}

	@Override
	public void setReferredBy(int ReferredBy) {
		_ReferredBy = ReferredBy;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setReferredBy", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, ReferredBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getContactTypeId() {
		return _ContactTypeId;
	}

	@Override
	public void setContactTypeId(int ContactTypeId) {
		_ContactTypeId = ContactTypeId;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setContactTypeId", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, ContactTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getDNDActivated() {
		return _DNDActivated;
	}

	@Override
	public boolean isDNDActivated() {
		return _DNDActivated;
	}

	@Override
	public void setDNDActivated(boolean DNDActivated) {
		_DNDActivated = DNDActivated;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setDNDActivated", boolean.class);

				method.invoke(_crm_Trn_ContactRemoteModel, DNDActivated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getPoliticallyExposed() {
		return _PoliticallyExposed;
	}

	@Override
	public boolean isPoliticallyExposed() {
		return _PoliticallyExposed;
	}

	@Override
	public void setPoliticallyExposed(boolean PoliticallyExposed) {
		_PoliticallyExposed = PoliticallyExposed;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setPoliticallyExposed",
						boolean.class);

				method.invoke(_crm_Trn_ContactRemoteModel, PoliticallyExposed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEIANumber() {
		return _EIANumber;
	}

	@Override
	public void setEIANumber(String EIANumber) {
		_EIANumber = EIANumber;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setEIANumber", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, EIANumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSeqGenerator() {
		return _SeqGenerator;
	}

	@Override
	public void setSeqGenerator(int SeqGenerator) {
		_SeqGenerator = SeqGenerator;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setSeqGenerator", int.class);

				method.invoke(_crm_Trn_ContactRemoteModel, SeqGenerator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReferenceNo() {
		return _ReferenceNo;
	}

	@Override
	public void setReferenceNo(String ReferenceNo) {
		_ReferenceNo = ReferenceNo;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setReferenceNo", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, ReferenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEIAServiceProvider() {
		return _EIAServiceProvider;
	}

	@Override
	public void setEIAServiceProvider(String EIAServiceProvider) {
		_EIAServiceProvider = EIAServiceProvider;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setEIAServiceProvider",
						String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, EIAServiceProvider);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAadharCardNo() {
		return _AadharCardNo;
	}

	@Override
	public void setAadharCardNo(String AadharCardNo) {
		_AadharCardNo = AadharCardNo;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setAadharCardNo", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, AadharCardNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getWeddingAnniversary() {
		return _WeddingAnniversary;
	}

	@Override
	public void setWeddingAnniversary(Date WeddingAnniversary) {
		_WeddingAnniversary = WeddingAnniversary;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setWeddingAnniversary",
						Date.class);

				method.invoke(_crm_Trn_ContactRemoteModel, WeddingAnniversary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getPhotograph() {
		return _Photograph;
	}

	@Override
	public void setPhotograph(Blob Photograph) {
		_Photograph = Photograph;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setPhotograph", Blob.class);

				method.invoke(_crm_Trn_ContactRemoteModel, Photograph);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _CreatedBy;
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, CreatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_crm_Trn_ContactRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _ModifiedBy;
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_crm_Trn_ContactRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(String IsActive) {
		_IsActive = IsActive;

		if (_crm_Trn_ContactRemoteModel != null) {
			try {
				Class<?> clazz = _crm_Trn_ContactRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_crm_Trn_ContactRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCRM_Trn_ContactRemoteModel() {
		return _crm_Trn_ContactRemoteModel;
	}

	public void setCRM_Trn_ContactRemoteModel(
		BaseModel<?> crm_Trn_ContactRemoteModel) {
		_crm_Trn_ContactRemoteModel = crm_Trn_ContactRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _crm_Trn_ContactRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_crm_Trn_ContactRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRM_Trn_ContactLocalServiceUtil.addCRM_Trn_Contact(this);
		}
		else {
			CRM_Trn_ContactLocalServiceUtil.updateCRM_Trn_Contact(this);
		}
	}

	@Override
	public CRM_Trn_Contact toEscapedModel() {
		return (CRM_Trn_Contact)ProxyUtil.newProxyInstance(CRM_Trn_Contact.class.getClassLoader(),
			new Class[] { CRM_Trn_Contact.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CRM_Trn_ContactClp clone = new CRM_Trn_ContactClp();

		clone.setContactId(getContactId());
		clone.setSalutation(getSalutation());
		clone.setFirstName(getFirstName());
		clone.setMiddleName(getMiddleName());
		clone.setLastName(getLastName());
		clone.setPANNo(getPANNo());
		clone.setGender(getGender());
		clone.setBloodGroup(getBloodGroup());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setMaritalStatus(getMaritalStatus());
		clone.setQualificationId(getQualificationId());
		clone.setOccupationId(getOccupationId());
		clone.setSourceId(getSourceId());
		clone.setCategoryId(getCategoryId());
		clone.setReferredBy(getReferredBy());
		clone.setContactTypeId(getContactTypeId());
		clone.setDNDActivated(getDNDActivated());
		clone.setPoliticallyExposed(getPoliticallyExposed());
		clone.setEIANumber(getEIANumber());
		clone.setSeqGenerator(getSeqGenerator());
		clone.setReferenceNo(getReferenceNo());
		clone.setEIAServiceProvider(getEIAServiceProvider());
		clone.setAadharCardNo(getAadharCardNo());
		clone.setWeddingAnniversary(getWeddingAnniversary());
		clone.setPhotograph(getPhotograph());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(CRM_Trn_Contact crm_Trn_Contact) {
		int primaryKey = crm_Trn_Contact.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRM_Trn_ContactClp)) {
			return false;
		}

		CRM_Trn_ContactClp crm_Trn_Contact = (CRM_Trn_ContactClp)obj;

		int primaryKey = crm_Trn_Contact.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{ContactId=");
		sb.append(getContactId());
		sb.append(", Salutation=");
		sb.append(getSalutation());
		sb.append(", FirstName=");
		sb.append(getFirstName());
		sb.append(", MiddleName=");
		sb.append(getMiddleName());
		sb.append(", LastName=");
		sb.append(getLastName());
		sb.append(", PANNo=");
		sb.append(getPANNo());
		sb.append(", Gender=");
		sb.append(getGender());
		sb.append(", BloodGroup=");
		sb.append(getBloodGroup());
		sb.append(", DateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", MaritalStatus=");
		sb.append(getMaritalStatus());
		sb.append(", QualificationId=");
		sb.append(getQualificationId());
		sb.append(", OccupationId=");
		sb.append(getOccupationId());
		sb.append(", SourceId=");
		sb.append(getSourceId());
		sb.append(", CategoryId=");
		sb.append(getCategoryId());
		sb.append(", ReferredBy=");
		sb.append(getReferredBy());
		sb.append(", ContactTypeId=");
		sb.append(getContactTypeId());
		sb.append(", DNDActivated=");
		sb.append(getDNDActivated());
		sb.append(", PoliticallyExposed=");
		sb.append(getPoliticallyExposed());
		sb.append(", EIANumber=");
		sb.append(getEIANumber());
		sb.append(", SeqGenerator=");
		sb.append(getSeqGenerator());
		sb.append(", ReferenceNo=");
		sb.append(getReferenceNo());
		sb.append(", EIAServiceProvider=");
		sb.append(getEIAServiceProvider());
		sb.append(", AadharCardNo=");
		sb.append(getAadharCardNo());
		sb.append(", WeddingAnniversary=");
		sb.append(getWeddingAnniversary());
		sb.append(", Photograph=");
		sb.append(getPhotograph());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(94);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.CRM_Trn_Contact");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Salutation</column-name><column-value><![CDATA[");
		sb.append(getSalutation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FirstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MiddleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PANNo</column-name><column-value><![CDATA[");
		sb.append(getPANNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BloodGroup</column-name><column-value><![CDATA[");
		sb.append(getBloodGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaritalStatus</column-name><column-value><![CDATA[");
		sb.append(getMaritalStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QualificationId</column-name><column-value><![CDATA[");
		sb.append(getQualificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OccupationId</column-name><column-value><![CDATA[");
		sb.append(getOccupationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SourceId</column-name><column-value><![CDATA[");
		sb.append(getSourceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CategoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReferredBy</column-name><column-value><![CDATA[");
		sb.append(getReferredBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactTypeId</column-name><column-value><![CDATA[");
		sb.append(getContactTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DNDActivated</column-name><column-value><![CDATA[");
		sb.append(getDNDActivated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PoliticallyExposed</column-name><column-value><![CDATA[");
		sb.append(getPoliticallyExposed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EIANumber</column-name><column-value><![CDATA[");
		sb.append(getEIANumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SeqGenerator</column-name><column-value><![CDATA[");
		sb.append(getSeqGenerator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReferenceNo</column-name><column-value><![CDATA[");
		sb.append(getReferenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EIAServiceProvider</column-name><column-value><![CDATA[");
		sb.append(getEIAServiceProvider());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AadharCardNo</column-name><column-value><![CDATA[");
		sb.append(getAadharCardNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WeddingAnniversary</column-name><column-value><![CDATA[");
		sb.append(getWeddingAnniversary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Photograph</column-name><column-value><![CDATA[");
		sb.append(getPhotograph());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _crm_Trn_ContactRemoteModel;
}