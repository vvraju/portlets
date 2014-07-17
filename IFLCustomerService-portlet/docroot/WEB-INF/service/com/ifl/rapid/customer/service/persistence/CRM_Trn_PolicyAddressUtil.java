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

import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c r m_ trn_ policy address service. This utility wraps {@link CRM_Trn_PolicyAddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddressPersistence
 * @see CRM_Trn_PolicyAddressPersistenceImpl
 * @generated
 */
public class CRM_Trn_PolicyAddressUtil {
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
	public static void clearCache(CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		getPersistence().clearCache(crm_Trn_PolicyAddress);
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
	public static List<CRM_Trn_PolicyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CRM_Trn_PolicyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CRM_Trn_PolicyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CRM_Trn_PolicyAddress update(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) throws SystemException {
		return getPersistence().update(crm_Trn_PolicyAddress);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CRM_Trn_PolicyAddress update(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(crm_Trn_PolicyAddress, serviceContext);
	}

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	*
	* @param PolicyNo the policy no
	* @return the matching c r m_ trn_ policy address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress findByPolicyNo(
		java.lang.String PolicyNo)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPolicyNo(PolicyNo);
	}

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param PolicyNo the policy no
	* @return the matching c r m_ trn_ policy address, or <code>null</code> if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchByPolicyNo(
		java.lang.String PolicyNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPolicyNo(PolicyNo);
	}

	/**
	* Returns the c r m_ trn_ policy address where PolicyNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param PolicyNo the policy no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching c r m_ trn_ policy address, or <code>null</code> if a matching c r m_ trn_ policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchByPolicyNo(
		java.lang.String PolicyNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPolicyNo(PolicyNo, retrieveFromCache);
	}

	/**
	* Removes the c r m_ trn_ policy address where PolicyNo = &#63; from the database.
	*
	* @param PolicyNo the policy no
	* @return the c r m_ trn_ policy address that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress removeByPolicyNo(
		java.lang.String PolicyNo)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByPolicyNo(PolicyNo);
	}

	/**
	* Returns the number of c r m_ trn_ policy addresses where PolicyNo = &#63;.
	*
	* @param PolicyNo the policy no
	* @return the number of matching c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPolicyNo(java.lang.String PolicyNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPolicyNo(PolicyNo);
	}

	/**
	* Caches the c r m_ trn_ policy address in the entity cache if it is enabled.
	*
	* @param crm_Trn_PolicyAddress the c r m_ trn_ policy address
	*/
	public static void cacheResult(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		getPersistence().cacheResult(crm_Trn_PolicyAddress);
	}

	/**
	* Caches the c r m_ trn_ policy addresses in the entity cache if it is enabled.
	*
	* @param crm_Trn_PolicyAddresses the c r m_ trn_ policy addresses
	*/
	public static void cacheResult(
		java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> crm_Trn_PolicyAddresses) {
		getPersistence().cacheResult(crm_Trn_PolicyAddresses);
	}

	/**
	* Creates a new c r m_ trn_ policy address with the primary key. Does not add the c r m_ trn_ policy address to the database.
	*
	* @param PolicyAddressId the primary key for the new c r m_ trn_ policy address
	* @return the new c r m_ trn_ policy address
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress create(
		int PolicyAddressId) {
		return getPersistence().create(PolicyAddressId);
	}

	/**
	* Removes the c r m_ trn_ policy address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address that was removed
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress remove(
		int PolicyAddressId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(PolicyAddressId);
	}

	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(crm_Trn_PolicyAddress);
	}

	/**
	* Returns the c r m_ trn_ policy address with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address
	* @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress findByPrimaryKey(
		int PolicyAddressId)
		throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(PolicyAddressId);
	}

	/**
	* Returns the c r m_ trn_ policy address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	* @return the c r m_ trn_ policy address, or <code>null</code> if a c r m_ trn_ policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress fetchByPrimaryKey(
		int PolicyAddressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(PolicyAddressId);
	}

	/**
	* Returns all the c r m_ trn_ policy addresses.
	*
	* @return the c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c r m_ trn_ policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ policy addresses
	* @param end the upper bound of the range of c r m_ trn_ policy addresses (not inclusive)
	* @return the range of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c r m_ trn_ policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c r m_ trn_ policy addresses
	* @param end the upper bound of the range of c r m_ trn_ policy addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c r m_ trn_ policy addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c r m_ trn_ policy addresses.
	*
	* @return the number of c r m_ trn_ policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CRM_Trn_PolicyAddressPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CRM_Trn_PolicyAddressPersistence)PortletBeanLocatorUtil.locate(com.ifl.rapid.customer.service.ClpSerializer.getServletContextName(),
					CRM_Trn_PolicyAddressPersistence.class.getName());

			ReferenceRegistry.registerReference(CRM_Trn_PolicyAddressUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CRM_Trn_PolicyAddressPersistence persistence) {
	}

	private static CRM_Trn_PolicyAddressPersistence _persistence;
}