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

import com.ifli.rapid.model.PolicyPremPercentage;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the policy prem percentage service. This utility wraps {@link PolicyPremPercentagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremPercentagePersistence
 * @see PolicyPremPercentagePersistenceImpl
 * @generated
 */
public class PolicyPremPercentageUtil {
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
	public static void clearCache(PolicyPremPercentage policyPremPercentage) {
		getPersistence().clearCache(policyPremPercentage);
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
	public static List<PolicyPremPercentage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PolicyPremPercentage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PolicyPremPercentage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PolicyPremPercentage update(
		PolicyPremPercentage policyPremPercentage) throws SystemException {
		return getPersistence().update(policyPremPercentage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PolicyPremPercentage update(
		PolicyPremPercentage policyPremPercentage, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(policyPremPercentage, serviceContext);
	}

	/**
	* Caches the policy prem percentage in the entity cache if it is enabled.
	*
	* @param policyPremPercentage the policy prem percentage
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PolicyPremPercentage policyPremPercentage) {
		getPersistence().cacheResult(policyPremPercentage);
	}

	/**
	* Caches the policy prem percentages in the entity cache if it is enabled.
	*
	* @param policyPremPercentages the policy prem percentages
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyPremPercentage> policyPremPercentages) {
		getPersistence().cacheResult(policyPremPercentages);
	}

	/**
	* Creates a new policy prem percentage with the primary key. Does not add the policy prem percentage to the database.
	*
	* @param PREM_PERCENTAGE_ID the primary key for the new policy prem percentage
	* @return the new policy prem percentage
	*/
	public static com.ifli.rapid.model.PolicyPremPercentage create(
		int PREM_PERCENTAGE_ID) {
		return getPersistence().create(PREM_PERCENTAGE_ID);
	}

	/**
	* Removes the policy prem percentage with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param PREM_PERCENTAGE_ID the primary key of the policy prem percentage
	* @return the policy prem percentage that was removed
	* @throws com.ifli.rapid.NoSuchPolicyPremPercentageException if a policy prem percentage with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyPremPercentage remove(
		int PREM_PERCENTAGE_ID)
		throws com.ifli.rapid.NoSuchPolicyPremPercentageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(PREM_PERCENTAGE_ID);
	}

	public static com.ifli.rapid.model.PolicyPremPercentage updateImpl(
		com.ifli.rapid.model.PolicyPremPercentage policyPremPercentage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(policyPremPercentage);
	}

	/**
	* Returns the policy prem percentage with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyPremPercentageException} if it could not be found.
	*
	* @param PREM_PERCENTAGE_ID the primary key of the policy prem percentage
	* @return the policy prem percentage
	* @throws com.ifli.rapid.NoSuchPolicyPremPercentageException if a policy prem percentage with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyPremPercentage findByPrimaryKey(
		int PREM_PERCENTAGE_ID)
		throws com.ifli.rapid.NoSuchPolicyPremPercentageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(PREM_PERCENTAGE_ID);
	}

	/**
	* Returns the policy prem percentage with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param PREM_PERCENTAGE_ID the primary key of the policy prem percentage
	* @return the policy prem percentage, or <code>null</code> if a policy prem percentage with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyPremPercentage fetchByPrimaryKey(
		int PREM_PERCENTAGE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(PREM_PERCENTAGE_ID);
	}

	/**
	* Returns all the policy prem percentages.
	*
	* @return the policy prem percentages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyPremPercentage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the policy prem percentages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremPercentageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy prem percentages
	* @param end the upper bound of the range of policy prem percentages (not inclusive)
	* @return the range of policy prem percentages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyPremPercentage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the policy prem percentages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremPercentageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy prem percentages
	* @param end the upper bound of the range of policy prem percentages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy prem percentages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyPremPercentage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the policy prem percentages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of policy prem percentages.
	*
	* @return the number of policy prem percentages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PolicyPremPercentagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PolicyPremPercentagePersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PolicyPremPercentagePersistence.class.getName());

			ReferenceRegistry.registerReference(PolicyPremPercentageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PolicyPremPercentagePersistence persistence) {
	}

	private static PolicyPremPercentagePersistence _persistence;
}