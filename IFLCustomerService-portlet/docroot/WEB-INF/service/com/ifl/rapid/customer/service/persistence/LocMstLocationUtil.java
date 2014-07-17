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

import com.ifl.rapid.customer.model.LocMstLocation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the loc mst location service. This utility wraps {@link LocMstLocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see LocMstLocationPersistence
 * @see LocMstLocationPersistenceImpl
 * @generated
 */
public class LocMstLocationUtil {
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
	public static void clearCache(LocMstLocation locMstLocation) {
		getPersistence().clearCache(locMstLocation);
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
	public static List<LocMstLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LocMstLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LocMstLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LocMstLocation update(LocMstLocation locMstLocation)
		throws SystemException {
		return getPersistence().update(locMstLocation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LocMstLocation update(LocMstLocation locMstLocation,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(locMstLocation, serviceContext);
	}

	/**
	* Caches the loc mst location in the entity cache if it is enabled.
	*
	* @param locMstLocation the loc mst location
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.LocMstLocation locMstLocation) {
		getPersistence().cacheResult(locMstLocation);
	}

	/**
	* Caches the loc mst locations in the entity cache if it is enabled.
	*
	* @param locMstLocations the loc mst locations
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.LocMstLocation> locMstLocations) {
		getPersistence().cacheResult(locMstLocations);
	}

	/**
	* Creates a new loc mst location with the primary key. Does not add the loc mst location to the database.
	*
	* @param LocationId the primary key for the new loc mst location
	* @return the new loc mst location
	*/
	public static com.ifl.rapid.customer.model.LocMstLocation create(
		int LocationId) {
		return getPersistence().create(LocationId);
	}

	/**
	* Removes the loc mst location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param LocationId the primary key of the loc mst location
	* @return the loc mst location that was removed
	* @throws com.ifl.rapid.customer.NoSuchLocMstLocationException if a loc mst location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.LocMstLocation remove(
		int LocationId)
		throws com.ifl.rapid.customer.NoSuchLocMstLocationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(LocationId);
	}

	public static com.ifl.rapid.customer.model.LocMstLocation updateImpl(
		com.ifl.rapid.customer.model.LocMstLocation locMstLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(locMstLocation);
	}

	/**
	* Returns the loc mst location with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchLocMstLocationException} if it could not be found.
	*
	* @param LocationId the primary key of the loc mst location
	* @return the loc mst location
	* @throws com.ifl.rapid.customer.NoSuchLocMstLocationException if a loc mst location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.LocMstLocation findByPrimaryKey(
		int LocationId)
		throws com.ifl.rapid.customer.NoSuchLocMstLocationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(LocationId);
	}

	/**
	* Returns the loc mst location with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param LocationId the primary key of the loc mst location
	* @return the loc mst location, or <code>null</code> if a loc mst location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.LocMstLocation fetchByPrimaryKey(
		int LocationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(LocationId);
	}

	/**
	* Returns all the loc mst locations.
	*
	* @return the loc mst locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.LocMstLocation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the loc mst locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loc mst locations
	* @param end the upper bound of the range of loc mst locations (not inclusive)
	* @return the range of loc mst locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.LocMstLocation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loc mst locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loc mst locations
	* @param end the upper bound of the range of loc mst locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loc mst locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.LocMstLocation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loc mst locations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loc mst locations.
	*
	* @return the number of loc mst locations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LocMstLocationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LocMstLocationPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					LocMstLocationPersistence.class.getName());

			ReferenceRegistry.registerReference(LocMstLocationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LocMstLocationPersistence persistence) {
	}

	private static LocMstLocationPersistence _persistence;
}