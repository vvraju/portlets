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

import com.ifli.rapid.NoSuchProductFundMappingException;
import com.ifli.rapid.model.ProductFundMapping;
import com.ifli.rapid.model.impl.ProductFundMappingImpl;
import com.ifli.rapid.model.impl.ProductFundMappingModelImpl;

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
 * The persistence implementation for the product fund mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ProductFundMappingPersistence
 * @see ProductFundMappingUtil
 * @generated
 */
public class ProductFundMappingPersistenceImpl extends BasePersistenceImpl<ProductFundMapping>
	implements ProductFundMappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProductFundMappingUtil} to access the product fund mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProductFundMappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
			ProductFundMappingModelImpl.FINDER_CACHE_ENABLED,
			ProductFundMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
			ProductFundMappingModelImpl.FINDER_CACHE_ENABLED,
			ProductFundMappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
			ProductFundMappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ProductFundMappingPersistenceImpl() {
		setModelClass(ProductFundMapping.class);
	}

	/**
	 * Caches the product fund mapping in the entity cache if it is enabled.
	 *
	 * @param productFundMapping the product fund mapping
	 */
	@Override
	public void cacheResult(ProductFundMapping productFundMapping) {
		EntityCacheUtil.putResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
			ProductFundMappingImpl.class, productFundMapping.getPrimaryKey(),
			productFundMapping);

		productFundMapping.resetOriginalValues();
	}

	/**
	 * Caches the product fund mappings in the entity cache if it is enabled.
	 *
	 * @param productFundMappings the product fund mappings
	 */
	@Override
	public void cacheResult(List<ProductFundMapping> productFundMappings) {
		for (ProductFundMapping productFundMapping : productFundMappings) {
			if (EntityCacheUtil.getResult(
						ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
						ProductFundMappingImpl.class,
						productFundMapping.getPrimaryKey()) == null) {
				cacheResult(productFundMapping);
			}
			else {
				productFundMapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all product fund mappings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProductFundMappingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProductFundMappingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the product fund mapping.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProductFundMapping productFundMapping) {
		EntityCacheUtil.removeResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
			ProductFundMappingImpl.class, productFundMapping.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ProductFundMapping> productFundMappings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProductFundMapping productFundMapping : productFundMappings) {
			EntityCacheUtil.removeResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
				ProductFundMappingImpl.class, productFundMapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new product fund mapping with the primary key. Does not add the product fund mapping to the database.
	 *
	 * @param ID the primary key for the new product fund mapping
	 * @return the new product fund mapping
	 */
	@Override
	public ProductFundMapping create(int ID) {
		ProductFundMapping productFundMapping = new ProductFundMappingImpl();

		productFundMapping.setNew(true);
		productFundMapping.setPrimaryKey(ID);

		return productFundMapping;
	}

	/**
	 * Removes the product fund mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the product fund mapping
	 * @return the product fund mapping that was removed
	 * @throws com.ifli.rapid.NoSuchProductFundMappingException if a product fund mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductFundMapping remove(int ID)
		throws NoSuchProductFundMappingException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the product fund mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the product fund mapping
	 * @return the product fund mapping that was removed
	 * @throws com.ifli.rapid.NoSuchProductFundMappingException if a product fund mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductFundMapping remove(Serializable primaryKey)
		throws NoSuchProductFundMappingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProductFundMapping productFundMapping = (ProductFundMapping)session.get(ProductFundMappingImpl.class,
					primaryKey);

			if (productFundMapping == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductFundMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(productFundMapping);
		}
		catch (NoSuchProductFundMappingException nsee) {
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
	protected ProductFundMapping removeImpl(
		ProductFundMapping productFundMapping) throws SystemException {
		productFundMapping = toUnwrappedModel(productFundMapping);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(productFundMapping)) {
				productFundMapping = (ProductFundMapping)session.get(ProductFundMappingImpl.class,
						productFundMapping.getPrimaryKeyObj());
			}

			if (productFundMapping != null) {
				session.delete(productFundMapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (productFundMapping != null) {
			clearCache(productFundMapping);
		}

		return productFundMapping;
	}

	@Override
	public ProductFundMapping updateImpl(
		com.ifli.rapid.model.ProductFundMapping productFundMapping)
		throws SystemException {
		productFundMapping = toUnwrappedModel(productFundMapping);

		boolean isNew = productFundMapping.isNew();

		Session session = null;

		try {
			session = openSession();

			if (productFundMapping.isNew()) {
				session.save(productFundMapping);

				productFundMapping.setNew(false);
			}
			else {
				session.merge(productFundMapping);
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

		EntityCacheUtil.putResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
			ProductFundMappingImpl.class, productFundMapping.getPrimaryKey(),
			productFundMapping);

		return productFundMapping;
	}

	protected ProductFundMapping toUnwrappedModel(
		ProductFundMapping productFundMapping) {
		if (productFundMapping instanceof ProductFundMappingImpl) {
			return productFundMapping;
		}

		ProductFundMappingImpl productFundMappingImpl = new ProductFundMappingImpl();

		productFundMappingImpl.setNew(productFundMapping.isNew());
		productFundMappingImpl.setPrimaryKey(productFundMapping.getPrimaryKey());

		productFundMappingImpl.setID(productFundMapping.getID());
		productFundMappingImpl.setPRODUCT_CODE(productFundMapping.getPRODUCT_CODE());
		productFundMappingImpl.setFUND_CODE(productFundMapping.getFUND_CODE());

		return productFundMappingImpl;
	}

	/**
	 * Returns the product fund mapping with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the product fund mapping
	 * @return the product fund mapping
	 * @throws com.ifli.rapid.NoSuchProductFundMappingException if a product fund mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductFundMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductFundMappingException, SystemException {
		ProductFundMapping productFundMapping = fetchByPrimaryKey(primaryKey);

		if (productFundMapping == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductFundMappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return productFundMapping;
	}

	/**
	 * Returns the product fund mapping with the primary key or throws a {@link com.ifli.rapid.NoSuchProductFundMappingException} if it could not be found.
	 *
	 * @param ID the primary key of the product fund mapping
	 * @return the product fund mapping
	 * @throws com.ifli.rapid.NoSuchProductFundMappingException if a product fund mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductFundMapping findByPrimaryKey(int ID)
		throws NoSuchProductFundMappingException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the product fund mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the product fund mapping
	 * @return the product fund mapping, or <code>null</code> if a product fund mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductFundMapping fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProductFundMapping productFundMapping = (ProductFundMapping)EntityCacheUtil.getResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
				ProductFundMappingImpl.class, primaryKey);

		if (productFundMapping == _nullProductFundMapping) {
			return null;
		}

		if (productFundMapping == null) {
			Session session = null;

			try {
				session = openSession();

				productFundMapping = (ProductFundMapping)session.get(ProductFundMappingImpl.class,
						primaryKey);

				if (productFundMapping != null) {
					cacheResult(productFundMapping);
				}
				else {
					EntityCacheUtil.putResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
						ProductFundMappingImpl.class, primaryKey,
						_nullProductFundMapping);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProductFundMappingModelImpl.ENTITY_CACHE_ENABLED,
					ProductFundMappingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return productFundMapping;
	}

	/**
	 * Returns the product fund mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the product fund mapping
	 * @return the product fund mapping, or <code>null</code> if a product fund mapping with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductFundMapping fetchByPrimaryKey(int ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the product fund mappings.
	 *
	 * @return the product fund mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductFundMapping> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the product fund mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProductFundMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of product fund mappings
	 * @param end the upper bound of the range of product fund mappings (not inclusive)
	 * @return the range of product fund mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductFundMapping> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the product fund mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.ProductFundMappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of product fund mappings
	 * @param end the upper bound of the range of product fund mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of product fund mappings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductFundMapping> findAll(int start, int end,
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

		List<ProductFundMapping> list = (List<ProductFundMapping>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRODUCTFUNDMAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTFUNDMAPPING;

				if (pagination) {
					sql = sql.concat(ProductFundMappingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProductFundMapping>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductFundMapping>(list);
				}
				else {
					list = (List<ProductFundMapping>)QueryUtil.list(q,
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
	 * Removes all the product fund mappings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProductFundMapping productFundMapping : findAll()) {
			remove(productFundMapping);
		}
	}

	/**
	 * Returns the number of product fund mappings.
	 *
	 * @return the number of product fund mappings
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

				Query q = session.createQuery(_SQL_COUNT_PRODUCTFUNDMAPPING);

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
	 * Initializes the product fund mapping persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.ProductFundMapping")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProductFundMapping>> listenersList = new ArrayList<ModelListener<ProductFundMapping>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProductFundMapping>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProductFundMappingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRODUCTFUNDMAPPING = "SELECT productFundMapping FROM ProductFundMapping productFundMapping";
	private static final String _SQL_COUNT_PRODUCTFUNDMAPPING = "SELECT COUNT(productFundMapping) FROM ProductFundMapping productFundMapping";
	private static final String _ORDER_BY_ENTITY_ALIAS = "productFundMapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProductFundMapping exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProductFundMappingPersistenceImpl.class);
	private static ProductFundMapping _nullProductFundMapping = new ProductFundMappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProductFundMapping> toCacheModel() {
				return _nullProductFundMappingCacheModel;
			}
		};

	private static CacheModel<ProductFundMapping> _nullProductFundMappingCacheModel =
		new CacheModel<ProductFundMapping>() {
			@Override
			public ProductFundMapping toEntityModel() {
				return _nullProductFundMapping;
			}
		};
}