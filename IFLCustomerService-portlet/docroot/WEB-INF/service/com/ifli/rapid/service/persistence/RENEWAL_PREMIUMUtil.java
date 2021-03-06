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

import com.ifli.rapid.model.RENEWAL_PREMIUM;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the r e n e w a l_ p r e m i u m service. This utility wraps {@link RENEWAL_PREMIUMPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUMPersistence
 * @see RENEWAL_PREMIUMPersistenceImpl
 * @generated
 */
public class RENEWAL_PREMIUMUtil {
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
	public static void clearCache(RENEWAL_PREMIUM renewal_premium) {
		getPersistence().clearCache(renewal_premium);
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
	public static List<RENEWAL_PREMIUM> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RENEWAL_PREMIUM> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RENEWAL_PREMIUM> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RENEWAL_PREMIUM update(RENEWAL_PREMIUM renewal_premium)
		throws SystemException {
		return getPersistence().update(renewal_premium);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RENEWAL_PREMIUM update(RENEWAL_PREMIUM renewal_premium,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(renewal_premium, serviceContext);
	}

	/**
	* Returns all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @return the matching r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndReceipt_Date(ContrNo, Receipt_Date);
	}

	/**
	* Returns a range of all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param start the lower bound of the range of r e n e w a l_ p r e m i u ms
	* @param end the upper bound of the range of r e n e w a l_ p r e m i u ms (not inclusive)
	* @return the range of matching r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndReceipt_Date(ContrNo, Receipt_Date, start,
			end);
	}

	/**
	* Returns an ordered range of all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param start the lower bound of the range of r e n e w a l_ p r e m i u ms
	* @param end the upper bound of the range of r e n e w a l_ p r e m i u ms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndReceipt_Date(ContrNo, Receipt_Date, start,
			end, orderByComparator);
	}

	/**
	* Returns the first r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r e n e w a l_ p r e m i u m
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a matching r e n e w a l_ p r e m i u m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM findByPolicyAndReceipt_Date_First(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndReceipt_Date_First(ContrNo, Receipt_Date,
			orderByComparator);
	}

	/**
	* Returns the first r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r e n e w a l_ p r e m i u m, or <code>null</code> if a matching r e n e w a l_ p r e m i u m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM fetchByPolicyAndReceipt_Date_First(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPolicyAndReceipt_Date_First(ContrNo, Receipt_Date,
			orderByComparator);
	}

	/**
	* Returns the last r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r e n e w a l_ p r e m i u m
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a matching r e n e w a l_ p r e m i u m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM findByPolicyAndReceipt_Date_Last(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndReceipt_Date_Last(ContrNo, Receipt_Date,
			orderByComparator);
	}

	/**
	* Returns the last r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r e n e w a l_ p r e m i u m, or <code>null</code> if a matching r e n e w a l_ p r e m i u m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM fetchByPolicyAndReceipt_Date_Last(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPolicyAndReceipt_Date_Last(ContrNo, Receipt_Date,
			orderByComparator);
	}

	/**
	* Returns the r e n e w a l_ p r e m i u ms before and after the current r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ID_old the primary key of the current r e n e w a l_ p r e m i u m
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next r e n e w a l_ p r e m i u m
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM[] findByPolicyAndReceipt_Date_PrevAndNext(
		long ID_old, java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPolicyAndReceipt_Date_PrevAndNext(ID_old, ContrNo,
			Receipt_Date, orderByComparator);
	}

	/**
	* Removes all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63; from the database.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPolicyAndReceipt_Date(java.lang.String ContrNo,
		java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPolicyAndReceipt_Date(ContrNo, Receipt_Date);
	}

	/**
	* Returns the number of r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @return the number of matching r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPolicyAndReceipt_Date(java.lang.String ContrNo,
		java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPolicyAndReceipt_Date(ContrNo, Receipt_Date);
	}

	/**
	* Caches the r e n e w a l_ p r e m i u m in the entity cache if it is enabled.
	*
	* @param renewal_premium the r e n e w a l_ p r e m i u m
	*/
	public static void cacheResult(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium) {
		getPersistence().cacheResult(renewal_premium);
	}

	/**
	* Caches the r e n e w a l_ p r e m i u ms in the entity cache if it is enabled.
	*
	* @param renewal_premiums the r e n e w a l_ p r e m i u ms
	*/
	public static void cacheResult(
		java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> renewal_premiums) {
		getPersistence().cacheResult(renewal_premiums);
	}

	/**
	* Creates a new r e n e w a l_ p r e m i u m with the primary key. Does not add the r e n e w a l_ p r e m i u m to the database.
	*
	* @param ID_old the primary key for the new r e n e w a l_ p r e m i u m
	* @return the new r e n e w a l_ p r e m i u m
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM create(long ID_old) {
		return getPersistence().create(ID_old);
	}

	/**
	* Removes the r e n e w a l_ p r e m i u m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m that was removed
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM remove(long ID_old)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ID_old);
	}

	public static com.ifli.rapid.model.RENEWAL_PREMIUM updateImpl(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(renewal_premium);
	}

	/**
	* Returns the r e n e w a l_ p r e m i u m with the primary key or throws a {@link com.ifli.rapid.NoSuchRENEWAL_PREMIUMException} if it could not be found.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM findByPrimaryKey(
		long ID_old)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ID_old);
	}

	/**
	* Returns the r e n e w a l_ p r e m i u m with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m, or <code>null</code> if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ifli.rapid.model.RENEWAL_PREMIUM fetchByPrimaryKey(
		long ID_old) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ID_old);
	}

	/**
	* Returns all the r e n e w a l_ p r e m i u ms.
	*
	* @return the r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the r e n e w a l_ p r e m i u ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r e n e w a l_ p r e m i u ms
	* @param end the upper bound of the range of r e n e w a l_ p r e m i u ms (not inclusive)
	* @return the range of r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the r e n e w a l_ p r e m i u ms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of r e n e w a l_ p r e m i u ms
	* @param end the upper bound of the range of r e n e w a l_ p r e m i u ms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the r e n e w a l_ p r e m i u ms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of r e n e w a l_ p r e m i u ms.
	*
	* @return the number of r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RENEWAL_PREMIUMPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RENEWAL_PREMIUMPersistence)PortletBeanLocatorUtil.locate(com.ifli.rapid.service.ClpSerializer.getServletContextName(),
					RENEWAL_PREMIUMPersistence.class.getName());

			ReferenceRegistry.registerReference(RENEWAL_PREMIUMUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RENEWAL_PREMIUMPersistence persistence) {
	}

	private static RENEWAL_PREMIUMPersistence _persistence;
}