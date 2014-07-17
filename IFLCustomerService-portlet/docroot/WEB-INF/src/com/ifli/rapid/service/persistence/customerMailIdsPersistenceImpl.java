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

import com.ifli.rapid.NoSuchcustomerMailIdsException;
import com.ifli.rapid.model.customerMailIds;
import com.ifli.rapid.model.impl.customerMailIdsImpl;
import com.ifli.rapid.model.impl.customerMailIdsModelImpl;

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
 * The persistence implementation for the customer mail IDs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see customerMailIdsPersistence
 * @see customerMailIdsUtil
 * @generated
 */
public class customerMailIdsPersistenceImpl extends BasePersistenceImpl<customerMailIds>
	implements customerMailIdsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link customerMailIdsUtil} to access the customer mail IDs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = customerMailIdsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
			customerMailIdsModelImpl.FINDER_CACHE_ENABLED,
			customerMailIdsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
			customerMailIdsModelImpl.FINDER_CACHE_ENABLED,
			customerMailIdsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
			customerMailIdsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public customerMailIdsPersistenceImpl() {
		setModelClass(customerMailIds.class);
	}

	/**
	 * Caches the customer mail IDs in the entity cache if it is enabled.
	 *
	 * @param customerMailIds the customer mail IDs
	 */
	@Override
	public void cacheResult(customerMailIds customerMailIds) {
		EntityCacheUtil.putResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
			customerMailIdsImpl.class, customerMailIds.getPrimaryKey(),
			customerMailIds);

		customerMailIds.resetOriginalValues();
	}

	/**
	 * Caches the customer mail IDses in the entity cache if it is enabled.
	 *
	 * @param customerMailIdses the customer mail IDses
	 */
	@Override
	public void cacheResult(List<customerMailIds> customerMailIdses) {
		for (customerMailIds customerMailIds : customerMailIdses) {
			if (EntityCacheUtil.getResult(
						customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
						customerMailIdsImpl.class,
						customerMailIds.getPrimaryKey()) == null) {
				cacheResult(customerMailIds);
			}
			else {
				customerMailIds.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer mail IDses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(customerMailIdsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(customerMailIdsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer mail IDs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(customerMailIds customerMailIds) {
		EntityCacheUtil.removeResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
			customerMailIdsImpl.class, customerMailIds.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<customerMailIds> customerMailIdses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (customerMailIds customerMailIds : customerMailIdses) {
			EntityCacheUtil.removeResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
				customerMailIdsImpl.class, customerMailIds.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer mail IDs with the primary key. Does not add the customer mail IDs to the database.
	 *
	 * @param ID the primary key for the new customer mail IDs
	 * @return the new customer mail IDs
	 */
	@Override
	public customerMailIds create(int ID) {
		customerMailIds customerMailIds = new customerMailIdsImpl();

		customerMailIds.setNew(true);
		customerMailIds.setPrimaryKey(ID);

		return customerMailIds;
	}

	/**
	 * Removes the customer mail IDs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the customer mail IDs
	 * @return the customer mail IDs that was removed
	 * @throws com.ifli.rapid.NoSuchcustomerMailIdsException if a customer mail IDs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerMailIds remove(int ID)
		throws NoSuchcustomerMailIdsException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the customer mail IDs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer mail IDs
	 * @return the customer mail IDs that was removed
	 * @throws com.ifli.rapid.NoSuchcustomerMailIdsException if a customer mail IDs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerMailIds remove(Serializable primaryKey)
		throws NoSuchcustomerMailIdsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			customerMailIds customerMailIds = (customerMailIds)session.get(customerMailIdsImpl.class,
					primaryKey);

			if (customerMailIds == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcustomerMailIdsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerMailIds);
		}
		catch (NoSuchcustomerMailIdsException nsee) {
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
	protected customerMailIds removeImpl(customerMailIds customerMailIds)
		throws SystemException {
		customerMailIds = toUnwrappedModel(customerMailIds);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerMailIds)) {
				customerMailIds = (customerMailIds)session.get(customerMailIdsImpl.class,
						customerMailIds.getPrimaryKeyObj());
			}

			if (customerMailIds != null) {
				session.delete(customerMailIds);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerMailIds != null) {
			clearCache(customerMailIds);
		}

		return customerMailIds;
	}

	@Override
	public customerMailIds updateImpl(
		com.ifli.rapid.model.customerMailIds customerMailIds)
		throws SystemException {
		customerMailIds = toUnwrappedModel(customerMailIds);

		boolean isNew = customerMailIds.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerMailIds.isNew()) {
				session.save(customerMailIds);

				customerMailIds.setNew(false);
			}
			else {
				session.merge(customerMailIds);
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

		EntityCacheUtil.putResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
			customerMailIdsImpl.class, customerMailIds.getPrimaryKey(),
			customerMailIds);

		return customerMailIds;
	}

	protected customerMailIds toUnwrappedModel(customerMailIds customerMailIds) {
		if (customerMailIds instanceof customerMailIdsImpl) {
			return customerMailIds;
		}

		customerMailIdsImpl customerMailIdsImpl = new customerMailIdsImpl();

		customerMailIdsImpl.setNew(customerMailIds.isNew());
		customerMailIdsImpl.setPrimaryKey(customerMailIds.getPrimaryKey());

		customerMailIdsImpl.setID(customerMailIds.getID());
		customerMailIdsImpl.setCUSTOMER_ID(customerMailIds.getCUSTOMER_ID());
		customerMailIdsImpl.setEMAIL_ID(customerMailIds.getEMAIL_ID());
		customerMailIdsImpl.setINSERTED_BY(customerMailIds.getINSERTED_BY());
		customerMailIdsImpl.setINSERTED_DATE(customerMailIds.getINSERTED_DATE());
		customerMailIdsImpl.setUPDATED_BY(customerMailIds.getUPDATED_BY());
		customerMailIdsImpl.setUPDATED_DATE(customerMailIds.getUPDATED_DATE());

		return customerMailIdsImpl;
	}

	/**
	 * Returns the customer mail IDs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer mail IDs
	 * @return the customer mail IDs
	 * @throws com.ifli.rapid.NoSuchcustomerMailIdsException if a customer mail IDs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerMailIds findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcustomerMailIdsException, SystemException {
		customerMailIds customerMailIds = fetchByPrimaryKey(primaryKey);

		if (customerMailIds == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcustomerMailIdsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerMailIds;
	}

	/**
	 * Returns the customer mail IDs with the primary key or throws a {@link com.ifli.rapid.NoSuchcustomerMailIdsException} if it could not be found.
	 *
	 * @param ID the primary key of the customer mail IDs
	 * @return the customer mail IDs
	 * @throws com.ifli.rapid.NoSuchcustomerMailIdsException if a customer mail IDs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerMailIds findByPrimaryKey(int ID)
		throws NoSuchcustomerMailIdsException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the customer mail IDs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer mail IDs
	 * @return the customer mail IDs, or <code>null</code> if a customer mail IDs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerMailIds fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		customerMailIds customerMailIds = (customerMailIds)EntityCacheUtil.getResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
				customerMailIdsImpl.class, primaryKey);

		if (customerMailIds == _nullcustomerMailIds) {
			return null;
		}

		if (customerMailIds == null) {
			Session session = null;

			try {
				session = openSession();

				customerMailIds = (customerMailIds)session.get(customerMailIdsImpl.class,
						primaryKey);

				if (customerMailIds != null) {
					cacheResult(customerMailIds);
				}
				else {
					EntityCacheUtil.putResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
						customerMailIdsImpl.class, primaryKey,
						_nullcustomerMailIds);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(customerMailIdsModelImpl.ENTITY_CACHE_ENABLED,
					customerMailIdsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerMailIds;
	}

	/**
	 * Returns the customer mail IDs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the customer mail IDs
	 * @return the customer mail IDs, or <code>null</code> if a customer mail IDs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerMailIds fetchByPrimaryKey(int ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the customer mail IDses.
	 *
	 * @return the customer mail IDses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<customerMailIds> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer mail IDses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerMailIdsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer mail IDses
	 * @param end the upper bound of the range of customer mail IDses (not inclusive)
	 * @return the range of customer mail IDses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<customerMailIds> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer mail IDses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerMailIdsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer mail IDses
	 * @param end the upper bound of the range of customer mail IDses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer mail IDses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<customerMailIds> findAll(int start, int end,
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

		List<customerMailIds> list = (List<customerMailIds>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERMAILIDS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERMAILIDS;

				if (pagination) {
					sql = sql.concat(customerMailIdsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<customerMailIds>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<customerMailIds>(list);
				}
				else {
					list = (List<customerMailIds>)QueryUtil.list(q,
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
	 * Removes all the customer mail IDses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (customerMailIds customerMailIds : findAll()) {
			remove(customerMailIds);
		}
	}

	/**
	 * Returns the number of customer mail IDses.
	 *
	 * @return the number of customer mail IDses
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERMAILIDS);

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
	 * Initializes the customer mail IDs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.customerMailIds")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<customerMailIds>> listenersList = new ArrayList<ModelListener<customerMailIds>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<customerMailIds>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(customerMailIdsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERMAILIDS = "SELECT customerMailIds FROM customerMailIds customerMailIds";
	private static final String _SQL_COUNT_CUSTOMERMAILIDS = "SELECT COUNT(customerMailIds) FROM customerMailIds customerMailIds";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerMailIds.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No customerMailIds exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(customerMailIdsPersistenceImpl.class);
	private static customerMailIds _nullcustomerMailIds = new customerMailIdsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<customerMailIds> toCacheModel() {
				return _nullcustomerMailIdsCacheModel;
			}
		};

	private static CacheModel<customerMailIds> _nullcustomerMailIdsCacheModel = new CacheModel<customerMailIds>() {
			@Override
			public customerMailIds toEntityModel() {
				return _nullcustomerMailIds;
			}
		};
}