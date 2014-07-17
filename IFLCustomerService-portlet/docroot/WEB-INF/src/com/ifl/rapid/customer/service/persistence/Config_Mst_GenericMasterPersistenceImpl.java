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

import com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException;
import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;
import com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterImpl;
import com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the config_ mst_ generic master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see Config_Mst_GenericMasterPersistence
 * @see Config_Mst_GenericMasterUtil
 * @generated
 */
public class Config_Mst_GenericMasterPersistenceImpl extends BasePersistenceImpl<Config_Mst_GenericMaster>
	implements Config_Mst_GenericMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Config_Mst_GenericMasterUtil} to access the config_ mst_ generic master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Config_Mst_GenericMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_GENERICMASTERID = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGenericMasterId", new String[] { Integer.class.getName() },
			Config_Mst_GenericMasterModelImpl.GENERICMASTERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GENERICMASTERID = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGenericMasterId", new String[] { Integer.class.getName() });

	/**
	 * Returns the config_ mst_ generic master where GenericMasterId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	 *
	 * @param GenericMasterId the generic master ID
	 * @return the matching config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster findByGenericMasterId(int GenericMasterId)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = fetchByGenericMasterId(GenericMasterId);

		if (config_Mst_GenericMaster == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("GenericMasterId=");
			msg.append(GenericMasterId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchConfig_Mst_GenericMasterException(msg.toString());
		}

		return config_Mst_GenericMaster;
	}

	/**
	 * Returns the config_ mst_ generic master where GenericMasterId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param GenericMasterId the generic master ID
	 * @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByGenericMasterId(int GenericMasterId)
		throws SystemException {
		return fetchByGenericMasterId(GenericMasterId, true);
	}

	/**
	 * Returns the config_ mst_ generic master where GenericMasterId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param GenericMasterId the generic master ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByGenericMasterId(
		int GenericMasterId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { GenericMasterId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
					finderArgs, this);
		}

		if (result instanceof Config_Mst_GenericMaster) {
			Config_Mst_GenericMaster config_Mst_GenericMaster = (Config_Mst_GenericMaster)result;

			if ((GenericMasterId != config_Mst_GenericMaster.getGenericMasterId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONFIG_MST_GENERICMASTER_WHERE);

			query.append(_FINDER_COLUMN_GENERICMASTERID_GENERICMASTERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(GenericMasterId);

				List<Config_Mst_GenericMaster> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"Config_Mst_GenericMasterPersistenceImpl.fetchByGenericMasterId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Config_Mst_GenericMaster config_Mst_GenericMaster = list.get(0);

					result = config_Mst_GenericMaster;

					cacheResult(config_Mst_GenericMaster);

					if ((config_Mst_GenericMaster.getGenericMasterId() != GenericMasterId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
							finderArgs, config_Mst_GenericMaster);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Config_Mst_GenericMaster)result;
		}
	}

	/**
	 * Removes the config_ mst_ generic master where GenericMasterId = &#63; from the database.
	 *
	 * @param GenericMasterId the generic master ID
	 * @return the config_ mst_ generic master that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster removeByGenericMasterId(int GenericMasterId)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = findByGenericMasterId(GenericMasterId);

		return remove(config_Mst_GenericMaster);
	}

	/**
	 * Returns the number of config_ mst_ generic masters where GenericMasterId = &#63;.
	 *
	 * @param GenericMasterId the generic master ID
	 * @return the number of matching config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGenericMasterId(int GenericMasterId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GENERICMASTERID;

		Object[] finderArgs = new Object[] { GenericMasterId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIG_MST_GENERICMASTER_WHERE);

			query.append(_FINDER_COLUMN_GENERICMASTERID_GENERICMASTERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(GenericMasterId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GENERICMASTERID_GENERICMASTERID_2 =
		"config_Mst_GenericMaster.GenericMasterId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMasterTypeAndMasterKey",
			new String[] { String.class.getName(), String.class.getName() },
			Config_Mst_GenericMasterModelImpl.MASTERTYPE_COLUMN_BITMASK |
			Config_Mst_GenericMasterModelImpl.MASTERKEY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASTERTYPEANDMASTERKEY = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMasterTypeAndMasterKey",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	 *
	 * @param MasterType the master type
	 * @param MasterKey the master key
	 * @return the matching config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster findByMasterTypeAndMasterKey(
		String MasterType, String MasterKey)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = fetchByMasterTypeAndMasterKey(MasterType,
				MasterKey);

		if (config_Mst_GenericMaster == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("MasterType=");
			msg.append(MasterType);

			msg.append(", MasterKey=");
			msg.append(MasterKey);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchConfig_Mst_GenericMasterException(msg.toString());
		}

		return config_Mst_GenericMaster;
	}

	/**
	 * Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param MasterType the master type
	 * @param MasterKey the master key
	 * @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByMasterTypeAndMasterKey(
		String MasterType, String MasterKey) throws SystemException {
		return fetchByMasterTypeAndMasterKey(MasterType, MasterKey, true);
	}

	/**
	 * Returns the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param MasterType the master type
	 * @param MasterKey the master key
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByMasterTypeAndMasterKey(
		String MasterType, String MasterKey, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { MasterType, MasterKey };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
					finderArgs, this);
		}

		if (result instanceof Config_Mst_GenericMaster) {
			Config_Mst_GenericMaster config_Mst_GenericMaster = (Config_Mst_GenericMaster)result;

			if (!Validator.equals(MasterType,
						config_Mst_GenericMaster.getMasterType()) ||
					!Validator.equals(MasterKey,
						config_Mst_GenericMaster.getMasterKey())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CONFIG_MST_GENERICMASTER_WHERE);

			boolean bindMasterType = false;

			if (MasterType == null) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_1);
			}
			else if (MasterType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_3);
			}
			else {
				bindMasterType = true;

				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_2);
			}

			boolean bindMasterKey = false;

			if (MasterKey == null) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_1);
			}
			else if (MasterKey.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_3);
			}
			else {
				bindMasterKey = true;

				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasterType) {
					qPos.add(MasterType);
				}

				if (bindMasterKey) {
					qPos.add(MasterKey);
				}

				List<Config_Mst_GenericMaster> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"Config_Mst_GenericMasterPersistenceImpl.fetchByMasterTypeAndMasterKey(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Config_Mst_GenericMaster config_Mst_GenericMaster = list.get(0);

					result = config_Mst_GenericMaster;

					cacheResult(config_Mst_GenericMaster);

					if ((config_Mst_GenericMaster.getMasterType() == null) ||
							!config_Mst_GenericMaster.getMasterType()
														 .equals(MasterType) ||
							(config_Mst_GenericMaster.getMasterKey() == null) ||
							!config_Mst_GenericMaster.getMasterKey()
														 .equals(MasterKey)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
							finderArgs, config_Mst_GenericMaster);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Config_Mst_GenericMaster)result;
		}
	}

	/**
	 * Removes the config_ mst_ generic master where MasterType = &#63; and MasterKey = &#63; from the database.
	 *
	 * @param MasterType the master type
	 * @param MasterKey the master key
	 * @return the config_ mst_ generic master that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster removeByMasterTypeAndMasterKey(
		String MasterType, String MasterKey)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = findByMasterTypeAndMasterKey(MasterType,
				MasterKey);

		return remove(config_Mst_GenericMaster);
	}

	/**
	 * Returns the number of config_ mst_ generic masters where MasterType = &#63; and MasterKey = &#63;.
	 *
	 * @param MasterType the master type
	 * @param MasterKey the master key
	 * @return the number of matching config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMasterTypeAndMasterKey(String MasterType, String MasterKey)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MASTERTYPEANDMASTERKEY;

		Object[] finderArgs = new Object[] { MasterType, MasterKey };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CONFIG_MST_GENERICMASTER_WHERE);

			boolean bindMasterType = false;

			if (MasterType == null) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_1);
			}
			else if (MasterType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_3);
			}
			else {
				bindMasterType = true;

				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_2);
			}

			boolean bindMasterKey = false;

			if (MasterKey == null) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_1);
			}
			else if (MasterKey.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_3);
			}
			else {
				bindMasterKey = true;

				query.append(_FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasterType) {
					qPos.add(MasterType);
				}

				if (bindMasterKey) {
					qPos.add(MasterKey);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_1 =
		"config_Mst_GenericMaster.MasterType IS NULL AND ";
	private static final String _FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_2 =
		"config_Mst_GenericMaster.MasterType = ? AND ";
	private static final String _FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERTYPE_3 =
		"(config_Mst_GenericMaster.MasterType IS NULL OR config_Mst_GenericMaster.MasterType = '') AND ";
	private static final String _FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_1 =
		"config_Mst_GenericMaster.MasterKey IS NULL";
	private static final String _FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_2 =
		"config_Mst_GenericMaster.MasterKey = ?";
	private static final String _FINDER_COLUMN_MASTERTYPEANDMASTERKEY_MASTERKEY_3 =
		"(config_Mst_GenericMaster.MasterKey IS NULL OR config_Mst_GenericMaster.MasterKey = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MASTERTYPE =
		new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMasterType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERTYPE =
		new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMasterType",
			new String[] { String.class.getName() },
			Config_Mst_GenericMasterModelImpl.MASTERTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASTERTYPE = new FinderPath(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMasterType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the config_ mst_ generic masters where MasterType = &#63;.
	 *
	 * @param MasterType the master type
	 * @return the matching config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Config_Mst_GenericMaster> findByMasterType(String MasterType)
		throws SystemException {
		return findByMasterType(MasterType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the config_ mst_ generic masters where MasterType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param MasterType the master type
	 * @param start the lower bound of the range of config_ mst_ generic masters
	 * @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	 * @return the range of matching config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Config_Mst_GenericMaster> findByMasterType(String MasterType,
		int start, int end) throws SystemException {
		return findByMasterType(MasterType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the config_ mst_ generic masters where MasterType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param MasterType the master type
	 * @param start the lower bound of the range of config_ mst_ generic masters
	 * @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Config_Mst_GenericMaster> findByMasterType(String MasterType,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERTYPE;
			finderArgs = new Object[] { MasterType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MASTERTYPE;
			finderArgs = new Object[] { MasterType, start, end, orderByComparator };
		}

		List<Config_Mst_GenericMaster> list = (List<Config_Mst_GenericMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Config_Mst_GenericMaster config_Mst_GenericMaster : list) {
				if (!Validator.equals(MasterType,
							config_Mst_GenericMaster.getMasterType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONFIG_MST_GENERICMASTER_WHERE);

			boolean bindMasterType = false;

			if (MasterType == null) {
				query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_1);
			}
			else if (MasterType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_3);
			}
			else {
				bindMasterType = true;

				query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Config_Mst_GenericMasterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasterType) {
					qPos.add(MasterType);
				}

				if (!pagination) {
					list = (List<Config_Mst_GenericMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Config_Mst_GenericMaster>(list);
				}
				else {
					list = (List<Config_Mst_GenericMaster>)QueryUtil.list(q,
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
	 * Returns the first config_ mst_ generic master in the ordered set where MasterType = &#63;.
	 *
	 * @param MasterType the master type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster findByMasterType_First(String MasterType,
		OrderByComparator orderByComparator)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = fetchByMasterType_First(MasterType,
				orderByComparator);

		if (config_Mst_GenericMaster != null) {
			return config_Mst_GenericMaster;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("MasterType=");
		msg.append(MasterType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfig_Mst_GenericMasterException(msg.toString());
	}

	/**
	 * Returns the first config_ mst_ generic master in the ordered set where MasterType = &#63;.
	 *
	 * @param MasterType the master type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByMasterType_First(String MasterType,
		OrderByComparator orderByComparator) throws SystemException {
		List<Config_Mst_GenericMaster> list = findByMasterType(MasterType, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last config_ mst_ generic master in the ordered set where MasterType = &#63;.
	 *
	 * @param MasterType the master type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster findByMasterType_Last(String MasterType,
		OrderByComparator orderByComparator)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = fetchByMasterType_Last(MasterType,
				orderByComparator);

		if (config_Mst_GenericMaster != null) {
			return config_Mst_GenericMaster;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("MasterType=");
		msg.append(MasterType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfig_Mst_GenericMasterException(msg.toString());
	}

	/**
	 * Returns the last config_ mst_ generic master in the ordered set where MasterType = &#63;.
	 *
	 * @param MasterType the master type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching config_ mst_ generic master, or <code>null</code> if a matching config_ mst_ generic master could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByMasterType_Last(String MasterType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMasterType(MasterType);

		if (count == 0) {
			return null;
		}

		List<Config_Mst_GenericMaster> list = findByMasterType(MasterType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the config_ mst_ generic masters before and after the current config_ mst_ generic master in the ordered set where MasterType = &#63;.
	 *
	 * @param GenericMasterId the primary key of the current config_ mst_ generic master
	 * @param MasterType the master type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster[] findByMasterType_PrevAndNext(
		int GenericMasterId, String MasterType,
		OrderByComparator orderByComparator)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = findByPrimaryKey(GenericMasterId);

		Session session = null;

		try {
			session = openSession();

			Config_Mst_GenericMaster[] array = new Config_Mst_GenericMasterImpl[3];

			array[0] = getByMasterType_PrevAndNext(session,
					config_Mst_GenericMaster, MasterType, orderByComparator,
					true);

			array[1] = config_Mst_GenericMaster;

			array[2] = getByMasterType_PrevAndNext(session,
					config_Mst_GenericMaster, MasterType, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Config_Mst_GenericMaster getByMasterType_PrevAndNext(
		Session session, Config_Mst_GenericMaster config_Mst_GenericMaster,
		String MasterType, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONFIG_MST_GENERICMASTER_WHERE);

		boolean bindMasterType = false;

		if (MasterType == null) {
			query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_1);
		}
		else if (MasterType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_3);
		}
		else {
			bindMasterType = true;

			query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(Config_Mst_GenericMasterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMasterType) {
			qPos.add(MasterType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(config_Mst_GenericMaster);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Config_Mst_GenericMaster> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the config_ mst_ generic masters where MasterType = &#63; from the database.
	 *
	 * @param MasterType the master type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMasterType(String MasterType) throws SystemException {
		for (Config_Mst_GenericMaster config_Mst_GenericMaster : findByMasterType(
				MasterType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(config_Mst_GenericMaster);
		}
	}

	/**
	 * Returns the number of config_ mst_ generic masters where MasterType = &#63;.
	 *
	 * @param MasterType the master type
	 * @return the number of matching config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMasterType(String MasterType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MASTERTYPE;

		Object[] finderArgs = new Object[] { MasterType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIG_MST_GENERICMASTER_WHERE);

			boolean bindMasterType = false;

			if (MasterType == null) {
				query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_1);
			}
			else if (MasterType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_3);
			}
			else {
				bindMasterType = true;

				query.append(_FINDER_COLUMN_MASTERTYPE_MASTERTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasterType) {
					qPos.add(MasterType);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MASTERTYPE_MASTERTYPE_1 = "config_Mst_GenericMaster.MasterType IS NULL";
	private static final String _FINDER_COLUMN_MASTERTYPE_MASTERTYPE_2 = "config_Mst_GenericMaster.MasterType = ?";
	private static final String _FINDER_COLUMN_MASTERTYPE_MASTERTYPE_3 = "(config_Mst_GenericMaster.MasterType IS NULL OR config_Mst_GenericMaster.MasterType = '')";

	public Config_Mst_GenericMasterPersistenceImpl() {
		setModelClass(Config_Mst_GenericMaster.class);
	}

	/**
	 * Caches the config_ mst_ generic master in the entity cache if it is enabled.
	 *
	 * @param config_Mst_GenericMaster the config_ mst_ generic master
	 */
	@Override
	public void cacheResult(Config_Mst_GenericMaster config_Mst_GenericMaster) {
		EntityCacheUtil.putResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			config_Mst_GenericMaster.getPrimaryKey(), config_Mst_GenericMaster);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
			new Object[] { config_Mst_GenericMaster.getGenericMasterId() },
			config_Mst_GenericMaster);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
			new Object[] {
				config_Mst_GenericMaster.getMasterType(),
				config_Mst_GenericMaster.getMasterKey()
			}, config_Mst_GenericMaster);

		config_Mst_GenericMaster.resetOriginalValues();
	}

	/**
	 * Caches the config_ mst_ generic masters in the entity cache if it is enabled.
	 *
	 * @param config_Mst_GenericMasters the config_ mst_ generic masters
	 */
	@Override
	public void cacheResult(
		List<Config_Mst_GenericMaster> config_Mst_GenericMasters) {
		for (Config_Mst_GenericMaster config_Mst_GenericMaster : config_Mst_GenericMasters) {
			if (EntityCacheUtil.getResult(
						Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
						Config_Mst_GenericMasterImpl.class,
						config_Mst_GenericMaster.getPrimaryKey()) == null) {
				cacheResult(config_Mst_GenericMaster);
			}
			else {
				config_Mst_GenericMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all config_ mst_ generic masters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Config_Mst_GenericMasterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Config_Mst_GenericMasterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the config_ mst_ generic master.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Config_Mst_GenericMaster config_Mst_GenericMaster) {
		EntityCacheUtil.removeResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			config_Mst_GenericMaster.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(config_Mst_GenericMaster);
	}

	@Override
	public void clearCache(
		List<Config_Mst_GenericMaster> config_Mst_GenericMasters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Config_Mst_GenericMaster config_Mst_GenericMaster : config_Mst_GenericMasters) {
			EntityCacheUtil.removeResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
				Config_Mst_GenericMasterImpl.class,
				config_Mst_GenericMaster.getPrimaryKey());

			clearUniqueFindersCache(config_Mst_GenericMaster);
		}
	}

	protected void cacheUniqueFindersCache(
		Config_Mst_GenericMaster config_Mst_GenericMaster) {
		if (config_Mst_GenericMaster.isNew()) {
			Object[] args = new Object[] {
					config_Mst_GenericMaster.getGenericMasterId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GENERICMASTERID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
				args, config_Mst_GenericMaster);

			args = new Object[] {
					config_Mst_GenericMaster.getMasterType(),
					config_Mst_GenericMaster.getMasterKey()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASTERTYPEANDMASTERKEY,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
				args, config_Mst_GenericMaster);
		}
		else {
			Config_Mst_GenericMasterModelImpl config_Mst_GenericMasterModelImpl = (Config_Mst_GenericMasterModelImpl)config_Mst_GenericMaster;

			if ((config_Mst_GenericMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GENERICMASTERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						config_Mst_GenericMaster.getGenericMasterId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GENERICMASTERID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
					args, config_Mst_GenericMaster);
			}

			if ((config_Mst_GenericMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						config_Mst_GenericMaster.getMasterType(),
						config_Mst_GenericMaster.getMasterKey()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASTERTYPEANDMASTERKEY,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
					args, config_Mst_GenericMaster);
			}
		}
	}

	protected void clearUniqueFindersCache(
		Config_Mst_GenericMaster config_Mst_GenericMaster) {
		Config_Mst_GenericMasterModelImpl config_Mst_GenericMasterModelImpl = (Config_Mst_GenericMasterModelImpl)config_Mst_GenericMaster;

		Object[] args = new Object[] {
				config_Mst_GenericMaster.getGenericMasterId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GENERICMASTERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GENERICMASTERID, args);

		if ((config_Mst_GenericMasterModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GENERICMASTERID.getColumnBitmask()) != 0) {
			args = new Object[] {
					config_Mst_GenericMasterModelImpl.getOriginalGenericMasterId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GENERICMASTERID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GENERICMASTERID,
				args);
		}

		args = new Object[] {
				config_Mst_GenericMaster.getMasterType(),
				config_Mst_GenericMaster.getMasterKey()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASTERTYPEANDMASTERKEY,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
			args);

		if ((config_Mst_GenericMasterModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY.getColumnBitmask()) != 0) {
			args = new Object[] {
					config_Mst_GenericMasterModelImpl.getOriginalMasterType(),
					config_Mst_GenericMasterModelImpl.getOriginalMasterKey()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASTERTYPEANDMASTERKEY,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASTERTYPEANDMASTERKEY,
				args);
		}
	}

	/**
	 * Creates a new config_ mst_ generic master with the primary key. Does not add the config_ mst_ generic master to the database.
	 *
	 * @param GenericMasterId the primary key for the new config_ mst_ generic master
	 * @return the new config_ mst_ generic master
	 */
	@Override
	public Config_Mst_GenericMaster create(int GenericMasterId) {
		Config_Mst_GenericMaster config_Mst_GenericMaster = new Config_Mst_GenericMasterImpl();

		config_Mst_GenericMaster.setNew(true);
		config_Mst_GenericMaster.setPrimaryKey(GenericMasterId);

		return config_Mst_GenericMaster;
	}

	/**
	 * Removes the config_ mst_ generic master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GenericMasterId the primary key of the config_ mst_ generic master
	 * @return the config_ mst_ generic master that was removed
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster remove(int GenericMasterId)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		return remove((Serializable)GenericMasterId);
	}

	/**
	 * Removes the config_ mst_ generic master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the config_ mst_ generic master
	 * @return the config_ mst_ generic master that was removed
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster remove(Serializable primaryKey)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Config_Mst_GenericMaster config_Mst_GenericMaster = (Config_Mst_GenericMaster)session.get(Config_Mst_GenericMasterImpl.class,
					primaryKey);

			if (config_Mst_GenericMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConfig_Mst_GenericMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(config_Mst_GenericMaster);
		}
		catch (NoSuchConfig_Mst_GenericMasterException nsee) {
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
	protected Config_Mst_GenericMaster removeImpl(
		Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws SystemException {
		config_Mst_GenericMaster = toUnwrappedModel(config_Mst_GenericMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(config_Mst_GenericMaster)) {
				config_Mst_GenericMaster = (Config_Mst_GenericMaster)session.get(Config_Mst_GenericMasterImpl.class,
						config_Mst_GenericMaster.getPrimaryKeyObj());
			}

			if (config_Mst_GenericMaster != null) {
				session.delete(config_Mst_GenericMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (config_Mst_GenericMaster != null) {
			clearCache(config_Mst_GenericMaster);
		}

		return config_Mst_GenericMaster;
	}

	@Override
	public Config_Mst_GenericMaster updateImpl(
		com.ifl.rapid.customer.model.Config_Mst_GenericMaster config_Mst_GenericMaster)
		throws SystemException {
		config_Mst_GenericMaster = toUnwrappedModel(config_Mst_GenericMaster);

		boolean isNew = config_Mst_GenericMaster.isNew();

		Config_Mst_GenericMasterModelImpl config_Mst_GenericMasterModelImpl = (Config_Mst_GenericMasterModelImpl)config_Mst_GenericMaster;

		Session session = null;

		try {
			session = openSession();

			if (config_Mst_GenericMaster.isNew()) {
				session.save(config_Mst_GenericMaster);

				config_Mst_GenericMaster.setNew(false);
			}
			else {
				session.merge(config_Mst_GenericMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !Config_Mst_GenericMasterModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((config_Mst_GenericMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						config_Mst_GenericMasterModelImpl.getOriginalMasterType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASTERTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERTYPE,
					args);

				args = new Object[] {
						config_Mst_GenericMasterModelImpl.getMasterType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASTERTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERTYPE,
					args);
			}
		}

		EntityCacheUtil.putResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
			Config_Mst_GenericMasterImpl.class,
			config_Mst_GenericMaster.getPrimaryKey(), config_Mst_GenericMaster);

		clearUniqueFindersCache(config_Mst_GenericMaster);
		cacheUniqueFindersCache(config_Mst_GenericMaster);

		return config_Mst_GenericMaster;
	}

	protected Config_Mst_GenericMaster toUnwrappedModel(
		Config_Mst_GenericMaster config_Mst_GenericMaster) {
		if (config_Mst_GenericMaster instanceof Config_Mst_GenericMasterImpl) {
			return config_Mst_GenericMaster;
		}

		Config_Mst_GenericMasterImpl config_Mst_GenericMasterImpl = new Config_Mst_GenericMasterImpl();

		config_Mst_GenericMasterImpl.setNew(config_Mst_GenericMaster.isNew());
		config_Mst_GenericMasterImpl.setPrimaryKey(config_Mst_GenericMaster.getPrimaryKey());

		config_Mst_GenericMasterImpl.setGenericMasterId(config_Mst_GenericMaster.getGenericMasterId());
		config_Mst_GenericMasterImpl.setMasterType(config_Mst_GenericMaster.getMasterType());
		config_Mst_GenericMasterImpl.setMasterId(config_Mst_GenericMaster.getMasterId());
		config_Mst_GenericMasterImpl.setMasterKey(config_Mst_GenericMaster.getMasterKey());
		config_Mst_GenericMasterImpl.setIsActive(config_Mst_GenericMaster.getIsActive());
		config_Mst_GenericMasterImpl.setCreatedBy(config_Mst_GenericMaster.getCreatedBy());
		config_Mst_GenericMasterImpl.setCreatedDate(config_Mst_GenericMaster.getCreatedDate());
		config_Mst_GenericMasterImpl.setModifiedBy(config_Mst_GenericMaster.getModifiedBy());
		config_Mst_GenericMasterImpl.setModifiedDate(config_Mst_GenericMaster.getModifiedDate());
		config_Mst_GenericMasterImpl.setDescription(config_Mst_GenericMaster.getDescription());

		return config_Mst_GenericMasterImpl;
	}

	/**
	 * Returns the config_ mst_ generic master with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the config_ mst_ generic master
	 * @return the config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = fetchByPrimaryKey(primaryKey);

		if (config_Mst_GenericMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConfig_Mst_GenericMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return config_Mst_GenericMaster;
	}

	/**
	 * Returns the config_ mst_ generic master with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException} if it could not be found.
	 *
	 * @param GenericMasterId the primary key of the config_ mst_ generic master
	 * @return the config_ mst_ generic master
	 * @throws com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster findByPrimaryKey(int GenericMasterId)
		throws NoSuchConfig_Mst_GenericMasterException, SystemException {
		return findByPrimaryKey((Serializable)GenericMasterId);
	}

	/**
	 * Returns the config_ mst_ generic master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the config_ mst_ generic master
	 * @return the config_ mst_ generic master, or <code>null</code> if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Config_Mst_GenericMaster config_Mst_GenericMaster = (Config_Mst_GenericMaster)EntityCacheUtil.getResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
				Config_Mst_GenericMasterImpl.class, primaryKey);

		if (config_Mst_GenericMaster == _nullConfig_Mst_GenericMaster) {
			return null;
		}

		if (config_Mst_GenericMaster == null) {
			Session session = null;

			try {
				session = openSession();

				config_Mst_GenericMaster = (Config_Mst_GenericMaster)session.get(Config_Mst_GenericMasterImpl.class,
						primaryKey);

				if (config_Mst_GenericMaster != null) {
					cacheResult(config_Mst_GenericMaster);
				}
				else {
					EntityCacheUtil.putResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
						Config_Mst_GenericMasterImpl.class, primaryKey,
						_nullConfig_Mst_GenericMaster);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Config_Mst_GenericMasterModelImpl.ENTITY_CACHE_ENABLED,
					Config_Mst_GenericMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return config_Mst_GenericMaster;
	}

	/**
	 * Returns the config_ mst_ generic master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GenericMasterId the primary key of the config_ mst_ generic master
	 * @return the config_ mst_ generic master, or <code>null</code> if a config_ mst_ generic master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Config_Mst_GenericMaster fetchByPrimaryKey(int GenericMasterId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)GenericMasterId);
	}

	/**
	 * Returns all the config_ mst_ generic masters.
	 *
	 * @return the config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Config_Mst_GenericMaster> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the config_ mst_ generic masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of config_ mst_ generic masters
	 * @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	 * @return the range of config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Config_Mst_GenericMaster> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the config_ mst_ generic masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.Config_Mst_GenericMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of config_ mst_ generic masters
	 * @param end the upper bound of the range of config_ mst_ generic masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of config_ mst_ generic masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Config_Mst_GenericMaster> findAll(int start, int end,
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

		List<Config_Mst_GenericMaster> list = (List<Config_Mst_GenericMaster>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONFIG_MST_GENERICMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONFIG_MST_GENERICMASTER;

				if (pagination) {
					sql = sql.concat(Config_Mst_GenericMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Config_Mst_GenericMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Config_Mst_GenericMaster>(list);
				}
				else {
					list = (List<Config_Mst_GenericMaster>)QueryUtil.list(q,
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
	 * Removes all the config_ mst_ generic masters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Config_Mst_GenericMaster config_Mst_GenericMaster : findAll()) {
			remove(config_Mst_GenericMaster);
		}
	}

	/**
	 * Returns the number of config_ mst_ generic masters.
	 *
	 * @return the number of config_ mst_ generic masters
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

				Query q = session.createQuery(_SQL_COUNT_CONFIG_MST_GENERICMASTER);

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
	 * Initializes the config_ mst_ generic master persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.Config_Mst_GenericMaster")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Config_Mst_GenericMaster>> listenersList = new ArrayList<ModelListener<Config_Mst_GenericMaster>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Config_Mst_GenericMaster>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Config_Mst_GenericMasterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONFIG_MST_GENERICMASTER = "SELECT config_Mst_GenericMaster FROM Config_Mst_GenericMaster config_Mst_GenericMaster";
	private static final String _SQL_SELECT_CONFIG_MST_GENERICMASTER_WHERE = "SELECT config_Mst_GenericMaster FROM Config_Mst_GenericMaster config_Mst_GenericMaster WHERE ";
	private static final String _SQL_COUNT_CONFIG_MST_GENERICMASTER = "SELECT COUNT(config_Mst_GenericMaster) FROM Config_Mst_GenericMaster config_Mst_GenericMaster";
	private static final String _SQL_COUNT_CONFIG_MST_GENERICMASTER_WHERE = "SELECT COUNT(config_Mst_GenericMaster) FROM Config_Mst_GenericMaster config_Mst_GenericMaster WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "config_Mst_GenericMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Config_Mst_GenericMaster exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Config_Mst_GenericMaster exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Config_Mst_GenericMasterPersistenceImpl.class);
	private static Config_Mst_GenericMaster _nullConfig_Mst_GenericMaster = new Config_Mst_GenericMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Config_Mst_GenericMaster> toCacheModel() {
				return _nullConfig_Mst_GenericMasterCacheModel;
			}
		};

	private static CacheModel<Config_Mst_GenericMaster> _nullConfig_Mst_GenericMasterCacheModel =
		new CacheModel<Config_Mst_GenericMaster>() {
			@Override
			public Config_Mst_GenericMaster toEntityModel() {
				return _nullConfig_Mst_GenericMaster;
			}
		};
}