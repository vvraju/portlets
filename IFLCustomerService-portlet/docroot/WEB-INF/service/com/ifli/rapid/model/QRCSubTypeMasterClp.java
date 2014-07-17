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
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;

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
public class QRCSubTypeMasterClp extends BaseModelImpl<QRCSubTypeMaster>
	implements QRCSubTypeMaster {
	public QRCSubTypeMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QRCSubTypeMaster.class;
	}

	@Override
	public String getModelClassName() {
		return QRCSubTypeMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_SUB_TYPE_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_SUB_TYPE_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_SUB_TYPE_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_SUB_TYPE_ID", getQRC_SUB_TYPE_ID());
		attributes.put("QRC_TYPE_ID", getQRC_TYPE_ID());
		attributes.put("SUB_TYPE_DESC", getSUB_TYPE_DESC());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("DELETED_DATE", getDELETED_DATE());
		attributes.put("DELETED_BY", getDELETED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_SUB_TYPE_ID = (Integer)attributes.get("QRC_SUB_TYPE_ID");

		if (QRC_SUB_TYPE_ID != null) {
			setQRC_SUB_TYPE_ID(QRC_SUB_TYPE_ID);
		}

		Integer QRC_TYPE_ID = (Integer)attributes.get("QRC_TYPE_ID");

		if (QRC_TYPE_ID != null) {
			setQRC_TYPE_ID(QRC_TYPE_ID);
		}

		String SUB_TYPE_DESC = (String)attributes.get("SUB_TYPE_DESC");

		if (SUB_TYPE_DESC != null) {
			setSUB_TYPE_DESC(SUB_TYPE_DESC);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
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

		Date DELETED_DATE = (Date)attributes.get("DELETED_DATE");

		if (DELETED_DATE != null) {
			setDELETED_DATE(DELETED_DATE);
		}

		String DELETED_BY = (String)attributes.get("DELETED_BY");

		if (DELETED_BY != null) {
			setDELETED_BY(DELETED_BY);
		}
	}

	@Override
	public int getQRC_SUB_TYPE_ID() {
		return _QRC_SUB_TYPE_ID;
	}

	@Override
	public void setQRC_SUB_TYPE_ID(int QRC_SUB_TYPE_ID) {
		_QRC_SUB_TYPE_ID = QRC_SUB_TYPE_ID;

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_SUB_TYPE_ID", int.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, QRC_SUB_TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQRC_TYPE_ID() {
		return _QRC_TYPE_ID;
	}

	@Override
	public void setQRC_TYPE_ID(int QRC_TYPE_ID) {
		_QRC_TYPE_ID = QRC_TYPE_ID;

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_TYPE_ID", int.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, QRC_TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSUB_TYPE_DESC() {
		return _SUB_TYPE_DESC;
	}

	@Override
	public void setSUB_TYPE_DESC(String SUB_TYPE_DESC) {
		_SUB_TYPE_DESC = SUB_TYPE_DESC;

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setSUB_TYPE_DESC", String.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, SUB_TYPE_DESC);
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

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setACTIVE_FLAG", String.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, ACTIVE_FLAG);
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

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, INSERTED_DATE);
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

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, INSERTED_BY);
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

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, UPDATED_DATE);
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

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, UPDATED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDELETED_DATE() {
		return _DELETED_DATE;
	}

	@Override
	public void setDELETED_DATE(Date DELETED_DATE) {
		_DELETED_DATE = DELETED_DATE;

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setDELETED_DATE", Date.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, DELETED_DATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDELETED_BY() {
		return _DELETED_BY;
	}

	@Override
	public void setDELETED_BY(String DELETED_BY) {
		_DELETED_BY = DELETED_BY;

		if (_qrcSubTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcSubTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setDELETED_BY", String.class);

				method.invoke(_qrcSubTypeMasterRemoteModel, DELETED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQRCSubTypeMasterRemoteModel() {
		return _qrcSubTypeMasterRemoteModel;
	}

	public void setQRCSubTypeMasterRemoteModel(
		BaseModel<?> qrcSubTypeMasterRemoteModel) {
		_qrcSubTypeMasterRemoteModel = qrcSubTypeMasterRemoteModel;
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

		Class<?> remoteModelClass = _qrcSubTypeMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcSubTypeMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCSubTypeMasterLocalServiceUtil.addQRCSubTypeMaster(this);
		}
		else {
			QRCSubTypeMasterLocalServiceUtil.updateQRCSubTypeMaster(this);
		}
	}

	@Override
	public QRCSubTypeMaster toEscapedModel() {
		return (QRCSubTypeMaster)ProxyUtil.newProxyInstance(QRCSubTypeMaster.class.getClassLoader(),
			new Class[] { QRCSubTypeMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QRCSubTypeMasterClp clone = new QRCSubTypeMasterClp();

		clone.setQRC_SUB_TYPE_ID(getQRC_SUB_TYPE_ID());
		clone.setQRC_TYPE_ID(getQRC_TYPE_ID());
		clone.setSUB_TYPE_DESC(getSUB_TYPE_DESC());
		clone.setACTIVE_FLAG(getACTIVE_FLAG());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());
		clone.setDELETED_DATE(getDELETED_DATE());
		clone.setDELETED_BY(getDELETED_BY());

		return clone;
	}

	@Override
	public int compareTo(QRCSubTypeMaster qrcSubTypeMaster) {
		int primaryKey = qrcSubTypeMaster.getPrimaryKey();

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

		if (!(obj instanceof QRCSubTypeMasterClp)) {
			return false;
		}

		QRCSubTypeMasterClp qrcSubTypeMaster = (QRCSubTypeMasterClp)obj;

		int primaryKey = qrcSubTypeMaster.getPrimaryKey();

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

		sb.append("{QRC_SUB_TYPE_ID=");
		sb.append(getQRC_SUB_TYPE_ID());
		sb.append(", QRC_TYPE_ID=");
		sb.append(getQRC_TYPE_ID());
		sb.append(", SUB_TYPE_DESC=");
		sb.append(getSUB_TYPE_DESC());
		sb.append(", ACTIVE_FLAG=");
		sb.append(getACTIVE_FLAG());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", DELETED_DATE=");
		sb.append(getDELETED_DATE());
		sb.append(", DELETED_BY=");
		sb.append(getDELETED_BY());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.QRCSubTypeMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_SUB_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_SUB_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QRC_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUB_TYPE_DESC</column-name><column-value><![CDATA[");
		sb.append(getSUB_TYPE_DESC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ACTIVE_FLAG</column-name><column-value><![CDATA[");
		sb.append(getACTIVE_FLAG());
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
		sb.append(
			"<column><column-name>DELETED_DATE</column-name><column-value><![CDATA[");
		sb.append(getDELETED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DELETED_BY</column-name><column-value><![CDATA[");
		sb.append(getDELETED_BY());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _QRC_SUB_TYPE_ID;
	private int _QRC_TYPE_ID;
	private String _SUB_TYPE_DESC;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
	private BaseModel<?> _qrcSubTypeMasterRemoteModel;
}