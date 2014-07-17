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

import com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException;
import com.ifl.rapid.customer.model.CRM_Trn_Contact;
import com.ifl.rapid.customer.model.impl.CRM_Trn_ContactImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl;

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
 * The persistence implementation for the c r m_ trn_ contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_ContactPersistence
 * @see CRM_Trn_ContactUtil
 * @generated
 */
public class CRM_Trn_ContactPersistenceImpl extends BasePersistenceImpl<CRM_Trn_Contact>
	implements CRM_Trn_ContactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CRM_Trn_ContactUtil} to access the c r m_ trn_ contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CRM_Trn_ContactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_ContactImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTID = new FinderPath(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_ContactImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactId", new String[] { Integer.class.getName() },
			CRM_Trn_ContactModelImpl.CONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTID = new FinderPath(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByContactId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the c r m_ trn_ contact where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @return the matching c r m_ trn_ contact
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a matching c r m_ trn_ contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact findByContactId(int ContactId)
		throws NoSuchCRM_Trn_ContactException, SystemException {
		CRM_Trn_Contact crm_Trn_Contact = fetchByContactId(ContactId);

		if (crm_Trn_Contact == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRM_Trn_ContactException(msg.toString());
		}

		return crm_Trn_Contact;
	}

	/**
	 * Returns the c r m_ trn_ contact where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @return the matching c r m_ trn_ contact, or <code>null</code> if a matching c r m_ trn_ contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact fetchByContactId(int ContactId)
		throws SystemException {
		return fetchByContactId(ContactId, true);
	}

	/**
	 * Returns the c r m_ trn_ contact where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m_ trn_ contact, or <code>null</code> if a matching c r m_ trn_ contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact fetchByContactId(int ContactId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTID,
					finderArgs, this);
		}

		if (result instanceof CRM_Trn_Contact) {
			CRM_Trn_Contact crm_Trn_Contact = (CRM_Trn_Contact)result;

			if ((ContactId != crm_Trn_Contact.getContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CRM_TRN_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				List<CRM_Trn_Contact> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRM_Trn_ContactPersistenceImpl.fetchByContactId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRM_Trn_Contact crm_Trn_Contact = list.get(0);

					result = crm_Trn_Contact;

					cacheResult(crm_Trn_Contact);

					if ((crm_Trn_Contact.getContactId() != ContactId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
							finderArgs, crm_Trn_Contact);
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
			return (CRM_Trn_Contact)result;
		}
	}

	/**
	 * Removes the c r m_ trn_ contact where ContactId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @return the c r m_ trn_ contact that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact removeByContactId(int ContactId)
		throws NoSuchCRM_Trn_ContactException, SystemException {
		CRM_Trn_Contact crm_Trn_Contact = findByContactId(ContactId);

		return remove(crm_Trn_Contact);
	}

	/**
	 * Returns the number of c r m_ trn_ contacts where ContactId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @return the number of matching c r m_ trn_ contacts
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

			query.append(_SQL_COUNT_CRM_TRN_CONTACT_WHERE);

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

	private static final String _FINDER_COLUMN_CONTACTID_CONTACTID_2 = "crm_Trn_Contact.ContactId = ?";

	public CRM_Trn_ContactPersistenceImpl() {
		setModelClass(CRM_Trn_Contact.class);
	}

	/**
	 * Caches the c r m_ trn_ contact in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_Contact the c r m_ trn_ contact
	 */
	@Override
	public void cacheResult(CRM_Trn_Contact crm_Trn_Contact) {
		EntityCacheUtil.putResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactImpl.class, crm_Trn_Contact.getPrimaryKey(),
			crm_Trn_Contact);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
			new Object[] { crm_Trn_Contact.getContactId() }, crm_Trn_Contact);

		crm_Trn_Contact.resetOriginalValues();
	}

	/**
	 * Caches the c r m_ trn_ contacts in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_Contacts the c r m_ trn_ contacts
	 */
	@Override
	public void cacheResult(List<CRM_Trn_Contact> crm_Trn_Contacts) {
		for (CRM_Trn_Contact crm_Trn_Contact : crm_Trn_Contacts) {
			if (EntityCacheUtil.getResult(
						CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_ContactImpl.class,
						crm_Trn_Contact.getPrimaryKey()) == null) {
				cacheResult(crm_Trn_Contact);
			}
			else {
				crm_Trn_Contact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c r m_ trn_ contacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CRM_Trn_ContactImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CRM_Trn_ContactImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c r m_ trn_ contact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CRM_Trn_Contact crm_Trn_Contact) {
		EntityCacheUtil.removeResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactImpl.class, crm_Trn_Contact.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(crm_Trn_Contact);
	}

	@Override
	public void clearCache(List<CRM_Trn_Contact> crm_Trn_Contacts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CRM_Trn_Contact crm_Trn_Contact : crm_Trn_Contacts) {
			EntityCacheUtil.removeResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_ContactImpl.class, crm_Trn_Contact.getPrimaryKey());

			clearUniqueFindersCache(crm_Trn_Contact);
		}
	}

	protected void cacheUniqueFindersCache(CRM_Trn_Contact crm_Trn_Contact) {
		if (crm_Trn_Contact.isNew()) {
			Object[] args = new Object[] { crm_Trn_Contact.getContactId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
				crm_Trn_Contact);
		}
		else {
			CRM_Trn_ContactModelImpl crm_Trn_ContactModelImpl = (CRM_Trn_ContactModelImpl)crm_Trn_Contact;

			if ((crm_Trn_ContactModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crm_Trn_Contact.getContactId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
					crm_Trn_Contact);
			}
		}
	}

	protected void clearUniqueFindersCache(CRM_Trn_Contact crm_Trn_Contact) {
		CRM_Trn_ContactModelImpl crm_Trn_ContactModelImpl = (CRM_Trn_ContactModelImpl)crm_Trn_Contact;

		Object[] args = new Object[] { crm_Trn_Contact.getContactId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);

		if ((crm_Trn_ContactModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
			args = new Object[] { crm_Trn_ContactModelImpl.getOriginalContactId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);
		}
	}

	/**
	 * Creates a new c r m_ trn_ contact with the primary key. Does not add the c r m_ trn_ contact to the database.
	 *
	 * @param ContactId the primary key for the new c r m_ trn_ contact
	 * @return the new c r m_ trn_ contact
	 */
	@Override
	public CRM_Trn_Contact create(int ContactId) {
		CRM_Trn_Contact crm_Trn_Contact = new CRM_Trn_ContactImpl();

		crm_Trn_Contact.setNew(true);
		crm_Trn_Contact.setPrimaryKey(ContactId);

		return crm_Trn_Contact;
	}

	/**
	 * Removes the c r m_ trn_ contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ContactId the primary key of the c r m_ trn_ contact
	 * @return the c r m_ trn_ contact that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a c r m_ trn_ contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact remove(int ContactId)
		throws NoSuchCRM_Trn_ContactException, SystemException {
		return remove((Serializable)ContactId);
	}

	/**
	 * Removes the c r m_ trn_ contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ contact
	 * @return the c r m_ trn_ contact that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a c r m_ trn_ contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact remove(Serializable primaryKey)
		throws NoSuchCRM_Trn_ContactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CRM_Trn_Contact crm_Trn_Contact = (CRM_Trn_Contact)session.get(CRM_Trn_ContactImpl.class,
					primaryKey);

			if (crm_Trn_Contact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCRM_Trn_ContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crm_Trn_Contact);
		}
		catch (NoSuchCRM_Trn_ContactException nsee) {
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
	protected CRM_Trn_Contact removeImpl(CRM_Trn_Contact crm_Trn_Contact)
		throws SystemException {
		crm_Trn_Contact = toUnwrappedModel(crm_Trn_Contact);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crm_Trn_Contact)) {
				crm_Trn_Contact = (CRM_Trn_Contact)session.get(CRM_Trn_ContactImpl.class,
						crm_Trn_Contact.getPrimaryKeyObj());
			}

			if (crm_Trn_Contact != null) {
				session.delete(crm_Trn_Contact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crm_Trn_Contact != null) {
			clearCache(crm_Trn_Contact);
		}

		return crm_Trn_Contact;
	}

	@Override
	public CRM_Trn_Contact updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_Contact crm_Trn_Contact)
		throws SystemException {
		crm_Trn_Contact = toUnwrappedModel(crm_Trn_Contact);

		boolean isNew = crm_Trn_Contact.isNew();

		Session session = null;

		try {
			session = openSession();

			if (crm_Trn_Contact.isNew()) {
				session.save(crm_Trn_Contact);

				crm_Trn_Contact.setNew(false);
			}
			else {
				session.evict(crm_Trn_Contact);
				session.saveOrUpdate(crm_Trn_Contact);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CRM_Trn_ContactModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_ContactImpl.class, crm_Trn_Contact.getPrimaryKey(),
			crm_Trn_Contact);

		clearUniqueFindersCache(crm_Trn_Contact);
		cacheUniqueFindersCache(crm_Trn_Contact);

		crm_Trn_Contact.resetOriginalValues();

		return crm_Trn_Contact;
	}

	protected CRM_Trn_Contact toUnwrappedModel(CRM_Trn_Contact crm_Trn_Contact) {
		if (crm_Trn_Contact instanceof CRM_Trn_ContactImpl) {
			return crm_Trn_Contact;
		}

		CRM_Trn_ContactImpl crm_Trn_ContactImpl = new CRM_Trn_ContactImpl();

		crm_Trn_ContactImpl.setNew(crm_Trn_Contact.isNew());
		crm_Trn_ContactImpl.setPrimaryKey(crm_Trn_Contact.getPrimaryKey());

		crm_Trn_ContactImpl.setContactId(crm_Trn_Contact.getContactId());
		crm_Trn_ContactImpl.setSalutation(crm_Trn_Contact.getSalutation());
		crm_Trn_ContactImpl.setFirstName(crm_Trn_Contact.getFirstName());
		crm_Trn_ContactImpl.setMiddleName(crm_Trn_Contact.getMiddleName());
		crm_Trn_ContactImpl.setLastName(crm_Trn_Contact.getLastName());
		crm_Trn_ContactImpl.setPANNo(crm_Trn_Contact.getPANNo());
		crm_Trn_ContactImpl.setGender(crm_Trn_Contact.getGender());
		crm_Trn_ContactImpl.setBloodGroup(crm_Trn_Contact.getBloodGroup());
		crm_Trn_ContactImpl.setDateOfBirth(crm_Trn_Contact.getDateOfBirth());
		crm_Trn_ContactImpl.setMaritalStatus(crm_Trn_Contact.getMaritalStatus());
		crm_Trn_ContactImpl.setQualificationId(crm_Trn_Contact.getQualificationId());
		crm_Trn_ContactImpl.setOccupationId(crm_Trn_Contact.getOccupationId());
		crm_Trn_ContactImpl.setSourceId(crm_Trn_Contact.getSourceId());
		crm_Trn_ContactImpl.setCategoryId(crm_Trn_Contact.getCategoryId());
		crm_Trn_ContactImpl.setReferredBy(crm_Trn_Contact.getReferredBy());
		crm_Trn_ContactImpl.setContactTypeId(crm_Trn_Contact.getContactTypeId());
		crm_Trn_ContactImpl.setDNDActivated(crm_Trn_Contact.isDNDActivated());
		crm_Trn_ContactImpl.setPoliticallyExposed(crm_Trn_Contact.isPoliticallyExposed());
		crm_Trn_ContactImpl.setEIANumber(crm_Trn_Contact.getEIANumber());
		crm_Trn_ContactImpl.setSeqGenerator(crm_Trn_Contact.getSeqGenerator());
		crm_Trn_ContactImpl.setReferenceNo(crm_Trn_Contact.getReferenceNo());
		crm_Trn_ContactImpl.setEIAServiceProvider(crm_Trn_Contact.getEIAServiceProvider());
		crm_Trn_ContactImpl.setAadharCardNo(crm_Trn_Contact.getAadharCardNo());
		crm_Trn_ContactImpl.setWeddingAnniversary(crm_Trn_Contact.getWeddingAnniversary());
		crm_Trn_ContactImpl.setPhotograph(crm_Trn_Contact.getPhotograph());
		crm_Trn_ContactImpl.setCreatedBy(crm_Trn_Contact.getCreatedBy());
		crm_Trn_ContactImpl.setCreatedDate(crm_Trn_Contact.getCreatedDate());
		crm_Trn_ContactImpl.setModifiedBy(crm_Trn_Contact.getModifiedBy());
		crm_Trn_ContactImpl.setModifiedDate(crm_Trn_Contact.getModifiedDate());
		crm_Trn_ContactImpl.setIsActive(crm_Trn_Contact.getIsActive());

		return crm_Trn_ContactImpl;
	}

	/**
	 * Returns the c r m_ trn_ contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ contact
	 * @return the c r m_ trn_ contact
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a c r m_ trn_ contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCRM_Trn_ContactException, SystemException {
		CRM_Trn_Contact crm_Trn_Contact = fetchByPrimaryKey(primaryKey);

		if (crm_Trn_Contact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCRM_Trn_ContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crm_Trn_Contact;
	}

	/**
	 * Returns the c r m_ trn_ contact with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException} if it could not be found.
	 *
	 * @param ContactId the primary key of the c r m_ trn_ contact
	 * @return the c r m_ trn_ contact
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_ContactException if a c r m_ trn_ contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact findByPrimaryKey(int ContactId)
		throws NoSuchCRM_Trn_ContactException, SystemException {
		return findByPrimaryKey((Serializable)ContactId);
	}

	/**
	 * Returns the c r m_ trn_ contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ contact
	 * @return the c r m_ trn_ contact, or <code>null</code> if a c r m_ trn_ contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CRM_Trn_Contact crm_Trn_Contact = (CRM_Trn_Contact)EntityCacheUtil.getResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_ContactImpl.class, primaryKey);

		if (crm_Trn_Contact == _nullCRM_Trn_Contact) {
			return null;
		}

		if (crm_Trn_Contact == null) {
			Session session = null;

			try {
				session = openSession();

				crm_Trn_Contact = (CRM_Trn_Contact)session.get(CRM_Trn_ContactImpl.class,
						primaryKey);

				if (crm_Trn_Contact != null) {
					cacheResult(crm_Trn_Contact);
				}
				else {
					EntityCacheUtil.putResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_ContactImpl.class, primaryKey,
						_nullCRM_Trn_Contact);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CRM_Trn_ContactModelImpl.ENTITY_CACHE_ENABLED,
					CRM_Trn_ContactImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crm_Trn_Contact;
	}

	/**
	 * Returns the c r m_ trn_ contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ContactId the primary key of the c r m_ trn_ contact
	 * @return the c r m_ trn_ contact, or <code>null</code> if a c r m_ trn_ contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Contact fetchByPrimaryKey(int ContactId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ContactId);
	}

	/**
	 * Returns all the c r m_ trn_ contacts.
	 *
	 * @return the c r m_ trn_ contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Contact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c r m_ trn_ contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ contacts
	 * @param end the upper bound of the range of c r m_ trn_ contacts (not inclusive)
	 * @return the range of c r m_ trn_ contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Contact> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c r m_ trn_ contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ contacts
	 * @param end the upper bound of the range of c r m_ trn_ contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c r m_ trn_ contacts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Contact> findAll(int start, int end,
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

		List<CRM_Trn_Contact> list = (List<CRM_Trn_Contact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRM_TRN_CONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRM_TRN_CONTACT;

				if (pagination) {
					sql = sql.concat(CRM_Trn_ContactModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CRM_Trn_Contact>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CRM_Trn_Contact>(list);
				}
				else {
					list = (List<CRM_Trn_Contact>)QueryUtil.list(q,
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
	 * Removes all the c r m_ trn_ contacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CRM_Trn_Contact crm_Trn_Contact : findAll()) {
			remove(crm_Trn_Contact);
		}
	}

	/**
	 * Returns the number of c r m_ trn_ contacts.
	 *
	 * @return the number of c r m_ trn_ contacts
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

				Query q = session.createQuery(_SQL_COUNT_CRM_TRN_CONTACT);

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
	 * Initializes the c r m_ trn_ contact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.CRM_Trn_Contact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CRM_Trn_Contact>> listenersList = new ArrayList<ModelListener<CRM_Trn_Contact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CRM_Trn_Contact>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CRM_Trn_ContactImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRM_TRN_CONTACT = "SELECT crm_Trn_Contact FROM CRM_Trn_Contact crm_Trn_Contact";
	private static final String _SQL_SELECT_CRM_TRN_CONTACT_WHERE = "SELECT crm_Trn_Contact FROM CRM_Trn_Contact crm_Trn_Contact WHERE ";
	private static final String _SQL_COUNT_CRM_TRN_CONTACT = "SELECT COUNT(crm_Trn_Contact) FROM CRM_Trn_Contact crm_Trn_Contact";
	private static final String _SQL_COUNT_CRM_TRN_CONTACT_WHERE = "SELECT COUNT(crm_Trn_Contact) FROM CRM_Trn_Contact crm_Trn_Contact WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crm_Trn_Contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CRM_Trn_Contact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CRM_Trn_Contact exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CRM_Trn_ContactPersistenceImpl.class);
	private static CRM_Trn_Contact _nullCRM_Trn_Contact = new CRM_Trn_ContactImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CRM_Trn_Contact> toCacheModel() {
				return _nullCRM_Trn_ContactCacheModel;
			}
		};

	private static CacheModel<CRM_Trn_Contact> _nullCRM_Trn_ContactCacheModel = new CacheModel<CRM_Trn_Contact>() {
			@Override
			public CRM_Trn_Contact toEntityModel() {
				return _nullCRM_Trn_Contact;
			}
		};
}