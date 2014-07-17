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

package com.ifli.rapid.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Recommended_ProductsLocalService}.
 *
 * @author Satya Kola
 * @see Recommended_ProductsLocalService
 * @generated
 */
public class Recommended_ProductsLocalServiceWrapper
	implements Recommended_ProductsLocalService,
		ServiceWrapper<Recommended_ProductsLocalService> {
	public Recommended_ProductsLocalServiceWrapper(
		Recommended_ProductsLocalService recommended_ProductsLocalService) {
		_recommended_ProductsLocalService = recommended_ProductsLocalService;
	}

	/**
	* Adds the recommended_ products to the database. Also notifies the appropriate model listeners.
	*
	* @param recommended_Products the recommended_ products
	* @return the recommended_ products that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.Recommended_Products addRecommended_Products(
		com.ifli.rapid.model.Recommended_Products recommended_Products)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.addRecommended_Products(recommended_Products);
	}

	/**
	* Creates a new recommended_ products with the primary key. Does not add the recommended_ products to the database.
	*
	* @param PRODUCT_ID the primary key for the new recommended_ products
	* @return the new recommended_ products
	*/
	@Override
	public com.ifli.rapid.model.Recommended_Products createRecommended_Products(
		int PRODUCT_ID) {
		return _recommended_ProductsLocalService.createRecommended_Products(PRODUCT_ID);
	}

	/**
	* Deletes the recommended_ products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products that was removed
	* @throws PortalException if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.Recommended_Products deleteRecommended_Products(
		int PRODUCT_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.deleteRecommended_Products(PRODUCT_ID);
	}

	/**
	* Deletes the recommended_ products from the database. Also notifies the appropriate model listeners.
	*
	* @param recommended_Products the recommended_ products
	* @return the recommended_ products that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.Recommended_Products deleteRecommended_Products(
		com.ifli.rapid.model.Recommended_Products recommended_Products)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.deleteRecommended_Products(recommended_Products);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _recommended_ProductsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.Recommended_Products fetchRecommended_Products(
		int PRODUCT_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.fetchRecommended_Products(PRODUCT_ID);
	}

	/**
	* Returns the recommended_ products with the primary key.
	*
	* @param PRODUCT_ID the primary key of the recommended_ products
	* @return the recommended_ products
	* @throws PortalException if a recommended_ products with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.Recommended_Products getRecommended_Products(
		int PRODUCT_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.getRecommended_Products(PRODUCT_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ifli.rapid.model.Recommended_Products> getRecommended_Productses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.getRecommended_Productses(start,
			end);
	}

	/**
	* Returns the number of recommended_ productses.
	*
	* @return the number of recommended_ productses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRecommended_ProductsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.getRecommended_ProductsesCount();
	}

	/**
	* Updates the recommended_ products in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param recommended_Products the recommended_ products
	* @return the recommended_ products that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.Recommended_Products updateRecommended_Products(
		com.ifli.rapid.model.Recommended_Products recommended_Products)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _recommended_ProductsLocalService.updateRecommended_Products(recommended_Products);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _recommended_ProductsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_recommended_ProductsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _recommended_ProductsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Recommended_ProductsLocalService getWrappedRecommended_ProductsLocalService() {
		return _recommended_ProductsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRecommended_ProductsLocalService(
		Recommended_ProductsLocalService recommended_ProductsLocalService) {
		_recommended_ProductsLocalService = recommended_ProductsLocalService;
	}

	@Override
	public Recommended_ProductsLocalService getWrappedService() {
		return _recommended_ProductsLocalService;
	}

	@Override
	public void setWrappedService(
		Recommended_ProductsLocalService recommended_ProductsLocalService) {
		_recommended_ProductsLocalService = recommended_ProductsLocalService;
	}

	private Recommended_ProductsLocalService _recommended_ProductsLocalService;
}