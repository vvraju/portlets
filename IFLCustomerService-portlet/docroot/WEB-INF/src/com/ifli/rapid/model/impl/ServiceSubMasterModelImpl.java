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

import com.ifli.rapid.model.ServiceSubMaster;
import com.ifli.rapid.model.ServiceSubMasterModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ServiceSubMaster service. Represents a row in the &quot;service_submaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.ServiceSubMasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceSubMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ServiceSubMasterImpl
 * @see com.ifli.rapid.model.ServiceSubMaster
 * @see com.ifli.rapid.model.ServiceSubMasterModel
 * @generated
 */
public class ServiceSubMasterModelImpl extends BaseModelImpl<ServiceSubMaster>
	implements ServiceSubMasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service sub master model instance should use the {@link com.ifli.rapid.model.ServiceSubMaster} interface instead.
	 */
	public static final String TABLE_NAME = "service_submaster";
	public static final Object[][] TABLE_COLUMNS = {
			{ "SUBMASTER_ID", Types.INTEGER },
			{ "SUBMASTER_NAME", Types.VARCHAR },
			{ "SUBMASTER_URL", Types.VARCHAR },
			{ "SERVICE_MASTER_ID", Types.INTEGER },
			{ "ACTIVE_FLAG", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table service_submaster (SUBMASTER_ID INTEGER not null primary key,SUBMASTER_NAME VARCHAR(75) null,SUBMASTER_URL VARCHAR(75) null,SERVICE_MASTER_ID INTEGER,ACTIVE_FLAG VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table service_submaster";
	public static final String ORDER_BY_JPQL = " ORDER BY serviceSubMaster.SUBMASTER_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY service_submaster.SUBMASTER_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.ServiceSubMaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.ServiceSubMaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.ServiceSubMaster"));

	public ServiceSubMasterModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _SUBMASTER_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setSUBMASTER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _SUBMASTER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceSubMaster.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceSubMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SUBMASTER_ID", getSUBMASTER_ID());
		attributes.put("SUBMASTER_NAME", getSUBMASTER_NAME());
		attributes.put("SUBMASTER_URL", getSUBMASTER_URL());
		attributes.put("SERVICE_MASTER_ID", getSERVICE_MASTER_ID());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer SUBMASTER_ID = (Integer)attributes.get("SUBMASTER_ID");

		if (SUBMASTER_ID != null) {
			setSUBMASTER_ID(SUBMASTER_ID);
		}

		String SUBMASTER_NAME = (String)attributes.get("SUBMASTER_NAME");

		if (SUBMASTER_NAME != null) {
			setSUBMASTER_NAME(SUBMASTER_NAME);
		}

		String SUBMASTER_URL = (String)attributes.get("SUBMASTER_URL");

		if (SUBMASTER_URL != null) {
			setSUBMASTER_URL(SUBMASTER_URL);
		}

		Integer SERVICE_MASTER_ID = (Integer)attributes.get("SERVICE_MASTER_ID");

		if (SERVICE_MASTER_ID != null) {
			setSERVICE_MASTER_ID(SERVICE_MASTER_ID);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}
	}

	@Override
	public int getSUBMASTER_ID() {
		return _SUBMASTER_ID;
	}

	@Override
	public void setSUBMASTER_ID(int SUBMASTER_ID) {
		_SUBMASTER_ID = SUBMASTER_ID;
	}

	@Override
	public String getSUBMASTER_NAME() {
		if (_SUBMASTER_NAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _SUBMASTER_NAME;
		}
	}

	@Override
	public void setSUBMASTER_NAME(String SUBMASTER_NAME) {
		_SUBMASTER_NAME = SUBMASTER_NAME;
	}

	@Override
	public String getSUBMASTER_URL() {
		if (_SUBMASTER_URL == null) {
			return StringPool.BLANK;
		}
		else {
			return _SUBMASTER_URL;
		}
	}

	@Override
	public void setSUBMASTER_URL(String SUBMASTER_URL) {
		_SUBMASTER_URL = SUBMASTER_URL;
	}

	@Override
	public int getSERVICE_MASTER_ID() {
		return _SERVICE_MASTER_ID;
	}

	@Override
	public void setSERVICE_MASTER_ID(int SERVICE_MASTER_ID) {
		_SERVICE_MASTER_ID = SERVICE_MASTER_ID;
	}

	@Override
	public String getACTIVE_FLAG() {
		if (_ACTIVE_FLAG == null) {
			return StringPool.BLANK;
		}
		else {
			return _ACTIVE_FLAG;
		}
	}

	@Override
	public void setACTIVE_FLAG(String ACTIVE_FLAG) {
		_ACTIVE_FLAG = ACTIVE_FLAG;
	}

	@Override
	public ServiceSubMaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ServiceSubMaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServiceSubMasterImpl serviceSubMasterImpl = new ServiceSubMasterImpl();

		serviceSubMasterImpl.setSUBMASTER_ID(getSUBMASTER_ID());
		serviceSubMasterImpl.setSUBMASTER_NAME(getSUBMASTER_NAME());
		serviceSubMasterImpl.setSUBMASTER_URL(getSUBMASTER_URL());
		serviceSubMasterImpl.setSERVICE_MASTER_ID(getSERVICE_MASTER_ID());
		serviceSubMasterImpl.setACTIVE_FLAG(getACTIVE_FLAG());

		serviceSubMasterImpl.resetOriginalValues();

		return serviceSubMasterImpl;
	}

	@Override
	public int compareTo(ServiceSubMaster serviceSubMaster) {
		int primaryKey = serviceSubMaster.getPrimaryKey();

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

		if (!(obj instanceof ServiceSubMaster)) {
			return false;
		}

		ServiceSubMaster serviceSubMaster = (ServiceSubMaster)obj;

		int primaryKey = serviceSubMaster.getPrimaryKey();

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
	public CacheModel<ServiceSubMaster> toCacheModel() {
		ServiceSubMasterCacheModel serviceSubMasterCacheModel = new ServiceSubMasterCacheModel();

		serviceSubMasterCacheModel.SUBMASTER_ID = getSUBMASTER_ID();

		serviceSubMasterCacheModel.SUBMASTER_NAME = getSUBMASTER_NAME();

		String SUBMASTER_NAME = serviceSubMasterCacheModel.SUBMASTER_NAME;

		if ((SUBMASTER_NAME != null) && (SUBMASTER_NAME.length() == 0)) {
			serviceSubMasterCacheModel.SUBMASTER_NAME = null;
		}

		serviceSubMasterCacheModel.SUBMASTER_URL = getSUBMASTER_URL();

		String SUBMASTER_URL = serviceSubMasterCacheModel.SUBMASTER_URL;

		if ((SUBMASTER_URL != null) && (SUBMASTER_URL.length() == 0)) {
			serviceSubMasterCacheModel.SUBMASTER_URL = null;
		}

		serviceSubMasterCacheModel.SERVICE_MASTER_ID = getSERVICE_MASTER_ID();

		serviceSubMasterCacheModel.ACTIVE_FLAG = getACTIVE_FLAG();

		String ACTIVE_FLAG = serviceSubMasterCacheModel.ACTIVE_FLAG;

		if ((ACTIVE_FLAG != null) && (ACTIVE_FLAG.length() == 0)) {
			serviceSubMasterCacheModel.ACTIVE_FLAG = null;
		}

		return serviceSubMasterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{SUBMASTER_ID=");
		sb.append(getSUBMASTER_ID());
		sb.append(", SUBMASTER_NAME=");
		sb.append(getSUBMASTER_NAME());
		sb.append(", SUBMASTER_URL=");
		sb.append(getSUBMASTER_URL());
		sb.append(", SERVICE_MASTER_ID=");
		sb.append(getSERVICE_MASTER_ID());
		sb.append(", ACTIVE_FLAG=");
		sb.append(getACTIVE_FLAG());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ServiceSubMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>SUBMASTER_ID</column-name><column-value><![CDATA[");
		sb.append(getSUBMASTER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUBMASTER_NAME</column-name><column-value><![CDATA[");
		sb.append(getSUBMASTER_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUBMASTER_URL</column-name><column-value><![CDATA[");
		sb.append(getSUBMASTER_URL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SERVICE_MASTER_ID</column-name><column-value><![CDATA[");
		sb.append(getSERVICE_MASTER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ACTIVE_FLAG</column-name><column-value><![CDATA[");
		sb.append(getACTIVE_FLAG());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ServiceSubMaster.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ServiceSubMaster.class
		};
	private int _SUBMASTER_ID;
	private String _SUBMASTER_NAME;
	private String _SUBMASTER_URL;
	private int _SERVICE_MASTER_ID;
	private String _ACTIVE_FLAG;
	private ServiceSubMaster _escapedModel;
}