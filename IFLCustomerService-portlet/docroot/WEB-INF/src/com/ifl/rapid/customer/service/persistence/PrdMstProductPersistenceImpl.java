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

import com.ifl.rapid.customer.NoSuchPrdMstProductException;
import com.ifl.rapid.customer.model.PrdMstProduct;
import com.ifl.rapid.customer.model.impl.PrdMstProductImpl;
import com.ifl.rapid.customer.model.impl.PrdMstProductModelImpl;

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
 * The persistence implementation for the prd mst product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PrdMstProductPersistence
 * @see PrdMstProductUtil
 * @generated
 */
public class PrdMstProductPersistenceImpl extends BasePersistenceImpl<PrdMstProduct>
	implements PrdMstProductPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PrdMstProductUtil} to access the prd mst product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PrdMstProductImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
			PrdMstProductModelImpl.FINDER_CACHE_ENABLED,
			PrdMstProductImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
			PrdMstProductModelImpl.FINDER_CACHE_ENABLED,
			PrdMstProductImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
			PrdMstProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PrdMstProductPersistenceImpl() {
		setModelClass(PrdMstProduct.class);
	}

	/**
	 * Caches the prd mst product in the entity cache if it is enabled.
	 *
	 * @param prdMstProduct the prd mst product
	 */
	@Override
	public void cacheResult(PrdMstProduct prdMstProduct) {
		EntityCacheUtil.putResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
			PrdMstProductImpl.class, prdMstProduct.getPrimaryKey(),
			prdMstProduct);

		prdMstProduct.resetOriginalValues();
	}

	/**
	 * Caches the prd mst products in the entity cache if it is enabled.
	 *
	 * @param prdMstProducts the prd mst products
	 */
	@Override
	public void cacheResult(List<PrdMstProduct> prdMstProducts) {
		for (PrdMstProduct prdMstProduct : prdMstProducts) {
			if (EntityCacheUtil.getResult(
						PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
						PrdMstProductImpl.class, prdMstProduct.getPrimaryKey()) == null) {
				cacheResult(prdMstProduct);
			}
			else {
				prdMstProduct.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prd mst products.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PrdMstProductImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PrdMstProductImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prd mst product.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PrdMstProduct prdMstProduct) {
		EntityCacheUtil.removeResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
			PrdMstProductImpl.class, prdMstProduct.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PrdMstProduct> prdMstProducts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PrdMstProduct prdMstProduct : prdMstProducts) {
			EntityCacheUtil.removeResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
				PrdMstProductImpl.class, prdMstProduct.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prd mst product with the primary key. Does not add the prd mst product to the database.
	 *
	 * @param ProductId the primary key for the new prd mst product
	 * @return the new prd mst product
	 */
	@Override
	public PrdMstProduct create(String ProductId) {
		PrdMstProduct prdMstProduct = new PrdMstProductImpl();

		prdMstProduct.setNew(true);
		prdMstProduct.setPrimaryKey(ProductId);

		return prdMstProduct;
	}

	/**
	 * Removes the prd mst product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ProductId the primary key of the prd mst product
	 * @return the prd mst product that was removed
	 * @throws com.ifl.rapid.customer.NoSuchPrdMstProductException if a prd mst product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrdMstProduct remove(String ProductId)
		throws NoSuchPrdMstProductException, SystemException {
		return remove((Serializable)ProductId);
	}

	/**
	 * Removes the prd mst product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prd mst product
	 * @return the prd mst product that was removed
	 * @throws com.ifl.rapid.customer.NoSuchPrdMstProductException if a prd mst product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrdMstProduct remove(Serializable primaryKey)
		throws NoSuchPrdMstProductException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PrdMstProduct prdMstProduct = (PrdMstProduct)session.get(PrdMstProductImpl.class,
					primaryKey);

			if (prdMstProduct == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPrdMstProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prdMstProduct);
		}
		catch (NoSuchPrdMstProductException nsee) {
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
	protected PrdMstProduct removeImpl(PrdMstProduct prdMstProduct)
		throws SystemException {
		prdMstProduct = toUnwrappedModel(prdMstProduct);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prdMstProduct)) {
				prdMstProduct = (PrdMstProduct)session.get(PrdMstProductImpl.class,
						prdMstProduct.getPrimaryKeyObj());
			}

			if (prdMstProduct != null) {
				session.delete(prdMstProduct);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prdMstProduct != null) {
			clearCache(prdMstProduct);
		}

		return prdMstProduct;
	}

	@Override
	public PrdMstProduct updateImpl(
		com.ifl.rapid.customer.model.PrdMstProduct prdMstProduct)
		throws SystemException {
		prdMstProduct = toUnwrappedModel(prdMstProduct);

		boolean isNew = prdMstProduct.isNew();

		Session session = null;

		try {
			session = openSession();

			if (prdMstProduct.isNew()) {
				session.save(prdMstProduct);

				prdMstProduct.setNew(false);
			}
			else {
				session.merge(prdMstProduct);
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

		EntityCacheUtil.putResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
			PrdMstProductImpl.class, prdMstProduct.getPrimaryKey(),
			prdMstProduct);

		return prdMstProduct;
	}

	protected PrdMstProduct toUnwrappedModel(PrdMstProduct prdMstProduct) {
		if (prdMstProduct instanceof PrdMstProductImpl) {
			return prdMstProduct;
		}

		PrdMstProductImpl prdMstProductImpl = new PrdMstProductImpl();

		prdMstProductImpl.setNew(prdMstProduct.isNew());
		prdMstProductImpl.setPrimaryKey(prdMstProduct.getPrimaryKey());

		prdMstProductImpl.setProductId(prdMstProduct.getProductId());
		prdMstProductImpl.setProductKey(prdMstProduct.getProductKey());
		prdMstProductImpl.setDisplayOrder(prdMstProduct.getDisplayOrder());
		prdMstProductImpl.setRenewalDuration(prdMstProduct.getRenewalDuration());
		prdMstProductImpl.setShortTermDuration(prdMstProduct.getShortTermDuration());
		prdMstProductImpl.setMinPlanTerm(prdMstProduct.getMinPlanTerm());
		prdMstProductImpl.setMaxPlanTerm(prdMstProduct.getMaxPlanTerm());
		prdMstProductImpl.setMinSumAssured(prdMstProduct.getMinSumAssured());
		prdMstProductImpl.setMaxSumAssured(prdMstProduct.getMaxSumAssured());
		prdMstProductImpl.setIsRegularPremium(prdMstProduct.getIsRegularPremium());
		prdMstProductImpl.setIsLimitedPremium(prdMstProduct.getIsLimitedPremium());
		prdMstProductImpl.setIsSinglePremium(prdMstProduct.getIsSinglePremium());
		prdMstProductImpl.setIsActive(prdMstProduct.getIsActive());
		prdMstProductImpl.setCreatedBy(prdMstProduct.getCreatedBy());
		prdMstProductImpl.setCreatedDate(prdMstProduct.getCreatedDate());
		prdMstProductImpl.setModifiedDate(prdMstProduct.getModifiedDate());
		prdMstProductImpl.setModifiedBy(prdMstProduct.getModifiedBy());

		return prdMstProductImpl;
	}

	/**
	 * Returns the prd mst product with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prd mst product
	 * @return the prd mst product
	 * @throws com.ifl.rapid.customer.NoSuchPrdMstProductException if a prd mst product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrdMstProduct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPrdMstProductException, SystemException {
		PrdMstProduct prdMstProduct = fetchByPrimaryKey(primaryKey);

		if (prdMstProduct == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPrdMstProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prdMstProduct;
	}

	/**
	 * Returns the prd mst product with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchPrdMstProductException} if it could not be found.
	 *
	 * @param ProductId the primary key of the prd mst product
	 * @return the prd mst product
	 * @throws com.ifl.rapid.customer.NoSuchPrdMstProductException if a prd mst product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrdMstProduct findByPrimaryKey(String ProductId)
		throws NoSuchPrdMstProductException, SystemException {
		return findByPrimaryKey((Serializable)ProductId);
	}

	/**
	 * Returns the prd mst product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prd mst product
	 * @return the prd mst product, or <code>null</code> if a prd mst product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrdMstProduct fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PrdMstProduct prdMstProduct = (PrdMstProduct)EntityCacheUtil.getResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
				PrdMstProductImpl.class, primaryKey);

		if (prdMstProduct == _nullPrdMstProduct) {
			return null;
		}

		if (prdMstProduct == null) {
			Session session = null;

			try {
				session = openSession();

				prdMstProduct = (PrdMstProduct)session.get(PrdMstProductImpl.class,
						primaryKey);

				if (prdMstProduct != null) {
					cacheResult(prdMstProduct);
				}
				else {
					EntityCacheUtil.putResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
						PrdMstProductImpl.class, primaryKey, _nullPrdMstProduct);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PrdMstProductModelImpl.ENTITY_CACHE_ENABLED,
					PrdMstProductImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prdMstProduct;
	}

	/**
	 * Returns the prd mst product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ProductId the primary key of the prd mst product
	 * @return the prd mst product, or <code>null</code> if a prd mst product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PrdMstProduct fetchByPrimaryKey(String ProductId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ProductId);
	}

	/**
	 * Returns all the prd mst products.
	 *
	 * @return the prd mst products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrdMstProduct> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prd mst products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.PrdMstProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prd mst products
	 * @param end the upper bound of the range of prd mst products (not inclusive)
	 * @return the range of prd mst products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrdMstProduct> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prd mst products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.PrdMstProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prd mst products
	 * @param end the upper bound of the range of prd mst products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prd mst products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PrdMstProduct> findAll(int start, int end,
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

		List<PrdMstProduct> list = (List<PrdMstProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRDMSTPRODUCT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRDMSTPRODUCT;

				if (pagination) {
					sql = sql.concat(PrdMstProductModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PrdMstProduct>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PrdMstProduct>(list);
				}
				else {
					list = (List<PrdMstProduct>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the prd mst products from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PrdMstProduct prdMstProduct : findAll()) {
			remove(prdMstProduct);
		}
	}

	/**
	 * Returns the number of prd mst products.
	 *
	 * @return the number of prd mst products
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

				Query q = session.createQuery(_SQL_COUNT_PRDMSTPRODUCT);

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
	 * Initializes the prd mst product persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.PrdMstProduct")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PrdMstProduct>> listenersList = new ArrayList<ModelListener<PrdMstProduct>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PrdMstProduct>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PrdMstProductImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRDMSTPRODUCT = "SELECT prdMstProduct FROM PrdMstProduct prdMstProduct";
	private static final String _SQL_COUNT_PRDMSTPRODUCT = "SELECT COUNT(prdMstProduct) FROM PrdMstProduct prdMstProduct";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prdMstProduct.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PrdMstProduct exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PrdMstProductPersistenceImpl.class);
	private static PrdMstProduct _nullPrdMstProduct = new PrdMstProductImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PrdMstProduct> toCacheModel() {
				return _nullPrdMstProductCacheModel;
			}
		};

	private static CacheModel<PrdMstProduct> _nullPrdMstProductCacheModel = new CacheModel<PrdMstProduct>() {
			@Override
			public PrdMstProduct toEntityModel() {
				return _nullPrdMstProduct;
			}
		};
}