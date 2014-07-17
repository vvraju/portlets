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

import com.ifli.rapid.model.CityDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the city details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CityDetailsPersistenceImpl
 * @see CityDetailsUtil
 * @generated
 */
public interface CityDetailsPersistence extends BasePersistence<CityDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CityDetailsUtil} to access the city details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the city details in the entity cache if it is enabled.
	*
	* @param cityDetails the city details
	*/
	public void cacheResult(com.ifli.rapid.model.CityDetails cityDetails);

	/**
	* Caches the city detailses in the entity cache if it is enabled.
	*
	* @param cityDetailses the city detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.CityDetails> cityDetailses);

	/**
	* Creates a new city details with the primary key. Does not add the city details to the database.
	*
	* @param CITY_ID the primary key for the new city details
	* @return the new city details
	*/
	public com.ifli.rapid.model.CityDetails create(int CITY_ID);

	/**
	* Removes the city details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CITY_ID the primary key of the city details
	* @return the city details that was removed
	* @throws com.ifli.rapid.NoSuchCityDetailsException if a city details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CityDetails remove(int CITY_ID)
		throws com.ifli.rapid.NoSuchCityDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.CityDetails updateImpl(
		com.ifli.rapid.model.CityDetails cityDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the city details with the primary key or throws a {@link com.ifli.rapid.NoSuchCityDetailsException} if it could not be found.
	*
	* @param CITY_ID the primary key of the city details
	* @return the city details
	* @throws com.ifli.rapid.NoSuchCityDetailsException if a city details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CityDetails findByPrimaryKey(int CITY_ID)
		throws com.ifli.rapid.NoSuchCityDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the city details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CITY_ID the primary key of the city details
	* @return the city details, or <code>null</code> if a city details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.CityDetails fetchByPrimaryKey(int CITY_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the city detailses.
	*
	* @return the city detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CityDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the city detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of city detailses
	* @param end the upper bound of the range of city detailses (not inclusive)
	* @return the range of city detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CityDetails> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the city detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of city detailses
	* @param end the upper bound of the range of city detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of city detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.CityDetails> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the city detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of city detailses.
	*
	* @return the number of city detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}