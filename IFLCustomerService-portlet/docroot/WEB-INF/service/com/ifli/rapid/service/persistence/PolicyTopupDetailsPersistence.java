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

import com.ifli.rapid.model.PolicyTopupDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the policy topup details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyTopupDetailsPersistenceImpl
 * @see PolicyTopupDetailsUtil
 * @generated
 */
public interface PolicyTopupDetailsPersistence extends BasePersistence<PolicyTopupDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PolicyTopupDetailsUtil} to access the policy topup details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the policy topup details in the entity cache if it is enabled.
	*
	* @param policyTopupDetails the policy topup details
	*/
	public void cacheResult(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails);

	/**
	* Caches the policy topup detailses in the entity cache if it is enabled.
	*
	* @param policyTopupDetailses the policy topup detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyTopupDetails> policyTopupDetailses);

	/**
	* Creates a new policy topup details with the primary key. Does not add the policy topup details to the database.
	*
	* @param TOPUP_ID the primary key for the new policy topup details
	* @return the new policy topup details
	*/
	public com.ifli.rapid.model.PolicyTopupDetails create(int TOPUP_ID);

	/**
	* Removes the policy topup details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details that was removed
	* @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyTopupDetails remove(int TOPUP_ID)
		throws com.ifli.rapid.NoSuchPolicyTopupDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PolicyTopupDetails updateImpl(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy topup details with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyTopupDetailsException} if it could not be found.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details
	* @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyTopupDetails findByPrimaryKey(
		int TOPUP_ID)
		throws com.ifli.rapid.NoSuchPolicyTopupDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the policy topup details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details, or <code>null</code> if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PolicyTopupDetails fetchByPrimaryKey(
		int TOPUP_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the policy topup detailses.
	*
	* @return the policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyTopupDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the policy topup detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy topup detailses
	* @param end the upper bound of the range of policy topup detailses (not inclusive)
	* @return the range of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyTopupDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the policy topup detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy topup detailses
	* @param end the upper bound of the range of policy topup detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PolicyTopupDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the policy topup detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of policy topup detailses.
	*
	* @return the number of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}