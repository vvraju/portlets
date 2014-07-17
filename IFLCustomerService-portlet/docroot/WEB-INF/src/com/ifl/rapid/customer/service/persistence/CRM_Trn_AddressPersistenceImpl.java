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

import com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException;
import com.ifl.rapid.customer.model.CRM_Trn_Address;
import com.ifl.rapid.customer.model.impl.CRM_Trn_AddressImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_AddressModelImpl;

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
 * The persistence implementation for the c r m_ trn_ address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_AddressPersistence
 * @see CRM_Trn_AddressUtil
 * @generated
 */
public class CRM_Trn_AddressPersistenceImpl extends BasePersistenceImpl<CRM_Trn_Address>
	implements CRM_Trn_AddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CRM_Trn_AddressUtil} to access the c r m_ trn_ address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CRM_Trn_AddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID =
		new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactIdAndAddressTypeId",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			CRM_Trn_AddressModelImpl.CONTACTID_COLUMN_BITMASK |
			CRM_Trn_AddressModelImpl.ADDRESSTYPEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTIDANDADDRESSTYPEID =
		new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByContactIdAndAddressTypeId",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the c r m_ trn_ address where ContactId = &#63; and AddressTypeId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @param AddressTypeId the address type ID
	 * @return the matching c r m_ trn_ address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a matching c r m_ trn_ address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address findByContactIdAndAddressTypeId(int ContactId,
		int AddressTypeId)
		throws NoSuchCRM_Trn_AddressException, SystemException {
		CRM_Trn_Address crm_Trn_Address = fetchByContactIdAndAddressTypeId(ContactId,
				AddressTypeId);

		if (crm_Trn_Address == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(", AddressTypeId=");
			msg.append(AddressTypeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRM_Trn_AddressException(msg.toString());
		}

		return crm_Trn_Address;
	}

	/**
	 * Returns the c r m_ trn_ address where ContactId = &#63; and AddressTypeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param AddressTypeId the address type ID
	 * @return the matching c r m_ trn_ address, or <code>null</code> if a matching c r m_ trn_ address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address fetchByContactIdAndAddressTypeId(int ContactId,
		int AddressTypeId) throws SystemException {
		return fetchByContactIdAndAddressTypeId(ContactId, AddressTypeId, true);
	}

	/**
	 * Returns the c r m_ trn_ address where ContactId = &#63; and AddressTypeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param AddressTypeId the address type ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m_ trn_ address, or <code>null</code> if a matching c r m_ trn_ address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address fetchByContactIdAndAddressTypeId(int ContactId,
		int AddressTypeId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId, AddressTypeId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
					finderArgs, this);
		}

		if (result instanceof CRM_Trn_Address) {
			CRM_Trn_Address crm_Trn_Address = (CRM_Trn_Address)result;

			if ((ContactId != crm_Trn_Address.getContactId()) ||
					(AddressTypeId != crm_Trn_Address.getAddressTypeId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRM_TRN_ADDRESS_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDADDRESSTYPEID_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDADDRESSTYPEID_ADDRESSTYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(AddressTypeId);

				List<CRM_Trn_Address> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRM_Trn_AddressPersistenceImpl.fetchByContactIdAndAddressTypeId(int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRM_Trn_Address crm_Trn_Address = list.get(0);

					result = crm_Trn_Address;

					cacheResult(crm_Trn_Address);

					if ((crm_Trn_Address.getContactId() != ContactId) ||
							(crm_Trn_Address.getAddressTypeId() != AddressTypeId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
							finderArgs, crm_Trn_Address);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
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
			return (CRM_Trn_Address)result;
		}
	}

	/**
	 * Removes the c r m_ trn_ address where ContactId = &#63; and AddressTypeId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @param AddressTypeId the address type ID
	 * @return the c r m_ trn_ address that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address removeByContactIdAndAddressTypeId(int ContactId,
		int AddressTypeId)
		throws NoSuchCRM_Trn_AddressException, SystemException {
		CRM_Trn_Address crm_Trn_Address = findByContactIdAndAddressTypeId(ContactId,
				AddressTypeId);

		return remove(crm_Trn_Address);
	}

	/**
	 * Returns the number of c r m_ trn_ addresses where ContactId = &#63; and AddressTypeId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @param AddressTypeId the address type ID
	 * @return the number of matching c r m_ trn_ addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactIdAndAddressTypeId(int ContactId, int AddressTypeId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTIDANDADDRESSTYPEID;

		Object[] finderArgs = new Object[] { ContactId, AddressTypeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRM_TRN_ADDRESS_WHERE);

			query.append(_FINDER_COLUMN_CONTACTIDANDADDRESSTYPEID_CONTACTID_2);

			query.append(_FINDER_COLUMN_CONTACTIDANDADDRESSTYPEID_ADDRESSTYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				qPos.add(AddressTypeId);

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

	private static final String _FINDER_COLUMN_CONTACTIDANDADDRESSTYPEID_CONTACTID_2 =
		"crm_Trn_Address.ContactId = ? AND ";
	private static final String _FINDER_COLUMN_CONTACTIDANDADDRESSTYPEID_ADDRESSTYPEID_2 =
		"crm_Trn_Address.AddressTypeId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID = new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByAddressIdAndContactId",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			CRM_Trn_AddressModelImpl.ADDRESSID_COLUMN_BITMASK |
			CRM_Trn_AddressModelImpl.CONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ADDRESSIDANDCONTACTID = new FinderPath(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAddressIdAndContactId",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the c r m_ trn_ address where AddressId = &#63; and ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException} if it could not be found.
	 *
	 * @param AddressId the address ID
	 * @param ContactId the contact ID
	 * @return the matching c r m_ trn_ address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a matching c r m_ trn_ address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address findByAddressIdAndContactId(int AddressId,
		int ContactId) throws NoSuchCRM_Trn_AddressException, SystemException {
		CRM_Trn_Address crm_Trn_Address = fetchByAddressIdAndContactId(AddressId,
				ContactId);

		if (crm_Trn_Address == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("AddressId=");
			msg.append(AddressId);

			msg.append(", ContactId=");
			msg.append(ContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRM_Trn_AddressException(msg.toString());
		}

		return crm_Trn_Address;
	}

	/**
	 * Returns the c r m_ trn_ address where AddressId = &#63; and ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param AddressId the address ID
	 * @param ContactId the contact ID
	 * @return the matching c r m_ trn_ address, or <code>null</code> if a matching c r m_ trn_ address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address fetchByAddressIdAndContactId(int AddressId,
		int ContactId) throws SystemException {
		return fetchByAddressIdAndContactId(AddressId, ContactId, true);
	}

	/**
	 * Returns the c r m_ trn_ address where AddressId = &#63; and ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param AddressId the address ID
	 * @param ContactId the contact ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m_ trn_ address, or <code>null</code> if a matching c r m_ trn_ address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address fetchByAddressIdAndContactId(int AddressId,
		int ContactId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { AddressId, ContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
					finderArgs, this);
		}

		if (result instanceof CRM_Trn_Address) {
			CRM_Trn_Address crm_Trn_Address = (CRM_Trn_Address)result;

			if ((AddressId != crm_Trn_Address.getAddressId()) ||
					(ContactId != crm_Trn_Address.getContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRM_TRN_ADDRESS_WHERE);

			query.append(_FINDER_COLUMN_ADDRESSIDANDCONTACTID_ADDRESSID_2);

			query.append(_FINDER_COLUMN_ADDRESSIDANDCONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(AddressId);

				qPos.add(ContactId);

				List<CRM_Trn_Address> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRM_Trn_AddressPersistenceImpl.fetchByAddressIdAndContactId(int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRM_Trn_Address crm_Trn_Address = list.get(0);

					result = crm_Trn_Address;

					cacheResult(crm_Trn_Address);

					if ((crm_Trn_Address.getAddressId() != AddressId) ||
							(crm_Trn_Address.getContactId() != ContactId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
							finderArgs, crm_Trn_Address);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
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
			return (CRM_Trn_Address)result;
		}
	}

	/**
	 * Removes the c r m_ trn_ address where AddressId = &#63; and ContactId = &#63; from the database.
	 *
	 * @param AddressId the address ID
	 * @param ContactId the contact ID
	 * @return the c r m_ trn_ address that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address removeByAddressIdAndContactId(int AddressId,
		int ContactId) throws NoSuchCRM_Trn_AddressException, SystemException {
		CRM_Trn_Address crm_Trn_Address = findByAddressIdAndContactId(AddressId,
				ContactId);

		return remove(crm_Trn_Address);
	}

	/**
	 * Returns the number of c r m_ trn_ addresses where AddressId = &#63; and ContactId = &#63;.
	 *
	 * @param AddressId the address ID
	 * @param ContactId the contact ID
	 * @return the number of matching c r m_ trn_ addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAddressIdAndContactId(int AddressId, int ContactId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ADDRESSIDANDCONTACTID;

		Object[] finderArgs = new Object[] { AddressId, ContactId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRM_TRN_ADDRESS_WHERE);

			query.append(_FINDER_COLUMN_ADDRESSIDANDCONTACTID_ADDRESSID_2);

			query.append(_FINDER_COLUMN_ADDRESSIDANDCONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(AddressId);

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

	private static final String _FINDER_COLUMN_ADDRESSIDANDCONTACTID_ADDRESSID_2 =
		"crm_Trn_Address.AddressId = ? AND ";
	private static final String _FINDER_COLUMN_ADDRESSIDANDCONTACTID_CONTACTID_2 =
		"crm_Trn_Address.ContactId = ?";

	public CRM_Trn_AddressPersistenceImpl() {
		setModelClass(CRM_Trn_Address.class);
	}

	/**
	 * Caches the c r m_ trn_ address in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_Address the c r m_ trn_ address
	 */
	@Override
	public void cacheResult(CRM_Trn_Address crm_Trn_Address) {
		EntityCacheUtil.putResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class, crm_Trn_Address.getPrimaryKey(),
			crm_Trn_Address);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
			new Object[] {
				crm_Trn_Address.getContactId(),
				crm_Trn_Address.getAddressTypeId()
			}, crm_Trn_Address);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
			new Object[] {
				crm_Trn_Address.getAddressId(), crm_Trn_Address.getContactId()
			}, crm_Trn_Address);

		crm_Trn_Address.resetOriginalValues();
	}

	/**
	 * Caches the c r m_ trn_ addresses in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_Addresses the c r m_ trn_ addresses
	 */
	@Override
	public void cacheResult(List<CRM_Trn_Address> crm_Trn_Addresses) {
		for (CRM_Trn_Address crm_Trn_Address : crm_Trn_Addresses) {
			if (EntityCacheUtil.getResult(
						CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_AddressImpl.class,
						crm_Trn_Address.getPrimaryKey()) == null) {
				cacheResult(crm_Trn_Address);
			}
			else {
				crm_Trn_Address.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c r m_ trn_ addresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CRM_Trn_AddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CRM_Trn_AddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c r m_ trn_ address.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CRM_Trn_Address crm_Trn_Address) {
		EntityCacheUtil.removeResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class, crm_Trn_Address.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(crm_Trn_Address);
	}

	@Override
	public void clearCache(List<CRM_Trn_Address> crm_Trn_Addresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CRM_Trn_Address crm_Trn_Address : crm_Trn_Addresses) {
			EntityCacheUtil.removeResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_AddressImpl.class, crm_Trn_Address.getPrimaryKey());

			clearUniqueFindersCache(crm_Trn_Address);
		}
	}

	protected void cacheUniqueFindersCache(CRM_Trn_Address crm_Trn_Address) {
		if (crm_Trn_Address.isNew()) {
			Object[] args = new Object[] {
					crm_Trn_Address.getContactId(),
					crm_Trn_Address.getAddressTypeId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDADDRESSTYPEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
				args, crm_Trn_Address);

			args = new Object[] {
					crm_Trn_Address.getAddressId(),
					crm_Trn_Address.getContactId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ADDRESSIDANDCONTACTID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
				args, crm_Trn_Address);
		}
		else {
			CRM_Trn_AddressModelImpl crm_Trn_AddressModelImpl = (CRM_Trn_AddressModelImpl)crm_Trn_Address;

			if ((crm_Trn_AddressModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crm_Trn_Address.getContactId(),
						crm_Trn_Address.getAddressTypeId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTIDANDADDRESSTYPEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
					args, crm_Trn_Address);
			}

			if ((crm_Trn_AddressModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						crm_Trn_Address.getAddressId(),
						crm_Trn_Address.getContactId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ADDRESSIDANDCONTACTID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
					args, crm_Trn_Address);
			}
		}
	}

	protected void clearUniqueFindersCache(CRM_Trn_Address crm_Trn_Address) {
		CRM_Trn_AddressModelImpl crm_Trn_AddressModelImpl = (CRM_Trn_AddressModelImpl)crm_Trn_Address;

		Object[] args = new Object[] {
				crm_Trn_Address.getContactId(),
				crm_Trn_Address.getAddressTypeId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDADDRESSTYPEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
			args);

		if ((crm_Trn_AddressModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					crm_Trn_AddressModelImpl.getOriginalContactId(),
					crm_Trn_AddressModelImpl.getOriginalAddressTypeId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTIDANDADDRESSTYPEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTIDANDADDRESSTYPEID,
				args);
		}

		args = new Object[] {
				crm_Trn_Address.getAddressId(), crm_Trn_Address.getContactId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ADDRESSIDANDCONTACTID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
			args);

		if ((crm_Trn_AddressModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					crm_Trn_AddressModelImpl.getOriginalAddressId(),
					crm_Trn_AddressModelImpl.getOriginalContactId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ADDRESSIDANDCONTACTID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ADDRESSIDANDCONTACTID,
				args);
		}
	}

	/**
	 * Creates a new c r m_ trn_ address with the primary key. Does not add the c r m_ trn_ address to the database.
	 *
	 * @param AddressId the primary key for the new c r m_ trn_ address
	 * @return the new c r m_ trn_ address
	 */
	@Override
	public CRM_Trn_Address create(int AddressId) {
		CRM_Trn_Address crm_Trn_Address = new CRM_Trn_AddressImpl();

		crm_Trn_Address.setNew(true);
		crm_Trn_Address.setPrimaryKey(AddressId);

		return crm_Trn_Address;
	}

	/**
	 * Removes the c r m_ trn_ address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param AddressId the primary key of the c r m_ trn_ address
	 * @return the c r m_ trn_ address that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a c r m_ trn_ address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address remove(int AddressId)
		throws NoSuchCRM_Trn_AddressException, SystemException {
		return remove((Serializable)AddressId);
	}

	/**
	 * Removes the c r m_ trn_ address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ address
	 * @return the c r m_ trn_ address that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a c r m_ trn_ address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address remove(Serializable primaryKey)
		throws NoSuchCRM_Trn_AddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CRM_Trn_Address crm_Trn_Address = (CRM_Trn_Address)session.get(CRM_Trn_AddressImpl.class,
					primaryKey);

			if (crm_Trn_Address == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCRM_Trn_AddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crm_Trn_Address);
		}
		catch (NoSuchCRM_Trn_AddressException nsee) {
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
	protected CRM_Trn_Address removeImpl(CRM_Trn_Address crm_Trn_Address)
		throws SystemException {
		crm_Trn_Address = toUnwrappedModel(crm_Trn_Address);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crm_Trn_Address)) {
				crm_Trn_Address = (CRM_Trn_Address)session.get(CRM_Trn_AddressImpl.class,
						crm_Trn_Address.getPrimaryKeyObj());
			}

			if (crm_Trn_Address != null) {
				session.delete(crm_Trn_Address);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crm_Trn_Address != null) {
			clearCache(crm_Trn_Address);
		}

		return crm_Trn_Address;
	}

	@Override
	public CRM_Trn_Address updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_Address crm_Trn_Address)
		throws SystemException {
		crm_Trn_Address = toUnwrappedModel(crm_Trn_Address);

		boolean isNew = crm_Trn_Address.isNew();

		Session session = null;

		try {
			session = openSession();

			if (crm_Trn_Address.isNew()) {
				session.save(crm_Trn_Address);

				crm_Trn_Address.setNew(false);
			}
			else {
				session.merge(crm_Trn_Address);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CRM_Trn_AddressModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_AddressImpl.class, crm_Trn_Address.getPrimaryKey(),
			crm_Trn_Address);

		clearUniqueFindersCache(crm_Trn_Address);
		cacheUniqueFindersCache(crm_Trn_Address);

		return crm_Trn_Address;
	}

	protected CRM_Trn_Address toUnwrappedModel(CRM_Trn_Address crm_Trn_Address) {
		if (crm_Trn_Address instanceof CRM_Trn_AddressImpl) {
			return crm_Trn_Address;
		}

		CRM_Trn_AddressImpl crm_Trn_AddressImpl = new CRM_Trn_AddressImpl();

		crm_Trn_AddressImpl.setNew(crm_Trn_Address.isNew());
		crm_Trn_AddressImpl.setPrimaryKey(crm_Trn_Address.getPrimaryKey());

		crm_Trn_AddressImpl.setAddressId(crm_Trn_Address.getAddressId());
		crm_Trn_AddressImpl.setContactId(crm_Trn_Address.getContactId());
		crm_Trn_AddressImpl.setAddressTypeId(crm_Trn_Address.getAddressTypeId());
		crm_Trn_AddressImpl.setAddressLine1(crm_Trn_Address.getAddressLine1());
		crm_Trn_AddressImpl.setAddressLine2(crm_Trn_Address.getAddressLine2());
		crm_Trn_AddressImpl.setAddressLine3(crm_Trn_Address.getAddressLine3());
		crm_Trn_AddressImpl.setDistrict(crm_Trn_Address.getDistrict());
		crm_Trn_AddressImpl.setStateId(crm_Trn_Address.getStateId());
		crm_Trn_AddressImpl.setCityId(crm_Trn_Address.getCityId());
		crm_Trn_AddressImpl.setPincode(crm_Trn_Address.getPincode());
		crm_Trn_AddressImpl.setCountryId(crm_Trn_Address.getCountryId());
		crm_Trn_AddressImpl.setIsActive(crm_Trn_Address.getIsActive());
		crm_Trn_AddressImpl.setCreatedBy(crm_Trn_Address.getCreatedBy());
		crm_Trn_AddressImpl.setCreatedDate(crm_Trn_Address.getCreatedDate());
		crm_Trn_AddressImpl.setModifiedBy(crm_Trn_Address.getModifiedBy());
		crm_Trn_AddressImpl.setModifiedDate(crm_Trn_Address.getModifiedDate());

		return crm_Trn_AddressImpl;
	}

	/**
	 * Returns the c r m_ trn_ address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ address
	 * @return the c r m_ trn_ address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a c r m_ trn_ address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCRM_Trn_AddressException, SystemException {
		CRM_Trn_Address crm_Trn_Address = fetchByPrimaryKey(primaryKey);

		if (crm_Trn_Address == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCRM_Trn_AddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crm_Trn_Address;
	}

	/**
	 * Returns the c r m_ trn_ address with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException} if it could not be found.
	 *
	 * @param AddressId the primary key of the c r m_ trn_ address
	 * @return the c r m_ trn_ address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_AddressException if a c r m_ trn_ address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address findByPrimaryKey(int AddressId)
		throws NoSuchCRM_Trn_AddressException, SystemException {
		return findByPrimaryKey((Serializable)AddressId);
	}

	/**
	 * Returns the c r m_ trn_ address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ address
	 * @return the c r m_ trn_ address, or <code>null</code> if a c r m_ trn_ address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CRM_Trn_Address crm_Trn_Address = (CRM_Trn_Address)EntityCacheUtil.getResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_AddressImpl.class, primaryKey);

		if (crm_Trn_Address == _nullCRM_Trn_Address) {
			return null;
		}

		if (crm_Trn_Address == null) {
			Session session = null;

			try {
				session = openSession();

				crm_Trn_Address = (CRM_Trn_Address)session.get(CRM_Trn_AddressImpl.class,
						primaryKey);

				if (crm_Trn_Address != null) {
					cacheResult(crm_Trn_Address);
				}
				else {
					EntityCacheUtil.putResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_AddressImpl.class, primaryKey,
						_nullCRM_Trn_Address);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CRM_Trn_AddressModelImpl.ENTITY_CACHE_ENABLED,
					CRM_Trn_AddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crm_Trn_Address;
	}

	/**
	 * Returns the c r m_ trn_ address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param AddressId the primary key of the c r m_ trn_ address
	 * @return the c r m_ trn_ address, or <code>null</code> if a c r m_ trn_ address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_Address fetchByPrimaryKey(int AddressId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)AddressId);
	}

	/**
	 * Returns all the c r m_ trn_ addresses.
	 *
	 * @return the c r m_ trn_ addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Address> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c r m_ trn_ addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ addresses
	 * @param end the upper bound of the range of c r m_ trn_ addresses (not inclusive)
	 * @return the range of c r m_ trn_ addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Address> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c r m_ trn_ addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ addresses
	 * @param end the upper bound of the range of c r m_ trn_ addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c r m_ trn_ addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_Address> findAll(int start, int end,
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

		List<CRM_Trn_Address> list = (List<CRM_Trn_Address>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRM_TRN_ADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRM_TRN_ADDRESS;

				if (pagination) {
					sql = sql.concat(CRM_Trn_AddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CRM_Trn_Address>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CRM_Trn_Address>(list);
				}
				else {
					list = (List<CRM_Trn_Address>)QueryUtil.list(q,
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
	 * Removes all the c r m_ trn_ addresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CRM_Trn_Address crm_Trn_Address : findAll()) {
			remove(crm_Trn_Address);
		}
	}

	/**
	 * Returns the number of c r m_ trn_ addresses.
	 *
	 * @return the number of c r m_ trn_ addresses
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

				Query q = session.createQuery(_SQL_COUNT_CRM_TRN_ADDRESS);

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
	 * Initializes the c r m_ trn_ address persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.CRM_Trn_Address")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CRM_Trn_Address>> listenersList = new ArrayList<ModelListener<CRM_Trn_Address>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CRM_Trn_Address>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CRM_Trn_AddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRM_TRN_ADDRESS = "SELECT crm_Trn_Address FROM CRM_Trn_Address crm_Trn_Address";
	private static final String _SQL_SELECT_CRM_TRN_ADDRESS_WHERE = "SELECT crm_Trn_Address FROM CRM_Trn_Address crm_Trn_Address WHERE ";
	private static final String _SQL_COUNT_CRM_TRN_ADDRESS = "SELECT COUNT(crm_Trn_Address) FROM CRM_Trn_Address crm_Trn_Address";
	private static final String _SQL_COUNT_CRM_TRN_ADDRESS_WHERE = "SELECT COUNT(crm_Trn_Address) FROM CRM_Trn_Address crm_Trn_Address WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crm_Trn_Address.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CRM_Trn_Address exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CRM_Trn_Address exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CRM_Trn_AddressPersistenceImpl.class);
	private static CRM_Trn_Address _nullCRM_Trn_Address = new CRM_Trn_AddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CRM_Trn_Address> toCacheModel() {
				return _nullCRM_Trn_AddressCacheModel;
			}
		};

	private static CacheModel<CRM_Trn_Address> _nullCRM_Trn_AddressCacheModel = new CacheModel<CRM_Trn_Address>() {
			@Override
			public CRM_Trn_Address toEntityModel() {
				return _nullCRM_Trn_Address;
			}
		};
}