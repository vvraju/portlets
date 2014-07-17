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

import com.ifli.rapid.model.PremiumType;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the premium type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PremiumTypePersistenceImpl
 * @see PremiumTypeUtil
 * @generated
 */
public interface PremiumTypePersistence extends BasePersistence<PremiumType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PremiumTypeUtil} to access the premium type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the premium type in the entity cache if it is enabled.
	*
	* @param premiumType the premium type
	*/
	public void cacheResult(com.ifli.rapid.model.PremiumType premiumType);

	/**
	* Caches the premium types in the entity cache if it is enabled.
	*
	* @param premiumTypes the premium types
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.PremiumType> premiumTypes);

	/**
	* Creates a new premium type with the primary key. Does not add the premium type to the database.
	*
	* @param Id the primary key for the new premium type
	* @return the new premium type
	*/
	public com.ifli.rapid.model.PremiumType create(java.lang.String Id);

	/**
	* Removes the premium type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the premium type
	* @return the premium type that was removed
	* @throws com.ifli.rapid.NoSuchPremiumTypeException if a premium type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PremiumType remove(java.lang.String Id)
		throws com.ifli.rapid.NoSuchPremiumTypeException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.PremiumType updateImpl(
		com.ifli.rapid.model.PremiumType premiumType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the premium type with the primary key or throws a {@link com.ifli.rapid.NoSuchPremiumTypeException} if it could not be found.
	*
	* @param Id the primary key of the premium type
	* @return the premium type
	* @throws com.ifli.rapid.NoSuchPremiumTypeException if a premium type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PremiumType findByPrimaryKey(
		java.lang.String Id)
		throws com.ifli.rapid.NoSuchPremiumTypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the premium type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the premium type
	* @return the premium type, or <code>null</code> if a premium type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.PremiumType fetchByPrimaryKey(
		java.lang.String Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the premium types.
	*
	* @return the premium types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PremiumType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the premium types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of premium types
	* @param end the upper bound of the range of premium types (not inclusive)
	* @return the range of premium types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PremiumType> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the premium types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of premium types
	* @param end the upper bound of the range of premium types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of premium types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.PremiumType> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the premium types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of premium types.
	*
	* @return the number of premium types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}