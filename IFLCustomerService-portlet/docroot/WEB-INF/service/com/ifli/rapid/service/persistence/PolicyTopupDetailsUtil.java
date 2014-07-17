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

import com.ifli.rapid.model.PolicyTopupDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the policy topup details service. This utility wraps {@link PolicyTopupDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyTopupDetailsPersistence
 * @see PolicyTopupDetailsPersistenceImpl
 * @generated
 */
public class PolicyTopupDetailsUtil {
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
	public static void clearCache(PolicyTopupDetails policyTopupDetails) {
		getPersistence().clearCache(policyTopupDetails);
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
	public static List<PolicyTopupDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PolicyTopupDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PolicyTopupDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PolicyTopupDetails update(
		PolicyTopupDetails policyTopupDetails) throws SystemException {
		return getPersistence().update(policyTopupDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PolicyTopupDetails update(
		PolicyTopupDetails policyTopupDetails, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(policyTopupDetails, serviceContext);
	}

	/**
	* Caches the policy topup details in the entity cache if it is enabled.
	*
	* @param policyTopupDetails the policy topup details
	*/
	public static void cacheResult(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails) {
		getPersistence().cacheResult(policyTopupDetails);
	}

	/**
	* Caches the policy topup detailses in the entity cache if it is enabled.
	*
	* @param policyTopupDetailses the policy topup detailses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.PolicyTopupDetails> policyTopupDetailses) {
		getPersistence().cacheResult(policyTopupDetailses);
	}

	/**
	* Creates a new policy topup details with the primary key. Does not add the policy topup details to the database.
	*
	* @param TOPUP_ID the primary key for the new policy topup details
	* @return the new policy topup details
	*/
	public static com.ifli.rapid.model.PolicyTopupDetails create(int TOPUP_ID) {
		return getPersistence().create(TOPUP_ID);
	}

	/**
	* Removes the policy topup details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details that was removed
	* @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyTopupDetails remove(int TOPUP_ID)
		throws com.ifli.rapid.NoSuchPolicyTopupDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(TOPUP_ID);
	}

	public static com.ifli.rapid.model.PolicyTopupDetails updateImpl(
		com.ifli.rapid.model.PolicyTopupDetails policyTopupDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(policyTopupDetails);
	}

	/**
	* Returns the policy topup details with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyTopupDetailsException} if it could not be found.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details
	* @throws com.ifli.rapid.NoSuchPolicyTopupDetailsException if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyTopupDetails findByPrimaryKey(
		int TOPUP_ID)
		throws com.ifli.rapid.NoSuchPolicyTopupDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(TOPUP_ID);
	}

	/**
	* Returns the policy topup details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param TOPUP_ID the primary key of the policy topup details
	* @return the policy topup details, or <code>null</code> if a policy topup details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.PolicyTopupDetails fetchByPrimaryKey(
		int TOPUP_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(TOPUP_ID);
	}

	/**
	* Returns all the policy topup detailses.
	*
	* @return the policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyTopupDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the policy topup detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy topup detailses
	* @param end the upper bound of the range of policy topup detailses (not inclusive)
	* @return the range of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyTopupDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the policy topup detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyTopupDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of policy topup detailses
	* @param end the upper bound of the range of policy topup detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.PolicyTopupDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the policy topup detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of policy topup detailses.
	*
	* @return the number of policy topup detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PolicyTopupDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PolicyTopupDetailsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					PolicyTopupDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(PolicyTopupDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PolicyTopupDetailsPersistence persistence) {
	}

	private static PolicyTopupDetailsPersistence _persistence;
}