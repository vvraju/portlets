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

import com.ifli.rapid.model.ServiceSubMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service sub master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ServiceSubMasterPersistenceImpl
 * @see ServiceSubMasterUtil
 * @generated
 */
public interface ServiceSubMasterPersistence extends BasePersistence<ServiceSubMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceSubMasterUtil} to access the service sub master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the service sub master in the entity cache if it is enabled.
	*
	* @param serviceSubMaster the service sub master
	*/
	public void cacheResult(
		com.ifli.rapid.model.ServiceSubMaster serviceSubMaster);

	/**
	* Caches the service sub masters in the entity cache if it is enabled.
	*
	* @param serviceSubMasters the service sub masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.ServiceSubMaster> serviceSubMasters);

	/**
	* Creates a new service sub master with the primary key. Does not add the service sub master to the database.
	*
	* @param SUBMASTER_ID the primary key for the new service sub master
	* @return the new service sub master
	*/
	public com.ifli.rapid.model.ServiceSubMaster create(int SUBMASTER_ID);

	/**
	* Removes the service sub master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SUBMASTER_ID the primary key of the service sub master
	* @return the service sub master that was removed
	* @throws com.ifli.rapid.NoSuchServiceSubMasterException if a service sub master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ServiceSubMaster remove(int SUBMASTER_ID)
		throws com.ifli.rapid.NoSuchServiceSubMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.ServiceSubMaster updateImpl(
		com.ifli.rapid.model.ServiceSubMaster serviceSubMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service sub master with the primary key or throws a {@link com.ifli.rapid.NoSuchServiceSubMasterException} if it could not be found.
	*
	* @param SUBMASTER_ID the primary key of the service sub master
	* @return the service sub master
	* @throws com.ifli.rapid.NoSuchServiceSubMasterException if a service sub master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ServiceSubMaster findByPrimaryKey(
		int SUBMASTER_ID)
		throws com.ifli.rapid.NoSuchServiceSubMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service sub master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SUBMASTER_ID the primary key of the service sub master
	* @return the service sub master, or <code>null</code> if a service sub master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ServiceSubMaster fetchByPrimaryKey(
		int SUBMASTER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service sub masters.
	*
	* @return the service sub masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ServiceSubMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service sub masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service sub masters
	* @param end the upper bound of the range of service sub masters (not inclusive)
	* @return the range of service sub masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ServiceSubMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service sub masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service sub masters
	* @param end the upper bound of the range of service sub masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service sub masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ServiceSubMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service sub masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service sub masters.
	*
	* @return the number of service sub masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}