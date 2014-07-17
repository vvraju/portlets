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
 * Provides a wrapper for {@link customerAddressLocalService}.
 *
 * @author Satya Kola
 * @see customerAddressLocalService
 * @generated
 */
public class customerAddressLocalServiceWrapper
	implements customerAddressLocalService,
		ServiceWrapper<customerAddressLocalService> {
	public customerAddressLocalServiceWrapper(
		customerAddressLocalService customerAddressLocalService) {
		_customerAddressLocalService = customerAddressLocalService;
	}

	/**
	* Adds the customer address to the database. Also notifies the appropriate model listeners.
	*
	* @param customerAddress the customer address
	* @return the customer address that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.customerAddress addcustomerAddress(
		com.ifli.rapid.model.customerAddress customerAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.addcustomerAddress(customerAddress);
	}

	/**
	* Creates a new customer address with the primary key. Does not add the customer address to the database.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key for the new customer address
	* @return the new customer address
	*/
	@Override
	public com.ifli.rapid.model.customerAddress createcustomerAddress(
		int CUSTOMER_ADDRESS_ID) {
		return _customerAddressLocalService.createcustomerAddress(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Deletes the customer address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	* @return the customer address that was removed
	* @throws PortalException if a customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.customerAddress deletecustomerAddress(
		int CUSTOMER_ADDRESS_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.deletecustomerAddress(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Deletes the customer address from the database. Also notifies the appropriate model listeners.
	*
	* @param customerAddress the customer address
	* @return the customer address that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.customerAddress deletecustomerAddress(
		com.ifli.rapid.model.customerAddress customerAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.deletecustomerAddress(customerAddress);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _customerAddressLocalService.dynamicQuery();
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
		return _customerAddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerAddressLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerAddressLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _customerAddressLocalService.dynamicQueryCount(dynamicQuery);
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
		return _customerAddressLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.customerAddress fetchcustomerAddress(
		int CUSTOMER_ADDRESS_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.fetchcustomerAddress(CUSTOMER_ADDRESS_ID);
	}

	/**
	* Returns the customer address with the primary key.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	* @return the customer address
	* @throws PortalException if a customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.customerAddress getcustomerAddress(
		int CUSTOMER_ADDRESS_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.getcustomerAddress(CUSTOMER_ADDRESS_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer addresses
	* @param end the upper bound of the range of customer addresses (not inclusive)
	* @return the range of customer addresses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.customerAddress> getcustomerAddresses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.getcustomerAddresses(start, end);
	}

	/**
	* Returns the number of customer addresses.
	*
	* @return the number of customer addresses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getcustomerAddressesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.getcustomerAddressesCount();
	}

	/**
	* Updates the customer address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customerAddress the customer address
	* @return the customer address that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.customerAddress updatecustomerAddress(
		com.ifli.rapid.model.customerAddress customerAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerAddressLocalService.updatecustomerAddress(customerAddress);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _customerAddressLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_customerAddressLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _customerAddressLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public customerAddressLocalService getWrappedcustomerAddressLocalService() {
		return _customerAddressLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedcustomerAddressLocalService(
		customerAddressLocalService customerAddressLocalService) {
		_customerAddressLocalService = customerAddressLocalService;
	}

	@Override
	public customerAddressLocalService getWrappedService() {
		return _customerAddressLocalService;
	}

	@Override
	public void setWrappedService(
		customerAddressLocalService customerAddressLocalService) {
		_customerAddressLocalService = customerAddressLocalService;
	}

	private customerAddressLocalService _customerAddressLocalService;
}