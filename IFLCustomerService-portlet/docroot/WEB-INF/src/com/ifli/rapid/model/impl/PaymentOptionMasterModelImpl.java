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

package com.ifli.rapid.model.impl;

import com.ifli.rapid.model.PaymentOptionMaster;
import com.ifli.rapid.model.PaymentOptionMasterModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PaymentOptionMaster service. Represents a row in the &quot;PaymentOptionMaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.PaymentOptionMasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentOptionMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionMasterImpl
 * @see com.ifli.rapid.model.PaymentOptionMaster
 * @see com.ifli.rapid.model.PaymentOptionMasterModel
 * @generated
 */
public class PaymentOptionMasterModelImpl extends BaseModelImpl<PaymentOptionMaster>
	implements PaymentOptionMasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a payment option master model instance should use the {@link com.ifli.rapid.model.PaymentOptionMaster} interface instead.
	 */
	public static final String TABLE_NAME = "PaymentOptionMaster";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PaymentOptionId", Types.VARCHAR },
			{ "PaymentOptionKey", Types.VARCHAR },
			{ "IsActive", Types.BOOLEAN },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "Priority", Types.INTEGER },
			{ "PaymentOptionDesc", Types.VARCHAR },
			{ "isProcessPayment", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table PaymentOptionMaster (PaymentOptionId VARCHAR(75) not null primary key IDENTITY,PaymentOptionKey VARCHAR(75) null,IsActive BOOLEAN,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null,Priority INTEGER,PaymentOptionDesc VARCHAR(75) null,isProcessPayment BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table PaymentOptionMaster";
	public static final String ORDER_BY_JPQL = " ORDER BY paymentOptionMaster.Priority ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PaymentOptionMaster.Priority ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.PaymentOptionMaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.PaymentOptionMaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.PaymentOptionMaster"));

	public PaymentOptionMasterModelImpl() {
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
	public Class<?> getModelClass() {
		return PaymentOptionMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentOptionMaster.class.getName();
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
		if (_PaymentOptionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _PaymentOptionId;
		}
	}

	@Override
	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;
	}

	@Override
	public String getPaymentOptionKey() {
		if (_PaymentOptionKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _PaymentOptionKey;
		}
	}

	@Override
	public void setPaymentOptionKey(String PaymentOptionKey) {
		_PaymentOptionKey = PaymentOptionKey;
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
	}

	@Override
	public String getCreatedBy() {
		if (_CreatedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _CreatedBy;
		}
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	@Override
	public String getModifiedBy() {
		if (_ModifiedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _ModifiedBy;
		}
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	@Override
	public int getPriority() {
		return _Priority;
	}

	@Override
	public void setPriority(int Priority) {
		_Priority = Priority;
	}

	@Override
	public String getPaymentOptionDesc() {
		if (_PaymentOptionDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _PaymentOptionDesc;
		}
	}

	@Override
	public void setPaymentOptionDesc(String PaymentOptionDesc) {
		_PaymentOptionDesc = PaymentOptionDesc;
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
	}

	@Override
	public PaymentOptionMaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PaymentOptionMaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PaymentOptionMasterImpl paymentOptionMasterImpl = new PaymentOptionMasterImpl();

		paymentOptionMasterImpl.setPaymentOptionId(getPaymentOptionId());
		paymentOptionMasterImpl.setPaymentOptionKey(getPaymentOptionKey());
		paymentOptionMasterImpl.setIsActive(getIsActive());
		paymentOptionMasterImpl.setCreatedBy(getCreatedBy());
		paymentOptionMasterImpl.setCreatedDate(getCreatedDate());
		paymentOptionMasterImpl.setModifiedBy(getModifiedBy());
		paymentOptionMasterImpl.setModifiedDate(getModifiedDate());
		paymentOptionMasterImpl.setPriority(getPriority());
		paymentOptionMasterImpl.setPaymentOptionDesc(getPaymentOptionDesc());
		paymentOptionMasterImpl.setIsProcessPayment(getIsProcessPayment());

		paymentOptionMasterImpl.resetOriginalValues();

		return paymentOptionMasterImpl;
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

		if (!(obj instanceof PaymentOptionMaster)) {
			return false;
		}

		PaymentOptionMaster paymentOptionMaster = (PaymentOptionMaster)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<PaymentOptionMaster> toCacheModel() {
		PaymentOptionMasterCacheModel paymentOptionMasterCacheModel = new PaymentOptionMasterCacheModel();

		paymentOptionMasterCacheModel.PaymentOptionId = getPaymentOptionId();

		String PaymentOptionId = paymentOptionMasterCacheModel.PaymentOptionId;

		if ((PaymentOptionId != null) && (PaymentOptionId.length() == 0)) {
			paymentOptionMasterCacheModel.PaymentOptionId = null;
		}

		paymentOptionMasterCacheModel.PaymentOptionKey = getPaymentOptionKey();

		String PaymentOptionKey = paymentOptionMasterCacheModel.PaymentOptionKey;

		if ((PaymentOptionKey != null) && (PaymentOptionKey.length() == 0)) {
			paymentOptionMasterCacheModel.PaymentOptionKey = null;
		}

		paymentOptionMasterCacheModel.IsActive = getIsActive();

		paymentOptionMasterCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = paymentOptionMasterCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			paymentOptionMasterCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			paymentOptionMasterCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			paymentOptionMasterCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		paymentOptionMasterCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = paymentOptionMasterCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			paymentOptionMasterCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			paymentOptionMasterCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			paymentOptionMasterCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		paymentOptionMasterCacheModel.Priority = getPriority();

		paymentOptionMasterCacheModel.PaymentOptionDesc = getPaymentOptionDesc();

		String PaymentOptionDesc = paymentOptionMasterCacheModel.PaymentOptionDesc;

		if ((PaymentOptionDesc != null) && (PaymentOptionDesc.length() == 0)) {
			paymentOptionMasterCacheModel.PaymentOptionDesc = null;
		}

		paymentOptionMasterCacheModel.isProcessPayment = getIsProcessPayment();

		return paymentOptionMasterCacheModel;
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

	private static ClassLoader _classLoader = PaymentOptionMaster.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			PaymentOptionMaster.class
		};
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
	private PaymentOptionMaster _escapedModel;
}