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

package com.ifli.rapid.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProductFundMapping}.
 * </p>
 *
 * @author Satya Kola
 * @see ProductFundMapping
 * @generated
 */
public class ProductFundMappingWrapper implements ProductFundMapping,
	ModelWrapper<ProductFundMapping> {
	public ProductFundMappingWrapper(ProductFundMapping productFundMapping) {
		_productFundMapping = productFundMapping;
	}

	@Override
	public Class<?> getModelClass() {
		return ProductFundMapping.class;
	}

	@Override
	public String getModelClassName() {
		return ProductFundMapping.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("PRODUCT_CODE", getPRODUCT_CODE());
		attributes.put("FUND_CODE", getFUND_CODE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String PRODUCT_CODE = (String)attributes.get("PRODUCT_CODE");

		if (PRODUCT_CODE != null) {
			setPRODUCT_CODE(PRODUCT_CODE);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}
	}

	/**
	* Returns the primary key of this product fund mapping.
	*
	* @return the primary key of this product fund mapping
	*/
	@Override
	public int getPrimaryKey() {
		return _productFundMapping.getPrimaryKey();
	}

	/**
	* Sets the primary key of this product fund mapping.
	*
	* @param primaryKey the primary key of this product fund mapping
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_productFundMapping.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i d of this product fund mapping.
	*
	* @return the i d of this product fund mapping
	*/
	@Override
	public int getID() {
		return _productFundMapping.getID();
	}

	/**
	* Sets the i d of this product fund mapping.
	*
	* @param ID the i d of this product fund mapping
	*/
	@Override
	public void setID(int ID) {
		_productFundMapping.setID(ID);
	}

	/**
	* Returns the p r o d u c t_ c o d e of this product fund mapping.
	*
	* @return the p r o d u c t_ c o d e of this product fund mapping
	*/
	@Override
	public java.lang.String getPRODUCT_CODE() {
		return _productFundMapping.getPRODUCT_CODE();
	}

	/**
	* Sets the p r o d u c t_ c o d e of this product fund mapping.
	*
	* @param PRODUCT_CODE the p r o d u c t_ c o d e of this product fund mapping
	*/
	@Override
	public void setPRODUCT_CODE(java.lang.String PRODUCT_CODE) {
		_productFundMapping.setPRODUCT_CODE(PRODUCT_CODE);
	}

	/**
	* Returns the f u n d_ c o d e of this product fund mapping.
	*
	* @return the f u n d_ c o d e of this product fund mapping
	*/
	@Override
	public java.lang.String getFUND_CODE() {
		return _productFundMapping.getFUND_CODE();
	}

	/**
	* Sets the f u n d_ c o d e of this product fund mapping.
	*
	* @param FUND_CODE the f u n d_ c o d e of this product fund mapping
	*/
	@Override
	public void setFUND_CODE(java.lang.String FUND_CODE) {
		_productFundMapping.setFUND_CODE(FUND_CODE);
	}

	@Override
	public boolean isNew() {
		return _productFundMapping.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_productFundMapping.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _productFundMapping.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_productFundMapping.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _productFundMapping.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _productFundMapping.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_productFundMapping.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _productFundMapping.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_productFundMapping.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_productFundMapping.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_productFundMapping.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProductFundMappingWrapper((ProductFundMapping)_productFundMapping.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.ProductFundMapping productFundMapping) {
		return _productFundMapping.compareTo(productFundMapping);
	}

	@Override
	public int hashCode() {
		return _productFundMapping.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.ProductFundMapping> toCacheModel() {
		return _productFundMapping.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.ProductFundMapping toEscapedModel() {
		return new ProductFundMappingWrapper(_productFundMapping.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.ProductFundMapping toUnescapedModel() {
		return new ProductFundMappingWrapper(_productFundMapping.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _productFundMapping.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _productFundMapping.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_productFundMapping.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductFundMappingWrapper)) {
			return false;
		}

		ProductFundMappingWrapper productFundMappingWrapper = (ProductFundMappingWrapper)obj;

		if (Validator.equals(_productFundMapping,
					productFundMappingWrapper._productFundMapping)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProductFundMapping getWrappedProductFundMapping() {
		return _productFundMapping;
	}

	@Override
	public ProductFundMapping getWrappedModel() {
		return _productFundMapping;
	}

	@Override
	public void resetOriginalValues() {
		_productFundMapping.resetOriginalValues();
	}

	private ProductFundMapping _productFundMapping;
}