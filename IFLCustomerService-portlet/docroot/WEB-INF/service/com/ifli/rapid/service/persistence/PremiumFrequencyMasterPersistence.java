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

import com.ifli.rapid.model.PremiumFrequencyMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the premium frequency master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PremiumFrequencyMasterPersistenceImpl
 * @see PremiumFrequencyMasterUtil
 * @generated
 */
public interface PremiumFrequencyMasterPersistence extends BasePersistence<PremiumFrequencyMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PremiumFrequencyMasterUtil} to access the premium frequency master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the premium frequency master in the entity cache if it is enabled.
	*
	* @param premiumFrequencyMaster the premium frequency master
	*/
	public void cacheResult(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster);

	/**
	* Caches the premium frequency masters in the entity cache if it is enabled.
	*
	* @param premiumFrequencyMasters the premium frequency masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PremiumFrequencyMaster> premiumFrequencyMasters);

	/**
	* Creates a new premium frequency master with the primary key. Does not add the premium frequency master to the database.
	*
	* @param PremiumFrequencyId the primary key for the new premium frequency master
	* @return the new premium frequency master
	*/
	public com.ifli.rapid.model.PremiumFrequencyMaster create(
		java.lang.String PremiumFrequencyId);

	/**
	* Removes the premium frequency master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PremiumFrequencyId the primary key of the premium frequency master
	* @return the premium frequency master that was removed
	* @throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException if a premium frequency master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PremiumFrequencyMaster remove(
		java.lang.String PremiumFrequencyId)
		throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PremiumFrequencyMaster updateImpl(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the premium frequency master with the primary key or throws a {@link com.ifli.rapid.NoSuchPremiumFrequencyMasterException} if it could not be found.
	*
	* @param PremiumFrequencyId the primary key of the premium frequency master
	* @return the premium frequency master
	* @throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException if a premium frequency master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PremiumFrequencyMaster findByPrimaryKey(
		java.lang.String PremiumFrequencyId)
		throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the premium frequency master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PremiumFrequencyId the primary key of the premium frequency master
	* @return the premium frequency master, or <code>null</code> if a premium frequency master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PremiumFrequencyMaster fetchByPrimaryKey(
		java.lang.String PremiumFrequencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the premium frequency masters.
	*
	* @return the premium frequency masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PremiumFrequencyMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the premium frequency masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of premium frequency masters
	* @param end the upper bound of the range of premium frequency masters (not inclusive)
	* @return the range of premium frequency masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PremiumFrequencyMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the premium frequency masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of premium frequency masters
	* @param end the upper bound of the range of premium frequency masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of premium frequency masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PremiumFrequencyMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the premium frequency masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of premium frequency masters.
	*
	* @return the number of premium frequency masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}