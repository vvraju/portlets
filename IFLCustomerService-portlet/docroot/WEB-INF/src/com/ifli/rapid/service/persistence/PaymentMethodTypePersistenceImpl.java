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

import com.ifli.rapid.NoSuchPaymentMethodTypeException;
import com.ifli.rapid.model.PaymentMethodType;
import com.ifli.rapid.model.impl.PaymentMethodTypeImpl;
import com.ifli.rapid.model.impl.PaymentMethodTypeModelImpl;

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
 * The persistence implementation for the payment method type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodTypePersistence
 * @see PaymentMethodTypeUtil
 * @generated
 */
public class PaymentMethodTypePersistenceImpl extends BasePersistenceImpl<PaymentMethodType>
	implements PaymentMethodTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentMethodTypeUtil} to access the payment method type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentMethodTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodTypeModelImpl.FINDER_CACHE_ENABLED,
			PaymentMethodTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodTypeModelImpl.FINDER_CACHE_ENABLED,
			PaymentMethodTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentMethodTypePersistenceImpl() {
		setModelClass(PaymentMethodType.class);
	}

	/**
	 * Caches the payment method type in the entity cache if it is enabled.
	 *
	 * @param paymentMethodType the payment method type
	 */
	@Override
	public void cacheResult(PaymentMethodType paymentMethodType) {
		EntityCacheUtil.putResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodTypeImpl.class, paymentMethodType.getPrimaryKey(),
			paymentMethodType);

		paymentMethodType.resetOriginalValues();
	}

	/**
	 * Caches the payment method types in the entity cache if it is enabled.
	 *
	 * @param paymentMethodTypes the payment method types
	 */
	@Override
	public void cacheResult(List<PaymentMethodType> paymentMethodTypes) {
		for (PaymentMethodType paymentMethodType : paymentMethodTypes) {
			if (EntityCacheUtil.getResult(
						PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
						PaymentMethodTypeImpl.class,
						paymentMethodType.getPrimaryKey()) == null) {
				cacheResult(paymentMethodType);
			}
			else {
				paymentMethodType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment method types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentMethodTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentMethodTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment method type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentMethodType paymentMethodType) {
		EntityCacheUtil.removeResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodTypeImpl.class, paymentMethodType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentMethodType> paymentMethodTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentMethodType paymentMethodType : paymentMethodTypes) {
			EntityCacheUtil.removeResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
				PaymentMethodTypeImpl.class, paymentMethodType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment method type with the primary key. Does not add the payment method type to the database.
	 *
	 * @param Id the primary key for the new payment method type
	 * @return the new payment method type
	 */
	@Override
	public PaymentMethodType create(String Id) {
		PaymentMethodType paymentMethodType = new PaymentMethodTypeImpl();

		paymentMethodType.setNew(true);
		paymentMethodType.setPrimaryKey(Id);

		return paymentMethodType;
	}

	/**
	 * Removes the payment method type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the payment method type
	 * @return the payment method type that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentMethodTypeException if a payment method type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodType remove(String Id)
		throws NoSuchPaymentMethodTypeException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the payment method type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment method type
	 * @return the payment method type that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentMethodTypeException if a payment method type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodType remove(Serializable primaryKey)
		throws NoSuchPaymentMethodTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentMethodType paymentMethodType = (PaymentMethodType)session.get(PaymentMethodTypeImpl.class,
					primaryKey);

			if (paymentMethodType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentMethodTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentMethodType);
		}
		catch (NoSuchPaymentMethodTypeException nsee) {
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
	protected PaymentMethodType removeImpl(PaymentMethodType paymentMethodType)
		throws SystemException {
		paymentMethodType = toUnwrappedModel(paymentMethodType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentMethodType)) {
				paymentMethodType = (PaymentMethodType)session.get(PaymentMethodTypeImpl.class,
						paymentMethodType.getPrimaryKeyObj());
			}

			if (paymentMethodType != null) {
				session.delete(paymentMethodType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentMethodType != null) {
			clearCache(paymentMethodType);
		}

		return paymentMethodType;
	}

	@Override
	public PaymentMethodType updateImpl(
		com.ifli.rapid.model.PaymentMethodType paymentMethodType)
		throws SystemException {
		paymentMethodType = toUnwrappedModel(paymentMethodType);

		boolean isNew = paymentMethodType.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentMethodType.isNew()) {
				session.save(paymentMethodType);

				paymentMethodType.setNew(false);
			}
			else {
				session.merge(paymentMethodType);
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

		EntityCacheUtil.putResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodTypeImpl.class, paymentMethodType.getPrimaryKey(),
			paymentMethodType);

		return paymentMethodType;
	}

	protected PaymentMethodType toUnwrappedModel(
		PaymentMethodType paymentMethodType) {
		if (paymentMethodType instanceof PaymentMethodTypeImpl) {
			return paymentMethodType;
		}

		PaymentMethodTypeImpl paymentMethodTypeImpl = new PaymentMethodTypeImpl();

		paymentMethodTypeImpl.setNew(paymentMethodType.isNew());
		paymentMethodTypeImpl.setPrimaryKey(paymentMethodType.getPrimaryKey());

		paymentMethodTypeImpl.setId(paymentMethodType.getId());
		paymentMethodTypeImpl.setPaymentMethodID(paymentMethodType.getPaymentMethodID());
		paymentMethodTypeImpl.setGatewayID(paymentMethodType.getGatewayID());
		paymentMethodTypeImpl.setTypeKey(paymentMethodType.getTypeKey());
		paymentMethodTypeImpl.setDescription(paymentMethodType.getDescription());
		paymentMethodTypeImpl.setBankId(paymentMethodType.getBankId());
		paymentMethodTypeImpl.setActive(paymentMethodType.isActive());
		paymentMethodTypeImpl.setCreatedBy(paymentMethodType.getCreatedBy());
		paymentMethodTypeImpl.setCreatedDate(paymentMethodType.getCreatedDate());
		paymentMethodTypeImpl.setModifiedBy(paymentMethodType.getModifiedBy());
		paymentMethodTypeImpl.setModifiedDate(paymentMethodType.getModifiedDate());
		paymentMethodTypeImpl.setType(paymentMethodType.getType());

		return paymentMethodTypeImpl;
	}

	/**
	 * Returns the payment method type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment method type
	 * @return the payment method type
	 * @throws com.ifli.rapid.NoSuchPaymentMethodTypeException if a payment method type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentMethodTypeException, SystemException {
		PaymentMethodType paymentMethodType = fetchByPrimaryKey(primaryKey);

		if (paymentMethodType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentMethodTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentMethodType;
	}

	/**
	 * Returns the payment method type with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentMethodTypeException} if it could not be found.
	 *
	 * @param Id the primary key of the payment method type
	 * @return the payment method type
	 * @throws com.ifli.rapid.NoSuchPaymentMethodTypeException if a payment method type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodType findByPrimaryKey(String Id)
		throws NoSuchPaymentMethodTypeException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the payment method type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment method type
	 * @return the payment method type, or <code>null</code> if a payment method type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentMethodType paymentMethodType = (PaymentMethodType)EntityCacheUtil.getResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
				PaymentMethodTypeImpl.class, primaryKey);

		if (paymentMethodType == _nullPaymentMethodType) {
			return null;
		}

		if (paymentMethodType == null) {
			Session session = null;

			try {
				session = openSession();

				paymentMethodType = (PaymentMethodType)session.get(PaymentMethodTypeImpl.class,
						primaryKey);

				if (paymentMethodType != null) {
					cacheResult(paymentMethodType);
				}
				else {
					EntityCacheUtil.putResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
						PaymentMethodTypeImpl.class, primaryKey,
						_nullPaymentMethodType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentMethodTypeModelImpl.ENTITY_CACHE_ENABLED,
					PaymentMethodTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentMethodType;
	}

	/**
	 * Returns the payment method type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the payment method type
	 * @return the payment method type, or <code>null</code> if a payment method type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodType fetchByPrimaryKey(String Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the payment method types.
	 *
	 * @return the payment method types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentMethodType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment method types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment method types
	 * @param end the upper bound of the range of payment method types (not inclusive)
	 * @return the range of payment method types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentMethodType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment method types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment method types
	 * @param end the upper bound of the range of payment method types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment method types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentMethodType> findAll(int start, int end,
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

		List<PaymentMethodType> list = (List<PaymentMethodType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTMETHODTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTMETHODTYPE;

				if (pagination) {
					sql = sql.concat(PaymentMethodTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentMethodType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentMethodType>(list);
				}
				else {
					list = (List<PaymentMethodType>)QueryUtil.list(q,
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
	 * Removes all the payment method types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentMethodType paymentMethodType : findAll()) {
			remove(paymentMethodType);
		}
	}

	/**
	 * Returns the number of payment method types.
	 *
	 * @return the number of payment method types
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTMETHODTYPE);

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
	 * Initializes the payment method type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentMethodType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentMethodType>> listenersList = new ArrayList<ModelListener<PaymentMethodType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentMethodType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentMethodTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTMETHODTYPE = "SELECT paymentMethodType FROM PaymentMethodType paymentMethodType";
	private static final String _SQL_COUNT_PAYMENTMETHODTYPE = "SELECT COUNT(paymentMethodType) FROM PaymentMethodType paymentMethodType";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentMethodType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentMethodType exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentMethodTypePersistenceImpl.class);
	private static PaymentMethodType _nullPaymentMethodType = new PaymentMethodTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentMethodType> toCacheModel() {
				return _nullPaymentMethodTypeCacheModel;
			}
		};

	private static CacheModel<PaymentMethodType> _nullPaymentMethodTypeCacheModel =
		new CacheModel<PaymentMethodType>() {
			@Override
			public PaymentMethodType toEntityModel() {
				return _nullPaymentMethodType;
			}
		};
}