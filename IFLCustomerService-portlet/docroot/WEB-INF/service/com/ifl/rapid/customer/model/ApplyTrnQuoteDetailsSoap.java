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
public class ApplyTrnQuoteDetailsSoap implements Serializable {
	public static ApplyTrnQuoteDetailsSoap toSoapModel(
		ApplyTrnQuoteDetails model) {
		ApplyTrnQuoteDetailsSoap soapModel = new ApplyTrnQuoteDetailsSoap();

		soapModel.setQuoteId(model.getQuoteId());
		soapModel.setContactId(model.getContactId());
		soapModel.setProductId(model.getProductId());
		soapModel.setPremiumTypeId(model.getPremiumTypeId());
		soapModel.setPremiumFrequencyId(model.getPremiumFrequencyId());
		soapModel.setAssuredTerm(model.getAssuredTerm());
		soapModel.setAssuredAge(model.getAssuredAge());
		soapModel.setDataXml(model.getDataXml());
		soapModel.setDeathBenefitOption(model.getDeathBenefitOption());
		soapModel.setExpiryDate(model.getExpiryDate());
		soapModel.setIsStaff(model.getIsStaff());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setPolicyOption(model.getPolicyOption());
		soapModel.setPayingTerm(model.getPayingTerm());
		soapModel.setProposalStartDate(model.getProposalStartDate());
		soapModel.setRefNo(model.getRefNo());
		soapModel.setPlanTerm(model.getPlanTerm());
		soapModel.setPremiumTerm(model.getPremiumTerm());
		soapModel.setPremiumAmount(model.getPremiumAmount());
		soapModel.setSumAssured(model.getSumAssured());
		soapModel.setSummaryXml(model.getSummaryXml());
		soapModel.setPdfLocation(model.getPdfLocation());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setPdfDataXml(model.getPdfDataXml());
		soapModel.setIsSmoker(model.getIsSmoker());
		soapModel.setSignatureFilePath(model.getSignatureFilePath());
		soapModel.setBDMSignatureFilePath(model.getBDMSignatureFilePath());
		soapModel.setBDMId(model.getBDMId());
		soapModel.setIsAssisted(model.getIsAssisted());
		soapModel.setInputXML(model.getInputXML());
		soapModel.setLeadId(model.getLeadId());

		return soapModel;
	}

