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

import com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException;
import com.ifl.rapid.customer.model.CRMTrnContactCommunication;
import com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationImpl;
import com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationModelImpl;

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
 * The persistence implementation for the c r m trn contact communication service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnContactCommunicationPersistence
 * @see CRMTrnContactCommunicationUtil
 * @generated
 */
public class CRMTrnContactCommunicationPersistenceImpl
	extends BasePersistenceImpl<CRMTrnContactCommunication>
	implements CRMTrnContactCommunicationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CRMTrnContactCommunicationUtil} to access the c r m trn contact communication persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CRMTrnContactCommunicationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM =
		new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactIdAndCommunicationMedium",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			CRMTrnContactCommunicationModelImpl.CONTACTID_COLUMN_BITMASK |
			CRMTrnContactCommunicationModelImpl.COMMUNICATIONMEDIUM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTIDANDCOMMUNICATIONMEDIUM =
		new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByContactIdAndCommunicationMedium",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @param CommunicationMedium the communication medium
	 * @return the matching c r m trn contact communication
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a matching c r m trn contact communication could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication findByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		CRMTrnContactCommunication crmTrnContactCommunication = fetchByContactIdAndCommunicationMedium(ContactId,
				CommunicationMedium);

		if (crmTrnContactCommunication == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(", CommunicationMedium=");
			msg.append(CommunicationMedium);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRMTrnContactCommunicationException(msg.toString());
		}

		return crmTrnContactCommunication;
	}

	/**
	 * Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param CommunicationMedium the communication medium
	 * @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication fetchByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium) throws SystemException {
		return fetchByContactIdAndCommunicationMedium(ContactId,
			CommunicationMedium, true);
	}

	/**
	 * Returns the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param CommunicationMedium the communication medium
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication fetchByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ContactId, CommunicationMedium };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
					finderArgs, this);
		}

		if (result instanceof CRMTrnContactCommunication) {
			CRMTrnContactCommunication crmTrnContactCommunication = (CRMTrnContactCommunication)result;

			if ((ContactId != crmTrnContactCommunication.getContactId()) ||
					(CommunicationMedium != crmTrnContactCommunication.getCommunicationMedium())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMTRNCONTACTCOMMUNICATION_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDCOMMUNICATIONMEDIUM_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDCOMMUNICATIONMEDIUM_COMMUNICATIONMEDIUM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(CommunicationMedium);

				List<CRMTrnContactCommunication> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRMTrnContactCommunicationPersistenceImpl.fetchByContactIdAndCommunicationMedium(int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRMTrnContactCommunication crmTrnContactCommunication = list.get(0);

					result = crmTrnContactCommunication;

					cacheResult(crmTrnContactCommunication);

					if ((crmTrnContactCommunication.getContactId() != ContactId) ||
							(crmTrnContactCommunication.getCommunicationMedium() != CommunicationMedium)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
							finderArgs, crmTrnContactCommunication);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
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
			return (CRMTrnContactCommunication)result;
		}
	}

	/**
	 * Removes the c r m trn contact communication where ContactId = &#63; and CommunicationMedium = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @param CommunicationMedium the communication medium
	 * @return the c r m trn contact communication that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication removeByContactIdAndCommunicationMedium(
		int ContactId, int CommunicationMedium)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		CRMTrnContactCommunication crmTrnContactCommunication = findByContactIdAndCommunicationMedium(ContactId,
				CommunicationMedium);

		return remove(crmTrnContactCommunication);
	}

	/**
	 * Returns the number of c r m trn contact communications where ContactId = &#63; and CommunicationMedium = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @param CommunicationMedium the communication medium
	 * @return the number of matching c r m trn contact communications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactIdAndCommunicationMedium(int ContactId,
		int CommunicationMedium) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTIDANDCOMMUNICATIONMEDIUM;

		Object[] finderArgs = new Object[] { ContactId, CommunicationMedium };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMTRNCONTACTCOMMUNICATION_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDCOMMUNICATIONMEDIUM_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDCOMMUNICATIONMEDIUM_COMMUNICATIONMEDIUM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(CommunicationMedium);

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

	private static final String _FINDER_COLUMN_CONTACTIDANDCOMMUNICATIONMEDIUM_CONTACTID_2 =
		"crmTrnContactCommunication.ContactId = ? AND ";
	private static final String _FINDER_COLUMN_CONTACTIDANDCOMMUNICATIONMEDIUM_COMMUNICATIONMEDIUM_2 =
		"crmTrnContactCommunication.CommunicationMedium = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTID = new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactId", new String[] { Integer.class.getName() },
			CRMTrnContactCommunicationModelImpl.CONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTID = new FinderPath(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByContactId", new String[] { Integer.class.getName() });

	/**
	 * Returns the c r m trn contact communication where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @return the matching c r m trn contact communication
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a matching c r m trn contact communication could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication findByContactId(int ContactId)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		CRMTrnContactCommunication crmTrnContactCommunication = fetchByContactId(ContactId);

		if (crmTrnContactCommunication == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRMTrnContactCommunicationException(msg.toString());
		}

		return crmTrnContactCommunication;
	}

	/**
	 * Returns the c r m trn contact communication where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication fetchByContactId(int ContactId)
		throws SystemException {
		return fetchByContactId(ContactId, true);
	}

	/**
	 * Returns the c r m trn contact communication where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m trn contact communication, or <code>null</code> if a matching c r m trn contact communication could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication fetchByContactId(int ContactId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTID,
					finderArgs, this);
		}

		if (result instanceof CRMTrnContactCommunication) {
			CRMTrnContactCommunication crmTrnContactCommunication = (CRMTrnContactCommunication)result;

			if ((ContactId != crmTrnContactCommunication.getContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CRMTRNCONTACTCOMMUNICATION_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				List<CRMTrnContactCommunication> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRMTrnContactCommunicationPersistenceImpl.fetchByContactId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRMTrnContactCommunication crmTrnContactCommunication = list.get(0);

					result = crmTrnContactCommunication;

					cacheResult(crmTrnContactCommunication);

					if ((crmTrnContactCommunication.getContactId() != ContactId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
							finderArgs, crmTrnContactCommunication);
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
			return (CRMTrnContactCommunication)result;
		}
	}

	/**
	 * Removes the c r m trn contact communication where ContactId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @return the c r m trn contact communication that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication removeByContactId(int ContactId)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		CRMTrnContactCommunication crmTrnContactCommunication = findByContactId(ContactId);

		return remove(crmTrnContactCommunication);
	}

	/**
	 * Returns the number of c r m trn contact communications where ContactId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @return the number of matching c r m trn contact communications
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

			query.append(_SQL_COUNT_CRMTRNCONTACTCOMMUNICATION_WHERE);

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

	private static final String _FINDER_COLUMN_CONTACTID_CONTACTID_2 = "crmTrnContactCommunication.ContactId = ?";

	public CRMTrnContactCommunicationPersistenceImpl() {
		setModelClass(CRMTrnContactCommunication.class);
	}

	/**
	 * Caches the c r m trn contact communication in the entity cache if it is enabled.
	 *
	 * @param crmTrnContactCommunication the c r m trn contact communication
	 */
	@Override
	public void cacheResult(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		EntityCacheUtil.putResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class,
			crmTrnContactCommunication.getPrimaryKey(),
			crmTrnContactCommunication);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
			new Object[] {
				crmTrnContactCommunication.getContactId(),
				crmTrnContactCommunication.getCommunicationMedium()
			}, crmTrnContactCommunication);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
			new Object[] { crmTrnContactCommunication.getContactId() },
			crmTrnContactCommunication);

		crmTrnContactCommunication.resetOriginalValues();
	}

	/**
	 * Caches the c r m trn contact communications in the entity cache if it is enabled.
	 *
	 * @param crmTrnContactCommunications the c r m trn contact communications
	 */
	@Override
	public void cacheResult(
		List<CRMTrnContactCommunication> crmTrnContactCommunications) {
		for (CRMTrnContactCommunication crmTrnContactCommunication : crmTrnContactCommunications) {
			if (EntityCacheUtil.getResult(
						CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
						CRMTrnContactCommunicationImpl.class,
						crmTrnContactCommunication.getPrimaryKey()) == null) {
				cacheResult(crmTrnContactCommunication);
			}
			else {
				crmTrnContactCommunication.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c r m trn contact communications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CRMTrnContactCommunicationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CRMTrnContactCommunicationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c r m trn contact communication.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		EntityCacheUtil.removeResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class,
			crmTrnContactCommunication.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(crmTrnContactCommunication);
	}

	@Override
	public void clearCache(
		List<CRMTrnContactCommunication> crmTrnContactCommunications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CRMTrnContactCommunication crmTrnContactCommunication : crmTrnContactCommunications) {
			EntityCacheUtil.removeResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
				CRMTrnContactCommunicationImpl.class,
				crmTrnContactCommunication.getPrimaryKey());

			clearUniqueFindersCache(crmTrnContactCommunication);
		}
	}

	protected void cacheUniqueFindersCache(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		if (crmTrnContactCommunication.isNew()) {
			Object[] args = new Object[] {
					crmTrnContactCommunication.getContactId(),
					crmTrnContactCommunication.getCommunicationMedium()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
				args, crmTrnContactCommunication);

			args = new Object[] { crmTrnContactCommunication.getContactId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
				crmTrnContactCommunication);
		}
		else {
			CRMTrnContactCommunicationModelImpl crmTrnContactCommunicationModelImpl =
				(CRMTrnContactCommunicationModelImpl)crmTrnContactCommunication;

			if ((crmTrnContactCommunicationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmTrnContactCommunication.getContactId(),
						crmTrnContactCommunication.getCommunicationMedium()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
					args, crmTrnContactCommunication);
			}

			if ((crmTrnContactCommunicationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmTrnContactCommunication.getContactId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
					crmTrnContactCommunication);
			}
		}
	}

	protected void clearUniqueFindersCache(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		CRMTrnContactCommunicationModelImpl crmTrnContactCommunicationModelImpl = (CRMTrnContactCommunicationModelImpl)crmTrnContactCommunication;

		Object[] args = new Object[] {
				crmTrnContactCommunication.getContactId(),
				crmTrnContactCommunication.getCommunicationMedium()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
			args);

		if ((crmTrnContactCommunicationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM.getColumnBitmask()) != 0) {
			args = new Object[] {
					crmTrnContactCommunicationModelImpl.getOriginalContactId(),
					crmTrnContactCommunicationModelImpl.getOriginalCommunicationMedium()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDCOMMUNICATIONMEDIUM,
				args);
		}

		args = new Object[] { crmTrnContactCommunication.getContactId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);

		if ((crmTrnContactCommunicationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					crmTrnContactCommunicationModelImpl.getOriginalContactId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);
		}
	}

	/**
	 * Creates a new c r m trn contact communication with the primary key. Does not add the c r m trn contact communication to the database.
	 *
	 * @param ContactCommunicationId the primary key for the new c r m trn contact communication
	 * @return the new c r m trn contact communication
	 */
	@Override
	public CRMTrnContactCommunication create(int ContactCommunicationId) {
		CRMTrnContactCommunication crmTrnContactCommunication = new CRMTrnContactCommunicationImpl();

		crmTrnContactCommunication.setNew(true);
		crmTrnContactCommunication.setPrimaryKey(ContactCommunicationId);

		return crmTrnContactCommunication;
	}

	/**
	 * Removes the c r m trn contact communication with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ContactCommunicationId the primary key of the c r m trn contact communication
	 * @return the c r m trn contact communication that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a c r m trn contact communication with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication remove(int ContactCommunicationId)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		return remove((Serializable)ContactCommunicationId);
	}

	/**
	 * Removes the c r m trn contact communication with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c r m trn contact communication
	 * @return the c r m trn contact communication that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a c r m trn contact communication with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication remove(Serializable primaryKey)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CRMTrnContactCommunication crmTrnContactCommunication = (CRMTrnContactCommunication)session.get(CRMTrnContactCommunicationImpl.class,
					primaryKey);

			if (crmTrnContactCommunication == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCRMTrnContactCommunicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmTrnContactCommunication);
		}
		catch (NoSuchCRMTrnContactCommunicationException nsee) {
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
	protected CRMTrnContactCommunication removeImpl(
		CRMTrnContactCommunication crmTrnContactCommunication)
		throws SystemException {
		crmTrnContactCommunication = toUnwrappedModel(crmTrnContactCommunication);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmTrnContactCommunication)) {
				crmTrnContactCommunication = (CRMTrnContactCommunication)session.get(CRMTrnContactCommunicationImpl.class,
						crmTrnContactCommunication.getPrimaryKeyObj());
			}

			if (crmTrnContactCommunication != null) {
				session.delete(crmTrnContactCommunication);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmTrnContactCommunication != null) {
			clearCache(crmTrnContactCommunication);
		}

		return crmTrnContactCommunication;
	}

	@Override
	public CRMTrnContactCommunication updateImpl(
		com.ifl.rapid.customer.model.CRMTrnContactCommunication crmTrnContactCommunication)
		throws SystemException {
		crmTrnContactCommunication = toUnwrappedModel(crmTrnContactCommunication);

		boolean isNew = crmTrnContactCommunication.isNew();

		Session session = null;

		try {
			session = openSession();

			if (crmTrnContactCommunication.isNew()) {
				session.save(crmTrnContactCommunication);

				crmTrnContactCommunication.setNew(false);
			}
			else {
				session.merge(crmTrnContactCommunication);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!CRMTrnContactCommunicationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnContactCommunicationImpl.class,
			crmTrnContactCommunication.getPrimaryKey(),
			crmTrnContactCommunication);

		clearUniqueFindersCache(crmTrnContactCommunication);
		cacheUniqueFindersCache(crmTrnContactCommunication);

		return crmTrnContactCommunication;
	}

	protected CRMTrnContactCommunication toUnwrappedModel(
		CRMTrnContactCommunication crmTrnContactCommunication) {
		if (crmTrnContactCommunication instanceof CRMTrnContactCommunicationImpl) {
			return crmTrnContactCommunication;
		}

		CRMTrnContactCommunicationImpl crmTrnContactCommunicationImpl = new CRMTrnContactCommunicationImpl();

		crmTrnContactCommunicationImpl.setNew(crmTrnContactCommunication.isNew());
		crmTrnContactCommunicationImpl.setPrimaryKey(crmTrnContactCommunication.getPrimaryKey());

		crmTrnContactCommunicationImpl.setContactCommunicationId(crmTrnContactCommunication.getContactCommunicationId());
		crmTrnContactCommunicationImpl.setContactId(crmTrnContactCommunication.getContactId());
		crmTrnContactCommunicationImpl.setCommunicationMedium(crmTrnContactCommunication.getCommunicationMedium());
		crmTrnContactCommunicationImpl.setCommunicationMediumId(crmTrnContactCommunication.getCommunicationMediumId());
		crmTrnContactCommunicationImpl.setCreatedBy(crmTrnContactCommunication.getCreatedBy());
		crmTrnContactCommunicationImpl.setCreatedDate(crmTrnContactCommunication.getCreatedDate());
		crmTrnContactCommunicationImpl.setModifiedBy(crmTrnContactCommunication.getModifiedBy());
		crmTrnContactCommunicationImpl.setModifiedDate(crmTrnContactCommunication.getModifiedDate());
		crmTrnContactCommunicationImpl.setIsActive(crmTrnContactCommunication.getIsActive());

		return crmTrnContactCommunicationImpl;
	}

	/**
	 * Returns the c r m trn contact communication with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m trn contact communication
	 * @return the c r m trn contact communication
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a c r m trn contact communication with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		CRMTrnContactCommunication crmTrnContactCommunication = fetchByPrimaryKey(primaryKey);

		if (crmTrnContactCommunication == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCRMTrnContactCommunicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmTrnContactCommunication;
	}

	/**
	 * Returns the c r m trn contact communication with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException} if it could not be found.
	 *
	 * @param ContactCommunicationId the primary key of the c r m trn contact communication
	 * @return the c r m trn contact communication
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnContactCommunicationException if a c r m trn contact communication with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication findByPrimaryKey(
		int ContactCommunicationId)
		throws NoSuchCRMTrnContactCommunicationException, SystemException {
		return findByPrimaryKey((Serializable)ContactCommunicationId);
	}

	/**
	 * Returns the c r m trn contact communication with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m trn contact communication
	 * @return the c r m trn contact communication, or <code>null</code> if a c r m trn contact communication with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CRMTrnContactCommunication crmTrnContactCommunication = (CRMTrnContactCommunication)EntityCacheUtil.getResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
				CRMTrnContactCommunicationImpl.class, primaryKey);

		if (crmTrnContactCommunication == _nullCRMTrnContactCommunication) {
			return null;
		}

		if (crmTrnContactCommunication == null) {
			Session session = null;

			try {
				session = openSession();

				crmTrnContactCommunication = (CRMTrnContactCommunication)session.get(CRMTrnContactCommunicationImpl.class,
						primaryKey);

				if (crmTrnContactCommunication != null) {
					cacheResult(crmTrnContactCommunication);
				}
				else {
					EntityCacheUtil.putResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
						CRMTrnContactCommunicationImpl.class, primaryKey,
						_nullCRMTrnContactCommunication);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CRMTrnContactCommunicationModelImpl.ENTITY_CACHE_ENABLED,
					CRMTrnContactCommunicationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmTrnContactCommunication;
	}

	/**
	 * Returns the c r m trn contact communication with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ContactCommunicationId the primary key of the c r m trn contact communication
	 * @return the c r m trn contact communication, or <code>null</code> if a c r m trn contact communication with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnContactCommunication fetchByPrimaryKey(
		int ContactCommunicationId) throws SystemException {
		return fetchByPrimaryKey((Serializable)ContactCommunicationId);
	}

	/**
	 * Returns all the c r m trn contact communications.
	 *
	 * @return the c r m trn contact communications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRMTrnContactCommunication> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c r m trn contact communications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m trn contact communications
	 * @param end the upper bound of the range of c r m trn contact communications (not inclusive)
	 * @return the range of c r m trn contact communications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRMTrnContactCommunication> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c r m trn contact communications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m trn contact communications
	 * @param end the upper bound of the range of c r m trn contact communications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c r m trn contact communications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRMTrnContactCommunication> findAll(int start, int end,
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

		List<CRMTrnContactCommunication> list = (List<CRMTrnContactCommunication>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRMTRNCONTACTCOMMUNICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMTRNCONTACTCOMMUNICATION;

				if (pagination) {
					sql = sql.concat(CRMTrnContactCommunicationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CRMTrnContactCommunication>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CRMTrnContactCommunication>(list);
				}
				else {
					list = (List<CRMTrnContactCommunication>)QueryUtil.list(q,
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
	 * Removes all the c r m trn contact communications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CRMTrnContactCommunication crmTrnContactCommunication : findAll()) {
			remove(crmTrnContactCommunication);
		}
	}

	/**
	 * Returns the number of c r m trn contact communications.
	 *
	 * @return the number of c r m trn contact communications
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

				Query q = session.createQuery(_SQL_COUNT_CRMTRNCONTACTCOMMUNICATION);

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
	 * Initializes the c r m trn contact communication persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.CRMTrnContactCommunication")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CRMTrnContactCommunication>> listenersList = new ArrayList<ModelListener<CRMTrnContactCommunication>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CRMTrnContactCommunication>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CRMTrnContactCommunicationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRMTRNCONTACTCOMMUNICATION = "SELECT crmTrnContactCommunication FROM CRMTrnContactCommunication crmTrnContactCommunication";
	private static final String _SQL_SELECT_CRMTRNCONTACTCOMMUNICATION_WHERE = "SELECT crmTrnContactCommunication FROM CRMTrnContactCommunication crmTrnContactCommunication WHERE ";
	private static final String _SQL_COUNT_CRMTRNCONTACTCOMMUNICATION = "SELECT COUNT(crmTrnContactCommunication) FROM CRMTrnContactCommunication crmTrnContactCommunication";
	private static final String _SQL_COUNT_CRMTRNCONTACTCOMMUNICATION_WHERE = "SELECT COUNT(crmTrnContactCommunication) FROM CRMTrnContactCommunication crmTrnContactCommunication WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmTrnContactCommunication.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CRMTrnContactCommunication exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CRMTrnContactCommunication exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CRMTrnContactCommunicationPersistenceImpl.class);
	private static CRMTrnContactCommunication _nullCRMTrnContactCommunication = new CRMTrnContactCommunicationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CRMTrnContactCommunication> toCacheModel() {
				return _nullCRMTrnContactCommunicationCacheModel;
			}
		};

	private static CacheModel<CRMTrnContactCommunication> _nullCRMTrnContactCommunicationCacheModel =
		new CacheModel<CRMTrnContactCommunication>() {
			@Override
			public CRMTrnContactCommunication toEntityModel() {
				return _nullCRMTrnContactCommunication;
			}
		};
}