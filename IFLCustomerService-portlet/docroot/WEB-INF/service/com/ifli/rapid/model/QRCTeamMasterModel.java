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
 * The base model interface for the QRCTeamMaster service. Represents a row in the &quot;QRC_TEAM_MASTER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.QRCTeamMasterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.QRCTeamMasterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCTeamMaster
 * @see com.ifli.rapid.model.impl.QRCTeamMasterImpl
 * @see com.ifli.rapid.model.impl.QRCTeamMasterModelImpl
 * @generated
 */
public interface QRCTeamMasterModel extends BaseModel<QRCTeamMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a q r c team master model instance should use the {@link QRCTeamMaster} interface instead.
	 */

	/**
	 * Returns the primary key of this q r c team master.
	 *
	 * @return the primary key of this q r c team master
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this q r c team master.
	 *
	 * @param primaryKey the primary key of this q r c team master
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the q r c_ t m_ i d of this q r c team master.
	 *
	 * @return the q r c_ t m_ i d of this q r c team master
	 */
	public int getQRC_TM_ID();

	/**
	 * Sets the q r c_ t m_ i d of this q r c team master.
	 *
	 * @param QRC_TM_ID the q r c_ t m_ i d of this q r c team master
	 */
	public void setQRC_TM_ID(int QRC_TM_ID);

	/**
	 * Returns the t m_ d e s c of this q r c team master.
	 *
	 * @return the t m_ d e s c of this q r c team master
	 */
	@AutoEscape
	public String getTM_DESC();

	/**
	 * Sets the t m_ d e s c of this q r c team master.
	 *
	 * @param TM_DESC the t m_ d e s c of this q r c team master
	 */
	public void setTM_DESC(String TM_DESC);

	/**
	 * Returns the a c t i v e_ f l a g of this q r c team master.
	 *
	 * @return the a c t i v e_ f l a g of this q r c team master
	 */
	@AutoEscape
	public String getACTIVE_FLAG();

	/**
	 * Sets the a c t i v e_ f l a g of this q r c team master.
	 *
	 * @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c team master
	 */
	public void setACTIVE_FLAG(String ACTIVE_FLAG);

	/**
	 * Returns the i n s e r t e d_ d a t e of this q r c team master.
	 *
	 * @return the i n s e r t e d_ d a t e of this q r c team master
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this q r c team master.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c team master
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this q r c team master.
	 *
	 * @return the i n s e r t e d_ b y of this q r c team master
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this q r c team master.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this q r c team master
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this q r c team master.
	 *
	 * @return the u p d a t e d_ d a t e of this q r c team master
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this q r c team master.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c team master
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this q r c team master.
	 *
	 * @return the u p d a t e d_ b y of this q r c team master
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this q r c team master.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this q r c team master
	 */
	public void setUPDATED_BY(String UPDATED_BY);

	/**
	 * Returns the d e l e t e d_ d a t e of this q r c team master.
	 *
	 * @return the d e l e t e d_ d a t e of this q r c team master
	 */
	public Date getDELETED_DATE();

	/**
	 * Sets the d e l e t e d_ d a t e of this q r c team master.
	 *
	 * @param DELETED_DATE the d e l e t e d_ d a t e of this q r c team master
	 */
	public void setDELETED_DATE(Date DELETED_DATE);

	/**
	 * Returns the d e l e t e d_ b y of this q r c team master.
	 *
	 * @return the d e l e t e d_ b y of this q r c team master
	 */
	@AutoEscape
	public String getDELETED_BY();

	/**
	 * Sets the d e l e t e d_ b y of this q r c team master.
	 *
	 * @param DELETED_BY the d e l e t e d_ b y of this q r c team master
	 */
	public void setDELETED_BY(String DELETED_BY);

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
	public int compareTo(QRCTeamMaster qrcTeamMaster);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QRCTeamMaster> toCacheModel();

	@Override
	public QRCTeamMaster toEscapedModel();

	@Override
	public QRCTeamMaster toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}