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

import com.ifli.rapid.model.QRCUser;
import com.ifli.rapid.model.QRCUserModel;

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
 * The base model implementation for the QRCUser service. Represents a row in the &quot;QRC_USER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.QRCUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QRCUserImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCUserImpl
 * @see com.ifli.rapid.model.QRCUser
 * @see com.ifli.rapid.model.QRCUserModel
 * @generated
 */
public class QRCUserModelImpl extends BaseModelImpl<QRCUser>
	implements QRCUserModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q r c user model instance should use the {@link com.ifli.rapid.model.QRCUser} interface instead.
	 */
	public static final String TABLE_NAME = "QRC_USER";
	public static final Object[][] TABLE_COLUMNS = {
			{ "QRC_USER_ID", Types.INTEGER },
			{ "USER_NAME", Types.VARCHAR },
			{ "TEAM_ID", Types.INTEGER },
			{ "USER_DETAILS", Types.INTEGER },
			{ "ACTIVE_FLAG", Types.VARCHAR },
			{ "INSERTED_DATE", Types.TIMESTAMP },
			{ "INSERTED_BY", Types.VARCHAR },
			{ "UPDATED_DATE", Types.TIMESTAMP },
			{ "UPDATED_BY", Types.VARCHAR },
			{ "DELETED_DATE", Types.TIMESTAMP },
			{ "DELETED_BY", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table QRC_USER (QRC_USER_ID INTEGER not null primary key IDENTITY,USER_NAME VARCHAR(75) null,TEAM_ID INTEGER,USER_DETAILS INTEGER,ACTIVE_FLAG VARCHAR(75) null,INSERTED_DATE DATE null,INSERTED_BY VARCHAR(75) null,UPDATED_DATE DATE null,UPDATED_BY VARCHAR(75) null,DELETED_DATE DATE null,DELETED_BY VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table QRC_USER";
	public static final String ORDER_BY_JPQL = " ORDER BY qrcUser.QRC_USER_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY QRC_USER.QRC_USER_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.QRCUser"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.QRCUser"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.QRCUser"));

	public QRCUserModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_USER_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_USER_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_USER_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QRCUser.class;
	}

	@Override
	public String getModelClassName() {
		return QRCUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_USER_ID", getQRC_USER_ID());
		attributes.put("USER_NAME", getUSER_NAME());
		attributes.put("TEAM_ID", getTEAM_ID());
		attributes.put("USER_DETAILS", getUSER_DETAILS());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("DELETED_DATE", getDELETED_DATE());
		attributes.put("DELETED_BY", getDELETED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_USER_ID = (Integer)attributes.get("QRC_USER_ID");

		if (QRC_USER_ID != null) {
			setQRC_USER_ID(QRC_USER_ID);
		}

		String USER_NAME = (String)attributes.get("USER_NAME");

		if (USER_NAME != null) {
			setUSER_NAME(USER_NAME);
		}

		Integer TEAM_ID = (Integer)attributes.get("TEAM_ID");

		if (TEAM_ID != null) {
			setTEAM_ID(TEAM_ID);
		}

		Integer USER_DETAILS = (Integer)attributes.get("USER_DETAILS");

		if (USER_DETAILS != null) {
			setUSER_DETAILS(USER_DETAILS);
		}

		String ACTIVE_FLAG = (String)attributes.get("ACTIVE_FLAG");

		if (ACTIVE_FLAG != null) {
			setACTIVE_FLAG(ACTIVE_FLAG);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date DELETED_DATE = (Date)attributes.get("DELETED_DATE");

		if (DELETED_DATE != null) {
			setDELETED_DATE(DELETED_DATE);
		}

		String DELETED_BY = (String)attributes.get("DELETED_BY");

		if (DELETED_BY != null) {
			setDELETED_BY(DELETED_BY);
		}
	}

	@Override
	public int getQRC_USER_ID() {
		return _QRC_USER_ID;
	}

	@Override
	public void setQRC_USER_ID(int QRC_USER_ID) {
		_QRC_USER_ID = QRC_USER_ID;
	}

	@Override
	public String getUSER_NAME() {
		if (_USER_NAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _USER_NAME;
		}
	}

	@Override
	public void setUSER_NAME(String USER_NAME) {
		_USER_NAME = USER_NAME;
	}

	@Override
	public int getTEAM_ID() {
		return _TEAM_ID;
	}

	@Override
	public void setTEAM_ID(int TEAM_ID) {
		_TEAM_ID = TEAM_ID;
	}

	@Override
	public int getUSER_DETAILS() {
		return _USER_DETAILS;
	}

	@Override
	public void setUSER_DETAILS(int USER_DETAILS) {
		_USER_DETAILS = USER_DETAILS;
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
	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	@Override
	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;
	}

	@Override
	public String getINSERTED_BY() {
		if (_INSERTED_BY == null) {
			return StringPool.BLANK;
		}
		else {
			return _INSERTED_BY;
		}
	}

	@Override
	public void setINSERTED_BY(String INSERTED_BY) {
		_INSERTED_BY = INSERTED_BY;
	}

	@Override
	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	@Override
	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	@Override
	public String getUPDATED_BY() {
		if (_UPDATED_BY == null) {
			return StringPool.BLANK;
		}
		else {
			return _UPDATED_BY;
		}
	}

	@Override
	public void setUPDATED_BY(String UPDATED_BY) {
		_UPDATED_BY = UPDATED_BY;
	}

	@Override
	public Date getDELETED_DATE() {
		return _DELETED_DATE;
	}

	@Override
	public void setDELETED_DATE(Date DELETED_DATE) {
		_DELETED_DATE = DELETED_DATE;
	}

	@Override
	public String getDELETED_BY() {
		if (_DELETED_BY == null) {
			return StringPool.BLANK;
		}
		else {
			return _DELETED_BY;
		}
	}

	@Override
	public void setDELETED_BY(String DELETED_BY) {
		_DELETED_BY = DELETED_BY;
	}

	@Override
	public QRCUser toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QRCUser)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QRCUserImpl qrcUserImpl = new QRCUserImpl();

		qrcUserImpl.setQRC_USER_ID(getQRC_USER_ID());
		qrcUserImpl.setUSER_NAME(getUSER_NAME());
		qrcUserImpl.setTEAM_ID(getTEAM_ID());
		qrcUserImpl.setUSER_DETAILS(getUSER_DETAILS());
		qrcUserImpl.setACTIVE_FLAG(getACTIVE_FLAG());
		qrcUserImpl.setINSERTED_DATE(getINSERTED_DATE());
		qrcUserImpl.setINSERTED_BY(getINSERTED_BY());
		qrcUserImpl.setUPDATED_DATE(getUPDATED_DATE());
		qrcUserImpl.setUPDATED_BY(getUPDATED_BY());
		qrcUserImpl.setDELETED_DATE(getDELETED_DATE());
		qrcUserImpl.setDELETED_BY(getDELETED_BY());

		qrcUserImpl.resetOriginalValues();

		return qrcUserImpl;
	}

	@Override
	public int compareTo(QRCUser qrcUser) {
		int primaryKey = qrcUser.getPrimaryKey();

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

		if (!(obj instanceof QRCUser)) {
			return false;
		}

		QRCUser qrcUser = (QRCUser)obj;

		int primaryKey = qrcUser.getPrimaryKey();

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
	public CacheModel<QRCUser> toCacheModel() {
		QRCUserCacheModel qrcUserCacheModel = new QRCUserCacheModel();

		qrcUserCacheModel.QRC_USER_ID = getQRC_USER_ID();

		qrcUserCacheModel.USER_NAME = getUSER_NAME();

		String USER_NAME = qrcUserCacheModel.USER_NAME;

		if ((USER_NAME != null) && (USER_NAME.length() == 0)) {
			qrcUserCacheModel.USER_NAME = null;
		}

		qrcUserCacheModel.TEAM_ID = getTEAM_ID();

		qrcUserCacheModel.USER_DETAILS = getUSER_DETAILS();

		qrcUserCacheModel.ACTIVE_FLAG = getACTIVE_FLAG();

		String ACTIVE_FLAG = qrcUserCacheModel.ACTIVE_FLAG;

		if ((ACTIVE_FLAG != null) && (ACTIVE_FLAG.length() == 0)) {
			qrcUserCacheModel.ACTIVE_FLAG = null;
		}

		Date INSERTED_DATE = getINSERTED_DATE();

		if (INSERTED_DATE != null) {
			qrcUserCacheModel.INSERTED_DATE = INSERTED_DATE.getTime();
		}
		else {
			qrcUserCacheModel.INSERTED_DATE = Long.MIN_VALUE;
		}

		qrcUserCacheModel.INSERTED_BY = getINSERTED_BY();

		String INSERTED_BY = qrcUserCacheModel.INSERTED_BY;

		if ((INSERTED_BY != null) && (INSERTED_BY.length() == 0)) {
			qrcUserCacheModel.INSERTED_BY = null;
		}

		Date UPDATED_DATE = getUPDATED_DATE();

		if (UPDATED_DATE != null) {
			qrcUserCacheModel.UPDATED_DATE = UPDATED_DATE.getTime();
		}
		else {
			qrcUserCacheModel.UPDATED_DATE = Long.MIN_VALUE;
		}

		qrcUserCacheModel.UPDATED_BY = getUPDATED_BY();

		String UPDATED_BY = qrcUserCacheModel.UPDATED_BY;

		if ((UPDATED_BY != null) && (UPDATED_BY.length() == 0)) {
			qrcUserCacheModel.UPDATED_BY = null;
		}

		Date DELETED_DATE = getDELETED_DATE();

		if (DELETED_DATE != null) {
			qrcUserCacheModel.DELETED_DATE = DELETED_DATE.getTime();
		}
		else {
			qrcUserCacheModel.DELETED_DATE = Long.MIN_VALUE;
		}

		qrcUserCacheModel.DELETED_BY = getDELETED_BY();

		String DELETED_BY = qrcUserCacheModel.DELETED_BY;

		if ((DELETED_BY != null) && (DELETED_BY.length() == 0)) {
			qrcUserCacheModel.DELETED_BY = null;
		}

		return qrcUserCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{QRC_USER_ID=");
		sb.append(getQRC_USER_ID());
		sb.append(", USER_NAME=");
		sb.append(getUSER_NAME());
		sb.append(", TEAM_ID=");
		sb.append(getTEAM_ID());
		sb.append(", USER_DETAILS=");
		sb.append(getUSER_DETAILS());
		sb.append(", ACTIVE_FLAG=");
		sb.append(getACTIVE_FLAG());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", DELETED_DATE=");
		sb.append(getDELETED_DATE());
		sb.append(", DELETED_BY=");
		sb.append(getDELETED_BY());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.QRCUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_USER_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_USER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>USER_NAME</column-name><column-value><![CDATA[");
		sb.append(getUSER_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TEAM_ID</column-name><column-value><![CDATA[");
		sb.append(getTEAM_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>USER_DETAILS</column-name><column-value><![CDATA[");
		sb.append(getUSER_DETAILS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ACTIVE_FLAG</column-name><column-value><![CDATA[");
		sb.append(getACTIVE_FLAG());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_DATE</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_BY</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DELETED_DATE</column-name><column-value><![CDATA[");
		sb.append(getDELETED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DELETED_BY</column-name><column-value><![CDATA[");
		sb.append(getDELETED_BY());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QRCUser.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QRCUser.class
		};
	private int _QRC_USER_ID;
	private String _USER_NAME;
	private int _TEAM_ID;
	private int _USER_DETAILS;
	private String _ACTIVE_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private Date _DELETED_DATE;
	private String _DELETED_BY;
	private QRCUser _escapedModel;
}