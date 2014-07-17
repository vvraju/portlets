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
 * Provides a wrapper for {@link PaymentMethodTypeLocalService}.
 *
 * @author Satya Kola
 * @see PaymentMethodTypeLocalService
 * @generated
 */
public class PaymentMethodTypeLocalServiceWrapper
	implements PaymentMethodTypeLocalService,
		ServiceWrapper<PaymentMethodTypeLocalService> {
	public PaymentMethodTypeLocalServiceWrapper(
		PaymentMethodTypeLocalService paymentMethodTypeLocalService) {
		_paymentMethodTypeLocalService = paymentMethodTypeLocalService;
	}

	/**
	* Adds the payment method type to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentMethodType the payment method type
	* @return the payment method type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentMethodType addPaymentMethodType(
		com.ifli.rapid.model.PaymentMethodType paymentMethodType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.addPaymentMethodType(paymentMethodType);
	}

	/**
	* Creates a new payment method type with the primary key. Does not add the payment method type to the database.
	*
	* @param Id the primary key for the new payment method type
	* @return the new payment method type
	*/
	@Override
	public com.ifli.rapid.model.PaymentMethodType createPaymentMethodType(
		java.lang.String Id) {
		return _paymentMethodTypeLocalService.createPaymentMethodType(Id);
	}

	/**
	* Deletes the payment method type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the payment method type
	* @return the payment method type that was removed
	* @throws PortalException if a payment method type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentMethodType deletePaymentMethodType(
		java.lang.String Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.deletePaymentMethodType(Id);
	}

	/**
	* Deletes the payment method type from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentMethodType the payment method type
	* @return the payment method type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentMethodType deletePaymentMethodType(
		com.ifli.rapid.model.PaymentMethodType paymentMethodType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.deletePaymentMethodType(paymentMethodType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentMethodTypeLocalService.dynamicQuery();
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
		return _paymentMethodTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentMethodTypeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentMethodTypeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _paymentMethodTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentMethodTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PaymentMethodType fetchPaymentMethodType(
		java.lang.String Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.fetchPaymentMethodType(Id);
	}

	/**
	* Returns the payment method type with the primary key.
	*
	* @param Id the primary key of the payment method type
	* @return the payment method type
	* @throws PortalException if a payment method type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentMethodType getPaymentMethodType(
		java.lang.String Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.getPaymentMethodType(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment method types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment method types
	* @param end the upper bound of the range of payment method types (not inclusive)
	* @return the range of payment method types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PaymentMethodType> getPaymentMethodTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.getPaymentMethodTypes(start, end);
	}

	/**
	* Returns the number of payment method types.
	*
	* @return the number of payment method types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentMethodTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.getPaymentMethodTypesCount();
	}

	/**
	* Updates the payment method type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentMethodType the payment method type
	* @return the payment method type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentMethodType updatePaymentMethodType(
		com.ifli.rapid.model.PaymentMethodType paymentMethodType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentMethodTypeLocalService.updatePaymentMethodType(paymentMethodType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentMethodTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentMethodTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentMethodTypeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentMethodTypeLocalService getWrappedPaymentMethodTypeLocalService() {
		return _paymentMethodTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentMethodTypeLocalService(
		PaymentMethodTypeLocalService paymentMethodTypeLocalService) {
		_paymentMethodTypeLocalService = paymentMethodTypeLocalService;
	}

	@Override
	public PaymentMethodTypeLocalService getWrappedService() {
		return _paymentMethodTypeLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentMethodTypeLocalService paymentMethodTypeLocalService) {
		_paymentMethodTypeLocalService = paymentMethodTypeLocalService;
	}

	private PaymentMethodTypeLocalService _paymentMethodTypeLocalService;
}