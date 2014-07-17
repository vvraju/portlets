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
import com.ifli.rapid.service.QRCTypeMasterLocalServiceUtil;

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
public class QRCTypeMasterClp extends BaseModelImpl<QRCTypeMaster>
	implements QRCTypeMaster {
	public QRCTypeMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QRCTypeMaster.class;
	}

	@Override
	public String getModelClassName() {
		return QRCTypeMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_TYPE_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_TYPE_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_TYPE_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_TYPE_ID", getQRC_TYPE_ID());
		attributes.put("TYPE_DESC", getTYPE_DESC());
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
		Integer QRC_TYPE_ID = (Integer)attributes.get("QRC_TYPE_ID");

		if (QRC_TYPE_ID != null) {
			setQRC_TYPE_ID(QRC_TYPE_ID);
		}

		String TYPE_DESC = (String)attributes.get("TYPE_DESC");

		if (TYPE_DESC != null) {
			setTYPE_DESC(TYPE_DESC);
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
	public int getQRC_TYPE_ID() {
		return _QRC_TYPE_ID;
	}

	@Override
	public void setQRC_TYPE_ID(int QRC_TYPE_ID) {
		_QRC_TYPE_ID = QRC_TYPE_ID;

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setQRC_TYPE_ID", int.class);

				method.invoke(_qrcTypeMasterRemoteModel, QRC_TYPE_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTYPE_DESC() {
		return _TYPE_DESC;
	}

	@Override
	public void setTYPE_DESC(String TYPE_DESC) {
		_TYPE_DESC = TYPE_DESC;

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setTYPE_DESC", String.class);

				method.invoke(_qrcTypeMasterRemoteModel, TYPE_DESC);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setACTIVE_FLAG", String.class);

				method.invoke(_qrcTypeMasterRemoteModel, ACTIVE_FLAG);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_DATE", Date.class);

				method.invoke(_qrcTypeMasterRemoteModel, INSERTED_DATE);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setINSERTED_BY", String.class);

				method.invoke(_qrcTypeMasterRemoteModel, INSERTED_BY);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_DATE", Date.class);

				method.invoke(_qrcTypeMasterRemoteModel, UPDATED_DATE);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUPDATED_BY", String.class);

				method.invoke(_qrcTypeMasterRemoteModel, UPDATED_BY);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setDELETED_DATE", Date.class);

				method.invoke(_qrcTypeMasterRemoteModel, DELETED_DATE);
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

		if (_qrcTypeMasterRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTypeMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setDELETED_BY", String.class);

				method.invoke(_qrcTypeMasterRemoteModel, DELETED_BY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQRCTypeMasterRemoteModel() {
		return _qrcTypeMasterRemoteModel;
	}

	public void setQRCTypeMasterRemoteModel(
		BaseModel<?> qrcTypeMasterRemoteModel) {
		_qrcTypeMasterRemoteModel = qrcTypeMasterRemoteModel;
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

		Class<?> remoteModelClass = _qrcTypeMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcTypeMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QRCTypeMasterLocalServiceUtil.addQRCTypeMaster(this);
		}
		else {
			QRCTypeMasterLocalServiceUtil.updateQRCTypeMaster(this);
		}
	}

	@Override
	public QRCTypeMaster toEscapedModel() {
		return (QRCTypeMaster)ProxyUtil.newProxyInstance(QRCTypeMaster.class.getClassLoader(),
			new Class[] { QRCTypeMaster.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QRCTypeMasterClp clone = new QRCTypeMasterClp();

		clone.setQRC_TYPE_ID(getQRC_TYPE_ID());
		clone.setTYPE_DESC(getTYPE_DESC());
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
	public int compareTo(QRCTypeMaster qrcTypeMaster) {
		int primaryKey = qrcTypeMaster.getPrimaryKey();

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

		if (!(obj instanceof QRCTypeMasterClp)) {
			return false;
		}

		QRCTypeMasterClp qrcTypeMaster = (QRCTypeMasterClp)obj;

		int primaryKey = qrcTypeMaster.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{QRC_TYPE_ID=");
		sb.append(getQRC_TYPE_ID());
		sb.append(", TYPE_DESC=");
		sb.append(getTYPE_DESC());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.QRCTypeMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TYPE_DESC</column-name><column-value><![CDATA[");
		sb.append(getTYPE_DESC());
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

	private int _QRC_TYPE_ID;
	private String _TYPE_DESC;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
	private BaseModel<?> _qrcTypeMasterRemoteModel;
}