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

import com.ifli.rapid.model.QRCStatus;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the q r c status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCStatusPersistenceImpl
 * @see QRCStatusUtil
 * @generated
 */
public interface QRCStatusPersistence extends BasePersistence<QRCStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QRCStatusUtil} to access the q r c status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the q r c statuses where QRC_ASR_ID = &#63;.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @return the matching q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCStatus> findBySR_ID(
		int QRC_ASR_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q r c statuses where QRC_ASR_ID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param start the lower bound of the range of q r c statuses
	* @param end the upper bound of the range of q r c statuses (not inclusive)
	* @return the range of matching q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCStatus> findBySR_ID(
		int QRC_ASR_ID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q r c statuses where QRC_ASR_ID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param start the lower bound of the range of q r c statuses
	* @param end the upper bound of the range of q r c statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCStatus> findBySR_ID(
		int QRC_ASR_ID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first q r c status in the ordered set where QRC_ASR_ID = &#63;.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching q r c status
	* @throws com.ifli.rapid.NoSuchQRCStatusException if a matching q r c status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus findBySR_ID_First(int QRC_ASR_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchQRCStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first q r c status in the ordered set where QRC_ASR_ID = &#63;.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching q r c status, or <code>null</code> if a matching q r c status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus fetchBySR_ID_First(int QRC_ASR_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last q r c status in the ordered set where QRC_ASR_ID = &#63;.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching q r c status
	* @throws com.ifli.rapid.NoSuchQRCStatusException if a matching q r c status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus findBySR_ID_Last(int QRC_ASR_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchQRCStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last q r c status in the ordered set where QRC_ASR_ID = &#63;.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching q r c status, or <code>null</code> if a matching q r c status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus fetchBySR_ID_Last(int QRC_ASR_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q r c statuses before and after the current q r c status in the ordered set where QRC_ASR_ID = &#63;.
	*
	* @param QRC_STATUS_ID the primary key of the current q r c status
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next q r c status
	* @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus[] findBySR_ID_PrevAndNext(
		int QRC_STATUS_ID, int QRC_ASR_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ifli.rapid.NoSuchQRCStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q r c statuses where QRC_ASR_ID = &#63; from the database.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySR_ID(int QRC_ASR_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q r c statuses where QRC_ASR_ID = &#63;.
	*
	* @param QRC_ASR_ID the q r c_ a s r_ i d
	* @return the number of matching q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countBySR_ID(int QRC_ASR_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the q r c status in the entity cache if it is enabled.
	*
	* @param qrcStatus the q r c status
	*/
	public void cacheResult(com.ifli.rapid.model.QRCStatus qrcStatus);

	/**
	* Caches the q r c statuses in the entity cache if it is enabled.
	*
	* @param qrcStatuses the q r c statuses
	*/
	public void cacheResult(
		java.util.List<com.ifli.rapid.model.QRCStatus> qrcStatuses);

	/**
	* Creates a new q r c status with the primary key. Does not add the q r c status to the database.
	*
	* @param QRC_STATUS_ID the primary key for the new q r c status
	* @return the new q r c status
	*/
	public com.ifli.rapid.model.QRCStatus create(int QRC_STATUS_ID);

	/**
	* Removes the q r c status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param QRC_STATUS_ID the primary key of the q r c status
	* @return the q r c status that was removed
	* @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus remove(int QRC_STATUS_ID)
		throws com.ifli.rapid.NoSuchQRCStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ifli.rapid.model.QRCStatus updateImpl(
		com.ifli.rapid.model.QRCStatus qrcStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q r c status with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCStatusException} if it could not be found.
	*
	* @param QRC_STATUS_ID the primary key of the q r c status
	* @return the q r c status
	* @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus findByPrimaryKey(int QRC_STATUS_ID)
		throws com.ifli.rapid.NoSuchQRCStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the q r c status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param QRC_STATUS_ID the primary key of the q r c status
	* @return the q r c status, or <code>null</code> if a q r c status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ifli.rapid.model.QRCStatus fetchByPrimaryKey(int QRC_STATUS_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the q r c statuses.
	*
	* @return the q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the q r c statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c statuses
	* @param end the upper bound of the range of q r c statuses (not inclusive)
	* @return the range of q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCStatus> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the q r c statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q r c statuses
	* @param end the upper bound of the range of q r c statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ifli.rapid.model.QRCStatus> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the q r c statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of q r c statuses.
	*
	* @return the number of q r c statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}