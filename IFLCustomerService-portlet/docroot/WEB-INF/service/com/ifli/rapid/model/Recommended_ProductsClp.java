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
import com.ifli.rapid.service.Recommended_ProductsLocalServiceUtil;

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
public class Recommended_ProductsClp extends BaseModelImpl<Recommended_Products>
	implements Recommended_Products {
	public Recommended_ProductsClp() {
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
	public int getPrimaryKey() {
		return _PRODUCT_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPRODUCT_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PRODUCT_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getPRODUCT_ID() {
		return _PRODUCT_ID;
	}

	@Override
	public void setPRODUCT_ID(int PRODUCT_ID) {
		_PRODUCT_ID = PRODUCT_ID;

		if (_recommended_ProductsRemoteModel != null) {
			try {
				Class<?> clazz = _recommended_ProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setPRODUCT_ID", int.class);

				method.invoke(_recommended_ProductsRemoteModel, PRODUCT_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRODUCT_NAME() {
		return _PRODUCT_NAME;
	}

	@Override
	public void setPRODUCT_NAME(String PRODUCT_NAME) {
		_PRODUCT_NAME = PRODUCT_NAME;

		if (_recommended_ProductsRemoteModel != null) {
			try {
				Class<?> clazz = _recommended_ProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setPRODUCT_NAME", String.class);

				method.invoke(_recommended_ProductsRemoteModel, PRODUCT_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIMG_URL() {
		return _IMG_URL;
	}

	@Override
	public void setIMG_URL(String IMG_URL) {
		_IMG_URL = IMG_URL;

		if (_recommended_ProductsRemoteModel != null) {
			try {
				Class<?> clazz = _recommended_ProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setIMG_URL", String.class);

				method.invoke(_recommended_ProductsRemoteModel, IMG_URL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRecommended_ProductsRemoteModel() {
		return _recommended_ProductsRemoteModel;
	}

	public void setRecommended_ProductsRemoteModel(
		BaseModel<?> recommended_ProductsRemoteModel) {
		_recommended_ProductsRemoteModel = recommended_ProductsRemoteModel;
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

		Class<?> remoteModelClass = _recommended_ProductsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_recommended_ProductsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Recommended_ProductsLocalServiceUtil.addRecommended_Products(this);
		}
		else {
			Recommended_ProductsLocalServiceUtil.updateRecommended_Products(this);
		}
	}

	@Override
	public Recommended_Products toEscapedModel() {
		return (Recommended_Products)ProxyUtil.newProxyInstance(Recommended_Products.class.getClassLoader(),
			new Class[] { Recommended_Products.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Recommended_ProductsClp clone = new Recommended_ProductsClp();

		clone.setPRODUCT_ID(getPRODUCT_ID());
		clone.setPRODUCT_NAME(getPRODUCT_NAME());
		clone.setIMG_URL(getIMG_URL());

		return clone;
	}

	@Override
	public int compareTo(Recommended_Products recommended_Products) {
		int primaryKey = recommended_Products.getPrimaryKey();

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

		if (!(obj instanceof Recommended_ProductsClp)) {
			return false;
		}

		Recommended_ProductsClp recommended_Products = (Recommended_ProductsClp)obj;

		int primaryKey = recommended_Products.getPrimaryKey();

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

		sb.append("{PRODUCT_ID=");
		sb.append(getPRODUCT_ID());
		sb.append(", PRODUCT_NAME=");
		sb.append(getPRODUCT_NAME());
		sb.append(", IMG_URL=");
		sb.append(getIMG_URL());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.Recommended_Products");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PRODUCT_ID</column-name><column-value><![CDATA[");
		sb.append(getPRODUCT_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRODUCT_NAME</column-name><column-value><![CDATA[");
		sb.append(getPRODUCT_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IMG_URL</column-name><column-value><![CDATA[");
		sb.append(getIMG_URL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _PRODUCT_ID;
	private String _PRODUCT_NAME;
	private String _IMG_URL;
	private BaseModel<?> _recommended_ProductsRemoteModel;
}