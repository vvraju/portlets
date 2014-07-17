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

import com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException;
import com.ifli.rapid.model.POLICY_DOC_TYPES;
import com.ifli.rapid.model.impl.POLICY_DOC_TYPESImpl;
import com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl;

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
 * The persistence implementation for the p o l i c y_ d o c_ t y p e s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see POLICY_DOC_TYPESPersistence
 * @see POLICY_DOC_TYPESUtil
 * @generated
 */
public class POLICY_DOC_TYPESPersistenceImpl extends BasePersistenceImpl<POLICY_DOC_TYPES>
	implements POLICY_DOC_TYPESPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link POLICY_DOC_TYPESUtil} to access the p o l i c y_ d o c_ t y p e s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = POLICY_DOC_TYPESImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
			POLICY_DOC_TYPESModelImpl.FINDER_CACHE_ENABLED,
			POLICY_DOC_TYPESImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
			POLICY_DOC_TYPESModelImpl.FINDER_CACHE_ENABLED,
			POLICY_DOC_TYPESImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
			POLICY_DOC_TYPESModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public POLICY_DOC_TYPESPersistenceImpl() {
		setModelClass(POLICY_DOC_TYPES.class);
	}

	/**
	 * Caches the p o l i c y_ d o c_ t y p e s in the entity cache if it is enabled.
	 *
	 * @param policy_doc_types the p o l i c y_ d o c_ t y p e s
	 */
	@Override
	public void cacheResult(POLICY_DOC_TYPES policy_doc_types) {
		EntityCacheUtil.putResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
			POLICY_DOC_TYPESImpl.class, policy_doc_types.getPrimaryKey(),
			policy_doc_types);

		policy_doc_types.resetOriginalValues();
	}

	/**
	 * Caches the p o l i c y_ d o c_ t y p e ses in the entity cache if it is enabled.
	 *
	 * @param policy_doc_typeses the p o l i c y_ d o c_ t y p e ses
	 */
	@Override
	public void cacheResult(List<POLICY_DOC_TYPES> policy_doc_typeses) {
		for (POLICY_DOC_TYPES policy_doc_types : policy_doc_typeses) {
			if (EntityCacheUtil.getResult(
						POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
						POLICY_DOC_TYPESImpl.class,
						policy_doc_types.getPrimaryKey()) == null) {
				cacheResult(policy_doc_types);
			}
			else {
				policy_doc_types.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all p o l i c y_ d o c_ t y p e ses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(POLICY_DOC_TYPESImpl.class.getName());
		}

		EntityCacheUtil.clearCache(POLICY_DOC_TYPESImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the p o l i c y_ d o c_ t y p e s.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(POLICY_DOC_TYPES policy_doc_types) {
		EntityCacheUtil.removeResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
			POLICY_DOC_TYPESImpl.class, policy_doc_types.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<POLICY_DOC_TYPES> policy_doc_typeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (POLICY_DOC_TYPES policy_doc_types : policy_doc_typeses) {
			EntityCacheUtil.removeResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
				POLICY_DOC_TYPESImpl.class, policy_doc_types.getPrimaryKey());
		}
	}

	/**
	 * Creates a new p o l i c y_ d o c_ t y p e s with the primary key. Does not add the p o l i c y_ d o c_ t y p e s to the database.
	 *
	 * @param ID the primary key for the new p o l i c y_ d o c_ t y p e s
	 * @return the new p o l i c y_ d o c_ t y p e s
	 */
	@Override
	public POLICY_DOC_TYPES create(int ID) {
		POLICY_DOC_TYPES policy_doc_types = new POLICY_DOC_TYPESImpl();

		policy_doc_types.setNew(true);
		policy_doc_types.setPrimaryKey(ID);

		return policy_doc_types;
	}

	/**
	 * Removes the p o l i c y_ d o c_ t y p e s with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	 * @return the p o l i c y_ d o c_ t y p e s that was removed
	 * @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public POLICY_DOC_TYPES remove(int ID)
		throws NoSuchPOLICY_DOC_TYPESException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the p o l i c y_ d o c_ t y p e s with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the p o l i c y_ d o c_ t y p e s
	 * @return the p o l i c y_ d o c_ t y p e s that was removed
	 * @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public POLICY_DOC_TYPES remove(Serializable primaryKey)
		throws NoSuchPOLICY_DOC_TYPESException, SystemException {
		Session session = null;

		try {
			session = openSession();

			POLICY_DOC_TYPES policy_doc_types = (POLICY_DOC_TYPES)session.get(POLICY_DOC_TYPESImpl.class,
					primaryKey);

			if (policy_doc_types == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPOLICY_DOC_TYPESException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(policy_doc_types);
		}
		catch (NoSuchPOLICY_DOC_TYPESException nsee) {
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
	protected POLICY_DOC_TYPES removeImpl(POLICY_DOC_TYPES policy_doc_types)
		throws SystemException {
		policy_doc_types = toUnwrappedModel(policy_doc_types);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(policy_doc_types)) {
				policy_doc_types = (POLICY_DOC_TYPES)session.get(POLICY_DOC_TYPESImpl.class,
						policy_doc_types.getPrimaryKeyObj());
			}

			if (policy_doc_types != null) {
				session.delete(policy_doc_types);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (policy_doc_types != null) {
			clearCache(policy_doc_types);
		}

		return policy_doc_types;
	}

	@Override
	public POLICY_DOC_TYPES updateImpl(
		com.ifli.rapid.model.POLICY_DOC_TYPES policy_doc_types)
		throws SystemException {
		policy_doc_types = toUnwrappedModel(policy_doc_types);

		boolean isNew = policy_doc_types.isNew();

		Session session = null;

		try {
			session = openSession();

			if (policy_doc_types.isNew()) {
				session.save(policy_doc_types);

				policy_doc_types.setNew(false);
			}
			else {
				session.merge(policy_doc_types);
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

		EntityCacheUtil.putResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
			POLICY_DOC_TYPESImpl.class, policy_doc_types.getPrimaryKey(),
			policy_doc_types);

		return policy_doc_types;
	}

	protected POLICY_DOC_TYPES toUnwrappedModel(
		POLICY_DOC_TYPES policy_doc_types) {
		if (policy_doc_types instanceof POLICY_DOC_TYPESImpl) {
			return policy_doc_types;
		}

		POLICY_DOC_TYPESImpl policy_doc_typesImpl = new POLICY_DOC_TYPESImpl();

		policy_doc_typesImpl.setNew(policy_doc_types.isNew());
		policy_doc_typesImpl.setPrimaryKey(policy_doc_types.getPrimaryKey());

		policy_doc_typesImpl.setID(policy_doc_types.getID());
		policy_doc_typesImpl.setDOC_NAME(policy_doc_types.getDOC_NAME());

		return policy_doc_typesImpl;
	}

	/**
	 * Returns the p o l i c y_ d o c_ t y p e s with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the p o l i c y_ d o c_ t y p e s
	 * @return the p o l i c y_ d o c_ t y p e s
	 * @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public POLICY_DOC_TYPES findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPOLICY_DOC_TYPESException, SystemException {
		POLICY_DOC_TYPES policy_doc_types = fetchByPrimaryKey(primaryKey);

		if (policy_doc_types == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPOLICY_DOC_TYPESException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return policy_doc_types;
	}

	/**
	 * Returns the p o l i c y_ d o c_ t y p e s with the primary key or throws a {@link com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException} if it could not be found.
	 *
	 * @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	 * @return the p o l i c y_ d o c_ t y p e s
	 * @throws com.ifli.rapid.NoSuchPOLICY_DOC_TYPESException if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public POLICY_DOC_TYPES findByPrimaryKey(int ID)
		throws NoSuchPOLICY_DOC_TYPESException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the p o l i c y_ d o c_ t y p e s with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the p o l i c y_ d o c_ t y p e s
	 * @return the p o l i c y_ d o c_ t y p e s, or <code>null</code> if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public POLICY_DOC_TYPES fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		POLICY_DOC_TYPES policy_doc_types = (POLICY_DOC_TYPES)EntityCacheUtil.getResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
				POLICY_DOC_TYPESImpl.class, primaryKey);

		if (policy_doc_types == _nullPOLICY_DOC_TYPES) {
			return null;
		}

		if (policy_doc_types == null) {
			Session session = null;

			try {
				session = openSession();

				policy_doc_types = (POLICY_DOC_TYPES)session.get(POLICY_DOC_TYPESImpl.class,
						primaryKey);

				if (policy_doc_types != null) {
					cacheResult(policy_doc_types);
				}
				else {
					EntityCacheUtil.putResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
						POLICY_DOC_TYPESImpl.class, primaryKey,
						_nullPOLICY_DOC_TYPES);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(POLICY_DOC_TYPESModelImpl.ENTITY_CACHE_ENABLED,
					POLICY_DOC_TYPESImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return policy_doc_types;
	}

	/**
	 * Returns the p o l i c y_ d o c_ t y p e s with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the p o l i c y_ d o c_ t y p e s
	 * @return the p o l i c y_ d o c_ t y p e s, or <code>null</code> if a p o l i c y_ d o c_ t y p e s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public POLICY_DOC_TYPES fetchByPrimaryKey(int ID) throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the p o l i c y_ d o c_ t y p e ses.
	 *
	 * @return the p o l i c y_ d o c_ t y p e ses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<POLICY_DOC_TYPES> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the p o l i c y_ d o c_ t y p e ses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	 * @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	 * @return the range of p o l i c y_ d o c_ t y p e ses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<POLICY_DOC_TYPES> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the p o l i c y_ d o c_ t y p e ses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.POLICY_DOC_TYPESModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of p o l i c y_ d o c_ t y p e ses
	 * @param end the upper bound of the range of p o l i c y_ d o c_ t y p e ses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of p o l i c y_ d o c_ t y p e ses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<POLICY_DOC_TYPES> findAll(int start, int end,
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

		List<POLICY_DOC_TYPES> list = (List<POLICY_DOC_TYPES>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLICY_DOC_TYPES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLICY_DOC_TYPES;

				if (pagination) {
					sql = sql.concat(POLICY_DOC_TYPESModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<POLICY_DOC_TYPES>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<POLICY_DOC_TYPES>(list);
				}
				else {
					list = (List<POLICY_DOC_TYPES>)QueryUtil.list(q,
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
	 * Removes all the p o l i c y_ d o c_ t y p e ses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (POLICY_DOC_TYPES policy_doc_types : findAll()) {
			remove(policy_doc_types);
		}
	}

	/**
	 * Returns the number of p o l i c y_ d o c_ t y p e ses.
	 *
	 * @return the number of p o l i c y_ d o c_ t y p e ses
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

				Query q = session.createQuery(_SQL_COUNT_POLICY_DOC_TYPES);

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
	 * Initializes the p o l i c y_ d o c_ t y p e s persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.POLICY_DOC_TYPES")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<POLICY_DOC_TYPES>> listenersList = new ArrayList<ModelListener<POLICY_DOC_TYPES>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<POLICY_DOC_TYPES>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(POLICY_DOC_TYPESImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POLICY_DOC_TYPES = "SELECT policy_doc_types FROM POLICY_DOC_TYPES policy_doc_types";
	private static final String _SQL_COUNT_POLICY_DOC_TYPES = "SELECT COUNT(policy_doc_types) FROM POLICY_DOC_TYPES policy_doc_types";
	private static final String _ORDER_BY_ENTITY_ALIAS = "policy_doc_types.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No POLICY_DOC_TYPES exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(POLICY_DOC_TYPESPersistenceImpl.class);
	private static POLICY_DOC_TYPES _nullPOLICY_DOC_TYPES = new POLICY_DOC_TYPESImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<POLICY_DOC_TYPES> toCacheModel() {
				return _nullPOLICY_DOC_TYPESCacheModel;
			}
		};

	private static CacheModel<POLICY_DOC_TYPES> _nullPOLICY_DOC_TYPESCacheModel = new CacheModel<POLICY_DOC_TYPES>() {
			@Override
			public POLICY_DOC_TYPES toEntityModel() {
				return _nullPOLICY_DOC_TYPES;
			}
		};
}