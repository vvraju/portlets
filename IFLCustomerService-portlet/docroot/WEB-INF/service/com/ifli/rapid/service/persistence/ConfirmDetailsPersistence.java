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

import com.ifli.rapid.model.ConfirmDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the confirm details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ConfirmDetailsPersistenceImpl
 * @see ConfirmDetailsUtil
 * @generated
 */
public interface ConfirmDetailsPersistence extends BasePersistence<ConfirmDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConfirmDetailsUtil} to access the confirm details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the confirm details in the entity cache if it is enabled.
	*
	* @param confirmDetails the confirm details
	*/
	public void cacheResult(com.ifli.rapid.model.ConfirmDetails confirmDetails);

	/**
	* Caches the confirm detailses in the entity cache if it is enabled.
	*
	* @param confirmDetailses the confirm detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.ConfirmDetails> confirmDetailses);

	/**
	* Creates a new confirm details with the primary key. Does not add the confirm details to the database.
	*
	* @param ID the primary key for the new confirm details
	* @return the new confirm details
	*/
	public com.ifli.rapid.model.ConfirmDetails create(int ID);

	/**
	* Removes the confirm details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the confirm details
	* @return the confirm details that was removed
	* @throws com.ifli.rapid.NoSuchConfirmDetailsException if a confirm details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ConfirmDetails remove(int ID)
		throws com.ifli.rapid.NoSuchConfirmDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.ConfirmDetails updateImpl(
		com.ifli.rapid.model.ConfirmDetails confirmDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirm details with the primary key or throws a {@link com.ifli.rapid.NoSuchConfirmDetailsException} if it could not be found.
	*
	* @param ID the primary key of the confirm details
	* @return the confirm details
	* @throws com.ifli.rapid.NoSuchConfirmDetailsException if a confirm details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ConfirmDetails findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchConfirmDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirm details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the confirm details
	* @return the confirm details, or <code>null</code> if a confirm details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.ConfirmDetails fetchByPrimaryKey(int ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the confirm detailses.
	*
	* @return the confirm detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ConfirmDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the confirm detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ConfirmDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of confirm detailses
	* @param end the upper bound of the range of confirm detailses (not inclusive)
	* @return the range of confirm detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ConfirmDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the confirm detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ConfirmDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of confirm detailses
	* @param end the upper bound of the range of confirm detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of confirm detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.ConfirmDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the confirm detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of confirm detailses.
	*
	* @return the number of confirm detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}