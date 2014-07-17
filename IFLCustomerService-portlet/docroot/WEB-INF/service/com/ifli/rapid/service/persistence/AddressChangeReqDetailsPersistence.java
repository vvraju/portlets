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

import com.ifli.rapid.model.AddressChangeReqDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the address change req details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see AddressChangeReqDetailsPersistenceImpl
 * @see AddressChangeReqDetailsUtil
 * @generated
 */
public interface AddressChangeReqDetailsPersistence extends BasePersistence<AddressChangeReqDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddressChangeReqDetailsUtil} to access the address change req details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the address change req details in the entity cache if it is enabled.
	*
	* @param addressChangeReqDetails the address change req details
	*/
	public void cacheResult(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails);

	/**
	* Caches the address change req detailses in the entity cache if it is enabled.
	*
	* @param addressChangeReqDetailses the address change req detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.AddressChangeReqDetails> addressChangeReqDetailses);

	/**
	* Creates a new address change req details with the primary key. Does not add the address change req details to the database.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key for the new address change req details
	* @return the new address change req details
	*/
	public com.ifli.rapid.model.AddressChangeReqDetails create(
		int ADDR_CHANGE_DETAILS_ID);

	/**
	* Removes the address change req details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	* @return the address change req details that was removed
	* @throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException if a address change req details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.AddressChangeReqDetails remove(
		int ADDR_CHANGE_DETAILS_ID)
		throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.AddressChangeReqDetails updateImpl(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the address change req details with the primary key or throws a {@link com.ifli.rapid.NoSuchAddressChangeReqDetailsException} if it could not be found.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	* @return the address change req details
	* @throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException if a address change req details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.AddressChangeReqDetails findByPrimaryKey(
		int ADDR_CHANGE_DETAILS_ID)
		throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the address change req details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	* @return the address change req details, or <code>null</code> if a address change req details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.AddressChangeReqDetails fetchByPrimaryKey(
		int ADDR_CHANGE_DETAILS_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the address change req detailses.
	*
	* @return the address change req detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.AddressChangeReqDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the address change req detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address change req detailses
	* @param end the upper bound of the range of address change req detailses (not inclusive)
	* @return the range of address change req detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.AddressChangeReqDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the address change req detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address change req detailses
	* @param end the upper bound of the range of address change req detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of address change req detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.AddressChangeReqDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the address change req detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of address change req detailses.
	*
	* @return the number of address change req detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}