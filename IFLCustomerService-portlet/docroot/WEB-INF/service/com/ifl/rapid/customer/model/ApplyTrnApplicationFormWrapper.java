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
 * This class is a wrapper for {@link ApplyTrnApplicationForm}.
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnApplicationForm
 * @generated
 */
public class ApplyTrnApplicationFormWrapper implements ApplyTrnApplicationForm,
	ModelWrapper<ApplyTrnApplicationForm> {
	public ApplyTrnApplicationFormWrapper(
		ApplyTrnApplicationForm applyTrnApplicationForm) {
		_applyTrnApplicationForm = applyTrnApplicationForm;
	}

	@Override
	public Class<?> getModelClass() {
		return ApplyTrnApplicationForm.class;
	}

	@Override
	public String getModelClassName() {
		return ApplyTrnApplicationForm.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ApplicationFormId", getApplicationFormId());
		attributes.put("QuoteId", getQuoteId());
		attributes.put("ApplicationRefNo", getApplicationRefNo());
		attributes.put("SeqGenerator", getSeqGenerator());
		attributes.put("LTRFFormRefNo", getLTRFFormRefNo());
		attributes.put("PremiumAmount", getPremiumAmount());
		attributes.put("IsMedicalRequired", getIsMedicalRequired());
		attributes.put("ShortPremium", getShortPremium());
		attributes.put("PremiumDueDate", getPremiumDueDate());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("PolicyElapsedDate", getPolicyElapsedDate());
		attributes.put("PolicyIssueDate", getPolicyIssueDate());
		attributes.put("Status", getStatus());
		attributes.put("Completion", getCompletion());
		attributes.put("IsLapsed", getIsLapsed());
		attributes.put("NextPremiumDueDate", getNextPremiumDueDate());
		attributes.put("PolicyStatus", getPolicyStatus());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String ApplicationFormId = (String)attributes.get("ApplicationFormId");

		if (ApplicationFormId != null) {
			setApplicationFormId(ApplicationFormId);
		}

		String QuoteId = (String)attributes.get("QuoteId");

		if (QuoteId != null) {
			setQuoteId(QuoteId);
		}

		String ApplicationRefNo = (String)attributes.get("ApplicationRefNo");

		if (ApplicationRefNo != null) {
			setApplicationRefNo(ApplicationRefNo);
		}

		Integer SeqGenerator = (Integer)attributes.get("SeqGenerator");

		if (SeqGenerator != null) {
			setSeqGenerator(SeqGenerator);
		}

		String LTRFFormRefNo = (String)attributes.get("LTRFFormRefNo");

		if (LTRFFormRefNo != null) {
			setLTRFFormRefNo(LTRFFormRefNo);
		}

		Double PremiumAmount = (Double)attributes.get("PremiumAmount");

		if (PremiumAmount != null) {
			setPremiumAmount(PremiumAmount);
		}

		Integer IsMedicalRequired = (Integer)attributes.get("IsMedicalRequired");

		if (IsMedicalRequired != null) {
			setIsMedicalRequired(IsMedicalRequired);
		}

		Double ShortPremium = (Double)attributes.get("ShortPremium");

		if (ShortPremium != null) {
			setShortPremium(ShortPremium);
		}

		Date PremiumDueDate = (Date)attributes.get("PremiumDueDate");

		if (PremiumDueDate != null) {
			setPremiumDueDate(PremiumDueDate);
		}

		String PolicyNo = (String)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		Date PolicyElapsedDate = (Date)attributes.get("PolicyElapsedDate");

		if (PolicyElapsedDate != null) {
			setPolicyElapsedDate(PolicyElapsedDate);
		}

		Date PolicyIssueDate = (Date)attributes.get("PolicyIssueDate");

		if (PolicyIssueDate != null) {
			setPolicyIssueDate(PolicyIssueDate);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		Integer Completion = (Integer)attributes.get("Completion");

		if (Completion != null) {
			setCompletion(Completion);
		}

		Integer IsLapsed = (Integer)attributes.get("IsLapsed");

		if (IsLapsed != null) {
			setIsLapsed(IsLapsed);
		}

		Date NextPremiumDueDate = (Date)attributes.get("NextPremiumDueDate");

		if (NextPremiumDueDate != null) {
			setNextPremiumDueDate(NextPremiumDueDate);
		}

		String PolicyStatus = (String)attributes.get("PolicyStatus");

		if (PolicyStatus != null) {
			setPolicyStatus(PolicyStatus);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

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

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}
	}

	/**
	* Returns the primary key of this apply trn application form.
	*
	* @return the primary key of this apply trn application form
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _applyTrnApplicationForm.getPrimaryKey();
	}

	/**
	* Sets the primary key of this apply trn application form.
	*
	* @param primaryKey the primary key of this apply trn application form
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_applyTrnApplicationForm.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the application form ID of this apply trn application form.
	*
	* @return the application form ID of this apply trn application form
	*/
	@Override
	public java.lang.String getApplicationFormId() {
		return _applyTrnApplicationForm.getApplicationFormId();
	}

	/**
	* Sets the application form ID of this apply trn application form.
	*
	* @param ApplicationFormId the application form ID of this apply trn application form
	*/
	@Override
	public void setApplicationFormId(java.lang.String ApplicationFormId) {
		_applyTrnApplicationForm.setApplicationFormId(ApplicationFormId);
	}

	/**
	* Returns the quote ID of this apply trn application form.
	*
	* @return the quote ID of this apply trn application form
	*/
	@Override
	public java.lang.String getQuoteId() {
		return _applyTrnApplicationForm.getQuoteId();
	}

	/**
	* Sets the quote ID of this apply trn application form.
	*
	* @param QuoteId the quote ID of this apply trn application form
	*/
	@Override
	public void setQuoteId(java.lang.String QuoteId) {
		_applyTrnApplicationForm.setQuoteId(QuoteId);
	}

	/**
	* Returns the application ref no of this apply trn application form.
	*
	* @return the application ref no of this apply trn application form
	*/
	@Override
	public java.lang.String getApplicationRefNo() {
		return _applyTrnApplicationForm.getApplicationRefNo();
	}

	/**
	* Sets the application ref no of this apply trn application form.
	*
	* @param ApplicationRefNo the application ref no of this apply trn application form
	*/
	@Override
	public void setApplicationRefNo(java.lang.String ApplicationRefNo) {
		_applyTrnApplicationForm.setApplicationRefNo(ApplicationRefNo);
	}

	/**
	* Returns the seq generator of this apply trn application form.
	*
	* @return the seq generator of this apply trn application form
	*/
	@Override
	public int getSeqGenerator() {
		return _applyTrnApplicationForm.getSeqGenerator();
	}

	/**
	* Sets the seq generator of this apply trn application form.
	*
	* @param SeqGenerator the seq generator of this apply trn application form
	*/
	@Override
	public void setSeqGenerator(int SeqGenerator) {
		_applyTrnApplicationForm.setSeqGenerator(SeqGenerator);
	}

	/**
	* Returns the l t r f form ref no of this apply trn application form.
	*
	* @return the l t r f form ref no of this apply trn application form
	*/
	@Override
	public java.lang.String getLTRFFormRefNo() {
		return _applyTrnApplicationForm.getLTRFFormRefNo();
	}

	/**
	* Sets the l t r f form ref no of this apply trn application form.
	*
	* @param LTRFFormRefNo the l t r f form ref no of this apply trn application form
	*/
	@Override
	public void setLTRFFormRefNo(java.lang.String LTRFFormRefNo) {
		_applyTrnApplicationForm.setLTRFFormRefNo(LTRFFormRefNo);
	}

	/**
	* Returns the premium amount of this apply trn application form.
	*
	* @return the premium amount of this apply trn application form
	*/
	@Override
	public double getPremiumAmount() {
		return _applyTrnApplicationForm.getPremiumAmount();
	}

	/**
	* Sets the premium amount of this apply trn application form.
	*
	* @param PremiumAmount the premium amount of this apply trn application form
	*/
	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_applyTrnApplicationForm.setPremiumAmount(PremiumAmount);
	}

	/**
	* Returns the is medical required of this apply trn application form.
	*
	* @return the is medical required of this apply trn application form
	*/
	@Override
	public int getIsMedicalRequired() {
		return _applyTrnApplicationForm.getIsMedicalRequired();
	}

	/**
	* Sets the is medical required of this apply trn application form.
	*
	* @param IsMedicalRequired the is medical required of this apply trn application form
	*/
	@Override
	public void setIsMedicalRequired(int IsMedicalRequired) {
		_applyTrnApplicationForm.setIsMedicalRequired(IsMedicalRequired);
	}

	/**
	* Returns the short premium of this apply trn application form.
	*
	* @return the short premium of this apply trn application form
	*/
	@Override
	public double getShortPremium() {
		return _applyTrnApplicationForm.getShortPremium();
	}

	/**
	* Sets the short premium of this apply trn application form.
	*
	* @param ShortPremium the short premium of this apply trn application form
	*/
	@Override
	public void setShortPremium(double ShortPremium) {
		_applyTrnApplicationForm.setShortPremium(ShortPremium);
	}

	/**
	* Returns the premium due date of this apply trn application form.
	*
	* @return the premium due date of this apply trn application form
	*/
	@Override
	public java.util.Date getPremiumDueDate() {
		return _applyTrnApplicationForm.getPremiumDueDate();
	}

	/**
	* Sets the premium due date of this apply trn application form.
	*
	* @param PremiumDueDate the premium due date of this apply trn application form
	*/
	@Override
	public void setPremiumDueDate(java.util.Date PremiumDueDate) {
		_applyTrnApplicationForm.setPremiumDueDate(PremiumDueDate);
	}

	/**
	* Returns the policy no of this apply trn application form.
	*
	* @return the policy no of this apply trn application form
	*/
	@Override
	public java.lang.String getPolicyNo() {
		return _applyTrnApplicationForm.getPolicyNo();
	}

	/**
	* Sets the policy no of this apply trn application form.
	*
	* @param PolicyNo the policy no of this apply trn application form
	*/
	@Override
	public void setPolicyNo(java.lang.String PolicyNo) {
		_applyTrnApplicationForm.setPolicyNo(PolicyNo);
	}

	/**
	* Returns the policy elapsed date of this apply trn application form.
	*
	* @return the policy elapsed date of this apply trn application form
	*/
	@Override
	public java.util.Date getPolicyElapsedDate() {
		return _applyTrnApplicationForm.getPolicyElapsedDate();
	}

	/**
	* Sets the policy elapsed date of this apply trn application form.
	*
	* @param PolicyElapsedDate the policy elapsed date of this apply trn application form
	*/
	@Override
	public void setPolicyElapsedDate(java.util.Date PolicyElapsedDate) {
		_applyTrnApplicationForm.setPolicyElapsedDate(PolicyElapsedDate);
	}

	/**
	* Returns the policy issue date of this apply trn application form.
	*
	* @return the policy issue date of this apply trn application form
	*/
	@Override
	public java.util.Date getPolicyIssueDate() {
		return _applyTrnApplicationForm.getPolicyIssueDate();
	}

	/**
	* Sets the policy issue date of this apply trn application form.
	*
	* @param PolicyIssueDate the policy issue date of this apply trn application form
	*/
	@Override
	public void setPolicyIssueDate(java.util.Date PolicyIssueDate) {
		_applyTrnApplicationForm.setPolicyIssueDate(PolicyIssueDate);
	}

	/**
	* Returns the status of this apply trn application form.
	*
	* @return the status of this apply trn application form
	*/
	@Override
	public java.lang.String getStatus() {
		return _applyTrnApplicationForm.getStatus();
	}

	/**
	* Sets the status of this apply trn application form.
	*
	* @param Status the status of this apply trn application form
	*/
	@Override
	public void setStatus(java.lang.String Status) {
		_applyTrnApplicationForm.setStatus(Status);
	}

	/**
	* Returns the completion of this apply trn application form.
	*
	* @return the completion of this apply trn application form
	*/
	@Override
	public int getCompletion() {
		return _applyTrnApplicationForm.getCompletion();
	}

	/**
	* Sets the completion of this apply trn application form.
	*
	* @param Completion the completion of this apply trn application form
	*/
	@Override
	public void setCompletion(int Completion) {
		_applyTrnApplicationForm.setCompletion(Completion);
	}

	/**
	* Returns the is lapsed of this apply trn application form.
	*
	* @return the is lapsed of this apply trn application form
	*/
	@Override
	public int getIsLapsed() {
		return _applyTrnApplicationForm.getIsLapsed();
	}

	/**
	* Sets the is lapsed of this apply trn application form.
	*
	* @param IsLapsed the is lapsed of this apply trn application form
	*/
	@Override
	public void setIsLapsed(int IsLapsed) {
		_applyTrnApplicationForm.setIsLapsed(IsLapsed);
	}

	/**
	* Returns the next premium due date of this apply trn application form.
	*
	* @return the next premium due date of this apply trn application form
	*/
	@Override
	public java.util.Date getNextPremiumDueDate() {
		return _applyTrnApplicationForm.getNextPremiumDueDate();
	}

	/**
	* Sets the next premium due date of this apply trn application form.
	*
	* @param NextPremiumDueDate the next premium due date of this apply trn application form
	*/
	@Override
	public void setNextPremiumDueDate(java.util.Date NextPremiumDueDate) {
		_applyTrnApplicationForm.setNextPremiumDueDate(NextPremiumDueDate);
	}

	/**
	* Returns the policy status of this apply trn application form.
	*
	* @return the policy status of this apply trn application form
	*/
	@Override
	public java.lang.String getPolicyStatus() {
		return _applyTrnApplicationForm.getPolicyStatus();
	}

	/**
	* Sets the policy status of this apply trn application form.
	*
	* @param PolicyStatus the policy status of this apply trn application form
	*/
	@Override
	public void setPolicyStatus(java.lang.String PolicyStatus) {
		_applyTrnApplicationForm.setPolicyStatus(PolicyStatus);
	}

	/**
	* Returns the is active of this apply trn application form.
	*
	* @return the is active of this apply trn application form
	*/
	@Override
	public int getIsActive() {
		return _applyTrnApplicationForm.getIsActive();
	}

	/**
	* Sets the is active of this apply trn application form.
	*
	* @param IsActive the is active of this apply trn application form
	*/
	@Override
	public void setIsActive(int IsActive) {
		_applyTrnApplicationForm.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this apply trn application form.
	*
	* @return the created by of this apply trn application form
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _applyTrnApplicationForm.getCreatedBy();
	}

	/**
	* Sets the created by of this apply trn application form.
	*
	* @param CreatedBy the created by of this apply trn application form
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_applyTrnApplicationForm.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this apply trn application form.
	*
	* @return the created date of this apply trn application form
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _applyTrnApplicationForm.getCreatedDate();
	}

	/**
	* Sets the created date of this apply trn application form.
	*
	* @param CreatedDate the created date of this apply trn application form
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_applyTrnApplicationForm.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this apply trn application form.
	*
	* @return the modified date of this apply trn application form
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _applyTrnApplicationForm.getModifiedDate();
	}

	/**
	* Sets the modified date of this apply trn application form.
	*
	* @param ModifiedDate the modified date of this apply trn application form
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_applyTrnApplicationForm.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this apply trn application form.
	*
	* @return the modified by of this apply trn application form
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _applyTrnApplicationForm.getModifiedBy();
	}

	/**
	* Sets the modified by of this apply trn application form.
	*
	* @param ModifiedBy the modified by of this apply trn application form
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_applyTrnApplicationForm.setModifiedBy(ModifiedBy);
	}

	@Override
	public boolean isNew() {
		return _applyTrnApplicationForm.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_applyTrnApplicationForm.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _applyTrnApplicationForm.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_applyTrnApplicationForm.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _applyTrnApplicationForm.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _applyTrnApplicationForm.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_applyTrnApplicationForm.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _applyTrnApplicationForm.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_applyTrnApplicationForm.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_applyTrnApplicationForm.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_applyTrnApplicationForm.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApplyTrnApplicationFormWrapper((ApplyTrnApplicationForm)_applyTrnApplicationForm.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.ApplyTrnApplicationForm applyTrnApplicationForm) {
		return _applyTrnApplicationForm.compareTo(applyTrnApplicationForm);
	}

	@Override
	public int hashCode() {
		return _applyTrnApplicationForm.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.ApplyTrnApplicationForm> toCacheModel() {
		return _applyTrnApplicationForm.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm toEscapedModel() {
		return new ApplyTrnApplicationFormWrapper(_applyTrnApplicationForm.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.ApplyTrnApplicationForm toUnescapedModel() {
		return new ApplyTrnApplicationFormWrapper(_applyTrnApplicationForm.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _applyTrnApplicationForm.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _applyTrnApplicationForm.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_applyTrnApplicationForm.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplyTrnApplicationFormWrapper)) {
			return false;
		}

		ApplyTrnApplicationFormWrapper applyTrnApplicationFormWrapper = (ApplyTrnApplicationFormWrapper)obj;

		if (Validator.equals(_applyTrnApplicationForm,
					applyTrnApplicationFormWrapper._applyTrnApplicationForm)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ApplyTrnApplicationForm getWrappedApplyTrnApplicationForm() {
		return _applyTrnApplicationForm;
	}

	@Override
	public ApplyTrnApplicationForm getWrappedModel() {
		return _applyTrnApplicationForm;
	}

	@Override
	public void resetOriginalValues() {
		_applyTrnApplicationForm.resetOriginalValues();
	}

	private ApplyTrnApplicationForm _applyTrnApplicationForm;
}