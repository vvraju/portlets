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
 * Provides a wrapper for {@link PaymentTransactionStatusMasterLocalService}.
 *
 * @author Satya Kola
 * @see PaymentTransactionStatusMasterLocalService
 * @generated
 */
public class PaymentTransactionStatusMasterLocalServiceWrapper
	implements PaymentTransactionStatusMasterLocalService,
		ServiceWrapper<PaymentTransactionStatusMasterLocalService> {
	public PaymentTransactionStatusMasterLocalServiceWrapper(
		PaymentTransactionStatusMasterLocalService paymentTransactionStatusMasterLocalService) {
		_paymentTransactionStatusMasterLocalService = paymentTransactionStatusMasterLocalService;
	}

	/**
	* Adds the payment transaction status master to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentTransactionStatusMaster the payment transaction status master
	* @return the payment transaction status master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster addPaymentTransactionStatusMaster(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.addPaymentTransactionStatusMaster(paymentTransactionStatusMaster);
	}

	/**
	* Creates a new payment transaction status master with the primary key. Does not add the payment transaction status master to the database.
	*
	* @param TransactionStatusID the primary key for the new payment transaction status master
	* @return the new payment transaction status master
	*/
	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster createPaymentTransactionStatusMaster(
		int TransactionStatusID) {
		return _paymentTransactionStatusMasterLocalService.createPaymentTransactionStatusMaster(TransactionStatusID);
	}

	/**
	* Deletes the payment transaction status master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master that was removed
	* @throws PortalException if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster deletePaymentTransactionStatusMaster(
		int TransactionStatusID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.deletePaymentTransactionStatusMaster(TransactionStatusID);
	}

	/**
	* Deletes the payment transaction status master from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentTransactionStatusMaster the payment transaction status master
	* @return the payment transaction status master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster deletePaymentTransactionStatusMaster(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.deletePaymentTransactionStatusMaster(paymentTransactionStatusMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentTransactionStatusMasterLocalService.dynamicQuery();
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
		return _paymentTransactionStatusMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentTransactionStatusMasterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentTransactionStatusMasterLocalService.dynamicQuery(dynamicQuery,
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
		return _paymentTransactionStatusMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentTransactionStatusMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster fetchPaymentTransactionStatusMaster(
		int TransactionStatusID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.fetchPaymentTransactionStatusMaster(TransactionStatusID);
	}

	/**
	* Returns the payment transaction status master with the primary key.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master
	* @throws PortalException if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster getPaymentTransactionStatusMaster(
		int TransactionStatusID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.getPaymentTransactionStatusMaster(TransactionStatusID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment transaction status masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment transaction status masters
	* @param end the upper bound of the range of payment transaction status masters (not inclusive)
	* @return the range of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> getPaymentTransactionStatusMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.getPaymentTransactionStatusMasters(start,
			end);
	}

	/**
	* Returns the number of payment transaction status masters.
	*
	* @return the number of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentTransactionStatusMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.getPaymentTransactionStatusMastersCount();
	}

	/**
	* Updates the payment transaction status master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentTransactionStatusMaster the payment transaction status master
	* @return the payment transaction status master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentTransactionStatusMaster updatePaymentTransactionStatusMaster(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentTransactionStatusMasterLocalService.updatePaymentTransactionStatusMaster(paymentTransactionStatusMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentTransactionStatusMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentTransactionStatusMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentTransactionStatusMasterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentTransactionStatusMasterLocalService getWrappedPaymentTransactionStatusMasterLocalService() {
		return _paymentTransactionStatusMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentTransactionStatusMasterLocalService(
		PaymentTransactionStatusMasterLocalService paymentTransactionStatusMasterLocalService) {
		_paymentTransactionStatusMasterLocalService = paymentTransactionStatusMasterLocalService;
	}

	@Override
	public PaymentTransactionStatusMasterLocalService getWrappedService() {
		return _paymentTransactionStatusMasterLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentTransactionStatusMasterLocalService paymentTransactionStatusMasterLocalService) {
		_paymentTransactionStatusMasterLocalService = paymentTransactionStatusMasterLocalService;
	}

	private PaymentTransactionStatusMasterLocalService _paymentTransactionStatusMasterLocalService;
}