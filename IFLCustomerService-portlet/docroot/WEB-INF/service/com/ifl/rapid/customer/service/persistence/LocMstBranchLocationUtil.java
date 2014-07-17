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

import com.ifl.rapid.customer.model.LocMstBranchLocation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the loc mst branch location service. This utility wraps {@link LocMstBranchLocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see LocMstBranchLocationPersistence
 * @see LocMstBranchLocationPersistenceImpl
 * @generated
 */
public class LocMstBranchLocationUtil {
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
	public static void clearCache(LocMstBranchLocation locMstBranchLocation) {
		getPersistence().clearCache(locMstBranchLocation);
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
	public static List<LocMstBranchLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LocMstBranchLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LocMstBranchLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LocMstBranchLocation update(
		LocMstBranchLocation locMstBranchLocation) throws SystemException {
		return getPersistence().update(locMstBranchLocation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LocMstBranchLocation update(
		LocMstBranchLocation locMstBranchLocation, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(locMstBranchLocation, serviceContext);
	}

	/**
	* Caches the loc mst branch location in the entity cache if it is enabled.
	*
	* @param locMstBranchLocation the loc mst branch location
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.LocMstBranchLocation locMstBranchLocation) {
		getPersistence().cacheResult(locMstBranchLocation);
	}

	/**
	* Caches the loc mst branch locations in the entity cache if it is enabled.
	*
	* @param locMstBranchLocations the loc mst branch locations
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.LocMstBranchLocation> locMstBranchLocations) {
		getPersistence().cacheResult(locMstBranchLocations);
	}

	/**
	* Creates a new loc mst branch location with the primary key. Does not add the loc mst branch location to the database.
	*
	* @param BranchId the primary key for the new loc mst branch location
	* @return the new loc mst branch location
	*/
	public static com.ifl.rapid.customer.model.LocMstBranchLocation create(
		int BranchId) {
		return getPersistence().create(BranchId);
	}

	/**
	* Removes the loc mst branch location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param BranchId the primary key of the loc mst branch location
	* @return the loc mst branch location that was removed
	* @throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException if a loc mst branch location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.LocMstBranchLocation remove(
		int BranchId)
		throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(BranchId);
	}

	public static com.ifl.rapid.customer.model.LocMstBranchLocation updateImpl(
		com.ifl.rapid.customer.model.LocMstBranchLocation locMstBranchLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(locMstBranchLocation);
	}

	/**
	* Returns the loc mst branch location with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchLocMstBranchLocationException} if it could not be found.
	*
	* @param BranchId the primary key of the loc mst branch location
	* @return the loc mst branch location
	* @throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException if a loc mst branch location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.LocMstBranchLocation findByPrimaryKey(
		int BranchId)
		throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(BranchId);
	}

	/**
	* Returns the loc mst branch location with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param BranchId the primary key of the loc mst branch location
	* @return the loc mst branch location, or <code>null</code> if a loc mst branch location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.LocMstBranchLocation fetchByPrimaryKey(
		int BranchId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(BranchId);
	}

	/**
	* Returns all the loc mst branch locations.
	*
	* @return the loc mst branch locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.LocMstBranchLocation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the loc mst branch locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstBranchLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loc mst branch locations
	* @param end the upper bound of the range of loc mst branch locations (not inclusive)
	* @return the range of loc mst branch locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.LocMstBranchLocation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loc mst branch locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstBranchLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loc mst branch locations
	* @param end the upper bound of the range of loc mst branch locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loc mst branch locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.LocMstBranchLocation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loc mst branch locations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loc mst branch locations.
	*
	* @return the number of loc mst branch locations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LocMstBranchLocationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LocMstBranchLocationPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					LocMstBranchLocationPersistence.class.getName());

			ReferenceRegistry.registerReference(LocMstBranchLocationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LocMstBranchLocationPersistence persistence) {
	}

	private static LocMstBranchLocationPersistence _persistence;
}