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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException;
import com.ifl.rapid.customer.model.CRM_Trn_Phone;
import com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl;

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
 * The persistence implementation for the c r m_ trn_ phone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PhonePersistence
 * @see CRM_Trn_PhoneUtil
 * @generated
 */
public class CRM_Trn_PhonePersistenceImpl extends BasePersistenceImpl<CRM_Trn_Phone>
	implements CRM_Trn_PhonePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CRM_Trn_PhoneUtil} to access the c r m_ trn_ phone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CRM_Trn_PhoneImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactIdAndPhoneId",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			CRM_Trn_PhoneModelImpl.CONTACTID_COLUMN_BITMASK |
			CRM_Trn_PhoneModelImpl.PHONEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTIDANDPHONEID = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByContactIdAndPhoneId",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @param PhoneId the phone ID
	 * @return the matching c r m_ trn_ phone
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone findByContactIdAndPhoneId(int ContactId, int PhoneId)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		CRM_Trn_Phone crm_Trn_Phone = fetchByContactIdAndPhoneId(ContactId,
				PhoneId);

		if (crm_Trn_Phone == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(", PhoneId=");
			msg.append(PhoneId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRM_Trn_PhoneException(msg.toString());
		}

		return crm_Trn_Phone;
	}

	/**
	 * Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param PhoneId the phone ID
	 * @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone fetchByContactIdAndPhoneId(int ContactId, int PhoneId)
		throws SystemException {
		return fetchByContactIdAndPhoneId(ContactId, PhoneId, true);
	}

	/**
	 * Returns the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param PhoneId the phone ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone fetchByContactIdAndPhoneId(int ContactId, int PhoneId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId, PhoneId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
					finderArgs, this);
		}

		if (result instanceof CRM_Trn_Phone) {
			CRM_Trn_Phone crm_Trn_Phone = (CRM_Trn_Phone)result;

			if ((ContactId != crm_Trn_Phone.getContactId()) ||
					(PhoneId != crm_Trn_Phone.getPhoneId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRM_TRN_PHONE_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDPHONEID_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDPHONEID_PHONEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(PhoneId);

				List<CRM_Trn_Phone> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRM_Trn_PhonePersistenceImpl.fetchByContactIdAndPhoneId(int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRM_Trn_Phone crm_Trn_Phone = list.get(0);

					result = crm_Trn_Phone;

					cacheResult(crm_Trn_Phone);

					if ((crm_Trn_Phone.getContactId() != ContactId) ||
							(crm_Trn_Phone.getPhoneId() != PhoneId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
							finderArgs, crm_Trn_Phone);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CRM_Trn_Phone)result;
		}
	}

	/**
	 * Removes the c r m_ trn_ phone where ContactId = &#63; and PhoneId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @param PhoneId the phone ID
	 * @return the c r m_ trn_ phone that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone removeByContactIdAndPhoneId(int ContactId, int PhoneId)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		CRM_Trn_Phone crm_Trn_Phone = findByContactIdAndPhoneId(ContactId,
				PhoneId);

		return remove(crm_Trn_Phone);
	}

	/**
	 * Returns the number of c r m_ trn_ phones where ContactId = &#63; and PhoneId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @param PhoneId the phone ID
	 * @return the number of matching c r m_ trn_ phones
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactIdAndPhoneId(int ContactId, int PhoneId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTIDANDPHONEID;

		Object[] finderArgs = new Object[] { ContactId, PhoneId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRM_TRN_PHONE_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDPHONEID_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDPHONEID_PHONEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(PhoneId);

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

	private static final String _FINDER_COLUMN_CONTACTIDANDPHONEID_CONTACTID_2 = "crm_Trn_Phone.ContactId = ? AND ";
	private static final String _FINDER_COLUMN_CONTACTIDANDPHONEID_PHONEID_2 = "crm_Trn_Phone.PhoneId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTID = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactId", new String[] { Integer.class.getName() },
			CRM_Trn_PhoneModelImpl.CONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTID = new FinderPath(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByContactId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the c r m_ trn_ phone where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @return the matching c r m_ trn_ phone
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a matching c r m_ trn_ phone could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone findByContactId(int ContactId)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		CRM_Trn_Phone crm_Trn_Phone = fetchByContactId(ContactId);

		if (crm_Trn_Phone == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRM_Trn_PhoneException(msg.toString());
		}

		return crm_Trn_Phone;
	}

	/**
	 * Returns the c r m_ trn_ phone where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone fetchByContactId(int ContactId)
		throws SystemException {
		return fetchByContactId(ContactId, true);
	}

	/**
	 * Returns the c r m_ trn_ phone where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m_ trn_ phone, or <code>null</code> if a matching c r m_ trn_ phone could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone fetchByContactId(int ContactId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTID,
					finderArgs, this);
		}

		if (result instanceof CRM_Trn_Phone) {
			CRM_Trn_Phone crm_Trn_Phone = (CRM_Trn_Phone)result;

			if ((ContactId != crm_Trn_Phone.getContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CRM_TRN_PHONE_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				List<CRM_Trn_Phone> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRM_Trn_PhonePersistenceImpl.fetchByContactId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRM_Trn_Phone crm_Trn_Phone = list.get(0);

					result = crm_Trn_Phone;

					cacheResult(crm_Trn_Phone);

					if ((crm_Trn_Phone.getContactId() != ContactId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
							finderArgs, crm_Trn_Phone);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CRM_Trn_Phone)result;
		}
	}

	/**
	 * Removes the c r m_ trn_ phone where ContactId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @return the c r m_ trn_ phone that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone removeByContactId(int ContactId)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		CRM_Trn_Phone crm_Trn_Phone = findByContactId(ContactId);

		return remove(crm_Trn_Phone);
	}

	/**
	 * Returns the number of c r m_ trn_ phones where ContactId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @return the number of matching c r m_ trn_ phones
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactId(int ContactId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTID;

		Object[] finderArgs = new Object[] { ContactId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRM_TRN_PHONE_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

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

	private static final String _FINDER_COLUMN_CONTACTID_CONTACTID_2 = "crm_Trn_Phone.ContactId = ?";

	public CRM_Trn_PhonePersistenceImpl() {
		setModelClass(CRM_Trn_Phone.class);
	}

	/**
	 * Caches the c r m_ trn_ phone in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_Phone the c r m_ trn_ phone
	 */
	@Override
	public void cacheResult(CRM_Trn_Phone crm_Trn_Phone) {
		EntityCacheUtil.putResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, crm_Trn_Phone.getPrimaryKey(),
			crm_Trn_Phone);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
			new Object[] {
				crm_Trn_Phone.getContactId(), crm_Trn_Phone.getPhoneId()
			}, crm_Trn_Phone);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
			new Object[] { crm_Trn_Phone.getContactId() }, crm_Trn_Phone);

		crm_Trn_Phone.resetOriginalValues();
	}

	/**
	 * Caches the c r m_ trn_ phones in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_Phones the c r m_ trn_ phones
	 */
	@Override
	public void cacheResult(List<CRM_Trn_Phone> crm_Trn_Phones) {
		for (CRM_Trn_Phone crm_Trn_Phone : crm_Trn_Phones) {
			if (EntityCacheUtil.getResult(
						CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_PhoneImpl.class, crm_Trn_Phone.getPrimaryKey()) == null) {
				cacheResult(crm_Trn_Phone);
			}
			else {
				crm_Trn_Phone.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c r m_ trn_ phones.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CRM_Trn_PhoneImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CRM_Trn_PhoneImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c r m_ trn_ phone.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CRM_Trn_Phone crm_Trn_Phone) {
		EntityCacheUtil.removeResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, crm_Trn_Phone.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(crm_Trn_Phone);
	}

	@Override
	public void clearCache(List<CRM_Trn_Phone> crm_Trn_Phones) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CRM_Trn_Phone crm_Trn_Phone : crm_Trn_Phones) {
			EntityCacheUtil.removeResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_PhoneImpl.class, crm_Trn_Phone.getPrimaryKey());

			clearUniqueFindersCache(crm_Trn_Phone);
		}
	}

	protected void cacheUniqueFindersCache(CRM_Trn_Phone crm_Trn_Phone) {
		if (crm_Trn_Phone.isNew()) {
			Object[] args = new Object[] {
					crm_Trn_Phone.getContactId(), crm_Trn_Phone.getPhoneId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDPHONEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
				args, crm_Trn_Phone);

			args = new Object[] { crm_Trn_Phone.getContactId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
				crm_Trn_Phone);
		}
		else {
			CRM_Trn_PhoneModelImpl crm_Trn_PhoneModelImpl = (CRM_Trn_PhoneModelImpl)crm_Trn_Phone;

			if ((crm_Trn_PhoneModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crm_Trn_Phone.getContactId(), crm_Trn_Phone.getPhoneId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDPHONEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
					args, crm_Trn_Phone);
			}

			if ((crm_Trn_PhoneModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crm_Trn_Phone.getContactId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
					crm_Trn_Phone);
			}
		}
	}

	protected void clearUniqueFindersCache(CRM_Trn_Phone crm_Trn_Phone) {
		CRM_Trn_PhoneModelImpl crm_Trn_PhoneModelImpl = (CRM_Trn_PhoneModelImpl)crm_Trn_Phone;

		Object[] args = new Object[] {
				crm_Trn_Phone.getContactId(), crm_Trn_Phone.getPhoneId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDPHONEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
			args);

		if ((crm_Trn_PhoneModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					crm_Trn_PhoneModelImpl.getOriginalContactId(),
					crm_Trn_PhoneModelImpl.getOriginalPhoneId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDPHONEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDPHONEID,
				args);
		}

		args = new Object[] { crm_Trn_Phone.getContactId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);

		if ((crm_Trn_PhoneModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
			args = new Object[] { crm_Trn_PhoneModelImpl.getOriginalContactId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);
		}
	}

	/**
	 * Creates a new c r m_ trn_ phone with the primary key. Does not add the c r m_ trn_ phone to the database.
	 *
	 * @param PhoneId the primary key for the new c r m_ trn_ phone
	 * @return the new c r m_ trn_ phone
	 */
	@Override
	public CRM_Trn_Phone create(int PhoneId) {
		CRM_Trn_Phone crm_Trn_Phone = new CRM_Trn_PhoneImpl();

		crm_Trn_Phone.setNew(true);
		crm_Trn_Phone.setPrimaryKey(PhoneId);

		return crm_Trn_Phone;
	}

	/**
	 * Removes the c r m_ trn_ phone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PhoneId the primary key of the c r m_ trn_ phone
	 * @return the c r m_ trn_ phone that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone remove(int PhoneId)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		return remove((Serializable)PhoneId);
	}

	/**
	 * Removes the c r m_ trn_ phone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ phone
	 * @return the c r m_ trn_ phone that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone remove(Serializable primaryKey)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CRM_Trn_Phone crm_Trn_Phone = (CRM_Trn_Phone)session.get(CRM_Trn_PhoneImpl.class,
					primaryKey);

			if (crm_Trn_Phone == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCRM_Trn_PhoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crm_Trn_Phone);
		}
		catch (NoSuchCRM_Trn_PhoneException nsee) {
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
	protected CRM_Trn_Phone removeImpl(CRM_Trn_Phone crm_Trn_Phone)
		throws SystemException {
		crm_Trn_Phone = toUnwrappedModel(crm_Trn_Phone);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crm_Trn_Phone)) {
				crm_Trn_Phone = (CRM_Trn_Phone)session.get(CRM_Trn_PhoneImpl.class,
						crm_Trn_Phone.getPrimaryKeyObj());
			}

			if (crm_Trn_Phone != null) {
				session.delete(crm_Trn_Phone);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crm_Trn_Phone != null) {
			clearCache(crm_Trn_Phone);
		}

		return crm_Trn_Phone;
	}

	@Override
	public CRM_Trn_Phone updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_Phone crm_Trn_Phone)
		throws SystemException {
		crm_Trn_Phone = toUnwrappedModel(crm_Trn_Phone);

		boolean isNew = crm_Trn_Phone.isNew();

		Session session = null;

		try {
			session = openSession();

			if (crm_Trn_Phone.isNew()) {
				session.save(crm_Trn_Phone);

				crm_Trn_Phone.setNew(false);
			}
			else {
				session.merge(crm_Trn_Phone);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CRM_Trn_PhoneModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PhoneImpl.class, crm_Trn_Phone.getPrimaryKey(),
			crm_Trn_Phone);

		clearUniqueFindersCache(crm_Trn_Phone);
		cacheUniqueFindersCache(crm_Trn_Phone);

		return crm_Trn_Phone;
	}

	protected CRM_Trn_Phone toUnwrappedModel(CRM_Trn_Phone crm_Trn_Phone) {
		if (crm_Trn_Phone instanceof CRM_Trn_PhoneImpl) {
			return crm_Trn_Phone;
		}

		CRM_Trn_PhoneImpl crm_Trn_PhoneImpl = new CRM_Trn_PhoneImpl();

		crm_Trn_PhoneImpl.setNew(crm_Trn_Phone.isNew());
		crm_Trn_PhoneImpl.setPrimaryKey(crm_Trn_Phone.getPrimaryKey());

		crm_Trn_PhoneImpl.setPhoneId(crm_Trn_Phone.getPhoneId());
		crm_Trn_PhoneImpl.setContactId(crm_Trn_Phone.getContactId());
		crm_Trn_PhoneImpl.setPhoneType(crm_Trn_Phone.getPhoneType());
		crm_Trn_PhoneImpl.setPhoneNumber(crm_Trn_Phone.getPhoneNumber());
		crm_Trn_PhoneImpl.setCreatedBy(crm_Trn_Phone.getCreatedBy());
		crm_Trn_PhoneImpl.setCreatedDate(crm_Trn_Phone.getCreatedDate());
		crm_Trn_PhoneImpl.setModifiedBy(crm_Trn_Phone.getModifiedBy());
		crm_Trn_PhoneImpl.setModifiedDate(crm_Trn_Phone.getModifiedDate());
		crm_Trn_PhoneImpl.setIsActive(crm_Trn_Phone.getIsActive());

		return crm_Trn_PhoneImpl;
	}

	/**
	 * Returns the c r m_ trn_ phone with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ phone
	 * @return the c r m_ trn_ phone
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		CRM_Trn_Phone crm_Trn_Phone = fetchByPrimaryKey(primaryKey);

		if (crm_Trn_Phone == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCRM_Trn_PhoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crm_Trn_Phone;
	}

	/**
	 * Returns the c r m_ trn_ phone with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException} if it could not be found.
	 *
	 * @param PhoneId the primary key of the c r m_ trn_ phone
	 * @return the c r m_ trn_ phone
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PhoneException if a c r m_ trn_ phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone findByPrimaryKey(int PhoneId)
		throws NoSuchCRM_Trn_PhoneException, SystemException {
		return findByPrimaryKey((Serializable)PhoneId);
	}

	/**
	 * Returns the c r m_ trn_ phone with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ phone
	 * @return the c r m_ trn_ phone, or <code>null</code> if a c r m_ trn_ phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CRM_Trn_Phone crm_Trn_Phone = (CRM_Trn_Phone)EntityCacheUtil.getResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_PhoneImpl.class, primaryKey);

		if (crm_Trn_Phone == _nullCRM_Trn_Phone) {
			return null;
		}

		if (crm_Trn_Phone == null) {
			Session session = null;

			try {
				session = openSession();

				crm_Trn_Phone = (CRM_Trn_Phone)session.get(CRM_Trn_PhoneImpl.class,
						primaryKey);

				if (crm_Trn_Phone != null) {
					cacheResult(crm_Trn_Phone);
				}
				else {
					EntityCacheUtil.putResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_PhoneImpl.class, primaryKey, _nullCRM_Trn_Phone);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CRM_Trn_PhoneModelImpl.ENTITY_CACHE_ENABLED,
					CRM_Trn_PhoneImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crm_Trn_Phone;
	}

	/**
	 * Returns the c r m_ trn_ phone with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PhoneId the primary key of the c r m_ trn_ phone
	 * @return the c r m_ trn_ phone, or <code>null</code> if a c r m_ trn_ phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Phone fetchByPrimaryKey(int PhoneId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PhoneId);
	}

	/**
	 * Returns all the c r m_ trn_ phones.
	 *
	 * @return the c r m_ trn_ phones
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Phone> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c r m_ trn_ phones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ phones
	 * @param end the upper bound of the range of c r m_ trn_ phones (not inclusive)
	 * @return the range of c r m_ trn_ phones
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Phone> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c r m_ trn_ phones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ phones
	 * @param end the upper bound of the range of c r m_ trn_ phones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c r m_ trn_ phones
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Phone> findAll(int start, int end,
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

		List<CRM_Trn_Phone> list = (List<CRM_Trn_Phone>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRM_TRN_PHONE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRM_TRN_PHONE;

				if (pagination) {
					sql = sql.concat(CRM_Trn_PhoneModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CRM_Trn_Phone>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CRM_Trn_Phone>(list);
				}
				else {
					list = (List<CRM_Trn_Phone>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the c r m_ trn_ phones from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CRM_Trn_Phone crm_Trn_Phone : findAll()) {
			remove(crm_Trn_Phone);
		}
	}

	/**
	 * Returns the number of c r m_ trn_ phones.
	 *
	 * @return the number of c r m_ trn_ phones
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

				Query q = session.createQuery(_SQL_COUNT_CRM_TRN_PHONE);

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
	 * Initializes the c r m_ trn_ phone persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.CRM_Trn_Phone")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CRM_Trn_Phone>> listenersList = new ArrayList<ModelListener<CRM_Trn_Phone>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CRM_Trn_Phone>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CRM_Trn_PhoneImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRM_TRN_PHONE = "SELECT crm_Trn_Phone FROM CRM_Trn_Phone crm_Trn_Phone";
	private static final String _SQL_SELECT_CRM_TRN_PHONE_WHERE = "SELECT crm_Trn_Phone FROM CRM_Trn_Phone crm_Trn_Phone WHERE ";
	private static final String _SQL_COUNT_CRM_TRN_PHONE = "SELECT COUNT(crm_Trn_Phone) FROM CRM_Trn_Phone crm_Trn_Phone";
	private static final String _SQL_COUNT_CRM_TRN_PHONE_WHERE = "SELECT COUNT(crm_Trn_Phone) FROM CRM_Trn_Phone crm_Trn_Phone WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crm_Trn_Phone.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CRM_Trn_Phone exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CRM_Trn_Phone exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CRM_Trn_PhonePersistenceImpl.class);
	private static CRM_Trn_Phone _nullCRM_Trn_Phone = new CRM_Trn_PhoneImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CRM_Trn_Phone> toCacheModel() {
				return _nullCRM_Trn_PhoneCacheModel;
			}
		};

	private static CacheModel<CRM_Trn_Phone> _nullCRM_Trn_PhoneCacheModel = new CacheModel<CRM_Trn_Phone>() {
			@Override
			public CRM_Trn_Phone toEntityModel() {
				return _nullCRM_Trn_Phone;
			}
		};
}