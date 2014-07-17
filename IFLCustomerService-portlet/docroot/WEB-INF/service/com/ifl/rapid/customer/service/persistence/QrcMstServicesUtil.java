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

import com.ifl.rapid.customer.model.QrcMstServices;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the qrc mst services service. This utility wraps {@link QrcMstServicesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcMstServicesPersistence
 * @see QrcMstServicesPersistenceImpl
 * @generated
 */
public class QrcMstServicesUtil {
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
	public static void clearCache(QrcMstServices qrcMstServices) {
		getPersistence().clearCache(qrcMstServices);
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
	public static List<QrcMstServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QrcMstServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QrcMstServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QrcMstServices update(QrcMstServices qrcMstServices)
		throws SystemException {
		return getPersistence().update(qrcMstServices);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QrcMstServices update(QrcMstServices qrcMstServices,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qrcMstServices, serviceContext);
	}

	/**
	* Caches the qrc mst services in the entity cache if it is enabled.
	*
	* @param qrcMstServices the qrc mst services
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.QrcMstServices qrcMstServices) {
		getPersistence().cacheResult(qrcMstServices);
	}

	/**
	* Caches the qrc mst serviceses in the entity cache if it is enabled.
	*
	* @param qrcMstServiceses the qrc mst serviceses
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.QrcMstServices> qrcMstServiceses) {
		getPersistence().cacheResult(qrcMstServiceses);
	}

	/**
	* Creates a new qrc mst services with the primary key. Does not add the qrc mst services to the database.
	*
	* @param ServiceId the primary key for the new qrc mst services
	* @return the new qrc mst services
	*/
	public static com.ifl.rapid.customer.model.QrcMstServices create(
		int ServiceId) {
		return getPersistence().create(ServiceId);
	}

	/**
	* Removes the qrc mst services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ServiceId the primary key of the qrc mst services
	* @return the qrc mst services that was removed
	* @throws com.ifl.rapid.customer.NoSuchQrcMstServicesException if a qrc mst services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstServices remove(
		int ServiceId)
		throws com.ifl.rapid.customer.NoSuchQrcMstServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ServiceId);
	}

	public static com.ifl.rapid.customer.model.QrcMstServices updateImpl(
		com.ifl.rapid.customer.model.QrcMstServices qrcMstServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qrcMstServices);
	}

	/**
	* Returns the qrc mst services with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcMstServicesException} if it could not be found.
	*
	* @param ServiceId the primary key of the qrc mst services
	* @return the qrc mst services
	* @throws com.ifl.rapid.customer.NoSuchQrcMstServicesException if a qrc mst services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstServices findByPrimaryKey(
		int ServiceId)
		throws com.ifl.rapid.customer.NoSuchQrcMstServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ServiceId);
	}

	/**
	* Returns the qrc mst services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ServiceId the primary key of the qrc mst services
	* @return the qrc mst services, or <code>null</code> if a qrc mst services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcMstServices fetchByPrimaryKey(
		int ServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ServiceId);
	}

	/**
	* Returns all the qrc mst serviceses.
	*
	* @return the qrc mst serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.QrcMstServices> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qrc mst serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc mst serviceses
	* @param end the upper bound of the range of qrc mst serviceses (not inclusive)
	* @return the range of qrc mst serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.QrcMstServices> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qrc mst serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcMstServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc mst serviceses
	* @param end the upper bound of the range of qrc mst serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qrc mst serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.QrcMstServices> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qrc mst serviceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qrc mst serviceses.
	*
	* @return the number of qrc mst serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QrcMstServicesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QrcMstServicesPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					QrcMstServicesPersistence.class.getName());

			ReferenceRegistry.registerReference(QrcMstServicesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QrcMstServicesPersistence persistence) {
	}

	private static QrcMstServicesPersistence _persistence;
}