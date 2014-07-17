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

import com.ifl.rapid.customer.NoSuchCityException;
import com.ifl.rapid.customer.model.City;
import com.ifl.rapid.customer.model.impl.CityImpl;
import com.ifl.rapid.customer.model.impl.CityModelImpl;

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
 * The persistence implementation for the city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CityPersistence
 * @see CityUtil
 * @generated
 */
public class CityPersistenceImpl extends BasePersistenceImpl<City>
	implements CityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CityUtil} to access the city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CityModelImpl.ENTITY_CACHE_ENABLED,
			CityModelImpl.FINDER_CACHE_ENABLED, CityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CityModelImpl.ENTITY_CACHE_ENABLED,
			CityModelImpl.FINDER_CACHE_ENABLED, CityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CityModelImpl.ENTITY_CACHE_ENABLED,
			CityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CityPersistenceImpl() {
		setModelClass(City.class);
	}

	/**
	 * Caches the city in the entity cache if it is enabled.
	 *
	 * @param city the city
	 */
	@Override
	public void cacheResult(City city) {
		EntityCacheUtil.putResult(CityModelImpl.ENTITY_CACHE_ENABLED,
			CityImpl.class, city.getPrimaryKey(), city);

		city.resetOriginalValues();
	}

	/**
	 * Caches the cities in the entity cache if it is enabled.
	 *
	 * @param cities the cities
	 */
	@Override
	public void cacheResult(List<City> cities) {
		for (City city : cities) {
			if (EntityCacheUtil.getResult(CityModelImpl.ENTITY_CACHE_ENABLED,
						CityImpl.class, city.getPrimaryKey()) == null) {
				cacheResult(city);
			}
			else {
				city.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the city.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(City city) {
		EntityCacheUtil.removeResult(CityModelImpl.ENTITY_CACHE_ENABLED,
			CityImpl.class, city.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<City> cities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (City city : cities) {
			EntityCacheUtil.removeResult(CityModelImpl.ENTITY_CACHE_ENABLED,
				CityImpl.class, city.getPrimaryKey());
		}
	}

	/**
	 * Creates a new city with the primary key. Does not add the city to the database.
	 *
	 * @param CityId the primary key for the new city
	 * @return the new city
	 */
	@Override
	public City create(int CityId) {
		City city = new CityImpl();

		city.setNew(true);
		city.setPrimaryKey(CityId);

		return city;
	}

	/**
	 * Removes the city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CityId the primary key of the city
	 * @return the city that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCityException if a city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public City remove(int CityId) throws NoSuchCityException, SystemException {
		return remove((Serializable)CityId);
	}

	/**
	 * Removes the city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the city
	 * @return the city that was removed
	 * @throws com.ifl.rapid.customer.NoSuchCityException if a city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public City remove(Serializable primaryKey)
		throws NoSuchCityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			City city = (City)session.get(CityImpl.class, primaryKey);

			if (city == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(city);
		}
		catch (NoSuchCityException nsee) {
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
	protected City removeImpl(City city) throws SystemException {
		city = toUnwrappedModel(city);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(city)) {
				city = (City)session.get(CityImpl.class, city.getPrimaryKeyObj());
			}

			if (city != null) {
				session.delete(city);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (city != null) {
			clearCache(city);
		}

		return city;
	}

	@Override
	public City updateImpl(com.ifl.rapid.customer.model.City city)
		throws SystemException {
		city = toUnwrappedModel(city);

		boolean isNew = city.isNew();

		Session session = null;

		try {
			session = openSession();

			if (city.isNew()) {
				session.save(city);

				city.setNew(false);
			}
			else {
				session.merge(city);
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

		EntityCacheUtil.putResult(CityModelImpl.ENTITY_CACHE_ENABLED,
			CityImpl.class, city.getPrimaryKey(), city);

		return city;
	}

	protected City toUnwrappedModel(City city) {
		if (city instanceof CityImpl) {
			return city;
		}

		CityImpl cityImpl = new CityImpl();

		cityImpl.setNew(city.isNew());
		cityImpl.setPrimaryKey(city.getPrimaryKey());

		cityImpl.setCityId(city.getCityId());
		cityImpl.setCityCode(city.getCityCode());
		cityImpl.setCityName(city.getCityName());
		cityImpl.setIsActive(city.getIsActive());
		cityImpl.setCreatedBy(city.getCreatedBy());
		cityImpl.setCreatedDate(city.getCreatedDate());
		cityImpl.setModifiedDate(city.getModifiedDate());
		cityImpl.setModifiedBy(city.getModifiedBy());
		cityImpl.setStateId(city.getStateId());

		return cityImpl;
	}

	/**
	 * Returns the city with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the city
	 * @return the city
	 * @throws com.ifl.rapid.customer.NoSuchCityException if a city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public City findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCityException, SystemException {
		City city = fetchByPrimaryKey(primaryKey);

		if (city == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return city;
	}

	/**
	 * Returns the city with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchCityException} if it could not be found.
	 *
	 * @param CityId the primary key of the city
	 * @return the city
	 * @throws com.ifl.rapid.customer.NoSuchCityException if a city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public City findByPrimaryKey(int CityId)
		throws NoSuchCityException, SystemException {
		return findByPrimaryKey((Serializable)CityId);
	}

	/**
	 * Returns the city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the city
	 * @return the city, or <code>null</code> if a city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public City fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		City city = (City)EntityCacheUtil.getResult(CityModelImpl.ENTITY_CACHE_ENABLED,
				CityImpl.class, primaryKey);

		if (city == _nullCity) {
			return null;
		}

		if (city == null) {
			Session session = null;

			try {
				session = openSession();

				city = (City)session.get(CityImpl.class, primaryKey);

				if (city != null) {
					cacheResult(city);
				}
				else {
					EntityCacheUtil.putResult(CityModelImpl.ENTITY_CACHE_ENABLED,
						CityImpl.class, primaryKey, _nullCity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CityModelImpl.ENTITY_CACHE_ENABLED,
					CityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return city;
	}

	/**
	 * Returns the city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CityId the primary key of the city
	 * @return the city, or <code>null</code> if a city with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public City fetchByPrimaryKey(int CityId) throws SystemException {
		return fetchByPrimaryKey((Serializable)CityId);
	}

	/**
	 * Returns all the cities.
	 *
	 * @return the cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<City> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cities
	 * @param end the upper bound of the range of cities (not inclusive)
	 * @return the range of cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<City> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.CityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cities
	 * @param end the upper bound of the range of cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<City> findAll(int start, int end,
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

		List<City> list = (List<City>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CITY;

				if (pagination) {
					sql = sql.concat(CityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<City>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<City>(list);
				}
				else {
					list = (List<City>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the cities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (City city : findAll()) {
			remove(city);
		}
	}

	/**
	 * Returns the number of cities.
	 *
	 * @return the number of cities
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

				Query q = session.createQuery(_SQL_COUNT_CITY);

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
	 * Initializes the city persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.City")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<City>> listenersList = new ArrayList<ModelListener<City>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<City>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CITY = "SELECT city FROM City city";
	private static final String _SQL_COUNT_CITY = "SELECT COUNT(city) FROM City city";
	private static final String _ORDER_BY_ENTITY_ALIAS = "city.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No City exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CityPersistenceImpl.class);
	private static City _nullCity = new CityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<City> toCacheModel() {
				return _nullCityCacheModel;
			}
		};

	private static CacheModel<City> _nullCityCacheModel = new CacheModel<City>() {
			@Override
			public City toEntityModel() {
				return _nullCity;
			}
		};
}