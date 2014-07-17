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

import com.ifli.rapid.model.PaymentTransactionStatusMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the payment transaction status master service. This utility wraps {@link PaymentTransactionStatusMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentTransactionStatusMasterPersistence
 * @see PaymentTransactionStatusMasterPersistenceImpl
 * @generated
 */
public class PaymentTransactionStatusMasterUtil {
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
	public static void clearCache(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		getPersistence().clearCache(paymentTransactionStatusMaster);
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
	public static List<PaymentTransactionStatusMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentTransactionStatusMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentTransactionStatusMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentTransactionStatusMaster update(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws SystemException {
		return getPersistence().update(paymentTransactionStatusMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentTransactionStatusMaster update(
		PaymentTransactionStatusMaster paymentTransactionStatusMaster,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(paymentTransactionStatusMaster, serviceContext);
	}

	/**
	* Caches the payment transaction status master in the entity cache if it is enabled.
	*
	* @param paymentTransactionStatusMaster the payment transaction status master
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster) {
		getPersistence().cacheResult(paymentTransactionStatusMaster);
	}

	/**
	* Caches the payment transaction status masters in the entity cache if it is enabled.
	*
	* @param paymentTransactionStatusMasters the payment transaction status masters
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> paymentTransactionStatusMasters) {
		getPersistence().cacheResult(paymentTransactionStatusMasters);
	}

	/**
	* Creates a new payment transaction status master with the primary key. Does not add the payment transaction status master to the database.
	*
	* @param TransactionStatusID the primary key for the new payment transaction status master
	* @return the new payment transaction status master
	*/
	public static com.ifli.rapid.model.PaymentTransactionStatusMaster create(
		int TransactionStatusID) {
		return getPersistence().create(TransactionStatusID);
	}

	/**
	* Removes the payment transaction status master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master that was removed
	* @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentTransactionStatusMaster remove(
		int TransactionStatusID)
		throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(TransactionStatusID);
	}

	public static com.ifli.rapid.model.PaymentTransactionStatusMaster updateImpl(
		com.ifli.rapid.model.PaymentTransactionStatusMaster paymentTransactionStatusMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentTransactionStatusMaster);
	}

	/**
	* Returns the payment transaction status master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException} if it could not be found.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master
	* @throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentTransactionStatusMaster findByPrimaryKey(
		int TransactionStatusID)
		throws com.ifli.rapid.NoSuchPaymentTransactionStatusMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(TransactionStatusID);
	}

	/**
	* Returns the payment transaction status master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param TransactionStatusID the primary key of the payment transaction status master
	* @return the payment transaction status master, or <code>null</code> if a payment transaction status master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentTransactionStatusMaster fetchByPrimaryKey(
		int TransactionStatusID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(TransactionStatusID);
	}

	/**
	* Returns all the payment transaction status masters.
	*
	* @return the payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the payment transaction status masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment transaction status masters
	* @param end the upper bound of the range of payment transaction status masters (not inclusive)
	* @return the range of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the payment transaction status masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentTransactionStatusMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment transaction status masters
	* @param end the upper bound of the range of payment transaction status masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentTransactionStatusMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the payment transaction status masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment transaction status masters.
	*
	* @return the number of payment transaction status masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentTransactionStatusMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentTransactionStatusMasterPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PaymentTransactionStatusMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentTransactionStatusMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		PaymentTransactionStatusMasterPersistence persistence) {
	}

	private static PaymentTransactionStatusMasterPersistence _persistence;
}