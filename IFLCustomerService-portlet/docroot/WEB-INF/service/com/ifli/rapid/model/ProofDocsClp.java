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
import com.ifli.rapid.service.ProofDocsLocalServiceUtil;

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
public class ProofDocsClp extends BaseModelImpl<ProofDocs> implements ProofDocs {
	public ProofDocsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ProofDocs.class;
	}

	@Override
	public String getModelClassName() {
		return ProofDocs.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _ID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("DOC_TYPE", getDOC_TYPE());
		attributes.put("DOC_NAME", getDOC_NAME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ID = (Long)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String DOC_TYPE = (String)attributes.get("DOC_TYPE");

		if (DOC_TYPE != null) {
			setDOC_TYPE(DOC_TYPE);
		}

		String DOC_NAME = (String)attributes.get("DOC_NAME");

		if (DOC_NAME != null) {
			setDOC_NAME(DOC_NAME);
		}
	}

	@Override
	public long getID() {
		return _ID;
	}

	@Override
	public void setID(long ID) {
		_ID = ID;

		if (_proofDocsRemoteModel != null) {
			try {
				Class<?> clazz = _proofDocsRemoteModel.getClass();

				Method method = clazz.getMethod("setID", long.class);

				method.invoke(_proofDocsRemoteModel, ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDOC_TYPE() {
		return _DOC_TYPE;
	}

	@Override
	public void setDOC_TYPE(String DOC_TYPE) {
		_DOC_TYPE = DOC_TYPE;

		if (_proofDocsRemoteModel != null) {
			try {
				Class<?> clazz = _proofDocsRemoteModel.getClass();

				Method method = clazz.getMethod("setDOC_TYPE", String.class);

				method.invoke(_proofDocsRemoteModel, DOC_TYPE);
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

		if (_proofDocsRemoteModel != null) {
			try {
				Class<?> clazz = _proofDocsRemoteModel.getClass();

				Method method = clazz.getMethod("setDOC_NAME", String.class);

				method.invoke(_proofDocsRemoteModel, DOC_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProofDocsRemoteModel() {
		return _proofDocsRemoteModel;
	}

	public void setProofDocsRemoteModel(BaseModel<?> proofDocsRemoteModel) {
		_proofDocsRemoteModel = proofDocsRemoteModel;
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

		Class<?> remoteModelClass = _proofDocsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_proofDocsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProofDocsLocalServiceUtil.addProofDocs(this);
		}
		else {
			ProofDocsLocalServiceUtil.updateProofDocs(this);
		}
	}

	@Override
	public ProofDocs toEscapedModel() {
		return (ProofDocs)ProxyUtil.newProxyInstance(ProofDocs.class.getClassLoader(),
			new Class[] { ProofDocs.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProofDocsClp clone = new ProofDocsClp();

		clone.setID(getID());
		clone.setDOC_TYPE(getDOC_TYPE());
		clone.setDOC_NAME(getDOC_NAME());

		return clone;
	}

	@Override
	public int compareTo(ProofDocs proofDocs) {
		long primaryKey = proofDocs.getPrimaryKey();

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

		if (!(obj instanceof ProofDocsClp)) {
			return false;
		}

		ProofDocsClp proofDocs = (ProofDocsClp)obj;

		long primaryKey = proofDocs.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", DOC_TYPE=");
		sb.append(getDOC_TYPE());
		sb.append(", DOC_NAME=");
		sb.append(getDOC_NAME());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ProofDocs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DOC_TYPE</column-name><column-value><![CDATA[");
		sb.append(getDOC_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DOC_NAME</column-name><column-value><![CDATA[");
		sb.append(getDOC_NAME());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ID;
	private String _DOC_TYPE;
	private String _DOC_NAME;
	private BaseModel<?> _proofDocsRemoteModel;
}