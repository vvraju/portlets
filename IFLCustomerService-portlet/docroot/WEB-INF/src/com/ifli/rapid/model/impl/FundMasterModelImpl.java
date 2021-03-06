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

import com.ifli.rapid.model.FundMaster;
import com.ifli.rapid.model.FundMasterModel;

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
 * The base model implementation for the FundMaster service. Represents a row in the &quot;fund_master&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.FundMasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FundMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see FundMasterImpl
 * @see com.ifli.rapid.model.FundMaster
 * @see com.ifli.rapid.model.FundMasterModel
 * @generated
 */
public class FundMasterModelImpl extends BaseModelImpl<FundMaster>
	implements FundMasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fund master model instance should use the {@link com.ifli.rapid.model.FundMaster} interface instead.
	 */
	public static final String TABLE_NAME = "fund_master";
	public static final Object[][] TABLE_COLUMNS = {
			{ "FUND_ID", Types.INTEGER },
			{ "FUND_NAME", Types.VARCHAR },
			{ "FUND_CODE", Types.VARCHAR },
			{ "INSERTED_DATE", Types.TIMESTAMP },
			{ "INSERTED_BY", Types.VARCHAR },
			{ "UPDATED_DATE", Types.TIMESTAMP },
			{ "UPDATED_BY", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table fund_master (FUND_ID INTEGER not null primary key IDENTITY,FUND_NAME VARCHAR(75) null,FUND_CODE VARCHAR(75) null,INSERTED_DATE DATE null,INSERTED_BY VARCHAR(75) null,UPDATED_DATE DATE null,UPDATED_BY VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table fund_master";
	public static final String ORDER_BY_JPQL = " ORDER BY fundMaster.FUND_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY fund_master.FUND_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.FundMaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.FundMaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ifli.rapid.model.FundMaster"),
			true);
	public static long FUND_CODE_COLUMN_BITMASK = 1L;
	public static long FUND_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.FundMaster"));

	public FundMasterModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _FUND_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setFUND_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FUND_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FundMaster.class;
	}

	@Override
	public String getModelClassName() {
		return FundMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FUND_ID", getFUND_ID());
		attributes.put("FUND_NAME", getFUND_NAME());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer FUND_ID = (Integer)attributes.get("FUND_ID");

		if (FUND_ID != null) {
			setFUND_ID(FUND_ID);
		}

		String FUND_NAME = (String)attributes.get("FUND_NAME");

		if (FUND_NAME != null) {
			setFUND_NAME(FUND_NAME);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
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
	}

	@Override
	public int getFUND_ID() {
		return _FUND_ID;
	}

	@Override
	public void setFUND_ID(int FUND_ID) {
		_FUND_ID = FUND_ID;
	}

	@Override
	public String getFUND_NAME() {
		if (_FUND_NAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _FUND_NAME;
		}
	}

	@Override
	public void setFUND_NAME(String FUND_NAME) {
		_FUND_NAME = FUND_NAME;
	}

	@Override
	public String getFUND_CODE() {
		if (_FUND_CODE == null) {
			return StringPool.BLANK;
		}
		else {
			return _FUND_CODE;
		}
	}

	@Override
	public void setFUND_CODE(String FUND_CODE) {
		_columnBitmask |= FUND_CODE_COLUMN_BITMASK;

		if (_originalFUND_CODE == null) {
			_originalFUND_CODE = _FUND_CODE;
		}

		_FUND_CODE = FUND_CODE;
	}

	public String getOriginalFUND_CODE() {
		return GetterUtil.getString(_originalFUND_CODE);
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public FundMaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FundMaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FundMasterImpl fundMasterImpl = new FundMasterImpl();

		fundMasterImpl.setFUND_ID(getFUND_ID());
		fundMasterImpl.setFUND_NAME(getFUND_NAME());
		fundMasterImpl.setFUND_CODE(getFUND_CODE());
		fundMasterImpl.setINSERTED_DATE(getINSERTED_DATE());
		fundMasterImpl.setINSERTED_BY(getINSERTED_BY());
		fundMasterImpl.setUPDATED_DATE(getUPDATED_DATE());
		fundMasterImpl.setUPDATED_BY(getUPDATED_BY());

		fundMasterImpl.resetOriginalValues();

		return fundMasterImpl;
	}

	@Override
	public int compareTo(FundMaster fundMaster) {
		int primaryKey = fundMaster.getPrimaryKey();

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

		if (!(obj instanceof FundMaster)) {
			return false;
		}

		FundMaster fundMaster = (FundMaster)obj;

		int primaryKey = fundMaster.getPrimaryKey();

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
		FundMasterModelImpl fundMasterModelImpl = this;

		fundMasterModelImpl._originalFUND_CODE = fundMasterModelImpl._FUND_CODE;

		fundMasterModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FundMaster> toCacheModel() {
		FundMasterCacheModel fundMasterCacheModel = new FundMasterCacheModel();

		fundMasterCacheModel.FUND_ID = getFUND_ID();

		fundMasterCacheModel.FUND_NAME = getFUND_NAME();

		String FUND_NAME = fundMasterCacheModel.FUND_NAME;

		if ((FUND_NAME != null) && (FUND_NAME.length() == 0)) {
			fundMasterCacheModel.FUND_NAME = null;
		}

		fundMasterCacheModel.FUND_CODE = getFUND_CODE();

		String FUND_CODE = fundMasterCacheModel.FUND_CODE;

		if ((FUND_CODE != null) && (FUND_CODE.length() == 0)) {
			fundMasterCacheModel.FUND_CODE = null;
		}

		Date INSERTED_DATE = getINSERTED_DATE();

		if (INSERTED_DATE != null) {
			fundMasterCacheModel.INSERTED_DATE = INSERTED_DATE.getTime();
		}
		else {
			fundMasterCacheModel.INSERTED_DATE = Long.MIN_VALUE;
		}

		fundMasterCacheModel.INSERTED_BY = getINSERTED_BY();

		String INSERTED_BY = fundMasterCacheModel.INSERTED_BY;

		if ((INSERTED_BY != null) && (INSERTED_BY.length() == 0)) {
			fundMasterCacheModel.INSERTED_BY = null;
		}

		Date UPDATED_DATE = getUPDATED_DATE();

		if (UPDATED_DATE != null) {
			fundMasterCacheModel.UPDATED_DATE = UPDATED_DATE.getTime();
		}
		else {
			fundMasterCacheModel.UPDATED_DATE = Long.MIN_VALUE;
		}

		fundMasterCacheModel.UPDATED_BY = getUPDATED_BY();

		String UPDATED_BY = fundMasterCacheModel.UPDATED_BY;

		if ((UPDATED_BY != null) && (UPDATED_BY.length() == 0)) {
			fundMasterCacheModel.UPDATED_BY = null;
		}

		return fundMasterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{FUND_ID=");
		sb.append(getFUND_ID());
		sb.append(", FUND_NAME=");
		sb.append(getFUND_NAME());
		sb.append(", FUND_CODE=");
		sb.append(getFUND_CODE());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.FundMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FUND_ID</column-name><column-value><![CDATA[");
		sb.append(getFUND_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_NAME</column-name><column-value><![CDATA[");
		sb.append(getFUND_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_CODE</column-name><column-value><![CDATA[");
		sb.append(getFUND_CODE());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = FundMaster.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			FundMaster.class
		};
	private int _FUND_ID;
	private String _FUND_NAME;
	private String _FUND_CODE;
	private String _originalFUND_CODE;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private long _columnBitmask;
	private FundMaster _escapedModel;
}