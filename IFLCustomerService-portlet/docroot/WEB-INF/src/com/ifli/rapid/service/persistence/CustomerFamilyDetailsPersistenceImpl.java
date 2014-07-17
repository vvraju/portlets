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

import com.ifli.rapid.NoSuchCustomerFamilyDetailsException;
import com.ifli.rapid.model.CustomerFamilyDetails;
import com.ifli.rapid.model.impl.CustomerFamilyDetailsImpl;
import com.ifli.rapid.model.impl.CustomerFamilyDetailsModelImpl;

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
 * The persistence implementation for the customer family details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see CustomerFamilyDetailsPersistence
 * @see CustomerFamilyDetailsUtil
 * @generated
 */
public class CustomerFamilyDetailsPersistenceImpl extends BasePersistenceImpl<CustomerFamilyDetails>
	implements CustomerFamilyDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerFamilyDetailsUtil} to access the customer family details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerFamilyDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CustomerFamilyDetailsModelImpl.FINDER_CACHE_ENABLED,
			CustomerFamilyDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CustomerFamilyDetailsModelImpl.FINDER_CACHE_ENABLED,
			CustomerFamilyDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CustomerFamilyDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerFamilyDetailsPersistenceImpl() {
		setModelClass(CustomerFamilyDetails.class);
	}

	/**
	 * Caches the customer family details in the entity cache if it is enabled.
	 *
	 * @param customerFamilyDetails the customer family details
	 */
	@Override
	public void cacheResult(CustomerFamilyDetails customerFamilyDetails) {
		EntityCacheUtil.putResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CustomerFamilyDetailsImpl.class,
			customerFamilyDetails.getPrimaryKey(), customerFamilyDetails);

		customerFamilyDetails.resetOriginalValues();
	}

	/**
	 * Caches the customer family detailses in the entity cache if it is enabled.
	 *
	 * @param customerFamilyDetailses the customer family detailses
	 */
	@Override
	public void cacheResult(List<CustomerFamilyDetails> customerFamilyDetailses) {
		for (CustomerFamilyDetails customerFamilyDetails : customerFamilyDetailses) {
			if (EntityCacheUtil.getResult(
						CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
						CustomerFamilyDetailsImpl.class,
						customerFamilyDetails.getPrimaryKey()) == null) {
				cacheResult(customerFamilyDetails);
			}
			else {
				customerFamilyDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer family detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerFamilyDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerFamilyDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer family details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomerFamilyDetails customerFamilyDetails) {
		EntityCacheUtil.removeResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CustomerFamilyDetailsImpl.class,
			customerFamilyDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomerFamilyDetails> customerFamilyDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomerFamilyDetails customerFamilyDetails : customerFamilyDetailses) {
			EntityCacheUtil.removeResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
				CustomerFamilyDetailsImpl.class,
				customerFamilyDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer family details with the primary key. Does not add the customer family details to the database.
	 *
	 * @param CUSTOMER_FAMILY_ID the primary key for the new customer family details
	 * @return the new customer family details
	 */
	@Override
	public CustomerFamilyDetails create(int CUSTOMER_FAMILY_ID) {
		CustomerFamilyDetails customerFamilyDetails = new CustomerFamilyDetailsImpl();

		customerFamilyDetails.setNew(true);
		customerFamilyDetails.setPrimaryKey(CUSTOMER_FAMILY_ID);

		return customerFamilyDetails;
	}

	/**
	 * Removes the customer family details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CUSTOMER_FAMILY_ID the primary key of the customer family details
	 * @return the customer family details that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException if a customer family details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerFamilyDetails remove(int CUSTOMER_FAMILY_ID)
		throws NoSuchCustomerFamilyDetailsException, SystemException {
		return remove((Serializable)CUSTOMER_FAMILY_ID);
	}

	/**
	 * Removes the customer family details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer family details
	 * @return the customer family details that was removed
	 * @throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException if a customer family details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerFamilyDetails remove(Serializable primaryKey)
		throws NoSuchCustomerFamilyDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomerFamilyDetails customerFamilyDetails = (CustomerFamilyDetails)session.get(CustomerFamilyDetailsImpl.class,
					primaryKey);

			if (customerFamilyDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerFamilyDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerFamilyDetails);
		}
		catch (NoSuchCustomerFamilyDetailsException nsee) {
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
	protected CustomerFamilyDetails removeImpl(
		CustomerFamilyDetails customerFamilyDetails) throws SystemException {
		customerFamilyDetails = toUnwrappedModel(customerFamilyDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerFamilyDetails)) {
				customerFamilyDetails = (CustomerFamilyDetails)session.get(CustomerFamilyDetailsImpl.class,
						customerFamilyDetails.getPrimaryKeyObj());
			}

			if (customerFamilyDetails != null) {
				session.delete(customerFamilyDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerFamilyDetails != null) {
			clearCache(customerFamilyDetails);
		}

		return customerFamilyDetails;
	}

	@Override
	public CustomerFamilyDetails updateImpl(
		com.ifli.rapid.model.CustomerFamilyDetails customerFamilyDetails)
		throws SystemException {
		customerFamilyDetails = toUnwrappedModel(customerFamilyDetails);

		boolean isNew = customerFamilyDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerFamilyDetails.isNew()) {
				session.save(customerFamilyDetails);

				customerFamilyDetails.setNew(false);
			}
			else {
				session.merge(customerFamilyDetails);
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

		EntityCacheUtil.putResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
			CustomerFamilyDetailsImpl.class,
			customerFamilyDetails.getPrimaryKey(), customerFamilyDetails);

		return customerFamilyDetails;
	}

	protected CustomerFamilyDetails toUnwrappedModel(
		CustomerFamilyDetails customerFamilyDetails) {
		if (customerFamilyDetails instanceof CustomerFamilyDetailsImpl) {
			return customerFamilyDetails;
		}

		CustomerFamilyDetailsImpl customerFamilyDetailsImpl = new CustomerFamilyDetailsImpl();

		customerFamilyDetailsImpl.setNew(customerFamilyDetails.isNew());
		customerFamilyDetailsImpl.setPrimaryKey(customerFamilyDetails.getPrimaryKey());

		customerFamilyDetailsImpl.setCUSTOMER_FAMILY_ID(customerFamilyDetails.getCUSTOMER_FAMILY_ID());
		customerFamilyDetailsImpl.setPERSON_NAME(customerFamilyDetails.getPERSON_NAME());
		customerFamilyDetailsImpl.setRELATION(customerFamilyDetails.getRELATION());
		customerFamilyDetailsImpl.setDEPENDENT(customerFamilyDetails.getDEPENDENT());
		customerFamilyDetailsImpl.setAGE(customerFamilyDetails.getAGE());
		customerFamilyDetailsImpl.setCUSTOMER_ID(customerFamilyDetails.getCUSTOMER_ID());
		customerFamilyDetailsImpl.setADDED_BY(customerFamilyDetails.getADDED_BY());
		customerFamilyDetailsImpl.setADDED_DATE(customerFamilyDetails.getADDED_DATE());
		customerFamilyDetailsImpl.setUPDATED_BY(customerFamilyDetails.getUPDATED_BY());
		customerFamilyDetailsImpl.setUPDATED_DATE(customerFamilyDetails.getUPDATED_DATE());

		return customerFamilyDetailsImpl;
	}

	/**
	 * Returns the customer family details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer family details
	 * @return the customer family details
	 * @throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException if a customer family details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerFamilyDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerFamilyDetailsException, SystemException {
		CustomerFamilyDetails customerFamilyDetails = fetchByPrimaryKey(primaryKey);

		if (customerFamilyDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerFamilyDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerFamilyDetails;
	}

	/**
	 * Returns the customer family details with the primary key or throws a {@link com.ifli.rapid.NoSuchCustomerFamilyDetailsException} if it could not be found.
	 *
	 * @param CUSTOMER_FAMILY_ID the primary key of the customer family details
	 * @return the customer family details
	 * @throws com.ifli.rapid.NoSuchCustomerFamilyDetailsException if a customer family details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerFamilyDetails findByPrimaryKey(int CUSTOMER_FAMILY_ID)
		throws NoSuchCustomerFamilyDetailsException, SystemException {
		return findByPrimaryKey((Serializable)CUSTOMER_FAMILY_ID);
	}

	/**
	 * Returns the customer family details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer family details
	 * @return the customer family details, or <code>null</code> if a customer family details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerFamilyDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomerFamilyDetails customerFamilyDetails = (CustomerFamilyDetails)EntityCacheUtil.getResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
				CustomerFamilyDetailsImpl.class, primaryKey);

		if (customerFamilyDetails == _nullCustomerFamilyDetails) {
			return null;
		}

		if (customerFamilyDetails == null) {
			Session session = null;

			try {
				session = openSession();

				customerFamilyDetails = (CustomerFamilyDetails)session.get(CustomerFamilyDetailsImpl.class,
						primaryKey);

				if (customerFamilyDetails != null) {
					cacheResult(customerFamilyDetails);
				}
				else {
					EntityCacheUtil.putResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
						CustomerFamilyDetailsImpl.class, primaryKey,
						_nullCustomerFamilyDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerFamilyDetailsModelImpl.ENTITY_CACHE_ENABLED,
					CustomerFamilyDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerFamilyDetails;
	}

	/**
	 * Returns the customer family details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CUSTOMER_FAMILY_ID the primary key of the customer family details
	 * @return the customer family details, or <code>null</code> if a customer family details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerFamilyDetails fetchByPrimaryKey(int CUSTOMER_FAMILY_ID)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)CUSTOMER_FAMILY_ID);
	}

	/**
	 * Returns all the customer family detailses.
	 *
	 * @return the customer family detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerFamilyDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer family detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerFamilyDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer family detailses
	 * @param end the upper bound of the range of customer family detailses (not inclusive)
	 * @return the range of customer family detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerFamilyDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer family detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.CustomerFamilyDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer family detailses
	 * @param end the upper bound of the range of customer family detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer family detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerFamilyDetails> findAll(int start, int end,
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

		List<CustomerFamilyDetails> list = (List<CustomerFamilyDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERFAMILYDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERFAMILYDETAILS;

				if (pagination) {
					sql = sql.concat(CustomerFamilyDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomerFamilyDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomerFamilyDetails>(list);
				}
				else {
					list = (List<CustomerFamilyDetails>)QueryUtil.list(q,
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
	 * Removes all the customer family detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomerFamilyDetails customerFamilyDetails : findAll()) {
			remove(customerFamilyDetails);
		}
	}

	/**
	 * Returns the number of customer family detailses.
	 *
	 * @return the number of customer family detailses
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERFAMILYDETAILS);

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
	 * Initializes the customer family details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifli.rapid.model.CustomerFamilyDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomerFamilyDetails>> listenersList = new ArrayList<ModelListener<CustomerFamilyDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomerFamilyDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerFamilyDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERFAMILYDETAILS = "SELECT customerFamilyDetails FROM CustomerFamilyDetails customerFamilyDetails";
	private static final String _SQL_COUNT_CUSTOMERFAMILYDETAILS = "SELECT COUNT(customerFamilyDetails) FROM CustomerFamilyDetails customerFamilyDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerFamilyDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerFamilyDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerFamilyDetailsPersistenceImpl.class);
	private static CustomerFamilyDetails _nullCustomerFamilyDetails = new CustomerFamilyDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomerFamilyDetails> toCacheModel() {
				return _nullCustomerFamilyDetailsCacheModel;
			}
		};

	private static CacheModel<CustomerFamilyDetails> _nullCustomerFamilyDetailsCacheModel =
		new CacheModel<CustomerFamilyDetails>() {
			@Override
			public CustomerFamilyDetails toEntityModel() {
				return _nullCustomerFamilyDetails;
			}
		};
}