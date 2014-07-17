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

import com.ifli.rapid.model.PremiumFrequencyMaster;
import com.ifli.rapid.model.PremiumFrequencyMasterModel;

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
 * The base model implementation for the PremiumFrequencyMaster service. Represents a row in the &quot;PremiumFrequencyMaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.PremiumFrequencyMasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PremiumFrequencyMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PremiumFrequencyMasterImpl
 * @see com.ifli.rapid.model.PremiumFrequencyMaster
 * @see com.ifli.rapid.model.PremiumFrequencyMasterModel
 * @generated
 */
public class PremiumFrequencyMasterModelImpl extends BaseModelImpl<PremiumFrequencyMaster>
	implements PremiumFrequencyMasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a premium frequency master model instance should use the {@link com.ifli.rapid.model.PremiumFrequencyMaster} interface instead.
	 */
	public static final String TABLE_NAME = "PremiumFrequencyMaster";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PremiumFrequencyId", Types.VARCHAR },
			{ "PremiumFrequencyDescription", Types.VARCHAR },
			{ "IsActive", Types.BOOLEAN },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "Priority", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table PremiumFrequencyMaster (PremiumFrequencyId VARCHAR(75) not null primary key IDENTITY,PremiumFrequencyDescription VARCHAR(75) null,IsActive BOOLEAN,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null,Priority INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table PremiumFrequencyMaster";
	public static final String ORDER_BY_JPQL = " ORDER BY premiumFrequencyMaster.PremiumFrequencyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PremiumFrequencyMaster.PremiumFrequencyId ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.PremiumFrequencyMaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.PremiumFrequencyMaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.PremiumFrequencyMaster"));

	public PremiumFrequencyMasterModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _PremiumFrequencyId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPremiumFrequencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PremiumFrequencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return PremiumFrequencyMaster.class;
	}

	@Override
	public String getModelClassName() {
		return PremiumFrequencyMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PremiumFrequencyId", getPremiumFrequencyId());
		attributes.put("PremiumFrequencyDescription",
			getPremiumFrequencyDescription());
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
		String PremiumFrequencyId = (String)attributes.get("PremiumFrequencyId");

		if (PremiumFrequencyId != null) {
			setPremiumFrequencyId(PremiumFrequencyId);
		}

		String PremiumFrequencyDescription = (String)attributes.get(
				"PremiumFrequencyDescription");

		if (PremiumFrequencyDescription != null) {
			setPremiumFrequencyDescription(PremiumFrequencyDescription);
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
	public String getPremiumFrequencyId() {
		if (_PremiumFrequencyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _PremiumFrequencyId;
		}
	}

	@Override
	public void setPremiumFrequencyId(String PremiumFrequencyId) {
		_PremiumFrequencyId = PremiumFrequencyId;
	}

	@Override
	public String getPremiumFrequencyDescription() {
		if (_PremiumFrequencyDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _PremiumFrequencyDescription;
		}
	}

	@Override
	public void setPremiumFrequencyDescription(
		String PremiumFrequencyDescription) {
		_PremiumFrequencyDescription = PremiumFrequencyDescription;
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
	public PremiumFrequencyMaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PremiumFrequencyMaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PremiumFrequencyMasterImpl premiumFrequencyMasterImpl = new PremiumFrequencyMasterImpl();

		premiumFrequencyMasterImpl.setPremiumFrequencyId(getPremiumFrequencyId());
		premiumFrequencyMasterImpl.setPremiumFrequencyDescription(getPremiumFrequencyDescription());
		premiumFrequencyMasterImpl.setIsActive(getIsActive());
		premiumFrequencyMasterImpl.setCreatedBy(getCreatedBy());
		premiumFrequencyMasterImpl.setCreatedDate(getCreatedDate());
		premiumFrequencyMasterImpl.setModifiedBy(getModifiedBy());
		premiumFrequencyMasterImpl.setModifiedDate(getModifiedDate());
		premiumFrequencyMasterImpl.setPriority(getPriority());

		premiumFrequencyMasterImpl.resetOriginalValues();

		return premiumFrequencyMasterImpl;
	}

	@Override
	public int compareTo(PremiumFrequencyMaster premiumFrequencyMaster) {
		String primaryKey = premiumFrequencyMaster.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PremiumFrequencyMaster)) {
			return false;
		}

		PremiumFrequencyMaster premiumFrequencyMaster = (PremiumFrequencyMaster)obj;

		String primaryKey = premiumFrequencyMaster.getPrimaryKey();

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
	public CacheModel<PremiumFrequencyMaster> toCacheModel() {
		PremiumFrequencyMasterCacheModel premiumFrequencyMasterCacheModel = new PremiumFrequencyMasterCacheModel();

		premiumFrequencyMasterCacheModel.PremiumFrequencyId = getPremiumFrequencyId();

		String PremiumFrequencyId = premiumFrequencyMasterCacheModel.PremiumFrequencyId;

		if ((PremiumFrequencyId != null) && (PremiumFrequencyId.length() == 0)) {
			premiumFrequencyMasterCacheModel.PremiumFrequencyId = null;
		}

		premiumFrequencyMasterCacheModel.PremiumFrequencyDescription = getPremiumFrequencyDescription();

		String PremiumFrequencyDescription = premiumFrequencyMasterCacheModel.PremiumFrequencyDescription;

		if ((PremiumFrequencyDescription != null) &&
				(PremiumFrequencyDescription.length() == 0)) {
			premiumFrequencyMasterCacheModel.PremiumFrequencyDescription = null;
		}

		premiumFrequencyMasterCacheModel.IsActive = getIsActive();

		premiumFrequencyMasterCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = premiumFrequencyMasterCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			premiumFrequencyMasterCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			premiumFrequencyMasterCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			premiumFrequencyMasterCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		premiumFrequencyMasterCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = premiumFrequencyMasterCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			premiumFrequencyMasterCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			premiumFrequencyMasterCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			premiumFrequencyMasterCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		premiumFrequencyMasterCacheModel.Priority = getPriority();

		return premiumFrequencyMasterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{PremiumFrequencyId=");
		sb.append(getPremiumFrequencyId());
		sb.append(", PremiumFrequencyDescription=");
		sb.append(getPremiumFrequencyDescription());
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
		sb.append("com.ifli.rapid.model.PremiumFrequencyMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PremiumFrequencyId</column-name><column-value><![CDATA[");
		sb.append(getPremiumFrequencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumFrequencyDescription</column-name><column-value><![CDATA[");
		sb.append(getPremiumFrequencyDescription());
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

	private static ClassLoader _classLoader = PremiumFrequencyMaster.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			PremiumFrequencyMaster.class
		};
	private String _PremiumFrequencyId;
	private String _PremiumFrequencyDescription;
	private boolean _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private int _Priority;
	private PremiumFrequencyMaster _escapedModel;
}