	public static ApplyTrnQuoteDetailsSoap[] toSoapModels(
		ApplyTrnQuoteDetails[] models) {
		ApplyTrnQuoteDetailsSoap[] soapModels = new ApplyTrnQuoteDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplyTrnQuoteDetailsSoap[][] toSoapModels(
		ApplyTrnQuoteDetails[][] models) {
		ApplyTrnQuoteDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplyTrnQuoteDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplyTrnQuoteDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplyTrnQuoteDetailsSoap[] toSoapModels(
		List<ApplyTrnQuoteDetails> models) {
		List<ApplyTrnQuoteDetailsSoap> soapModels = new ArrayList<ApplyTrnQuoteDetailsSoap>(models.size());

		for (ApplyTrnQuoteDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplyTrnQuoteDetailsSoap[soapModels.size()]);
	}

	public ApplyTrnQuoteDetailsSoap() {
	}

	public String getPrimaryKey() {
		return _QuoteId;
	}

	public void setPrimaryKey(String pk) {
		setQuoteId(pk);
	}

	public String getQuoteId() {
		return _QuoteId;
	}

	public void setQuoteId(String QuoteId) {
		_QuoteId = QuoteId;
	}

	public int getContactId() {
		return _ContactId;
	}

	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	public String getProductId() {
		return _ProductId;
	}

	public void setProductId(String ProductId) {
		_ProductId = ProductId;
	}

	public String getPremiumTypeId() {
		return _PremiumTypeId;
	}

	public void setPremiumTypeId(String PremiumTypeId) {
		_PremiumTypeId = PremiumTypeId;
	}

	public String getPremiumFrequencyId() {
		return _PremiumFrequencyId;
	}

	public void setPremiumFrequencyId(String PremiumFrequencyId) {
		_PremiumFrequencyId = PremiumFrequencyId;
	}

	public int getAssuredTerm() {
		return _AssuredTerm;
	}

	public void setAssuredTerm(int AssuredTerm) {
		_AssuredTerm = AssuredTerm;
	}

	public int getAssuredAge() {
		return _AssuredAge;
	}

	public void setAssuredAge(int AssuredAge) {
		_AssuredAge = AssuredAge;
	}

	public String getDataXml() {
		return _DataXml;
	}

	public void setDataXml(String DataXml) {
		_DataXml = DataXml;
	}

	public int getDeathBenefitOption() {
		return _DeathBenefitOption;
	}

	public void setDeathBenefitOption(int DeathBenefitOption) {
		_DeathBenefitOption = DeathBenefitOption;
	}

	public Date getExpiryDate() {
		return _ExpiryDate;
	}

	public void setExpiryDate(Date ExpiryDate) {
		_ExpiryDate = ExpiryDate;
	}

	public String getIsStaff() {
		return _IsStaff;
	}

	public void setIsStaff(String IsStaff) {
		_IsStaff = IsStaff;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
	}

	public int getPolicyOption() {
		return _PolicyOption;
	}

	public void setPolicyOption(int PolicyOption) {
		_PolicyOption = PolicyOption;
	}

	public int getPayingTerm() {
		return _PayingTerm;
	}

	public void setPayingTerm(int PayingTerm) {
		_PayingTerm = PayingTerm;
	}

	public String getProposalStartDate() {
		return _ProposalStartDate;
	}

	public void setProposalStartDate(String ProposalStartDate) {
		_ProposalStartDate = ProposalStartDate;
	}

	public int getRefNo() {
		return _RefNo;
	}

	public void setRefNo(int RefNo) {
		_RefNo = RefNo;
	}

	public int getPlanTerm() {
		return _PlanTerm;
	}

	public void setPlanTerm(int PlanTerm) {
		_PlanTerm = PlanTerm;
	}

	public int getPremiumTerm() {
		return _PremiumTerm;
	}

	public void setPremiumTerm(int PremiumTerm) {
		_PremiumTerm = PremiumTerm;
	}

	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;
	}

	public double getSumAssured() {
		return _SumAssured;
	}

	public void setSumAssured(double SumAssured) {
		_SumAssured = SumAssured;
	}

	public String getSummaryXml() {
		return _SummaryXml;
	}

	public void setSummaryXml(String SummaryXml) {
		_SummaryXml = SummaryXml;
	}

	public String getPdfLocation() {
		return _PdfLocation;
	}

	public void setPdfLocation(String PdfLocation) {
		_PdfLocation = PdfLocation;
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

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public String getPdfDataXml() {
		return _pdfDataXml;
	}

	public void setPdfDataXml(String pdfDataXml) {
		_pdfDataXml = pdfDataXml;
	}

	public int getIsSmoker() {
		return _IsSmoker;
	}

	public void setIsSmoker(int IsSmoker) {
		_IsSmoker = IsSmoker;
	}

	public String getSignatureFilePath() {
		return _SignatureFilePath;
	}

	public void setSignatureFilePath(String SignatureFilePath) {
		_SignatureFilePath = SignatureFilePath;
	}

	public String getBDMSignatureFilePath() {
		return _BDMSignatureFilePath;
	}

	public void setBDMSignatureFilePath(String BDMSignatureFilePath) {
		_BDMSignatureFilePath = BDMSignatureFilePath;
	}

	public int getBDMId() {
		return _BDMId;
	}

	public void setBDMId(int BDMId) {
		_BDMId = BDMId;
	}

	public int getIsAssisted() {
		return _IsAssisted;
	}

	public void setIsAssisted(int IsAssisted) {
		_IsAssisted = IsAssisted;
	}

	public String getInputXML() {
		return _InputXML;
	}

	public void setInputXML(String InputXML) {
		_InputXML = InputXML;
	}

	public String getLeadId() {
		return _LeadId;
	}

	public void setLeadId(String LeadId) {
		_LeadId = LeadId;
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
}