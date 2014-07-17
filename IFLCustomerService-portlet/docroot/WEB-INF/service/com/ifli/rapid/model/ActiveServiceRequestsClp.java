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

import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
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
public class ActiveServiceRequestsClp extends BaseModelImpl<ActiveServiceRequests>
	implements ActiveServiceRequests {
	public ActiveServiceRequestsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActiveServiceRequests.class;
	}

	@Override
	public String getModelClassName() {
		return ActiveServiceRequests.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_ASR_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("TYPE_ID", getTYPE_ID());
		attributes.put("SUB_TYPE_ID", getSUB_TYPE_ID());
		attributes.put("ASSIGNED_TO", getASSIGNED_TO());
		attributes.put("HANDLED_BY", getHANDLED_BY());
		attributes.put("STATUS_ID", getSTATUS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("CUST_SR_NUMBER", getCUST_SR_NUMBER());
		attributes.put("ADDITIONAL_DATA_XML", getADDITIONAL_DATA_XML());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		Integer TYPE_ID = (Integer)attributes.get("TYPE_ID");

		if (TYPE_ID != null) {
			setTYPE_ID(TYPE_ID);
		}

		Integer SUB_TYPE_ID = (Integer)attributes.get("SUB_TYPE_ID");

		if (SUB_TYPE_ID != null) {
			setSUB_TYPE_ID(SUB_TYPE_ID);
		}

		Integer ASSIGNED_TO = (Integer)attributes.get("ASSIGNED_TO");

		if (ASSIGNED_TO != null) {
			setASSIGNED_TO(ASSIGNED_TO);
		}

		Integer HANDLED_BY = (Integer)attributes.get("HANDLED_BY");

		if (HANDLED_BY != null) {
			setHANDLED_BY(HANDLED_BY);
		}

		Integer STATUS_ID = (Integer)attributes.get("STATUS_ID");

		if (STATUS_ID != null) {
			setSTATUS_ID(STATUS_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String CUST_SR_NUMBER = (String)attributes.get("CUST_SR_NUMBER");

		if (CUST_SR_NUMBER != null) {
			setCUST_SR_NUMBER(CUST_SR_NUMBER);
		}

		String ADDITIONAL_DATA_XML = (String)attributes.get(
				"ADDITIONAL_DATA_XML");

		if (ADDITIONAL_DATA_XML != null) {
			setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
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
	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, QRC_ASR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTYPE_ID() {
		return _TYPE_ID;
	}

	@Override
	public void setTYPE_ID(int TYPE_ID) {
		_TYPE_ID = TYPE_ID;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setTYPE_ID", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSUB_TYPE_ID() {
		return _SUB_TYPE_ID;
	}

	@Override
	public void setSUB_TYPE_ID(int SUB_TYPE_ID) {
		_SUB_TYPE_ID = SUB_TYPE_ID;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setSUB_TYPE_ID", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, SUB_TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getASSIGNED_TO() {
		return _ASSIGNED_TO;
	}

	@Override
	public void setASSIGNED_TO(int ASSIGNED_TO) {
		_ASSIGNED_TO = ASSIGNED_TO;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setASSIGNED_TO", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, ASSIGNED_TO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHANDLED_BY() {
		return _HANDLED_BY;
	}

	@Override
	public void setHANDLED_BY(int HANDLED_BY) {
		_HANDLED_BY = HANDLED_BY;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setHANDLED_BY", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, HANDLED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSTATUS_ID() {
		return _STATUS_ID;
	}

	@Override
	public void setSTATUS_ID(int STATUS_ID) {
		_STATUS_ID = STATUS_ID;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATUS_ID", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, STATUS_ID);
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

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", int.class);

				method.invoke(_activeServiceRequestsRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCUST_SR_NUMBER() {
		return _CUST_SR_NUMBER;
	}

	@Override
	public void setCUST_SR_NUMBER(String CUST_SR_NUMBER) {
		_CUST_SR_NUMBER = CUST_SR_NUMBER;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUST_SR_NUMBER",
						String.class);

				method.invoke(_activeServiceRequestsRemoteModel, CUST_SR_NUMBER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDITIONAL_DATA_XML() {
		return _ADDITIONAL_DATA_XML;
	}

	@Override
	public void setADDITIONAL_DATA_XML(String ADDITIONAL_DATA_XML) {
		_ADDITIONAL_DATA_XML = ADDITIONAL_DATA_XML;

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDITIONAL_DATA_XML",
						String.class);

				method.invoke(_activeServiceRequestsRemoteModel,
					ADDITIONAL_DATA_XML);
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

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_activeServiceRequestsRemoteModel, INSERTED_DATE);
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

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_activeServiceRequestsRemoteModel, INSERTED_BY);
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

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_activeServiceRequestsRemoteModel, UPDATED_DATE);
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

		if (_activeServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _activeServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_activeServiceRequestsRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActiveServiceRequestsRemoteModel() {
		return _activeServiceRequestsRemoteModel;
	}

	public void setActiveServiceRequestsRemoteModel(
		BaseModel<?> activeServiceRequestsRemoteModel) {
		_activeServiceRequestsRemoteModel = activeServiceRequestsRemoteModel;
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

		Class<?> remoteModelClass = _activeServiceRequestsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_activeServiceRequestsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActiveServiceRequestsLocalServiceUtil.addActiveServiceRequests(this);
		}
		else {
			ActiveServiceRequestsLocalServiceUtil.updateActiveServiceRequests(this);
		}
	}

	@Override
	public ActiveServiceRequests toEscapedModel() {
		return (ActiveServiceRequests)ProxyUtil.newProxyInstance(ActiveServiceRequests.class.getClassLoader(),
			new Class[] { ActiveServiceRequests.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActiveServiceRequestsClp clone = new ActiveServiceRequestsClp();

		clone.setQRC_ASR_ID(getQRC_ASR_ID());
		clone.setTYPE_ID(getTYPE_ID());
		clone.setSUB_TYPE_ID(getSUB_TYPE_ID());
		clone.setASSIGNED_TO(getASSIGNED_TO());
		clone.setHANDLED_BY(getHANDLED_BY());
		clone.setSTATUS_ID(getSTATUS_ID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setCUST_SR_NUMBER(getCUST_SR_NUMBER());
		clone.setADDITIONAL_DATA_XML(getADDITIONAL_DATA_XML());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());

		return clone;
	}

	@Override
	public int compareTo(ActiveServiceRequests activeServiceRequests) {
		int primaryKey = activeServiceRequests.getPrimaryKey();

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

		if (!(obj instanceof ActiveServiceRequestsClp)) {
			return false;
		}

		ActiveServiceRequestsClp activeServiceRequests = (ActiveServiceRequestsClp)obj;

		int primaryKey = activeServiceRequests.getPrimaryKey();

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

		sb.append("{QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append(", TYPE_ID=");
		sb.append(getTYPE_ID());
		sb.append(", SUB_TYPE_ID=");
		sb.append(getSUB_TYPE_ID());
		sb.append(", ASSIGNED_TO=");
		sb.append(getASSIGNED_TO());
		sb.append(", HANDLED_BY=");
		sb.append(getHANDLED_BY());
		sb.append(", STATUS_ID=");
		sb.append(getSTATUS_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", CUST_SR_NUMBER=");
		sb.append(getCUST_SR_NUMBER());
		sb.append(", ADDITIONAL_DATA_XML=");
		sb.append(getADDITIONAL_DATA_XML());
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
		sb.append("com.ifli.rapid.model.ActiveServiceRequests");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getTYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUB_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getSUB_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ASSIGNED_TO</column-name><column-value><![CDATA[");
		sb.append(getASSIGNED_TO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HANDLED_BY</column-name><column-value><![CDATA[");
		sb.append(getHANDLED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATUS_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATUS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUST_SR_NUMBER</column-name><column-value><![CDATA[");
		sb.append(getCUST_SR_NUMBER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDITIONAL_DATA_XML</column-name><column-value><![CDATA[");
		sb.append(getADDITIONAL_DATA_XML());
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

	private int _QRC_ASR_ID;
	private int _TYPE_ID;
	private int _SUB_TYPE_ID;
	private int _ASSIGNED_TO;
	private int _HANDLED_BY;
	private int _STATUS_ID;
	private int _CUSTOMER_ID;
	private String _CUST_SR_NUMBER;
	private String _ADDITIONAL_DATA_XML;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private BaseModel<?> _activeServiceRequestsRemoteModel;
}