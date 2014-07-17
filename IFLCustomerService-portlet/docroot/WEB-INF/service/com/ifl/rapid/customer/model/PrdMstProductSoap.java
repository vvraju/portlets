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
public class PrdMstProductSoap implements Serializable {
	public static PrdMstProductSoap toSoapModel(PrdMstProduct model) {
		PrdMstProductSoap soapModel = new PrdMstProductSoap();

		soapModel.setProductId(model.getProductId());
		soapModel.setProductKey(model.getProductKey());
		soapModel.setDisplayOrder(model.getDisplayOrder());
		soapModel.setRenewalDuration(model.getRenewalDuration());
		soapModel.setShortTermDuration(model.getShortTermDuration());
		soapModel.setMinPlanTerm(model.getMinPlanTerm());
		soapModel.setMaxPlanTerm(model.getMaxPlanTerm());
		soapModel.setMinSumAssured(model.getMinSumAssured());
		soapModel.setMaxSumAssured(model.getMaxSumAssured());
		soapModel.setIsRegularPremium(model.getIsRegularPremium());
		soapModel.setIsLimitedPremium(model.getIsLimitedPremium());
		soapModel.setIsSinglePremium(model.getIsSinglePremium());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static PrdMstProductSoap[] toSoapModels(PrdMstProduct[] models) {
		PrdMstProductSoap[] soapModels = new PrdMstProductSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PrdMstProductSoap[][] toSoapModels(PrdMstProduct[][] models) {
		PrdMstProductSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PrdMstProductSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PrdMstProductSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PrdMstProductSoap[] toSoapModels(List<PrdMstProduct> models) {
		List<PrdMstProductSoap> soapModels = new ArrayList<PrdMstProductSoap>(models.size());

		for (PrdMstProduct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PrdMstProductSoap[soapModels.size()]);
	}

	public PrdMstProductSoap() {
	}

	public String getPrimaryKey() {
		return _ProductId;
	}

	public void setPrimaryKey(String pk) {
		setProductId(pk);
	}

	public String getProductId() {
		return _ProductId;
	}

	public void setProductId(String ProductId) {
		_ProductId = ProductId;
	}

	public String getProductKey() {
		return _ProductKey;
	}

	public void setProductKey(String ProductKey) {
		_ProductKey = ProductKey;
	}

	public int getDisplayOrder() {
		return _DisplayOrder;
	}

	public void setDisplayOrder(int DisplayOrder) {
		_DisplayOrder = DisplayOrder;
	}

	public int getRenewalDuration() {
		return _RenewalDuration;
	}

	public void setRenewalDuration(int RenewalDuration) {
		_RenewalDuration = RenewalDuration;
	}

	public int getShortTermDuration() {
		return _ShortTermDuration;
	}

	public void setShortTermDuration(int ShortTermDuration) {
		_ShortTermDuration = ShortTermDuration;
	}

	public int getMinPlanTerm() {
		return _MinPlanTerm;
	}

	public void setMinPlanTerm(int MinPlanTerm) {
		_MinPlanTerm = MinPlanTerm;
	}

	public int getMaxPlanTerm() {
		return _MaxPlanTerm;
	}

	public void setMaxPlanTerm(int MaxPlanTerm) {
		_MaxPlanTerm = MaxPlanTerm;
	}

	public int getMinSumAssured() {
		return _MinSumAssured;
	}

	public void setMinSumAssured(int MinSumAssured) {
		_MinSumAssured = MinSumAssured;
	}

	public int getMaxSumAssured() {
		return _MaxSumAssured;
	}

	public void setMaxSumAssured(int MaxSumAssured) {
		_MaxSumAssured = MaxSumAssured;
	}

	public int getIsRegularPremium() {
		return _IsRegularPremium;
	}

	public void setIsRegularPremium(int IsRegularPremium) {
		_IsRegularPremium = IsRegularPremium;
	}

	public int getIsLimitedPremium() {
		return _IsLimitedPremium;
	}

	public void setIsLimitedPremium(int IsLimitedPremium) {
		_IsLimitedPremium = IsLimitedPremium;
	}

	public int getIsSinglePremium() {
		return _IsSinglePremium;
	}

	public void setIsSinglePremium(int IsSinglePremium) {
		_IsSinglePremium = IsSinglePremium;
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

	private String _ProductId;
	private String _ProductKey;
	private int _DisplayOrder;
	private int _RenewalDuration;
	private int _ShortTermDuration;
	private int _MinPlanTerm;
	private int _MaxPlanTerm;
	private int _MinSumAssured;
	private int _MaxSumAssured;
	private int _IsRegularPremium;
	private int _IsLimitedPremium;
	private int _IsSinglePremium;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}