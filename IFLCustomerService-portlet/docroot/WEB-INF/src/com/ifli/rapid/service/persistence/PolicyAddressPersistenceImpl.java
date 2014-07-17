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

import com.ifli.rapid.NoSuchPolicyAddressException;
import com.ifli.rapid.model.PolicyAddress;
import com.ifli.rapid.model.impl.PolicyAddressImpl;
import com.ifli.rapid.model.impl.PolicyAddressModelImpl;

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
 * The persistence implementation for the policy address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyAddressPersistence
 * @see PolicyAddressUtil
 * @generated
 */
public class PolicyAddressPersistenceImpl extends BasePersistenceImpl<PolicyAddress>
	implements PolicyAddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyAddressUtil} to access the policy address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyAddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressModelImpl.FINDER_CACHE_ENABLED,
			PolicyAddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressModelImpl.FINDER_CACHE_ENABLED,
			PolicyAddressImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_POLICYID = new FinderPath(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressModelImpl.FINDER_CACHE_ENABLED,
			PolicyAddressImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPolicyId", new String[] { String.class.getName() },
			PolicyAddressModelImpl.POLICY_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POLICYID = new FinderPath(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPolicyId",
			new String[] { String.class.getName() });

	/**
	 * Returns the policy address where POLICY_ID = &#63; or throws a {@link com.ifli.rapid.NoSuchPolicyAddressException} if it could not be found.
	 *
	 * @param POLICY_ID the p o l i c y_ i d
	 * @return the matching policy address
	 * @throws com.ifli.rapid.NoSuchPolicyAddressException if a matching policy address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress findByPolicyId(String POLICY_ID)
		throws NoSuchPolicyAddressException, SystemException {
		PolicyAddress policyAddress = fetchByPolicyId(POLICY_ID);

		if (policyAddress == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("POLICY_ID=");
			msg.append(POLICY_ID);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPolicyAddressException(msg.toString());
		}

		return policyAddress;
	}

	/**
	 * Returns the policy address where POLICY_ID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param POLICY_ID the p o l i c y_ i d
	 * @return the matching policy address, or <code>null</code> if a matching policy address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress fetchByPolicyId(String POLICY_ID)
		throws SystemException {
		return fetchByPolicyId(POLICY_ID, true);
	}

	/**
	 * Returns the policy address where POLICY_ID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param POLICY_ID the p o l i c y_ i d
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching policy address, or <code>null</code> if a matching policy address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress fetchByPolicyId(String POLICY_ID,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { POLICY_ID };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_POLICYID,
					finderArgs, this);
		}

		if (result instanceof PolicyAddress) {
			PolicyAddress policyAddress = (PolicyAddress)result;

			if (!Validator.equals(POLICY_ID, policyAddress.getPOLICY_ID())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_POLICYADDRESS_WHERE);

			boolean bindPOLICY_ID = false;

			if (POLICY_ID == null) {
				query.append(_FINDER_COLUMN_POLICYID_POLICY_ID_1);
			}
			else if (POLICY_ID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYID_POLICY_ID_3);
			}
			else {
				bindPOLICY_ID = true;

				query.append(_FINDER_COLUMN_POLICYID_POLICY_ID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPOLICY_ID) {
					qPos.add(POLICY_ID);
				}

				List<PolicyAddress> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PolicyAddressPersistenceImpl.fetchByPolicyId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PolicyAddress policyAddress = list.get(0);

					result = policyAddress;

					cacheResult(policyAddress);

					if ((policyAddress.getPOLICY_ID() == null) ||
							!policyAddress.getPOLICY_ID().equals(POLICY_ID)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYID,
							finderArgs, policyAddress);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POLICYID,
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
			return (PolicyAddress)result;
		}
	}

	/**
	 * Removes the policy address where POLICY_ID = &#63; from the database.
	 *
	 * @param POLICY_ID the p o l i c y_ i d
	 * @return the policy address that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress removeByPolicyId(String POLICY_ID)
		throws NoSuchPolicyAddressException, SystemException {
		PolicyAddress policyAddress = findByPolicyId(POLICY_ID);

		return remove(policyAddress);
	}

	/**
	 * Returns the number of policy addresses where POLICY_ID = &#63;.
	 *
	 * @param POLICY_ID the p o l i c y_ i d
	 * @return the number of matching policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPolicyId(String POLICY_ID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POLICYID;

		Object[] finderArgs = new Object[] { POLICY_ID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_POLICYADDRESS_WHERE);

			boolean bindPOLICY_ID = false;

			if (POLICY_ID == null) {
				query.append(_FINDER_COLUMN_POLICYID_POLICY_ID_1);
			}
			else if (POLICY_ID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_POLICYID_POLICY_ID_3);
			}
			else {
				bindPOLICY_ID = true;

				query.append(_FINDER_COLUMN_POLICYID_POLICY_ID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPOLICY_ID) {
					qPos.add(POLICY_ID);
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

	private static final String _FINDER_COLUMN_POLICYID_POLICY_ID_1 = "policyAddress.POLICY_ID IS NULL";
	private static final String _FINDER_COLUMN_POLICYID_POLICY_ID_2 = "policyAddress.POLICY_ID = ?";
	private static final String _FINDER_COLUMN_POLICYID_POLICY_ID_3 = "(policyAddress.POLICY_ID IS NULL OR policyAddress.POLICY_ID = '')";

	public PolicyAddressPersistenceImpl() {
		setModelClass(PolicyAddress.class);
	}

	/**
	 * Caches the policy address in the entity cache if it is enabled.
	 *
	 * @param policyAddress the policy address
	 */
	@Override
	public void cacheResult(PolicyAddress policyAddress) {
		EntityCacheUtil.putResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressImpl.class, policyAddress.getPrimaryKey(),
			policyAddress);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYID,
			new Object[] { policyAddress.getPOLICY_ID() }, policyAddress);

		policyAddress.resetOriginalValues();
	}

	/**
	 * Caches the policy addresses in the entity cache if it is enabled.
	 *
	 * @param policyAddresses the policy addresses
	 */
	@Override
	public void cacheResult(List<PolicyAddress> policyAddresses) {
		for (PolicyAddress policyAddress : policyAddresses) {
			if (EntityCacheUtil.getResult(
						PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
						PolicyAddressImpl.class, policyAddress.getPrimaryKey()) == null) {
				cacheResult(policyAddress);
			}
			else {
				policyAddress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy addresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyAddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyAddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy address.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyAddress policyAddress) {
		EntityCacheUtil.removeResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressImpl.class, policyAddress.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(policyAddress);
	}

	@Override
	public void clearCache(List<PolicyAddress> policyAddresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyAddress policyAddress : policyAddresses) {
			EntityCacheUtil.removeResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
				PolicyAddressImpl.class, policyAddress.getPrimaryKey());

			clearUniqueFindersCache(policyAddress);
		}
	}

	protected void cacheUniqueFindersCache(PolicyAddress policyAddress) {
		if (policyAddress.isNew()) {
			Object[] args = new Object[] { policyAddress.getPOLICY_ID() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POLICYID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYID, args,
				policyAddress);
		}
		else {
			PolicyAddressModelImpl policyAddressModelImpl = (PolicyAddressModelImpl)policyAddress;

			if ((policyAddressModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_POLICYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { policyAddress.getPOLICY_ID() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POLICYID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_POLICYID, args,
					policyAddress);
			}
		}
	}

	protected void clearUniqueFindersCache(PolicyAddress policyAddress) {
		PolicyAddressModelImpl policyAddressModelImpl = (PolicyAddressModelImpl)policyAddress;

		Object[] args = new Object[] { policyAddress.getPOLICY_ID() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POLICYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POLICYID, args);

		if ((policyAddressModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_POLICYID.getColumnBitmask()) != 0) {
			args = new Object[] { policyAddressModelImpl.getOriginalPOLICY_ID() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POLICYID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_POLICYID, args);
		}
	}

	/**
	 * Creates a new policy address with the primary key. Does not add the policy address to the database.
	 *
	 * @param ID the primary key for the new policy address
	 * @return the new policy address
	 */
	@Override
	public PolicyAddress create(int ID) {
		PolicyAddress policyAddress = new PolicyAddressImpl();

		policyAddress.setNew(true);
		policyAddress.setPrimaryKey(ID);

		return policyAddress;
	}

	/**
	 * Removes the policy address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the policy address
	 * @return the policy address that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress remove(int ID)
		throws NoSuchPolicyAddressException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the policy address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy address
	 * @return the policy address that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress remove(Serializable primaryKey)
		throws NoSuchPolicyAddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyAddress policyAddress = (PolicyAddress)session.get(PolicyAddressImpl.class,
					primaryKey);

			if (policyAddress == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyAddress);
		}
		catch (NoSuchPolicyAddressException nsee) {
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
	protected PolicyAddress removeImpl(PolicyAddress policyAddress)
		throws SystemException {
		policyAddress = toUnwrappedModel(policyAddress);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyAddress)) {
				policyAddress = (PolicyAddress)session.get(PolicyAddressImpl.class,
						policyAddress.getPrimaryKeyObj());
			}

			if (policyAddress != null) {
				session.delete(policyAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyAddress != null) {
			clearCache(policyAddress);
		}

		return policyAddress;
	}

	@Override
	public PolicyAddress updateImpl(
		com.ifli.rapid.model.PolicyAddress policyAddress)
		throws SystemException {
		policyAddress = toUnwrappedModel(policyAddress);

		boolean isNew = policyAddress.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyAddress.isNew()) {
				session.save(policyAddress);

				policyAddress.setNew(false);
			}
			else {
				session.merge(policyAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PolicyAddressModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
			PolicyAddressImpl.class, policyAddress.getPrimaryKey(),
			policyAddress);

		clearUniqueFindersCache(policyAddress);
		cacheUniqueFindersCache(policyAddress);

		return policyAddress;
	}

	protected PolicyAddress toUnwrappedModel(PolicyAddress policyAddress) {
		if (policyAddress instanceof PolicyAddressImpl) {
			return policyAddress;
		}

		PolicyAddressImpl policyAddressImpl = new PolicyAddressImpl();

		policyAddressImpl.setNew(policyAddress.isNew());
		policyAddressImpl.setPrimaryKey(policyAddress.getPrimaryKey());

		policyAddressImpl.setID(policyAddress.getID());
		policyAddressImpl.setPOLICY_ID(policyAddress.getPOLICY_ID());
		policyAddressImpl.setCUSTOMER_ID(policyAddress.getCUSTOMER_ID());
		policyAddressImpl.setCUSTOMER_ADDRESS_ID(policyAddress.getCUSTOMER_ADDRESS_ID());
		policyAddressImpl.setPINCODE(policyAddress.getPINCODE());
		policyAddressImpl.setCITY(policyAddress.getCITY());
		policyAddressImpl.setSTATE(policyAddress.getSTATE());
		policyAddressImpl.setADDRESS_LINE_1(policyAddress.getADDRESS_LINE_1());
		policyAddressImpl.setADDRESS_LINE_2(policyAddress.getADDRESS_LINE_2());
		policyAddressImpl.setADDRESS_LINE_3(policyAddress.getADDRESS_LINE_3());

		return policyAddressImpl;
	}

	/**
	 * Returns the policy address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy address
	 * @return the policy address
	 * @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyAddressException, SystemException {
		PolicyAddress policyAddress = fetchByPrimaryKey(primaryKey);

		if (policyAddress == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyAddress;
	}

	/**
	 * Returns the policy address with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyAddressException} if it could not be found.
	 *
	 * @param ID the primary key of the policy address
	 * @return the policy address
	 * @throws com.ifli.rapid.NoSuchPolicyAddressException if a policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress findByPrimaryKey(int ID)
		throws NoSuchPolicyAddressException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the policy address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy address
	 * @return the policy address, or <code>null</code> if a policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyAddress policyAddress = (PolicyAddress)EntityCacheUtil.getResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
				PolicyAddressImpl.class, primaryKey);

		if (policyAddress == _nullPolicyAddress) {
			return null;
		}

		if (policyAddress == null) {
			Session session = null;

			try {
				session = openSession();

				policyAddress = (PolicyAddress)session.get(PolicyAddressImpl.class,
						primaryKey);

				if (policyAddress != null) {
					cacheResult(policyAddress);
				}
				else {
					EntityCacheUtil.putResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
						PolicyAddressImpl.class, primaryKey, _nullPolicyAddress);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyAddressModelImpl.ENTITY_CACHE_ENABLED,
					PolicyAddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyAddress;
	}

	/**
	 * Returns the policy address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the policy address
	 * @return the policy address, or <code>null</code> if a policy address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyAddress fetchByPrimaryKey(int ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the policy addresses.
	 *
	 * @return the policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyAddress> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy addresses
	 * @param end the upper bound of the range of policy addresses (not inclusive)
	 * @return the range of policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyAddress> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy addresses
	 * @param end the upper bound of the range of policy addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyAddress> findAll(int start, int end,
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

		List<PolicyAddress> list = (List<PolicyAddress>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYADDRESS;

				if (pagination) {
					sql = sql.concat(PolicyAddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyAddress>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyAddress>(list);
				}
				else {
					list = (List<PolicyAddress>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the policy addresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyAddress policyAddress : findAll()) {
			remove(policyAddress);
		}
	}

	/**
	 * Returns the number of policy addresses.
	 *
	 * @return the number of policy addresses
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

				Query q = session.createQuery(_SQL_COUNT_POLICYADDRESS);

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
	 * Initializes the policy address persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyAddress")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyAddress>> listenersList = new ArrayList<ModelListener<PolicyAddress>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyAddress>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyAddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYADDRESS = "SELECT policyAddress FROM PolicyAddress policyAddress";
	private static final String _SQL_SELECT_POLICYADDRESS_WHERE = "SELECT policyAddress FROM PolicyAddress policyAddress WHERE ";
	private static final String _SQL_COUNT_POLICYADDRESS = "SELECT COUNT(policyAddress) FROM PolicyAddress policyAddress";
	private static final String _SQL_COUNT_POLICYADDRESS_WHERE = "SELECT COUNT(policyAddress) FROM PolicyAddress policyAddress WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyAddress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyAddress exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PolicyAddress exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyAddressPersistenceImpl.class);
	private static PolicyAddress _nullPolicyAddress = new PolicyAddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyAddress> toCacheModel() {
				return _nullPolicyAddressCacheModel;
			}
		};

	private static CacheModel<PolicyAddress> _nullPolicyAddressCacheModel = new CacheModel<PolicyAddress>() {
			@Override
			public PolicyAddress toEntityModel() {
				return _nullPolicyAddress;
			}
		};
}