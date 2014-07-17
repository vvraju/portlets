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

import com.ifl.rapid.customer.NoSuchLocMstBranchLocationException;
import com.ifl.rapid.customer.model.LocMstBranchLocation;
import com.ifl.rapid.customer.model.impl.LocMstBranchLocationImpl;
import com.ifl.rapid.customer.model.impl.LocMstBranchLocationModelImpl;

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
 * The persistence implementation for the loc mst branch location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see LocMstBranchLocationPersistence
 * @see LocMstBranchLocationUtil
 * @generated
 */
public class LocMstBranchLocationPersistenceImpl extends BasePersistenceImpl<LocMstBranchLocation>
	implements LocMstBranchLocationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LocMstBranchLocationUtil} to access the loc mst branch location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LocMstBranchLocationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstBranchLocationModelImpl.FINDER_CACHE_ENABLED,
			LocMstBranchLocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstBranchLocationModelImpl.FINDER_CACHE_ENABLED,
			LocMstBranchLocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstBranchLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LocMstBranchLocationPersistenceImpl() {
		setModelClass(LocMstBranchLocation.class);
	}

	/**
	 * Caches the loc mst branch location in the entity cache if it is enabled.
	 *
	 * @param locMstBranchLocation the loc mst branch location
	 */
	@Override
	public void cacheResult(LocMstBranchLocation locMstBranchLocation) {
		EntityCacheUtil.putResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstBranchLocationImpl.class,
			locMstBranchLocation.getPrimaryKey(), locMstBranchLocation);

		locMstBranchLocation.resetOriginalValues();
	}

	/**
	 * Caches the loc mst branch locations in the entity cache if it is enabled.
	 *
	 * @param locMstBranchLocations the loc mst branch locations
	 */
	@Override
	public void cacheResult(List<LocMstBranchLocation> locMstBranchLocations) {
		for (LocMstBranchLocation locMstBranchLocation : locMstBranchLocations) {
			if (EntityCacheUtil.getResult(
						LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
						LocMstBranchLocationImpl.class,
						locMstBranchLocation.getPrimaryKey()) == null) {
				cacheResult(locMstBranchLocation);
			}
			else {
				locMstBranchLocation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loc mst branch locations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LocMstBranchLocationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LocMstBranchLocationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loc mst branch location.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LocMstBranchLocation locMstBranchLocation) {
		EntityCacheUtil.removeResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstBranchLocationImpl.class, locMstBranchLocation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LocMstBranchLocation> locMstBranchLocations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LocMstBranchLocation locMstBranchLocation : locMstBranchLocations) {
			EntityCacheUtil.removeResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
				LocMstBranchLocationImpl.class,
				locMstBranchLocation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loc mst branch location with the primary key. Does not add the loc mst branch location to the database.
	 *
	 * @param BranchId the primary key for the new loc mst branch location
	 * @return the new loc mst branch location
	 */
	@Override
	public LocMstBranchLocation create(int BranchId) {
		LocMstBranchLocation locMstBranchLocation = new LocMstBranchLocationImpl();

		locMstBranchLocation.setNew(true);
		locMstBranchLocation.setPrimaryKey(BranchId);

		return locMstBranchLocation;
	}

	/**
	 * Removes the loc mst branch location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param BranchId the primary key of the loc mst branch location
	 * @return the loc mst branch location that was removed
	 * @throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException if a loc mst branch location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstBranchLocation remove(int BranchId)
		throws NoSuchLocMstBranchLocationException, SystemException {
		return remove((Serializable)BranchId);
	}

	/**
	 * Removes the loc mst branch location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loc mst branch location
	 * @return the loc mst branch location that was removed
	 * @throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException if a loc mst branch location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstBranchLocation remove(Serializable primaryKey)
		throws NoSuchLocMstBranchLocationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LocMstBranchLocation locMstBranchLocation = (LocMstBranchLocation)session.get(LocMstBranchLocationImpl.class,
					primaryKey);

			if (locMstBranchLocation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocMstBranchLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(locMstBranchLocation);
		}
		catch (NoSuchLocMstBranchLocationException nsee) {
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
	protected LocMstBranchLocation removeImpl(
		LocMstBranchLocation locMstBranchLocation) throws SystemException {
		locMstBranchLocation = toUnwrappedModel(locMstBranchLocation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(locMstBranchLocation)) {
				locMstBranchLocation = (LocMstBranchLocation)session.get(LocMstBranchLocationImpl.class,
						locMstBranchLocation.getPrimaryKeyObj());
			}

			if (locMstBranchLocation != null) {
				session.delete(locMstBranchLocation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (locMstBranchLocation != null) {
			clearCache(locMstBranchLocation);
		}

		return locMstBranchLocation;
	}

	@Override
	public LocMstBranchLocation updateImpl(
		com.ifl.rapid.customer.model.LocMstBranchLocation locMstBranchLocation)
		throws SystemException {
		locMstBranchLocation = toUnwrappedModel(locMstBranchLocation);

		boolean isNew = locMstBranchLocation.isNew();

		Session session = null;

		try {
			session = openSession();

			if (locMstBranchLocation.isNew()) {
				session.save(locMstBranchLocation);

				locMstBranchLocation.setNew(false);
			}
			else {
				session.merge(locMstBranchLocation);
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

		EntityCacheUtil.putResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
			LocMstBranchLocationImpl.class,
			locMstBranchLocation.getPrimaryKey(), locMstBranchLocation);

		return locMstBranchLocation;
	}

	protected LocMstBranchLocation toUnwrappedModel(
		LocMstBranchLocation locMstBranchLocation) {
		if (locMstBranchLocation instanceof LocMstBranchLocationImpl) {
			return locMstBranchLocation;
		}

		LocMstBranchLocationImpl locMstBranchLocationImpl = new LocMstBranchLocationImpl();

		locMstBranchLocationImpl.setNew(locMstBranchLocation.isNew());
		locMstBranchLocationImpl.setPrimaryKey(locMstBranchLocation.getPrimaryKey());

		locMstBranchLocationImpl.setBranchId(locMstBranchLocation.getBranchId());
		locMstBranchLocationImpl.setBranchName(locMstBranchLocation.getBranchName());
		locMstBranchLocationImpl.setBranchOpeningTime(locMstBranchLocation.getBranchOpeningTime());
		locMstBranchLocationImpl.setBranchClosingTime(locMstBranchLocation.getBranchClosingTime());
		locMstBranchLocationImpl.setAddressFirstLine(locMstBranchLocation.getAddressFirstLine());
		locMstBranchLocationImpl.setAddressSecondLine(locMstBranchLocation.getAddressSecondLine());
		locMstBranchLocationImpl.setPrimaryContactNo(locMstBranchLocation.getPrimaryContactNo());
		locMstBranchLocationImpl.setOtherContactNo(locMstBranchLocation.getOtherContactNo());
		locMstBranchLocationImpl.setFaxNumber(locMstBranchLocation.getFaxNumber());
		locMstBranchLocationImpl.setLocationId(locMstBranchLocation.getLocationId());
		locMstBranchLocationImpl.setLocationId_old(locMstBranchLocation.getLocationId_old());
		locMstBranchLocationImpl.setLongitude(locMstBranchLocation.getLongitude());
		locMstBranchLocationImpl.setLatitude(locMstBranchLocation.getLatitude());
		locMstBranchLocationImpl.setBranchCode(locMstBranchLocation.getBranchCode());
		locMstBranchLocationImpl.setCreatedBy(locMstBranchLocation.getCreatedBy());
		locMstBranchLocationImpl.setCreatedDate(locMstBranchLocation.getCreatedDate());
		locMstBranchLocationImpl.setModifiedBy(locMstBranchLocation.getModifiedBy());
		locMstBranchLocationImpl.setModifiedDate(locMstBranchLocation.getModifiedDate());
		locMstBranchLocationImpl.setIsActive(locMstBranchLocation.getIsActive());

		return locMstBranchLocationImpl;
	}

	/**
	 * Returns the loc mst branch location with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loc mst branch location
	 * @return the loc mst branch location
	 * @throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException if a loc mst branch location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstBranchLocation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocMstBranchLocationException, SystemException {
		LocMstBranchLocation locMstBranchLocation = fetchByPrimaryKey(primaryKey);

		if (locMstBranchLocation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocMstBranchLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return locMstBranchLocation;
	}

	/**
	 * Returns the loc mst branch location with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchLocMstBranchLocationException} if it could not be found.
	 *
	 * @param BranchId the primary key of the loc mst branch location
	 * @return the loc mst branch location
	 * @throws com.ifl.rapid.customer.NoSuchLocMstBranchLocationException if a loc mst branch location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstBranchLocation findByPrimaryKey(int BranchId)
		throws NoSuchLocMstBranchLocationException, SystemException {
		return findByPrimaryKey((Serializable)BranchId);
	}

	/**
	 * Returns the loc mst branch location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loc mst branch location
	 * @return the loc mst branch location, or <code>null</code> if a loc mst branch location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstBranchLocation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LocMstBranchLocation locMstBranchLocation = (LocMstBranchLocation)EntityCacheUtil.getResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
				LocMstBranchLocationImpl.class, primaryKey);

		if (locMstBranchLocation == _nullLocMstBranchLocation) {
			return null;
		}

		if (locMstBranchLocation == null) {
			Session session = null;

			try {
				session = openSession();

				locMstBranchLocation = (LocMstBranchLocation)session.get(LocMstBranchLocationImpl.class,
						primaryKey);

				if (locMstBranchLocation != null) {
					cacheResult(locMstBranchLocation);
				}
				else {
					EntityCacheUtil.putResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
						LocMstBranchLocationImpl.class, primaryKey,
						_nullLocMstBranchLocation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LocMstBranchLocationModelImpl.ENTITY_CACHE_ENABLED,
					LocMstBranchLocationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return locMstBranchLocation;
	}

	/**
	 * Returns the loc mst branch location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param BranchId the primary key of the loc mst branch location
	 * @return the loc mst branch location, or <code>null</code> if a loc mst branch location with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LocMstBranchLocation fetchByPrimaryKey(int BranchId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)BranchId);
	}

	/**
	 * Returns all the loc mst branch locations.
	 *
	 * @return the loc mst branch locations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocMstBranchLocation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loc mst branch locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstBranchLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loc mst branch locations
	 * @param end the upper bound of the range of loc mst branch locations (not inclusive)
	 * @return the range of loc mst branch locations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocMstBranchLocation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loc mst branch locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.LocMstBranchLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loc mst branch locations
	 * @param end the upper bound of the range of loc mst branch locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loc mst branch locations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LocMstBranchLocation> findAll(int start, int end,
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

		List<LocMstBranchLocation> list = (List<LocMstBranchLocation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOCMSTBRANCHLOCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCMSTBRANCHLOCATION;

				if (pagination) {
					sql = sql.concat(LocMstBranchLocationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LocMstBranchLocation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LocMstBranchLocation>(list);
				}
				else {
					list = (List<LocMstBranchLocation>)QueryUtil.list(q,
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
	 * Removes all the loc mst branch locations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LocMstBranchLocation locMstBranchLocation : findAll()) {
			remove(locMstBranchLocation);
		}
	}

	/**
	 * Returns the number of loc mst branch locations.
	 *
	 * @return the number of loc mst branch locations
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

				Query q = session.createQuery(_SQL_COUNT_LOCMSTBRANCHLOCATION);

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
	 * Initializes the loc mst branch location persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.LocMstBranchLocation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LocMstBranchLocation>> listenersList = new ArrayList<ModelListener<LocMstBranchLocation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LocMstBranchLocation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LocMstBranchLocationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOCMSTBRANCHLOCATION = "SELECT locMstBranchLocation FROM LocMstBranchLocation locMstBranchLocation";
	private static final String _SQL_COUNT_LOCMSTBRANCHLOCATION = "SELECT COUNT(locMstBranchLocation) FROM LocMstBranchLocation locMstBranchLocation";
	private static final String _ORDER_BY_ENTITY_ALIAS = "locMstBranchLocation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LocMstBranchLocation exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LocMstBranchLocationPersistenceImpl.class);
	private static LocMstBranchLocation _nullLocMstBranchLocation = new LocMstBranchLocationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LocMstBranchLocation> toCacheModel() {
				return _nullLocMstBranchLocationCacheModel;
			}
		};

	private static CacheModel<LocMstBranchLocation> _nullLocMstBranchLocationCacheModel =
		new CacheModel<LocMstBranchLocation>() {
			@Override
			public LocMstBranchLocation toEntityModel() {
				return _nullLocMstBranchLocation;
			}
		};
}