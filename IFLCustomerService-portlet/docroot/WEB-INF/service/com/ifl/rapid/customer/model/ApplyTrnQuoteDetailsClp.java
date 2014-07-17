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

import com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalServiceUtil;
import com.ifl.rapid.customer.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class ApplyTrnQuoteDetailsClp extends BaseModelImpl<ApplyTrnQuoteDetails>
	implements ApplyTrnQuoteDetails {
	public ApplyTrnQuoteDetailsClp() {
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
	public String getPrimaryKey() {
		return _QuoteId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setQuoteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QuoteId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

	@Override
	public String getQuoteId() {
		return _QuoteId;
	}

	@Override
	public void setQuoteId(String QuoteId) {
		_QuoteId = QuoteId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setQuoteId", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, QuoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_ContactId = ContactId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, ContactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductId() {
		return _ProductId;
	}

	@Override
	public void setProductId(String ProductId) {
		_ProductId = ProductId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, ProductId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPremiumTypeId() {
		return _PremiumTypeId;
	}

	@Override
	public void setPremiumTypeId(String PremiumTypeId) {
		_PremiumTypeId = PremiumTypeId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumTypeId", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PremiumTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPremiumFrequencyId() {
		return _PremiumFrequencyId;
	}

	@Override
	public void setPremiumFrequencyId(String PremiumFrequencyId) {
		_PremiumFrequencyId = PremiumFrequencyId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumFrequencyId",
						String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel,
					PremiumFrequencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAssuredTerm() {
		return _AssuredTerm;
	}

	@Override
	public void setAssuredTerm(int AssuredTerm) {
		_AssuredTerm = AssuredTerm;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setAssuredTerm", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, AssuredTerm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAssuredAge() {
		return _AssuredAge;
	}

	@Override
	public void setAssuredAge(int AssuredAge) {
		_AssuredAge = AssuredAge;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setAssuredAge", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, AssuredAge);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDataXml() {
		return _DataXml;
	}

	@Override
	public void setDataXml(String DataXml) {
		_DataXml = DataXml;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDataXml", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, DataXml);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDeathBenefitOption() {
		return _DeathBenefitOption;
	}

	@Override
	public void setDeathBenefitOption(int DeathBenefitOption) {
		_DeathBenefitOption = DeathBenefitOption;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDeathBenefitOption",
						int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel,
					DeathBenefitOption);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExpiryDate() {
		return _ExpiryDate;
	}

	@Override
	public void setExpiryDate(Date ExpiryDate) {
		_ExpiryDate = ExpiryDate;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setExpiryDate", Date.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, ExpiryDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsStaff() {
		return _IsStaff;
	}

	@Override
	public void setIsStaff(String IsStaff) {
		_IsStaff = IsStaff;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsStaff", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, IsStaff);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(int IsActive) {
		_IsActive = IsActive;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPolicyOption() {
		return _PolicyOption;
	}

	@Override
	public void setPolicyOption(int PolicyOption) {
		_PolicyOption = PolicyOption;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPolicyOption", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PolicyOption);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPayingTerm() {
		return _PayingTerm;
	}

	@Override
	public void setPayingTerm(int PayingTerm) {
		_PayingTerm = PayingTerm;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPayingTerm", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PayingTerm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProposalStartDate() {
		return _ProposalStartDate;
	}

	@Override
	public void setProposalStartDate(String ProposalStartDate) {
		_ProposalStartDate = ProposalStartDate;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setProposalStartDate",
						String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel,
					ProposalStartDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRefNo() {
		return _RefNo;
	}

	@Override
	public void setRefNo(int RefNo) {
		_RefNo = RefNo;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRefNo", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, RefNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPlanTerm() {
		return _PlanTerm;
	}

	@Override
	public void setPlanTerm(int PlanTerm) {
		_PlanTerm = PlanTerm;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPlanTerm", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PlanTerm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPremiumTerm() {
		return _PremiumTerm;
	}

	@Override
	public void setPremiumTerm(int PremiumTerm) {
		_PremiumTerm = PremiumTerm;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumTerm", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PremiumTerm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumAmount", double.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PremiumAmount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSumAssured() {
		return _SumAssured;
	}

	@Override
	public void setSumAssured(double SumAssured) {
		_SumAssured = SumAssured;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSumAssured", double.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, SumAssured);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSummaryXml() {
		return _SummaryXml;
	}

	@Override
	public void setSummaryXml(String SummaryXml) {
		_SummaryXml = SummaryXml;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSummaryXml", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, SummaryXml);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPdfLocation() {
		return _PdfLocation;
	}

	@Override
	public void setPdfLocation(String PdfLocation) {
		_PdfLocation = PdfLocation;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPdfLocation", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, PdfLocation);
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

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, CreatedBy);
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

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, CreatedDate);
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

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, ModifiedDate);
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

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPdfDataXml() {
		return _pdfDataXml;
	}

	@Override
	public void setPdfDataXml(String pdfDataXml) {
		_pdfDataXml = pdfDataXml;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPdfDataXml", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, pdfDataXml);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsSmoker() {
		return _IsSmoker;
	}

	@Override
	public void setIsSmoker(int IsSmoker) {
		_IsSmoker = IsSmoker;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsSmoker", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, IsSmoker);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignatureFilePath() {
		return _SignatureFilePath;
	}

	@Override
	public void setSignatureFilePath(String SignatureFilePath) {
		_SignatureFilePath = SignatureFilePath;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSignatureFilePath",
						String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel,
					SignatureFilePath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBDMSignatureFilePath() {
		return _BDMSignatureFilePath;
	}

	@Override
	public void setBDMSignatureFilePath(String BDMSignatureFilePath) {
		_BDMSignatureFilePath = BDMSignatureFilePath;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBDMSignatureFilePath",
						String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel,
					BDMSignatureFilePath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBDMId() {
		return _BDMId;
	}

	@Override
	public void setBDMId(int BDMId) {
		_BDMId = BDMId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBDMId", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, BDMId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsAssisted() {
		return _IsAssisted;
	}

	@Override
	public void setIsAssisted(int IsAssisted) {
		_IsAssisted = IsAssisted;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsAssisted", int.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, IsAssisted);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInputXML() {
		return _InputXML;
	}

	@Override
	public void setInputXML(String InputXML) {
		_InputXML = InputXML;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setInputXML", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, InputXML);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLeadId() {
		return _LeadId;
	}

	@Override
	public void setLeadId(String LeadId) {
		_LeadId = LeadId;

		if (_applyTrnQuoteDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _applyTrnQuoteDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLeadId", String.class);

				method.invoke(_applyTrnQuoteDetailsRemoteModel, LeadId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApplyTrnQuoteDetailsRemoteModel() {
		return _applyTrnQuoteDetailsRemoteModel;
	}

	public void setApplyTrnQuoteDetailsRemoteModel(
		BaseModel<?> applyTrnQuoteDetailsRemoteModel) {
		_applyTrnQuoteDetailsRemoteModel = applyTrnQuoteDetailsRemoteModel;
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

		Class<?> remoteModelClass = _applyTrnQuoteDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_applyTrnQuoteDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApplyTrnQuoteDetailsLocalServiceUtil.addApplyTrnQuoteDetails(this);
		}
		else {
			ApplyTrnQuoteDetailsLocalServiceUtil.updateApplyTrnQuoteDetails(this);
		}
	}

	@Override
	public ApplyTrnQuoteDetails toEscapedModel() {
		return (ApplyTrnQuoteDetails)ProxyUtil.newProxyInstance(ApplyTrnQuoteDetails.class.getClassLoader(),
			new Class[] { ApplyTrnQuoteDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApplyTrnQuoteDetailsClp clone = new ApplyTrnQuoteDetailsClp();

		clone.setQuoteId(getQuoteId());
		clone.setContactId(getContactId());
		clone.setProductId(getProductId());
		clone.setPremiumTypeId(getPremiumTypeId());
		clone.setPremiumFrequencyId(getPremiumFrequencyId());
		clone.setAssuredTerm(getAssuredTerm());
		clone.setAssuredAge(getAssuredAge());
		clone.setDataXml(getDataXml());
		clone.setDeathBenefitOption(getDeathBenefitOption());
		clone.setExpiryDate(getExpiryDate());
		clone.setIsStaff(getIsStaff());
		clone.setIsActive(getIsActive());
		clone.setPolicyOption(getPolicyOption());
		clone.setPayingTerm(getPayingTerm());
		clone.setProposalStartDate(getProposalStartDate());
		clone.setRefNo(getRefNo());
		clone.setPlanTerm(getPlanTerm());
		clone.setPremiumTerm(getPremiumTerm());
		clone.setPremiumAmount(getPremiumAmount());
		clone.setSumAssured(getSumAssured());
		clone.setSummaryXml(getSummaryXml());
		clone.setPdfLocation(getPdfLocation());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setPdfDataXml(getPdfDataXml());
		clone.setIsSmoker(getIsSmoker());
		clone.setSignatureFilePath(getSignatureFilePath());
		clone.setBDMSignatureFilePath(getBDMSignatureFilePath());
		clone.setBDMId(getBDMId());
		clone.setIsAssisted(getIsAssisted());
		clone.setInputXML(getInputXML());
		clone.setLeadId(getLeadId());

		return clone;
	}

	@Override
	public int compareTo(ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		String primaryKey = applyTrnQuoteDetails.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplyTrnQuoteDetailsClp)) {
			return false;
		}

		ApplyTrnQuoteDetailsClp applyTrnQuoteDetails = (ApplyTrnQuoteDetailsClp)obj;

		String primaryKey = applyTrnQuoteDetails.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{QuoteId=");
		sb.append(getQuoteId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", ProductId=");
		sb.append(getProductId());
		sb.append(", PremiumTypeId=");
		sb.append(getPremiumTypeId());
		sb.append(", PremiumFrequencyId=");
		sb.append(getPremiumFrequencyId());
		sb.append(", AssuredTerm=");
		sb.append(getAssuredTerm());
		sb.append(", AssuredAge=");
		sb.append(getAssuredAge());
		sb.append(", DataXml=");
		sb.append(getDataXml());
		sb.append(", DeathBenefitOption=");
		sb.append(getDeathBenefitOption());
		sb.append(", ExpiryDate=");
		sb.append(getExpiryDate());
		sb.append(", IsStaff=");
		sb.append(getIsStaff());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", PolicyOption=");
		sb.append(getPolicyOption());
		sb.append(", PayingTerm=");
		sb.append(getPayingTerm());
		sb.append(", ProposalStartDate=");
		sb.append(getProposalStartDate());
		sb.append(", RefNo=");
		sb.append(getRefNo());
		sb.append(", PlanTerm=");
		sb.append(getPlanTerm());
		sb.append(", PremiumTerm=");
		sb.append(getPremiumTerm());
		sb.append(", PremiumAmount=");
		sb.append(getPremiumAmount());
		sb.append(", SumAssured=");
		sb.append(getSumAssured());
		sb.append(", SummaryXml=");
		sb.append(getSummaryXml());
		sb.append(", PdfLocation=");
		sb.append(getPdfLocation());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", pdfDataXml=");
		sb.append(getPdfDataXml());
		sb.append(", IsSmoker=");
		sb.append(getIsSmoker());
		sb.append(", SignatureFilePath=");
		sb.append(getSignatureFilePath());
		sb.append(", BDMSignatureFilePath=");
		sb.append(getBDMSignatureFilePath());
		sb.append(", BDMId=");
		sb.append(getBDMId());
		sb.append(", IsAssisted=");
		sb.append(getIsAssisted());
		sb.append(", InputXML=");
		sb.append(getInputXML());
		sb.append(", LeadId=");
		sb.append(getLeadId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(106);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.ApplyTrnQuoteDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QuoteId</column-name><column-value><![CDATA[");
		sb.append(getQuoteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProductId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumTypeId</column-name><column-value><![CDATA[");
		sb.append(getPremiumTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumFrequencyId</column-name><column-value><![CDATA[");
		sb.append(getPremiumFrequencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AssuredTerm</column-name><column-value><![CDATA[");
		sb.append(getAssuredTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AssuredAge</column-name><column-value><![CDATA[");
		sb.append(getAssuredAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DataXml</column-name><column-value><![CDATA[");
		sb.append(getDataXml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DeathBenefitOption</column-name><column-value><![CDATA[");
		sb.append(getDeathBenefitOption());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ExpiryDate</column-name><column-value><![CDATA[");
		sb.append(getExpiryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsStaff</column-name><column-value><![CDATA[");
		sb.append(getIsStaff());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyOption</column-name><column-value><![CDATA[");
		sb.append(getPolicyOption());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PayingTerm</column-name><column-value><![CDATA[");
		sb.append(getPayingTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProposalStartDate</column-name><column-value><![CDATA[");
		sb.append(getProposalStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RefNo</column-name><column-value><![CDATA[");
		sb.append(getRefNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PlanTerm</column-name><column-value><![CDATA[");
		sb.append(getPlanTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumTerm</column-name><column-value><![CDATA[");
		sb.append(getPremiumTerm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumAmount</column-name><column-value><![CDATA[");
		sb.append(getPremiumAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SumAssured</column-name><column-value><![CDATA[");
		sb.append(getSumAssured());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SummaryXml</column-name><column-value><![CDATA[");
		sb.append(getSummaryXml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PdfLocation</column-name><column-value><![CDATA[");
		sb.append(getPdfLocation());
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
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pdfDataXml</column-name><column-value><![CDATA[");
		sb.append(getPdfDataXml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsSmoker</column-name><column-value><![CDATA[");
		sb.append(getIsSmoker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SignatureFilePath</column-name><column-value><![CDATA[");
		sb.append(getSignatureFilePath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BDMSignatureFilePath</column-name><column-value><![CDATA[");
		sb.append(getBDMSignatureFilePath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BDMId</column-name><column-value><![CDATA[");
		sb.append(getBDMId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsAssisted</column-name><column-value><![CDATA[");
		sb.append(getIsAssisted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>InputXML</column-name><column-value><![CDATA[");
		sb.append(getInputXML());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LeadId</column-name><column-value><![CDATA[");
		sb.append(getLeadId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _QuoteId;
	private int _ContactId;
	private String _ProductId;
	private String _PremiumTypeId;
	private String _PremiumFrequencyId;
	private int _AssuredTerm;
	private int _AssuredAge;
	private String _DataXml;
	private int _DeathBenefitOption;
	private Date _ExpiryDate;
	private String _IsStaff;
	private int _IsActive;
	private int _PolicyOption;
	private int _PayingTerm;
	private String _ProposalStartDate;
	private int _RefNo;
	private int _PlanTerm;
	private int _PremiumTerm;
	private double _PremiumAmount;
	private double _SumAssured;
	private String _SummaryXml;
	private String _PdfLocation;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private String _pdfDataXml;
	private int _IsSmoker;
	private String _SignatureFilePath;
	private String _BDMSignatureFilePath;
	private int _BDMId;
	private int _IsAssisted;
	private String _InputXML;
	private String _LeadId;
	private BaseModel<?> _applyTrnQuoteDetailsRemoteModel;
}