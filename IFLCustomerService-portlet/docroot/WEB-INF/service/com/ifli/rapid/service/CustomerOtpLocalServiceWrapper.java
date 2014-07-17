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
 * Provides a wrapper for {@link CustomerOtpLocalService}.
 *
 * @author Satya Kola
 * @see CustomerOtpLocalService
 * @generated
 */
public class CustomerOtpLocalServiceWrapper implements CustomerOtpLocalService,
	ServiceWrapper<CustomerOtpLocalService> {
	public CustomerOtpLocalServiceWrapper(
		CustomerOtpLocalService customerOtpLocalService) {
		_customerOtpLocalService = customerOtpLocalService;
	}

	/**
	* Adds the customer otp to the database. Also notifies the appropriate model listeners.
	*
	* @param customerOtp the customer otp
	* @return the customer otp that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerOtp addCustomerOtp(
		com.ifli.rapid.model.CustomerOtp customerOtp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.addCustomerOtp(customerOtp);
	}

	/**
	* Creates a new customer otp with the primary key. Does not add the customer otp to the database.
	*
	* @param CUSTOMER_ID the primary key for the new customer otp
	* @return the new customer otp
	*/
	@Override
	public com.ifli.rapid.model.CustomerOtp createCustomerOtp(int CUSTOMER_ID) {
		return _customerOtpLocalService.createCustomerOtp(CUSTOMER_ID);
	}

	/**
	* Deletes the customer otp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ID the primary key of the customer otp
	* @return the customer otp that was removed
	* @throws PortalException if a customer otp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerOtp deleteCustomerOtp(int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.deleteCustomerOtp(CUSTOMER_ID);
	}

	/**
	* Deletes the customer otp from the database. Also notifies the appropriate model listeners.
	*
	* @param customerOtp the customer otp
	* @return the customer otp that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerOtp deleteCustomerOtp(
		com.ifli.rapid.model.CustomerOtp customerOtp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.deleteCustomerOtp(customerOtp);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _customerOtpLocalService.dynamicQuery();
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
		return _customerOtpLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerOtpLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerOtpLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _customerOtpLocalService.dynamicQueryCount(dynamicQuery);
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
		return _customerOtpLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.CustomerOtp fetchCustomerOtp(int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.fetchCustomerOtp(CUSTOMER_ID);
	}

	/**
	* Returns the customer otp with the primary key.
	*
	* @param CUSTOMER_ID the primary key of the customer otp
	* @return the customer otp
	* @throws PortalException if a customer otp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerOtp getCustomerOtp(int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.getCustomerOtp(CUSTOMER_ID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the customer otps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer otps
	* @param end the upper bound of the range of customer otps (not inclusive)
	* @return the range of customer otps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.CustomerOtp> getCustomerOtps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.getCustomerOtps(start, end);
	}

	/**
	* Returns the number of customer otps.
	*
	* @return the number of customer otps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCustomerOtpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.getCustomerOtpsCount();
	}

	/**
	* Updates the customer otp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customerOtp the customer otp
	* @return the customer otp that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.CustomerOtp updateCustomerOtp(
		com.ifli.rapid.model.CustomerOtp customerOtp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerOtpLocalService.updateCustomerOtp(customerOtp);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _customerOtpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_customerOtpLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _customerOtpLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CustomerOtpLocalService getWrappedCustomerOtpLocalService() {
		return _customerOtpLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCustomerOtpLocalService(
		CustomerOtpLocalService customerOtpLocalService) {
		_customerOtpLocalService = customerOtpLocalService;
	}

	@Override
	public CustomerOtpLocalService getWrappedService() {
		return _customerOtpLocalService;
	}

	@Override
	public void setWrappedService(
		CustomerOtpLocalService customerOtpLocalService) {
		_customerOtpLocalService = customerOtpLocalService;
	}

	private CustomerOtpLocalService _customerOtpLocalService;
}