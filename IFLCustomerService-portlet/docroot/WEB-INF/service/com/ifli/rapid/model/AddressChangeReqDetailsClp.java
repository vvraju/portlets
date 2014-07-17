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

import com.ifli.rapid.service.AddressChangeReqDetailsLocalServiceUtil;
import com.ifli.rapid.service.ClpSerializer;

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
public class AddressChangeReqDetailsClp extends BaseModelImpl<AddressChangeReqDetails>
	implements AddressChangeReqDetails {
	public AddressChangeReqDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AddressChangeReqDetails.class;
	}

	@Override
	public String getModelClassName() {
		return AddressChangeReqDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ADDR_CHANGE_DETAILS_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setADDR_CHANGE_DETAILS_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ADDR_CHANGE_DETAILS_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ADDR_CHANGE_DETAILS_ID", getADDR_CHANGE_DETAILS_ID());
		attributes.put("REQUEST_SUBMIT_TYPE", getREQUEST_SUBMIT_TYPE());
		attributes.put("SERVICE_REQUEST_ID", getSERVICE_REQUEST_ID());
		attributes.put("SUB_TYPE", getSUB_TYPE());
		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("SUBMIT_AT_BRANCH", getSUBMIT_AT_BRANCH());
		attributes.put("PICKUP_DATE", getPICKUP_DATE());
		attributes.put("PICKUP_TIME", getPICKUP_TIME());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ADDR_CHANGE_DETAILS_ID = (Integer)attributes.get(
				"ADDR_CHANGE_DETAILS_ID");

		if (ADDR_CHANGE_DETAILS_ID != null) {
			setADDR_CHANGE_DETAILS_ID(ADDR_CHANGE_DETAILS_ID);
		}

		String REQUEST_SUBMIT_TYPE = (String)attributes.get(
				"REQUEST_SUBMIT_TYPE");

		if (REQUEST_SUBMIT_TYPE != null) {
			setREQUEST_SUBMIT_TYPE(REQUEST_SUBMIT_TYPE);
		}

		Integer SERVICE_REQUEST_ID = (Integer)attributes.get(
				"SERVICE_REQUEST_ID");

		if (SERVICE_REQUEST_ID != null) {
			setSERVICE_REQUEST_ID(SERVICE_REQUEST_ID);
		}

		Integer SUB_TYPE = (Integer)attributes.get("SUB_TYPE");

		if (SUB_TYPE != null) {
			setSUB_TYPE(SUB_TYPE);
		}

		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		Integer SUBMIT_AT_BRANCH = (Integer)attributes.get("SUBMIT_AT_BRANCH");

		if (SUBMIT_AT_BRANCH != null) {
			setSUBMIT_AT_BRANCH(SUBMIT_AT_BRANCH);
		}

		Date PICKUP_DATE = (Date)attributes.get("PICKUP_DATE");

		if (PICKUP_DATE != null) {
			setPICKUP_DATE(PICKUP_DATE);
		}

		String PICKUP_TIME = (String)attributes.get("PICKUP_TIME");

		if (PICKUP_TIME != null) {
			setPICKUP_TIME(PICKUP_TIME);
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
	public int getADDR_CHANGE_DETAILS_ID() {
		return _ADDR_CHANGE_DETAILS_ID;
	}

	@Override
	public void setADDR_CHANGE_DETAILS_ID(int ADDR_CHANGE_DETAILS_ID) {
		_ADDR_CHANGE_DETAILS_ID = ADDR_CHANGE_DETAILS_ID;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDR_CHANGE_DETAILS_ID",
						int.class);

				method.invoke(_addressChangeReqDetailsRemoteModel,
					ADDR_CHANGE_DETAILS_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getREQUEST_SUBMIT_TYPE() {
		return _REQUEST_SUBMIT_TYPE;
	}

	@Override
	public void setREQUEST_SUBMIT_TYPE(String REQUEST_SUBMIT_TYPE) {
		_REQUEST_SUBMIT_TYPE = REQUEST_SUBMIT_TYPE;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setREQUEST_SUBMIT_TYPE",
						String.class);

				method.invoke(_addressChangeReqDetailsRemoteModel,
					REQUEST_SUBMIT_TYPE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSERVICE_REQUEST_ID() {
		return _SERVICE_REQUEST_ID;
	}

	@Override
	public void setSERVICE_REQUEST_ID(int SERVICE_REQUEST_ID) {
		_SERVICE_REQUEST_ID = SERVICE_REQUEST_ID;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSERVICE_REQUEST_ID",
						int.class);

				method.invoke(_addressChangeReqDetailsRemoteModel,
					SERVICE_REQUEST_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSUB_TYPE() {
		return _SUB_TYPE;
	}

	@Override
	public void setSUB_TYPE(int SUB_TYPE) {
		_SUB_TYPE = SUB_TYPE;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSUB_TYPE", int.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, SUB_TYPE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_TYPE_ID", int.class);

				method.invoke(_addressChangeReqDetailsRemoteModel,
					ADDRESS_TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSUBMIT_AT_BRANCH() {
		return _SUBMIT_AT_BRANCH;
	}

	@Override
	public void setSUBMIT_AT_BRANCH(int SUBMIT_AT_BRANCH) {
		_SUBMIT_AT_BRANCH = SUBMIT_AT_BRANCH;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSUBMIT_AT_BRANCH", int.class);

				method.invoke(_addressChangeReqDetailsRemoteModel,
					SUBMIT_AT_BRANCH);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPICKUP_DATE() {
		return _PICKUP_DATE;
	}

	@Override
	public void setPICKUP_DATE(Date PICKUP_DATE) {
		_PICKUP_DATE = PICKUP_DATE;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPICKUP_DATE", Date.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, PICKUP_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPICKUP_TIME() {
		return _PICKUP_TIME;
	}

	@Override
	public void setPICKUP_TIME(String PICKUP_TIME) {
		_PICKUP_TIME = PICKUP_TIME;

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPICKUP_TIME", String.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, PICKUP_TIME);
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

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, INSERTED_DATE);
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

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, INSERTED_BY);
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

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, UPDATED_DATE);
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

		if (_addressChangeReqDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _addressChangeReqDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_addressChangeReqDetailsRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAddressChangeReqDetailsRemoteModel() {
		return _addressChangeReqDetailsRemoteModel;
	}

	public void setAddressChangeReqDetailsRemoteModel(
		BaseModel<?> addressChangeReqDetailsRemoteModel) {
		_addressChangeReqDetailsRemoteModel = addressChangeReqDetailsRemoteModel;
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

		Class<?> remoteModelClass = _addressChangeReqDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_addressChangeReqDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AddressChangeReqDetailsLocalServiceUtil.addAddressChangeReqDetails(this);
		}
		else {
			AddressChangeReqDetailsLocalServiceUtil.updateAddressChangeReqDetails(this);
		}
	}

	@Override
	public AddressChangeReqDetails toEscapedModel() {
		return (AddressChangeReqDetails)ProxyUtil.newProxyInstance(AddressChangeReqDetails.class.getClassLoader(),
			new Class[] { AddressChangeReqDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AddressChangeReqDetailsClp clone = new AddressChangeReqDetailsClp();

		clone.setADDR_CHANGE_DETAILS_ID(getADDR_CHANGE_DETAILS_ID());
		clone.setREQUEST_SUBMIT_TYPE(getREQUEST_SUBMIT_TYPE());
		clone.setSERVICE_REQUEST_ID(getSERVICE_REQUEST_ID());
		clone.setSUB_TYPE(getSUB_TYPE());
		clone.setADDRESS_TYPE_ID(getADDRESS_TYPE_ID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setSUBMIT_AT_BRANCH(getSUBMIT_AT_BRANCH());
		clone.setPICKUP_DATE(getPICKUP_DATE());
		clone.setPICKUP_TIME(getPICKUP_TIME());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());

		return clone;
	}

	@Override
	public int compareTo(AddressChangeReqDetails addressChangeReqDetails) {
		int primaryKey = addressChangeReqDetails.getPrimaryKey();

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

		if (!(obj instanceof AddressChangeReqDetailsClp)) {
			return false;
		}

		AddressChangeReqDetailsClp addressChangeReqDetails = (AddressChangeReqDetailsClp)obj;

		int primaryKey = addressChangeReqDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{ADDR_CHANGE_DETAILS_ID=");
		sb.append(getADDR_CHANGE_DETAILS_ID());
		sb.append(", REQUEST_SUBMIT_TYPE=");
		sb.append(getREQUEST_SUBMIT_TYPE());
		sb.append(", SERVICE_REQUEST_ID=");
		sb.append(getSERVICE_REQUEST_ID());
		sb.append(", SUB_TYPE=");
		sb.append(getSUB_TYPE());
		sb.append(", ADDRESS_TYPE_ID=");
		sb.append(getADDRESS_TYPE_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", SUBMIT_AT_BRANCH=");
		sb.append(getSUBMIT_AT_BRANCH());
		sb.append(", PICKUP_DATE=");
		sb.append(getPICKUP_DATE());
		sb.append(", PICKUP_TIME=");
		sb.append(getPICKUP_TIME());
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
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.AddressChangeReqDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ADDR_CHANGE_DETAILS_ID</column-name><column-value><![CDATA[");
		sb.append(getADDR_CHANGE_DETAILS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>REQUEST_SUBMIT_TYPE</column-name><column-value><![CDATA[");
		sb.append(getREQUEST_SUBMIT_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SERVICE_REQUEST_ID</column-name><column-value><![CDATA[");
		sb.append(getSERVICE_REQUEST_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUB_TYPE</column-name><column-value><![CDATA[");
		sb.append(getSUB_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUBMIT_AT_BRANCH</column-name><column-value><![CDATA[");
		sb.append(getSUBMIT_AT_BRANCH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PICKUP_DATE</column-name><column-value><![CDATA[");
		sb.append(getPICKUP_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PICKUP_TIME</column-name><column-value><![CDATA[");
		sb.append(getPICKUP_TIME());
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

	private int _ADDR_CHANGE_DETAILS_ID;
	private String _REQUEST_SUBMIT_TYPE;
	private int _SERVICE_REQUEST_ID;
	private int _SUB_TYPE;
	private int _ADDRESS_TYPE_ID;
	private int _CUSTOMER_ID;
	private int _SUBMIT_AT_BRANCH;
	private Date _PICKUP_DATE;
	private String _PICKUP_TIME;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private BaseModel<?> _addressChangeReqDetailsRemoteModel;
}