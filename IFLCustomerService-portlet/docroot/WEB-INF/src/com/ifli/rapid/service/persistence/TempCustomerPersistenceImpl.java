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

import com.ifli.rapid.NoSuchTempCustomerException;
import com.ifli.rapid.model.TempCustomer;
import com.ifli.rapid.model.impl.TempCustomerImpl;
import com.ifli.rapid.model.impl.TempCustomerModelImpl;

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
 * The persistence implementation for the temp customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomerPersistence
 * @see TempCustomerUtil
 * @generated
 */
public class TempCustomerPersistenceImpl extends BasePersistenceImpl<TempCustomer>
	implements TempCustomerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCustomerUtil} to access the temp customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCustomerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerModelImpl.FINDER_CACHE_ENABLED, TempCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerModelImpl.FINDER_CACHE_ENABLED, TempCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TempCustomerPersistenceImpl() {
		setModelClass(TempCustomer.class);
	}

	/**
	 * Caches the temp customer in the entity cache if it is enabled.
	 *
	 * @param tempCustomer the temp customer
	 */
	@Override
	public void cacheResult(TempCustomer tempCustomer) {
		EntityCacheUtil.putResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerImpl.class, tempCustomer.getPrimaryKey(), tempCustomer);

		tempCustomer.resetOriginalValues();
	}

	/**
	 * Caches the temp customers in the entity cache if it is enabled.
	 *
	 * @param tempCustomers the temp customers
	 */
	@Override
	public void cacheResult(List<TempCustomer> tempCustomers) {
		for (TempCustomer tempCustomer : tempCustomers) {
			if (EntityCacheUtil.getResult(
						TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
						TempCustomerImpl.class, tempCustomer.getPrimaryKey()) == null) {
				cacheResult(tempCustomer);
			}
			else {
				tempCustomer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp customers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCustomerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCustomerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp customer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempCustomer tempCustomer) {
		EntityCacheUtil.removeResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerImpl.class, tempCustomer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempCustomer> tempCustomers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCustomer tempCustomer : tempCustomers) {
			EntityCacheUtil.removeResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
				TempCustomerImpl.class, tempCustomer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp customer with the primary key. Does not add the temp customer to the database.
	 *
	 * @param CUSTOMER_ID the primary key for the new temp customer
	 * @return the new temp customer
	 */
	@Override
	public TempCustomer create(int CUSTOMER_ID) {
		TempCustomer tempCustomer = new TempCustomerImpl();

		tempCustomer.setNew(true);
		tempCustomer.setPrimaryKey(CUSTOMER_ID);

		return tempCustomer;
	}

	/**
	 * Removes the temp customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_ID the primary key of the temp customer
	 * @return the temp customer that was removed
	 * @throws com.ifli.rapid.NoSuchTempCustomerException if a temp customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomer remove(int CUSTOMER_ID)
		throws NoSuchTempCustomerException, SystemException {
		return remove((Serializable)CUSTOMER_ID);
	}

	/**
	 * Removes the temp customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp customer
	 * @return the temp customer that was removed
	 * @throws com.ifli.rapid.NoSuchTempCustomerException if a temp customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomer remove(Serializable primaryKey)
		throws NoSuchTempCustomerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCustomer tempCustomer = (TempCustomer)session.get(TempCustomerImpl.class,
					primaryKey);

			if (tempCustomer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCustomer);
		}
		catch (NoSuchTempCustomerException nsee) {
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
	protected TempCustomer removeImpl(TempCustomer tempCustomer)
		throws SystemException {
		tempCustomer = toUnwrappedModel(tempCustomer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempCustomer)) {
				tempCustomer = (TempCustomer)session.get(TempCustomerImpl.class,
						tempCustomer.getPrimaryKeyObj());
			}

			if (tempCustomer != null) {
				session.delete(tempCustomer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempCustomer != null) {
			clearCache(tempCustomer);
		}

		return tempCustomer;
	}

	@Override
	public TempCustomer updateImpl(
		com.ifli.rapid.model.TempCustomer tempCustomer)
		throws SystemException {
		tempCustomer = toUnwrappedModel(tempCustomer);

		boolean isNew = tempCustomer.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tempCustomer.isNew()) {
				session.save(tempCustomer);

				tempCustomer.setNew(false);
			}
			else {
				session.merge(tempCustomer);
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

		EntityCacheUtil.putResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerImpl.class, tempCustomer.getPrimaryKey(), tempCustomer);

		return tempCustomer;
	}

	protected TempCustomer toUnwrappedModel(TempCustomer tempCustomer) {
		if (tempCustomer instanceof TempCustomerImpl) {
			return tempCustomer;
		}

		TempCustomerImpl tempCustomerImpl = new TempCustomerImpl();

		tempCustomerImpl.setNew(tempCustomer.isNew());
		tempCustomerImpl.setPrimaryKey(tempCustomer.getPrimaryKey());

		tempCustomerImpl.setCUSTOMER_ID(tempCustomer.getCUSTOMER_ID());
		tempCustomerImpl.setCUSTOMER_SALUTATION(tempCustomer.getCUSTOMER_SALUTATION());
		tempCustomerImpl.setCUSTOMER_FIRST_NAME(tempCustomer.getCUSTOMER_FIRST_NAME());
		tempCustomerImpl.setCUSTOMER_LAST_NAME(tempCustomer.getCUSTOMER_LAST_NAME());
		tempCustomerImpl.setCUSTOMER_MIDDLE_NAME(tempCustomer.getCUSTOMER_MIDDLE_NAME());
		tempCustomerImpl.setCUSTOMER_DATE_OF_BIRTH(tempCustomer.getCUSTOMER_DATE_OF_BIRTH());
		tempCustomerImpl.setCUSTOMER_EMAIL_ADDR(tempCustomer.getCUSTOMER_EMAIL_ADDR());
		tempCustomerImpl.setOFFICE_NAME(tempCustomer.getOFFICE_NAME());
		tempCustomerImpl.setDESIGNATION(tempCustomer.getDESIGNATION());
		tempCustomerImpl.setDEPARTMENT(tempCustomer.getDEPARTMENT());
		tempCustomerImpl.setPRIMARY_ADDRESS_LINE_1(tempCustomer.getPRIMARY_ADDRESS_LINE_1());
		tempCustomerImpl.setPRIMARY_ADDRESS_LINE_2(tempCustomer.getPRIMARY_ADDRESS_LINE_2());
		tempCustomerImpl.setPRIMARY_ADDRESS_LINE_3(tempCustomer.getPRIMARY_ADDRESS_LINE_3());
		tempCustomerImpl.setPRIMARY_ADDRESS_CITY(tempCustomer.getPRIMARY_ADDRESS_CITY());
		tempCustomerImpl.setPRIMARY_ADDRESS_STATE(tempCustomer.getPRIMARY_ADDRESS_STATE());
		tempCustomerImpl.setPRIMARY_ADDRESS_PINCODE(tempCustomer.getPRIMARY_ADDRESS_PINCODE());
		tempCustomerImpl.setPHONE_NUMBER_1(tempCustomer.getPHONE_NUMBER_1());
		tempCustomerImpl.setPHONE_NUMBER_2(tempCustomer.getPHONE_NUMBER_2());
		tempCustomerImpl.setPHONE_NUMBER_3(tempCustomer.getPHONE_NUMBER_3());
		tempCustomerImpl.setLOGIN_NAME(tempCustomer.getLOGIN_NAME());
		tempCustomerImpl.setGENDER(tempCustomer.getGENDER());
		tempCustomerImpl.setMARITAL_STATUS(tempCustomer.getMARITAL_STATUS());
		tempCustomerImpl.setCOUNTRY(tempCustomer.getCOUNTRY());
		tempCustomerImpl.setPRIMARY_ADDRESS_STATE_ID(tempCustomer.getPRIMARY_ADDRESS_STATE_ID());
		tempCustomerImpl.setPRIMARY_ADDRESS_CITY_ID(tempCustomer.getPRIMARY_ADDRESS_CITY_ID());
		tempCustomerImpl.setQRC_ASR_ID(tempCustomer.getQRC_ASR_ID());
		tempCustomerImpl.setPANCARD(tempCustomer.getPANCARD());

		return tempCustomerImpl;
	}

	/**
	 * Returns the temp customer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp customer
	 * @return the temp customer
	 * @throws com.ifli.rapid.NoSuchTempCustomerException if a temp customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempCustomerException, SystemException {
		TempCustomer tempCustomer = fetchByPrimaryKey(primaryKey);

		if (tempCustomer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempCustomer;
	}

	/**
	 * Returns the temp customer with the primary key or throws a {@link com.ifli.rapid.NoSuchTempCustomerException} if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the temp customer
	 * @return the temp customer
	 * @throws com.ifli.rapid.NoSuchTempCustomerException if a temp customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomer findByPrimaryKey(int CUSTOMER_ID)
		throws NoSuchTempCustomerException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns the temp customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp customer
	 * @return the temp customer, or <code>null</code> if a temp customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempCustomer tempCustomer = (TempCustomer)EntityCacheUtil.getResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
				TempCustomerImpl.class, primaryKey);

		if (tempCustomer == _nullTempCustomer) {
			return null;
		}

		if (tempCustomer == null) {
			Session session = null;

			try {
				session = openSession();

				tempCustomer = (TempCustomer)session.get(TempCustomerImpl.class,
						primaryKey);

				if (tempCustomer != null) {
					cacheResult(tempCustomer);
				}
				else {
					EntityCacheUtil.putResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
						TempCustomerImpl.class, primaryKey, _nullTempCustomer);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempCustomerModelImpl.ENTITY_CACHE_ENABLED,
					TempCustomerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempCustomer;
	}

	/**
	 * Returns the temp customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_ID the primary key of the temp customer
	 * @return the temp customer, or <code>null</code> if a temp customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomer fetchByPrimaryKey(int CUSTOMER_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_ID);
	}

	/**
	 * Returns all the temp customers.
	 *
	 * @return the temp customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCustomer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp customers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp customers
	 * @param end the upper bound of the range of temp customers (not inclusive)
	 * @return the range of temp customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCustomer> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp customers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp customers
	 * @param end the upper bound of the range of temp customers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCustomer> findAll(int start, int end,
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

		List<TempCustomer> list = (List<TempCustomer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCUSTOMER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCUSTOMER;

				if (pagination) {
					sql = sql.concat(TempCustomerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempCustomer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCustomer>(list);
				}
				else {
					list = (List<TempCustomer>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the temp customers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempCustomer tempCustomer : findAll()) {
			remove(tempCustomer);
		}
	}

	/**
	 * Returns the number of temp customers.
	 *
	 * @return the number of temp customers
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

				Query q = session.createQuery(_SQL_COUNT_TEMPCUSTOMER);

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
	 * Initializes the temp customer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.TempCustomer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCustomer>> listenersList = new ArrayList<ModelListener<TempCustomer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCustomer>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCustomerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPCUSTOMER = "SELECT tempCustomer FROM TempCustomer tempCustomer";
	private static final String _SQL_COUNT_TEMPCUSTOMER = "SELECT COUNT(tempCustomer) FROM TempCustomer tempCustomer";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCustomer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCustomer exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCustomerPersistenceImpl.class);
	private static TempCustomer _nullTempCustomer = new TempCustomerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCustomer> toCacheModel() {
				return _nullTempCustomerCacheModel;
			}
		};

	private static CacheModel<TempCustomer> _nullTempCustomerCacheModel = new CacheModel<TempCustomer>() {
			@Override
			public TempCustomer toEntityModel() {
				return _nullTempCustomer;
			}
		};
}