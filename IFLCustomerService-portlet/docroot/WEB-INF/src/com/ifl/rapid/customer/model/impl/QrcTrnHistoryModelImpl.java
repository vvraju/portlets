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

import com.ifl.rapid.customer.model.QrcTrnHistory;
import com.ifl.rapid.customer.model.QrcTrnHistoryModel;

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
 * The base model implementation for the QrcTrnHistory service. Represents a row in the &quot;Qrc_Trn_History&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.QrcTrnHistoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QrcTrnHistoryImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnHistoryImpl
 * @see com.ifl.rapid.customer.model.QrcTrnHistory
 * @see com.ifl.rapid.customer.model.QrcTrnHistoryModel
 * @generated
 */
public class QrcTrnHistoryModelImpl extends BaseModelImpl<QrcTrnHistory>
	implements QrcTrnHistoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qrc trn history model instance should use the {@link com.ifl.rapid.customer.model.QrcTrnHistory} interface instead.
	 */
	public static final String TABLE_NAME = "Qrc_Trn_History";
	public static final Object[][] TABLE_COLUMNS = {
			{ "HistoryId", Types.INTEGER },
			{ "ContactId", Types.INTEGER },
			{ "CreatedContactId", Types.INTEGER },
			{ "RequestType", Types.VARCHAR },
			{ "ChangeRequestType", Types.VARCHAR },
			{ "PickupDate", Types.TIMESTAMP },
			{ "PickupTime", Types.VARCHAR },
			{ "XMLData", Types.VARCHAR },
			{ "AddressTypeId", Types.INTEGER },
			{ "BranchId", Types.INTEGER },
			{ "IsActive", Types.INTEGER },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Qrc_Trn_History (HistoryId INTEGER not null primary key IDENTITY,ContactId INTEGER,CreatedContactId INTEGER,RequestType VARCHAR(75) null,ChangeRequestType VARCHAR(75) null,PickupDate DATE null,PickupTime VARCHAR(75) null,XMLData VARCHAR(75) null,AddressTypeId INTEGER,BranchId INTEGER,IsActive INTEGER,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedDate DATE null,ModifiedBy VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Qrc_Trn_History";
	public static final String ORDER_BY_JPQL = " ORDER BY qrcTrnHistory.HistoryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Qrc_Trn_History.HistoryId ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.QrcTrnHistory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.QrcTrnHistory"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.QrcTrnHistory"));

	public QrcTrnHistoryModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _HistoryId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setHistoryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _HistoryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnHistory.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("HistoryId", getHistoryId());
		attributes.put("ContactId", getContactId());
		attributes.put("CreatedContactId", getCreatedContactId());
		attributes.put("RequestType", getRequestType());
		attributes.put("ChangeRequestType", getChangeRequestType());
		attributes.put("PickupDate", getPickupDate());
		attributes.put("PickupTime", getPickupTime());
		attributes.put("XMLData", getXMLData());
		attributes.put("AddressTypeId", getAddressTypeId());
		attributes.put("BranchId", getBranchId());
		attributes.put("IsActive", getIsActive());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer HistoryId = (Integer)attributes.get("HistoryId");

		if (HistoryId != null) {
			setHistoryId(HistoryId);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
		}

		Integer CreatedContactId = (Integer)attributes.get("CreatedContactId");

		if (CreatedContactId != null) {
			setCreatedContactId(CreatedContactId);
		}

		String RequestType = (String)attributes.get("RequestType");

		if (RequestType != null) {
			setRequestType(RequestType);
		}

		String ChangeRequestType = (String)attributes.get("ChangeRequestType");

		if (ChangeRequestType != null) {
			setChangeRequestType(ChangeRequestType);
		}

		Date PickupDate = (Date)attributes.get("PickupDate");

		if (PickupDate != null) {
			setPickupDate(PickupDate);
		}

		String PickupTime = (String)attributes.get("PickupTime");

		if (PickupTime != null) {
			setPickupTime(PickupTime);
		}

		String XMLData = (String)attributes.get("XMLData");

		if (XMLData != null) {
			setXMLData(XMLData);
		}

		Integer AddressTypeId = (Integer)attributes.get("AddressTypeId");

		if (AddressTypeId != null) {
			setAddressTypeId(AddressTypeId);
		}

		Integer BranchId = (Integer)attributes.get("BranchId");

		if (BranchId != null) {
			setBranchId(BranchId);
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
	}

	@Override
	public int getHistoryId() {
		return _HistoryId;
	}

	@Override
	public void setHistoryId(int HistoryId) {
		_HistoryId = HistoryId;
	}

	@Override
	public int getContactId() {
		return _ContactId;
	}

	@Override
	public void setContactId(int ContactId) {
		_ContactId = ContactId;
	}

	@Override
	public int getCreatedContactId() {
		return _CreatedContactId;
	}

	@Override
	public void setCreatedContactId(int CreatedContactId) {
		_CreatedContactId = CreatedContactId;
	}

	@Override
	public String getRequestType() {
		if (_RequestType == null) {
			return StringPool.BLANK;
		}
		else {
			return _RequestType;
		}
	}

	@Override
	public void setRequestType(String RequestType) {
		_RequestType = RequestType;
	}

	@Override
	public String getChangeRequestType() {
		if (_ChangeRequestType == null) {
			return StringPool.BLANK;
		}
		else {
			return _ChangeRequestType;
		}
	}

	@Override
	public void setChangeRequestType(String ChangeRequestType) {
		_ChangeRequestType = ChangeRequestType;
	}

	@Override
	public Date getPickupDate() {
		return _PickupDate;
	}

	@Override
	public void setPickupDate(Date PickupDate) {
		_PickupDate = PickupDate;
	}

	@Override
	public String getPickupTime() {
		if (_PickupTime == null) {
			return StringPool.BLANK;
		}
		else {
			return _PickupTime;
		}
	}

	@Override
	public void setPickupTime(String PickupTime) {
		_PickupTime = PickupTime;
	}

	@Override
	public String getXMLData() {
		if (_XMLData == null) {
			return StringPool.BLANK;
		}
		else {
			return _XMLData;
		}
	}

	@Override
	public void setXMLData(String XMLData) {
		_XMLData = XMLData;
	}

	@Override
	public int getAddressTypeId() {
		return _AddressTypeId;
	}

	@Override
	public void setAddressTypeId(int AddressTypeId) {
		_AddressTypeId = AddressTypeId;
	}

	@Override
	public int getBranchId() {
		return _BranchId;
	}

	@Override
	public void setBranchId(int BranchId) {
		_BranchId = BranchId;
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
	public QrcTrnHistory toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QrcTrnHistory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QrcTrnHistoryImpl qrcTrnHistoryImpl = new QrcTrnHistoryImpl();

		qrcTrnHistoryImpl.setHistoryId(getHistoryId());
		qrcTrnHistoryImpl.setContactId(getContactId());
		qrcTrnHistoryImpl.setCreatedContactId(getCreatedContactId());
		qrcTrnHistoryImpl.setRequestType(getRequestType());
		qrcTrnHistoryImpl.setChangeRequestType(getChangeRequestType());
		qrcTrnHistoryImpl.setPickupDate(getPickupDate());
		qrcTrnHistoryImpl.setPickupTime(getPickupTime());
		qrcTrnHistoryImpl.setXMLData(getXMLData());
		qrcTrnHistoryImpl.setAddressTypeId(getAddressTypeId());
		qrcTrnHistoryImpl.setBranchId(getBranchId());
		qrcTrnHistoryImpl.setIsActive(getIsActive());
		qrcTrnHistoryImpl.setCreatedBy(getCreatedBy());
		qrcTrnHistoryImpl.setCreatedDate(getCreatedDate());
		qrcTrnHistoryImpl.setModifiedDate(getModifiedDate());
		qrcTrnHistoryImpl.setModifiedBy(getModifiedBy());

		qrcTrnHistoryImpl.resetOriginalValues();

		return qrcTrnHistoryImpl;
	}

	@Override
	public int compareTo(QrcTrnHistory qrcTrnHistory) {
		int primaryKey = qrcTrnHistory.getPrimaryKey();

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

		if (!(obj instanceof QrcTrnHistory)) {
			return false;
		}

		QrcTrnHistory qrcTrnHistory = (QrcTrnHistory)obj;

		int primaryKey = qrcTrnHistory.getPrimaryKey();

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
	public CacheModel<QrcTrnHistory> toCacheModel() {
		QrcTrnHistoryCacheModel qrcTrnHistoryCacheModel = new QrcTrnHistoryCacheModel();

		qrcTrnHistoryCacheModel.HistoryId = getHistoryId();

		qrcTrnHistoryCacheModel.ContactId = getContactId();

		qrcTrnHistoryCacheModel.CreatedContactId = getCreatedContactId();

		qrcTrnHistoryCacheModel.RequestType = getRequestType();

		String RequestType = qrcTrnHistoryCacheModel.RequestType;

		if ((RequestType != null) && (RequestType.length() == 0)) {
			qrcTrnHistoryCacheModel.RequestType = null;
		}

		qrcTrnHistoryCacheModel.ChangeRequestType = getChangeRequestType();

		String ChangeRequestType = qrcTrnHistoryCacheModel.ChangeRequestType;

		if ((ChangeRequestType != null) && (ChangeRequestType.length() == 0)) {
			qrcTrnHistoryCacheModel.ChangeRequestType = null;
		}

		Date PickupDate = getPickupDate();

		if (PickupDate != null) {
			qrcTrnHistoryCacheModel.PickupDate = PickupDate.getTime();
		}
		else {
			qrcTrnHistoryCacheModel.PickupDate = Long.MIN_VALUE;
		}

		qrcTrnHistoryCacheModel.PickupTime = getPickupTime();

		String PickupTime = qrcTrnHistoryCacheModel.PickupTime;

		if ((PickupTime != null) && (PickupTime.length() == 0)) {
			qrcTrnHistoryCacheModel.PickupTime = null;
		}

		qrcTrnHistoryCacheModel.XMLData = getXMLData();

		String XMLData = qrcTrnHistoryCacheModel.XMLData;

		if ((XMLData != null) && (XMLData.length() == 0)) {
			qrcTrnHistoryCacheModel.XMLData = null;
		}

		qrcTrnHistoryCacheModel.AddressTypeId = getAddressTypeId();

		qrcTrnHistoryCacheModel.BranchId = getBranchId();

		qrcTrnHistoryCacheModel.IsActive = getIsActive();

		qrcTrnHistoryCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = qrcTrnHistoryCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			qrcTrnHistoryCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			qrcTrnHistoryCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			qrcTrnHistoryCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			qrcTrnHistoryCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			qrcTrnHistoryCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		qrcTrnHistoryCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = qrcTrnHistoryCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			qrcTrnHistoryCacheModel.ModifiedBy = null;
		}

		return qrcTrnHistoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{HistoryId=");
		sb.append(getHistoryId());
		sb.append(", ContactId=");
		sb.append(getContactId());
		sb.append(", CreatedContactId=");
		sb.append(getCreatedContactId());
		sb.append(", RequestType=");
		sb.append(getRequestType());
		sb.append(", ChangeRequestType=");
		sb.append(getChangeRequestType());
		sb.append(", PickupDate=");
		sb.append(getPickupDate());
		sb.append(", PickupTime=");
		sb.append(getPickupTime());
		sb.append(", XMLData=");
		sb.append(getXMLData());
		sb.append(", AddressTypeId=");
		sb.append(getAddressTypeId());
		sb.append(", BranchId=");
		sb.append(getBranchId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.ifl.rapid.customer.model.QrcTrnHistory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>HistoryId</column-name><column-value><![CDATA[");
		sb.append(getHistoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedContactId</column-name><column-value><![CDATA[");
		sb.append(getCreatedContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RequestType</column-name><column-value><![CDATA[");
		sb.append(getRequestType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ChangeRequestType</column-name><column-value><![CDATA[");
		sb.append(getChangeRequestType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PickupDate</column-name><column-value><![CDATA[");
		sb.append(getPickupDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PickupTime</column-name><column-value><![CDATA[");
		sb.append(getPickupTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMLData</column-name><column-value><![CDATA[");
		sb.append(getXMLData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AddressTypeId</column-name><column-value><![CDATA[");
		sb.append(getAddressTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BranchId</column-name><column-value><![CDATA[");
		sb.append(getBranchId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = QrcTrnHistory.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QrcTrnHistory.class
		};
	private int _HistoryId;
	private int _ContactId;
	private int _CreatedContactId;
	private String _RequestType;
	private String _ChangeRequestType;
	private Date _PickupDate;
	private String _PickupTime;
	private String _XMLData;
	private int _AddressTypeId;
	private int _BranchId;
	private int _IsActive;
	private String _CreatedBy;
	private Date _CreatedDate;
	private Date _ModifiedDate;
	private String _ModifiedBy;
	private QrcTrnHistory _escapedModel;
}