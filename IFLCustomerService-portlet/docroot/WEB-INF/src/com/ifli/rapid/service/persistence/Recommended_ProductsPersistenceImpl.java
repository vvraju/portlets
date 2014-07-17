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

import com.ifli.rapid.NoSuchRecommended_ProductsException;
import com.ifli.rapid.model.Recommended_Products;
import com.ifli.rapid.model.impl.Recommended_ProductsImpl;
import com.ifli.rapid.model.impl.Recommended_ProductsModelImpl;

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
 * The persistence implementation for the recommended_ products service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see Recommended_ProductsPersistence
 * @see Recommended_ProductsUtil
 * @generated
 */
public class Recommended_ProductsPersistenceImpl extends BasePersistenceImpl<Recommended_Products>
	implements Recommended_ProductsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Recommended_ProductsUtil} to access the recommended_ products persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Recommended_ProductsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
			Recommended_ProductsModelImpl.FINDER_CACHE_ENABLED,
			Recommended_ProductsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
			Recommended_ProductsModelImpl.FINDER_CACHE_ENABLED,
			Recommended_ProductsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
			Recommended_ProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public Recommended_ProductsPersistenceImpl() {
		setModelClass(Recommended_Products.class);
	}

	/**
	 * Caches the recommended_ products in the entity cache if it is enabled.
	 *
	 * @param recommended_Products the recommended_ products
	 */
	@Override
	public void cacheResult(Recommended_Products recommended_Products) {
		EntityCacheUtil.putResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
			Recommended_ProductsImpl.class,
			recommended_Products.getPrimaryKey(), recommended_Products);

		recommended_Products.resetOriginalValues();
	}

	/**
	 * Caches the recommended_ productses in the entity cache if it is enabled.
	 *
	 * @param recommended_Productses the recommended_ productses
	 */
	@Override
	public void cacheResult(List<Recommended_Products> recommended_Productses) {
		for (Recommended_Products recommended_Products : recommended_Productses) {
			if (EntityCacheUtil.getResult(
						Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
						Recommended_ProductsImpl.class,
						recommended_Products.getPrimaryKey()) == null) {
				cacheResult(recommended_Products);
			}
			else {
				recommended_Products.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all recommended_ productses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Recommended_ProductsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Recommended_ProductsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the recommended_ products.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Recommended_Products recommended_Products) {
		EntityCacheUtil.removeResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
			Recommended_ProductsImpl.class, recommended_Products.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Recommended_Products> recommended_Productses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Recommended_Products recommended_Products : recommended_Productses) {
			EntityCacheUtil.removeResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
				Recommended_ProductsImpl.class,
				recommended_Products.getPrimaryKey());
		}
	}

	/**
	 * Creates a new recommended_ products with the primary key. Does not add the recommended_ products to the database.
	 *
	 * @param PRODUCT_ID the primary key for the new recommended_ products
	 * @return the new recommended_ products
	 */
	@Override
	public Recommended_Products create(int PRODUCT_ID) {
		Recommended_Products recommended_Products = new Recommended_ProductsImpl();

		recommended_Products.setNew(true);
		recommended_Products.setPrimaryKey(PRODUCT_ID);

		return recommended_Products;
	}

	/**
	 * Removes the recommended_ products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PRODUCT_ID the primary key of the recommended_ products
	 * @return the recommended_ products that was removed
	 * @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Recommended_Products remove(int PRODUCT_ID)
		throws NoSuchRecommended_ProductsException, SystemException {
		return remove((Serializable)PRODUCT_ID);
	}

	/**
	 * Removes the recommended_ products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the recommended_ products
	 * @return the recommended_ products that was removed
	 * @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Recommended_Products remove(Serializable primaryKey)
		throws NoSuchRecommended_ProductsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Recommended_Products recommended_Products = (Recommended_Products)session.get(Recommended_ProductsImpl.class,
					primaryKey);

			if (recommended_Products == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRecommended_ProductsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(recommended_Products);
		}
		catch (NoSuchRecommended_ProductsException nsee) {
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
	protected Recommended_Products removeImpl(
		Recommended_Products recommended_Products) throws SystemException {
		recommended_Products = toUnwrappedModel(recommended_Products);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(recommended_Products)) {
				recommended_Products = (Recommended_Products)session.get(Recommended_ProductsImpl.class,
						recommended_Products.getPrimaryKeyObj());
			}

			if (recommended_Products != null) {
				session.delete(recommended_Products);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (recommended_Products != null) {
			clearCache(recommended_Products);
		}

		return recommended_Products;
	}

	@Override
	public Recommended_Products updateImpl(
		com.ifli.rapid.model.Recommended_Products recommended_Products)
		throws SystemException {
		recommended_Products = toUnwrappedModel(recommended_Products);

		boolean isNew = recommended_Products.isNew();

		Session session = null;

		try {
			session = openSession();

			if (recommended_Products.isNew()) {
				session.save(recommended_Products);

				recommended_Products.setNew(false);
			}
			else {
				session.merge(recommended_Products);
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

		EntityCacheUtil.putResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
			Recommended_ProductsImpl.class,
			recommended_Products.getPrimaryKey(), recommended_Products);

		return recommended_Products;
	}

	protected Recommended_Products toUnwrappedModel(
		Recommended_Products recommended_Products) {
		if (recommended_Products instanceof Recommended_ProductsImpl) {
			return recommended_Products;
		}

		Recommended_ProductsImpl recommended_ProductsImpl = new Recommended_ProductsImpl();

		recommended_ProductsImpl.setNew(recommended_Products.isNew());
		recommended_ProductsImpl.setPrimaryKey(recommended_Products.getPrimaryKey());

		recommended_ProductsImpl.setPRODUCT_ID(recommended_Products.getPRODUCT_ID());
		recommended_ProductsImpl.setPRODUCT_NAME(recommended_Products.getPRODUCT_NAME());
		recommended_ProductsImpl.setIMG_URL(recommended_Products.getIMG_URL());

		return recommended_ProductsImpl;
	}

	/**
	 * Returns the recommended_ products with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the recommended_ products
	 * @return the recommended_ products
	 * @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Recommended_Products findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRecommended_ProductsException, SystemException {
		Recommended_Products recommended_Products = fetchByPrimaryKey(primaryKey);

		if (recommended_Products == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRecommended_ProductsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return recommended_Products;
	}

	/**
	 * Returns the recommended_ products with the primary key or throws a {@link com.ifli.rapid.NoSuchRecommended_ProductsException} if it could not be found.
	 *
	 * @param PRODUCT_ID the primary key of the recommended_ products
	 * @return the recommended_ products
	 * @throws com.ifli.rapid.NoSuchRecommended_ProductsException if a recommended_ products with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Recommended_Products findByPrimaryKey(int PRODUCT_ID)
		throws NoSuchRecommended_ProductsException, SystemException {
		return findByPrimaryKey((Serializable)PRODUCT_ID);
	}

	/**
	 * Returns the recommended_ products with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the recommended_ products
	 * @return the recommended_ products, or <code>null</code> if a recommended_ products with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Recommended_Products fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Recommended_Products recommended_Products = (Recommended_Products)EntityCacheUtil.getResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
				Recommended_ProductsImpl.class, primaryKey);

		if (recommended_Products == _nullRecommended_Products) {
			return null;
		}

		if (recommended_Products == null) {
			Session session = null;

			try {
				session = openSession();

				recommended_Products = (Recommended_Products)session.get(Recommended_ProductsImpl.class,
						primaryKey);

				if (recommended_Products != null) {
					cacheResult(recommended_Products);
				}
				else {
					EntityCacheUtil.putResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
						Recommended_ProductsImpl.class, primaryKey,
						_nullRecommended_Products);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Recommended_ProductsModelImpl.ENTITY_CACHE_ENABLED,
					Recommended_ProductsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return recommended_Products;
	}

	/**
	 * Returns the recommended_ products with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PRODUCT_ID the primary key of the recommended_ products
	 * @return the recommended_ products, or <code>null</code> if a recommended_ products with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Recommended_Products fetchByPrimaryKey(int PRODUCT_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PRODUCT_ID);
	}

	/**
	 * Returns all the recommended_ productses.
	 *
	 * @return the recommended_ productses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Recommended_Products> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the recommended_ productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of recommended_ productses
	 * @param end the upper bound of the range of recommended_ productses (not inclusive)
	 * @return the range of recommended_ productses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Recommended_Products> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the recommended_ productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.Recommended_ProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of recommended_ productses
	 * @param end the upper bound of the range of recommended_ productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of recommended_ productses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Recommended_Products> findAll(int start, int end,
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

		List<Recommended_Products> list = (List<Recommended_Products>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RECOMMENDED_PRODUCTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RECOMMENDED_PRODUCTS;

				if (pagination) {
					sql = sql.concat(Recommended_ProductsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Recommended_Products>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Recommended_Products>(list);
				}
				else {
					list = (List<Recommended_Products>)QueryUtil.list(q,
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
	 * Removes all the recommended_ productses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Recommended_Products recommended_Products : findAll()) {
			remove(recommended_Products);
		}
	}

	/**
	 * Returns the number of recommended_ productses.
	 *
	 * @return the number of recommended_ productses
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

				Query q = session.createQuery(_SQL_COUNT_RECOMMENDED_PRODUCTS);

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
	 * Initializes the recommended_ products persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.Recommended_Products")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Recommended_Products>> listenersList = new ArrayList<ModelListener<Recommended_Products>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Recommended_Products>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Recommended_ProductsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RECOMMENDED_PRODUCTS = "SELECT recommended_Products FROM Recommended_Products recommended_Products";
	private static final String _SQL_COUNT_RECOMMENDED_PRODUCTS = "SELECT COUNT(recommended_Products) FROM Recommended_Products recommended_Products";
	private static final String _ORDER_BY_ENTITY_ALIAS = "recommended_Products.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Recommended_Products exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Recommended_ProductsPersistenceImpl.class);
	private static Recommended_Products _nullRecommended_Products = new Recommended_ProductsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Recommended_Products> toCacheModel() {
				return _nullRecommended_ProductsCacheModel;
			}
		};

	private static CacheModel<Recommended_Products> _nullRecommended_ProductsCacheModel =
		new CacheModel<Recommended_Products>() {
			@Override
			public Recommended_Products toEntityModel() {
				return _nullRecommended_Products;
			}
		};
}