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

import com.ifli.rapid.NoSuchCustomerException;
import com.ifli.rapid.model.Customer;
import com.ifli.rapid.model.impl.CustomerImpl;
import com.ifli.rapid.model.impl.CustomerModelImpl;

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
 * The persistence implementation for the customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerPersistence
 * @see CustomerUtil
 * @generated
 */
public class CustomerPersistenceImpl extends BasePersistenceImpl<Customer>
	implements CustomerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerUtil} to access the customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerPersistenceImpl() {
		setModelClass(Customer.class);
	}

	/**
	 * Caches the customer in the entity cache if it is enabled.
	 *
	 * @param customer the customer
	 */
	@Override
	public void cacheResult(Customer customer) {
		EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerImpl.class, customer.getPrimaryKey(), customer);

		customer.resetOriginalValues();
	}

	/**
	 * Caches the customers in the entity cache if it is enabled.
	 *
	 * @param customers the customers
	 */
	@Override
	public void cacheResult(List<Customer> customers) {
		for (Customer customer : customers) {
			if (EntityCacheUtil.getResult(
						CustomerModelImpl.ENTITY_CACHE_ENABLED,
						CustomerImpl.class, customer.getPrimaryKey()) == null) {
				cacheResult(customer);
			}
			else {
				customer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Customer customer) {
		EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerImpl.class, customer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Customer> customers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Customer customer : customers) {
			EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
				CustomerImpl.class, customer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer with the primary key. Does not add the customer to the database.
	 *
	 * @param CUSTOMER_ID the primary key for the new customer
	 * @return the new customer
	 */
	@Override
	public Customer create(int CUSTOMER_ID) {
		Customer customer = new CustomerImpl();

		customer.setNew(true);
		customer.setPrimaryKey(CUSTOMER_ID);

		return customer;
	}

	/**
	 * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_ID the primary key of the customer
	 * @return the customer that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer remove(int CUSTOMER_ID)
		throws NoSuchCustomerException, SystemException {
		return remove((Serializable)CUSTOMER_ID);
	}

	/**
	 * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer
	 * @return the customer that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer remove(Serializable primaryKey)
		throws NoSuchCustomerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Customer customer = (Customer)session.get(CustomerImpl.class,
					primaryKey);

			if (customer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customer);
		}
		catch (NoSuchCustomerException nsee) {
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
	protected Customer removeImpl(Customer customer) throws SystemException {
		customer = toUnwrappedModel(customer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customer)) {
				customer = (Customer)session.get(CustomerImpl.class,
						customer.getPrimaryKeyObj());
			}

			if (customer != null) {
				session.delete(customer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customer != null) {
			clearCache(customer);
		}

		return customer;
	}

	@Override
	public Customer updateImpl(com.ifli.rapid.model.Customer customer)
		throws SystemException {
		customer = toUnwrappedModel(customer);

		boolean isNew = customer.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customer.isNew()) {
				session.save(customer);

				customer.setNew(false);
			}
			else {
				session.merge(customer);
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

		EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerImpl.class, customer.getPrimaryKey(), customer);

		return customer;
	}

	protected Customer toUnwrappedModel(Customer customer) {
		if (customer instanceof CustomerImpl) {
			return customer;
		}

		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setNew(customer.isNew());
		customerImpl.setPrimaryKey(customer.getPrimaryKey());

		customerImpl.setCUSTOMER_ID(customer.getCUSTOMER_ID());
		customerImpl.setCUSTOMER_SALUTATION(customer.getCUSTOMER_SALUTATION());
		customerImpl.setCUSTOMER_FIRST_NAME(customer.getCUSTOMER_FIRST_NAME());
		customerImpl.setCUSTOMER_LAST_NAME(customer.getCUSTOMER_LAST_NAME());
		customerImpl.setCUSTOMER_MIDDLE_NAME(customer.getCUSTOMER_MIDDLE_NAME());
		customerImpl.setCUSTOMER_DATE_OF_BIRTH(customer.getCUSTOMER_DATE_OF_BIRTH());
		customerImpl.setCUSTOMER_EMAIL_ADDR(customer.getCUSTOMER_EMAIL_ADDR());
		customerImpl.setOFFICE_NAME(customer.getOFFICE_NAME());
		customerImpl.setDESIGNATION(customer.getDESIGNATION());
		customerImpl.setDEPARTMENT(customer.getDEPARTMENT());
		customerImpl.setPRIMARY_ADDRESS_LINE_1(customer.getPRIMARY_ADDRESS_LINE_1());
		customerImpl.setPRIMARY_ADDRESS_LINE_2(customer.getPRIMARY_ADDRESS_LINE_2());
		customerImpl.setPRIMARY_ADDRESS_LINE_3(customer.getPRIMARY_ADDRESS_LINE_3());
		customerImpl.setPRIMARY_ADDRESS_CITY(customer.getPRIMARY_ADDRESS_CITY());
		customerImpl.setPRIMARY_ADDRESS_STATE(customer.getPRIMARY_ADDRESS_STATE());
		customerImpl.setPRIMARY_ADDRESS_PINCODE(customer.getPRIMARY_ADDRESS_PINCODE());
		customerImpl.setPHONE_NUMBER_1(customer.getPHONE_NUMBER_1());
		customerImpl.setPHONE_NUMBER_2(customer.getPHONE_NUMBER_2());
		customerImpl.setPHONE_NUMBER_3(customer.getPHONE_NUMBER_3());
		customerImpl.setLOGIN_NAME(customer.getLOGIN_NAME());
		customerImpl.setGENDER(customer.getGENDER());
		customerImpl.setMARITAL_STATUS(customer.getMARITAL_STATUS());
		customerImpl.setCOUNTRY(customer.getCOUNTRY());
		customerImpl.setPRIMARY_ADDRESS_STATE_ID(customer.getPRIMARY_ADDRESS_STATE_ID());
		customerImpl.setPRIMARY_ADDRESS_CITY_ID(customer.getPRIMARY_ADDRESS_CITY_ID());
		customerImpl.setADDED_BY(customer.getADDED_BY());
		customerImpl.setADDED_DATE(customer.getADDED_DATE());
		customerImpl.setUPDATED_BY(customer.getUPDATED_BY());
		customerImpl.setUPDATED_DATE(customer.getUPDATED_DATE());
		customerImpl.setPANCARD(customer.getPANCARD());

		return customerImpl;
	}

	/**
	 * Returns the customer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer
	 * @return the customer
	 * @throws com.ifli.rapid.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerException, SystemException {
		Customer customer = fetchByPrimaryKey(primaryKey);

		if (customer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customer;
	}

	/**
	 * Returns the customer with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerException} if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the customer
	 * @return the customer
	 * @throws com.ifli.rapid.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer findByPrimaryKey(int CUSTOMER_ID)
		throws NoSuchCustomerException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer
	 * @return the customer, or <code>null</code> if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Customer customer = (Customer)EntityCacheUtil.getResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
				CustomerImpl.class, primaryKey);

		if (customer == _nullCustomer) {
			return null;
		}

		if (customer == null) {
			Session session = null;

			try {
				session = openSession();

				customer = (Customer)session.get(CustomerImpl.class, primaryKey);

				if (customer != null) {
					cacheResult(customer);
				}
				else {
					EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
						CustomerImpl.class, primaryKey, _nullCustomer);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
					CustomerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customer;
	}

	/**
	 * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the customer
	 * @return the customer, or <code>null</code> if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer fetchByPrimaryKey(int CUSTOMER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns all the customers.
	 *
	 * @return the customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Customer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customers
	 * @param end the upper bound of the range of customers (not inclusive)
	 * @return the range of customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Customer> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customers
	 * @param end the upper bound of the range of customers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Customer> findAll(int start, int end,
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

		List<Customer> list = (List<Customer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMER;

				if (pagination) {
					sql = sql.concat(CustomerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Customer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Customer>(list);
				}
				else {
					list = (List<Customer>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the customers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Customer customer : findAll()) {
			remove(customer);
		}
	}

	/**
	 * Returns the number of customers.
	 *
	 * @return the number of customers
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMER);

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
	 * Initializes the customer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.Customer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Customer>> listenersList = new ArrayList<ModelListener<Customer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Customer>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMER = "SELECT customer FROM Customer customer";
	private static final String _SQL_COUNT_CUSTOMER = "SELECT COUNT(customer) FROM Customer customer";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Customer exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerPersistenceImpl.class);
	private static Customer _nullCustomer = new CustomerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Customer> toCacheModel() {
				return _nullCustomerCacheModel;
			}
		};

	private static CacheModel<Customer> _nullCustomerCacheModel = new CacheModel<Customer>() {
			@Override
			public Customer toEntityModel() {
				return _nullCustomer;
			}
		};
}