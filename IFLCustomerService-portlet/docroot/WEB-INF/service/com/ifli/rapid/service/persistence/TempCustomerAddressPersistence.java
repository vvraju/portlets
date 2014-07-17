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

import com.ifli.rapid.model.TempCustomerAddress;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the temp customer address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomerAddressPersistenceImpl
 * @see TempCustomerAddressUtil
 * @generated
 */
public interface TempCustomerAddressPersistence extends BasePersistence<TempCustomerAddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempCustomerAddressUtil} to access the temp customer address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp customer address in the entity cache if it is enabled.
	*
	* @param tempCustomerAddress the temp customer address
	*/
	public void cacheResult(
		com.ifli.rapid.model.TempCustomerAddress tempCustomerAddress);

	/**
	* Caches the temp customer addresses in the entity cache if it is enabled.
	*
	* @param tempCustomerAddresses the temp customer addresses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.TempCustomerAddress> tempCustomerAddresses);

	/**
	* Creates a new temp customer address with the primary key. Does not add the temp customer address to the database.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key for the new temp customer address
	* @return the new temp customer address
	*/
	public com.ifli.rapid.model.TempCustomerAddress create(
		int CUSTOMER_ADDRESS_ID);

	/**
	* Removes the temp customer address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	* @return the temp customer address that was removed
	* @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.TempCustomerAddress remove(
		int CUSTOMER_ADDRESS_ID)
		throws com.ifli.rapid.NoSuchTempCustomerAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.TempCustomerAddress updateImpl(
		com.ifli.rapid.model.TempCustomerAddress tempCustomerAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp customer address with the primary key or throws a {@link com.ifli.rapid.NoSuchTempCustomerAddressException} if it could not be found.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	* @return the temp customer address
	* @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.TempCustomerAddress findByPrimaryKey(
		int CUSTOMER_ADDRESS_ID)
		throws com.ifli.rapid.NoSuchTempCustomerAddressException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp customer address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	* @return the temp customer address, or <code>null</code> if a temp customer address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.TempCustomerAddress fetchByPrimaryKey(
		int CUSTOMER_ADDRESS_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp customer addresses.
	*
	* @return the temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.TempCustomerAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp customer addresses
	* @param end the upper bound of the range of temp customer addresses (not inclusive)
	* @return the range of temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.TempCustomerAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp customer addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp customer addresses
	* @param end the upper bound of the range of temp customer addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.TempCustomerAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp customer addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp customer addresses.
	*
	* @return the number of temp customer addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}