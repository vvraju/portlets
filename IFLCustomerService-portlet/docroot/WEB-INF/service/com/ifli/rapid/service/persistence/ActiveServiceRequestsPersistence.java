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

import com.ifli.rapid.model.ActiveServiceRequests;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the active service requests service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsPersistenceImpl
 * @see ActiveServiceRequestsUtil
 * @generated
 */
public interface ActiveServiceRequestsPersistence extends BasePersistence<ActiveServiceRequests> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActiveServiceRequestsUtil} to access the active service requests persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the active service requests in the entity cache if it is enabled.
	*
	* @param activeServiceRequests the active service requests
	*/
	public void cacheResult(
		com.ifli.rapid.model.ActiveServiceRequests activeServiceRequests);

	/**
	* Caches the active service requestses in the entity cache if it is enabled.
	*
	* @param activeServiceRequestses the active service requestses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.ActiveServiceRequests> activeServiceRequestses);

	/**
	* Creates a new active service requests with the primary key. Does not add the active service requests to the database.
	*
	* @param QRC_ASR_ID the primary key for the new active service requests
	* @return the new active service requests
	*/
	public com.ifli.rapid.model.ActiveServiceRequests create(int QRC_ASR_ID);

	/**
	* Removes the active service requests with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_ASR_ID the primary key of the active service requests
	* @return the active service requests that was removed
	* @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ActiveServiceRequests remove(int QRC_ASR_ID)
		throws com.ifli.rapid.NoSuchActiveServiceRequestsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.ActiveServiceRequests updateImpl(
		com.ifli.rapid.model.ActiveServiceRequests activeServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the active service requests with the primary key or throws a {@link com.ifli.rapid.NoSuchActiveServiceRequestsException} if it could not be found.
	*
	* @param QRC_ASR_ID the primary key of the active service requests
	* @return the active service requests
	* @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ActiveServiceRequests findByPrimaryKey(
		int QRC_ASR_ID)
		throws com.ifli.rapid.NoSuchActiveServiceRequestsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the active service requests with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param QRC_ASR_ID the primary key of the active service requests
	* @return the active service requests, or <code>null</code> if a active service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ActiveServiceRequests fetchByPrimaryKey(
		int QRC_ASR_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the active service requestses.
	*
	* @return the active service requestses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ActiveServiceRequests> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the active service requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of active service requestses
	* @param end the upper bound of the range of active service requestses (not inclusive)
	* @return the range of active service requestses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ActiveServiceRequests> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the active service requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of active service requestses
	* @param end the upper bound of the range of active service requestses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of active service requestses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ActiveServiceRequests> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the active service requestses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of active service requestses.
	*
	* @return the number of active service requestses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}