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
 * This class is a wrapper for {@link QRCStatus}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCStatus
 * @generated
 */
public class QRCStatusWrapper implements QRCStatus, ModelWrapper<QRCStatus> {
	public QRCStatusWrapper(QRCStatus qrcStatus) {
		_qrcStatus = qrcStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return QRCStatus.class;
	}

	@Override
	public String getModelClassName() {
		return QRCStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_STATUS_ID", getQRC_STATUS_ID());
		attributes.put("STATUS_DESC", getSTATUS_DESC());
		attributes.put("ACTIVE_FLAG", getACTIVE_FLAG());
		attributes.put("INSERTED_DATE", getINSERTED_DATE());
		attributes.put("INSERTED_BY", getINSERTED_BY());
		attributes.put("UPDATED_DATE", getUPDATED_DATE());
		attributes.put("UPDATED_BY", getUPDATED_BY());
		attributes.put("DELETED_DATE", getDELETED_DATE());
		attributes.put("DELETED_BY", getDELETED_BY());
		attributes.put("QRC_ASR_ID", getQRC_ASR_ID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer QRC_STATUS_ID = (Integer)attributes.get("QRC_STATUS_ID");

		if (QRC_STATUS_ID != null) {
			setQRC_STATUS_ID(QRC_STATUS_ID);
		}

		String STATUS_DESC = (String)attributes.get("STATUS_DESC");

		if (STATUS_DESC != null) {
			setSTATUS_DESC(STATUS_DESC);
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

		Integer QRC_ASR_ID = (Integer)attributes.get("QRC_ASR_ID");

		if (QRC_ASR_ID != null) {
			setQRC_ASR_ID(QRC_ASR_ID);
		}
	}

	/**
	* Returns the primary key of this q r c status.
	*
	* @return the primary key of this q r c status
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q r c status.
	*
	* @param primaryKey the primary key of this q r c status
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the q r c_ s t a t u s_ i d of this q r c status.
	*
	* @return the q r c_ s t a t u s_ i d of this q r c status
	*/
	@Override
	public int getQRC_STATUS_ID() {
		return _qrcStatus.getQRC_STATUS_ID();
	}

	/**
	* Sets the q r c_ s t a t u s_ i d of this q r c status.
	*
	* @param QRC_STATUS_ID the q r c_ s t a t u s_ i d of this q r c status
	*/
	@Override
	public void setQRC_STATUS_ID(int QRC_STATUS_ID) {
		_qrcStatus.setQRC_STATUS_ID(QRC_STATUS_ID);
	}

	/**
	* Returns the s t a t u s_ d e s c of this q r c status.
	*
	* @return the s t a t u s_ d e s c of this q r c status
	*/
	@Override
	public java.lang.String getSTATUS_DESC() {
		return _qrcStatus.getSTATUS_DESC();
	}

	/**
	* Sets the s t a t u s_ d e s c of this q r c status.
	*
	* @param STATUS_DESC the s t a t u s_ d e s c of this q r c status
	*/
	@Override
	public void setSTATUS_DESC(java.lang.String STATUS_DESC) {
		_qrcStatus.setSTATUS_DESC(STATUS_DESC);
	}

	/**
	* Returns the a c t i v e_ f l a g of this q r c status.
	*
	* @return the a c t i v e_ f l a g of this q r c status
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _qrcStatus.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this q r c status.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c status
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_qrcStatus.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this q r c status.
	*
	* @return the i n s e r t e d_ d a t e of this q r c status
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _qrcStatus.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this q r c status.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c status
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_qrcStatus.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this q r c status.
	*
	* @return the i n s e r t e d_ b y of this q r c status
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _qrcStatus.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this q r c status.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this q r c status
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_qrcStatus.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this q r c status.
	*
	* @return the u p d a t e d_ d a t e of this q r c status
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _qrcStatus.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this q r c status.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c status
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_qrcStatus.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this q r c status.
	*
	* @return the u p d a t e d_ b y of this q r c status
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _qrcStatus.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this q r c status.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this q r c status
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_qrcStatus.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the d e l e t e d_ d a t e of this q r c status.
	*
	* @return the d e l e t e d_ d a t e of this q r c status
	*/
	@Override
	public java.util.Date getDELETED_DATE() {
		return _qrcStatus.getDELETED_DATE();
	}

	/**
	* Sets the d e l e t e d_ d a t e of this q r c status.
	*
	* @param DELETED_DATE the d e l e t e d_ d a t e of this q r c status
	*/
	@Override
	public void setDELETED_DATE(java.util.Date DELETED_DATE) {
		_qrcStatus.setDELETED_DATE(DELETED_DATE);
	}

	/**
	* Returns the d e l e t e d_ b y of this q r c status.
	*
	* @return the d e l e t e d_ b y of this q r c status
	*/
	@Override
	public java.lang.String getDELETED_BY() {
		return _qrcStatus.getDELETED_BY();
	}

	/**
	* Sets the d e l e t e d_ b y of this q r c status.
	*
	* @param DELETED_BY the d e l e t e d_ b y of this q r c status
	*/
	@Override
	public void setDELETED_BY(java.lang.String DELETED_BY) {
		_qrcStatus.setDELETED_BY(DELETED_BY);
	}

	/**
	* Returns the q r c_ a s r_ i d of this q r c status.
	*
	* @return the q r c_ a s r_ i d of this q r c status
	*/
	@Override
	public int getQRC_ASR_ID() {
		return _qrcStatus.getQRC_ASR_ID();
	}

	/**
	* Sets the q r c_ a s r_ i d of this q r c status.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d of this q r c status
	*/
	@Override
	public void setQRC_ASR_ID(int QRC_ASR_ID) {
		_qrcStatus.setQRC_ASR_ID(QRC_ASR_ID);
	}

	@Override
	public boolean isNew() {
		return _qrcStatus.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcStatus.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcStatus.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcStatus.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcStatus.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcStatus.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcStatus.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QRCStatusWrapper((QRCStatus)_qrcStatus.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.QRCStatus qrcStatus) {
		return _qrcStatus.compareTo(qrcStatus);
	}

	@Override
	public int hashCode() {
		return _qrcStatus.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.QRCStatus> toCacheModel() {
		return _qrcStatus.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.QRCStatus toEscapedModel() {
		return new QRCStatusWrapper(_qrcStatus.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.QRCStatus toUnescapedModel() {
		return new QRCStatusWrapper(_qrcStatus.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcStatus.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcStatus.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QRCStatusWrapper)) {
			return false;
		}

		QRCStatusWrapper qrcStatusWrapper = (QRCStatusWrapper)obj;

		if (Validator.equals(_qrcStatus, qrcStatusWrapper._qrcStatus)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QRCStatus getWrappedQRCStatus() {
		return _qrcStatus;
	}

	@Override
	public QRCStatus getWrappedModel() {
		return _qrcStatus;
	}

	@Override
	public void resetOriginalValues() {
		_qrcStatus.resetOriginalValues();
	}

	private QRCStatus _qrcStatus;
}