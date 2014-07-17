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

import com.ifli.rapid.NoSuchQRCStatusException;
import com.ifli.rapid.model.QRCStatus;
import com.ifli.rapid.model.impl.QRCStatusImpl;
import com.ifli.rapid.model.impl.QRCStatusModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the q r c status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QRCStatusPersistence
 * @see QRCStatusUtil
 * @generated
 */
public class QRCStatusPersistenceImpl extends BasePersistenceImpl<QRCStatus>
	implements QRCStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QRCStatusUtil} to access the q r c status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QRCStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusModelImpl.FINDER_CACHE_ENABLED, QRCStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusModelImpl.FINDER_CACHE_ENABLED, QRCStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SR_ID = new FinderPath(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusModelImpl.FINDER_CACHE_ENABLED, QRCStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySR_ID",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SR_ID = new FinderPath(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusModelImpl.FINDER_CACHE_ENABLED, QRCStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySR_ID",
			new String[] { Integer.class.getName() },
			QRCStatusModelImpl.QRC_ASR_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SR_ID = new FinderPath(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySR_ID",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the q r c statuses where QRC_ASR_ID = &#63;.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @return the matching q r c statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCStatus> findBySR_ID(int QRC_ASR_ID)
		throws SystemException {
		return findBySR_ID(QRC_ASR_ID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<QRCStatus> findBySR_ID(int QRC_ASR_ID, int start, int end)
		throws SystemException {
		return findBySR_ID(QRC_ASR_ID, start, end, null);
	}

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
	@Override
	public List<QRCStatus> findBySR_ID(int QRC_ASR_ID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SR_ID;
			finderArgs = new Object[] { QRC_ASR_ID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SR_ID;
			finderArgs = new Object[] { QRC_ASR_ID, start, end, orderByComparator };
		}

		List<QRCStatus> list = (List<QRCStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QRCStatus qrcStatus : list) {
				if ((QRC_ASR_ID != qrcStatus.getQRC_ASR_ID())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_QRCSTATUS_WHERE);

			query.append(_FINDER_COLUMN_SR_ID_QRC_ASR_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QRCStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(QRC_ASR_ID);

				if (!pagination) {
					list = (List<QRCStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QRCStatus>(list);
				}
				else {
					list = (List<QRCStatus>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first q r c status in the ordered set where QRC_ASR_ID = &#63;.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching q r c status
	 * @throws com.ifli.rapid.NoSuchQRCStatusException if a matching q r c status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus findBySR_ID_First(int QRC_ASR_ID,
		OrderByComparator orderByComparator)
		throws NoSuchQRCStatusException, SystemException {
		QRCStatus qrcStatus = fetchBySR_ID_First(QRC_ASR_ID, orderByComparator);

		if (qrcStatus != null) {
			return qrcStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("QRC_ASR_ID=");
		msg.append(QRC_ASR_ID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQRCStatusException(msg.toString());
	}

	/**
	 * Returns the first q r c status in the ordered set where QRC_ASR_ID = &#63;.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching q r c status, or <code>null</code> if a matching q r c status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus fetchBySR_ID_First(int QRC_ASR_ID,
		OrderByComparator orderByComparator) throws SystemException {
		List<QRCStatus> list = findBySR_ID(QRC_ASR_ID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last q r c status in the ordered set where QRC_ASR_ID = &#63;.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching q r c status
	 * @throws com.ifli.rapid.NoSuchQRCStatusException if a matching q r c status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus findBySR_ID_Last(int QRC_ASR_ID,
		OrderByComparator orderByComparator)
		throws NoSuchQRCStatusException, SystemException {
		QRCStatus qrcStatus = fetchBySR_ID_Last(QRC_ASR_ID, orderByComparator);

		if (qrcStatus != null) {
			return qrcStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("QRC_ASR_ID=");
		msg.append(QRC_ASR_ID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQRCStatusException(msg.toString());
	}

	/**
	 * Returns the last q r c status in the ordered set where QRC_ASR_ID = &#63;.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching q r c status, or <code>null</code> if a matching q r c status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus fetchBySR_ID_Last(int QRC_ASR_ID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySR_ID(QRC_ASR_ID);

		if (count == 0) {
			return null;
		}

		List<QRCStatus> list = findBySR_ID(QRC_ASR_ID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public QRCStatus[] findBySR_ID_PrevAndNext(int QRC_STATUS_ID,
		int QRC_ASR_ID, OrderByComparator orderByComparator)
		throws NoSuchQRCStatusException, SystemException {
		QRCStatus qrcStatus = findByPrimaryKey(QRC_STATUS_ID);

		Session session = null;

		try {
			session = openSession();

			QRCStatus[] array = new QRCStatusImpl[3];

			array[0] = getBySR_ID_PrevAndNext(session, qrcStatus, QRC_ASR_ID,
					orderByComparator, true);

			array[1] = qrcStatus;

			array[2] = getBySR_ID_PrevAndNext(session, qrcStatus, QRC_ASR_ID,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected QRCStatus getBySR_ID_PrevAndNext(Session session,
		QRCStatus qrcStatus, int QRC_ASR_ID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QRCSTATUS_WHERE);

		query.append(_FINDER_COLUMN_SR_ID_QRC_ASR_ID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(QRCStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(QRC_ASR_ID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qrcStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QRCStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the q r c statuses where QRC_ASR_ID = &#63; from the database.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySR_ID(int QRC_ASR_ID) throws SystemException {
		for (QRCStatus qrcStatus : findBySR_ID(QRC_ASR_ID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(qrcStatus);
		}
	}

	/**
	 * Returns the number of q r c statuses where QRC_ASR_ID = &#63;.
	 *
	 * @param QRC_ASR_ID the q r c_ a s r_ i d
	 * @return the number of matching q r c statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySR_ID(int QRC_ASR_ID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SR_ID;

		Object[] finderArgs = new Object[] { QRC_ASR_ID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QRCSTATUS_WHERE);

			query.append(_FINDER_COLUMN_SR_ID_QRC_ASR_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(QRC_ASR_ID);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SR_ID_QRC_ASR_ID_2 = "qrcStatus.QRC_ASR_ID = ?";

	public QRCStatusPersistenceImpl() {
		setModelClass(QRCStatus.class);
	}

	/**
	 * Caches the q r c status in the entity cache if it is enabled.
	 *
	 * @param qrcStatus the q r c status
	 */
	@Override
	public void cacheResult(QRCStatus qrcStatus) {
		EntityCacheUtil.putResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusImpl.class, qrcStatus.getPrimaryKey(), qrcStatus);

		qrcStatus.resetOriginalValues();
	}

	/**
	 * Caches the q r c statuses in the entity cache if it is enabled.
	 *
	 * @param qrcStatuses the q r c statuses
	 */
	@Override
	public void cacheResult(List<QRCStatus> qrcStatuses) {
		for (QRCStatus qrcStatus : qrcStatuses) {
			if (EntityCacheUtil.getResult(
						QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
						QRCStatusImpl.class, qrcStatus.getPrimaryKey()) == null) {
				cacheResult(qrcStatus);
			}
			else {
				qrcStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q r c statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QRCStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QRCStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q r c status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QRCStatus qrcStatus) {
		EntityCacheUtil.removeResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusImpl.class, qrcStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QRCStatus> qrcStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QRCStatus qrcStatus : qrcStatuses) {
			EntityCacheUtil.removeResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
				QRCStatusImpl.class, qrcStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q r c status with the primary key. Does not add the q r c status to the database.
	 *
	 * @param QRC_STATUS_ID the primary key for the new q r c status
	 * @return the new q r c status
	 */
	@Override
	public QRCStatus create(int QRC_STATUS_ID) {
		QRCStatus qrcStatus = new QRCStatusImpl();

		qrcStatus.setNew(true);
		qrcStatus.setPrimaryKey(QRC_STATUS_ID);

		return qrcStatus;
	}

	/**
	 * Removes the q r c status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_STATUS_ID the primary key of the q r c status
	 * @return the q r c status that was removed
	 * @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus remove(int QRC_STATUS_ID)
		throws NoSuchQRCStatusException, SystemException {
		return remove((Serializable)QRC_STATUS_ID);
	}

	/**
	 * Removes the q r c status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q r c status
	 * @return the q r c status that was removed
	 * @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus remove(Serializable primaryKey)
		throws NoSuchQRCStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QRCStatus qrcStatus = (QRCStatus)session.get(QRCStatusImpl.class,
					primaryKey);

			if (qrcStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQRCStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcStatus);
		}
		catch (NoSuchQRCStatusException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected QRCStatus removeImpl(QRCStatus qrcStatus)
		throws SystemException {
		qrcStatus = toUnwrappedModel(qrcStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcStatus)) {
				qrcStatus = (QRCStatus)session.get(QRCStatusImpl.class,
						qrcStatus.getPrimaryKeyObj());
			}

			if (qrcStatus != null) {
				session.delete(qrcStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcStatus != null) {
			clearCache(qrcStatus);
		}

		return qrcStatus;
	}

	@Override
	public QRCStatus updateImpl(com.ifli.rapid.model.QRCStatus qrcStatus)
		throws SystemException {
		qrcStatus = toUnwrappedModel(qrcStatus);

		boolean isNew = qrcStatus.isNew();

		QRCStatusModelImpl qrcStatusModelImpl = (QRCStatusModelImpl)qrcStatus;

		Session session = null;

		try {
			session = openSession();

			if (qrcStatus.isNew()) {
				session.save(qrcStatus);

				qrcStatus.setNew(false);
			}
			else {
				session.merge(qrcStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QRCStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qrcStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SR_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qrcStatusModelImpl.getOriginalQRC_ASR_ID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SR_ID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SR_ID,
					args);

				args = new Object[] { qrcStatusModelImpl.getQRC_ASR_ID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SR_ID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SR_ID,
					args);
			}
		}

		EntityCacheUtil.putResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
			QRCStatusImpl.class, qrcStatus.getPrimaryKey(), qrcStatus);

		return qrcStatus;
	}

	protected QRCStatus toUnwrappedModel(QRCStatus qrcStatus) {
		if (qrcStatus instanceof QRCStatusImpl) {
			return qrcStatus;
		}

		QRCStatusImpl qrcStatusImpl = new QRCStatusImpl();

		qrcStatusImpl.setNew(qrcStatus.isNew());
		qrcStatusImpl.setPrimaryKey(qrcStatus.getPrimaryKey());

		qrcStatusImpl.setQRC_STATUS_ID(qrcStatus.getQRC_STATUS_ID());
		qrcStatusImpl.setSTATUS_DESC(qrcStatus.getSTATUS_DESC());
		qrcStatusImpl.setACTIVE_FLAG(qrcStatus.getACTIVE_FLAG());
		qrcStatusImpl.setINSERTED_DATE(qrcStatus.getINSERTED_DATE());
		qrcStatusImpl.setINSERTED_BY(qrcStatus.getINSERTED_BY());
		qrcStatusImpl.setUPDATED_DATE(qrcStatus.getUPDATED_DATE());
		qrcStatusImpl.setUPDATED_BY(qrcStatus.getUPDATED_BY());
		qrcStatusImpl.setDELETED_DATE(qrcStatus.getDELETED_DATE());
		qrcStatusImpl.setDELETED_BY(qrcStatus.getDELETED_BY());
		qrcStatusImpl.setQRC_ASR_ID(qrcStatus.getQRC_ASR_ID());

		return qrcStatusImpl;
	}

	/**
	 * Returns the q r c status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c status
	 * @return the q r c status
	 * @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQRCStatusException, SystemException {
		QRCStatus qrcStatus = fetchByPrimaryKey(primaryKey);

		if (qrcStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQRCStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcStatus;
	}

	/**
	 * Returns the q r c status with the primary key or throws a {@link com.ifli.rapid.NoSuchQRCStatusException} if it could not be found.
	 *
	 * @param QRC_STATUS_ID the primary key of the q r c status
	 * @return the q r c status
	 * @throws com.ifli.rapid.NoSuchQRCStatusException if a q r c status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus findByPrimaryKey(int QRC_STATUS_ID)
		throws NoSuchQRCStatusException, SystemException {
		return findByPrimaryKey((Serializable)QRC_STATUS_ID);
	}

	/**
	 * Returns the q r c status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q r c status
	 * @return the q r c status, or <code>null</code> if a q r c status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QRCStatus qrcStatus = (QRCStatus)EntityCacheUtil.getResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
				QRCStatusImpl.class, primaryKey);

		if (qrcStatus == _nullQRCStatus) {
			return null;
		}

		if (qrcStatus == null) {
			Session session = null;

			try {
				session = openSession();

				qrcStatus = (QRCStatus)session.get(QRCStatusImpl.class,
						primaryKey);

				if (qrcStatus != null) {
					cacheResult(qrcStatus);
				}
				else {
					EntityCacheUtil.putResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
						QRCStatusImpl.class, primaryKey, _nullQRCStatus);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QRCStatusModelImpl.ENTITY_CACHE_ENABLED,
					QRCStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcStatus;
	}

	/**
	 * Returns the q r c status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_STATUS_ID the primary key of the q r c status
	 * @return the q r c status, or <code>null</code> if a q r c status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCStatus fetchByPrimaryKey(int QRC_STATUS_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_STATUS_ID);
	}

	/**
	 * Returns all the q r c statuses.
	 *
	 * @return the q r c statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<QRCStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<QRCStatus> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<QRCStatus> list = (List<QRCStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCSTATUS;

				if (pagination) {
					sql = sql.concat(QRCStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QRCStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QRCStatus>(list);
				}
				else {
					list = (List<QRCStatus>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the q r c statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QRCStatus qrcStatus : findAll()) {
			remove(qrcStatus);
		}
	}

	/**
	 * Returns the number of q r c statuses.
	 *
	 * @return the number of q r c statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_QRCSTATUS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the q r c status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.QRCStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QRCStatus>> listenersList = new ArrayList<ModelListener<QRCStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QRCStatus>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(QRCStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCSTATUS = "SELECT qrcStatus FROM QRCStatus qrcStatus";
	private static final String _SQL_SELECT_QRCSTATUS_WHERE = "SELECT qrcStatus FROM QRCStatus qrcStatus WHERE ";
	private static final String _SQL_COUNT_QRCSTATUS = "SELECT COUNT(qrcStatus) FROM QRCStatus qrcStatus";
	private static final String _SQL_COUNT_QRCSTATUS_WHERE = "SELECT COUNT(qrcStatus) FROM QRCStatus qrcStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QRCStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QRCStatus exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QRCStatusPersistenceImpl.class);
	private static QRCStatus _nullQRCStatus = new QRCStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QRCStatus> toCacheModel() {
				return _nullQRCStatusCacheModel;
			}
		};

	private static CacheModel<QRCStatus> _nullQRCStatusCacheModel = new CacheModel<QRCStatus>() {
			@Override
			public QRCStatus toEntityModel() {
				return _nullQRCStatus;
			}
		};
}