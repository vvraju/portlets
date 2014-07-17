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
 * Provides a wrapper for {@link CustomerMobileNumbersLocalService}.
 *
 * @author Satya Kola
 * @see CustomerMobileNumbersLocalService
 * @generated
 */
public class CustomerMobileNumbersLocalServiceWrapper
	implements CustomerMobileNumbersLocalService,
		ServiceWrapper<CustomerMobileNumbersLocalService> {
	public CustomerMobileNumbersLocalServiceWrapper(
		CustomerMobileNumbersLocalService customerMobileNumbersLocalService) {
		_customerMobileNumbersLocalService = customerMobileNumbersLocalService;
	}

	/**
	* Adds the customer mobile numbers to the database. Also notifies the appropriate model listeners.
	*
	* @param customerMobileNumbers the customer mobile numbers
	* @return the customer mobile numbers that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers addCustomerMobileNumbers(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.addCustomerMobileNumbers(customerMobileNumbers);
	}

	/**
	* Creates a new customer mobile numbers with the primary key. Does not add the customer mobile numbers to the database.
	*
	* @param ID the primary key for the new customer mobile numbers
	* @return the new customer mobile numbers
	*/
	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers createCustomerMobileNumbers(
		int ID) {
		return _customerMobileNumbersLocalService.createCustomerMobileNumbers(ID);
	}

	/**
	* Deletes the customer mobile numbers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the customer mobile numbers
	* @return the customer mobile numbers that was removed
	* @throws PortalException if a customer mobile numbers with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers deleteCustomerMobileNumbers(
		int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.deleteCustomerMobileNumbers(ID);
	}

	/**
	* Deletes the customer mobile numbers from the database. Also notifies the appropriate model listeners.
	*
	* @param customerMobileNumbers the customer mobile numbers
	* @return the customer mobile numbers that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers deleteCustomerMobileNumbers(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.deleteCustomerMobileNumbers(customerMobileNumbers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _customerMobileNumbersLocalService.dynamicQuery();
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
		return _customerMobileNumbersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerMobileNumbersLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerMobileNumbersLocalService.dynamicQuery(dynamicQuery,
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
		return _customerMobileNumbersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _customerMobileNumbersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers fetchCustomerMobileNumbers(
		int ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.fetchCustomerMobileNumbers(ID);
	}

	/**
	* Returns the customer mobile numbers with the primary key.
	*
	* @param ID the primary key of the customer mobile numbers
	* @return the customer mobile numbers
	* @throws PortalException if a customer mobile numbers with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers getCustomerMobileNumbers(
		int ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.getCustomerMobileNumbers(ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the customer mobile numberses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer mobile numberses
	* @param end the upper bound of the range of customer mobile numberses (not inclusive)
	* @return the range of customer mobile numberses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.CustomerMobileNumbers> getCustomerMobileNumberses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.getCustomerMobileNumberses(start,
			end);
	}

	/**
	* Returns the number of customer mobile numberses.
	*
	* @return the number of customer mobile numberses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCustomerMobileNumbersesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.getCustomerMobileNumbersesCount();
	}

	/**
	* Updates the customer mobile numbers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customerMobileNumbers the customer mobile numbers
	* @return the customer mobile numbers that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerMobileNumbers updateCustomerMobileNumbers(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerMobileNumbersLocalService.updateCustomerMobileNumbers(customerMobileNumbers);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _customerMobileNumbersLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_customerMobileNumbersLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _customerMobileNumbersLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CustomerMobileNumbersLocalService getWrappedCustomerMobileNumbersLocalService() {
		return _customerMobileNumbersLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCustomerMobileNumbersLocalService(
		CustomerMobileNumbersLocalService customerMobileNumbersLocalService) {
		_customerMobileNumbersLocalService = customerMobileNumbersLocalService;
	}

	@Override
	public CustomerMobileNumbersLocalService getWrappedService() {
		return _customerMobileNumbersLocalService;
	}

	@Override
	public void setWrappedService(
		CustomerMobileNumbersLocalService customerMobileNumbersLocalService) {
		_customerMobileNumbersLocalService = customerMobileNumbersLocalService;
	}

	private CustomerMobileNumbersLocalService _customerMobileNumbersLocalService;
}