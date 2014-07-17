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

import com.ifli.rapid.model.ConfirmDetails;
import com.ifli.rapid.model.ConfirmDetailsModel;

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
 * The base model implementation for the ConfirmDetails service. Represents a row in the &quot;confirm_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.ConfirmDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConfirmDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ConfirmDetailsImpl
 * @see com.ifli.rapid.model.ConfirmDetails
 * @see com.ifli.rapid.model.ConfirmDetailsModel
 * @generated
 */
public class ConfirmDetailsModelImpl extends BaseModelImpl<ConfirmDetails>
	implements ConfirmDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a confirm details model instance should use the {@link com.ifli.rapid.model.ConfirmDetails} interface instead.
	 */
	public static final String TABLE_NAME = "confirm_details";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "QRC_ASR_ID", Types.INTEGER },
			{ "Approval_Status", Types.VARCHAR },
			{ "Comments", Types.VARCHAR },
			{ "Sign_Flag", Types.VARCHAR },
			{ "CreatedBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table confirm_details (ID INTEGER not null primary key IDENTITY,QRC_ASR_ID INTEGER,Approval_Status VARCHAR(75) null,Comments VARCHAR(75) null,Sign_Flag VARCHAR(75) null,CreatedBy VARCHAR(75) null,CreatedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table confirm_details";
	public static final String ORDER_BY_JPQL = " ORDER BY confirmDetails.ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY confirm_details.ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.ConfirmDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.ConfirmDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.ConfirmDetails"));

	public ConfirmDetailsModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ConfirmDetails.class;
	}

	@Override
	public String getModelClassName() {
		return ConfirmDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ID", getID());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());
		attributes.put("Approval_Status", getApproval_Status());
		attributes.put("Comments", getComments());
		attributes.put("Sign_Flag", getSign_Flag());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer ID = (Integer)attributes.get("ID");

		if (ID != null) {
			setID(ID);
		}

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}

		String Approval_Status = (String)attributes.get("Approval_Status");

		if (Approval_Status != null) {
			setApproval_Status(Approval_Status);
		}

		String Comments = (String)attributes.get("Comments");

		if (Comments != null) {
			setComments(Comments);
		}

		String Sign_Flag = (String)attributes.get("Sign_Flag");

		if (Sign_Flag != null) {
			setSign_Flag(Sign_Flag);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}
	}

	@Override
	public int getID() {
		return _ID;
	}

	@Override
	public void setID(int ID) {
		_ID = ID;
	}

	@Override
	public int getQRC_ASR_ID() {
		return _QRC_ASR_ID;
	}

	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_QRC_ASR_ID = QRC_ASR_ID;
	}

	@Override
	public String getApproval_Status() {
		if (_Approval_Status == null) {
			return StringPool.BLANK;
		}
		else {
			return _Approval_Status;
		}
	}

	@Override
	public void setApproval_Status(String Approval_Status) {
		_Approval_Status = Approval_Status;
	}

	@Override
	public String getComments() {
		if (_Comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _Comments;
		}
	}

	@Override
	public void setComments(String Comments) {
		_Comments = Comments;
	}

	@Override
	public String getSign_Flag() {
		if (_Sign_Flag == null) {
			return StringPool.BLANK;
		}
		else {
			return _Sign_Flag;
		}
	}

	@Override
	public void setSign_Flag(String Sign_Flag) {
		_Sign_Flag = Sign_Flag;
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
	public ConfirmDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ConfirmDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ConfirmDetailsImpl confirmDetailsImpl = new ConfirmDetailsImpl();

		confirmDetailsImpl.setID(getID());
		confirmDetailsImpl.setQRC_ASR_ID(getQRC_ASR_ID());
		confirmDetailsImpl.setApproval_Status(getApproval_Status());
		confirmDetailsImpl.setComments(getComments());
		confirmDetailsImpl.setSign_Flag(getSign_Flag());
		confirmDetailsImpl.setCreatedBy(getCreatedBy());
		confirmDetailsImpl.setCreatedDate(getCreatedDate());

		confirmDetailsImpl.resetOriginalValues();

		return confirmDetailsImpl;
	}

	@Override
	public int compareTo(ConfirmDetails confirmDetails) {
		int primaryKey = confirmDetails.getPrimaryKey();

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

		if (!(obj instanceof ConfirmDetails)) {
			return false;
		}

		ConfirmDetails confirmDetails = (ConfirmDetails)obj;

		int primaryKey = confirmDetails.getPrimaryKey();

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
	public CacheModel<ConfirmDetails> toCacheModel() {
		ConfirmDetailsCacheModel confirmDetailsCacheModel = new ConfirmDetailsCacheModel();

		confirmDetailsCacheModel.ID = getID();

		confirmDetailsCacheModel.QRC_ASR_ID = getQRC_ASR_ID();

		confirmDetailsCacheModel.Approval_Status = getApproval_Status();

		String Approval_Status = confirmDetailsCacheModel.Approval_Status;

		if ((Approval_Status != null) && (Approval_Status.length() == 0)) {
			confirmDetailsCacheModel.Approval_Status = null;
		}

		confirmDetailsCacheModel.Comments = getComments();

		String Comments = confirmDetailsCacheModel.Comments;

		if ((Comments != null) && (Comments.length() == 0)) {
			confirmDetailsCacheModel.Comments = null;
		}

		confirmDetailsCacheModel.Sign_Flag = getSign_Flag();

		String Sign_Flag = confirmDetailsCacheModel.Sign_Flag;

		if ((Sign_Flag != null) && (Sign_Flag.length() == 0)) {
			confirmDetailsCacheModel.Sign_Flag = null;
		}

		confirmDetailsCacheModel.CreatedBy = getCreatedBy();

		String CreatedBy = confirmDetailsCacheModel.CreatedBy;

		if ((CreatedBy != null) && (CreatedBy.length() == 0)) {
			confirmDetailsCacheModel.CreatedBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			confirmDetailsCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			confirmDetailsCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		return confirmDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ID=");
		sb.append(getID());
		sb.append(", QRC_ASR_ID=");
		sb.append(getQRC_ASR_ID());
		sb.append(", Approval_Status=");
		sb.append(getApproval_Status());
		sb.append(", Comments=");
		sb.append(getComments());
		sb.append(", Sign_Flag=");
		sb.append(getSign_Flag());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.ConfirmDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ID</column-name><column-value><![CDATA[");
		sb.append(getID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QRC_ASR_ID</column-name><column-value><![CDATA[");
		sb.append(getQRC_ASR_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Approval_Status</column-name><column-value><![CDATA[");
		sb.append(getApproval_Status());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Sign_Flag</column-name><column-value><![CDATA[");
		sb.append(getSign_Flag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ConfirmDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ConfirmDetails.class
		};
	private int _ID;
	private int _QRC_ASR_ID;
	private String _Approval_Status;
	private String _Comments;
	private String _Sign_Flag;
	private String _CreatedBy;
	private Date _CreatedDate;
	private ConfirmDetails _escapedModel;
}