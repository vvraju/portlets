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

import com.ifli.rapid.model.TempCustomerAddress;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the temp customer address service. This utility wraps {@link TempCustomerAddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomerAddressPersistence
 * @see TempCustomerAddressPersistenceImpl
 * @generated
 */
public class TempCustomerAddressUtil {
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
	public static void clearCache(TempCustomerAddress tempCustomerAddress) {
		getPersistence().clearCache(tempCustomerAddress);
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
	public static List<TempCustomerAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempCustomerAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempCustomerAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TempCustomerAddress update(
		TempCustomerAddress tempCustomerAddress) throws SystemException {
		return getPersistence().update(tempCustomerAddress);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TempCustomerAddress update(
		TempCustomerAddress tempCustomerAddress, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tempCustomerAddress, serviceContext);
	}

	/**
	* Caches the temp customer address in the entity cache if it is enabled.
	*
	* @param tempCustomerAddress the temp customer address
	*/
	public static void cacheResult(
		com.ifli.rapid.model.TempCustomerAddress tempCustomerAddress) {
		getPersistence().cacheResult(tempCustomerAddress);
	}

	/**
	* Caches the temp customer addresses in the entity cache if it is enabled.
	*
	* @param tempCustomerAddresses the temp customer addresses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.TempCustomerAddress> tempCustomerAddresses) {
		getPersistence().cacheResult(tempCustomerAddresses);
	}

	/**
	* Creates a new temp customer address with the primary key. Does not add the temp customer address to the database.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key for the new temp customer address
	* @return the new temp customer address
	*/
	public static com.ifli.rapid.model.TempCustomerAddress create(
		int CUSTOMER_ADDRESS_ID) {
		return getPersistence().create(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Removes the temp customer address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	* @return the temp customer address that was removed
	* @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.TempCustomerAddress remove(
		int CUSTOMER_ADDRESS_ID)
		throws com.ifli.rapid.NoSuchTempCustomerAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(CUSTOMER_ADDRESS_ID);
	}

	public static com.ifli.rapid.model.TempCustomerAddress updateImpl(
		com.ifli.rapid.model.TempCustomerAddress tempCustomerAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempCustomerAddress);
	}

	/**
	* Returns the temp customer address with the primary key or throws a {@link com.ifli.rapid.NoSuchTempCustomerAddressException} if it could not be found.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	* @return the temp customer address
	* @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.TempCustomerAddress findByPrimaryKey(
		int CUSTOMER_ADDRESS_ID)
		throws com.ifli.rapid.NoSuchTempCustomerAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Returns the temp customer address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	* @return the temp customer address, or <code>null</code> if a temp customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.TempCustomerAddress fetchByPrimaryKey(
		int CUSTOMER_ADDRESS_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Returns all the temp customer addresses.
	*
	* @return the temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.TempCustomerAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp customer addresses
	* @param end the upper bound of the range of temp customer addresses (not inclusive)
	* @return the range of temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.TempCustomerAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp customer addresses
	* @param end the upper bound of the range of temp customer addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.TempCustomerAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp customer addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp customer addresses.
	*
	* @return the number of temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempCustomerAddressPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempCustomerAddressPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					TempCustomerAddressPersistence.class.getName());

			ReferenceRegistry.registerReference(TempCustomerAddressUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TempCustomerAddressPersistence persistence) {
	}

	private static TempCustomerAddressPersistence _persistence;
}