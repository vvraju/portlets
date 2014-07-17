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
import com.ifli.rapid.service.PaymentMethodMasterLocalServiceUtil;

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
public class PaymentMethodMasterClp extends BaseModelImpl<PaymentMethodMaster>
	implements PaymentMethodMaster {
	public PaymentMethodMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentMethodMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentMethodMaster.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _PaymentMethodID;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPaymentMethodID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PaymentMethodID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentMethodID", getPaymentMethodID());
		attributes.put("PaymentMethodKey", getPaymentMethodKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PaymentMethodID = (String)attributes.get("PaymentMethodID");

		if (PaymentMethodID != null) {
			setPaymentMethodID(PaymentMethodID);
		}

		String PaymentMethodKey = (String)attributes.get("PaymentMethodKey");

		if (PaymentMethodKey != null) {
			setPaymentMethodKey(PaymentMethodKey);
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
	}

	@Override
	public String getPaymentMethodID() {
		return _PaymentMethodID;
	}

	@Override
	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentMethodID",
						String.class);

				method.invoke(_paymentMethodMasterRemoteModel, PaymentMethodID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentMethodKey() {
		return _PaymentMethodKey;
	}

	@Override
	public void setPaymentMethodKey(String PaymentMethodKey) {
		_PaymentMethodKey = PaymentMethodKey;

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentMethodKey",
						String.class);

				method.invoke(_paymentMethodMasterRemoteModel, PaymentMethodKey);
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

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", boolean.class);

				method.invoke(_paymentMethodMasterRemoteModel, IsActive);
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

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentMethodMasterRemoteModel, CreatedBy);
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

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentMethodMasterRemoteModel, CreatedDate);
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

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentMethodMasterRemoteModel, ModifiedBy);
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

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentMethodMasterRemoteModel, ModifiedDate);
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

		if (_paymentMethodMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", int.class);

				method.invoke(_paymentMethodMasterRemoteModel, Priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentMethodMasterRemoteModel() {
		return _paymentMethodMasterRemoteModel;
	}

	public void setPaymentMethodMasterRemoteModel(
		BaseModel<?> paymentMethodMasterRemoteModel) {
		_paymentMethodMasterRemoteModel = paymentMethodMasterRemoteModel;
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

		Class<?> remoteModelClass = _paymentMethodMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentMethodMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentMethodMasterLocalServiceUtil.addPaymentMethodMaster(this);
		}
		else {
			PaymentMethodMasterLocalServiceUtil.updatePaymentMethodMaster(this);
		}
	}

	@Override
	public PaymentMethodMaster toEscapedModel() {
		return (PaymentMethodMaster)ProxyUtil.newProxyInstance(PaymentMethodMaster.class.getClassLoader(),
			new Class[] { PaymentMethodMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentMethodMasterClp clone = new PaymentMethodMasterClp();

		clone.setPaymentMethodID(getPaymentMethodID());
		clone.setPaymentMethodKey(getPaymentMethodKey());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setPriority(getPriority());

		return clone;
	}

	@Override
	public int compareTo(PaymentMethodMaster paymentMethodMaster) {
		int value = 0;

		if (getPriority() < paymentMethodMaster.getPriority()) {
			value = -1;
		}
		else if (getPriority() > paymentMethodMaster.getPriority()) {
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

		if (!(obj instanceof PaymentMethodMasterClp)) {
			return false;
		}

		PaymentMethodMasterClp paymentMethodMaster = (PaymentMethodMasterClp)obj;

		String primaryKey = paymentMethodMaster.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{PaymentMethodID=");
		sb.append(getPaymentMethodID());
		sb.append(", PaymentMethodKey=");
		sb.append(getPaymentMethodKey());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentMethodMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PaymentMethodID</column-name><column-value><![CDATA[");
		sb.append(getPaymentMethodID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentMethodKey</column-name><column-value><![CDATA[");
		sb.append(getPaymentMethodKey());
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

		sb.append("</model>");

		return sb.toString();
	}

	private String _PaymentMethodID;
	private String _PaymentMethodKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private BaseModel<?> _paymentMethodMasterRemoteModel;
}