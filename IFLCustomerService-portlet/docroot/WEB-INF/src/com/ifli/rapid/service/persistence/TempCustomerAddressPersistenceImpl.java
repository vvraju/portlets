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

import com.ifli.rapid.NoSuchTempCustomerAddressException;
import com.ifli.rapid.model.TempCustomerAddress;
import com.ifli.rapid.model.impl.TempCustomerAddressImpl;
import com.ifli.rapid.model.impl.TempCustomerAddressModelImpl;

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
 * The persistence implementation for the temp customer address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see TempCustomerAddressPersistence
 * @see TempCustomerAddressUtil
 * @generated
 */
public class TempCustomerAddressPersistenceImpl extends BasePersistenceImpl<TempCustomerAddress>
	implements TempCustomerAddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCustomerAddressUtil} to access the temp customer address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCustomerAddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerAddressModelImpl.FINDER_CACHE_ENABLED,
			TempCustomerAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerAddressModelImpl.FINDER_CACHE_ENABLED,
			TempCustomerAddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerAddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TempCustomerAddressPersistenceImpl() {
		setModelClass(TempCustomerAddress.class);
	}

	/**
	 * Caches the temp customer address in the entity cache if it is enabled.
	 *
	 * @param tempCustomerAddress the temp customer address
	 */
	@Override
	public void cacheResult(TempCustomerAddress tempCustomerAddress) {
		EntityCacheUtil.putResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerAddressImpl.class, tempCustomerAddress.getPrimaryKey(),
			tempCustomerAddress);

		tempCustomerAddress.resetOriginalValues();
	}

	/**
	 * Caches the temp customer addresses in the entity cache if it is enabled.
	 *
	 * @param tempCustomerAddresses the temp customer addresses
	 */
	@Override
	public void cacheResult(List<TempCustomerAddress> tempCustomerAddresses) {
		for (TempCustomerAddress tempCustomerAddress : tempCustomerAddresses) {
			if (EntityCacheUtil.getResult(
						TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
						TempCustomerAddressImpl.class,
						tempCustomerAddress.getPrimaryKey()) == null) {
				cacheResult(tempCustomerAddress);
			}
			else {
				tempCustomerAddress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp customer addresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCustomerAddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCustomerAddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp customer address.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempCustomerAddress tempCustomerAddress) {
		EntityCacheUtil.removeResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerAddressImpl.class, tempCustomerAddress.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempCustomerAddress> tempCustomerAddresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCustomerAddress tempCustomerAddress : tempCustomerAddresses) {
			EntityCacheUtil.removeResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
				TempCustomerAddressImpl.class,
				tempCustomerAddress.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp customer address with the primary key. Does not add the temp customer address to the database.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key for the new temp customer address
	 * @return the new temp customer address
	 */
	@Override
	public TempCustomerAddress create(int CUSTOMER_ADDRESS_ID) {
		TempCustomerAddress tempCustomerAddress = new TempCustomerAddressImpl();

		tempCustomerAddress.setNew(true);
		tempCustomerAddress.setPrimaryKey(CUSTOMER_ADDRESS_ID);

		return tempCustomerAddress;
	}

	/**
	 * Removes the temp customer address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	 * @return the temp customer address that was removed
	 * @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomerAddress remove(int CUSTOMER_ADDRESS_ID)
		throws NoSuchTempCustomerAddressException, SystemException {
		return remove((Serializable)CUSTOMER_ADDRESS_ID);
	}

	/**
	 * Removes the temp customer address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp customer address
	 * @return the temp customer address that was removed
	 * @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomerAddress remove(Serializable primaryKey)
		throws NoSuchTempCustomerAddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCustomerAddress tempCustomerAddress = (TempCustomerAddress)session.get(TempCustomerAddressImpl.class,
					primaryKey);

			if (tempCustomerAddress == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCustomerAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCustomerAddress);
		}
		catch (NoSuchTempCustomerAddressException nsee) {
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
	protected TempCustomerAddress removeImpl(
		TempCustomerAddress tempCustomerAddress) throws SystemException {
		tempCustomerAddress = toUnwrappedModel(tempCustomerAddress);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempCustomerAddress)) {
				tempCustomerAddress = (TempCustomerAddress)session.get(TempCustomerAddressImpl.class,
						tempCustomerAddress.getPrimaryKeyObj());
			}

			if (tempCustomerAddress != null) {
				session.delete(tempCustomerAddress);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempCustomerAddress != null) {
			clearCache(tempCustomerAddress);
		}

		return tempCustomerAddress;
	}

	@Override
	public TempCustomerAddress updateImpl(
		com.ifli.rapid.model.TempCustomerAddress tempCustomerAddress)
		throws SystemException {
		tempCustomerAddress = toUnwrappedModel(tempCustomerAddress);

		boolean isNew = tempCustomerAddress.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tempCustomerAddress.isNew()) {
				session.save(tempCustomerAddress);

				tempCustomerAddress.setNew(false);
			}
			else {
				session.merge(tempCustomerAddress);
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

		EntityCacheUtil.putResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
			TempCustomerAddressImpl.class, tempCustomerAddress.getPrimaryKey(),
			tempCustomerAddress);

		return tempCustomerAddress;
	}

	protected TempCustomerAddress toUnwrappedModel(
		TempCustomerAddress tempCustomerAddress) {
		if (tempCustomerAddress instanceof TempCustomerAddressImpl) {
			return tempCustomerAddress;
		}

		TempCustomerAddressImpl tempCustomerAddressImpl = new TempCustomerAddressImpl();

		tempCustomerAddressImpl.setNew(tempCustomerAddress.isNew());
		tempCustomerAddressImpl.setPrimaryKey(tempCustomerAddress.getPrimaryKey());

		tempCustomerAddressImpl.setCUSTOMER_ADDRESS_ID(tempCustomerAddress.getCUSTOMER_ADDRESS_ID());
		tempCustomerAddressImpl.setCUSTOMER_ID(tempCustomerAddress.getCUSTOMER_ID());
		tempCustomerAddressImpl.setADDRESS_LINE_1(tempCustomerAddress.getADDRESS_LINE_1());
		tempCustomerAddressImpl.setADDRESS_LINE_2(tempCustomerAddress.getADDRESS_LINE_2());
		tempCustomerAddressImpl.setADDRESS_LINE_3(tempCustomerAddress.getADDRESS_LINE_3());
		tempCustomerAddressImpl.setCHANGE_REQUEST_TYPE(tempCustomerAddress.getCHANGE_REQUEST_TYPE());
		tempCustomerAddressImpl.setCITY(tempCustomerAddress.getCITY());
		tempCustomerAddressImpl.setSTATE(tempCustomerAddress.getSTATE());
		tempCustomerAddressImpl.setCITY_ID(tempCustomerAddress.getCITY_ID());
		tempCustomerAddressImpl.setSTATE_ID(tempCustomerAddress.getSTATE_ID());
		tempCustomerAddressImpl.setPIN_CODE(tempCustomerAddress.getPIN_CODE());
		tempCustomerAddressImpl.setCHANGE_REQUEST_FOR(tempCustomerAddress.getCHANGE_REQUEST_FOR());
		tempCustomerAddressImpl.setADDRESS_TYPE_ID(tempCustomerAddress.getADDRESS_TYPE_ID());
		tempCustomerAddressImpl.setADDR_STATUS(tempCustomerAddress.getADDR_STATUS());
		tempCustomerAddressImpl.setINSERTED_BY(tempCustomerAddress.getINSERTED_BY());
		tempCustomerAddressImpl.setINSERTED_DATE(tempCustomerAddress.getINSERTED_DATE());
		tempCustomerAddressImpl.setUPDATED_BY(tempCustomerAddress.getUPDATED_BY());
		tempCustomerAddressImpl.setUPDATED_DATE(tempCustomerAddress.getUPDATED_DATE());
		tempCustomerAddressImpl.setQRC_ASR_ID(tempCustomerAddress.getQRC_ASR_ID());

		return tempCustomerAddressImpl;
	}

	/**
	 * Returns the temp customer address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp customer address
	 * @return the temp customer address
	 * @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomerAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempCustomerAddressException, SystemException {
		TempCustomerAddress tempCustomerAddress = fetchByPrimaryKey(primaryKey);

		if (tempCustomerAddress == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempCustomerAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempCustomerAddress;
	}

	/**
	 * Returns the temp customer address with the primary key or throws a {@link com.ifli.rapid.NoSuchTempCustomerAddressException} if it could not be found.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	 * @return the temp customer address
	 * @throws com.ifli.rapid.NoSuchTempCustomerAddressException if a temp customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomerAddress findByPrimaryKey(int CUSTOMER_ADDRESS_ID)
		throws NoSuchTempCustomerAddressException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_ADDRESS_ID);
	}

	/**
	 * Returns the temp customer address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp customer address
	 * @return the temp customer address, or <code>null</code> if a temp customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomerAddress fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempCustomerAddress tempCustomerAddress = (TempCustomerAddress)EntityCacheUtil.getResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
				TempCustomerAddressImpl.class, primaryKey);

		if (tempCustomerAddress == _nullTempCustomerAddress) {
			return null;
		}

		if (tempCustomerAddress == null) {
			Session session = null;

			try {
				session = openSession();

				tempCustomerAddress = (TempCustomerAddress)session.get(TempCustomerAddressImpl.class,
						primaryKey);

				if (tempCustomerAddress != null) {
					cacheResult(tempCustomerAddress);
				}
				else {
					EntityCacheUtil.putResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
						TempCustomerAddressImpl.class, primaryKey,
						_nullTempCustomerAddress);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempCustomerAddressModelImpl.ENTITY_CACHE_ENABLED,
					TempCustomerAddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempCustomerAddress;
	}

	/**
	 * Returns the temp customer address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_ADDRESS_ID the primary key of the temp customer address
	 * @return the temp customer address, or <code>null</code> if a temp customer address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCustomerAddress fetchByPrimaryKey(int CUSTOMER_ADDRESS_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_ADDRESS_ID);
	}

	/**
	 * Returns all the temp customer addresses.
	 *
	 * @return the temp customer addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCustomerAddress> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp customer addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp customer addresses
	 * @param end the upper bound of the range of temp customer addresses (not inclusive)
	 * @return the range of temp customer addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCustomerAddress> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp customer addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.TempCustomerAddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp customer addresses
	 * @param end the upper bound of the range of temp customer addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp customer addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCustomerAddress> findAll(int start, int end,
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

		List<TempCustomerAddress> list = (List<TempCustomerAddress>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCUSTOMERADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCUSTOMERADDRESS;

				if (pagination) {
					sql = sql.concat(TempCustomerAddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempCustomerAddress>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCustomerAddress>(list);
				}
				else {
					list = (List<TempCustomerAddress>)QueryUtil.list(q,
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
	 * Removes all the temp customer addresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempCustomerAddress tempCustomerAddress : findAll()) {
			remove(tempCustomerAddress);
		}
	}

	/**
	 * Returns the number of temp customer addresses.
	 *
	 * @return the number of temp customer addresses
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

				Query q = session.createQuery(_SQL_COUNT_TEMPCUSTOMERADDRESS);

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
	 * Initializes the temp customer address persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.TempCustomerAddress")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCustomerAddress>> listenersList = new ArrayList<ModelListener<TempCustomerAddress>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCustomerAddress>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCustomerAddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPCUSTOMERADDRESS = "SELECT tempCustomerAddress FROM TempCustomerAddress tempCustomerAddress";
	private static final String _SQL_COUNT_TEMPCUSTOMERADDRESS = "SELECT COUNT(tempCustomerAddress) FROM TempCustomerAddress tempCustomerAddress";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCustomerAddress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCustomerAddress exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCustomerAddressPersistenceImpl.class);
	private static TempCustomerAddress _nullTempCustomerAddress = new TempCustomerAddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCustomerAddress> toCacheModel() {
				return _nullTempCustomerAddressCacheModel;
			}
		};

	private static CacheModel<TempCustomerAddress> _nullTempCustomerAddressCacheModel =
		new CacheModel<TempCustomerAddress>() {
			@Override
			public TempCustomerAddress toEntityModel() {
				return _nullTempCustomerAddress;
			}
		};
}