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

import com.ifli.rapid.model.POLICY_DOC_TYPES;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the p o l i c y_ d o c_ t y p e s service. This utility wraps {@link POLICY_DOC_TYPESPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPESPersistence
 * @see POLICY_DOC_TYPESPersistenceImpl
 * @generated
 */
public class POLICY_DOC_TYPESUtil {
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
	public static void clearCache(POLICY_DOC_TYPES policy_doc_types) {
		getPersistence().clearCache(policy_doc_types);
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
	public static List<POLICY_DOC_TYPES> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<POLICY_DOC_TYPES> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<POLICY_DOC_TYPES> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static POLICY_DOC_TYPES update(POLICY_DOC_TYPES policy_doc_types)
		throws SystemException {
		return getPersistence().update(policy_doc_types);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static POLICY_DOC_TYPES update(POLICY_DOC_TYPES policy_doc_types,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(policy_doc_types, serviceContext);
	}

	/**
	* Caches the p o l i c y_ d o c_ t y p e s in the entity cache if it is enabled.
	*
	* @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	*/
	public static void cacheResult(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types) {
		getPersistence().cacheResult(policy_doc_types);
	}

	/**
	* Caches the p o l i c y_ d o c_ t y p e ses in the entity cache if it is enabled.
	*
	* @param policy_doc_typeses the p o l i c y_ d o c_ t y p e ses
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> policy_doc_typeses) {
		getPersistence().cacheResult(policy_doc_typeses);
	}

	/**
	* Creates a new p o l i c y_ d o c_ t y p e s with the primary key. Does not add the p o l i c y_ d o c_ t y p e s to the database.
	*
	* @param ID the primary key for the new p o l i c y_ d o c_ t y p e s
	* @return the new p o l i c y_ d o c_ t y p e s
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES create(int ID) {
		return getPersistence().create(ID);
	}

	/**
	* Removes the p o l i c y_ d o c_ t y p e s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s that was removed
	* @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES remove(int ID)
		throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ID);
	}

	public static com.ifli.rapid.model.POLICY_DOC_TYPES updateImpl(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(policy_doc_types);
	}

	/**
	* Returns the p o l i c y_ d o c_ t y p e s with the primary key or throws a {@link com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException} if it could not be found.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s
	* @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES findByPrimaryKey(int ID)
		throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ID);
	}

	/**
	* Returns the p o l i c y_ d o c_ t y p e s with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	* @return the p o l i c y_ d o c_ t y p e s, or <code>null</code> if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.POLICY_DOC_TYPES fetchByPrimaryKey(
		int ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ID);
	}

	/**
	* Returns all the p o l i c y_ d o c_ t y p e ses.
	*
	* @return the p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the p o l i c y_ d o c_ t y p e ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	* @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	* @return the range of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the p o l i c y_ d o c_ t y p e ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	* @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.POLICY_DOC_TYPES> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the p o l i c y_ d o c_ t y p e ses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of p o l i c y_ d o c_ t y p e ses.
	*
	* @return the number of p o l i c y_ d o c_ t y p e ses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static POLICY_DOC_TYPESPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (POLICY_DOC_TYPESPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					POLICY_DOC_TYPESPersistence.class.getName());

			ReferenceRegistry.registerReference(POLICY_DOC_TYPESUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(POLICY_DOC_TYPESPersistence persistence) {
	}

	private static POLICY_DOC_TYPESPersistence _persistence;
}