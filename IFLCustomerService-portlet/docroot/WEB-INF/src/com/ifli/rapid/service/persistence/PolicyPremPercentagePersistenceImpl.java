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

import com.ifli.rapid.NoSuchPolicyPremPercentageException;
import com.ifli.rapid.model.PolicyPremPercentage;
import com.ifli.rapid.model.impl.PolicyPremPercentageImpl;
import com.ifli.rapid.model.impl.PolicyPremPercentageModelImpl;

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
 * The persistence implementation for the policy prem percentage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PolicyPremPercentagePersistence
 * @see PolicyPremPercentageUtil
 * @generated
 */
public class PolicyPremPercentagePersistenceImpl extends BasePersistenceImpl<PolicyPremPercentage>
	implements PolicyPremPercentagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PolicyPremPercentageUtil} to access the policy prem percentage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PolicyPremPercentageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremPercentageModelImpl.FINDER_CACHE_ENABLED,
			PolicyPremPercentageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremPercentageModelImpl.FINDER_CACHE_ENABLED,
			PolicyPremPercentageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremPercentageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PolicyPremPercentagePersistenceImpl() {
		setModelClass(PolicyPremPercentage.class);
	}

	/**
	 * Caches the policy prem percentage in the entity cache if it is enabled.
	 *
	 * @param policyPremPercentage the policy prem percentage
	 */
	@Override
	public void cacheResult(PolicyPremPercentage policyPremPercentage) {
		EntityCacheUtil.putResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremPercentageImpl.class,
			policyPremPercentage.getPrimaryKey(), policyPremPercentage);

		policyPremPercentage.resetOriginalValues();
	}

	/**
	 * Caches the policy prem percentages in the entity cache if it is enabled.
	 *
	 * @param policyPremPercentages the policy prem percentages
	 */
	@Override
	public void cacheResult(List<PolicyPremPercentage> policyPremPercentages) {
		for (PolicyPremPercentage policyPremPercentage : policyPremPercentages) {
			if (EntityCacheUtil.getResult(
						PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
						PolicyPremPercentageImpl.class,
						policyPremPercentage.getPrimaryKey()) == null) {
				cacheResult(policyPremPercentage);
			}
			else {
				policyPremPercentage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all policy prem percentages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PolicyPremPercentageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PolicyPremPercentageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the policy prem percentage.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PolicyPremPercentage policyPremPercentage) {
		EntityCacheUtil.removeResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremPercentageImpl.class, policyPremPercentage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PolicyPremPercentage> policyPremPercentages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PolicyPremPercentage policyPremPercentage : policyPremPercentages) {
			EntityCacheUtil.removeResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
				PolicyPremPercentageImpl.class,
				policyPremPercentage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new policy prem percentage with the primary key. Does not add the policy prem percentage to the database.
	 *
	 * @param PREM_PERCENTAGE_ID the primary key for the new policy prem percentage
	 * @return the new policy prem percentage
	 */
	@Override
	public PolicyPremPercentage create(int PREM_PERCENTAGE_ID) {
		PolicyPremPercentage policyPremPercentage = new PolicyPremPercentageImpl();

		policyPremPercentage.setNew(true);
		policyPremPercentage.setPrimaryKey(PREM_PERCENTAGE_ID);

		return policyPremPercentage;
	}

	/**
	 * Removes the policy prem percentage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PREM_PERCENTAGE_ID the primary key of the policy prem percentage
	 * @return the policy prem percentage that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyPremPercentageException if a policy prem percentage with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremPercentage remove(int PREM_PERCENTAGE_ID)
		throws NoSuchPolicyPremPercentageException, SystemException {
		return remove((Serializable)PREM_PERCENTAGE_ID);
	}

	/**
	 * Removes the policy prem percentage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the policy prem percentage
	 * @return the policy prem percentage that was removed
	 * @throws com.ifli.rapid.NoSuchPolicyPremPercentageException if a policy prem percentage with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremPercentage remove(Serializable primaryKey)
		throws NoSuchPolicyPremPercentageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PolicyPremPercentage policyPremPercentage = (PolicyPremPercentage)session.get(PolicyPremPercentageImpl.class,
					primaryKey);

			if (policyPremPercentage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPolicyPremPercentageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policyPremPercentage);
		}
		catch (NoSuchPolicyPremPercentageException nsee) {
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
	protected PolicyPremPercentage removeImpl(
		PolicyPremPercentage policyPremPercentage) throws SystemException {
		policyPremPercentage = toUnwrappedModel(policyPremPercentage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policyPremPercentage)) {
				policyPremPercentage = (PolicyPremPercentage)session.get(PolicyPremPercentageImpl.class,
						policyPremPercentage.getPrimaryKeyObj());
			}

			if (policyPremPercentage != null) {
				session.delete(policyPremPercentage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policyPremPercentage != null) {
			clearCache(policyPremPercentage);
		}

		return policyPremPercentage;
	}

	@Override
	public PolicyPremPercentage updateImpl(
		com.ifli.rapid.model.PolicyPremPercentage policyPremPercentage)
		throws SystemException {
		policyPremPercentage = toUnwrappedModel(policyPremPercentage);

		boolean isNew = policyPremPercentage.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policyPremPercentage.isNew()) {
				session.save(policyPremPercentage);

				policyPremPercentage.setNew(false);
			}
			else {
				session.merge(policyPremPercentage);
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

		EntityCacheUtil.putResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
			PolicyPremPercentageImpl.class,
			policyPremPercentage.getPrimaryKey(), policyPremPercentage);

		return policyPremPercentage;
	}

	protected PolicyPremPercentage toUnwrappedModel(
		PolicyPremPercentage policyPremPercentage) {
		if (policyPremPercentage instanceof PolicyPremPercentageImpl) {
			return policyPremPercentage;
		}

		PolicyPremPercentageImpl policyPremPercentageImpl = new PolicyPremPercentageImpl();

		policyPremPercentageImpl.setNew(policyPremPercentage.isNew());
		policyPremPercentageImpl.setPrimaryKey(policyPremPercentage.getPrimaryKey());

		policyPremPercentageImpl.setPREM_PERCENTAGE_ID(policyPremPercentage.getPREM_PERCENTAGE_ID());
		policyPremPercentageImpl.setPOLICY_ID(policyPremPercentage.getPOLICY_ID());
		policyPremPercentageImpl.setFUND_ID(policyPremPercentage.getFUND_ID());
		policyPremPercentageImpl.setFUND_PERCENTAGE(policyPremPercentage.getFUND_PERCENTAGE());

		return policyPremPercentageImpl;
	}

	/**
	 * Returns the policy prem percentage with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy prem percentage
	 * @return the policy prem percentage
	 * @throws com.ifli.rapid.NoSuchPolicyPremPercentageException if a policy prem percentage with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremPercentage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPolicyPremPercentageException, SystemException {
		PolicyPremPercentage policyPremPercentage = fetchByPrimaryKey(primaryKey);

		if (policyPremPercentage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPolicyPremPercentageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policyPremPercentage;
	}

	/**
	 * Returns the policy prem percentage with the primary key or throws a {@link com.ifli.rapid.NoSuchPolicyPremPercentageException} if it could not be found.
	 *
	 * @param PREM_PERCENTAGE_ID the primary key of the policy prem percentage
	 * @return the policy prem percentage
	 * @throws com.ifli.rapid.NoSuchPolicyPremPercentageException if a policy prem percentage with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremPercentage findByPrimaryKey(int PREM_PERCENTAGE_ID)
		throws NoSuchPolicyPremPercentageException, SystemException {
		return findByPrimaryKey((Serializable)PREM_PERCENTAGE_ID);
	}

	/**
	 * Returns the policy prem percentage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the policy prem percentage
	 * @return the policy prem percentage, or <code>null</code> if a policy prem percentage with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremPercentage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PolicyPremPercentage policyPremPercentage = (PolicyPremPercentage)EntityCacheUtil.getResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
				PolicyPremPercentageImpl.class, primaryKey);

		if (policyPremPercentage == _nullPolicyPremPercentage) {
			return null;
		}

		if (policyPremPercentage == null) {
			Session session = null;

			try {
				session = openSession();

				policyPremPercentage = (PolicyPremPercentage)session.get(PolicyPremPercentageImpl.class,
						primaryKey);

				if (policyPremPercentage != null) {
					cacheResult(policyPremPercentage);
				}
				else {
					EntityCacheUtil.putResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
						PolicyPremPercentageImpl.class, primaryKey,
						_nullPolicyPremPercentage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PolicyPremPercentageModelImpl.ENTITY_CACHE_ENABLED,
					PolicyPremPercentageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policyPremPercentage;
	}

	/**
	 * Returns the policy prem percentage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PREM_PERCENTAGE_ID the primary key of the policy prem percentage
	 * @return the policy prem percentage, or <code>null</code> if a policy prem percentage with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PolicyPremPercentage fetchByPrimaryKey(int PREM_PERCENTAGE_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PREM_PERCENTAGE_ID);
	}

	/**
	 * Returns all the policy prem percentages.
	 *
	 * @return the policy prem percentages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyPremPercentage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the policy prem percentages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremPercentageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy prem percentages
	 * @param end the upper bound of the range of policy prem percentages (not inclusive)
	 * @return the range of policy prem percentages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyPremPercentage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the policy prem percentages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PolicyPremPercentageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of policy prem percentages
	 * @param end the upper bound of the range of policy prem percentages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of policy prem percentages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PolicyPremPercentage> findAll(int start, int end,
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

		List<PolicyPremPercentage> list = (List<PolicyPremPercentage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICYPREMPERCENTAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICYPREMPERCENTAGE;

				if (pagination) {
					sql = sql.concat(PolicyPremPercentageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PolicyPremPercentage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PolicyPremPercentage>(list);
				}
				else {
					list = (List<PolicyPremPercentage>)QueryUtil.list(q,
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
	 * Removes all the policy prem percentages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PolicyPremPercentage policyPremPercentage : findAll()) {
			remove(policyPremPercentage);
		}
	}

	/**
	 * Returns the number of policy prem percentages.
	 *
	 * @return the number of policy prem percentages
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

				Query q = session.createQuery(_SQL_COUNT_POLICYPREMPERCENTAGE);

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
	 * Initializes the policy prem percentage persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PolicyPremPercentage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PolicyPremPercentage>> listenersList = new ArrayList<ModelListener<PolicyPremPercentage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PolicyPremPercentage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PolicyPremPercentageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICYPREMPERCENTAGE = "SELECT policyPremPercentage FROM PolicyPremPercentage policyPremPercentage";
	private static final String _SQL_COUNT_POLICYPREMPERCENTAGE = "SELECT COUNT(policyPremPercentage) FROM PolicyPremPercentage policyPremPercentage";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policyPremPercentage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PolicyPremPercentage exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PolicyPremPercentagePersistenceImpl.class);
	private static PolicyPremPercentage _nullPolicyPremPercentage = new PolicyPremPercentageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PolicyPremPercentage> toCacheModel() {
				return _nullPolicyPremPercentageCacheModel;
			}
		};

	private static CacheModel<PolicyPremPercentage> _nullPolicyPremPercentageCacheModel =
		new CacheModel<PolicyPremPercentage>() {
			@Override
			public PolicyPremPercentage toEntityModel() {
				return _nullPolicyPremPercentage;
			}
		};
}