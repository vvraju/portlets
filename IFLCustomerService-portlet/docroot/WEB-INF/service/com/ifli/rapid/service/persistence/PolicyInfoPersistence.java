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

import com.ifli.rapid.model.PolicyInfo;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the policy info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyInfoPersistenceImpl
 * @see PolicyInfoUtil
 * @generated
 */
public interface PolicyInfoPersistence extends BasePersistence<PolicyInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PolicyInfoUtil} to access the policy info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the policy info in the entity cache if it is enabled.
	*
	* @param policyInfo the policy info
	*/
	public void cacheResult(com.ifli.rapid.model.PolicyInfo policyInfo);

	/**
	* Caches the policy infos in the entity cache if it is enabled.
	*
	* @param policyInfos the policy infos
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyInfo> policyInfos);

	/**
	* Creates a new policy info with the primary key. Does not add the policy info to the database.
	*
	* @param POLICY_ID the primary key for the new policy info
	* @return the new policy info
	*/
	public com.ifli.rapid.model.PolicyInfo create(java.lang.String POLICY_ID);

	/**
	* Removes the policy info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the policy info
	* @return the policy info that was removed
	* @throws com.ifli.rapid.NoSuchPolicyInfoException if a policy info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyInfo remove(java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyInfoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PolicyInfo updateImpl(
		com.ifli.rapid.model.PolicyInfo policyInfo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy info with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyInfoException} if it could not be found.
	*
	* @param POLICY_ID the primary key of the policy info
	* @return the policy info
	* @throws com.ifli.rapid.NoSuchPolicyInfoException if a policy info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyInfo findByPrimaryKey(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyInfoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param POLICY_ID the primary key of the policy info
	* @return the policy info, or <code>null</code> if a policy info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyInfo fetchByPrimaryKey(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the policy infos.
	*
	* @return the policy infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyInfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the policy infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy infos
	* @param end the upper bound of the range of policy infos (not inclusive)
	* @return the range of policy infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyInfo> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the policy infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy infos
	* @param end the upper bound of the range of policy infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyInfo> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the policy infos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of policy infos.
	*
	* @return the number of policy infos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}