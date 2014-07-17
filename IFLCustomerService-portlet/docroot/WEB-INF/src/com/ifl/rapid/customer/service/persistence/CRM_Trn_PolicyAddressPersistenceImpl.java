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

import com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException;
import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;
import com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl;

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
 * The persistence implementation for the c r m_ trn_ policy address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CRM_Trn_PolicyAddressPersistence
 * @see CRM_Trn_PolicyAddressUtil
 * @generated
 */
public class CRM_Trn_PolicyAddressPersistenceImpl extends BasePersistenceImpl<CRM_Trn_PolicyAddress>
	implements CRM_Trn_PolicyAddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CRM_Trn_PolicyAddressUtil} to access the c r m_ trn_ policy address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CRM_Trn_PolicyAddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PolicyAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PolicyAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_POLICYNO = new FinderPath(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressModelImpl.FINDER_CACHE_ENABLED,
			CRM_Trn_PolicyAddressImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPolicyNo", new String[] { String.class.getName() },
			CRM_Trn_PolicyAddressModelImpl.POLICYNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POLICYNO = new FinderPath(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPolicyNo",
			new String[] { String.class.getName() });

	/**
	 * Returns the c r m_ trn_ policy address where PolicyNo = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	 *
	 * @param PolicyNo the policy no
	 * @return the matching c r m_ trn_ policy address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a matching c r m_ trn_ policy address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress findByPolicyNo(String PolicyNo)
		throws NoSuchCRM_Trn_PolicyAddressException, SystemException {
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = fetchByPolicyNo(PolicyNo);

		if (crm_Trn_PolicyAddress == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("PolicyNo=");
			msg.append(PolicyNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCRM_Trn_PolicyAddressException(msg.toString());
		}

		return crm_Trn_PolicyAddress;
	}

	/**
	 * Returns the c r m_ trn_ policy address where PolicyNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param PolicyNo the policy no
	 * @return the matching c r m_ trn_ policy address, or <code>null</code> if a matching c r m_ trn_ policy address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress fetchByPolicyNo(String PolicyNo)
		throws SystemException {
		return fetchByPolicyNo(PolicyNo, true);
	}

	/**
	 * Returns the c r m_ trn_ policy address where PolicyNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param PolicyNo the policy no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching c r m_ trn_ policy address, or <code>null</code> if a matching c r m_ trn_ policy address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress fetchByPolicyNo(String PolicyNo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { PolicyNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_POLICYNO,
					finderArgs, this);
		}

		if (result instanceof CRM_Trn_PolicyAddress) {
			CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddress)result;

			if (!Validator.equals(PolicyNo, crm_Trn_PolicyAddress.getPolicyNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CRM_TRN_POLICYADDRESS_WHERE);

			boolean bindPolicyNo = false;

			if (PolicyNo == null) {
				query.append(_FINDER_COLUMN_POLICYNO_POLICYNO_1);
			}
			else if (PolicyNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYNO_POLICYNO_3);
			}
			else {
				bindPolicyNo = true;

				query.append(_FINDER_COLUMN_POLICYNO_POLICYNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPolicyNo) {
					qPos.add(PolicyNo);
				}

				List<CRM_Trn_PolicyAddress> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYNO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CRM_Trn_PolicyAddressPersistenceImpl.fetchByPolicyNo(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = list.get(0);

					result = crm_Trn_PolicyAddress;

					cacheResult(crm_Trn_PolicyAddress);

					if ((crm_Trn_PolicyAddress.getPolicyNo() == null) ||
							!crm_Trn_PolicyAddress.getPolicyNo().equals(PolicyNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYNO,
							finderArgs, crm_Trn_PolicyAddress);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POLICYNO,
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
			return (CRM_Trn_PolicyAddress)result;
		}
	}

	/**
	 * Removes the c r m_ trn_ policy address where PolicyNo = &#63; from the database.
	 *
	 * @param PolicyNo the policy no
	 * @return the c r m_ trn_ policy address that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress removeByPolicyNo(String PolicyNo)
		throws NoSuchCRM_Trn_PolicyAddressException, SystemException {
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = findByPolicyNo(PolicyNo);

		return remove(crm_Trn_PolicyAddress);
	}

	/**
	 * Returns the number of c r m_ trn_ policy addresses where PolicyNo = &#63;.
	 *
	 * @param PolicyNo the policy no
	 * @return the number of matching c r m_ trn_ policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPolicyNo(String PolicyNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POLICYNO;

		Object[] finderArgs = new Object[] { PolicyNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRM_TRN_POLICYADDRESS_WHERE);

			boolean bindPolicyNo = false;

			if (PolicyNo == null) {
				query.append(_FINDER_COLUMN_POLICYNO_POLICYNO_1);
			}
			else if (PolicyNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYNO_POLICYNO_3);
			}
			else {
				bindPolicyNo = true;

				query.append(_FINDER_COLUMN_POLICYNO_POLICYNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPolicyNo) {
					qPos.add(PolicyNo);
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

	private static final String _FINDER_COLUMN_POLICYNO_POLICYNO_1 = "crm_Trn_PolicyAddress.PolicyNo IS NULL";
	private static final String _FINDER_COLUMN_POLICYNO_POLICYNO_2 = "crm_Trn_PolicyAddress.PolicyNo = ?";
	private static final String _FINDER_COLUMN_POLICYNO_POLICYNO_3 = "(crm_Trn_PolicyAddress.PolicyNo IS NULL OR crm_Trn_PolicyAddress.PolicyNo = '')";

	public CRM_Trn_PolicyAddressPersistenceImpl() {
		setModelClass(CRM_Trn_PolicyAddress.class);
	}

	/**
	 * Caches the c r m_ trn_ policy address in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_PolicyAddress the c r m_ trn_ policy address
	 */
	@Override
	public void cacheResult(CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		EntityCacheUtil.putResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressImpl.class,
			crm_Trn_PolicyAddress.getPrimaryKey(), crm_Trn_PolicyAddress);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYNO,
			new Object[] { crm_Trn_PolicyAddress.getPolicyNo() },
			crm_Trn_PolicyAddress);

		crm_Trn_PolicyAddress.resetOriginalValues();
	}

	/**
	 * Caches the c r m_ trn_ policy addresses in the entity cache if it is enabled.
	 *
	 * @param crm_Trn_PolicyAddresses the c r m_ trn_ policy addresses
	 */
	@Override
	public void cacheResult(List<CRM_Trn_PolicyAddress> crm_Trn_PolicyAddresses) {
		for (CRM_Trn_PolicyAddress crm_Trn_PolicyAddress : crm_Trn_PolicyAddresses) {
			if (EntityCacheUtil.getResult(
						CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_PolicyAddressImpl.class,
						crm_Trn_PolicyAddress.getPrimaryKey()) == null) {
				cacheResult(crm_Trn_PolicyAddress);
			}
			else {
				crm_Trn_PolicyAddress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c r m_ trn_ policy addresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CRM_Trn_PolicyAddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CRM_Trn_PolicyAddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c r m_ trn_ policy address.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		EntityCacheUtil.removeResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressImpl.class,
			crm_Trn_PolicyAddress.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(crm_Trn_PolicyAddress);
	}

	@Override
	public void clearCache(List<CRM_Trn_PolicyAddress> crm_Trn_PolicyAddresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CRM_Trn_PolicyAddress crm_Trn_PolicyAddress : crm_Trn_PolicyAddresses) {
			EntityCacheUtil.removeResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_PolicyAddressImpl.class,
				crm_Trn_PolicyAddress.getPrimaryKey());

			clearUniqueFindersCache(crm_Trn_PolicyAddress);
		}
	}

	protected void cacheUniqueFindersCache(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		if (crm_Trn_PolicyAddress.isNew()) {
			Object[] args = new Object[] { crm_Trn_PolicyAddress.getPolicyNo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POLICYNO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYNO, args,
				crm_Trn_PolicyAddress);
		}
		else {
			CRM_Trn_PolicyAddressModelImpl crm_Trn_PolicyAddressModelImpl = (CRM_Trn_PolicyAddressModelImpl)crm_Trn_PolicyAddress;

			if ((crm_Trn_PolicyAddressModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_POLICYNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { crm_Trn_PolicyAddress.getPolicyNo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POLICYNO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYNO, args,
					crm_Trn_PolicyAddress);
			}
		}
	}

	protected void clearUniqueFindersCache(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		CRM_Trn_PolicyAddressModelImpl crm_Trn_PolicyAddressModelImpl = (CRM_Trn_PolicyAddressModelImpl)crm_Trn_PolicyAddress;

		Object[] args = new Object[] { crm_Trn_PolicyAddress.getPolicyNo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POLICYNO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POLICYNO, args);

		if ((crm_Trn_PolicyAddressModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_POLICYNO.getColumnBitmask()) != 0) {
			args = new Object[] {
					crm_Trn_PolicyAddressModelImpl.getOriginalPolicyNo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POLICYNO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POLICYNO, args);
		}
	}

	/**
	 * Creates a new c r m_ trn_ policy address with the primary key. Does not add the c r m_ trn_ policy address to the database.
	 *
	 * @param PolicyAddressId the primary key for the new c r m_ trn_ policy address
	 * @return the new c r m_ trn_ policy address
	 */
	@Override
	public CRM_Trn_PolicyAddress create(int PolicyAddressId) {
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = new CRM_Trn_PolicyAddressImpl();

		crm_Trn_PolicyAddress.setNew(true);
		crm_Trn_PolicyAddress.setPrimaryKey(PolicyAddressId);

		return crm_Trn_PolicyAddress;
	}

	/**
	 * Removes the c r m_ trn_ policy address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	 * @return the c r m_ trn_ policy address that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress remove(int PolicyAddressId)
		throws NoSuchCRM_Trn_PolicyAddressException, SystemException {
		return remove((Serializable)PolicyAddressId);
	}

	/**
	 * Removes the c r m_ trn_ policy address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ policy address
	 * @return the c r m_ trn_ policy address that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress remove(Serializable primaryKey)
		throws NoSuchCRM_Trn_PolicyAddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddress)session.get(CRM_Trn_PolicyAddressImpl.class,
					primaryKey);

			if (crm_Trn_PolicyAddress == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCRM_Trn_PolicyAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(crm_Trn_PolicyAddress);
		}
		catch (NoSuchCRM_Trn_PolicyAddressException nsee) {
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
	protected CRM_Trn_PolicyAddress removeImpl(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) throws SystemException {
		crm_Trn_PolicyAddress = toUnwrappedModel(crm_Trn_PolicyAddress);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crm_Trn_PolicyAddress)) {
				crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddress)session.get(CRM_Trn_PolicyAddressImpl.class,
						crm_Trn_PolicyAddress.getPrimaryKeyObj());
			}

			if (crm_Trn_PolicyAddress != null) {
				session.delete(crm_Trn_PolicyAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (crm_Trn_PolicyAddress != null) {
			clearCache(crm_Trn_PolicyAddress);
		}

		return crm_Trn_PolicyAddress;
	}

	@Override
	public CRM_Trn_PolicyAddress updateImpl(
		com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress crm_Trn_PolicyAddress)
		throws SystemException {
		crm_Trn_PolicyAddress = toUnwrappedModel(crm_Trn_PolicyAddress);

		boolean isNew = crm_Trn_PolicyAddress.isNew();

		Session session = null;

		try {
			session = openSession();

			if (crm_Trn_PolicyAddress.isNew()) {
				session.save(crm_Trn_PolicyAddress);

				crm_Trn_PolicyAddress.setNew(false);
			}
			else {
				session.merge(crm_Trn_PolicyAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CRM_Trn_PolicyAddressModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			CRM_Trn_PolicyAddressImpl.class,
			crm_Trn_PolicyAddress.getPrimaryKey(), crm_Trn_PolicyAddress);

		clearUniqueFindersCache(crm_Trn_PolicyAddress);
		cacheUniqueFindersCache(crm_Trn_PolicyAddress);

		return crm_Trn_PolicyAddress;
	}

	protected CRM_Trn_PolicyAddress toUnwrappedModel(
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress) {
		if (crm_Trn_PolicyAddress instanceof CRM_Trn_PolicyAddressImpl) {
			return crm_Trn_PolicyAddress;
		}

		CRM_Trn_PolicyAddressImpl crm_Trn_PolicyAddressImpl = new CRM_Trn_PolicyAddressImpl();

		crm_Trn_PolicyAddressImpl.setNew(crm_Trn_PolicyAddress.isNew());
		crm_Trn_PolicyAddressImpl.setPrimaryKey(crm_Trn_PolicyAddress.getPrimaryKey());

		crm_Trn_PolicyAddressImpl.setPolicyAddressId(crm_Trn_PolicyAddress.getPolicyAddressId());
		crm_Trn_PolicyAddressImpl.setContactId(crm_Trn_PolicyAddress.getContactId());
		crm_Trn_PolicyAddressImpl.setPolicyNo(crm_Trn_PolicyAddress.getPolicyNo());
		crm_Trn_PolicyAddressImpl.setAddressId(crm_Trn_PolicyAddress.getAddressId());
		crm_Trn_PolicyAddressImpl.setIsActive(crm_Trn_PolicyAddress.getIsActive());
		crm_Trn_PolicyAddressImpl.setCreatedBy(crm_Trn_PolicyAddress.getCreatedBy());
		crm_Trn_PolicyAddressImpl.setCreatedDate(crm_Trn_PolicyAddress.getCreatedDate());
		crm_Trn_PolicyAddressImpl.setModifiedBy(crm_Trn_PolicyAddress.getModifiedBy());
		crm_Trn_PolicyAddressImpl.setModifiedDate(crm_Trn_PolicyAddress.getModifiedDate());

		return crm_Trn_PolicyAddressImpl;
	}

	/**
	 * Returns the c r m_ trn_ policy address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ policy address
	 * @return the c r m_ trn_ policy address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCRM_Trn_PolicyAddressException, SystemException {
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = fetchByPrimaryKey(primaryKey);

		if (crm_Trn_PolicyAddress == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCRM_Trn_PolicyAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return crm_Trn_PolicyAddress;
	}

	/**
	 * Returns the c r m_ trn_ policy address with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException} if it could not be found.
	 *
	 * @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	 * @return the c r m_ trn_ policy address
	 * @throws com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException if a c r m_ trn_ policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress findByPrimaryKey(int PolicyAddressId)
		throws NoSuchCRM_Trn_PolicyAddressException, SystemException {
		return findByPrimaryKey((Serializable)PolicyAddressId);
	}

	/**
	 * Returns the c r m_ trn_ policy address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c r m_ trn_ policy address
	 * @return the c r m_ trn_ policy address, or <code>null</code> if a c r m_ trn_ policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CRM_Trn_PolicyAddress crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddress)EntityCacheUtil.getResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
				CRM_Trn_PolicyAddressImpl.class, primaryKey);

		if (crm_Trn_PolicyAddress == _nullCRM_Trn_PolicyAddress) {
			return null;
		}

		if (crm_Trn_PolicyAddress == null) {
			Session session = null;

			try {
				session = openSession();

				crm_Trn_PolicyAddress = (CRM_Trn_PolicyAddress)session.get(CRM_Trn_PolicyAddressImpl.class,
						primaryKey);

				if (crm_Trn_PolicyAddress != null) {
					cacheResult(crm_Trn_PolicyAddress);
				}
				else {
					EntityCacheUtil.putResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
						CRM_Trn_PolicyAddressImpl.class, primaryKey,
						_nullCRM_Trn_PolicyAddress);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CRM_Trn_PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
					CRM_Trn_PolicyAddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return crm_Trn_PolicyAddress;
	}

	/**
	 * Returns the c r m_ trn_ policy address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PolicyAddressId the primary key of the c r m_ trn_ policy address
	 * @return the c r m_ trn_ policy address, or <code>null</code> if a c r m_ trn_ policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CRM_Trn_PolicyAddress fetchByPrimaryKey(int PolicyAddressId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PolicyAddressId);
	}

	/**
	 * Returns all the c r m_ trn_ policy addresses.
	 *
	 * @return the c r m_ trn_ policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_PolicyAddress> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c r m_ trn_ policy addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ policy addresses
	 * @param end the upper bound of the range of c r m_ trn_ policy addresses (not inclusive)
	 * @return the range of c r m_ trn_ policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_PolicyAddress> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c r m_ trn_ policy addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CRM_Trn_PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of c r m_ trn_ policy addresses
	 * @param end the upper bound of the range of c r m_ trn_ policy addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c r m_ trn_ policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CRM_Trn_PolicyAddress> findAll(int start, int end,
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

		List<CRM_Trn_PolicyAddress> list = (List<CRM_Trn_PolicyAddress>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CRM_TRN_POLICYADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRM_TRN_POLICYADDRESS;

				if (pagination) {
					sql = sql.concat(CRM_Trn_PolicyAddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CRM_Trn_PolicyAddress>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CRM_Trn_PolicyAddress>(list);
				}
				else {
					list = (List<CRM_Trn_PolicyAddress>)QueryUtil.list(q,
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
	 * Removes all the c r m_ trn_ policy addresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CRM_Trn_PolicyAddress crm_Trn_PolicyAddress : findAll()) {
			remove(crm_Trn_PolicyAddress);
		}
	}

	/**
	 * Returns the number of c r m_ trn_ policy addresses.
	 *
	 * @return the number of c r m_ trn_ policy addresses
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

				Query q = session.createQuery(_SQL_COUNT_CRM_TRN_POLICYADDRESS);

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
	 * Initializes the c r m_ trn_ policy address persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CRM_Trn_PolicyAddress>> listenersList = new ArrayList<ModelListener<CRM_Trn_PolicyAddress>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CRM_Trn_PolicyAddress>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CRM_Trn_PolicyAddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CRM_TRN_POLICYADDRESS = "SELECT crm_Trn_PolicyAddress FROM CRM_Trn_PolicyAddress crm_Trn_PolicyAddress";
	private static final String _SQL_SELECT_CRM_TRN_POLICYADDRESS_WHERE = "SELECT crm_Trn_PolicyAddress FROM CRM_Trn_PolicyAddress crm_Trn_PolicyAddress WHERE ";
	private static final String _SQL_COUNT_CRM_TRN_POLICYADDRESS = "SELECT COUNT(crm_Trn_PolicyAddress) FROM CRM_Trn_PolicyAddress crm_Trn_PolicyAddress";
	private static final String _SQL_COUNT_CRM_TRN_POLICYADDRESS_WHERE = "SELECT COUNT(crm_Trn_PolicyAddress) FROM CRM_Trn_PolicyAddress crm_Trn_PolicyAddress WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "crm_Trn_PolicyAddress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CRM_Trn_PolicyAddress exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CRM_Trn_PolicyAddress exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CRM_Trn_PolicyAddressPersistenceImpl.class);
	private static CRM_Trn_PolicyAddress _nullCRM_Trn_PolicyAddress = new CRM_Trn_PolicyAddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CRM_Trn_PolicyAddress> toCacheModel() {
				return _nullCRM_Trn_PolicyAddressCacheModel;
			}
		};

	private static CacheModel<CRM_Trn_PolicyAddress> _nullCRM_Trn_PolicyAddressCacheModel =
		new CacheModel<CRM_Trn_PolicyAddress>() {
			@Override
			public CRM_Trn_PolicyAddress toEntityModel() {
				return _nullCRM_Trn_PolicyAddress;
			}
		};
}