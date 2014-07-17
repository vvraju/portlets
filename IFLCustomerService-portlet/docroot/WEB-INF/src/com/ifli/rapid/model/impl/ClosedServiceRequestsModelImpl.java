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

import com.ifli.rapid.model.ClosedServiceRequests;
import com.ifli.rapid.model.ClosedServiceRequestsModel;

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
 * The base model implementation for the ClosedServiceRequests service. Represents a row in the &quot;QRC_CLOSED_SERVICE_REQS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.ClosedServiceRequestsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ClosedServiceRequestsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ClosedServiceRequestsImpl
 * @see com.ifli.rapid.model.ClosedServiceRequests
 * @see com.ifli.rapid.model.ClosedServiceRequestsModel
 * @generated
 */
public class ClosedServiceRequestsModelImpl extends BaseModelImpl<ClosedServiceRequests>
	implements ClosedServiceRequestsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a closed service requests model instance should use the {@link com.ifli.rapid.model.ClosedServiceRequests} interface instead.
	 */
	public static final String TABLE_NAME = "QRC_CLOSED_SERVICE_REQS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "QRC_CSR_ID", Types.INTEGER },
			{ "TYPE_ID", Types.INTEGER },
			{ "ASSIGNED_TO", Types.INTEGER },
			{ "HANDLED_BY", Types.INTEGER },
			{ "STATUS_ID", Types.INTEGER },
			{ "CUSTOMER_ID", Types.VARCHAR },
			{ "customerSRNumber", Types.VARCHAR },
			{ "ADDITIONAL_DATA_XML", Types.VARCHAR },
			{ "INSERTED_DATE", Types.TIMESTAMP },
			{ "INSERTED_BY", Types.VARCHAR },
			{ "UPDATED_DATE", Types.TIMESTAMP },
			{ "UPDATED_BY", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table QRC_CLOSED_SERVICE_REQS (QRC_CSR_ID INTEGER not null primary key IDENTITY,TYPE_ID INTEGER,ASSIGNED_TO INTEGER,HANDLED_BY INTEGER,STATUS_ID INTEGER,CUSTOMER_ID VARCHAR(75) null,customerSRNumber VARCHAR(75) null,ADDITIONAL_DATA_XML VARCHAR(75) null,INSERTED_DATE DATE null,INSERTED_BY VARCHAR(75) null,UPDATED_DATE DATE null,UPDATED_BY VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table QRC_CLOSED_SERVICE_REQS";
	public static final String ORDER_BY_JPQL = " ORDER BY closedServiceRequests.QRC_CSR_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY QRC_CLOSED_SERVICE_REQS.QRC_CSR_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.ClosedServiceRequests"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.ClosedServiceRequests"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.ClosedServiceRequests"));

	public ClosedServiceRequestsModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _QRC_CSR_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setQRC_CSR_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _QRC_CSR_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ClosedServiceRequests.class;
	}

	@Override
	public String getModelClassName() {
		return ClosedServiceRequests.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_CSR_ID", getQRC_CSR_ID());
		attributes.put("TYPE_ID", getTYPE_ID());
		attributes.put("ASSIGNED_TO", getASSIGNED_TO());
		attributes.put("HANDLED_BY", getHANDLED_BY());
		attributes.put("STATUS_ID", getSTATUS_ID());
		attributes.put("CUSTOMER_ID", getCUSTOMER_ID());
		attributes.put("customerSRNumber", getCustomerSRNumber());
		attributes.put("ADDITIONAL_DATA_XML", getADDITIONAL_DATA_XML());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_CSR_ID = (Integer)attributes.get("QRC_CSR_ID");

		if (QRC_CSR_ID != null) {
			setQRC_CSR_ID(QRC_CSR_ID);
		}

		Integer TYPE_ID = (Integer)attributes.get("TYPE_ID");

		if (TYPE_ID != null) {
			setTYPE_ID(TYPE_ID);
		}

		Integer ASSIGNED_TO = (Integer)attributes.get("ASSIGNED_TO");

		if (ASSIGNED_TO != null) {
			setASSIGNED_TO(ASSIGNED_TO);
		}

		Integer HANDLED_BY = (Integer)attributes.get("HANDLED_BY");

		if (HANDLED_BY != null) {
			setHANDLED_BY(HANDLED_BY);
		}

		Integer STATUS_ID = (Integer)attributes.get("STATUS_ID");

		if (STATUS_ID != null) {
			setSTATUS_ID(STATUS_ID);
		}

		String CUSTOMER_ID = (String)attributes.get("CUSTOMER_ID");

		if (CUSTOMER_ID != null) {
			setCUSTOMER_ID(CUSTOMER_ID);
		}

		String customerSRNumber = (String)attributes.get("customerSRNumber");

		if (customerSRNumber != null) {
			setCustomerSRNumber(customerSRNumber);
		}

		String ADDITIONAL_DATA_XML = (String)attributes.get(
				"ADDITIONAL_DATA_XML");

		if (ADDITIONAL_DATA_XML != null) {
			setADDITIONAL_DATA_XML(ADDITIONAL_DATA_XML);
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
	public int getQRC_CSR_ID() {
		return _QRC_CSR_ID;
	}

	@Override
	public void setQRC_CSR_ID(int QRC_CSR_ID) {
		_QRC_CSR_ID = QRC_CSR_ID;
	}

	@Override
	public int getTYPE_ID() {
		return _TYPE_ID;
	}

	@Override
	public void setTYPE_ID(int TYPE_ID) {
		_TYPE_ID = TYPE_ID;
	}

	@Override
	public int getASSIGNED_TO() {
		return _ASSIGNED_TO;
	}

	@Override
	public void setASSIGNED_TO(int ASSIGNED_TO) {
		_ASSIGNED_TO = ASSIGNED_TO;
	}

	@Override
	public int getHANDLED_BY() {
		return _HANDLED_BY;
	}

	@Override
	public void setHANDLED_BY(int HANDLED_BY) {
		_HANDLED_BY = HANDLED_BY;
	}

	@Override
	public int getSTATUS_ID() {
		return _STATUS_ID;
	}

	@Override
	public void setSTATUS_ID(int STATUS_ID) {
		_STATUS_ID = STATUS_ID;
	}

	@Override
	public String getCUSTOMER_ID() {
		if (_CUSTOMER_ID == null) {
			return StringPool.BLANK;
		}
		else {
			return _CUSTOMER_ID;
		}
	}

	@Override
	public void setCUSTOMER_ID(String CUSTOMER_ID) {
		_CUSTOMER_ID = CUSTOMER_ID;
	}

	@Override
	public String getCustomerSRNumber() {
		if (_customerSRNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _customerSRNumber;
		}
	}

	@Override
	public void setCustomerSRNumber(String customerSRNumber) {
		_customerSRNumber = customerSRNumber;
	}

	@Override
	public String getADDITIONAL_DATA_XML() {
		if (_ADDITIONAL_DATA_XML == null) {
			return StringPool.BLANK;
		}
		else {
			return _ADDITIONAL_DATA_XML;
		}
	}

	@Override
	public void setADDITIONAL_DATA_XML(String ADDITIONAL_DATA_XML) {
		_ADDITIONAL_DATA_XML = ADDITIONAL_DATA_XML;
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
	public ClosedServiceRequests toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ClosedServiceRequests)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ClosedServiceRequestsImpl closedServiceRequestsImpl = new ClosedServiceRequestsImpl();

		closedServiceRequestsImpl.setQRC_CSR_ID(getQRC_CSR_ID());
		closedServiceRequestsImpl.setTYPE_ID(getTYPE_ID());
		closedServiceRequestsImpl.setASSIGNED_TO(getASSIGNED_TO());
		closedServiceRequestsImpl.setHANDLED_BY(getHANDLED_BY());
		closedServiceRequestsImpl.setSTATUS_ID(getSTATUS_ID());
		closedServiceRequestsImpl.setCUSTOMER_ID(getCUSTOMER_ID());
		closedServiceRequestsImpl.setCustomerSRNumber(getCustomerSRNumber());
		closedServiceRequestsImpl.setADDITIONAL_DATA_XML(getADDITIONAL_DATA_XML());
		closedServiceRequestsImpl.setINSERTED_DATE(getINSERTED_DATE());
		closedServiceRequestsImpl.setINSERTED_BY(getINSERTED_BY());
		closedServiceRequestsImpl.setUPDATED_DATE(getUPDATED_DATE());
		closedServiceRequestsImpl.setUPDATED_BY(getUPDATED_BY());

		closedServiceRequestsImpl.resetOriginalValues();

		return closedServiceRequestsImpl;
	}

	@Override
	public int compareTo(ClosedServiceRequests closedServiceRequests) {
		int primaryKey = closedServiceRequests.getPrimaryKey();

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

		if (!(obj instanceof ClosedServiceRequests)) {
			return false;
		}

		ClosedServiceRequests closedServiceRequests = (ClosedServiceRequests)obj;

		int primaryKey = closedServiceRequests.getPrimaryKey();

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
	public CacheModel<ClosedServiceRequests> toCacheModel() {
		ClosedServiceRequestsCacheModel closedServiceRequestsCacheModel = new ClosedServiceRequestsCacheModel();

		closedServiceRequestsCacheModel.QRC_CSR_ID = getQRC_CSR_ID();

		closedServiceRequestsCacheModel.TYPE_ID = getTYPE_ID();

		closedServiceRequestsCacheModel.ASSIGNED_TO = getASSIGNED_TO();

		closedServiceRequestsCacheModel.HANDLED_BY = getHANDLED_BY();

		closedServiceRequestsCacheModel.STATUS_ID = getSTATUS_ID();

		closedServiceRequestsCacheModel.CUSTOMER_ID = getCUSTOMER_ID();

		String CUSTOMER_ID = closedServiceRequestsCacheModel.CUSTOMER_ID;

		if ((CUSTOMER_ID != null) && (CUSTOMER_ID.length() == 0)) {
			closedServiceRequestsCacheModel.CUSTOMER_ID = null;
		}

		closedServiceRequestsCacheModel.customerSRNumber = getCustomerSRNumber();

		String customerSRNumber = closedServiceRequestsCacheModel.customerSRNumber;

		if ((customerSRNumber != null) && (customerSRNumber.length() == 0)) {
			closedServiceRequestsCacheModel.customerSRNumber = null;
		}

		closedServiceRequestsCacheModel.ADDITIONAL_DATA_XML = getADDITIONAL_DATA_XML();

		String ADDITIONAL_DATA_XML = closedServiceRequestsCacheModel.ADDITIONAL_DATA_XML;

		if ((ADDITIONAL_DATA_XML != null) &&
				(ADDITIONAL_DATA_XML.length() == 0)) {
			closedServiceRequestsCacheModel.ADDITIONAL_DATA_XML = null;
		}

		Date INSERTED_DATE = getINSERTED_DATE();

		if (INSERTED_DATE != null) {
			closedServiceRequestsCacheModel.INSERTED_DATE = INSERTED_DATE.getTime();
		}
		else {
			closedServiceRequestsCacheModel.INSERTED_DATE = Long.MIN_VALUE;
		}

		closedServiceRequestsCacheModel.INSERTED_BY = getINSERTED_BY();

		String INSERTED_BY = closedServiceRequestsCacheModel.INSERTED_BY;

		if ((INSERTED_BY != null) && (INSERTED_BY.length() == 0)) {
			closedServiceRequestsCacheModel.INSERTED_BY = null;
		}

		Date UPDATED_DATE = getUPDATED_DATE();

		if (UPDATED_DATE != null) {
			closedServiceRequestsCacheModel.UPDATED_DATE = UPDATED_DATE.getTime();
		}
		else {
			closedServiceRequestsCacheModel.UPDATED_DATE = Long.MIN_VALUE;
		}

		closedServiceRequestsCacheModel.UPDATED_BY = getUPDATED_BY();

		String UPDATED_BY = closedServiceRequestsCacheModel.UPDATED_BY;

		if ((UPDATED_BY != null) && (UPDATED_BY.length() == 0)) {
			closedServiceRequestsCacheModel.UPDATED_BY = null;
		}

		return closedServiceRequestsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{QRC_CSR_ID=");
		sb.append(getQRC_CSR_ID());
		sb.append(", TYPE_ID=");
		sb.append(getTYPE_ID());
		sb.append(", ASSIGNED_TO=");
		sb.append(getASSIGNED_TO());
		sb.append(", HANDLED_BY=");
		sb.append(getHANDLED_BY());
		sb.append(", STATUS_ID=");
		sb.append(getSTATUS_ID());
		sb.append(", CUSTOMER_ID=");
		sb.append(getCUSTOMER_ID());
		sb.append(", customerSRNumber=");
		sb.append(getCustomerSRNumber());
		sb.append(", ADDITIONAL_DATA_XML=");
		sb.append(getADDITIONAL_DATA_XML());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ClosedServiceRequests");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>QRC_CSR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_CSR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TYPE_ID</column-name><column-value><![CDATA[");
		sb.append(getTYPE_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ASSIGNED_TO</column-name><column-value><![CDATA[");
		sb.append(getASSIGNED_TO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HANDLED_BY</column-name><column-value><![CDATA[");
		sb.append(getHANDLED_BY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATUS_ID</column-name><column-value><![CDATA[");
		sb.append(getSTATUS_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CUSTOMER_ID</column-name><column-value><![CDATA[");
		sb.append(getCUSTOMER_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerSRNumber</column-name><column-value><![CDATA[");
		sb.append(getCustomerSRNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ADDITIONAL_DATA_XML</column-name><column-value><![CDATA[");
		sb.append(getADDITIONAL_DATA_XML());
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

	private static ClassLoader _classLoader = ClosedServiceRequests.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ClosedServiceRequests.class
		};
	private int _QRC_CSR_ID;
	private int _TYPE_ID;
	private int _ASSIGNED_TO;
	private int _HANDLED_BY;
	private int _STATUS_ID;
	private String _CUSTOMER_ID;
	private String _customerSRNumber;
	private String _ADDITIONAL_DATA_XML;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private ClosedServiceRequests _escapedModel;
}