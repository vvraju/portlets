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

import com.ifli.rapid.model.PaymentGatewayMaster;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the payment gateway master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentGatewayMasterPersistenceImpl
 * @see PaymentGatewayMasterUtil
 * @generated
 */
public interface PaymentGatewayMasterPersistence extends BasePersistence<PaymentGatewayMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentGatewayMasterUtil} to access the payment gateway master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the payment gateway master in the entity cache if it is enabled.
	*
	* @param paymentGatewayMaster the payment gateway master
	*/
	public void cacheResult(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster);

	/**
	* Caches the payment gateway masters in the entity cache if it is enabled.
	*
	* @param paymentGatewayMasters the payment gateway masters
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentGatewayMaster> paymentGatewayMasters);

	/**
	* Creates a new payment gateway master with the primary key. Does not add the payment gateway master to the database.
	*
	* @param GatewayID the primary key for the new payment gateway master
	* @return the new payment gateway master
	*/
	public com.ifli.rapid.model.PaymentGatewayMaster create(
		java.lang.String GatewayID);

	/**
	* Removes the payment gateway master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param GatewayID the primary key of the payment gateway master
	* @return the payment gateway master that was removed
	* @throws com.ifli.rapid.NoSuchPaymentGatewayMasterException if a payment gateway master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentGatewayMaster remove(
		java.lang.String GatewayID)
		throws com.ifli.rapid.NoSuchPaymentGatewayMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PaymentGatewayMaster updateImpl(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment gateway master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentGatewayMasterException} if it could not be found.
	*
	* @param GatewayID the primary key of the payment gateway master
	* @return the payment gateway master
	* @throws com.ifli.rapid.NoSuchPaymentGatewayMasterException if a payment gateway master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentGatewayMaster findByPrimaryKey(
		java.lang.String GatewayID)
		throws com.ifli.rapid.NoSuchPaymentGatewayMasterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment gateway master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param GatewayID the primary key of the payment gateway master
	* @return the payment gateway master, or <code>null</code> if a payment gateway master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentGatewayMaster fetchByPrimaryKey(
		java.lang.String GatewayID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment gateway masters.
	*
	* @return the payment gateway masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentGatewayMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.PaymentGatewayMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment gateway masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment gateway masters
	* @param end the upper bound of the range of payment gateway masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment gateway masters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentGatewayMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment gateway masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment gateway masters.
	*
	* @return the number of payment gateway masters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}