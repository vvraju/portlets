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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the recommended_ products service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see Recommended_ProductsPersistenceImpl
 * @see Recommended_ProductsUtil
 * @generated
 */
public interface Recommended_ProductsPersistence extends BasePersistence<Recommended_Products> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Recommended_ProductsUtil} to access the recommended_ products persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the recommended_ products in the entity cache if it is enabled.
	*
	* @param recommended_Products the recommended_ products
	*/
	public void cacheResult(
		com.ifli.rapid.model.Recommended_Products recommended_Products);

	/**
	* Caches the recommended_ productses in the entity cache if it is enabled.
	*
	* @param recommended_Productses the recommended_ productses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.Recommended_Products> recommended_Productses);

	/**
	* Creates a new recommended_ products with the primary key. Does not add the recommended_ products to the database.
	*
	* @param PRODUCT_ID the primary key for the new recommended_ products
	* @return the new recommended_ products
	*/
	public com.ifli.rapid.model.Recommended_Products create(int PRODUCT_ID);

	/**
	* Removes the recommended_ products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products that was removed
	* @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.Recommended_Products remove(int PRODUCT_ID)
		throws com.ifli.rapid.NoSuchRecommended_ProductsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.Recommended_Products updateImpl(
		com.ifli.rapid.model.Recommended_Products recommended_Products)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the recommended_ products with the primary key or throws a {@link com.ifli.rapid.NoSuchRecommended_ProductsException} if it could not be found.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products
	* @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.Recommended_Products findByPrimaryKey(
		int PRODUCT_ID)
		throws com.ifli.rapid.NoSuchRecommended_ProductsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the recommended_ products with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products, or <code>null</code> if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.Recommended_Products fetchByPrimaryKey(
		int PRODUCT_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the recommended_ productses.
	*
	* @return the recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.Recommended_Products> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.Recommended_Products> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.Recommended_Products> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the recommended_ productses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of recommended_ productses.
	*
	* @return the number of recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}