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

import com.ifl.rapid.customer.model.PrdMstProduct;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the prd mst product service. This utility wraps {@link PrdMstProductPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PrdMstProductPersistence
 * @see PrdMstProductPersistenceImpl
 * @generated
 */
public class PrdMstProductUtil {
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
	public static void clearCache(PrdMstProduct prdMstProduct) {
		getPersistence().clearCache(prdMstProduct);
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
	public static List<PrdMstProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PrdMstProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PrdMstProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PrdMstProduct update(PrdMstProduct prdMstProduct)
		throws SystemException {
		return getPersistence().update(prdMstProduct);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PrdMstProduct update(PrdMstProduct prdMstProduct,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(prdMstProduct, serviceContext);
	}

	/**
	* Caches the prd mst product in the entity cache if it is enabled.
	*
	* @param prdMstProduct the prd mst product
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.PrdMstProduct prdMstProduct) {
		getPersistence().cacheResult(prdMstProduct);
	}

	/**
	* Caches the prd mst products in the entity cache if it is enabled.
	*
	* @param prdMstProducts the prd mst products
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.PrdMstProduct> prdMstProducts) {
		getPersistence().cacheResult(prdMstProducts);
	}

	/**
	* Creates a new prd mst product with the primary key. Does not add the prd mst product to the database.
	*
	* @param ProductId the primary key for the new prd mst product
	* @return the new prd mst product
	*/
	public static com.ifl.rapid.customer.model.PrdMstProduct create(
		java.lang.String ProductId) {
		return getPersistence().create(ProductId);
	}

	/**
	* Removes the prd mst product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ProductId the primary key of the prd mst product
	* @return the prd mst product that was removed
	* @throws com.ifl.rapid.customer.NoSuchPrdMstProductException if a prd mst product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.PrdMstProduct remove(
		java.lang.String ProductId)
		throws com.ifl.rapid.customer.NoSuchPrdMstProductException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ProductId);
	}

	public static com.ifl.rapid.customer.model.PrdMstProduct updateImpl(
		com.ifl.rapid.customer.model.PrdMstProduct prdMstProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prdMstProduct);
	}

	/**
	* Returns the prd mst product with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchPrdMstProductException} if it could not be found.
	*
	* @param ProductId the primary key of the prd mst product
	* @return the prd mst product
	* @throws com.ifl.rapid.customer.NoSuchPrdMstProductException if a prd mst product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.PrdMstProduct findByPrimaryKey(
		java.lang.String ProductId)
		throws com.ifl.rapid.customer.NoSuchPrdMstProductException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ProductId);
	}

	/**
	* Returns the prd mst product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ProductId the primary key of the prd mst product
	* @return the prd mst product, or <code>null</code> if a prd mst product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.PrdMstProduct fetchByPrimaryKey(
		java.lang.String ProductId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ProductId);
	}

	/**
	* Returns all the prd mst products.
	*
	* @return the prd mst products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.PrdMstProduct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prd mst products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.PrdMstProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prd mst products
	* @param end the upper bound of the range of prd mst products (not inclusive)
	* @return the range of prd mst products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.PrdMstProduct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prd mst products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.PrdMstProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prd mst products
	* @param end the upper bound of the range of prd mst products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prd mst products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.PrdMstProduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the prd mst products from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prd mst products.
	*
	* @return the number of prd mst products
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PrdMstProductPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PrdMstProductPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					PrdMstProductPersistence.class.getName());

			ReferenceRegistry.registerReference(PrdMstProductUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PrdMstProductPersistence persistence) {
	}

	private static PrdMstProductPersistence _persistence;
}