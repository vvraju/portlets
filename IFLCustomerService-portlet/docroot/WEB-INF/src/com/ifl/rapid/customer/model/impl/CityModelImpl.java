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

import com.ifl.rapid.customer.model.City;
import com.ifl.rapid.customer.model.CityModel;

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
 * The base model implementation for the City service. Represents a row in the &quot;Loc_Mst_City&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.CityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CityImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CityImpl
 * @see com.ifl.rapid.customer.model.City
 * @see com.ifl.rapid.customer.model.CityModel
 * @generated
 */
public class CityModelImpl extends BaseModelImpl<City> implements CityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a city model instance should use the {@link com.ifl.rapid.customer.model.City} interface instead.
	 */
	public static final String TABLE_NAME = "Loc_Mst_City";
	public static final Object[][] TABLE_COLUMNS = {
			{ "CityId", Types.INTEGER },
			{ "CityCode", Types.VARCHAR },
			{ "CityName", Types.VARCHAR },
			{ "IsActive", Types.INTEGER },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "StateId", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table Loc_Mst_City (CityId INTEGER not null primary key,CityCode VARCHAR(75) null,CityName VARCHAR(75) null,IsActive INTEGER,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedDate DATE null,ModifiedBy VARCHAR(75) null,StateId INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table Loc_Mst_City";
	public static final String ORDER_BY_JPQL = " ORDER BY city.CityId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Loc_Mst_City.CityId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.City"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.City"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.City"));

	public CityModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _CityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return City.class;
	}

	@Override
	public String getModelClassName() {
		return City.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CityId", getCityId());
		attributes.put("CityCode", getCityCode());
		attributes.put("CityName", getCityName());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("StateId", getStateId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CityId = (Integer)attributes.get("CityId");

		if (CityId != null) {
			setCityId(CityId);
		}

		String CityCode = (String)attributes.get("CityCode");

		if (CityCode != null) {
			setCityCode(CityCode);
		}

		String CityName = (String)attributes.get("CityName");

		if (CityName != null) {
			setCityName(CityName);
		}

		Integer IsActive = (Integer)attributes.get("IsActive");

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

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Integer StateId = (Integer)attributes.get("StateId");

		if (StateId != null) {
			setStateId(StateId);
		}
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
	public String getCityCode() {
		if (_CityCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _CityCode;
		}
	}

	@Override
	public void setCityCode(String CityCode) {
		_CityCode = CityCode;
	}

	@Override
	public String getCityName() {
		if (_CityName == null) {
			return StringPool.BLANK;
		}
		else {
			return _CityName;
		}
	}

	@Override
	public void setCityName(String CityName) {
		_CityName = CityName;
	}

	@Override
	public int getIsActive() {
		return _IsActive;
	}

	@Override
	public void setIsActive(int IsActive) {
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
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
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
	public int getStateId() {
		return _StateId;
	}

	@Override
	public void setStateId(int StateId) {
		_StateId = StateId;
	}

	@Override
	public City toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (City)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CityImpl cityImpl = new CityImpl();

		cityImpl.setCityId(getCityId());
		cityImpl.setCityCode(getCityCode());
		cityImpl.setCityName(getCityName());
		cityImpl.setIsActive(getIsActive());
		cityImpl.setCreatedBy(getCreatedBy());
		cityImpl.setCreatedDate(getCreatedDate());
		cityImpl.setModifiedDate(getModifiedDate());
		cityImpl.setModifiedBy(getModifiedBy());
		cityImpl.setStateId(getStateId());

		cityImpl.resetOriginalValues();

		return cityImpl;
	}

	@Override
	public int compareTo(City city) {
		int primaryKey = city.getPrimaryKey();

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

		if (!(obj instanceof City)) {
			return false;
		}

		City city = (City)obj;

		int primaryKey = city.getPrimaryKey();

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
	}

	@Override
	public CacheModel<City> toCacheModel() {
		CityCacheModel cityCacheModel = new CityCacheModel();

		cityCacheModel.CityId = getCityId();

		cityCacheModel.CityCode = getCityCode();

		String CityCode = cityCacheModel.CityCode;

		if ((CityCode != null) && (CityCode.length() == 0)) {
			cityCacheModel.CityCode = null;
		}

		cityCacheModel.CityName = getCityName();

		String CityName = cityCacheModel.CityName;

		if ((CityName != null) && (CityName.length() == 0)) {
			cityCacheModel.CityName = null;
		}

		cityCacheModel.IsActive = getIsActive();

		cityCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = cityCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			cityCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			cityCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			cityCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			cityCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			cityCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		cityCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = cityCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			cityCacheModel.ModifiedBy = null;
		}

		cityCacheModel.StateId = getStateId();

		return cityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{CityId=");
		sb.append(getCityId());
		sb.append(", CityCode=");
		sb.append(getCityCode());
		sb.append(", CityName=");
		sb.append(getCityName());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", StateId=");
		sb.append(getStateId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.City");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CityId</column-name><column-value><![CDATA[");
		sb.append(getCityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CityCode</column-name><column-value><![CDATA[");
		sb.append(getCityCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CityName</column-name><column-value><![CDATA[");
		sb.append(getCityName());
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
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = City.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { City.class };
	private int _CityId;
	private String _CityCode;
	private String _CityName;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private int _StateId;
	private City _escapedModel;
}