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

import com.ifli.rapid.model.PincodeDetails;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the pincode details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PincodeDetailsPersistenceImpl
 * @see PincodeDetailsUtil
 * @generated
 */
public interface PincodeDetailsPersistence extends BasePersistence<PincodeDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PincodeDetailsUtil} to access the pincode details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the pincode details in the entity cache if it is enabled.
	*
	* @param pincodeDetails the pincode details
	*/
	public void cacheResult(com.ifli.rapid.model.PincodeDetails pincodeDetails);

	/**
	* Caches the pincode detailses in the entity cache if it is enabled.
	*
	* @param pincodeDetailses the pincode detailses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PincodeDetails> pincodeDetailses);

	/**
	* Creates a new pincode details with the primary key. Does not add the pincode details to the database.
	*
	* @param PIN_ID the primary key for the new pincode details
	* @return the new pincode details
	*/
	public com.ifli.rapid.model.PincodeDetails create(int PIN_ID);

	/**
	* Removes the pincode details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PIN_ID the primary key of the pincode details
	* @return the pincode details that was removed
	* @throws com.ifli.rapid.NoSuchPincodeDetailsException if a pincode details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PincodeDetails remove(int PIN_ID)
		throws com.ifli.rapid.NoSuchPincodeDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PincodeDetails updateImpl(
		com.ifli.rapid.model.PincodeDetails pincodeDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pincode details with the primary key or throws a {@link com.ifli.rapid.NoSuchPincodeDetailsException} if it could not be found.
	*
	* @param PIN_ID the primary key of the pincode details
	* @return the pincode details
	* @throws com.ifli.rapid.NoSuchPincodeDetailsException if a pincode details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PincodeDetails findByPrimaryKey(int PIN_ID)
		throws com.ifli.rapid.NoSuchPincodeDetailsException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pincode details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PIN_ID the primary key of the pincode details
	* @return the pincode details, or <code>null</code> if a pincode details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PincodeDetails fetchByPrimaryKey(int PIN_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pincode detailses.
	*
	* @return the pincode detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PincodeDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pincode detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PincodeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pincode detailses
	* @param end the upper bound of the range of pincode detailses (not inclusive)
	* @return the range of pincode detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PincodeDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pincode detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PincodeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pincode detailses
	* @param end the upper bound of the range of pincode detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pincode detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PincodeDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the pincode detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pincode detailses.
	*
	* @return the number of pincode detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}