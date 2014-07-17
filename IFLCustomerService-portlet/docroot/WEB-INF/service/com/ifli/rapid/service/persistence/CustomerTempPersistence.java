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

import com.ifli.rapid.model.CustomerTemp;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the customer temp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerTempPersistenceImpl
 * @see CustomerTempUtil
 * @generated
 */
public interface CustomerTempPersistence extends BasePersistence<CustomerTemp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomerTempUtil} to access the customer temp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the customer temp in the entity cache if it is enabled.
	*
	* @param customerTemp the customer temp
	*/
	public void cacheResult(com.ifli.rapid.model.CustomerTemp customerTemp);

	/**
	* Caches the customer temps in the entity cache if it is enabled.
	*
	* @param customerTemps the customer temps
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.CustomerTemp> customerTemps);

	/**
	* Creates a new customer temp with the primary key. Does not add the customer temp to the database.
	*
	* @param CUSTOMER_ID the primary key for the new customer temp
	* @return the new customer temp
	*/
	public com.ifli.rapid.model.CustomerTemp create(
		java.lang.String CUSTOMER_ID);

	/**
	* Removes the customer temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ID the primary key of the customer temp
	* @return the customer temp that was removed
	* @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CustomerTemp remove(
		java.lang.String CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchCustomerTempException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.CustomerTemp updateImpl(
		com.ifli.rapid.model.CustomerTemp customerTemp)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer temp with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerTempException} if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the customer temp
	* @return the customer temp
	* @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CustomerTemp findByPrimaryKey(
		java.lang.String CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchCustomerTempException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer temp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the customer temp
	* @return the customer temp, or <code>null</code> if a customer temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CustomerTemp fetchByPrimaryKey(
		java.lang.String CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the customer temps.
	*
	* @return the customer temps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CustomerTemp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the customer temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer temps
	* @param end the upper bound of the range of customer temps (not inclusive)
	* @return the range of customer temps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CustomerTemp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customer temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer temps
	* @param end the upper bound of the range of customer temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer temps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CustomerTemp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the customer temps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customer temps.
	*
	* @return the number of customer temps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}