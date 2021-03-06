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

import com.ifli.rapid.model.BranchDetails;
import com.ifli.rapid.model.BranchDetailsModel;

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
 * The base model implementation for the BranchDetails service. Represents a row in the &quot;branch_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.BranchDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BranchDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see BranchDetailsImpl
 * @see com.ifli.rapid.model.BranchDetails
 * @see com.ifli.rapid.model.BranchDetailsModel
 * @generated
 */
public class BranchDetailsModelImpl extends BaseModelImpl<BranchDetails>
	implements BranchDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a branch details model instance should use the {@link com.ifli.rapid.model.BranchDetails} interface instead.
	 */
	public static final String TABLE_NAME = "branch_details";
	public static final Object[][] TABLE_COLUMNS = {
			{ "BRANCH_ID", Types.INTEGER },
			{ "LOCATION_ID", Types.INTEGER },
			{ "BRANCH_NAME", Types.VARCHAR },
			{ "BRANCH_OPENING_TIME", Types.VARCHAR },
			{ "BRANCH_CLOSING_TIME", Types.VARCHAR },
			{ "ADDRESS_FIRST_LINE", Types.VARCHAR },
			{ "ADDRESS_SECOND_LINE", Types.VARCHAR },
			{ "CITY", Types.VARCHAR },
			{ "STATE", Types.VARCHAR },
			{ "PIN", Types.VARCHAR },
			{ "PRIMARY_CONTACT_NO", Types.VARCHAR },
			{ "OTHER_CONTACT_NO", Types.VARCHAR },
			{ "FAX_NUMBER", Types.VARCHAR },
			{ "BRANCH_CODE", Types.VARCHAR },
			{ "WORK_TIMINGS", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table branch_details (BRANCH_ID INTEGER not null primary key,LOCATION_ID INTEGER,BRANCH_NAME VARCHAR(75) null,BRANCH_OPENING_TIME VARCHAR(75) null,BRANCH_CLOSING_TIME VARCHAR(75) null,ADDRESS_FIRST_LINE VARCHAR(75) null,ADDRESS_SECOND_LINE VARCHAR(75) null,CITY VARCHAR(75) null,STATE VARCHAR(75) null,PIN VARCHAR(75) null,PRIMARY_CONTACT_NO VARCHAR(75) null,OTHER_CONTACT_NO VARCHAR(75) null,FAX_NUMBER VARCHAR(75) null,BRANCH_CODE VARCHAR(75) null,WORK_TIMINGS VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table branch_details";
	public static final String ORDER_BY_JPQL = " ORDER BY branchDetails.BRANCH_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY branch_details.BRANCH_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.BranchDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.BranchDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.BranchDetails"));

	public BranchDetailsModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _BRANCH_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setBRANCH_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _BRANCH_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BranchDetails.class;
	}

	@Override
	public String getModelClassName() {
		return BranchDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("BRANCH_ID", getBRANCH_ID());
		attributes.put("LOCATION_ID", getLOCATION_ID());
		attributes.put("BRANCH_NAME", getBRANCH_NAME());
		attributes.put("BRANCH_OPENING_TIME", getBRANCH_OPENING_TIME());
		attributes.put("BRANCH_CLOSING_TIME", getBRANCH_CLOSING_TIME());
		attributes.put("ADDRESS_FIRST_LINE", getADDRESS_FIRST_LINE());
		attributes.put("ADDRESS_SECOND_LINE", getADDRESS_SECOND_LINE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("PIN", getPIN());
		attributes.put("PRIMARY_CONTACT_NO", getPRIMARY_CONTACT_NO());
		attributes.put("OTHER_CONTACT_NO", getOTHER_CONTACT_NO());
		attributes.put("FAX_NUMBER", getFAX_NUMBER());
		attributes.put("BRANCH_CODE", getBRANCH_CODE());
		attributes.put("WORK_TIMINGS", getWORK_TIMINGS());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer BRANCH_ID = (Integer)attributes.get("BRANCH_ID");

		if (BRANCH_ID != null) {
			setBRANCH_ID(BRANCH_ID);
		}

		Integer LOCATION_ID = (Integer)attributes.get("LOCATION_ID");

		if (LOCATION_ID != null) {
			setLOCATION_ID(LOCATION_ID);
		}

		String BRANCH_NAME = (String)attributes.get("BRANCH_NAME");

		if (BRANCH_NAME != null) {
			setBRANCH_NAME(BRANCH_NAME);
		}

		String BRANCH_OPENING_TIME = (String)attributes.get(
				"BRANCH_OPENING_TIME");

		if (BRANCH_OPENING_TIME != null) {
			setBRANCH_OPENING_TIME(BRANCH_OPENING_TIME);
		}

		String BRANCH_CLOSING_TIME = (String)attributes.get(
				"BRANCH_CLOSING_TIME");

		if (BRANCH_CLOSING_TIME != null) {
			setBRANCH_CLOSING_TIME(BRANCH_CLOSING_TIME);
		}

		String ADDRESS_FIRST_LINE = (String)attributes.get("ADDRESS_FIRST_LINE");

		if (ADDRESS_FIRST_LINE != null) {
			setADDRESS_FIRST_LINE(ADDRESS_FIRST_LINE);
		}

		String ADDRESS_SECOND_LINE = (String)attributes.get(
				"ADDRESS_SECOND_LINE");

		if (ADDRESS_SECOND_LINE != null) {
			setADDRESS_SECOND_LINE(ADDRESS_SECOND_LINE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		String PIN = (String)attributes.get("PIN");

		if (PIN != null) {
			setPIN(PIN);
		}

		String PRIMARY_CONTACT_NO = (String)attributes.get("PRIMARY_CONTACT_NO");

		if (PRIMARY_CONTACT_NO != null) {
			setPRIMARY_CONTACT_NO(PRIMARY_CONTACT_NO);
		}

		String OTHER_CONTACT_NO = (String)attributes.get("OTHER_CONTACT_NO");

		if (OTHER_CONTACT_NO != null) {
			setOTHER_CONTACT_NO(OTHER_CONTACT_NO);
		}

		String FAX_NUMBER = (String)attributes.get("FAX_NUMBER");

		if (FAX_NUMBER != null) {
			setFAX_NUMBER(FAX_NUMBER);
		}

		String BRANCH_CODE = (String)attributes.get("BRANCH_CODE");

		if (BRANCH_CODE != null) {
			setBRANCH_CODE(BRANCH_CODE);
		}

		String WORK_TIMINGS = (String)attributes.get("WORK_TIMINGS");

		if (WORK_TIMINGS != null) {
			setWORK_TIMINGS(WORK_TIMINGS);
		}
	}

	@Override
	public int getBRANCH_ID() {
		return _BRANCH_ID;
	}

	@Override
	public void setBRANCH_ID(int BRANCH_ID) {
		_BRANCH_ID = BRANCH_ID;
	}

	@Override
	public int getLOCATION_ID() {
		return _LOCATION_ID;
	}

	@Override
	public void setLOCATION_ID(int LOCATION_ID) {
		_LOCATION_ID = LOCATION_ID;
	}

	@Override
	public String getBRANCH_NAME() {
		if (_BRANCH_NAME == null) {
			return StringPool.BLANK;
		}
		else {
			return _BRANCH_NAME;
		}
	}

	@Override
	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;
	}

	@Override
	public String getBRANCH_OPENING_TIME() {
		if (_BRANCH_OPENING_TIME == null) {
			return StringPool.BLANK;
		}
		else {
			return _BRANCH_OPENING_TIME;
		}
	}

	@Override
	public void setBRANCH_OPENING_TIME(String BRANCH_OPENING_TIME) {
		_BRANCH_OPENING_TIME = BRANCH_OPENING_TIME;
	}

	@Override
	public String getBRANCH_CLOSING_TIME() {
		if (_BRANCH_CLOSING_TIME == null) {
			return StringPool.BLANK;
		}
		else {
			return _BRANCH_CLOSING_TIME;
		}
	}

	@Override
	public void setBRANCH_CLOSING_TIME(String BRANCH_CLOSING_TIME) {
		_BRANCH_CLOSING_TIME = BRANCH_CLOSING_TIME;
	}

	@Override
	public String getADDRESS_FIRST_LINE() {
		if (_ADDRESS_FIRST_LINE == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDRESS_FIRST_LINE;
		}
	}

	@Override
	public void setADDRESS_FIRST_LINE(String ADDRESS_FIRST_LINE) {
		_ADDRESS_FIRST_LINE = ADDRESS_FIRST_LINE;
	}

	@Override
	public String getADDRESS_SECOND_LINE() {
		if (_ADDRESS_SECOND_LINE == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDRESS_SECOND_LINE;
		}
	}

	@Override
	public void setADDRESS_SECOND_LINE(String ADDRESS_SECOND_LINE) {
		_ADDRESS_SECOND_LINE = ADDRESS_SECOND_LINE;
	}

	@Override
	public String getCITY() {
		if (_CITY == null) {
			return StringPool.BLANK;
		}
		else {
			return _CITY;
		}
	}

	@Override
	public void setCITY(String CITY) {
		_CITY = CITY;
	}

	@Override
	public String getSTATE() {
		if (_STATE == null) {
			return StringPool.BLANK;
		}
		else {
			return _STATE;
		}
	}

	@Override
	public void setSTATE(String STATE) {
		_STATE = STATE;
	}

	@Override
	public String getPIN() {
		if (_PIN == null) {
			return StringPool.BLANK;
		}
		else {
			return _PIN;
		}
	}

	@Override
	public void setPIN(String PIN) {
		_PIN = PIN;
	}

	@Override
	public String getPRIMARY_CONTACT_NO() {
		if (_PRIMARY_CONTACT_NO == null) {
			return StringPool.BLANK;
		}
		else {
			return _PRIMARY_CONTACT_NO;
		}
	}

	@Override
	public void setPRIMARY_CONTACT_NO(String PRIMARY_CONTACT_NO) {
		_PRIMARY_CONTACT_NO = PRIMARY_CONTACT_NO;
	}

	@Override
	public String getOTHER_CONTACT_NO() {
		if (_OTHER_CONTACT_NO == null) {
			return StringPool.BLANK;
		}
		else {
			return _OTHER_CONTACT_NO;
		}
	}

	@Override
	public void setOTHER_CONTACT_NO(String OTHER_CONTACT_NO) {
		_OTHER_CONTACT_NO = OTHER_CONTACT_NO;
	}

	@Override
	public String getFAX_NUMBER() {
		if (_FAX_NUMBER == null) {
			return StringPool.BLANK;
		}
		else {
			return _FAX_NUMBER;
		}
	}

	@Override
	public void setFAX_NUMBER(String FAX_NUMBER) {
		_FAX_NUMBER = FAX_NUMBER;
	}

	@Override
	public String getBRANCH_CODE() {
		if (_BRANCH_CODE == null) {
			return StringPool.BLANK;
		}
		else {
			return _BRANCH_CODE;
		}
	}

	@Override
	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;
	}

	@Override
	public String getWORK_TIMINGS() {
		if (_WORK_TIMINGS == null) {
			return StringPool.BLANK;
		}
		else {
			return _WORK_TIMINGS;
		}
	}

	@Override
	public void setWORK_TIMINGS(String WORK_TIMINGS) {
		_WORK_TIMINGS = WORK_TIMINGS;
	}

	@Override
	public BranchDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BranchDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BranchDetailsImpl branchDetailsImpl = new BranchDetailsImpl();

		branchDetailsImpl.setBRANCH_ID(getBRANCH_ID());
		branchDetailsImpl.setLOCATION_ID(getLOCATION_ID());
		branchDetailsImpl.setBRANCH_NAME(getBRANCH_NAME());
		branchDetailsImpl.setBRANCH_OPENING_TIME(getBRANCH_OPENING_TIME());
		branchDetailsImpl.setBRANCH_CLOSING_TIME(getBRANCH_CLOSING_TIME());
		branchDetailsImpl.setADDRESS_FIRST_LINE(getADDRESS_FIRST_LINE());
		branchDetailsImpl.setADDRESS_SECOND_LINE(getADDRESS_SECOND_LINE());
		branchDetailsImpl.setCITY(getCITY());
		branchDetailsImpl.setSTATE(getSTATE());
		branchDetailsImpl.setPIN(getPIN());
		branchDetailsImpl.setPRIMARY_CONTACT_NO(getPRIMARY_CONTACT_NO());
		branchDetailsImpl.setOTHER_CONTACT_NO(getOTHER_CONTACT_NO());
		branchDetailsImpl.setFAX_NUMBER(getFAX_NUMBER());
		branchDetailsImpl.setBRANCH_CODE(getBRANCH_CODE());
		branchDetailsImpl.setWORK_TIMINGS(getWORK_TIMINGS());

		branchDetailsImpl.resetOriginalValues();

		return branchDetailsImpl;
	}

	@Override
	public int compareTo(BranchDetails branchDetails) {
		int primaryKey = branchDetails.getPrimaryKey();

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

		if (!(obj instanceof BranchDetails)) {
			return false;
		}

		BranchDetails branchDetails = (BranchDetails)obj;

		int primaryKey = branchDetails.getPrimaryKey();

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
	public CacheModel<BranchDetails> toCacheModel() {
		BranchDetailsCacheModel branchDetailsCacheModel = new BranchDetailsCacheModel();

		branchDetailsCacheModel.BRANCH_ID = getBRANCH_ID();

		branchDetailsCacheModel.LOCATION_ID = getLOCATION_ID();

		branchDetailsCacheModel.BRANCH_NAME = getBRANCH_NAME();

		String BRANCH_NAME = branchDetailsCacheModel.BRANCH_NAME;

		if ((BRANCH_NAME != null) && (BRANCH_NAME.length() == 0)) {
			branchDetailsCacheModel.BRANCH_NAME = null;
		}

		branchDetailsCacheModel.BRANCH_OPENING_TIME = getBRANCH_OPENING_TIME();

		String BRANCH_OPENING_TIME = branchDetailsCacheModel.BRANCH_OPENING_TIME;

		if ((BRANCH_OPENING_TIME != null) &&
				(BRANCH_OPENING_TIME.length() == 0)) {
			branchDetailsCacheModel.BRANCH_OPENING_TIME = null;
		}

		branchDetailsCacheModel.BRANCH_CLOSING_TIME = getBRANCH_CLOSING_TIME();

		String BRANCH_CLOSING_TIME = branchDetailsCacheModel.BRANCH_CLOSING_TIME;

		if ((BRANCH_CLOSING_TIME != null) &&
				(BRANCH_CLOSING_TIME.length() == 0)) {
			branchDetailsCacheModel.BRANCH_CLOSING_TIME = null;
		}

		branchDetailsCacheModel.ADDRESS_FIRST_LINE = getADDRESS_FIRST_LINE();

		String ADDRESS_FIRST_LINE = branchDetailsCacheModel.ADDRESS_FIRST_LINE;

		if ((ADDRESS_FIRST_LINE != null) && (ADDRESS_FIRST_LINE.length() == 0)) {
			branchDetailsCacheModel.ADDRESS_FIRST_LINE = null;
		}

		branchDetailsCacheModel.ADDRESS_SECOND_LINE = getADDRESS_SECOND_LINE();

		String ADDRESS_SECOND_LINE = branchDetailsCacheModel.ADDRESS_SECOND_LINE;

		if ((ADDRESS_SECOND_LINE != null) &&
				(ADDRESS_SECOND_LINE.length() == 0)) {
			branchDetailsCacheModel.ADDRESS_SECOND_LINE = null;
		}

		branchDetailsCacheModel.CITY = getCITY();

		String CITY = branchDetailsCacheModel.CITY;

		if ((CITY != null) && (CITY.length() == 0)) {
			branchDetailsCacheModel.CITY = null;
		}

		branchDetailsCacheModel.STATE = getSTATE();

		String STATE = branchDetailsCacheModel.STATE;

		if ((STATE != null) && (STATE.length() == 0)) {
			branchDetailsCacheModel.STATE = null;
		}

		branchDetailsCacheModel.PIN = getPIN();

		String PIN = branchDetailsCacheModel.PIN;

		if ((PIN != null) && (PIN.length() == 0)) {
			branchDetailsCacheModel.PIN = null;
		}

		branchDetailsCacheModel.PRIMARY_CONTACT_NO = getPRIMARY_CONTACT_NO();

		String PRIMARY_CONTACT_NO = branchDetailsCacheModel.PRIMARY_CONTACT_NO;

		if ((PRIMARY_CONTACT_NO != null) && (PRIMARY_CONTACT_NO.length() == 0)) {
			branchDetailsCacheModel.PRIMARY_CONTACT_NO = null;
		}

		branchDetailsCacheModel.OTHER_CONTACT_NO = getOTHER_CONTACT_NO();

		String OTHER_CONTACT_NO = branchDetailsCacheModel.OTHER_CONTACT_NO;

		if ((OTHER_CONTACT_NO != null) && (OTHER_CONTACT_NO.length() == 0)) {
			branchDetailsCacheModel.OTHER_CONTACT_NO = null;
		}

		branchDetailsCacheModel.FAX_NUMBER = getFAX_NUMBER();

		String FAX_NUMBER = branchDetailsCacheModel.FAX_NUMBER;

		if ((FAX_NUMBER != null) && (FAX_NUMBER.length() == 0)) {
			branchDetailsCacheModel.FAX_NUMBER = null;
		}

		branchDetailsCacheModel.BRANCH_CODE = getBRANCH_CODE();

		String BRANCH_CODE = branchDetailsCacheModel.BRANCH_CODE;

		if ((BRANCH_CODE != null) && (BRANCH_CODE.length() == 0)) {
			branchDetailsCacheModel.BRANCH_CODE = null;
		}

		branchDetailsCacheModel.WORK_TIMINGS = getWORK_TIMINGS();

		String WORK_TIMINGS = branchDetailsCacheModel.WORK_TIMINGS;

		if ((WORK_TIMINGS != null) && (WORK_TIMINGS.length() == 0)) {
			branchDetailsCacheModel.WORK_TIMINGS = null;
		}

		return branchDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{BRANCH_ID=");
		sb.append(getBRANCH_ID());
		sb.append(", LOCATION_ID=");
		sb.append(getLOCATION_ID());
		sb.append(", BRANCH_NAME=");
		sb.append(getBRANCH_NAME());
		sb.append(", BRANCH_OPENING_TIME=");
		sb.append(getBRANCH_OPENING_TIME());
		sb.append(", BRANCH_CLOSING_TIME=");
		sb.append(getBRANCH_CLOSING_TIME());
		sb.append(", ADDRESS_FIRST_LINE=");
		sb.append(getADDRESS_FIRST_LINE());
		sb.append(", ADDRESS_SECOND_LINE=");
		sb.append(getADDRESS_SECOND_LINE());
		sb.append(", CITY=");
		sb.append(getCITY());
		sb.append(", STATE=");
		sb.append(getSTATE());
		sb.append(", PIN=");
		sb.append(getPIN());
		sb.append(", PRIMARY_CONTACT_NO=");
		sb.append(getPRIMARY_CONTACT_NO());
		sb.append(", OTHER_CONTACT_NO=");
		sb.append(getOTHER_CONTACT_NO());
		sb.append(", FAX_NUMBER=");
		sb.append(getFAX_NUMBER());
		sb.append(", BRANCH_CODE=");
		sb.append(getBRANCH_CODE());
		sb.append(", WORK_TIMINGS=");
		sb.append(getWORK_TIMINGS());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.BranchDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>BRANCH_ID</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCATION_ID</column-name><column-value><![CDATA[");
		sb.append(getLOCATION_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_NAME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_OPENING_TIME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_OPENING_TIME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CLOSING_TIME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CLOSING_TIME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_FIRST_LINE</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_FIRST_LINE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_SECOND_LINE</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_SECOND_LINE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY</column-name><column-value><![CDATA[");
		sb.append(getCITY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE</column-name><column-value><![CDATA[");
		sb.append(getSTATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PIN</column-name><column-value><![CDATA[");
		sb.append(getPIN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PRIMARY_CONTACT_NO</column-name><column-value><![CDATA[");
		sb.append(getPRIMARY_CONTACT_NO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OTHER_CONTACT_NO</column-name><column-value><![CDATA[");
		sb.append(getOTHER_CONTACT_NO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FAX_NUMBER</column-name><column-value><![CDATA[");
		sb.append(getFAX_NUMBER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CODE</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WORK_TIMINGS</column-name><column-value><![CDATA[");
		sb.append(getWORK_TIMINGS());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = BranchDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			BranchDetails.class
		};
	private int _BRANCH_ID;
	private int _LOCATION_ID;
	private String _BRANCH_NAME;
	private String _BRANCH_OPENING_TIME;
	private String _BRANCH_CLOSING_TIME;
	private String _ADDRESS_FIRST_LINE;
	private String _ADDRESS_SECOND_LINE;
	private String _CITY;
	private String _STATE;
	private String _PIN;
	private String _PRIMARY_CONTACT_NO;
	private String _OTHER_CONTACT_NO;
	private String _FAX_NUMBER;
	private String _BRANCH_CODE;
	private String _WORK_TIMINGS;
	private BranchDetails _escapedModel;
}