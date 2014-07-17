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

import com.ifl.rapid.customer.model.QrcMstServices;
import com.ifl.rapid.customer.model.QrcMstServicesModel;

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
 * The base model implementation for the QrcMstServices service. Represents a row in the &quot;Qrc_Mst_Services&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.QrcMstServicesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QrcMstServicesImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstServicesImpl
 * @see com.ifl.rapid.customer.model.QrcMstServices
 * @see com.ifl.rapid.customer.model.QrcMstServicesModel
 * @generated
 */
public class QrcMstServicesModelImpl extends BaseModelImpl<QrcMstServices>
	implements QrcMstServicesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qrc mst services model instance should use the {@link com.ifl.rapid.customer.model.QrcMstServices} interface instead.
	 */
	public static final String TABLE_NAME = "Qrc_Mst_Services";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ServiceId", Types.INTEGER },
			{ "ServiceName", Types.VARCHAR },
			{ "Description", Types.VARCHAR },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "IsActive", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Qrc_Mst_Services (ServiceId INTEGER not null primary key,ServiceName VARCHAR(75) null,Description VARCHAR(75) null,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null,IsActive VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Qrc_Mst_Services";
	public static final String ORDER_BY_JPQL = " ORDER BY qrcMstServices.ServiceId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Qrc_Mst_Services.ServiceId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.QrcMstServices"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.QrcMstServices"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.QrcMstServices"));

	public QrcMstServicesModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _ServiceId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ServiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QrcMstServices.class;
	}

	@Override
	public String getModelClassName() {
		return QrcMstServices.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ServiceId", getServiceId());
		attributes.put("ServiceName", getServiceName());
		attributes.put("Description", getDescription());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ServiceId = (Integer)attributes.get("ServiceId");

		if (ServiceId != null) {
			setServiceId(ServiceId);
		}

		String ServiceName = (String)attributes.get("ServiceName");

		if (ServiceName != null) {
			setServiceName(ServiceName);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
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
	public int getServiceId() {
		return _ServiceId;
	}

	@Override
	public void setServiceId(int ServiceId) {
		_ServiceId = ServiceId;
	}

	@Override
	public String getServiceName() {
		if (_ServiceName == null) {
			return StringPool.BLANK;
		}
		else {
			return _ServiceName;
		}
	}

	@Override
	public void setServiceName(String ServiceName) {
		_ServiceName = ServiceName;
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

	@Override
	public QrcMstServices toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QrcMstServices)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QrcMstServicesImpl qrcMstServicesImpl = new QrcMstServicesImpl();

		qrcMstServicesImpl.setServiceId(getServiceId());
		qrcMstServicesImpl.setServiceName(getServiceName());
		qrcMstServicesImpl.setDescription(getDescription());
		qrcMstServicesImpl.setCreatedBy(getCreatedBy());
		qrcMstServicesImpl.setCreatedDate(getCreatedDate());
		qrcMstServicesImpl.setModifiedBy(getModifiedBy());
		qrcMstServicesImpl.setModifiedDate(getModifiedDate());
		qrcMstServicesImpl.setIsActive(getIsActive());

		qrcMstServicesImpl.resetOriginalValues();

		return qrcMstServicesImpl;
	}

	@Override
	public int compareTo(QrcMstServices qrcMstServices) {
		int primaryKey = qrcMstServices.getPrimaryKey();

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

		if (!(obj instanceof QrcMstServices)) {
			return false;
		}

		QrcMstServices qrcMstServices = (QrcMstServices)obj;

		int primaryKey = qrcMstServices.getPrimaryKey();

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
	public CacheModel<QrcMstServices> toCacheModel() {
		QrcMstServicesCacheModel qrcMstServicesCacheModel = new QrcMstServicesCacheModel();

		qrcMstServicesCacheModel.ServiceId = getServiceId();

		qrcMstServicesCacheModel.ServiceName = getServiceName();

		String ServiceName = qrcMstServicesCacheModel.ServiceName;

		if ((ServiceName != null) && (ServiceName.length() == 0)) {
			qrcMstServicesCacheModel.ServiceName = null;
		}

		qrcMstServicesCacheModel.Description = getDescription();

		String Description = qrcMstServicesCacheModel.Description;

		if ((Description != null) && (Description.length() == 0)) {
			qrcMstServicesCacheModel.Description = null;
		}

		qrcMstServicesCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = qrcMstServicesCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			qrcMstServicesCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			qrcMstServicesCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			qrcMstServicesCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		qrcMstServicesCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = qrcMstServicesCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			qrcMstServicesCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			qrcMstServicesCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			qrcMstServicesCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		qrcMstServicesCacheModel.IsActive = getIsActive();

		String IsActive = qrcMstServicesCacheModel.IsActive;

		if ((IsActive != null) && (IsActive.length() == 0)) {
			qrcMstServicesCacheModel.IsActive = null;
		}

		return qrcMstServicesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{ServiceId=");
		sb.append(getServiceId());
		sb.append(", ServiceName=");
		sb.append(getServiceName());
		sb.append(", Description=");
		sb.append(getDescription());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcMstServices");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ServiceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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

	private static ClassLoader _classLoader = QrcMstServices.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QrcMstServices.class
		};
	private int _ServiceId;
	private String _ServiceName;
	private String _Description;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private QrcMstServices _escapedModel;
}