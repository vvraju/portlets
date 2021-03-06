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

package com.ifli.rapid.service.persistence;

import com.ifli.rapid.model.PolicyFund;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the policy fund service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundPersistenceImpl
 * @see PolicyFundUtil
 * @generated
 */
public interface PolicyFundPersistence extends BasePersistence<PolicyFund> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PolicyFundUtil} to access the policy fund persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the policy fund in the entity cache if it is enabled.
	*
	* @param policyFund the policy fund
	*/
	public void cacheResult(com.ifli.rapid.model.PolicyFund policyFund);

	/**
	* Caches the policy funds in the entity cache if it is enabled.
	*
	* @param policyFunds the policy funds
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyFund> policyFunds);

	/**
	* Creates a new policy fund with the primary key. Does not add the policy fund to the database.
	*
	* @param POLICY_FUND_ID the primary key for the new policy fund
	* @return the new policy fund
	*/
	public com.ifli.rapid.model.PolicyFund create(int POLICY_FUND_ID);

	/**
	* Removes the policy fund with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_FUND_ID the primary key of the policy fund
	* @return the policy fund that was removed
	* @throws com.ifli.rapid.NoSuchPolicyFundException if a policy fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyFund remove(int POLICY_FUND_ID)
		throws com.ifli.rapid.NoSuchPolicyFundException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PolicyFund updateImpl(
		com.ifli.rapid.model.PolicyFund policyFund)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy fund with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyFundException} if it could not be found.
	*
	* @param POLICY_FUND_ID the primary key of the policy fund
	* @return the policy fund
	* @throws com.ifli.rapid.NoSuchPolicyFundException if a policy fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyFund findByPrimaryKey(int POLICY_FUND_ID)
		throws com.ifli.rapid.NoSuchPolicyFundException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy fund with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param POLICY_FUND_ID the primary key of the policy fund
	* @return the policy fund, or <code>null</code> if a policy fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyFund fetchByPrimaryKey(int POLICY_FUND_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the policy funds.
	*
	* @return the policy funds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyFund> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the policy funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy funds
	* @param end the upper bound of the range of policy funds (not inclusive)
	* @return the range of policy funds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyFund> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the policy funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy funds
	* @param end the upper bound of the range of policy funds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy funds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyFund> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the policy funds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of policy funds.
	*
	* @return the number of policy funds
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}