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

import com.ifli.rapid.model.LocationDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the location details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see LocationDetailsPersistenceImpl
 * @see LocationDetailsUtil
 * @generated
 */
public interface LocationDetailsPersistence extends BasePersistence<LocationDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LocationDetailsUtil} to access the location details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the location details in the entity cache if it is enabled.
	*
	* @param locationDetails the location details
	*/
	public void cacheResult(
		com.ifli.rapid.model.LocationDetails locationDetails);

	/**
	* Caches the location detailses in the entity cache if it is enabled.
	*
	* @param locationDetailses the location detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.LocationDetails> locationDetailses);

	/**
	* Creates a new location details with the primary key. Does not add the location details to the database.
	*
	* @param LOCATION_ID the primary key for the new location details
	* @return the new location details
	*/
	public com.ifli.rapid.model.LocationDetails create(int LOCATION_ID);

	/**
	* Removes the location details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param LOCATION_ID the primary key of the location details
	* @return the location details that was removed
	* @throws com.ifli.rapid.NoSuchLocationDetailsException if a location details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.LocationDetails remove(int LOCATION_ID)
		throws com.ifli.rapid.NoSuchLocationDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.LocationDetails updateImpl(
		com.ifli.rapid.model.LocationDetails locationDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the location details with the primary key or throws a {@link com.ifli.rapid.NoSuchLocationDetailsException} if it could not be found.
	*
	* @param LOCATION_ID the primary key of the location details
	* @return the location details
	* @throws com.ifli.rapid.NoSuchLocationDetailsException if a location details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.LocationDetails findByPrimaryKey(
		int LOCATION_ID)
		throws com.ifli.rapid.NoSuchLocationDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the location details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param LOCATION_ID the primary key of the location details
	* @return the location details, or <code>null</code> if a location details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.LocationDetails fetchByPrimaryKey(
		int LOCATION_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the location detailses.
	*
	* @return the location detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.LocationDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the location detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of location detailses
	* @param end the upper bound of the range of location detailses (not inclusive)
	* @return the range of location detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.LocationDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the location detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of location detailses
	* @param end the upper bound of the range of location detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of location detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.LocationDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the location detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of location detailses.
	*
	* @return the number of location detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}