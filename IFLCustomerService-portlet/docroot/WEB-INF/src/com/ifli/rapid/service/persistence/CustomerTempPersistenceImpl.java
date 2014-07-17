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

import com.ifli.rapid.NoSuchCustomerTempException;
import com.ifli.rapid.model.CustomerTemp;
import com.ifli.rapid.model.impl.CustomerTempImpl;
import com.ifli.rapid.model.impl.CustomerTempModelImpl;

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
 * The persistence implementation for the customer temp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerTempPersistence
 * @see CustomerTempUtil
 * @generated
 */
public class CustomerTempPersistenceImpl extends BasePersistenceImpl<CustomerTemp>
	implements CustomerTempPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerTempUtil} to access the customer temp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerTempImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
			CustomerTempModelImpl.FINDER_CACHE_ENABLED, CustomerTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
			CustomerTempModelImpl.FINDER_CACHE_ENABLED, CustomerTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
			CustomerTempModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerTempPersistenceImpl() {
		setModelClass(CustomerTemp.class);
	}

	/**
	 * Caches the customer temp in the entity cache if it is enabled.
	 *
	 * @param customerTemp the customer temp
	 */
	@Override
	public void cacheResult(CustomerTemp customerTemp) {
		EntityCacheUtil.putResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
			CustomerTempImpl.class, customerTemp.getPrimaryKey(), customerTemp);

		customerTemp.resetOriginalValues();
	}

	/**
	 * Caches the customer temps in the entity cache if it is enabled.
	 *
	 * @param customerTemps the customer temps
	 */
	@Override
	public void cacheResult(List<CustomerTemp> customerTemps) {
		for (CustomerTemp customerTemp : customerTemps) {
			if (EntityCacheUtil.getResult(
						CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
						CustomerTempImpl.class, customerTemp.getPrimaryKey()) == null) {
				cacheResult(customerTemp);
			}
			else {
				customerTemp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer temps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerTempImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerTempImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer temp.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomerTemp customerTemp) {
		EntityCacheUtil.removeResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
			CustomerTempImpl.class, customerTemp.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomerTemp> customerTemps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomerTemp customerTemp : customerTemps) {
			EntityCacheUtil.removeResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
				CustomerTempImpl.class, customerTemp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer temp with the primary key. Does not add the customer temp to the database.
	 *
	 * @param CUSTOMER_ID the primary key for the new customer temp
	 * @return the new customer temp
	 */
	@Override
	public CustomerTemp create(String CUSTOMER_ID) {
		CustomerTemp customerTemp = new CustomerTempImpl();

		customerTemp.setNew(true);
		customerTemp.setPrimaryKey(CUSTOMER_ID);

		return customerTemp;
	}

	/**
	 * Removes the customer temp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_ID the primary key of the customer temp
	 * @return the customer temp that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerTemp remove(String CUSTOMER_ID)
		throws NoSuchCustomerTempException, SystemException {
		return remove((Serializable)CUSTOMER_ID);
	}

	/**
	 * Removes the customer temp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer temp
	 * @return the customer temp that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerTemp remove(Serializable primaryKey)
		throws NoSuchCustomerTempException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomerTemp customerTemp = (CustomerTemp)session.get(CustomerTempImpl.class,
					primaryKey);

			if (customerTemp == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerTempException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerTemp);
		}
		catch (NoSuchCustomerTempException nsee) {
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
	protected CustomerTemp removeImpl(CustomerTemp customerTemp)
		throws SystemException {
		customerTemp = toUnwrappedModel(customerTemp);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerTemp)) {
				customerTemp = (CustomerTemp)session.get(CustomerTempImpl.class,
						customerTemp.getPrimaryKeyObj());
			}

			if (customerTemp != null) {
				session.delete(customerTemp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerTemp != null) {
			clearCache(customerTemp);
		}

		return customerTemp;
	}

	@Override
	public CustomerTemp updateImpl(
		com.ifli.rapid.model.CustomerTemp customerTemp)
		throws SystemException {
		customerTemp = toUnwrappedModel(customerTemp);

		boolean isNew = customerTemp.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerTemp.isNew()) {
				session.save(customerTemp);

				customerTemp.setNew(false);
			}
			else {
				session.merge(customerTemp);
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

		EntityCacheUtil.putResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
			CustomerTempImpl.class, customerTemp.getPrimaryKey(), customerTemp);

		return customerTemp;
	}

	protected CustomerTemp toUnwrappedModel(CustomerTemp customerTemp) {
		if (customerTemp instanceof CustomerTempImpl) {
			return customerTemp;
		}

		CustomerTempImpl customerTempImpl = new CustomerTempImpl();

		customerTempImpl.setNew(customerTemp.isNew());
		customerTempImpl.setPrimaryKey(customerTemp.getPrimaryKey());

		customerTempImpl.setCUSTOMER_ID(customerTemp.getCUSTOMER_ID());
		customerTempImpl.setCUSTOMER_SALUTATION(customerTemp.getCUSTOMER_SALUTATION());
		customerTempImpl.setCUSTOMER_FIRST_NAME(customerTemp.getCUSTOMER_FIRST_NAME());
		customerTempImpl.setCUSTOMER_LAST_NAME(customerTemp.getCUSTOMER_LAST_NAME());
		customerTempImpl.setCUSTOMER_MIDDLE_NAME(customerTemp.getCUSTOMER_MIDDLE_NAME());
		customerTempImpl.setCUSTOMER_DATE_OF_BIRTH(customerTemp.getCUSTOMER_DATE_OF_BIRTH());
		customerTempImpl.setCUSTOMER_EMAIL_ADDR(customerTemp.getCUSTOMER_EMAIL_ADDR());
		customerTempImpl.setPRIMARY_ADDRESS_LINE_1(customerTemp.getPRIMARY_ADDRESS_LINE_1());
		customerTempImpl.setPRIMARY_ADDRESS_LINE_2(customerTemp.getPRIMARY_ADDRESS_LINE_2());
		customerTempImpl.setPRIMARY_ADDRESS_LINE_3(customerTemp.getPRIMARY_ADDRESS_LINE_3());
		customerTempImpl.setPRIMARY_ADDRESS_CITY(customerTemp.getPRIMARY_ADDRESS_CITY());
		customerTempImpl.setPRIMARY_ADDRESS_STATE(customerTemp.getPRIMARY_ADDRESS_STATE());
		customerTempImpl.setPIMARY_ADDRESS_PINCODE(customerTemp.getPIMARY_ADDRESS_PINCODE());
		customerTempImpl.setPHONE_NUMBER_1(customerTemp.getPHONE_NUMBER_1());
		customerTempImpl.setPHONE_NUMBER_2(customerTemp.getPHONE_NUMBER_2());
		customerTempImpl.setPHONE_NUMBER_3(customerTemp.getPHONE_NUMBER_3());
		customerTempImpl.setLOGIN_NAME(customerTemp.getLOGIN_NAME());
		customerTempImpl.setGENDER(customerTemp.getGENDER());
		customerTempImpl.setMARITAL_STATUS(customerTemp.getMARITAL_STATUS());
		customerTempImpl.setCOUNTRY(customerTemp.getCOUNTRY());
		customerTempImpl.setPRIMARY_ADDRESS_STATE_ID(customerTemp.getPRIMARY_ADDRESS_STATE_ID());

		return customerTempImpl;
	}

	/**
	 * Returns the customer temp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer temp
	 * @return the customer temp
	 * @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerTemp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerTempException, SystemException {
		CustomerTemp customerTemp = fetchByPrimaryKey(primaryKey);

		if (customerTemp == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerTempException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerTemp;
	}

	/**
	 * Returns the customer temp with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerTempException} if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the customer temp
	 * @return the customer temp
	 * @throws com.ifli.rapid.NoSuchCustomerTempException if a customer temp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerTemp findByPrimaryKey(String CUSTOMER_ID)
		throws NoSuchCustomerTempException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns the customer temp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer temp
	 * @return the customer temp, or <code>null</code> if a customer temp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerTemp fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomerTemp customerTemp = (CustomerTemp)EntityCacheUtil.getResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
				CustomerTempImpl.class, primaryKey);

		if (customerTemp == _nullCustomerTemp) {
			return null;
		}

		if (customerTemp == null) {
			Session session = null;

			try {
				session = openSession();

				customerTemp = (CustomerTemp)session.get(CustomerTempImpl.class,
						primaryKey);

				if (customerTemp != null) {
					cacheResult(customerTemp);
				}
				else {
					EntityCacheUtil.putResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
						CustomerTempImpl.class, primaryKey, _nullCustomerTemp);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerTempModelImpl.ENTITY_CACHE_ENABLED,
					CustomerTempImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerTemp;
	}

	/**
	 * Returns the customer temp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the customer temp
	 * @return the customer temp, or <code>null</code> if a customer temp with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerTemp fetchByPrimaryKey(String CUSTOMER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns all the customer temps.
	 *
	 * @return the customer temps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerTemp> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer temps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer temps
	 * @param end the upper bound of the range of customer temps (not inclusive)
	 * @return the range of customer temps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerTemp> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer temps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer temps
	 * @param end the upper bound of the range of customer temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer temps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerTemp> findAll(int start, int end,
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

		List<CustomerTemp> list = (List<CustomerTemp>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERTEMP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERTEMP;

				if (pagination) {
					sql = sql.concat(CustomerTempModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomerTemp>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomerTemp>(list);
				}
				else {
					list = (List<CustomerTemp>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the customer temps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomerTemp customerTemp : findAll()) {
			remove(customerTemp);
		}
	}

	/**
	 * Returns the number of customer temps.
	 *
	 * @return the number of customer temps
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERTEMP);

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
	 * Initializes the customer temp persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.CustomerTemp")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomerTemp>> listenersList = new ArrayList<ModelListener<CustomerTemp>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomerTemp>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerTempImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERTEMP = "SELECT customerTemp FROM CustomerTemp customerTemp";
	private static final String _SQL_COUNT_CUSTOMERTEMP = "SELECT COUNT(customerTemp) FROM CustomerTemp customerTemp";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerTemp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerTemp exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerTempPersistenceImpl.class);
	private static CustomerTemp _nullCustomerTemp = new CustomerTempImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomerTemp> toCacheModel() {
				return _nullCustomerTempCacheModel;
			}
		};

	private static CacheModel<CustomerTemp> _nullCustomerTempCacheModel = new CacheModel<CustomerTemp>() {
			@Override
			public CustomerTemp toEntityModel() {
				return _nullCustomerTemp;
			}
		};
}