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

import com.ifli.rapid.service.AddressTypeLocalServiceUtil;
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
public class AddressTypeClp extends BaseModelImpl<AddressType>
	implements AddressType {
	public AddressTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AddressType.class;
	}

	@Override
	public String getModelClassName() {
		return AddressType.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _ADDRESS_TYPE_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setADDRESS_TYPE_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ADDRESS_TYPE_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());
		attributes.put("ADDRESS_TYPE_DESC", getADDRESS_TYPE_DESC());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}

		String ADDRESS_TYPE_DESC = (String)attributes.get("ADDRESS_TYPE_DESC");

		if (ADDRESS_TYPE_DESC != null) {
			setADDRESS_TYPE_DESC(ADDRESS_TYPE_DESC);
		}
	}

	@Override
	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_TYPE_ID", int.class);

				method.invoke(_addressTypeRemoteModel, ADDRESS_TYPE_ID);
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

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_addressTypeRemoteModel, INSERTED_BY);
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

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_addressTypeRemoteModel, INSERTED_DATE);
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

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_addressTypeRemoteModel, UPDATED_BY);
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

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_addressTypeRemoteModel, UPDATED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getACTIVE_FLAG() {
		return _ACTIVE_FLAG;
	}

	@Override
	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setACTIVE_FLAG", String.class);

				method.invoke(_addressTypeRemoteModel, ACTIVE_FLAG);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getADDRESS_TYPE_DESC() {
		return _ADDRESS_TYPE_DESC;
	}

	@Override
	public void setADDRESS_TYPE_DESC(String ADDRESS_TYPE_DESC) {
		_ADDRESS_TYPE_DESC = ADDRESS_TYPE_DESC;

		if (_addressTypeRemoteModel != null) {
			try {
				Class<?> clazz = _addressTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setADDRESS_TYPE_DESC",
						String.class);

				method.invoke(_addressTypeRemoteModel, ADDRESS_TYPE_DESC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAddressTypeRemoteModel() {
		return _addressTypeRemoteModel;
	}

	public void setAddressTypeRemoteModel(BaseModel<?> addressTypeRemoteModel) {
		_addressTypeRemoteModel = addressTypeRemoteModel;
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

		Class<?> remoteModelClass = _addressTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_addressTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AddressTypeLocalServiceUtil.addAddressType(this);
		}
		else {
			AddressTypeLocalServiceUtil.updateAddressType(this);
		}
	}

	@Override
	public AddressType toEscapedModel() {
		return (AddressType)ProxyUtil.newProxyInstance(AddressType.class.getClassLoader(),
			new Class[] { AddressType.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AddressTypeClp clone = new AddressTypeClp();

		clone.setADDRESS_TYPE_ID(getADDRESS_TYPE_ID());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setACTIVE_FLAG(getACTIVE_FLAG());
		clone.setADDRESS_TYPE_DESC(getADDRESS_TYPE_DESC());

		return clone;
	}

	@Override
	public int compareTo(AddressType addressType) {
		int primaryKey = addressType.getPrimaryKey();

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

		if (!(obj instanceof AddressTypeClp)) {
			return false;
		}

		AddressTypeClp addressType = (AddressTypeClp)obj;

		int primaryKey = addressType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{ADDRESS_TYPE_ID=");
		sb.append(getADDRESS_TYPE_ID());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append(", ACTIVE_FLAG=");
		sb.append(getACTIVE_FLAG());
		sb.append(", ADDRESS_TYPE_DESC=");
		sb.append(getADDRESS_TYPE_DESC());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.AddressType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ADDRESS_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_BY</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_DATE</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ACTIVE_FLAG</column-name><column-value><![CDATA[");
		sb.append(getACTIVE_FLAG());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_TYPE_DESC</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_TYPE_DESC());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _ADDRESS_TYPE_ID;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private String _ACTIVE_FLAG;
	private String _ADDRESS_TYPE_DESC;
	private BaseModel<?> _addressTypeRemoteModel;
}