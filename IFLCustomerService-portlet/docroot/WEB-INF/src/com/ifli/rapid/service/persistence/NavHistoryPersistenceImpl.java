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

import com.ifli.rapid.NoSuchNavHistoryException;
import com.ifli.rapid.model.NavHistory;
import com.ifli.rapid.model.impl.NavHistoryImpl;
import com.ifli.rapid.model.impl.NavHistoryModelImpl;

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
 * The persistence implementation for the nav history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see NavHistoryPersistence
 * @see NavHistoryUtil
 * @generated
 */
public class NavHistoryPersistenceImpl extends BasePersistenceImpl<NavHistory>
	implements NavHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NavHistoryUtil} to access the nav history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NavHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
			NavHistoryModelImpl.FINDER_CACHE_ENABLED, NavHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
			NavHistoryModelImpl.FINDER_CACHE_ENABLED, NavHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
			NavHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public NavHistoryPersistenceImpl() {
		setModelClass(NavHistory.class);
	}

	/**
	 * Caches the nav history in the entity cache if it is enabled.
	 *
	 * @param navHistory the nav history
	 */
	@Override
	public void cacheResult(NavHistory navHistory) {
		EntityCacheUtil.putResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
			NavHistoryImpl.class, navHistory.getPrimaryKey(), navHistory);

		navHistory.resetOriginalValues();
	}

	/**
	 * Caches the nav histories in the entity cache if it is enabled.
	 *
	 * @param navHistories the nav histories
	 */
	@Override
	public void cacheResult(List<NavHistory> navHistories) {
		for (NavHistory navHistory : navHistories) {
			if (EntityCacheUtil.getResult(
						NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
						NavHistoryImpl.class, navHistory.getPrimaryKey()) == null) {
				cacheResult(navHistory);
			}
			else {
				navHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nav histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NavHistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NavHistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nav history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NavHistory navHistory) {
		EntityCacheUtil.removeResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
			NavHistoryImpl.class, navHistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NavHistory> navHistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NavHistory navHistory : navHistories) {
			EntityCacheUtil.removeResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
				NavHistoryImpl.class, navHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nav history with the primary key. Does not add the nav history to the database.
	 *
	 * @param NAV_HISTORY_ID the primary key for the new nav history
	 * @return the new nav history
	 */
	@Override
	public NavHistory create(long NAV_HISTORY_ID) {
		NavHistory navHistory = new NavHistoryImpl();

		navHistory.setNew(true);
		navHistory.setPrimaryKey(NAV_HISTORY_ID);

		return navHistory;
	}

	/**
	 * Removes the nav history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param NAV_HISTORY_ID the primary key of the nav history
	 * @return the nav history that was removed
	 * @throws com.ifli.rapid.NoSuchNavHistoryException if a nav history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NavHistory remove(long NAV_HISTORY_ID)
		throws NoSuchNavHistoryException, SystemException {
		return remove((Serializable)NAV_HISTORY_ID);
	}

	/**
	 * Removes the nav history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nav history
	 * @return the nav history that was removed
	 * @throws com.ifli.rapid.NoSuchNavHistoryException if a nav history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NavHistory remove(Serializable primaryKey)
		throws NoSuchNavHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NavHistory navHistory = (NavHistory)session.get(NavHistoryImpl.class,
					primaryKey);

			if (navHistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNavHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(navHistory);
		}
		catch (NoSuchNavHistoryException nsee) {
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
	protected NavHistory removeImpl(NavHistory navHistory)
		throws SystemException {
		navHistory = toUnwrappedModel(navHistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(navHistory)) {
				navHistory = (NavHistory)session.get(NavHistoryImpl.class,
						navHistory.getPrimaryKeyObj());
			}

			if (navHistory != null) {
				session.delete(navHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (navHistory != null) {
			clearCache(navHistory);
		}

		return navHistory;
	}

	@Override
	public NavHistory updateImpl(com.ifli.rapid.model.NavHistory navHistory)
		throws SystemException {
		navHistory = toUnwrappedModel(navHistory);

		boolean isNew = navHistory.isNew();

		Session session = null;

		try {
			session = openSession();

			if (navHistory.isNew()) {
				session.save(navHistory);

				navHistory.setNew(false);
			}
			else {
				session.merge(navHistory);
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

		EntityCacheUtil.putResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
			NavHistoryImpl.class, navHistory.getPrimaryKey(), navHistory);

		return navHistory;
	}

	protected NavHistory toUnwrappedModel(NavHistory navHistory) {
		if (navHistory instanceof NavHistoryImpl) {
			return navHistory;
		}

		NavHistoryImpl navHistoryImpl = new NavHistoryImpl();

		navHistoryImpl.setNew(navHistory.isNew());
		navHistoryImpl.setPrimaryKey(navHistory.getPrimaryKey());

		navHistoryImpl.setNAV_HISTORY_ID(navHistory.getNAV_HISTORY_ID());
		navHistoryImpl.setDATE(navHistory.getDATE());
		navHistoryImpl.setNAV(navHistory.getNAV());
		navHistoryImpl.setSALE_PRICE(navHistory.getSALE_PRICE());
		navHistoryImpl.setPURCHASE_PRICE(navHistory.getPURCHASE_PRICE());
		navHistoryImpl.setFUND_CODE(navHistory.getFUND_CODE());
		navHistoryImpl.setFUND_NAME(navHistory.getFUND_NAME());

		return navHistoryImpl;
	}

	/**
	 * Returns the nav history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nav history
	 * @return the nav history
	 * @throws com.ifli.rapid.NoSuchNavHistoryException if a nav history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NavHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNavHistoryException, SystemException {
		NavHistory navHistory = fetchByPrimaryKey(primaryKey);

		if (navHistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNavHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return navHistory;
	}

	/**
	 * Returns the nav history with the primary key or throws a {@link com.ifli.rapid.NoSuchNavHistoryException} if it could not be found.
	 *
	 * @param NAV_HISTORY_ID the primary key of the nav history
	 * @return the nav history
	 * @throws com.ifli.rapid.NoSuchNavHistoryException if a nav history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NavHistory findByPrimaryKey(long NAV_HISTORY_ID)
		throws NoSuchNavHistoryException, SystemException {
		return findByPrimaryKey((Serializable)NAV_HISTORY_ID);
	}

	/**
	 * Returns the nav history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nav history
	 * @return the nav history, or <code>null</code> if a nav history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NavHistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NavHistory navHistory = (NavHistory)EntityCacheUtil.getResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
				NavHistoryImpl.class, primaryKey);

		if (navHistory == _nullNavHistory) {
			return null;
		}

		if (navHistory == null) {
			Session session = null;

			try {
				session = openSession();

				navHistory = (NavHistory)session.get(NavHistoryImpl.class,
						primaryKey);

				if (navHistory != null) {
					cacheResult(navHistory);
				}
				else {
					EntityCacheUtil.putResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
						NavHistoryImpl.class, primaryKey, _nullNavHistory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NavHistoryModelImpl.ENTITY_CACHE_ENABLED,
					NavHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return navHistory;
	}

	/**
	 * Returns the nav history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param NAV_HISTORY_ID the primary key of the nav history
	 * @return the nav history, or <code>null</code> if a nav history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NavHistory fetchByPrimaryKey(long NAV_HISTORY_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)NAV_HISTORY_ID);
	}

	/**
	 * Returns all the nav histories.
	 *
	 * @return the nav histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NavHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nav histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.NavHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nav histories
	 * @param end the upper bound of the range of nav histories (not inclusive)
	 * @return the range of nav histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NavHistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nav histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.NavHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nav histories
	 * @param end the upper bound of the range of nav histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nav histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NavHistory> findAll(int start, int end,
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

		List<NavHistory> list = (List<NavHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NAVHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NAVHISTORY;

				if (pagination) {
					sql = sql.concat(NavHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NavHistory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NavHistory>(list);
				}
				else {
					list = (List<NavHistory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nav histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NavHistory navHistory : findAll()) {
			remove(navHistory);
		}
	}

	/**
	 * Returns the number of nav histories.
	 *
	 * @return the number of nav histories
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

				Query q = session.createQuery(_SQL_COUNT_NAVHISTORY);

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
	 * Initializes the nav history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.NavHistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NavHistory>> listenersList = new ArrayList<ModelListener<NavHistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NavHistory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NavHistoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NAVHISTORY = "SELECT navHistory FROM NavHistory navHistory";
	private static final String _SQL_COUNT_NAVHISTORY = "SELECT COUNT(navHistory) FROM NavHistory navHistory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "navHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NavHistory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NavHistoryPersistenceImpl.class);
	private static NavHistory _nullNavHistory = new NavHistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NavHistory> toCacheModel() {
				return _nullNavHistoryCacheModel;
			}
		};

	private static CacheModel<NavHistory> _nullNavHistoryCacheModel = new CacheModel<NavHistory>() {
			@Override
			public NavHistory toEntityModel() {
				return _nullNavHistory;
			}
		};
}