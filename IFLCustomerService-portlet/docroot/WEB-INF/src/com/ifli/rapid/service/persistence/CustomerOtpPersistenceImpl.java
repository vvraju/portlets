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

import com.ifli.rapid.NoSuchCustomerOtpException;
import com.ifli.rapid.model.CustomerOtp;
import com.ifli.rapid.model.impl.CustomerOtpImpl;
import com.ifli.rapid.model.impl.CustomerOtpModelImpl;

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
 * The persistence implementation for the customer otp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerOtpPersistence
 * @see CustomerOtpUtil
 * @generated
 */
public class CustomerOtpPersistenceImpl extends BasePersistenceImpl<CustomerOtp>
	implements CustomerOtpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerOtpUtil} to access the customer otp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerOtpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
			CustomerOtpModelImpl.FINDER_CACHE_ENABLED, CustomerOtpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
			CustomerOtpModelImpl.FINDER_CACHE_ENABLED, CustomerOtpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
			CustomerOtpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerOtpPersistenceImpl() {
		setModelClass(CustomerOtp.class);
	}

	/**
	 * Caches the customer otp in the entity cache if it is enabled.
	 *
	 * @param customerOtp the customer otp
	 */
	@Override
	public void cacheResult(CustomerOtp customerOtp) {
		EntityCacheUtil.putResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
			CustomerOtpImpl.class, customerOtp.getPrimaryKey(), customerOtp);

		customerOtp.resetOriginalValues();
	}

	/**
	 * Caches the customer otps in the entity cache if it is enabled.
	 *
	 * @param customerOtps the customer otps
	 */
	@Override
	public void cacheResult(List<CustomerOtp> customerOtps) {
		for (CustomerOtp customerOtp : customerOtps) {
			if (EntityCacheUtil.getResult(
						CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
						CustomerOtpImpl.class, customerOtp.getPrimaryKey()) == null) {
				cacheResult(customerOtp);
			}
			else {
				customerOtp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer otps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerOtpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerOtpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer otp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomerOtp customerOtp) {
		EntityCacheUtil.removeResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
			CustomerOtpImpl.class, customerOtp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomerOtp> customerOtps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomerOtp customerOtp : customerOtps) {
			EntityCacheUtil.removeResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
				CustomerOtpImpl.class, customerOtp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer otp with the primary key. Does not add the customer otp to the database.
	 *
	 * @param CUSTOMER_ID the primary key for the new customer otp
	 * @return the new customer otp
	 */
	@Override
	public CustomerOtp create(int CUSTOMER_ID) {
		CustomerOtp customerOtp = new CustomerOtpImpl();

		customerOtp.setNew(true);
		customerOtp.setPrimaryKey(CUSTOMER_ID);

		return customerOtp;
	}

	/**
	 * Removes the customer otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_ID the primary key of the customer otp
	 * @return the customer otp that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerOtpException if a customer otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerOtp remove(int CUSTOMER_ID)
		throws NoSuchCustomerOtpException, SystemException {
		return remove((Serializable)CUSTOMER_ID);
	}

	/**
	 * Removes the customer otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer otp
	 * @return the customer otp that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerOtpException if a customer otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerOtp remove(Serializable primaryKey)
		throws NoSuchCustomerOtpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomerOtp customerOtp = (CustomerOtp)session.get(CustomerOtpImpl.class,
					primaryKey);

			if (customerOtp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerOtpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerOtp);
		}
		catch (NoSuchCustomerOtpException nsee) {
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
	protected CustomerOtp removeImpl(CustomerOtp customerOtp)
		throws SystemException {
		customerOtp = toUnwrappedModel(customerOtp);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerOtp)) {
				customerOtp = (CustomerOtp)session.get(CustomerOtpImpl.class,
						customerOtp.getPrimaryKeyObj());
			}

			if (customerOtp != null) {
				session.delete(customerOtp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerOtp != null) {
			clearCache(customerOtp);
		}

		return customerOtp;
	}

	@Override
	public CustomerOtp updateImpl(com.ifli.rapid.model.CustomerOtp customerOtp)
		throws SystemException {
		customerOtp = toUnwrappedModel(customerOtp);

		boolean isNew = customerOtp.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerOtp.isNew()) {
				session.save(customerOtp);

				customerOtp.setNew(false);
			}
			else {
				session.merge(customerOtp);
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

		EntityCacheUtil.putResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
			CustomerOtpImpl.class, customerOtp.getPrimaryKey(), customerOtp);

		return customerOtp;
	}

	protected CustomerOtp toUnwrappedModel(CustomerOtp customerOtp) {
		if (customerOtp instanceof CustomerOtpImpl) {
			return customerOtp;
		}

		CustomerOtpImpl customerOtpImpl = new CustomerOtpImpl();

		customerOtpImpl.setNew(customerOtp.isNew());
		customerOtpImpl.setPrimaryKey(customerOtp.getPrimaryKey());

		customerOtpImpl.setCUSTOMER_ID(customerOtp.getCUSTOMER_ID());
		customerOtpImpl.setEMAIL_OTP(customerOtp.getEMAIL_OTP());
		customerOtpImpl.setPHONE_OTP(customerOtp.getPHONE_OTP());
		customerOtpImpl.setSTATUS(customerOtp.getSTATUS());
		customerOtpImpl.setADDED_DATE(customerOtp.getADDED_DATE());
		customerOtpImpl.setUPDATED_DATE(customerOtp.getUPDATED_DATE());

		return customerOtpImpl;
	}

	/**
	 * Returns the customer otp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer otp
	 * @return the customer otp
	 * @throws com.ifli.rapid.NoSuchCustomerOtpException if a customer otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerOtp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerOtpException, SystemException {
		CustomerOtp customerOtp = fetchByPrimaryKey(primaryKey);

		if (customerOtp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerOtpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerOtp;
	}

	/**
	 * Returns the customer otp with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerOtpException} if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the customer otp
	 * @return the customer otp
	 * @throws com.ifli.rapid.NoSuchCustomerOtpException if a customer otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerOtp findByPrimaryKey(int CUSTOMER_ID)
		throws NoSuchCustomerOtpException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns the customer otp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer otp
	 * @return the customer otp, or <code>null</code> if a customer otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerOtp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomerOtp customerOtp = (CustomerOtp)EntityCacheUtil.getResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
				CustomerOtpImpl.class, primaryKey);

		if (customerOtp == _nullCustomerOtp) {
			return null;
		}

		if (customerOtp == null) {
			Session session = null;

			try {
				session = openSession();

				customerOtp = (CustomerOtp)session.get(CustomerOtpImpl.class,
						primaryKey);

				if (customerOtp != null) {
					cacheResult(customerOtp);
				}
				else {
					EntityCacheUtil.putResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
						CustomerOtpImpl.class, primaryKey, _nullCustomerOtp);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerOtpModelImpl.ENTITY_CACHE_ENABLED,
					CustomerOtpImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerOtp;
	}

	/**
	 * Returns the customer otp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the customer otp
	 * @return the customer otp, or <code>null</code> if a customer otp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerOtp fetchByPrimaryKey(int CUSTOMER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns all the customer otps.
	 *
	 * @return the customer otps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerOtp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer otps
	 * @param end the upper bound of the range of customer otps (not inclusive)
	 * @return the range of customer otps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerOtp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerOtpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer otps
	 * @param end the upper bound of the range of customer otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer otps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerOtp> findAll(int start, int end,
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

		List<CustomerOtp> list = (List<CustomerOtp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMEROTP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMEROTP;

				if (pagination) {
					sql = sql.concat(CustomerOtpModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomerOtp>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomerOtp>(list);
				}
				else {
					list = (List<CustomerOtp>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the customer otps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomerOtp customerOtp : findAll()) {
			remove(customerOtp);
		}
	}

	/**
	 * Returns the number of customer otps.
	 *
	 * @return the number of customer otps
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMEROTP);

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
	 * Initializes the customer otp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.CustomerOtp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomerOtp>> listenersList = new ArrayList<ModelListener<CustomerOtp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomerOtp>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerOtpImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMEROTP = "SELECT customerOtp FROM CustomerOtp customerOtp";
	private static final String _SQL_COUNT_CUSTOMEROTP = "SELECT COUNT(customerOtp) FROM CustomerOtp customerOtp";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerOtp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerOtp exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerOtpPersistenceImpl.class);
	private static CustomerOtp _nullCustomerOtp = new CustomerOtpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomerOtp> toCacheModel() {
				return _nullCustomerOtpCacheModel;
			}
		};

	private static CacheModel<CustomerOtp> _nullCustomerOtpCacheModel = new CacheModel<CustomerOtp>() {
			@Override
			public CustomerOtp toEntityModel() {
				return _nullCustomerOtp;
			}
		};
}