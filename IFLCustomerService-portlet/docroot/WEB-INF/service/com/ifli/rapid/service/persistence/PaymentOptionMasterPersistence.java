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

import com.ifli.rapid.model.PaymentOptionMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the payment option master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionMasterPersistenceImpl
 * @see PaymentOptionMasterUtil
 * @generated
 */
public interface PaymentOptionMasterPersistence extends BasePersistence<PaymentOptionMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentOptionMasterUtil} to access the payment option master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the payment option master in the entity cache if it is enabled.
	*
	* @param paymentOptionMaster the payment option master
	*/
	public void cacheResult(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster);

	/**
	* Caches the payment option masters in the entity cache if it is enabled.
	*
	* @param paymentOptionMasters the payment option masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentOptionMaster> paymentOptionMasters);

	/**
	* Creates a new payment option master with the primary key. Does not add the payment option master to the database.
	*
	* @param PaymentOptionId the primary key for the new payment option master
	* @return the new payment option master
	*/
	public com.ifli.rapid.model.PaymentOptionMaster create(
		java.lang.String PaymentOptionId);

	/**
	* Removes the payment option master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master that was removed
	* @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentOptionMaster remove(
		java.lang.String PaymentOptionId)
		throws com.ifli.rapid.NoSuchPaymentOptionMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PaymentOptionMaster updateImpl(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment option master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentOptionMasterException} if it could not be found.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master
	* @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentOptionMaster findByPrimaryKey(
		java.lang.String PaymentOptionId)
		throws com.ifli.rapid.NoSuchPaymentOptionMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment option master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master, or <code>null</code> if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentOptionMaster fetchByPrimaryKey(
		java.lang.String PaymentOptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment option masters.
	*
	* @return the payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentOptionMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment option masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option masters
	* @param end the upper bound of the range of payment option masters (not inclusive)
	* @return the range of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentOptionMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment option masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option masters
	* @param end the upper bound of the range of payment option masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentOptionMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment option masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment option masters.
	*
	* @return the number of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}