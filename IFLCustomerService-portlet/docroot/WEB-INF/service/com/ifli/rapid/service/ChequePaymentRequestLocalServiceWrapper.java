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
 * Provides a wrapper for {@link ChequePaymentRequestLocalService}.
 *
 * @author Satya Kola
 * @see ChequePaymentRequestLocalService
 * @generated
 */
public class ChequePaymentRequestLocalServiceWrapper
	implements ChequePaymentRequestLocalService,
		ServiceWrapper<ChequePaymentRequestLocalService> {
	public ChequePaymentRequestLocalServiceWrapper(
		ChequePaymentRequestLocalService chequePaymentRequestLocalService) {
		_chequePaymentRequestLocalService = chequePaymentRequestLocalService;
	}

	/**
	* Adds the cheque payment request to the database. Also notifies the appropriate model listeners.
	*
	* @param chequePaymentRequest the cheque payment request
	* @return the cheque payment request that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ChequePaymentRequest addChequePaymentRequest(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.addChequePaymentRequest(chequePaymentRequest);
	}

	/**
	* Creates a new cheque payment request with the primary key. Does not add the cheque payment request to the database.
	*
	* @param ServiceRequestID the primary key for the new cheque payment request
	* @return the new cheque payment request
	*/
	@Override
	public com.ifli.rapid.model.ChequePaymentRequest createChequePaymentRequest(
		java.lang.String ServiceRequestID) {
		return _chequePaymentRequestLocalService.createChequePaymentRequest(ServiceRequestID);
	}

	/**
	* Deletes the cheque payment request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request that was removed
	* @throws PortalException if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ChequePaymentRequest deleteChequePaymentRequest(
		java.lang.String ServiceRequestID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.deleteChequePaymentRequest(ServiceRequestID);
	}

	/**
	* Deletes the cheque payment request from the database. Also notifies the appropriate model listeners.
	*
	* @param chequePaymentRequest the cheque payment request
	* @return the cheque payment request that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ChequePaymentRequest deleteChequePaymentRequest(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.deleteChequePaymentRequest(chequePaymentRequest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _chequePaymentRequestLocalService.dynamicQuery();
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
		return _chequePaymentRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _chequePaymentRequestLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _chequePaymentRequestLocalService.dynamicQuery(dynamicQuery,
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
		return _chequePaymentRequestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _chequePaymentRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ifli.rapid.model.ChequePaymentRequest fetchChequePaymentRequest(
		java.lang.String ServiceRequestID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.fetchChequePaymentRequest(ServiceRequestID);
	}

	/**
	* Returns the cheque payment request with the primary key.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request
	* @throws PortalException if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ChequePaymentRequest getChequePaymentRequest(
		java.lang.String ServiceRequestID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.getChequePaymentRequest(ServiceRequestID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cheque payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cheque payment requests
	* @param end the upper bound of the range of cheque payment requests (not inclusive)
	* @return the range of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ifli.rapid.model.ChequePaymentRequest> getChequePaymentRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.getChequePaymentRequests(start,
			end);
	}

	/**
	* Returns the number of cheque payment requests.
	*
	* @return the number of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getChequePaymentRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.getChequePaymentRequestsCount();
	}

	/**
	* Updates the cheque payment request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param chequePaymentRequest the cheque payment request
	* @return the cheque payment request that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ifli.rapid.model.ChequePaymentRequest updateChequePaymentRequest(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _chequePaymentRequestLocalService.updateChequePaymentRequest(chequePaymentRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _chequePaymentRequestLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_chequePaymentRequestLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _chequePaymentRequestLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ChequePaymentRequestLocalService getWrappedChequePaymentRequestLocalService() {
		return _chequePaymentRequestLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedChequePaymentRequestLocalService(
		ChequePaymentRequestLocalService chequePaymentRequestLocalService) {
		_chequePaymentRequestLocalService = chequePaymentRequestLocalService;
	}

	@Override
	public ChequePaymentRequestLocalService getWrappedService() {
		return _chequePaymentRequestLocalService;
	}

	@Override
	public void setWrappedService(
		ChequePaymentRequestLocalService chequePaymentRequestLocalService) {
		_chequePaymentRequestLocalService = chequePaymentRequestLocalService;
	}

	private ChequePaymentRequestLocalService _chequePaymentRequestLocalService;
}