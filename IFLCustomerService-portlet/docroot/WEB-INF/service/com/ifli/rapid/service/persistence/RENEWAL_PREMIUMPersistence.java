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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the r e n e w a l_ p r e m i u m service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUMPersistenceImpl
 * @see RENEWAL_PREMIUMUtil
 * @generated
 */
public interface RENEWAL_PREMIUMPersistence extends BasePersistence<RENEWAL_PREMIUM> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RENEWAL_PREMIUMUtil} to access the r e n e w a l_ p r e m i u m persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @return the matching r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(
		java.lang.String ContrNo, java.lang.String Receipt_Date, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ifli.rapid.model.RENEWAL_PREMIUM findByPolicyAndReceipt_Date_First(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching r e n e w a l_ p r e m i u m, or <code>null</code> if a matching r e n e w a l_ p r e m i u m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RENEWAL_PREMIUM fetchByPolicyAndReceipt_Date_First(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ifli.rapid.model.RENEWAL_PREMIUM findByPolicyAndReceipt_Date_Last(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching r e n e w a l_ p r e m i u m, or <code>null</code> if a matching r e n e w a l_ p r e m i u m could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RENEWAL_PREMIUM fetchByPolicyAndReceipt_Date_Last(
		java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ifli.rapid.model.RENEWAL_PREMIUM[] findByPolicyAndReceipt_Date_PrevAndNext(
		long ID_old, java.lang.String ContrNo, java.lang.String Receipt_Date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63; from the database.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPolicyAndReceipt_Date(java.lang.String ContrNo,
		java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	*
	* @param ContrNo the contr no
	* @param Receipt_Date the receipt_ date
	* @return the number of matching r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public int countByPolicyAndReceipt_Date(java.lang.String ContrNo,
		java.lang.String Receipt_Date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the r e n e w a l_ p r e m i u m in the entity cache if it is enabled.
	*
	* @param renewal_premium the r e n e w a l_ p r e m i u m
	*/
	public void cacheResult(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium);

	/**
	* Caches the r e n e w a l_ p r e m i u ms in the entity cache if it is enabled.
	*
	* @param renewal_premiums the r e n e w a l_ p r e m i u ms
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> renewal_premiums);

	/**
	* Creates a new r e n e w a l_ p r e m i u m with the primary key. Does not add the r e n e w a l_ p r e m i u m to the database.
	*
	* @param ID_old the primary key for the new r e n e w a l_ p r e m i u m
	* @return the new r e n e w a l_ p r e m i u m
	*/
	public com.ifli.rapid.model.RENEWAL_PREMIUM create(long ID_old);

	/**
	* Removes the r e n e w a l_ p r e m i u m with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m that was removed
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RENEWAL_PREMIUM remove(long ID_old)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.RENEWAL_PREMIUM updateImpl(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the r e n e w a l_ p r e m i u m with the primary key or throws a {@link com.ifli.rapid.NoSuchRENEWAL_PREMIUMException} if it could not be found.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m
	* @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RENEWAL_PREMIUM findByPrimaryKey(long ID_old)
		throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the r e n e w a l_ p r e m i u m with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	* @return the r e n e w a l_ p r e m i u m, or <code>null</code> if a r e n e w a l_ p r e m i u m with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.RENEWAL_PREMIUM fetchByPrimaryKey(long ID_old)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the r e n e w a l_ p r e m i u ms.
	*
	* @return the r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ifli.rapid.model.RENEWAL_PREMIUM> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the r e n e w a l_ p r e m i u ms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of r e n e w a l_ p r e m i u ms.
	*
	* @return the number of r e n e w a l_ p r e m i u ms
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}