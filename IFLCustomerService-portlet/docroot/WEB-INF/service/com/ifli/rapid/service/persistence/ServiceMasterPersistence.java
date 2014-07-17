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

import com.ifli.rapid.model.ServiceMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ServiceMasterPersistenceImpl
 * @see ServiceMasterUtil
 * @generated
 */
public interface ServiceMasterPersistence extends BasePersistence<ServiceMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceMasterUtil} to access the service master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the service master in the entity cache if it is enabled.
	*
	* @param serviceMaster the service master
	*/
	public void cacheResult(com.ifli.rapid.model.ServiceMaster serviceMaster);

	/**
	* Caches the service masters in the entity cache if it is enabled.
	*
	* @param serviceMasters the service masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.ServiceMaster> serviceMasters);

	/**
	* Creates a new service master with the primary key. Does not add the service master to the database.
	*
	* @param SERVICE_MASTER_ID the primary key for the new service master
	* @return the new service master
	*/
	public com.ifli.rapid.model.ServiceMaster create(int SERVICE_MASTER_ID);

	/**
	* Removes the service master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master that was removed
	* @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ServiceMaster remove(int SERVICE_MASTER_ID)
		throws com.ifli.rapid.NoSuchServiceMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.ServiceMaster updateImpl(
		com.ifli.rapid.model.ServiceMaster serviceMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service master with the primary key or throws a {@link com.ifli.rapid.NoSuchServiceMasterException} if it could not be found.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master
	* @throws com.ifli.rapid.NoSuchServiceMasterException if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ServiceMaster findByPrimaryKey(
		int SERVICE_MASTER_ID)
		throws com.ifli.rapid.NoSuchServiceMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SERVICE_MASTER_ID the primary key of the service master
	* @return the service master, or <code>null</code> if a service master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ServiceMaster fetchByPrimaryKey(
		int SERVICE_MASTER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service masters.
	*
	* @return the service masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ServiceMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service masters
	* @param end the upper bound of the range of service masters (not inclusive)
	* @return the range of service masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ServiceMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service masters
	* @param end the upper bound of the range of service masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ServiceMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service masters.
	*
	* @return the number of service masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}