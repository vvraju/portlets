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

import com.ifli.rapid.NoSuchPaymentGatewayMasterException;
import com.ifli.rapid.model.PaymentGatewayMaster;
import com.ifli.rapid.model.impl.PaymentGatewayMasterImpl;
import com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl;

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
 * The persistence implementation for the payment gateway master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see PaymentGatewayMasterPersistence
 * @see PaymentGatewayMasterUtil
 * @generated
 */
public class PaymentGatewayMasterPersistenceImpl extends BasePersistenceImpl<PaymentGatewayMaster>
	implements PaymentGatewayMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentGatewayMasterUtil} to access the payment gateway master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentGatewayMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentGatewayMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentGatewayMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentGatewayMasterModelImpl.FINDER_CACHE_ENABLED,
			PaymentGatewayMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentGatewayMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PaymentGatewayMasterPersistenceImpl() {
		setModelClass(PaymentGatewayMaster.class);
	}

	/**
	 * Caches the payment gateway master in the entity cache if it is enabled.
	 *
	 * @param paymentGatewayMaster the payment gateway master
	 */
	@Override
	public void cacheResult(PaymentGatewayMaster paymentGatewayMaster) {
		EntityCacheUtil.putResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentGatewayMasterImpl.class,
			paymentGatewayMaster.getPrimaryKey(), paymentGatewayMaster);

		paymentGatewayMaster.resetOriginalValues();
	}

	/**
	 * Caches the payment gateway masters in the entity cache if it is enabled.
	 *
	 * @param paymentGatewayMasters the payment gateway masters
	 */
	@Override
	public void cacheResult(List<PaymentGatewayMaster> paymentGatewayMasters) {
		for (PaymentGatewayMaster paymentGatewayMaster : paymentGatewayMasters) {
			if (EntityCacheUtil.getResult(
						PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentGatewayMasterImpl.class,
						paymentGatewayMaster.getPrimaryKey()) == null) {
				cacheResult(paymentGatewayMaster);
			}
			else {
				paymentGatewayMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment gateway masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentGatewayMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentGatewayMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment gateway master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentGatewayMaster paymentGatewayMaster) {
		EntityCacheUtil.removeResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentGatewayMasterImpl.class, paymentGatewayMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PaymentGatewayMaster> paymentGatewayMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentGatewayMaster paymentGatewayMaster : paymentGatewayMasters) {
			EntityCacheUtil.removeResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentGatewayMasterImpl.class,
				paymentGatewayMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new payment gateway master with the primary key. Does not add the payment gateway master to the database.
	 *
	 * @param GatewayID the primary key for the new payment gateway master
	 * @return the new payment gateway master
	 */
	@Override
	public PaymentGatewayMaster create(String GatewayID) {
		PaymentGatewayMaster paymentGatewayMaster = new PaymentGatewayMasterImpl();

		paymentGatewayMaster.setNew(true);
		paymentGatewayMaster.setPrimaryKey(GatewayID);

		return paymentGatewayMaster;
	}

	/**
	 * Removes the payment gateway master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GatewayID the primary key of the payment gateway master
	 * @return the payment gateway master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentGatewayMasterException if a payment gateway master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentGatewayMaster remove(String GatewayID)
		throws NoSuchPaymentGatewayMasterException, SystemException {
		return remove((Serializable)GatewayID);
	}

	/**
	 * Removes the payment gateway master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment gateway master
	 * @return the payment gateway master that was removed
	 * @throws com.ifli.rapid.NoSuchPaymentGatewayMasterException if a payment gateway master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentGatewayMaster remove(Serializable primaryKey)
		throws NoSuchPaymentGatewayMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentGatewayMaster paymentGatewayMaster = (PaymentGatewayMaster)session.get(PaymentGatewayMasterImpl.class,
					primaryKey);

			if (paymentGatewayMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentGatewayMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentGatewayMaster);
		}
		catch (NoSuchPaymentGatewayMasterException nsee) {
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
	protected PaymentGatewayMaster removeImpl(
		PaymentGatewayMaster paymentGatewayMaster) throws SystemException {
		paymentGatewayMaster = toUnwrappedModel(paymentGatewayMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentGatewayMaster)) {
				paymentGatewayMaster = (PaymentGatewayMaster)session.get(PaymentGatewayMasterImpl.class,
						paymentGatewayMaster.getPrimaryKeyObj());
			}

			if (paymentGatewayMaster != null) {
				session.delete(paymentGatewayMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentGatewayMaster != null) {
			clearCache(paymentGatewayMaster);
		}

		return paymentGatewayMaster;
	}

	@Override
	public PaymentGatewayMaster updateImpl(
		com.ifli.rapid.model.PaymentGatewayMaster paymentGatewayMaster)
		throws SystemException {
		paymentGatewayMaster = toUnwrappedModel(paymentGatewayMaster);

		boolean isNew = paymentGatewayMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (paymentGatewayMaster.isNew()) {
				session.save(paymentGatewayMaster);

				paymentGatewayMaster.setNew(false);
			}
			else {
				session.merge(paymentGatewayMaster);
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

		EntityCacheUtil.putResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
			PaymentGatewayMasterImpl.class,
			paymentGatewayMaster.getPrimaryKey(), paymentGatewayMaster);

		return paymentGatewayMaster;
	}

	protected PaymentGatewayMaster toUnwrappedModel(
		PaymentGatewayMaster paymentGatewayMaster) {
		if (paymentGatewayMaster instanceof PaymentGatewayMasterImpl) {
			return paymentGatewayMaster;
		}

		PaymentGatewayMasterImpl paymentGatewayMasterImpl = new PaymentGatewayMasterImpl();

		paymentGatewayMasterImpl.setNew(paymentGatewayMaster.isNew());
		paymentGatewayMasterImpl.setPrimaryKey(paymentGatewayMaster.getPrimaryKey());

		paymentGatewayMasterImpl.setGatewayID(paymentGatewayMaster.getGatewayID());
		paymentGatewayMasterImpl.setGatewayDescription(paymentGatewayMaster.getGatewayDescription());
		paymentGatewayMasterImpl.setGatewayKey(paymentGatewayMaster.getGatewayKey());
		paymentGatewayMasterImpl.setIsActive(paymentGatewayMaster.isIsActive());
		paymentGatewayMasterImpl.setCreatedBy(paymentGatewayMaster.getCreatedBy());
		paymentGatewayMasterImpl.setCreatedDate(paymentGatewayMaster.getCreatedDate());
		paymentGatewayMasterImpl.setModifiedBy(paymentGatewayMaster.getModifiedBy());
		paymentGatewayMasterImpl.setModifiedDate(paymentGatewayMaster.getModifiedDate());
		paymentGatewayMasterImpl.setPriority(paymentGatewayMaster.getPriority());
		paymentGatewayMasterImpl.setItemCode(paymentGatewayMaster.getItemCode());

		return paymentGatewayMasterImpl;
	}

	/**
	 * Returns the payment gateway master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment gateway master
	 * @return the payment gateway master
	 * @throws com.ifli.rapid.NoSuchPaymentGatewayMasterException if a payment gateway master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentGatewayMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentGatewayMasterException, SystemException {
		PaymentGatewayMaster paymentGatewayMaster = fetchByPrimaryKey(primaryKey);

		if (paymentGatewayMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentGatewayMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentGatewayMaster;
	}

	/**
	 * Returns the payment gateway master with the primary key or throws a {@link com.ifli.rapid.NoSuchPaymentGatewayMasterException} if it could not be found.
	 *
	 * @param GatewayID the primary key of the payment gateway master
	 * @return the payment gateway master
	 * @throws com.ifli.rapid.NoSuchPaymentGatewayMasterException if a payment gateway master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentGatewayMaster findByPrimaryKey(String GatewayID)
		throws NoSuchPaymentGatewayMasterException, SystemException {
		return findByPrimaryKey((Serializable)GatewayID);
	}

	/**
	 * Returns the payment gateway master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment gateway master
	 * @return the payment gateway master, or <code>null</code> if a payment gateway master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentGatewayMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentGatewayMaster paymentGatewayMaster = (PaymentGatewayMaster)EntityCacheUtil.getResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
				PaymentGatewayMasterImpl.class, primaryKey);

		if (paymentGatewayMaster == _nullPaymentGatewayMaster) {
			return null;
		}

		if (paymentGatewayMaster == null) {
			Session session = null;

			try {
				session = openSession();

				paymentGatewayMaster = (PaymentGatewayMaster)session.get(PaymentGatewayMasterImpl.class,
						primaryKey);

				if (paymentGatewayMaster != null) {
					cacheResult(paymentGatewayMaster);
				}
				else {
					EntityCacheUtil.putResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
						PaymentGatewayMasterImpl.class, primaryKey,
						_nullPaymentGatewayMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentGatewayMasterModelImpl.ENTITY_CACHE_ENABLED,
					PaymentGatewayMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentGatewayMaster;
	}

	/**
	 * Returns the payment gateway master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GatewayID the primary key of the payment gateway master
	 * @return the payment gateway master, or <code>null</code> if a payment gateway master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentGatewayMaster fetchByPrimaryKey(String GatewayID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)GatewayID);
	}

	/**
	 * Returns all the payment gateway masters.
	 *
	 * @return the payment gateway masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentGatewayMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment gateway masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment gateway masters
	 * @param end the upper bound of the range of payment gateway masters (not inclusive)
	 * @return the range of payment gateway masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentGatewayMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment gateway masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.PaymentGatewayMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment gateway masters
	 * @param end the upper bound of the range of payment gateway masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment gateway masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentGatewayMaster> findAll(int start, int end,
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

		List<PaymentGatewayMaster> list = (List<PaymentGatewayMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTGATEWAYMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTGATEWAYMASTER;

				if (pagination) {
					sql = sql.concat(PaymentGatewayMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentGatewayMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentGatewayMaster>(list);
				}
				else {
					list = (List<PaymentGatewayMaster>)QueryUtil.list(q,
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
	 * Removes all the payment gateway masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentGatewayMaster paymentGatewayMaster : findAll()) {
			remove(paymentGatewayMaster);
		}
	}

	/**
	 * Returns the number of payment gateway masters.
	 *
	 * @return the number of payment gateway masters
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTGATEWAYMASTER);

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
	 * Initializes the payment gateway master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.PaymentGatewayMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentGatewayMaster>> listenersList = new ArrayList<ModelListener<PaymentGatewayMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentGatewayMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentGatewayMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTGATEWAYMASTER = "SELECT paymentGatewayMaster FROM PaymentGatewayMaster paymentGatewayMaster";
	private static final String _SQL_COUNT_PAYMENTGATEWAYMASTER = "SELECT COUNT(paymentGatewayMaster) FROM PaymentGatewayMaster paymentGatewayMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentGatewayMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentGatewayMaster exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentGatewayMasterPersistenceImpl.class);
	private static PaymentGatewayMaster _nullPaymentGatewayMaster = new PaymentGatewayMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentGatewayMaster> toCacheModel() {
				return _nullPaymentGatewayMasterCacheModel;
			}
		};

	private static CacheModel<PaymentGatewayMaster> _nullPaymentGatewayMasterCacheModel =
		new CacheModel<PaymentGatewayMaster>() {
			@Override
			public PaymentGatewayMaster toEntityModel() {
				return _nullPaymentGatewayMaster;
			}
		};
}