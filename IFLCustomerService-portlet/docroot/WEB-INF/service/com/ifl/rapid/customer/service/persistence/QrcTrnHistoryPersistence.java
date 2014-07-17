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

import com.ifl.rapid.customer.model.QrcTrnHistory;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the qrc trn history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnHistoryPersistenceImpl
 * @see QrcTrnHistoryUtil
 * @generated
 */
public interface QrcTrnHistoryPersistence extends BasePersistence<QrcTrnHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QrcTrnHistoryUtil} to access the qrc trn history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qrc trn history in the entity cache if it is enabled.
	*
	* @param qrcTrnHistory the qrc trn history
	*/
	public void cacheResult(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory);

	/**
	* Caches the qrc trn histories in the entity cache if it is enabled.
	*
	* @param qrcTrnHistories the qrc trn histories
	*/
	public void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> qrcTrnHistories);

	/**
	* Creates a new qrc trn history with the primary key. Does not add the qrc trn history to the database.
	*
	* @param HistoryId the primary key for the new qrc trn history
	* @return the new qrc trn history
	*/
	public com.ifl.rapid.customer.model.QrcTrnHistory create(int HistoryId);

	/**
	* Removes the qrc trn history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history that was removed
	* @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.QrcTrnHistory remove(int HistoryId)
		throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifl.rapid.customer.model.QrcTrnHistory updateImpl(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qrc trn history with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcTrnHistoryException} if it could not be found.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history
	* @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.QrcTrnHistory findByPrimaryKey(
		int HistoryId)
		throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qrc trn history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history, or <code>null</code> if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifl.rapid.customer.model.QrcTrnHistory fetchByPrimaryKey(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qrc trn histories.
	*
	* @return the qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qrc trn histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc trn histories
	* @param end the upper bound of the range of qrc trn histories (not inclusive)
	* @return the range of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qrc trn histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qrc trn histories
	* @param end the upper bound of the range of qrc trn histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qrc trn histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qrc trn histories.
	*
	* @return the number of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}