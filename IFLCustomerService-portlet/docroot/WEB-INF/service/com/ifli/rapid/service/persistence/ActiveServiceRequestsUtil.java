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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the active service requests service. This utility wraps {@link ActiveServiceRequestsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsPersistence
 * @see ActiveServiceRequestsPersistenceImpl
 * @generated
 */
public class ActiveServiceRequestsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ActiveServiceRequests activeServiceRequests) {
		getPersistence().clearCache(activeServiceRequests);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ActiveServiceRequests> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ActiveServiceRequests> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ActiveServiceRequests> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ActiveServiceRequests update(
		ActiveServiceRequests activeServiceRequests) throws SystemException {
		return getPersistence().update(activeServiceRequests);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ActiveServiceRequests update(
		ActiveServiceRequests activeServiceRequests,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(activeServiceRequests, serviceContext);
	}

	/**
	* Caches the active service requests in the entity cache if it is enabled.
	*
	* @param activeServiceRequests the active service requests
	*/
	public static void cacheResult(
		com.ifli.rapid.model.ActiveServiceRequests activeServiceRequests) {
		getPersistence().cacheResult(activeServiceRequests);
	}

	/**
	* Caches the active service requestses in the entity cache if it is enabled.
	*
	* @param activeServiceRequestses the active service requestses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.ActiveServiceRequests> activeServiceRequestses) {
		getPersistence().cacheResult(activeServiceRequestses);
	}

	/**
	* Creates a new active service requests with the primary key. Does not add the active service requests to the database.
	*
	* @param QRC_ASR_ID the primary key for the new active service requests
	* @return the new active service requests
	*/
	public static com.ifli.rapid.model.ActiveServiceRequests create(
		int QRC_ASR_ID) {
		return getPersistence().create(QRC_ASR_ID);
	}

	/**
	* Removes the active service requests with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_ASR_ID the primary key of the active service requests
	* @return the active service requests that was removed
	* @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ActiveServiceRequests remove(
		int QRC_ASR_ID)
		throws com.ifli.rapid.NoSuchActiveServiceRequestsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(QRC_ASR_ID);
	}

	public static com.ifli.rapid.model.ActiveServiceRequests updateImpl(
		com.ifli.rapid.model.ActiveServiceRequests activeServiceRequests)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(activeServiceRequests);
	}

	/**
	* Returns the active service requests with the primary key or throws a {@link com.ifli.rapid.NoSuchActiveServiceRequestsException} if it could not be found.
	*
	* @param QRC_ASR_ID the primary key of the active service requests
	* @return the active service requests
	* @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ActiveServiceRequests findByPrimaryKey(
		int QRC_ASR_ID)
		throws com.ifli.rapid.NoSuchActiveServiceRequestsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(QRC_ASR_ID);
	}

	/**
	* Returns the active service requests with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param QRC_ASR_ID the primary key of the active service requests
	* @return the active service requests, or <code>null</code> if a active service requests with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ActiveServiceRequests fetchByPrimaryKey(
		int QRC_ASR_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(QRC_ASR_ID);
	}

	/**
	* Returns all the active service requestses.
	*
	* @return the active service requestses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ActiveServiceRequests> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ifli.rapid.model.ActiveServiceRequests> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ifli.rapid.model.ActiveServiceRequests> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the active service requestses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of active service requestses.
	*
	* @return the number of active service requestses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ActiveServiceRequestsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ActiveServiceRequestsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					ActiveServiceRequestsPersistence.class.getName());

			ReferenceRegistry.registerReference(ActiveServiceRequestsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ActiveServiceRequestsPersistence persistence) {
	}

	private static ActiveServiceRequestsPersistence _persistence;
}