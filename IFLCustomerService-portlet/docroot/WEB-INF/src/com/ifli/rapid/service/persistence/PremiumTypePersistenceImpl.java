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

import com.ifli.rapid.NoSuchPremiumTypeException;
import com.ifli.rapid.model.PremiumType;
import com.ifli.rapid.model.impl.PremiumTypeImpl;
import com.ifli.rapid.model.impl.PremiumTypeModelImpl;

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
 * The persistence implementation for the premium type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PremiumTypePersistence
 * @see PremiumTypeUtil
 * @generated
 */
public class PremiumTypePersistenceImpl extends BasePersistenceImpl<PremiumType>
	implements PremiumTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PremiumTypeUtil} to access the premium type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PremiumTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
			PremiumTypeModelImpl.FINDER_CACHE_ENABLED, PremiumTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
			PremiumTypeModelImpl.FINDER_CACHE_ENABLED, PremiumTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
			PremiumTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PremiumTypePersistenceImpl() {
		setModelClass(PremiumType.class);
	}

	/**
	 * Caches the premium type in the entity cache if it is enabled.
	 *
	 * @param premiumType the premium type
	 */
	@Override
	public void cacheResult(PremiumType premiumType) {
		EntityCacheUtil.putResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
			PremiumTypeImpl.class, premiumType.getPrimaryKey(), premiumType);

		premiumType.resetOriginalValues();
	}

	/**
	 * Caches the premium types in the entity cache if it is enabled.
	 *
	 * @param premiumTypes the premium types
	 */
	@Override
	public void cacheResult(List<PremiumType> premiumTypes) {
		for (PremiumType premiumType : premiumTypes) {
			if (EntityCacheUtil.getResult(
						PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
						PremiumTypeImpl.class, premiumType.getPrimaryKey()) == null) {
				cacheResult(premiumType);
			}
			else {
				premiumType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all premium types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PremiumTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PremiumTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the premium type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PremiumType premiumType) {
		EntityCacheUtil.removeResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
			PremiumTypeImpl.class, premiumType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PremiumType> premiumTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PremiumType premiumType : premiumTypes) {
			EntityCacheUtil.removeResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
				PremiumTypeImpl.class, premiumType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new premium type with the primary key. Does not add the premium type to the database.
	 *
	 * @param Id the primary key for the new premium type
	 * @return the new premium type
	 */
	@Override
	public PremiumType create(String Id) {
		PremiumType premiumType = new PremiumTypeImpl();

		premiumType.setNew(true);
		premiumType.setPrimaryKey(Id);

		return premiumType;
	}

	/**
	 * Removes the premium type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the premium type
	 * @return the premium type that was removed
	 * @throws com.ifli.rapid.NoSuchPremiumTypeException if a premium type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumType remove(String Id)
		throws NoSuchPremiumTypeException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the premium type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the premium type
	 * @return the premium type that was removed
	 * @throws com.ifli.rapid.NoSuchPremiumTypeException if a premium type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumType remove(Serializable primaryKey)
		throws NoSuchPremiumTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PremiumType premiumType = (PremiumType)session.get(PremiumTypeImpl.class,
					primaryKey);

			if (premiumType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPremiumTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(premiumType);
		}
		catch (NoSuchPremiumTypeException nsee) {
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
	protected PremiumType removeImpl(PremiumType premiumType)
		throws SystemException {
		premiumType = toUnwrappedModel(premiumType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(premiumType)) {
				premiumType = (PremiumType)session.get(PremiumTypeImpl.class,
						premiumType.getPrimaryKeyObj());
			}

			if (premiumType != null) {
				session.delete(premiumType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (premiumType != null) {
			clearCache(premiumType);
		}

		return premiumType;
	}

	@Override
	public PremiumType updateImpl(com.ifli.rapid.model.PremiumType premiumType)
		throws SystemException {
		premiumType = toUnwrappedModel(premiumType);

		boolean isNew = premiumType.isNew();

		Session session = null;

		try {
			session = openSession();

			if (premiumType.isNew()) {
				session.save(premiumType);

				premiumType.setNew(false);
			}
			else {
				session.merge(premiumType);
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

		EntityCacheUtil.putResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
			PremiumTypeImpl.class, premiumType.getPrimaryKey(), premiumType);

		return premiumType;
	}

	protected PremiumType toUnwrappedModel(PremiumType premiumType) {
		if (premiumType instanceof PremiumTypeImpl) {
			return premiumType;
		}

		PremiumTypeImpl premiumTypeImpl = new PremiumTypeImpl();

		premiumTypeImpl.setNew(premiumType.isNew());
		premiumTypeImpl.setPrimaryKey(premiumType.getPrimaryKey());

		premiumTypeImpl.setId(premiumType.getId());
		premiumTypeImpl.setName(premiumType.getName());
		premiumTypeImpl.setActive(premiumType.isActive());
		premiumTypeImpl.setCreatedBy(premiumType.getCreatedBy());
		premiumTypeImpl.setCreatedDate(premiumType.getCreatedDate());
		premiumTypeImpl.setModifiedBy(premiumType.getModifiedBy());
		premiumTypeImpl.setModifiedDate(premiumType.getModifiedDate());
		premiumTypeImpl.setPriority(premiumType.getPriority());

		return premiumTypeImpl;
	}

	/**
	 * Returns the premium type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the premium type
	 * @return the premium type
	 * @throws com.ifli.rapid.NoSuchPremiumTypeException if a premium type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPremiumTypeException, SystemException {
		PremiumType premiumType = fetchByPrimaryKey(primaryKey);

		if (premiumType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPremiumTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return premiumType;
	}

	/**
	 * Returns the premium type with the primary key or throws a {@link com.ifli.rapid.NoSuchPremiumTypeException} if it could not be found.
	 *
	 * @param Id the primary key of the premium type
	 * @return the premium type
	 * @throws com.ifli.rapid.NoSuchPremiumTypeException if a premium type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumType findByPrimaryKey(String Id)
		throws NoSuchPremiumTypeException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the premium type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the premium type
	 * @return the premium type, or <code>null</code> if a premium type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PremiumType premiumType = (PremiumType)EntityCacheUtil.getResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
				PremiumTypeImpl.class, primaryKey);

		if (premiumType == _nullPremiumType) {
			return null;
		}

		if (premiumType == null) {
			Session session = null;

			try {
				session = openSession();

				premiumType = (PremiumType)session.get(PremiumTypeImpl.class,
						primaryKey);

				if (premiumType != null) {
					cacheResult(premiumType);
				}
				else {
					EntityCacheUtil.putResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
						PremiumTypeImpl.class, primaryKey, _nullPremiumType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PremiumTypeModelImpl.ENTITY_CACHE_ENABLED,
					PremiumTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return premiumType;
	}

	/**
	 * Returns the premium type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the premium type
	 * @return the premium type, or <code>null</code> if a premium type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PremiumType fetchByPrimaryKey(String Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the premium types.
	 *
	 * @return the premium types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PremiumType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the premium types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of premium types
	 * @param end the upper bound of the range of premium types (not inclusive)
	 * @return the range of premium types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PremiumType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the premium types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PremiumTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of premium types
	 * @param end the upper bound of the range of premium types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of premium types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PremiumType> findAll(int start, int end,
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

		List<PremiumType> list = (List<PremiumType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREMIUMTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREMIUMTYPE;

				if (pagination) {
					sql = sql.concat(PremiumTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PremiumType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PremiumType>(list);
				}
				else {
					list = (List<PremiumType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the premium types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PremiumType premiumType : findAll()) {
			remove(premiumType);
		}
	}

	/**
	 * Returns the number of premium types.
	 *
	 * @return the number of premium types
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

				Query q = session.createQuery(_SQL_COUNT_PREMIUMTYPE);

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
	 * Initializes the premium type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PremiumType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PremiumType>> listenersList = new ArrayList<ModelListener<PremiumType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PremiumType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PremiumTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PREMIUMTYPE = "SELECT premiumType FROM PremiumType premiumType";
	private static final String _SQL_COUNT_PREMIUMTYPE = "SELECT COUNT(premiumType) FROM PremiumType premiumType";
	private static final String _ORDER_BY_ENTITY_ALIAS = "premiumType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PremiumType exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PremiumTypePersistenceImpl.class);
	private static PremiumType _nullPremiumType = new PremiumTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PremiumType> toCacheModel() {
				return _nullPremiumTypeCacheModel;
			}
		};

	private static CacheModel<PremiumType> _nullPremiumTypeCacheModel = new CacheModel<PremiumType>() {
			@Override
			public PremiumType toEntityModel() {
				return _nullPremiumType;
			}
		};
}