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
import com.ifli.rapid.service.CustomerFamilyDetailsLocalServiceUtil;

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
public class CustomerFamilyDetailsClp extends BaseModelImpl<CustomerFamilyDetails>
	implements CustomerFamilyDetails {
	public CustomerFamilyDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerFamilyDetails.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerFamilyDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _CUSTOMER_FAMILY_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCUSTOMER_FAMILY_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CUSTOMER_FAMILY_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_FAMILY_ID", getCUSTOMER_FAMILY_ID());
		attributes.put("PERSON_NAME", getPERSON_NAME());
		attributes.put("RELATION", getRELATION());
		attributes.put("DEPENDENT", getDEPENDENT());
		attributes.put("AGE", getAGE());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("ADDED_BY", getADDED_BY());
		attributes.put("ADDED_DATE", getADDED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_FAMILY_ID = (Integer)attributes.get(
				"CUSTOMER_FAMILY_ID");

		if (CUSTOMER_FAMILY_ID != null) {
			setCUSTOMER_FAMILY_ID(CUSTOMER_FAMILY_ID);
		}

		String PERSON_NAME = (String)attributes.get("PERSON_NAME");

		if (PERSON_NAME != null) {
			setPERSON_NAME(PERSON_NAME);
		}

		String RELATION = (String)attributes.get("RELATION");

		if (RELATION != null) {
			setRELATION(RELATION);
		}

		String DEPENDENT = (String)attributes.get("DEPENDENT");

		if (DEPENDENT != null) {
			setDEPENDENT(DEPENDENT);
		}

		Integer AGE = (Integer)attributes.get("AGE");

		if (AGE != null) {
			setAGE(AGE);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String ADDED_BY = (String)attributes.get("ADDED_BY");

		if (ADDED_BY != null) {
			setADDED_BY(ADDED_BY);
		}

		Date ADDED_DATE = (Date)attributes.get("ADDED_DATE");

		if (ADDED_DATE != null) {
			setADDED_DATE(ADDED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	@Override
	public int getCUSTOMER_FAMILY_ID() {
		return _CUSTOMER_FAMILY_ID;
	}

	@Override
	public void setCUSTOMER_FAMILY_ID(int CUSTOMER_FAMILY_ID) {
		_CUSTOMER_FAMILY_ID = CUSTOMER_FAMILY_ID;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_FAMILY_ID",
						int.class);

				method.invoke(_customerFamilyDetailsRemoteModel,
					CUSTOMER_FAMILY_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPERSON_NAME() {
		return _PERSON_NAME;
	}

	@Override
	public void setPERSON_NAME(String PERSON_NAME) {
		_PERSON_NAME = PERSON_NAME;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPERSON_NAME", String.class);

				method.invoke(_customerFamilyDetailsRemoteModel, PERSON_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRELATION() {
		return _RELATION;
	}

	@Override
	public void setRELATION(String RELATION) {
		_RELATION = RELATION;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRELATION", String.class);

				method.invoke(_customerFamilyDetailsRemoteModel, RELATION);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDEPENDENT() {
		return _DEPENDENT;
	}

	@Override
	public void setDEPENDENT(String DEPENDENT) {
		_DEPENDENT = DEPENDENT;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDEPENDENT", String.class);

				method.invoke(_customerFamilyDetailsRemoteModel, DEPENDENT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAGE() {
		return _AGE;
	}

	@Override
	public void setAGE(int AGE) {
		_AGE = AGE;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setAGE", int.class);

				method.invoke(_customerFamilyDetailsRemoteModel, AGE);
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

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_customerFamilyDetailsRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDED_BY() {
		return _ADDED_BY;
	}

	@Override
	public void setADDED_BY(String ADDED_BY) {
		_ADDED_BY = ADDED_BY;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDED_BY", String.class);

				method.invoke(_customerFamilyDetailsRemoteModel, ADDED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getADDED_DATE() {
		return _ADDED_DATE;
	}

	@Override
	public void setADDED_DATE(Date ADDED_DATE) {
		_ADDED_DATE = ADDED_DATE;

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDED_DATE", Date.class);

				method.invoke(_customerFamilyDetailsRemoteModel, ADDED_DATE);
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

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_customerFamilyDetailsRemoteModel, UPDATED_BY);
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

		if (_customerFamilyDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _customerFamilyDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_customerFamilyDetailsRemoteModel, UPDATED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomerFamilyDetailsRemoteModel() {
		return _customerFamilyDetailsRemoteModel;
	}

	public void setCustomerFamilyDetailsRemoteModel(
		BaseModel<?> customerFamilyDetailsRemoteModel) {
		_customerFamilyDetailsRemoteModel = customerFamilyDetailsRemoteModel;
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

		Class<?> remoteModelClass = _customerFamilyDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerFamilyDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerFamilyDetailsLocalServiceUtil.addCustomerFamilyDetails(this);
		}
		else {
			CustomerFamilyDetailsLocalServiceUtil.updateCustomerFamilyDetails(this);
		}
	}

	@Override
	public CustomerFamilyDetails toEscapedModel() {
		return (CustomerFamilyDetails)ProxyUtil.newProxyInstance(CustomerFamilyDetails.class.getClassLoader(),
			new Class[] { CustomerFamilyDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerFamilyDetailsClp clone = new CustomerFamilyDetailsClp();

		clone.setCUSTOMER_FAMILY_ID(getCUSTOMER_FAMILY_ID());
		clone.setPERSON_NAME(getPERSON_NAME());
		clone.setRELATION(getRELATION());
		clone.setDEPENDENT(getDEPENDENT());
		clone.setAGE(getAGE());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setADDED_BY(getADDED_BY());
		clone.setADDED_DATE(getADDED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());

		return clone;
	}

	@Override
	public int compareTo(CustomerFamilyDetails customerFamilyDetails) {
		int primaryKey = customerFamilyDetails.getPrimaryKey();

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

		if (!(obj instanceof CustomerFamilyDetailsClp)) {
			return false;
		}

		CustomerFamilyDetailsClp customerFamilyDetails = (CustomerFamilyDetailsClp)obj;

		int primaryKey = customerFamilyDetails.getPrimaryKey();

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

		sb.append("{CUSTOMER_FAMILY_ID=");
		sb.append(getCUSTOMER_FAMILY_ID());
		sb.append(", PERSON_NAME=");
		sb.append(getPERSON_NAME());
		sb.append(", RELATION=");
		sb.append(getRELATION());
		sb.append(", DEPENDENT=");
		sb.append(getDEPENDENT());
		sb.append(", AGE=");
		sb.append(getAGE());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", ADDED_BY=");
		sb.append(getADDED_BY());
		sb.append(", ADDED_DATE=");
		sb.append(getADDED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.CustomerFamilyDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CUSTOMER_FAMILY_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_FAMILY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PERSON_NAME</column-name><column-value><![CDATA[");
		sb.append(getPERSON_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RELATION</column-name><column-value><![CDATA[");
		sb.append(getRELATION());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DEPENDENT</column-name><column-value><![CDATA[");
		sb.append(getDEPENDENT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AGE</column-name><column-value><![CDATA[");
		sb.append(getAGE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDED_BY</column-name><column-value><![CDATA[");
		sb.append(getADDED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDED_DATE</column-name><column-value><![CDATA[");
		sb.append(getADDED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _CUSTOMER_FAMILY_ID;
	private String _PERSON_NAME;
	private String _RELATION;
	private String _DEPENDENT;
	private int _AGE;
	private int _CUSTOMER_ID;
	private String _ADDED_BY;
	private Date _ADDED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private BaseModel<?> _customerFamilyDetailsRemoteModel;
}