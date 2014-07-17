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
import com.ifli.rapid.service.PaymentMethodTypeLocalServiceUtil;

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
public class PaymentMethodTypeClp extends BaseModelImpl<PaymentMethodType>
	implements PaymentMethodType {
	public PaymentMethodTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentMethodType.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentMethodType.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("PaymentMethodID", getPaymentMethodID());
		attributes.put("GatewayID", getGatewayID());
		attributes.put("TypeKey", getTypeKey());
		attributes.put("Description", getDescription());
		attributes.put("BankId", getBankId());
		attributes.put("Active", getActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Id = (String)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String PaymentMethodID = (String)attributes.get("PaymentMethodID");

		if (PaymentMethodID != null) {
			setPaymentMethodID(PaymentMethodID);
		}

		String GatewayID = (String)attributes.get("GatewayID");

		if (GatewayID != null) {
			setGatewayID(GatewayID);
		}

		String TypeKey = (String)attributes.get("TypeKey");

		if (TypeKey != null) {
			setTypeKey(TypeKey);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String BankId = (String)attributes.get("BankId");

		if (BankId != null) {
			setBankId(BankId);
		}

		Boolean Active = (Boolean)attributes.get("Active");

		if (Active != null) {
			setActive(Active);
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

		String Type = (String)attributes.get("Type");

		if (Type != null) {
			setType(Type);
		}
	}

	@Override
	public String getId() {
		return _Id;
	}

	@Override
	public void setId(String Id) {
		_Id = Id;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentMethodID() {
		return _PaymentMethodID;
	}

	@Override
	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentMethodID",
						String.class);

				method.invoke(_paymentMethodTypeRemoteModel, PaymentMethodID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGatewayID() {
		return _GatewayID;
	}

	@Override
	public void setGatewayID(String GatewayID) {
		_GatewayID = GatewayID;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setGatewayID", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, GatewayID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeKey() {
		return _TypeKey;
	}

	@Override
	public void setTypeKey(String TypeKey) {
		_TypeKey = TypeKey;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeKey", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, TypeKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _Description;
	}

	@Override
	public void setDescription(String Description) {
		_Description = Description;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankId() {
		return _BankId;
	}

	@Override
	public void setBankId(String BankId) {
		_BankId = BankId;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setBankId", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, BankId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getActive() {
		return _Active;
	}

	@Override
	public boolean isActive() {
		return _Active;
	}

	@Override
	public void setActive(boolean Active) {
		_Active = Active;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", boolean.class);

				method.invoke(_paymentMethodTypeRemoteModel, Active);
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

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, CreatedBy);
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

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentMethodTypeRemoteModel, CreatedDate);
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

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, ModifiedBy);
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

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentMethodTypeRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _Type;
	}

	@Override
	public void setType(String Type) {
		_Type = Type;

		if (_paymentMethodTypeRemoteModel != null) {
			try {
				Class<?> clazz = _paymentMethodTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_paymentMethodTypeRemoteModel, Type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentMethodTypeRemoteModel() {
		return _paymentMethodTypeRemoteModel;
	}

	public void setPaymentMethodTypeRemoteModel(
		BaseModel<?> paymentMethodTypeRemoteModel) {
		_paymentMethodTypeRemoteModel = paymentMethodTypeRemoteModel;
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

		Class<?> remoteModelClass = _paymentMethodTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentMethodTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentMethodTypeLocalServiceUtil.addPaymentMethodType(this);
		}
		else {
			PaymentMethodTypeLocalServiceUtil.updatePaymentMethodType(this);
		}
	}

	@Override
	public PaymentMethodType toEscapedModel() {
		return (PaymentMethodType)ProxyUtil.newProxyInstance(PaymentMethodType.class.getClassLoader(),
			new Class[] { PaymentMethodType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentMethodTypeClp clone = new PaymentMethodTypeClp();

		clone.setId(getId());
		clone.setPaymentMethodID(getPaymentMethodID());
		clone.setGatewayID(getGatewayID());
		clone.setTypeKey(getTypeKey());
		clone.setDescription(getDescription());
		clone.setBankId(getBankId());
		clone.setActive(getActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setType(getType());

		return clone;
	}

	@Override
	public int compareTo(PaymentMethodType paymentMethodType) {
		String primaryKey = paymentMethodType.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentMethodTypeClp)) {
			return false;
		}

		PaymentMethodTypeClp paymentMethodType = (PaymentMethodTypeClp)obj;

		String primaryKey = paymentMethodType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", PaymentMethodID=");
		sb.append(getPaymentMethodID());
		sb.append(", GatewayID=");
		sb.append(getGatewayID());
		sb.append(", TypeKey=");
		sb.append(getTypeKey());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", BankId=");
		sb.append(getBankId());
		sb.append(", Active=");
		sb.append(getActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", Type=");
		sb.append(getType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentMethodType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentMethodID</column-name><column-value><![CDATA[");
		sb.append(getPaymentMethodID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GatewayID</column-name><column-value><![CDATA[");
		sb.append(getGatewayID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TypeKey</column-name><column-value><![CDATA[");
		sb.append(getTypeKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BankId</column-name><column-value><![CDATA[");
		sb.append(getBankId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Active</column-name><column-value><![CDATA[");
		sb.append(getActive());
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
			"<column><column-name>Type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _Id;
	private String _PaymentMethodID;
	private String _GatewayID;
	private String _TypeKey;
	private String _Description;
	private String _BankId;
	private boolean _Active;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _Type;
	private BaseModel<?> _paymentMethodTypeRemoteModel;
}