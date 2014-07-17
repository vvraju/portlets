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

import com.ifli.rapid.NoSuchCityDetailsException;
import com.ifli.rapid.model.CityDetails;
import com.ifli.rapid.model.impl.CityDetailsImpl;
import com.ifli.rapid.model.impl.CityDetailsModelImpl;

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
 * The persistence implementation for the city details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CityDetailsPersistence
 * @see CityDetailsUtil
 * @generated
 */
public class CityDetailsPersistenceImpl extends BasePersistenceImpl<CityDetails>
	implements CityDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CityDetailsUtil} to access the city details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CityDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CityDetailsModelImpl.FINDER_CACHE_ENABLED, CityDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CityDetailsModelImpl.FINDER_CACHE_ENABLED, CityDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CityDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CityDetailsPersistenceImpl() {
		setModelClass(CityDetails.class);
	}

	/**
	 * Caches the city details in the entity cache if it is enabled.
	 *
	 * @param cityDetails the city details
	 */
	@Override
	public void cacheResult(CityDetails cityDetails) {
		EntityCacheUtil.putResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CityDetailsImpl.class, cityDetails.getPrimaryKey(), cityDetails);

		cityDetails.resetOriginalValues();
	}

	/**
	 * Caches the city detailses in the entity cache if it is enabled.
	 *
	 * @param cityDetailses the city detailses
	 */
	@Override
	public void cacheResult(List<CityDetails> cityDetailses) {
		for (CityDetails cityDetails : cityDetailses) {
			if (EntityCacheUtil.getResult(
						CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
						CityDetailsImpl.class, cityDetails.getPrimaryKey()) == null) {
				cacheResult(cityDetails);
			}
			else {
				cityDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all city detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CityDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CityDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the city details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CityDetails cityDetails) {
		EntityCacheUtil.removeResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CityDetailsImpl.class, cityDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CityDetails> cityDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CityDetails cityDetails : cityDetailses) {
			EntityCacheUtil.removeResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
				CityDetailsImpl.class, cityDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new city details with the primary key. Does not add the city details to the database.
	 *
	 * @param CITY_ID the primary key for the new city details
	 * @return the new city details
	 */
	@Override
	public CityDetails create(int CITY_ID) {
		CityDetails cityDetails = new CityDetailsImpl();

		cityDetails.setNew(true);
		cityDetails.setPrimaryKey(CITY_ID);

		return cityDetails;
	}

	/**
	 * Removes the city details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CITY_ID the primary key of the city details
	 * @return the city details that was removed
	 * @throws com.ifli.rapid.NoSuchCityDetailsException if a city details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CityDetails remove(int CITY_ID)
		throws NoSuchCityDetailsException, SystemException {
		return remove((Serializable)CITY_ID);
	}

	/**
	 * Removes the city details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the city details
	 * @return the city details that was removed
	 * @throws com.ifli.rapid.NoSuchCityDetailsException if a city details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CityDetails remove(Serializable primaryKey)
		throws NoSuchCityDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CityDetails cityDetails = (CityDetails)session.get(CityDetailsImpl.class,
					primaryKey);

			if (cityDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCityDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cityDetails);
		}
		catch (NoSuchCityDetailsException nsee) {
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
	protected CityDetails removeImpl(CityDetails cityDetails)
		throws SystemException {
		cityDetails = toUnwrappedModel(cityDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cityDetails)) {
				cityDetails = (CityDetails)session.get(CityDetailsImpl.class,
						cityDetails.getPrimaryKeyObj());
			}

			if (cityDetails != null) {
				session.delete(cityDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cityDetails != null) {
			clearCache(cityDetails);
		}

		return cityDetails;
	}

	@Override
	public CityDetails updateImpl(com.ifli.rapid.model.CityDetails cityDetails)
		throws SystemException {
		cityDetails = toUnwrappedModel(cityDetails);

		boolean isNew = cityDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cityDetails.isNew()) {
				session.save(cityDetails);

				cityDetails.setNew(false);
			}
			else {
				session.merge(cityDetails);
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

		EntityCacheUtil.putResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CityDetailsImpl.class, cityDetails.getPrimaryKey(), cityDetails);

		return cityDetails;
	}

	protected CityDetails toUnwrappedModel(CityDetails cityDetails) {
		if (cityDetails instanceof CityDetailsImpl) {
			return cityDetails;
		}

		CityDetailsImpl cityDetailsImpl = new CityDetailsImpl();

		cityDetailsImpl.setNew(cityDetails.isNew());
		cityDetailsImpl.setPrimaryKey(cityDetails.getPrimaryKey());

		cityDetailsImpl.setCITY_ID(cityDetails.getCITY_ID());
		cityDetailsImpl.setCITY_CODE(cityDetails.getCITY_CODE());
		cityDetailsImpl.setCITY_NAME(cityDetails.getCITY_NAME());
		cityDetailsImpl.setSTATE_ID(cityDetails.getSTATE_ID());
		cityDetailsImpl.setIS_ACTIVE(cityDetails.getIS_ACTIVE());

		return cityDetailsImpl;
	}

	/**
	 * Returns the city details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the city details
	 * @return the city details
	 * @throws com.ifli.rapid.NoSuchCityDetailsException if a city details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CityDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCityDetailsException, SystemException {
		CityDetails cityDetails = fetchByPrimaryKey(primaryKey);

		if (cityDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCityDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cityDetails;
	}

	/**
	 * Returns the city details with the primary key or throws a {@link com.ifli.rapid.NoSuchCityDetailsException} if it could not be found.
	 *
	 * @param CITY_ID the primary key of the city details
	 * @return the city details
	 * @throws com.ifli.rapid.NoSuchCityDetailsException if a city details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CityDetails findByPrimaryKey(int CITY_ID)
		throws NoSuchCityDetailsException, SystemException {
		return findByPrimaryKey((Serializable)CITY_ID);
	}

	/**
	 * Returns the city details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the city details
	 * @return the city details, or <code>null</code> if a city details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CityDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CityDetails cityDetails = (CityDetails)EntityCacheUtil.getResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
				CityDetailsImpl.class, primaryKey);

		if (cityDetails == _nullCityDetails) {
			return null;
		}

		if (cityDetails == null) {
			Session session = null;

			try {
				session = openSession();

				cityDetails = (CityDetails)session.get(CityDetailsImpl.class,
						primaryKey);

				if (cityDetails != null) {
					cacheResult(cityDetails);
				}
				else {
					EntityCacheUtil.putResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
						CityDetailsImpl.class, primaryKey, _nullCityDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CityDetailsModelImpl.ENTITY_CACHE_ENABLED,
					CityDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cityDetails;
	}

	/**
	 * Returns the city details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CITY_ID the primary key of the city details
	 * @return the city details, or <code>null</code> if a city details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CityDetails fetchByPrimaryKey(int CITY_ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)CITY_ID);
	}

	/**
	 * Returns all the city detailses.
	 *
	 * @return the city detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CityDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the city detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of city detailses
	 * @param end the upper bound of the range of city detailses (not inclusive)
	 * @return the range of city detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CityDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the city detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CityDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of city detailses
	 * @param end the upper bound of the range of city detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of city detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CityDetails> findAll(int start, int end,
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

		List<CityDetails> list = (List<CityDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CITYDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CITYDETAILS;

				if (pagination) {
					sql = sql.concat(CityDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CityDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CityDetails>(list);
				}
				else {
					list = (List<CityDetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the city detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CityDetails cityDetails : findAll()) {
			remove(cityDetails);
		}
	}

	/**
	 * Returns the number of city detailses.
	 *
	 * @return the number of city detailses
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

				Query q = session.createQuery(_SQL_COUNT_CITYDETAILS);

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
	 * Initializes the city details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.CityDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CityDetails>> listenersList = new ArrayList<ModelListener<CityDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CityDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CityDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CITYDETAILS = "SELECT cityDetails FROM CityDetails cityDetails";
	private static final String _SQL_COUNT_CITYDETAILS = "SELECT COUNT(cityDetails) FROM CityDetails cityDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cityDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CityDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CityDetailsPersistenceImpl.class);
	private static CityDetails _nullCityDetails = new CityDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CityDetails> toCacheModel() {
				return _nullCityDetailsCacheModel;
			}
		};

	private static CacheModel<CityDetails> _nullCityDetailsCacheModel = new CacheModel<CityDetails>() {
			@Override
			public CityDetails toEntityModel() {
				return _nullCityDetails;
			}
		};
}