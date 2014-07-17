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
 * Provides a wrapper for {@link TempCustomerLocalService}.
 *
 * @author Satya Kola
 * @see TempCustomerLocalService
 * @generated
 */
public class TempCustomerLocalServiceWrapper implements TempCustomerLocalService,
	ServiceWrapper<TempCustomerLocalService> {
	public TempCustomerLocalServiceWrapper(
		TempCustomerLocalService tempCustomerLocalService) {
		_tempCustomerLocalService = tempCustomerLocalService;
	}

	/**
	* Adds the temp customer to the database. Also notifies the appropriate model listeners.
	*
	* @param tempCustomer the temp customer
	* @return the temp customer that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.TempCustomer addTempCustomer(
		com.ifli.rapid.model.TempCustomer tempCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.addTempCustomer(tempCustomer);
	}

	/**
	* Creates a new temp customer with the primary key. Does not add the temp customer to the database.
	*
	* @param CUSTOMER_ID the primary key for the new temp customer
	* @return the new temp customer
	*/
	@Override
	public com.ifli.rapid.model.TempCustomer createTempCustomer(int CUSTOMER_ID) {
		return _tempCustomerLocalService.createTempCustomer(CUSTOMER_ID);
	}

	/**
	* Deletes the temp customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ID the primary key of the temp customer
	* @return the temp customer that was removed
	* @throws PortalException if a temp customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.TempCustomer deleteTempCustomer(int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.deleteTempCustomer(CUSTOMER_ID);
	}

	/**
	* Deletes the temp customer from the database. Also notifies the appropriate model listeners.
	*
	* @param tempCustomer the temp customer
	* @return the temp customer that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.TempCustomer deleteTempCustomer(
		com.ifli.rapid.model.TempCustomer tempCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.deleteTempCustomer(tempCustomer);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempCustomerLocalService.dynamicQuery();
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
		return _tempCustomerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCustomerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCustomerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _tempCustomerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempCustomerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.TempCustomer fetchTempCustomer(int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.fetchTempCustomer(CUSTOMER_ID);
	}

	/**
	* Returns the temp customer with the primary key.
	*
	* @param CUSTOMER_ID the primary key of the temp customer
	* @return the temp customer
	* @throws PortalException if a temp customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.TempCustomer getTempCustomer(int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.getTempCustomer(CUSTOMER_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ifli.rapid.model.TempCustomer> getTempCustomers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.getTempCustomers(start, end);
	}

	/**
	* Returns the number of temp customers.
	*
	* @return the number of temp customers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempCustomersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.getTempCustomersCount();
	}

	/**
	* Updates the temp customer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCustomer the temp customer
	* @return the temp customer that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.TempCustomer updateTempCustomer(
		com.ifli.rapid.model.TempCustomer tempCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCustomerLocalService.updateTempCustomer(tempCustomer);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempCustomerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempCustomerLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempCustomerLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempCustomerLocalService getWrappedTempCustomerLocalService() {
		return _tempCustomerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempCustomerLocalService(
		TempCustomerLocalService tempCustomerLocalService) {
		_tempCustomerLocalService = tempCustomerLocalService;
	}

	@Override
	public TempCustomerLocalService getWrappedService() {
		return _tempCustomerLocalService;
	}

	@Override
	public void setWrappedService(
		TempCustomerLocalService tempCustomerLocalService) {
		_tempCustomerLocalService = tempCustomerLocalService;
	}

	private TempCustomerLocalService _tempCustomerLocalService;
}