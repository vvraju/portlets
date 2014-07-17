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
import com.ifli.rapid.service.PolicyPremPercentageLocalServiceUtil;

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
public class PolicyPremPercentageClp extends BaseModelImpl<PolicyPremPercentage>
	implements PolicyPremPercentage {
	public PolicyPremPercentageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyPremPercentage.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyPremPercentage.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _PREM_PERCENTAGE_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPREM_PERCENTAGE_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PREM_PERCENTAGE_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PREM_PERCENTAGE_ID", getPREM_PERCENTAGE_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_PERCENTAGE", getFUND_PERCENTAGE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PREM_PERCENTAGE_ID = (Integer)attributes.get(
				"PREM_PERCENTAGE_ID");

		if (PREM_PERCENTAGE_ID != null) {
			setPREM_PERCENTAGE_ID(PREM_PERCENTAGE_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		Integer FUND_PERCENTAGE = (Integer)attributes.get("FUND_PERCENTAGE");

		if (FUND_PERCENTAGE != null) {
			setFUND_PERCENTAGE(FUND_PERCENTAGE);
		}
	}

	@Override
	public int getPREM_PERCENTAGE_ID() {
		return _PREM_PERCENTAGE_ID;
	}

	@Override
	public void setPREM_PERCENTAGE_ID(int PREM_PERCENTAGE_ID) {
		_PREM_PERCENTAGE_ID = PREM_PERCENTAGE_ID;

		if (_policyPremPercentageRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremPercentageRemoteModel.getClass();

				Method method = clazz.getMethod("setPREM_PERCENTAGE_ID",
						int.class);

				method.invoke(_policyPremPercentageRemoteModel,
					PREM_PERCENTAGE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPOLICY_ID() {
		return _POLICY_ID;
	}

	@Override
	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;

		if (_policyPremPercentageRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremPercentageRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyPremPercentageRemoteModel, POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFUND_ID() {
		return _FUND_ID;
	}

	@Override
	public void setFUND_ID(int FUND_ID) {
		_FUND_ID = FUND_ID;

		if (_policyPremPercentageRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremPercentageRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_ID", int.class);

				method.invoke(_policyPremPercentageRemoteModel, FUND_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFUND_PERCENTAGE() {
		return _FUND_PERCENTAGE;
	}

	@Override
	public void setFUND_PERCENTAGE(int FUND_PERCENTAGE) {
		_FUND_PERCENTAGE = FUND_PERCENTAGE;

		if (_policyPremPercentageRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremPercentageRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_PERCENTAGE", int.class);

				method.invoke(_policyPremPercentageRemoteModel, FUND_PERCENTAGE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyPremPercentageRemoteModel() {
		return _policyPremPercentageRemoteModel;
	}

	public void setPolicyPremPercentageRemoteModel(
		BaseModel<?> policyPremPercentageRemoteModel) {
		_policyPremPercentageRemoteModel = policyPremPercentageRemoteModel;
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

		Class<?> remoteModelClass = _policyPremPercentageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyPremPercentageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyPremPercentageLocalServiceUtil.addPolicyPremPercentage(this);
		}
		else {
			PolicyPremPercentageLocalServiceUtil.updatePolicyPremPercentage(this);
		}
	}

	@Override
	public PolicyPremPercentage toEscapedModel() {
		return (PolicyPremPercentage)ProxyUtil.newProxyInstance(PolicyPremPercentage.class.getClassLoader(),
			new Class[] { PolicyPremPercentage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyPremPercentageClp clone = new PolicyPremPercentageClp();

		clone.setPREM_PERCENTAGE_ID(getPREM_PERCENTAGE_ID());
		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setFUND_ID(getFUND_ID());
		clone.setFUND_PERCENTAGE(getFUND_PERCENTAGE());

		return clone;
	}

	@Override
	public int compareTo(PolicyPremPercentage policyPremPercentage) {
		int primaryKey = policyPremPercentage.getPrimaryKey();

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

		if (!(obj instanceof PolicyPremPercentageClp)) {
			return false;
		}

		PolicyPremPercentageClp policyPremPercentage = (PolicyPremPercentageClp)obj;

		int primaryKey = policyPremPercentage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{PREM_PERCENTAGE_ID=");
		sb.append(getPREM_PERCENTAGE_ID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", FUND_ID=");
		sb.append(getFUND_ID());
		sb.append(", FUND_PERCENTAGE=");
		sb.append(getFUND_PERCENTAGE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyPremPercentage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PREM_PERCENTAGE_ID</column-name><column-value><![CDATA[");
		sb.append(getPREM_PERCENTAGE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_ID</column-name><column-value><![CDATA[");
		sb.append(getFUND_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_PERCENTAGE</column-name><column-value><![CDATA[");
		sb.append(getFUND_PERCENTAGE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _PREM_PERCENTAGE_ID;
	private String _POLICY_ID;
	private int _FUND_ID;
	private int _FUND_PERCENTAGE;
	private BaseModel<?> _policyPremPercentageRemoteModel;
}