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
 * The base model interface for the PolicyFundSwitchDetails service. Represents a row in the &quot;policy_fund_switch_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchDetails
 * @see com.ifli.rapid.model.impl.PolicyFundSwitchDetailsImpl
 * @see com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl
 * @generated
 */
public interface PolicyFundSwitchDetailsModel extends BaseModel<PolicyFundSwitchDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a policy fund switch details model instance should use the {@link PolicyFundSwitchDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this policy fund switch details.
	 *
	 * @return the primary key of this policy fund switch details
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this policy fund switch details.
	 *
	 * @param primaryKey the primary key of this policy fund switch details
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the f u n d_ s w i t c h_ i d of this policy fund switch details.
	 *
	 * @return the f u n d_ s w i t c h_ i d of this policy fund switch details
	 */
	public int getFUND_SWITCH_ID();

	/**
	 * Sets the f u n d_ s w i t c h_ i d of this policy fund switch details.
	 *
	 * @param FUND_SWITCH_ID the f u n d_ s w i t c h_ i d of this policy fund switch details
	 */
	public void setFUND_SWITCH_ID(int FUND_SWITCH_ID);

	/**
	 * Returns the p o l i c y_ i d of this policy fund switch details.
	 *
	 * @return the p o l i c y_ i d of this policy fund switch details
	 */
	@AutoEscape
	public String getPOLICY_ID();

	/**
	 * Sets the p o l i c y_ i d of this policy fund switch details.
	 *
	 * @param POLICY_ID the p o l i c y_ i d of this policy fund switch details
	 */
	public void setPOLICY_ID(String POLICY_ID);

	/**
	 * Returns the q r c_ a s r_ i d of this policy fund switch details.
	 *
	 * @return the q r c_ a s r_ i d of this policy fund switch details
	 */
	public int getQRC_ASR_ID();

	/**
	 * Sets the q r c_ a s r_ i d of this policy fund switch details.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d of this policy fund switch details
	 */
	public void setQRC_ASR_ID(int QRC_ASR_ID);

	/**
	 * Returns the f u n d_ f r o m of this policy fund switch details.
	 *
	 * @return the f u n d_ f r o m of this policy fund switch details
	 */
	@AutoEscape
	public String getFUND_FROM();

	/**
	 * Sets the f u n d_ f r o m of this policy fund switch details.
	 *
	 * @param FUND_FROM the f u n d_ f r o m of this policy fund switch details
	 */
	public void setFUND_FROM(String FUND_FROM);

	/**
	 * Returns the f u n d_ t o of this policy fund switch details.
	 *
	 * @return the f u n d_ t o of this policy fund switch details
	 */
	@AutoEscape
	public String getFUND_TO();

	/**
	 * Sets the f u n d_ t o of this policy fund switch details.
	 *
	 * @param FUND_TO the f u n d_ t o of this policy fund switch details
	 */
	public void setFUND_TO(String FUND_TO);

	/**
	 * Returns the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details.
	 *
	 * @return the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details
	 */
	public double getPRECENTAGE_OF_UNITS();

	/**
	 * Sets the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details.
	 *
	 * @param PRECENTAGE_OF_UNITS the p r e c e n t a g e_ o f_ u n i t s of this policy fund switch details
	 */
	public void setPRECENTAGE_OF_UNITS(double PRECENTAGE_OF_UNITS);

	/**
	 * Returns the i n s e r t e d_ d a t e of this policy fund switch details.
	 *
	 * @return the i n s e r t e d_ d a t e of this policy fund switch details
	 */
	public Date getINSERTED_DATE();

	/**
	 * Sets the i n s e r t e d_ d a t e of this policy fund switch details.
	 *
	 * @param INSERTED_DATE the i n s e r t e d_ d a t e of this policy fund switch details
	 */
	public void setINSERTED_DATE(Date INSERTED_DATE);

	/**
	 * Returns the i n s e r t e d_ b y of this policy fund switch details.
	 *
	 * @return the i n s e r t e d_ b y of this policy fund switch details
	 */
	@AutoEscape
	public String getINSERTED_BY();

	/**
	 * Sets the i n s e r t e d_ b y of this policy fund switch details.
	 *
	 * @param INSERTED_BY the i n s e r t e d_ b y of this policy fund switch details
	 */
	public void setINSERTED_BY(String INSERTED_BY);

	/**
	 * Returns the u p d a t e d_ d a t e of this policy fund switch details.
	 *
	 * @return the u p d a t e d_ d a t e of this policy fund switch details
	 */
	public Date getUPDATED_DATE();

	/**
	 * Sets the u p d a t e d_ d a t e of this policy fund switch details.
	 *
	 * @param UPDATED_DATE the u p d a t e d_ d a t e of this policy fund switch details
	 */
	public void setUPDATED_DATE(Date UPDATED_DATE);

	/**
	 * Returns the u p d a t e d_ b y of this policy fund switch details.
	 *
	 * @return the u p d a t e d_ b y of this policy fund switch details
	 */
	@AutoEscape
	public String getUPDATED_BY();

	/**
	 * Sets the u p d a t e d_ b y of this policy fund switch details.
	 *
	 * @param UPDATED_BY the u p d a t e d_ b y of this policy fund switch details
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
	public int compareTo(PolicyFundSwitchDetails policyFundSwitchDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PolicyFundSwitchDetails> toCacheModel();

	@Override
	public PolicyFundSwitchDetails toEscapedModel();

	@Override
	public PolicyFundSwitchDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}