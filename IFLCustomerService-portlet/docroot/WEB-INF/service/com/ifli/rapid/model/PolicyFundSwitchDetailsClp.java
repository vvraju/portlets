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
import com.ifli.rapid.service.PolicyFundSwitchDetailsLocalServiceUtil;

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
public class PolicyFundSwitchDetailsClp extends BaseModelImpl<PolicyFundSwitchDetails>
	implements PolicyFundSwitchDetails {
	public PolicyFundSwitchDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyFundSwitchDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyFundSwitchDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _FUND_SWITCH_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setFUND_SWITCH_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FUND_SWITCH_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FUND_SWITCH_ID", getFUND_SWITCH_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("FUND_FROM", getFUND_FROM());
		attributes.put("FUND_TO", getFUND_TO());
		attributes.put("PRECENTAGE_OF_UNITS", getPRECENTAGE_OF_UNITS());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FUND_SWITCH_ID = (Integer)attributes.get("FUND_SWITCH_ID");

		if (FUND_SWITCH_ID != null) {
			setFUND_SWITCH_ID(FUND_SWITCH_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String FUND_FROM = (String)attributes.get("FUND_FROM");

		if (FUND_FROM != null) {
			setFUND_FROM(FUND_FROM);
		}

		String FUND_TO = (String)attributes.get("FUND_TO");

		if (FUND_TO != null) {
			setFUND_TO(FUND_TO);
		}

		Double PRECENTAGE_OF_UNITS = (Double)attributes.get(
				"PRECENTAGE_OF_UNITS");

		if (PRECENTAGE_OF_UNITS != null) {
			setPRECENTAGE_OF_UNITS(PRECENTAGE_OF_UNITS);
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
	public int getFUND_SWITCH_ID() {
		return _FUND_SWITCH_ID;
	}

	@Override
	public void setFUND_SWITCH_ID(int FUND_SWITCH_ID) {
		_FUND_SWITCH_ID = FUND_SWITCH_ID;

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_SWITCH_ID", int.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel,
					FUND_SWITCH_ID);
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

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, QRC_ASR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFUND_FROM() {
		return _FUND_FROM;
	}

	@Override
	public void setFUND_FROM(String FUND_FROM) {
		_FUND_FROM = FUND_FROM;

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_FROM", String.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, FUND_FROM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFUND_TO() {
		return _FUND_TO;
	}

	@Override
	public void setFUND_TO(String FUND_TO) {
		_FUND_TO = FUND_TO;

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_TO", String.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, FUND_TO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPRECENTAGE_OF_UNITS() {
		return _PRECENTAGE_OF_UNITS;
	}

	@Override
	public void setPRECENTAGE_OF_UNITS(double PRECENTAGE_OF_UNITS) {
		_PRECENTAGE_OF_UNITS = PRECENTAGE_OF_UNITS;

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPRECENTAGE_OF_UNITS",
						double.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel,
					PRECENTAGE_OF_UNITS);
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

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, INSERTED_DATE);
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

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, INSERTED_BY);
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

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, UPDATED_DATE);
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

		if (_policyFundSwitchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyFundSwitchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_policyFundSwitchDetailsRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyFundSwitchDetailsRemoteModel() {
		return _policyFundSwitchDetailsRemoteModel;
	}

	public void setPolicyFundSwitchDetailsRemoteModel(
		BaseModel<?> policyFundSwitchDetailsRemoteModel) {
		_policyFundSwitchDetailsRemoteModel = policyFundSwitchDetailsRemoteModel;
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

		Class<?> remoteModelClass = _policyFundSwitchDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyFundSwitchDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyFundSwitchDetailsLocalServiceUtil.addPolicyFundSwitchDetails(this);
		}
		else {
			PolicyFundSwitchDetailsLocalServiceUtil.updatePolicyFundSwitchDetails(this);
		}
	}

	@Override
	public PolicyFundSwitchDetails toEscapedModel() {
		return (PolicyFundSwitchDetails)ProxyUtil.newProxyInstance(PolicyFundSwitchDetails.class.getClassLoader(),
			new Class[] { PolicyFundSwitchDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyFundSwitchDetailsClp clone = new PolicyFundSwitchDetailsClp();

		clone.setFUND_SWITCH_ID(getFUND_SWITCH_ID());
		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setQRC_ASR_ID(getQRC_ASR_ID());
		clone.setFUND_FROM(getFUND_FROM());
		clone.setFUND_TO(getFUND_TO());
		clone.setPRECENTAGE_OF_UNITS(getPRECENTAGE_OF_UNITS());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());

		return clone;
	}

	@Override
	public int compareTo(PolicyFundSwitchDetails policyFundSwitchDetails) {
		int primaryKey = policyFundSwitchDetails.getPrimaryKey();

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

		if (!(obj instanceof PolicyFundSwitchDetailsClp)) {
			return false;
		}

		PolicyFundSwitchDetailsClp policyFundSwitchDetails = (PolicyFundSwitchDetailsClp)obj;

		int primaryKey = policyFundSwitchDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{FUND_SWITCH_ID=");
		sb.append(getFUND_SWITCH_ID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append(", FUND_FROM=");
		sb.append(getFUND_FROM());
		sb.append(", FUND_TO=");
		sb.append(getFUND_TO());
		sb.append(", PRECENTAGE_OF_UNITS=");
		sb.append(getPRECENTAGE_OF_UNITS());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyFundSwitchDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FUND_SWITCH_ID</column-name><column-value><![CDATA[");
		sb.append(getFUND_SWITCH_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_FROM</column-name><column-value><![CDATA[");
		sb.append(getFUND_FROM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_TO</column-name><column-value><![CDATA[");
		sb.append(getFUND_TO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRECENTAGE_OF_UNITS</column-name><column-value><![CDATA[");
		sb.append(getPRECENTAGE_OF_UNITS());
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

	private int _FUND_SWITCH_ID;
	private String _POLICY_ID;
	private int _QRC_ASR_ID;
	private String _FUND_FROM;
	private String _FUND_TO;
	private double _PRECENTAGE_OF_UNITS;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private BaseModel<?> _policyFundSwitchDetailsRemoteModel;
}