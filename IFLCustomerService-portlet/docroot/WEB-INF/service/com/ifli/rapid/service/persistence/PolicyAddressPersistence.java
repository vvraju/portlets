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

import com.ifli.rapid.model.PolicyAddress;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the policy address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyAddressPersistenceImpl
 * @see PolicyAddressUtil
 * @generated
 */
public interface PolicyAddressPersistence extends BasePersistence<PolicyAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PolicyAddressUtil} to access the policy address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the policy address where POLICY_ID = &#63; or throws a {@link com.ifli.rapid.NoSuchPolicyAddressException} if it could not be found.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the matching policy address
	* @throws com.ifli.rapid.NoSuchPolicyAddressException if a matching policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress findByPolicyId(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy address where POLICY_ID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the matching policy address, or <code>null</code> if a matching policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress fetchByPolicyId(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy address where POLICY_ID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching policy address, or <code>null</code> if a matching policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress fetchByPolicyId(
		java.lang.String POLICY_ID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the policy address where POLICY_ID = &#63; from the database.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the policy address that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress removeByPolicyId(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of policy addresses where POLICY_ID = &#63;.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the number of matching policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countByPolicyId(java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the policy address in the entity cache if it is enabled.
	*
	* @param policyAddress the policy address
	*/
	public void cacheResult(com.ifli.rapid.model.PolicyAddress policyAddress);

	/**
	* Caches the policy addresses in the entity cache if it is enabled.
	*
	* @param policyAddresses the policy addresses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyAddress> policyAddresses);

	/**
	* Creates a new policy address with the primary key. Does not add the policy address to the database.
	*
	* @param ID the primary key for the new policy address
	* @return the new policy address
	*/
	public com.ifli.rapid.model.PolicyAddress create(int ID);

	/**
	* Removes the policy address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the policy address
	* @return the policy address that was removed
	* @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress remove(int ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PolicyAddress updateImpl(
		com.ifli.rapid.model.PolicyAddress policyAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy address with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyAddressException} if it could not be found.
	*
	* @param ID the primary key of the policy address
	* @return the policy address
	* @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the policy address
	* @return the policy address, or <code>null</code> if a policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyAddress fetchByPrimaryKey(int ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the policy addresses.
	*
	* @return the policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy addresses
	* @param end the upper bound of the range of policy addresses (not inclusive)
	* @return the range of policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy addresses
	* @param end the upper bound of the range of policy addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the policy addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of policy addresses.
	*
	* @return the number of policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}