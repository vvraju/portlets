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
 * This class is a wrapper for {@link QRCTypeMaster}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCTypeMaster
 * @generated
 */
public class QRCTypeMasterWrapper implements QRCTypeMaster,
	ModelWrapper<QRCTypeMaster> {
	public QRCTypeMasterWrapper(QRCTypeMaster qrcTypeMaster) {
		_qrcTypeMaster = qrcTypeMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return QRCTypeMaster.class;
	}

	@Override
	public String getModelClassName() {
		return QRCTypeMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("QRC_TYPE_ID", getQRC_TYPE_ID());
		attributes.put("TYPE_DESC", getTYPE_DESC());
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
		Integer QRC_TYPE_ID = (Integer)attributes.get("QRC_TYPE_ID");

		if (QRC_TYPE_ID != null) {
			setQRC_TYPE_ID(QRC_TYPE_ID);
		}

		String TYPE_DESC = (String)attributes.get("TYPE_DESC");

		if (TYPE_DESC != null) {
			setTYPE_DESC(TYPE_DESC);
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
	* Returns the primary key of this q r c type master.
	*
	* @return the primary key of this q r c type master
	*/
	@Override
	public int getPrimaryKey() {
		return _qrcTypeMaster.getPrimaryKey();
	}

	/**
	* Sets the primary key of this q r c type master.
	*
	* @param primaryKey the primary key of this q r c type master
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_qrcTypeMaster.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the q r c_ t y p e_ i d of this q r c type master.
	*
	* @return the q r c_ t y p e_ i d of this q r c type master
	*/
	@Override
	public int getQRC_TYPE_ID() {
		return _qrcTypeMaster.getQRC_TYPE_ID();
	}

	/**
	* Sets the q r c_ t y p e_ i d of this q r c type master.
	*
	* @param QRC_TYPE_ID the q r c_ t y p e_ i d of this q r c type master
	*/
	@Override
	public void setQRC_TYPE_ID(int QRC_TYPE_ID) {
		_qrcTypeMaster.setQRC_TYPE_ID(QRC_TYPE_ID);
	}

	/**
	* Returns the t y p e_ d e s c of this q r c type master.
	*
	* @return the t y p e_ d e s c of this q r c type master
	*/
	@Override
	public java.lang.String getTYPE_DESC() {
		return _qrcTypeMaster.getTYPE_DESC();
	}

	/**
	* Sets the t y p e_ d e s c of this q r c type master.
	*
	* @param TYPE_DESC the t y p e_ d e s c of this q r c type master
	*/
	@Override
	public void setTYPE_DESC(java.lang.String TYPE_DESC) {
		_qrcTypeMaster.setTYPE_DESC(TYPE_DESC);
	}

	/**
	* Returns the a c t i v e_ f l a g of this q r c type master.
	*
	* @return the a c t i v e_ f l a g of this q r c type master
	*/
	@Override
	public java.lang.String getACTIVE_FLAG() {
		return _qrcTypeMaster.getACTIVE_FLAG();
	}

	/**
	* Sets the a c t i v e_ f l a g of this q r c type master.
	*
	* @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c type master
	*/
	@Override
	public void setACTIVE_FLAG(java.lang.String ACTIVE_FLAG) {
		_qrcTypeMaster.setACTIVE_FLAG(ACTIVE_FLAG);
	}

	/**
	* Returns the i n s e r t e d_ d a t e of this q r c type master.
	*
	* @return the i n s e r t e d_ d a t e of this q r c type master
	*/
	@Override
	public java.util.Date getINSERTED_DATE() {
		return _qrcTypeMaster.getINSERTED_DATE();
	}

	/**
	* Sets the i n s e r t e d_ d a t e of this q r c type master.
	*
	* @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c type master
	*/
	@Override
	public void setINSERTED_DATE(java.util.Date INSERTED_DATE) {
		_qrcTypeMaster.setINSERTED_DATE(INSERTED_DATE);
	}

	/**
	* Returns the i n s e r t e d_ b y of this q r c type master.
	*
	* @return the i n s e r t e d_ b y of this q r c type master
	*/
	@Override
	public java.lang.String getINSERTED_BY() {
		return _qrcTypeMaster.getINSERTED_BY();
	}

	/**
	* Sets the i n s e r t e d_ b y of this q r c type master.
	*
	* @param INSERTED_BY the i n s e r t e d_ b y of this q r c type master
	*/
	@Override
	public void setINSERTED_BY(java.lang.String INSERTED_BY) {
		_qrcTypeMaster.setINSERTED_BY(INSERTED_BY);
	}

	/**
	* Returns the u p d a t e d_ d a t e of this q r c type master.
	*
	* @return the u p d a t e d_ d a t e of this q r c type master
	*/
	@Override
	public java.util.Date getUPDATED_DATE() {
		return _qrcTypeMaster.getUPDATED_DATE();
	}

	/**
	* Sets the u p d a t e d_ d a t e of this q r c type master.
	*
	* @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c type master
	*/
	@Override
	public void setUPDATED_DATE(java.util.Date UPDATED_DATE) {
		_qrcTypeMaster.setUPDATED_DATE(UPDATED_DATE);
	}

	/**
	* Returns the u p d a t e d_ b y of this q r c type master.
	*
	* @return the u p d a t e d_ b y of this q r c type master
	*/
	@Override
	public java.lang.String getUPDATED_BY() {
		return _qrcTypeMaster.getUPDATED_BY();
	}

	/**
	* Sets the u p d a t e d_ b y of this q r c type master.
	*
	* @param UPDATED_BY the u p d a t e d_ b y of this q r c type master
	*/
	@Override
	public void setUPDATED_BY(java.lang.String UPDATED_BY) {
		_qrcTypeMaster.setUPDATED_BY(UPDATED_BY);
	}

	/**
	* Returns the d e l e t e d_ d a t e of this q r c type master.
	*
	* @return the d e l e t e d_ d a t e of this q r c type master
	*/
	@Override
	public java.util.Date getDELETED_DATE() {
		return _qrcTypeMaster.getDELETED_DATE();
	}

	/**
	* Sets the d e l e t e d_ d a t e of this q r c type master.
	*
	* @param DELETED_DATE the d e l e t e d_ d a t e of this q r c type master
	*/
	@Override
	public void setDELETED_DATE(java.util.Date DELETED_DATE) {
		_qrcTypeMaster.setDELETED_DATE(DELETED_DATE);
	}

	/**
	* Returns the d e l e t e d_ b y of this q r c type master.
	*
	* @return the d e l e t e d_ b y of this q r c type master
	*/
	@Override
	public java.lang.String getDELETED_BY() {
		return _qrcTypeMaster.getDELETED_BY();
	}

	/**
	* Sets the d e l e t e d_ b y of this q r c type master.
	*
	* @param DELETED_BY the d e l e t e d_ b y of this q r c type master
	*/
	@Override
	public void setDELETED_BY(java.lang.String DELETED_BY) {
		_qrcTypeMaster.setDELETED_BY(DELETED_BY);
	}

	@Override
	public boolean isNew() {
		return _qrcTypeMaster.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_qrcTypeMaster.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _qrcTypeMaster.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_qrcTypeMaster.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _qrcTypeMaster.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _qrcTypeMaster.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_qrcTypeMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _qrcTypeMaster.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_qrcTypeMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_qrcTypeMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_qrcTypeMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QRCTypeMasterWrapper((QRCTypeMaster)_qrcTypeMaster.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.QRCTypeMaster qrcTypeMaster) {
		return _qrcTypeMaster.compareTo(qrcTypeMaster);
	}

	@Override
	public int hashCode() {
		return _qrcTypeMaster.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.QRCTypeMaster> toCacheModel() {
		return _qrcTypeMaster.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.QRCTypeMaster toEscapedModel() {
		return new QRCTypeMasterWrapper(_qrcTypeMaster.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.QRCTypeMaster toUnescapedModel() {
		return new QRCTypeMasterWrapper(_qrcTypeMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _qrcTypeMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _qrcTypeMaster.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_qrcTypeMaster.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QRCTypeMasterWrapper)) {
			return false;
		}

		QRCTypeMasterWrapper qrcTypeMasterWrapper = (QRCTypeMasterWrapper)obj;

		if (Validator.equals(_qrcTypeMaster, qrcTypeMasterWrapper._qrcTypeMaster)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QRCTypeMaster getWrappedQRCTypeMaster() {
		return _qrcTypeMaster;
	}

	@Override
	public QRCTypeMaster getWrappedModel() {
		return _qrcTypeMaster;
	}

	@Override
	public void resetOriginalValues() {
		_qrcTypeMaster.resetOriginalValues();
	}

	private QRCTypeMaster _qrcTypeMaster;
}