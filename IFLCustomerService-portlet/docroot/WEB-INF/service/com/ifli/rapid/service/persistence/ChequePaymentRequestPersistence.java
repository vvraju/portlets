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

package com.ifli.rapid.service.persistence;

import com.ifli.rapid.model.ChequePaymentRequest;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the cheque payment request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ChequePaymentRequestPersistenceImpl
 * @see ChequePaymentRequestUtil
 * @generated
 */
public interface ChequePaymentRequestPersistence extends BasePersistence<ChequePaymentRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ChequePaymentRequestUtil} to access the cheque payment request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cheque payment request in the entity cache if it is enabled.
	*
	* @param chequePaymentRequest the cheque payment request
	*/
	public void cacheResult(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest);

	/**
	* Caches the cheque payment requests in the entity cache if it is enabled.
	*
	* @param chequePaymentRequests the cheque payment requests
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.ChequePaymentRequest> chequePaymentRequests);

	/**
	* Creates a new cheque payment request with the primary key. Does not add the cheque payment request to the database.
	*
	* @param ServiceRequestID the primary key for the new cheque payment request
	* @return the new cheque payment request
	*/
	public com.ifli.rapid.model.ChequePaymentRequest create(
		java.lang.String ServiceRequestID);

	/**
	* Removes the cheque payment request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request that was removed
	* @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ChequePaymentRequest remove(
		java.lang.String ServiceRequestID)
		throws com.ifli.rapid.NoSuchChequePaymentRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.ChequePaymentRequest updateImpl(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cheque payment request with the primary key or throws a {@link com.ifli.rapid.NoSuchChequePaymentRequestException} if it could not be found.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request
	* @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ChequePaymentRequest findByPrimaryKey(
		java.lang.String ServiceRequestID)
		throws com.ifli.rapid.NoSuchChequePaymentRequestException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cheque payment request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request, or <code>null</code> if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ChequePaymentRequest fetchByPrimaryKey(
		java.lang.String ServiceRequestID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cheque payment requests.
	*
	* @return the cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ChequePaymentRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.ChequePaymentRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cheque payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cheque payment requests
	* @param end the upper bound of the range of cheque payment requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ChequePaymentRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cheque payment requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cheque payment requests.
	*
	* @return the number of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}