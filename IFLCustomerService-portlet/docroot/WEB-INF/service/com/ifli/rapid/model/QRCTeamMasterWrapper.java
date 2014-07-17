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
 * This class is a wrapper for {@link QRCTeamMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCTeamMaster
 * @generated
 */
public class QRCTeamMasterWrapper implements QRCTeamMaster,
	ModelWrapper<QRCTeamMaster> {
	public QRCTeamMasterWrapper(QRCTeamMaster qrcTeamMaster) {
		_qrcTeamMaster = qrcTeamMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return QRCTeamMaster.class;
	}

	@Override
	public String getModelClassName() {
		return QRCTeamMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_TM_ID", getQRC_TM_ID());
		attributes.put("TM_DESC", getTM_DESC());
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
		Integer QRC_TM_ID = (Integer)attributes.get("QRC_TM_ID");

		if (QRC_TM_ID != null) {
			setQRC_TM_ID(QRC_TM_ID);
		}

		String TM_DESC = (String)attributes.get("TM_DESC");

		if (TM_DESC != null) {
			setTM_DESC(TM_DESC);
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
	* Returns the primary key of this q r c team master.
	*
	* @return the primary key of this q r c team master
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcTeamMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q r c team master.
	*
	* @param primaryKey the primary key of this q r c team master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcTeamMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the q r c_ t m_ i d of this q r c team master.
	*
	* @return the q r c_ t m_ i d of this q r c team master
	*/
	@Override
	public int getQRC_TM_ID() {
		return _qrcTeamMaster.getQRC_TM_ID();
	}

	/**
	* Sets the q r c_ t m_ i d of this q r c team master.
	*
	* @param QRC_TM_ID the q r c_ t m_ i d of this q r c team master
	*/
	@Override
	public void setQRC_TM_ID(int QRC_TM_ID) {
		_qrcTeamMaster.setQRC_TM_ID(QRC_TM_ID);
	}

	/**
	* Returns the t m_ d e s c of this q r c team master.
	*
	* @return the t m_ d e s c of this q r c team master
	*/
	@Override
	public java.lang.String getTM_DESC() {
		return _qrcTeamMaster.getTM_DESC();
	}

	/**
	* Sets the t m_ d e s c of this q r c team master.
	*
	* @param TM_DESC the t m_ d e s c of this q r c team master
	*/
	@Override
	public void setTM_DESC(java.lang.String TM_DESC) {
		_qrcTeamMaster.setTM_DESC(TM_DESC);
	}

	/**
	* Returns the a c t i v e_ f l a g of this q r c team master.
	*
	* @return the a c t i v e_ f l a g of this q r c team master
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _qrcTeamMaster.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this q r c team master.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c team master
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_qrcTeamMaster.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this q r c team master.
	*
	* @return the i n s e r t e d_ d a t e of this q r c team master
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _qrcTeamMaster.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this q r c team master.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c team master
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_qrcTeamMaster.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this q r c team master.
	*
	* @return the i n s e r t e d_ b y of this q r c team master
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _qrcTeamMaster.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this q r c team master.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this q r c team master
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_qrcTeamMaster.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this q r c team master.
	*
	* @return the u p d a t e d_ d a t e of this q r c team master
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _qrcTeamMaster.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this q r c team master.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c team master
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_qrcTeamMaster.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this q r c team master.
	*
	* @return the u p d a t e d_ b y of this q r c team master
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _qrcTeamMaster.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this q r c team master.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this q r c team master
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_qrcTeamMaster.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the d e l e t e d_ d a t e of this q r c team master.
	*
	* @return the d e l e t e d_ d a t e of this q r c team master
	*/
	@Override
	public java.util.Date getDELETED_DATE() {
		return _qrcTeamMaster.getDELETED_DATE();
	}

	/**
	* Sets the d e l e t e d_ d a t e of this q r c team master.
	*
	* @param DELETED_DATE the d e l e t e d_ d a t e of this q r c team master
	*/
	@Override
	public void setDELETED_DATE(java.util.Date DELETED_DATE) {
		_qrcTeamMaster.setDELETED_DATE(DELETED_DATE);
	}

	/**
	* Returns the d e l e t e d_ b y of this q r c team master.
	*
	* @return the d e l e t e d_ b y of this q r c team master
	*/
	@Override
	public java.lang.String getDELETED_BY() {
		return _qrcTeamMaster.getDELETED_BY();
	}

	/**
	* Sets the d e l e t e d_ b y of this q r c team master.
	*
	* @param DELETED_BY the d e l e t e d_ b y of this q r c team master
	*/
	@Override
	public void setDELETED_BY(java.lang.String DELETED_BY) {
		_qrcTeamMaster.setDELETED_BY(DELETED_BY);
	}

	@Override
	public boolean isNew() {
		return _qrcTeamMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcTeamMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcTeamMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcTeamMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcTeamMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcTeamMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcTeamMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcTeamMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcTeamMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcTeamMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcTeamMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QRCTeamMasterWrapper((QRCTeamMaster)_qrcTeamMaster.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.QRCTeamMaster qrcTeamMaster) {
		return _qrcTeamMaster.compareTo(qrcTeamMaster);
	}

	@Override
	public int hashCode() {
		return _qrcTeamMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.QRCTeamMaster> toCacheModel() {
		return _qrcTeamMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.QRCTeamMaster toEscapedModel() {
		return new QRCTeamMasterWrapper(_qrcTeamMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.QRCTeamMaster toUnescapedModel() {
		return new QRCTeamMasterWrapper(_qrcTeamMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcTeamMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcTeamMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcTeamMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QRCTeamMasterWrapper)) {
			return false;
		}

		QRCTeamMasterWrapper qrcTeamMasterWrapper = (QRCTeamMasterWrapper)obj;

		if (Validator.equals(_qrcTeamMaster, qrcTeamMasterWrapper._qrcTeamMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QRCTeamMaster getWrappedQRCTeamMaster() {
		return _qrcTeamMaster;
	}

	@Override
	public QRCTeamMaster getWrappedModel() {
		return _qrcTeamMaster;
	}

	@Override
	public void resetOriginalValues() {
		_qrcTeamMaster.resetOriginalValues();
	}

	private QRCTeamMaster _qrcTeamMaster;
}