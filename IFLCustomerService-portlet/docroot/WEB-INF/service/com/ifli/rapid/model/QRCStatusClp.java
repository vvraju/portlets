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
import com.ifli.rapid.service.QRCStatusLocalServiceUtil;

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
public class QRCStatusClp extends BaseModelImpl<QRCStatus> implements QRCStatus {
	public QRCStatusClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QRCStatus.class;
	}

	@Override
	public String getModelClassName() {
		return QRCStatus.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_STATUS_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_STATUS_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_STATUS_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_STATUS_ID", getQRC_STATUS_ID());
		attributes.put("STATUS_DESC", getSTATUS_DESC());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("DELETED_DATE", getDELETED_DATE());
		attributes.put("DELETED_BY", getDELETED_BY());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_STATUS_ID = (Integer)attributes.get("QRC_STATUS_ID");

		if (QRC_STATUS_ID != null) {
			setQRC_STATUS_ID(QRC_STATUS_ID);
		}

		String STATUS_DESC = (String)attributes.get("STATUS_DESC");

		if (STATUS_DESC != null) {
			setSTATUS_DESC(STATUS_DESC);
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

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}
	}

	@Override
	public int getQRC_STATUS_ID() {
		return _QRC_STATUS_ID;
	}

	@Override
	public void setQRC_STATUS_ID(int QRC_STATUS_ID) {
		_QRC_STATUS_ID = QRC_STATUS_ID;

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_STATUS_ID", int.class);

				method.invoke(_qrcStatusRemoteModel, QRC_STATUS_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSTATUS_DESC() {
		return _STATUS_DESC;
	}

	@Override
	public void setSTATUS_DESC(String STATUS_DESC) {
		_STATUS_DESC = STATUS_DESC;

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATUS_DESC", String.class);

				method.invoke(_qrcStatusRemoteModel, STATUS_DESC);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setACTIVE_FLAG", String.class);

				method.invoke(_qrcStatusRemoteModel, ACTIVE_FLAG);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_qrcStatusRemoteModel, INSERTED_DATE);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_qrcStatusRemoteModel, INSERTED_BY);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_qrcStatusRemoteModel, UPDATED_DATE);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_qrcStatusRemoteModel, UPDATED_BY);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setDELETED_DATE", Date.class);

				method.invoke(_qrcStatusRemoteModel, DELETED_DATE);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setDELETED_BY", String.class);

				method.invoke(_qrcStatusRemoteModel, DELETED_BY);
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

		if (_qrcStatusRemoteModel != null) {
			try {
				Class<?> clazz = _qrcStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_ASR_ID", int.class);

				method.invoke(_qrcStatusRemoteModel, QRC_ASR_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQRCStatusRemoteModel() {
		return _qrcStatusRemoteModel;
	}

	public void setQRCStatusRemoteModel(BaseModel<?> qrcStatusRemoteModel) {
		_qrcStatusRemoteModel = qrcStatusRemoteModel;
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

		Class<?> remoteModelClass = _qrcStatusRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcStatusRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCStatusLocalServiceUtil.addQRCStatus(this);
		}
		else {
			QRCStatusLocalServiceUtil.updateQRCStatus(this);
		}
	}

	@Override
	public QRCStatus toEscapedModel() {
		return (QRCStatus)ProxyUtil.newProxyInstance(QRCStatus.class.getClassLoader(),
			new Class[] { QRCStatus.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QRCStatusClp clone = new QRCStatusClp();

		clone.setQRC_STATUS_ID(getQRC_STATUS_ID());
		clone.setSTATUS_DESC(getSTATUS_DESC());
		clone.setACTIVE_FLAG(getACTIVE_FLAG());
		clone.setINSERTED_DATE(getINSERTED_DATE());
		clone.setINSERTED_BY(getINSERTED_BY());
		clone.setUPDATED_DATE(getUPDATED_DATE());
		clone.setUPDATED_BY(getUPDATED_BY());
		clone.setDELETED_DATE(getDELETED_DATE());
		clone.setDELETED_BY(getDELETED_BY());
		clone.setQRC_ASR_ID(getQRC_ASR_ID());

		return clone;
	}

	@Override
	public int compareTo(QRCStatus qrcStatus) {
		int primaryKey = qrcStatus.getPrimaryKey();

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

		if (!(obj instanceof QRCStatusClp)) {
			return false;
		}

		QRCStatusClp qrcStatus = (QRCStatusClp)obj;

		int primaryKey = qrcStatus.getPrimaryKey();

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

		sb.append("{QRC_STATUS_ID=");
		sb.append(getQRC_STATUS_ID());
		sb.append(", STATUS_DESC=");
		sb.append(getSTATUS_DESC());
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
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.QRCStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_STATUS_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_STATUS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATUS_DESC</column-name><column-value><![CDATA[");
		sb.append(getSTATUS_DESC());
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
		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _QRC_STATUS_ID;
	private String _STATUS_DESC;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
	private int _QRC_ASR_ID;
	private BaseModel<?> _qrcStatusRemoteModel;
}