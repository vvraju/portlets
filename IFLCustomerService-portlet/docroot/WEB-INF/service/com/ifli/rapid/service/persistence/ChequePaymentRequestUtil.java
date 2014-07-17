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

import com.ifli.rapid.model.ChequePaymentRequest;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the cheque payment request service. This utility wraps {@link ChequePaymentRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ChequePaymentRequestPersistence
 * @see ChequePaymentRequestPersistenceImpl
 * @generated
 */
public class ChequePaymentRequestUtil {
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
	public static void clearCache(ChequePaymentRequest chequePaymentRequest) {
		getPersistence().clearCache(chequePaymentRequest);
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
	public static List<ChequePaymentRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ChequePaymentRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ChequePaymentRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ChequePaymentRequest update(
		ChequePaymentRequest chequePaymentRequest) throws SystemException {
		return getPersistence().update(chequePaymentRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ChequePaymentRequest update(
		ChequePaymentRequest chequePaymentRequest, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(chequePaymentRequest, serviceContext);
	}

	/**
	* Caches the cheque payment request in the entity cache if it is enabled.
	*
	* @param chequePaymentRequest the cheque payment request
	*/
	public static void cacheResult(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest) {
		getPersistence().cacheResult(chequePaymentRequest);
	}

	/**
	* Caches the cheque payment requests in the entity cache if it is enabled.
	*
	* @param chequePaymentRequests the cheque payment requests
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.ChequePaymentRequest> chequePaymentRequests) {
		getPersistence().cacheResult(chequePaymentRequests);
	}

	/**
	* Creates a new cheque payment request with the primary key. Does not add the cheque payment request to the database.
	*
	* @param ServiceRequestID the primary key for the new cheque payment request
	* @return the new cheque payment request
	*/
	public static com.ifli.rapid.model.ChequePaymentRequest create(
		java.lang.String ServiceRequestID) {
		return getPersistence().create(ServiceRequestID);
	}

	/**
	* Removes the cheque payment request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request that was removed
	* @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ChequePaymentRequest remove(
		java.lang.String ServiceRequestID)
		throws com.ifli.rapid.NoSuchChequePaymentRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ServiceRequestID);
	}

	public static com.ifli.rapid.model.ChequePaymentRequest updateImpl(
		com.ifli.rapid.model.ChequePaymentRequest chequePaymentRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(chequePaymentRequest);
	}

	/**
	* Returns the cheque payment request with the primary key or throws a {@link com.ifli.rapid.NoSuchChequePaymentRequestException} if it could not be found.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request
	* @throws com.ifli.rapid.NoSuchChequePaymentRequestException if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ChequePaymentRequest findByPrimaryKey(
		java.lang.String ServiceRequestID)
		throws com.ifli.rapid.NoSuchChequePaymentRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ServiceRequestID);
	}

	/**
	* Returns the cheque payment request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ServiceRequestID the primary key of the cheque payment request
	* @return the cheque payment request, or <code>null</code> if a cheque payment request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.ChequePaymentRequest fetchByPrimaryKey(
		java.lang.String ServiceRequestID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ServiceRequestID);
	}

	/**
	* Returns all the cheque payment requests.
	*
	* @return the cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ChequePaymentRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cheque payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cheque payment requests
	* @param end the upper bound of the range of cheque payment requests (not inclusive)
	* @return the range of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ChequePaymentRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cheque payment requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ChequePaymentRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cheque payment requests
	* @param end the upper bound of the range of cheque payment requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.ChequePaymentRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cheque payment requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cheque payment requests.
	*
	* @return the number of cheque payment requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ChequePaymentRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ChequePaymentRequestPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					ChequePaymentRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(ChequePaymentRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ChequePaymentRequestPersistence persistence) {
	}

	private static ChequePaymentRequestPersistence _persistence;
}