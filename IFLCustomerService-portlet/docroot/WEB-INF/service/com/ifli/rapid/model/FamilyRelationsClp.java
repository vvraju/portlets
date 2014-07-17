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
import com.ifli.rapid.service.FamilyRelationsLocalServiceUtil;

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
public class FamilyRelationsClp extends BaseModelImpl<FamilyRelations>
	implements FamilyRelations {
	public FamilyRelationsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FamilyRelations.class;
	}

	@Override
	public String getModelClassName() {
		return FamilyRelations.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _RELATION_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setRELATION_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _RELATION_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RELATION_ID", getRELATION_ID());
		attributes.put("RELATION_NAME", getRELATION_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer RELATION_ID = (Integer)attributes.get("RELATION_ID");

		if (RELATION_ID != null) {
			setRELATION_ID(RELATION_ID);
		}

		String RELATION_NAME = (String)attributes.get("RELATION_NAME");

		if (RELATION_NAME != null) {
			setRELATION_NAME(RELATION_NAME);
		}
	}

	@Override
	public int getRELATION_ID() {
		return _RELATION_ID;
	}

	@Override
	public void setRELATION_ID(int RELATION_ID) {
		_RELATION_ID = RELATION_ID;

		if (_familyRelationsRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationsRemoteModel.getClass();

				Method method = clazz.getMethod("setRELATION_ID", int.class);

				method.invoke(_familyRelationsRemoteModel, RELATION_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRELATION_NAME() {
		return _RELATION_NAME;
	}

	@Override
	public void setRELATION_NAME(String RELATION_NAME) {
		_RELATION_NAME = RELATION_NAME;

		if (_familyRelationsRemoteModel != null) {
			try {
				Class<?> clazz = _familyRelationsRemoteModel.getClass();

				Method method = clazz.getMethod("setRELATION_NAME", String.class);

				method.invoke(_familyRelationsRemoteModel, RELATION_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFamilyRelationsRemoteModel() {
		return _familyRelationsRemoteModel;
	}

	public void setFamilyRelationsRemoteModel(
		BaseModel<?> familyRelationsRemoteModel) {
		_familyRelationsRemoteModel = familyRelationsRemoteModel;
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

		Class<?> remoteModelClass = _familyRelationsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_familyRelationsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FamilyRelationsLocalServiceUtil.addFamilyRelations(this);
		}
		else {
			FamilyRelationsLocalServiceUtil.updateFamilyRelations(this);
		}
	}

	@Override
	public FamilyRelations toEscapedModel() {
		return (FamilyRelations)ProxyUtil.newProxyInstance(FamilyRelations.class.getClassLoader(),
			new Class[] { FamilyRelations.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FamilyRelationsClp clone = new FamilyRelationsClp();

		clone.setRELATION_ID(getRELATION_ID());
		clone.setRELATION_NAME(getRELATION_NAME());

		return clone;
	}

	@Override
	public int compareTo(FamilyRelations familyRelations) {
		int primaryKey = familyRelations.getPrimaryKey();

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

		if (!(obj instanceof FamilyRelationsClp)) {
			return false;
		}

		FamilyRelationsClp familyRelations = (FamilyRelationsClp)obj;

		int primaryKey = familyRelations.getPrimaryKey();

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

		sb.append("{RELATION_ID=");
		sb.append(getRELATION_ID());
		sb.append(", RELATION_NAME=");
		sb.append(getRELATION_NAME());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.FamilyRelations");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>RELATION_ID</column-name><column-value><![CDATA[");
		sb.append(getRELATION_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RELATION_NAME</column-name><column-value><![CDATA[");
		sb.append(getRELATION_NAME());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _RELATION_ID;
	private String _RELATION_NAME;
	private BaseModel<?> _familyRelationsRemoteModel;
}