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

package com.ifl.rapid.customer.service.persistence;

import com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException;
import com.ifl.rapid.customer.model.QrcTrnServiceRequests;
import com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsImpl;
import com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsModelImpl;

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
 * The persistence implementation for the qrc trn service requests service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see QrcTrnServiceRequestsPersistence
 * @see QrcTrnServiceRequestsUtil
 * @generated
 */
public class QrcTrnServiceRequestsPersistenceImpl extends BasePersistenceImpl<QrcTrnServiceRequests>
	implements QrcTrnServiceRequestsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QrcTrnServiceRequestsUtil} to access the qrc trn service requests persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QrcTrnServiceRequestsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnServiceRequestsModelImpl.FINDER_CACHE_ENABLED,
			QrcTrnServiceRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnServiceRequestsModelImpl.FINDER_CACHE_ENABLED,
			QrcTrnServiceRequestsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnServiceRequestsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public QrcTrnServiceRequestsPersistenceImpl() {
		setModelClass(QrcTrnServiceRequests.class);
	}

	/**
	 * Caches the qrc trn service requests in the entity cache if it is enabled.
	 *
	 * @param qrcTrnServiceRequests the qrc trn service requests
	 */
	@Override
	public void cacheResult(QrcTrnServiceRequests qrcTrnServiceRequests) {
		EntityCacheUtil.putResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnServiceRequestsImpl.class,
			qrcTrnServiceRequests.getPrimaryKey(), qrcTrnServiceRequests);

		qrcTrnServiceRequests.resetOriginalValues();
	}

	/**
	 * Caches the qrc trn service requestses in the entity cache if it is enabled.
	 *
	 * @param qrcTrnServiceRequestses the qrc trn service requestses
	 */
	@Override
	public void cacheResult(List<QrcTrnServiceRequests> qrcTrnServiceRequestses) {
		for (QrcTrnServiceRequests qrcTrnServiceRequests : qrcTrnServiceRequestses) {
			if (EntityCacheUtil.getResult(
						QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
						QrcTrnServiceRequestsImpl.class,
						qrcTrnServiceRequests.getPrimaryKey()) == null) {
				cacheResult(qrcTrnServiceRequests);
			}
			else {
				qrcTrnServiceRequests.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qrc trn service requestses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QrcTrnServiceRequestsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QrcTrnServiceRequestsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qrc trn service requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QrcTrnServiceRequests qrcTrnServiceRequests) {
		EntityCacheUtil.removeResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnServiceRequestsImpl.class,
			qrcTrnServiceRequests.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QrcTrnServiceRequests> qrcTrnServiceRequestses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QrcTrnServiceRequests qrcTrnServiceRequests : qrcTrnServiceRequestses) {
			EntityCacheUtil.removeResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
				QrcTrnServiceRequestsImpl.class,
				qrcTrnServiceRequests.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qrc trn service requests with the primary key. Does not add the qrc trn service requests to the database.
	 *
	 * @param ServiceRequestId the primary key for the new qrc trn service requests
	 * @return the new qrc trn service requests
	 */
	@Override
	public QrcTrnServiceRequests create(int ServiceRequestId) {
		QrcTrnServiceRequests qrcTrnServiceRequests = new QrcTrnServiceRequestsImpl();

		qrcTrnServiceRequests.setNew(true);
		qrcTrnServiceRequests.setPrimaryKey(ServiceRequestId);

		return qrcTrnServiceRequests;
	}

	/**
	 * Removes the qrc trn service requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ServiceRequestId the primary key of the qrc trn service requests
	 * @return the qrc trn service requests that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException if a qrc trn service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnServiceRequests remove(int ServiceRequestId)
		throws NoSuchQrcTrnServiceRequestsException, SystemException {
		return remove((Serializable)ServiceRequestId);
	}

	/**
	 * Removes the qrc trn service requests with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qrc trn service requests
	 * @return the qrc trn service requests that was removed
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException if a qrc trn service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnServiceRequests remove(Serializable primaryKey)
		throws NoSuchQrcTrnServiceRequestsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QrcTrnServiceRequests qrcTrnServiceRequests = (QrcTrnServiceRequests)session.get(QrcTrnServiceRequestsImpl.class,
					primaryKey);

			if (qrcTrnServiceRequests == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQrcTrnServiceRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qrcTrnServiceRequests);
		}
		catch (NoSuchQrcTrnServiceRequestsException nsee) {
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
	protected QrcTrnServiceRequests removeImpl(
		QrcTrnServiceRequests qrcTrnServiceRequests) throws SystemException {
		qrcTrnServiceRequests = toUnwrappedModel(qrcTrnServiceRequests);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qrcTrnServiceRequests)) {
				qrcTrnServiceRequests = (QrcTrnServiceRequests)session.get(QrcTrnServiceRequestsImpl.class,
						qrcTrnServiceRequests.getPrimaryKeyObj());
			}

			if (qrcTrnServiceRequests != null) {
				session.delete(qrcTrnServiceRequests);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qrcTrnServiceRequests != null) {
			clearCache(qrcTrnServiceRequests);
		}

		return qrcTrnServiceRequests;
	}

	@Override
	public QrcTrnServiceRequests updateImpl(
		com.ifl.rapid.customer.model.QrcTrnServiceRequests qrcTrnServiceRequests)
		throws SystemException {
		qrcTrnServiceRequests = toUnwrappedModel(qrcTrnServiceRequests);

		boolean isNew = qrcTrnServiceRequests.isNew();

		Session session = null;

		try {
			session = openSession();

			if (qrcTrnServiceRequests.isNew()) {
				session.save(qrcTrnServiceRequests);

				qrcTrnServiceRequests.setNew(false);
			}
			else {
				session.merge(qrcTrnServiceRequests);
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

		EntityCacheUtil.putResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
			QrcTrnServiceRequestsImpl.class,
			qrcTrnServiceRequests.getPrimaryKey(), qrcTrnServiceRequests);

		return qrcTrnServiceRequests;
	}

	protected QrcTrnServiceRequests toUnwrappedModel(
		QrcTrnServiceRequests qrcTrnServiceRequests) {
		if (qrcTrnServiceRequests instanceof QrcTrnServiceRequestsImpl) {
			return qrcTrnServiceRequests;
		}

		QrcTrnServiceRequestsImpl qrcTrnServiceRequestsImpl = new QrcTrnServiceRequestsImpl();

		qrcTrnServiceRequestsImpl.setNew(qrcTrnServiceRequests.isNew());
		qrcTrnServiceRequestsImpl.setPrimaryKey(qrcTrnServiceRequests.getPrimaryKey());

		qrcTrnServiceRequestsImpl.setServiceRequestId(qrcTrnServiceRequests.getServiceRequestId());
		qrcTrnServiceRequestsImpl.setContactId(qrcTrnServiceRequests.getContactId());
		qrcTrnServiceRequestsImpl.setSrId(qrcTrnServiceRequests.getSrId());
		qrcTrnServiceRequestsImpl.setProcessId(qrcTrnServiceRequests.getProcessId());
		qrcTrnServiceRequestsImpl.setSource(qrcTrnServiceRequests.getSource());
		qrcTrnServiceRequestsImpl.setChannel(qrcTrnServiceRequests.getChannel());
		qrcTrnServiceRequestsImpl.setPriority(qrcTrnServiceRequests.getPriority());
		qrcTrnServiceRequestsImpl.setPolicyNo(qrcTrnServiceRequests.getPolicyNo());
		qrcTrnServiceRequestsImpl.setCaseDetails(qrcTrnServiceRequests.getCaseDetails());
		qrcTrnServiceRequestsImpl.setIsManual(qrcTrnServiceRequests.getIsManual());
		qrcTrnServiceRequestsImpl.setIsLAUpdated(qrcTrnServiceRequests.getIsLAUpdated());
		qrcTrnServiceRequestsImpl.setComments(qrcTrnServiceRequests.getComments());
		qrcTrnServiceRequestsImpl.setIsSignVerified(qrcTrnServiceRequests.getIsSignVerified());
		qrcTrnServiceRequestsImpl.setRequestId(qrcTrnServiceRequests.getRequestId());
		qrcTrnServiceRequestsImpl.setAssignedTo(qrcTrnServiceRequests.getAssignedTo());
		qrcTrnServiceRequestsImpl.setCreatedContactId(qrcTrnServiceRequests.getCreatedContactId());
		qrcTrnServiceRequestsImpl.setHistoryId(qrcTrnServiceRequests.getHistoryId());
		qrcTrnServiceRequestsImpl.setAddressTypeId(qrcTrnServiceRequests.getAddressTypeId());
		qrcTrnServiceRequestsImpl.setIsActive(qrcTrnServiceRequests.getIsActive());
		qrcTrnServiceRequestsImpl.setCreatedBy(qrcTrnServiceRequests.getCreatedBy());
		qrcTrnServiceRequestsImpl.setCreatedDate(qrcTrnServiceRequests.getCreatedDate());
		qrcTrnServiceRequestsImpl.setModifiedDate(qrcTrnServiceRequests.getModifiedDate());
		qrcTrnServiceRequestsImpl.setModifiedBy(qrcTrnServiceRequests.getModifiedBy());

		return qrcTrnServiceRequestsImpl;
	}

	/**
	 * Returns the qrc trn service requests with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc trn service requests
	 * @return the qrc trn service requests
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException if a qrc trn service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnServiceRequests findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQrcTrnServiceRequestsException, SystemException {
		QrcTrnServiceRequests qrcTrnServiceRequests = fetchByPrimaryKey(primaryKey);

		if (qrcTrnServiceRequests == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQrcTrnServiceRequestsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qrcTrnServiceRequests;
	}

	/**
	 * Returns the qrc trn service requests with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException} if it could not be found.
	 *
	 * @param ServiceRequestId the primary key of the qrc trn service requests
	 * @return the qrc trn service requests
	 * @throws com.ifl.rapid.customer.NoSuchQrcTrnServiceRequestsException if a qrc trn service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnServiceRequests findByPrimaryKey(int ServiceRequestId)
		throws NoSuchQrcTrnServiceRequestsException, SystemException {
		return findByPrimaryKey((Serializable)ServiceRequestId);
	}

	/**
	 * Returns the qrc trn service requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qrc trn service requests
	 * @return the qrc trn service requests, or <code>null</code> if a qrc trn service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnServiceRequests fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QrcTrnServiceRequests qrcTrnServiceRequests = (QrcTrnServiceRequests)EntityCacheUtil.getResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
				QrcTrnServiceRequestsImpl.class, primaryKey);

		if (qrcTrnServiceRequests == _nullQrcTrnServiceRequests) {
			return null;
		}

		if (qrcTrnServiceRequests == null) {
			Session session = null;

			try {
				session = openSession();

				qrcTrnServiceRequests = (QrcTrnServiceRequests)session.get(QrcTrnServiceRequestsImpl.class,
						primaryKey);

				if (qrcTrnServiceRequests != null) {
					cacheResult(qrcTrnServiceRequests);
				}
				else {
					EntityCacheUtil.putResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
						QrcTrnServiceRequestsImpl.class, primaryKey,
						_nullQrcTrnServiceRequests);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QrcTrnServiceRequestsModelImpl.ENTITY_CACHE_ENABLED,
					QrcTrnServiceRequestsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qrcTrnServiceRequests;
	}

	/**
	 * Returns the qrc trn service requests with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ServiceRequestId the primary key of the qrc trn service requests
	 * @return the qrc trn service requests, or <code>null</code> if a qrc trn service requests with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QrcTrnServiceRequests fetchByPrimaryKey(int ServiceRequestId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ServiceRequestId);
	}

	/**
	 * Returns all the qrc trn service requestses.
	 *
	 * @return the qrc trn service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnServiceRequests> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qrc trn service requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc trn service requestses
	 * @param end the upper bound of the range of qrc trn service requestses (not inclusive)
	 * @return the range of qrc trn service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnServiceRequests> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qrc trn service requestses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.QrcTrnServiceRequestsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qrc trn service requestses
	 * @param end the upper bound of the range of qrc trn service requestses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qrc trn service requestses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QrcTrnServiceRequests> findAll(int start, int end,
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

		List<QrcTrnServiceRequests> list = (List<QrcTrnServiceRequests>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QRCTRNSERVICEREQUESTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QRCTRNSERVICEREQUESTS;

				if (pagination) {
					sql = sql.concat(QrcTrnServiceRequestsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QrcTrnServiceRequests>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QrcTrnServiceRequests>(list);
				}
				else {
					list = (List<QrcTrnServiceRequests>)QueryUtil.list(q,
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
	 * Removes all the qrc trn service requestses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QrcTrnServiceRequests qrcTrnServiceRequests : findAll()) {
			remove(qrcTrnServiceRequests);
		}
	}

	/**
	 * Returns the number of qrc trn service requestses.
	 *
	 * @return the number of qrc trn service requestses
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

				Query q = session.createQuery(_SQL_COUNT_QRCTRNSERVICEREQUESTS);

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
	 * Initializes the qrc trn service requests persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.QrcTrnServiceRequests")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QrcTrnServiceRequests>> listenersList = new ArrayList<ModelListener<QrcTrnServiceRequests>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QrcTrnServiceRequests>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QrcTrnServiceRequestsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QRCTRNSERVICEREQUESTS = "SELECT qrcTrnServiceRequests FROM QrcTrnServiceRequests qrcTrnServiceRequests";
	private static final String _SQL_COUNT_QRCTRNSERVICEREQUESTS = "SELECT COUNT(qrcTrnServiceRequests) FROM QrcTrnServiceRequests qrcTrnServiceRequests";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qrcTrnServiceRequests.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QrcTrnServiceRequests exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QrcTrnServiceRequestsPersistenceImpl.class);
	private static QrcTrnServiceRequests _nullQrcTrnServiceRequests = new QrcTrnServiceRequestsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QrcTrnServiceRequests> toCacheModel() {
				return _nullQrcTrnServiceRequestsCacheModel;
			}
		};

	private static CacheModel<QrcTrnServiceRequests> _nullQrcTrnServiceRequestsCacheModel =
		new CacheModel<QrcTrnServiceRequests>() {
			@Override
			public QrcTrnServiceRequests toEntityModel() {
				return _nullQrcTrnServiceRequests;
			}
		};
}