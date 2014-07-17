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

import com.ifli.rapid.NoSuchFamilyRelationsException;
import com.ifli.rapid.model.FamilyRelations;
import com.ifli.rapid.model.impl.FamilyRelationsImpl;
import com.ifli.rapid.model.impl.FamilyRelationsModelImpl;

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
 * The persistence implementation for the family relations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see FamilyRelationsPersistence
 * @see FamilyRelationsUtil
 * @generated
 */
public class FamilyRelationsPersistenceImpl extends BasePersistenceImpl<FamilyRelations>
	implements FamilyRelationsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FamilyRelationsUtil} to access the family relations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FamilyRelationsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationsModelImpl.FINDER_CACHE_ENABLED,
			FamilyRelationsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationsModelImpl.FINDER_CACHE_ENABLED,
			FamilyRelationsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public FamilyRelationsPersistenceImpl() {
		setModelClass(FamilyRelations.class);
	}

	/**
	 * Caches the family relations in the entity cache if it is enabled.
	 *
	 * @param familyRelations the family relations
	 */
	@Override
	public void cacheResult(FamilyRelations familyRelations) {
		EntityCacheUtil.putResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationsImpl.class, familyRelations.getPrimaryKey(),
			familyRelations);

		familyRelations.resetOriginalValues();
	}

	/**
	 * Caches the family relationses in the entity cache if it is enabled.
	 *
	 * @param familyRelationses the family relationses
	 */
	@Override
	public void cacheResult(List<FamilyRelations> familyRelationses) {
		for (FamilyRelations familyRelations : familyRelationses) {
			if (EntityCacheUtil.getResult(
						FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
						FamilyRelationsImpl.class,
						familyRelations.getPrimaryKey()) == null) {
				cacheResult(familyRelations);
			}
			else {
				familyRelations.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all family relationses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FamilyRelationsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FamilyRelationsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the family relations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FamilyRelations familyRelations) {
		EntityCacheUtil.removeResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationsImpl.class, familyRelations.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FamilyRelations> familyRelationses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FamilyRelations familyRelations : familyRelationses) {
			EntityCacheUtil.removeResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
				FamilyRelationsImpl.class, familyRelations.getPrimaryKey());
		}
	}

	/**
	 * Creates a new family relations with the primary key. Does not add the family relations to the database.
	 *
	 * @param RELATION_ID the primary key for the new family relations
	 * @return the new family relations
	 */
	@Override
	public FamilyRelations create(int RELATION_ID) {
		FamilyRelations familyRelations = new FamilyRelationsImpl();

		familyRelations.setNew(true);
		familyRelations.setPrimaryKey(RELATION_ID);

		return familyRelations;
	}

	/**
	 * Removes the family relations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param RELATION_ID the primary key of the family relations
	 * @return the family relations that was removed
	 * @throws com.ifli.rapid.NoSuchFamilyRelationsException if a family relations with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelations remove(int RELATION_ID)
		throws NoSuchFamilyRelationsException, SystemException {
		return remove((Serializable)RELATION_ID);
	}

	/**
	 * Removes the family relations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the family relations
	 * @return the family relations that was removed
	 * @throws com.ifli.rapid.NoSuchFamilyRelationsException if a family relations with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelations remove(Serializable primaryKey)
		throws NoSuchFamilyRelationsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FamilyRelations familyRelations = (FamilyRelations)session.get(FamilyRelationsImpl.class,
					primaryKey);

			if (familyRelations == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFamilyRelationsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(familyRelations);
		}
		catch (NoSuchFamilyRelationsException nsee) {
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
	protected FamilyRelations removeImpl(FamilyRelations familyRelations)
		throws SystemException {
		familyRelations = toUnwrappedModel(familyRelations);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(familyRelations)) {
				familyRelations = (FamilyRelations)session.get(FamilyRelationsImpl.class,
						familyRelations.getPrimaryKeyObj());
			}

			if (familyRelations != null) {
				session.delete(familyRelations);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (familyRelations != null) {
			clearCache(familyRelations);
		}

		return familyRelations;
	}

	@Override
	public FamilyRelations updateImpl(
		com.ifli.rapid.model.FamilyRelations familyRelations)
		throws SystemException {
		familyRelations = toUnwrappedModel(familyRelations);

		boolean isNew = familyRelations.isNew();

		Session session = null;

		try {
			session = openSession();

			if (familyRelations.isNew()) {
				session.save(familyRelations);

				familyRelations.setNew(false);
			}
			else {
				session.merge(familyRelations);
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

		EntityCacheUtil.putResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
			FamilyRelationsImpl.class, familyRelations.getPrimaryKey(),
			familyRelations);

		return familyRelations;
	}

	protected FamilyRelations toUnwrappedModel(FamilyRelations familyRelations) {
		if (familyRelations instanceof FamilyRelationsImpl) {
			return familyRelations;
		}

		FamilyRelationsImpl familyRelationsImpl = new FamilyRelationsImpl();

		familyRelationsImpl.setNew(familyRelations.isNew());
		familyRelationsImpl.setPrimaryKey(familyRelations.getPrimaryKey());

		familyRelationsImpl.setRELATION_ID(familyRelations.getRELATION_ID());
		familyRelationsImpl.setRELATION_NAME(familyRelations.getRELATION_NAME());

		return familyRelationsImpl;
	}

	/**
	 * Returns the family relations with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the family relations
	 * @return the family relations
	 * @throws com.ifli.rapid.NoSuchFamilyRelationsException if a family relations with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelations findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFamilyRelationsException, SystemException {
		FamilyRelations familyRelations = fetchByPrimaryKey(primaryKey);

		if (familyRelations == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFamilyRelationsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return familyRelations;
	}

	/**
	 * Returns the family relations with the primary key or throws a {@link com.ifli.rapid.NoSuchFamilyRelationsException} if it could not be found.
	 *
	 * @param RELATION_ID the primary key of the family relations
	 * @return the family relations
	 * @throws com.ifli.rapid.NoSuchFamilyRelationsException if a family relations with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelations findByPrimaryKey(int RELATION_ID)
		throws NoSuchFamilyRelationsException, SystemException {
		return findByPrimaryKey((Serializable)RELATION_ID);
	}

	/**
	 * Returns the family relations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the family relations
	 * @return the family relations, or <code>null</code> if a family relations with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelations fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FamilyRelations familyRelations = (FamilyRelations)EntityCacheUtil.getResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
				FamilyRelationsImpl.class, primaryKey);

		if (familyRelations == _nullFamilyRelations) {
			return null;
		}

		if (familyRelations == null) {
			Session session = null;

			try {
				session = openSession();

				familyRelations = (FamilyRelations)session.get(FamilyRelationsImpl.class,
						primaryKey);

				if (familyRelations != null) {
					cacheResult(familyRelations);
				}
				else {
					EntityCacheUtil.putResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
						FamilyRelationsImpl.class, primaryKey,
						_nullFamilyRelations);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FamilyRelationsModelImpl.ENTITY_CACHE_ENABLED,
					FamilyRelationsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return familyRelations;
	}

	/**
	 * Returns the family relations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param RELATION_ID the primary key of the family relations
	 * @return the family relations, or <code>null</code> if a family relations with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FamilyRelations fetchByPrimaryKey(int RELATION_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)RELATION_ID);
	}

	/**
	 * Returns all the family relationses.
	 *
	 * @return the family relationses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamilyRelations> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the family relationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FamilyRelationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of family relationses
	 * @param end the upper bound of the range of family relationses (not inclusive)
	 * @return the range of family relationses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamilyRelations> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the family relationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.FamilyRelationsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of family relationses
	 * @param end the upper bound of the range of family relationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of family relationses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FamilyRelations> findAll(int start, int end,
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

		List<FamilyRelations> list = (List<FamilyRelations>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FAMILYRELATIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAMILYRELATIONS;

				if (pagination) {
					sql = sql.concat(FamilyRelationsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FamilyRelations>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FamilyRelations>(list);
				}
				else {
					list = (List<FamilyRelations>)QueryUtil.list(q,
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
	 * Removes all the family relationses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FamilyRelations familyRelations : findAll()) {
			remove(familyRelations);
		}
	}

	/**
	 * Returns the number of family relationses.
	 *
	 * @return the number of family relationses
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

				Query q = session.createQuery(_SQL_COUNT_FAMILYRELATIONS);

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
	 * Initializes the family relations persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.FamilyRelations")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FamilyRelations>> listenersList = new ArrayList<ModelListener<FamilyRelations>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FamilyRelations>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FamilyRelationsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FAMILYRELATIONS = "SELECT familyRelations FROM FamilyRelations familyRelations";
	private static final String _SQL_COUNT_FAMILYRELATIONS = "SELECT COUNT(familyRelations) FROM FamilyRelations familyRelations";
	private static final String _ORDER_BY_ENTITY_ALIAS = "familyRelations.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FamilyRelations exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FamilyRelationsPersistenceImpl.class);
	private static FamilyRelations _nullFamilyRelations = new FamilyRelationsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FamilyRelations> toCacheModel() {
				return _nullFamilyRelationsCacheModel;
			}
		};

	private static CacheModel<FamilyRelations> _nullFamilyRelationsCacheModel = new CacheModel<FamilyRelations>() {
			@Override
			public FamilyRelations toEntityModel() {
				return _nullFamilyRelations;
			}
		};
}