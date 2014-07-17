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

import com.ifli.rapid.model.customerAddress;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the customer address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see customerAddressPersistenceImpl
 * @see customerAddressUtil
 * @generated
 */
public interface customerAddressPersistence extends BasePersistence<customerAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link customerAddressUtil} to access the customer address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the customer address in the entity cache if it is enabled.
	*
	* @param customerAddress the customer address
	*/
	public void cacheResult(
		com.ifli.rapid.model.customerAddress customerAddress);

	/**
	* Caches the customer addresses in the entity cache if it is enabled.
	*
	* @param customerAddresses the customer addresses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.customerAddress> customerAddresses);

	/**
	* Creates a new customer address with the primary key. Does not add the customer address to the database.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key for the new customer address
	* @return the new customer address
	*/
	public com.ifli.rapid.model.customerAddress create(int CUSTOMER_ADDRESS_ID);

	/**
	* Removes the customer address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	* @return the customer address that was removed
	* @throws com.ifli.rapid.NoSuchcustomerAddressException if a customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.customerAddress remove(int CUSTOMER_ADDRESS_ID)
		throws com.ifli.rapid.NoSuchcustomerAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.customerAddress updateImpl(
		com.ifli.rapid.model.customerAddress customerAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer address with the primary key or throws a {@link com.ifli.rapid.NoSuchcustomerAddressException} if it could not be found.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	* @return the customer address
	* @throws com.ifli.rapid.NoSuchcustomerAddressException if a customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.customerAddress findByPrimaryKey(
		int CUSTOMER_ADDRESS_ID)
		throws com.ifli.rapid.NoSuchcustomerAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	* @return the customer address, or <code>null</code> if a customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.customerAddress fetchByPrimaryKey(
		int CUSTOMER_ADDRESS_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the customer addresses.
	*
	* @return the customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.customerAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer addresses
	* @param end the upper bound of the range of customer addresses (not inclusive)
	* @return the range of customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.customerAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer addresses
	* @param end the upper bound of the range of customer addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.customerAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the customer addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customer addresses.
	*
	* @return the number of customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}