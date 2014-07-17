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
import com.ifli.rapid.service.PolicyAddressLocalServiceUtil;

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
public class PolicyAddressClp extends BaseModelImpl<PolicyAddress>
	implements PolicyAddress {
	public PolicyAddressClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyAddress.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyAddress.class.getName();
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
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("CUSTOMER_ADDRESS_ID", getCUSTOMER_ADDRESS_ID());
		attributes.put("PINCODE", getPINCODE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("ADDRESS_LINE_1", getADDRESS_LINE_1());
		attributes.put("ADDRESS_LINE_2", getADDRESS_LINE_2());
		attributes.put("ADDRESS_LINE_3", getADDRESS_LINE_3());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		Integer CUSTOMER_ADDRESS_ID = (Integer)attributes.get(
				"CUSTOMER_ADDRESS_ID");

		if (CUSTOMER_ADDRESS_ID != null) {
			setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
		}

		String PINCODE = (String)attributes.get("PINCODE");

		if (PINCODE != null) {
			setPINCODE(PINCODE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		String ADDRESS_LINE_1 = (String)attributes.get("ADDRESS_LINE_1");

		if (ADDRESS_LINE_1 != null) {
			setADDRESS_LINE_1(ADDRESS_LINE_1);
		}

		String ADDRESS_LINE_2 = (String)attributes.get("ADDRESS_LINE_2");

		if (ADDRESS_LINE_2 != null) {
			setADDRESS_LINE_2(ADDRESS_LINE_2);
		}

		String ADDRESS_LINE_3 = (String)attributes.get("ADDRESS_LINE_3");

		if (ADDRESS_LINE_3 != null) {
			setADDRESS_LINE_3(ADDRESS_LINE_3);
		}
	}

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setID", int.class);

				method.invoke(_policyAddressRemoteModel, ID);
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

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setPOLICY_ID", String.class);

				method.invoke(_policyAddressRemoteModel, POLICY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(String CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", String.class);

				method.invoke(_policyAddressRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCUSTOMER_ADDRESS_ID() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_CUSTOMER_ADDRESS_ID = CUSTOMER_ADDRESS_ID;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ADDRESS_ID",
						int.class);

				method.invoke(_policyAddressRemoteModel, CUSTOMER_ADDRESS_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPINCODE() {
		return _PINCODE;
	}

	@Override
	public void setPINCODE(String PINCODE) {
		_PINCODE = PINCODE;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setPINCODE", String.class);

				method.invoke(_policyAddressRemoteModel, PINCODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCITY() {
		return _CITY;
	}

	@Override
	public void setCITY(String CITY) {
		_CITY = CITY;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY", String.class);

				method.invoke(_policyAddressRemoteModel, CITY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSTATE() {
		return _STATE;
	}

	@Override
	public void setSTATE(String STATE) {
		_STATE = STATE;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE", String.class);

				method.invoke(_policyAddressRemoteModel, STATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_LINE_1() {
		return _ADDRESS_LINE_1;
	}

	@Override
	public void setADDRESS_LINE_1(String ADDRESS_LINE_1) {
		_ADDRESS_LINE_1 = ADDRESS_LINE_1;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_LINE_1",
						String.class);

				method.invoke(_policyAddressRemoteModel, ADDRESS_LINE_1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_LINE_2() {
		return _ADDRESS_LINE_2;
	}

	@Override
	public void setADDRESS_LINE_2(String ADDRESS_LINE_2) {
		_ADDRESS_LINE_2 = ADDRESS_LINE_2;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_LINE_2",
						String.class);

				method.invoke(_policyAddressRemoteModel, ADDRESS_LINE_2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_LINE_3() {
		return _ADDRESS_LINE_3;
	}

	@Override
	public void setADDRESS_LINE_3(String ADDRESS_LINE_3) {
		_ADDRESS_LINE_3 = ADDRESS_LINE_3;

		if (_policyAddressRemoteModel != null) {
			try {
				Class<?> clazz = _policyAddressRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_LINE_3",
						String.class);

				method.invoke(_policyAddressRemoteModel, ADDRESS_LINE_3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPolicyAddressRemoteModel() {
		return _policyAddressRemoteModel;
	}

	public void setPolicyAddressRemoteModel(
		BaseModel<?> policyAddressRemoteModel) {
		_policyAddressRemoteModel = policyAddressRemoteModel;
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

		Class<?> remoteModelClass = _policyAddressRemoteModel.getClass();

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

		Object returnValue = method.invoke(_policyAddressRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyAddressLocalServiceUtil.addPolicyAddress(this);
		}
		else {
			PolicyAddressLocalServiceUtil.updatePolicyAddress(this);
		}
	}

	@Override
	public PolicyAddress toEscapedModel() {
		return (PolicyAddress)ProxyUtil.newProxyInstance(PolicyAddress.class.getClassLoader(),
			new Class[] { PolicyAddress.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PolicyAddressClp clone = new PolicyAddressClp();

		clone.setID(getID());
		clone.setPOLICY_ID(getPOLICY_ID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setCUSTOMER_ADDRESS_ID(getCUSTOMER_ADDRESS_ID());
		clone.setPINCODE(getPINCODE());
		clone.setCITY(getCITY());
		clone.setSTATE(getSTATE());
		clone.setADDRESS_LINE_1(getADDRESS_LINE_1());
		clone.setADDRESS_LINE_2(getADDRESS_LINE_2());
		clone.setADDRESS_LINE_3(getADDRESS_LINE_3());

		return clone;
	}

	@Override
	public int compareTo(PolicyAddress policyAddress) {
		int primaryKey = policyAddress.getPrimaryKey();

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

		if (!(obj instanceof PolicyAddressClp)) {
			return false;
		}

		PolicyAddressClp policyAddress = (PolicyAddressClp)obj;

		int primaryKey = policyAddress.getPrimaryKey();

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

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", CUSTOMER_ADDRESS_ID=");
		sb.append(getCUSTOMER_ADDRESS_ID());
		sb.append(", PINCODE=");
		sb.append(getPINCODE());
		sb.append(", CITY=");
		sb.append(getCITY());
		sb.append(", STATE=");
		sb.append(getSTATE());
		sb.append(", ADDRESS_LINE_1=");
		sb.append(getADDRESS_LINE_1());
		sb.append(", ADDRESS_LINE_2=");
		sb.append(getADDRESS_LINE_2());
		sb.append(", ADDRESS_LINE_3=");
		sb.append(getADDRESS_LINE_3());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyAddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ADDRESS_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ADDRESS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PINCODE</column-name><column-value><![CDATA[");
		sb.append(getPINCODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY</column-name><column-value><![CDATA[");
		sb.append(getCITY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE</column-name><column-value><![CDATA[");
		sb.append(getSTATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_1</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_2</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_3</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_3());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _ID;
	private String _POLICY_ID;
	private String _CUSTOMER_ID;
	private int _CUSTOMER_ADDRESS_ID;
	private String _PINCODE;
	private String _CITY;
	private String _STATE;
	private String _ADDRESS_LINE_1;
	private String _ADDRESS_LINE_2;
	private String _ADDRESS_LINE_3;
	private BaseModel<?> _policyAddressRemoteModel;
}