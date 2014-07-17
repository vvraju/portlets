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

import com.ifli.rapid.service.BranchDetailsLocalServiceUtil;
import com.ifli.rapid.service.ClpSerializer;

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
public class BranchDetailsClp extends BaseModelImpl<BranchDetails>
	implements BranchDetails {
	public BranchDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BranchDetails.class;
	}

	@Override
	public String getModelClassName() {
		return BranchDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _BRANCH_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setBRANCH_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _BRANCH_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("BRANCH_ID", getBRANCH_ID());
		attributes.put("LOCATION_ID", getLOCATION_ID());
		attributes.put("BRANCH_NAME", getBRANCH_NAME());
		attributes.put("BRANCH_OPENING_TIME", getBRANCH_OPENING_TIME());
		attributes.put("BRANCH_CLOSING_TIME", getBRANCH_CLOSING_TIME());
		attributes.put("ADDRESS_FIRST_LINE", getADDRESS_FIRST_LINE());
		attributes.put("ADDRESS_SECOND_LINE", getADDRESS_SECOND_LINE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("PIN", getPIN());
		attributes.put("PRIMARY_CONTACT_NO", getPRIMARY_CONTACT_NO());
		attributes.put("OTHER_CONTACT_NO", getOTHER_CONTACT_NO());
		attributes.put("FAX_NUMBER", getFAX_NUMBER());
		attributes.put("BRANCH_CODE", getBRANCH_CODE());
		attributes.put("WORK_TIMINGS", getWORK_TIMINGS());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer BRANCH_ID = (Integer)attributes.get("BRANCH_ID");

		if (BRANCH_ID != null) {
			setBRANCH_ID(BRANCH_ID);
		}

		Integer LOCATION_ID = (Integer)attributes.get("LOCATION_ID");

		if (LOCATION_ID != null) {
			setLOCATION_ID(LOCATION_ID);
		}

		String BRANCH_NAME = (String)attributes.get("BRANCH_NAME");

		if (BRANCH_NAME != null) {
			setBRANCH_NAME(BRANCH_NAME);
		}

		String BRANCH_OPENING_TIME = (String)attributes.get(
				"BRANCH_OPENING_TIME");

		if (BRANCH_OPENING_TIME != null) {
			setBRANCH_OPENING_TIME(BRANCH_OPENING_TIME);
		}

		String BRANCH_CLOSING_TIME = (String)attributes.get(
				"BRANCH_CLOSING_TIME");

		if (BRANCH_CLOSING_TIME != null) {
			setBRANCH_CLOSING_TIME(BRANCH_CLOSING_TIME);
		}

		String ADDRESS_FIRST_LINE = (String)attributes.get("ADDRESS_FIRST_LINE");

		if (ADDRESS_FIRST_LINE != null) {
			setADDRESS_FIRST_LINE(ADDRESS_FIRST_LINE);
		}

		String ADDRESS_SECOND_LINE = (String)attributes.get(
				"ADDRESS_SECOND_LINE");

		if (ADDRESS_SECOND_LINE != null) {
			setADDRESS_SECOND_LINE(ADDRESS_SECOND_LINE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		String PIN = (String)attributes.get("PIN");

		if (PIN != null) {
			setPIN(PIN);
		}

		String PRIMARY_CONTACT_NO = (String)attributes.get("PRIMARY_CONTACT_NO");

		if (PRIMARY_CONTACT_NO != null) {
			setPRIMARY_CONTACT_NO(PRIMARY_CONTACT_NO);
		}

		String OTHER_CONTACT_NO = (String)attributes.get("OTHER_CONTACT_NO");

		if (OTHER_CONTACT_NO != null) {
			setOTHER_CONTACT_NO(OTHER_CONTACT_NO);
		}

		String FAX_NUMBER = (String)attributes.get("FAX_NUMBER");

		if (FAX_NUMBER != null) {
			setFAX_NUMBER(FAX_NUMBER);
		}

		String BRANCH_CODE = (String)attributes.get("BRANCH_CODE");

		if (BRANCH_CODE != null) {
			setBRANCH_CODE(BRANCH_CODE);
		}

		String WORK_TIMINGS = (String)attributes.get("WORK_TIMINGS");

		if (WORK_TIMINGS != null) {
			setWORK_TIMINGS(WORK_TIMINGS);
		}
	}

	@Override
	public int getBRANCH_ID() {
		return _BRANCH_ID;
	}

	@Override
	public void setBRANCH_ID(int BRANCH_ID) {
		_BRANCH_ID = BRANCH_ID;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_ID", int.class);

				method.invoke(_branchDetailsRemoteModel, BRANCH_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLOCATION_ID() {
		return _LOCATION_ID;
	}

	@Override
	public void setLOCATION_ID(int LOCATION_ID) {
		_LOCATION_ID = LOCATION_ID;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLOCATION_ID", int.class);

				method.invoke(_branchDetailsRemoteModel, LOCATION_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_NAME() {
		return _BRANCH_NAME;
	}

	@Override
	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_NAME", String.class);

				method.invoke(_branchDetailsRemoteModel, BRANCH_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_OPENING_TIME() {
		return _BRANCH_OPENING_TIME;
	}

	@Override
	public void setBRANCH_OPENING_TIME(String BRANCH_OPENING_TIME) {
		_BRANCH_OPENING_TIME = BRANCH_OPENING_TIME;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_OPENING_TIME",
						String.class);

				method.invoke(_branchDetailsRemoteModel, BRANCH_OPENING_TIME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_CLOSING_TIME() {
		return _BRANCH_CLOSING_TIME;
	}

	@Override
	public void setBRANCH_CLOSING_TIME(String BRANCH_CLOSING_TIME) {
		_BRANCH_CLOSING_TIME = BRANCH_CLOSING_TIME;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_CLOSING_TIME",
						String.class);

				method.invoke(_branchDetailsRemoteModel, BRANCH_CLOSING_TIME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_FIRST_LINE() {
		return _ADDRESS_FIRST_LINE;
	}

	@Override
	public void setADDRESS_FIRST_LINE(String ADDRESS_FIRST_LINE) {
		_ADDRESS_FIRST_LINE = ADDRESS_FIRST_LINE;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_FIRST_LINE",
						String.class);

				method.invoke(_branchDetailsRemoteModel, ADDRESS_FIRST_LINE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_SECOND_LINE() {
		return _ADDRESS_SECOND_LINE;
	}

	@Override
	public void setADDRESS_SECOND_LINE(String ADDRESS_SECOND_LINE) {
		_ADDRESS_SECOND_LINE = ADDRESS_SECOND_LINE;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_SECOND_LINE",
						String.class);

				method.invoke(_branchDetailsRemoteModel, ADDRESS_SECOND_LINE);
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

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY", String.class);

				method.invoke(_branchDetailsRemoteModel, CITY);
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

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE", String.class);

				method.invoke(_branchDetailsRemoteModel, STATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPIN() {
		return _PIN;
	}

	@Override
	public void setPIN(String PIN) {
		_PIN = PIN;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPIN", String.class);

				method.invoke(_branchDetailsRemoteModel, PIN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPRIMARY_CONTACT_NO() {
		return _PRIMARY_CONTACT_NO;
	}

	@Override
	public void setPRIMARY_CONTACT_NO(String PRIMARY_CONTACT_NO) {
		_PRIMARY_CONTACT_NO = PRIMARY_CONTACT_NO;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPRIMARY_CONTACT_NO",
						String.class);

				method.invoke(_branchDetailsRemoteModel, PRIMARY_CONTACT_NO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOTHER_CONTACT_NO() {
		return _OTHER_CONTACT_NO;
	}

	@Override
	public void setOTHER_CONTACT_NO(String OTHER_CONTACT_NO) {
		_OTHER_CONTACT_NO = OTHER_CONTACT_NO;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setOTHER_CONTACT_NO",
						String.class);

				method.invoke(_branchDetailsRemoteModel, OTHER_CONTACT_NO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFAX_NUMBER() {
		return _FAX_NUMBER;
	}

	@Override
	public void setFAX_NUMBER(String FAX_NUMBER) {
		_FAX_NUMBER = FAX_NUMBER;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFAX_NUMBER", String.class);

				method.invoke(_branchDetailsRemoteModel, FAX_NUMBER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	@Override
	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_CODE", String.class);

				method.invoke(_branchDetailsRemoteModel, BRANCH_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWORK_TIMINGS() {
		return _WORK_TIMINGS;
	}

	@Override
	public void setWORK_TIMINGS(String WORK_TIMINGS) {
		_WORK_TIMINGS = WORK_TIMINGS;

		if (_branchDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setWORK_TIMINGS", String.class);

				method.invoke(_branchDetailsRemoteModel, WORK_TIMINGS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBranchDetailsRemoteModel() {
		return _branchDetailsRemoteModel;
	}

	public void setBranchDetailsRemoteModel(
		BaseModel<?> branchDetailsRemoteModel) {
		_branchDetailsRemoteModel = branchDetailsRemoteModel;
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

		Class<?> remoteModelClass = _branchDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_branchDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BranchDetailsLocalServiceUtil.addBranchDetails(this);
		}
		else {
			BranchDetailsLocalServiceUtil.updateBranchDetails(this);
		}
	}

	@Override
	public BranchDetails toEscapedModel() {
		return (BranchDetails)ProxyUtil.newProxyInstance(BranchDetails.class.getClassLoader(),
			new Class[] { BranchDetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BranchDetailsClp clone = new BranchDetailsClp();

		clone.setBRANCH_ID(getBRANCH_ID());
		clone.setLOCATION_ID(getLOCATION_ID());
		clone.setBRANCH_NAME(getBRANCH_NAME());
		clone.setBRANCH_OPENING_TIME(getBRANCH_OPENING_TIME());
		clone.setBRANCH_CLOSING_TIME(getBRANCH_CLOSING_TIME());
		clone.setADDRESS_FIRST_LINE(getADDRESS_FIRST_LINE());
		clone.setADDRESS_SECOND_LINE(getADDRESS_SECOND_LINE());
		clone.setCITY(getCITY());
		clone.setSTATE(getSTATE());
		clone.setPIN(getPIN());
		clone.setPRIMARY_CONTACT_NO(getPRIMARY_CONTACT_NO());
		clone.setOTHER_CONTACT_NO(getOTHER_CONTACT_NO());
		clone.setFAX_NUMBER(getFAX_NUMBER());
		clone.setBRANCH_CODE(getBRANCH_CODE());
		clone.setWORK_TIMINGS(getWORK_TIMINGS());

		return clone;
	}

	@Override
	public int compareTo(BranchDetails branchDetails) {
		int primaryKey = branchDetails.getPrimaryKey();

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

		if (!(obj instanceof BranchDetailsClp)) {
			return false;
		}

		BranchDetailsClp branchDetails = (BranchDetailsClp)obj;

		int primaryKey = branchDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{BRANCH_ID=");
		sb.append(getBRANCH_ID());
		sb.append(", LOCATION_ID=");
		sb.append(getLOCATION_ID());
		sb.append(", BRANCH_NAME=");
		sb.append(getBRANCH_NAME());
		sb.append(", BRANCH_OPENING_TIME=");
		sb.append(getBRANCH_OPENING_TIME());
		sb.append(", BRANCH_CLOSING_TIME=");
		sb.append(getBRANCH_CLOSING_TIME());
		sb.append(", ADDRESS_FIRST_LINE=");
		sb.append(getADDRESS_FIRST_LINE());
		sb.append(", ADDRESS_SECOND_LINE=");
		sb.append(getADDRESS_SECOND_LINE());
		sb.append(", CITY=");
		sb.append(getCITY());
		sb.append(", STATE=");
		sb.append(getSTATE());
		sb.append(", PIN=");
		sb.append(getPIN());
		sb.append(", PRIMARY_CONTACT_NO=");
		sb.append(getPRIMARY_CONTACT_NO());
		sb.append(", OTHER_CONTACT_NO=");
		sb.append(getOTHER_CONTACT_NO());
		sb.append(", FAX_NUMBER=");
		sb.append(getFAX_NUMBER());
		sb.append(", BRANCH_CODE=");
		sb.append(getBRANCH_CODE());
		sb.append(", WORK_TIMINGS=");
		sb.append(getWORK_TIMINGS());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.BranchDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>BRANCH_ID</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCATION_ID</column-name><column-value><![CDATA[");
		sb.append(getLOCATION_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_NAME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_OPENING_TIME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_OPENING_TIME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CLOSING_TIME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CLOSING_TIME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_FIRST_LINE</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_FIRST_LINE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_SECOND_LINE</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_SECOND_LINE());
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
			"<column><column-name>PIN</column-name><column-value><![CDATA[");
		sb.append(getPIN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_CONTACT_NO</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_CONTACT_NO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OTHER_CONTACT_NO</column-name><column-value><![CDATA[");
		sb.append(getOTHER_CONTACT_NO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FAX_NUMBER</column-name><column-value><![CDATA[");
		sb.append(getFAX_NUMBER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CODE</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WORK_TIMINGS</column-name><column-value><![CDATA[");
		sb.append(getWORK_TIMINGS());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _BRANCH_ID;
	private int _LOCATION_ID;
	private String _BRANCH_NAME;
	private String _BRANCH_OPENING_TIME;
	private String _BRANCH_CLOSING_TIME;
	private String _ADDRESS_FIRST_LINE;
	private String _ADDRESS_SECOND_LINE;
	private String _CITY;
	private String _STATE;
	private String _PIN;
	private String _PRIMARY_CONTACT_NO;
	private String _OTHER_CONTACT_NO;
	private String _FAX_NUMBER;
	private String _BRANCH_CODE;
	private String _WORK_TIMINGS;
	private BaseModel<?> _branchDetailsRemoteModel;
}