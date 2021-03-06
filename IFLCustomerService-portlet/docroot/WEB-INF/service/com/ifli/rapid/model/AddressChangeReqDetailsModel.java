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
 * The base model interface for the AddressChangeReqDetails service. Represents a row in the &quot;addr_change_req_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see AddressChangeReqDetails
 * @see com.ifli.rapid.model.impl.AddressChangeReqDetailsImpl
 * @see com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl
 * @generated
 */
public interface AddressChangeReqDetailsModel extends BaseModel<AddressChangeReqDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a address change req details model instance should use the {@link AddressChangeReqDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this address change req details.
	 *
	 * @return the primary key of this address change req details
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this address change req details.
	 *
	 * @param primaryKey the primary key of this address change req details
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details.
	 *
	 * @return the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details
	 */
	public int getADDR_CHANGE_DETAILS_ID();

	/**
	 * Sets the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details.
	 *
	 * @param ADDR_CHANGE_DETAILS_ID the a d d r_ c h a n g e_ d e t a i l s_ i d of this address change req details
	 */
	public void setADDR_CHANGE_DETAILS_ID(int ADDR_CHANGE_DETAILS_ID);

	/**
	 * Returns the r e q u e s t_ s u b m i t_ t y p e of this address change req details.
	 *
	 * @return the r e q u e s t_ s u b m i t_ t y p e of this address change req details
	 */
	@AutoEscape
	public String getREQUEST_SUBMIT_TYPE();

	/**
	 * Sets the r e q u e s t_ s u b m i t_ t y p e of this address change req details.
	 *
	 * @param REQUEST_SUBMIT_TYPE the r e q u e s t_ s u b m i t_ t y p e of this address change req details
	 */
	public void setREQUEST_SUBMIT_TYPE(String REQUEST_SUBMIT_TYPE);

	/**
	 * Returns the s e r v i c e_ r e q u e s t_ i d of this address change req details.
	 *
	 * @return the s e r v i c e_ r e q u e s t_ i d of this address change req details
	 */
	public int getSERVICE_REQUEST_ID();

	/**
	 * Sets the s e r v i c e_ r e q u e s t_ i d of this address change req details.
	 *
	 * @param SERVICE_REQUEST_ID the s e r v i c e_ r e q u e s t_ i d of this address change req details
	 */
	public void setSERVICE_REQUEST_ID(int SERVICE_REQUEST_ID);

	/**
	 * Returns the s u b_ t y p e of this address change req details.
	 *
	 * @return the s u b_ t y p e of this address change req details
	 */
	public int getSUB_TYPE();

	/**
	 * Sets the s u b_ t y p e of this address change req details.
	 *
	 * @param SUB_TYPE the s u b_ t y p e of this address change req details
	 */
	public void setSUB_TYPE(int SUB_TYPE);

	/**
	 * Returns the a d d r e s s_ t y p e_ i d of this address change req details.
	 *
	 * @return the a d d r e s s_ t y p e_ i d of this address change req details
	 */
	public int getADDRESS_TYPE_ID();

	/**
	 * Sets the a d d r e s s_ t y p e_ i d of this address change req details.
	 *
	 * @param ADDRESS_TYPE_ID the a d d r e s s_ t y p e_ i d of this address change req details
	 */
	public void setADDRESS_TYPE_ID(int ADDRESS_TYPE_ID);

	/**
	 * Returns the c u s t o m e r_ i d of this address change req details.
	 *
	 * @return the c u s t o m e r_ i d of this address change req details
	 */
	public int getCUSTOMER_ID();

	/**
	 * Sets the c u s t o m e r_ i d of this address change req details.
	 *
	 * @param CUSTOMER_ID the c u s t o m e r_ i d of this address change req details
	 */
	public void setCUSTOMER_ID(int CUSTOMER_ID);

	/**
	 * Returns the s u b m i t_ a t_ b r a n c h of this address change req details.
	 *
	 * @return the s u b m i t_ a t_ b r a n c h of this address change req details
	 */
	public int getSUBMIT_AT_BRANCH();

	/**
	 * Sets the s u b m i t_ a t_ b r a n c h of this address change req details.
	 *
	 * @param SUBMIT_AT_BRANCH the s u b m i t_ a t_ b r a n c h of this address change req details
	 */
	public void setSUBMIT_AT_BRANCH(int SUBMIT_AT_BRANCH);

	/**
	 * Returns the p i c k u p_ d a t e of this address change req details.
	 *
	 * @return the p i c k u p_ d a t e of this address change req details
	 */
	public Date getPICKUP_DATE();

	/**
	 * Sets the p i c k u p_ d a t e of this address change req details.
	 *
	 * @param PICKUP_DATE the p i c k u p_ d a t e of this address change req details
	 */
	public void setPICKUP_DATE(Date PICKUP_DATE);

	/**
	 * Returns the p i c k u p_ t i m e of this address change req details.
	 *
	 * @return the p i c k u p_ t i m e of this address change req details
	 */
	@AutoEscape
	public String getPICKUP_TIME();

	/**
	 * Sets the p i c k u p_ t i m e of this address change req details.
	 *
	 * @param PICKUP_TIME the p i c k u p_ t i m e of this address change req details
	 */
	public void setPICKUP_TIME(String PICKUP_TIME);

	/**
	 * Returns the i n s e r t e d_ d a t e of this address change req details.
	 *
	 * @return the i n s e r t e d_ d a t e of this address change req details
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this address change req details.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this address change req details
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this address change req details.
	 *
	 * @return the i n s e r t e d_ b y of this address change req details
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this address change req details.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this address change req details
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this address change req details.
	 *
	 * @return the u p d a t e d_ d a t e of this address change req details
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this address change req details.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this address change req details
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this address change req details.
	 *
	 * @return the u p d a t e d_ b y of this address change req details
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this address change req details.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this address change req details
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
	public int compareTo(AddressChangeReqDetails addressChangeReqDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AddressChangeReqDetails> toCacheModel();

	@Override
	public AddressChangeReqDetails toEscapedModel();

	@Override
	public AddressChangeReqDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}