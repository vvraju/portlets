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

import com.ifli.rapid.model.Recommended_Products;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the recommended_ products service. This utility wraps {@link Recommended_ProductsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see Recommended_ProductsPersistence
 * @see Recommended_ProductsPersistenceImpl
 * @generated
 */
public class Recommended_ProductsUtil {
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
	public static void clearCache(Recommended_Products recommended_Products) {
		getPersistence().clearCache(recommended_Products);
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
	public static List<Recommended_Products> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Recommended_Products> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Recommended_Products> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Recommended_Products update(
		Recommended_Products recommended_Products) throws SystemException {
		return getPersistence().update(recommended_Products);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Recommended_Products update(
		Recommended_Products recommended_Products, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(recommended_Products, serviceContext);
	}

	/**
	* Caches the recommended_ products in the entity cache if it is enabled.
	*
	* @param recommended_Products the recommended_ products
	*/
	public static void cacheResult(
		com.ifli.rapid.model.Recommended_Products recommended_Products) {
		getPersistence().cacheResult(recommended_Products);
	}

	/**
	* Caches the recommended_ productses in the entity cache if it is enabled.
	*
	* @param recommended_Productses the recommended_ productses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.Recommended_Products> recommended_Productses) {
		getPersistence().cacheResult(recommended_Productses);
	}

	/**
	* Creates a new recommended_ products with the primary key. Does not add the recommended_ products to the database.
	*
	* @param PRODUCT_ID the primary key for the new recommended_ products
	* @return the new recommended_ products
	*/
	public static com.ifli.rapid.model.Recommended_Products create(
		int PRODUCT_ID) {
		return getPersistence().create(PRODUCT_ID);
	}

	/**
	* Removes the recommended_ products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products that was removed
	* @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.Recommended_Products remove(
		int PRODUCT_ID)
		throws com.ifli.rapid.NoSuchRecommended_ProductsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(PRODUCT_ID);
	}

	public static com.ifli.rapid.model.Recommended_Products updateImpl(
		com.ifli.rapid.model.Recommended_Products recommended_Products)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(recommended_Products);
	}

	/**
	* Returns the recommended_ products with the primary key or throws a {@link com.ifli.rapid.NoSuchRecommended_ProductsException} if it could not be found.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products
	* @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.Recommended_Products findByPrimaryKey(
		int PRODUCT_ID)
		throws com.ifli.rapid.NoSuchRecommended_ProductsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(PRODUCT_ID);
	}

	/**
	* Returns the recommended_ products with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products, or <code>null</code> if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.Recommended_Products fetchByPrimaryKey(
		int PRODUCT_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(PRODUCT_ID);
	}

	/**
	* Returns all the recommended_ productses.
	*
	* @return the recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.Recommended_Products> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the recommended_ productses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of recommended_ productses
	* @param end the upper bound of the range of recommended_ productses (not inclusive)
	* @return the range of recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.Recommended_Products> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the recommended_ productses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of recommended_ productses
	* @param end the upper bound of the range of recommended_ productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.Recommended_Products> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the recommended_ productses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of recommended_ productses.
	*
	* @return the number of recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Recommended_ProductsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Recommended_ProductsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					Recommended_ProductsPersistence.class.getName());

			ReferenceRegistry.registerReference(Recommended_ProductsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(Recommended_ProductsPersistence persistence) {
	}

	private static Recommended_ProductsPersistence _persistence;
}