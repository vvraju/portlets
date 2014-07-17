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

import com.ifli.rapid.model.BranchDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the branch details service. This utility wraps {@link BranchDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see BranchDetailsPersistence
 * @see BranchDetailsPersistenceImpl
 * @generated
 */
public class BranchDetailsUtil {
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
	public static void clearCache(BranchDetails branchDetails) {
		getPersistence().clearCache(branchDetails);
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
	public static List<BranchDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BranchDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BranchDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BranchDetails update(BranchDetails branchDetails)
		throws SystemException {
		return getPersistence().update(branchDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BranchDetails update(BranchDetails branchDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(branchDetails, serviceContext);
	}

	/**
	* Caches the branch details in the entity cache if it is enabled.
	*
	* @param branchDetails the branch details
	*/
	public static void cacheResult(
		com.ifli.rapid.model.BranchDetails branchDetails) {
		getPersistence().cacheResult(branchDetails);
	}

	/**
	* Caches the branch detailses in the entity cache if it is enabled.
	*
	* @param branchDetailses the branch detailses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.BranchDetails> branchDetailses) {
		getPersistence().cacheResult(branchDetailses);
	}

	/**
	* Creates a new branch details with the primary key. Does not add the branch details to the database.
	*
	* @param BRANCH_ID the primary key for the new branch details
	* @return the new branch details
	*/
	public static com.ifli.rapid.model.BranchDetails create(int BRANCH_ID) {
		return getPersistence().create(BRANCH_ID);
	}

	/**
	* Removes the branch details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param BRANCH_ID the primary key of the branch details
	* @return the branch details that was removed
	* @throws com.ifli.rapid.NoSuchBranchDetailsException if a branch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.BranchDetails remove(int BRANCH_ID)
		throws com.ifli.rapid.NoSuchBranchDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(BRANCH_ID);
	}

	public static com.ifli.rapid.model.BranchDetails updateImpl(
		com.ifli.rapid.model.BranchDetails branchDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(branchDetails);
	}

	/**
	* Returns the branch details with the primary key or throws a {@link com.ifli.rapid.NoSuchBranchDetailsException} if it could not be found.
	*
	* @param BRANCH_ID the primary key of the branch details
	* @return the branch details
	* @throws com.ifli.rapid.NoSuchBranchDetailsException if a branch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.BranchDetails findByPrimaryKey(
		int BRANCH_ID)
		throws com.ifli.rapid.NoSuchBranchDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(BRANCH_ID);
	}

	/**
	* Returns the branch details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param BRANCH_ID the primary key of the branch details
	* @return the branch details, or <code>null</code> if a branch details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.BranchDetails fetchByPrimaryKey(
		int BRANCH_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(BRANCH_ID);
	}

	/**
	* Returns all the branch detailses.
	*
	* @return the branch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.BranchDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the branch detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.BranchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branch detailses
	* @param end the upper bound of the range of branch detailses (not inclusive)
	* @return the range of branch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.BranchDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the branch detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.BranchDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branch detailses
	* @param end the upper bound of the range of branch detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of branch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.BranchDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the branch detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of branch detailses.
	*
	* @return the number of branch detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BranchDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BranchDetailsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					BranchDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(BranchDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BranchDetailsPersistence persistence) {
	}

	private static BranchDetailsPersistence _persistence;
}