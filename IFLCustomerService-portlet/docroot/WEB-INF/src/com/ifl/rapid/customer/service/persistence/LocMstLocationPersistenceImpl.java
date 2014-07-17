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

import com.ifl.rapid.customer.NoSuchLocMstLocationException;
import com.ifl.rapid.customer.model.LocMstLocation;
import com.ifl.rapid.customer.model.impl.LocMstLocationImpl;
import com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl;

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
 * The persistence implementation for the loc mst location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see LocMstLocationPersistence
 * @see LocMstLocationUtil
 * @generated
 */
public class LocMstLocationPersistenceImpl extends BasePersistenceImpl<LocMstLocation>
	implements LocMstLocationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LocMstLocationUtil} to access the loc mst location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LocMstLocationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstLocationModelImpl.FINDER_CACHE_ENABLED,
			LocMstLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstLocationModelImpl.FINDER_CACHE_ENABLED,
			LocMstLocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LocMstLocationPersistenceImpl() {
		setModelClass(LocMstLocation.class);
	}

	/**
	 * Caches the loc mst location in the entity cache if it is enabled.
	 *
	 * @param locMstLocation the loc mst location
	 */
	@Override
	public void cacheResult(LocMstLocation locMstLocation) {
		EntityCacheUtil.putResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstLocationImpl.class, locMstLocation.getPrimaryKey(),
			locMstLocation);

		locMstLocation.resetOriginalValues();
	}

	/**
	 * Caches the loc mst locations in the entity cache if it is enabled.
	 *
	 * @param locMstLocations the loc mst locations
	 */
	@Override
	public void cacheResult(List<LocMstLocation> locMstLocations) {
		for (LocMstLocation locMstLocation : locMstLocations) {
			if (EntityCacheUtil.getResult(
						LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
						LocMstLocationImpl.class, locMstLocation.getPrimaryKey()) == null) {
				cacheResult(locMstLocation);
			}
			else {
				locMstLocation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loc mst locations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LocMstLocationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LocMstLocationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loc mst location.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LocMstLocation locMstLocation) {
		EntityCacheUtil.removeResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstLocationImpl.class, locMstLocation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LocMstLocation> locMstLocations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LocMstLocation locMstLocation : locMstLocations) {
			EntityCacheUtil.removeResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
				LocMstLocationImpl.class, locMstLocation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loc mst location with the primary key. Does not add the loc mst location to the database.
	 *
	 * @param LocationId the primary key for the new loc mst location
	 * @return the new loc mst location
	 */
	@Override
	public LocMstLocation create(int LocationId) {
		LocMstLocation locMstLocation = new LocMstLocationImpl();

		locMstLocation.setNew(true);
		locMstLocation.setPrimaryKey(LocationId);

		return locMstLocation;
	}

	/**
	 * Removes the loc mst location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param LocationId the primary key of the loc mst location
	 * @return the loc mst location that was removed
	 * @throws com.ifl.rapid.customer.NoSuchLocMstLocationException if a loc mst location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstLocation remove(int LocationId)
		throws NoSuchLocMstLocationException, SystemException {
		return remove((Serializable)LocationId);
	}

	/**
	 * Removes the loc mst location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loc mst location
	 * @return the loc mst location that was removed
	 * @throws com.ifl.rapid.customer.NoSuchLocMstLocationException if a loc mst location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstLocation remove(Serializable primaryKey)
		throws NoSuchLocMstLocationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LocMstLocation locMstLocation = (LocMstLocation)session.get(LocMstLocationImpl.class,
					primaryKey);

			if (locMstLocation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocMstLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(locMstLocation);
		}
		catch (NoSuchLocMstLocationException nsee) {
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
	protected LocMstLocation removeImpl(LocMstLocation locMstLocation)
		throws SystemException {
		locMstLocation = toUnwrappedModel(locMstLocation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(locMstLocation)) {
				locMstLocation = (LocMstLocation)session.get(LocMstLocationImpl.class,
						locMstLocation.getPrimaryKeyObj());
			}

			if (locMstLocation != null) {
				session.delete(locMstLocation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (locMstLocation != null) {
			clearCache(locMstLocation);
		}

		return locMstLocation;
	}

	@Override
	public LocMstLocation updateImpl(
		com.ifl.rapid.customer.model.LocMstLocation locMstLocation)
		throws SystemException {
		locMstLocation = toUnwrappedModel(locMstLocation);

		boolean isNew = locMstLocation.isNew();

		Session session = null;

		try {
			session = openSession();

			if (locMstLocation.isNew()) {
				session.save(locMstLocation);

				locMstLocation.setNew(false);
			}
			else {
				session.merge(locMstLocation);
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

		EntityCacheUtil.putResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstLocationImpl.class, locMstLocation.getPrimaryKey(),
			locMstLocation);

		return locMstLocation;
	}

	protected LocMstLocation toUnwrappedModel(LocMstLocation locMstLocation) {
		if (locMstLocation instanceof LocMstLocationImpl) {
			return locMstLocation;
		}

		LocMstLocationImpl locMstLocationImpl = new LocMstLocationImpl();

		locMstLocationImpl.setNew(locMstLocation.isNew());
		locMstLocationImpl.setPrimaryKey(locMstLocation.getPrimaryKey());

		locMstLocationImpl.setLocationId(locMstLocation.getLocationId());
		locMstLocationImpl.setStateId(locMstLocation.getStateId());
		locMstLocationImpl.setCityId(locMstLocation.getCityId());
		locMstLocationImpl.setPinCode(locMstLocation.getPinCode());
		locMstLocationImpl.setAreaName(locMstLocation.getAreaName());
		locMstLocationImpl.setLatitude(locMstLocation.getLatitude());
		locMstLocationImpl.setLongitude(locMstLocation.getLongitude());
		locMstLocationImpl.setCreatedBy(locMstLocation.getCreatedBy());
		locMstLocationImpl.setCreatedDate(locMstLocation.getCreatedDate());
		locMstLocationImpl.setModifiedBy(locMstLocation.getModifiedBy());
		locMstLocationImpl.setModifiedDate(locMstLocation.getModifiedDate());
		locMstLocationImpl.setIsActive(locMstLocation.getIsActive());

		return locMstLocationImpl;
	}

	/**
	 * Returns the loc mst location with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loc mst location
	 * @return the loc mst location
	 * @throws com.ifl.rapid.customer.NoSuchLocMstLocationException if a loc mst location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstLocation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocMstLocationException, SystemException {
		LocMstLocation locMstLocation = fetchByPrimaryKey(primaryKey);

		if (locMstLocation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocMstLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return locMstLocation;
	}

	/**
	 * Returns the loc mst location with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchLocMstLocationException} if it could not be found.
	 *
	 * @param LocationId the primary key of the loc mst location
	 * @return the loc mst location
	 * @throws com.ifl.rapid.customer.NoSuchLocMstLocationException if a loc mst location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstLocation findByPrimaryKey(int LocationId)
		throws NoSuchLocMstLocationException, SystemException {
		return findByPrimaryKey((Serializable)LocationId);
	}

	/**
	 * Returns the loc mst location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loc mst location
	 * @return the loc mst location, or <code>null</code> if a loc mst location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstLocation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LocMstLocation locMstLocation = (LocMstLocation)EntityCacheUtil.getResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
				LocMstLocationImpl.class, primaryKey);

		if (locMstLocation == _nullLocMstLocation) {
			return null;
		}

		if (locMstLocation == null) {
			Session session = null;

			try {
				session = openSession();

				locMstLocation = (LocMstLocation)session.get(LocMstLocationImpl.class,
						primaryKey);

				if (locMstLocation != null) {
					cacheResult(locMstLocation);
				}
				else {
					EntityCacheUtil.putResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
						LocMstLocationImpl.class, primaryKey,
						_nullLocMstLocation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LocMstLocationModelImpl.ENTITY_CACHE_ENABLED,
					LocMstLocationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return locMstLocation;
	}

	/**
	 * Returns the loc mst location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param LocationId the primary key of the loc mst location
	 * @return the loc mst location, or <code>null</code> if a loc mst location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstLocation fetchByPrimaryKey(int LocationId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)LocationId);
	}

	/**
	 * Returns all the loc mst locations.
	 *
	 * @return the loc mst locations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocMstLocation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loc mst locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loc mst locations
	 * @param end the upper bound of the range of loc mst locations (not inclusive)
	 * @return the range of loc mst locations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocMstLocation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loc mst locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loc mst locations
	 * @param end the upper bound of the range of loc mst locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loc mst locations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocMstLocation> findAll(int start, int end,
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

		List<LocMstLocation> list = (List<LocMstLocation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOCMSTLOCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCMSTLOCATION;

				if (pagination) {
					sql = sql.concat(LocMstLocationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LocMstLocation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LocMstLocation>(list);
				}
				else {
					list = (List<LocMstLocation>)QueryUtil.list(q,
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
	 * Removes all the loc mst locations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LocMstLocation locMstLocation : findAll()) {
			remove(locMstLocation);
		}
	}

	/**
	 * Returns the number of loc mst locations.
	 *
	 * @return the number of loc mst locations
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

				Query q = session.createQuery(_SQL_COUNT_LOCMSTLOCATION);

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
	 * Initializes the loc mst location persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.LocMstLocation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LocMstLocation>> listenersList = new ArrayList<ModelListener<LocMstLocation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LocMstLocation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LocMstLocationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOCMSTLOCATION = "SELECT locMstLocation FROM LocMstLocation locMstLocation";
	private static final String _SQL_COUNT_LOCMSTLOCATION = "SELECT COUNT(locMstLocation) FROM LocMstLocation locMstLocation";
	private static final String _ORDER_BY_ENTITY_ALIAS = "locMstLocation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LocMstLocation exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LocMstLocationPersistenceImpl.class);
	private static LocMstLocation _nullLocMstLocation = new LocMstLocationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LocMstLocation> toCacheModel() {
				return _nullLocMstLocationCacheModel;
			}
		};

	private static CacheModel<LocMstLocation> _nullLocMstLocationCacheModel = new CacheModel<LocMstLocation>() {
			@Override
			public LocMstLocation toEntityModel() {
				return _nullLocMstLocation;
			}
		};
}