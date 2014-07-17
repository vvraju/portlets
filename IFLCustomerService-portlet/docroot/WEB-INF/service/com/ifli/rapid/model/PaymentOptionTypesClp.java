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
import com.ifli.rapid.service.PaymentOptionTypesLocalServiceUtil;

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
public class PaymentOptionTypesClp extends BaseModelImpl<PaymentOptionTypes>
	implements PaymentOptionTypes {
	public PaymentOptionTypesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentOptionTypes.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentOptionTypes.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _PaymentOptionTypesId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPaymentOptionTypesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PaymentOptionTypesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentOptionTypesId", getPaymentOptionTypesId());
		attributes.put("PaymentOptionId", getPaymentOptionId());
		attributes.put("OptionTypesKey", getOptionTypesKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());
		attributes.put("PaymentOptionTypeDesc", getPaymentOptionTypeDesc());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String PaymentOptionTypesId = (String)attributes.get(
				"PaymentOptionTypesId");

		if (PaymentOptionTypesId != null) {
			setPaymentOptionTypesId(PaymentOptionTypesId);
		}

		String PaymentOptionId = (String)attributes.get("PaymentOptionId");

		if (PaymentOptionId != null) {
			setPaymentOptionId(PaymentOptionId);
		}

		String OptionTypesKey = (String)attributes.get("OptionTypesKey");

		if (OptionTypesKey != null) {
			setOptionTypesKey(OptionTypesKey);
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

		String PaymentOptionTypeDesc = (String)attributes.get(
				"PaymentOptionTypeDesc");

		if (PaymentOptionTypeDesc != null) {
			setPaymentOptionTypeDesc(PaymentOptionTypeDesc);
		}
	}

	@Override
	public String getPaymentOptionTypesId() {
		return _PaymentOptionTypesId;
	}

	@Override
	public void setPaymentOptionTypesId(String PaymentOptionTypesId) {
		_PaymentOptionTypesId = PaymentOptionTypesId;

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionTypesId",
						String.class);

				method.invoke(_paymentOptionTypesRemoteModel,
					PaymentOptionTypesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentOptionId() {
		return _PaymentOptionId;
	}

	@Override
	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionId",
						String.class);

				method.invoke(_paymentOptionTypesRemoteModel, PaymentOptionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOptionTypesKey() {
		return _OptionTypesKey;
	}

	@Override
	public void setOptionTypesKey(String OptionTypesKey) {
		_OptionTypesKey = OptionTypesKey;

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setOptionTypesKey",
						String.class);

				method.invoke(_paymentOptionTypesRemoteModel, OptionTypesKey);
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

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", boolean.class);

				method.invoke(_paymentOptionTypesRemoteModel, IsActive);
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

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentOptionTypesRemoteModel, CreatedBy);
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

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentOptionTypesRemoteModel, CreatedDate);
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

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentOptionTypesRemoteModel, ModifiedBy);
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

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentOptionTypesRemoteModel, ModifiedDate);
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

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", int.class);

				method.invoke(_paymentOptionTypesRemoteModel, Priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentOptionTypeDesc() {
		return _PaymentOptionTypeDesc;
	}

	@Override
	public void setPaymentOptionTypeDesc(String PaymentOptionTypeDesc) {
		_PaymentOptionTypeDesc = PaymentOptionTypeDesc;

		if (_paymentOptionTypesRemoteModel != null) {
			try {
				Class<?> clazz = _paymentOptionTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionTypeDesc",
						String.class);

				method.invoke(_paymentOptionTypesRemoteModel,
					PaymentOptionTypeDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentOptionTypesRemoteModel() {
		return _paymentOptionTypesRemoteModel;
	}

	public void setPaymentOptionTypesRemoteModel(
		BaseModel<?> paymentOptionTypesRemoteModel) {
		_paymentOptionTypesRemoteModel = paymentOptionTypesRemoteModel;
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

		Class<?> remoteModelClass = _paymentOptionTypesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentOptionTypesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentOptionTypesLocalServiceUtil.addPaymentOptionTypes(this);
		}
		else {
			PaymentOptionTypesLocalServiceUtil.updatePaymentOptionTypes(this);
		}
	}

	@Override
	public PaymentOptionTypes toEscapedModel() {
		return (PaymentOptionTypes)ProxyUtil.newProxyInstance(PaymentOptionTypes.class.getClassLoader(),
			new Class[] { PaymentOptionTypes.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentOptionTypesClp clone = new PaymentOptionTypesClp();

		clone.setPaymentOptionTypesId(getPaymentOptionTypesId());
		clone.setPaymentOptionId(getPaymentOptionId());
		clone.setOptionTypesKey(getOptionTypesKey());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setPriority(getPriority());
		clone.setPaymentOptionTypeDesc(getPaymentOptionTypeDesc());

		return clone;
	}

	@Override
	public int compareTo(PaymentOptionTypes paymentOptionTypes) {
		int value = 0;

		if (getPriority() < paymentOptionTypes.getPriority()) {
			value = -1;
		}
		else if (getPriority() > paymentOptionTypes.getPriority()) {
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

		if (!(obj instanceof PaymentOptionTypesClp)) {
			return false;
		}

		PaymentOptionTypesClp paymentOptionTypes = (PaymentOptionTypesClp)obj;

		String primaryKey = paymentOptionTypes.getPrimaryKey();

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

		sb.append("{PaymentOptionTypesId=");
		sb.append(getPaymentOptionTypesId());
		sb.append(", PaymentOptionId=");
		sb.append(getPaymentOptionId());
		sb.append(", OptionTypesKey=");
		sb.append(getOptionTypesKey());
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
		sb.append(", PaymentOptionTypeDesc=");
		sb.append(getPaymentOptionTypeDesc());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentOptionTypes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PaymentOptionTypesId</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionTypesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentOptionId</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OptionTypesKey</column-name><column-value><![CDATA[");
		sb.append(getOptionTypesKey());
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
			"<column><column-name>PaymentOptionTypeDesc</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionTypeDesc());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _PaymentOptionTypesId;
	private String _PaymentOptionId;
	private String _OptionTypesKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private String _PaymentOptionTypeDesc;
	private BaseModel<?> _paymentOptionTypesRemoteModel;
}