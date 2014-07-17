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
public class ApplyTrnApplicationFormSoap implements Serializable {
	public static ApplyTrnApplicationFormSoap toSoapModel(
		ApplyTrnApplicationForm model) {
		ApplyTrnApplicationFormSoap soapModel = new ApplyTrnApplicationFormSoap();

		soapModel.setApplicationFormId(model.getApplicationFormId());
		soapModel.setQuoteId(model.getQuoteId());
		soapModel.setApplicationRefNo(model.getApplicationRefNo());
		soapModel.setSeqGenerator(model.getSeqGenerator());
		soapModel.setLTRFFormRefNo(model.getLTRFFormRefNo());
		soapModel.setPremiumAmount(model.getPremiumAmount());
		soapModel.setIsMedicalRequired(model.getIsMedicalRequired());
		soapModel.setShortPremium(model.getShortPremium());
		soapModel.setPremiumDueDate(model.getPremiumDueDate());
		soapModel.setPolicyNo(model.getPolicyNo());
		soapModel.setPolicyElapsedDate(model.getPolicyElapsedDate());
		soapModel.setPolicyIssueDate(model.getPolicyIssueDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setCompletion(model.getCompletion());
		soapModel.setIsLapsed(model.getIsLapsed());
		soapModel.setNextPremiumDueDate(model.getNextPremiumDueDate());
		soapModel.setPolicyStatus(model.getPolicyStatus());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static ApplyTrnApplicationFormSoap[] toSoapModels(
		ApplyTrnApplicationForm[] models) {
		ApplyTrnApplicationFormSoap[] soapModels = new ApplyTrnApplicationFormSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplyTrnApplicationFormSoap[][] toSoapModels(
		ApplyTrnApplicationForm[][] models) {
		ApplyTrnApplicationFormSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplyTrnApplicationFormSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplyTrnApplicationFormSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplyTrnApplicationFormSoap[] toSoapModels(
		List<ApplyTrnApplicationForm> models) {
		List<ApplyTrnApplicationFormSoap> soapModels = new ArrayList<ApplyTrnApplicationFormSoap>(models.size());

		for (ApplyTrnApplicationForm model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplyTrnApplicationFormSoap[soapModels.size()]);
	}

	public ApplyTrnApplicationFormSoap() {
	}

	public String getPrimaryKey() {
		return _ApplicationFormId;
	}

	public void setPrimaryKey(String pk) {
		setApplicationFormId(pk);
	}

	public String getApplicationFormId() {
		return _ApplicationFormId;
	}

	public void setApplicationFormId(String ApplicationFormId) {
		_ApplicationFormId = ApplicationFormId;
	}

	public String getQuoteId() {
		return _QuoteId;
	}

	public void setQuoteId(String QuoteId) {
		_QuoteId = QuoteId;
	}

	public String getApplicationRefNo() {
		return _ApplicationRefNo;
	}

	public void setApplicationRefNo(String ApplicationRefNo) {
		_ApplicationRefNo = ApplicationRefNo;
	}

	public int getSeqGenerator() {
		return _SeqGenerator;
	}

	public void setSeqGenerator(int SeqGenerator) {
		_SeqGenerator = SeqGenerator;
	}

	public String getLTRFFormRefNo() {
		return _LTRFFormRefNo;
	}

	public void setLTRFFormRefNo(String LTRFFormRefNo) {
		_LTRFFormRefNo = LTRFFormRefNo;
	}

	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;
	}

	public int getIsMedicalRequired() {
		return _IsMedicalRequired;
	}

	public void setIsMedicalRequired(int IsMedicalRequired) {
		_IsMedicalRequired = IsMedicalRequired;
	}

	public double getShortPremium() {
		return _ShortPremium;
	}

	public void setShortPremium(double ShortPremium) {
		_ShortPremium = ShortPremium;
	}

	public Date getPremiumDueDate() {
		return _PremiumDueDate;
	}

	public void setPremiumDueDate(Date PremiumDueDate) {
		_PremiumDueDate = PremiumDueDate;
	}

	public String getPolicyNo() {
		return _PolicyNo;
	}

	public void setPolicyNo(String PolicyNo) {
		_PolicyNo = PolicyNo;
	}

	public Date getPolicyElapsedDate() {
		return _PolicyElapsedDate;
	}

	public void setPolicyElapsedDate(Date PolicyElapsedDate) {
		_PolicyElapsedDate = PolicyElapsedDate;
	}

	public Date getPolicyIssueDate() {
		return _PolicyIssueDate;
	}

	public void setPolicyIssueDate(Date PolicyIssueDate) {
		_PolicyIssueDate = PolicyIssueDate;
	}

	public String getStatus() {
		return _Status;
	}

	public void setStatus(String Status) {
		_Status = Status;
	}

	public int getCompletion() {
		return _Completion;
	}

	public void setCompletion(int Completion) {
		_Completion = Completion;
	}

	public int getIsLapsed() {
		return _IsLapsed;
	}

	public void setIsLapsed(int IsLapsed) {
		_IsLapsed = IsLapsed;
	}

	public Date getNextPremiumDueDate() {
		return _NextPremiumDueDate;
	}

	public void setNextPremiumDueDate(Date NextPremiumDueDate) {
		_NextPremiumDueDate = NextPremiumDueDate;
	}

	public String getPolicyStatus() {
		return _PolicyStatus;
	}

	public void setPolicyStatus(String PolicyStatus) {
		_PolicyStatus = PolicyStatus;
	}

	public int getIsActive() {
		return _IsActive;
	}

	public void setIsActive(int IsActive) {
		_IsActive = IsActive;
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

	private String _ApplicationFormId;
	private String _QuoteId;
	private String _ApplicationRefNo;
	private int _SeqGenerator;
	private String _LTRFFormRefNo;
	private double _PremiumAmount;
	private int _IsMedicalRequired;
	private double _ShortPremium;
	private Date _PremiumDueDate;
	private String _PolicyNo;
	private Date _PolicyElapsedDate;
	private Date _PolicyIssueDate;
	private String _Status;
	private int _Completion;
	private int _IsLapsed;
	private Date _NextPremiumDueDate;
	private String _PolicyStatus;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}