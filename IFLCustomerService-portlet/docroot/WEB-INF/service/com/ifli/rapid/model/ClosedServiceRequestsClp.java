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

import com.ifli.rapid.service.ClosedServiceRequestsLocalServiceUtil;
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
public class ClosedServiceRequestsClp extends BaseModelImpl<ClosedServiceRequests>
	implements ClosedServiceRequests {
	public ClosedServiceRequestsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ClosedServiceRequests.class;
	}

	@Override
	public String getModelClassName() {
		return ClosedServiceRequests.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_CSR_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_CSR_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_CSR_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_CSR_ID", getQRC_CSR_ID());
		attributes.put("TYPE_ID", getTYPE_ID());
		attributes.put("ASSIGNED_TO", getASSIGNED_TO());
		attributes.put("HANDLED_BY", getHANDLED_BY());
		attributes.put("STATUS_ID", getSTATUS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("customerSRNumber", getCustomerSRNumber());
		attributes.put("ADDITIONAL_DATA_XML", getADDITIONAL_DATA_XML());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_CSR_ID = (Integer)attributes.get("QRC_CSR_ID");

		if (QRC_CSR_ID != null) {
			setQRC_CSR_ID(QRC_CSR_ID);
		}

		Integer TYPE_ID = (Integer)attributes.get("TYPE_ID");

		if (TYPE_ID != null) {
			setTYPE_ID(TYPE_ID);
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

		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String customerSRNumber = (String)attributes.get("customerSRNumber");

		if (customerSRNumber != null) {
			setCustomerSRNumber(customerSRNumber);
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
	public int getQRC_CSR_ID() {
		return _QRC_CSR_ID;
	}

	@Override
	public void setQRC_CSR_ID(int QRC_CSR_ID) {
		_QRC_CSR_ID = QRC_CSR_ID;

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_CSR_ID", int.class);

				method.invoke(_closedServiceRequestsRemoteModel, QRC_CSR_ID);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setTYPE_ID", int.class);

				method.invoke(_closedServiceRequestsRemoteModel, TYPE_ID);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setASSIGNED_TO", int.class);

				method.invoke(_closedServiceRequestsRemoteModel, ASSIGNED_TO);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setHANDLED_BY", int.class);

				method.invoke(_closedServiceRequestsRemoteModel, HANDLED_BY);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATUS_ID", int.class);

				method.invoke(_closedServiceRequestsRemoteModel, STATUS_ID);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCUSTOMER_ID", String.class);

				method.invoke(_closedServiceRequestsRemoteModel, CUSTOMER_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerSRNumber() {
		return _customerSRNumber;
	}

	@Override
	public void setCustomerSRNumber(String customerSRNumber) {
		_customerSRNumber = customerSRNumber;

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerSRNumber",
						String.class);

				method.invoke(_closedServiceRequestsRemoteModel,
					customerSRNumber);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setADDITIONAL_DATA_XML",
						String.class);

				method.invoke(_closedServiceRequestsRemoteModel,
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_closedServiceRequestsRemoteModel, INSERTED_DATE);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_closedServiceRequestsRemoteModel, INSERTED_BY);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_closedServiceRequestsRemoteModel, UPDATED_DATE);
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

		if (_closedServiceRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _closedServiceRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_closedServiceRequestsRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getClosedServiceRequestsRemoteModel() {
		return _closedServiceRequestsRemoteModel;
	}

	public void setClosedServiceRequestsRemoteModel(
		BaseModel<?> closedServiceRequestsRemoteModel) {
		_closedServiceRequestsRemoteModel = closedServiceRequestsRemoteModel;
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

		Class<?> remoteModelClass = _closedServiceRequestsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_closedServiceRequestsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ClosedServiceRequestsLocalServiceUtil.addClosedServiceRequests(this);
		}
		else {
			ClosedServiceRequestsLocalServiceUtil.updateClosedServiceRequests(this);
		}
	}

	@Override
	public ClosedServiceRequests toEscapedModel() {
		return (ClosedServiceRequests)ProxyUtil.newProxyInstance(ClosedServiceRequests.class.getClassLoader(),
			new Class[] { ClosedServiceRequests.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ClosedServiceRequestsClp clone = new ClosedServiceRequestsClp();

		clone.setQRC_CSR_ID(getQRC_CSR_ID());
		clone.setTYPE_ID(getTYPE_ID());
		clone.setASSIGNED_TO(getASSIGNED_TO());
		clone.setHANDLED_BY(getHANDLED_BY());
		clone.setSTATUS_ID(getSTATUS_ID());
		clone.setCUSTOMER_ID(getCUSTOMER_ID());
		clone.setCustomerSRNumber(getCustomerSRNumber());
		clone.setADDITIONAL_DATA_XML(getADDITIONAL_DATA_XML());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());

		return clone;
	}

	@Override
	public int compareTo(ClosedServiceRequests closedServiceRequests) {
		int primaryKey = closedServiceRequests.getPrimaryKey();

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

		if (!(obj instanceof ClosedServiceRequestsClp)) {
			return false;
		}

		ClosedServiceRequestsClp closedServiceRequests = (ClosedServiceRequestsClp)obj;

		int primaryKey = closedServiceRequests.getPrimaryKey();

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

		sb.append("{QRC_CSR_ID=");
		sb.append(getQRC_CSR_ID());
		sb.append(", TYPE_ID=");
		sb.append(getTYPE_ID());
		sb.append(", ASSIGNED_TO=");
		sb.append(getASSIGNED_TO());
		sb.append(", HANDLED_BY=");
		sb.append(getHANDLED_BY());
		sb.append(", STATUS_ID=");
		sb.append(getSTATUS_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", customerSRNumber=");
		sb.append(getCustomerSRNumber());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ClosedServiceRequests");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_CSR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_CSR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getTYPE_ID());
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
			"<column><column-name>customerSRNumber</column-name><column-value><![CDATA[");
		sb.append(getCustomerSRNumber());
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

	private int _QRC_CSR_ID;
	private int _TYPE_ID;
	private int _ASSIGNED_TO;
	private int _HANDLED_BY;
	private int _STATUS_ID;
	private String _CUSTOMER_ID;
	private String _customerSRNumber;
	private String _ADDITIONAL_DATA_XML;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private BaseModel<?> _closedServiceRequestsRemoteModel;
}