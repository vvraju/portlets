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

import com.ifli.rapid.model.PaymentMethodType;
import com.ifli.rapid.model.PaymentMethodTypeModel;

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
 * The base model implementation for the PaymentMethodType service. Represents a row in the &quot;PaymentMethodType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.PaymentMethodTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentMethodTypeImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodTypeImpl
 * @see com.ifli.rapid.model.PaymentMethodType
 * @see com.ifli.rapid.model.PaymentMethodTypeModel
 * @generated
 */
public class PaymentMethodTypeModelImpl extends BaseModelImpl<PaymentMethodType>
	implements PaymentMethodTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a payment method type model instance should use the {@link com.ifli.rapid.model.PaymentMethodType} interface instead.
	 */
	public static final String TABLE_NAME = "PaymentMethodType";
	public static final Object[][] TABLE_COLUMNS = {
			{ "Id", Types.VARCHAR },
			{ "PaymentMethodID", Types.VARCHAR },
			{ "GatewayID", Types.VARCHAR },
			{ "TypeKey", Types.VARCHAR },
			{ "Description", Types.VARCHAR },
			{ "BankId", Types.VARCHAR },
			{ "Active", Types.BOOLEAN },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "Type", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table PaymentMethodType (Id VARCHAR(75) not null primary key IDENTITY,PaymentMethodID VARCHAR(75) null,GatewayID VARCHAR(75) null,TypeKey VARCHAR(75) null,Description VARCHAR(75) null,BankId VARCHAR(75) null,Active BOOLEAN,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null,Type VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table PaymentMethodType";
	public static final String ORDER_BY_JPQL = " ORDER BY paymentMethodType.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PaymentMethodType.Id ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.PaymentMethodType"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.PaymentMethodType"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.PaymentMethodType"));

	public PaymentMethodTypeModelImpl() {
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
	public Class<?> getModelClass() {
		return PaymentMethodType.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentMethodType.class.getName();
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
		if (_Id == null) {
			return StringPool.BLANK;
		}
		else {
			return _Id;
		}
	}

	@Override
	public void setId(String Id) {
		_Id = Id;
	}

	@Override
	public String getPaymentMethodID() {
		if (_PaymentMethodID == null) {
			return StringPool.BLANK;
		}
		else {
			return _PaymentMethodID;
		}
	}

	@Override
	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;
	}

	@Override
	public String getGatewayID() {
		if (_GatewayID == null) {
			return StringPool.BLANK;
		}
		else {
			return _GatewayID;
		}
	}

	@Override
	public void setGatewayID(String GatewayID) {
		_GatewayID = GatewayID;
	}

	@Override
	public String getTypeKey() {
		if (_TypeKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _TypeKey;
		}
	}

	@Override
	public void setTypeKey(String TypeKey) {
		_TypeKey = TypeKey;
	}

	@Override
	public String getDescription() {
		if (_Description == null) {
			return StringPool.BLANK;
		}
		else {
			return _Description;
		}
	}

	@Override
	public void setDescription(String Description) {
		_Description = Description;
	}

	@Override
	public String getBankId() {
		if (_BankId == null) {
			return StringPool.BLANK;
		}
		else {
			return _BankId;
		}
	}

	@Override
	public void setBankId(String BankId) {
		_BankId = BankId;
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
	public String getType() {
		if (_Type == null) {
			return StringPool.BLANK;
		}
		else {
			return _Type;
		}
	}

	@Override
	public void setType(String Type) {
		_Type = Type;
	}

	@Override
	public PaymentMethodType toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PaymentMethodType)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PaymentMethodTypeImpl paymentMethodTypeImpl = new PaymentMethodTypeImpl();

		paymentMethodTypeImpl.setId(getId());
		paymentMethodTypeImpl.setPaymentMethodID(getPaymentMethodID());
		paymentMethodTypeImpl.setGatewayID(getGatewayID());
		paymentMethodTypeImpl.setTypeKey(getTypeKey());
		paymentMethodTypeImpl.setDescription(getDescription());
		paymentMethodTypeImpl.setBankId(getBankId());
		paymentMethodTypeImpl.setActive(getActive());
		paymentMethodTypeImpl.setCreatedBy(getCreatedBy());
		paymentMethodTypeImpl.setCreatedDate(getCreatedDate());
		paymentMethodTypeImpl.setModifiedBy(getModifiedBy());
		paymentMethodTypeImpl.setModifiedDate(getModifiedDate());
		paymentMethodTypeImpl.setType(getType());

		paymentMethodTypeImpl.resetOriginalValues();

		return paymentMethodTypeImpl;
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

		if (!(obj instanceof PaymentMethodType)) {
			return false;
		}

		PaymentMethodType paymentMethodType = (PaymentMethodType)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<PaymentMethodType> toCacheModel() {
		PaymentMethodTypeCacheModel paymentMethodTypeCacheModel = new PaymentMethodTypeCacheModel();

		paymentMethodTypeCacheModel.Id = getId();

		String Id = paymentMethodTypeCacheModel.Id;

		if ((Id != null) && (Id.length() == 0)) {
			paymentMethodTypeCacheModel.Id = null;
		}

		paymentMethodTypeCacheModel.PaymentMethodID = getPaymentMethodID();

		String PaymentMethodID = paymentMethodTypeCacheModel.PaymentMethodID;

		if ((PaymentMethodID != null) && (PaymentMethodID.length() == 0)) {
			paymentMethodTypeCacheModel.PaymentMethodID = null;
		}

		paymentMethodTypeCacheModel.GatewayID = getGatewayID();

		String GatewayID = paymentMethodTypeCacheModel.GatewayID;

		if ((GatewayID != null) && (GatewayID.length() == 0)) {
			paymentMethodTypeCacheModel.GatewayID = null;
		}

		paymentMethodTypeCacheModel.TypeKey = getTypeKey();

		String TypeKey = paymentMethodTypeCacheModel.TypeKey;

		if ((TypeKey != null) && (TypeKey.length() == 0)) {
			paymentMethodTypeCacheModel.TypeKey = null;
		}

		paymentMethodTypeCacheModel.Description = getDescription();

		String Description = paymentMethodTypeCacheModel.Description;

		if ((Description != null) && (Description.length() == 0)) {
			paymentMethodTypeCacheModel.Description = null;
		}

		paymentMethodTypeCacheModel.BankId = getBankId();

		String BankId = paymentMethodTypeCacheModel.BankId;

		if ((BankId != null) && (BankId.length() == 0)) {
			paymentMethodTypeCacheModel.BankId = null;
		}

		paymentMethodTypeCacheModel.Active = getActive();

		paymentMethodTypeCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = paymentMethodTypeCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			paymentMethodTypeCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			paymentMethodTypeCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			paymentMethodTypeCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		paymentMethodTypeCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = paymentMethodTypeCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			paymentMethodTypeCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			paymentMethodTypeCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			paymentMethodTypeCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		paymentMethodTypeCacheModel.Type = getType();

		String Type = paymentMethodTypeCacheModel.Type;

		if ((Type != null) && (Type.length() == 0)) {
			paymentMethodTypeCacheModel.Type = null;
		}

		return paymentMethodTypeCacheModel;
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

	private static ClassLoader _classLoader = PaymentMethodType.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			PaymentMethodType.class
		};
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
	private PaymentMethodType _escapedModel;
}