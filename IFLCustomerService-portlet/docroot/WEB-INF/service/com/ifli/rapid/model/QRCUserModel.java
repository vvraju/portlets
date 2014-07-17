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
 * The base model interface for the QRCUser service. Represents a row in the &quot;QRC_USER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.QRCUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.QRCUserImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see QRCUser
 * @see com.ifli.rapid.model.impl.QRCUserImpl
 * @see com.ifli.rapid.model.impl.QRCUserModelImpl
 * @generated
 */
public interface QRCUserModel extends BaseModel<QRCUser> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a q r c user model instance should use the {@link QRCUser} interface instead.
	 */

	/**
	 * Returns the primary key of this q r c user.
	 *
	 * @return the primary key of this q r c user
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this q r c user.
	 *
	 * @param primaryKey the primary key of this q r c user
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the q r c_ u s e r_ i d of this q r c user.
	 *
	 * @return the q r c_ u s e r_ i d of this q r c user
	 */
	public int getQRC_USER_ID();

	/**
	 * Sets the q r c_ u s e r_ i d of this q r c user.
	 *
	 * @param QRC_USER_ID the q r c_ u s e r_ i d of this q r c user
	 */
	public void setQRC_USER_ID(int QRC_USER_ID);

	/**
	 * Returns the u s e r_ n a m e of this q r c user.
	 *
	 * @return the u s e r_ n a m e of this q r c user
	 */
	@AutoEscape
	public String getUSER_NAME();

	/**
	 * Sets the u s e r_ n a m e of this q r c user.
	 *
	 * @param USER_NAME the u s e r_ n a m e of this q r c user
	 */
	public void setUSER_NAME(String USER_NAME);

	/**
	 * Returns the t e a m_ i d of this q r c user.
	 *
	 * @return the t e a m_ i d of this q r c user
	 */
	public int getTEAM_ID();

	/**
	 * Sets the t e a m_ i d of this q r c user.
	 *
	 * @param TEAM_ID the t e a m_ i d of this q r c user
	 */
	public void setTEAM_ID(int TEAM_ID);

	/**
	 * Returns the u s e r_ d e t a i l s of this q r c user.
	 *
	 * @return the u s e r_ d e t a i l s of this q r c user
	 */
	public int getUSER_DETAILS();

	/**
	 * Sets the u s e r_ d e t a i l s of this q r c user.
	 *
	 * @param USER_DETAILS the u s e r_ d e t a i l s of this q r c user
	 */
	public void setUSER_DETAILS(int USER_DETAILS);

	/**
	 * Returns the a c t i v e_ f l a g of this q r c user.
	 *
	 * @return the a c t i v e_ f l a g of this q r c user
	 */
	@AutoEscape
	public String getACTIVE_FLAG();

	/**
	 * Sets the a c t i v e_ f l a g of this q r c user.
	 *
	 * @param ACTIVE_FLAG the a c t i v e_ f l a g of this q r c user
	 */
	public void setACTIVE_FLAG(String ACTIVE_FLAG);

	/**
	 * Returns the i n s e r t e d_ d a t e of this q r c user.
	 *
	 * @return the i n s e r t e d_ d a t e of this q r c user
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this q r c user.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this q r c user
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this q r c user.
	 *
	 * @return the i n s e r t e d_ b y of this q r c user
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this q r c user.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this q r c user
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this q r c user.
	 *
	 * @return the u p d a t e d_ d a t e of this q r c user
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this q r c user.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this q r c user
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this q r c user.
	 *
	 * @return the u p d a t e d_ b y of this q r c user
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this q r c user.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this q r c user
	 */
	public void setUPDATED_BY(String UPDATED_BY);

	/**
	 * Returns the d e l e t e d_ d a t e of this q r c user.
	 *
	 * @return the d e l e t e d_ d a t e of this q r c user
	 */
	public Date getDELETED_DATE();

	/**
	 * Sets the d e l e t e d_ d a t e of this q r c user.
	 *
	 * @param DELETED_DATE the d e l e t e d_ d a t e of this q r c user
	 */
	public void setDELETED_DATE(Date DELETED_DATE);

	/**
	 * Returns the d e l e t e d_ b y of this q r c user.
	 *
	 * @return the d e l e t e d_ b y of this q r c user
	 */
	@AutoEscape
	public String getDELETED_BY();

	/**
	 * Sets the d e l e t e d_ b y of this q r c user.
	 *
	 * @param DELETED_BY the d e l e t e d_ b y of this q r c user
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
	public int compareTo(QRCUser qrcUser);

	@Override
	public int hashCode();

	@Override
	public CacheModel<QRCUser> toCacheModel();

	@Override
	public QRCUser toEscapedModel();

	@Override
	public QRCUser toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}