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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CRMTrnFamilyMember}.
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnFamilyMember
 * @generated
 */
public class CRMTrnFamilyMemberWrapper implements CRMTrnFamilyMember,
	ModelWrapper<CRMTrnFamilyMember> {
	public CRMTrnFamilyMemberWrapper(CRMTrnFamilyMember crmTrnFamilyMember) {
		_crmTrnFamilyMember = crmTrnFamilyMember;
	}

	@Override
	public Class<?> getModelClass() {
		return CRMTrnFamilyMember.class;
	}

	@Override
	public String getModelClassName() {
		return CRMTrnFamilyMember.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FamilyMemberId", getFamilyMemberId());
		attributes.put("ContactId", getContactId());
		attributes.put("MemberId", getMemberId());
		attributes.put("RelationshipId", getRelationshipId());
		attributes.put("FinanciallyDependent", getFinanciallyDependent());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FamilyMemberId = (Integer)attributes.get("FamilyMemberId");

		if (FamilyMemberId != null) {
			setFamilyMemberId(FamilyMemberId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer MemberId = (Integer)attributes.get("MemberId");

		if (MemberId != null) {
			setMemberId(MemberId);
		}

		Integer RelationshipId = (Integer)attributes.get("RelationshipId");

		if (RelationshipId != null) {
			setRelationshipId(RelationshipId);
		}

		String FinanciallyDependent = (String)attributes.get(
				"FinanciallyDependent");

		if (FinanciallyDependent != null) {
			setFinanciallyDependent(FinanciallyDependent);
		}

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
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
	}

	/**
	* Returns the primary key of this c r m trn family member.
	*
	* @return the primary key of this c r m trn family member
	*/
	@Override
	public int getPrimaryKey() {
		return _crmTrnFamilyMember.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c r m trn family member.
	*
	* @param primaryKey the primary key of this c r m trn family member
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_crmTrnFamilyMember.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the family member ID of this c r m trn family member.
	*
	* @return the family member ID of this c r m trn family member
	*/
	@Override
	public int getFamilyMemberId() {
		return _crmTrnFamilyMember.getFamilyMemberId();
	}

	/**
	* Sets the family member ID of this c r m trn family member.
	*
	* @param FamilyMemberId the family member ID of this c r m trn family member
	*/
	@Override
	public void setFamilyMemberId(int FamilyMemberId) {
		_crmTrnFamilyMember.setFamilyMemberId(FamilyMemberId);
	}

	/**
	* Returns the contact ID of this c r m trn family member.
	*
	* @return the contact ID of this c r m trn family member
	*/
	@Override
	public int getContactId() {
		return _crmTrnFamilyMember.getContactId();
	}

	/**
	* Sets the contact ID of this c r m trn family member.
	*
	* @param ContactId the contact ID of this c r m trn family member
	*/
	@Override
	public void setContactId(int ContactId) {
		_crmTrnFamilyMember.setContactId(ContactId);
	}

	/**
	* Returns the member ID of this c r m trn family member.
	*
	* @return the member ID of this c r m trn family member
	*/
	@Override
	public int getMemberId() {
		return _crmTrnFamilyMember.getMemberId();
	}

	/**
	* Sets the member ID of this c r m trn family member.
	*
	* @param MemberId the member ID of this c r m trn family member
	*/
	@Override
	public void setMemberId(int MemberId) {
		_crmTrnFamilyMember.setMemberId(MemberId);
	}

	/**
	* Returns the relationship ID of this c r m trn family member.
	*
	* @return the relationship ID of this c r m trn family member
	*/
	@Override
	public int getRelationshipId() {
		return _crmTrnFamilyMember.getRelationshipId();
	}

	/**
	* Sets the relationship ID of this c r m trn family member.
	*
	* @param RelationshipId the relationship ID of this c r m trn family member
	*/
	@Override
	public void setRelationshipId(int RelationshipId) {
		_crmTrnFamilyMember.setRelationshipId(RelationshipId);
	}

	/**
	* Returns the financially dependent of this c r m trn family member.
	*
	* @return the financially dependent of this c r m trn family member
	*/
	@Override
	public java.lang.String getFinanciallyDependent() {
		return _crmTrnFamilyMember.getFinanciallyDependent();
	}

	/**
	* Sets the financially dependent of this c r m trn family member.
	*
	* @param FinanciallyDependent the financially dependent of this c r m trn family member
	*/
	@Override
	public void setFinanciallyDependent(java.lang.String FinanciallyDependent) {
		_crmTrnFamilyMember.setFinanciallyDependent(FinanciallyDependent);
	}

	/**
	* Returns the is active of this c r m trn family member.
	*
	* @return the is active of this c r m trn family member
	*/
	@Override
	public java.lang.String getIsActive() {
		return _crmTrnFamilyMember.getIsActive();
	}

	/**
	* Sets the is active of this c r m trn family member.
	*
	* @param IsActive the is active of this c r m trn family member
	*/
	@Override
	public void setIsActive(java.lang.String IsActive) {
		_crmTrnFamilyMember.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this c r m trn family member.
	*
	* @return the created by of this c r m trn family member
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _crmTrnFamilyMember.getCreatedBy();
	}

	/**
	* Sets the created by of this c r m trn family member.
	*
	* @param CreatedBy the created by of this c r m trn family member
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_crmTrnFamilyMember.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this c r m trn family member.
	*
	* @return the created date of this c r m trn family member
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _crmTrnFamilyMember.getCreatedDate();
	}

	/**
	* Sets the created date of this c r m trn family member.
	*
	* @param CreatedDate the created date of this c r m trn family member
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_crmTrnFamilyMember.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this c r m trn family member.
	*
	* @return the modified by of this c r m trn family member
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _crmTrnFamilyMember.getModifiedBy();
	}

	/**
	* Sets the modified by of this c r m trn family member.
	*
	* @param ModifiedBy the modified by of this c r m trn family member
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_crmTrnFamilyMember.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this c r m trn family member.
	*
	* @return the modified date of this c r m trn family member
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _crmTrnFamilyMember.getModifiedDate();
	}

	/**
	* Sets the modified date of this c r m trn family member.
	*
	* @param ModifiedDate the modified date of this c r m trn family member
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_crmTrnFamilyMember.setModifiedDate(ModifiedDate);
	}

	@Override
	public boolean isNew() {
		return _crmTrnFamilyMember.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_crmTrnFamilyMember.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _crmTrnFamilyMember.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_crmTrnFamilyMember.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _crmTrnFamilyMember.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _crmTrnFamilyMember.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_crmTrnFamilyMember.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _crmTrnFamilyMember.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_crmTrnFamilyMember.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_crmTrnFamilyMember.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_crmTrnFamilyMember.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CRMTrnFamilyMemberWrapper((CRMTrnFamilyMember)_crmTrnFamilyMember.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.CRMTrnFamilyMember crmTrnFamilyMember) {
		return _crmTrnFamilyMember.compareTo(crmTrnFamilyMember);
	}

	@Override
	public int hashCode() {
		return _crmTrnFamilyMember.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.CRMTrnFamilyMember> toCacheModel() {
		return _crmTrnFamilyMember.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember toEscapedModel() {
		return new CRMTrnFamilyMemberWrapper(_crmTrnFamilyMember.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.CRMTrnFamilyMember toUnescapedModel() {
		return new CRMTrnFamilyMemberWrapper(_crmTrnFamilyMember.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _crmTrnFamilyMember.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _crmTrnFamilyMember.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_crmTrnFamilyMember.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CRMTrnFamilyMemberWrapper)) {
			return false;
		}

		CRMTrnFamilyMemberWrapper crmTrnFamilyMemberWrapper = (CRMTrnFamilyMemberWrapper)obj;

		if (Validator.equals(_crmTrnFamilyMember,
					crmTrnFamilyMemberWrapper._crmTrnFamilyMember)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CRMTrnFamilyMember getWrappedCRMTrnFamilyMember() {
		return _crmTrnFamilyMember;
	}

	@Override
	public CRMTrnFamilyMember getWrappedModel() {
		return _crmTrnFamilyMember;
	}

	@Override
	public void resetOriginalValues() {
		_crmTrnFamilyMember.resetOriginalValues();
	}

	private CRMTrnFamilyMember _crmTrnFamilyMember;
}