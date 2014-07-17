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

package com.ifl.rapid.customer.model;

import com.ifl.rapid.customer.service.ClpSerializer;
import com.ifl.rapid.customer.service.QrcMstRequestsLocalServiceUtil;

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
public class QrcMstRequestsClp extends BaseModelImpl<QrcMstRequests>
	implements QrcMstRequests {
	public QrcMstRequestsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstRequests.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstRequests.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _RequestId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _RequestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RequestId", getRequestId());
		attributes.put("Category", getCategory());
		attributes.put("CallType", getCallType());
		attributes.put("CallSubType", getCallSubType());
		attributes.put("Keyword", getKeyword());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer RequestId = (Integer)attributes.get("RequestId");

		if (RequestId != null) {
			setRequestId(RequestId);
		}

		String Category = (String)attributes.get("Category");

		if (Category != null) {
			setCategory(Category);
		}

		String CallType = (String)attributes.get("CallType");

		if (CallType != null) {
			setCallType(CallType);
		}

		String CallSubType = (String)attributes.get("CallSubType");

		if (CallSubType != null) {
			setCallSubType(CallSubType);
		}

		String Keyword = (String)attributes.get("Keyword");

		if (Keyword != null) {
			setKeyword(Keyword);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}
	}

	@Override
	public int getRequestId() {
		return _RequestId;
	}

	@Override
	public void setRequestId(int RequestId) {
		_RequestId = RequestId;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestId", int.class);

				method.invoke(_qrcMstRequestsRemoteModel, RequestId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategory() {
		return _Category;
	}

	@Override
	public void setCategory(String Category) {
		_Category = Category;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory", String.class);

				method.invoke(_qrcMstRequestsRemoteModel, Category);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallType() {
		return _CallType;
	}

	@Override
	public void setCallType(String CallType) {
		_CallType = CallType;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCallType", String.class);

				method.invoke(_qrcMstRequestsRemoteModel, CallType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallSubType() {
		return _CallSubType;
	}

	@Override
	public void setCallSubType(String CallSubType) {
		_CallSubType = CallSubType;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSubType", String.class);

				method.invoke(_qrcMstRequestsRemoteModel, CallSubType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeyword() {
		return _Keyword;
	}

	@Override
	public void setKeyword(String Keyword) {
		_Keyword = Keyword;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setKeyword", String.class);

				method.invoke(_qrcMstRequestsRemoteModel, Keyword);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(int IsActive) {
		_IsActive = IsActive;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_qrcMstRequestsRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _CreatedBy;
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_qrcMstRequestsRemoteModel, CreatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_qrcMstRequestsRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_qrcMstRequestsRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _ModifiedBy;
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;

		if (_qrcMstRequestsRemoteModel != null) {
			try {
				Class<?> clazz = _qrcMstRequestsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_qrcMstRequestsRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQrcMstRequestsRemoteModel() {
		return _qrcMstRequestsRemoteModel;
	}

	public void setQrcMstRequestsRemoteModel(
		BaseModel<?> qrcMstRequestsRemoteModel) {
		_qrcMstRequestsRemoteModel = qrcMstRequestsRemoteModel;
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

		Class<?> remoteModelClass = _qrcMstRequestsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcMstRequestsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QrcMstRequestsLocalServiceUtil.addQrcMstRequests(this);
		}
		else {
			QrcMstRequestsLocalServiceUtil.updateQrcMstRequests(this);
		}
	}

	@Override
	public QrcMstRequests toEscapedModel() {
		return (QrcMstRequests)ProxyUtil.newProxyInstance(QrcMstRequests.class.getClassLoader(),
			new Class[] { QrcMstRequests.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QrcMstRequestsClp clone = new QrcMstRequestsClp();

		clone.setRequestId(getRequestId());
		clone.setCategory(getCategory());
		clone.setCallType(getCallType());
		clone.setCallSubType(getCallSubType());
		clone.setKeyword(getKeyword());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(QrcMstRequests qrcMstRequests) {
		int primaryKey = qrcMstRequests.getPrimaryKey();

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

		if (!(obj instanceof QrcMstRequestsClp)) {
			return false;
		}

		QrcMstRequestsClp qrcMstRequests = (QrcMstRequestsClp)obj;

		int primaryKey = qrcMstRequests.getPrimaryKey();

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

		sb.append("{RequestId=");
		sb.append(getRequestId());
		sb.append(", Category=");
		sb.append(getCategory());
		sb.append(", CallType=");
		sb.append(getCallType());
		sb.append(", CallSubType=");
		sb.append(getCallSubType());
		sb.append(", Keyword=");
		sb.append(getKeyword());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcMstRequests");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>RequestId</column-name><column-value><![CDATA[");
		sb.append(getRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CallType</column-name><column-value><![CDATA[");
		sb.append(getCallType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CallSubType</column-name><column-value><![CDATA[");
		sb.append(getCallSubType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Keyword</column-name><column-value><![CDATA[");
		sb.append(getKeyword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _RequestId;
	private String _Category;
	private String _CallType;
	private String _CallSubType;
	private String _Keyword;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private BaseModel<?> _qrcMstRequestsRemoteModel;
}