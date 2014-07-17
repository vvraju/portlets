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
 * This class is a wrapper for {@link ApplyTrnQuoteDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnQuoteDetails
 * @generated
 */
public class ApplyTrnQuoteDetailsWrapper implements ApplyTrnQuoteDetails,
	ModelWrapper<ApplyTrnQuoteDetails> {
	public ApplyTrnQuoteDetailsWrapper(
		ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		_applyTrnQuoteDetails = applyTrnQuoteDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return ApplyTrnQuoteDetails.class;
	}

	@Override
	public String getModelClassName() {
		return ApplyTrnQuoteDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QuoteId", getQuoteId());
		attributes.put("ContactId", getContactId());
		attributes.put("ProductId", getProductId());
		attributes.put("PremiumTypeId", getPremiumTypeId());
		attributes.put("PremiumFrequencyId", getPremiumFrequencyId());
		attributes.put("AssuredTerm", getAssuredTerm());
		attributes.put("AssuredAge", getAssuredAge());
		attributes.put("DataXml", getDataXml());
		attributes.put("DeathBenefitOption", getDeathBenefitOption());
		attributes.put("ExpiryDate", getExpiryDate());
		attributes.put("IsStaff", getIsStaff());
		attributes.put("IsActive", getIsActive());
		attributes.put("PolicyOption", getPolicyOption());
		attributes.put("PayingTerm", getPayingTerm());
		attributes.put("ProposalStartDate", getProposalStartDate());
		attributes.put("RefNo", getRefNo());
		attributes.put("PlanTerm", getPlanTerm());
		attributes.put("PremiumTerm", getPremiumTerm());
		attributes.put("PremiumAmount", getPremiumAmount());
		attributes.put("SumAssured", getSumAssured());
		attributes.put("SummaryXml", getSummaryXml());
		attributes.put("PdfLocation", getPdfLocation());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("pdfDataXml", getPdfDataXml());
		attributes.put("IsSmoker", getIsSmoker());
		attributes.put("SignatureFilePath", getSignatureFilePath());
		attributes.put("BDMSignatureFilePath", getBDMSignatureFilePath());
		attributes.put("BDMId", getBDMId());
		attributes.put("IsAssisted", getIsAssisted());
		attributes.put("InputXML", getInputXML());
		attributes.put("LeadId", getLeadId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String QuoteId = (String)attributes.get("QuoteId");

		if (QuoteId != null) {
			setQuoteId(QuoteId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String ProductId = (String)attributes.get("ProductId");

		if (ProductId != null) {
			setProductId(ProductId);
		}

		String PremiumTypeId = (String)attributes.get("PremiumTypeId");

		if (PremiumTypeId != null) {
			setPremiumTypeId(PremiumTypeId);
		}

		String PremiumFrequencyId = (String)attributes.get("PremiumFrequencyId");

		if (PremiumFrequencyId != null) {
			setPremiumFrequencyId(PremiumFrequencyId);
		}

		Integer AssuredTerm = (Integer)attributes.get("AssuredTerm");

		if (AssuredTerm != null) {
			setAssuredTerm(AssuredTerm);
		}

		Integer AssuredAge = (Integer)attributes.get("AssuredAge");

		if (AssuredAge != null) {
			setAssuredAge(AssuredAge);
		}

		String DataXml = (String)attributes.get("DataXml");

		if (DataXml != null) {
			setDataXml(DataXml);
		}

		Integer DeathBenefitOption = (Integer)attributes.get(
				"DeathBenefitOption");

		if (DeathBenefitOption != null) {
			setDeathBenefitOption(DeathBenefitOption);
		}

		Date ExpiryDate = (Date)attributes.get("ExpiryDate");

		if (ExpiryDate != null) {
			setExpiryDate(ExpiryDate);
		}

		String IsStaff = (String)attributes.get("IsStaff");

		if (IsStaff != null) {
			setIsStaff(IsStaff);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		Integer PolicyOption = (Integer)attributes.get("PolicyOption");

		if (PolicyOption != null) {
			setPolicyOption(PolicyOption);
		}

		Integer PayingTerm = (Integer)attributes.get("PayingTerm");

		if (PayingTerm != null) {
			setPayingTerm(PayingTerm);
		}

		String ProposalStartDate = (String)attributes.get("ProposalStartDate");

		if (ProposalStartDate != null) {
			setProposalStartDate(ProposalStartDate);
		}

		Integer RefNo = (Integer)attributes.get("RefNo");

		if (RefNo != null) {
			setRefNo(RefNo);
		}

		Integer PlanTerm = (Integer)attributes.get("PlanTerm");

		if (PlanTerm != null) {
			setPlanTerm(PlanTerm);
		}

		Integer PremiumTerm = (Integer)attributes.get("PremiumTerm");

		if (PremiumTerm != null) {
			setPremiumTerm(PremiumTerm);
		}

		Double PremiumAmount = (Double)attributes.get("PremiumAmount");

		if (PremiumAmount != null) {
			setPremiumAmount(PremiumAmount);
		}

		Double SumAssured = (Double)attributes.get("SumAssured");

		if (SumAssured != null) {
			setSumAssured(SumAssured);
		}

		String SummaryXml = (String)attributes.get("SummaryXml");

		if (SummaryXml != null) {
			setSummaryXml(SummaryXml);
		}

		String PdfLocation = (String)attributes.get("PdfLocation");

		if (PdfLocation != null) {
			setPdfLocation(PdfLocation);
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

		String pdfDataXml = (String)attributes.get("pdfDataXml");

		if (pdfDataXml != null) {
			setPdfDataXml(pdfDataXml);
		}

		Integer IsSmoker = (Integer)attributes.get("IsSmoker");

		if (IsSmoker != null) {
			setIsSmoker(IsSmoker);
		}

		String SignatureFilePath = (String)attributes.get("SignatureFilePath");

		if (SignatureFilePath != null) {
			setSignatureFilePath(SignatureFilePath);
		}

		String BDMSignatureFilePath = (String)attributes.get(
				"BDMSignatureFilePath");

		if (BDMSignatureFilePath != null) {
			setBDMSignatureFilePath(BDMSignatureFilePath);
		}

		Integer BDMId = (Integer)attributes.get("BDMId");

		if (BDMId != null) {
			setBDMId(BDMId);
		}

		Integer IsAssisted = (Integer)attributes.get("IsAssisted");

		if (IsAssisted != null) {
			setIsAssisted(IsAssisted);
		}

		String InputXML = (String)attributes.get("InputXML");

		if (InputXML != null) {
			setInputXML(InputXML);
		}

		String LeadId = (String)attributes.get("LeadId");

		if (LeadId != null) {
			setLeadId(LeadId);
		}
	}

	/**
	* Returns the primary key of this apply trn quote details.
	*
	* @return the primary key of this apply trn quote details
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _applyTrnQuoteDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this apply trn quote details.
	*
	* @param primaryKey the primary key of this apply trn quote details
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_applyTrnQuoteDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the quote ID of this apply trn quote details.
	*
	* @return the quote ID of this apply trn quote details
	*/
	@Override
	public java.lang.String getQuoteId() {
		return _applyTrnQuoteDetails.getQuoteId();
	}

	/**
	* Sets the quote ID of this apply trn quote details.
	*
	* @param QuoteId the quote ID of this apply trn quote details
	*/
	@Override
	public void setQuoteId(java.lang.String QuoteId) {
		_applyTrnQuoteDetails.setQuoteId(QuoteId);
	}

	/**
	* Returns the contact ID of this apply trn quote details.
	*
	* @return the contact ID of this apply trn quote details
	*/
	@Override
	public int getContactId() {
		return _applyTrnQuoteDetails.getContactId();
	}

	/**
	* Sets the contact ID of this apply trn quote details.
	*
	* @param ContactId the contact ID of this apply trn quote details
	*/
	@Override
	public void setContactId(int ContactId) {
		_applyTrnQuoteDetails.setContactId(ContactId);
	}

	/**
	* Returns the product ID of this apply trn quote details.
	*
	* @return the product ID of this apply trn quote details
	*/
	@Override
	public java.lang.String getProductId() {
		return _applyTrnQuoteDetails.getProductId();
	}

	/**
	* Sets the product ID of this apply trn quote details.
	*
	* @param ProductId the product ID of this apply trn quote details
	*/
	@Override
	public void setProductId(java.lang.String ProductId) {
		_applyTrnQuoteDetails.setProductId(ProductId);
	}

	/**
	* Returns the premium type ID of this apply trn quote details.
	*
	* @return the premium type ID of this apply trn quote details
	*/
	@Override
	public java.lang.String getPremiumTypeId() {
		return _applyTrnQuoteDetails.getPremiumTypeId();
	}

	/**
	* Sets the premium type ID of this apply trn quote details.
	*
	* @param PremiumTypeId the premium type ID of this apply trn quote details
	*/
	@Override
	public void setPremiumTypeId(java.lang.String PremiumTypeId) {
		_applyTrnQuoteDetails.setPremiumTypeId(PremiumTypeId);
	}

	/**
	* Returns the premium frequency ID of this apply trn quote details.
	*
	* @return the premium frequency ID of this apply trn quote details
	*/
	@Override
	public java.lang.String getPremiumFrequencyId() {
		return _applyTrnQuoteDetails.getPremiumFrequencyId();
	}

	/**
	* Sets the premium frequency ID of this apply trn quote details.
	*
	* @param PremiumFrequencyId the premium frequency ID of this apply trn quote details
	*/
	@Override
	public void setPremiumFrequencyId(java.lang.String PremiumFrequencyId) {
		_applyTrnQuoteDetails.setPremiumFrequencyId(PremiumFrequencyId);
	}

	/**
	* Returns the assured term of this apply trn quote details.
	*
	* @return the assured term of this apply trn quote details
	*/
	@Override
	public int getAssuredTerm() {
		return _applyTrnQuoteDetails.getAssuredTerm();
	}

	/**
	* Sets the assured term of this apply trn quote details.
	*
	* @param AssuredTerm the assured term of this apply trn quote details
	*/
	@Override
	public void setAssuredTerm(int AssuredTerm) {
		_applyTrnQuoteDetails.setAssuredTerm(AssuredTerm);
	}

	/**
	* Returns the assured age of this apply trn quote details.
	*
	* @return the assured age of this apply trn quote details
	*/
	@Override
	public int getAssuredAge() {
		return _applyTrnQuoteDetails.getAssuredAge();
	}

	/**
	* Sets the assured age of this apply trn quote details.
	*
	* @param AssuredAge the assured age of this apply trn quote details
	*/
	@Override
	public void setAssuredAge(int AssuredAge) {
		_applyTrnQuoteDetails.setAssuredAge(AssuredAge);
	}

	/**
	* Returns the data xml of this apply trn quote details.
	*
	* @return the data xml of this apply trn quote details
	*/
	@Override
	public java.lang.String getDataXml() {
		return _applyTrnQuoteDetails.getDataXml();
	}

	/**
	* Sets the data xml of this apply trn quote details.
	*
	* @param DataXml the data xml of this apply trn quote details
	*/
	@Override
	public void setDataXml(java.lang.String DataXml) {
		_applyTrnQuoteDetails.setDataXml(DataXml);
	}

	/**
	* Returns the death benefit option of this apply trn quote details.
	*
	* @return the death benefit option of this apply trn quote details
	*/
	@Override
	public int getDeathBenefitOption() {
		return _applyTrnQuoteDetails.getDeathBenefitOption();
	}

	/**
	* Sets the death benefit option of this apply trn quote details.
	*
	* @param DeathBenefitOption the death benefit option of this apply trn quote details
	*/
	@Override
	public void setDeathBenefitOption(int DeathBenefitOption) {
		_applyTrnQuoteDetails.setDeathBenefitOption(DeathBenefitOption);
	}

	/**
	* Returns the expiry date of this apply trn quote details.
	*
	* @return the expiry date of this apply trn quote details
	*/
	@Override
	public java.util.Date getExpiryDate() {
		return _applyTrnQuoteDetails.getExpiryDate();
	}

	/**
	* Sets the expiry date of this apply trn quote details.
	*
	* @param ExpiryDate the expiry date of this apply trn quote details
	*/
	@Override
	public void setExpiryDate(java.util.Date ExpiryDate) {
		_applyTrnQuoteDetails.setExpiryDate(ExpiryDate);
	}

	/**
	* Returns the is staff of this apply trn quote details.
	*
	* @return the is staff of this apply trn quote details
	*/
	@Override
	public java.lang.String getIsStaff() {
		return _applyTrnQuoteDetails.getIsStaff();
	}

	/**
	* Sets the is staff of this apply trn quote details.
	*
	* @param IsStaff the is staff of this apply trn quote details
	*/
	@Override
	public void setIsStaff(java.lang.String IsStaff) {
		_applyTrnQuoteDetails.setIsStaff(IsStaff);
	}

	/**
	* Returns the is active of this apply trn quote details.
	*
	* @return the is active of this apply trn quote details
	*/
	@Override
	public int getIsActive() {
		return _applyTrnQuoteDetails.getIsActive();
	}

	/**
	* Sets the is active of this apply trn quote details.
	*
	* @param IsActive the is active of this apply trn quote details
	*/
	@Override
	public void setIsActive(int IsActive) {
		_applyTrnQuoteDetails.setIsActive(IsActive);
	}

	/**
	* Returns the policy option of this apply trn quote details.
	*
	* @return the policy option of this apply trn quote details
	*/
	@Override
	public int getPolicyOption() {
		return _applyTrnQuoteDetails.getPolicyOption();
	}

	/**
	* Sets the policy option of this apply trn quote details.
	*
	* @param PolicyOption the policy option of this apply trn quote details
	*/
	@Override
	public void setPolicyOption(int PolicyOption) {
		_applyTrnQuoteDetails.setPolicyOption(PolicyOption);
	}

	/**
	* Returns the paying term of this apply trn quote details.
	*
	* @return the paying term of this apply trn quote details
	*/
	@Override
	public int getPayingTerm() {
		return _applyTrnQuoteDetails.getPayingTerm();
	}

	/**
	* Sets the paying term of this apply trn quote details.
	*
	* @param PayingTerm the paying term of this apply trn quote details
	*/
	@Override
	public void setPayingTerm(int PayingTerm) {
		_applyTrnQuoteDetails.setPayingTerm(PayingTerm);
	}

	/**
	* Returns the proposal start date of this apply trn quote details.
	*
	* @return the proposal start date of this apply trn quote details
	*/
	@Override
	public java.lang.String getProposalStartDate() {
		return _applyTrnQuoteDetails.getProposalStartDate();
	}

	/**
	* Sets the proposal start date of this apply trn quote details.
	*
	* @param ProposalStartDate the proposal start date of this apply trn quote details
	*/
	@Override
	public void setProposalStartDate(java.lang.String ProposalStartDate) {
		_applyTrnQuoteDetails.setProposalStartDate(ProposalStartDate);
	}

	/**
	* Returns the ref no of this apply trn quote details.
	*
	* @return the ref no of this apply trn quote details
	*/
	@Override
	public int getRefNo() {
		return _applyTrnQuoteDetails.getRefNo();
	}

	/**
	* Sets the ref no of this apply trn quote details.
	*
	* @param RefNo the ref no of this apply trn quote details
	*/
	@Override
	public void setRefNo(int RefNo) {
		_applyTrnQuoteDetails.setRefNo(RefNo);
	}

	/**
	* Returns the plan term of this apply trn quote details.
	*
	* @return the plan term of this apply trn quote details
	*/
	@Override
	public int getPlanTerm() {
		return _applyTrnQuoteDetails.getPlanTerm();
	}

	/**
	* Sets the plan term of this apply trn quote details.
	*
	* @param PlanTerm the plan term of this apply trn quote details
	*/
	@Override
	public void setPlanTerm(int PlanTerm) {
		_applyTrnQuoteDetails.setPlanTerm(PlanTerm);
	}

	/**
	* Returns the premium term of this apply trn quote details.
	*
	* @return the premium term of this apply trn quote details
	*/
	@Override
	public int getPremiumTerm() {
		return _applyTrnQuoteDetails.getPremiumTerm();
	}

	/**
	* Sets the premium term of this apply trn quote details.
	*
	* @param PremiumTerm the premium term of this apply trn quote details
	*/
	@Override
	public void setPremiumTerm(int PremiumTerm) {
		_applyTrnQuoteDetails.setPremiumTerm(PremiumTerm);
	}

	/**
	* Returns the premium amount of this apply trn quote details.
	*
	* @return the premium amount of this apply trn quote details
	*/
	@Override
	public double getPremiumAmount() {
		return _applyTrnQuoteDetails.getPremiumAmount();
	}

	/**
	* Sets the premium amount of this apply trn quote details.
	*
	* @param PremiumAmount the premium amount of this apply trn quote details
	*/
	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_applyTrnQuoteDetails.setPremiumAmount(PremiumAmount);
	}

	/**
	* Returns the sum assured of this apply trn quote details.
	*
	* @return the sum assured of this apply trn quote details
	*/
	@Override
	public double getSumAssured() {
		return _applyTrnQuoteDetails.getSumAssured();
	}

	/**
	* Sets the sum assured of this apply trn quote details.
	*
	* @param SumAssured the sum assured of this apply trn quote details
	*/
	@Override
	public void setSumAssured(double SumAssured) {
		_applyTrnQuoteDetails.setSumAssured(SumAssured);
	}

	/**
	* Returns the summary xml of this apply trn quote details.
	*
	* @return the summary xml of this apply trn quote details
	*/
	@Override
	public java.lang.String getSummaryXml() {
		return _applyTrnQuoteDetails.getSummaryXml();
	}

	/**
	* Sets the summary xml of this apply trn quote details.
	*
	* @param SummaryXml the summary xml of this apply trn quote details
	*/
	@Override
	public void setSummaryXml(java.lang.String SummaryXml) {
		_applyTrnQuoteDetails.setSummaryXml(SummaryXml);
	}

	/**
	* Returns the pdf location of this apply trn quote details.
	*
	* @return the pdf location of this apply trn quote details
	*/
	@Override
	public java.lang.String getPdfLocation() {
		return _applyTrnQuoteDetails.getPdfLocation();
	}

	/**
	* Sets the pdf location of this apply trn quote details.
	*
	* @param PdfLocation the pdf location of this apply trn quote details
	*/
	@Override
	public void setPdfLocation(java.lang.String PdfLocation) {
		_applyTrnQuoteDetails.setPdfLocation(PdfLocation);
	}

	/**
	* Returns the created by of this apply trn quote details.
	*
	* @return the created by of this apply trn quote details
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _applyTrnQuoteDetails.getCreatedBy();
	}

	/**
	* Sets the created by of this apply trn quote details.
	*
	* @param CreatedBy the created by of this apply trn quote details
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_applyTrnQuoteDetails.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this apply trn quote details.
	*
	* @return the created date of this apply trn quote details
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _applyTrnQuoteDetails.getCreatedDate();
	}

	/**
	* Sets the created date of this apply trn quote details.
	*
	* @param CreatedDate the created date of this apply trn quote details
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_applyTrnQuoteDetails.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this apply trn quote details.
	*
	* @return the modified date of this apply trn quote details
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _applyTrnQuoteDetails.getModifiedDate();
	}

	/**
	* Sets the modified date of this apply trn quote details.
	*
	* @param ModifiedDate the modified date of this apply trn quote details
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_applyTrnQuoteDetails.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this apply trn quote details.
	*
	* @return the modified by of this apply trn quote details
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _applyTrnQuoteDetails.getModifiedBy();
	}

	/**
	* Sets the modified by of this apply trn quote details.
	*
	* @param ModifiedBy the modified by of this apply trn quote details
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_applyTrnQuoteDetails.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the pdf data xml of this apply trn quote details.
	*
	* @return the pdf data xml of this apply trn quote details
	*/
	@Override
	public java.lang.String getPdfDataXml() {
		return _applyTrnQuoteDetails.getPdfDataXml();
	}

	/**
	* Sets the pdf data xml of this apply trn quote details.
	*
	* @param pdfDataXml the pdf data xml of this apply trn quote details
	*/
	@Override
	public void setPdfDataXml(java.lang.String pdfDataXml) {
		_applyTrnQuoteDetails.setPdfDataXml(pdfDataXml);
	}

	/**
	* Returns the is smoker of this apply trn quote details.
	*
	* @return the is smoker of this apply trn quote details
	*/
	@Override
	public int getIsSmoker() {
		return _applyTrnQuoteDetails.getIsSmoker();
	}

	/**
	* Sets the is smoker of this apply trn quote details.
	*
	* @param IsSmoker the is smoker of this apply trn quote details
	*/
	@Override
	public void setIsSmoker(int IsSmoker) {
		_applyTrnQuoteDetails.setIsSmoker(IsSmoker);
	}

	/**
	* Returns the signature file path of this apply trn quote details.
	*
	* @return the signature file path of this apply trn quote details
	*/
	@Override
	public java.lang.String getSignatureFilePath() {
		return _applyTrnQuoteDetails.getSignatureFilePath();
	}

	/**
	* Sets the signature file path of this apply trn quote details.
	*
	* @param SignatureFilePath the signature file path of this apply trn quote details
	*/
	@Override
	public void setSignatureFilePath(java.lang.String SignatureFilePath) {
		_applyTrnQuoteDetails.setSignatureFilePath(SignatureFilePath);
	}

	/**
	* Returns the b d m signature file path of this apply trn quote details.
	*
	* @return the b d m signature file path of this apply trn quote details
	*/
	@Override
	public java.lang.String getBDMSignatureFilePath() {
		return _applyTrnQuoteDetails.getBDMSignatureFilePath();
	}

	/**
	* Sets the b d m signature file path of this apply trn quote details.
	*
	* @param BDMSignatureFilePath the b d m signature file path of this apply trn quote details
	*/
	@Override
	public void setBDMSignatureFilePath(java.lang.String BDMSignatureFilePath) {
		_applyTrnQuoteDetails.setBDMSignatureFilePath(BDMSignatureFilePath);
	}

	/**
	* Returns the b d m ID of this apply trn quote details.
	*
	* @return the b d m ID of this apply trn quote details
	*/
	@Override
	public int getBDMId() {
		return _applyTrnQuoteDetails.getBDMId();
	}

	/**
	* Sets the b d m ID of this apply trn quote details.
	*
	* @param BDMId the b d m ID of this apply trn quote details
	*/
	@Override
	public void setBDMId(int BDMId) {
		_applyTrnQuoteDetails.setBDMId(BDMId);
	}

	/**
	* Returns the is assisted of this apply trn quote details.
	*
	* @return the is assisted of this apply trn quote details
	*/
	@Override
	public int getIsAssisted() {
		return _applyTrnQuoteDetails.getIsAssisted();
	}

	/**
	* Sets the is assisted of this apply trn quote details.
	*
	* @param IsAssisted the is assisted of this apply trn quote details
	*/
	@Override
	public void setIsAssisted(int IsAssisted) {
		_applyTrnQuoteDetails.setIsAssisted(IsAssisted);
	}

	/**
	* Returns the input x m l of this apply trn quote details.
	*
	* @return the input x m l of this apply trn quote details
	*/
	@Override
	public java.lang.String getInputXML() {
		return _applyTrnQuoteDetails.getInputXML();
	}

	/**
	* Sets the input x m l of this apply trn quote details.
	*
	* @param InputXML the input x m l of this apply trn quote details
	*/
	@Override
	public void setInputXML(java.lang.String InputXML) {
		_applyTrnQuoteDetails.setInputXML(InputXML);
	}

	/**
	* Returns the lead ID of this apply trn quote details.
	*
	* @return the lead ID of this apply trn quote details
	*/
	@Override
	public java.lang.String getLeadId() {
		return _applyTrnQuoteDetails.getLeadId();
	}

	/**
	* Sets the lead ID of this apply trn quote details.
	*
	* @param LeadId the lead ID of this apply trn quote details
	*/
	@Override
	public void setLeadId(java.lang.String LeadId) {
		_applyTrnQuoteDetails.setLeadId(LeadId);
	}

	@Override
	public boolean isNew() {
		return _applyTrnQuoteDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_applyTrnQuoteDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _applyTrnQuoteDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_applyTrnQuoteDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _applyTrnQuoteDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _applyTrnQuoteDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_applyTrnQuoteDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _applyTrnQuoteDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_applyTrnQuoteDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_applyTrnQuoteDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_applyTrnQuoteDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApplyTrnQuoteDetailsWrapper((ApplyTrnQuoteDetails)_applyTrnQuoteDetails.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		return _applyTrnQuoteDetails.compareTo(applyTrnQuoteDetails);
	}

	@Override
	public int hashCode() {
		return _applyTrnQuoteDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.ApplyTrnQuoteDetails> toCacheModel() {
		return _applyTrnQuoteDetails.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails toEscapedModel() {
		return new ApplyTrnQuoteDetailsWrapper(_applyTrnQuoteDetails.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.ApplyTrnQuoteDetails toUnescapedModel() {
		return new ApplyTrnQuoteDetailsWrapper(_applyTrnQuoteDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _applyTrnQuoteDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _applyTrnQuoteDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_applyTrnQuoteDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplyTrnQuoteDetailsWrapper)) {
			return false;
		}

		ApplyTrnQuoteDetailsWrapper applyTrnQuoteDetailsWrapper = (ApplyTrnQuoteDetailsWrapper)obj;

		if (Validator.equals(_applyTrnQuoteDetails,
					applyTrnQuoteDetailsWrapper._applyTrnQuoteDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ApplyTrnQuoteDetails getWrappedApplyTrnQuoteDetails() {
		return _applyTrnQuoteDetails;
	}

	@Override
	public ApplyTrnQuoteDetails getWrappedModel() {
		return _applyTrnQuoteDetails;
	}

	@Override
	public void resetOriginalValues() {
		_applyTrnQuoteDetails.resetOriginalValues();
	}

	private ApplyTrnQuoteDetails _applyTrnQuoteDetails;
}