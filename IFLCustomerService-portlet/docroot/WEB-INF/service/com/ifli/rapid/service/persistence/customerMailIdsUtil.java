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

import com.ifli.rapid.model.customerMailIds;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the customer mail IDs service. This utility wraps {@link customerMailIdsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see customerMailIdsPersistence
 * @see customerMailIdsPersistenceImpl
 * @generated
 */
public class customerMailIdsUtil {
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
	public static void clearCache(customerMailIds customerMailIds) {
		getPersistence().clearCache(customerMailIds);
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
	public static List<customerMailIds> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<customerMailIds> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<customerMailIds> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static customerMailIds update(customerMailIds customerMailIds)
		throws SystemException {
		return getPersistence().update(customerMailIds);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static customerMailIds update(customerMailIds customerMailIds,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(customerMailIds, serviceContext);
	}

	/**
	* Caches the customer mail IDs in the entity cache if it is enabled.
	*
	* @param customerMailIds the customer mail IDs
	*/
	public static void cacheResult(
		com.ifli.rapid.model.customerMailIds customerMailIds) {
		getPersistence().cacheResult(customerMailIds);
	}

	/**
	* Caches the customer mail IDses in the entity cache if it is enabled.
	*
	* @param customerMailIdses the customer mail IDses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.customerMailIds> customerMailIdses) {
		getPersistence().cacheResult(customerMailIdses);
	}

	/**
	* Creates a new customer mail IDs with the primary key. Does not add the customer mail IDs to the database.
	*
	* @param ID the primary key for the new customer mail IDs
	* @return the new customer mail IDs
	*/
	public static com.ifli.rapid.model.customerMailIds create(int ID) {
		return getPersistence().create(ID);
	}

	/**
	* Removes the customer mail IDs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the customer mail IDs
	* @return the customer mail IDs that was removed
	* @throws com.ifli.rapid.NoSuchcustomerMailIdsException if a customer mail IDs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.customerMailIds remove(int ID)
		throws com.ifli.rapid.NoSuchcustomerMailIdsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ID);
	}

	public static com.ifli.rapid.model.customerMailIds updateImpl(
		com.ifli.rapid.model.customerMailIds customerMailIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customerMailIds);
	}

	/**
	* Returns the customer mail IDs with the primary key or throws a {@link com.ifli.rapid.NoSuchcustomerMailIdsException} if it could not be found.
	*
	* @param ID the primary key of the customer mail IDs
	* @return the customer mail IDs
	* @throws com.ifli.rapid.NoSuchcustomerMailIdsException if a customer mail IDs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.customerMailIds findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchcustomerMailIdsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ID);
	}

	/**
	* Returns the customer mail IDs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the customer mail IDs
	* @return the customer mail IDs, or <code>null</code> if a customer mail IDs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.customerMailIds fetchByPrimaryKey(int ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ID);
	}

	/**
	* Returns all the customer mail IDses.
	*
	* @return the customer mail IDses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.customerMailIds> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customer mail IDses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerMailIdsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer mail IDses
	* @param end the upper bound of the range of customer mail IDses (not inclusive)
	* @return the range of customer mail IDses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.customerMailIds> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customer mail IDses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerMailIdsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer mail IDses
	* @param end the upper bound of the range of customer mail IDses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer mail IDses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.customerMailIds> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customer mail IDses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customer mail IDses.
	*
	* @return the number of customer mail IDses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static customerMailIdsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (customerMailIdsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					customerMailIdsPersistence.class.getName());

			ReferenceRegistry.registerReference(customerMailIdsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(customerMailIdsPersistence persistence) {
	}

	private static customerMailIdsPersistence _persistence;
}