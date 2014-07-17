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

import com.ifli.rapid.NoSuchAddressTypeException;
import com.ifli.rapid.model.AddressType;
import com.ifli.rapid.model.impl.AddressTypeImpl;
import com.ifli.rapid.model.impl.AddressTypeModelImpl;

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
 * The persistence implementation for the address type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see AddressTypePersistence
 * @see AddressTypeUtil
 * @generated
 */
public class AddressTypePersistenceImpl extends BasePersistenceImpl<AddressType>
	implements AddressTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AddressTypeUtil} to access the address type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AddressTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
			AddressTypeModelImpl.FINDER_CACHE_ENABLED, AddressTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
			AddressTypeModelImpl.FINDER_CACHE_ENABLED, AddressTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
			AddressTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AddressTypePersistenceImpl() {
		setModelClass(AddressType.class);
	}

	/**
	 * Caches the address type in the entity cache if it is enabled.
	 *
	 * @param addressType the address type
	 */
	@Override
	public void cacheResult(AddressType addressType) {
		EntityCacheUtil.putResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
			AddressTypeImpl.class, addressType.getPrimaryKey(), addressType);

		addressType.resetOriginalValues();
	}

	/**
	 * Caches the address types in the entity cache if it is enabled.
	 *
	 * @param addressTypes the address types
	 */
	@Override
	public void cacheResult(List<AddressType> addressTypes) {
		for (AddressType addressType : addressTypes) {
			if (EntityCacheUtil.getResult(
						AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
						AddressTypeImpl.class, addressType.getPrimaryKey()) == null) {
				cacheResult(addressType);
			}
			else {
				addressType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all address types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AddressTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AddressTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the address type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddressType addressType) {
		EntityCacheUtil.removeResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
			AddressTypeImpl.class, addressType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AddressType> addressTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AddressType addressType : addressTypes) {
			EntityCacheUtil.removeResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
				AddressTypeImpl.class, addressType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new address type with the primary key. Does not add the address type to the database.
	 *
	 * @param ADDRESS_TYPE_ID the primary key for the new address type
	 * @return the new address type
	 */
	@Override
	public AddressType create(int ADDRESS_TYPE_ID) {
		AddressType addressType = new AddressTypeImpl();

		addressType.setNew(true);
		addressType.setPrimaryKey(ADDRESS_TYPE_ID);

		return addressType;
	}

	/**
	 * Removes the address type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ADDRESS_TYPE_ID the primary key of the address type
	 * @return the address type that was removed
	 * @throws com.ifli.rapid.NoSuchAddressTypeException if a address type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressType remove(int ADDRESS_TYPE_ID)
		throws NoSuchAddressTypeException, SystemException {
		return remove((Serializable)ADDRESS_TYPE_ID);
	}

	/**
	 * Removes the address type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the address type
	 * @return the address type that was removed
	 * @throws com.ifli.rapid.NoSuchAddressTypeException if a address type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressType remove(Serializable primaryKey)
		throws NoSuchAddressTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AddressType addressType = (AddressType)session.get(AddressTypeImpl.class,
					primaryKey);

			if (addressType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddressTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(addressType);
		}
		catch (NoSuchAddressTypeException nsee) {
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
	protected AddressType removeImpl(AddressType addressType)
		throws SystemException {
		addressType = toUnwrappedModel(addressType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addressType)) {
				addressType = (AddressType)session.get(AddressTypeImpl.class,
						addressType.getPrimaryKeyObj());
			}

			if (addressType != null) {
				session.delete(addressType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (addressType != null) {
			clearCache(addressType);
		}

		return addressType;
	}

	@Override
	public AddressType updateImpl(com.ifli.rapid.model.AddressType addressType)
		throws SystemException {
		addressType = toUnwrappedModel(addressType);

		boolean isNew = addressType.isNew();

		Session session = null;

		try {
			session = openSession();

			if (addressType.isNew()) {
				session.save(addressType);

				addressType.setNew(false);
			}
			else {
				session.merge(addressType);
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

		EntityCacheUtil.putResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
			AddressTypeImpl.class, addressType.getPrimaryKey(), addressType);

		return addressType;
	}

	protected AddressType toUnwrappedModel(AddressType addressType) {
		if (addressType instanceof AddressTypeImpl) {
			return addressType;
		}

		AddressTypeImpl addressTypeImpl = new AddressTypeImpl();

		addressTypeImpl.setNew(addressType.isNew());
		addressTypeImpl.setPrimaryKey(addressType.getPrimaryKey());

		addressTypeImpl.setADDRESS_TYPE_ID(addressType.getADDRESS_TYPE_ID());
		addressTypeImpl.setINSERTED_BY(addressType.getINSERTED_BY());
		addressTypeImpl.setINSERTED_DATE(addressType.getINSERTED_DATE());
		addressTypeImpl.setUPDATED_BY(addressType.getUPDATED_BY());
		addressTypeImpl.setUPDATED_DATE(addressType.getUPDATED_DATE());
		addressTypeImpl.setACTIVE_FLAG(addressType.getACTIVE_FLAG());
		addressTypeImpl.setADDRESS_TYPE_DESC(addressType.getADDRESS_TYPE_DESC());

		return addressTypeImpl;
	}

	/**
	 * Returns the address type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the address type
	 * @return the address type
	 * @throws com.ifli.rapid.NoSuchAddressTypeException if a address type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddressTypeException, SystemException {
		AddressType addressType = fetchByPrimaryKey(primaryKey);

		if (addressType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddressTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return addressType;
	}

	/**
	 * Returns the address type with the primary key or throws a {@link com.ifli.rapid.NoSuchAddressTypeException} if it could not be found.
	 *
	 * @param ADDRESS_TYPE_ID the primary key of the address type
	 * @return the address type
	 * @throws com.ifli.rapid.NoSuchAddressTypeException if a address type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressType findByPrimaryKey(int ADDRESS_TYPE_ID)
		throws NoSuchAddressTypeException, SystemException {
		return findByPrimaryKey((Serializable)ADDRESS_TYPE_ID);
	}

	/**
	 * Returns the address type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the address type
	 * @return the address type, or <code>null</code> if a address type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AddressType addressType = (AddressType)EntityCacheUtil.getResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
				AddressTypeImpl.class, primaryKey);

		if (addressType == _nullAddressType) {
			return null;
		}

		if (addressType == null) {
			Session session = null;

			try {
				session = openSession();

				addressType = (AddressType)session.get(AddressTypeImpl.class,
						primaryKey);

				if (addressType != null) {
					cacheResult(addressType);
				}
				else {
					EntityCacheUtil.putResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
						AddressTypeImpl.class, primaryKey, _nullAddressType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AddressTypeModelImpl.ENTITY_CACHE_ENABLED,
					AddressTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return addressType;
	}

	/**
	 * Returns the address type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ADDRESS_TYPE_ID the primary key of the address type
	 * @return the address type, or <code>null</code> if a address type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressType fetchByPrimaryKey(int ADDRESS_TYPE_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ADDRESS_TYPE_ID);
	}

	/**
	 * Returns all the address types.
	 *
	 * @return the address types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AddressType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the address types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address types
	 * @param end the upper bound of the range of address types (not inclusive)
	 * @return the range of address types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AddressType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the address types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address types
	 * @param end the upper bound of the range of address types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of address types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AddressType> findAll(int start, int end,
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

		List<AddressType> list = (List<AddressType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADDRESSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADDRESSTYPE;

				if (pagination) {
					sql = sql.concat(AddressTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AddressType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AddressType>(list);
				}
				else {
					list = (List<AddressType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the address types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AddressType addressType : findAll()) {
			remove(addressType);
		}
	}

	/**
	 * Returns the number of address types.
	 *
	 * @return the number of address types
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

				Query q = session.createQuery(_SQL_COUNT_ADDRESSTYPE);

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
	 * Initializes the address type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.AddressType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AddressType>> listenersList = new ArrayList<ModelListener<AddressType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AddressType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AddressTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ADDRESSTYPE = "SELECT addressType FROM AddressType addressType";
	private static final String _SQL_COUNT_ADDRESSTYPE = "SELECT COUNT(addressType) FROM AddressType addressType";
	private static final String _ORDER_BY_ENTITY_ALIAS = "addressType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AddressType exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AddressTypePersistenceImpl.class);
	private static AddressType _nullAddressType = new AddressTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AddressType> toCacheModel() {
				return _nullAddressTypeCacheModel;
			}
		};

	private static CacheModel<AddressType> _nullAddressTypeCacheModel = new CacheModel<AddressType>() {
			@Override
			public AddressType toEntityModel() {
				return _nullAddressType;
			}
		};
}