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

import com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException;
import com.ifl.rapid.customer.model.CRMTrnFamilyMember;
import com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberImpl;
import com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberModelImpl;

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
 * The persistence implementation for the c r m trn family member service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnFamilyMemberPersistence
 * @see CRMTrnFamilyMemberUtil
 * @generated
 */
public class CRMTrnFamilyMemberPersistenceImpl extends BasePersistenceImpl<CRMTrnFamilyMember>
	implements CRMTrnFamilyMemberPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CRMTrnFamilyMemberUtil} to access the c r m trn family member persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CRMTrnFamilyMemberImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnFamilyMemberImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnFamilyMemberImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID = new FinderPath(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberModelImpl.FINDER_CACHE_ENABLED,
			CRMTrnFamilyMemberImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactIdAndMemberId",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			CRMTrnFamilyMemberModelImpl.CONTACTID_COLUMN_BITMASK |
			CRMTrnFamilyMemberModelImpl.MEMBERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTIDANDMEMBERID = new FinderPath(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByContactIdAndMemberId",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @param MemberId the member ID
	 * @return the matching c r m trn family member
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a matching c r m trn family member could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember findByContactIdAndMemberId(int ContactId,
		int MemberId) throws NoSuchCRMTrnFamilyMemberException, SystemException {
		CRMTrnFamilyMember crmTrnFamilyMember = fetchByContactIdAndMemberId(ContactId,
				MemberId);

		if (crmTrnFamilyMember == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(", MemberId=");
			msg.append(MemberId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRMTrnFamilyMemberException(msg.toString());
		}

		return crmTrnFamilyMember;
	}

	/**
	 * Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param MemberId the member ID
	 * @return the matching c r m trn family member, or <code>null</code> if a matching c r m trn family member could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember fetchByContactIdAndMemberId(int ContactId,
		int MemberId) throws SystemException {
		return fetchByContactIdAndMemberId(ContactId, MemberId, true);
	}

	/**
	 * Returns the c r m trn family member where ContactId = &#63; and MemberId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param MemberId the member ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m trn family member, or <code>null</code> if a matching c r m trn family member could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember fetchByContactIdAndMemberId(int ContactId,
		int MemberId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId, MemberId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
					finderArgs, this);
		}

		if (result instanceof CRMTrnFamilyMember) {
			CRMTrnFamilyMember crmTrnFamilyMember = (CRMTrnFamilyMember)result;

			if ((ContactId != crmTrnFamilyMember.getContactId()) ||
					(MemberId != crmTrnFamilyMember.getMemberId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRMTRNFAMILYMEMBER_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDMEMBERID_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDMEMBERID_MEMBERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(MemberId);

				List<CRMTrnFamilyMember> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRMTrnFamilyMemberPersistenceImpl.fetchByContactIdAndMemberId(int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRMTrnFamilyMember crmTrnFamilyMember = list.get(0);

					result = crmTrnFamilyMember;

					cacheResult(crmTrnFamilyMember);

					if ((crmTrnFamilyMember.getContactId() != ContactId) ||
							(crmTrnFamilyMember.getMemberId() != MemberId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
							finderArgs, crmTrnFamilyMember);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
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
			return (CRMTrnFamilyMember)result;
		}
	}

	/**
	 * Removes the c r m trn family member where ContactId = &#63; and MemberId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @param MemberId the member ID
	 * @return the c r m trn family member that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember removeByContactIdAndMemberId(int ContactId,
		int MemberId) throws NoSuchCRMTrnFamilyMemberException, SystemException {
		CRMTrnFamilyMember crmTrnFamilyMember = findByContactIdAndMemberId(ContactId,
				MemberId);

		return remove(crmTrnFamilyMember);
	}

	/**
	 * Returns the number of c r m trn family members where ContactId = &#63; and MemberId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @param MemberId the member ID
	 * @return the number of matching c r m trn family members
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactIdAndMemberId(int ContactId, int MemberId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTIDANDMEMBERID;

		Object[] finderArgs = new Object[] { ContactId, MemberId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRMTRNFAMILYMEMBER_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDMEMBERID_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDMEMBERID_MEMBERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(MemberId);

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

	private static final String _FINDER_COLUMN_CONTACTIDANDMEMBERID_CONTACTID_2 = "crmTrnFamilyMember.ContactId = ? AND ";
	private static final String _FINDER_COLUMN_CONTACTIDANDMEMBERID_MEMBERID_2 = "crmTrnFamilyMember.MemberId = ?";

	public CRMTrnFamilyMemberPersistenceImpl() {
		setModelClass(CRMTrnFamilyMember.class);
	}

	/**
	 * Caches the c r m trn family member in the entity cache if it is enabled.
	 *
	 * @param crmTrnFamilyMember the c r m trn family member
	 */
	@Override
	public void cacheResult(CRMTrnFamilyMember crmTrnFamilyMember) {
		EntityCacheUtil.putResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberImpl.class, crmTrnFamilyMember.getPrimaryKey(),
			crmTrnFamilyMember);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
			new Object[] {
				crmTrnFamilyMember.getContactId(),
				crmTrnFamilyMember.getMemberId()
			}, crmTrnFamilyMember);

		crmTrnFamilyMember.resetOriginalValues();
	}

	/**
	 * Caches the c r m trn family members in the entity cache if it is enabled.
	 *
	 * @param crmTrnFamilyMembers the c r m trn family members
	 */
	@Override
	public void cacheResult(List<CRMTrnFamilyMember> crmTrnFamilyMembers) {
		for (CRMTrnFamilyMember crmTrnFamilyMember : crmTrnFamilyMembers) {
			if (EntityCacheUtil.getResult(
						CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
						CRMTrnFamilyMemberImpl.class,
						crmTrnFamilyMember.getPrimaryKey()) == null) {
				cacheResult(crmTrnFamilyMember);
			}
			else {
				crmTrnFamilyMember.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c r m trn family members.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CRMTrnFamilyMemberImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CRMTrnFamilyMemberImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c r m trn family member.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CRMTrnFamilyMember crmTrnFamilyMember) {
		EntityCacheUtil.removeResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberImpl.class, crmTrnFamilyMember.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(crmTrnFamilyMember);
	}

	@Override
	public void clearCache(List<CRMTrnFamilyMember> crmTrnFamilyMembers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CRMTrnFamilyMember crmTrnFamilyMember : crmTrnFamilyMembers) {
			EntityCacheUtil.removeResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
				CRMTrnFamilyMemberImpl.class, crmTrnFamilyMember.getPrimaryKey());

			clearUniqueFindersCache(crmTrnFamilyMember);
		}
	}

	protected void cacheUniqueFindersCache(
		CRMTrnFamilyMember crmTrnFamilyMember) {
		if (crmTrnFamilyMember.isNew()) {
			Object[] args = new Object[] {
					crmTrnFamilyMember.getContactId(),
					crmTrnFamilyMember.getMemberId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDMEMBERID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
				args, crmTrnFamilyMember);
		}
		else {
			CRMTrnFamilyMemberModelImpl crmTrnFamilyMemberModelImpl = (CRMTrnFamilyMemberModelImpl)crmTrnFamilyMember;

			if ((crmTrnFamilyMemberModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crmTrnFamilyMember.getContactId(),
						crmTrnFamilyMember.getMemberId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDMEMBERID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
					args, crmTrnFamilyMember);
			}
		}
	}

	protected void clearUniqueFindersCache(
		CRMTrnFamilyMember crmTrnFamilyMember) {
		CRMTrnFamilyMemberModelImpl crmTrnFamilyMemberModelImpl = (CRMTrnFamilyMemberModelImpl)crmTrnFamilyMember;

		Object[] args = new Object[] {
				crmTrnFamilyMember.getContactId(),
				crmTrnFamilyMember.getMemberId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDMEMBERID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
			args);

		if ((crmTrnFamilyMemberModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID.getColumnBitmask()) != 0) {
			args = new Object[] {
					crmTrnFamilyMemberModelImpl.getOriginalContactId(),
					crmTrnFamilyMemberModelImpl.getOriginalMemberId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDMEMBERID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDMEMBERID,
				args);
		}
	}

	/**
	 * Creates a new c r m trn family member with the primary key. Does not add the c r m trn family member to the database.
	 *
	 * @param FamilyMemberId the primary key for the new c r m trn family member
	 * @return the new c r m trn family member
	 */
	@Override
	public CRMTrnFamilyMember create(int FamilyMemberId) {
		CRMTrnFamilyMember crmTrnFamilyMember = new CRMTrnFamilyMemberImpl();

		crmTrnFamilyMember.setNew(true);
		crmTrnFamilyMember.setPrimaryKey(FamilyMemberId);

		return crmTrnFamilyMember;
	}

	/**
	 * Removes the c r m trn family member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FamilyMemberId the primary key of the c r m trn family member
	 * @return the c r m trn family member that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember remove(int FamilyMemberId)
		throws NoSuchCRMTrnFamilyMemberException, SystemException {
		return remove((Serializable)FamilyMemberId);
	}

	/**
	 * Removes the c r m trn family member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c r m trn family member
	 * @return the c r m trn family member that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember remove(Serializable primaryKey)
		throws NoSuchCRMTrnFamilyMemberException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CRMTrnFamilyMember crmTrnFamilyMember = (CRMTrnFamilyMember)session.get(CRMTrnFamilyMemberImpl.class,
					primaryKey);

			if (crmTrnFamilyMember == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCRMTrnFamilyMemberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crmTrnFamilyMember);
		}
		catch (NoSuchCRMTrnFamilyMemberException nsee) {
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
	protected CRMTrnFamilyMember removeImpl(
		CRMTrnFamilyMember crmTrnFamilyMember) throws SystemException {
		crmTrnFamilyMember = toUnwrappedModel(crmTrnFamilyMember);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crmTrnFamilyMember)) {
				crmTrnFamilyMember = (CRMTrnFamilyMember)session.get(CRMTrnFamilyMemberImpl.class,
						crmTrnFamilyMember.getPrimaryKeyObj());
			}

			if (crmTrnFamilyMember != null) {
				session.delete(crmTrnFamilyMember);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crmTrnFamilyMember != null) {
			clearCache(crmTrnFamilyMember);
		}

		return crmTrnFamilyMember;
	}

	@Override
	public CRMTrnFamilyMember updateImpl(
		com.ifl.rapid.customer.model.CRMTrnFamilyMember crmTrnFamilyMember)
		throws SystemException {
		crmTrnFamilyMember = toUnwrappedModel(crmTrnFamilyMember);

		boolean isNew = crmTrnFamilyMember.isNew();

		Session session = null;

		try {
			session = openSession();

			if (crmTrnFamilyMember.isNew()) {
				session.save(crmTrnFamilyMember);

				crmTrnFamilyMember.setNew(false);
			}
			else {
				session.merge(crmTrnFamilyMember);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CRMTrnFamilyMemberModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
			CRMTrnFamilyMemberImpl.class, crmTrnFamilyMember.getPrimaryKey(),
			crmTrnFamilyMember);

		clearUniqueFindersCache(crmTrnFamilyMember);
		cacheUniqueFindersCache(crmTrnFamilyMember);

		return crmTrnFamilyMember;
	}

	protected CRMTrnFamilyMember toUnwrappedModel(
		CRMTrnFamilyMember crmTrnFamilyMember) {
		if (crmTrnFamilyMember instanceof CRMTrnFamilyMemberImpl) {
			return crmTrnFamilyMember;
		}

		CRMTrnFamilyMemberImpl crmTrnFamilyMemberImpl = new CRMTrnFamilyMemberImpl();

		crmTrnFamilyMemberImpl.setNew(crmTrnFamilyMember.isNew());
		crmTrnFamilyMemberImpl.setPrimaryKey(crmTrnFamilyMember.getPrimaryKey());

		crmTrnFamilyMemberImpl.setFamilyMemberId(crmTrnFamilyMember.getFamilyMemberId());
		crmTrnFamilyMemberImpl.setContactId(crmTrnFamilyMember.getContactId());
		crmTrnFamilyMemberImpl.setMemberId(crmTrnFamilyMember.getMemberId());
		crmTrnFamilyMemberImpl.setRelationshipId(crmTrnFamilyMember.getRelationshipId());
		crmTrnFamilyMemberImpl.setFinanciallyDependent(crmTrnFamilyMember.getFinanciallyDependent());
		crmTrnFamilyMemberImpl.setIsActive(crmTrnFamilyMember.getIsActive());
		crmTrnFamilyMemberImpl.setCreatedBy(crmTrnFamilyMember.getCreatedBy());
		crmTrnFamilyMemberImpl.setCreatedDate(crmTrnFamilyMember.getCreatedDate());
		crmTrnFamilyMemberImpl.setModifiedBy(crmTrnFamilyMember.getModifiedBy());
		crmTrnFamilyMemberImpl.setModifiedDate(crmTrnFamilyMember.getModifiedDate());

		return crmTrnFamilyMemberImpl;
	}

	/**
	 * Returns the c r m trn family member with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m trn family member
	 * @return the c r m trn family member
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCRMTrnFamilyMemberException, SystemException {
		CRMTrnFamilyMember crmTrnFamilyMember = fetchByPrimaryKey(primaryKey);

		if (crmTrnFamilyMember == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCRMTrnFamilyMemberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crmTrnFamilyMember;
	}

	/**
	 * Returns the c r m trn family member with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException} if it could not be found.
	 *
	 * @param FamilyMemberId the primary key of the c r m trn family member
	 * @return the c r m trn family member
	 * @throws com.ifl.rapid.customer.NoSuchCRMTrnFamilyMemberException if a c r m trn family member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember findByPrimaryKey(int FamilyMemberId)
		throws NoSuchCRMTrnFamilyMemberException, SystemException {
		return findByPrimaryKey((Serializable)FamilyMemberId);
	}

	/**
	 * Returns the c r m trn family member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m trn family member
	 * @return the c r m trn family member, or <code>null</code> if a c r m trn family member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CRMTrnFamilyMember crmTrnFamilyMember = (CRMTrnFamilyMember)EntityCacheUtil.getResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
				CRMTrnFamilyMemberImpl.class, primaryKey);

		if (crmTrnFamilyMember == _nullCRMTrnFamilyMember) {
			return null;
		}

		if (crmTrnFamilyMember == null) {
			Session session = null;

			try {
				session = openSession();

				crmTrnFamilyMember = (CRMTrnFamilyMember)session.get(CRMTrnFamilyMemberImpl.class,
						primaryKey);

				if (crmTrnFamilyMember != null) {
					cacheResult(crmTrnFamilyMember);
				}
				else {
					EntityCacheUtil.putResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
						CRMTrnFamilyMemberImpl.class, primaryKey,
						_nullCRMTrnFamilyMember);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CRMTrnFamilyMemberModelImpl.ENTITY_CACHE_ENABLED,
					CRMTrnFamilyMemberImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crmTrnFamilyMember;
	}

	/**
	 * Returns the c r m trn family member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FamilyMemberId the primary key of the c r m trn family member
	 * @return the c r m trn family member, or <code>null</code> if a c r m trn family member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRMTrnFamilyMember fetchByPrimaryKey(int FamilyMemberId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)FamilyMemberId);
	}

	/**
	 * Returns all the c r m trn family members.
	 *
	 * @return the c r m trn family members
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRMTrnFamilyMember> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c r m trn family members.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m trn family members
	 * @param end the upper bound of the range of c r m trn family members (not inclusive)
	 * @return the range of c r m trn family members
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRMTrnFamilyMember> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c r m trn family members.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m trn family members
	 * @param end the upper bound of the range of c r m trn family members (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c r m trn family members
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRMTrnFamilyMember> findAll(int start, int end,
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

		List<CRMTrnFamilyMember> list = (List<CRMTrnFamilyMember>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRMTRNFAMILYMEMBER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRMTRNFAMILYMEMBER;

				if (pagination) {
					sql = sql.concat(CRMTrnFamilyMemberModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CRMTrnFamilyMember>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CRMTrnFamilyMember>(list);
				}
				else {
					list = (List<CRMTrnFamilyMember>)QueryUtil.list(q,
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
	 * Removes all the c r m trn family members from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CRMTrnFamilyMember crmTrnFamilyMember : findAll()) {
			remove(crmTrnFamilyMember);
		}
	}

	/**
	 * Returns the number of c r m trn family members.
	 *
	 * @return the number of c r m trn family members
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

				Query q = session.createQuery(_SQL_COUNT_CRMTRNFAMILYMEMBER);

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
	 * Initializes the c r m trn family member persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.CRMTrnFamilyMember")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CRMTrnFamilyMember>> listenersList = new ArrayList<ModelListener<CRMTrnFamilyMember>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CRMTrnFamilyMember>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CRMTrnFamilyMemberImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRMTRNFAMILYMEMBER = "SELECT crmTrnFamilyMember FROM CRMTrnFamilyMember crmTrnFamilyMember";
	private static final String _SQL_SELECT_CRMTRNFAMILYMEMBER_WHERE = "SELECT crmTrnFamilyMember FROM CRMTrnFamilyMember crmTrnFamilyMember WHERE ";
	private static final String _SQL_COUNT_CRMTRNFAMILYMEMBER = "SELECT COUNT(crmTrnFamilyMember) FROM CRMTrnFamilyMember crmTrnFamilyMember";
	private static final String _SQL_COUNT_CRMTRNFAMILYMEMBER_WHERE = "SELECT COUNT(crmTrnFamilyMember) FROM CRMTrnFamilyMember crmTrnFamilyMember WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crmTrnFamilyMember.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CRMTrnFamilyMember exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CRMTrnFamilyMember exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CRMTrnFamilyMemberPersistenceImpl.class);
	private static CRMTrnFamilyMember _nullCRMTrnFamilyMember = new CRMTrnFamilyMemberImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CRMTrnFamilyMember> toCacheModel() {
				return _nullCRMTrnFamilyMemberCacheModel;
			}
		};

	private static CacheModel<CRMTrnFamilyMember> _nullCRMTrnFamilyMemberCacheModel =
		new CacheModel<CRMTrnFamilyMember>() {
			@Override
			public CRMTrnFamilyMember toEntityModel() {
				return _nullCRMTrnFamilyMember;
			}
		};
}