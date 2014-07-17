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

import com.ifli.rapid.model.PaymentOptionTypes;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the payment option types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionTypesPersistenceImpl
 * @see PaymentOptionTypesUtil
 * @generated
 */
public interface PaymentOptionTypesPersistence extends BasePersistence<PaymentOptionTypes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentOptionTypesUtil} to access the payment option types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the payment option types in the entity cache if it is enabled.
	*
	* @param paymentOptionTypes the payment option types
	*/
	public void cacheResult(
		com.ifli.rapid.model.PaymentOptionTypes paymentOptionTypes);

	/**
	* Caches the payment option typeses in the entity cache if it is enabled.
	*
	* @param paymentOptionTypeses the payment option typeses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentOptionTypes> paymentOptionTypeses);

	/**
	* Creates a new payment option types with the primary key. Does not add the payment option types to the database.
	*
	* @param PaymentOptionTypesId the primary key for the new payment option types
	* @return the new payment option types
	*/
	public com.ifli.rapid.model.PaymentOptionTypes create(
		java.lang.String PaymentOptionTypesId);

	/**
	* Removes the payment option types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PaymentOptionTypesId the primary key of the payment option types
	* @return the payment option types that was removed
	* @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentOptionTypes remove(
		java.lang.String PaymentOptionTypesId)
		throws com.ifli.rapid.NoSuchPaymentOptionTypesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PaymentOptionTypes updateImpl(
		com.ifli.rapid.model.PaymentOptionTypes paymentOptionTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment option types with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentOptionTypesException} if it could not be found.
	*
	* @param PaymentOptionTypesId the primary key of the payment option types
	* @return the payment option types
	* @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentOptionTypes findByPrimaryKey(
		java.lang.String PaymentOptionTypesId)
		throws com.ifli.rapid.NoSuchPaymentOptionTypesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment option types with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PaymentOptionTypesId the primary key of the payment option types
	* @return the payment option types, or <code>null</code> if a payment option types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PaymentOptionTypes fetchByPrimaryKey(
		java.lang.String PaymentOptionTypesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment option typeses.
	*
	* @return the payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentOptionTypes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment option typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option typeses
	* @param end the upper bound of the range of payment option typeses (not inclusive)
	* @return the range of payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentOptionTypes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment option typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option typeses
	* @param end the upper bound of the range of payment option typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PaymentOptionTypes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment option typeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment option typeses.
	*
	* @return the number of payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}