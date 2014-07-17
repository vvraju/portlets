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

import com.ifli.rapid.NoSuchPaymentMethodMasterException;
import com.ifli.rapid.model.PaymentMethodMaster;
import com.ifli.rapid.model.impl.PaymentMethodMasterImpl;
import com.ifli.rapid.model.impl.PaymentMethodMasterModelImpl;

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
 * The persistence implementation for the payment method master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentMethodMasterPersistence
 * @see PaymentMethodMasterUtil
 * @generated
 */
public class PaymentMethodMasterPersistenceImpl extends BasePersistenceImpl<PaymentMethodMaster>
	implements PaymentMethodMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentMethodMasterUtil} to access the payment method master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentMethodMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentMethodMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentMethodMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentMethodMasterPersistenceImpl() {
		setModelClass(PaymentMethodMaster.class);
	}

	/**
	 * Caches the payment method master in the entity cache if it is enabled.
	 *
	 * @param paymentMethodMaster the payment method master
	 */
	@Override
	public void cacheResult(PaymentMethodMaster paymentMethodMaster) {
		EntityCacheUtil.putResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodMasterImpl.class, paymentMethodMaster.getPrimaryKey(),
			paymentMethodMaster);

		paymentMethodMaster.resetOriginalValues();
	}

	/**
	 * Caches the payment method masters in the entity cache if it is enabled.
	 *
	 * @param paymentMethodMasters the payment method masters
	 */
	@Override
	public void cacheResult(List<PaymentMethodMaster> paymentMethodMasters) {
		for (PaymentMethodMaster paymentMethodMaster : paymentMethodMasters) {
			if (EntityCacheUtil.getResult(
						PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentMethodMasterImpl.class,
						paymentMethodMaster.getPrimaryKey()) == null) {
				cacheResult(paymentMethodMaster);
			}
			else {
				paymentMethodMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment method masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentMethodMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentMethodMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment method master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentMethodMaster paymentMethodMaster) {
		EntityCacheUtil.removeResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodMasterImpl.class, paymentMethodMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentMethodMaster> paymentMethodMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentMethodMaster paymentMethodMaster : paymentMethodMasters) {
			EntityCacheUtil.removeResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentMethodMasterImpl.class,
				paymentMethodMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment method master with the primary key. Does not add the payment method master to the database.
	 *
	 * @param PaymentMethodID the primary key for the new payment method master
	 * @return the new payment method master
	 */
	@Override
	public PaymentMethodMaster create(String PaymentMethodID) {
		PaymentMethodMaster paymentMethodMaster = new PaymentMethodMasterImpl();

		paymentMethodMaster.setNew(true);
		paymentMethodMaster.setPrimaryKey(PaymentMethodID);

		return paymentMethodMaster;
	}

	/**
	 * Removes the payment method master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param PaymentMethodID the primary key of the payment method master
	 * @return the payment method master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentMethodMasterException if a payment method master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodMaster remove(String PaymentMethodID)
		throws NoSuchPaymentMethodMasterException, SystemException {
		return remove((Serializable)PaymentMethodID);
	}

	/**
	 * Removes the payment method master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment method master
	 * @return the payment method master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentMethodMasterException if a payment method master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodMaster remove(Serializable primaryKey)
		throws NoSuchPaymentMethodMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentMethodMaster paymentMethodMaster = (PaymentMethodMaster)session.get(PaymentMethodMasterImpl.class,
					primaryKey);

			if (paymentMethodMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentMethodMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentMethodMaster);
		}
		catch (NoSuchPaymentMethodMasterException nsee) {
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
	protected PaymentMethodMaster removeImpl(
		PaymentMethodMaster paymentMethodMaster) throws SystemException {
		paymentMethodMaster = toUnwrappedModel(paymentMethodMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentMethodMaster)) {
				paymentMethodMaster = (PaymentMethodMaster)session.get(PaymentMethodMasterImpl.class,
						paymentMethodMaster.getPrimaryKeyObj());
			}

			if (paymentMethodMaster != null) {
				session.delete(paymentMethodMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentMethodMaster != null) {
			clearCache(paymentMethodMaster);
		}

		return paymentMethodMaster;
	}

	@Override
	public PaymentMethodMaster updateImpl(
		com.ifli.rapid.model.PaymentMethodMaster paymentMethodMaster)
		throws SystemException {
		paymentMethodMaster = toUnwrappedModel(paymentMethodMaster);

		boolean isNew = paymentMethodMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentMethodMaster.isNew()) {
				session.save(paymentMethodMaster);

				paymentMethodMaster.setNew(false);
			}
			else {
				session.merge(paymentMethodMaster);
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

		EntityCacheUtil.putResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentMethodMasterImpl.class, paymentMethodMaster.getPrimaryKey(),
			paymentMethodMaster);

		return paymentMethodMaster;
	}

	protected PaymentMethodMaster toUnwrappedModel(
		PaymentMethodMaster paymentMethodMaster) {
		if (paymentMethodMaster instanceof PaymentMethodMasterImpl) {
			return paymentMethodMaster;
		}

		PaymentMethodMasterImpl paymentMethodMasterImpl = new PaymentMethodMasterImpl();

		paymentMethodMasterImpl.setNew(paymentMethodMaster.isNew());
		paymentMethodMasterImpl.setPrimaryKey(paymentMethodMaster.getPrimaryKey());

		paymentMethodMasterImpl.setPaymentMethodID(paymentMethodMaster.getPaymentMethodID());
		paymentMethodMasterImpl.setPaymentMethodKey(paymentMethodMaster.getPaymentMethodKey());
		paymentMethodMasterImpl.setIsActive(paymentMethodMaster.isIsActive());
		paymentMethodMasterImpl.setCreatedBy(paymentMethodMaster.getCreatedBy());
		paymentMethodMasterImpl.setCreatedDate(paymentMethodMaster.getCreatedDate());
		paymentMethodMasterImpl.setModifiedBy(paymentMethodMaster.getModifiedBy());
		paymentMethodMasterImpl.setModifiedDate(paymentMethodMaster.getModifiedDate());
		paymentMethodMasterImpl.setPriority(paymentMethodMaster.getPriority());

		return paymentMethodMasterImpl;
	}

	/**
	 * Returns the payment method master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment method master
	 * @return the payment method master
	 * @throws com.ifli.rapid.NoSuchPaymentMethodMasterException if a payment method master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentMethodMasterException, SystemException {
		PaymentMethodMaster paymentMethodMaster = fetchByPrimaryKey(primaryKey);

		if (paymentMethodMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentMethodMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentMethodMaster;
	}

	/**
	 * Returns the payment method master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentMethodMasterException} if it could not be found.
	 *
	 * @param PaymentMethodID the primary key of the payment method master
	 * @return the payment method master
	 * @throws com.ifli.rapid.NoSuchPaymentMethodMasterException if a payment method master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodMaster findByPrimaryKey(String PaymentMethodID)
		throws NoSuchPaymentMethodMasterException, SystemException {
		return findByPrimaryKey((Serializable)PaymentMethodID);
	}

	/**
	 * Returns the payment method master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment method master
	 * @return the payment method master, or <code>null</code> if a payment method master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentMethodMaster paymentMethodMaster = (PaymentMethodMaster)EntityCacheUtil.getResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentMethodMasterImpl.class, primaryKey);

		if (paymentMethodMaster == _nullPaymentMethodMaster) {
			return null;
		}

		if (paymentMethodMaster == null) {
			Session session = null;

			try {
				session = openSession();

				paymentMethodMaster = (PaymentMethodMaster)session.get(PaymentMethodMasterImpl.class,
						primaryKey);

				if (paymentMethodMaster != null) {
					cacheResult(paymentMethodMaster);
				}
				else {
					EntityCacheUtil.putResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentMethodMasterImpl.class, primaryKey,
						_nullPaymentMethodMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentMethodMasterModelImpl.ENTITY_CACHE_ENABLED,
					PaymentMethodMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentMethodMaster;
	}

	/**
	 * Returns the payment method master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param PaymentMethodID the primary key of the payment method master
	 * @return the payment method master, or <code>null</code> if a payment method master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentMethodMaster fetchByPrimaryKey(String PaymentMethodID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)PaymentMethodID);
	}

	/**
	 * Returns all the payment method masters.
	 *
	 * @return the payment method masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentMethodMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment method masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment method masters
	 * @param end the upper bound of the range of payment method masters (not inclusive)
	 * @return the range of payment method masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentMethodMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment method masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentMethodMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment method masters
	 * @param end the upper bound of the range of payment method masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment method masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentMethodMaster> findAll(int start, int end,
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

		List<PaymentMethodMaster> list = (List<PaymentMethodMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTMETHODMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTMETHODMASTER;

				if (pagination) {
					sql = sql.concat(PaymentMethodMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentMethodMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentMethodMaster>(list);
				}
				else {
					list = (List<PaymentMethodMaster>)QueryUtil.list(q,
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
	 * Removes all the payment method masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentMethodMaster paymentMethodMaster : findAll()) {
			remove(paymentMethodMaster);
		}
	}

	/**
	 * Returns the number of payment method masters.
	 *
	 * @return the number of payment method masters
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTMETHODMASTER);

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
	 * Initializes the payment method master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentMethodMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentMethodMaster>> listenersList = new ArrayList<ModelListener<PaymentMethodMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentMethodMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentMethodMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTMETHODMASTER = "SELECT paymentMethodMaster FROM PaymentMethodMaster paymentMethodMaster";
	private static final String _SQL_COUNT_PAYMENTMETHODMASTER = "SELECT COUNT(paymentMethodMaster) FROM PaymentMethodMaster paymentMethodMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentMethodMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentMethodMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentMethodMasterPersistenceImpl.class);
	private static PaymentMethodMaster _nullPaymentMethodMaster = new PaymentMethodMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentMethodMaster> toCacheModel() {
				return _nullPaymentMethodMasterCacheModel;
			}
		};

	private static CacheModel<PaymentMethodMaster> _nullPaymentMethodMasterCacheModel =
		new CacheModel<PaymentMethodMaster>() {
			@Override
			public PaymentMethodMaster toEntityModel() {
				return _nullPaymentMethodMaster;
			}
		};
}