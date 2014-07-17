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

import com.ifli.rapid.model.PaymentMethodMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the payment method master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodMasterPersistenceImpl
 * @see PaymentMethodMasterUtil
 * @generated
 */
public interface PaymentMethodMasterPersistence extends BasePersistence<PaymentMethodMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentMethodMasterUtil} to access the payment method master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the payment method master in the entity cache if it is enabled.
	*
	* @param paymentMethodMaster the payment method master
	*/
	public void cacheResult(
		com.ifli.rapid.model.PaymentMethodMaster paymentMethodMaster);

	/**
	* Caches the payment method masters in the entity cache if it is enabled.
	*
	* @param paymentMethodMasters the payment method masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentMethodMaster> paymentMethodMasters);

	/**
	* Creates a new payment method master with the primary key. Does not add the payment method master to the database.
	*
	* @param PaymentMethodID the primary key for the new payment method master
	* @return the new payment method master
	*/
	public com.ifli.rapid.model.PaymentMethodMaster create(
		java.lang.String PaymentMethodID);

	/**
	* Removes the payment method master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PaymentMethodID the primary key of the payment method master
	* @return the payment method master that was removed
	* @throws com.ifli.rapid.NoSuchPaymentMethodMasterException if a payment method master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentMethodMaster remove(
		java.lang.String PaymentMethodID)
		throws com.ifli.rapid.NoSuchPaymentMethodMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PaymentMethodMaster updateImpl(
		com.ifli.rapid.model.PaymentMethodMaster paymentMethodMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment method master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentMethodMasterException} if it could not be found.
	*
	* @param PaymentMethodID the primary key of the payment method master
	* @return the payment method master
	* @throws com.ifli.rapid.NoSuchPaymentMethodMasterException if a payment method master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentMethodMaster findByPrimaryKey(
		java.lang.String PaymentMethodID)
		throws com.ifli.rapid.NoSuchPaymentMethodMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment method master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PaymentMethodID the primary key of the payment method master
	* @return the payment method master, or <code>null</code> if a payment method master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentMethodMaster fetchByPrimaryKey(
		java.lang.String PaymentMethodID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment method masters.
	*
	* @return the payment method masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentMethodMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment method masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment method masters
	* @param end the upper bound of the range of payment method masters (not inclusive)
	* @return the range of payment method masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentMethodMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment method masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment method masters
	* @param end the upper bound of the range of payment method masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment method masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentMethodMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment method masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment method masters.
	*
	* @return the number of payment method masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}