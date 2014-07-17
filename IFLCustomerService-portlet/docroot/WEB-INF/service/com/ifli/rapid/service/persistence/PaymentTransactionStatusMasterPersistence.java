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

import com.ifli.rapid.model.PaymentTransactionStatusMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the payment transaction status master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentTransactionStatusMasterPersistenceImpl
 * @see PaymentTransactionStatusMasterUtil
 * @generated
 */
public interface PaymentTransactionStatusMasterPersistence
	extends BasePersistence<PaymentTransactionStatusMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentTransactionStatusMasterUtil} to access the payment transaction status master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the payment transaction status master in the entity cache if it is enabled.
	*
	* @param paymentTransactionStatusMaster the payment transaction status master
	*/
	public void cacheResult(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster);

	/**
	* Caches the payment transaction status masters in the entity cache if it is enabled.
	*
	* @param paymentTransactionStatusMasters the payment transaction status masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> paymentTransactionStatusMasters);

	/**
	* Creates a new payment transaction status master with the primary key. Does not add the payment transaction status master to the database.
	*
	* @param TransactionStatusID the primary key for the new payment transaction status master
	* @return the new payment transaction status master
	*/
	public com.ifli.rapid.model.PaymentTransactionStatusMaster create(
		int TransactionStatusID);

	/**
	* Removes the payment transaction status master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master that was removed
	* @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentTransactionStatusMaster remove(
		int TransactionStatusID)
		throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PaymentTransactionStatusMaster updateImpl(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment transaction status master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException} if it could not be found.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master
	* @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentTransactionStatusMaster findByPrimaryKey(
		int TransactionStatusID)
		throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment transaction status master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master, or <code>null</code> if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentTransactionStatusMaster fetchByPrimaryKey(
		int TransactionStatusID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment transaction status masters.
	*
	* @return the payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment transaction status masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment transaction status masters
	* @param end the upper bound of the range of payment transaction status masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment transaction status masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment transaction status masters.
	*
	* @return the number of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}