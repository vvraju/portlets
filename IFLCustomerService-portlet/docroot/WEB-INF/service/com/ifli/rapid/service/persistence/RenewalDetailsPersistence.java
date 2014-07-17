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

import com.ifli.rapid.model.RenewalDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the renewal details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see RenewalDetailsPersistenceImpl
 * @see RenewalDetailsUtil
 * @generated
 */
public interface RenewalDetailsPersistence extends BasePersistence<RenewalDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RenewalDetailsUtil} to access the renewal details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the renewal details in the entity cache if it is enabled.
	*
	* @param renewalDetails the renewal details
	*/
	public void cacheResult(com.ifli.rapid.model.RenewalDetails renewalDetails);

	/**
	* Caches the renewal detailses in the entity cache if it is enabled.
	*
	* @param renewalDetailses the renewal detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.RenewalDetails> renewalDetailses);

	/**
	* Creates a new renewal details with the primary key. Does not add the renewal details to the database.
	*
	* @param POLICY_ID the primary key for the new renewal details
	* @return the new renewal details
	*/
	public com.ifli.rapid.model.RenewalDetails create(long POLICY_ID);

	/**
	* Removes the renewal details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details that was removed
	* @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RenewalDetails remove(long POLICY_ID)
		throws com.ifli.rapid.NoSuchRenewalDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.RenewalDetails updateImpl(
		com.ifli.rapid.model.RenewalDetails renewalDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the renewal details with the primary key or throws a {@link com.ifli.rapid.NoSuchRenewalDetailsException} if it could not be found.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details
	* @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RenewalDetails findByPrimaryKey(long POLICY_ID)
		throws com.ifli.rapid.NoSuchRenewalDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the renewal details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details, or <code>null</code> if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RenewalDetails fetchByPrimaryKey(long POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the renewal detailses.
	*
	* @return the renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.RenewalDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the renewal detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of renewal detailses
	* @param end the upper bound of the range of renewal detailses (not inclusive)
	* @return the range of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.RenewalDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the renewal detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of renewal detailses
	* @param end the upper bound of the range of renewal detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.RenewalDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the renewal detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of renewal detailses.
	*
	* @return the number of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}