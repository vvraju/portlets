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

import com.ifli.rapid.NoSuchPremiumFrequencyMasterException;
import com.ifli.rapid.model.PremiumFrequencyMaster;
import com.ifli.rapid.model.impl.PremiumFrequencyMasterImpl;
import com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl;

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
 * The persistence implementation for the premium frequency master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PremiumFrequencyMasterPersistence
 * @see PremiumFrequencyMasterUtil
 * @generated
 */
public class PremiumFrequencyMasterPersistenceImpl extends BasePersistenceImpl<PremiumFrequencyMaster>
	implements PremiumFrequencyMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PremiumFrequencyMasterUtil} to access the premium frequency master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PremiumFrequencyMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
			PremiumFrequencyMasterModelImpl.FINDER_CACHE_ENABLED,
			PremiumFrequencyMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
			PremiumFrequencyMasterModelImpl.FINDER_CACHE_ENABLED,
			PremiumFrequencyMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
			PremiumFrequencyMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PremiumFrequencyMasterPersistenceImpl() {
		setModelClass(PremiumFrequencyMaster.class);
	}

	/**
	 * Caches the premium frequency master in the entity cache if it is enabled.
	 *
	 * @param premiumFrequencyMaster the premium frequency master
	 */
	@Override
	public void cacheResult(PremiumFrequencyMaster premiumFrequencyMaster) {
		EntityCacheUtil.putResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
			PremiumFrequencyMasterImpl.class,
			premiumFrequencyMaster.getPrimaryKey(), premiumFrequencyMaster);

		premiumFrequencyMaster.resetOriginalValues();
	}

	/**
	 * Caches the premium frequency masters in the entity cache if it is enabled.
	 *
	 * @param premiumFrequencyMasters the premium frequency masters
	 */
	@Override
	public void cacheResult(
		List<PremiumFrequencyMaster> premiumFrequencyMasters) {
		for (PremiumFrequencyMaster premiumFrequencyMaster : premiumFrequencyMasters) {
			if (EntityCacheUtil.getResult(
						PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
						PremiumFrequencyMasterImpl.class,
						premiumFrequencyMaster.getPrimaryKey()) == null) {
				cacheResult(premiumFrequencyMaster);
			}
			else {
				premiumFrequencyMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all premium frequency masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PremiumFrequencyMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PremiumFrequencyMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the premium frequency master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PremiumFrequencyMaster premiumFrequencyMaster) {
		EntityCacheUtil.removeResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
			PremiumFrequencyMasterImpl.class,
			premiumFrequencyMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PremiumFrequencyMaster> premiumFrequencyMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PremiumFrequencyMaster premiumFrequencyMaster : premiumFrequencyMasters) {
			EntityCacheUtil.removeResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
				PremiumFrequencyMasterImpl.class,
				premiumFrequencyMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new premium frequency master with the primary key. Does not add the premium frequency master to the database.
	 *
	 * @param PremiumFrequencyId the primary key for the new premium frequency master
	 * @return the new premium frequency master
	 */
	@Override
	public PremiumFrequencyMaster create(String PremiumFrequencyId) {
		PremiumFrequencyMaster premiumFrequencyMaster = new PremiumFrequencyMasterImpl();

		premiumFrequencyMaster.setNew(true);
		premiumFrequencyMaster.setPrimaryKey(PremiumFrequencyId);

		return premiumFrequencyMaster;
	}

	/**
	 * Removes the premium frequency master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PremiumFrequencyId the primary key of the premium frequency master
	 * @return the premium frequency master that was removed
	 * @throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException if a premium frequency master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumFrequencyMaster remove(String PremiumFrequencyId)
		throws NoSuchPremiumFrequencyMasterException, SystemException {
		return remove((Serializable)PremiumFrequencyId);
	}

	/**
	 * Removes the premium frequency master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the premium frequency master
	 * @return the premium frequency master that was removed
	 * @throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException if a premium frequency master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumFrequencyMaster remove(Serializable primaryKey)
		throws NoSuchPremiumFrequencyMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PremiumFrequencyMaster premiumFrequencyMaster = (PremiumFrequencyMaster)session.get(PremiumFrequencyMasterImpl.class,
					primaryKey);

			if (premiumFrequencyMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPremiumFrequencyMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(premiumFrequencyMaster);
		}
		catch (NoSuchPremiumFrequencyMasterException nsee) {
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
	protected PremiumFrequencyMaster removeImpl(
		PremiumFrequencyMaster premiumFrequencyMaster)
		throws SystemException {
		premiumFrequencyMaster = toUnwrappedModel(premiumFrequencyMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(premiumFrequencyMaster)) {
				premiumFrequencyMaster = (PremiumFrequencyMaster)session.get(PremiumFrequencyMasterImpl.class,
						premiumFrequencyMaster.getPrimaryKeyObj());
			}

			if (premiumFrequencyMaster != null) {
				session.delete(premiumFrequencyMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (premiumFrequencyMaster != null) {
			clearCache(premiumFrequencyMaster);
		}

		return premiumFrequencyMaster;
	}

	@Override
	public PremiumFrequencyMaster updateImpl(
		com.ifli.rapid.model.PremiumFrequencyMaster premiumFrequencyMaster)
		throws SystemException {
		premiumFrequencyMaster = toUnwrappedModel(premiumFrequencyMaster);

		boolean isNew = premiumFrequencyMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (premiumFrequencyMaster.isNew()) {
				session.save(premiumFrequencyMaster);

				premiumFrequencyMaster.setNew(false);
			}
			else {
				session.merge(premiumFrequencyMaster);
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

		EntityCacheUtil.putResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
			PremiumFrequencyMasterImpl.class,
			premiumFrequencyMaster.getPrimaryKey(), premiumFrequencyMaster);

		return premiumFrequencyMaster;
	}

	protected PremiumFrequencyMaster toUnwrappedModel(
		PremiumFrequencyMaster premiumFrequencyMaster) {
		if (premiumFrequencyMaster instanceof PremiumFrequencyMasterImpl) {
			return premiumFrequencyMaster;
		}

		PremiumFrequencyMasterImpl premiumFrequencyMasterImpl = new PremiumFrequencyMasterImpl();

		premiumFrequencyMasterImpl.setNew(premiumFrequencyMaster.isNew());
		premiumFrequencyMasterImpl.setPrimaryKey(premiumFrequencyMaster.getPrimaryKey());

		premiumFrequencyMasterImpl.setPremiumFrequencyId(premiumFrequencyMaster.getPremiumFrequencyId());
		premiumFrequencyMasterImpl.setPremiumFrequencyDescription(premiumFrequencyMaster.getPremiumFrequencyDescription());
		premiumFrequencyMasterImpl.setIsActive(premiumFrequencyMaster.isIsActive());
		premiumFrequencyMasterImpl.setCreatedBy(premiumFrequencyMaster.getCreatedBy());
		premiumFrequencyMasterImpl.setCreatedDate(premiumFrequencyMaster.getCreatedDate());
		premiumFrequencyMasterImpl.setModifiedBy(premiumFrequencyMaster.getModifiedBy());
		premiumFrequencyMasterImpl.setModifiedDate(premiumFrequencyMaster.getModifiedDate());
		premiumFrequencyMasterImpl.setPriority(premiumFrequencyMaster.getPriority());

		return premiumFrequencyMasterImpl;
	}

	/**
	 * Returns the premium frequency master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the premium frequency master
	 * @return the premium frequency master
	 * @throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException if a premium frequency master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumFrequencyMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPremiumFrequencyMasterException, SystemException {
		PremiumFrequencyMaster premiumFrequencyMaster = fetchByPrimaryKey(primaryKey);

		if (premiumFrequencyMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPremiumFrequencyMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return premiumFrequencyMaster;
	}

	/**
	 * Returns the premium frequency master with the primary key or throws a {@link com.ifli.rapid.NoSuchPremiumFrequencyMasterException} if it could not be found.
	 *
	 * @param PremiumFrequencyId the primary key of the premium frequency master
	 * @return the premium frequency master
	 * @throws com.ifli.rapid.NoSuchPremiumFrequencyMasterException if a premium frequency master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumFrequencyMaster findByPrimaryKey(String PremiumFrequencyId)
		throws NoSuchPremiumFrequencyMasterException, SystemException {
		return findByPrimaryKey((Serializable)PremiumFrequencyId);
	}

	/**
	 * Returns the premium frequency master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the premium frequency master
	 * @return the premium frequency master, or <code>null</code> if a premium frequency master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumFrequencyMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PremiumFrequencyMaster premiumFrequencyMaster = (PremiumFrequencyMaster)EntityCacheUtil.getResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
				PremiumFrequencyMasterImpl.class, primaryKey);

		if (premiumFrequencyMaster == _nullPremiumFrequencyMaster) {
			return null;
		}

		if (premiumFrequencyMaster == null) {
			Session session = null;

			try {
				session = openSession();

				premiumFrequencyMaster = (PremiumFrequencyMaster)session.get(PremiumFrequencyMasterImpl.class,
						primaryKey);

				if (premiumFrequencyMaster != null) {
					cacheResult(premiumFrequencyMaster);
				}
				else {
					EntityCacheUtil.putResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
						PremiumFrequencyMasterImpl.class, primaryKey,
						_nullPremiumFrequencyMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PremiumFrequencyMasterModelImpl.ENTITY_CACHE_ENABLED,
					PremiumFrequencyMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return premiumFrequencyMaster;
	}

	/**
	 * Returns the premium frequency master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PremiumFrequencyId the primary key of the premium frequency master
	 * @return the premium frequency master, or <code>null</code> if a premium frequency master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumFrequencyMaster fetchByPrimaryKey(String PremiumFrequencyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PremiumFrequencyId);
	}

	/**
	 * Returns all the premium frequency masters.
	 *
	 * @return the premium frequency masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PremiumFrequencyMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the premium frequency masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of premium frequency masters
	 * @param end the upper bound of the range of premium frequency masters (not inclusive)
	 * @return the range of premium frequency masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PremiumFrequencyMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the premium frequency masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumFrequencyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of premium frequency masters
	 * @param end the upper bound of the range of premium frequency masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of premium frequency masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PremiumFrequencyMaster> findAll(int start, int end,
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

		List<PremiumFrequencyMaster> list = (List<PremiumFrequencyMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREMIUMFREQUENCYMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREMIUMFREQUENCYMASTER;

				if (pagination) {
					sql = sql.concat(PremiumFrequencyMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PremiumFrequencyMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PremiumFrequencyMaster>(list);
				}
				else {
					list = (List<PremiumFrequencyMaster>)QueryUtil.list(q,
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
	 * Removes all the premium frequency masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PremiumFrequencyMaster premiumFrequencyMaster : findAll()) {
			remove(premiumFrequencyMaster);
		}
	}

	/**
	 * Returns the number of premium frequency masters.
	 *
	 * @return the number of premium frequency masters
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

				Query q = session.createQuery(_SQL_COUNT_PREMIUMFREQUENCYMASTER);

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
	 * Initializes the premium frequency master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PremiumFrequencyMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PremiumFrequencyMaster>> listenersList = new ArrayList<ModelListener<PremiumFrequencyMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PremiumFrequencyMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PremiumFrequencyMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PREMIUMFREQUENCYMASTER = "SELECT premiumFrequencyMaster FROM PremiumFrequencyMaster premiumFrequencyMaster";
	private static final String _SQL_COUNT_PREMIUMFREQUENCYMASTER = "SELECT COUNT(premiumFrequencyMaster) FROM PremiumFrequencyMaster premiumFrequencyMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "premiumFrequencyMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PremiumFrequencyMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PremiumFrequencyMasterPersistenceImpl.class);
	private static PremiumFrequencyMaster _nullPremiumFrequencyMaster = new PremiumFrequencyMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PremiumFrequencyMaster> toCacheModel() {
				return _nullPremiumFrequencyMasterCacheModel;
			}
		};

	private static CacheModel<PremiumFrequencyMaster> _nullPremiumFrequencyMasterCacheModel =
		new CacheModel<PremiumFrequencyMaster>() {
			@Override
			public PremiumFrequencyMaster toEntityModel() {
				return _nullPremiumFrequencyMaster;
			}
		};
}