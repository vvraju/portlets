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

package com.ifl.rapid.customer.model.impl;

import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;
import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddressModel;

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
 * The base model implementation for the CRM_Trn_PolicyAddress service. Represents a row in the &quot;CRM_Trn_PolicyAddress&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.CRM_Trn_PolicyAddressModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CRM_Trn_PolicyAddressImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddressImpl
 * @see com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress
 * @see com.ifl.rapid.customer.model.CRM_Trn_PolicyAddressModel
 * @generated
 */
public class CRM_Trn_PolicyAddressModelImpl extends BaseModelImpl<CRM_Trn_PolicyAddress>
	implements CRM_Trn_PolicyAddressModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c r m_ trn_ policy address model instance should use the {@link com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress} interface instead.
	 */
	public static final String TABLE_NAME = "CRM_Trn_PolicyAddress";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PolicyAddressId", Types.INTEGER },
			{ "ContactId", Types.INTEGER },
			{ "PolicyNo", Types.VARCHAR },
			{ "AddressId", Types.INTEGER },
			{ "IsActive", Types.VARCHAR },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table CRM_Trn_PolicyAddress (PolicyAddressId INTEGER not null primary key,ContactId INTEGER,PolicyNo VARCHAR(75) null,AddressId INTEGER,IsActive VARCHAR(75) null,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table CRM_Trn_PolicyAddress";
	public static final String ORDER_BY_JPQL = " ORDER BY crm_Trn_PolicyAddress.PolicyAddressId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CRM_Trn_PolicyAddress.PolicyAddressId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress"),
			true);
	public static long POLICYNO_COLUMN_BITMASK = 1L;
	public static long POLICYADDRESSID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress"));

	public CRM_Trn_PolicyAddressModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _PolicyAddressId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPolicyAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PolicyAddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_PolicyAddress.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_PolicyAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PolicyAddressId", getPolicyAddressId());
		attributes.put("ContactId", getContactId());
		attributes.put("PolicyNo", getPolicyNo());
		attributes.put("AddressId", getAddressId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PolicyAddressId = (Integer)attributes.get("PolicyAddressId");

		if (PolicyAddressId != null) {
			setPolicyAddressId(PolicyAddressId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		String PolicyNo = (String)attributes.get("PolicyNo");

		if (PolicyNo != null) {
			setPolicyNo(PolicyNo);
		}

		Integer AddressId = (Integer)attributes.get("AddressId");

		if (AddressId != null) {
			setAddressId(AddressId);
		}

		String IsActive = (String)attributes.get("IsActive");

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
	public int getPolicyAddressId() {
		return _PolicyAddressId;
	}

	@Override
	public void setPolicyAddressId(int PolicyAddressId) {
		_PolicyAddressId = PolicyAddressId;
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	@Override
	public String getPolicyNo() {
		if (_PolicyNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _PolicyNo;
		}
	}

	@Override
	public void setPolicyNo(String PolicyNo) {
		_columnBitmask |= POLICYNO_COLUMN_BITMASK;

		if (_originalPolicyNo == null) {
			_originalPolicyNo = _PolicyNo;
		}

		_PolicyNo = PolicyNo;
	}

	public String getOriginalPolicyNo() {
		return GetterUtil.getString(_originalPolicyNo);
	}

	@Override
	public int getAddressId() {
		return _AddressId;
	}

	@Override
	public void setAddressId(int AddressId) {
		_AddressId = AddressId;
	}

	@Override
	public String getIsActive() {
		if (_IsActive == null) {
			return StringPool.BLANK;
		}
		else {
			return _IsActive;
		}
	}

	@Override
	public void setIsActive(String IsActive) {
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public CRM_Trn_PolicyAddress toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CRM_Trn_PolicyAddress)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CRM_Trn_PolicyAddressImpl crm_Trn_PolicyAddressImpl = new CRM_Trn_PolicyAddressImpl();

		crm_Trn_PolicyAddressImpl.setPolicyAddressId(getPolicyAddressId());
		crm_Trn_PolicyAddressImpl.setContactId(getContactId());
		crm_Trn_PolicyAddressImpl.setPolicyNo(getPolicyNo());
		crm_Trn_PolicyAddressImpl.setAddressId(getAddressId());
		crm_Trn_PolicyAddressImpl.setIsActive(getIsActive());
		crm_Trn_PolicyAddressImpl.setCreatedBy(getCreatedBy());
		crm_Trn_PolicyAddressImpl.setCreatedDate(getCreatedDate());
		crm_Trn_PolicyAddressImpl.setModifiedBy(getModifiedBy());
		crm_Trn_PolicyAddressImpl.setModifiedDate(getModifiedDate());

		crm_Trn_PolicyAddressImpl.resetOriginalValues();

		return crm_Trn_PolicyAddressImpl;
	}

	@Override
	public int compareTo(CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		int primaryKey = crm_Trn_PolicyAddress.getPrimaryKey();

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

		if (!(obj instanceof CRM_Trn_PolicyAddress)) {
			return false;
		}

		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddress)obj;

		int primaryKey = crm_Trn_PolicyAddress.getPrimaryKey();

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
	public void resetOriginalValues() {
		CRM_Trn_PolicyAddressModelImpl crm_Trn_PolicyAddressModelImpl = this;

		crm_Trn_PolicyAddressModelImpl._originalPolicyNo = crm_Trn_PolicyAddressModelImpl._PolicyNo;

		crm_Trn_PolicyAddressModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CRM_Trn_PolicyAddress> toCacheModel() {
		CRM_Trn_PolicyAddressCacheModel crm_Trn_PolicyAddressCacheModel = new CRM_Trn_PolicyAddressCacheModel();

		crm_Trn_PolicyAddressCacheModel.PolicyAddressId = getPolicyAddressId();

		crm_Trn_PolicyAddressCacheModel.ContactId = getContactId();

		crm_Trn_PolicyAddressCacheModel.PolicyNo = getPolicyNo();

		String PolicyNo = crm_Trn_PolicyAddressCacheModel.PolicyNo;

		if ((PolicyNo != null) && (PolicyNo.length() == 0)) {
			crm_Trn_PolicyAddressCacheModel.PolicyNo = null;
		}

		crm_Trn_PolicyAddressCacheModel.AddressId = getAddressId();

		crm_Trn_PolicyAddressCacheModel.IsActive = getIsActive();

		String IsActive = crm_Trn_PolicyAddressCacheModel.IsActive;

		if ((IsActive != null) && (IsActive.length() == 0)) {
			crm_Trn_PolicyAddressCacheModel.IsActive = null;
		}

		crm_Trn_PolicyAddressCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = crm_Trn_PolicyAddressCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			crm_Trn_PolicyAddressCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			crm_Trn_PolicyAddressCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			crm_Trn_PolicyAddressCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		crm_Trn_PolicyAddressCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = crm_Trn_PolicyAddressCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			crm_Trn_PolicyAddressCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			crm_Trn_PolicyAddressCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			crm_Trn_PolicyAddressCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		return crm_Trn_PolicyAddressCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{PolicyAddressId=");
		sb.append(getPolicyAddressId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", PolicyNo=");
		sb.append(getPolicyNo());
		sb.append(", AddressId=");
		sb.append(getAddressId());
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
		sb.append("com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PolicyAddressId</column-name><column-value><![CDATA[");
		sb.append(getPolicyAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PolicyNo</column-name><column-value><![CDATA[");
		sb.append(getPolicyNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
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

	private static ClassLoader _classLoader = CRM_Trn_PolicyAddress.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CRM_Trn_PolicyAddress.class
		};
	private int _PolicyAddressId;
	private int _ContactId;
	private String _PolicyNo;
	private String _originalPolicyNo;
	private int _AddressId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private long _columnBitmask;
	private CRM_Trn_PolicyAddress _escapedModel;
}