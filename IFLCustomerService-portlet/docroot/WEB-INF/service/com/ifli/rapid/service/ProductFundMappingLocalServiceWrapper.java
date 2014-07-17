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
 * Provides a wrapper for {@link ProductFundMappingLocalService}.
 *
 * @author Satya Kola
 * @see ProductFundMappingLocalService
 * @generated
 */
public class ProductFundMappingLocalServiceWrapper
	implements ProductFundMappingLocalService,
		ServiceWrapper<ProductFundMappingLocalService> {
	public ProductFundMappingLocalServiceWrapper(
		ProductFundMappingLocalService productFundMappingLocalService) {
		_productFundMappingLocalService = productFundMappingLocalService;
	}

	/**
	* Adds the product fund mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param productFundMapping the product fund mapping
	* @return the product fund mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProductFundMapping addProductFundMapping(
		com.ifli.rapid.model.ProductFundMapping productFundMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.addProductFundMapping(productFundMapping);
	}

	/**
	* Creates a new product fund mapping with the primary key. Does not add the product fund mapping to the database.
	*
	* @param ID the primary key for the new product fund mapping
	* @return the new product fund mapping
	*/
	@Override
	public com.ifli.rapid.model.ProductFundMapping createProductFundMapping(
		int ID) {
		return _productFundMappingLocalService.createProductFundMapping(ID);
	}

	/**
	* Deletes the product fund mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the product fund mapping
	* @return the product fund mapping that was removed
	* @throws PortalException if a product fund mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProductFundMapping deleteProductFundMapping(
		int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.deleteProductFundMapping(ID);
	}

	/**
	* Deletes the product fund mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param productFundMapping the product fund mapping
	* @return the product fund mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProductFundMapping deleteProductFundMapping(
		com.ifli.rapid.model.ProductFundMapping productFundMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.deleteProductFundMapping(productFundMapping);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productFundMappingLocalService.dynamicQuery();
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
		return _productFundMappingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProductFundMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _productFundMappingLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProductFundMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _productFundMappingLocalService.dynamicQuery(dynamicQuery,
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
		return _productFundMappingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _productFundMappingLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.ProductFundMapping fetchProductFundMapping(
		int ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.fetchProductFundMapping(ID);
	}

	/**
	* Returns the product fund mapping with the primary key.
	*
	* @param ID the primary key of the product fund mapping
	* @return the product fund mapping
	* @throws PortalException if a product fund mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProductFundMapping getProductFundMapping(int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.getProductFundMapping(ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the product fund mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProductFundMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of product fund mappings
	* @param end the upper bound of the range of product fund mappings (not inclusive)
	* @return the range of product fund mappings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.ProductFundMapping> getProductFundMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.getProductFundMappings(start, end);
	}

	/**
	* Returns the number of product fund mappings.
	*
	* @return the number of product fund mappings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProductFundMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.getProductFundMappingsCount();
	}

	/**
	* Updates the product fund mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param productFundMapping the product fund mapping
	* @return the product fund mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ProductFundMapping updateProductFundMapping(
		com.ifli.rapid.model.ProductFundMapping productFundMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productFundMappingLocalService.updateProductFundMapping(productFundMapping);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _productFundMappingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_productFundMappingLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _productFundMappingLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProductFundMappingLocalService getWrappedProductFundMappingLocalService() {
		return _productFundMappingLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProductFundMappingLocalService(
		ProductFundMappingLocalService productFundMappingLocalService) {
		_productFundMappingLocalService = productFundMappingLocalService;
	}

	@Override
	public ProductFundMappingLocalService getWrappedService() {
		return _productFundMappingLocalService;
	}

	@Override
	public void setWrappedService(
		ProductFundMappingLocalService productFundMappingLocalService) {
		_productFundMappingLocalService = productFundMappingLocalService;
	}

	private ProductFundMappingLocalService _productFundMappingLocalService;
}