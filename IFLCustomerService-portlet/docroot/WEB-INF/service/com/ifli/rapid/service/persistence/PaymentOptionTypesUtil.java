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

import com.ifli.rapid.model.PaymentOptionTypes;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the payment option types service. This utility wraps {@link PaymentOptionTypesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionTypesPersistence
 * @see PaymentOptionTypesPersistenceImpl
 * @generated
 */
public class PaymentOptionTypesUtil {
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
	public static void clearCache(PaymentOptionTypes paymentOptionTypes) {
		getPersistence().clearCache(paymentOptionTypes);
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
	public static List<PaymentOptionTypes> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentOptionTypes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentOptionTypes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentOptionTypes update(
		PaymentOptionTypes paymentOptionTypes) throws SystemException {
		return getPersistence().update(paymentOptionTypes);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentOptionTypes update(
		PaymentOptionTypes paymentOptionTypes, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(paymentOptionTypes, serviceContext);
	}

	/**
	* Caches the payment option types in the entity cache if it is enabled.
	*
	* @param paymentOptionTypes the payment option types
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PaymentOptionTypes paymentOptionTypes) {
		getPersistence().cacheResult(paymentOptionTypes);
	}

	/**
	* Caches the payment option typeses in the entity cache if it is enabled.
	*
	* @param paymentOptionTypeses the payment option typeses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PaymentOptionTypes> paymentOptionTypeses) {
		getPersistence().cacheResult(paymentOptionTypeses);
	}

	/**
	* Creates a new payment option types with the primary key. Does not add the payment option types to the database.
	*
	* @param PaymentOptionTypesId the primary key for the new payment option types
	* @return the new payment option types
	*/
	public static com.ifli.rapid.model.PaymentOptionTypes create(
		java.lang.String PaymentOptionTypesId) {
		return getPersistence().create(PaymentOptionTypesId);
	}

	/**
	* Removes the payment option types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PaymentOptionTypesId the primary key of the payment option types
	* @return the payment option types that was removed
	* @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionTypes remove(
		java.lang.String PaymentOptionTypesId)
		throws com.ifli.rapid.NoSuchPaymentOptionTypesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(PaymentOptionTypesId);
	}

	public static com.ifli.rapid.model.PaymentOptionTypes updateImpl(
		com.ifli.rapid.model.PaymentOptionTypes paymentOptionTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentOptionTypes);
	}

	/**
	* Returns the payment option types with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentOptionTypesException} if it could not be found.
	*
	* @param PaymentOptionTypesId the primary key of the payment option types
	* @return the payment option types
	* @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionTypes findByPrimaryKey(
		java.lang.String PaymentOptionTypesId)
		throws com.ifli.rapid.NoSuchPaymentOptionTypesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(PaymentOptionTypesId);
	}

	/**
	* Returns the payment option types with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PaymentOptionTypesId the primary key of the payment option types
	* @return the payment option types, or <code>null</code> if a payment option types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PaymentOptionTypes fetchByPrimaryKey(
		java.lang.String PaymentOptionTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(PaymentOptionTypesId);
	}

	/**
	* Returns all the payment option typeses.
	*
	* @return the payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionTypes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the payment option typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option typeses
	* @param end the upper bound of the range of payment option typeses (not inclusive)
	* @return the range of payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionTypes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the payment option typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment option typeses
	* @param end the upper bound of the range of payment option typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PaymentOptionTypes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the payment option typeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment option typeses.
	*
	* @return the number of payment option typeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentOptionTypesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentOptionTypesPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PaymentOptionTypesPersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentOptionTypesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PaymentOptionTypesPersistence persistence) {
	}

	private static PaymentOptionTypesPersistence _persistence;
}