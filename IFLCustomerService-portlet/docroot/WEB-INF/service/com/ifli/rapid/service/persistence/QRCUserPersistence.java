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

import com.ifli.rapid.model.QRCUser;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the q r c user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCUserPersistenceImpl
 * @see QRCUserUtil
 * @generated
 */
public interface QRCUserPersistence extends BasePersistence<QRCUser> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QRCUserUtil} to access the q r c user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the q r c user in the entity cache if it is enabled.
	*
	* @param qrcUser the q r c user
	*/
	public void cacheResult(com.ifli.rapid.model.QRCUser qrcUser);

	/**
	* Caches the q r c users in the entity cache if it is enabled.
	*
	* @param qrcUsers the q r c users
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.QRCUser> qrcUsers);

	/**
	* Creates a new q r c user with the primary key. Does not add the q r c user to the database.
	*
	* @param QRC_USER_ID the primary key for the new q r c user
	* @return the new q r c user
	*/
	public com.ifli.rapid.model.QRCUser create(int QRC_USER_ID);

	/**
	* Removes the q r c user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_USER_ID the primary key of the q r c user
	* @return the q r c user that was removed
	* @throws com.ifli.rapid.NoSuchQRCUserException if a q r c user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCUser remove(int QRC_USER_ID)
		throws com.ifli.rapid.NoSuchQRCUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.QRCUser updateImpl(
		com.ifli.rapid.model.QRCUser qrcUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q r c user with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCUserException} if it could not be found.
	*
	* @param QRC_USER_ID the primary key of the q r c user
	* @return the q r c user
	* @throws com.ifli.rapid.NoSuchQRCUserException if a q r c user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCUser findByPrimaryKey(int QRC_USER_ID)
		throws com.ifli.rapid.NoSuchQRCUserException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q r c user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param QRC_USER_ID the primary key of the q r c user
	* @return the q r c user, or <code>null</code> if a q r c user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCUser fetchByPrimaryKey(int QRC_USER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the q r c users.
	*
	* @return the q r c users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q r c users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c users
	* @param end the upper bound of the range of q r c users (not inclusive)
	* @return the range of q r c users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCUser> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q r c users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c users
	* @param end the upper bound of the range of q r c users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q r c users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCUser> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q r c users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q r c users.
	*
	* @return the number of q r c users
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}