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
import com.ifli.rapid.service.POLICY_DOC_TYPESLocalServiceUtil;

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
public class POLICY_DOC_TYPESClp extends BaseModelImpl<POLICY_DOC_TYPES>
	implements POLICY_DOC_TYPES {
	public POLICY_DOC_TYPESClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return POLICY_DOC_TYPES.class;
	}

	@Override
	public String getModelClassName() {
		return POLICY_DOC_TYPES.class.getName();
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
		attributes.put("DOC_NAME", getDOC_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String DOC_NAME = (String)attributes.get("DOC_NAME");

		if (DOC_NAME != null) {
			setDOC_NAME(DOC_NAME);
		}
	}

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;

		if (_policy_doc_typesRemoteModel != null) {
			try {
				Class<?> clazz = _policy_doc_typesRemoteModel.getClass();

				Method method = clazz.getMethod("setID", int.class);

				method.invoke(_policy_doc_typesRemoteModel, ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDOC_NAME() {
		return _DOC_NAME;
	}

	@Override
	public void setDOC_NAME(String DOC_NAME) {
		_DOC_NAME = DOC_NAME;

		if (_policy_doc_typesRemoteModel != null) {
			try {
				Class<?> clazz = _policy_doc_typesRemoteModel.getClass();

				Method method = clazz.getMethod("setDOC_NAME", String.class);

				method.invoke(_policy_doc_typesRemoteModel, DOC_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPOLICY_DOC_TYPESRemoteModel() {
		return _policy_doc_typesRemoteModel;
	}

	public void setPOLICY_DOC_TYPESRemoteModel(
		BaseModel<?> policy_doc_typesRemoteModel) {
		_policy_doc_typesRemoteModel = policy_doc_typesRemoteModel;
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

		Class<?> remoteModelClass = _policy_doc_typesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policy_doc_typesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			POLICY_DOC_TYPESLocalServiceUtil.addPOLICY_DOC_TYPES(this);
		}
		else {
			POLICY_DOC_TYPESLocalServiceUtil.updatePOLICY_DOC_TYPES(this);
		}
	}

	@Override
	public POLICY_DOC_TYPES toEscapedModel() {
		return (POLICY_DOC_TYPES)ProxyUtil.newProxyInstance(POLICY_DOC_TYPES.class.getClassLoader(),
			new Class[] { POLICY_DOC_TYPES.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		POLICY_DOC_TYPESClp clone = new POLICY_DOC_TYPESClp();

		clone.setID(getID());
		clone.setDOC_NAME(getDOC_NAME());

		return clone;
	}

	@Override
	public int compareTo(POLICY_DOC_TYPES policy_doc_types) {
		int primaryKey = policy_doc_types.getPrimaryKey();

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

		if (!(obj instanceof POLICY_DOC_TYPESClp)) {
			return false;
		}

		POLICY_DOC_TYPESClp policy_doc_types = (POLICY_DOC_TYPESClp)obj;

		int primaryKey = policy_doc_types.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", DOC_NAME=");
		sb.append(getDOC_NAME());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.POLICY_DOC_TYPES");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DOC_NAME</column-name><column-value><![CDATA[");
		sb.append(getDOC_NAME());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _ID;
	private String _DOC_NAME;
	private BaseModel<?> _policy_doc_typesRemoteModel;
}