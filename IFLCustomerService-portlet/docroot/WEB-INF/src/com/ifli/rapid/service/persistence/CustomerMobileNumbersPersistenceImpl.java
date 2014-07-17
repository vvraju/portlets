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

import com.ifli.rapid.NoSuchCustomerMobileNumbersException;
import com.ifli.rapid.model.CustomerMobileNumbers;
import com.ifli.rapid.model.impl.CustomerMobileNumbersImpl;
import com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl;

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
 * The persistence implementation for the customer mobile numbers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerMobileNumbersPersistence
 * @see CustomerMobileNumbersUtil
 * @generated
 */
public class CustomerMobileNumbersPersistenceImpl extends BasePersistenceImpl<CustomerMobileNumbers>
	implements CustomerMobileNumbersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerMobileNumbersUtil} to access the customer mobile numbers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerMobileNumbersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
			CustomerMobileNumbersModelImpl.FINDER_CACHE_ENABLED,
			CustomerMobileNumbersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
			CustomerMobileNumbersModelImpl.FINDER_CACHE_ENABLED,
			CustomerMobileNumbersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
			CustomerMobileNumbersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerMobileNumbersPersistenceImpl() {
		setModelClass(CustomerMobileNumbers.class);
	}

	/**
	 * Caches the customer mobile numbers in the entity cache if it is enabled.
	 *
	 * @param customerMobileNumbers the customer mobile numbers
	 */
	@Override
	public void cacheResult(CustomerMobileNumbers customerMobileNumbers) {
		EntityCacheUtil.putResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
			CustomerMobileNumbersImpl.class,
			customerMobileNumbers.getPrimaryKey(), customerMobileNumbers);

		customerMobileNumbers.resetOriginalValues();
	}

	/**
	 * Caches the customer mobile numberses in the entity cache if it is enabled.
	 *
	 * @param customerMobileNumberses the customer mobile numberses
	 */
	@Override
	public void cacheResult(List<CustomerMobileNumbers> customerMobileNumberses) {
		for (CustomerMobileNumbers customerMobileNumbers : customerMobileNumberses) {
			if (EntityCacheUtil.getResult(
						CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
						CustomerMobileNumbersImpl.class,
						customerMobileNumbers.getPrimaryKey()) == null) {
				cacheResult(customerMobileNumbers);
			}
			else {
				customerMobileNumbers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer mobile numberses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerMobileNumbersImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerMobileNumbersImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer mobile numbers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomerMobileNumbers customerMobileNumbers) {
		EntityCacheUtil.removeResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
			CustomerMobileNumbersImpl.class,
			customerMobileNumbers.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomerMobileNumbers> customerMobileNumberses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomerMobileNumbers customerMobileNumbers : customerMobileNumberses) {
			EntityCacheUtil.removeResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
				CustomerMobileNumbersImpl.class,
				customerMobileNumbers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer mobile numbers with the primary key. Does not add the customer mobile numbers to the database.
	 *
	 * @param ID the primary key for the new customer mobile numbers
	 * @return the new customer mobile numbers
	 */
	@Override
	public CustomerMobileNumbers create(int ID) {
		CustomerMobileNumbers customerMobileNumbers = new CustomerMobileNumbersImpl();

		customerMobileNumbers.setNew(true);
		customerMobileNumbers.setPrimaryKey(ID);

		return customerMobileNumbers;
	}

	/**
	 * Removes the customer mobile numbers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID the primary key of the customer mobile numbers
	 * @return the customer mobile numbers that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerMobileNumbersException if a customer mobile numbers with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerMobileNumbers remove(int ID)
		throws NoSuchCustomerMobileNumbersException, SystemException {
		return remove((Serializable)ID);
	}

	/**
	 * Removes the customer mobile numbers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer mobile numbers
	 * @return the customer mobile numbers that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerMobileNumbersException if a customer mobile numbers with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerMobileNumbers remove(Serializable primaryKey)
		throws NoSuchCustomerMobileNumbersException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomerMobileNumbers customerMobileNumbers = (CustomerMobileNumbers)session.get(CustomerMobileNumbersImpl.class,
					primaryKey);

			if (customerMobileNumbers == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerMobileNumbersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerMobileNumbers);
		}
		catch (NoSuchCustomerMobileNumbersException nsee) {
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
	protected CustomerMobileNumbers removeImpl(
		CustomerMobileNumbers customerMobileNumbers) throws SystemException {
		customerMobileNumbers = toUnwrappedModel(customerMobileNumbers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerMobileNumbers)) {
				customerMobileNumbers = (CustomerMobileNumbers)session.get(CustomerMobileNumbersImpl.class,
						customerMobileNumbers.getPrimaryKeyObj());
			}

			if (customerMobileNumbers != null) {
				session.delete(customerMobileNumbers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerMobileNumbers != null) {
			clearCache(customerMobileNumbers);
		}

		return customerMobileNumbers;
	}

	@Override
	public CustomerMobileNumbers updateImpl(
		com.ifli.rapid.model.CustomerMobileNumbers customerMobileNumbers)
		throws SystemException {
		customerMobileNumbers = toUnwrappedModel(customerMobileNumbers);

		boolean isNew = customerMobileNumbers.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerMobileNumbers.isNew()) {
				session.save(customerMobileNumbers);

				customerMobileNumbers.setNew(false);
			}
			else {
				session.merge(customerMobileNumbers);
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

		EntityCacheUtil.putResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
			CustomerMobileNumbersImpl.class,
			customerMobileNumbers.getPrimaryKey(), customerMobileNumbers);

		return customerMobileNumbers;
	}

	protected CustomerMobileNumbers toUnwrappedModel(
		CustomerMobileNumbers customerMobileNumbers) {
		if (customerMobileNumbers instanceof CustomerMobileNumbersImpl) {
			return customerMobileNumbers;
		}

		CustomerMobileNumbersImpl customerMobileNumbersImpl = new CustomerMobileNumbersImpl();

		customerMobileNumbersImpl.setNew(customerMobileNumbers.isNew());
		customerMobileNumbersImpl.setPrimaryKey(customerMobileNumbers.getPrimaryKey());

		customerMobileNumbersImpl.setID(customerMobileNumbers.getID());
		customerMobileNumbersImpl.setCUSTOMER_ID(customerMobileNumbers.getCUSTOMER_ID());
		customerMobileNumbersImpl.setMOBILE_NUMBER(customerMobileNumbers.getMOBILE_NUMBER());
		customerMobileNumbersImpl.setINSERTED_BY(customerMobileNumbers.getINSERTED_BY());
		customerMobileNumbersImpl.setINSERTED_DATE(customerMobileNumbers.getINSERTED_DATE());
		customerMobileNumbersImpl.setUPDATED_BY(customerMobileNumbers.getUPDATED_BY());
		customerMobileNumbersImpl.setUPDATED_DATE(customerMobileNumbers.getUPDATED_DATE());

		return customerMobileNumbersImpl;
	}

	/**
	 * Returns the customer mobile numbers with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer mobile numbers
	 * @return the customer mobile numbers
	 * @throws com.ifli.rapid.NoSuchCustomerMobileNumbersException if a customer mobile numbers with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerMobileNumbers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerMobileNumbersException, SystemException {
		CustomerMobileNumbers customerMobileNumbers = fetchByPrimaryKey(primaryKey);

		if (customerMobileNumbers == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerMobileNumbersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerMobileNumbers;
	}

	/**
	 * Returns the customer mobile numbers with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerMobileNumbersException} if it could not be found.
	 *
	 * @param ID the primary key of the customer mobile numbers
	 * @return the customer mobile numbers
	 * @throws com.ifli.rapid.NoSuchCustomerMobileNumbersException if a customer mobile numbers with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerMobileNumbers findByPrimaryKey(int ID)
		throws NoSuchCustomerMobileNumbersException, SystemException {
		return findByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns the customer mobile numbers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer mobile numbers
	 * @return the customer mobile numbers, or <code>null</code> if a customer mobile numbers with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerMobileNumbers fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomerMobileNumbers customerMobileNumbers = (CustomerMobileNumbers)EntityCacheUtil.getResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
				CustomerMobileNumbersImpl.class, primaryKey);

		if (customerMobileNumbers == _nullCustomerMobileNumbers) {
			return null;
		}

		if (customerMobileNumbers == null) {
			Session session = null;

			try {
				session = openSession();

				customerMobileNumbers = (CustomerMobileNumbers)session.get(CustomerMobileNumbersImpl.class,
						primaryKey);

				if (customerMobileNumbers != null) {
					cacheResult(customerMobileNumbers);
				}
				else {
					EntityCacheUtil.putResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
						CustomerMobileNumbersImpl.class, primaryKey,
						_nullCustomerMobileNumbers);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerMobileNumbersModelImpl.ENTITY_CACHE_ENABLED,
					CustomerMobileNumbersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerMobileNumbers;
	}

	/**
	 * Returns the customer mobile numbers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ID the primary key of the customer mobile numbers
	 * @return the customer mobile numbers, or <code>null</code> if a customer mobile numbers with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerMobileNumbers fetchByPrimaryKey(int ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ID);
	}

	/**
	 * Returns all the customer mobile numberses.
	 *
	 * @return the customer mobile numberses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerMobileNumbers> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer mobile numberses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer mobile numberses
	 * @param end the upper bound of the range of customer mobile numberses (not inclusive)
	 * @return the range of customer mobile numberses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerMobileNumbers> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer mobile numberses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerMobileNumbersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer mobile numberses
	 * @param end the upper bound of the range of customer mobile numberses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer mobile numberses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerMobileNumbers> findAll(int start, int end,
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

		List<CustomerMobileNumbers> list = (List<CustomerMobileNumbers>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERMOBILENUMBERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERMOBILENUMBERS;

				if (pagination) {
					sql = sql.concat(CustomerMobileNumbersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomerMobileNumbers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomerMobileNumbers>(list);
				}
				else {
					list = (List<CustomerMobileNumbers>)QueryUtil.list(q,
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
	 * Removes all the customer mobile numberses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomerMobileNumbers customerMobileNumbers : findAll()) {
			remove(customerMobileNumbers);
		}
	}

	/**
	 * Returns the number of customer mobile numberses.
	 *
	 * @return the number of customer mobile numberses
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERMOBILENUMBERS);

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
	 * Initializes the customer mobile numbers persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.CustomerMobileNumbers")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomerMobileNumbers>> listenersList = new ArrayList<ModelListener<CustomerMobileNumbers>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomerMobileNumbers>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerMobileNumbersImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERMOBILENUMBERS = "SELECT customerMobileNumbers FROM CustomerMobileNumbers customerMobileNumbers";
	private static final String _SQL_COUNT_CUSTOMERMOBILENUMBERS = "SELECT COUNT(customerMobileNumbers) FROM CustomerMobileNumbers customerMobileNumbers";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerMobileNumbers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerMobileNumbers exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerMobileNumbersPersistenceImpl.class);
	private static CustomerMobileNumbers _nullCustomerMobileNumbers = new CustomerMobileNumbersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomerMobileNumbers> toCacheModel() {
				return _nullCustomerMobileNumbersCacheModel;
			}
		};

	private static CacheModel<CustomerMobileNumbers> _nullCustomerMobileNumbersCacheModel =
		new CacheModel<CustomerMobileNumbers>() {
			@Override
			public CustomerMobileNumbers toEntityModel() {
				return _nullCustomerMobileNumbers;
			}
		};
}