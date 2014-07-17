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

import com.ifli.rapid.NoSuchActiveServiceRequestsException;
import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.impl.ActiveServiceRequestsImpl;
import com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl;

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
 * The persistence implementation for the active service requests service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ActiveServiceRequestsPersistence
 * @see ActiveServiceRequestsUtil
 * @generated
 */
public class ActiveServiceRequestsPersistenceImpl extends BasePersistenceImpl<ActiveServiceRequests>
	implements ActiveServiceRequestsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActiveServiceRequestsUtil} to access the active service requests persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActiveServiceRequestsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ActiveServiceRequestsModelImpl.FINDER_CACHE_ENABLED,
			ActiveServiceRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ActiveServiceRequestsModelImpl.FINDER_CACHE_ENABLED,
			ActiveServiceRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ActiveServiceRequestsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActiveServiceRequestsPersistenceImpl() {
		setModelClass(ActiveServiceRequests.class);
	}

	/**
	 * Caches the active service requests in the entity cache if it is enabled.
	 *
	 * @param activeServiceRequests the active service requests
	 */
	@Override
	public void cacheResult(ActiveServiceRequests activeServiceRequests) {
		EntityCacheUtil.putResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ActiveServiceRequestsImpl.class,
			activeServiceRequests.getPrimaryKey(), activeServiceRequests);

		activeServiceRequests.resetOriginalValues();
	}

	/**
	 * Caches the active service requestses in the entity cache if it is enabled.
	 *
	 * @param activeServiceRequestses the active service requestses
	 */
	@Override
	public void cacheResult(List<ActiveServiceRequests> activeServiceRequestses) {
		for (ActiveServiceRequests activeServiceRequests : activeServiceRequestses) {
			if (EntityCacheUtil.getResult(
						ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
						ActiveServiceRequestsImpl.class,
						activeServiceRequests.getPrimaryKey()) == null) {
				cacheResult(activeServiceRequests);
			}
			else {
				activeServiceRequests.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all active service requestses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActiveServiceRequestsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActiveServiceRequestsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the active service requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActiveServiceRequests activeServiceRequests) {
		EntityCacheUtil.removeResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ActiveServiceRequestsImpl.class,
			activeServiceRequests.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActiveServiceRequests> activeServiceRequestses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActiveServiceRequests activeServiceRequests : activeServiceRequestses) {
			EntityCacheUtil.removeResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
				ActiveServiceRequestsImpl.class,
				activeServiceRequests.getPrimaryKey());
		}
	}

	/**
	 * Creates a new active service requests with the primary key. Does not add the active service requests to the database.
	 *
	 * @param QRC_ASR_ID the primary key for the new active service requests
	 * @return the new active service requests
	 */
	@Override
	public ActiveServiceRequests create(int QRC_ASR_ID) {
		ActiveServiceRequests activeServiceRequests = new ActiveServiceRequestsImpl();

		activeServiceRequests.setNew(true);
		activeServiceRequests.setPrimaryKey(QRC_ASR_ID);

		return activeServiceRequests;
	}

	/**
	 * Removes the active service requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_ASR_ID the primary key of the active service requests
	 * @return the active service requests that was removed
	 * @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActiveServiceRequests remove(int QRC_ASR_ID)
		throws NoSuchActiveServiceRequestsException, SystemException {
		return remove((Serializable)QRC_ASR_ID);
	}

	/**
	 * Removes the active service requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the active service requests
	 * @return the active service requests that was removed
	 * @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActiveServiceRequests remove(Serializable primaryKey)
		throws NoSuchActiveServiceRequestsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActiveServiceRequests activeServiceRequests = (ActiveServiceRequests)session.get(ActiveServiceRequestsImpl.class,
					primaryKey);

			if (activeServiceRequests == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActiveServiceRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(activeServiceRequests);
		}
		catch (NoSuchActiveServiceRequestsException nsee) {
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
	protected ActiveServiceRequests removeImpl(
		ActiveServiceRequests activeServiceRequests) throws SystemException {
		activeServiceRequests = toUnwrappedModel(activeServiceRequests);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(activeServiceRequests)) {
				activeServiceRequests = (ActiveServiceRequests)session.get(ActiveServiceRequestsImpl.class,
						activeServiceRequests.getPrimaryKeyObj());
			}

			if (activeServiceRequests != null) {
				session.delete(activeServiceRequests);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (activeServiceRequests != null) {
			clearCache(activeServiceRequests);
		}

		return activeServiceRequests;
	}

	@Override
	public ActiveServiceRequests updateImpl(
		com.ifli.rapid.model.ActiveServiceRequests activeServiceRequests)
		throws SystemException {
		activeServiceRequests = toUnwrappedModel(activeServiceRequests);

		boolean isNew = activeServiceRequests.isNew();

		Session session = null;

		try {
			session = openSession();

			if (activeServiceRequests.isNew()) {
				session.save(activeServiceRequests);

				activeServiceRequests.setNew(false);
			}
			else {
				session.merge(activeServiceRequests);
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

		EntityCacheUtil.putResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ActiveServiceRequestsImpl.class,
			activeServiceRequests.getPrimaryKey(), activeServiceRequests);

		return activeServiceRequests;
	}

	protected ActiveServiceRequests toUnwrappedModel(
		ActiveServiceRequests activeServiceRequests) {
		if (activeServiceRequests instanceof ActiveServiceRequestsImpl) {
			return activeServiceRequests;
		}

		ActiveServiceRequestsImpl activeServiceRequestsImpl = new ActiveServiceRequestsImpl();

		activeServiceRequestsImpl.setNew(activeServiceRequests.isNew());
		activeServiceRequestsImpl.setPrimaryKey(activeServiceRequests.getPrimaryKey());

		activeServiceRequestsImpl.setQRC_ASR_ID(activeServiceRequests.getQRC_ASR_ID());
		activeServiceRequestsImpl.setTYPE_ID(activeServiceRequests.getTYPE_ID());
		activeServiceRequestsImpl.setSUB_TYPE_ID(activeServiceRequests.getSUB_TYPE_ID());
		activeServiceRequestsImpl.setASSIGNED_TO(activeServiceRequests.getASSIGNED_TO());
		activeServiceRequestsImpl.setHANDLED_BY(activeServiceRequests.getHANDLED_BY());
		activeServiceRequestsImpl.setSTATUS_ID(activeServiceRequests.getSTATUS_ID());
		activeServiceRequestsImpl.setCUSTOMER_ID(activeServiceRequests.getCUSTOMER_ID());
		activeServiceRequestsImpl.setCUST_SR_NUMBER(activeServiceRequests.getCUST_SR_NUMBER());
		activeServiceRequestsImpl.setADDITIONAL_DATA_XML(activeServiceRequests.getADDITIONAL_DATA_XML());
		activeServiceRequestsImpl.setINSERTED_DATE(activeServiceRequests.getINSERTED_DATE());
		activeServiceRequestsImpl.setINSERTED_BY(activeServiceRequests.getINSERTED_BY());
		activeServiceRequestsImpl.setUPDATED_DATE(activeServiceRequests.getUPDATED_DATE());
		activeServiceRequestsImpl.setUPDATED_BY(activeServiceRequests.getUPDATED_BY());

		return activeServiceRequestsImpl;
	}

	/**
	 * Returns the active service requests with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the active service requests
	 * @return the active service requests
	 * @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActiveServiceRequests findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActiveServiceRequestsException, SystemException {
		ActiveServiceRequests activeServiceRequests = fetchByPrimaryKey(primaryKey);

		if (activeServiceRequests == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActiveServiceRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return activeServiceRequests;
	}

	/**
	 * Returns the active service requests with the primary key or throws a {@link com.ifli.rapid.NoSuchActiveServiceRequestsException} if it could not be found.
	 *
	 * @param QRC_ASR_ID the primary key of the active service requests
	 * @return the active service requests
	 * @throws com.ifli.rapid.NoSuchActiveServiceRequestsException if a active service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActiveServiceRequests findByPrimaryKey(int QRC_ASR_ID)
		throws NoSuchActiveServiceRequestsException, SystemException {
		return findByPrimaryKey((Serializable)QRC_ASR_ID);
	}

	/**
	 * Returns the active service requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the active service requests
	 * @return the active service requests, or <code>null</code> if a active service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActiveServiceRequests fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActiveServiceRequests activeServiceRequests = (ActiveServiceRequests)EntityCacheUtil.getResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
				ActiveServiceRequestsImpl.class, primaryKey);

		if (activeServiceRequests == _nullActiveServiceRequests) {
			return null;
		}

		if (activeServiceRequests == null) {
			Session session = null;

			try {
				session = openSession();

				activeServiceRequests = (ActiveServiceRequests)session.get(ActiveServiceRequestsImpl.class,
						primaryKey);

				if (activeServiceRequests != null) {
					cacheResult(activeServiceRequests);
				}
				else {
					EntityCacheUtil.putResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
						ActiveServiceRequestsImpl.class, primaryKey,
						_nullActiveServiceRequests);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActiveServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
					ActiveServiceRequestsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return activeServiceRequests;
	}

	/**
	 * Returns the active service requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_ASR_ID the primary key of the active service requests
	 * @return the active service requests, or <code>null</code> if a active service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActiveServiceRequests fetchByPrimaryKey(int QRC_ASR_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_ASR_ID);
	}

	/**
	 * Returns all the active service requestses.
	 *
	 * @return the active service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActiveServiceRequests> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the active service requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of active service requestses
	 * @param end the upper bound of the range of active service requestses (not inclusive)
	 * @return the range of active service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActiveServiceRequests> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the active service requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ActiveServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of active service requestses
	 * @param end the upper bound of the range of active service requestses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of active service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActiveServiceRequests> findAll(int start, int end,
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

		List<ActiveServiceRequests> list = (List<ActiveServiceRequests>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIVESERVICEREQUESTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVESERVICEREQUESTS;

				if (pagination) {
					sql = sql.concat(ActiveServiceRequestsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActiveServiceRequests>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActiveServiceRequests>(list);
				}
				else {
					list = (List<ActiveServiceRequests>)QueryUtil.list(q,
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
	 * Removes all the active service requestses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActiveServiceRequests activeServiceRequests : findAll()) {
			remove(activeServiceRequests);
		}
	}

	/**
	 * Returns the number of active service requestses.
	 *
	 * @return the number of active service requestses
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

				Query q = session.createQuery(_SQL_COUNT_ACTIVESERVICEREQUESTS);

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
	 * Initializes the active service requests persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ActiveServiceRequests")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActiveServiceRequests>> listenersList = new ArrayList<ModelListener<ActiveServiceRequests>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActiveServiceRequests>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActiveServiceRequestsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIVESERVICEREQUESTS = "SELECT activeServiceRequests FROM ActiveServiceRequests activeServiceRequests";
	private static final String _SQL_COUNT_ACTIVESERVICEREQUESTS = "SELECT COUNT(activeServiceRequests) FROM ActiveServiceRequests activeServiceRequests";
	private static final String _ORDER_BY_ENTITY_ALIAS = "activeServiceRequests.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActiveServiceRequests exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActiveServiceRequestsPersistenceImpl.class);
	private static ActiveServiceRequests _nullActiveServiceRequests = new ActiveServiceRequestsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActiveServiceRequests> toCacheModel() {
				return _nullActiveServiceRequestsCacheModel;
			}
		};

	private static CacheModel<ActiveServiceRequests> _nullActiveServiceRequestsCacheModel =
		new CacheModel<ActiveServiceRequests>() {
			@Override
			public ActiveServiceRequests toEntityModel() {
				return _nullActiveServiceRequests;
			}
		};
}