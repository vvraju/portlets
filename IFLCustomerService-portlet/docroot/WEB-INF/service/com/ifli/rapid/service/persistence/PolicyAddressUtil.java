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

import com.ifli.rapid.model.PolicyAddress;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the policy address service. This utility wraps {@link PolicyAddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyAddressPersistence
 * @see PolicyAddressPersistenceImpl
 * @generated
 */
public class PolicyAddressUtil {
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
	public static void clearCache(PolicyAddress policyAddress) {
		getPersistence().clearCache(policyAddress);
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
	public static List<PolicyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PolicyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PolicyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PolicyAddress update(PolicyAddress policyAddress)
		throws SystemException {
		return getPersistence().update(policyAddress);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PolicyAddress update(PolicyAddress policyAddress,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(policyAddress, serviceContext);
	}

	/**
	* Returns the policy address where POLICY_ID = &#63; or throws a {@link com.ifli.rapid.NoSuchPolicyAddressException} if it could not be found.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the matching policy address
	* @throws com.ifli.rapid.NoSuchPolicyAddressException if a matching policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress findByPolicyId(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPolicyId(POLICY_ID);
	}

	/**
	* Returns the policy address where POLICY_ID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the matching policy address, or <code>null</code> if a matching policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress fetchByPolicyId(
		java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPolicyId(POLICY_ID);
	}

	/**
	* Returns the policy address where POLICY_ID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching policy address, or <code>null</code> if a matching policy address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress fetchByPolicyId(
		java.lang.String POLICY_ID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPolicyId(POLICY_ID, retrieveFromCache);
	}

	/**
	* Removes the policy address where POLICY_ID = &#63; from the database.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the policy address that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress removeByPolicyId(
		java.lang.String POLICY_ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByPolicyId(POLICY_ID);
	}

	/**
	* Returns the number of policy addresses where POLICY_ID = &#63;.
	*
	* @param POLICY_ID the p o l i c y_ i d
	* @return the number of matching policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPolicyId(java.lang.String POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPolicyId(POLICY_ID);
	}

	/**
	* Caches the policy address in the entity cache if it is enabled.
	*
	* @param policyAddress the policy address
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PolicyAddress policyAddress) {
		getPersistence().cacheResult(policyAddress);
	}

	/**
	* Caches the policy addresses in the entity cache if it is enabled.
	*
	* @param policyAddresses the policy addresses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyAddress> policyAddresses) {
		getPersistence().cacheResult(policyAddresses);
	}

	/**
	* Creates a new policy address with the primary key. Does not add the policy address to the database.
	*
	* @param ID the primary key for the new policy address
	* @return the new policy address
	*/
	public static com.ifli.rapid.model.PolicyAddress create(int ID) {
		return getPersistence().create(ID);
	}

	/**
	* Removes the policy address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the policy address
	* @return the policy address that was removed
	* @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress remove(int ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ID);
	}

	public static com.ifli.rapid.model.PolicyAddress updateImpl(
		com.ifli.rapid.model.PolicyAddress policyAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(policyAddress);
	}

	/**
	* Returns the policy address with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyAddressException} if it could not be found.
	*
	* @param ID the primary key of the policy address
	* @return the policy address
	* @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchPolicyAddressException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ID);
	}

	/**
	* Returns the policy address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the policy address
	* @return the policy address, or <code>null</code> if a policy address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyAddress fetchByPrimaryKey(int ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ID);
	}

	/**
	* Returns all the policy addresses.
	*
	* @return the policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyAddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy addresses
	* @param end the upper bound of the range of policy addresses (not inclusive)
	* @return the range of policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyAddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the policy addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy addresses
	* @param end the upper bound of the range of policy addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the policy addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of policy addresses.
	*
	* @return the number of policy addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PolicyAddressPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PolicyAddressPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PolicyAddressPersistence.class.getName());

			ReferenceRegistry.registerReference(PolicyAddressUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PolicyAddressPersistence persistence) {
	}

	private static PolicyAddressPersistence _persistence;
}