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

import com.ifli.rapid.NoSuchRENEWAL_PREMIUMException;
import com.ifli.rapid.model.RENEWAL_PREMIUM;
import com.ifli.rapid.model.impl.RENEWAL_PREMIUMImpl;
import com.ifli.rapid.model.impl.RENEWAL_PREMIUMModelImpl;

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
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the r e n e w a l_ p r e m i u m service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see RENEWAL_PREMIUMPersistence
 * @see RENEWAL_PREMIUMUtil
 * @generated
 */
public class RENEWAL_PREMIUMPersistenceImpl extends BasePersistenceImpl<RENEWAL_PREMIUM>
	implements RENEWAL_PREMIUMPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RENEWAL_PREMIUMUtil} to access the r e n e w a l_ p r e m i u m persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RENEWAL_PREMIUMImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMModelImpl.FINDER_CACHE_ENABLED,
			RENEWAL_PREMIUMImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMModelImpl.FINDER_CACHE_ENABLED,
			RENEWAL_PREMIUMImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POLICYANDRECEIPT_DATE =
		new FinderPath(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMModelImpl.FINDER_CACHE_ENABLED,
			RENEWAL_PREMIUMImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPolicyAndReceipt_Date",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_POLICYANDRECEIPT_DATE =
		new FinderPath(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByPolicyAndReceipt_Date",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Receipt_Date the receipt_ date
	 * @return the matching r e n e w a l_ p r e m i u ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(String ContrNo,
		String Receipt_Date) throws SystemException {
		return findByPolicyAndReceipt_Date(ContrNo, Receipt_Date,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(String ContrNo,
		String Receipt_Date, int start, int end) throws SystemException {
		return findByPolicyAndReceipt_Date(ContrNo, Receipt_Date, start, end,
			null);
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
	@Override
	public List<RENEWAL_PREMIUM> findByPolicyAndReceipt_Date(String ContrNo,
		String Receipt_Date, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POLICYANDRECEIPT_DATE;
		finderArgs = new Object[] {
				ContrNo, Receipt_Date,
				
				start, end, orderByComparator
			};

		List<RENEWAL_PREMIUM> list = (List<RENEWAL_PREMIUM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RENEWAL_PREMIUM renewal_premium : list) {
				if (!Validator.equals(ContrNo, renewal_premium.getContrNo()) ||
						!StringUtil.wildcardMatches(
							renewal_premium.getReceipt_Date(), Receipt_Date,
							CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true)) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_RENEWAL_PREMIUM_WHERE);

			boolean bindContrNo = false;

			if (ContrNo == null) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_1);
			}
			else if (ContrNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_3);
			}
			else {
				bindContrNo = true;

				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_2);
			}

			boolean bindReceipt_Date = false;

			if (Receipt_Date == null) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_1);
			}
			else if (Receipt_Date.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_3);
			}
			else {
				bindReceipt_Date = true;

				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RENEWAL_PREMIUMModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContrNo) {
					qPos.add(ContrNo);
				}

				if (bindReceipt_Date) {
					qPos.add(Receipt_Date);
				}

				if (!pagination) {
					list = (List<RENEWAL_PREMIUM>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RENEWAL_PREMIUM>(list);
				}
				else {
					list = (List<RENEWAL_PREMIUM>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first r e n e w a l_ p r e m i u m in the ordered set where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Receipt_Date the receipt_ date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching r e n e w a l_ p r e m i u m
	 * @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a matching r e n e w a l_ p r e m i u m could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM findByPolicyAndReceipt_Date_First(String ContrNo,
		String Receipt_Date, OrderByComparator orderByComparator)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		RENEWAL_PREMIUM renewal_premium = fetchByPolicyAndReceipt_Date_First(ContrNo,
				Receipt_Date, orderByComparator);

		if (renewal_premium != null) {
			return renewal_premium;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ContrNo=");
		msg.append(ContrNo);

		msg.append(", Receipt_Date=");
		msg.append(Receipt_Date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRENEWAL_PREMIUMException(msg.toString());
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
	@Override
	public RENEWAL_PREMIUM fetchByPolicyAndReceipt_Date_First(String ContrNo,
		String Receipt_Date, OrderByComparator orderByComparator)
		throws SystemException {
		List<RENEWAL_PREMIUM> list = findByPolicyAndReceipt_Date(ContrNo,
				Receipt_Date, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public RENEWAL_PREMIUM findByPolicyAndReceipt_Date_Last(String ContrNo,
		String Receipt_Date, OrderByComparator orderByComparator)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		RENEWAL_PREMIUM renewal_premium = fetchByPolicyAndReceipt_Date_Last(ContrNo,
				Receipt_Date, orderByComparator);

		if (renewal_premium != null) {
			return renewal_premium;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ContrNo=");
		msg.append(ContrNo);

		msg.append(", Receipt_Date=");
		msg.append(Receipt_Date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRENEWAL_PREMIUMException(msg.toString());
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
	@Override
	public RENEWAL_PREMIUM fetchByPolicyAndReceipt_Date_Last(String ContrNo,
		String Receipt_Date, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPolicyAndReceipt_Date(ContrNo, Receipt_Date);

		if (count == 0) {
			return null;
		}

		List<RENEWAL_PREMIUM> list = findByPolicyAndReceipt_Date(ContrNo,
				Receipt_Date, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public RENEWAL_PREMIUM[] findByPolicyAndReceipt_Date_PrevAndNext(
		long ID_old, String ContrNo, String Receipt_Date,
		OrderByComparator orderByComparator)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		RENEWAL_PREMIUM renewal_premium = findByPrimaryKey(ID_old);

		Session session = null;

		try {
			session = openSession();

			RENEWAL_PREMIUM[] array = new RENEWAL_PREMIUMImpl[3];

			array[0] = getByPolicyAndReceipt_Date_PrevAndNext(session,
					renewal_premium, ContrNo, Receipt_Date, orderByComparator,
					true);

			array[1] = renewal_premium;

			array[2] = getByPolicyAndReceipt_Date_PrevAndNext(session,
					renewal_premium, ContrNo, Receipt_Date, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RENEWAL_PREMIUM getByPolicyAndReceipt_Date_PrevAndNext(
		Session session, RENEWAL_PREMIUM renewal_premium, String ContrNo,
		String Receipt_Date, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RENEWAL_PREMIUM_WHERE);

		boolean bindContrNo = false;

		if (ContrNo == null) {
			query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_1);
		}
		else if (ContrNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_3);
		}
		else {
			bindContrNo = true;

			query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_2);
		}

		boolean bindReceipt_Date = false;

		if (Receipt_Date == null) {
			query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_1);
		}
		else if (Receipt_Date.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_3);
		}
		else {
			bindReceipt_Date = true;

			query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_2);
		}

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
			query.append(RENEWAL_PREMIUMModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindContrNo) {
			qPos.add(ContrNo);
		}

		if (bindReceipt_Date) {
			qPos.add(Receipt_Date);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(renewal_premium);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RENEWAL_PREMIUM> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63; from the database.
	 *
	 * @param ContrNo the contr no
	 * @param Receipt_Date the receipt_ date
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPolicyAndReceipt_Date(String ContrNo,
		String Receipt_Date) throws SystemException {
		for (RENEWAL_PREMIUM renewal_premium : findByPolicyAndReceipt_Date(
				ContrNo, Receipt_Date, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(renewal_premium);
		}
	}

	/**
	 * Returns the number of r e n e w a l_ p r e m i u ms where ContrNo = &#63; and Receipt_Date LIKE &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Receipt_Date the receipt_ date
	 * @return the number of matching r e n e w a l_ p r e m i u ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPolicyAndReceipt_Date(String ContrNo, String Receipt_Date)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_POLICYANDRECEIPT_DATE;

		Object[] finderArgs = new Object[] { ContrNo, Receipt_Date };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RENEWAL_PREMIUM_WHERE);

			boolean bindContrNo = false;

			if (ContrNo == null) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_1);
			}
			else if (ContrNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_3);
			}
			else {
				bindContrNo = true;

				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_2);
			}

			boolean bindReceipt_Date = false;

			if (Receipt_Date == null) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_1);
			}
			else if (Receipt_Date.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_3);
			}
			else {
				bindReceipt_Date = true;

				query.append(_FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContrNo) {
					qPos.add(ContrNo);
				}

				if (bindReceipt_Date) {
					qPos.add(Receipt_Date);
				}

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

	private static final String _FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_1 = "renewal_premium.ContrNo IS NULL AND ";
	private static final String _FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_2 = "renewal_premium.ContrNo = ? AND ";
	private static final String _FINDER_COLUMN_POLICYANDRECEIPT_DATE_CONTRNO_3 = "(renewal_premium.ContrNo IS NULL OR renewal_premium.ContrNo = '') AND ";
	private static final String _FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_1 =
		"renewal_premium.Receipt_Date LIKE NULL";
	private static final String _FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_2 =
		"renewal_premium.Receipt_Date LIKE ?";
	private static final String _FINDER_COLUMN_POLICYANDRECEIPT_DATE_RECEIPT_DATE_3 =
		"(renewal_premium.Receipt_Date IS NULL OR renewal_premium.Receipt_Date LIKE '')";

	public RENEWAL_PREMIUMPersistenceImpl() {
		setModelClass(RENEWAL_PREMIUM.class);
	}

	/**
	 * Caches the r e n e w a l_ p r e m i u m in the entity cache if it is enabled.
	 *
	 * @param renewal_premium the r e n e w a l_ p r e m i u m
	 */
	@Override
	public void cacheResult(RENEWAL_PREMIUM renewal_premium) {
		EntityCacheUtil.putResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMImpl.class, renewal_premium.getPrimaryKey(),
			renewal_premium);

		renewal_premium.resetOriginalValues();
	}

	/**
	 * Caches the r e n e w a l_ p r e m i u ms in the entity cache if it is enabled.
	 *
	 * @param renewal_premiums the r e n e w a l_ p r e m i u ms
	 */
	@Override
	public void cacheResult(List<RENEWAL_PREMIUM> renewal_premiums) {
		for (RENEWAL_PREMIUM renewal_premium : renewal_premiums) {
			if (EntityCacheUtil.getResult(
						RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
						RENEWAL_PREMIUMImpl.class,
						renewal_premium.getPrimaryKey()) == null) {
				cacheResult(renewal_premium);
			}
			else {
				renewal_premium.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all r e n e w a l_ p r e m i u ms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RENEWAL_PREMIUMImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RENEWAL_PREMIUMImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the r e n e w a l_ p r e m i u m.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RENEWAL_PREMIUM renewal_premium) {
		EntityCacheUtil.removeResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMImpl.class, renewal_premium.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RENEWAL_PREMIUM> renewal_premiums) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RENEWAL_PREMIUM renewal_premium : renewal_premiums) {
			EntityCacheUtil.removeResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
				RENEWAL_PREMIUMImpl.class, renewal_premium.getPrimaryKey());
		}
	}

	/**
	 * Creates a new r e n e w a l_ p r e m i u m with the primary key. Does not add the r e n e w a l_ p r e m i u m to the database.
	 *
	 * @param ID_old the primary key for the new r e n e w a l_ p r e m i u m
	 * @return the new r e n e w a l_ p r e m i u m
	 */
	@Override
	public RENEWAL_PREMIUM create(long ID_old) {
		RENEWAL_PREMIUM renewal_premium = new RENEWAL_PREMIUMImpl();

		renewal_premium.setNew(true);
		renewal_premium.setPrimaryKey(ID_old);

		return renewal_premium;
	}

	/**
	 * Removes the r e n e w a l_ p r e m i u m with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	 * @return the r e n e w a l_ p r e m i u m that was removed
	 * @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM remove(long ID_old)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		return remove((Serializable)ID_old);
	}

	/**
	 * Removes the r e n e w a l_ p r e m i u m with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the r e n e w a l_ p r e m i u m
	 * @return the r e n e w a l_ p r e m i u m that was removed
	 * @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM remove(Serializable primaryKey)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RENEWAL_PREMIUM renewal_premium = (RENEWAL_PREMIUM)session.get(RENEWAL_PREMIUMImpl.class,
					primaryKey);

			if (renewal_premium == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRENEWAL_PREMIUMException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(renewal_premium);
		}
		catch (NoSuchRENEWAL_PREMIUMException nsee) {
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
	protected RENEWAL_PREMIUM removeImpl(RENEWAL_PREMIUM renewal_premium)
		throws SystemException {
		renewal_premium = toUnwrappedModel(renewal_premium);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(renewal_premium)) {
				renewal_premium = (RENEWAL_PREMIUM)session.get(RENEWAL_PREMIUMImpl.class,
						renewal_premium.getPrimaryKeyObj());
			}

			if (renewal_premium != null) {
				session.delete(renewal_premium);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (renewal_premium != null) {
			clearCache(renewal_premium);
		}

		return renewal_premium;
	}

	@Override
	public RENEWAL_PREMIUM updateImpl(
		com.ifli.rapid.model.RENEWAL_PREMIUM renewal_premium)
		throws SystemException {
		renewal_premium = toUnwrappedModel(renewal_premium);

		boolean isNew = renewal_premium.isNew();

		Session session = null;

		try {
			session = openSession();

			if (renewal_premium.isNew()) {
				session.save(renewal_premium);

				renewal_premium.setNew(false);
			}
			else {
				session.merge(renewal_premium);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RENEWAL_PREMIUMModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
			RENEWAL_PREMIUMImpl.class, renewal_premium.getPrimaryKey(),
			renewal_premium);

		return renewal_premium;
	}

	protected RENEWAL_PREMIUM toUnwrappedModel(RENEWAL_PREMIUM renewal_premium) {
		if (renewal_premium instanceof RENEWAL_PREMIUMImpl) {
			return renewal_premium;
		}

		RENEWAL_PREMIUMImpl renewal_premiumImpl = new RENEWAL_PREMIUMImpl();

		renewal_premiumImpl.setNew(renewal_premium.isNew());
		renewal_premiumImpl.setPrimaryKey(renewal_premium.getPrimaryKey());

		renewal_premiumImpl.setID_old(renewal_premium.getID_old());
		renewal_premiumImpl.setLETTERCT(renewal_premium.getLETTERCT());
		renewal_premiumImpl.setLOCPATH(renewal_premium.getLOCPATH());
		renewal_premiumImpl.setDOCIDNUM(renewal_premium.getDOCIDNUM());
		renewal_premiumImpl.setCLNTNUM(renewal_premium.getCLNTNUM());
		renewal_premiumImpl.setOwnerName(renewal_premium.getOwnerName());
		renewal_premiumImpl.setAddrs5(renewal_premium.getAddrs5());
		renewal_premiumImpl.setPostcode(renewal_premium.getPostcode());
		renewal_premiumImpl.setDocument_Number(renewal_premium.getDocument_Number());
		renewal_premiumImpl.setContrNo(renewal_premium.getContrNo());
		renewal_premiumImpl.setNext_Premium_due_Date(renewal_premium.getNext_Premium_due_Date());
		renewal_premiumImpl.setTotal_Premium(renewal_premium.getTotal_Premium());
		renewal_premiumImpl.setMainCovr_Risk_Cess_Term(renewal_premium.getMainCovr_Risk_Cess_Term());
		renewal_premiumImpl.setMainCovr_Prem_Cess_Term(renewal_premium.getMainCovr_Prem_Cess_Term());
		renewal_premiumImpl.setContract_Commencement_Date(renewal_premium.getContract_Commencement_Date());
		renewal_premiumImpl.setBilling_Date(renewal_premium.getBilling_Date());
		renewal_premiumImpl.setPayment_Desc(renewal_premium.getPayment_Desc());
		renewal_premiumImpl.setReceipt_Date(renewal_premium.getReceipt_Date());
		renewal_premiumImpl.setPayment_Mode(renewal_premium.getPayment_Mode());
		renewal_premiumImpl.setPayment_Description(renewal_premium.getPayment_Description());
		renewal_premiumImpl.setReceipt_Amount(renewal_premium.getReceipt_Amount());
		renewal_premiumImpl.setContract_Type(renewal_premium.getContract_Type());
		renewal_premiumImpl.setContract_Type_Desc(renewal_premium.getContract_Type_Desc());
		renewal_premiumImpl.setCurrent_Bill_Frequency(renewal_premium.getCurrent_Bill_Frequency());
		renewal_premiumImpl.setSuspense_Amount(renewal_premium.getSuspense_Amount());
		renewal_premiumImpl.setFooter_Details(renewal_premium.getFooter_Details());
		renewal_premiumImpl.setAddrs1(renewal_premium.getAddrs1());
		renewal_premiumImpl.setAddrs2(renewal_premium.getAddrs2());
		renewal_premiumImpl.setAddrs3(renewal_premium.getAddrs3());
		renewal_premiumImpl.setAddrs4(renewal_premium.getAddrs4());
		renewal_premiumImpl.setTemp_Rcptno(renewal_premium.getTemp_Rcptno());
		renewal_premiumImpl.setLife_Name(renewal_premium.getLife_Name());
		renewal_premiumImpl.setCAMPAIGN(renewal_premium.getCAMPAIGN());
		renewal_premiumImpl.setAgent_Bank_Branch_Code(renewal_premium.getAgent_Bank_Branch_Code());
		renewal_premiumImpl.setAgent_Branch_name(renewal_premium.getAgent_Branch_name());
		renewal_premiumImpl.setAgent_Bank_name(renewal_premium.getAgent_Bank_name());
		renewal_premiumImpl.setMobile_phone(renewal_premium.getMobile_phone());
		renewal_premiumImpl.setEmail_id(renewal_premium.getEmail_id());
		renewal_premiumImpl.setCreateDate(renewal_premium.getCreateDate());
		renewal_premiumImpl.setBatchMode(renewal_premium.getBatchMode());
		renewal_premiumImpl.setStatus(renewal_premium.getStatus());
		renewal_premiumImpl.setLastProcessedDate(renewal_premium.getLastProcessedDate());
		renewal_premiumImpl.setMobilePhoneNo(renewal_premium.getMobilePhoneNo());
		renewal_premiumImpl.setCheque_Number(renewal_premium.getCheque_Number());
		renewal_premiumImpl.setBank_Name(renewal_premium.getBank_Name());
		renewal_premiumImpl.setEmailAddr(renewal_premium.getEmailAddr());
		renewal_premiumImpl.setID(renewal_premium.getID());
		renewal_premiumImpl.setBDM(renewal_premium.getBDM());
		renewal_premiumImpl.setTerm(renewal_premium.getTerm());
		renewal_premiumImpl.setCampaign_Code(renewal_premium.getCampaign_Code());

		return renewal_premiumImpl;
	}

	/**
	 * Returns the r e n e w a l_ p r e m i u m with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the r e n e w a l_ p r e m i u m
	 * @return the r e n e w a l_ p r e m i u m
	 * @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		RENEWAL_PREMIUM renewal_premium = fetchByPrimaryKey(primaryKey);

		if (renewal_premium == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRENEWAL_PREMIUMException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return renewal_premium;
	}

	/**
	 * Returns the r e n e w a l_ p r e m i u m with the primary key or throws a {@link com.ifli.rapid.NoSuchRENEWAL_PREMIUMException} if it could not be found.
	 *
	 * @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	 * @return the r e n e w a l_ p r e m i u m
	 * @throws com.ifli.rapid.NoSuchRENEWAL_PREMIUMException if a r e n e w a l_ p r e m i u m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM findByPrimaryKey(long ID_old)
		throws NoSuchRENEWAL_PREMIUMException, SystemException {
		return findByPrimaryKey((Serializable)ID_old);
	}

	/**
	 * Returns the r e n e w a l_ p r e m i u m with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the r e n e w a l_ p r e m i u m
	 * @return the r e n e w a l_ p r e m i u m, or <code>null</code> if a r e n e w a l_ p r e m i u m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RENEWAL_PREMIUM renewal_premium = (RENEWAL_PREMIUM)EntityCacheUtil.getResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
				RENEWAL_PREMIUMImpl.class, primaryKey);

		if (renewal_premium == _nullRENEWAL_PREMIUM) {
			return null;
		}

		if (renewal_premium == null) {
			Session session = null;

			try {
				session = openSession();

				renewal_premium = (RENEWAL_PREMIUM)session.get(RENEWAL_PREMIUMImpl.class,
						primaryKey);

				if (renewal_premium != null) {
					cacheResult(renewal_premium);
				}
				else {
					EntityCacheUtil.putResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
						RENEWAL_PREMIUMImpl.class, primaryKey,
						_nullRENEWAL_PREMIUM);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RENEWAL_PREMIUMModelImpl.ENTITY_CACHE_ENABLED,
					RENEWAL_PREMIUMImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return renewal_premium;
	}

	/**
	 * Returns the r e n e w a l_ p r e m i u m with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID_old the primary key of the r e n e w a l_ p r e m i u m
	 * @return the r e n e w a l_ p r e m i u m, or <code>null</code> if a r e n e w a l_ p r e m i u m with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RENEWAL_PREMIUM fetchByPrimaryKey(long ID_old)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ID_old);
	}

	/**
	 * Returns all the r e n e w a l_ p r e m i u ms.
	 *
	 * @return the r e n e w a l_ p r e m i u ms
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RENEWAL_PREMIUM> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<RENEWAL_PREMIUM> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<RENEWAL_PREMIUM> findAll(int start, int end,
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

		List<RENEWAL_PREMIUM> list = (List<RENEWAL_PREMIUM>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RENEWAL_PREMIUM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RENEWAL_PREMIUM;

				if (pagination) {
					sql = sql.concat(RENEWAL_PREMIUMModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RENEWAL_PREMIUM>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RENEWAL_PREMIUM>(list);
				}
				else {
					list = (List<RENEWAL_PREMIUM>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the r e n e w a l_ p r e m i u ms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RENEWAL_PREMIUM renewal_premium : findAll()) {
			remove(renewal_premium);
		}
	}

	/**
	 * Returns the number of r e n e w a l_ p r e m i u ms.
	 *
	 * @return the number of r e n e w a l_ p r e m i u ms
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

				Query q = session.createQuery(_SQL_COUNT_RENEWAL_PREMIUM);

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
	 * Initializes the r e n e w a l_ p r e m i u m persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.RENEWAL_PREMIUM")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RENEWAL_PREMIUM>> listenersList = new ArrayList<ModelListener<RENEWAL_PREMIUM>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RENEWAL_PREMIUM>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RENEWAL_PREMIUMImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RENEWAL_PREMIUM = "SELECT renewal_premium FROM RENEWAL_PREMIUM renewal_premium";
	private static final String _SQL_SELECT_RENEWAL_PREMIUM_WHERE = "SELECT renewal_premium FROM RENEWAL_PREMIUM renewal_premium WHERE ";
	private static final String _SQL_COUNT_RENEWAL_PREMIUM = "SELECT COUNT(renewal_premium) FROM RENEWAL_PREMIUM renewal_premium";
	private static final String _SQL_COUNT_RENEWAL_PREMIUM_WHERE = "SELECT COUNT(renewal_premium) FROM RENEWAL_PREMIUM renewal_premium WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "renewal_premium.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RENEWAL_PREMIUM exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RENEWAL_PREMIUM exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RENEWAL_PREMIUMPersistenceImpl.class);
	private static RENEWAL_PREMIUM _nullRENEWAL_PREMIUM = new RENEWAL_PREMIUMImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RENEWAL_PREMIUM> toCacheModel() {
				return _nullRENEWAL_PREMIUMCacheModel;
			}
		};

	private static CacheModel<RENEWAL_PREMIUM> _nullRENEWAL_PREMIUMCacheModel = new CacheModel<RENEWAL_PREMIUM>() {
			@Override
			public RENEWAL_PREMIUM toEntityModel() {
				return _nullRENEWAL_PREMIUM;
			}
		};
}