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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the qrc trn history service. This utility wraps {@link QrcTrnHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnHistoryPersistence
 * @see QrcTrnHistoryPersistenceImpl
 * @generated
 */
public class QrcTrnHistoryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(QrcTrnHistory qrcTrnHistory) {
		getPersistence().clearCache(qrcTrnHistory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QrcTrnHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QrcTrnHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QrcTrnHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QrcTrnHistory update(QrcTrnHistory qrcTrnHistory)
		throws SystemException {
		return getPersistence().update(qrcTrnHistory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QrcTrnHistory update(QrcTrnHistory qrcTrnHistory,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qrcTrnHistory, serviceContext);
	}

	/**
	* Caches the qrc trn history in the entity cache if it is enabled.
	*
	* @param qrcTrnHistory the qrc trn history
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory) {
		getPersistence().cacheResult(qrcTrnHistory);
	}

	/**
	* Caches the qrc trn histories in the entity cache if it is enabled.
	*
	* @param qrcTrnHistories the qrc trn histories
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> qrcTrnHistories) {
		getPersistence().cacheResult(qrcTrnHistories);
	}

	/**
	* Creates a new qrc trn history with the primary key. Does not add the qrc trn history to the database.
	*
	* @param HistoryId the primary key for the new qrc trn history
	* @return the new qrc trn history
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory create(
		int HistoryId) {
		return getPersistence().create(HistoryId);
	}

	/**
	* Removes the qrc trn history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history that was removed
	* @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory remove(
		int HistoryId)
		throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(HistoryId);
	}

	public static com.ifl.rapid.customer.model.QrcTrnHistory updateImpl(
		com.ifl.rapid.customer.model.QrcTrnHistory qrcTrnHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qrcTrnHistory);
	}

	/**
	* Returns the qrc trn history with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcTrnHistoryException} if it could not be found.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history
	* @throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory findByPrimaryKey(
		int HistoryId)
		throws com.ifl.rapid.customer.NoSuchQrcTrnHistoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(HistoryId);
	}

	/**
	* Returns the qrc trn history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param HistoryId the primary key of the qrc trn history
	* @return the qrc trn history, or <code>null</code> if a qrc trn history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.QrcTrnHistory fetchByPrimaryKey(
		int HistoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(HistoryId);
	}

	/**
	* Returns all the qrc trn histories.
	*
	* @return the qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ifl.rapid.customer.model.QrcTrnHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qrc trn histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qrc trn histories.
	*
	* @return the number of qrc trn histories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QrcTrnHistoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QrcTrnHistoryPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					QrcTrnHistoryPersistence.class.getName());

			ReferenceRegistry.registerReference(QrcTrnHistoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QrcTrnHistoryPersistence persistence) {
	}

	private static QrcTrnHistoryPersistence _persistence;
}