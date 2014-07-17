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

import com.ifli.rapid.model.CustomerOtp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the customer otp service. This utility wraps {@link CustomerOtpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerOtpPersistence
 * @see CustomerOtpPersistenceImpl
 * @generated
 */
public class CustomerOtpUtil {
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
	public static void clearCache(CustomerOtp customerOtp) {
		getPersistence().clearCache(customerOtp);
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
	public static List<CustomerOtp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomerOtp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomerOtp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CustomerOtp update(CustomerOtp customerOtp)
		throws SystemException {
		return getPersistence().update(customerOtp);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CustomerOtp update(CustomerOtp customerOtp,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(customerOtp, serviceContext);
	}

	/**
	* Caches the customer otp in the entity cache if it is enabled.
	*
	* @param customerOtp the customer otp
	*/
	public static void cacheResult(com.ifli.rapid.model.CustomerOtp customerOtp) {
		getPersistence().cacheResult(customerOtp);
	}

	/**
	* Caches the customer otps in the entity cache if it is enabled.
	*
	* @param customerOtps the customer otps
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.CustomerOtp> customerOtps) {
		getPersistence().cacheResult(customerOtps);
	}

	/**
	* Creates a new customer otp with the primary key. Does not add the customer otp to the database.
	*
	* @param CUSTOMER_ID the primary key for the new customer otp
	* @return the new customer otp
	*/
	public static com.ifli.rapid.model.CustomerOtp create(int CUSTOMER_ID) {
		return getPersistence().create(CUSTOMER_ID);
	}

	/**
	* Removes the customer otp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_ID the primary key of the customer otp
	* @return the customer otp that was removed
	* @throws com.ifli.rapid.NoSuchCustomerOtpException if a customer otp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerOtp remove(int CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchCustomerOtpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(CUSTOMER_ID);
	}

	public static com.ifli.rapid.model.CustomerOtp updateImpl(
		com.ifli.rapid.model.CustomerOtp customerOtp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customerOtp);
	}

	/**
	* Returns the customer otp with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerOtpException} if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the customer otp
	* @return the customer otp
	* @throws com.ifli.rapid.NoSuchCustomerOtpException if a customer otp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerOtp findByPrimaryKey(
		int CUSTOMER_ID)
		throws com.ifli.rapid.NoSuchCustomerOtpException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(CUSTOMER_ID);
	}

	/**
	* Returns the customer otp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_ID the primary key of the customer otp
	* @return the customer otp, or <code>null</code> if a customer otp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerOtp fetchByPrimaryKey(
		int CUSTOMER_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CUSTOMER_ID);
	}

	/**
	* Returns all the customer otps.
	*
	* @return the customer otps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerOtp> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customer otps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer otps
	* @param end the upper bound of the range of customer otps (not inclusive)
	* @return the range of customer otps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerOtp> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customer otps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer otps
	* @param end the upper bound of the range of customer otps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer otps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerOtp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customer otps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customer otps.
	*
	* @return the number of customer otps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CustomerOtpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CustomerOtpPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					CustomerOtpPersistence.class.getName());

			ReferenceRegistry.registerReference(CustomerOtpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CustomerOtpPersistence persistence) {
	}

	private static CustomerOtpPersistence _persistence;
}