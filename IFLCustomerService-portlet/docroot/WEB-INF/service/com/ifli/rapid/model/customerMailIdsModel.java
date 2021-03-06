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
 * The base model interface for the customerMailIds service. Represents a row in the &quot;customer_mailids&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.customerMailIdsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.customerMailIdsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see customerMailIds
 * @see com.ifli.rapid.model.impl.customerMailIdsImpl
 * @see com.ifli.rapid.model.impl.customerMailIdsModelImpl
 * @generated
 */
public interface customerMailIdsModel extends BaseModel<customerMailIds> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a customer mail IDs model instance should use the {@link customerMailIds} interface instead.
	 */

	/**
	 * Returns the primary key of this customer mail IDs.
	 *
	 * @return the primary key of this customer mail IDs
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this customer mail IDs.
	 *
	 * @param primaryKey the primary key of this customer mail IDs
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the i d of this customer mail IDs.
	 *
	 * @return the i d of this customer mail IDs
	 */
	public int getID();

	/**
	 * Sets the i d of this customer mail IDs.
	 *
	 * @param ID the i d of this customer mail IDs
	 */
	public void setID(int ID);

	/**
	 * Returns the c u s t o m e r_ i d of this customer mail IDs.
	 *
	 * @return the c u s t o m e r_ i d of this customer mail IDs
	 */
	public int getCUSTOMER_ID();

	/**
	 * Sets the c u s t o m e r_ i d of this customer mail IDs.
	 *
	 * @param CUSTOMER_ID the c u s t o m e r_ i d of this customer mail IDs
	 */
	public void setCUSTOMER_ID(int CUSTOMER_ID);

	/**
	 * Returns the e m a i l_ i d of this customer mail IDs.
	 *
	 * @return the e m a i l_ i d of this customer mail IDs
	 */
	@AutoEscape
	public String getEMAIL_ID();

	/**
	 * Sets the e m a i l_ i d of this customer mail IDs.
	 *
	 * @param EMAIL_ID the e m a i l_ i d of this customer mail IDs
	 */
	public void setEMAIL_ID(String EMAIL_ID);

	/**
	 * Returns the i n s e r t e d_ b y of this customer mail IDs.
	 *
	 * @return the i n s e r t e d_ b y of this customer mail IDs
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this customer mail IDs.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this customer mail IDs
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the i n s e r t e d_ d a t e of this customer mail IDs.
	 *
	 * @return the i n s e r t e d_ d a t e of this customer mail IDs
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this customer mail IDs.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this customer mail IDs
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this customer mail IDs.
	 *
	 * @return the u p d a t e d_ b y of this customer mail IDs
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this customer mail IDs.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this customer mail IDs
	 */
	public void setUPDATED_BY(String UPDATED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this customer mail IDs.
	 *
	 * @return the u p d a t e d_ d a t e of this customer mail IDs
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this customer mail IDs.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this customer mail IDs
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

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
	public int compareTo(customerMailIds customerMailIds);

	@Override
	public int hashCode();

	@Override
	public CacheModel<customerMailIds> toCacheModel();

	@Override
	public customerMailIds toEscapedModel();

	@Override
	public customerMailIds toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}