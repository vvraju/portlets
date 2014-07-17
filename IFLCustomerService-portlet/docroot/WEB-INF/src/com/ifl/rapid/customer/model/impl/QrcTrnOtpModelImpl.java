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

import com.ifl.rapid.customer.model.QrcTrnOtp;
import com.ifl.rapid.customer.model.QrcTrnOtpModel;

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
 * The base model implementation for the QrcTrnOtp service. Represents a row in the &quot;Qrc_Trn_Otp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifl.rapid.customer.model.QrcTrnOtpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QrcTrnOtpImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnOtpImpl
 * @see com.ifl.rapid.customer.model.QrcTrnOtp
 * @see com.ifl.rapid.customer.model.QrcTrnOtpModel
 * @generated
 */
public class QrcTrnOtpModelImpl extends BaseModelImpl<QrcTrnOtp>
	implements QrcTrnOtpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qrc trn otp model instance should use the {@link com.ifl.rapid.customer.model.QrcTrnOtp} interface instead.
	 */
	public static final String TABLE_NAME = "Qrc_Trn_Otp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "Otp_Id", Types.INTEGER },
			{ "Otp", Types.VARCHAR },
			{ "ContactId", Types.INTEGER },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP },
			{ "ModifiedBy", Types.VARCHAR },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "IsActive", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Qrc_Trn_Otp (Otp_Id INTEGER not null primary key IDENTITY,Otp VARCHAR(75) null,ContactId INTEGER,CreatedBy VARCHAR(75) null,CreatedDate DATE null,ModifiedBy VARCHAR(75) null,ModifiedDate DATE null,IsActive VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Qrc_Trn_Otp";
	public static final String ORDER_BY_JPQL = " ORDER BY qrcTrnOtp.Otp_Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Qrc_Trn_Otp.Otp_Id ASC";
	public static final String DATA_SOURCE = "servicesDataSourceService";
	public static final String SESSION_FACTORY = "servicesSessionFactoryService";
	public static final String TX_MANAGER = "servicesTransactionManagerService";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifl.rapid.customer.model.QrcTrnOtp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifl.rapid.customer.model.QrcTrnOtp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifl.rapid.customer.model.QrcTrnOtp"));

	public QrcTrnOtpModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _Otp_Id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setOtp_Id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Otp_Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QrcTrnOtp.class;
	}

	@Override
	public String getModelClassName() {
		return QrcTrnOtp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Otp_Id", getOtp_Id());
		attributes.put("Otp", getOtp());
		attributes.put("ContactId", getContactId());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("IsActive", getIsActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer Otp_Id = (Integer)attributes.get("Otp_Id");

		if (Otp_Id != null) {
			setOtp_Id(Otp_Id);
		}

		String Otp = (String)attributes.get("Otp");

		if (Otp != null) {
			setOtp(Otp);
		}

		Integer ContactId = (Integer)attributes.get("ContactId");

		if (ContactId != null) {
			setContactId(ContactId);
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
	public int getOtp_Id() {
		return _Otp_Id;
	}

	@Override
	public void setOtp_Id(int Otp_Id) {
		_Otp_Id = Otp_Id;
	}

	@Override
	public String getOtp() {
		if (_Otp == null) {
			return StringPool.BLANK;
		}
		else {
			return _Otp;
		}
	}

	@Override
	public void setOtp(String Otp) {
		_Otp = Otp;
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
	public QrcTrnOtp toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QrcTrnOtp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QrcTrnOtpImpl qrcTrnOtpImpl = new QrcTrnOtpImpl();

		qrcTrnOtpImpl.setOtp_Id(getOtp_Id());
		qrcTrnOtpImpl.setOtp(getOtp());
		qrcTrnOtpImpl.setContactId(getContactId());
		qrcTrnOtpImpl.setCreatedBy(getCreatedBy());
		qrcTrnOtpImpl.setCreatedDate(getCreatedDate());
		qrcTrnOtpImpl.setModifiedBy(getModifiedBy());
		qrcTrnOtpImpl.setModifiedDate(getModifiedDate());
		qrcTrnOtpImpl.setIsActive(getIsActive());

		qrcTrnOtpImpl.resetOriginalValues();

		return qrcTrnOtpImpl;
	}

	@Override
	public int compareTo(QrcTrnOtp qrcTrnOtp) {
		int primaryKey = qrcTrnOtp.getPrimaryKey();

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

		if (!(obj instanceof QrcTrnOtp)) {
			return false;
		}

		QrcTrnOtp qrcTrnOtp = (QrcTrnOtp)obj;

		int primaryKey = qrcTrnOtp.getPrimaryKey();

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
	public CacheModel<QrcTrnOtp> toCacheModel() {
		QrcTrnOtpCacheModel qrcTrnOtpCacheModel = new QrcTrnOtpCacheModel();

		qrcTrnOtpCacheModel.Otp_Id = getOtp_Id();

		qrcTrnOtpCacheModel.Otp = getOtp();

		String Otp = qrcTrnOtpCacheModel.Otp;

		if ((Otp != null) && (Otp.length() == 0)) {
			qrcTrnOtpCacheModel.Otp = null;
		}

		qrcTrnOtpCacheModel.ContactId = getContactId();

		qrcTrnOtpCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = qrcTrnOtpCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			qrcTrnOtpCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			qrcTrnOtpCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			qrcTrnOtpCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		qrcTrnOtpCacheModel.ModifiedBy = getModifiedBy();

		String ModifiedBy = qrcTrnOtpCacheModel.ModifiedBy;

		if ((ModifiedBy != null) && (ModifiedBy.length() == 0)) {
			qrcTrnOtpCacheModel.ModifiedBy = null;
		}

		Date ModifiedDate = getModifiedDate();

		if (ModifiedDate != null) {
			qrcTrnOtpCacheModel.ModifiedDate = ModifiedDate.getTime();
		}
		else {
			qrcTrnOtpCacheModel.ModifiedDate = Long.MIN_VALUE;
		}

		qrcTrnOtpCacheModel.IsActive = getIsActive();

		String IsActive = qrcTrnOtpCacheModel.IsActive;

		if ((IsActive != null) && (IsActive.length() == 0)) {
			qrcTrnOtpCacheModel.IsActive = null;
		}

		return qrcTrnOtpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{Otp_Id=");
		sb.append(getOtp_Id());
		sb.append(", Otp=");
		sb.append(getOtp());
		sb.append(", ContactId=");
		sb.append(getContactId());
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
		sb.append("com.ifl.rapid.customer.model.QrcTrnOtp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Otp_Id</column-name><column-value><![CDATA[");
		sb.append(getOtp_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Otp</column-name><column-value><![CDATA[");
		sb.append(getOtp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
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

	private static ClassLoader _classLoader = QrcTrnOtp.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			QrcTrnOtp.class
		};
	private int _Otp_Id;
	private String _Otp;
	private int _ContactId;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _IsActive;
	private QrcTrnOtp _escapedModel;
}