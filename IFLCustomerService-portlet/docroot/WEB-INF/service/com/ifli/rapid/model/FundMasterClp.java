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
import com.ifli.rapid.service.FundMasterLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class FundMasterClp extends BaseModelImpl<FundMaster>
	implements FundMaster {
	public FundMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FundMaster.class;
	}

	@Override
	public String getModelClassName() {
		return FundMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _FUND_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setFUND_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FUND_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_NAME", getFUND_NAME());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		String FUND_NAME = (String)attributes.get("FUND_NAME");

		if (FUND_NAME != null) {
			setFUND_NAME(FUND_NAME);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}
	}

	@Override
	public int getFUND_ID() {
		return _FUND_ID;
	}

	@Override
	public void setFUND_ID(int FUND_ID) {
		_FUND_ID = FUND_ID;

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_ID", int.class);

				method.invoke(_fundMasterRemoteModel, FUND_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFUND_NAME() {
		return _FUND_NAME;
	}

	@Override
	public void setFUND_NAME(String FUND_NAME) {
		_FUND_NAME = FUND_NAME;

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_NAME", String.class);

				method.invoke(_fundMasterRemoteModel, FUND_NAME);
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

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_CODE", String.class);

				method.invoke(_fundMasterRemoteModel, FUND_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	@Override
	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_fundMasterRemoteModel, INSERTED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getINSERTED_BY() {
		return _INSERTED_BY;
	}

	@Override
	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_fundMasterRemoteModel, INSERTED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	@Override
	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_fundMasterRemoteModel, UPDATED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUPDATED_BY() {
		return _UPDATED_BY;
	}

	@Override
	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;

		if (_fundMasterRemoteModel != null) {
			try {
				Class<?> clazz = _fundMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_fundMasterRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFundMasterRemoteModel() {
		return _fundMasterRemoteModel;
	}

	public void setFundMasterRemoteModel(BaseModel<?> fundMasterRemoteModel) {
		_fundMasterRemoteModel = fundMasterRemoteModel;
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

		Class<?> remoteModelClass = _fundMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_fundMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FundMasterLocalServiceUtil.addFundMaster(this);
		}
		else {
			FundMasterLocalServiceUtil.updateFundMaster(this);
		}
	}

	@Override
	public FundMaster toEscapedModel() {
		return (FundMaster)ProxyUtil.newProxyInstance(FundMaster.class.getClassLoader(),
			new Class[] { FundMaster.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FundMasterClp clone = new FundMasterClp();

		clone.setFUND_ID(getFUND_ID());
		clone.setFUND_NAME(getFUND_NAME());
		clone.setFUND_CODE(getFUND_CODE());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());

		return clone;
	}

	@Override
	public int compareTo(FundMaster fundMaster) {
		int primaryKey = fundMaster.getPrimaryKey();

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

		if (!(obj instanceof FundMasterClp)) {
			return false;
		}

		FundMasterClp fundMaster = (FundMasterClp)obj;

		int primaryKey = fundMaster.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{FUND_ID=");
		sb.append(getFUND_ID());
		sb.append(", FUND_NAME=");
		sb.append(getFUND_NAME());
		sb.append(", FUND_CODE=");
		sb.append(getFUND_CODE());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.FundMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FUND_ID</column-name><column-value><![CDATA[");
		sb.append(getFUND_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_NAME</column-name><column-value><![CDATA[");
		sb.append(getFUND_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_CODE</column-name><column-value><![CDATA[");
		sb.append(getFUND_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_DATE</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_BY</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _FUND_ID;
	private String _FUND_NAME;
	private String _FUND_CODE;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private BaseModel<?> _fundMasterRemoteModel;
}