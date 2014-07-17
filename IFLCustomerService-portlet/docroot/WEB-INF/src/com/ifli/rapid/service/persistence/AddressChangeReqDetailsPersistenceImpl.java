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

import com.ifli.rapid.NoSuchAddressChangeReqDetailsException;
import com.ifli.rapid.model.AddressChangeReqDetails;
import com.ifli.rapid.model.impl.AddressChangeReqDetailsImpl;
import com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl;

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
 * The persistence implementation for the address change req details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see AddressChangeReqDetailsPersistence
 * @see AddressChangeReqDetailsUtil
 * @generated
 */
public class AddressChangeReqDetailsPersistenceImpl extends BasePersistenceImpl<AddressChangeReqDetails>
	implements AddressChangeReqDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AddressChangeReqDetailsUtil} to access the address change req details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AddressChangeReqDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
			AddressChangeReqDetailsModelImpl.FINDER_CACHE_ENABLED,
			AddressChangeReqDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
			AddressChangeReqDetailsModelImpl.FINDER_CACHE_ENABLED,
			AddressChangeReqDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
			AddressChangeReqDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AddressChangeReqDetailsPersistenceImpl() {
		setModelClass(AddressChangeReqDetails.class);
	}

	/**
	 * Caches the address change req details in the entity cache if it is enabled.
	 *
	 * @param addressChangeReqDetails the address change req details
	 */
	@Override
	public void cacheResult(AddressChangeReqDetails addressChangeReqDetails) {
		EntityCacheUtil.putResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
			AddressChangeReqDetailsImpl.class,
			addressChangeReqDetails.getPrimaryKey(), addressChangeReqDetails);

		addressChangeReqDetails.resetOriginalValues();
	}

	/**
	 * Caches the address change req detailses in the entity cache if it is enabled.
	 *
	 * @param addressChangeReqDetailses the address change req detailses
	 */
	@Override
	public void cacheResult(
		List<AddressChangeReqDetails> addressChangeReqDetailses) {
		for (AddressChangeReqDetails addressChangeReqDetails : addressChangeReqDetailses) {
			if (EntityCacheUtil.getResult(
						AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
						AddressChangeReqDetailsImpl.class,
						addressChangeReqDetails.getPrimaryKey()) == null) {
				cacheResult(addressChangeReqDetails);
			}
			else {
				addressChangeReqDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all address change req detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AddressChangeReqDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AddressChangeReqDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the address change req details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddressChangeReqDetails addressChangeReqDetails) {
		EntityCacheUtil.removeResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
			AddressChangeReqDetailsImpl.class,
			addressChangeReqDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AddressChangeReqDetails> addressChangeReqDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AddressChangeReqDetails addressChangeReqDetails : addressChangeReqDetailses) {
			EntityCacheUtil.removeResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
				AddressChangeReqDetailsImpl.class,
				addressChangeReqDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new address change req details with the primary key. Does not add the address change req details to the database.
	 *
	 * @param ADDR_CHANGE_DETAILS_ID the primary key for the new address change req details
	 * @return the new address change req details
	 */
	@Override
	public AddressChangeReqDetails create(int ADDR_CHANGE_DETAILS_ID) {
		AddressChangeReqDetails addressChangeReqDetails = new AddressChangeReqDetailsImpl();

		addressChangeReqDetails.setNew(true);
		addressChangeReqDetails.setPrimaryKey(ADDR_CHANGE_DETAILS_ID);

		return addressChangeReqDetails;
	}

	/**
	 * Removes the address change req details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	 * @return the address change req details that was removed
	 * @throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException if a address change req details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressChangeReqDetails remove(int ADDR_CHANGE_DETAILS_ID)
		throws NoSuchAddressChangeReqDetailsException, SystemException {
		return remove((Serializable)ADDR_CHANGE_DETAILS_ID);
	}

	/**
	 * Removes the address change req details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the address change req details
	 * @return the address change req details that was removed
	 * @throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException if a address change req details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressChangeReqDetails remove(Serializable primaryKey)
		throws NoSuchAddressChangeReqDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AddressChangeReqDetails addressChangeReqDetails = (AddressChangeReqDetails)session.get(AddressChangeReqDetailsImpl.class,
					primaryKey);

			if (addressChangeReqDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddressChangeReqDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(addressChangeReqDetails);
		}
		catch (NoSuchAddressChangeReqDetailsException nsee) {
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
	protected AddressChangeReqDetails removeImpl(
		AddressChangeReqDetails addressChangeReqDetails)
		throws SystemException {
		addressChangeReqDetails = toUnwrappedModel(addressChangeReqDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addressChangeReqDetails)) {
				addressChangeReqDetails = (AddressChangeReqDetails)session.get(AddressChangeReqDetailsImpl.class,
						addressChangeReqDetails.getPrimaryKeyObj());
			}

			if (addressChangeReqDetails != null) {
				session.delete(addressChangeReqDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (addressChangeReqDetails != null) {
			clearCache(addressChangeReqDetails);
		}

		return addressChangeReqDetails;
	}

	@Override
	public AddressChangeReqDetails updateImpl(
		com.ifli.rapid.model.AddressChangeReqDetails addressChangeReqDetails)
		throws SystemException {
		addressChangeReqDetails = toUnwrappedModel(addressChangeReqDetails);

		boolean isNew = addressChangeReqDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (addressChangeReqDetails.isNew()) {
				session.save(addressChangeReqDetails);

				addressChangeReqDetails.setNew(false);
			}
			else {
				session.merge(addressChangeReqDetails);
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

		EntityCacheUtil.putResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
			AddressChangeReqDetailsImpl.class,
			addressChangeReqDetails.getPrimaryKey(), addressChangeReqDetails);

		return addressChangeReqDetails;
	}

	protected AddressChangeReqDetails toUnwrappedModel(
		AddressChangeReqDetails addressChangeReqDetails) {
		if (addressChangeReqDetails instanceof AddressChangeReqDetailsImpl) {
			return addressChangeReqDetails;
		}

		AddressChangeReqDetailsImpl addressChangeReqDetailsImpl = new AddressChangeReqDetailsImpl();

		addressChangeReqDetailsImpl.setNew(addressChangeReqDetails.isNew());
		addressChangeReqDetailsImpl.setPrimaryKey(addressChangeReqDetails.getPrimaryKey());

		addressChangeReqDetailsImpl.setADDR_CHANGE_DETAILS_ID(addressChangeReqDetails.getADDR_CHANGE_DETAILS_ID());
		addressChangeReqDetailsImpl.setREQUEST_SUBMIT_TYPE(addressChangeReqDetails.getREQUEST_SUBMIT_TYPE());
		addressChangeReqDetailsImpl.setSERVICE_REQUEST_ID(addressChangeReqDetails.getSERVICE_REQUEST_ID());
		addressChangeReqDetailsImpl.setSUB_TYPE(addressChangeReqDetails.getSUB_TYPE());
		addressChangeReqDetailsImpl.setADDRESS_TYPE_ID(addressChangeReqDetails.getADDRESS_TYPE_ID());
		addressChangeReqDetailsImpl.setCUSTOMER_ID(addressChangeReqDetails.getCUSTOMER_ID());
		addressChangeReqDetailsImpl.setSUBMIT_AT_BRANCH(addressChangeReqDetails.getSUBMIT_AT_BRANCH());
		addressChangeReqDetailsImpl.setPICKUP_DATE(addressChangeReqDetails.getPICKUP_DATE());
		addressChangeReqDetailsImpl.setPICKUP_TIME(addressChangeReqDetails.getPICKUP_TIME());
		addressChangeReqDetailsImpl.setINSERTED_DATE(addressChangeReqDetails.getINSERTED_DATE());
		addressChangeReqDetailsImpl.setINSERTED_BY(addressChangeReqDetails.getINSERTED_BY());
		addressChangeReqDetailsImpl.setUPDATED_DATE(addressChangeReqDetails.getUPDATED_DATE());
		addressChangeReqDetailsImpl.setUPDATED_BY(addressChangeReqDetails.getUPDATED_BY());

		return addressChangeReqDetailsImpl;
	}

	/**
	 * Returns the address change req details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the address change req details
	 * @return the address change req details
	 * @throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException if a address change req details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressChangeReqDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddressChangeReqDetailsException, SystemException {
		AddressChangeReqDetails addressChangeReqDetails = fetchByPrimaryKey(primaryKey);

		if (addressChangeReqDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddressChangeReqDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return addressChangeReqDetails;
	}

	/**
	 * Returns the address change req details with the primary key or throws a {@link com.ifli.rapid.NoSuchAddressChangeReqDetailsException} if it could not be found.
	 *
	 * @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	 * @return the address change req details
	 * @throws com.ifli.rapid.NoSuchAddressChangeReqDetailsException if a address change req details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressChangeReqDetails findByPrimaryKey(int ADDR_CHANGE_DETAILS_ID)
		throws NoSuchAddressChangeReqDetailsException, SystemException {
		return findByPrimaryKey((Serializable)ADDR_CHANGE_DETAILS_ID);
	}

	/**
	 * Returns the address change req details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the address change req details
	 * @return the address change req details, or <code>null</code> if a address change req details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressChangeReqDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AddressChangeReqDetails addressChangeReqDetails = (AddressChangeReqDetails)EntityCacheUtil.getResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
				AddressChangeReqDetailsImpl.class, primaryKey);

		if (addressChangeReqDetails == _nullAddressChangeReqDetails) {
			return null;
		}

		if (addressChangeReqDetails == null) {
			Session session = null;

			try {
				session = openSession();

				addressChangeReqDetails = (AddressChangeReqDetails)session.get(AddressChangeReqDetailsImpl.class,
						primaryKey);

				if (addressChangeReqDetails != null) {
					cacheResult(addressChangeReqDetails);
				}
				else {
					EntityCacheUtil.putResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
						AddressChangeReqDetailsImpl.class, primaryKey,
						_nullAddressChangeReqDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AddressChangeReqDetailsModelImpl.ENTITY_CACHE_ENABLED,
					AddressChangeReqDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return addressChangeReqDetails;
	}

	/**
	 * Returns the address change req details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ADDR_CHANGE_DETAILS_ID the primary key of the address change req details
	 * @return the address change req details, or <code>null</code> if a address change req details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AddressChangeReqDetails fetchByPrimaryKey(int ADDR_CHANGE_DETAILS_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ADDR_CHANGE_DETAILS_ID);
	}

	/**
	 * Returns all the address change req detailses.
	 *
	 * @return the address change req detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AddressChangeReqDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the address change req detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address change req detailses
	 * @param end the upper bound of the range of address change req detailses (not inclusive)
	 * @return the range of address change req detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AddressChangeReqDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the address change req detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.AddressChangeReqDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address change req detailses
	 * @param end the upper bound of the range of address change req detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of address change req detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AddressChangeReqDetails> findAll(int start, int end,
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

		List<AddressChangeReqDetails> list = (List<AddressChangeReqDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADDRESSCHANGEREQDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADDRESSCHANGEREQDETAILS;

				if (pagination) {
					sql = sql.concat(AddressChangeReqDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AddressChangeReqDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AddressChangeReqDetails>(list);
				}
				else {
					list = (List<AddressChangeReqDetails>)QueryUtil.list(q,
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
	 * Removes all the address change req detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AddressChangeReqDetails addressChangeReqDetails : findAll()) {
			remove(addressChangeReqDetails);
		}
	}

	/**
	 * Returns the number of address change req detailses.
	 *
	 * @return the number of address change req detailses
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

				Query q = session.createQuery(_SQL_COUNT_ADDRESSCHANGEREQDETAILS);

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
	 * Initializes the address change req details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.AddressChangeReqDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AddressChangeReqDetails>> listenersList = new ArrayList<ModelListener<AddressChangeReqDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AddressChangeReqDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AddressChangeReqDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ADDRESSCHANGEREQDETAILS = "SELECT addressChangeReqDetails FROM AddressChangeReqDetails addressChangeReqDetails";
	private static final String _SQL_COUNT_ADDRESSCHANGEREQDETAILS = "SELECT COUNT(addressChangeReqDetails) FROM AddressChangeReqDetails addressChangeReqDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "addressChangeReqDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AddressChangeReqDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AddressChangeReqDetailsPersistenceImpl.class);
	private static AddressChangeReqDetails _nullAddressChangeReqDetails = new AddressChangeReqDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AddressChangeReqDetails> toCacheModel() {
				return _nullAddressChangeReqDetailsCacheModel;
			}
		};

	private static CacheModel<AddressChangeReqDetails> _nullAddressChangeReqDetailsCacheModel =
		new CacheModel<AddressChangeReqDetails>() {
			@Override
			public AddressChangeReqDetails toEntityModel() {
				return _nullAddressChangeReqDetails;
			}
		};
}