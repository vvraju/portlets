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

import com.ifli.rapid.model.customerAddress;
import com.ifli.rapid.model.customerAddressModel;

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
 * The base model implementation for the customerAddress service. Represents a row in the &quot;customer_address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.customerAddressModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link customerAddressImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see customerAddressImpl
 * @see com.ifli.rapid.model.customerAddress
 * @see com.ifli.rapid.model.customerAddressModel
 * @generated
 */
public class customerAddressModelImpl extends BaseModelImpl<customerAddress>
	implements customerAddressModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a customer address model instance should use the {@link com.ifli.rapid.model.customerAddress} interface instead.
	 */
	public static final String TABLE_NAME = "customer_address";
	public static final Object[][] TABLE_COLUMNS = {
			{ "CUSTOMER_ADDRESS_ID", Types.INTEGER },
			{ "CUSTOMER_ID", Types.INTEGER },
			{ "ADDRESS_LINE_1", Types.VARCHAR },
			{ "ADDRESS_LINE_2", Types.VARCHAR },
			{ "ADDRESS_LINE_3", Types.VARCHAR },
			{ "CHANGE_REQUEST_TYPE", Types.VARCHAR },
			{ "CITY", Types.VARCHAR },
			{ "STATE", Types.VARCHAR },
			{ "CITY_ID", Types.INTEGER },
			{ "STATE_ID", Types.INTEGER },
			{ "PIN_CODE", Types.VARCHAR },
			{ "CHANGE_REQUEST_FOR", Types.INTEGER },
			{ "ADDRESS_TYPE_ID", Types.INTEGER },
			{ "ADDR_STATUS", Types.VARCHAR },
			{ "INSERTED_BY", Types.VARCHAR },
			{ "INSERTED_DATE", Types.TIMESTAMP },
			{ "UPDATED_BY", Types.VARCHAR },
			{ "UPDATED_DATE", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table customer_address (CUSTOMER_ADDRESS_ID INTEGER not null primary key,CUSTOMER_ID INTEGER,ADDRESS_LINE_1 VARCHAR(75) null,ADDRESS_LINE_2 VARCHAR(75) null,ADDRESS_LINE_3 VARCHAR(75) null,CHANGE_REQUEST_TYPE VARCHAR(75) null,CITY VARCHAR(75) null,STATE VARCHAR(75) null,CITY_ID INTEGER,STATE_ID INTEGER,PIN_CODE VARCHAR(75) null,CHANGE_REQUEST_FOR INTEGER,ADDRESS_TYPE_ID INTEGER,ADDR_STATUS VARCHAR(75) null,INSERTED_BY VARCHAR(75) null,INSERTED_DATE DATE null,UPDATED_BY VARCHAR(75) null,UPDATED_DATE DATE null)";
	public static final String TABLE_SQL_DROP = "drop table customer_address";
	public static final String ORDER_BY_JPQL = " ORDER BY customerAddress.CUSTOMER_ADDRESS_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY customer_address.CUSTOMER_ADDRESS_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.customerAddress"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.customerAddress"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.customerAddress"));

	public customerAddressModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setCUSTOMER_ADDRESS_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return customerAddress.class;
	}

	@Override
	public String getModelClassName() {
		return customerAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CUSTOMER_ADDRESS_ID", getCUSTOMER_ADDRESS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("ADDRESS_LINE_1", getADDRESS_LINE_1());
		attributes.put("ADDRESS_LINE_2", getADDRESS_LINE_2());
		attributes.put("ADDRESS_LINE_3", getADDRESS_LINE_3());
		attributes.put("CHANGE_REQUEST_TYPE", getCHANGE_REQUEST_TYPE());
		attributes.put("CITY", getCITY());
		attributes.put("STATE", getSTATE());
		attributes.put("CITY_ID", getCITY_ID());
		attributes.put("STATE_ID", getSTATE_ID());
		attributes.put("PIN_CODE", getPIN_CODE());
		attributes.put("CHANGE_REQUEST_FOR", getCHANGE_REQUEST_FOR());
		attributes.put("ADDRESS_TYPE_ID", getADDRESS_TYPE_ID());
		attributes.put("ADDR_STATUS", getADDR_STATUS());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer CUSTOMER_ADDRESS_ID = (Integer)attributes.get(
				"CUSTOMER_ADDRESS_ID");

		if (CUSTOMER_ADDRESS_ID != null) {
			setCUSTOMER_ADDRESS_ID(CUSTOMER_ADDRESS_ID);
		}

		Integer CUSTOMER_ID = (Integer)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String ADDRESS_LINE_1 = (String)attributes.get("ADDRESS_LINE_1");

		if (ADDRESS_LINE_1 != null) {
			setADDRESS_LINE_1(ADDRESS_LINE_1);
		}

		String ADDRESS_LINE_2 = (String)attributes.get("ADDRESS_LINE_2");

		if (ADDRESS_LINE_2 != null) {
			setADDRESS_LINE_2(ADDRESS_LINE_2);
		}

		String ADDRESS_LINE_3 = (String)attributes.get("ADDRESS_LINE_3");

		if (ADDRESS_LINE_3 != null) {
			setADDRESS_LINE_3(ADDRESS_LINE_3);
		}

		String CHANGE_REQUEST_TYPE = (String)attributes.get(
				"CHANGE_REQUEST_TYPE");

		if (CHANGE_REQUEST_TYPE != null) {
			setCHANGE_REQUEST_TYPE(CHANGE_REQUEST_TYPE);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		Integer CITY_ID = (Integer)attributes.get("CITY_ID");

		if (CITY_ID != null) {
			setCITY_ID(CITY_ID);
		}

		Integer STATE_ID = (Integer)attributes.get("STATE_ID");

		if (STATE_ID != null) {
			setSTATE_ID(STATE_ID);
		}

		String PIN_CODE = (String)attributes.get("PIN_CODE");

		if (PIN_CODE != null) {
			setPIN_CODE(PIN_CODE);
		}

		Integer CHANGE_REQUEST_FOR = (Integer)attributes.get(
				"CHANGE_REQUEST_FOR");

		if (CHANGE_REQUEST_FOR != null) {
			setCHANGE_REQUEST_FOR(CHANGE_REQUEST_FOR);
		}

		Integer ADDRESS_TYPE_ID = (Integer)attributes.get("ADDRESS_TYPE_ID");

		if (ADDRESS_TYPE_ID != null) {
			setADDRESS_TYPE_ID(ADDRESS_TYPE_ID);
		}

		String ADDR_STATUS = (String)attributes.get("ADDR_STATUS");

		if (ADDR_STATUS != null) {
			setADDR_STATUS(ADDR_STATUS);
		}

		String INSERTED_BY = (String)attributes.get("INSERTED_BY");

		if (INSERTED_BY != null) {
			setINSERTED_BY(INSERTED_BY);
		}

		Date INSERTED_DATE = (Date)attributes.get("INSERTED_DATE");

		if (INSERTED_DATE != null) {
			setINSERTED_DATE(INSERTED_DATE);
		}

		String UPDATED_BY = (String)attributes.get("UPDATED_BY");

		if (UPDATED_BY != null) {
			setUPDATED_BY(UPDATED_BY);
		}

		Date UPDATED_DATE = (Date)attributes.get("UPDATED_DATE");

		if (UPDATED_DATE != null) {
			setUPDATED_DATE(UPDATED_DATE);
		}
	}

	@Override
	public int getCUSTOMER_ADDRESS_ID() {
		return _CUSTOMER_ADDRESS_ID;
	}

	@Override
	public void setCUSTOMER_ADDRESS_ID(int CUSTOMER_ADDRESS_ID) {
		_CUSTOMER_ADDRESS_ID = CUSTOMER_ADDRESS_ID;
	}

	@Override
	public int getCUSTOMER_ID() {
		return _CUSTOMER_ID;
	}

	@Override
	public void setCUSTOMER_ID(int CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	@Override
	public String getADDRESS_LINE_1() {
		if (_ADDRESS_LINE_1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDRESS_LINE_1;
		}
	}

	@Override
	public void setADDRESS_LINE_1(String ADDRESS_LINE_1) {
		_ADDRESS_LINE_1 = ADDRESS_LINE_1;
	}

	@Override
	public String getADDRESS_LINE_2() {
		if (_ADDRESS_LINE_2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDRESS_LINE_2;
		}
	}

	@Override
	public void setADDRESS_LINE_2(String ADDRESS_LINE_2) {
		_ADDRESS_LINE_2 = ADDRESS_LINE_2;
	}

	@Override
	public String getADDRESS_LINE_3() {
		if (_ADDRESS_LINE_3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDRESS_LINE_3;
		}
	}

	@Override
	public void setADDRESS_LINE_3(String ADDRESS_LINE_3) {
		_ADDRESS_LINE_3 = ADDRESS_LINE_3;
	}

	@Override
	public String getCHANGE_REQUEST_TYPE() {
		if (_CHANGE_REQUEST_TYPE == null) {
			return StringPool.BLANK;
		}
		else {
			return _CHANGE_REQUEST_TYPE;
		}
	}

	@Override
	public void setCHANGE_REQUEST_TYPE(String CHANGE_REQUEST_TYPE) {
		_CHANGE_REQUEST_TYPE = CHANGE_REQUEST_TYPE;
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
	public int getCITY_ID() {
		return _CITY_ID;
	}

	@Override
	public void setCITY_ID(int CITY_ID) {
		_CITY_ID = CITY_ID;
	}

	@Override
	public int getSTATE_ID() {
		return _STATE_ID;
	}

	@Override
	public void setSTATE_ID(int STATE_ID) {
		_STATE_ID = STATE_ID;
	}

	@Override
	public String getPIN_CODE() {
		if (_PIN_CODE == null) {
			return StringPool.BLANK;
		}
		else {
			return _PIN_CODE;
		}
	}

	@Override
	public void setPIN_CODE(String PIN_CODE) {
		_PIN_CODE = PIN_CODE;
	}

	@Override
	public int getCHANGE_REQUEST_FOR() {
		return _CHANGE_REQUEST_FOR;
	}

	@Override
	public void setCHANGE_REQUEST_FOR(int CHANGE_REQUEST_FOR) {
		_CHANGE_REQUEST_FOR = CHANGE_REQUEST_FOR;
	}

	@Override
	public int getADDRESS_TYPE_ID() {
		return _ADDRESS_TYPE_ID;
	}

	@Override
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID) {
		_ADDRESS_TYPE_ID = ADDRESS_TYPE_ID;
	}

	@Override
	public String getADDR_STATUS() {
		if (_ADDR_STATUS == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDR_STATUS;
		}
	}

	@Override
	public void setADDR_STATUS(String ADDR_STATUS) {
		_ADDR_STATUS = ADDR_STATUS;
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
	public Date getINSERTED_DATE() {
		return _INSERTED_DATE;
	}

	@Override
	public void setINSERTED_DATE(Date INSERTED_DATE) {
		_INSERTED_DATE = INSERTED_DATE;
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
	public Date getUPDATED_DATE() {
		return _UPDATED_DATE;
	}

	@Override
	public void setUPDATED_DATE(Date UPDATED_DATE) {
		_UPDATED_DATE = UPDATED_DATE;
	}

	@Override
	public customerAddress toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (customerAddress)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		customerAddressImpl customerAddressImpl = new customerAddressImpl();

		customerAddressImpl.setCUSTOMER_ADDRESS_ID(getCUSTOMER_ADDRESS_ID());
		customerAddressImpl.setCUSTOMER_ID(getCUSTOMER_ID());
		customerAddressImpl.setADDRESS_LINE_1(getADDRESS_LINE_1());
		customerAddressImpl.setADDRESS_LINE_2(getADDRESS_LINE_2());
		customerAddressImpl.setADDRESS_LINE_3(getADDRESS_LINE_3());
		customerAddressImpl.setCHANGE_REQUEST_TYPE(getCHANGE_REQUEST_TYPE());
		customerAddressImpl.setCITY(getCITY());
		customerAddressImpl.setSTATE(getSTATE());
		customerAddressImpl.setCITY_ID(getCITY_ID());
		customerAddressImpl.setSTATE_ID(getSTATE_ID());
		customerAddressImpl.setPIN_CODE(getPIN_CODE());
		customerAddressImpl.setCHANGE_REQUEST_FOR(getCHANGE_REQUEST_FOR());
		customerAddressImpl.setADDRESS_TYPE_ID(getADDRESS_TYPE_ID());
		customerAddressImpl.setADDR_STATUS(getADDR_STATUS());
		customerAddressImpl.setINSERTED_BY(getINSERTED_BY());
		customerAddressImpl.setINSERTED_DATE(getINSERTED_DATE());
		customerAddressImpl.setUPDATED_BY(getUPDATED_BY());
		customerAddressImpl.setUPDATED_DATE(getUPDATED_DATE());

		customerAddressImpl.resetOriginalValues();

		return customerAddressImpl;
	}

	@Override
	public int compareTo(customerAddress customerAddress) {
		int primaryKey = customerAddress.getPrimaryKey();

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

		if (!(obj instanceof customerAddress)) {
			return false;
		}

		customerAddress customerAddress = (customerAddress)obj;

		int primaryKey = customerAddress.getPrimaryKey();

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
	public CacheModel<customerAddress> toCacheModel() {
		customerAddressCacheModel customerAddressCacheModel = new customerAddressCacheModel();

		customerAddressCacheModel.CUSTOMER_ADDRESS_ID = getCUSTOMER_ADDRESS_ID();

		customerAddressCacheModel.CUSTOMER_ID = getCUSTOMER_ID();

		customerAddressCacheModel.ADDRESS_LINE_1 = getADDRESS_LINE_1();

		String ADDRESS_LINE_1 = customerAddressCacheModel.ADDRESS_LINE_1;

		if ((ADDRESS_LINE_1 != null) && (ADDRESS_LINE_1.length() == 0)) {
			customerAddressCacheModel.ADDRESS_LINE_1 = null;
		}

		customerAddressCacheModel.ADDRESS_LINE_2 = getADDRESS_LINE_2();

		String ADDRESS_LINE_2 = customerAddressCacheModel.ADDRESS_LINE_2;

		if ((ADDRESS_LINE_2 != null) && (ADDRESS_LINE_2.length() == 0)) {
			customerAddressCacheModel.ADDRESS_LINE_2 = null;
		}

		customerAddressCacheModel.ADDRESS_LINE_3 = getADDRESS_LINE_3();

		String ADDRESS_LINE_3 = customerAddressCacheModel.ADDRESS_LINE_3;

		if ((ADDRESS_LINE_3 != null) && (ADDRESS_LINE_3.length() == 0)) {
			customerAddressCacheModel.ADDRESS_LINE_3 = null;
		}

		customerAddressCacheModel.CHANGE_REQUEST_TYPE = getCHANGE_REQUEST_TYPE();

		String CHANGE_REQUEST_TYPE = customerAddressCacheModel.CHANGE_REQUEST_TYPE;

		if ((CHANGE_REQUEST_TYPE != null) &&
				(CHANGE_REQUEST_TYPE.length() == 0)) {
			customerAddressCacheModel.CHANGE_REQUEST_TYPE = null;
		}

		customerAddressCacheModel.CITY = getCITY();

		String CITY = customerAddressCacheModel.CITY;

		if ((CITY != null) && (CITY.length() == 0)) {
			customerAddressCacheModel.CITY = null;
		}

		customerAddressCacheModel.STATE = getSTATE();

		String STATE = customerAddressCacheModel.STATE;

		if ((STATE != null) && (STATE.length() == 0)) {
			customerAddressCacheModel.STATE = null;
		}

		customerAddressCacheModel.CITY_ID = getCITY_ID();

		customerAddressCacheModel.STATE_ID = getSTATE_ID();

		customerAddressCacheModel.PIN_CODE = getPIN_CODE();

		String PIN_CODE = customerAddressCacheModel.PIN_CODE;

		if ((PIN_CODE != null) && (PIN_CODE.length() == 0)) {
			customerAddressCacheModel.PIN_CODE = null;
		}

		customerAddressCacheModel.CHANGE_REQUEST_FOR = getCHANGE_REQUEST_FOR();

		customerAddressCacheModel.ADDRESS_TYPE_ID = getADDRESS_TYPE_ID();

		customerAddressCacheModel.ADDR_STATUS = getADDR_STATUS();

		String ADDR_STATUS = customerAddressCacheModel.ADDR_STATUS;

		if ((ADDR_STATUS != null) && (ADDR_STATUS.length() == 0)) {
			customerAddressCacheModel.ADDR_STATUS = null;
		}

		customerAddressCacheModel.INSERTED_BY = getINSERTED_BY();

		String INSERTED_BY = customerAddressCacheModel.INSERTED_BY;

		if ((INSERTED_BY != null) && (INSERTED_BY.length() == 0)) {
			customerAddressCacheModel.INSERTED_BY = null;
		}

		Date INSERTED_DATE = getINSERTED_DATE();

		if (INSERTED_DATE != null) {
			customerAddressCacheModel.INSERTED_DATE = INSERTED_DATE.getTime();
		}
		else {
			customerAddressCacheModel.INSERTED_DATE = Long.MIN_VALUE;
		}

		customerAddressCacheModel.UPDATED_BY = getUPDATED_BY();

		String UPDATED_BY = customerAddressCacheModel.UPDATED_BY;

		if ((UPDATED_BY != null) && (UPDATED_BY.length() == 0)) {
			customerAddressCacheModel.UPDATED_BY = null;
		}

		Date UPDATED_DATE = getUPDATED_DATE();

		if (UPDATED_DATE != null) {
			customerAddressCacheModel.UPDATED_DATE = UPDATED_DATE.getTime();
		}
		else {
			customerAddressCacheModel.UPDATED_DATE = Long.MIN_VALUE;
		}

		return customerAddressCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{CUSTOMER_ADDRESS_ID=");
		sb.append(getCUSTOMER_ADDRESS_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", ADDRESS_LINE_1=");
		sb.append(getADDRESS_LINE_1());
		sb.append(", ADDRESS_LINE_2=");
		sb.append(getADDRESS_LINE_2());
		sb.append(", ADDRESS_LINE_3=");
		sb.append(getADDRESS_LINE_3());
		sb.append(", CHANGE_REQUEST_TYPE=");
		sb.append(getCHANGE_REQUEST_TYPE());
		sb.append(", CITY=");
		sb.append(getCITY());
		sb.append(", STATE=");
		sb.append(getSTATE());
		sb.append(", CITY_ID=");
		sb.append(getCITY_ID());
		sb.append(", STATE_ID=");
		sb.append(getSTATE_ID());
		sb.append(", PIN_CODE=");
		sb.append(getPIN_CODE());
		sb.append(", CHANGE_REQUEST_FOR=");
		sb.append(getCHANGE_REQUEST_FOR());
		sb.append(", ADDRESS_TYPE_ID=");
		sb.append(getADDRESS_TYPE_ID());
		sb.append(", ADDR_STATUS=");
		sb.append(getADDR_STATUS());
		sb.append(", INSERTED_BY=");
		sb.append(getINSERTED_BY());
		sb.append(", INSERTED_DATE=");
		sb.append(getINSERTED_DATE());
		sb.append(", UPDATED_BY=");
		sb.append(getUPDATED_BY());
		sb.append(", UPDATED_DATE=");
		sb.append(getUPDATED_DATE());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.customerAddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CUSTOMER_ADDRESS_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ADDRESS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_1</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_2</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_LINE_3</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_LINE_3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHANGE_REQUEST_TYPE</column-name><column-value><![CDATA[");
		sb.append(getCHANGE_REQUEST_TYPE());
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
			"<column><column-name>CITY_ID</column-name><column-value><![CDATA[");
		sb.append(getCITY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PIN_CODE</column-name><column-value><![CDATA[");
		sb.append(getPIN_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CHANGE_REQUEST_FOR</column-name><column-value><![CDATA[");
		sb.append(getCHANGE_REQUEST_FOR());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDRESS_TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getADDRESS_TYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDR_STATUS</column-name><column-value><![CDATA[");
		sb.append(getADDR_STATUS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_BY</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>INSERTED_DATE</column-name><column-value><![CDATA[");
		sb.append(getINSERTED_DATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_BY</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UPDATED_DATE</column-name><column-value><![CDATA[");
		sb.append(getUPDATED_DATE());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = customerAddress.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			customerAddress.class
		};
	private int _CUSTOMER_ADDRESS_ID;
	private int _CUSTOMER_ID;
	private String _ADDRESS_LINE_1;
	private String _ADDRESS_LINE_2;
	private String _ADDRESS_LINE_3;
	private String _CHANGE_REQUEST_TYPE;
	private String _CITY;
	private String _STATE;
	private int _CITY_ID;
	private int _STATE_ID;
	private String _PIN_CODE;
	private int _CHANGE_REQUEST_FOR;
	private int _ADDRESS_TYPE_ID;
	private String _ADDR_STATUS;
	private String _INSERTED_BY;
	private Date _INSERTED_DATE;
	private String _UPDATED_BY;
	private Date _UPDATED_DATE;
	private customerAddress _escapedModel;
}