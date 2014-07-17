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

import com.ifli.rapid.NoSuchcustomerAddressException;
import com.ifli.rapid.model.customerAddress;
import com.ifli.rapid.model.impl.customerAddressImpl;
import com.ifli.rapid.model.impl.customerAddressModelImpl;

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
 * The persistence implementation for the customer address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see customerAddressPersistence
 * @see customerAddressUtil
 * @generated
 */
public class customerAddressPersistenceImpl extends BasePersistenceImpl<customerAddress>
	implements customerAddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link customerAddressUtil} to access the customer address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = customerAddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
			customerAddressModelImpl.FINDER_CACHE_ENABLED,
			customerAddressImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
			customerAddressModelImpl.FINDER_CACHE_ENABLED,
			customerAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
			customerAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public customerAddressPersistenceImpl() {
		setModelClass(customerAddress.class);
	}

	/**
	 * Caches the customer address in the entity cache if it is enabled.
	 *
	 * @param customerAddress the customer address
	 */
	@Override
	public void cacheResult(customerAddress customerAddress) {
		EntityCacheUtil.putResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
			customerAddressImpl.class, customerAddress.getPrimaryKey(),
			customerAddress);

		customerAddress.resetOriginalValues();
	}

	/**
	 * Caches the customer addresses in the entity cache if it is enabled.
	 *
	 * @param customerAddresses the customer addresses
	 */
	@Override
	public void cacheResult(List<customerAddress> customerAddresses) {
		for (customerAddress customerAddress : customerAddresses) {
			if (EntityCacheUtil.getResult(
						customerAddressModelImpl.ENTITY_CACHE_ENABLED,
						customerAddressImpl.class,
						customerAddress.getPrimaryKey()) == null) {
				cacheResult(customerAddress);
			}
			else {
				customerAddress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer addresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(customerAddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(customerAddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer address.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(customerAddress customerAddress) {
		EntityCacheUtil.removeResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
			customerAddressImpl.class, customerAddress.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<customerAddress> customerAddresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (customerAddress customerAddress : customerAddresses) {
			EntityCacheUtil.removeResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
				customerAddressImpl.class, customerAddress.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer address with the primary key. Does not add the customer address to the database.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key for the new customer address
	 * @return the new customer address
	 */
	@Override
	public customerAddress create(int CUSTOMER_ADDRESS_ID) {
		customerAddress customerAddress = new customerAddressImpl();

		customerAddress.setNew(true);
		customerAddress.setPrimaryKey(CUSTOMER_ADDRESS_ID);

		return customerAddress;
	}

	/**
	 * Removes the customer address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	 * @return the customer address that was removed
	 * @throws com.ifli.rapid.NoSuchcustomerAddressException if a customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerAddress remove(int CUSTOMER_ADDRESS_ID)
		throws NoSuchcustomerAddressException, SystemException {
		return remove((Serializable)CUSTOMER_ADDRESS_ID);
	}

	/**
	 * Removes the customer address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer address
	 * @return the customer address that was removed
	 * @throws com.ifli.rapid.NoSuchcustomerAddressException if a customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerAddress remove(Serializable primaryKey)
		throws NoSuchcustomerAddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			customerAddress customerAddress = (customerAddress)session.get(customerAddressImpl.class,
					primaryKey);

			if (customerAddress == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcustomerAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerAddress);
		}
		catch (NoSuchcustomerAddressException nsee) {
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
	protected customerAddress removeImpl(customerAddress customerAddress)
		throws SystemException {
		customerAddress = toUnwrappedModel(customerAddress);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerAddress)) {
				customerAddress = (customerAddress)session.get(customerAddressImpl.class,
						customerAddress.getPrimaryKeyObj());
			}

			if (customerAddress != null) {
				session.delete(customerAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerAddress != null) {
			clearCache(customerAddress);
		}

		return customerAddress;
	}

	@Override
	public customerAddress updateImpl(
		com.ifli.rapid.model.customerAddress customerAddress)
		throws SystemException {
		customerAddress = toUnwrappedModel(customerAddress);

		boolean isNew = customerAddress.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerAddress.isNew()) {
				session.save(customerAddress);

				customerAddress.setNew(false);
			}
			else {
				session.merge(customerAddress);
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

		EntityCacheUtil.putResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
			customerAddressImpl.class, customerAddress.getPrimaryKey(),
			customerAddress);

		return customerAddress;
	}

	protected customerAddress toUnwrappedModel(customerAddress customerAddress) {
		if (customerAddress instanceof customerAddressImpl) {
			return customerAddress;
		}

		customerAddressImpl customerAddressImpl = new customerAddressImpl();

		customerAddressImpl.setNew(customerAddress.isNew());
		customerAddressImpl.setPrimaryKey(customerAddress.getPrimaryKey());

		customerAddressImpl.setCUSTOMER_ADDRESS_ID(customerAddress.getCUSTOMER_ADDRESS_ID());
		customerAddressImpl.setCUSTOMER_ID(customerAddress.getCUSTOMER_ID());
		customerAddressImpl.setADDRESS_LINE_1(customerAddress.getADDRESS_LINE_1());
		customerAddressImpl.setADDRESS_LINE_2(customerAddress.getADDRESS_LINE_2());
		customerAddressImpl.setADDRESS_LINE_3(customerAddress.getADDRESS_LINE_3());
		customerAddressImpl.setCHANGE_REQUEST_TYPE(customerAddress.getCHANGE_REQUEST_TYPE());
		customerAddressImpl.setCITY(customerAddress.getCITY());
		customerAddressImpl.setSTATE(customerAddress.getSTATE());
		customerAddressImpl.setCITY_ID(customerAddress.getCITY_ID());
		customerAddressImpl.setSTATE_ID(customerAddress.getSTATE_ID());
		customerAddressImpl.setPIN_CODE(customerAddress.getPIN_CODE());
		customerAddressImpl.setCHANGE_REQUEST_FOR(customerAddress.getCHANGE_REQUEST_FOR());
		customerAddressImpl.setADDRESS_TYPE_ID(customerAddress.getADDRESS_TYPE_ID());
		customerAddressImpl.setADDR_STATUS(customerAddress.getADDR_STATUS());
		customerAddressImpl.setINSERTED_BY(customerAddress.getINSERTED_BY());
		customerAddressImpl.setINSERTED_DATE(customerAddress.getINSERTED_DATE());
		customerAddressImpl.setUPDATED_BY(customerAddress.getUPDATED_BY());
		customerAddressImpl.setUPDATED_DATE(customerAddress.getUPDATED_DATE());

		return customerAddressImpl;
	}

	/**
	 * Returns the customer address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer address
	 * @return the customer address
	 * @throws com.ifli.rapid.NoSuchcustomerAddressException if a customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcustomerAddressException, SystemException {
		customerAddress customerAddress = fetchByPrimaryKey(primaryKey);

		if (customerAddress == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcustomerAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerAddress;
	}

	/**
	 * Returns the customer address with the primary key or throws a {@link com.ifli.rapid.NoSuchcustomerAddressException} if it could not be found.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	 * @return the customer address
	 * @throws com.ifli.rapid.NoSuchcustomerAddressException if a customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerAddress findByPrimaryKey(int CUSTOMER_ADDRESS_ID)
		throws NoSuchcustomerAddressException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_ADDRESS_ID);
	}

	/**
	 * Returns the customer address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer address
	 * @return the customer address, or <code>null</code> if a customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerAddress fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		customerAddress customerAddress = (customerAddress)EntityCacheUtil.getResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
				customerAddressImpl.class, primaryKey);

		if (customerAddress == _nullcustomerAddress) {
			return null;
		}

		if (customerAddress == null) {
			Session session = null;

			try {
				session = openSession();

				customerAddress = (customerAddress)session.get(customerAddressImpl.class,
						primaryKey);

				if (customerAddress != null) {
					cacheResult(customerAddress);
				}
				else {
					EntityCacheUtil.putResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
						customerAddressImpl.class, primaryKey,
						_nullcustomerAddress);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(customerAddressModelImpl.ENTITY_CACHE_ENABLED,
					customerAddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerAddress;
	}

	/**
	 * Returns the customer address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key of the customer address
	 * @return the customer address, or <code>null</code> if a customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public customerAddress fetchByPrimaryKey(int CUSTOMER_ADDRESS_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_ADDRESS_ID);
	}

	/**
	 * Returns all the customer addresses.
	 *
	 * @return the customer addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<customerAddress> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer addresses
	 * @param end the upper bound of the range of customer addresses (not inclusive)
	 * @return the range of customer addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<customerAddress> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.customerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer addresses
	 * @param end the upper bound of the range of customer addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<customerAddress> findAll(int start, int end,
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

		List<customerAddress> list = (List<customerAddress>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERADDRESS;

				if (pagination) {
					sql = sql.concat(customerAddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<customerAddress>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<customerAddress>(list);
				}
				else {
					list = (List<customerAddress>)QueryUtil.list(q,
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
	 * Removes all the customer addresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (customerAddress customerAddress : findAll()) {
			remove(customerAddress);
		}
	}

	/**
	 * Returns the number of customer addresses.
	 *
	 * @return the number of customer addresses
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERADDRESS);

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
	 * Initializes the customer address persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.customerAddress")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<customerAddress>> listenersList = new ArrayList<ModelListener<customerAddress>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<customerAddress>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(customerAddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERADDRESS = "SELECT customerAddress FROM customerAddress customerAddress";
	private static final String _SQL_COUNT_CUSTOMERADDRESS = "SELECT COUNT(customerAddress) FROM customerAddress customerAddress";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerAddress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No customerAddress exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(customerAddressPersistenceImpl.class);
	private static customerAddress _nullcustomerAddress = new customerAddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<customerAddress> toCacheModel() {
				return _nullcustomerAddressCacheModel;
			}
		};

	private static CacheModel<customerAddress> _nullcustomerAddressCacheModel = new CacheModel<customerAddress>() {
			@Override
			public customerAddress toEntityModel() {
				return _nullcustomerAddress;
			}
		};
}