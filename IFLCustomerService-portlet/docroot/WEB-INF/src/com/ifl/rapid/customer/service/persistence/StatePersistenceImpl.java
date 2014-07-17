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

import com.ifl.rapid.customer.NoSuchStateException;
import com.ifl.rapid.customer.model.State;
import com.ifl.rapid.customer.model.impl.StateImpl;
import com.ifl.rapid.customer.model.impl.StateModelImpl;

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
 * The persistence implementation for the state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see StatePersistence
 * @see StateUtil
 * @generated
 */
public class StatePersistenceImpl extends BasePersistenceImpl<State>
	implements StatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StateUtil} to access the state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StateModelImpl.ENTITY_CACHE_ENABLED,
			StateModelImpl.FINDER_CACHE_ENABLED, StateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StateModelImpl.ENTITY_CACHE_ENABLED,
			StateModelImpl.FINDER_CACHE_ENABLED, StateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StateModelImpl.ENTITY_CACHE_ENABLED,
			StateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StatePersistenceImpl() {
		setModelClass(State.class);
	}

	/**
	 * Caches the state in the entity cache if it is enabled.
	 *
	 * @param state the state
	 */
	@Override
	public void cacheResult(State state) {
		EntityCacheUtil.putResult(StateModelImpl.ENTITY_CACHE_ENABLED,
			StateImpl.class, state.getPrimaryKey(), state);

		state.resetOriginalValues();
	}

	/**
	 * Caches the states in the entity cache if it is enabled.
	 *
	 * @param states the states
	 */
	@Override
	public void cacheResult(List<State> states) {
		for (State state : states) {
			if (EntityCacheUtil.getResult(StateModelImpl.ENTITY_CACHE_ENABLED,
						StateImpl.class, state.getPrimaryKey()) == null) {
				cacheResult(state);
			}
			else {
				state.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all states.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the state.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(State state) {
		EntityCacheUtil.removeResult(StateModelImpl.ENTITY_CACHE_ENABLED,
			StateImpl.class, state.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<State> states) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (State state : states) {
			EntityCacheUtil.removeResult(StateModelImpl.ENTITY_CACHE_ENABLED,
				StateImpl.class, state.getPrimaryKey());
		}
	}

	/**
	 * Creates a new state with the primary key. Does not add the state to the database.
	 *
	 * @param StateId the primary key for the new state
	 * @return the new state
	 */
	@Override
	public State create(int StateId) {
		State state = new StateImpl();

		state.setNew(true);
		state.setPrimaryKey(StateId);

		return state;
	}

	/**
	 * Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param StateId the primary key of the state
	 * @return the state that was removed
	 * @throws com.ifl.rapid.customer.NoSuchStateException if a state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public State remove(int StateId)
		throws NoSuchStateException, SystemException {
		return remove((Serializable)StateId);
	}

	/**
	 * Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the state
	 * @return the state that was removed
	 * @throws com.ifl.rapid.customer.NoSuchStateException if a state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public State remove(Serializable primaryKey)
		throws NoSuchStateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			State state = (State)session.get(StateImpl.class, primaryKey);

			if (state == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(state);
		}
		catch (NoSuchStateException nsee) {
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
	protected State removeImpl(State state) throws SystemException {
		state = toUnwrappedModel(state);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(state)) {
				state = (State)session.get(StateImpl.class,
						state.getPrimaryKeyObj());
			}

			if (state != null) {
				session.delete(state);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (state != null) {
			clearCache(state);
		}

		return state;
	}

	@Override
	public State updateImpl(com.ifl.rapid.customer.model.State state)
		throws SystemException {
		state = toUnwrappedModel(state);

		boolean isNew = state.isNew();

		Session session = null;

		try {
			session = openSession();

			if (state.isNew()) {
				session.save(state);

				state.setNew(false);
			}
			else {
				session.merge(state);
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

		EntityCacheUtil.putResult(StateModelImpl.ENTITY_CACHE_ENABLED,
			StateImpl.class, state.getPrimaryKey(), state);

		return state;
	}

	protected State toUnwrappedModel(State state) {
		if (state instanceof StateImpl) {
			return state;
		}

		StateImpl stateImpl = new StateImpl();

		stateImpl.setNew(state.isNew());
		stateImpl.setPrimaryKey(state.getPrimaryKey());

		stateImpl.setStateId(state.getStateId());
		stateImpl.setStateCode(state.getStateCode());
		stateImpl.setStateName(state.getStateName());
		stateImpl.setIsActive(state.getIsActive());
		stateImpl.setCreatedBy(state.getCreatedBy());
		stateImpl.setCreatedDate(state.getCreatedDate());
		stateImpl.setModifiedDate(state.getModifiedDate());
		stateImpl.setModifiedBy(state.getModifiedBy());

		return stateImpl;
	}

	/**
	 * Returns the state with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the state
	 * @return the state
	 * @throws com.ifl.rapid.customer.NoSuchStateException if a state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public State findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStateException, SystemException {
		State state = fetchByPrimaryKey(primaryKey);

		if (state == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return state;
	}

	/**
	 * Returns the state with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchStateException} if it could not be found.
	 *
	 * @param StateId the primary key of the state
	 * @return the state
	 * @throws com.ifl.rapid.customer.NoSuchStateException if a state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public State findByPrimaryKey(int StateId)
		throws NoSuchStateException, SystemException {
		return findByPrimaryKey((Serializable)StateId);
	}

	/**
	 * Returns the state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the state
	 * @return the state, or <code>null</code> if a state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public State fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		State state = (State)EntityCacheUtil.getResult(StateModelImpl.ENTITY_CACHE_ENABLED,
				StateImpl.class, primaryKey);

		if (state == _nullState) {
			return null;
		}

		if (state == null) {
			Session session = null;

			try {
				session = openSession();

				state = (State)session.get(StateImpl.class, primaryKey);

				if (state != null) {
					cacheResult(state);
				}
				else {
					EntityCacheUtil.putResult(StateModelImpl.ENTITY_CACHE_ENABLED,
						StateImpl.class, primaryKey, _nullState);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StateModelImpl.ENTITY_CACHE_ENABLED,
					StateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return state;
	}

	/**
	 * Returns the state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param StateId the primary key of the state
	 * @return the state, or <code>null</code> if a state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public State fetchByPrimaryKey(int StateId) throws SystemException {
		return fetchByPrimaryKey((Serializable)StateId);
	}

	/**
	 * Returns all the states.
	 *
	 * @return the states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<State> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.StateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of states
	 * @param end the upper bound of the range of states (not inclusive)
	 * @return the range of states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<State> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.StateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of states
	 * @param end the upper bound of the range of states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<State> findAll(int start, int end,
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

		List<State> list = (List<State>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATE;

				if (pagination) {
					sql = sql.concat(StateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<State>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<State>(list);
				}
				else {
					list = (List<State>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the states from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (State state : findAll()) {
			remove(state);
		}
	}

	/**
	 * Returns the number of states.
	 *
	 * @return the number of states
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

				Query q = session.createQuery(_SQL_COUNT_STATE);

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
	 * Initializes the state persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.State")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<State>> listenersList = new ArrayList<ModelListener<State>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<State>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATE = "SELECT state FROM State state";
	private static final String _SQL_COUNT_STATE = "SELECT COUNT(state) FROM State state";
	private static final String _ORDER_BY_ENTITY_ALIAS = "state.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No State exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StatePersistenceImpl.class);
	private static State _nullState = new StateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<State> toCacheModel() {
				return _nullStateCacheModel;
			}
		};

	private static CacheModel<State> _nullStateCacheModel = new CacheModel<State>() {
			@Override
			public State toEntityModel() {
				return _nullState;
			}
		};
}