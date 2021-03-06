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

package com.ifli.rapid.model.impl;

import com.ifli.rapid.model.ProductFundMapping;
import com.ifli.rapid.model.ProductFundMappingModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ProductFundMapping service. Represents a row in the &quot;product_fund_mapping&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.ProductFundMappingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProductFundMappingImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ProductFundMappingImpl
 * @see com.ifli.rapid.model.ProductFundMapping
 * @see com.ifli.rapid.model.ProductFundMappingModel
 * @generated
 */
public class ProductFundMappingModelImpl extends BaseModelImpl<ProductFundMapping>
	implements ProductFundMappingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a product fund mapping model instance should use the {@link com.ifli.rapid.model.ProductFundMapping} interface instead.
	 */
	public static final String TABLE_NAME = "product_fund_mapping";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "PRODUCT_CODE", Types.VARCHAR },
			{ "FUND_CODE", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table product_fund_mapping (ID INTEGER not null primary key,PRODUCT_CODE VARCHAR(75) null,FUND_CODE VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table product_fund_mapping";
	public static final String ORDER_BY_JPQL = " ORDER BY productFundMapping.ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY product_fund_mapping.ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.ProductFundMapping"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.ProductFundMapping"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.ProductFundMapping"));

	public ProductFundMappingModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;
	}

	@Override
	public String getPRODUCT_CODE() {
		if (_PRODUCT_CODE == null) {
			return StringPool.BLANK;
		}
		else {
			return _PRODUCT_CODE;
		}
	}

	@Override
	public void setPRODUCT_CODE(String PRODUCT_CODE) {
		_PRODUCT_CODE = PRODUCT_CODE;
	}

	@Override
	public String getFUND_CODE() {
		if (_FUND_CODE == null) {
			return StringPool.BLANK;
		}
		else {
			return _FUND_CODE;
		}
	}

	@Override
	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;
	}

	@Override
	public ProductFundMapping toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ProductFundMapping)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProductFundMappingImpl productFundMappingImpl = new ProductFundMappingImpl();

		productFundMappingImpl.setID(getID());
		productFundMappingImpl.setPRODUCT_CODE(getPRODUCT_CODE());
		productFundMappingImpl.setFUND_CODE(getFUND_CODE());

		productFundMappingImpl.resetOriginalValues();

		return productFundMappingImpl;
	}

	@Override
	public int compareTo(ProductFundMapping productFundMapping) {
		int primaryKey = productFundMapping.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductFundMapping)) {
			return false;
		}

		ProductFundMapping productFundMapping = (ProductFundMapping)obj;

		int primaryKey = productFundMapping.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<ProductFundMapping> toCacheModel() {
		ProductFundMappingCacheModel productFundMappingCacheModel = new ProductFundMappingCacheModel();

		productFundMappingCacheModel.ID = getID();

		productFundMappingCacheModel.PRODUCT_CODE = getPRODUCT_CODE();

		String PRODUCT_CODE = productFundMappingCacheModel.PRODUCT_CODE;

		if ((PRODUCT_CODE != null) && (PRODUCT_CODE.length() == 0)) {
			productFundMappingCacheModel.PRODUCT_CODE = null;
		}

		productFundMappingCacheModel.FUND_CODE = getFUND_CODE();

		String FUND_CODE = productFundMappingCacheModel.FUND_CODE;

		if ((FUND_CODE != null) && (FUND_CODE.length() == 0)) {
			productFundMappingCacheModel.FUND_CODE = null;
		}

		return productFundMappingCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", PRODUCT_CODE=");
		sb.append(getPRODUCT_CODE());
		sb.append(", FUND_CODE=");
		sb.append(getFUND_CODE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ProductFundMapping");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRODUCT_CODE</column-name><column-value><![CDATA[");
		sb.append(getPRODUCT_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_CODE</column-name><column-value><![CDATA[");
		sb.append(getFUND_CODE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ProductFundMapping.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ProductFundMapping.class
		};
	private int _ID;
	private String _PRODUCT_CODE;
	private String _FUND_CODE;
	private ProductFundMapping _escapedModel;
}