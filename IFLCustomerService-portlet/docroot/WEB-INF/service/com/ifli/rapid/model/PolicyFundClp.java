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
import com.ifli.rapid.service.PolicyFundLocalServiceUtil;

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
public class PolicyFundClp extends BaseModelImpl<PolicyFund>
	implements PolicyFund {
	public PolicyFundClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyFund.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyFund.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _POLICY_FUND_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPOLICY_FUND_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _POLICY_FUND_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("POLICY_FUND_ID", getPOLICY_FUND_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_UNITS", getFUND_UNITS());
		attributes.put("NAV", getNAV());
		attributes.put("TOTAL_FUND", getTOTAL_FUND());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer POLICY_FUND_ID = (Integer)attributes.get("POLICY_FUND_ID");

		if (POLICY_FUND_ID != null) {
			setPOLICY_FUND_ID(POLICY_FUND_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		Double FUND_UNITS = (Double)attributes.get("FUND_UNITS");

		if (FUND_UNITS != null) {
			setFUND_UNITS(FUND_UNITS);
		}

		Double NAV = (Double)attributes.get("NAV");

		if (NAV != null) {
			setNAV(NAV);
		}

		Double TOTAL_FUND = (Double)attributes.get("TOTAL_FUND");

		if (TOTAL_FUND != null) {
			setTOTAL_FUND(TOTAL_FUND);
		}
	}

	@Override
	public int getPOLICY_FUND_ID() {
		return _POLICY_FUND_ID;
	}

	@Override
	public void setPOLICY_FUND_ID(int POLICY_FUND_ID) {
		_POLICY_FUND_ID = POLICY_FUND_ID;

		if (_policyFundRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_FUND_ID", int.class);

				method.invoke(_policyFundRemoteModel, POLICY_FUND_ID);
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

		if (_policyFundRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyFundRemoteModel, POLICY_ID);
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

		if (_policyFundRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_ID", int.class);

				method.invoke(_policyFundRemoteModel, FUND_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getFUND_UNITS() {
		return _FUND_UNITS;
	}

	@Override
	public void setFUND_UNITS(double FUND_UNITS) {
		_FUND_UNITS = FUND_UNITS;

		if (_policyFundRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_UNITS", double.class);

				method.invoke(_policyFundRemoteModel, FUND_UNITS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getNAV() {
		return _NAV;
	}

	@Override
	public void setNAV(double NAV) {
		_NAV = NAV;

		if (_policyFundRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundRemoteModel.getClass();

				Method method = clazz.getMethod("setNAV", double.class);

				method.invoke(_policyFundRemoteModel, NAV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTOTAL_FUND() {
		return _TOTAL_FUND;
	}

	@Override
	public void setTOTAL_FUND(double TOTAL_FUND) {
		_TOTAL_FUND = TOTAL_FUND;

		if (_policyFundRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundRemoteModel.getClass();

				Method method = clazz.getMethod("setTOTAL_FUND", double.class);

				method.invoke(_policyFundRemoteModel, TOTAL_FUND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyFundRemoteModel() {
		return _policyFundRemoteModel;
	}

	public void setPolicyFundRemoteModel(BaseModel<?> policyFundRemoteModel) {
		_policyFundRemoteModel = policyFundRemoteModel;
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

		Class<?> remoteModelClass = _policyFundRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyFundRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyFundLocalServiceUtil.addPolicyFund(this);
		}
		else {
			PolicyFundLocalServiceUtil.updatePolicyFund(this);
		}
	}

	@Override
	public PolicyFund toEscapedModel() {
		return (PolicyFund)ProxyUtil.newProxyInstance(PolicyFund.class.getClassLoader(),
			new Class[] { PolicyFund.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyFundClp clone = new PolicyFundClp();

		clone.setPOLICY_FUND_ID(getPOLICY_FUND_ID());
		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setFUND_ID(getFUND_ID());
		clone.setFUND_UNITS(getFUND_UNITS());
		clone.setNAV(getNAV());
		clone.setTOTAL_FUND(getTOTAL_FUND());

		return clone;
	}

	@Override
	public int compareTo(PolicyFund policyFund) {
		int primaryKey = policyFund.getPrimaryKey();

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

		if (!(obj instanceof PolicyFundClp)) {
			return false;
		}

		PolicyFundClp policyFund = (PolicyFundClp)obj;

		int primaryKey = policyFund.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{POLICY_FUND_ID=");
		sb.append(getPOLICY_FUND_ID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", FUND_ID=");
		sb.append(getFUND_ID());
		sb.append(", FUND_UNITS=");
		sb.append(getFUND_UNITS());
		sb.append(", NAV=");
		sb.append(getNAV());
		sb.append(", TOTAL_FUND=");
		sb.append(getTOTAL_FUND());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyFund");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>POLICY_FUND_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_FUND_ID());
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
			"<column><column-name>FUND_UNITS</column-name><column-value><![CDATA[");
		sb.append(getFUND_UNITS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NAV</column-name><column-value><![CDATA[");
		sb.append(getNAV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TOTAL_FUND</column-name><column-value><![CDATA[");
		sb.append(getTOTAL_FUND());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _POLICY_FUND_ID;
	private String _POLICY_ID;
	private int _FUND_ID;
	private double _FUND_UNITS;
	private double _NAV;
	private double _TOTAL_FUND;
	private BaseModel<?> _policyFundRemoteModel;
}