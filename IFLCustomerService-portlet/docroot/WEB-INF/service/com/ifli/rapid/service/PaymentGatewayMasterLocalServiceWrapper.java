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
 * Provides a wrapper for {@link PaymentGatewayMasterLocalService}.
 *
 * @author Satya Kola
 * @see PaymentGatewayMasterLocalService
 * @generated
 */
public class PaymentGatewayMasterLocalServiceWrapper
	implements PaymentGatewayMasterLocalService,
		ServiceWrapper<PaymentGatewayMasterLocalService> {
	public PaymentGatewayMasterLocalServiceWrapper(
		PaymentGatewayMasterLocalService paymentGatewayMasterLocalService) {
		_paymentGatewayMasterLocalService = paymentGatewayMasterLocalService;
	}

	/**
	* Adds the payment gateway master to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentGatewayMaster the payment gateway master
	* @return the payment gateway master that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster addPaymentGatewayMaster(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.addPaymentGatewayMaster(paymentGatewayMaster);
	}

	/**
	* Creates a new payment gateway master with the primary key. Does not add the payment gateway master to the database.
	*
	* @param GatewayID the primary key for the new payment gateway master
	* @return the new payment gateway master
	*/
	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster createPaymentGatewayMaster(
		java.lang.String GatewayID) {
		return _paymentGatewayMasterLocalService.createPaymentGatewayMaster(GatewayID);
	}

	/**
	* Deletes the payment gateway master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param GatewayID the primary key of the payment gateway master
	* @return the payment gateway master that was removed
	* @throws PortalException if a payment gateway master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster deletePaymentGatewayMaster(
		java.lang.String GatewayID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.deletePaymentGatewayMaster(GatewayID);
	}

	/**
	* Deletes the payment gateway master from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentGatewayMaster the payment gateway master
	* @return the payment gateway master that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster deletePaymentGatewayMaster(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.deletePaymentGatewayMaster(paymentGatewayMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentGatewayMasterLocalService.dynamicQuery();
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
		return _paymentGatewayMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentGatewayMasterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentGatewayMasterLocalService.dynamicQuery(dynamicQuery,
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
		return _paymentGatewayMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentGatewayMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster fetchPaymentGatewayMaster(
		java.lang.String GatewayID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.fetchPaymentGatewayMaster(GatewayID);
	}

	/**
	* Returns the payment gateway master with the primary key.
	*
	* @param GatewayID the primary key of the payment gateway master
	* @return the payment gateway master
	* @throws PortalException if a payment gateway master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster getPaymentGatewayMaster(
		java.lang.String GatewayID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.getPaymentGatewayMaster(GatewayID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment gateway masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment gateway masters
	* @param end the upper bound of the range of payment gateway masters (not inclusive)
	* @return the range of payment gateway masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.PaymentGatewayMaster> getPaymentGatewayMasters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.getPaymentGatewayMasters(start,
			end);
	}

	/**
	* Returns the number of payment gateway masters.
	*
	* @return the number of payment gateway masters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentGatewayMastersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.getPaymentGatewayMastersCount();
	}

	/**
	* Updates the payment gateway master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentGatewayMaster the payment gateway master
	* @return the payment gateway master that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.PaymentGatewayMaster updatePaymentGatewayMaster(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentGatewayMasterLocalService.updatePaymentGatewayMaster(paymentGatewayMaster);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentGatewayMasterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentGatewayMasterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentGatewayMasterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentGatewayMasterLocalService getWrappedPaymentGatewayMasterLocalService() {
		return _paymentGatewayMasterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentGatewayMasterLocalService(
		PaymentGatewayMasterLocalService paymentGatewayMasterLocalService) {
		_paymentGatewayMasterLocalService = paymentGatewayMasterLocalService;
	}

	@Override
	public PaymentGatewayMasterLocalService getWrappedService() {
		return _paymentGatewayMasterLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentGatewayMasterLocalService paymentGatewayMasterLocalService) {
		_paymentGatewayMasterLocalService = paymentGatewayMasterLocalService;
	}

	private PaymentGatewayMasterLocalService _paymentGatewayMasterLocalService;
}