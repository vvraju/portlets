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

import com.ifli.rapid.NoSuchLocationDetailsException;
import com.ifli.rapid.model.LocationDetails;
import com.ifli.rapid.model.impl.LocationDetailsImpl;
import com.ifli.rapid.model.impl.LocationDetailsModelImpl;

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
 * The persistence implementation for the location details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see LocationDetailsPersistence
 * @see LocationDetailsUtil
 * @generated
 */
public class LocationDetailsPersistenceImpl extends BasePersistenceImpl<LocationDetails>
	implements LocationDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LocationDetailsUtil} to access the location details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LocationDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			LocationDetailsModelImpl.FINDER_CACHE_ENABLED,
			LocationDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			LocationDetailsModelImpl.FINDER_CACHE_ENABLED,
			LocationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			LocationDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LocationDetailsPersistenceImpl() {
		setModelClass(LocationDetails.class);
	}

	/**
	 * Caches the location details in the entity cache if it is enabled.
	 *
	 * @param locationDetails the location details
	 */
	@Override
	public void cacheResult(LocationDetails locationDetails) {
		EntityCacheUtil.putResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			LocationDetailsImpl.class, locationDetails.getPrimaryKey(),
			locationDetails);

		locationDetails.resetOriginalValues();
	}

	/**
	 * Caches the location detailses in the entity cache if it is enabled.
	 *
	 * @param locationDetailses the location detailses
	 */
	@Override
	public void cacheResult(List<LocationDetails> locationDetailses) {
		for (LocationDetails locationDetails : locationDetailses) {
			if (EntityCacheUtil.getResult(
						LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
						LocationDetailsImpl.class,
						locationDetails.getPrimaryKey()) == null) {
				cacheResult(locationDetails);
			}
			else {
				locationDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all location detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LocationDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LocationDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the location details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LocationDetails locationDetails) {
		EntityCacheUtil.removeResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			LocationDetailsImpl.class, locationDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LocationDetails> locationDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LocationDetails locationDetails : locationDetailses) {
			EntityCacheUtil.removeResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
				LocationDetailsImpl.class, locationDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new location details with the primary key. Does not add the location details to the database.
	 *
	 * @param LOCATION_ID the primary key for the new location details
	 * @return the new location details
	 */
	@Override
	public LocationDetails create(int LOCATION_ID) {
		LocationDetails locationDetails = new LocationDetailsImpl();

		locationDetails.setNew(true);
		locationDetails.setPrimaryKey(LOCATION_ID);

		return locationDetails;
	}

	/**
	 * Removes the location details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param LOCATION_ID the primary key of the location details
	 * @return the location details that was removed
	 * @throws com.ifli.rapid.NoSuchLocationDetailsException if a location details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocationDetails remove(int LOCATION_ID)
		throws NoSuchLocationDetailsException, SystemException {
		return remove((Serializable)LOCATION_ID);
	}

	/**
	 * Removes the location details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the location details
	 * @return the location details that was removed
	 * @throws com.ifli.rapid.NoSuchLocationDetailsException if a location details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocationDetails remove(Serializable primaryKey)
		throws NoSuchLocationDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LocationDetails locationDetails = (LocationDetails)session.get(LocationDetailsImpl.class,
					primaryKey);

			if (locationDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocationDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(locationDetails);
		}
		catch (NoSuchLocationDetailsException nsee) {
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
	protected LocationDetails removeImpl(LocationDetails locationDetails)
		throws SystemException {
		locationDetails = toUnwrappedModel(locationDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(locationDetails)) {
				locationDetails = (LocationDetails)session.get(LocationDetailsImpl.class,
						locationDetails.getPrimaryKeyObj());
			}

			if (locationDetails != null) {
				session.delete(locationDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (locationDetails != null) {
			clearCache(locationDetails);
		}

		return locationDetails;
	}

	@Override
	public LocationDetails updateImpl(
		com.ifli.rapid.model.LocationDetails locationDetails)
		throws SystemException {
		locationDetails = toUnwrappedModel(locationDetails);

		boolean isNew = locationDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (locationDetails.isNew()) {
				session.save(locationDetails);

				locationDetails.setNew(false);
			}
			else {
				session.merge(locationDetails);
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

		EntityCacheUtil.putResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			LocationDetailsImpl.class, locationDetails.getPrimaryKey(),
			locationDetails);

		return locationDetails;
	}

	protected LocationDetails toUnwrappedModel(LocationDetails locationDetails) {
		if (locationDetails instanceof LocationDetailsImpl) {
			return locationDetails;
		}

		LocationDetailsImpl locationDetailsImpl = new LocationDetailsImpl();

		locationDetailsImpl.setNew(locationDetails.isNew());
		locationDetailsImpl.setPrimaryKey(locationDetails.getPrimaryKey());

		locationDetailsImpl.setLOCATION_ID(locationDetails.getLOCATION_ID());
		locationDetailsImpl.setLOCATION_NAME(locationDetails.getLOCATION_NAME());
		locationDetailsImpl.setCITY_ID(locationDetails.getCITY_ID());
		locationDetailsImpl.setSTATE_ID(locationDetails.getSTATE_ID());
		locationDetailsImpl.setLATITUDE(locationDetails.getLATITUDE());
		locationDetailsImpl.setLONGITUDE(locationDetails.getLONGITUDE());
		locationDetailsImpl.setBRANCH_FLAG(locationDetails.getBRANCH_FLAG());
		locationDetailsImpl.setMEDICAL_CENTER_FLAG(locationDetails.getMEDICAL_CENTER_FLAG());
		locationDetailsImpl.setDROP_BOX_FLAG(locationDetails.getDROP_BOX_FLAG());

		return locationDetailsImpl;
	}

	/**
	 * Returns the location details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the location details
	 * @return the location details
	 * @throws com.ifli.rapid.NoSuchLocationDetailsException if a location details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocationDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocationDetailsException, SystemException {
		LocationDetails locationDetails = fetchByPrimaryKey(primaryKey);

		if (locationDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocationDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return locationDetails;
	}

	/**
	 * Returns the location details with the primary key or throws a {@link com.ifli.rapid.NoSuchLocationDetailsException} if it could not be found.
	 *
	 * @param LOCATION_ID the primary key of the location details
	 * @return the location details
	 * @throws com.ifli.rapid.NoSuchLocationDetailsException if a location details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocationDetails findByPrimaryKey(int LOCATION_ID)
		throws NoSuchLocationDetailsException, SystemException {
		return findByPrimaryKey((Serializable)LOCATION_ID);
	}

	/**
	 * Returns the location details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the location details
	 * @return the location details, or <code>null</code> if a location details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocationDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LocationDetails locationDetails = (LocationDetails)EntityCacheUtil.getResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
				LocationDetailsImpl.class, primaryKey);

		if (locationDetails == _nullLocationDetails) {
			return null;
		}

		if (locationDetails == null) {
			Session session = null;

			try {
				session = openSession();

				locationDetails = (LocationDetails)session.get(LocationDetailsImpl.class,
						primaryKey);

				if (locationDetails != null) {
					cacheResult(locationDetails);
				}
				else {
					EntityCacheUtil.putResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
						LocationDetailsImpl.class, primaryKey,
						_nullLocationDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LocationDetailsModelImpl.ENTITY_CACHE_ENABLED,
					LocationDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return locationDetails;
	}

	/**
	 * Returns the location details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param LOCATION_ID the primary key of the location details
	 * @return the location details, or <code>null</code> if a location details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocationDetails fetchByPrimaryKey(int LOCATION_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)LOCATION_ID);
	}

	/**
	 * Returns all the location detailses.
	 *
	 * @return the location detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocationDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the location detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of location detailses
	 * @param end the upper bound of the range of location detailses (not inclusive)
	 * @return the range of location detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocationDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the location detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.LocationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of location detailses
	 * @param end the upper bound of the range of location detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of location detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocationDetails> findAll(int start, int end,
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

		List<LocationDetails> list = (List<LocationDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOCATIONDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCATIONDETAILS;

				if (pagination) {
					sql = sql.concat(LocationDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LocationDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LocationDetails>(list);
				}
				else {
					list = (List<LocationDetails>)QueryUtil.list(q,
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
	 * Removes all the location detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LocationDetails locationDetails : findAll()) {
			remove(locationDetails);
		}
	}

	/**
	 * Returns the number of location detailses.
	 *
	 * @return the number of location detailses
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

				Query q = session.createQuery(_SQL_COUNT_LOCATIONDETAILS);

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
	 * Initializes the location details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.LocationDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LocationDetails>> listenersList = new ArrayList<ModelListener<LocationDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LocationDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LocationDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOCATIONDETAILS = "SELECT locationDetails FROM LocationDetails locationDetails";
	private static final String _SQL_COUNT_LOCATIONDETAILS = "SELECT COUNT(locationDetails) FROM LocationDetails locationDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "locationDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LocationDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LocationDetailsPersistenceImpl.class);
	private static LocationDetails _nullLocationDetails = new LocationDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LocationDetails> toCacheModel() {
				return _nullLocationDetailsCacheModel;
			}
		};

	private static CacheModel<LocationDetails> _nullLocationDetailsCacheModel = new CacheModel<LocationDetails>() {
			@Override
			public LocationDetails toEntityModel() {
				return _nullLocationDetails;
			}
		};
}