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
import com.ifli.rapid.service.PolicyFundSwitchCounterLocalServiceUtil;

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
public class PolicyFundSwitchCounterClp extends BaseModelImpl<PolicyFundSwitchCounter>
	implements PolicyFundSwitchCounter {
	public PolicyFundSwitchCounterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyFundSwitchCounter.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyFundSwitchCounter.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _POLICY_ID;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPOLICY_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _POLICY_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("FUND_SWITCH_COUNTER", getFUND_SWITCH_COUNTER());
		attributes.put("FUND_SWITCH_YEAR", getFUND_SWITCH_YEAR());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer FUND_SWITCH_COUNTER = (Integer)attributes.get(
				"FUND_SWITCH_COUNTER");

		if (FUND_SWITCH_COUNTER != null) {
			setFUND_SWITCH_COUNTER(FUND_SWITCH_COUNTER);
		}

		Date FUND_SWITCH_YEAR = (Date)attributes.get("FUND_SWITCH_YEAR");

		if (FUND_SWITCH_YEAR != null) {
			setFUND_SWITCH_YEAR(FUND_SWITCH_YEAR);
		}
	}

	@Override
	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	@Override
	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;

		if (_policyFundSwitchCounterRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchCounterRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyFundSwitchCounterRemoteModel, POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFUND_SWITCH_COUNTER() {
		return _FUND_SWITCH_COUNTER;
	}

	@Override
	public void setFUND_SWITCH_COUNTER(int FUND_SWITCH_COUNTER) {
		_FUND_SWITCH_COUNTER = FUND_SWITCH_COUNTER;

		if (_policyFundSwitchCounterRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchCounterRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_SWITCH_COUNTER",
						int.class);

				method.invoke(_policyFundSwitchCounterRemoteModel,
					FUND_SWITCH_COUNTER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFUND_SWITCH_YEAR() {
		return _FUND_SWITCH_YEAR;
	}

	@Override
	public void setFUND_SWITCH_YEAR(Date FUND_SWITCH_YEAR) {
		_FUND_SWITCH_YEAR = FUND_SWITCH_YEAR;

		if (_policyFundSwitchCounterRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchCounterRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_SWITCH_YEAR",
						Date.class);

				method.invoke(_policyFundSwitchCounterRemoteModel,
					FUND_SWITCH_YEAR);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyFundSwitchCounterRemoteModel() {
		return _policyFundSwitchCounterRemoteModel;
	}

	public void setPolicyFundSwitchCounterRemoteModel(
		BaseModel<?> policyFundSwitchCounterRemoteModel) {
		_policyFundSwitchCounterRemoteModel = policyFundSwitchCounterRemoteModel;
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

		Class<?> remoteModelClass = _policyFundSwitchCounterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyFundSwitchCounterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyFundSwitchCounterLocalServiceUtil.addPolicyFundSwitchCounter(this);
		}
		else {
			PolicyFundSwitchCounterLocalServiceUtil.updatePolicyFundSwitchCounter(this);
		}
	}

	@Override
	public PolicyFundSwitchCounter toEscapedModel() {
		return (PolicyFundSwitchCounter)ProxyUtil.newProxyInstance(PolicyFundSwitchCounter.class.getClassLoader(),
			new Class[] { PolicyFundSwitchCounter.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyFundSwitchCounterClp clone = new PolicyFundSwitchCounterClp();

		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setFUND_SWITCH_COUNTER(getFUND_SWITCH_COUNTER());
		clone.setFUND_SWITCH_YEAR(getFUND_SWITCH_YEAR());

		return clone;
	}

	@Override
	public int compareTo(PolicyFundSwitchCounter policyFundSwitchCounter) {
		String primaryKey = policyFundSwitchCounter.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolicyFundSwitchCounterClp)) {
			return false;
		}

		PolicyFundSwitchCounterClp policyFundSwitchCounter = (PolicyFundSwitchCounterClp)obj;

		String primaryKey = policyFundSwitchCounter.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", FUND_SWITCH_COUNTER=");
		sb.append(getFUND_SWITCH_COUNTER());
		sb.append(", FUND_SWITCH_YEAR=");
		sb.append(getFUND_SWITCH_YEAR());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyFundSwitchCounter");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_SWITCH_COUNTER</column-name><column-value><![CDATA[");
		sb.append(getFUND_SWITCH_COUNTER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_SWITCH_YEAR</column-name><column-value><![CDATA[");
		sb.append(getFUND_SWITCH_YEAR());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _POLICY_ID;
	private int _FUND_SWITCH_COUNTER;
	private Date _FUND_SWITCH_YEAR;
	private BaseModel<?> _policyFundSwitchCounterRemoteModel;
}