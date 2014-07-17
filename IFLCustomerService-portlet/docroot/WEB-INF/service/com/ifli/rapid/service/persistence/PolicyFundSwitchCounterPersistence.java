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

import com.ifli.rapid.model.PolicyFundSwitchCounter;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the policy fund switch counter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchCounterPersistenceImpl
 * @see PolicyFundSwitchCounterUtil
 * @generated
 */
public interface PolicyFundSwitchCounterPersistence extends BasePersistence<PolicyFundSwitchCounter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PolicyFundSwitchCounterUtil} to access the policy fund switch counter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the policy fund switch counter in the entity cache if it is enabled.
	*
	* @param policyFundSwitchCounter the policy fund switch counter
	*/
	public void cacheResult(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter);

	/**
	* Caches the policy fund switch counters in the entity cache if it is enabled.
	*
	* @param policyFundSwitchCounters the policy fund switch counters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyFundSwitchCounter> policyFundSwitchCounters);

	/**
	* Creates a new policy fund switch counter with the primary key. Does not add the policy fund switch counter to the database.
	*
	* @param POLICY_ID the primary key for the new policy fund switch counter
	* @return the new policy fund switch counter
	*/
	public com.ifli.rapid.model.PolicyFundSwitchCounter create(
		java.lang.String POLICY_ID);

	/**
	* Removes the policy fund switch counter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the policy fund switch counter
	* @return the policy fund switch counter that was removed
	* @throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException if a policy fund switch counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyFundSwitchCounter remove(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PolicyFundSwitchCounter updateImpl(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy fund switch counter with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyFundSwitchCounterException} if it could not be found.
	*
	* @param POLICY_ID the primary key of the policy fund switch counter
	* @return the policy fund switch counter
	* @throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException if a policy fund switch counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyFundSwitchCounter findByPrimaryKey(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy fund switch counter with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param POLICY_ID the primary key of the policy fund switch counter
	* @return the policy fund switch counter, or <code>null</code> if a policy fund switch counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyFundSwitchCounter fetchByPrimaryKey(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the policy fund switch counters.
	*
	* @return the policy fund switch counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyFundSwitchCounter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the policy fund switch counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy fund switch counters
	* @param end the upper bound of the range of policy fund switch counters (not inclusive)
	* @return the range of policy fund switch counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyFundSwitchCounter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the policy fund switch counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy fund switch counters
	* @param end the upper bound of the range of policy fund switch counters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy fund switch counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyFundSwitchCounter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the policy fund switch counters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of policy fund switch counters.
	*
	* @return the number of policy fund switch counters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}