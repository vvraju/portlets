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

import com.ifli.rapid.NoSuchServiceSubMasterException;
import com.ifli.rapid.model.ServiceSubMaster;
import com.ifli.rapid.model.impl.ServiceSubMasterImpl;
import com.ifli.rapid.model.impl.ServiceSubMasterModelImpl;

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
 * The persistence implementation for the service sub master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ServiceSubMasterPersistence
 * @see ServiceSubMasterUtil
 * @generated
 */
public class ServiceSubMasterPersistenceImpl extends BasePersistenceImpl<ServiceSubMaster>
	implements ServiceSubMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceSubMasterUtil} to access the service sub master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceSubMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceSubMasterModelImpl.FINDER_CACHE_ENABLED,
			ServiceSubMasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceSubMasterModelImpl.FINDER_CACHE_ENABLED,
			ServiceSubMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceSubMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ServiceSubMasterPersistenceImpl() {
		setModelClass(ServiceSubMaster.class);
	}

	/**
	 * Caches the service sub master in the entity cache if it is enabled.
	 *
	 * @param serviceSubMaster the service sub master
	 */
	@Override
	public void cacheResult(ServiceSubMaster serviceSubMaster) {
		EntityCacheUtil.putResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceSubMasterImpl.class, serviceSubMaster.getPrimaryKey(),
			serviceSubMaster);

		serviceSubMaster.resetOriginalValues();
	}

	/**
	 * Caches the service sub masters in the entity cache if it is enabled.
	 *
	 * @param serviceSubMasters the service sub masters
	 */
	@Override
	public void cacheResult(List<ServiceSubMaster> serviceSubMasters) {
		for (ServiceSubMaster serviceSubMaster : serviceSubMasters) {
			if (EntityCacheUtil.getResult(
						ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
						ServiceSubMasterImpl.class,
						serviceSubMaster.getPrimaryKey()) == null) {
				cacheResult(serviceSubMaster);
			}
			else {
				serviceSubMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service sub masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceSubMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceSubMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service sub master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceSubMaster serviceSubMaster) {
		EntityCacheUtil.removeResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceSubMasterImpl.class, serviceSubMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ServiceSubMaster> serviceSubMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceSubMaster serviceSubMaster : serviceSubMasters) {
			EntityCacheUtil.removeResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
				ServiceSubMasterImpl.class, serviceSubMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service sub master with the primary key. Does not add the service sub master to the database.
	 *
	 * @param SUBMASTER_ID the primary key for the new service sub master
	 * @return the new service sub master
	 */
	@Override
	public ServiceSubMaster create(int SUBMASTER_ID) {
		ServiceSubMaster serviceSubMaster = new ServiceSubMasterImpl();

		serviceSubMaster.setNew(true);
		serviceSubMaster.setPrimaryKey(SUBMASTER_ID);

		return serviceSubMaster;
	}

	/**
	 * Removes the service sub master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SUBMASTER_ID the primary key of the service sub master
	 * @return the service sub master that was removed
	 * @throws com.ifli.rapid.NoSuchServiceSubMasterException if a service sub master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceSubMaster remove(int SUBMASTER_ID)
		throws NoSuchServiceSubMasterException, SystemException {
		return remove((Serializable)SUBMASTER_ID);
	}

	/**
	 * Removes the service sub master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service sub master
	 * @return the service sub master that was removed
	 * @throws com.ifli.rapid.NoSuchServiceSubMasterException if a service sub master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceSubMaster remove(Serializable primaryKey)
		throws NoSuchServiceSubMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceSubMaster serviceSubMaster = (ServiceSubMaster)session.get(ServiceSubMasterImpl.class,
					primaryKey);

			if (serviceSubMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceSubMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceSubMaster);
		}
		catch (NoSuchServiceSubMasterException nsee) {
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
	protected ServiceSubMaster removeImpl(ServiceSubMaster serviceSubMaster)
		throws SystemException {
		serviceSubMaster = toUnwrappedModel(serviceSubMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceSubMaster)) {
				serviceSubMaster = (ServiceSubMaster)session.get(ServiceSubMasterImpl.class,
						serviceSubMaster.getPrimaryKeyObj());
			}

			if (serviceSubMaster != null) {
				session.delete(serviceSubMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceSubMaster != null) {
			clearCache(serviceSubMaster);
		}

		return serviceSubMaster;
	}

	@Override
	public ServiceSubMaster updateImpl(
		com.ifli.rapid.model.ServiceSubMaster serviceSubMaster)
		throws SystemException {
		serviceSubMaster = toUnwrappedModel(serviceSubMaster);

		boolean isNew = serviceSubMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceSubMaster.isNew()) {
				session.save(serviceSubMaster);

				serviceSubMaster.setNew(false);
			}
			else {
				session.merge(serviceSubMaster);
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

		EntityCacheUtil.putResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
			ServiceSubMasterImpl.class, serviceSubMaster.getPrimaryKey(),
			serviceSubMaster);

		return serviceSubMaster;
	}

	protected ServiceSubMaster toUnwrappedModel(
		ServiceSubMaster serviceSubMaster) {
		if (serviceSubMaster instanceof ServiceSubMasterImpl) {
			return serviceSubMaster;
		}

		ServiceSubMasterImpl serviceSubMasterImpl = new ServiceSubMasterImpl();

		serviceSubMasterImpl.setNew(serviceSubMaster.isNew());
		serviceSubMasterImpl.setPrimaryKey(serviceSubMaster.getPrimaryKey());

		serviceSubMasterImpl.setSUBMASTER_ID(serviceSubMaster.getSUBMASTER_ID());
		serviceSubMasterImpl.setSUBMASTER_NAME(serviceSubMaster.getSUBMASTER_NAME());
		serviceSubMasterImpl.setSUBMASTER_URL(serviceSubMaster.getSUBMASTER_URL());
		serviceSubMasterImpl.setSERVICE_MASTER_ID(serviceSubMaster.getSERVICE_MASTER_ID());
		serviceSubMasterImpl.setACTIVE_FLAG(serviceSubMaster.getACTIVE_FLAG());

		return serviceSubMasterImpl;
	}

	/**
	 * Returns the service sub master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service sub master
	 * @return the service sub master
	 * @throws com.ifli.rapid.NoSuchServiceSubMasterException if a service sub master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceSubMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceSubMasterException, SystemException {
		ServiceSubMaster serviceSubMaster = fetchByPrimaryKey(primaryKey);

		if (serviceSubMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceSubMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceSubMaster;
	}

	/**
	 * Returns the service sub master with the primary key or throws a {@link com.ifli.rapid.NoSuchServiceSubMasterException} if it could not be found.
	 *
	 * @param SUBMASTER_ID the primary key of the service sub master
	 * @return the service sub master
	 * @throws com.ifli.rapid.NoSuchServiceSubMasterException if a service sub master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceSubMaster findByPrimaryKey(int SUBMASTER_ID)
		throws NoSuchServiceSubMasterException, SystemException {
		return findByPrimaryKey((Serializable)SUBMASTER_ID);
	}

	/**
	 * Returns the service sub master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service sub master
	 * @return the service sub master, or <code>null</code> if a service sub master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceSubMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceSubMaster serviceSubMaster = (ServiceSubMaster)EntityCacheUtil.getResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
				ServiceSubMasterImpl.class, primaryKey);

		if (serviceSubMaster == _nullServiceSubMaster) {
			return null;
		}

		if (serviceSubMaster == null) {
			Session session = null;

			try {
				session = openSession();

				serviceSubMaster = (ServiceSubMaster)session.get(ServiceSubMasterImpl.class,
						primaryKey);

				if (serviceSubMaster != null) {
					cacheResult(serviceSubMaster);
				}
				else {
					EntityCacheUtil.putResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
						ServiceSubMasterImpl.class, primaryKey,
						_nullServiceSubMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceSubMasterModelImpl.ENTITY_CACHE_ENABLED,
					ServiceSubMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceSubMaster;
	}

	/**
	 * Returns the service sub master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SUBMASTER_ID the primary key of the service sub master
	 * @return the service sub master, or <code>null</code> if a service sub master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceSubMaster fetchByPrimaryKey(int SUBMASTER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)SUBMASTER_ID);
	}

	/**
	 * Returns all the service sub masters.
	 *
	 * @return the service sub masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceSubMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service sub masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service sub masters
	 * @param end the upper bound of the range of service sub masters (not inclusive)
	 * @return the range of service sub masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceSubMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service sub masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ServiceSubMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service sub masters
	 * @param end the upper bound of the range of service sub masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service sub masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceSubMaster> findAll(int start, int end,
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

		List<ServiceSubMaster> list = (List<ServiceSubMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICESUBMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICESUBMASTER;

				if (pagination) {
					sql = sql.concat(ServiceSubMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceSubMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceSubMaster>(list);
				}
				else {
					list = (List<ServiceSubMaster>)QueryUtil.list(q,
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
	 * Removes all the service sub masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceSubMaster serviceSubMaster : findAll()) {
			remove(serviceSubMaster);
		}
	}

	/**
	 * Returns the number of service sub masters.
	 *
	 * @return the number of service sub masters
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

				Query q = session.createQuery(_SQL_COUNT_SERVICESUBMASTER);

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
	 * Initializes the service sub master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ServiceSubMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceSubMaster>> listenersList = new ArrayList<ModelListener<ServiceSubMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceSubMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceSubMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICESUBMASTER = "SELECT serviceSubMaster FROM ServiceSubMaster serviceSubMaster";
	private static final String _SQL_COUNT_SERVICESUBMASTER = "SELECT COUNT(serviceSubMaster) FROM ServiceSubMaster serviceSubMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceSubMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceSubMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServiceSubMasterPersistenceImpl.class);
	private static ServiceSubMaster _nullServiceSubMaster = new ServiceSubMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceSubMaster> toCacheModel() {
				return _nullServiceSubMasterCacheModel;
			}
		};

	private static CacheModel<ServiceSubMaster> _nullServiceSubMasterCacheModel = new CacheModel<ServiceSubMaster>() {
			@Override
			public ServiceSubMaster toEntityModel() {
				return _nullServiceSubMaster;
			}
		};
}