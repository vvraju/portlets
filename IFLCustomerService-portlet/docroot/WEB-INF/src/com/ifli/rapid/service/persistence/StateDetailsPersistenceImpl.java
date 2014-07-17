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

import com.ifli.rapid.NoSuchStateDetailsException;
import com.ifli.rapid.model.StateDetails;
import com.ifli.rapid.model.impl.StateDetailsImpl;
import com.ifli.rapid.model.impl.StateDetailsModelImpl;

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
 * The persistence implementation for the state details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see StateDetailsPersistence
 * @see StateDetailsUtil
 * @generated
 */
public class StateDetailsPersistenceImpl extends BasePersistenceImpl<StateDetails>
	implements StateDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StateDetailsUtil} to access the state details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StateDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
			StateDetailsModelImpl.FINDER_CACHE_ENABLED, StateDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
			StateDetailsModelImpl.FINDER_CACHE_ENABLED, StateDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
			StateDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StateDetailsPersistenceImpl() {
		setModelClass(StateDetails.class);
	}

	/**
	 * Caches the state details in the entity cache if it is enabled.
	 *
	 * @param stateDetails the state details
	 */
	@Override
	public void cacheResult(StateDetails stateDetails) {
		EntityCacheUtil.putResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
			StateDetailsImpl.class, stateDetails.getPrimaryKey(), stateDetails);

		stateDetails.resetOriginalValues();
	}

	/**
	 * Caches the state detailses in the entity cache if it is enabled.
	 *
	 * @param stateDetailses the state detailses
	 */
	@Override
	public void cacheResult(List<StateDetails> stateDetailses) {
		for (StateDetails stateDetails : stateDetailses) {
			if (EntityCacheUtil.getResult(
						StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
						StateDetailsImpl.class, stateDetails.getPrimaryKey()) == null) {
				cacheResult(stateDetails);
			}
			else {
				stateDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all state detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StateDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StateDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the state details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StateDetails stateDetails) {
		EntityCacheUtil.removeResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
			StateDetailsImpl.class, stateDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StateDetails> stateDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StateDetails stateDetails : stateDetailses) {
			EntityCacheUtil.removeResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
				StateDetailsImpl.class, stateDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new state details with the primary key. Does not add the state details to the database.
	 *
	 * @param STATE_ID the primary key for the new state details
	 * @return the new state details
	 */
	@Override
	public StateDetails create(int STATE_ID) {
		StateDetails stateDetails = new StateDetailsImpl();

		stateDetails.setNew(true);
		stateDetails.setPrimaryKey(STATE_ID);

		return stateDetails;
	}

	/**
	 * Removes the state details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param STATE_ID the primary key of the state details
	 * @return the state details that was removed
	 * @throws com.ifli.rapid.NoSuchStateDetailsException if a state details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StateDetails remove(int STATE_ID)
		throws NoSuchStateDetailsException, SystemException {
		return remove((Serializable)STATE_ID);
	}

	/**
	 * Removes the state details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the state details
	 * @return the state details that was removed
	 * @throws com.ifli.rapid.NoSuchStateDetailsException if a state details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StateDetails remove(Serializable primaryKey)
		throws NoSuchStateDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StateDetails stateDetails = (StateDetails)session.get(StateDetailsImpl.class,
					primaryKey);

			if (stateDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStateDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(stateDetails);
		}
		catch (NoSuchStateDetailsException nsee) {
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
	protected StateDetails removeImpl(StateDetails stateDetails)
		throws SystemException {
		stateDetails = toUnwrappedModel(stateDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stateDetails)) {
				stateDetails = (StateDetails)session.get(StateDetailsImpl.class,
						stateDetails.getPrimaryKeyObj());
			}

			if (stateDetails != null) {
				session.delete(stateDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (stateDetails != null) {
			clearCache(stateDetails);
		}

		return stateDetails;
	}

	@Override
	public StateDetails updateImpl(
		com.ifli.rapid.model.StateDetails stateDetails)
		throws SystemException {
		stateDetails = toUnwrappedModel(stateDetails);

		boolean isNew = stateDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (stateDetails.isNew()) {
				session.save(stateDetails);

				stateDetails.setNew(false);
			}
			else {
				session.merge(stateDetails);
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

		EntityCacheUtil.putResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
			StateDetailsImpl.class, stateDetails.getPrimaryKey(), stateDetails);

		return stateDetails;
	}

	protected StateDetails toUnwrappedModel(StateDetails stateDetails) {
		if (stateDetails instanceof StateDetailsImpl) {
			return stateDetails;
		}

		StateDetailsImpl stateDetailsImpl = new StateDetailsImpl();

		stateDetailsImpl.setNew(stateDetails.isNew());
		stateDetailsImpl.setPrimaryKey(stateDetails.getPrimaryKey());

		stateDetailsImpl.setSTATE_ID(stateDetails.getSTATE_ID());
		stateDetailsImpl.setSTATE_NAME(stateDetails.getSTATE_NAME());
		stateDetailsImpl.setSTATE_CODE(stateDetails.getSTATE_CODE());
		stateDetailsImpl.setBRANCH_FLAG(stateDetails.getBRANCH_FLAG());
		stateDetailsImpl.setMEDICAL_CENTER_FLAG(stateDetails.getMEDICAL_CENTER_FLAG());
		stateDetailsImpl.setDROP_BOX_FLAG(stateDetails.getDROP_BOX_FLAG());

		return stateDetailsImpl;
	}

	/**
	 * Returns the state details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the state details
	 * @return the state details
	 * @throws com.ifli.rapid.NoSuchStateDetailsException if a state details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StateDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStateDetailsException, SystemException {
		StateDetails stateDetails = fetchByPrimaryKey(primaryKey);

		if (stateDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStateDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return stateDetails;
	}

	/**
	 * Returns the state details with the primary key or throws a {@link com.ifli.rapid.NoSuchStateDetailsException} if it could not be found.
	 *
	 * @param STATE_ID the primary key of the state details
	 * @return the state details
	 * @throws com.ifli.rapid.NoSuchStateDetailsException if a state details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StateDetails findByPrimaryKey(int STATE_ID)
		throws NoSuchStateDetailsException, SystemException {
		return findByPrimaryKey((Serializable)STATE_ID);
	}

	/**
	 * Returns the state details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the state details
	 * @return the state details, or <code>null</code> if a state details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StateDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StateDetails stateDetails = (StateDetails)EntityCacheUtil.getResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
				StateDetailsImpl.class, primaryKey);

		if (stateDetails == _nullStateDetails) {
			return null;
		}

		if (stateDetails == null) {
			Session session = null;

			try {
				session = openSession();

				stateDetails = (StateDetails)session.get(StateDetailsImpl.class,
						primaryKey);

				if (stateDetails != null) {
					cacheResult(stateDetails);
				}
				else {
					EntityCacheUtil.putResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
						StateDetailsImpl.class, primaryKey, _nullStateDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StateDetailsModelImpl.ENTITY_CACHE_ENABLED,
					StateDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return stateDetails;
	}

	/**
	 * Returns the state details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param STATE_ID the primary key of the state details
	 * @return the state details, or <code>null</code> if a state details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StateDetails fetchByPrimaryKey(int STATE_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)STATE_ID);
	}

	/**
	 * Returns all the state detailses.
	 *
	 * @return the state detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StateDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the state detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.StateDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state detailses
	 * @param end the upper bound of the range of state detailses (not inclusive)
	 * @return the range of state detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StateDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the state detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.StateDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of state detailses
	 * @param end the upper bound of the range of state detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of state detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StateDetails> findAll(int start, int end,
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

		List<StateDetails> list = (List<StateDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATEDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATEDETAILS;

				if (pagination) {
					sql = sql.concat(StateDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StateDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StateDetails>(list);
				}
				else {
					list = (List<StateDetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the state detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StateDetails stateDetails : findAll()) {
			remove(stateDetails);
		}
	}

	/**
	 * Returns the number of state detailses.
	 *
	 * @return the number of state detailses
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

				Query q = session.createQuery(_SQL_COUNT_STATEDETAILS);

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
	 * Initializes the state details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.StateDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StateDetails>> listenersList = new ArrayList<ModelListener<StateDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StateDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StateDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATEDETAILS = "SELECT stateDetails FROM StateDetails stateDetails";
	private static final String _SQL_COUNT_STATEDETAILS = "SELECT COUNT(stateDetails) FROM StateDetails stateDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "stateDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StateDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StateDetailsPersistenceImpl.class);
	private static StateDetails _nullStateDetails = new StateDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StateDetails> toCacheModel() {
				return _nullStateDetailsCacheModel;
			}
		};

	private static CacheModel<StateDetails> _nullStateDetailsCacheModel = new CacheModel<StateDetails>() {
			@Override
			public StateDetails toEntityModel() {
				return _nullStateDetails;
			}
		};
}