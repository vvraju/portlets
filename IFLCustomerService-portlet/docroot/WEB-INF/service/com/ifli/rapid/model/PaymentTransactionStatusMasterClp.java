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
import com.ifli.rapid.service.PaymentTransactionStatusMasterLocalServiceUtil;

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
public class PaymentTransactionStatusMasterClp extends BaseModelImpl<PaymentTransactionStatusMaster>
	implements PaymentTransactionStatusMaster {
	public PaymentTransactionStatusMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentTransactionStatusMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentTransactionStatusMaster.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _TransactionStatusID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTransactionStatusID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _TransactionStatusID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TransactionStatusID", getTransactionStatusID());
		attributes.put("StatusCode", getStatusCode());
		attributes.put("StatusName", getStatusName());
		attributes.put("StatusDesc", getStatusDesc());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer TransactionStatusID = (Integer)attributes.get(
				"TransactionStatusID");

		if (TransactionStatusID != null) {
			setTransactionStatusID(TransactionStatusID);
		}

		Integer StatusCode = (Integer)attributes.get("StatusCode");

		if (StatusCode != null) {
			setStatusCode(StatusCode);
		}

		String StatusName = (String)attributes.get("StatusName");

		if (StatusName != null) {
			setStatusName(StatusName);
		}

		String StatusDesc = (String)attributes.get("StatusDesc");

		if (StatusDesc != null) {
			setStatusDesc(StatusDesc);
		}

		Boolean IsActive = (Boolean)attributes.get("IsActive");

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

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}
	}

	@Override
	public int getTransactionStatusID() {
		return _TransactionStatusID;
	}

	@Override
	public void setTransactionStatusID(int TransactionStatusID) {
		_TransactionStatusID = TransactionStatusID;

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setTransactionStatusID",
						int.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					TransactionStatusID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatusCode() {
		return _StatusCode;
	}

	@Override
	public void setStatusCode(int StatusCode) {
		_StatusCode = StatusCode;

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusCode", int.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					StatusCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusName() {
		return _StatusName;
	}

	@Override
	public void setStatusName(String StatusName) {
		_StatusName = StatusName;

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusName", String.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					StatusName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusDesc() {
		return _StatusDesc;
	}

	@Override
	public void setStatusDesc(String StatusDesc) {
		_StatusDesc = StatusDesc;

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDesc", String.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					StatusDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsActive() {
		return _IsActive;
	}

	@Override
	public boolean isIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(boolean IsActive) {
		_IsActive = IsActive;

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", boolean.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					IsActive);
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

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					CreatedBy);
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

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					CreatedDate);
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

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					ModifiedBy);
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

		if (_paymentTransactionStatusMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentTransactionStatusMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentTransactionStatusMasterRemoteModel,
					ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentTransactionStatusMasterRemoteModel() {
		return _paymentTransactionStatusMasterRemoteModel;
	}

	public void setPaymentTransactionStatusMasterRemoteModel(
		BaseModel<?> paymentTransactionStatusMasterRemoteModel) {
		_paymentTransactionStatusMasterRemoteModel = paymentTransactionStatusMasterRemoteModel;
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

		Class<?> remoteModelClass = _paymentTransactionStatusMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentTransactionStatusMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentTransactionStatusMasterLocalServiceUtil.addPaymentTransactionStatusMaster(this);
		}
		else {
			PaymentTransactionStatusMasterLocalServiceUtil.updatePaymentTransactionStatusMaster(this);
		}
	}

	@Override
	public PaymentTransactionStatusMaster toEscapedModel() {
		return (PaymentTransactionStatusMaster)ProxyUtil.newProxyInstance(PaymentTransactionStatusMaster.class.getClassLoader(),
			new Class[] { PaymentTransactionStatusMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentTransactionStatusMasterClp clone = new PaymentTransactionStatusMasterClp();

		clone.setTransactionStatusID(getTransactionStatusID());
		clone.setStatusCode(getStatusCode());
		clone.setStatusName(getStatusName());
		clone.setStatusDesc(getStatusDesc());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		int primaryKey = paymentTransactionStatusMaster.getPrimaryKey();

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

		if (!(obj instanceof PaymentTransactionStatusMasterClp)) {
			return false;
		}

		PaymentTransactionStatusMasterClp paymentTransactionStatusMaster = (PaymentTransactionStatusMasterClp)obj;

		int primaryKey = paymentTransactionStatusMaster.getPrimaryKey();

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

		sb.append("{TransactionStatusID=");
		sb.append(getTransactionStatusID());
		sb.append(", StatusCode=");
		sb.append(getStatusCode());
		sb.append(", StatusName=");
		sb.append(getStatusName());
		sb.append(", StatusDesc=");
		sb.append(getStatusDesc());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentTransactionStatusMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>TransactionStatusID</column-name><column-value><![CDATA[");
		sb.append(getTransactionStatusID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StatusCode</column-name><column-value><![CDATA[");
		sb.append(getStatusCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StatusName</column-name><column-value><![CDATA[");
		sb.append(getStatusName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StatusDesc</column-name><column-value><![CDATA[");
		sb.append(getStatusDesc());
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
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _TransactionStatusID;
	private int _StatusCode;
	private String _StatusName;
	private String _StatusDesc;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private BaseModel<?> _paymentTransactionStatusMasterRemoteModel;
}