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
import com.ifli.rapid.service.PaymentGatewayMasterLocalServiceUtil;

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
public class PaymentGatewayMasterClp extends BaseModelImpl<PaymentGatewayMaster>
	implements PaymentGatewayMaster {
	public PaymentGatewayMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentGatewayMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentGatewayMaster.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _GatewayID;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setGatewayID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _GatewayID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("GatewayID", getGatewayID());
		attributes.put("GatewayDescription", getGatewayDescription());
		attributes.put("GatewayKey", getGatewayKey());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("Priority", getPriority());
		attributes.put("ItemCode", getItemCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String GatewayID = (String)attributes.get("GatewayID");

		if (GatewayID != null) {
			setGatewayID(GatewayID);
		}

		String GatewayDescription = (String)attributes.get("GatewayDescription");

		if (GatewayDescription != null) {
			setGatewayDescription(GatewayDescription);
		}

		String GatewayKey = (String)attributes.get("GatewayKey");

		if (GatewayKey != null) {
			setGatewayKey(GatewayKey);
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

		String ItemCode = (String)attributes.get("ItemCode");

		if (ItemCode != null) {
			setItemCode(ItemCode);
		}
	}

	@Override
	public String getGatewayID() {
		return _GatewayID;
	}

	@Override
	public void setGatewayID(String GatewayID) {
		_GatewayID = GatewayID;

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setGatewayID", String.class);

				method.invoke(_paymentGatewayMasterRemoteModel, GatewayID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGatewayDescription() {
		return _GatewayDescription;
	}

	@Override
	public void setGatewayDescription(String GatewayDescription) {
		_GatewayDescription = GatewayDescription;

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setGatewayDescription",
						String.class);

				method.invoke(_paymentGatewayMasterRemoteModel,
					GatewayDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGatewayKey() {
		return _GatewayKey;
	}

	@Override
	public void setGatewayKey(String GatewayKey) {
		_GatewayKey = GatewayKey;

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setGatewayKey", String.class);

				method.invoke(_paymentGatewayMasterRemoteModel, GatewayKey);
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

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", boolean.class);

				method.invoke(_paymentGatewayMasterRemoteModel, IsActive);
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

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentGatewayMasterRemoteModel, CreatedBy);
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

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentGatewayMasterRemoteModel, CreatedDate);
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

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentGatewayMasterRemoteModel, ModifiedBy);
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

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentGatewayMasterRemoteModel, ModifiedDate);
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

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", int.class);

				method.invoke(_paymentGatewayMasterRemoteModel, Priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getItemCode() {
		return _ItemCode;
	}

	@Override
	public void setItemCode(String ItemCode) {
		_ItemCode = ItemCode;

		if (_paymentGatewayMasterRemoteModel != null) {
			try {
				Class<?> clazz = _paymentGatewayMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setItemCode", String.class);

				method.invoke(_paymentGatewayMasterRemoteModel, ItemCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentGatewayMasterRemoteModel() {
		return _paymentGatewayMasterRemoteModel;
	}

	public void setPaymentGatewayMasterRemoteModel(
		BaseModel<?> paymentGatewayMasterRemoteModel) {
		_paymentGatewayMasterRemoteModel = paymentGatewayMasterRemoteModel;
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

		Class<?> remoteModelClass = _paymentGatewayMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentGatewayMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentGatewayMasterLocalServiceUtil.addPaymentGatewayMaster(this);
		}
		else {
			PaymentGatewayMasterLocalServiceUtil.updatePaymentGatewayMaster(this);
		}
	}

	@Override
	public PaymentGatewayMaster toEscapedModel() {
		return (PaymentGatewayMaster)ProxyUtil.newProxyInstance(PaymentGatewayMaster.class.getClassLoader(),
			new Class[] { PaymentGatewayMaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentGatewayMasterClp clone = new PaymentGatewayMasterClp();

		clone.setGatewayID(getGatewayID());
		clone.setGatewayDescription(getGatewayDescription());
		clone.setGatewayKey(getGatewayKey());
		clone.setIsActive(getIsActive());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setPriority(getPriority());
		clone.setItemCode(getItemCode());

		return clone;
	}

	@Override
	public int compareTo(PaymentGatewayMaster paymentGatewayMaster) {
		int value = 0;

		if (getPriority() < paymentGatewayMaster.getPriority()) {
			value = -1;
		}
		else if (getPriority() > paymentGatewayMaster.getPriority()) {
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

		if (!(obj instanceof PaymentGatewayMasterClp)) {
			return false;
		}

		PaymentGatewayMasterClp paymentGatewayMaster = (PaymentGatewayMasterClp)obj;

		String primaryKey = paymentGatewayMaster.getPrimaryKey();

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

		sb.append("{GatewayID=");
		sb.append(getGatewayID());
		sb.append(", GatewayDescription=");
		sb.append(getGatewayDescription());
		sb.append(", GatewayKey=");
		sb.append(getGatewayKey());
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
		sb.append(", ItemCode=");
		sb.append(getItemCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentGatewayMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>GatewayID</column-name><column-value><![CDATA[");
		sb.append(getGatewayID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GatewayDescription</column-name><column-value><![CDATA[");
		sb.append(getGatewayDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GatewayKey</column-name><column-value><![CDATA[");
		sb.append(getGatewayKey());
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
			"<column><column-name>ItemCode</column-name><column-value><![CDATA[");
		sb.append(getItemCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _GatewayID;
	private String _GatewayDescription;
	private String _GatewayKey;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private String _ItemCode;
	private BaseModel<?> _paymentGatewayMasterRemoteModel;
}