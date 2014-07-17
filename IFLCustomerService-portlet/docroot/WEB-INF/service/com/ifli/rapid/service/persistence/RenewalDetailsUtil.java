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

import com.ifli.rapid.model.RenewalDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the renewal details service. This utility wraps {@link RenewalDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see RenewalDetailsPersistence
 * @see RenewalDetailsPersistenceImpl
 * @generated
 */
public class RenewalDetailsUtil {
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
	public static void clearCache(RenewalDetails renewalDetails) {
		getPersistence().clearCache(renewalDetails);
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
	public static List<RenewalDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RenewalDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RenewalDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RenewalDetails update(RenewalDetails renewalDetails)
		throws SystemException {
		return getPersistence().update(renewalDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RenewalDetails update(RenewalDetails renewalDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(renewalDetails, serviceContext);
	}

	/**
	* Caches the renewal details in the entity cache if it is enabled.
	*
	* @param renewalDetails the renewal details
	*/
	public static void cacheResult(
		com.ifli.rapid.model.RenewalDetails renewalDetails) {
		getPersistence().cacheResult(renewalDetails);
	}

	/**
	* Caches the renewal detailses in the entity cache if it is enabled.
	*
	* @param renewalDetailses the renewal detailses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.RenewalDetails> renewalDetailses) {
		getPersistence().cacheResult(renewalDetailses);
	}

	/**
	* Creates a new renewal details with the primary key. Does not add the renewal details to the database.
	*
	* @param POLICY_ID the primary key for the new renewal details
	* @return the new renewal details
	*/
	public static com.ifli.rapid.model.RenewalDetails create(long POLICY_ID) {
		return getPersistence().create(POLICY_ID);
	}

	/**
	* Removes the renewal details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details that was removed
	* @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RenewalDetails remove(long POLICY_ID)
		throws com.ifli.rapid.NoSuchRenewalDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(POLICY_ID);
	}

	public static com.ifli.rapid.model.RenewalDetails updateImpl(
		com.ifli.rapid.model.RenewalDetails renewalDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(renewalDetails);
	}

	/**
	* Returns the renewal details with the primary key or throws a {@link com.ifli.rapid.NoSuchRenewalDetailsException} if it could not be found.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details
	* @throws com.ifli.rapid.NoSuchRenewalDetailsException if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RenewalDetails findByPrimaryKey(
		long POLICY_ID)
		throws com.ifli.rapid.NoSuchRenewalDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(POLICY_ID);
	}

	/**
	* Returns the renewal details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param POLICY_ID the primary key of the renewal details
	* @return the renewal details, or <code>null</code> if a renewal details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RenewalDetails fetchByPrimaryKey(
		long POLICY_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(POLICY_ID);
	}

	/**
	* Returns all the renewal detailses.
	*
	* @return the renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RenewalDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the renewal detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of renewal detailses
	* @param end the upper bound of the range of renewal detailses (not inclusive)
	* @return the range of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RenewalDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the renewal detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RenewalDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of renewal detailses
	* @param end the upper bound of the range of renewal detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RenewalDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the renewal detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of renewal detailses.
	*
	* @return the number of renewal detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RenewalDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RenewalDetailsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					RenewalDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(RenewalDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RenewalDetailsPersistence persistence) {
	}

	private static RenewalDetailsPersistence _persistence;
}