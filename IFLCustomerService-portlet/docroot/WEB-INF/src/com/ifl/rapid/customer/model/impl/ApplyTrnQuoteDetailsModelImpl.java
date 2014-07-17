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

package com.ifl.rapid.customer.model.impl;

import com.ifl.rapid.customer.model.ApplyTrnQuoteDetails;
import com.ifl.rapid.customer.model.ApplyTrnQuoteDetailsModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ApplyTrnQuoteDetails service. Represents a row in the &quot;Apply_Trn_QuoteDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.ApplyTrnQuoteDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ApplyTrnQuoteDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnQuoteDetailsImpl
 * @see com.ifl.rapid.customer.model.ApplyTrnQuoteDetails
 * @see com.ifl.rapid.customer.model.ApplyTrnQuoteDetailsModel
 * @generated
 */
public class ApplyTrnQuoteDetailsModelImpl extends BaseModelImpl<ApplyTrnQuoteDetails>
	implements ApplyTrnQuoteDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a apply trn quote details model instance should use the {@link com.ifl.rapid.customer.model.ApplyTrnQuoteDetails} interface instead.
	 */
	public static final String TABLE_NAME = "Apply_Trn_QuoteDetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "QuoteId", Types.VARCHAR },
			{ "ContactId", Types.INTEGER },
			{ "ProductId", Types.VARCHAR },
			{ "PremiumTypeId", Types.VARCHAR },
			{ "PremiumFrequencyId", Types.VARCHAR },
			{ "AssuredTerm", Types.INTEGER },
			{ "AssuredAge", Types.INTEGER },
			{ "DataXml", Types.VARCHAR },
			{ "DeathBenefitOption", Types.INTEGER },
			{ "ExpiryDate", Types.TIMESTAMP },
			{ "IsStaff", Types.VARCHAR },
			{ "IsActive", Types.INTEGER },
			{ "PolicyOption", Types.INTEGER },
			{ "PayingTerm", Types.INTEGER },
			{ "ProposalStartDate", Types.VARCHAR },
			{ "RefNo", Types.INTEGER },
			{ "PlanTerm", Types.INTEGER },
			{ "PremiumTerm", Types.INTEGER },
			{ "PremiumAmount", Types.DOUBLE },
			{ "SumAssured", Types.DOUBLE },
			{ "SummaryXml", Types.VARCHAR },
			{ "PdfLocation", Types.VARCHAR },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "pdfDataXml", Types.VARCHAR },
			{ "IsSmoker", Types.INTEGER },
			{ "SignatureFilePath", Types.VARCHAR },
			{ "BDMSignatureFilePath", Types.VARCHAR },
			{ "BDMId", Types.INTEGER },
			{ "IsAssisted", Types.INTEGER },
			{ "InputXML", Types.VARCHAR },
			{ "LeadId", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Apply_Trn_QuoteDetails (QuoteId VARCHAR(75) not null primary key,ContactId INTEGER,ProductId VARCHAR(75) null,PremiumTypeId VARCHAR(75) null,PremiumFrequencyId VARCHAR(75) null,AssuredTerm INTEGER,AssuredAge INTEGER,DataXml VARCHAR(75) null,DeathBenefitOption INTEGER,ExpiryDate DATE null,IsStaff VARCHAR(75) null,IsActive INTEGER,PolicyOption INTEGER,PayingTerm INTEGER,ProposalStartDate VARCHAR(75) null,RefNo INTEGER,PlanTerm INTEGER,PremiumTerm INTEGER,PremiumAmount DOUBLE,SumAssured DOUBLE,SummaryXml VARCHAR(75) null,PdfLocation VARCHAR(75) null,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedDate DATE null,ModifiedBy VARCHAR(75) null,pdfDataXml VARCHAR(75) null,IsSmoker INTEGER,SignatureFilePath VARCHAR(75) null,BDMSignatureFilePath VARCHAR(75) null,BDMId INTEGER,IsAssisted INTEGER,InputXML VARCHAR(75) null,LeadId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Apply_Trn_QuoteDetails";
	public static final String ORDER_BY_JPQL = " ORDER BY applyTrnQuoteDetails.QuoteId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Apply_Trn_QuoteDetails.QuoteId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.ApplyTrnQuoteDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.ApplyTrnQuoteDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ifl.rapid.customer.model.ApplyTrnQuoteDetails"),
			true);
	public static long CONTACTID_COLUMN_BITMASK = 1L;
	public static long QUOTEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.ApplyTrnQuoteDetails"));

	public ApplyTrnQuoteDetailsModelImpl() {
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

	@Override
	public String getQuoteId() {
		if (_QuoteId == null) {
			return StringPool.BLANK;
		}
		else {
			return _QuoteId;
		}
	}

	@Override
	public void setQuoteId(String QuoteId) {
		_QuoteId = QuoteId;
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_columnBitmask |= CONTACTID_COLUMN_BITMASK;

		if (!_setOriginalContactId) {
			_setOriginalContactId = true;

			_originalContactId = _ContactId;
		}

		_ContactId = ContactId;
	}

	public int getOriginalContactId() {
		return _originalContactId;
	}

	@Override
	public String getProductId() {
		if (_ProductId == null) {
			return StringPool.BLANK;
		}
		else {
			return _ProductId;
		}
	}

	@Override
	public void setProductId(String ProductId) {
		_ProductId = ProductId;
	}

	@Override
	public String getPremiumTypeId() {
		if (_PremiumTypeId == null) {
			return StringPool.BLANK;
		}
		else {
			return _PremiumTypeId;
		}
	}

	@Override
	public void setPremiumTypeId(String PremiumTypeId) {
		_PremiumTypeId = PremiumTypeId;
	}

	@Override
	public String getPremiumFrequencyId() {
		if (_PremiumFrequencyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _PremiumFrequencyId;
		}
	}

	@Override
	public void setPremiumFrequencyId(String PremiumFrequencyId) {
		_PremiumFrequencyId = PremiumFrequencyId;
	}

	@Override
	public int getAssuredTerm() {
		return _AssuredTerm;
	}

	@Override
	public void setAssuredTerm(int AssuredTerm) {
		_AssuredTerm = AssuredTerm;
	}

	@Override
	public int getAssuredAge() {
		return _AssuredAge;
	}

	@Override
	public void setAssuredAge(int AssuredAge) {
		_AssuredAge = AssuredAge;
	}

	@Override
	public String getDataXml() {
		if (_DataXml == null) {
			return StringPool.BLANK;
		}
		else {
			return _DataXml;
		}
	}

	@Override
	public void setDataXml(String DataXml) {
		_DataXml = DataXml;
	}

	@Override
	public int getDeathBenefitOption() {
		return _DeathBenefitOption;
	}

	@Override
	public void setDeathBenefitOption(int DeathBenefitOption) {
		_DeathBenefitOption = DeathBenefitOption;
	}

	@Override
	public Date getExpiryDate() {
		return _ExpiryDate;
	}

	@Override
	public void setExpiryDate(Date ExpiryDate) {
		_ExpiryDate = ExpiryDate;
	}

	@Override
	public String getIsStaff() {
		if (_IsStaff == null) {
			return StringPool.BLANK;
		}
		else {
			return _IsStaff;
		}
	}

	@Override
	public void setIsStaff(String IsStaff) {
		_IsStaff = IsStaff;
	}

	@Override
	public int getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
	}

	@Override
	public int getPolicyOption() {
		return _PolicyOption;
	}

	@Override
	public void setPolicyOption(int PolicyOption) {
		_PolicyOption = PolicyOption;
	}

	@Override
	public int getPayingTerm() {
		return _PayingTerm;
	}

	@Override
	public void setPayingTerm(int PayingTerm) {
		_PayingTerm = PayingTerm;
	}

	@Override
	public String getProposalStartDate() {
		if (_ProposalStartDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _ProposalStartDate;
		}
	}

	@Override
	public void setProposalStartDate(String ProposalStartDate) {
		_ProposalStartDate = ProposalStartDate;
	}

	@Override
	public int getRefNo() {
		return _RefNo;
	}

	@Override
	public void setRefNo(int RefNo) {
		_RefNo = RefNo;
	}

	@Override
	public int getPlanTerm() {
		return _PlanTerm;
	}

	@Override
	public void setPlanTerm(int PlanTerm) {
		_PlanTerm = PlanTerm;
	}

	@Override
	public int getPremiumTerm() {
		return _PremiumTerm;
	}

	@Override
	public void setPremiumTerm(int PremiumTerm) {
		_PremiumTerm = PremiumTerm;
	}

	@Override
	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;
	}

	@Override
	public double getSumAssured() {
		return _SumAssured;
	}

	@Override
	public void setSumAssured(double SumAssured) {
		_SumAssured = SumAssured;
	}

	@Override
	public String getSummaryXml() {
		if (_SummaryXml == null) {
			return StringPool.BLANK;
		}
		else {
			return _SummaryXml;
		}
	}

	@Override
	public void setSummaryXml(String SummaryXml) {
		_SummaryXml = SummaryXml;
	}

	@Override
	public String getPdfLocation() {
		if (_PdfLocation == null) {
			return StringPool.BLANK;
		}
		else {
			return _PdfLocation;
		}
	}

	@Override
	public void setPdfLocation(String PdfLocation) {
		_PdfLocation = PdfLocation;
	}

	@Override
	public String getCreatedBy() {
		if (_CreatedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _CreatedBy;
		}
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	@Override
	public String getModifiedBy() {
		if (_ModifiedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _ModifiedBy;
		}
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	@Override
	public String getPdfDataXml() {
		if (_pdfDataXml == null) {
			return StringPool.BLANK;
		}
		else {
			return _pdfDataXml;
		}
	}

	@Override
	public void setPdfDataXml(String pdfDataXml) {
		_pdfDataXml = pdfDataXml;
	}

	@Override
	public int getIsSmoker() {
		return _IsSmoker;
	}

	@Override
	public void setIsSmoker(int IsSmoker) {
		_IsSmoker = IsSmoker;
	}

	@Override
	public String getSignatureFilePath() {
		if (_SignatureFilePath == null) {
			return StringPool.BLANK;
		}
		else {
			return _SignatureFilePath;
		}
	}

	@Override
	public void setSignatureFilePath(String SignatureFilePath) {
		_SignatureFilePath = SignatureFilePath;
	}

	@Override
	public String getBDMSignatureFilePath() {
		if (_BDMSignatureFilePath == null) {
			return StringPool.BLANK;
		}
		else {
			return _BDMSignatureFilePath;
		}
	}

	@Override
	public void setBDMSignatureFilePath(String BDMSignatureFilePath) {
		_BDMSignatureFilePath = BDMSignatureFilePath;
	}

	@Override
	public int getBDMId() {
		return _BDMId;
	}

	@Override
	public void setBDMId(int BDMId) {
		_BDMId = BDMId;
	}

	@Override
	public int getIsAssisted() {
		return _IsAssisted;
	}

	@Override
	public void setIsAssisted(int IsAssisted) {
		_IsAssisted = IsAssisted;
	}

	@Override
	public String getInputXML() {
		if (_InputXML == null) {
			return StringPool.BLANK;
		}
		else {
			return _InputXML;
		}
	}

	@Override
	public void setInputXML(String InputXML) {
		_InputXML = InputXML;
	}

	@Override
	public String getLeadId() {
		if (_LeadId == null) {
			return StringPool.BLANK;
		}
		else {
			return _LeadId;
		}
	}

	@Override
	public void setLeadId(String LeadId) {
		_LeadId = LeadId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ApplyTrnQuoteDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ApplyTrnQuoteDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ApplyTrnQuoteDetailsImpl applyTrnQuoteDetailsImpl = new ApplyTrnQuoteDetailsImpl();

		applyTrnQuoteDetailsImpl.setQuoteId(getQuoteId());
		applyTrnQuoteDetailsImpl.setContactId(getContactId());
		applyTrnQuoteDetailsImpl.setProductId(getProductId());
		applyTrnQuoteDetailsImpl.setPremiumTypeId(getPremiumTypeId());
		applyTrnQuoteDetailsImpl.setPremiumFrequencyId(getPremiumFrequencyId());
		applyTrnQuoteDetailsImpl.setAssuredTerm(getAssuredTerm());
		applyTrnQuoteDetailsImpl.setAssuredAge(getAssuredAge());
		applyTrnQuoteDetailsImpl.setDataXml(getDataXml());
		applyTrnQuoteDetailsImpl.setDeathBenefitOption(getDeathBenefitOption());
		applyTrnQuoteDetailsImpl.setExpiryDate(getExpiryDate());
		applyTrnQuoteDetailsImpl.setIsStaff(getIsStaff());
		applyTrnQuoteDetailsImpl.setIsActive(getIsActive());
		applyTrnQuoteDetailsImpl.setPolicyOption(getPolicyOption());
		applyTrnQuoteDetailsImpl.setPayingTerm(getPayingTerm());
		applyTrnQuoteDetailsImpl.setProposalStartDate(getProposalStartDate());
		applyTrnQuoteDetailsImpl.setRefNo(getRefNo());
		applyTrnQuoteDetailsImpl.setPlanTerm(getPlanTerm());
		applyTrnQuoteDetailsImpl.setPremiumTerm(getPremiumTerm());
		applyTrnQuoteDetailsImpl.setPremiumAmount(getPremiumAmount());
		applyTrnQuoteDetailsImpl.setSumAssured(getSumAssured());
		applyTrnQuoteDetailsImpl.setSummaryXml(getSummaryXml());
		applyTrnQuoteDetailsImpl.setPdfLocation(getPdfLocation());
		applyTrnQuoteDetailsImpl.setCreatedBy(getCreatedBy());
		applyTrnQuoteDetailsImpl.setCreatedDate(getCreatedDate());
		applyTrnQuoteDetailsImpl.setModifiedDate(getModifiedDate());
		applyTrnQuoteDetailsImpl.setModifiedBy(getModifiedBy());
		applyTrnQuoteDetailsImpl.setPdfDataXml(getPdfDataXml());
		applyTrnQuoteDetailsImpl.setIsSmoker(getIsSmoker());
		applyTrnQuoteDetailsImpl.setSignatureFilePath(getSignatureFilePath());
		applyTrnQuoteDetailsImpl.setBDMSignatureFilePath(getBDMSignatureFilePath());
		applyTrnQuoteDetailsImpl.setBDMId(getBDMId());
		applyTrnQuoteDetailsImpl.setIsAssisted(getIsAssisted());
		applyTrnQuoteDetailsImpl.setInputXML(getInputXML());
		applyTrnQuoteDetailsImpl.setLeadId(getLeadId());

		applyTrnQuoteDetailsImpl.resetOriginalValues();

		return applyTrnQuoteDetailsImpl;
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

		if (!(obj instanceof ApplyTrnQuoteDetails)) {
			return false;
		}

		ApplyTrnQuoteDetails applyTrnQuoteDetails = (ApplyTrnQuoteDetails)obj;

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
	public void resetOriginalValues() {
		ApplyTrnQuoteDetailsModelImpl applyTrnQuoteDetailsModelImpl = this;

		applyTrnQuoteDetailsModelImpl._originalContactId = applyTrnQuoteDetailsModelImpl._ContactId;

		applyTrnQuoteDetailsModelImpl._setOriginalContactId = false;

		applyTrnQuoteDetailsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ApplyTrnQuoteDetails> toCacheModel() {
		ApplyTrnQuoteDetailsCacheModel applyTrnQuoteDetailsCacheModel = new ApplyTrnQuoteDetailsCacheModel();

		applyTrnQuoteDetailsCacheModel.QuoteId = getQuoteId();

		String QuoteId = applyTrnQuoteDetailsCacheModel.QuoteId;

		if ((QuoteId != null) && (QuoteId.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.QuoteId = null;
		}

		applyTrnQuoteDetailsCacheModel.ContactId = getContactId();

		applyTrnQuoteDetailsCacheModel.ProductId = getProductId();

		String ProductId = applyTrnQuoteDetailsCacheModel.ProductId;

		if ((ProductId != null) && (ProductId.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.ProductId = null;
		}

		applyTrnQuoteDetailsCacheModel.PremiumTypeId = getPremiumTypeId();

		String PremiumTypeId = applyTrnQuoteDetailsCacheModel.PremiumTypeId;

		if ((PremiumTypeId != null) && (PremiumTypeId.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.PremiumTypeId = null;
		}

		applyTrnQuoteDetailsCacheModel.PremiumFrequencyId = getPremiumFrequencyId();

		String PremiumFrequencyId = applyTrnQuoteDetailsCacheModel.PremiumFrequencyId;

		if ((PremiumFrequencyId != null) && (PremiumFrequencyId.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.PremiumFrequencyId = null;
		}

		applyTrnQuoteDetailsCacheModel.AssuredTerm = getAssuredTerm();

		applyTrnQuoteDetailsCacheModel.AssuredAge = getAssuredAge();

		applyTrnQuoteDetailsCacheModel.DataXml = getDataXml();

		String DataXml = applyTrnQuoteDetailsCacheModel.DataXml;

		if ((DataXml != null) && (DataXml.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.DataXml = null;
		}

		applyTrnQuoteDetailsCacheModel.DeathBenefitOption = getDeathBenefitOption();

		Date ExpiryDate = getExpiryDate();

		if (ExpiryDate != null) {
			applyTrnQuoteDetailsCacheModel.ExpiryDate = ExpiryDate.getTime();
		}
		else {
			applyTrnQuoteDetailsCacheModel.ExpiryDate = Long.MIN_VALUE;
		}

		applyTrnQuoteDetailsCacheModel.IsStaff = getIsStaff();

		String IsStaff = applyTrnQuoteDetailsCacheModel.IsStaff;

		if ((IsStaff != null) && (IsStaff.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.IsStaff = null;
		}

		applyTrnQuoteDetailsCacheModel.IsActive = getIsActive();

		applyTrnQuoteDetailsCacheModel.PolicyOption = getPolicyOption();

		applyTrnQuoteDetailsCacheModel.PayingTerm = getPayingTerm();

		applyTrnQuoteDetailsCacheModel.ProposalStartDate = getProposalStartDate();

		String ProposalStartDate = applyTrnQuoteDetailsCacheModel.ProposalStartDate;

		if ((ProposalStartDate != null) && (ProposalStartDate.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.ProposalStartDate = null;
		}

		applyTrnQuoteDetailsCacheModel.RefNo = getRefNo();

		applyTrnQuoteDetailsCacheModel.PlanTerm = getPlanTerm();

		applyTrnQuoteDetailsCacheModel.PremiumTerm = getPremiumTerm();

		applyTrnQuoteDetailsCacheModel.PremiumAmount = getPremiumAmount();

		applyTrnQuoteDetailsCacheModel.SumAssured = getSumAssured();

		applyTrnQuoteDetailsCacheModel.SummaryXml = getSummaryXml();

		String SummaryXml = applyTrnQuoteDetailsCacheModel.SummaryXml;

		if ((SummaryXml != null) && (SummaryXml.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.SummaryXml = null;
		}

		applyTrnQuoteDetailsCacheModel.PdfLocation = getPdfLocation();

		String PdfLocation = applyTrnQuoteDetailsCacheModel.PdfLocation;

		if ((PdfLocation != null) && (PdfLocation.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.PdfLocation = null;
		}

		applyTrnQuoteDetailsCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = applyTrnQuoteDetailsCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			applyTrnQuoteDetailsCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			applyTrnQuoteDetailsCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			applyTrnQuoteDetailsCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			applyTrnQuoteDetailsCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		applyTrnQuoteDetailsCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = applyTrnQuoteDetailsCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.ModifiedBy = null;
		}

		applyTrnQuoteDetailsCacheModel.pdfDataXml = getPdfDataXml();

		String pdfDataXml = applyTrnQuoteDetailsCacheModel.pdfDataXml;

		if ((pdfDataXml != null) && (pdfDataXml.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.pdfDataXml = null;
		}

		applyTrnQuoteDetailsCacheModel.IsSmoker = getIsSmoker();

		applyTrnQuoteDetailsCacheModel.SignatureFilePath = getSignatureFilePath();

		String SignatureFilePath = applyTrnQuoteDetailsCacheModel.SignatureFilePath;

		if ((SignatureFilePath != null) && (SignatureFilePath.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.SignatureFilePath = null;
		}

		applyTrnQuoteDetailsCacheModel.BDMSignatureFilePath = getBDMSignatureFilePath();

		String BDMSignatureFilePath = applyTrnQuoteDetailsCacheModel.BDMSignatureFilePath;

		if ((BDMSignatureFilePath != null) &&
				(BDMSignatureFilePath.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.BDMSignatureFilePath = null;
		}

		applyTrnQuoteDetailsCacheModel.BDMId = getBDMId();

		applyTrnQuoteDetailsCacheModel.IsAssisted = getIsAssisted();

		applyTrnQuoteDetailsCacheModel.InputXML = getInputXML();

		String InputXML = applyTrnQuoteDetailsCacheModel.InputXML;

		if ((InputXML != null) && (InputXML.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.InputXML = null;
		}

		applyTrnQuoteDetailsCacheModel.LeadId = getLeadId();

		String LeadId = applyTrnQuoteDetailsCacheModel.LeadId;

		if ((LeadId != null) && (LeadId.length() == 0)) {
			applyTrnQuoteDetailsCacheModel.LeadId = null;
		}

		return applyTrnQuoteDetailsCacheModel;
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

	private static ClassLoader _classLoader = ApplyTrnQuoteDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ApplyTrnQuoteDetails.class
		};
	private String _QuoteId;
	private int _ContactId;
	private int _originalContactId;
	private boolean _setOriginalContactId;
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
	private long _columnBitmask;
	private ApplyTrnQuoteDetails _escapedModel;
}