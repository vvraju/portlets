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
 * This class is a wrapper for {@link Recommended_Products}.
 * </p>
 *
 * @author Satya Kola
 * @see Recommended_Products
 * @generated
 */
public class Recommended_ProductsWrapper implements Recommended_Products,
	ModelWrapper<Recommended_Products> {
	public Recommended_ProductsWrapper(
		Recommended_Products recommended_Products) {
		_recommended_Products = recommended_Products;
	}

	@Override
	public Class<?> getModelClass() {
		return Recommended_Products.class;
	}

	@Override
	public String getModelClassName() {
		return Recommended_Products.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PRODUCT_ID", getPRODUCT_ID());
		attributes.put("PRODUCT_NAME", getPRODUCT_NAME());
		attributes.put("IMG_URL", getIMG_URL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PRODUCT_ID = (Integer)attributes.get("PRODUCT_ID");

		if (PRODUCT_ID != null) {
			setPRODUCT_ID(PRODUCT_ID);
		}

		String PRODUCT_NAME = (String)attributes.get("PRODUCT_NAME");

		if (PRODUCT_NAME != null) {
			setPRODUCT_NAME(PRODUCT_NAME);
		}

		String IMG_URL = (String)attributes.get("IMG_URL");

		if (IMG_URL != null) {
			setIMG_URL(IMG_URL);
		}
	}

	/**
	* Returns the primary key of this recommended_ products.
	*
	* @return the primary key of this recommended_ products
	*/
	@Override
	public int getPrimaryKey() {
		return _recommended_Products.getPrimaryKey();
	}

	/**
	* Sets the primary key of this recommended_ products.
	*
	* @param primaryKey the primary key of this recommended_ products
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_recommended_Products.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the p r o d u c t_ i d of this recommended_ products.
	*
	* @return the p r o d u c t_ i d of this recommended_ products
	*/
	@Override
	public int getPRODUCT_ID() {
		return _recommended_Products.getPRODUCT_ID();
	}

	/**
	* Sets the p r o d u c t_ i d of this recommended_ products.
	*
	* @param PRODUCT_ID the p r o d u c t_ i d of this recommended_ products
	*/
	@Override
	public void setPRODUCT_ID(int PRODUCT_ID) {
		_recommended_Products.setPRODUCT_ID(PRODUCT_ID);
	}

	/**
	* Returns the p r o d u c t_ n a m e of this recommended_ products.
	*
	* @return the p r o d u c t_ n a m e of this recommended_ products
	*/
	@Override
	public java.lang.String getPRODUCT_NAME() {
		return _recommended_Products.getPRODUCT_NAME();
	}

	/**
	* Sets the p r o d u c t_ n a m e of this recommended_ products.
	*
	* @param PRODUCT_NAME the p r o d u c t_ n a m e of this recommended_ products
	*/
	@Override
	public void setPRODUCT_NAME(java.lang.String PRODUCT_NAME) {
		_recommended_Products.setPRODUCT_NAME(PRODUCT_NAME);
	}

	/**
	* Returns the i m g_ u r l of this recommended_ products.
	*
	* @return the i m g_ u r l of this recommended_ products
	*/
	@Override
	public java.lang.String getIMG_URL() {
		return _recommended_Products.getIMG_URL();
	}

	/**
	* Sets the i m g_ u r l of this recommended_ products.
	*
	* @param IMG_URL the i m g_ u r l of this recommended_ products
	*/
	@Override
	public void setIMG_URL(java.lang.String IMG_URL) {
		_recommended_Products.setIMG_URL(IMG_URL);
	}

	@Override
	public boolean isNew() {
		return _recommended_Products.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_recommended_Products.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _recommended_Products.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_recommended_Products.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _recommended_Products.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _recommended_Products.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_recommended_Products.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _recommended_Products.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_recommended_Products.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_recommended_Products.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_recommended_Products.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Recommended_ProductsWrapper((Recommended_Products)_recommended_Products.clone());
	}

	@Override
	public int compareTo(
		com.ifli.rapid.model.Recommended_Products recommended_Products) {
		return _recommended_Products.compareTo(recommended_Products);
	}

	@Override
	public int hashCode() {
		return _recommended_Products.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.Recommended_Products> toCacheModel() {
		return _recommended_Products.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.Recommended_Products toEscapedModel() {
		return new Recommended_ProductsWrapper(_recommended_Products.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.Recommended_Products toUnescapedModel() {
		return new Recommended_ProductsWrapper(_recommended_Products.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _recommended_Products.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _recommended_Products.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_recommended_Products.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Recommended_ProductsWrapper)) {
			return false;
		}

		Recommended_ProductsWrapper recommended_ProductsWrapper = (Recommended_ProductsWrapper)obj;

		if (Validator.equals(_recommended_Products,
					recommended_ProductsWrapper._recommended_Products)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Recommended_Products getWrappedRecommended_Products() {
		return _recommended_Products;
	}

	@Override
	public Recommended_Products getWrappedModel() {
		return _recommended_Products;
	}

	@Override
	public void resetOriginalValues() {
		_recommended_Products.resetOriginalValues();
	}

	private Recommended_Products _recommended_Products;
}