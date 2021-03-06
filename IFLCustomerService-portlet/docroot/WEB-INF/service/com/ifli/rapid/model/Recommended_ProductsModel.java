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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Recommended_Products service. Represents a row in the &quot;recommended_products&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.Recommended_ProductsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see Recommended_Products
 * @see com.ifli.rapid.model.impl.Recommended_ProductsImpl
 * @see com.ifli.rapid.model.impl.Recommended_ProductsModelImpl
 * @generated
 */
public interface Recommended_ProductsModel extends BaseModel<Recommended_Products> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a recommended_ products model instance should use the {@link Recommended_Products} interface instead.
	 */

	/**
	 * Returns the primary key of this recommended_ products.
	 *
	 * @return the primary key of this recommended_ products
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this recommended_ products.
	 *
	 * @param primaryKey the primary key of this recommended_ products
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the p r o d u c t_ i d of this recommended_ products.
	 *
	 * @return the p r o d u c t_ i d of this recommended_ products
	 */
	public int getPRODUCT_ID();

	/**
	 * Sets the p r o d u c t_ i d of this recommended_ products.
	 *
	 * @param PRODUCT_ID the p r o d u c t_ i d of this recommended_ products
	 */
	public void setPRODUCT_ID(int PRODUCT_ID);

	/**
	 * Returns the p r o d u c t_ n a m e of this recommended_ products.
	 *
	 * @return the p r o d u c t_ n a m e of this recommended_ products
	 */
	@AutoEscape
	public String getPRODUCT_NAME();

	/**
	 * Sets the p r o d u c t_ n a m e of this recommended_ products.
	 *
	 * @param PRODUCT_NAME the p r o d u c t_ n a m e of this recommended_ products
	 */
	public void setPRODUCT_NAME(String PRODUCT_NAME);

	/**
	 * Returns the i m g_ u r l of this recommended_ products.
	 *
	 * @return the i m g_ u r l of this recommended_ products
	 */
	@AutoEscape
	public String getIMG_URL();

	/**
	 * Sets the i m g_ u r l of this recommended_ products.
	 *
	 * @param IMG_URL the i m g_ u r l of this recommended_ products
	 */
	public void setIMG_URL(String IMG_URL);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Recommended_Products recommended_Products);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Recommended_Products> toCacheModel();

	@Override
	public Recommended_Products toEscapedModel();

	@Override
	public Recommended_Products toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}