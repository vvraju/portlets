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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the QRCStatus service. Represents a row in the &quot;QRC_Status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.QRCStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.QRCStatusImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCStatus
 * @see com.ifli.rapid.model.impl.QRCStatusImpl
 * @see com.ifli.rapid.model.impl.QRCStatusModelImpl
 * @generated
 */
public interface QRCStatusModel extends BaseModel<QRCStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a q r c status model instance should use the {@link QRCStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this q r c status.
	 *
	 * @return the primary key of this q r c status
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this q r c status.
	 *
	 * @param primaryKey the primary key of this q r c status
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the q r c_ s t a t u s_ i d of this q r c status.
	 *
	 * @return the q r c_ s t a t u s_ i d of this q r c status
	 */
	public int getQRC_STATUS_ID();

	/**
	 * Sets the q r c_ s t a t u s_ i d of this q r c status.
	 *
	 * @param QRC_STATUS_ID the q r c_ s t a t u s_ i d of this q r c status
	 */
	public void setQRC_STATUS_ID(int QRC_STATUS_ID);

	/**
	 * Returns the s t a t u s_ d e s c of this q r c status.
	 *
	 * @return the s t a t u s_ d e s c of this q r c status
	 */
	@AutoEscape
	public String getSTATUS_DESC();

	/**
	 * Sets the s t a t u s_ d e s c of this q r c status.
	 *
	 * @param STATUS_DESC the s t a t u s_ d e s c of this q r c status
	 */
	public void setSTATUS_DESC(String STATUS_DESC);

	/**
	 * Returns the a c t i v e_ f l a g of this q r c status.
	 *
	 * @return the a c t i v e_ f l a g of this q r c status
	 */
	@AutoEscape
	public String getACTIVE_FLAG();

	/**
	 * Sets the a c t i v e_ f l a g of this q r c status.
	 *
	 * @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c status
	 */
	public void setACTIVE_FLAG(String ACTIVE_FLAG);

	/**
	 * Returns the i n s e r t e d_ d a t e of this q r c status.
	 *
	 * @return the i n s e r t e d_ d a t e of this q r c status
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this q r c status.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c status
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this q r c status.
	 *
	 * @return the i n s e r t e d_ b y of this q r c status
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this q r c status.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this q r c status
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this q r c status.
	 *
	 * @return the u p d a t e d_ d a t e of this q r c status
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this q r c status.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c status
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this q r c status.
	 *
	 * @return the u p d a t e d_ b y of this q r c status
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this q r c status.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this q r c status
	 */
	public void setUPDATED_BY(String UPDATED_BY);

	/**
	 * Returns the d e l e t e d_ d a t e of this q r c status.
	 *
	 * @return the d e l e t e d_ d a t e of this q r c status
	 */
	public Date getDELETED_DATE();

	/**
	 * Sets the d e l e t e d_ d a t e of this q r c status.
	 *
	 * @param DELETED_DATE the d e l e t e d_ d a t e of this q r c status
	 */
	public void setDELETED_DATE(Date DELETED_DATE);

	/**
	 * Returns the d e l e t e d_ b y of this q r c status.
	 *
	 * @return the d e l e t e d_ b y of this q r c status
	 */
	@AutoEscape
	public String getDELETED_BY();

	/**
	 * Sets the d e l e t e d_ b y of this q r c status.
	 *
	 * @param DELETED_BY the d e l e t e d_ b y of this q r c status
	 */
	public void setDELETED_BY(String DELETED_BY);

	/**
	 * Returns the q r c_ a s r_ i d of this q r c status.
	 *
	 * @return the q r c_ a s r_ i d of this q r c status
	 */
	public int getQRC_ASR_ID();

	/**
	 * Sets the q r c_ a s r_ i d of this q r c status.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d of this q r c status
	 */
	public void setQRC_ASR_ID(int QRC_ASR_ID);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(QRCStatus qrcStatus);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QRCStatus> toCacheModel();

	@Override
	public QRCStatus toEscapedModel();

	@Override
	public QRCStatus toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}