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

import com.ifli.rapid.model.PaymentOptionMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the payment option master service. This utility wraps {@link PaymentOptionMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionMasterPersistence
 * @see PaymentOptionMasterPersistenceImpl
 * @generated
 */
public class PaymentOptionMasterUtil {
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
	public static void clearCache(PaymentOptionMaster paymentOptionMaster) {
		getPersistence().clearCache(paymentOptionMaster);
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
	public static List<PaymentOptionMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentOptionMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentOptionMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentOptionMaster update(
		PaymentOptionMaster paymentOptionMaster) throws SystemException {
		return getPersistence().update(paymentOptionMaster);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentOptionMaster update(
		PaymentOptionMaster paymentOptionMaster, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(paymentOptionMaster, serviceContext);
	}

	/**
	* Caches the payment option master in the entity cache if it is enabled.
	*
	* @param paymentOptionMaster the payment option master
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster) {
		getPersistence().cacheResult(paymentOptionMaster);
	}

	/**
	* Caches the payment option masters in the entity cache if it is enabled.
	*
	* @param paymentOptionMasters the payment option masters
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentOptionMaster> paymentOptionMasters) {
		getPersistence().cacheResult(paymentOptionMasters);
	}

	/**
	* Creates a new payment option master with the primary key. Does not add the payment option master to the database.
	*
	* @param PaymentOptionId the primary key for the new payment option master
	* @return the new payment option master
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster create(
		java.lang.String PaymentOptionId) {
		return getPersistence().create(PaymentOptionId);
	}

	/**
	* Removes the payment option master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master that was removed
	* @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster remove(
		java.lang.String PaymentOptionId)
		throws com.ifli.rapid.NoSuchPaymentOptionMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(PaymentOptionId);
	}

	public static com.ifli.rapid.model.PaymentOptionMaster updateImpl(
		com.ifli.rapid.model.PaymentOptionMaster paymentOptionMaster)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentOptionMaster);
	}

	/**
	* Returns the payment option master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentOptionMasterException} if it could not be found.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master
	* @throws com.ifli.rapid.NoSuchPaymentOptionMasterException if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster findByPrimaryKey(
		java.lang.String PaymentOptionId)
		throws com.ifli.rapid.NoSuchPaymentOptionMasterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(PaymentOptionId);
	}

	/**
	* Returns the payment option master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PaymentOptionId the primary key of the payment option master
	* @return the payment option master, or <code>null</code> if a payment option master with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionMaster fetchByPrimaryKey(
		java.lang.String PaymentOptionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(PaymentOptionId);
	}

	/**
	* Returns all the payment option masters.
	*
	* @return the payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionMaster> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the payment option masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option masters
	* @param end the upper bound of the range of payment option masters (not inclusive)
	* @return the range of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionMaster> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the payment option masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option masters
	* @param end the upper bound of the range of payment option masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the payment option masters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment option masters.
	*
	* @return the number of payment option masters
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentOptionMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentOptionMasterPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PaymentOptionMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentOptionMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PaymentOptionMasterPersistence persistence) {
	}

	private static PaymentOptionMasterPersistence _persistence;
}