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

import com.ifli.rapid.model.PolicyFundSwitchDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the policy fund switch details service. This utility wraps {@link PolicyFundSwitchDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchDetailsPersistence
 * @see PolicyFundSwitchDetailsPersistenceImpl
 * @generated
 */
public class PolicyFundSwitchDetailsUtil {
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
		PolicyFundSwitchDetails policyFundSwitchDetails) {
		getPersistence().clearCache(policyFundSwitchDetails);
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
	public static List<PolicyFundSwitchDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PolicyFundSwitchDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PolicyFundSwitchDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PolicyFundSwitchDetails update(
		PolicyFundSwitchDetails policyFundSwitchDetails)
		throws SystemException {
		return getPersistence().update(policyFundSwitchDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PolicyFundSwitchDetails update(
		PolicyFundSwitchDetails policyFundSwitchDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(policyFundSwitchDetails, serviceContext);
	}

	/**
	* Caches the policy fund switch details in the entity cache if it is enabled.
	*
	* @param policyFundSwitchDetails the policy fund switch details
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails) {
		getPersistence().cacheResult(policyFundSwitchDetails);
	}

	/**
	* Caches the policy fund switch detailses in the entity cache if it is enabled.
	*
	* @param policyFundSwitchDetailses the policy fund switch detailses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyFundSwitchDetails> policyFundSwitchDetailses) {
		getPersistence().cacheResult(policyFundSwitchDetailses);
	}

	/**
	* Creates a new policy fund switch details with the primary key. Does not add the policy fund switch details to the database.
	*
	* @param FUND_SWITCH_ID the primary key for the new policy fund switch details
	* @return the new policy fund switch details
	*/
	public static com.ifli.rapid.model.PolicyFundSwitchDetails create(
		int FUND_SWITCH_ID) {
		return getPersistence().create(FUND_SWITCH_ID);
	}

	/**
	* Removes the policy fund switch details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FUND_SWITCH_ID the primary key of the policy fund switch details
	* @return the policy fund switch details that was removed
	* @throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException if a policy fund switch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyFundSwitchDetails remove(
		int FUND_SWITCH_ID)
		throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(FUND_SWITCH_ID);
	}

	public static com.ifli.rapid.model.PolicyFundSwitchDetails updateImpl(
		com.ifli.rapid.model.PolicyFundSwitchDetails policyFundSwitchDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(policyFundSwitchDetails);
	}

	/**
	* Returns the policy fund switch details with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException} if it could not be found.
	*
	* @param FUND_SWITCH_ID the primary key of the policy fund switch details
	* @return the policy fund switch details
	* @throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException if a policy fund switch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyFundSwitchDetails findByPrimaryKey(
		int FUND_SWITCH_ID)
		throws com.ifli.rapid.NoSuchPolicyFundSwitchDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(FUND_SWITCH_ID);
	}

	/**
	* Returns the policy fund switch details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FUND_SWITCH_ID the primary key of the policy fund switch details
	* @return the policy fund switch details, or <code>null</code> if a policy fund switch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyFundSwitchDetails fetchByPrimaryKey(
		int FUND_SWITCH_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(FUND_SWITCH_ID);
	}

	/**
	* Returns all the policy fund switch detailses.
	*
	* @return the policy fund switch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyFundSwitchDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the policy fund switch detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy fund switch detailses
	* @param end the upper bound of the range of policy fund switch detailses (not inclusive)
	* @return the range of policy fund switch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyFundSwitchDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the policy fund switch detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy fund switch detailses
	* @param end the upper bound of the range of policy fund switch detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy fund switch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyFundSwitchDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the policy fund switch detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of policy fund switch detailses.
	*
	* @return the number of policy fund switch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PolicyFundSwitchDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PolicyFundSwitchDetailsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PolicyFundSwitchDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(PolicyFundSwitchDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PolicyFundSwitchDetailsPersistence persistence) {
	}

	private static PolicyFundSwitchDetailsPersistence _persistence;
}