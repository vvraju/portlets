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

import com.ifl.rapid.customer.model.CRM_Trn_Address;
import com.ifl.rapid.customer.model.CRM_Trn_AddressModel;

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
 * The base model implementation for the CRM_Trn_Address service. Represents a row in the &quot;CRM_Trn_Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.CRM_Trn_AddressModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CRM_Trn_AddressImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_AddressImpl
 * @see com.ifl.rapid.customer.model.CRM_Trn_Address
 * @see com.ifl.rapid.customer.model.CRM_Trn_AddressModel
 * @generated
 */
public class CRM_Trn_AddressModelImpl extends BaseModelImpl<CRM_Trn_Address>
	implements CRM_Trn_AddressModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c r m_ trn_ address model instance should use the {@link com.ifl.rapid.customer.model.CRM_Trn_Address} interface instead.
	 */
	public static final String TABLE_NAME = "CRM_Trn_Address";
	public static final Object[][] TABLE_COLUMNS = {
			{ "AddressId", Types.INTEGER },
			{ "ContactId", Types.INTEGER },
			{ "AddressTypeId", Types.INTEGER },
			{ "AddressLine1", Types.VARCHAR },
			{ "AddressLine2", Types.VARCHAR },
			{ "AddressLine3", Types.VARCHAR },
			{ "District", Types.VARCHAR },
			{ "StateId", Types.INTEGER },
			{ "CityId", Types.INTEGER },
			{ "Pincode", Types.VARCHAR },
			{ "CountryId", Types.INTEGER },
			{ "IsActive", Types.VARCHAR },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table CRM_Trn_Address (AddressId INTEGER not null primary key IDENTITY,ContactId INTEGER,AddressTypeId INTEGER,AddressLine1 VARCHAR(75) null,AddressLine2 VARCHAR(75) null,AddressLine3 VARCHAR(75) null,District VARCHAR(75) null,StateId INTEGER,CityId INTEGER,Pincode VARCHAR(75) null,CountryId INTEGER,IsActive VARCHAR(75) null,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table CRM_Trn_Address";
	public static final String ORDER_BY_JPQL = " ORDER BY crm_Trn_Address.AddressId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CRM_Trn_Address.AddressId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.CRM_Trn_Address"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.CRM_Trn_Address"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ifl.rapid.customer.model.CRM_Trn_Address"),
			true);
	public static long ADDRESSID_COLUMN_BITMASK = 1L;
	public static long ADDRESSTYPEID_COLUMN_BITMASK = 2L;
	public static long CONTACTID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.CRM_Trn_Address"));

	public CRM_Trn_AddressModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _AddressId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _AddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CRM_Trn_Address.class;
	}

	@Override
	public String getModelClassName() {
		return CRM_Trn_Address.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AddressId", getAddressId());
		attributes.put("ContactId", getContactId());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("AddressLine1", getAddressLine1());
		attributes.put("AddressLine2", getAddressLine2());
		attributes.put("AddressLine3", getAddressLine3());
		attributes.put("District", getDistrict());
		attributes.put("StateId", getStateId());
		attributes.put("CityId", getCityId());
		attributes.put("Pincode", getPincode());
		attributes.put("CountryId", getCountryId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer AddressId = (Integer)attributes.get("AddressId");

		if (AddressId != null) {
			setAddressId(AddressId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
		}

		String AddressLine1 = (String)attributes.get("AddressLine1");

		if (AddressLine1 != null) {
			setAddressLine1(AddressLine1);
		}

		String AddressLine2 = (String)attributes.get("AddressLine2");

		if (AddressLine2 != null) {
			setAddressLine2(AddressLine2);
		}

		String AddressLine3 = (String)attributes.get("AddressLine3");

		if (AddressLine3 != null) {
			setAddressLine3(AddressLine3);
		}

		String District = (String)attributes.get("District");

		if (District != null) {
			setDistrict(District);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}

		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		String Pincode = (String)attributes.get("Pincode");

		if (Pincode != null) {
			setPincode(Pincode);
		}

		Integer CountryId = (Integer)attributes.get("CountryId");

		if (CountryId != null) {
			setCountryId(CountryId);
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
	public int getAddressId() {
		return _AddressId;
	}

	@Override
	public void setAddressId(int AddressId) {
		_columnBitmask |= ADDRESSID_COLUMN_BITMASK;

		if (!_setOriginalAddressId) {
			_setOriginalAddressId = true;

			_originalAddressId = _AddressId;
		}

		_AddressId = AddressId;
	}

	public int getOriginalAddressId() {
		return _originalAddressId;
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_columnBitmask |= CONTACTID_COLUMN_BITMASK;

		if (!_setOriginalContactId) {
			_setOriginalContactId = true;

			_originalContactId = _ContactId;
		}

		_ContactId = ContactId;
	}

	public int getOriginalContactId() {
		return _originalContactId;
	}

	@Override
	public int getAddressTypeId() {
		return _AddressTypeId;
	}

	@Override
	public void setAddressTypeId(int AddressTypeId) {
		_columnBitmask |= ADDRESSTYPEID_COLUMN_BITMASK;

		if (!_setOriginalAddressTypeId) {
			_setOriginalAddressTypeId = true;

			_originalAddressTypeId = _AddressTypeId;
		}

		_AddressTypeId = AddressTypeId;
	}

	public int getOriginalAddressTypeId() {
		return _originalAddressTypeId;
	}

	@Override
	public String getAddressLine1() {
		if (_AddressLine1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _AddressLine1;
		}
	}

	@Override
	public void setAddressLine1(String AddressLine1) {
		_AddressLine1 = AddressLine1;
	}

	@Override
	public String getAddressLine2() {
		if (_AddressLine2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _AddressLine2;
		}
	}

	@Override
	public void setAddressLine2(String AddressLine2) {
		_AddressLine2 = AddressLine2;
	}

	@Override
	public String getAddressLine3() {
		if (_AddressLine3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _AddressLine3;
		}
	}

	@Override
	public void setAddressLine3(String AddressLine3) {
		_AddressLine3 = AddressLine3;
	}

	@Override
	public String getDistrict() {
		if (_District == null) {
			return StringPool.BLANK;
		}
		else {
			return _District;
		}
	}

	@Override
	public void setDistrict(String District) {
		_District = District;
	}

	@Override
	public int getStateId() {
		return _StateId;
	}

	@Override
	public void setStateId(int StateId) {
		_StateId = StateId;
	}

	@Override
	public int getCityId() {
		return _CityId;
	}

	@Override
	public void setCityId(int CityId) {
		_CityId = CityId;
	}

	@Override
	public String getPincode() {
		if (_Pincode == null) {
			return StringPool.BLANK;
		}
		else {
			return _Pincode;
		}
	}

	@Override
	public void setPincode(String Pincode) {
		_Pincode = Pincode;
	}

	@Override
	public int getCountryId() {
		return _CountryId;
	}

	@Override
	public void setCountryId(int CountryId) {
		_CountryId = CountryId;
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
	public CRM_Trn_Address toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CRM_Trn_Address)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CRM_Trn_AddressImpl crm_Trn_AddressImpl = new CRM_Trn_AddressImpl();

		crm_Trn_AddressImpl.setAddressId(getAddressId());
		crm_Trn_AddressImpl.setContactId(getContactId());
		crm_Trn_AddressImpl.setAddressTypeId(getAddressTypeId());
		crm_Trn_AddressImpl.setAddressLine1(getAddressLine1());
		crm_Trn_AddressImpl.setAddressLine2(getAddressLine2());
		crm_Trn_AddressImpl.setAddressLine3(getAddressLine3());
		crm_Trn_AddressImpl.setDistrict(getDistrict());
		crm_Trn_AddressImpl.setStateId(getStateId());
		crm_Trn_AddressImpl.setCityId(getCityId());
		crm_Trn_AddressImpl.setPincode(getPincode());
		crm_Trn_AddressImpl.setCountryId(getCountryId());
		crm_Trn_AddressImpl.setIsActive(getIsActive());
		crm_Trn_AddressImpl.setCreatedBy(getCreatedBy());
		crm_Trn_AddressImpl.setCreatedDate(getCreatedDate());
		crm_Trn_AddressImpl.setModifiedBy(getModifiedBy());
		crm_Trn_AddressImpl.setModifiedDate(getModifiedDate());

		crm_Trn_AddressImpl.resetOriginalValues();

		return crm_Trn_AddressImpl;
	}

	@Override
	public int compareTo(CRM_Trn_Address crm_Trn_Address) {
		int primaryKey = crm_Trn_Address.getPrimaryKey();

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

		if (!(obj instanceof CRM_Trn_Address)) {
			return false;
		}

		CRM_Trn_Address crm_Trn_Address = (CRM_Trn_Address)obj;

		int primaryKey = crm_Trn_Address.getPrimaryKey();

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
		CRM_Trn_AddressModelImpl crm_Trn_AddressModelImpl = this;

		crm_Trn_AddressModelImpl._originalAddressId = crm_Trn_AddressModelImpl._AddressId;

		crm_Trn_AddressModelImpl._setOriginalAddressId = false;

		crm_Trn_AddressModelImpl._originalContactId = crm_Trn_AddressModelImpl._ContactId;

		crm_Trn_AddressModelImpl._setOriginalContactId = false;

		crm_Trn_AddressModelImpl._originalAddressTypeId = crm_Trn_AddressModelImpl._AddressTypeId;

		crm_Trn_AddressModelImpl._setOriginalAddressTypeId = false;

		crm_Trn_AddressModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CRM_Trn_Address> toCacheModel() {
		CRM_Trn_AddressCacheModel crm_Trn_AddressCacheModel = new CRM_Trn_AddressCacheModel();

		crm_Trn_AddressCacheModel.AddressId = getAddressId();

		crm_Trn_AddressCacheModel.ContactId = getContactId();

		crm_Trn_AddressCacheModel.AddressTypeId = getAddressTypeId();

		crm_Trn_AddressCacheModel.AddressLine1 = getAddressLine1();

		String AddressLine1 = crm_Trn_AddressCacheModel.AddressLine1;

		if ((AddressLine1 != null) && (AddressLine1.length() == 0)) {
			crm_Trn_AddressCacheModel.AddressLine1 = null;
		}

		crm_Trn_AddressCacheModel.AddressLine2 = getAddressLine2();

		String AddressLine2 = crm_Trn_AddressCacheModel.AddressLine2;

		if ((AddressLine2 != null) && (AddressLine2.length() == 0)) {
			crm_Trn_AddressCacheModel.AddressLine2 = null;
		}

		crm_Trn_AddressCacheModel.AddressLine3 = getAddressLine3();

		String AddressLine3 = crm_Trn_AddressCacheModel.AddressLine3;

		if ((AddressLine3 != null) && (AddressLine3.length() == 0)) {
			crm_Trn_AddressCacheModel.AddressLine3 = null;
		}

		crm_Trn_AddressCacheModel.District = getDistrict();

		String District = crm_Trn_AddressCacheModel.District;

		if ((District != null) && (District.length() == 0)) {
			crm_Trn_AddressCacheModel.District = null;
		}

		crm_Trn_AddressCacheModel.StateId = getStateId();

		crm_Trn_AddressCacheModel.CityId = getCityId();

		crm_Trn_AddressCacheModel.Pincode = getPincode();

		String Pincode = crm_Trn_AddressCacheModel.Pincode;

		if ((Pincode != null) && (Pincode.length() == 0)) {
			crm_Trn_AddressCacheModel.Pincode = null;
		}

		crm_Trn_AddressCacheModel.CountryId = getCountryId();

		crm_Trn_AddressCacheModel.IsActive = getIsActive();

		String IsActive = crm_Trn_AddressCacheModel.IsActive;

		if ((IsActive != null) && (IsActive.length() == 0)) {
			crm_Trn_AddressCacheModel.IsActive = null;
		}

		crm_Trn_AddressCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = crm_Trn_AddressCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			crm_Trn_AddressCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			crm_Trn_AddressCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			crm_Trn_AddressCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		crm_Trn_AddressCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = crm_Trn_AddressCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			crm_Trn_AddressCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			crm_Trn_AddressCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			crm_Trn_AddressCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		return crm_Trn_AddressCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{AddressId=");
		sb.append(getAddressId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", AddressTypeId=");
		sb.append(getAddressTypeId());
		sb.append(", AddressLine1=");
		sb.append(getAddressLine1());
		sb.append(", AddressLine2=");
		sb.append(getAddressLine2());
		sb.append(", AddressLine3=");
		sb.append(getAddressLine3());
		sb.append(", District=");
		sb.append(getDistrict());
		sb.append(", StateId=");
		sb.append(getStateId());
		sb.append(", CityId=");
		sb.append(getCityId());
		sb.append(", Pincode=");
		sb.append(getPincode());
		sb.append(", CountryId=");
		sb.append(getCountryId());
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
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.CRM_Trn_Address");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>AddressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressTypeId</column-name><column-value><![CDATA[");
		sb.append(getAddressTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressLine1</column-name><column-value><![CDATA[");
		sb.append(getAddressLine1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressLine2</column-name><column-value><![CDATA[");
		sb.append(getAddressLine2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressLine3</column-name><column-value><![CDATA[");
		sb.append(getAddressLine3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>District</column-name><column-value><![CDATA[");
		sb.append(getDistrict());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CityId</column-name><column-value><![CDATA[");
		sb.append(getCityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Pincode</column-name><column-value><![CDATA[");
		sb.append(getPincode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CountryId</column-name><column-value><![CDATA[");
		sb.append(getCountryId());
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

	private static ClassLoader _classLoader = CRM_Trn_Address.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CRM_Trn_Address.class
		};
	private int _AddressId;
	private int _originalAddressId;
	private boolean _setOriginalAddressId;
	private int _ContactId;
	private int _originalContactId;
	private boolean _setOriginalContactId;
	private int _AddressTypeId;
	private int _originalAddressTypeId;
	private boolean _setOriginalAddressTypeId;
	private String _AddressLine1;
	private String _AddressLine2;
	private String _AddressLine3;
	private String _District;
	private int _StateId;
	private int _CityId;
	private String _Pincode;
	private int _CountryId;
	private String _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private long _columnBitmask;
	private CRM_Trn_Address _escapedModel;
}