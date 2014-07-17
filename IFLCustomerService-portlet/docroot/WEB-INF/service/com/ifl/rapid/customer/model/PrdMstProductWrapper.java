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
 * This class is a wrapper for {@link PrdMstProduct}.
 * </p>
 *
 * @author Satya Kola
 * @see PrdMstProduct
 * @generated
 */
public class PrdMstProductWrapper implements PrdMstProduct,
	ModelWrapper<PrdMstProduct> {
	public PrdMstProductWrapper(PrdMstProduct prdMstProduct) {
		_prdMstProduct = prdMstProduct;
	}

	@Override
	public Class<?> getModelClass() {
		return PrdMstProduct.class;
	}

	@Override
	public String getModelClassName() {
		return PrdMstProduct.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ProductId", getProductId());
		attributes.put("ProductKey", getProductKey());
		attributes.put("DisplayOrder", getDisplayOrder());
		attributes.put("RenewalDuration", getRenewalDuration());
		attributes.put("ShortTermDuration", getShortTermDuration());
		attributes.put("MinPlanTerm", getMinPlanTerm());
		attributes.put("MaxPlanTerm", getMaxPlanTerm());
		attributes.put("MinSumAssured", getMinSumAssured());
		attributes.put("MaxSumAssured", getMaxSumAssured());
		attributes.put("IsRegularPremium", getIsRegularPremium());
		attributes.put("IsLimitedPremium", getIsLimitedPremium());
		attributes.put("IsSinglePremium", getIsSinglePremium());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String ProductId = (String)attributes.get("ProductId");

		if (ProductId != null) {
			setProductId(ProductId);
		}

		String ProductKey = (String)attributes.get("ProductKey");

		if (ProductKey != null) {
			setProductKey(ProductKey);
		}

		Integer DisplayOrder = (Integer)attributes.get("DisplayOrder");

		if (DisplayOrder != null) {
			setDisplayOrder(DisplayOrder);
		}

		Integer RenewalDuration = (Integer)attributes.get("RenewalDuration");

		if (RenewalDuration != null) {
			setRenewalDuration(RenewalDuration);
		}

		Integer ShortTermDuration = (Integer)attributes.get("ShortTermDuration");

		if (ShortTermDuration != null) {
			setShortTermDuration(ShortTermDuration);
		}

		Integer MinPlanTerm = (Integer)attributes.get("MinPlanTerm");

		if (MinPlanTerm != null) {
			setMinPlanTerm(MinPlanTerm);
		}

		Integer MaxPlanTerm = (Integer)attributes.get("MaxPlanTerm");

		if (MaxPlanTerm != null) {
			setMaxPlanTerm(MaxPlanTerm);
		}

		Integer MinSumAssured = (Integer)attributes.get("MinSumAssured");

		if (MinSumAssured != null) {
			setMinSumAssured(MinSumAssured);
		}

		Integer MaxSumAssured = (Integer)attributes.get("MaxSumAssured");

		if (MaxSumAssured != null) {
			setMaxSumAssured(MaxSumAssured);
		}

		Integer IsRegularPremium = (Integer)attributes.get("IsRegularPremium");

		if (IsRegularPremium != null) {
			setIsRegularPremium(IsRegularPremium);
		}

		Integer IsLimitedPremium = (Integer)attributes.get("IsLimitedPremium");

		if (IsLimitedPremium != null) {
			setIsLimitedPremium(IsLimitedPremium);
		}

		Integer IsSinglePremium = (Integer)attributes.get("IsSinglePremium");

		if (IsSinglePremium != null) {
			setIsSinglePremium(IsSinglePremium);
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
	* Returns the primary key of this prd mst product.
	*
	* @return the primary key of this prd mst product
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _prdMstProduct.getPrimaryKey();
	}

	/**
	* Sets the primary key of this prd mst product.
	*
	* @param primaryKey the primary key of this prd mst product
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_prdMstProduct.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the product ID of this prd mst product.
	*
	* @return the product ID of this prd mst product
	*/
	@Override
	public java.lang.String getProductId() {
		return _prdMstProduct.getProductId();
	}

	/**
	* Sets the product ID of this prd mst product.
	*
	* @param ProductId the product ID of this prd mst product
	*/
	@Override
	public void setProductId(java.lang.String ProductId) {
		_prdMstProduct.setProductId(ProductId);
	}

	/**
	* Returns the product key of this prd mst product.
	*
	* @return the product key of this prd mst product
	*/
	@Override
	public java.lang.String getProductKey() {
		return _prdMstProduct.getProductKey();
	}

	/**
	* Sets the product key of this prd mst product.
	*
	* @param ProductKey the product key of this prd mst product
	*/
	@Override
	public void setProductKey(java.lang.String ProductKey) {
		_prdMstProduct.setProductKey(ProductKey);
	}

	/**
	* Returns the display order of this prd mst product.
	*
	* @return the display order of this prd mst product
	*/
	@Override
	public int getDisplayOrder() {
		return _prdMstProduct.getDisplayOrder();
	}

	/**
	* Sets the display order of this prd mst product.
	*
	* @param DisplayOrder the display order of this prd mst product
	*/
	@Override
	public void setDisplayOrder(int DisplayOrder) {
		_prdMstProduct.setDisplayOrder(DisplayOrder);
	}

	/**
	* Returns the renewal duration of this prd mst product.
	*
	* @return the renewal duration of this prd mst product
	*/
	@Override
	public int getRenewalDuration() {
		return _prdMstProduct.getRenewalDuration();
	}

	/**
	* Sets the renewal duration of this prd mst product.
	*
	* @param RenewalDuration the renewal duration of this prd mst product
	*/
	@Override
	public void setRenewalDuration(int RenewalDuration) {
		_prdMstProduct.setRenewalDuration(RenewalDuration);
	}

	/**
	* Returns the short term duration of this prd mst product.
	*
	* @return the short term duration of this prd mst product
	*/
	@Override
	public int getShortTermDuration() {
		return _prdMstProduct.getShortTermDuration();
	}

	/**
	* Sets the short term duration of this prd mst product.
	*
	* @param ShortTermDuration the short term duration of this prd mst product
	*/
	@Override
	public void setShortTermDuration(int ShortTermDuration) {
		_prdMstProduct.setShortTermDuration(ShortTermDuration);
	}

	/**
	* Returns the min plan term of this prd mst product.
	*
	* @return the min plan term of this prd mst product
	*/
	@Override
	public int getMinPlanTerm() {
		return _prdMstProduct.getMinPlanTerm();
	}

	/**
	* Sets the min plan term of this prd mst product.
	*
	* @param MinPlanTerm the min plan term of this prd mst product
	*/
	@Override
	public void setMinPlanTerm(int MinPlanTerm) {
		_prdMstProduct.setMinPlanTerm(MinPlanTerm);
	}

	/**
	* Returns the max plan term of this prd mst product.
	*
	* @return the max plan term of this prd mst product
	*/
	@Override
	public int getMaxPlanTerm() {
		return _prdMstProduct.getMaxPlanTerm();
	}

	/**
	* Sets the max plan term of this prd mst product.
	*
	* @param MaxPlanTerm the max plan term of this prd mst product
	*/
	@Override
	public void setMaxPlanTerm(int MaxPlanTerm) {
		_prdMstProduct.setMaxPlanTerm(MaxPlanTerm);
	}

	/**
	* Returns the min sum assured of this prd mst product.
	*
	* @return the min sum assured of this prd mst product
	*/
	@Override
	public int getMinSumAssured() {
		return _prdMstProduct.getMinSumAssured();
	}

	/**
	* Sets the min sum assured of this prd mst product.
	*
	* @param MinSumAssured the min sum assured of this prd mst product
	*/
	@Override
	public void setMinSumAssured(int MinSumAssured) {
		_prdMstProduct.setMinSumAssured(MinSumAssured);
	}

	/**
	* Returns the max sum assured of this prd mst product.
	*
	* @return the max sum assured of this prd mst product
	*/
	@Override
	public int getMaxSumAssured() {
		return _prdMstProduct.getMaxSumAssured();
	}

	/**
	* Sets the max sum assured of this prd mst product.
	*
	* @param MaxSumAssured the max sum assured of this prd mst product
	*/
	@Override
	public void setMaxSumAssured(int MaxSumAssured) {
		_prdMstProduct.setMaxSumAssured(MaxSumAssured);
	}

	/**
	* Returns the is regular premium of this prd mst product.
	*
	* @return the is regular premium of this prd mst product
	*/
	@Override
	public int getIsRegularPremium() {
		return _prdMstProduct.getIsRegularPremium();
	}

	/**
	* Sets the is regular premium of this prd mst product.
	*
	* @param IsRegularPremium the is regular premium of this prd mst product
	*/
	@Override
	public void setIsRegularPremium(int IsRegularPremium) {
		_prdMstProduct.setIsRegularPremium(IsRegularPremium);
	}

	/**
	* Returns the is limited premium of this prd mst product.
	*
	* @return the is limited premium of this prd mst product
	*/
	@Override
	public int getIsLimitedPremium() {
		return _prdMstProduct.getIsLimitedPremium();
	}

	/**
	* Sets the is limited premium of this prd mst product.
	*
	* @param IsLimitedPremium the is limited premium of this prd mst product
	*/
	@Override
	public void setIsLimitedPremium(int IsLimitedPremium) {
		_prdMstProduct.setIsLimitedPremium(IsLimitedPremium);
	}

	/**
	* Returns the is single premium of this prd mst product.
	*
	* @return the is single premium of this prd mst product
	*/
	@Override
	public int getIsSinglePremium() {
		return _prdMstProduct.getIsSinglePremium();
	}

	/**
	* Sets the is single premium of this prd mst product.
	*
	* @param IsSinglePremium the is single premium of this prd mst product
	*/
	@Override
	public void setIsSinglePremium(int IsSinglePremium) {
		_prdMstProduct.setIsSinglePremium(IsSinglePremium);
	}

	/**
	* Returns the is active of this prd mst product.
	*
	* @return the is active of this prd mst product
	*/
	@Override
	public int getIsActive() {
		return _prdMstProduct.getIsActive();
	}

	/**
	* Sets the is active of this prd mst product.
	*
	* @param IsActive the is active of this prd mst product
	*/
	@Override
	public void setIsActive(int IsActive) {
		_prdMstProduct.setIsActive(IsActive);
	}

	/**
	* Returns the created by of this prd mst product.
	*
	* @return the created by of this prd mst product
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _prdMstProduct.getCreatedBy();
	}

	/**
	* Sets the created by of this prd mst product.
	*
	* @param CreatedBy the created by of this prd mst product
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_prdMstProduct.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this prd mst product.
	*
	* @return the created date of this prd mst product
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _prdMstProduct.getCreatedDate();
	}

	/**
	* Sets the created date of this prd mst product.
	*
	* @param CreatedDate the created date of this prd mst product
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_prdMstProduct.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified date of this prd mst product.
	*
	* @return the modified date of this prd mst product
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _prdMstProduct.getModifiedDate();
	}

	/**
	* Sets the modified date of this prd mst product.
	*
	* @param ModifiedDate the modified date of this prd mst product
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_prdMstProduct.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the modified by of this prd mst product.
	*
	* @return the modified by of this prd mst product
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _prdMstProduct.getModifiedBy();
	}

	/**
	* Sets the modified by of this prd mst product.
	*
	* @param ModifiedBy the modified by of this prd mst product
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_prdMstProduct.setModifiedBy(ModifiedBy);
	}

	@Override
	public boolean isNew() {
		return _prdMstProduct.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_prdMstProduct.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _prdMstProduct.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prdMstProduct.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _prdMstProduct.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _prdMstProduct.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prdMstProduct.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prdMstProduct.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_prdMstProduct.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_prdMstProduct.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prdMstProduct.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PrdMstProductWrapper((PrdMstProduct)_prdMstProduct.clone());
	}

	@Override
	public int compareTo(
		com.ifl.rapid.customer.model.PrdMstProduct prdMstProduct) {
		return _prdMstProduct.compareTo(prdMstProduct);
	}

	@Override
	public int hashCode() {
		return _prdMstProduct.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifl.rapid.customer.model.PrdMstProduct> toCacheModel() {
		return _prdMstProduct.toCacheModel();
	}

	@Override
	public com.ifl.rapid.customer.model.PrdMstProduct toEscapedModel() {
		return new PrdMstProductWrapper(_prdMstProduct.toEscapedModel());
	}

	@Override
	public com.ifl.rapid.customer.model.PrdMstProduct toUnescapedModel() {
		return new PrdMstProductWrapper(_prdMstProduct.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prdMstProduct.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prdMstProduct.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prdMstProduct.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PrdMstProductWrapper)) {
			return false;
		}

		PrdMstProductWrapper prdMstProductWrapper = (PrdMstProductWrapper)obj;

		if (Validator.equals(_prdMstProduct, prdMstProductWrapper._prdMstProduct)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PrdMstProduct getWrappedPrdMstProduct() {
		return _prdMstProduct;
	}

	@Override
	public PrdMstProduct getWrappedModel() {
		return _prdMstProduct;
	}

	@Override
	public void resetOriginalValues() {
		_prdMstProduct.resetOriginalValues();
	}

	private PrdMstProduct _prdMstProduct;
}