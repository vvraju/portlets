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

import com.ifli.rapid.NoSuchPolicyFundSwitchCounterException;
import com.ifli.rapid.model.PolicyFundSwitchCounter;
import com.ifli.rapid.model.impl.PolicyFundSwitchCounterImpl;
import com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the policy fund switch counter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchCounterPersistence
 * @see PolicyFundSwitchCounterUtil
 * @generated
 */
public class PolicyFundSwitchCounterPersistenceImpl extends BasePersistenceImpl<PolicyFundSwitchCounter>
	implements PolicyFundSwitchCounterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyFundSwitchCounterUtil} to access the policy fund switch counter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyFundSwitchCounterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchCounterModelImpl.FINDER_CACHE_ENABLED,
			PolicyFundSwitchCounterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchCounterModelImpl.FINDER_CACHE_ENABLED,
			PolicyFundSwitchCounterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchCounterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolicyFundSwitchCounterPersistenceImpl() {
		setModelClass(PolicyFundSwitchCounter.class);
	}

	/**
	 * Caches the policy fund switch counter in the entity cache if it is enabled.
	 *
	 * @param policyFundSwitchCounter the policy fund switch counter
	 */
	@Override
	public void cacheResult(PolicyFundSwitchCounter policyFundSwitchCounter) {
		EntityCacheUtil.putResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchCounterImpl.class,
			policyFundSwitchCounter.getPrimaryKey(), policyFundSwitchCounter);

		policyFundSwitchCounter.resetOriginalValues();
	}

	/**
	 * Caches the policy fund switch counters in the entity cache if it is enabled.
	 *
	 * @param policyFundSwitchCounters the policy fund switch counters
	 */
	@Override
	public void cacheResult(
		List<PolicyFundSwitchCounter> policyFundSwitchCounters) {
		for (PolicyFundSwitchCounter policyFundSwitchCounter : policyFundSwitchCounters) {
			if (EntityCacheUtil.getResult(
						PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
						PolicyFundSwitchCounterImpl.class,
						policyFundSwitchCounter.getPrimaryKey()) == null) {
				cacheResult(policyFundSwitchCounter);
			}
			else {
				policyFundSwitchCounter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy fund switch counters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyFundSwitchCounterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyFundSwitchCounterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy fund switch counter.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyFundSwitchCounter policyFundSwitchCounter) {
		EntityCacheUtil.removeResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchCounterImpl.class,
			policyFundSwitchCounter.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PolicyFundSwitchCounter> policyFundSwitchCounters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyFundSwitchCounter policyFundSwitchCounter : policyFundSwitchCounters) {
			EntityCacheUtil.removeResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
				PolicyFundSwitchCounterImpl.class,
				policyFundSwitchCounter.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy fund switch counter with the primary key. Does not add the policy fund switch counter to the database.
	 *
	 * @param POLICY_ID the primary key for the new policy fund switch counter
	 * @return the new policy fund switch counter
	 */
	@Override
	public PolicyFundSwitchCounter create(String POLICY_ID) {
		PolicyFundSwitchCounter policyFundSwitchCounter = new PolicyFundSwitchCounterImpl();

		policyFundSwitchCounter.setNew(true);
		policyFundSwitchCounter.setPrimaryKey(POLICY_ID);

		return policyFundSwitchCounter;
	}

	/**
	 * Removes the policy fund switch counter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param POLICY_ID the primary key of the policy fund switch counter
	 * @return the policy fund switch counter that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException if a policy fund switch counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchCounter remove(String POLICY_ID)
		throws NoSuchPolicyFundSwitchCounterException, SystemException {
		return remove((Serializable)POLICY_ID);
	}

	/**
	 * Removes the policy fund switch counter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy fund switch counter
	 * @return the policy fund switch counter that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException if a policy fund switch counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchCounter remove(Serializable primaryKey)
		throws NoSuchPolicyFundSwitchCounterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyFundSwitchCounter policyFundSwitchCounter = (PolicyFundSwitchCounter)session.get(PolicyFundSwitchCounterImpl.class,
					primaryKey);

			if (policyFundSwitchCounter == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyFundSwitchCounterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyFundSwitchCounter);
		}
		catch (NoSuchPolicyFundSwitchCounterException nsee) {
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
	protected PolicyFundSwitchCounter removeImpl(
		PolicyFundSwitchCounter policyFundSwitchCounter)
		throws SystemException {
		policyFundSwitchCounter = toUnwrappedModel(policyFundSwitchCounter);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyFundSwitchCounter)) {
				policyFundSwitchCounter = (PolicyFundSwitchCounter)session.get(PolicyFundSwitchCounterImpl.class,
						policyFundSwitchCounter.getPrimaryKeyObj());
			}

			if (policyFundSwitchCounter != null) {
				session.delete(policyFundSwitchCounter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyFundSwitchCounter != null) {
			clearCache(policyFundSwitchCounter);
		}

		return policyFundSwitchCounter;
	}

	@Override
	public PolicyFundSwitchCounter updateImpl(
		com.ifli.rapid.model.PolicyFundSwitchCounter policyFundSwitchCounter)
		throws SystemException {
		policyFundSwitchCounter = toUnwrappedModel(policyFundSwitchCounter);

		boolean isNew = policyFundSwitchCounter.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyFundSwitchCounter.isNew()) {
				session.save(policyFundSwitchCounter);

				policyFundSwitchCounter.setNew(false);
			}
			else {
				session.merge(policyFundSwitchCounter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundSwitchCounterImpl.class,
			policyFundSwitchCounter.getPrimaryKey(), policyFundSwitchCounter);

		return policyFundSwitchCounter;
	}

	protected PolicyFundSwitchCounter toUnwrappedModel(
		PolicyFundSwitchCounter policyFundSwitchCounter) {
		if (policyFundSwitchCounter instanceof PolicyFundSwitchCounterImpl) {
			return policyFundSwitchCounter;
		}

		PolicyFundSwitchCounterImpl policyFundSwitchCounterImpl = new PolicyFundSwitchCounterImpl();

		policyFundSwitchCounterImpl.setNew(policyFundSwitchCounter.isNew());
		policyFundSwitchCounterImpl.setPrimaryKey(policyFundSwitchCounter.getPrimaryKey());

		policyFundSwitchCounterImpl.setPOLICY_ID(policyFundSwitchCounter.getPOLICY_ID());
		policyFundSwitchCounterImpl.setFUND_SWITCH_COUNTER(policyFundSwitchCounter.getFUND_SWITCH_COUNTER());
		policyFundSwitchCounterImpl.setFUND_SWITCH_YEAR(policyFundSwitchCounter.getFUND_SWITCH_YEAR());

		return policyFundSwitchCounterImpl;
	}

	/**
	 * Returns the policy fund switch counter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy fund switch counter
	 * @return the policy fund switch counter
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException if a policy fund switch counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchCounter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyFundSwitchCounterException, SystemException {
		PolicyFundSwitchCounter policyFundSwitchCounter = fetchByPrimaryKey(primaryKey);

		if (policyFundSwitchCounter == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyFundSwitchCounterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyFundSwitchCounter;
	}

	/**
	 * Returns the policy fund switch counter with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyFundSwitchCounterException} if it could not be found.
	 *
	 * @param POLICY_ID the primary key of the policy fund switch counter
	 * @return the policy fund switch counter
	 * @throws com.ifli.rapid.NoSuchPolicyFundSwitchCounterException if a policy fund switch counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchCounter findByPrimaryKey(String POLICY_ID)
		throws NoSuchPolicyFundSwitchCounterException, SystemException {
		return findByPrimaryKey((Serializable)POLICY_ID);
	}

	/**
	 * Returns the policy fund switch counter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy fund switch counter
	 * @return the policy fund switch counter, or <code>null</code> if a policy fund switch counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchCounter fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyFundSwitchCounter policyFundSwitchCounter = (PolicyFundSwitchCounter)EntityCacheUtil.getResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
				PolicyFundSwitchCounterImpl.class, primaryKey);

		if (policyFundSwitchCounter == _nullPolicyFundSwitchCounter) {
			return null;
		}

		if (policyFundSwitchCounter == null) {
			Session session = null;

			try {
				session = openSession();

				policyFundSwitchCounter = (PolicyFundSwitchCounter)session.get(PolicyFundSwitchCounterImpl.class,
						primaryKey);

				if (policyFundSwitchCounter != null) {
					cacheResult(policyFundSwitchCounter);
				}
				else {
					EntityCacheUtil.putResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
						PolicyFundSwitchCounterImpl.class, primaryKey,
						_nullPolicyFundSwitchCounter);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyFundSwitchCounterModelImpl.ENTITY_CACHE_ENABLED,
					PolicyFundSwitchCounterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyFundSwitchCounter;
	}

	/**
	 * Returns the policy fund switch counter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param POLICY_ID the primary key of the policy fund switch counter
	 * @return the policy fund switch counter, or <code>null</code> if a policy fund switch counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFundSwitchCounter fetchByPrimaryKey(String POLICY_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)POLICY_ID);
	}

	/**
	 * Returns all the policy fund switch counters.
	 *
	 * @return the policy fund switch counters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFundSwitchCounter> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy fund switch counters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy fund switch counters
	 * @param end the upper bound of the range of policy fund switch counters (not inclusive)
	 * @return the range of policy fund switch counters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFundSwitchCounter> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy fund switch counters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundSwitchCounterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy fund switch counters
	 * @param end the upper bound of the range of policy fund switch counters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy fund switch counters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFundSwitchCounter> findAll(int start, int end,
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

		List<PolicyFundSwitchCounter> list = (List<PolicyFundSwitchCounter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYFUNDSWITCHCOUNTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYFUNDSWITCHCOUNTER;

				if (pagination) {
					sql = sql.concat(PolicyFundSwitchCounterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyFundSwitchCounter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyFundSwitchCounter>(list);
				}
				else {
					list = (List<PolicyFundSwitchCounter>)QueryUtil.list(q,
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
	 * Removes all the policy fund switch counters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyFundSwitchCounter policyFundSwitchCounter : findAll()) {
			remove(policyFundSwitchCounter);
		}
	}

	/**
	 * Returns the number of policy fund switch counters.
	 *
	 * @return the number of policy fund switch counters
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

				Query q = session.createQuery(_SQL_COUNT_POLICYFUNDSWITCHCOUNTER);

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
	 * Initializes the policy fund switch counter persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyFundSwitchCounter")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyFundSwitchCounter>> listenersList = new ArrayList<ModelListener<PolicyFundSwitchCounter>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyFundSwitchCounter>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyFundSwitchCounterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYFUNDSWITCHCOUNTER = "SELECT policyFundSwitchCounter FROM PolicyFundSwitchCounter policyFundSwitchCounter";
	private static final String _SQL_COUNT_POLICYFUNDSWITCHCOUNTER = "SELECT COUNT(policyFundSwitchCounter) FROM PolicyFundSwitchCounter policyFundSwitchCounter";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyFundSwitchCounter.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyFundSwitchCounter exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyFundSwitchCounterPersistenceImpl.class);
	private static PolicyFundSwitchCounter _nullPolicyFundSwitchCounter = new PolicyFundSwitchCounterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyFundSwitchCounter> toCacheModel() {
				return _nullPolicyFundSwitchCounterCacheModel;
			}
		};

	private static CacheModel<PolicyFundSwitchCounter> _nullPolicyFundSwitchCounterCacheModel =
		new CacheModel<PolicyFundSwitchCounter>() {
			@Override
			public PolicyFundSwitchCounter toEntityModel() {
				return _nullPolicyFundSwitchCounter;
			}
		};
}