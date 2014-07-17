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

import com.ifli.rapid.model.OfficeDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the office details service. This utility wraps {@link OfficeDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see OfficeDetailsPersistence
 * @see OfficeDetailsPersistenceImpl
 * @generated
 */
public class OfficeDetailsUtil {
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
	public static void clearCache(OfficeDetails officeDetails) {
		getPersistence().clearCache(officeDetails);
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
	public static List<OfficeDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OfficeDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OfficeDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OfficeDetails update(OfficeDetails officeDetails)
		throws SystemException {
		return getPersistence().update(officeDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OfficeDetails update(OfficeDetails officeDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(officeDetails, serviceContext);
	}

	/**
	* Caches the office details in the entity cache if it is enabled.
	*
	* @param officeDetails the office details
	*/
	public static void cacheResult(
		com.ifli.rapid.model.OfficeDetails officeDetails) {
		getPersistence().cacheResult(officeDetails);
	}

	/**
	* Caches the office detailses in the entity cache if it is enabled.
	*
	* @param officeDetailses the office detailses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.OfficeDetails> officeDetailses) {
		getPersistence().cacheResult(officeDetailses);
	}

	/**
	* Creates a new office details with the primary key. Does not add the office details to the database.
	*
	* @param OFFICE_ID the primary key for the new office details
	* @return the new office details
	*/
	public static com.ifli.rapid.model.OfficeDetails create(int OFFICE_ID) {
		return getPersistence().create(OFFICE_ID);
	}

	/**
	* Removes the office details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OFFICE_ID the primary key of the office details
	* @return the office details that was removed
	* @throws com.ifli.rapid.NoSuchOfficeDetailsException if a office details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.OfficeDetails remove(int OFFICE_ID)
		throws com.ifli.rapid.NoSuchOfficeDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(OFFICE_ID);
	}

	public static com.ifli.rapid.model.OfficeDetails updateImpl(
		com.ifli.rapid.model.OfficeDetails officeDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(officeDetails);
	}

	/**
	* Returns the office details with the primary key or throws a {@link com.ifli.rapid.NoSuchOfficeDetailsException} if it could not be found.
	*
	* @param OFFICE_ID the primary key of the office details
	* @return the office details
	* @throws com.ifli.rapid.NoSuchOfficeDetailsException if a office details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.OfficeDetails findByPrimaryKey(
		int OFFICE_ID)
		throws com.ifli.rapid.NoSuchOfficeDetailsException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(OFFICE_ID);
	}

	/**
	* Returns the office details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param OFFICE_ID the primary key of the office details
	* @return the office details, or <code>null</code> if a office details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.OfficeDetails fetchByPrimaryKey(
		int OFFICE_ID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(OFFICE_ID);
	}

	/**
	* Returns all the office detailses.
	*
	* @return the office detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.OfficeDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the office detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.OfficeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of office detailses
	* @param end the upper bound of the range of office detailses (not inclusive)
	* @return the range of office detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.OfficeDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the office detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.OfficeDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of office detailses
	* @param end the upper bound of the range of office detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of office detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.OfficeDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the office detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of office detailses.
	*
	* @return the number of office detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OfficeDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OfficeDetailsPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					OfficeDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(OfficeDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OfficeDetailsPersistence persistence) {
	}

	private static OfficeDetailsPersistence _persistence;
}