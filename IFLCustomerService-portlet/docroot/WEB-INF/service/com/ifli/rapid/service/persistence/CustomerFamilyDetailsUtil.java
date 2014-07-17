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

import com.ifli.rapid.model.CustomerFamilyDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the customer family details service. This utility wraps {@link CustomerFamilyDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerFamilyDetailsPersistence
 * @see CustomerFamilyDetailsPersistenceImpl
 * @generated
 */
public class CustomerFamilyDetailsUtil {
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
	public static void clearCache(CustomerFamilyDetails customerFamilyDetails) {
		getPersistence().clearCache(customerFamilyDetails);
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
	public static List<CustomerFamilyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomerFamilyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomerFamilyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CustomerFamilyDetails update(
		CustomerFamilyDetails customerFamilyDetails) throws SystemException {
		return getPersistence().update(customerFamilyDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CustomerFamilyDetails update(
		CustomerFamilyDetails customerFamilyDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(customerFamilyDetails, serviceContext);
	}

	/**
	* Caches the customer family details in the entity cache if it is enabled.
	*
	* @param customerFamilyDetails the customer family details
	*/
	public static void cacheResult(
		com.ifli.rapid.model.CustomerFamilyDetails customerFamilyDetails) {
		getPersistence().cacheResult(customerFamilyDetails);
	}

	/**
	* Caches the customer family detailses in the entity cache if it is enabled.
	*
	* @param customerFamilyDetailses the customer family detailses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.CustomerFamilyDetails> customerFamilyDetailses) {
		getPersistence().cacheResult(customerFamilyDetailses);
	}

	/**
	* Creates a new customer family details with the primary key. Does not add the customer family details to the database.
	*
	* @param CUSTOMER_FAMILY_ID the primary key for the new customer family details
	* @return the new customer family details
	*/
	public static com.ifli.rapid.model.CustomerFamilyDetails create(
		int CUSTOMER_FAMILY_ID) {
		return getPersistence().create(CUSTOMER_FAMILY_ID);
	}

	/**
	* Removes the customer family details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CUSTOMER_FAMILY_ID the primary key of the customer family details
	* @return the customer family details that was removed
	* @throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException if a customer family details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerFamilyDetails remove(
		int CUSTOMER_FAMILY_ID)
		throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(CUSTOMER_FAMILY_ID);
	}

	public static com.ifli.rapid.model.CustomerFamilyDetails updateImpl(
		com.ifli.rapid.model.CustomerFamilyDetails customerFamilyDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customerFamilyDetails);
	}

	/**
	* Returns the customer family details with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerFamilyDetailsException} if it could not be found.
	*
	* @param CUSTOMER_FAMILY_ID the primary key of the customer family details
	* @return the customer family details
	* @throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException if a customer family details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerFamilyDetails findByPrimaryKey(
		int CUSTOMER_FAMILY_ID)
		throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(CUSTOMER_FAMILY_ID);
	}

	/**
	* Returns the customer family details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CUSTOMER_FAMILY_ID the primary key of the customer family details
	* @return the customer family details, or <code>null</code> if a customer family details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.CustomerFamilyDetails fetchByPrimaryKey(
		int CUSTOMER_FAMILY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CUSTOMER_FAMILY_ID);
	}

	/**
	* Returns all the customer family detailses.
	*
	* @return the customer family detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerFamilyDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customer family detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerFamilyDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer family detailses
	* @param end the upper bound of the range of customer family detailses (not inclusive)
	* @return the range of customer family detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerFamilyDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customer family detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerFamilyDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer family detailses
	* @param end the upper bound of the range of customer family detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer family detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.CustomerFamilyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customer family detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customer family detailses.
	*
	* @return the number of customer family detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CustomerFamilyDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CustomerFamilyDetailsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					CustomerFamilyDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(CustomerFamilyDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CustomerFamilyDetailsPersistence persistence) {
	}

	private static CustomerFamilyDetailsPersistence _persistence;
}