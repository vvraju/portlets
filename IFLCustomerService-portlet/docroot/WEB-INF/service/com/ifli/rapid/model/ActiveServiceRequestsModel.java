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
 * The base model interface for the ActiveServiceRequests service. Represents a row in the &quot;QRC_ACTIVE_SERVICE_REQS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.ActiveServiceRequestsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ActiveServiceRequests
 * @see com.ifli.rapid.model.impl.ActiveServiceRequestsImpl
 * @see com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl
 * @generated
 */
public interface ActiveServiceRequestsModel extends BaseModel<ActiveServiceRequests> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a active service requests model instance should use the {@link ActiveServiceRequests} interface instead.
	 */

	/**
	 * Returns the primary key of this active service requests.
	 *
	 * @return the primary key of this active service requests
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this active service requests.
	 *
	 * @param primaryKey the primary key of this active service requests
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the q r c_ a s r_ i d of this active service requests.
	 *
	 * @return the q r c_ a s r_ i d of this active service requests
	 */
	public int getQRC_ASR_ID();

	/**
	 * Sets the q r c_ a s r_ i d of this active service requests.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d of this active service requests
	 */
	public void setQRC_ASR_ID(int QRC_ASR_ID);

	/**
	 * Returns the t y p e_ i d of this active service requests.
	 *
	 * @return the t y p e_ i d of this active service requests
	 */
	public int getTYPE_ID();

	/**
	 * Sets the t y p e_ i d of this active service requests.
	 *
	 * @param TYPE_ID the t y p e_ i d of this active service requests
	 */
	public void setTYPE_ID(int TYPE_ID);

	/**
	 * Returns the s u b_ t y p e_ i d of this active service requests.
	 *
	 * @return the s u b_ t y p e_ i d of this active service requests
	 */
	public int getSUB_TYPE_ID();

	/**
	 * Sets the s u b_ t y p e_ i d of this active service requests.
	 *
	 * @param SUB_TYPE_ID the s u b_ t y p e_ i d of this active service requests
	 */
	public void setSUB_TYPE_ID(int SUB_TYPE_ID);

	/**
	 * Returns the a s s i g n e d_ t o of this active service requests.
	 *
	 * @return the a s s i g n e d_ t o of this active service requests
	 */
	public int getASSIGNED_TO();

	/**
	 * Sets the a s s i g n e d_ t o of this active service requests.
	 *
	 * @param ASSIGNED_TO the a s s i g n e d_ t o of this active service requests
	 */
	public void setASSIGNED_TO(int ASSIGNED_TO);

	/**
	 * Returns the h a n d l e d_ b y of this active service requests.
	 *
	 * @return the h a n d l e d_ b y of this active service requests
	 */
	public int getHANDLED_BY();

	/**
	 * Sets the h a n d l e d_ b y of this active service requests.
	 *
	 * @param HANDLED_BY the h a n d l e d_ b y of this active service requests
	 */
	public void setHANDLED_BY(int HANDLED_BY);

	/**
	 * Returns the s t a t u s_ i d of this active service requests.
	 *
	 * @return the s t a t u s_ i d of this active service requests
	 */
	public int getSTATUS_ID();

	/**
	 * Sets the s t a t u s_ i d of this active service requests.
	 *
	 * @param STATUS_ID the s t a t u s_ i d of this active service requests
	 */
	public void setSTATUS_ID(int STATUS_ID);

	/**
	 * Returns the c u s t o m e r_ i d of this active service requests.
	 *
	 * @return the c u s t o m e r_ i d of this active service requests
	 */
	public int getCUSTOMER_ID();

	/**
	 * Sets the c u s t o m e r_ i d of this active service requests.
	 *
	 * @param CUSTOMER_ID the c u s t o m e r_ i d of this active service requests
	 */
	public void setCUSTOMER_ID(int CUSTOMER_ID);

	/**
	 * Returns the c u s t_ s r_ n u m b e r of this active service requests.
	 *
	 * @return the c u s t_ s r_ n u m b e r of this active service requests
	 */
	@AutoEscape
	public String getCUST_SR_NUMBER();

	/**
	 * Sets the c u s t_ s r_ n u m b e r of this active service requests.
	 *
	 * @param CUST_SR_NUMBER the c u s t_ s r_ n u m b e r of this active service requests
	 */
	public void setCUST_SR_NUMBER(String CUST_SR_NUMBER);

	/**
	 * Returns the a d d i t i o n a l_ d a t a_ x m l of this active service requests.
	 *
	 * @return the a d d i t i o n a l_ d a t a_ x m l of this active service requests
	 */
	@AutoEscape
	public String getADDITIONAL_DATA_XML();

	/**
	 * Sets the a d d i t i o n a l_ d a t a_ x m l of this active service requests.
	 *
	 * @param ADDITIONAL_DATA_XML the a d d i t i o n a l_ d a t a_ x m l of this active service requests
	 */
	public void setADDITIONAL_DATA_XML(String ADDITIONAL_DATA_XML);

	/**
	 * Returns the i n s e r t e d_ d a t e of this active service requests.
	 *
	 * @return the i n s e r t e d_ d a t e of this active service requests
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this active service requests.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this active service requests
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this active service requests.
	 *
	 * @return the i n s e r t e d_ b y of this active service requests
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this active service requests.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this active service requests
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this active service requests.
	 *
	 * @return the u p d a t e d_ d a t e of this active service requests
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this active service requests.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this active service requests
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this active service requests.
	 *
	 * @return the u p d a t e d_ b y of this active service requests
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this active service requests.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this active service requests
	 */
	public void setUPDATED_BY(String UPDATED_BY);

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
	public int compareTo(ActiveServiceRequests activeServiceRequests);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ActiveServiceRequests> toCacheModel();

	@Override
	public ActiveServiceRequests toEscapedModel();

	@Override
	public ActiveServiceRequests toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}