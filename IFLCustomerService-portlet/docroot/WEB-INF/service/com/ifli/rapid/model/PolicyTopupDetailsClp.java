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
import com.ifli.rapid.service.PolicyTopupDetailsLocalServiceUtil;

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
public class PolicyTopupDetailsClp extends BaseModelImpl<PolicyTopupDetails>
	implements PolicyTopupDetails {
	public PolicyTopupDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyTopupDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyTopupDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _TOPUP_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTOPUP_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _TOPUP_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TOPUP_ID", getTOPUP_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_VALUE", getFUND_VALUE());
		attributes.put("TOPUP_VALUE", getTOPUP_VALUE());
		attributes.put("TOT_VALUE", getTOT_VALUE());
		attributes.put("TOPUP_PERCENTAGE", getTOPUP_PERCENTAGE());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer TOPUP_ID = (Integer)attributes.get("TOPUP_ID");

		if (TOPUP_ID != null) {
			setTOPUP_ID(TOPUP_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		Double FUND_VALUE = (Double)attributes.get("FUND_VALUE");

		if (FUND_VALUE != null) {
			setFUND_VALUE(FUND_VALUE);
		}

		Double TOPUP_VALUE = (Double)attributes.get("TOPUP_VALUE");

		if (TOPUP_VALUE != null) {
			setTOPUP_VALUE(TOPUP_VALUE);
		}

		Double TOT_VALUE = (Double)attributes.get("TOT_VALUE");

		if (TOT_VALUE != null) {
			setTOT_VALUE(TOT_VALUE);
		}

		Double TOPUP_PERCENTAGE = (Double)attributes.get("TOPUP_PERCENTAGE");

		if (TOPUP_PERCENTAGE != null) {
			setTOPUP_PERCENTAGE(TOPUP_PERCENTAGE);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}
	}

	@Override
	public int getTOPUP_ID() {
		return _TOPUP_ID;
	}

	@Override
	public void setTOPUP_ID(int TOPUP_ID) {
		_TOPUP_ID = TOPUP_ID;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTOPUP_ID", int.class);

				method.invoke(_policyTopupDetailsRemoteModel, TOPUP_ID);
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

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyTopupDetailsRemoteModel, POLICY_ID);
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

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_policyTopupDetailsRemoteModel, QRC_ASR_ID);
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

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_ID", int.class);

				method.invoke(_policyTopupDetailsRemoteModel, FUND_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getFUND_VALUE() {
		return _FUND_VALUE;
	}

	@Override
	public void setFUND_VALUE(double FUND_VALUE) {
		_FUND_VALUE = FUND_VALUE;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFUND_VALUE", double.class);

				method.invoke(_policyTopupDetailsRemoteModel, FUND_VALUE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTOPUP_VALUE() {
		return _TOPUP_VALUE;
	}

	@Override
	public void setTOPUP_VALUE(double TOPUP_VALUE) {
		_TOPUP_VALUE = TOPUP_VALUE;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTOPUP_VALUE", double.class);

				method.invoke(_policyTopupDetailsRemoteModel, TOPUP_VALUE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTOT_VALUE() {
		return _TOT_VALUE;
	}

	@Override
	public void setTOT_VALUE(double TOT_VALUE) {
		_TOT_VALUE = TOT_VALUE;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTOT_VALUE", double.class);

				method.invoke(_policyTopupDetailsRemoteModel, TOT_VALUE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTOPUP_PERCENTAGE() {
		return _TOPUP_PERCENTAGE;
	}

	@Override
	public void setTOPUP_PERCENTAGE(double TOPUP_PERCENTAGE) {
		_TOPUP_PERCENTAGE = TOPUP_PERCENTAGE;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTOPUP_PERCENTAGE",
						double.class);

				method.invoke(_policyTopupDetailsRemoteModel, TOPUP_PERCENTAGE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _CreatedBy;
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_policyTopupDetailsRemoteModel, CreatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_policyTopupDetailsRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _ModifiedBy;
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_policyTopupDetailsRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;

		if (_policyTopupDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _policyTopupDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_policyTopupDetailsRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyTopupDetailsRemoteModel() {
		return _policyTopupDetailsRemoteModel;
	}

	public void setPolicyTopupDetailsRemoteModel(
		BaseModel<?> policyTopupDetailsRemoteModel) {
		_policyTopupDetailsRemoteModel = policyTopupDetailsRemoteModel;
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

		Class<?> remoteModelClass = _policyTopupDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyTopupDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyTopupDetailsLocalServiceUtil.addPolicyTopupDetails(this);
		}
		else {
			PolicyTopupDetailsLocalServiceUtil.updatePolicyTopupDetails(this);
		}
	}

	@Override
	public PolicyTopupDetails toEscapedModel() {
		return (PolicyTopupDetails)ProxyUtil.newProxyInstance(PolicyTopupDetails.class.getClassLoader(),
			new Class[] { PolicyTopupDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyTopupDetailsClp clone = new PolicyTopupDetailsClp();

		clone.setTOPUP_ID(getTOPUP_ID());
		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setQRC_ASR_ID(getQRC_ASR_ID());
		clone.setFUND_ID(getFUND_ID());
		clone.setFUND_VALUE(getFUND_VALUE());
		clone.setTOPUP_VALUE(getTOPUP_VALUE());
		clone.setTOT_VALUE(getTOT_VALUE());
		clone.setTOPUP_PERCENTAGE(getTOPUP_PERCENTAGE());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(PolicyTopupDetails policyTopupDetails) {
		int primaryKey = policyTopupDetails.getPrimaryKey();

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

		if (!(obj instanceof PolicyTopupDetailsClp)) {
			return false;
		}

		PolicyTopupDetailsClp policyTopupDetails = (PolicyTopupDetailsClp)obj;

		int primaryKey = policyTopupDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{TOPUP_ID=");
		sb.append(getTOPUP_ID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append(", FUND_ID=");
		sb.append(getFUND_ID());
		sb.append(", FUND_VALUE=");
		sb.append(getFUND_VALUE());
		sb.append(", TOPUP_VALUE=");
		sb.append(getTOPUP_VALUE());
		sb.append(", TOT_VALUE=");
		sb.append(getTOT_VALUE());
		sb.append(", TOPUP_PERCENTAGE=");
		sb.append(getTOPUP_PERCENTAGE());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyTopupDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>TOPUP_ID</column-name><column-value><![CDATA[");
		sb.append(getTOPUP_ID());
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
			"<column><column-name>FUND_ID</column-name><column-value><![CDATA[");
		sb.append(getFUND_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_VALUE</column-name><column-value><![CDATA[");
		sb.append(getFUND_VALUE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TOPUP_VALUE</column-name><column-value><![CDATA[");
		sb.append(getTOPUP_VALUE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TOT_VALUE</column-name><column-value><![CDATA[");
		sb.append(getTOT_VALUE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TOPUP_PERCENTAGE</column-name><column-value><![CDATA[");
		sb.append(getTOPUP_PERCENTAGE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _TOPUP_ID;
	private String _POLICY_ID;
	private int _QRC_ASR_ID;
	private int _FUND_ID;
	private double _FUND_VALUE;
	private double _TOPUP_VALUE;
	private double _TOT_VALUE;
	private double _TOPUP_PERCENTAGE;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private BaseModel<?> _policyTopupDetailsRemoteModel;
}