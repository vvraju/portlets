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
import com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalServiceUtil;

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
public class PolicyPremRedirectionDetailsClp extends BaseModelImpl<PolicyPremRedirectionDetails>
	implements PolicyPremRedirectionDetails {
	public PolicyPremRedirectionDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyPremRedirectionDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyPremRedirectionDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _PREM_REDIRECTION_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPREM_REDIRECTION_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PREM_REDIRECTION_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PREM_REDIRECTION_ID", getPREM_REDIRECTION_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("TRANSACTION_AUDIT_ID", getTRANSACTION_AUDIT_ID());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("ALLOCATION_PERCENTAGE", getALLOCATION_PERCENTAGE());
		attributes.put("SENT_TO_ODS_FLAG", getSENT_TO_ODS_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PREM_REDIRECTION_ID = (Integer)attributes.get(
				"PREM_REDIRECTION_ID");

		if (PREM_REDIRECTION_ID != null) {
			setPREM_REDIRECTION_ID(PREM_REDIRECTION_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer TRANSACTION_AUDIT_ID = (Integer)attributes.get(
				"TRANSACTION_AUDIT_ID");

		if (TRANSACTION_AUDIT_ID != null) {
			setTRANSACTION_AUDIT_ID(TRANSACTION_AUDIT_ID);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		Double ALLOCATION_PERCENTAGE = (Double)attributes.get(
				"ALLOCATION_PERCENTAGE");

		if (ALLOCATION_PERCENTAGE != null) {
			setALLOCATION_PERCENTAGE(ALLOCATION_PERCENTAGE);
		}

		String SENT_TO_ODS_FLAG = (String)attributes.get("SENT_TO_ODS_FLAG");

		if (SENT_TO_ODS_FLAG != null) {
			setSENT_TO_ODS_FLAG(SENT_TO_ODS_FLAG);
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
	public int getPREM_REDIRECTION_ID() {
		return _PREM_REDIRECTION_ID;
	}

	@Override
	public void setPREM_REDIRECTION_ID(int PREM_REDIRECTION_ID) {
		_PREM_REDIRECTION_ID = PREM_REDIRECTION_ID;

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPREM_REDIRECTION_ID",
						int.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					PREM_REDIRECTION_ID);
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

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTRANSACTION_AUDIT_ID() {
		return _TRANSACTION_AUDIT_ID;
	}

	@Override
	public void setTRANSACTION_AUDIT_ID(int TRANSACTION_AUDIT_ID) {
		_TRANSACTION_AUDIT_ID = TRANSACTION_AUDIT_ID;

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTRANSACTION_AUDIT_ID",
						int.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					TRANSACTION_AUDIT_ID);
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

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_CODE", String.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					FUND_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getALLOCATION_PERCENTAGE() {
		return _ALLOCATION_PERCENTAGE;
	}

	@Override
	public void setALLOCATION_PERCENTAGE(double ALLOCATION_PERCENTAGE) {
		_ALLOCATION_PERCENTAGE = ALLOCATION_PERCENTAGE;

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setALLOCATION_PERCENTAGE",
						double.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					ALLOCATION_PERCENTAGE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSENT_TO_ODS_FLAG() {
		return _SENT_TO_ODS_FLAG;
	}

	@Override
	public void setSENT_TO_ODS_FLAG(String SENT_TO_ODS_FLAG) {
		_SENT_TO_ODS_FLAG = SENT_TO_ODS_FLAG;

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSENT_TO_ODS_FLAG",
						String.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					SENT_TO_ODS_FLAG);
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

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					INSERTED_DATE);
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

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					INSERTED_BY);
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

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					UPDATED_DATE);
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

		if (_policyPremRedirectionDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyPremRedirectionDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_policyPremRedirectionDetailsRemoteModel,
					UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyPremRedirectionDetailsRemoteModel() {
		return _policyPremRedirectionDetailsRemoteModel;
	}

	public void setPolicyPremRedirectionDetailsRemoteModel(
		BaseModel<?> policyPremRedirectionDetailsRemoteModel) {
		_policyPremRedirectionDetailsRemoteModel = policyPremRedirectionDetailsRemoteModel;
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

		Class<?> remoteModelClass = _policyPremRedirectionDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyPremRedirectionDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyPremRedirectionDetailsLocalServiceUtil.addPolicyPremRedirectionDetails(this);
		}
		else {
			PolicyPremRedirectionDetailsLocalServiceUtil.updatePolicyPremRedirectionDetails(this);
		}
	}

	@Override
	public PolicyPremRedirectionDetails toEscapedModel() {
		return (PolicyPremRedirectionDetails)ProxyUtil.newProxyInstance(PolicyPremRedirectionDetails.class.getClassLoader(),
			new Class[] { PolicyPremRedirectionDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyPremRedirectionDetailsClp clone = new PolicyPremRedirectionDetailsClp();

		clone.setPREM_REDIRECTION_ID(getPREM_REDIRECTION_ID());
		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setTRANSACTION_AUDIT_ID(getTRANSACTION_AUDIT_ID());
		clone.setFUND_CODE(getFUND_CODE());
		clone.setALLOCATION_PERCENTAGE(getALLOCATION_PERCENTAGE());
		clone.setSENT_TO_ODS_FLAG(getSENT_TO_ODS_FLAG());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());

		return clone;
	}

	@Override
	public int compareTo(
		PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		int primaryKey = policyPremRedirectionDetails.getPrimaryKey();

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

		if (!(obj instanceof PolicyPremRedirectionDetailsClp)) {
			return false;
		}

		PolicyPremRedirectionDetailsClp policyPremRedirectionDetails = (PolicyPremRedirectionDetailsClp)obj;

		int primaryKey = policyPremRedirectionDetails.getPrimaryKey();

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

		sb.append("{PREM_REDIRECTION_ID=");
		sb.append(getPREM_REDIRECTION_ID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", TRANSACTION_AUDIT_ID=");
		sb.append(getTRANSACTION_AUDIT_ID());
		sb.append(", FUND_CODE=");
		sb.append(getFUND_CODE());
		sb.append(", ALLOCATION_PERCENTAGE=");
		sb.append(getALLOCATION_PERCENTAGE());
		sb.append(", SENT_TO_ODS_FLAG=");
		sb.append(getSENT_TO_ODS_FLAG());
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
		sb.append("com.ifli.rapid.model.PolicyPremRedirectionDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PREM_REDIRECTION_ID</column-name><column-value><![CDATA[");
		sb.append(getPREM_REDIRECTION_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TRANSACTION_AUDIT_ID</column-name><column-value><![CDATA[");
		sb.append(getTRANSACTION_AUDIT_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_CODE</column-name><column-value><![CDATA[");
		sb.append(getFUND_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ALLOCATION_PERCENTAGE</column-name><column-value><![CDATA[");
		sb.append(getALLOCATION_PERCENTAGE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SENT_TO_ODS_FLAG</column-name><column-value><![CDATA[");
		sb.append(getSENT_TO_ODS_FLAG());
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

	private int _PREM_REDIRECTION_ID;
	private String _POLICY_ID;
	private int _TRANSACTION_AUDIT_ID;
	private String _FUND_CODE;
	private double _ALLOCATION_PERCENTAGE;
	private String _SENT_TO_ODS_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private BaseModel<?> _policyPremRedirectionDetailsRemoteModel;
}