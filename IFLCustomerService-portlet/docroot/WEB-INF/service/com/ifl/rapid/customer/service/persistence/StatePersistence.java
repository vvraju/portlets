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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.model.State;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see StatePersistenceImpl
 * @see StateUtil
 * @generated
 */
public interface StatePersistence extends BasePersistence<State> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StateUtil} to access the state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the state in the entity cache if it is enabled.
	*
	* @param state the state
	*/
	public void cacheResult(com.ifl.rapid.customer.model.State state);

	/**
	* Caches the states in the entity cache if it is enabled.
	*
	* @param states the states
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.State> states);

	/**
	* Creates a new state with the primary key. Does not add the state to the database.
	*
	* @param StateId the primary key for the new state
	* @return the new state
	*/
	public com.ifl.rapid.customer.model.State create(int StateId);

	/**
	* Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param StateId the primary key of the state
	* @return the state that was removed
	* @throws com.ifl.rapid.customer.NoSuchStateException if a state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.State remove(int StateId)
		throws com.ifl.rapid.customer.NoSuchStateException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.State updateImpl(
		com.ifl.rapid.customer.model.State state)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the state with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchStateException} if it could not be found.
	*
	* @param StateId the primary key of the state
	* @return the state
	* @throws com.ifl.rapid.customer.NoSuchStateException if a state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.State findByPrimaryKey(int StateId)
		throws com.ifl.rapid.customer.NoSuchStateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the state with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param StateId the primary key of the state
	* @return the state, or <code>null</code> if a state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.State fetchByPrimaryKey(int StateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the states.
	*
	* @return the states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.State> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.StateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of states
	* @param end the upper bound of the range of states (not inclusive)
	* @return the range of states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.State> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.StateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of states
	* @param end the upper bound of the range of states (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.State> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the states from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of states.
	*
	* @return the number of states
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}