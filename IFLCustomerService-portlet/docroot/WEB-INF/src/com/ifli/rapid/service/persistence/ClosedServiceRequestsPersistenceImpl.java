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

import com.ifli.rapid.NoSuchClosedServiceRequestsException;
import com.ifli.rapid.model.ClosedServiceRequests;
import com.ifli.rapid.model.impl.ClosedServiceRequestsImpl;
import com.ifli.rapid.model.impl.ClosedServiceRequestsModelImpl;

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
 * The persistence implementation for the closed service requests service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ClosedServiceRequestsPersistence
 * @see ClosedServiceRequestsUtil
 * @generated
 */
public class ClosedServiceRequestsPersistenceImpl extends BasePersistenceImpl<ClosedServiceRequests>
	implements ClosedServiceRequestsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ClosedServiceRequestsUtil} to access the closed service requests persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ClosedServiceRequestsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ClosedServiceRequestsModelImpl.FINDER_CACHE_ENABLED,
			ClosedServiceRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ClosedServiceRequestsModelImpl.FINDER_CACHE_ENABLED,
			ClosedServiceRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ClosedServiceRequestsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ClosedServiceRequestsPersistenceImpl() {
		setModelClass(ClosedServiceRequests.class);
	}

	/**
	 * Caches the closed service requests in the entity cache if it is enabled.
	 *
	 * @param closedServiceRequests the closed service requests
	 */
	@Override
	public void cacheResult(ClosedServiceRequests closedServiceRequests) {
		EntityCacheUtil.putResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ClosedServiceRequestsImpl.class,
			closedServiceRequests.getPrimaryKey(), closedServiceRequests);

		closedServiceRequests.resetOriginalValues();
	}

	/**
	 * Caches the closed service requestses in the entity cache if it is enabled.
	 *
	 * @param closedServiceRequestses the closed service requestses
	 */
	@Override
	public void cacheResult(List<ClosedServiceRequests> closedServiceRequestses) {
		for (ClosedServiceRequests closedServiceRequests : closedServiceRequestses) {
			if (EntityCacheUtil.getResult(
						ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
						ClosedServiceRequestsImpl.class,
						closedServiceRequests.getPrimaryKey()) == null) {
				cacheResult(closedServiceRequests);
			}
			else {
				closedServiceRequests.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all closed service requestses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ClosedServiceRequestsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ClosedServiceRequestsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the closed service requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ClosedServiceRequests closedServiceRequests) {
		EntityCacheUtil.removeResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ClosedServiceRequestsImpl.class,
			closedServiceRequests.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ClosedServiceRequests> closedServiceRequestses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ClosedServiceRequests closedServiceRequests : closedServiceRequestses) {
			EntityCacheUtil.removeResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
				ClosedServiceRequestsImpl.class,
				closedServiceRequests.getPrimaryKey());
		}
	}

	/**
	 * Creates a new closed service requests with the primary key. Does not add the closed service requests to the database.
	 *
	 * @param QRC_CSR_ID the primary key for the new closed service requests
	 * @return the new closed service requests
	 */
	@Override
	public ClosedServiceRequests create(int QRC_CSR_ID) {
		ClosedServiceRequests closedServiceRequests = new ClosedServiceRequestsImpl();

		closedServiceRequests.setNew(true);
		closedServiceRequests.setPrimaryKey(QRC_CSR_ID);

		return closedServiceRequests;
	}

	/**
	 * Removes the closed service requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_CSR_ID the primary key of the closed service requests
	 * @return the closed service requests that was removed
	 * @throws com.ifli.rapid.NoSuchClosedServiceRequestsException if a closed service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ClosedServiceRequests remove(int QRC_CSR_ID)
		throws NoSuchClosedServiceRequestsException, SystemException {
		return remove((Serializable)QRC_CSR_ID);
	}

	/**
	 * Removes the closed service requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the closed service requests
	 * @return the closed service requests that was removed
	 * @throws com.ifli.rapid.NoSuchClosedServiceRequestsException if a closed service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ClosedServiceRequests remove(Serializable primaryKey)
		throws NoSuchClosedServiceRequestsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ClosedServiceRequests closedServiceRequests = (ClosedServiceRequests)session.get(ClosedServiceRequestsImpl.class,
					primaryKey);

			if (closedServiceRequests == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchClosedServiceRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(closedServiceRequests);
		}
		catch (NoSuchClosedServiceRequestsException nsee) {
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
	protected ClosedServiceRequests removeImpl(
		ClosedServiceRequests closedServiceRequests) throws SystemException {
		closedServiceRequests = toUnwrappedModel(closedServiceRequests);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(closedServiceRequests)) {
				closedServiceRequests = (ClosedServiceRequests)session.get(ClosedServiceRequestsImpl.class,
						closedServiceRequests.getPrimaryKeyObj());
			}

			if (closedServiceRequests != null) {
				session.delete(closedServiceRequests);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (closedServiceRequests != null) {
			clearCache(closedServiceRequests);
		}

		return closedServiceRequests;
	}

	@Override
	public ClosedServiceRequests updateImpl(
		com.ifli.rapid.model.ClosedServiceRequests closedServiceRequests)
		throws SystemException {
		closedServiceRequests = toUnwrappedModel(closedServiceRequests);

		boolean isNew = closedServiceRequests.isNew();

		Session session = null;

		try {
			session = openSession();

			if (closedServiceRequests.isNew()) {
				session.save(closedServiceRequests);

				closedServiceRequests.setNew(false);
			}
			else {
				session.merge(closedServiceRequests);
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

		EntityCacheUtil.putResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			ClosedServiceRequestsImpl.class,
			closedServiceRequests.getPrimaryKey(), closedServiceRequests);

		return closedServiceRequests;
	}

	protected ClosedServiceRequests toUnwrappedModel(
		ClosedServiceRequests closedServiceRequests) {
		if (closedServiceRequests instanceof ClosedServiceRequestsImpl) {
			return closedServiceRequests;
		}

		ClosedServiceRequestsImpl closedServiceRequestsImpl = new ClosedServiceRequestsImpl();

		closedServiceRequestsImpl.setNew(closedServiceRequests.isNew());
		closedServiceRequestsImpl.setPrimaryKey(closedServiceRequests.getPrimaryKey());

		closedServiceRequestsImpl.setQRC_CSR_ID(closedServiceRequests.getQRC_CSR_ID());
		closedServiceRequestsImpl.setTYPE_ID(closedServiceRequests.getTYPE_ID());
		closedServiceRequestsImpl.setASSIGNED_TO(closedServiceRequests.getASSIGNED_TO());
		closedServiceRequestsImpl.setHANDLED_BY(closedServiceRequests.getHANDLED_BY());
		closedServiceRequestsImpl.setSTATUS_ID(closedServiceRequests.getSTATUS_ID());
		closedServiceRequestsImpl.setCUSTOMER_ID(closedServiceRequests.getCUSTOMER_ID());
		closedServiceRequestsImpl.setCustomerSRNumber(closedServiceRequests.getCustomerSRNumber());
		closedServiceRequestsImpl.setADDITIONAL_DATA_XML(closedServiceRequests.getADDITIONAL_DATA_XML());
		closedServiceRequestsImpl.setINSERTED_DATE(closedServiceRequests.getINSERTED_DATE());
		closedServiceRequestsImpl.setINSERTED_BY(closedServiceRequests.getINSERTED_BY());
		closedServiceRequestsImpl.setUPDATED_DATE(closedServiceRequests.getUPDATED_DATE());
		closedServiceRequestsImpl.setUPDATED_BY(closedServiceRequests.getUPDATED_BY());

		return closedServiceRequestsImpl;
	}

	/**
	 * Returns the closed service requests with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the closed service requests
	 * @return the closed service requests
	 * @throws com.ifli.rapid.NoSuchClosedServiceRequestsException if a closed service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ClosedServiceRequests findByPrimaryKey(Serializable primaryKey)
		throws NoSuchClosedServiceRequestsException, SystemException {
		ClosedServiceRequests closedServiceRequests = fetchByPrimaryKey(primaryKey);

		if (closedServiceRequests == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchClosedServiceRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return closedServiceRequests;
	}

	/**
	 * Returns the closed service requests with the primary key or throws a {@link com.ifli.rapid.NoSuchClosedServiceRequestsException} if it could not be found.
	 *
	 * @param QRC_CSR_ID the primary key of the closed service requests
	 * @return the closed service requests
	 * @throws com.ifli.rapid.NoSuchClosedServiceRequestsException if a closed service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ClosedServiceRequests findByPrimaryKey(int QRC_CSR_ID)
		throws NoSuchClosedServiceRequestsException, SystemException {
		return findByPrimaryKey((Serializable)QRC_CSR_ID);
	}

	/**
	 * Returns the closed service requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the closed service requests
	 * @return the closed service requests, or <code>null</code> if a closed service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ClosedServiceRequests fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ClosedServiceRequests closedServiceRequests = (ClosedServiceRequests)EntityCacheUtil.getResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
				ClosedServiceRequestsImpl.class, primaryKey);

		if (closedServiceRequests == _nullClosedServiceRequests) {
			return null;
		}

		if (closedServiceRequests == null) {
			Session session = null;

			try {
				session = openSession();

				closedServiceRequests = (ClosedServiceRequests)session.get(ClosedServiceRequestsImpl.class,
						primaryKey);

				if (closedServiceRequests != null) {
					cacheResult(closedServiceRequests);
				}
				else {
					EntityCacheUtil.putResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
						ClosedServiceRequestsImpl.class, primaryKey,
						_nullClosedServiceRequests);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ClosedServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
					ClosedServiceRequestsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return closedServiceRequests;
	}

	/**
	 * Returns the closed service requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QRC_CSR_ID the primary key of the closed service requests
	 * @return the closed service requests, or <code>null</code> if a closed service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ClosedServiceRequests fetchByPrimaryKey(int QRC_CSR_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QRC_CSR_ID);
	}

	/**
	 * Returns all the closed service requestses.
	 *
	 * @return the closed service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ClosedServiceRequests> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the closed service requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ClosedServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of closed service requestses
	 * @param end the upper bound of the range of closed service requestses (not inclusive)
	 * @return the range of closed service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ClosedServiceRequests> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the closed service requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ClosedServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of closed service requestses
	 * @param end the upper bound of the range of closed service requestses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of closed service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ClosedServiceRequests> findAll(int start, int end,
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

		List<ClosedServiceRequests> list = (List<ClosedServiceRequests>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CLOSEDSERVICEREQUESTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLOSEDSERVICEREQUESTS;

				if (pagination) {
					sql = sql.concat(ClosedServiceRequestsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ClosedServiceRequests>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ClosedServiceRequests>(list);
				}
				else {
					list = (List<ClosedServiceRequests>)QueryUtil.list(q,
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
	 * Removes all the closed service requestses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ClosedServiceRequests closedServiceRequests : findAll()) {
			remove(closedServiceRequests);
		}
	}

	/**
	 * Returns the number of closed service requestses.
	 *
	 * @return the number of closed service requestses
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

				Query q = session.createQuery(_SQL_COUNT_CLOSEDSERVICEREQUESTS);

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
	 * Initializes the closed service requests persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ClosedServiceRequests")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ClosedServiceRequests>> listenersList = new ArrayList<ModelListener<ClosedServiceRequests>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ClosedServiceRequests>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ClosedServiceRequestsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CLOSEDSERVICEREQUESTS = "SELECT closedServiceRequests FROM ClosedServiceRequests closedServiceRequests";
	private static final String _SQL_COUNT_CLOSEDSERVICEREQUESTS = "SELECT COUNT(closedServiceRequests) FROM ClosedServiceRequests closedServiceRequests";
	private static final String _ORDER_BY_ENTITY_ALIAS = "closedServiceRequests.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ClosedServiceRequests exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ClosedServiceRequestsPersistenceImpl.class);
	private static ClosedServiceRequests _nullClosedServiceRequests = new ClosedServiceRequestsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ClosedServiceRequests> toCacheModel() {
				return _nullClosedServiceRequestsCacheModel;
			}
		};

	private static CacheModel<ClosedServiceRequests> _nullClosedServiceRequestsCacheModel =
		new CacheModel<ClosedServiceRequests>() {
			@Override
			public ClosedServiceRequests toEntityModel() {
				return _nullClosedServiceRequests;
			}
		};
}