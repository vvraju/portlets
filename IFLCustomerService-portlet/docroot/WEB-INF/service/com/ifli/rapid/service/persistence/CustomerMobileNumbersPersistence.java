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

import com.ifli.rapid.model.CustomerMobileNumbers;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the customer mobile numbers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerMobileNumbersPersistenceImpl
 * @see CustomerMobileNumbersUtil
 * @generated
 */
public interface CustomerMobileNumbersPersistence extends BasePersistence<CustomerMobileNumbers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomerMobileNumbersUtil} to access the customer mobile numbers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the customer mobile numbers in the entity cache if it is enabled.
	*
	* @param customerMobileNumbers the customer mobile numbers
	*/
	public void cacheResult(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers);

	/**
	* Caches the customer mobile numberses in the entity cache if it is enabled.
	*
	* @param customerMobileNumberses the customer mobile numberses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.CustomerMobileNumbers> customerMobileNumberses);

	/**
	* Creates a new customer mobile numbers with the primary key. Does not add the customer mobile numbers to the database.
	*
	* @param ID the primary key for the new customer mobile numbers
	* @return the new customer mobile numbers
	*/
	public com.ifli.rapid.model.CustomerMobileNumbers create(int ID);

	/**
	* Removes the customer mobile numbers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the customer mobile numbers
	* @return the customer mobile numbers that was removed
	* @throws com.ifli.rapid.NoSuchCustomerMobileNumbersException if a customer mobile numbers with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CustomerMobileNumbers remove(int ID)
		throws com.ifli.rapid.NoSuchCustomerMobileNumbersException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.CustomerMobileNumbers updateImpl(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer mobile numbers with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerMobileNumbersException} if it could not be found.
	*
	* @param ID the primary key of the customer mobile numbers
	* @return the customer mobile numbers
	* @throws com.ifli.rapid.NoSuchCustomerMobileNumbersException if a customer mobile numbers with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CustomerMobileNumbers findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchCustomerMobileNumbersException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer mobile numbers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the customer mobile numbers
	* @return the customer mobile numbers, or <code>null</code> if a customer mobile numbers with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CustomerMobileNumbers fetchByPrimaryKey(int ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the customer mobile numberses.
	*
	* @return the customer mobile numberses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CustomerMobileNumbers> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the customer mobile numberses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer mobile numberses
	* @param end the upper bound of the range of customer mobile numberses (not inclusive)
	* @return the range of customer mobile numberses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CustomerMobileNumbers> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customer mobile numberses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer mobile numberses
	* @param end the upper bound of the range of customer mobile numberses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer mobile numberses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CustomerMobileNumbers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the customer mobile numberses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customer mobile numberses.
	*
	* @return the number of customer mobile numberses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}