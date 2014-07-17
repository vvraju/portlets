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
import com.ifl.rapid.customer.service.QrcTrnOtpLocalServiceUtil;

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
public class QrcTrnOtpClp extends BaseModelImpl<QrcTrnOtp> implements QrcTrnOtp {
	public QrcTrnOtpClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnOtp.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnOtp.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _Otp_Id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setOtp_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Otp_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Otp_Id", getOtp_Id());
		attributes.put("Otp", getOtp());
		attributes.put("ContactId", getContactId());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer Otp_Id = (Integer)attributes.get("Otp_Id");

		if (Otp_Id != null) {
			setOtp_Id(Otp_Id);
		}

		String Otp = (String)attributes.get("Otp");

		if (Otp != null) {
			setOtp(Otp);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}
	}

	@Override
	public int getOtp_Id() {
		return _Otp_Id;
	}

	@Override
	public void setOtp_Id(int Otp_Id) {
		_Otp_Id = Otp_Id;

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setOtp_Id", int.class);

				method.invoke(_qrcTrnOtpRemoteModel, Otp_Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOtp() {
		return _Otp;
	}

	@Override
	public void setOtp(String Otp) {
		_Otp = Otp;

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setOtp", String.class);

				method.invoke(_qrcTrnOtpRemoteModel, Otp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_ContactId = ContactId;

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", int.class);

				method.invoke(_qrcTrnOtpRemoteModel, ContactId);
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

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_qrcTrnOtpRemoteModel, CreatedBy);
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

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_qrcTrnOtpRemoteModel, CreatedDate);
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

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_qrcTrnOtpRemoteModel, ModifiedBy);
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

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_qrcTrnOtpRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(String IsActive) {
		_IsActive = IsActive;

		if (_qrcTrnOtpRemoteModel != null) {
			try {
				Class<?> clazz = _qrcTrnOtpRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", String.class);

				method.invoke(_qrcTrnOtpRemoteModel, IsActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getQrcTrnOtpRemoteModel() {
		return _qrcTrnOtpRemoteModel;
	}

	public void setQrcTrnOtpRemoteModel(BaseModel<?> qrcTrnOtpRemoteModel) {
		_qrcTrnOtpRemoteModel = qrcTrnOtpRemoteModel;
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

		Class<?> remoteModelClass = _qrcTrnOtpRemoteModel.getClass();

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

		Object returnValue = method.invoke(_qrcTrnOtpRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QrcTrnOtpLocalServiceUtil.addQrcTrnOtp(this);
		}
		else {
			QrcTrnOtpLocalServiceUtil.updateQrcTrnOtp(this);
		}
	}

	@Override
	public QrcTrnOtp toEscapedModel() {
		return (QrcTrnOtp)ProxyUtil.newProxyInstance(QrcTrnOtp.class.getClassLoader(),
			new Class[] { QrcTrnOtp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		QrcTrnOtpClp clone = new QrcTrnOtpClp();

		clone.setOtp_Id(getOtp_Id());
		clone.setOtp(getOtp());
		clone.setContactId(getContactId());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setIsActive(getIsActive());

		return clone;
	}

	@Override
	public int compareTo(QrcTrnOtp qrcTrnOtp) {
		int primaryKey = qrcTrnOtp.getPrimaryKey();

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

		if (!(obj instanceof QrcTrnOtpClp)) {
			return false;
		}

		QrcTrnOtpClp qrcTrnOtp = (QrcTrnOtpClp)obj;

		int primaryKey = qrcTrnOtp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{Otp_Id=");
		sb.append(getOtp_Id());
		sb.append(", Otp=");
		sb.append(getOtp());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcTrnOtp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Otp_Id</column-name><column-value><![CDATA[");
		sb.append(getOtp_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Otp</column-name><column-value><![CDATA[");
		sb.append(getOtp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
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
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _Otp_Id;
	private String _Otp;
	private int _ContactId;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private BaseModel<?> _qrcTrnOtpRemoteModel;
}