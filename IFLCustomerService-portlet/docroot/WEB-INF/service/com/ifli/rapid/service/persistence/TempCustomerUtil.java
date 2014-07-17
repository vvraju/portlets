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

import com.ifli.rapid.model.TempCustomer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the temp customer service. This utility wraps {@link TempCustomerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomerPersistence
 * @see TempCustomerPersistenceImpl
 * @generated
 */
public class TempCustomerUtil {
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
	public static void clearCache(TempCustomer tempCustomer) {
		getPersistence().clearCache(tempCustomer);
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
	public static List<TempCustomer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempCustomer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempCustomer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TempCustomer update(TempCustomer tempCustomer)
		throws SystemException {
		return getPersistence().update(tempCustomer);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TempCustomer update(TempCustomer tempCustomer,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tempCustomer, serviceContext);
	}

	/**
	* Caches the temp customer in the entity cache if it is enabled.
	*
	* @param tempCustomer the temp customer
	*/
	public static void cacheResult(
		com.ifli.rapid.model.TempCustomer tempCustomer) {
		getPersistence().cacheResult(tempCustomer);
	}

	/**
	* Caches the temp customers in the entity cache if it is enabled.
	*
	* @param tempCustomers the temp customers
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.TempCustomer> tempCustomers) {
		getPersistence().cacheResult(tempCustomers);
	}

	/**
	* Creates a new temp customer with the primary key. Does not add the temp customer to the database.
	*
	* @param CUSTOMER_ID the primary key for the new temp customer
	* @return the new temp customer
	*/
	public static com.ifli.rapid.model.TempCustomer create(int CUSTOMER_ID) {
		return getPersistence().create(CUSTOMER_ID);
	}

	/**
	* Removes the temp customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ID the primary key of the temp customer
	* @return the temp customer that was removed
	* @throws com.ifli.rapid.NoSuchTempCustomerException if a temp customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.TempCustomer remove(int CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchTempCustomerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(CUSTOMER_ID);
	}

	public static com.ifli.rapid.model.TempCustomer updateImpl(
		com.ifli.rapid.model.TempCustomer tempCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempCustomer);
	}

	/**
	* Returns the temp customer with the primary key or throws a {@link com.ifli.rapid.NoSuchTempCustomerException} if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the temp customer
	* @return the temp customer
	* @throws com.ifli.rapid.NoSuchTempCustomerException if a temp customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.TempCustomer findByPrimaryKey(
		int CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchTempCustomerException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(CUSTOMER_ID);
	}

	/**
	* Returns the temp customer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the temp customer
	* @return the temp customer, or <code>null</code> if a temp customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.TempCustomer fetchByPrimaryKey(
		int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CUSTOMER_ID);
	}

	/**
	* Returns all the temp customers.
	*
	* @return the temp customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.TempCustomer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp customers
	* @param end the upper bound of the range of temp customers (not inclusive)
	* @return the range of temp customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.TempCustomer> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp customers
	* @param end the upper bound of the range of temp customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.TempCustomer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp customers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp customers.
	*
	* @return the number of temp customers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempCustomerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempCustomerPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					TempCustomerPersistence.class.getName());

			ReferenceRegistry.registerReference(TempCustomerUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TempCustomerPersistence persistence) {
	}

	private static TempCustomerPersistence _persistence;
}