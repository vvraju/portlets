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

import com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException;
import com.ifl.rapid.customer.model.ApplyTrnQuoteDetails;
import com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsImpl;
import com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the apply trn quote details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnQuoteDetailsPersistence
 * @see ApplyTrnQuoteDetailsUtil
 * @generated
 */
public class ApplyTrnQuoteDetailsPersistenceImpl extends BasePersistenceImpl<ApplyTrnQuoteDetails>
	implements ApplyTrnQuoteDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplyTrnQuoteDetailsUtil} to access the apply trn quote details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplyTrnQuoteDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			ApplyTrnQuoteDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			ApplyTrnQuoteDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CONTACTID = new FinderPath(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			ApplyTrnQuoteDetailsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByContactId", new String[] { Integer.class.getName() },
			ApplyTrnQuoteDetailsModelImpl.CONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTID = new FinderPath(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByContactId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the apply trn quote details where ContactId = &#63; or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException} if it could not be found.
	 *
	 * @param ContactId the contact ID
	 * @return the matching apply trn quote details
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a matching apply trn quote details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails findByContactId(int ContactId)
		throws NoSuchApplyTrnQuoteDetailsException, SystemException {
		ApplyTrnQuoteDetails applyTrnQuoteDetails = fetchByContactId(ContactId);

		if (applyTrnQuoteDetails == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ContactId=");
			msg.append(ContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchApplyTrnQuoteDetailsException(msg.toString());
		}

		return applyTrnQuoteDetails;
	}

	/**
	 * Returns the apply trn quote details where ContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @return the matching apply trn quote details, or <code>null</code> if a matching apply trn quote details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails fetchByContactId(int ContactId)
		throws SystemException {
		return fetchByContactId(ContactId, true);
	}

	/**
	 * Returns the apply trn quote details where ContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ContactId the contact ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching apply trn quote details, or <code>null</code> if a matching apply trn quote details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails fetchByContactId(int ContactId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { ContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CONTACTID,
					finderArgs, this);
		}

		if (result instanceof ApplyTrnQuoteDetails) {
			ApplyTrnQuoteDetails applyTrnQuoteDetails = (ApplyTrnQuoteDetails)result;

			if ((ContactId != applyTrnQuoteDetails.getContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_APPLYTRNQUOTEDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

				List<ApplyTrnQuoteDetails> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ApplyTrnQuoteDetailsPersistenceImpl.fetchByContactId(int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ApplyTrnQuoteDetails applyTrnQuoteDetails = list.get(0);

					result = applyTrnQuoteDetails;

					cacheResult(applyTrnQuoteDetails);

					if ((applyTrnQuoteDetails.getContactId() != ContactId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
							finderArgs, applyTrnQuoteDetails);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID,
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
			return (ApplyTrnQuoteDetails)result;
		}
	}

	/**
	 * Removes the apply trn quote details where ContactId = &#63; from the database.
	 *
	 * @param ContactId the contact ID
	 * @return the apply trn quote details that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails removeByContactId(int ContactId)
		throws NoSuchApplyTrnQuoteDetailsException, SystemException {
		ApplyTrnQuoteDetails applyTrnQuoteDetails = findByContactId(ContactId);

		return remove(applyTrnQuoteDetails);
	}

	/**
	 * Returns the number of apply trn quote detailses where ContactId = &#63;.
	 *
	 * @param ContactId the contact ID
	 * @return the number of matching apply trn quote detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactId(int ContactId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTID;

		Object[] finderArgs = new Object[] { ContactId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPLYTRNQUOTEDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTACTID_CONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ContactId);

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

	private static final String _FINDER_COLUMN_CONTACTID_CONTACTID_2 = "applyTrnQuoteDetails.ContactId = ?";

	public ApplyTrnQuoteDetailsPersistenceImpl() {
		setModelClass(ApplyTrnQuoteDetails.class);
	}

	/**
	 * Caches the apply trn quote details in the entity cache if it is enabled.
	 *
	 * @param applyTrnQuoteDetails the apply trn quote details
	 */
	@Override
	public void cacheResult(ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		EntityCacheUtil.putResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsImpl.class,
			applyTrnQuoteDetails.getPrimaryKey(), applyTrnQuoteDetails);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID,
			new Object[] { applyTrnQuoteDetails.getContactId() },
			applyTrnQuoteDetails);

		applyTrnQuoteDetails.resetOriginalValues();
	}

	/**
	 * Caches the apply trn quote detailses in the entity cache if it is enabled.
	 *
	 * @param applyTrnQuoteDetailses the apply trn quote detailses
	 */
	@Override
	public void cacheResult(List<ApplyTrnQuoteDetails> applyTrnQuoteDetailses) {
		for (ApplyTrnQuoteDetails applyTrnQuoteDetails : applyTrnQuoteDetailses) {
			if (EntityCacheUtil.getResult(
						ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
						ApplyTrnQuoteDetailsImpl.class,
						applyTrnQuoteDetails.getPrimaryKey()) == null) {
				cacheResult(applyTrnQuoteDetails);
			}
			else {
				applyTrnQuoteDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all apply trn quote detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApplyTrnQuoteDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApplyTrnQuoteDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the apply trn quote details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		EntityCacheUtil.removeResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsImpl.class, applyTrnQuoteDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(applyTrnQuoteDetails);
	}

	@Override
	public void clearCache(List<ApplyTrnQuoteDetails> applyTrnQuoteDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApplyTrnQuoteDetails applyTrnQuoteDetails : applyTrnQuoteDetailses) {
			EntityCacheUtil.removeResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
				ApplyTrnQuoteDetailsImpl.class,
				applyTrnQuoteDetails.getPrimaryKey());

			clearUniqueFindersCache(applyTrnQuoteDetails);
		}
	}

	protected void cacheUniqueFindersCache(
		ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		if (applyTrnQuoteDetails.isNew()) {
			Object[] args = new Object[] { applyTrnQuoteDetails.getContactId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
				applyTrnQuoteDetails);
		}
		else {
			ApplyTrnQuoteDetailsModelImpl applyTrnQuoteDetailsModelImpl = (ApplyTrnQuoteDetailsModelImpl)applyTrnQuoteDetails;

			if ((applyTrnQuoteDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { applyTrnQuoteDetails.getContactId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CONTACTID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CONTACTID, args,
					applyTrnQuoteDetails);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		ApplyTrnQuoteDetailsModelImpl applyTrnQuoteDetailsModelImpl = (ApplyTrnQuoteDetailsModelImpl)applyTrnQuoteDetails;

		Object[] args = new Object[] { applyTrnQuoteDetails.getContactId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);

		if ((applyTrnQuoteDetailsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONTACTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					applyTrnQuoteDetailsModelImpl.getOriginalContactId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CONTACTID, args);
		}
	}

	/**
	 * Creates a new apply trn quote details with the primary key. Does not add the apply trn quote details to the database.
	 *
	 * @param QuoteId the primary key for the new apply trn quote details
	 * @return the new apply trn quote details
	 */
	@Override
	public ApplyTrnQuoteDetails create(String QuoteId) {
		ApplyTrnQuoteDetails applyTrnQuoteDetails = new ApplyTrnQuoteDetailsImpl();

		applyTrnQuoteDetails.setNew(true);
		applyTrnQuoteDetails.setPrimaryKey(QuoteId);

		return applyTrnQuoteDetails;
	}

	/**
	 * Removes the apply trn quote details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QuoteId the primary key of the apply trn quote details
	 * @return the apply trn quote details that was removed
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a apply trn quote details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails remove(String QuoteId)
		throws NoSuchApplyTrnQuoteDetailsException, SystemException {
		return remove((Serializable)QuoteId);
	}

	/**
	 * Removes the apply trn quote details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the apply trn quote details
	 * @return the apply trn quote details that was removed
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a apply trn quote details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails remove(Serializable primaryKey)
		throws NoSuchApplyTrnQuoteDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ApplyTrnQuoteDetails applyTrnQuoteDetails = (ApplyTrnQuoteDetails)session.get(ApplyTrnQuoteDetailsImpl.class,
					primaryKey);

			if (applyTrnQuoteDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplyTrnQuoteDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(applyTrnQuoteDetails);
		}
		catch (NoSuchApplyTrnQuoteDetailsException nsee) {
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
	protected ApplyTrnQuoteDetails removeImpl(
		ApplyTrnQuoteDetails applyTrnQuoteDetails) throws SystemException {
		applyTrnQuoteDetails = toUnwrappedModel(applyTrnQuoteDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(applyTrnQuoteDetails)) {
				applyTrnQuoteDetails = (ApplyTrnQuoteDetails)session.get(ApplyTrnQuoteDetailsImpl.class,
						applyTrnQuoteDetails.getPrimaryKeyObj());
			}

			if (applyTrnQuoteDetails != null) {
				session.delete(applyTrnQuoteDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (applyTrnQuoteDetails != null) {
			clearCache(applyTrnQuoteDetails);
		}

		return applyTrnQuoteDetails;
	}

	@Override
	public ApplyTrnQuoteDetails updateImpl(
		com.ifl.rapid.customer.model.ApplyTrnQuoteDetails applyTrnQuoteDetails)
		throws SystemException {
		applyTrnQuoteDetails = toUnwrappedModel(applyTrnQuoteDetails);

		boolean isNew = applyTrnQuoteDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (applyTrnQuoteDetails.isNew()) {
				session.save(applyTrnQuoteDetails);

				applyTrnQuoteDetails.setNew(false);
			}
			else {
				session.merge(applyTrnQuoteDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApplyTrnQuoteDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ApplyTrnQuoteDetailsImpl.class,
			applyTrnQuoteDetails.getPrimaryKey(), applyTrnQuoteDetails);

		clearUniqueFindersCache(applyTrnQuoteDetails);
		cacheUniqueFindersCache(applyTrnQuoteDetails);

		return applyTrnQuoteDetails;
	}

	protected ApplyTrnQuoteDetails toUnwrappedModel(
		ApplyTrnQuoteDetails applyTrnQuoteDetails) {
		if (applyTrnQuoteDetails instanceof ApplyTrnQuoteDetailsImpl) {
			return applyTrnQuoteDetails;
		}

		ApplyTrnQuoteDetailsImpl applyTrnQuoteDetailsImpl = new ApplyTrnQuoteDetailsImpl();

		applyTrnQuoteDetailsImpl.setNew(applyTrnQuoteDetails.isNew());
		applyTrnQuoteDetailsImpl.setPrimaryKey(applyTrnQuoteDetails.getPrimaryKey());

		applyTrnQuoteDetailsImpl.setQuoteId(applyTrnQuoteDetails.getQuoteId());
		applyTrnQuoteDetailsImpl.setContactId(applyTrnQuoteDetails.getContactId());
		applyTrnQuoteDetailsImpl.setProductId(applyTrnQuoteDetails.getProductId());
		applyTrnQuoteDetailsImpl.setPremiumTypeId(applyTrnQuoteDetails.getPremiumTypeId());
		applyTrnQuoteDetailsImpl.setPremiumFrequencyId(applyTrnQuoteDetails.getPremiumFrequencyId());
		applyTrnQuoteDetailsImpl.setAssuredTerm(applyTrnQuoteDetails.getAssuredTerm());
		applyTrnQuoteDetailsImpl.setAssuredAge(applyTrnQuoteDetails.getAssuredAge());
		applyTrnQuoteDetailsImpl.setDataXml(applyTrnQuoteDetails.getDataXml());
		applyTrnQuoteDetailsImpl.setDeathBenefitOption(applyTrnQuoteDetails.getDeathBenefitOption());
		applyTrnQuoteDetailsImpl.setExpiryDate(applyTrnQuoteDetails.getExpiryDate());
		applyTrnQuoteDetailsImpl.setIsStaff(applyTrnQuoteDetails.getIsStaff());
		applyTrnQuoteDetailsImpl.setIsActive(applyTrnQuoteDetails.getIsActive());
		applyTrnQuoteDetailsImpl.setPolicyOption(applyTrnQuoteDetails.getPolicyOption());
		applyTrnQuoteDetailsImpl.setPayingTerm(applyTrnQuoteDetails.getPayingTerm());
		applyTrnQuoteDetailsImpl.setProposalStartDate(applyTrnQuoteDetails.getProposalStartDate());
		applyTrnQuoteDetailsImpl.setRefNo(applyTrnQuoteDetails.getRefNo());
		applyTrnQuoteDetailsImpl.setPlanTerm(applyTrnQuoteDetails.getPlanTerm());
		applyTrnQuoteDetailsImpl.setPremiumTerm(applyTrnQuoteDetails.getPremiumTerm());
		applyTrnQuoteDetailsImpl.setPremiumAmount(applyTrnQuoteDetails.getPremiumAmount());
		applyTrnQuoteDetailsImpl.setSumAssured(applyTrnQuoteDetails.getSumAssured());
		applyTrnQuoteDetailsImpl.setSummaryXml(applyTrnQuoteDetails.getSummaryXml());
		applyTrnQuoteDetailsImpl.setPdfLocation(applyTrnQuoteDetails.getPdfLocation());
		applyTrnQuoteDetailsImpl.setCreatedBy(applyTrnQuoteDetails.getCreatedBy());
		applyTrnQuoteDetailsImpl.setCreatedDate(applyTrnQuoteDetails.getCreatedDate());
		applyTrnQuoteDetailsImpl.setModifiedDate(applyTrnQuoteDetails.getModifiedDate());
		applyTrnQuoteDetailsImpl.setModifiedBy(applyTrnQuoteDetails.getModifiedBy());
		applyTrnQuoteDetailsImpl.setPdfDataXml(applyTrnQuoteDetails.getPdfDataXml());
		applyTrnQuoteDetailsImpl.setIsSmoker(applyTrnQuoteDetails.getIsSmoker());
		applyTrnQuoteDetailsImpl.setSignatureFilePath(applyTrnQuoteDetails.getSignatureFilePath());
		applyTrnQuoteDetailsImpl.setBDMSignatureFilePath(applyTrnQuoteDetails.getBDMSignatureFilePath());
		applyTrnQuoteDetailsImpl.setBDMId(applyTrnQuoteDetails.getBDMId());
		applyTrnQuoteDetailsImpl.setIsAssisted(applyTrnQuoteDetails.getIsAssisted());
		applyTrnQuoteDetailsImpl.setInputXML(applyTrnQuoteDetails.getInputXML());
		applyTrnQuoteDetailsImpl.setLeadId(applyTrnQuoteDetails.getLeadId());

		return applyTrnQuoteDetailsImpl;
	}

	/**
	 * Returns the apply trn quote details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the apply trn quote details
	 * @return the apply trn quote details
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a apply trn quote details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplyTrnQuoteDetailsException, SystemException {
		ApplyTrnQuoteDetails applyTrnQuoteDetails = fetchByPrimaryKey(primaryKey);

		if (applyTrnQuoteDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplyTrnQuoteDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return applyTrnQuoteDetails;
	}

	/**
	 * Returns the apply trn quote details with the primary key or throws a {@link com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException} if it could not be found.
	 *
	 * @param QuoteId the primary key of the apply trn quote details
	 * @return the apply trn quote details
	 * @throws com.ifl.rapid.customer.NoSuchApplyTrnQuoteDetailsException if a apply trn quote details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails findByPrimaryKey(String QuoteId)
		throws NoSuchApplyTrnQuoteDetailsException, SystemException {
		return findByPrimaryKey((Serializable)QuoteId);
	}

	/**
	 * Returns the apply trn quote details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the apply trn quote details
	 * @return the apply trn quote details, or <code>null</code> if a apply trn quote details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ApplyTrnQuoteDetails applyTrnQuoteDetails = (ApplyTrnQuoteDetails)EntityCacheUtil.getResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
				ApplyTrnQuoteDetailsImpl.class, primaryKey);

		if (applyTrnQuoteDetails == _nullApplyTrnQuoteDetails) {
			return null;
		}

		if (applyTrnQuoteDetails == null) {
			Session session = null;

			try {
				session = openSession();

				applyTrnQuoteDetails = (ApplyTrnQuoteDetails)session.get(ApplyTrnQuoteDetailsImpl.class,
						primaryKey);

				if (applyTrnQuoteDetails != null) {
					cacheResult(applyTrnQuoteDetails);
				}
				else {
					EntityCacheUtil.putResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
						ApplyTrnQuoteDetailsImpl.class, primaryKey,
						_nullApplyTrnQuoteDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApplyTrnQuoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
					ApplyTrnQuoteDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return applyTrnQuoteDetails;
	}

	/**
	 * Returns the apply trn quote details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param QuoteId the primary key of the apply trn quote details
	 * @return the apply trn quote details, or <code>null</code> if a apply trn quote details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApplyTrnQuoteDetails fetchByPrimaryKey(String QuoteId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)QuoteId);
	}

	/**
	 * Returns all the apply trn quote detailses.
	 *
	 * @return the apply trn quote detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplyTrnQuoteDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apply trn quote detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of apply trn quote detailses
	 * @param end the upper bound of the range of apply trn quote detailses (not inclusive)
	 * @return the range of apply trn quote detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplyTrnQuoteDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the apply trn quote detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifl.rapid.customer.model.impl.ApplyTrnQuoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of apply trn quote detailses
	 * @param end the upper bound of the range of apply trn quote detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of apply trn quote detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApplyTrnQuoteDetails> findAll(int start, int end,
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

		List<ApplyTrnQuoteDetails> list = (List<ApplyTrnQuoteDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPLYTRNQUOTEDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLYTRNQUOTEDETAILS;

				if (pagination) {
					sql = sql.concat(ApplyTrnQuoteDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ApplyTrnQuoteDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApplyTrnQuoteDetails>(list);
				}
				else {
					list = (List<ApplyTrnQuoteDetails>)QueryUtil.list(q,
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
	 * Removes all the apply trn quote detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ApplyTrnQuoteDetails applyTrnQuoteDetails : findAll()) {
			remove(applyTrnQuoteDetails);
		}
	}

	/**
	 * Returns the number of apply trn quote detailses.
	 *
	 * @return the number of apply trn quote detailses
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

				Query q = session.createQuery(_SQL_COUNT_APPLYTRNQUOTEDETAILS);

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
	 * Initializes the apply trn quote details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ifl.rapid.customer.model.ApplyTrnQuoteDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ApplyTrnQuoteDetails>> listenersList = new ArrayList<ModelListener<ApplyTrnQuoteDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ApplyTrnQuoteDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ApplyTrnQuoteDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPLYTRNQUOTEDETAILS = "SELECT applyTrnQuoteDetails FROM ApplyTrnQuoteDetails applyTrnQuoteDetails";
	private static final String _SQL_SELECT_APPLYTRNQUOTEDETAILS_WHERE = "SELECT applyTrnQuoteDetails FROM ApplyTrnQuoteDetails applyTrnQuoteDetails WHERE ";
	private static final String _SQL_COUNT_APPLYTRNQUOTEDETAILS = "SELECT COUNT(applyTrnQuoteDetails) FROM ApplyTrnQuoteDetails applyTrnQuoteDetails";
	private static final String _SQL_COUNT_APPLYTRNQUOTEDETAILS_WHERE = "SELECT COUNT(applyTrnQuoteDetails) FROM ApplyTrnQuoteDetails applyTrnQuoteDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "applyTrnQuoteDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ApplyTrnQuoteDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ApplyTrnQuoteDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApplyTrnQuoteDetailsPersistenceImpl.class);
	private static ApplyTrnQuoteDetails _nullApplyTrnQuoteDetails = new ApplyTrnQuoteDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ApplyTrnQuoteDetails> toCacheModel() {
				return _nullApplyTrnQuoteDetailsCacheModel;
			}
		};

	private static CacheModel<ApplyTrnQuoteDetails> _nullApplyTrnQuoteDetailsCacheModel =
		new CacheModel<ApplyTrnQuoteDetails>() {
			@Override
			public ApplyTrnQuoteDetails toEntityModel() {
				return _nullApplyTrnQuoteDetails;
			}
		};
}