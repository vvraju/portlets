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

import com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException;
import com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE;
import com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEImpl;
import com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the p r e m i u m_ p a i d_ c e r t i f i c a t e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PREMIUM_PAID_CERTIFICATEPersistence
 * @see PREMIUM_PAID_CERTIFICATEUtil
 * @generated
 */
public class PREMIUM_PAID_CERTIFICATEPersistenceImpl extends BasePersistenceImpl<PREMIUM_PAID_CERTIFICATE>
	implements PREMIUM_PAID_CERTIFICATEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PREMIUM_PAID_CERTIFICATEUtil} to access the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PREMIUM_PAID_CERTIFICATEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEModelImpl.FINDER_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEModelImpl.FINDER_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POLICYANDYEAR =
		new FinderPath(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEModelImpl.FINDER_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPolicyAndYear",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POLICYANDYEAR =
		new FinderPath(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEModelImpl.FINDER_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPolicyAndYear",
			new String[] { String.class.getName(), String.class.getName() },
			PREMIUM_PAID_CERTIFICATEModelImpl.CONTRNO_COLUMN_BITMASK |
			PREMIUM_PAID_CERTIFICATEModelImpl.FINANCIAL_YEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POLICYANDYEAR = new FinderPath(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPolicyAndYear",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @return the matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(String ContrNo,
		String Financial_Year) throws SystemException {
		return findByPolicyAndYear(ContrNo, Financial_Year, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	 * @return the range of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(String ContrNo,
		String Financial_Year, int start, int end) throws SystemException {
		return findByPolicyAndYear(ContrNo, Financial_Year, start, end, null);
	}

	/**
	 * Returns an ordered range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PREMIUM_PAID_CERTIFICATE> findByPolicyAndYear(String ContrNo,
		String Financial_Year, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POLICYANDYEAR;
			finderArgs = new Object[] { ContrNo, Financial_Year };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POLICYANDYEAR;
			finderArgs = new Object[] {
					ContrNo, Financial_Year,
					
					start, end, orderByComparator
				};
		}

		List<PREMIUM_PAID_CERTIFICATE> list = (List<PREMIUM_PAID_CERTIFICATE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PREMIUM_PAID_CERTIFICATE premium_paid_certificate : list) {
				if (!Validator.equals(ContrNo,
							premium_paid_certificate.getContrNo()) ||
						!Validator.equals(Financial_Year,
							premium_paid_certificate.getFinancial_Year())) {
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

			query.append(_SQL_SELECT_PREMIUM_PAID_CERTIFICATE_WHERE);

			boolean bindContrNo = false;

			if (ContrNo == null) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_1);
			}
			else if (ContrNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_3);
			}
			else {
				bindContrNo = true;

				query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_2);
			}

			boolean bindFinancial_Year = false;

			if (Financial_Year == null) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_1);
			}
			else if (Financial_Year.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_3);
			}
			else {
				bindFinancial_Year = true;

				query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PREMIUM_PAID_CERTIFICATEModelImpl.ORDER_BY_JPQL);
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

				if (bindFinancial_Year) {
					qPos.add(Financial_Year);
				}

				if (!pagination) {
					list = (List<PREMIUM_PAID_CERTIFICATE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PREMIUM_PAID_CERTIFICATE>(list);
				}
				else {
					list = (List<PREMIUM_PAID_CERTIFICATE>)QueryUtil.list(q,
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
	 * Returns the first p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE findByPolicyAndYear_First(String ContrNo,
		String Financial_Year, OrderByComparator orderByComparator)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate = fetchByPolicyAndYear_First(ContrNo,
				Financial_Year, orderByComparator);

		if (premium_paid_certificate != null) {
			return premium_paid_certificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ContrNo=");
		msg.append(ContrNo);

		msg.append(", Financial_Year=");
		msg.append(Financial_Year);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPREMIUM_PAID_CERTIFICATEException(msg.toString());
	}

	/**
	 * Returns the first p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE fetchByPolicyAndYear_First(String ContrNo,
		String Financial_Year, OrderByComparator orderByComparator)
		throws SystemException {
		List<PREMIUM_PAID_CERTIFICATE> list = findByPolicyAndYear(ContrNo,
				Financial_Year, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE findByPolicyAndYear_Last(String ContrNo,
		String Financial_Year, OrderByComparator orderByComparator)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate = fetchByPolicyAndYear_Last(ContrNo,
				Financial_Year, orderByComparator);

		if (premium_paid_certificate != null) {
			return premium_paid_certificate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ContrNo=");
		msg.append(ContrNo);

		msg.append(", Financial_Year=");
		msg.append(Financial_Year);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPREMIUM_PAID_CERTIFICATEException(msg.toString());
	}

	/**
	 * Returns the last p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a matching p r e m i u m_ p a i d_ c e r t i f i c a t e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE fetchByPolicyAndYear_Last(String ContrNo,
		String Financial_Year, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPolicyAndYear(ContrNo, Financial_Year);

		if (count == 0) {
			return null;
		}

		List<PREMIUM_PAID_CERTIFICATE> list = findByPolicyAndYear(ContrNo,
				Financial_Year, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t es before and after the current p r e m i u m_ p a i d_ c e r t i f i c a t e in the ordered set where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ID the primary key of the current p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE[] findByPolicyAndYear_PrevAndNext(long ID,
		String ContrNo, String Financial_Year,
		OrderByComparator orderByComparator)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate = findByPrimaryKey(ID);

		Session session = null;

		try {
			session = openSession();

			PREMIUM_PAID_CERTIFICATE[] array = new PREMIUM_PAID_CERTIFICATEImpl[3];

			array[0] = getByPolicyAndYear_PrevAndNext(session,
					premium_paid_certificate, ContrNo, Financial_Year,
					orderByComparator, true);

			array[1] = premium_paid_certificate;

			array[2] = getByPolicyAndYear_PrevAndNext(session,
					premium_paid_certificate, ContrNo, Financial_Year,
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

	protected PREMIUM_PAID_CERTIFICATE getByPolicyAndYear_PrevAndNext(
		Session session, PREMIUM_PAID_CERTIFICATE premium_paid_certificate,
		String ContrNo, String Financial_Year,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PREMIUM_PAID_CERTIFICATE_WHERE);

		boolean bindContrNo = false;

		if (ContrNo == null) {
			query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_1);
		}
		else if (ContrNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_3);
		}
		else {
			bindContrNo = true;

			query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_2);
		}

		boolean bindFinancial_Year = false;

		if (Financial_Year == null) {
			query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_1);
		}
		else if (Financial_Year.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_3);
		}
		else {
			bindFinancial_Year = true;

			query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_2);
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
			query.append(PREMIUM_PAID_CERTIFICATEModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindContrNo) {
			qPos.add(ContrNo);
		}

		if (bindFinancial_Year) {
			qPos.add(Financial_Year);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(premium_paid_certificate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PREMIUM_PAID_CERTIFICATE> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63; from the database.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPolicyAndYear(String ContrNo, String Financial_Year)
		throws SystemException {
		for (PREMIUM_PAID_CERTIFICATE premium_paid_certificate : findByPolicyAndYear(
				ContrNo, Financial_Year, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(premium_paid_certificate);
		}
	}

	/**
	 * Returns the number of p r e m i u m_ p a i d_ c e r t i f i c a t es where ContrNo = &#63; and Financial_Year = &#63;.
	 *
	 * @param ContrNo the contr no
	 * @param Financial_Year the financial_ year
	 * @return the number of matching p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPolicyAndYear(String ContrNo, String Financial_Year)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POLICYANDYEAR;

		Object[] finderArgs = new Object[] { ContrNo, Financial_Year };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PREMIUM_PAID_CERTIFICATE_WHERE);

			boolean bindContrNo = false;

			if (ContrNo == null) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_1);
			}
			else if (ContrNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_3);
			}
			else {
				bindContrNo = true;

				query.append(_FINDER_COLUMN_POLICYANDYEAR_CONTRNO_2);
			}

			boolean bindFinancial_Year = false;

			if (Financial_Year == null) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_1);
			}
			else if (Financial_Year.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_3);
			}
			else {
				bindFinancial_Year = true;

				query.append(_FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_2);
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

				if (bindFinancial_Year) {
					qPos.add(Financial_Year);
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

	private static final String _FINDER_COLUMN_POLICYANDYEAR_CONTRNO_1 = "premium_paid_certificate.ContrNo IS NULL AND ";
	private static final String _FINDER_COLUMN_POLICYANDYEAR_CONTRNO_2 = "premium_paid_certificate.ContrNo = ? AND ";
	private static final String _FINDER_COLUMN_POLICYANDYEAR_CONTRNO_3 = "(premium_paid_certificate.ContrNo IS NULL OR premium_paid_certificate.ContrNo = '') AND ";
	private static final String _FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_1 = "premium_paid_certificate.Financial_Year IS NULL";
	private static final String _FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_2 = "premium_paid_certificate.Financial_Year = ?";
	private static final String _FINDER_COLUMN_POLICYANDYEAR_FINANCIAL_YEAR_3 = "(premium_paid_certificate.Financial_Year IS NULL OR premium_paid_certificate.Financial_Year = '')";

	public PREMIUM_PAID_CERTIFICATEPersistenceImpl() {
		setModelClass(PREMIUM_PAID_CERTIFICATE.class);
	}

	/**
	 * Caches the p r e m i u m_ p a i d_ c e r t i f i c a t e in the entity cache if it is enabled.
	 *
	 * @param premium_paid_certificate the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@Override
	public void cacheResult(PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		EntityCacheUtil.putResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			premium_paid_certificate.getPrimaryKey(), premium_paid_certificate);

		premium_paid_certificate.resetOriginalValues();
	}

	/**
	 * Caches the p r e m i u m_ p a i d_ c e r t i f i c a t es in the entity cache if it is enabled.
	 *
	 * @param premium_paid_certificates the p r e m i u m_ p a i d_ c e r t i f i c a t es
	 */
	@Override
	public void cacheResult(
		List<PREMIUM_PAID_CERTIFICATE> premium_paid_certificates) {
		for (PREMIUM_PAID_CERTIFICATE premium_paid_certificate : premium_paid_certificates) {
			if (EntityCacheUtil.getResult(
						PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
						PREMIUM_PAID_CERTIFICATEImpl.class,
						premium_paid_certificate.getPrimaryKey()) == null) {
				cacheResult(premium_paid_certificate);
			}
			else {
				premium_paid_certificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all p r e m i u m_ p a i d_ c e r t i f i c a t es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PREMIUM_PAID_CERTIFICATEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PREMIUM_PAID_CERTIFICATEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the p r e m i u m_ p a i d_ c e r t i f i c a t e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		EntityCacheUtil.removeResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			premium_paid_certificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PREMIUM_PAID_CERTIFICATE> premium_paid_certificates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PREMIUM_PAID_CERTIFICATE premium_paid_certificate : premium_paid_certificates) {
			EntityCacheUtil.removeResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
				PREMIUM_PAID_CERTIFICATEImpl.class,
				premium_paid_certificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key. Does not add the p r e m i u m_ p a i d_ c e r t i f i c a t e to the database.
	 *
	 * @param ID the primary key for the new p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the new p r e m i u m_ p a i d_ c e r t i f i c a t e
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE create(long ID) {
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate = new PREMIUM_PAID_CERTIFICATEImpl();

		premium_paid_certificate.setNew(true);
		premium_paid_certificate.setPrimaryKey(ID);

		return premium_paid_certificate;
	}

	/**
	 * Removes the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e that was removed
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE remove(long ID)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e that was removed
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE remove(Serializable primaryKey)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PREMIUM_PAID_CERTIFICATE premium_paid_certificate = (PREMIUM_PAID_CERTIFICATE)session.get(PREMIUM_PAID_CERTIFICATEImpl.class,
					primaryKey);

			if (premium_paid_certificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPREMIUM_PAID_CERTIFICATEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(premium_paid_certificate);
		}
		catch (NoSuchPREMIUM_PAID_CERTIFICATEException nsee) {
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
	protected PREMIUM_PAID_CERTIFICATE removeImpl(
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate)
		throws SystemException {
		premium_paid_certificate = toUnwrappedModel(premium_paid_certificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(premium_paid_certificate)) {
				premium_paid_certificate = (PREMIUM_PAID_CERTIFICATE)session.get(PREMIUM_PAID_CERTIFICATEImpl.class,
						premium_paid_certificate.getPrimaryKeyObj());
			}

			if (premium_paid_certificate != null) {
				session.delete(premium_paid_certificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (premium_paid_certificate != null) {
			clearCache(premium_paid_certificate);
		}

		return premium_paid_certificate;
	}

	@Override
	public PREMIUM_PAID_CERTIFICATE updateImpl(
		com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE premium_paid_certificate)
		throws SystemException {
		premium_paid_certificate = toUnwrappedModel(premium_paid_certificate);

		boolean isNew = premium_paid_certificate.isNew();

		PREMIUM_PAID_CERTIFICATEModelImpl premium_paid_certificateModelImpl = (PREMIUM_PAID_CERTIFICATEModelImpl)premium_paid_certificate;

		Session session = null;

		try {
			session = openSession();

			if (premium_paid_certificate.isNew()) {
				session.save(premium_paid_certificate);

				premium_paid_certificate.setNew(false);
			}
			else {
				session.merge(premium_paid_certificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PREMIUM_PAID_CERTIFICATEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((premium_paid_certificateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POLICYANDYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						premium_paid_certificateModelImpl.getOriginalContrNo(),
						premium_paid_certificateModelImpl.getOriginalFinancial_Year()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POLICYANDYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POLICYANDYEAR,
					args);

				args = new Object[] {
						premium_paid_certificateModelImpl.getContrNo(),
						premium_paid_certificateModelImpl.getFinancial_Year()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POLICYANDYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POLICYANDYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
			PREMIUM_PAID_CERTIFICATEImpl.class,
			premium_paid_certificate.getPrimaryKey(), premium_paid_certificate);

		return premium_paid_certificate;
	}

	protected PREMIUM_PAID_CERTIFICATE toUnwrappedModel(
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate) {
		if (premium_paid_certificate instanceof PREMIUM_PAID_CERTIFICATEImpl) {
			return premium_paid_certificate;
		}

		PREMIUM_PAID_CERTIFICATEImpl premium_paid_certificateImpl = new PREMIUM_PAID_CERTIFICATEImpl();

		premium_paid_certificateImpl.setNew(premium_paid_certificate.isNew());
		premium_paid_certificateImpl.setPrimaryKey(premium_paid_certificate.getPrimaryKey());

		premium_paid_certificateImpl.setID(premium_paid_certificate.getID());
		premium_paid_certificateImpl.setFinancial_Year(premium_paid_certificate.getFinancial_Year());
		premium_paid_certificateImpl.setGeneration_Date(premium_paid_certificate.getGeneration_Date());
		premium_paid_certificateImpl.setOwnerName(premium_paid_certificate.getOwnerName());
		premium_paid_certificateImpl.setAddrs1(premium_paid_certificate.getAddrs1());
		premium_paid_certificateImpl.setAddrs2(premium_paid_certificate.getAddrs2());
		premium_paid_certificateImpl.setAddrs3(premium_paid_certificate.getAddrs3());
		premium_paid_certificateImpl.setAddrs4(premium_paid_certificate.getAddrs4());
		premium_paid_certificateImpl.setAddrs5(premium_paid_certificate.getAddrs5());
		premium_paid_certificateImpl.setPostcode(premium_paid_certificate.getPostcode());
		premium_paid_certificateImpl.setMobilePhoneNo(premium_paid_certificate.getMobilePhoneNo());
		premium_paid_certificateImpl.setEmail_ID(premium_paid_certificate.getEmail_ID());
		premium_paid_certificateImpl.setClient_ID(premium_paid_certificate.getClient_ID());
		premium_paid_certificateImpl.setContract_Type_Desc(premium_paid_certificate.getContract_Type_Desc());
		premium_paid_certificateImpl.setContrNo(premium_paid_certificate.getContrNo());
		premium_paid_certificateImpl.setInstallment_Prem(premium_paid_certificate.getInstallment_Prem());
		premium_paid_certificateImpl.setBilling_Frequency(premium_paid_certificate.getBilling_Frequency());
		premium_paid_certificateImpl.setSumAssured(premium_paid_certificate.getSumAssured());
		premium_paid_certificateImpl.setTotal_Pre_Paid(premium_paid_certificate.getTotal_Pre_Paid());
		premium_paid_certificateImpl.setTotal_Pre_Due(premium_paid_certificate.getTotal_Pre_Due());
		premium_paid_certificateImpl.setCoverage(premium_paid_certificate.getCoverage());
		premium_paid_certificateImpl.setFin_Year(premium_paid_certificate.getFin_Year());
		premium_paid_certificateImpl.setLETTERCTL(premium_paid_certificate.getLETTERCTL());
		premium_paid_certificateImpl.setLOCPATH(premium_paid_certificate.getLOCPATH());
		premium_paid_certificateImpl.setDOCIDNUM(premium_paid_certificate.getDOCIDNUM());
		premium_paid_certificateImpl.setStatus(premium_paid_certificate.getStatus());
		premium_paid_certificateImpl.setLastProcessedDate(premium_paid_certificate.getLastProcessedDate());
		premium_paid_certificateImpl.setCreateDate(premium_paid_certificate.getCreateDate());
		premium_paid_certificateImpl.setGLCODE(premium_paid_certificate.getGLCODE());
		premium_paid_certificateImpl.setBRANCH_CODE(premium_paid_certificate.getBRANCH_CODE());

		return premium_paid_certificateImpl;
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate = fetchByPrimaryKey(primaryKey);

		if (premium_paid_certificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPREMIUM_PAID_CERTIFICATEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return premium_paid_certificate;
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or throws a {@link com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException} if it could not be found.
	 *
	 * @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @throws com.ifli.rapid.NoSuchPREMIUM_PAID_CERTIFICATEException if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE findByPrimaryKey(long ID)
		throws NoSuchPREMIUM_PAID_CERTIFICATEException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PREMIUM_PAID_CERTIFICATE premium_paid_certificate = (PREMIUM_PAID_CERTIFICATE)EntityCacheUtil.getResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
				PREMIUM_PAID_CERTIFICATEImpl.class, primaryKey);

		if (premium_paid_certificate == _nullPREMIUM_PAID_CERTIFICATE) {
			return null;
		}

		if (premium_paid_certificate == null) {
			Session session = null;

			try {
				session = openSession();

				premium_paid_certificate = (PREMIUM_PAID_CERTIFICATE)session.get(PREMIUM_PAID_CERTIFICATEImpl.class,
						primaryKey);

				if (premium_paid_certificate != null) {
					cacheResult(premium_paid_certificate);
				}
				else {
					EntityCacheUtil.putResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
						PREMIUM_PAID_CERTIFICATEImpl.class, primaryKey,
						_nullPREMIUM_PAID_CERTIFICATE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PREMIUM_PAID_CERTIFICATEModelImpl.ENTITY_CACHE_ENABLED,
					PREMIUM_PAID_CERTIFICATEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return premium_paid_certificate;
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the p r e m i u m_ p a i d_ c e r t i f i c a t e
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e, or <code>null</code> if a p r e m i u m_ p a i d_ c e r t i f i c a t e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PREMIUM_PAID_CERTIFICATE fetchByPrimaryKey(long ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	 *
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PREMIUM_PAID_CERTIFICATE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	 * @return the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PREMIUM_PAID_CERTIFICATE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the p r e m i u m_ p a i d_ c e r t i f i c a t es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PREMIUM_PAID_CERTIFICATEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @param end the upper bound of the range of p r e m i u m_ p a i d_ c e r t i f i c a t es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of p r e m i u m_ p a i d_ c e r t i f i c a t es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PREMIUM_PAID_CERTIFICATE> findAll(int start, int end,
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

		List<PREMIUM_PAID_CERTIFICATE> list = (List<PREMIUM_PAID_CERTIFICATE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREMIUM_PAID_CERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREMIUM_PAID_CERTIFICATE;

				if (pagination) {
					sql = sql.concat(PREMIUM_PAID_CERTIFICATEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PREMIUM_PAID_CERTIFICATE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PREMIUM_PAID_CERTIFICATE>(list);
				}
				else {
					list = (List<PREMIUM_PAID_CERTIFICATE>)QueryUtil.list(q,
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
	 * Removes all the p r e m i u m_ p a i d_ c e r t i f i c a t es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PREMIUM_PAID_CERTIFICATE premium_paid_certificate : findAll()) {
			remove(premium_paid_certificate);
		}
	}

	/**
	 * Returns the number of p r e m i u m_ p a i d_ c e r t i f i c a t es.
	 *
	 * @return the number of p r e m i u m_ p a i d_ c e r t i f i c a t es
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

				Query q = session.createQuery(_SQL_COUNT_PREMIUM_PAID_CERTIFICATE);

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
	 * Initializes the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PREMIUM_PAID_CERTIFICATE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PREMIUM_PAID_CERTIFICATE>> listenersList = new ArrayList<ModelListener<PREMIUM_PAID_CERTIFICATE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PREMIUM_PAID_CERTIFICATE>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PREMIUM_PAID_CERTIFICATEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PREMIUM_PAID_CERTIFICATE = "SELECT premium_paid_certificate FROM PREMIUM_PAID_CERTIFICATE premium_paid_certificate";
	private static final String _SQL_SELECT_PREMIUM_PAID_CERTIFICATE_WHERE = "SELECT premium_paid_certificate FROM PREMIUM_PAID_CERTIFICATE premium_paid_certificate WHERE ";
	private static final String _SQL_COUNT_PREMIUM_PAID_CERTIFICATE = "SELECT COUNT(premium_paid_certificate) FROM PREMIUM_PAID_CERTIFICATE premium_paid_certificate";
	private static final String _SQL_COUNT_PREMIUM_PAID_CERTIFICATE_WHERE = "SELECT COUNT(premium_paid_certificate) FROM PREMIUM_PAID_CERTIFICATE premium_paid_certificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "premium_paid_certificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PREMIUM_PAID_CERTIFICATE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PREMIUM_PAID_CERTIFICATE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PREMIUM_PAID_CERTIFICATEPersistenceImpl.class);
	private static PREMIUM_PAID_CERTIFICATE _nullPREMIUM_PAID_CERTIFICATE = new PREMIUM_PAID_CERTIFICATEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PREMIUM_PAID_CERTIFICATE> toCacheModel() {
				return _nullPREMIUM_PAID_CERTIFICATECacheModel;
			}
		};

	private static CacheModel<PREMIUM_PAID_CERTIFICATE> _nullPREMIUM_PAID_CERTIFICATECacheModel =
		new CacheModel<PREMIUM_PAID_CERTIFICATE>() {
			@Override
			public PREMIUM_PAID_CERTIFICATE toEntityModel() {
				return _nullPREMIUM_PAID_CERTIFICATE;
			}
		};
}