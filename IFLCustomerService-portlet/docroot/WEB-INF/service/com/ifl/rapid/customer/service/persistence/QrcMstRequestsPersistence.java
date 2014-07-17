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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.model.QrcMstRequests;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the qrc mst requests service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstRequestsPersistenceImpl
 * @see QrcMstRequestsUtil
 * @generated
 */
public interface QrcMstRequestsPersistence extends BasePersistence<QrcMstRequests> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QrcMstRequestsUtil} to access the qrc mst requests persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qrc mst requests in the entity cache if it is enabled.
	*
	* @param qrcMstRequests the qrc mst requests
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests);

	/**
	* Caches the qrc mst requestses in the entity cache if it is enabled.
	*
	* @param qrcMstRequestses the qrc mst requestses
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.QrcMstRequests> qrcMstRequestses);

	/**
	* Creates a new qrc mst requests with the primary key. Does not add the qrc mst requests to the database.
	*
	* @param RequestId the primary key for the new qrc mst requests
	* @return the new qrc mst requests
	*/
	public com.ifl.rapid.customer.model.QrcMstRequests create(int RequestId);

	/**
	* Removes the qrc mst requests with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RequestId the primary key of the qrc mst requests
	* @return the qrc mst requests that was removed
	* @throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException if a qrc mst requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.QrcMstRequests remove(int RequestId)
		throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.QrcMstRequests updateImpl(
		com.ifl.rapid.customer.model.QrcMstRequests qrcMstRequests)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qrc mst requests with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcMstRequestsException} if it could not be found.
	*
	* @param RequestId the primary key of the qrc mst requests
	* @return the qrc mst requests
	* @throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException if a qrc mst requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.QrcMstRequests findByPrimaryKey(
		int RequestId)
		throws com.ifl.rapid.customer.NoSuchQrcMstRequestsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qrc mst requests with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param RequestId the primary key of the qrc mst requests
	* @return the qrc mst requests, or <code>null</code> if a qrc mst requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.QrcMstRequests fetchByPrimaryKey(
		int RequestId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qrc mst requestses.
	*
	* @return the qrc mst requestses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.QrcMstRequests> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qrc mst requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc mst requestses
	* @param end the upper bound of the range of qrc mst requestses (not inclusive)
	* @return the range of qrc mst requestses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.QrcMstRequests> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qrc mst requestses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc mst requestses
	* @param end the upper bound of the range of qrc mst requestses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qrc mst requestses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.QrcMstRequests> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qrc mst requestses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qrc mst requestses.
	*
	* @return the number of qrc mst requestses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}