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

import com.ifli.rapid.model.AddressType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the address type service. This utility wraps {@link AddressTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see AddressTypePersistence
 * @see AddressTypePersistenceImpl
 * @generated
 */
public class AddressTypeUtil {
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
	public static void clearCache(AddressType addressType) {
		getPersistence().clearCache(addressType);
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
	public static List<AddressType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddressType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddressType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AddressType update(AddressType addressType)
		throws SystemException {
		return getPersistence().update(addressType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AddressType update(AddressType addressType,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(addressType, serviceContext);
	}

	/**
	* Caches the address type in the entity cache if it is enabled.
	*
	* @param addressType the address type
	*/
	public static void cacheResult(com.ifli.rapid.model.AddressType addressType) {
		getPersistence().cacheResult(addressType);
	}

	/**
	* Caches the address types in the entity cache if it is enabled.
	*
	* @param addressTypes the address types
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.AddressType> addressTypes) {
		getPersistence().cacheResult(addressTypes);
	}

	/**
	* Creates a new address type with the primary key. Does not add the address type to the database.
	*
	* @param ADDRESS_TYPE_ID the primary key for the new address type
	* @return the new address type
	*/
	public static com.ifli.rapid.model.AddressType create(int ADDRESS_TYPE_ID) {
		return getPersistence().create(ADDRESS_TYPE_ID);
	}

	/**
	* Removes the address type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ADDRESS_TYPE_ID the primary key of the address type
	* @return the address type that was removed
	* @throws com.ifli.rapid.NoSuchAddressTypeException if a address type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.AddressType remove(int ADDRESS_TYPE_ID)
		throws com.ifli.rapid.NoSuchAddressTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ADDRESS_TYPE_ID);
	}

	public static com.ifli.rapid.model.AddressType updateImpl(
		com.ifli.rapid.model.AddressType addressType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(addressType);
	}

	/**
	* Returns the address type with the primary key or throws a {@link com.ifli.rapid.NoSuchAddressTypeException} if it could not be found.
	*
	* @param ADDRESS_TYPE_ID the primary key of the address type
	* @return the address type
	* @throws com.ifli.rapid.NoSuchAddressTypeException if a address type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.AddressType findByPrimaryKey(
		int ADDRESS_TYPE_ID)
		throws com.ifli.rapid.NoSuchAddressTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ADDRESS_TYPE_ID);
	}

	/**
	* Returns the address type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ADDRESS_TYPE_ID the primary key of the address type
	* @return the address type, or <code>null</code> if a address type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.AddressType fetchByPrimaryKey(
		int ADDRESS_TYPE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ADDRESS_TYPE_ID);
	}

	/**
	* Returns all the address types.
	*
	* @return the address types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.AddressType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the address types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address types
	* @param end the upper bound of the range of address types (not inclusive)
	* @return the range of address types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.AddressType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the address types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address types
	* @param end the upper bound of the range of address types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of address types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.AddressType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the address types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of address types.
	*
	* @return the number of address types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AddressTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AddressTypePersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					AddressTypePersistence.class.getName());

			ReferenceRegistry.registerReference(AddressTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AddressTypePersistence persistence) {
	}

	private static AddressTypePersistence _persistence;
}