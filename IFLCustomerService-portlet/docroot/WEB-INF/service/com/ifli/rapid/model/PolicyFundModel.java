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

/**
 * The base model interface for the PolicyFund service. Represents a row in the &quot;policy_fund&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ifli.rapid.model.impl.PolicyFundModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ifli.rapid.model.impl.PolicyFundImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFund
 * @see com.ifli.rapid.model.impl.PolicyFundImpl
 * @see com.ifli.rapid.model.impl.PolicyFundModelImpl
 * @generated
 */
public interface PolicyFundModel extends BaseModel<PolicyFund> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a policy fund model instance should use the {@link PolicyFund} interface instead.
	 */

	/**
	 * Returns the primary key of this policy fund.
	 *
	 * @return the primary key of this policy fund
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this policy fund.
	 *
	 * @param primaryKey the primary key of this policy fund
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the p o l i c y_ f u n d_ i d of this policy fund.
	 *
	 * @return the p o l i c y_ f u n d_ i d of this policy fund
	 */
	public int getPOLICY_FUND_ID();

	/**
	 * Sets the p o l i c y_ f u n d_ i d of this policy fund.
	 *
	 * @param POLICY_FUND_ID the p o l i c y_ f u n d_ i d of this policy fund
	 */
	public void setPOLICY_FUND_ID(int POLICY_FUND_ID);

	/**
	 * Returns the p o l i c y_ i d of this policy fund.
	 *
	 * @return the p o l i c y_ i d of this policy fund
	 */
	@AutoEscape
	public String getPOLICY_ID();

	/**
	 * Sets the p o l i c y_ i d of this policy fund.
	 *
	 * @param POLICY_ID the p o l i c y_ i d of this policy fund
	 */
	public void setPOLICY_ID(String POLICY_ID);

	/**
	 * Returns the f u n d_ i d of this policy fund.
	 *
	 * @return the f u n d_ i d of this policy fund
	 */
	public int getFUND_ID();

	/**
	 * Sets the f u n d_ i d of this policy fund.
	 *
	 * @param FUND_ID the f u n d_ i d of this policy fund
	 */
	public void setFUND_ID(int FUND_ID);

	/**
	 * Returns the f u n d_ u n i t s of this policy fund.
	 *
	 * @return the f u n d_ u n i t s of this policy fund
	 */
	public double getFUND_UNITS();

	/**
	 * Sets the f u n d_ u n i t s of this policy fund.
	 *
	 * @param FUND_UNITS the f u n d_ u n i t s of this policy fund
	 */
	public void setFUND_UNITS(double FUND_UNITS);

	/**
	 * Returns the n a v of this policy fund.
	 *
	 * @return the n a v of this policy fund
	 */
	public double getNAV();

	/**
	 * Sets the n a v of this policy fund.
	 *
	 * @param NAV the n a v of this policy fund
	 */
	public void setNAV(double NAV);

	/**
	 * Returns the t o t a l_ f u n d of this policy fund.
	 *
	 * @return the t o t a l_ f u n d of this policy fund
	 */
	public double getTOTAL_FUND();

	/**
	 * Sets the t o t a l_ f u n d of this policy fund.
	 *
	 * @param TOTAL_FUND the t o t a l_ f u n d of this policy fund
	 */
	public void setTOTAL_FUND(double TOTAL_FUND);

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
	public int compareTo(PolicyFund policyFund);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PolicyFund> toCacheModel();

	@Override
	public PolicyFund toEscapedModel();

	@Override
	public PolicyFund toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}