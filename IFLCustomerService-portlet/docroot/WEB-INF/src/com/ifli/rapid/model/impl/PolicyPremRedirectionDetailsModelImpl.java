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

import com.ifli.rapid.model.PolicyPremRedirectionDetails;
import com.ifli.rapid.model.PolicyPremRedirectionDetailsModel;

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
 * The base model implementation for the PolicyPremRedirectionDetails service. Represents a row in the &quot;policy_prem_redirection_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ifli.rapid.model.PolicyPremRedirectionDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PolicyPremRedirectionDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremRedirectionDetailsImpl
 * @see com.ifli.rapid.model.PolicyPremRedirectionDetails
 * @see com.ifli.rapid.model.PolicyPremRedirectionDetailsModel
 * @generated
 */
public class PolicyPremRedirectionDetailsModelImpl extends BaseModelImpl<PolicyPremRedirectionDetails>
	implements PolicyPremRedirectionDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a policy prem redirection details model instance should use the {@link com.ifli.rapid.model.PolicyPremRedirectionDetails} interface instead.
	 */
	public static final String TABLE_NAME = "policy_prem_redirection_details";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PREM_REDIRECTION_ID", Types.INTEGER },
			{ "POLICY_ID", Types.VARCHAR },
			{ "TRANSACTION_AUDIT_ID", Types.INTEGER },
			{ "FUND_CODE", Types.VARCHAR },
			{ "ALLOCATION_PERCENTAGE", Types.DOUBLE },
			{ "SENT_TO_ODS_FLAG", Types.VARCHAR },
			{ "INSERTED_DATE", Types.TIMESTAMP },
			{ "INSERTED_BY", Types.VARCHAR },
			{ "UPDATED_DATE", Types.TIMESTAMP },
			{ "UPDATED_BY", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table policy_prem_redirection_details (PREM_REDIRECTION_ID INTEGER not null primary key IDENTITY,POLICY_ID VARCHAR(75) null,TRANSACTION_AUDIT_ID INTEGER,FUND_CODE VARCHAR(75) null,ALLOCATION_PERCENTAGE DOUBLE,SENT_TO_ODS_FLAG VARCHAR(75) null,INSERTED_DATE DATE null,INSERTED_BY VARCHAR(75) null,UPDATED_DATE DATE null,UPDATED_BY VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table policy_prem_redirection_details";
	public static final String ORDER_BY_JPQL = " ORDER BY policyPremRedirectionDetails.PREM_REDIRECTION_ID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY policy_prem_redirection_details.PREM_REDIRECTION_ID ASC";
	public static final String DATA_SOURCE = "servicesDataSource";
	public static final String SESSION_FACTORY = "servicesSessionFactory";
	public static final String TX_MANAGER = "servicesTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ifli.rapid.model.PolicyPremRedirectionDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ifli.rapid.model.PolicyPremRedirectionDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ifli.rapid.model.PolicyPremRedirectionDetails"));

	public PolicyPremRedirectionDetailsModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _PREM_REDIRECTION_ID;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPREM_REDIRECTION_ID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PREM_REDIRECTION_ID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PolicyPremRedirectionDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PolicyPremRedirectionDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PREM_REDIRECTION_ID", getPREM_REDIRECTION_ID());
		attributes.put("POLICY_ID", getPOLICY_ID());
		attributes.put("TRANSACTION_AUDIT_ID", getTRANSACTION_AUDIT_ID());
		attributes.put("FUND_CODE", getFUND_CODE());
		attributes.put("ALLOCATION_PERCENTAGE", getALLOCATION_PERCENTAGE());
		attributes.put("SENT_TO_ODS_FLAG", getSENT_TO_ODS_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PREM_REDIRECTION_ID = (Integer)attributes.get(
				"PREM_REDIRECTION_ID");

		if (PREM_REDIRECTION_ID != null) {
			setPREM_REDIRECTION_ID(PREM_REDIRECTION_ID);
		}

		String POLICY_ID = (String)attributes.get("POLICY_ID");

		if (POLICY_ID != null) {
			setPOLICY_ID(POLICY_ID);
		}

		Integer TRANSACTION_AUDIT_ID = (Integer)attributes.get(
				"TRANSACTION_AUDIT_ID");

		if (TRANSACTION_AUDIT_ID != null) {
			setTRANSACTION_AUDIT_ID(TRANSACTION_AUDIT_ID);
		}

		String FUND_CODE = (String)attributes.get("FUND_CODE");

		if (FUND_CODE != null) {
			setFUND_CODE(FUND_CODE);
		}

		Double ALLOCATION_PERCENTAGE = (Double)attributes.get(
				"ALLOCATION_PERCENTAGE");

		if (ALLOCATION_PERCENTAGE != null) {
			setALLOCATION_PERCENTAGE(ALLOCATION_PERCENTAGE);
		}

		String SENT_TO_ODS_FLAG = (String)attributes.get("SENT_TO_ODS_FLAG");

		if (SENT_TO_ODS_FLAG != null) {
			setSENT_TO_ODS_FLAG(SENT_TO_ODS_FLAG);
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
	public int getPREM_REDIRECTION_ID() {
		return _PREM_REDIRECTION_ID;
	}

	@Override
	public void setPREM_REDIRECTION_ID(int PREM_REDIRECTION_ID) {
		_PREM_REDIRECTION_ID = PREM_REDIRECTION_ID;
	}

	@Override
	public String getPOLICY_ID() {
		if (_POLICY_ID == null) {
			return StringPool.BLANK;
		}
		else {
			return _POLICY_ID;
		}
	}

	@Override
	public void setPOLICY_ID(String POLICY_ID) {
		_POLICY_ID = POLICY_ID;
	}

	@Override
	public int getTRANSACTION_AUDIT_ID() {
		return _TRANSACTION_AUDIT_ID;
	}

	@Override
	public void setTRANSACTION_AUDIT_ID(int TRANSACTION_AUDIT_ID) {
		_TRANSACTION_AUDIT_ID = TRANSACTION_AUDIT_ID;
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
		_FUND_CODE = FUND_CODE;
	}

	@Override
	public double getALLOCATION_PERCENTAGE() {
		return _ALLOCATION_PERCENTAGE;
	}

	@Override
	public void setALLOCATION_PERCENTAGE(double ALLOCATION_PERCENTAGE) {
		_ALLOCATION_PERCENTAGE = ALLOCATION_PERCENTAGE;
	}

	@Override
	public String getSENT_TO_ODS_FLAG() {
		if (_SENT_TO_ODS_FLAG == null) {
			return StringPool.BLANK;
		}
		else {
			return _SENT_TO_ODS_FLAG;
		}
	}

	@Override
	public void setSENT_TO_ODS_FLAG(String SENT_TO_ODS_FLAG) {
		_SENT_TO_ODS_FLAG = SENT_TO_ODS_FLAG;
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
	public PolicyPremRedirectionDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PolicyPremRedirectionDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PolicyPremRedirectionDetailsImpl policyPremRedirectionDetailsImpl = new PolicyPremRedirectionDetailsImpl();

		policyPremRedirectionDetailsImpl.setPREM_REDIRECTION_ID(getPREM_REDIRECTION_ID());
		policyPremRedirectionDetailsImpl.setPOLICY_ID(getPOLICY_ID());
		policyPremRedirectionDetailsImpl.setTRANSACTION_AUDIT_ID(getTRANSACTION_AUDIT_ID());
		policyPremRedirectionDetailsImpl.setFUND_CODE(getFUND_CODE());
		policyPremRedirectionDetailsImpl.setALLOCATION_PERCENTAGE(getALLOCATION_PERCENTAGE());
		policyPremRedirectionDetailsImpl.setSENT_TO_ODS_FLAG(getSENT_TO_ODS_FLAG());
		policyPremRedirectionDetailsImpl.setINSERTED_DATE(getINSERTED_DATE());
		policyPremRedirectionDetailsImpl.setINSERTED_BY(getINSERTED_BY());
		policyPremRedirectionDetailsImpl.setUPDATED_DATE(getUPDATED_DATE());
		policyPremRedirectionDetailsImpl.setUPDATED_BY(getUPDATED_BY());

		policyPremRedirectionDetailsImpl.resetOriginalValues();

		return policyPremRedirectionDetailsImpl;
	}

	@Override
	public int compareTo(
		PolicyPremRedirectionDetails policyPremRedirectionDetails) {
		int primaryKey = policyPremRedirectionDetails.getPrimaryKey();

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

		if (!(obj instanceof PolicyPremRedirectionDetails)) {
			return false;
		}

		PolicyPremRedirectionDetails policyPremRedirectionDetails = (PolicyPremRedirectionDetails)obj;

		int primaryKey = policyPremRedirectionDetails.getPrimaryKey();

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
	public CacheModel<PolicyPremRedirectionDetails> toCacheModel() {
		PolicyPremRedirectionDetailsCacheModel policyPremRedirectionDetailsCacheModel =
			new PolicyPremRedirectionDetailsCacheModel();

		policyPremRedirectionDetailsCacheModel.PREM_REDIRECTION_ID = getPREM_REDIRECTION_ID();

		policyPremRedirectionDetailsCacheModel.POLICY_ID = getPOLICY_ID();

		String POLICY_ID = policyPremRedirectionDetailsCacheModel.POLICY_ID;

		if ((POLICY_ID != null) && (POLICY_ID.length() == 0)) {
			policyPremRedirectionDetailsCacheModel.POLICY_ID = null;
		}

		policyPremRedirectionDetailsCacheModel.TRANSACTION_AUDIT_ID = getTRANSACTION_AUDIT_ID();

		policyPremRedirectionDetailsCacheModel.FUND_CODE = getFUND_CODE();

		String FUND_CODE = policyPremRedirectionDetailsCacheModel.FUND_CODE;

		if ((FUND_CODE != null) && (FUND_CODE.length() == 0)) {
			policyPremRedirectionDetailsCacheModel.FUND_CODE = null;
		}

		policyPremRedirectionDetailsCacheModel.ALLOCATION_PERCENTAGE = getALLOCATION_PERCENTAGE();

		policyPremRedirectionDetailsCacheModel.SENT_TO_ODS_FLAG = getSENT_TO_ODS_FLAG();

		String SENT_TO_ODS_FLAG = policyPremRedirectionDetailsCacheModel.SENT_TO_ODS_FLAG;

		if ((SENT_TO_ODS_FLAG != null) && (SENT_TO_ODS_FLAG.length() == 0)) {
			policyPremRedirectionDetailsCacheModel.SENT_TO_ODS_FLAG = null;
		}

		Date INSERTED_DATE = getINSERTED_DATE();

		if (INSERTED_DATE != null) {
			policyPremRedirectionDetailsCacheModel.INSERTED_DATE = INSERTED_DATE.getTime();
		}
		else {
			policyPremRedirectionDetailsCacheModel.INSERTED_DATE = Long.MIN_VALUE;
		}

		policyPremRedirectionDetailsCacheModel.INSERTED_BY = getINSERTED_BY();

		String INSERTED_BY = policyPremRedirectionDetailsCacheModel.INSERTED_BY;

		if ((INSERTED_BY != null) && (INSERTED_BY.length() == 0)) {
			policyPremRedirectionDetailsCacheModel.INSERTED_BY = null;
		}

		Date UPDATED_DATE = getUPDATED_DATE();

		if (UPDATED_DATE != null) {
			policyPremRedirectionDetailsCacheModel.UPDATED_DATE = UPDATED_DATE.getTime();
		}
		else {
			policyPremRedirectionDetailsCacheModel.UPDATED_DATE = Long.MIN_VALUE;
		}

		policyPremRedirectionDetailsCacheModel.UPDATED_BY = getUPDATED_BY();

		String UPDATED_BY = policyPremRedirectionDetailsCacheModel.UPDATED_BY;

		if ((UPDATED_BY != null) && (UPDATED_BY.length() == 0)) {
			policyPremRedirectionDetailsCacheModel.UPDATED_BY = null;
		}

		return policyPremRedirectionDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{PREM_REDIRECTION_ID=");
		sb.append(getPREM_REDIRECTION_ID());
		sb.append(", POLICY_ID=");
		sb.append(getPOLICY_ID());
		sb.append(", TRANSACTION_AUDIT_ID=");
		sb.append(getTRANSACTION_AUDIT_ID());
		sb.append(", FUND_CODE=");
		sb.append(getFUND_CODE());
		sb.append(", ALLOCATION_PERCENTAGE=");
		sb.append(getALLOCATION_PERCENTAGE());
		sb.append(", SENT_TO_ODS_FLAG=");
		sb.append(getSENT_TO_ODS_FLAG());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PolicyPremRedirectionDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PREM_REDIRECTION_ID</column-name><column-value><![CDATA[");
		sb.append(getPREM_REDIRECTION_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>POLICY_ID</column-name><column-value><![CDATA[");
		sb.append(getPOLICY_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TRANSACTION_AUDIT_ID</column-name><column-value><![CDATA[");
		sb.append(getTRANSACTION_AUDIT_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FUND_CODE</column-name><column-value><![CDATA[");
		sb.append(getFUND_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ALLOCATION_PERCENTAGE</column-name><column-value><![CDATA[");
		sb.append(getALLOCATION_PERCENTAGE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SENT_TO_ODS_FLAG</column-name><column-value><![CDATA[");
		sb.append(getSENT_TO_ODS_FLAG());
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

	private static ClassLoader _classLoader = PolicyPremRedirectionDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			PolicyPremRedirectionDetails.class
		};
	private int _PREM_REDIRECTION_ID;
	private String _POLICY_ID;
	private int _TRANSACTION_AUDIT_ID;
	private String _FUND_CODE;
	private double _ALLOCATION_PERCENTAGE;
	private String _SENT_TO_ODS_FLAG;
	private Date _INSERTED_DATE;
	private String _INSERTED_BY;
	private Date _UPDATED_DATE;
	private String _UPDATED_BY;
	private PolicyPremRedirectionDetails _escapedModel;
}