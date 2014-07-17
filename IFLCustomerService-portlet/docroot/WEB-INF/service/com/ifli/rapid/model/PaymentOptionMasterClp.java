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
import com.ifli.rapid.service.PaymentOptionMasterLocalServiceUtil;

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
public class PaymentOptionMasterClp extends BaseModelImpl<PaymentOptionMaster>
	implements PaymentOptionMaster {
	public PaymentOptionMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentOptionMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentOptionMaster.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _PaymentOptionId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPaymentOptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PaymentOptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentOptionId", getPaymentOptionId());
		attributes.put("PaymentOptionKey", getPaymentOptionKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());
		attributes.put("PaymentOptionDesc", getPaymentOptionDesc());
		attributes.put("isProcessPayment", getIsProcessPayment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PaymentOptionId = (String)attributes.get("PaymentOptionId");

		if (PaymentOptionId != null) {
			setPaymentOptionId(PaymentOptionId);
		}

		String PaymentOptionKey = (String)attributes.get("PaymentOptionKey");

		if (PaymentOptionKey != null) {
			setPaymentOptionKey(PaymentOptionKey);
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

		Integer Priority = (Integer)attributes.get("Priority");

		if (Priority != null) {
			setPriority(Priority);
		}

		String PaymentOptionDesc = (String)attributes.get("PaymentOptionDesc");

		if (PaymentOptionDesc != null) {
			setPaymentOptionDesc(PaymentOptionDesc);
		}

		Boolean isProcessPayment = (Boolean)attributes.get("isProcessPayment");

		if (isProcessPayment != null) {
			setIsProcessPayment(isProcessPayment);
		}
	}

	@Override
	public String getPaymentOptionId() {
		return _PaymentOptionId;
	}

	@Override
	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionId",
						String.class);

				method.invoke(_paymentOptionMasterRemoteModel, PaymentOptionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentOptionKey() {
		return _PaymentOptionKey;
	}

	@Override
	public void setPaymentOptionKey(String PaymentOptionKey) {
		_PaymentOptionKey = PaymentOptionKey;

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionKey",
						String.class);

				method.invoke(_paymentOptionMasterRemoteModel, PaymentOptionKey);
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

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", boolean.class);

				method.invoke(_paymentOptionMasterRemoteModel, IsActive);
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

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentOptionMasterRemoteModel, CreatedBy);
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

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentOptionMasterRemoteModel, CreatedDate);
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

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentOptionMasterRemoteModel, ModifiedBy);
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

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentOptionMasterRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPriority() {
		return _Priority;
	}

	@Override
	public void setPriority(int Priority) {
		_Priority = Priority;

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", int.class);

				method.invoke(_paymentOptionMasterRemoteModel, Priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentOptionDesc() {
		return _PaymentOptionDesc;
	}

	@Override
	public void setPaymentOptionDesc(String PaymentOptionDesc) {
		_PaymentOptionDesc = PaymentOptionDesc;

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionDesc",
						String.class);

				method.invoke(_paymentOptionMasterRemoteModel, PaymentOptionDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsProcessPayment() {
		return _isProcessPayment;
	}

	@Override
	public boolean isIsProcessPayment() {
		return _isProcessPayment;
	}

	@Override
	public void setIsProcessPayment(boolean isProcessPayment) {
		_isProcessPayment = isProcessPayment;

		if (_paymentOptionMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsProcessPayment",
						boolean.class);

				method.invoke(_paymentOptionMasterRemoteModel, isProcessPayment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentOptionMasterRemoteModel() {
		return _paymentOptionMasterRemoteModel;
	}

	public void setPaymentOptionMasterRemoteModel(
		BaseModel<?> paymentOptionMasterRemoteModel) {
		_paymentOptionMasterRemoteModel = paymentOptionMasterRemoteModel;
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

		Class<?> remoteModelClass = _paymentOptionMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentOptionMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentOptionMasterLocalServiceUtil.addPaymentOptionMaster(this);
		}
		else {
			PaymentOptionMasterLocalServiceUtil.updatePaymentOptionMaster(this);
		}
	}

	@Override
	public PaymentOptionMaster toEscapedModel() {
		return (PaymentOptionMaster)ProxyUtil.newProxyInstance(PaymentOptionMaster.class.getClassLoader(),
			new Class[] { PaymentOptionMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentOptionMasterClp clone = new PaymentOptionMasterClp();

		clone.setPaymentOptionId(getPaymentOptionId());
		clone.setPaymentOptionKey(getPaymentOptionKey());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setPriority(getPriority());
		clone.setPaymentOptionDesc(getPaymentOptionDesc());
		clone.setIsProcessPayment(getIsProcessPayment());

		return clone;
	}

	@Override
	public int compareTo(PaymentOptionMaster paymentOptionMaster) {
		int value = 0;

		if (getPriority() < paymentOptionMaster.getPriority()) {
			value = -1;
		}
		else if (getPriority() > paymentOptionMaster.getPriority()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentOptionMasterClp)) {
			return false;
		}

		PaymentOptionMasterClp paymentOptionMaster = (PaymentOptionMasterClp)obj;

		String primaryKey = paymentOptionMaster.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{PaymentOptionId=");
		sb.append(getPaymentOptionId());
		sb.append(", PaymentOptionKey=");
		sb.append(getPaymentOptionKey());
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
		sb.append(", Priority=");
		sb.append(getPriority());
		sb.append(", PaymentOptionDesc=");
		sb.append(getPaymentOptionDesc());
		sb.append(", isProcessPayment=");
		sb.append(getIsProcessPayment());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentOptionMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PaymentOptionId</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentOptionKey</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionKey());
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
		sb.append(
			"<column><column-name>Priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentOptionDesc</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isProcessPayment</column-name><column-value><![CDATA[");
		sb.append(getIsProcessPayment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _PaymentOptionId;
	private String _PaymentOptionKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private String _PaymentOptionDesc;
	private boolean _isProcessPayment;
	private BaseModel<?> _paymentOptionMasterRemoteModel;
}