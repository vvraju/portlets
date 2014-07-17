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

import com.ifl.rapid.customer.model.CRMTrnContactCommunication;
import com.ifl.rapid.customer.model.CRMTrnContactCommunicationModel;

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
 * The base model implementation for the CRMTrnContactCommunication service. Represents a row in the &quot;CRM_Trn_ContactCommunication&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.CRMTrnContactCommunicationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CRMTrnContactCommunicationImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnContactCommunicationImpl
 * @see com.ifl.rapid.customer.model.CRMTrnContactCommunication
 * @see com.ifl.rapid.customer.model.CRMTrnContactCommunicationModel
 * @generated
 */
public class CRMTrnContactCommunicationModelImpl extends BaseModelImpl<CRMTrnContactCommunication>
	implements CRMTrnContactCommunicationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c r m trn contact communication model instance should use the {@link com.ifl.rapid.customer.model.CRMTrnContactCommunication} interface instead.
	 */
	public static final String TABLE_NAME = "CRM_Trn_ContactCommunication";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ContactCommunicationId", Types.INTEGER },
			{ "ContactId", Types.INTEGER },
			{ "CommunicationMedium", Types.INTEGER },
			{ "CommunicationMediumId", Types.VARCHAR },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "IsActive", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CRM_Trn_ContactCommunication (ContactCommunicationId INTEGER not null primary key IDENTITY,ContactId INTEGER,CommunicationMedium INTEGER,CommunicationMediumId VARCHAR(75) null,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null,IsActive VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CRM_Trn_ContactCommunication";
	public static final String ORDER_BY_JPQL = " ORDER BY crmTrnContactCommunication.ContactCommunicationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CRM_Trn_ContactCommunication.ContactCommunicationId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.CRMTrnContactCommunication"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.CRMTrnContactCommunication"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ifl.rapid.customer.model.CRMTrnContactCommunication"),
			true);
	public static long COMMUNICATIONMEDIUM_COLUMN_BITMASK = 1L;
	public static long CONTACTID_COLUMN_BITMASK = 2L;
	public static long CONTACTCOMMUNICATIONID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.CRMTrnContactCommunication"));

	public CRMTrnContactCommunicationModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _ContactCommunicationId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setContactCommunicationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ContactCommunicationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CRMTrnContactCommunication.class;
	}

	@Override
	public String getModelClassName() {
		return CRMTrnContactCommunication.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ContactCommunicationId", getContactCommunicationId());
		attributes.put("ContactId", getContactId());
		attributes.put("CommunicationMedium", getCommunicationMedium());
		attributes.put("CommunicationMediumId", getCommunicationMediumId());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ContactCommunicationId = (Integer)attributes.get(
				"ContactCommunicationId");

		if (ContactCommunicationId != null) {
			setContactCommunicationId(ContactCommunicationId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer CommunicationMedium = (Integer)attributes.get(
				"CommunicationMedium");

		if (CommunicationMedium != null) {
			setCommunicationMedium(CommunicationMedium);
		}

		String CommunicationMediumId = (String)attributes.get(
				"CommunicationMediumId");

		if (CommunicationMediumId != null) {
			setCommunicationMediumId(CommunicationMediumId);
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

		String IsActive = (String)attributes.get("IsActive");

		if (IsActive != null) {
			setIsActive(IsActive);
		}
	}

	@Override
	public int getContactCommunicationId() {
		return _ContactCommunicationId;
	}

	@Override
	public void setContactCommunicationId(int ContactCommunicationId) {
		_ContactCommunicationId = ContactCommunicationId;
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
	public int getCommunicationMedium() {
		return _CommunicationMedium;
	}

	@Override
	public void setCommunicationMedium(int CommunicationMedium) {
		_columnBitmask |= COMMUNICATIONMEDIUM_COLUMN_BITMASK;

		if (!_setOriginalCommunicationMedium) {
			_setOriginalCommunicationMedium = true;

			_originalCommunicationMedium = _CommunicationMedium;
		}

		_CommunicationMedium = CommunicationMedium;
	}

	public int getOriginalCommunicationMedium() {
		return _originalCommunicationMedium;
	}

	@Override
	public String getCommunicationMediumId() {
		if (_CommunicationMediumId == null) {
			return StringPool.BLANK;
		}
		else {
			return _CommunicationMediumId;
		}
	}

	@Override
	public void setCommunicationMediumId(String CommunicationMediumId) {
		_CommunicationMediumId = CommunicationMediumId;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public CRMTrnContactCommunication toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CRMTrnContactCommunication)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CRMTrnContactCommunicationImpl crmTrnContactCommunicationImpl = new CRMTrnContactCommunicationImpl();

		crmTrnContactCommunicationImpl.setContactCommunicationId(getContactCommunicationId());
		crmTrnContactCommunicationImpl.setContactId(getContactId());
		crmTrnContactCommunicationImpl.setCommunicationMedium(getCommunicationMedium());
		crmTrnContactCommunicationImpl.setCommunicationMediumId(getCommunicationMediumId());
		crmTrnContactCommunicationImpl.setCreatedBy(getCreatedBy());
		crmTrnContactCommunicationImpl.setCreatedDate(getCreatedDate());
		crmTrnContactCommunicationImpl.setModifiedBy(getModifiedBy());
		crmTrnContactCommunicationImpl.setModifiedDate(getModifiedDate());
		crmTrnContactCommunicationImpl.setIsActive(getIsActive());

		crmTrnContactCommunicationImpl.resetOriginalValues();

		return crmTrnContactCommunicationImpl;
	}

	@Override
	public int compareTo(CRMTrnContactCommunication crmTrnContactCommunication) {
		int primaryKey = crmTrnContactCommunication.getPrimaryKey();

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

		if (!(obj instanceof CRMTrnContactCommunication)) {
			return false;
		}

		CRMTrnContactCommunication crmTrnContactCommunication = (CRMTrnContactCommunication)obj;

		int primaryKey = crmTrnContactCommunication.getPrimaryKey();

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
		CRMTrnContactCommunicationModelImpl crmTrnContactCommunicationModelImpl = this;

		crmTrnContactCommunicationModelImpl._originalContactId = crmTrnContactCommunicationModelImpl._ContactId;

		crmTrnContactCommunicationModelImpl._setOriginalContactId = false;

		crmTrnContactCommunicationModelImpl._originalCommunicationMedium = crmTrnContactCommunicationModelImpl._CommunicationMedium;

		crmTrnContactCommunicationModelImpl._setOriginalCommunicationMedium = false;

		crmTrnContactCommunicationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CRMTrnContactCommunication> toCacheModel() {
		CRMTrnContactCommunicationCacheModel crmTrnContactCommunicationCacheModel =
			new CRMTrnContactCommunicationCacheModel();

		crmTrnContactCommunicationCacheModel.ContactCommunicationId = getContactCommunicationId();

		crmTrnContactCommunicationCacheModel.ContactId = getContactId();

		crmTrnContactCommunicationCacheModel.CommunicationMedium = getCommunicationMedium();

		crmTrnContactCommunicationCacheModel.CommunicationMediumId = getCommunicationMediumId();

		String CommunicationMediumId = crmTrnContactCommunicationCacheModel.CommunicationMediumId;

		if ((CommunicationMediumId != null) &&
				(CommunicationMediumId.length() == 0)) {
			crmTrnContactCommunicationCacheModel.CommunicationMediumId = null;
		}

		crmTrnContactCommunicationCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = crmTrnContactCommunicationCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			crmTrnContactCommunicationCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			crmTrnContactCommunicationCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			crmTrnContactCommunicationCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		crmTrnContactCommunicationCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = crmTrnContactCommunicationCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			crmTrnContactCommunicationCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			crmTrnContactCommunicationCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			crmTrnContactCommunicationCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		crmTrnContactCommunicationCacheModel.IsActive = getIsActive();

		String IsActive = crmTrnContactCommunicationCacheModel.IsActive;

		if ((IsActive != null) && (IsActive.length() == 0)) {
			crmTrnContactCommunicationCacheModel.IsActive = null;
		}

		return crmTrnContactCommunicationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{ContactCommunicationId=");
		sb.append(getContactCommunicationId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", CommunicationMedium=");
		sb.append(getCommunicationMedium());
		sb.append(", CommunicationMediumId=");
		sb.append(getCommunicationMediumId());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", IsActive=");
		sb.append(getIsActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.CRMTrnContactCommunication");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ContactCommunicationId</column-name><column-value><![CDATA[");
		sb.append(getContactCommunicationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CommunicationMedium</column-name><column-value><![CDATA[");
		sb.append(getCommunicationMedium());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CommunicationMediumId</column-name><column-value><![CDATA[");
		sb.append(getCommunicationMediumId());
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
			"<column><column-name>IsActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CRMTrnContactCommunication.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CRMTrnContactCommunication.class
		};
	private int _ContactCommunicationId;
	private int _ContactId;
	private int _originalContactId;
	private boolean _setOriginalContactId;
	private int _CommunicationMedium;
	private int _originalCommunicationMedium;
	private boolean _setOriginalCommunicationMedium;
	private String _CommunicationMediumId;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private long _columnBitmask;
	private CRMTrnContactCommunication _escapedModel;
}