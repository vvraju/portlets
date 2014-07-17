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

package com.ifli.rapid.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QRCUser}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCUser
 * @generated
 */
public class QRCUserWrapper implements QRCUser, ModelWrapper<QRCUser> {
	public QRCUserWrapper(QRCUser qrcUser) {
		_qrcUser = qrcUser;
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

	/**
	* Returns the primary key of this q r c user.
	*
	* @return the primary key of this q r c user
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcUser.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q r c user.
	*
	* @param primaryKey the primary key of this q r c user
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcUser.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the q r c_ u s e r_ i d of this q r c user.
	*
	* @return the q r c_ u s e r_ i d of this q r c user
	*/
	@Override
	public int getQRC_USER_ID() {
		return _qrcUser.getQRC_USER_ID();
	}

	/**
	* Sets the q r c_ u s e r_ i d of this q r c user.
	*
	* @param QRC_USER_ID the q r c_ u s e r_ i d of this q r c user
	*/
	@Override
	public void setQRC_USER_ID(int QRC_USER_ID) {
		_qrcUser.setQRC_USER_ID(QRC_USER_ID);
	}

	/**
	* Returns the u s e r_ n a m e of this q r c user.
	*
	* @return the u s e r_ n a m e of this q r c user
	*/
	@Override
	public java.lang.String getUSER_NAME() {
		return _qrcUser.getUSER_NAME();
	}

	/**
	* Sets the u s e r_ n a m e of this q r c user.
	*
	* @param USER_NAME the u s e r_ n a m e of this q r c user
	*/
	@Override
	public void setUSER_NAME(java.lang.String USER_NAME) {
		_qrcUser.setUSER_NAME(USER_NAME);
	}

	/**
	* Returns the t e a m_ i d of this q r c user.
	*
	* @return the t e a m_ i d of this q r c user
	*/
	@Override
	public int getTEAM_ID() {
		return _qrcUser.getTEAM_ID();
	}

	/**
	* Sets the t e a m_ i d of this q r c user.
	*
	* @param TEAM_ID the t e a m_ i d of this q r c user
	*/
	@Override
	public void setTEAM_ID(int TEAM_ID) {
		_qrcUser.setTEAM_ID(TEAM_ID);
	}

	/**
	* Returns the u s e r_ d e t a i l s of this q r c user.
	*
	* @return the u s e r_ d e t a i l s of this q r c user
	*/
	@Override
	public int getUSER_DETAILS() {
		return _qrcUser.getUSER_DETAILS();
	}

	/**
	* Sets the u s e r_ d e t a i l s of this q r c user.
	*
	* @param USER_DETAILS the u s e r_ d e t a i l s of this q r c user
	*/
	@Override
	public void setUSER_DETAILS(int USER_DETAILS) {
		_qrcUser.setUSER_DETAILS(USER_DETAILS);
	}

	/**
	* Returns the a c t i v e_ f l a g of this q r c user.
	*
	* @return the a c t i v e_ f l a g of this q r c user
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _qrcUser.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this q r c user.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c user
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_qrcUser.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this q r c user.
	*
	* @return the i n s e r t e d_ d a t e of this q r c user
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _qrcUser.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this q r c user.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c user
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_qrcUser.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this q r c user.
	*
	* @return the i n s e r t e d_ b y of this q r c user
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _qrcUser.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this q r c user.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this q r c user
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_qrcUser.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this q r c user.
	*
	* @return the u p d a t e d_ d a t e of this q r c user
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _qrcUser.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this q r c user.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c user
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_qrcUser.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this q r c user.
	*
	* @return the u p d a t e d_ b y of this q r c user
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _qrcUser.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this q r c user.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this q r c user
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_qrcUser.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the d e l e t e d_ d a t e of this q r c user.
	*
	* @return the d e l e t e d_ d a t e of this q r c user
	*/
	@Override
	public java.util.Date getDELETED_DATE() {
		return _qrcUser.getDELETED_DATE();
	}

	/**
	* Sets the d e l e t e d_ d a t e of this q r c user.
	*
	* @param DELETED_DATE the d e l e t e d_ d a t e of this q r c user
	*/
	@Override
	public void setDELETED_DATE(java.util.Date DELETED_DATE) {
		_qrcUser.setDELETED_DATE(DELETED_DATE);
	}

	/**
	* Returns the d e l e t e d_ b y of this q r c user.
	*
	* @return the d e l e t e d_ b y of this q r c user
	*/
	@Override
	public java.lang.String getDELETED_BY() {
		return _qrcUser.getDELETED_BY();
	}

	/**
	* Sets the d e l e t e d_ b y of this q r c user.
	*
	* @param DELETED_BY the d e l e t e d_ b y of this q r c user
	*/
	@Override
	public void setDELETED_BY(java.lang.String DELETED_BY) {
		_qrcUser.setDELETED_BY(DELETED_BY);
	}

	@Override
	public boolean isNew() {
		return _qrcUser.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcUser.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcUser.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcUser.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcUser.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcUser.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcUser.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcUser.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcUser.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QRCUserWrapper((QRCUser)_qrcUser.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.QRCUser qrcUser) {
		return _qrcUser.compareTo(qrcUser);
	}

	@Override
	public int hashCode() {
		return _qrcUser.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.QRCUser> toCacheModel() {
		return _qrcUser.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.QRCUser toEscapedModel() {
		return new QRCUserWrapper(_qrcUser.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.QRCUser toUnescapedModel() {
		return new QRCUserWrapper(_qrcUser.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcUser.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcUser.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QRCUserWrapper)) {
			return false;
		}

		QRCUserWrapper qrcUserWrapper = (QRCUserWrapper)obj;

		if (Validator.equals(_qrcUser, qrcUserWrapper._qrcUser)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QRCUser getWrappedQRCUser() {
		return _qrcUser;
	}

	@Override
	public QRCUser getWrappedModel() {
		return _qrcUser;
	}

	@Override
	public void resetOriginalValues() {
		_qrcUser.resetOriginalValues();
	}

	private QRCUser _qrcUser;
}