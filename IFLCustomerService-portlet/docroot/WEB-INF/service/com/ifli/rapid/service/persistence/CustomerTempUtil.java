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

import com.ifli.rapid.model.CustomerTemp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the customer temp service. This utility wraps {@link CustomerTempPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerTempPersistence
 * @see CustomerTempPersistenceImpl
 * @generated
 */
public class CustomerTempUtil {
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
	public static void clearCache(CustomerTemp customerTemp) {
		getPersistence().clearCache(customerTemp);
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
	public static List<CustomerTemp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomerTemp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomerTemp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CustomerTemp update(CustomerTemp customerTemp)
		throws SystemException {
		return getPersistence().update(customerTemp);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CustomerTemp update(CustomerTemp customerTemp,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(customerTemp, serviceContext);
	}

	/**
	* Caches the customer temp in the entity cache if it is enabled.
	*
	* @param customerTemp the customer temp
	*/
	public static void cacheResult(
		com.ifli.rapid.model.CustomerTemp customerTemp) {
		getPersistence().cacheResult(customerTemp);
	}

	/**
	* Caches the customer temps in the entity cache if it is enabled.
	*
	* @param customerTemps the customer temps
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.CustomerTemp> customerTemps) {
		getPersistence().cacheResult(customerTemps);
	}

	/**
	* Creates a new customer temp with the primary key. Does not add the customer temp to the database.
	*
	* @param CUSTOMER_ID the primary key for the new customer temp
	* @return the new customer temp
	*/
	public static com.ifli.rapid.model.CustomerTemp create(
		java.lang.String CUSTOMER_ID) {
		return getPersistence().create(CUSTOMER_ID);
	}

	/**
	* Removes the customer temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ID the primary key of the customer temp
	* @return the customer temp that was removed
	* @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerTemp remove(
		java.lang.String CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchCustomerTempException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(CUSTOMER_ID);
	}

	public static com.ifli.rapid.model.CustomerTemp updateImpl(
		com.ifli.rapid.model.CustomerTemp customerTemp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customerTemp);
	}

	/**
	* Returns the customer temp with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerTempException} if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the customer temp
	* @return the customer temp
	* @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerTemp findByPrimaryKey(
		java.lang.String CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchCustomerTempException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(CUSTOMER_ID);
	}

	/**
	* Returns the customer temp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the customer temp
	* @return the customer temp, or <code>null</code> if a customer temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerTemp fetchByPrimaryKey(
		java.lang.String CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CUSTOMER_ID);
	}

	/**
	* Returns all the customer temps.
	*
	* @return the customer temps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerTemp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customer temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer temps
	* @param end the upper bound of the range of customer temps (not inclusive)
	* @return the range of customer temps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerTemp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customer temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer temps
	* @param end the upper bound of the range of customer temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer temps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerTemp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customer temps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customer temps.
	*
	* @return the number of customer temps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CustomerTempPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CustomerTempPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					CustomerTempPersistence.class.getName());

			ReferenceRegistry.registerReference(CustomerTempUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CustomerTempPersistence persistence) {
	}

	private static CustomerTempPersistence _persistence;
}