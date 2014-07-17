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

import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.ProductFundMappingLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class ProductFundMappingClp extends BaseModelImpl<ProductFundMapping>
	implements ProductFundMapping {
	public ProductFundMappingClp() {
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

		if (_productFundMappingRemoteModel != null) {
			try {
				Class<?> clazz = _productFundMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setID", int.class);

				method.invoke(_productFundMappingRemoteModel, ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRODUCT_CODE() {
		return _PRODUCT_CODE;
	}

	@Override
	public void setPRODUCT_CODE(String PRODUCT_CODE) {
		_PRODUCT_CODE = PRODUCT_CODE;

		if (_productFundMappingRemoteModel != null) {
			try {
				Class<?> clazz = _productFundMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setPRODUCT_CODE", String.class);

				method.invoke(_productFundMappingRemoteModel, PRODUCT_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFUND_CODE() {
		return _FUND_CODE;
	}

	@Override
	public void setFUND_CODE(String FUND_CODE) {
		_FUND_CODE = FUND_CODE;

		if (_productFundMappingRemoteModel != null) {
			try {
				Class<?> clazz = _productFundMappingRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_CODE", String.class);

				method.invoke(_productFundMappingRemoteModel, FUND_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProductFundMappingRemoteModel() {
		return _productFundMappingRemoteModel;
	}

	public void setProductFundMappingRemoteModel(
		BaseModel<?> productFundMappingRemoteModel) {
		_productFundMappingRemoteModel = productFundMappingRemoteModel;
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

		Class<?> remoteModelClass = _productFundMappingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_productFundMappingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProductFundMappingLocalServiceUtil.addProductFundMapping(this);
		}
		else {
			ProductFundMappingLocalServiceUtil.updateProductFundMapping(this);
		}
	}

	@Override
	public ProductFundMapping toEscapedModel() {
		return (ProductFundMapping)ProxyUtil.newProxyInstance(ProductFundMapping.class.getClassLoader(),
			new Class[] { ProductFundMapping.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProductFundMappingClp clone = new ProductFundMappingClp();

		clone.setID(getID());
		clone.setPRODUCT_CODE(getPRODUCT_CODE());
		clone.setFUND_CODE(getFUND_CODE());

		return clone;
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

		if (!(obj instanceof ProductFundMappingClp)) {
			return false;
		}

		ProductFundMappingClp productFundMapping = (ProductFundMappingClp)obj;

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

	private int _ID;
	private String _PRODUCT_CODE;
	private String _FUND_CODE;
	private BaseModel<?> _productFundMappingRemoteModel;
}