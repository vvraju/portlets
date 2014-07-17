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

import com.ifli.rapid.NoSuchPolicyFundException;
import com.ifli.rapid.model.PolicyFund;
import com.ifli.rapid.model.impl.PolicyFundImpl;
import com.ifli.rapid.model.impl.PolicyFundModelImpl;

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
 * The persistence implementation for the policy fund service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundPersistence
 * @see PolicyFundUtil
 * @generated
 */
public class PolicyFundPersistenceImpl extends BasePersistenceImpl<PolicyFund>
	implements PolicyFundPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyFundUtil} to access the policy fund persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyFundImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundModelImpl.FINDER_CACHE_ENABLED, PolicyFundImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundModelImpl.FINDER_CACHE_ENABLED, PolicyFundImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolicyFundPersistenceImpl() {
		setModelClass(PolicyFund.class);
	}

	/**
	 * Caches the policy fund in the entity cache if it is enabled.
	 *
	 * @param policyFund the policy fund
	 */
	@Override
	public void cacheResult(PolicyFund policyFund) {
		EntityCacheUtil.putResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundImpl.class, policyFund.getPrimaryKey(), policyFund);

		policyFund.resetOriginalValues();
	}

	/**
	 * Caches the policy funds in the entity cache if it is enabled.
	 *
	 * @param policyFunds the policy funds
	 */
	@Override
	public void cacheResult(List<PolicyFund> policyFunds) {
		for (PolicyFund policyFund : policyFunds) {
			if (EntityCacheUtil.getResult(
						PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
						PolicyFundImpl.class, policyFund.getPrimaryKey()) == null) {
				cacheResult(policyFund);
			}
			else {
				policyFund.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy funds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyFundImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyFundImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy fund.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyFund policyFund) {
		EntityCacheUtil.removeResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundImpl.class, policyFund.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PolicyFund> policyFunds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyFund policyFund : policyFunds) {
			EntityCacheUtil.removeResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
				PolicyFundImpl.class, policyFund.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy fund with the primary key. Does not add the policy fund to the database.
	 *
	 * @param POLICY_FUND_ID the primary key for the new policy fund
	 * @return the new policy fund
	 */
	@Override
	public PolicyFund create(int POLICY_FUND_ID) {
		PolicyFund policyFund = new PolicyFundImpl();

		policyFund.setNew(true);
		policyFund.setPrimaryKey(POLICY_FUND_ID);

		return policyFund;
	}

	/**
	 * Removes the policy fund with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param POLICY_FUND_ID the primary key of the policy fund
	 * @return the policy fund that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyFundException if a policy fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFund remove(int POLICY_FUND_ID)
		throws NoSuchPolicyFundException, SystemException {
		return remove((Serializable)POLICY_FUND_ID);
	}

	/**
	 * Removes the policy fund with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy fund
	 * @return the policy fund that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyFundException if a policy fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFund remove(Serializable primaryKey)
		throws NoSuchPolicyFundException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyFund policyFund = (PolicyFund)session.get(PolicyFundImpl.class,
					primaryKey);

			if (policyFund == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyFundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyFund);
		}
		catch (NoSuchPolicyFundException nsee) {
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
	protected PolicyFund removeImpl(PolicyFund policyFund)
		throws SystemException {
		policyFund = toUnwrappedModel(policyFund);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyFund)) {
				policyFund = (PolicyFund)session.get(PolicyFundImpl.class,
						policyFund.getPrimaryKeyObj());
			}

			if (policyFund != null) {
				session.delete(policyFund);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyFund != null) {
			clearCache(policyFund);
		}

		return policyFund;
	}

	@Override
	public PolicyFund updateImpl(com.ifli.rapid.model.PolicyFund policyFund)
		throws SystemException {
		policyFund = toUnwrappedModel(policyFund);

		boolean isNew = policyFund.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyFund.isNew()) {
				session.save(policyFund);

				policyFund.setNew(false);
			}
			else {
				session.merge(policyFund);
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

		EntityCacheUtil.putResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
			PolicyFundImpl.class, policyFund.getPrimaryKey(), policyFund);

		return policyFund;
	}

	protected PolicyFund toUnwrappedModel(PolicyFund policyFund) {
		if (policyFund instanceof PolicyFundImpl) {
			return policyFund;
		}

		PolicyFundImpl policyFundImpl = new PolicyFundImpl();

		policyFundImpl.setNew(policyFund.isNew());
		policyFundImpl.setPrimaryKey(policyFund.getPrimaryKey());

		policyFundImpl.setPOLICY_FUND_ID(policyFund.getPOLICY_FUND_ID());
		policyFundImpl.setPOLICY_ID(policyFund.getPOLICY_ID());
		policyFundImpl.setFUND_ID(policyFund.getFUND_ID());
		policyFundImpl.setFUND_UNITS(policyFund.getFUND_UNITS());
		policyFundImpl.setNAV(policyFund.getNAV());
		policyFundImpl.setTOTAL_FUND(policyFund.getTOTAL_FUND());

		return policyFundImpl;
	}

	/**
	 * Returns the policy fund with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy fund
	 * @return the policy fund
	 * @throws com.ifli.rapid.NoSuchPolicyFundException if a policy fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFund findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyFundException, SystemException {
		PolicyFund policyFund = fetchByPrimaryKey(primaryKey);

		if (policyFund == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyFundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyFund;
	}

	/**
	 * Returns the policy fund with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyFundException} if it could not be found.
	 *
	 * @param POLICY_FUND_ID the primary key of the policy fund
	 * @return the policy fund
	 * @throws com.ifli.rapid.NoSuchPolicyFundException if a policy fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFund findByPrimaryKey(int POLICY_FUND_ID)
		throws NoSuchPolicyFundException, SystemException {
		return findByPrimaryKey((Serializable)POLICY_FUND_ID);
	}

	/**
	 * Returns the policy fund with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy fund
	 * @return the policy fund, or <code>null</code> if a policy fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFund fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyFund policyFund = (PolicyFund)EntityCacheUtil.getResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
				PolicyFundImpl.class, primaryKey);

		if (policyFund == _nullPolicyFund) {
			return null;
		}

		if (policyFund == null) {
			Session session = null;

			try {
				session = openSession();

				policyFund = (PolicyFund)session.get(PolicyFundImpl.class,
						primaryKey);

				if (policyFund != null) {
					cacheResult(policyFund);
				}
				else {
					EntityCacheUtil.putResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
						PolicyFundImpl.class, primaryKey, _nullPolicyFund);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyFundModelImpl.ENTITY_CACHE_ENABLED,
					PolicyFundImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyFund;
	}

	/**
	 * Returns the policy fund with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param POLICY_FUND_ID the primary key of the policy fund
	 * @return the policy fund, or <code>null</code> if a policy fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyFund fetchByPrimaryKey(int POLICY_FUND_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)POLICY_FUND_ID);
	}

	/**
	 * Returns all the policy funds.
	 *
	 * @return the policy funds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFund> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy funds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy funds
	 * @param end the upper bound of the range of policy funds (not inclusive)
	 * @return the range of policy funds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFund> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy funds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy funds
	 * @param end the upper bound of the range of policy funds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy funds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyFund> findAll(int start, int end,
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

		List<PolicyFund> list = (List<PolicyFund>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYFUND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYFUND;

				if (pagination) {
					sql = sql.concat(PolicyFundModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyFund>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyFund>(list);
				}
				else {
					list = (List<PolicyFund>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the policy funds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyFund policyFund : findAll()) {
			remove(policyFund);
		}
	}

	/**
	 * Returns the number of policy funds.
	 *
	 * @return the number of policy funds
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

				Query q = session.createQuery(_SQL_COUNT_POLICYFUND);

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
	 * Initializes the policy fund persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyFund")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyFund>> listenersList = new ArrayList<ModelListener<PolicyFund>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyFund>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyFundImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYFUND = "SELECT policyFund FROM PolicyFund policyFund";
	private static final String _SQL_COUNT_POLICYFUND = "SELECT COUNT(policyFund) FROM PolicyFund policyFund";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyFund.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyFund exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyFundPersistenceImpl.class);
	private static PolicyFund _nullPolicyFund = new PolicyFundImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyFund> toCacheModel() {
				return _nullPolicyFundCacheModel;
			}
		};

	private static CacheModel<PolicyFund> _nullPolicyFundCacheModel = new CacheModel<PolicyFund>() {
			@Override
			public PolicyFund toEntityModel() {
				return _nullPolicyFund;
			}
		};
}