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

import com.ifli.rapid.NoSuchPaymentOptionTypesException;
import com.ifli.rapid.model.PaymentOptionTypes;
import com.ifli.rapid.model.impl.PaymentOptionTypesImpl;
import com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl;

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
 * The persistence implementation for the payment option types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentOptionTypesPersistence
 * @see PaymentOptionTypesUtil
 * @generated
 */
public class PaymentOptionTypesPersistenceImpl extends BasePersistenceImpl<PaymentOptionTypes>
	implements PaymentOptionTypesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentOptionTypesUtil} to access the payment option types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentOptionTypesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionTypesModelImpl.FINDER_CACHE_ENABLED,
			PaymentOptionTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionTypesModelImpl.FINDER_CACHE_ENABLED,
			PaymentOptionTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentOptionTypesPersistenceImpl() {
		setModelClass(PaymentOptionTypes.class);
	}

	/**
	 * Caches the payment option types in the entity cache if it is enabled.
	 *
	 * @param paymentOptionTypes the payment option types
	 */
	@Override
	public void cacheResult(PaymentOptionTypes paymentOptionTypes) {
		EntityCacheUtil.putResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionTypesImpl.class, paymentOptionTypes.getPrimaryKey(),
			paymentOptionTypes);

		paymentOptionTypes.resetOriginalValues();
	}

	/**
	 * Caches the payment option typeses in the entity cache if it is enabled.
	 *
	 * @param paymentOptionTypeses the payment option typeses
	 */
	@Override
	public void cacheResult(List<PaymentOptionTypes> paymentOptionTypeses) {
		for (PaymentOptionTypes paymentOptionTypes : paymentOptionTypeses) {
			if (EntityCacheUtil.getResult(
						PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
						PaymentOptionTypesImpl.class,
						paymentOptionTypes.getPrimaryKey()) == null) {
				cacheResult(paymentOptionTypes);
			}
			else {
				paymentOptionTypes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment option typeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentOptionTypesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentOptionTypesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment option types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentOptionTypes paymentOptionTypes) {
		EntityCacheUtil.removeResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionTypesImpl.class, paymentOptionTypes.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentOptionTypes> paymentOptionTypeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentOptionTypes paymentOptionTypes : paymentOptionTypeses) {
			EntityCacheUtil.removeResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
				PaymentOptionTypesImpl.class, paymentOptionTypes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment option types with the primary key. Does not add the payment option types to the database.
	 *
	 * @param PaymentOptionTypesId the primary key for the new payment option types
	 * @return the new payment option types
	 */
	@Override
	public PaymentOptionTypes create(String PaymentOptionTypesId) {
		PaymentOptionTypes paymentOptionTypes = new PaymentOptionTypesImpl();

		paymentOptionTypes.setNew(true);
		paymentOptionTypes.setPrimaryKey(PaymentOptionTypesId);

		return paymentOptionTypes;
	}

	/**
	 * Removes the payment option types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PaymentOptionTypesId the primary key of the payment option types
	 * @return the payment option types that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionTypes remove(String PaymentOptionTypesId)
		throws NoSuchPaymentOptionTypesException, SystemException {
		return remove((Serializable)PaymentOptionTypesId);
	}

	/**
	 * Removes the payment option types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment option types
	 * @return the payment option types that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionTypes remove(Serializable primaryKey)
		throws NoSuchPaymentOptionTypesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentOptionTypes paymentOptionTypes = (PaymentOptionTypes)session.get(PaymentOptionTypesImpl.class,
					primaryKey);

			if (paymentOptionTypes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentOptionTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentOptionTypes);
		}
		catch (NoSuchPaymentOptionTypesException nsee) {
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
	protected PaymentOptionTypes removeImpl(
		PaymentOptionTypes paymentOptionTypes) throws SystemException {
		paymentOptionTypes = toUnwrappedModel(paymentOptionTypes);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentOptionTypes)) {
				paymentOptionTypes = (PaymentOptionTypes)session.get(PaymentOptionTypesImpl.class,
						paymentOptionTypes.getPrimaryKeyObj());
			}

			if (paymentOptionTypes != null) {
				session.delete(paymentOptionTypes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentOptionTypes != null) {
			clearCache(paymentOptionTypes);
		}

		return paymentOptionTypes;
	}

	@Override
	public PaymentOptionTypes updateImpl(
		com.ifli.rapid.model.PaymentOptionTypes paymentOptionTypes)
		throws SystemException {
		paymentOptionTypes = toUnwrappedModel(paymentOptionTypes);

		boolean isNew = paymentOptionTypes.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentOptionTypes.isNew()) {
				session.save(paymentOptionTypes);

				paymentOptionTypes.setNew(false);
			}
			else {
				session.merge(paymentOptionTypes);
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

		EntityCacheUtil.putResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
			PaymentOptionTypesImpl.class, paymentOptionTypes.getPrimaryKey(),
			paymentOptionTypes);

		return paymentOptionTypes;
	}

	protected PaymentOptionTypes toUnwrappedModel(
		PaymentOptionTypes paymentOptionTypes) {
		if (paymentOptionTypes instanceof PaymentOptionTypesImpl) {
			return paymentOptionTypes;
		}

		PaymentOptionTypesImpl paymentOptionTypesImpl = new PaymentOptionTypesImpl();

		paymentOptionTypesImpl.setNew(paymentOptionTypes.isNew());
		paymentOptionTypesImpl.setPrimaryKey(paymentOptionTypes.getPrimaryKey());

		paymentOptionTypesImpl.setPaymentOptionTypesId(paymentOptionTypes.getPaymentOptionTypesId());
		paymentOptionTypesImpl.setPaymentOptionId(paymentOptionTypes.getPaymentOptionId());
		paymentOptionTypesImpl.setOptionTypesKey(paymentOptionTypes.getOptionTypesKey());
		paymentOptionTypesImpl.setIsActive(paymentOptionTypes.isIsActive());
		paymentOptionTypesImpl.setCreatedBy(paymentOptionTypes.getCreatedBy());
		paymentOptionTypesImpl.setCreatedDate(paymentOptionTypes.getCreatedDate());
		paymentOptionTypesImpl.setModifiedBy(paymentOptionTypes.getModifiedBy());
		paymentOptionTypesImpl.setModifiedDate(paymentOptionTypes.getModifiedDate());
		paymentOptionTypesImpl.setPriority(paymentOptionTypes.getPriority());
		paymentOptionTypesImpl.setPaymentOptionTypeDesc(paymentOptionTypes.getPaymentOptionTypeDesc());

		return paymentOptionTypesImpl;
	}

	/**
	 * Returns the payment option types with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment option types
	 * @return the payment option types
	 * @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionTypes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentOptionTypesException, SystemException {
		PaymentOptionTypes paymentOptionTypes = fetchByPrimaryKey(primaryKey);

		if (paymentOptionTypes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentOptionTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentOptionTypes;
	}

	/**
	 * Returns the payment option types with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentOptionTypesException} if it could not be found.
	 *
	 * @param PaymentOptionTypesId the primary key of the payment option types
	 * @return the payment option types
	 * @throws com.ifli.rapid.NoSuchPaymentOptionTypesException if a payment option types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionTypes findByPrimaryKey(String PaymentOptionTypesId)
		throws NoSuchPaymentOptionTypesException, SystemException {
		return findByPrimaryKey((Serializable)PaymentOptionTypesId);
	}

	/**
	 * Returns the payment option types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment option types
	 * @return the payment option types, or <code>null</code> if a payment option types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionTypes fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentOptionTypes paymentOptionTypes = (PaymentOptionTypes)EntityCacheUtil.getResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
				PaymentOptionTypesImpl.class, primaryKey);

		if (paymentOptionTypes == _nullPaymentOptionTypes) {
			return null;
		}

		if (paymentOptionTypes == null) {
			Session session = null;

			try {
				session = openSession();

				paymentOptionTypes = (PaymentOptionTypes)session.get(PaymentOptionTypesImpl.class,
						primaryKey);

				if (paymentOptionTypes != null) {
					cacheResult(paymentOptionTypes);
				}
				else {
					EntityCacheUtil.putResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
						PaymentOptionTypesImpl.class, primaryKey,
						_nullPaymentOptionTypes);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentOptionTypesModelImpl.ENTITY_CACHE_ENABLED,
					PaymentOptionTypesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentOptionTypes;
	}

	/**
	 * Returns the payment option types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PaymentOptionTypesId the primary key of the payment option types
	 * @return the payment option types, or <code>null</code> if a payment option types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentOptionTypes fetchByPrimaryKey(String PaymentOptionTypesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PaymentOptionTypesId);
	}

	/**
	 * Returns all the payment option typeses.
	 *
	 * @return the payment option typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentOptionTypes> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment option typeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment option typeses
	 * @param end the upper bound of the range of payment option typeses (not inclusive)
	 * @return the range of payment option typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentOptionTypes> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment option typeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentOptionTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment option typeses
	 * @param end the upper bound of the range of payment option typeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment option typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentOptionTypes> findAll(int start, int end,
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

		List<PaymentOptionTypes> list = (List<PaymentOptionTypes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTOPTIONTYPES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTOPTIONTYPES;

				if (pagination) {
					sql = sql.concat(PaymentOptionTypesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentOptionTypes>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentOptionTypes>(list);
				}
				else {
					list = (List<PaymentOptionTypes>)QueryUtil.list(q,
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
	 * Removes all the payment option typeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentOptionTypes paymentOptionTypes : findAll()) {
			remove(paymentOptionTypes);
		}
	}

	/**
	 * Returns the number of payment option typeses.
	 *
	 * @return the number of payment option typeses
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTOPTIONTYPES);

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
	 * Initializes the payment option types persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentOptionTypes")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentOptionTypes>> listenersList = new ArrayList<ModelListener<PaymentOptionTypes>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentOptionTypes>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentOptionTypesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTOPTIONTYPES = "SELECT paymentOptionTypes FROM PaymentOptionTypes paymentOptionTypes";
	private static final String _SQL_COUNT_PAYMENTOPTIONTYPES = "SELECT COUNT(paymentOptionTypes) FROM PaymentOptionTypes paymentOptionTypes";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentOptionTypes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentOptionTypes exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentOptionTypesPersistenceImpl.class);
	private static PaymentOptionTypes _nullPaymentOptionTypes = new PaymentOptionTypesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentOptionTypes> toCacheModel() {
				return _nullPaymentOptionTypesCacheModel;
			}
		};

	private static CacheModel<PaymentOptionTypes> _nullPaymentOptionTypesCacheModel =
		new CacheModel<PaymentOptionTypes>() {
			@Override
			public PaymentOptionTypes toEntityModel() {
				return _nullPaymentOptionTypes;
			}
		};
}