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

package com.ifli.rapid.service.base;

import com.ifli.rapid.model.QRCTeamMaster;
import com.ifli.rapid.service.QRCTeamMasterLocalService;
import com.ifli.rapid.service.persistence.ActiveServiceRequestsPersistence;
import com.ifli.rapid.service.persistence.AddressChangeReqDetailsPersistence;
import com.ifli.rapid.service.persistence.AddressTypePersistence;
import com.ifli.rapid.service.persistence.BranchDetailsPersistence;
import com.ifli.rapid.service.persistence.ChequePaymentRequestPersistence;
import com.ifli.rapid.service.persistence.CityDetailsPersistence;
import com.ifli.rapid.service.persistence.ClosedServiceRequestsPersistence;
import com.ifli.rapid.service.persistence.ConfirmDetailsPersistence;
import com.ifli.rapid.service.persistence.CustomerFamilyDetailsPersistence;
import com.ifli.rapid.service.persistence.CustomerMobileNumbersPersistence;
import com.ifli.rapid.service.persistence.CustomerOtpPersistence;
import com.ifli.rapid.service.persistence.CustomerPersistence;
import com.ifli.rapid.service.persistence.FamilyRelationsPersistence;
import com.ifli.rapid.service.persistence.FundMasterPersistence;
import com.ifli.rapid.service.persistence.LocationDetailsPersistence;
import com.ifli.rapid.service.persistence.NavHistoryPersistence;
import com.ifli.rapid.service.persistence.POLICY_DOC_TYPESPersistence;
import com.ifli.rapid.service.persistence.PREMIUM_PAID_CERTIFICATEPersistence;
import com.ifli.rapid.service.persistence.PaymentDetailsPersistence;
import com.ifli.rapid.service.persistence.PaymentGatewayMasterPersistence;
import com.ifli.rapid.service.persistence.PaymentMethodMasterPersistence;
import com.ifli.rapid.service.persistence.PaymentMethodTypePersistence;
import com.ifli.rapid.service.persistence.PaymentOptionMasterPersistence;
import com.ifli.rapid.service.persistence.PaymentOptionTypesPersistence;
import com.ifli.rapid.service.persistence.PaymentTransactionStatusMasterPersistence;
import com.ifli.rapid.service.persistence.PincodeDetailsPersistence;
import com.ifli.rapid.service.persistence.PolicyAddressPersistence;
import com.ifli.rapid.service.persistence.PolicyFundPersistence;
import com.ifli.rapid.service.persistence.PolicyFundSwitchCounterPersistence;
import com.ifli.rapid.service.persistence.PolicyFundSwitchDetailsPersistence;
import com.ifli.rapid.service.persistence.PolicyInfoPersistence;
import com.ifli.rapid.service.persistence.PolicyPremPercentagePersistence;
import com.ifli.rapid.service.persistence.PolicyPremRedirectionDetailsPersistence;
import com.ifli.rapid.service.persistence.PolicyTopupDetailsPersistence;
import com.ifli.rapid.service.persistence.PremiumFrequencyMasterPersistence;
import com.ifli.rapid.service.persistence.PremiumTypePersistence;
import com.ifli.rapid.service.persistence.ProductFundMappingPersistence;
import com.ifli.rapid.service.persistence.ProofDocsPersistence;
import com.ifli.rapid.service.persistence.QRCStatusPersistence;
import com.ifli.rapid.service.persistence.QRCSubTypeMasterPersistence;
import com.ifli.rapid.service.persistence.QRCTeamMasterPersistence;
import com.ifli.rapid.service.persistence.QRCTypeMasterPersistence;
import com.ifli.rapid.service.persistence.QRCUserPersistence;
import com.ifli.rapid.service.persistence.RENEWAL_PREMIUMPersistence;
import com.ifli.rapid.service.persistence.Recommended_ProductsPersistence;
import com.ifli.rapid.service.persistence.ServiceMasterPersistence;
import com.ifli.rapid.service.persistence.ServiceRequestMasterPersistence;
import com.ifli.rapid.service.persistence.ServiceSubMasterPersistence;
import com.ifli.rapid.service.persistence.StateDetailsPersistence;
import com.ifli.rapid.service.persistence.TempCustomerAddressPersistence;
import com.ifli.rapid.service.persistence.TempCustomerPersistence;
import com.ifli.rapid.service.persistence.customerAddressPersistence;
import com.ifli.rapid.service.persistence.customerMailIdsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the q r c team master local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ifli.rapid.service.impl.QRCTeamMasterLocalServiceImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see com.ifli.rapid.service.impl.QRCTeamMasterLocalServiceImpl
 * @see com.ifli.rapid.service.QRCTeamMasterLocalServiceUtil
 * @generated
 */
public abstract class QRCTeamMasterLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements QRCTeamMasterLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.ifli.rapid.service.QRCTeamMasterLocalServiceUtil} to access the q r c team master local service.
	 */

	/**
	 * Adds the q r c team master to the database. Also notifies the appropriate model listeners.
	 *
	 * @param qrcTeamMaster the q r c team master
	 * @return the q r c team master that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QRCTeamMaster addQRCTeamMaster(QRCTeamMaster qrcTeamMaster)
		throws SystemException {
		qrcTeamMaster.setNew(true);

		return qrcTeamMasterPersistence.update(qrcTeamMaster);
	}

	/**
	 * Creates a new q r c team master with the primary key. Does not add the q r c team master to the database.
	 *
	 * @param QRC_TM_ID the primary key for the new q r c team master
	 * @return the new q r c team master
	 */
	@Override
	public QRCTeamMaster createQRCTeamMaster(int QRC_TM_ID) {
		return qrcTeamMasterPersistence.create(QRC_TM_ID);
	}

	/**
	 * Deletes the q r c team master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param QRC_TM_ID the primary key of the q r c team master
	 * @return the q r c team master that was removed
	 * @throws PortalException if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QRCTeamMaster deleteQRCTeamMaster(int QRC_TM_ID)
		throws PortalException, SystemException {
		return qrcTeamMasterPersistence.remove(QRC_TM_ID);
	}

	/**
	 * Deletes the q r c team master from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qrcTeamMaster the q r c team master
	 * @return the q r c team master that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QRCTeamMaster deleteQRCTeamMaster(QRCTeamMaster qrcTeamMaster)
		throws SystemException {
		return qrcTeamMasterPersistence.remove(qrcTeamMaster);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(QRCTeamMaster.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return qrcTeamMasterPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTeamMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return qrcTeamMasterPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTeamMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return qrcTeamMasterPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return qrcTeamMasterPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return qrcTeamMasterPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public QRCTeamMaster fetchQRCTeamMaster(int QRC_TM_ID)
		throws SystemException {
		return qrcTeamMasterPersistence.fetchByPrimaryKey(QRC_TM_ID);
	}

	/**
	 * Returns the q r c team master with the primary key.
	 *
	 * @param QRC_TM_ID the primary key of the q r c team master
	 * @return the q r c team master
	 * @throws PortalException if a q r c team master with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QRCTeamMaster getQRCTeamMaster(int QRC_TM_ID)
		throws PortalException, SystemException {
		return qrcTeamMasterPersistence.findByPrimaryKey(QRC_TM_ID);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return qrcTeamMasterPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the q r c team masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ifli.rapid.model.impl.QRCTeamMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q r c team masters
	 * @param end the upper bound of the range of q r c team masters (not inclusive)
	 * @return the range of q r c team masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QRCTeamMaster> getQRCTeamMasters(int start, int end)
		throws SystemException {
		return qrcTeamMasterPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of q r c team masters.
	 *
	 * @return the number of q r c team masters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getQRCTeamMastersCount() throws SystemException {
		return qrcTeamMasterPersistence.countAll();
	}

	/**
	 * Updates the q r c team master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param qrcTeamMaster the q r c team master
	 * @return the q r c team master that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QRCTeamMaster updateQRCTeamMaster(QRCTeamMaster qrcTeamMaster)
		throws SystemException {
		return qrcTeamMasterPersistence.update(qrcTeamMaster);
	}

	/**
	 * Returns the active service requests local service.
	 *
	 * @return the active service requests local service
	 */
	public com.ifli.rapid.service.ActiveServiceRequestsLocalService getActiveServiceRequestsLocalService() {
		return activeServiceRequestsLocalService;
	}

	/**
	 * Sets the active service requests local service.
	 *
	 * @param activeServiceRequestsLocalService the active service requests local service
	 */
	public void setActiveServiceRequestsLocalService(
		com.ifli.rapid.service.ActiveServiceRequestsLocalService activeServiceRequestsLocalService) {
		this.activeServiceRequestsLocalService = activeServiceRequestsLocalService;
	}

	/**
	 * Returns the active service requests remote service.
	 *
	 * @return the active service requests remote service
	 */
	public com.ifli.rapid.service.ActiveServiceRequestsService getActiveServiceRequestsService() {
		return activeServiceRequestsService;
	}

	/**
	 * Sets the active service requests remote service.
	 *
	 * @param activeServiceRequestsService the active service requests remote service
	 */
	public void setActiveServiceRequestsService(
		com.ifli.rapid.service.ActiveServiceRequestsService activeServiceRequestsService) {
		this.activeServiceRequestsService = activeServiceRequestsService;
	}

	/**
	 * Returns the active service requests persistence.
	 *
	 * @return the active service requests persistence
	 */
	public ActiveServiceRequestsPersistence getActiveServiceRequestsPersistence() {
		return activeServiceRequestsPersistence;
	}

	/**
	 * Sets the active service requests persistence.
	 *
	 * @param activeServiceRequestsPersistence the active service requests persistence
	 */
	public void setActiveServiceRequestsPersistence(
		ActiveServiceRequestsPersistence activeServiceRequestsPersistence) {
		this.activeServiceRequestsPersistence = activeServiceRequestsPersistence;
	}

	/**
	 * Returns the address change req details local service.
	 *
	 * @return the address change req details local service
	 */
	public com.ifli.rapid.service.AddressChangeReqDetailsLocalService getAddressChangeReqDetailsLocalService() {
		return addressChangeReqDetailsLocalService;
	}

	/**
	 * Sets the address change req details local service.
	 *
	 * @param addressChangeReqDetailsLocalService the address change req details local service
	 */
	public void setAddressChangeReqDetailsLocalService(
		com.ifli.rapid.service.AddressChangeReqDetailsLocalService addressChangeReqDetailsLocalService) {
		this.addressChangeReqDetailsLocalService = addressChangeReqDetailsLocalService;
	}

	/**
	 * Returns the address change req details persistence.
	 *
	 * @return the address change req details persistence
	 */
	public AddressChangeReqDetailsPersistence getAddressChangeReqDetailsPersistence() {
		return addressChangeReqDetailsPersistence;
	}

	/**
	 * Sets the address change req details persistence.
	 *
	 * @param addressChangeReqDetailsPersistence the address change req details persistence
	 */
	public void setAddressChangeReqDetailsPersistence(
		AddressChangeReqDetailsPersistence addressChangeReqDetailsPersistence) {
		this.addressChangeReqDetailsPersistence = addressChangeReqDetailsPersistence;
	}

	/**
	 * Returns the address type local service.
	 *
	 * @return the address type local service
	 */
	public com.ifli.rapid.service.AddressTypeLocalService getAddressTypeLocalService() {
		return addressTypeLocalService;
	}

	/**
	 * Sets the address type local service.
	 *
	 * @param addressTypeLocalService the address type local service
	 */
	public void setAddressTypeLocalService(
		com.ifli.rapid.service.AddressTypeLocalService addressTypeLocalService) {
		this.addressTypeLocalService = addressTypeLocalService;
	}

	/**
	 * Returns the address type persistence.
	 *
	 * @return the address type persistence
	 */
	public AddressTypePersistence getAddressTypePersistence() {
		return addressTypePersistence;
	}

	/**
	 * Sets the address type persistence.
	 *
	 * @param addressTypePersistence the address type persistence
	 */
	public void setAddressTypePersistence(
		AddressTypePersistence addressTypePersistence) {
		this.addressTypePersistence = addressTypePersistence;
	}

	/**
	 * Returns the branch details local service.
	 *
	 * @return the branch details local service
	 */
	public com.ifli.rapid.service.BranchDetailsLocalService getBranchDetailsLocalService() {
		return branchDetailsLocalService;
	}

	/**
	 * Sets the branch details local service.
	 *
	 * @param branchDetailsLocalService the branch details local service
	 */
	public void setBranchDetailsLocalService(
		com.ifli.rapid.service.BranchDetailsLocalService branchDetailsLocalService) {
		this.branchDetailsLocalService = branchDetailsLocalService;
	}

	/**
	 * Returns the branch details persistence.
	 *
	 * @return the branch details persistence
	 */
	public BranchDetailsPersistence getBranchDetailsPersistence() {
		return branchDetailsPersistence;
	}

	/**
	 * Sets the branch details persistence.
	 *
	 * @param branchDetailsPersistence the branch details persistence
	 */
	public void setBranchDetailsPersistence(
		BranchDetailsPersistence branchDetailsPersistence) {
		this.branchDetailsPersistence = branchDetailsPersistence;
	}

	/**
	 * Returns the cheque payment request local service.
	 *
	 * @return the cheque payment request local service
	 */
	public com.ifli.rapid.service.ChequePaymentRequestLocalService getChequePaymentRequestLocalService() {
		return chequePaymentRequestLocalService;
	}

	/**
	 * Sets the cheque payment request local service.
	 *
	 * @param chequePaymentRequestLocalService the cheque payment request local service
	 */
	public void setChequePaymentRequestLocalService(
		com.ifli.rapid.service.ChequePaymentRequestLocalService chequePaymentRequestLocalService) {
		this.chequePaymentRequestLocalService = chequePaymentRequestLocalService;
	}

	/**
	 * Returns the cheque payment request persistence.
	 *
	 * @return the cheque payment request persistence
	 */
	public ChequePaymentRequestPersistence getChequePaymentRequestPersistence() {
		return chequePaymentRequestPersistence;
	}

	/**
	 * Sets the cheque payment request persistence.
	 *
	 * @param chequePaymentRequestPersistence the cheque payment request persistence
	 */
	public void setChequePaymentRequestPersistence(
		ChequePaymentRequestPersistence chequePaymentRequestPersistence) {
		this.chequePaymentRequestPersistence = chequePaymentRequestPersistence;
	}

	/**
	 * Returns the city details local service.
	 *
	 * @return the city details local service
	 */
	public com.ifli.rapid.service.CityDetailsLocalService getCityDetailsLocalService() {
		return cityDetailsLocalService;
	}

	/**
	 * Sets the city details local service.
	 *
	 * @param cityDetailsLocalService the city details local service
	 */
	public void setCityDetailsLocalService(
		com.ifli.rapid.service.CityDetailsLocalService cityDetailsLocalService) {
		this.cityDetailsLocalService = cityDetailsLocalService;
	}

	/**
	 * Returns the city details persistence.
	 *
	 * @return the city details persistence
	 */
	public CityDetailsPersistence getCityDetailsPersistence() {
		return cityDetailsPersistence;
	}

	/**
	 * Sets the city details persistence.
	 *
	 * @param cityDetailsPersistence the city details persistence
	 */
	public void setCityDetailsPersistence(
		CityDetailsPersistence cityDetailsPersistence) {
		this.cityDetailsPersistence = cityDetailsPersistence;
	}

	/**
	 * Returns the closed service requests local service.
	 *
	 * @return the closed service requests local service
	 */
	public com.ifli.rapid.service.ClosedServiceRequestsLocalService getClosedServiceRequestsLocalService() {
		return closedServiceRequestsLocalService;
	}

	/**
	 * Sets the closed service requests local service.
	 *
	 * @param closedServiceRequestsLocalService the closed service requests local service
	 */
	public void setClosedServiceRequestsLocalService(
		com.ifli.rapid.service.ClosedServiceRequestsLocalService closedServiceRequestsLocalService) {
		this.closedServiceRequestsLocalService = closedServiceRequestsLocalService;
	}

	/**
	 * Returns the closed service requests persistence.
	 *
	 * @return the closed service requests persistence
	 */
	public ClosedServiceRequestsPersistence getClosedServiceRequestsPersistence() {
		return closedServiceRequestsPersistence;
	}

	/**
	 * Sets the closed service requests persistence.
	 *
	 * @param closedServiceRequestsPersistence the closed service requests persistence
	 */
	public void setClosedServiceRequestsPersistence(
		ClosedServiceRequestsPersistence closedServiceRequestsPersistence) {
		this.closedServiceRequestsPersistence = closedServiceRequestsPersistence;
	}

	/**
	 * Returns the confirm details local service.
	 *
	 * @return the confirm details local service
	 */
	public com.ifli.rapid.service.ConfirmDetailsLocalService getConfirmDetailsLocalService() {
		return confirmDetailsLocalService;
	}

	/**
	 * Sets the confirm details local service.
	 *
	 * @param confirmDetailsLocalService the confirm details local service
	 */
	public void setConfirmDetailsLocalService(
		com.ifli.rapid.service.ConfirmDetailsLocalService confirmDetailsLocalService) {
		this.confirmDetailsLocalService = confirmDetailsLocalService;
	}

	/**
	 * Returns the confirm details persistence.
	 *
	 * @return the confirm details persistence
	 */
	public ConfirmDetailsPersistence getConfirmDetailsPersistence() {
		return confirmDetailsPersistence;
	}

	/**
	 * Sets the confirm details persistence.
	 *
	 * @param confirmDetailsPersistence the confirm details persistence
	 */
	public void setConfirmDetailsPersistence(
		ConfirmDetailsPersistence confirmDetailsPersistence) {
		this.confirmDetailsPersistence = confirmDetailsPersistence;
	}

	/**
	 * Returns the customer local service.
	 *
	 * @return the customer local service
	 */
	public com.ifli.rapid.service.CustomerLocalService getCustomerLocalService() {
		return customerLocalService;
	}

	/**
	 * Sets the customer local service.
	 *
	 * @param customerLocalService the customer local service
	 */
	public void setCustomerLocalService(
		com.ifli.rapid.service.CustomerLocalService customerLocalService) {
		this.customerLocalService = customerLocalService;
	}

	/**
	 * Returns the customer persistence.
	 *
	 * @return the customer persistence
	 */
	public CustomerPersistence getCustomerPersistence() {
		return customerPersistence;
	}

	/**
	 * Sets the customer persistence.
	 *
	 * @param customerPersistence the customer persistence
	 */
	public void setCustomerPersistence(CustomerPersistence customerPersistence) {
		this.customerPersistence = customerPersistence;
	}

	/**
	 * Returns the customer address local service.
	 *
	 * @return the customer address local service
	 */
	public com.ifli.rapid.service.customerAddressLocalService getcustomerAddressLocalService() {
		return customerAddressLocalService;
	}

	/**
	 * Sets the customer address local service.
	 *
	 * @param customerAddressLocalService the customer address local service
	 */
	public void setcustomerAddressLocalService(
		com.ifli.rapid.service.customerAddressLocalService customerAddressLocalService) {
		this.customerAddressLocalService = customerAddressLocalService;
	}

	/**
	 * Returns the customer address persistence.
	 *
	 * @return the customer address persistence
	 */
	public customerAddressPersistence getcustomerAddressPersistence() {
		return customerAddressPersistence;
	}

	/**
	 * Sets the customer address persistence.
	 *
	 * @param customerAddressPersistence the customer address persistence
	 */
	public void setcustomerAddressPersistence(
		customerAddressPersistence customerAddressPersistence) {
		this.customerAddressPersistence = customerAddressPersistence;
	}

	/**
	 * Returns the customer family details local service.
	 *
	 * @return the customer family details local service
	 */
	public com.ifli.rapid.service.CustomerFamilyDetailsLocalService getCustomerFamilyDetailsLocalService() {
		return customerFamilyDetailsLocalService;
	}

	/**
	 * Sets the customer family details local service.
	 *
	 * @param customerFamilyDetailsLocalService the customer family details local service
	 */
	public void setCustomerFamilyDetailsLocalService(
		com.ifli.rapid.service.CustomerFamilyDetailsLocalService customerFamilyDetailsLocalService) {
		this.customerFamilyDetailsLocalService = customerFamilyDetailsLocalService;
	}

	/**
	 * Returns the customer family details persistence.
	 *
	 * @return the customer family details persistence
	 */
	public CustomerFamilyDetailsPersistence getCustomerFamilyDetailsPersistence() {
		return customerFamilyDetailsPersistence;
	}

	/**
	 * Sets the customer family details persistence.
	 *
	 * @param customerFamilyDetailsPersistence the customer family details persistence
	 */
	public void setCustomerFamilyDetailsPersistence(
		CustomerFamilyDetailsPersistence customerFamilyDetailsPersistence) {
		this.customerFamilyDetailsPersistence = customerFamilyDetailsPersistence;
	}

	/**
	 * Returns the customer mail IDs local service.
	 *
	 * @return the customer mail IDs local service
	 */
	public com.ifli.rapid.service.customerMailIdsLocalService getcustomerMailIdsLocalService() {
		return customerMailIdsLocalService;
	}

	/**
	 * Sets the customer mail IDs local service.
	 *
	 * @param customerMailIdsLocalService the customer mail IDs local service
	 */
	public void setcustomerMailIdsLocalService(
		com.ifli.rapid.service.customerMailIdsLocalService customerMailIdsLocalService) {
		this.customerMailIdsLocalService = customerMailIdsLocalService;
	}

	/**
	 * Returns the customer mail IDs persistence.
	 *
	 * @return the customer mail IDs persistence
	 */
	public customerMailIdsPersistence getcustomerMailIdsPersistence() {
		return customerMailIdsPersistence;
	}

	/**
	 * Sets the customer mail IDs persistence.
	 *
	 * @param customerMailIdsPersistence the customer mail IDs persistence
	 */
	public void setcustomerMailIdsPersistence(
		customerMailIdsPersistence customerMailIdsPersistence) {
		this.customerMailIdsPersistence = customerMailIdsPersistence;
	}

	/**
	 * Returns the customer mobile numbers local service.
	 *
	 * @return the customer mobile numbers local service
	 */
	public com.ifli.rapid.service.CustomerMobileNumbersLocalService getCustomerMobileNumbersLocalService() {
		return customerMobileNumbersLocalService;
	}

	/**
	 * Sets the customer mobile numbers local service.
	 *
	 * @param customerMobileNumbersLocalService the customer mobile numbers local service
	 */
	public void setCustomerMobileNumbersLocalService(
		com.ifli.rapid.service.CustomerMobileNumbersLocalService customerMobileNumbersLocalService) {
		this.customerMobileNumbersLocalService = customerMobileNumbersLocalService;
	}

	/**
	 * Returns the customer mobile numbers persistence.
	 *
	 * @return the customer mobile numbers persistence
	 */
	public CustomerMobileNumbersPersistence getCustomerMobileNumbersPersistence() {
		return customerMobileNumbersPersistence;
	}

	/**
	 * Sets the customer mobile numbers persistence.
	 *
	 * @param customerMobileNumbersPersistence the customer mobile numbers persistence
	 */
	public void setCustomerMobileNumbersPersistence(
		CustomerMobileNumbersPersistence customerMobileNumbersPersistence) {
		this.customerMobileNumbersPersistence = customerMobileNumbersPersistence;
	}

	/**
	 * Returns the customer otp local service.
	 *
	 * @return the customer otp local service
	 */
	public com.ifli.rapid.service.CustomerOtpLocalService getCustomerOtpLocalService() {
		return customerOtpLocalService;
	}

	/**
	 * Sets the customer otp local service.
	 *
	 * @param customerOtpLocalService the customer otp local service
	 */
	public void setCustomerOtpLocalService(
		com.ifli.rapid.service.CustomerOtpLocalService customerOtpLocalService) {
		this.customerOtpLocalService = customerOtpLocalService;
	}

	/**
	 * Returns the customer otp persistence.
	 *
	 * @return the customer otp persistence
	 */
	public CustomerOtpPersistence getCustomerOtpPersistence() {
		return customerOtpPersistence;
	}

	/**
	 * Sets the customer otp persistence.
	 *
	 * @param customerOtpPersistence the customer otp persistence
	 */
	public void setCustomerOtpPersistence(
		CustomerOtpPersistence customerOtpPersistence) {
		this.customerOtpPersistence = customerOtpPersistence;
	}

	/**
	 * Returns the family relations local service.
	 *
	 * @return the family relations local service
	 */
	public com.ifli.rapid.service.FamilyRelationsLocalService getFamilyRelationsLocalService() {
		return familyRelationsLocalService;
	}

	/**
	 * Sets the family relations local service.
	 *
	 * @param familyRelationsLocalService the family relations local service
	 */
	public void setFamilyRelationsLocalService(
		com.ifli.rapid.service.FamilyRelationsLocalService familyRelationsLocalService) {
		this.familyRelationsLocalService = familyRelationsLocalService;
	}

	/**
	 * Returns the family relations persistence.
	 *
	 * @return the family relations persistence
	 */
	public FamilyRelationsPersistence getFamilyRelationsPersistence() {
		return familyRelationsPersistence;
	}

	/**
	 * Sets the family relations persistence.
	 *
	 * @param familyRelationsPersistence the family relations persistence
	 */
	public void setFamilyRelationsPersistence(
		FamilyRelationsPersistence familyRelationsPersistence) {
		this.familyRelationsPersistence = familyRelationsPersistence;
	}

	/**
	 * Returns the fund master local service.
	 *
	 * @return the fund master local service
	 */
	public com.ifli.rapid.service.FundMasterLocalService getFundMasterLocalService() {
		return fundMasterLocalService;
	}

	/**
	 * Sets the fund master local service.
	 *
	 * @param fundMasterLocalService the fund master local service
	 */
	public void setFundMasterLocalService(
		com.ifli.rapid.service.FundMasterLocalService fundMasterLocalService) {
		this.fundMasterLocalService = fundMasterLocalService;
	}

	/**
	 * Returns the fund master persistence.
	 *
	 * @return the fund master persistence
	 */
	public FundMasterPersistence getFundMasterPersistence() {
		return fundMasterPersistence;
	}

	/**
	 * Sets the fund master persistence.
	 *
	 * @param fundMasterPersistence the fund master persistence
	 */
	public void setFundMasterPersistence(
		FundMasterPersistence fundMasterPersistence) {
		this.fundMasterPersistence = fundMasterPersistence;
	}

	/**
	 * Returns the location details local service.
	 *
	 * @return the location details local service
	 */
	public com.ifli.rapid.service.LocationDetailsLocalService getLocationDetailsLocalService() {
		return locationDetailsLocalService;
	}

	/**
	 * Sets the location details local service.
	 *
	 * @param locationDetailsLocalService the location details local service
	 */
	public void setLocationDetailsLocalService(
		com.ifli.rapid.service.LocationDetailsLocalService locationDetailsLocalService) {
		this.locationDetailsLocalService = locationDetailsLocalService;
	}

	/**
	 * Returns the location details persistence.
	 *
	 * @return the location details persistence
	 */
	public LocationDetailsPersistence getLocationDetailsPersistence() {
		return locationDetailsPersistence;
	}

	/**
	 * Sets the location details persistence.
	 *
	 * @param locationDetailsPersistence the location details persistence
	 */
	public void setLocationDetailsPersistence(
		LocationDetailsPersistence locationDetailsPersistence) {
		this.locationDetailsPersistence = locationDetailsPersistence;
	}

	/**
	 * Returns the nav history local service.
	 *
	 * @return the nav history local service
	 */
	public com.ifli.rapid.service.NavHistoryLocalService getNavHistoryLocalService() {
		return navHistoryLocalService;
	}

	/**
	 * Sets the nav history local service.
	 *
	 * @param navHistoryLocalService the nav history local service
	 */
	public void setNavHistoryLocalService(
		com.ifli.rapid.service.NavHistoryLocalService navHistoryLocalService) {
		this.navHistoryLocalService = navHistoryLocalService;
	}

	/**
	 * Returns the nav history persistence.
	 *
	 * @return the nav history persistence
	 */
	public NavHistoryPersistence getNavHistoryPersistence() {
		return navHistoryPersistence;
	}

	/**
	 * Sets the nav history persistence.
	 *
	 * @param navHistoryPersistence the nav history persistence
	 */
	public void setNavHistoryPersistence(
		NavHistoryPersistence navHistoryPersistence) {
		this.navHistoryPersistence = navHistoryPersistence;
	}

	/**
	 * Returns the payment details local service.
	 *
	 * @return the payment details local service
	 */
	public com.ifli.rapid.service.PaymentDetailsLocalService getPaymentDetailsLocalService() {
		return paymentDetailsLocalService;
	}

	/**
	 * Sets the payment details local service.
	 *
	 * @param paymentDetailsLocalService the payment details local service
	 */
	public void setPaymentDetailsLocalService(
		com.ifli.rapid.service.PaymentDetailsLocalService paymentDetailsLocalService) {
		this.paymentDetailsLocalService = paymentDetailsLocalService;
	}

	/**
	 * Returns the payment details persistence.
	 *
	 * @return the payment details persistence
	 */
	public PaymentDetailsPersistence getPaymentDetailsPersistence() {
		return paymentDetailsPersistence;
	}

	/**
	 * Sets the payment details persistence.
	 *
	 * @param paymentDetailsPersistence the payment details persistence
	 */
	public void setPaymentDetailsPersistence(
		PaymentDetailsPersistence paymentDetailsPersistence) {
		this.paymentDetailsPersistence = paymentDetailsPersistence;
	}

	/**
	 * Returns the payment gateway master local service.
	 *
	 * @return the payment gateway master local service
	 */
	public com.ifli.rapid.service.PaymentGatewayMasterLocalService getPaymentGatewayMasterLocalService() {
		return paymentGatewayMasterLocalService;
	}

	/**
	 * Sets the payment gateway master local service.
	 *
	 * @param paymentGatewayMasterLocalService the payment gateway master local service
	 */
	public void setPaymentGatewayMasterLocalService(
		com.ifli.rapid.service.PaymentGatewayMasterLocalService paymentGatewayMasterLocalService) {
		this.paymentGatewayMasterLocalService = paymentGatewayMasterLocalService;
	}

	/**
	 * Returns the payment gateway master persistence.
	 *
	 * @return the payment gateway master persistence
	 */
	public PaymentGatewayMasterPersistence getPaymentGatewayMasterPersistence() {
		return paymentGatewayMasterPersistence;
	}

	/**
	 * Sets the payment gateway master persistence.
	 *
	 * @param paymentGatewayMasterPersistence the payment gateway master persistence
	 */
	public void setPaymentGatewayMasterPersistence(
		PaymentGatewayMasterPersistence paymentGatewayMasterPersistence) {
		this.paymentGatewayMasterPersistence = paymentGatewayMasterPersistence;
	}

	/**
	 * Returns the payment method master local service.
	 *
	 * @return the payment method master local service
	 */
	public com.ifli.rapid.service.PaymentMethodMasterLocalService getPaymentMethodMasterLocalService() {
		return paymentMethodMasterLocalService;
	}

	/**
	 * Sets the payment method master local service.
	 *
	 * @param paymentMethodMasterLocalService the payment method master local service
	 */
	public void setPaymentMethodMasterLocalService(
		com.ifli.rapid.service.PaymentMethodMasterLocalService paymentMethodMasterLocalService) {
		this.paymentMethodMasterLocalService = paymentMethodMasterLocalService;
	}

	/**
	 * Returns the payment method master persistence.
	 *
	 * @return the payment method master persistence
	 */
	public PaymentMethodMasterPersistence getPaymentMethodMasterPersistence() {
		return paymentMethodMasterPersistence;
	}

	/**
	 * Sets the payment method master persistence.
	 *
	 * @param paymentMethodMasterPersistence the payment method master persistence
	 */
	public void setPaymentMethodMasterPersistence(
		PaymentMethodMasterPersistence paymentMethodMasterPersistence) {
		this.paymentMethodMasterPersistence = paymentMethodMasterPersistence;
	}

	/**
	 * Returns the payment method type local service.
	 *
	 * @return the payment method type local service
	 */
	public com.ifli.rapid.service.PaymentMethodTypeLocalService getPaymentMethodTypeLocalService() {
		return paymentMethodTypeLocalService;
	}

	/**
	 * Sets the payment method type local service.
	 *
	 * @param paymentMethodTypeLocalService the payment method type local service
	 */
	public void setPaymentMethodTypeLocalService(
		com.ifli.rapid.service.PaymentMethodTypeLocalService paymentMethodTypeLocalService) {
		this.paymentMethodTypeLocalService = paymentMethodTypeLocalService;
	}

	/**
	 * Returns the payment method type persistence.
	 *
	 * @return the payment method type persistence
	 */
	public PaymentMethodTypePersistence getPaymentMethodTypePersistence() {
		return paymentMethodTypePersistence;
	}

	/**
	 * Sets the payment method type persistence.
	 *
	 * @param paymentMethodTypePersistence the payment method type persistence
	 */
	public void setPaymentMethodTypePersistence(
		PaymentMethodTypePersistence paymentMethodTypePersistence) {
		this.paymentMethodTypePersistence = paymentMethodTypePersistence;
	}

	/**
	 * Returns the payment option master local service.
	 *
	 * @return the payment option master local service
	 */
	public com.ifli.rapid.service.PaymentOptionMasterLocalService getPaymentOptionMasterLocalService() {
		return paymentOptionMasterLocalService;
	}

	/**
	 * Sets the payment option master local service.
	 *
	 * @param paymentOptionMasterLocalService the payment option master local service
	 */
	public void setPaymentOptionMasterLocalService(
		com.ifli.rapid.service.PaymentOptionMasterLocalService paymentOptionMasterLocalService) {
		this.paymentOptionMasterLocalService = paymentOptionMasterLocalService;
	}

	/**
	 * Returns the payment option master persistence.
	 *
	 * @return the payment option master persistence
	 */
	public PaymentOptionMasterPersistence getPaymentOptionMasterPersistence() {
		return paymentOptionMasterPersistence;
	}

	/**
	 * Sets the payment option master persistence.
	 *
	 * @param paymentOptionMasterPersistence the payment option master persistence
	 */
	public void setPaymentOptionMasterPersistence(
		PaymentOptionMasterPersistence paymentOptionMasterPersistence) {
		this.paymentOptionMasterPersistence = paymentOptionMasterPersistence;
	}

	/**
	 * Returns the payment option types local service.
	 *
	 * @return the payment option types local service
	 */
	public com.ifli.rapid.service.PaymentOptionTypesLocalService getPaymentOptionTypesLocalService() {
		return paymentOptionTypesLocalService;
	}

	/**
	 * Sets the payment option types local service.
	 *
	 * @param paymentOptionTypesLocalService the payment option types local service
	 */
	public void setPaymentOptionTypesLocalService(
		com.ifli.rapid.service.PaymentOptionTypesLocalService paymentOptionTypesLocalService) {
		this.paymentOptionTypesLocalService = paymentOptionTypesLocalService;
	}

	/**
	 * Returns the payment option types persistence.
	 *
	 * @return the payment option types persistence
	 */
	public PaymentOptionTypesPersistence getPaymentOptionTypesPersistence() {
		return paymentOptionTypesPersistence;
	}

	/**
	 * Sets the payment option types persistence.
	 *
	 * @param paymentOptionTypesPersistence the payment option types persistence
	 */
	public void setPaymentOptionTypesPersistence(
		PaymentOptionTypesPersistence paymentOptionTypesPersistence) {
		this.paymentOptionTypesPersistence = paymentOptionTypesPersistence;
	}

	/**
	 * Returns the payment transaction status master local service.
	 *
	 * @return the payment transaction status master local service
	 */
	public com.ifli.rapid.service.PaymentTransactionStatusMasterLocalService getPaymentTransactionStatusMasterLocalService() {
		return paymentTransactionStatusMasterLocalService;
	}

	/**
	 * Sets the payment transaction status master local service.
	 *
	 * @param paymentTransactionStatusMasterLocalService the payment transaction status master local service
	 */
	public void setPaymentTransactionStatusMasterLocalService(
		com.ifli.rapid.service.PaymentTransactionStatusMasterLocalService paymentTransactionStatusMasterLocalService) {
		this.paymentTransactionStatusMasterLocalService = paymentTransactionStatusMasterLocalService;
	}

	/**
	 * Returns the payment transaction status master persistence.
	 *
	 * @return the payment transaction status master persistence
	 */
	public PaymentTransactionStatusMasterPersistence getPaymentTransactionStatusMasterPersistence() {
		return paymentTransactionStatusMasterPersistence;
	}

	/**
	 * Sets the payment transaction status master persistence.
	 *
	 * @param paymentTransactionStatusMasterPersistence the payment transaction status master persistence
	 */
	public void setPaymentTransactionStatusMasterPersistence(
		PaymentTransactionStatusMasterPersistence paymentTransactionStatusMasterPersistence) {
		this.paymentTransactionStatusMasterPersistence = paymentTransactionStatusMasterPersistence;
	}

	/**
	 * Returns the pincode details local service.
	 *
	 * @return the pincode details local service
	 */
	public com.ifli.rapid.service.PincodeDetailsLocalService getPincodeDetailsLocalService() {
		return pincodeDetailsLocalService;
	}

	/**
	 * Sets the pincode details local service.
	 *
	 * @param pincodeDetailsLocalService the pincode details local service
	 */
	public void setPincodeDetailsLocalService(
		com.ifli.rapid.service.PincodeDetailsLocalService pincodeDetailsLocalService) {
		this.pincodeDetailsLocalService = pincodeDetailsLocalService;
	}

	/**
	 * Returns the pincode details persistence.
	 *
	 * @return the pincode details persistence
	 */
	public PincodeDetailsPersistence getPincodeDetailsPersistence() {
		return pincodeDetailsPersistence;
	}

	/**
	 * Sets the pincode details persistence.
	 *
	 * @param pincodeDetailsPersistence the pincode details persistence
	 */
	public void setPincodeDetailsPersistence(
		PincodeDetailsPersistence pincodeDetailsPersistence) {
		this.pincodeDetailsPersistence = pincodeDetailsPersistence;
	}

	/**
	 * Returns the p o l i c y_ d o c_ t y p e s local service.
	 *
	 * @return the p o l i c y_ d o c_ t y p e s local service
	 */
	public com.ifli.rapid.service.POLICY_DOC_TYPESLocalService getPOLICY_DOC_TYPESLocalService() {
		return policy_doc_typesLocalService;
	}

	/**
	 * Sets the p o l i c y_ d o c_ t y p e s local service.
	 *
	 * @param policy_doc_typesLocalService the p o l i c y_ d o c_ t y p e s local service
	 */
	public void setPOLICY_DOC_TYPESLocalService(
		com.ifli.rapid.service.POLICY_DOC_TYPESLocalService policy_doc_typesLocalService) {
		this.policy_doc_typesLocalService = policy_doc_typesLocalService;
	}

	/**
	 * Returns the p o l i c y_ d o c_ t y p e s persistence.
	 *
	 * @return the p o l i c y_ d o c_ t y p e s persistence
	 */
	public POLICY_DOC_TYPESPersistence getPOLICY_DOC_TYPESPersistence() {
		return policy_doc_typesPersistence;
	}

	/**
	 * Sets the p o l i c y_ d o c_ t y p e s persistence.
	 *
	 * @param policy_doc_typesPersistence the p o l i c y_ d o c_ t y p e s persistence
	 */
	public void setPOLICY_DOC_TYPESPersistence(
		POLICY_DOC_TYPESPersistence policy_doc_typesPersistence) {
		this.policy_doc_typesPersistence = policy_doc_typesPersistence;
	}

	/**
	 * Returns the policy address local service.
	 *
	 * @return the policy address local service
	 */
	public com.ifli.rapid.service.PolicyAddressLocalService getPolicyAddressLocalService() {
		return policyAddressLocalService;
	}

	/**
	 * Sets the policy address local service.
	 *
	 * @param policyAddressLocalService the policy address local service
	 */
	public void setPolicyAddressLocalService(
		com.ifli.rapid.service.PolicyAddressLocalService policyAddressLocalService) {
		this.policyAddressLocalService = policyAddressLocalService;
	}

	/**
	 * Returns the policy address persistence.
	 *
	 * @return the policy address persistence
	 */
	public PolicyAddressPersistence getPolicyAddressPersistence() {
		return policyAddressPersistence;
	}

	/**
	 * Sets the policy address persistence.
	 *
	 * @param policyAddressPersistence the policy address persistence
	 */
	public void setPolicyAddressPersistence(
		PolicyAddressPersistence policyAddressPersistence) {
		this.policyAddressPersistence = policyAddressPersistence;
	}

	/**
	 * Returns the policy fund local service.
	 *
	 * @return the policy fund local service
	 */
	public com.ifli.rapid.service.PolicyFundLocalService getPolicyFundLocalService() {
		return policyFundLocalService;
	}

	/**
	 * Sets the policy fund local service.
	 *
	 * @param policyFundLocalService the policy fund local service
	 */
	public void setPolicyFundLocalService(
		com.ifli.rapid.service.PolicyFundLocalService policyFundLocalService) {
		this.policyFundLocalService = policyFundLocalService;
	}

	/**
	 * Returns the policy fund persistence.
	 *
	 * @return the policy fund persistence
	 */
	public PolicyFundPersistence getPolicyFundPersistence() {
		return policyFundPersistence;
	}

	/**
	 * Sets the policy fund persistence.
	 *
	 * @param policyFundPersistence the policy fund persistence
	 */
	public void setPolicyFundPersistence(
		PolicyFundPersistence policyFundPersistence) {
		this.policyFundPersistence = policyFundPersistence;
	}

	/**
	 * Returns the policy fund switch counter local service.
	 *
	 * @return the policy fund switch counter local service
	 */
	public com.ifli.rapid.service.PolicyFundSwitchCounterLocalService getPolicyFundSwitchCounterLocalService() {
		return policyFundSwitchCounterLocalService;
	}

	/**
	 * Sets the policy fund switch counter local service.
	 *
	 * @param policyFundSwitchCounterLocalService the policy fund switch counter local service
	 */
	public void setPolicyFundSwitchCounterLocalService(
		com.ifli.rapid.service.PolicyFundSwitchCounterLocalService policyFundSwitchCounterLocalService) {
		this.policyFundSwitchCounterLocalService = policyFundSwitchCounterLocalService;
	}

	/**
	 * Returns the policy fund switch counter persistence.
	 *
	 * @return the policy fund switch counter persistence
	 */
	public PolicyFundSwitchCounterPersistence getPolicyFundSwitchCounterPersistence() {
		return policyFundSwitchCounterPersistence;
	}

	/**
	 * Sets the policy fund switch counter persistence.
	 *
	 * @param policyFundSwitchCounterPersistence the policy fund switch counter persistence
	 */
	public void setPolicyFundSwitchCounterPersistence(
		PolicyFundSwitchCounterPersistence policyFundSwitchCounterPersistence) {
		this.policyFundSwitchCounterPersistence = policyFundSwitchCounterPersistence;
	}

	/**
	 * Returns the policy fund switch details local service.
	 *
	 * @return the policy fund switch details local service
	 */
	public com.ifli.rapid.service.PolicyFundSwitchDetailsLocalService getPolicyFundSwitchDetailsLocalService() {
		return policyFundSwitchDetailsLocalService;
	}

	/**
	 * Sets the policy fund switch details local service.
	 *
	 * @param policyFundSwitchDetailsLocalService the policy fund switch details local service
	 */
	public void setPolicyFundSwitchDetailsLocalService(
		com.ifli.rapid.service.PolicyFundSwitchDetailsLocalService policyFundSwitchDetailsLocalService) {
		this.policyFundSwitchDetailsLocalService = policyFundSwitchDetailsLocalService;
	}

	/**
	 * Returns the policy fund switch details persistence.
	 *
	 * @return the policy fund switch details persistence
	 */
	public PolicyFundSwitchDetailsPersistence getPolicyFundSwitchDetailsPersistence() {
		return policyFundSwitchDetailsPersistence;
	}

	/**
	 * Sets the policy fund switch details persistence.
	 *
	 * @param policyFundSwitchDetailsPersistence the policy fund switch details persistence
	 */
	public void setPolicyFundSwitchDetailsPersistence(
		PolicyFundSwitchDetailsPersistence policyFundSwitchDetailsPersistence) {
		this.policyFundSwitchDetailsPersistence = policyFundSwitchDetailsPersistence;
	}

	/**
	 * Returns the policy info local service.
	 *
	 * @return the policy info local service
	 */
	public com.ifli.rapid.service.PolicyInfoLocalService getPolicyInfoLocalService() {
		return policyInfoLocalService;
	}

	/**
	 * Sets the policy info local service.
	 *
	 * @param policyInfoLocalService the policy info local service
	 */
	public void setPolicyInfoLocalService(
		com.ifli.rapid.service.PolicyInfoLocalService policyInfoLocalService) {
		this.policyInfoLocalService = policyInfoLocalService;
	}

	/**
	 * Returns the policy info persistence.
	 *
	 * @return the policy info persistence
	 */
	public PolicyInfoPersistence getPolicyInfoPersistence() {
		return policyInfoPersistence;
	}

	/**
	 * Sets the policy info persistence.
	 *
	 * @param policyInfoPersistence the policy info persistence
	 */
	public void setPolicyInfoPersistence(
		PolicyInfoPersistence policyInfoPersistence) {
		this.policyInfoPersistence = policyInfoPersistence;
	}

	/**
	 * Returns the policy prem percentage local service.
	 *
	 * @return the policy prem percentage local service
	 */
	public com.ifli.rapid.service.PolicyPremPercentageLocalService getPolicyPremPercentageLocalService() {
		return policyPremPercentageLocalService;
	}

	/**
	 * Sets the policy prem percentage local service.
	 *
	 * @param policyPremPercentageLocalService the policy prem percentage local service
	 */
	public void setPolicyPremPercentageLocalService(
		com.ifli.rapid.service.PolicyPremPercentageLocalService policyPremPercentageLocalService) {
		this.policyPremPercentageLocalService = policyPremPercentageLocalService;
	}

	/**
	 * Returns the policy prem percentage persistence.
	 *
	 * @return the policy prem percentage persistence
	 */
	public PolicyPremPercentagePersistence getPolicyPremPercentagePersistence() {
		return policyPremPercentagePersistence;
	}

	/**
	 * Sets the policy prem percentage persistence.
	 *
	 * @param policyPremPercentagePersistence the policy prem percentage persistence
	 */
	public void setPolicyPremPercentagePersistence(
		PolicyPremPercentagePersistence policyPremPercentagePersistence) {
		this.policyPremPercentagePersistence = policyPremPercentagePersistence;
	}

	/**
	 * Returns the policy prem redirection details local service.
	 *
	 * @return the policy prem redirection details local service
	 */
	public com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalService getPolicyPremRedirectionDetailsLocalService() {
		return policyPremRedirectionDetailsLocalService;
	}

	/**
	 * Sets the policy prem redirection details local service.
	 *
	 * @param policyPremRedirectionDetailsLocalService the policy prem redirection details local service
	 */
	public void setPolicyPremRedirectionDetailsLocalService(
		com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalService policyPremRedirectionDetailsLocalService) {
		this.policyPremRedirectionDetailsLocalService = policyPremRedirectionDetailsLocalService;
	}

	/**
	 * Returns the policy prem redirection details persistence.
	 *
	 * @return the policy prem redirection details persistence
	 */
	public PolicyPremRedirectionDetailsPersistence getPolicyPremRedirectionDetailsPersistence() {
		return policyPremRedirectionDetailsPersistence;
	}

	/**
	 * Sets the policy prem redirection details persistence.
	 *
	 * @param policyPremRedirectionDetailsPersistence the policy prem redirection details persistence
	 */
	public void setPolicyPremRedirectionDetailsPersistence(
		PolicyPremRedirectionDetailsPersistence policyPremRedirectionDetailsPersistence) {
		this.policyPremRedirectionDetailsPersistence = policyPremRedirectionDetailsPersistence;
	}

	/**
	 * Returns the policy topup details local service.
	 *
	 * @return the policy topup details local service
	 */
	public com.ifli.rapid.service.PolicyTopupDetailsLocalService getPolicyTopupDetailsLocalService() {
		return policyTopupDetailsLocalService;
	}

	/**
	 * Sets the policy topup details local service.
	 *
	 * @param policyTopupDetailsLocalService the policy topup details local service
	 */
	public void setPolicyTopupDetailsLocalService(
		com.ifli.rapid.service.PolicyTopupDetailsLocalService policyTopupDetailsLocalService) {
		this.policyTopupDetailsLocalService = policyTopupDetailsLocalService;
	}

	/**
	 * Returns the policy topup details persistence.
	 *
	 * @return the policy topup details persistence
	 */
	public PolicyTopupDetailsPersistence getPolicyTopupDetailsPersistence() {
		return policyTopupDetailsPersistence;
	}

	/**
	 * Sets the policy topup details persistence.
	 *
	 * @param policyTopupDetailsPersistence the policy topup details persistence
	 */
	public void setPolicyTopupDetailsPersistence(
		PolicyTopupDetailsPersistence policyTopupDetailsPersistence) {
		this.policyTopupDetailsPersistence = policyTopupDetailsPersistence;
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e local service.
	 *
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e local service
	 */
	public com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalService getPREMIUM_PAID_CERTIFICATELocalService() {
		return premium_paid_certificateLocalService;
	}

	/**
	 * Sets the p r e m i u m_ p a i d_ c e r t i f i c a t e local service.
	 *
	 * @param premium_paid_certificateLocalService the p r e m i u m_ p a i d_ c e r t i f i c a t e local service
	 */
	public void setPREMIUM_PAID_CERTIFICATELocalService(
		com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalService premium_paid_certificateLocalService) {
		this.premium_paid_certificateLocalService = premium_paid_certificateLocalService;
	}

	/**
	 * Returns the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence.
	 *
	 * @return the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence
	 */
	public PREMIUM_PAID_CERTIFICATEPersistence getPREMIUM_PAID_CERTIFICATEPersistence() {
		return premium_paid_certificatePersistence;
	}

	/**
	 * Sets the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence.
	 *
	 * @param premium_paid_certificatePersistence the p r e m i u m_ p a i d_ c e r t i f i c a t e persistence
	 */
	public void setPREMIUM_PAID_CERTIFICATEPersistence(
		PREMIUM_PAID_CERTIFICATEPersistence premium_paid_certificatePersistence) {
		this.premium_paid_certificatePersistence = premium_paid_certificatePersistence;
	}

	/**
	 * Returns the premium frequency master local service.
	 *
	 * @return the premium frequency master local service
	 */
	public com.ifli.rapid.service.PremiumFrequencyMasterLocalService getPremiumFrequencyMasterLocalService() {
		return premiumFrequencyMasterLocalService;
	}

	/**
	 * Sets the premium frequency master local service.
	 *
	 * @param premiumFrequencyMasterLocalService the premium frequency master local service
	 */
	public void setPremiumFrequencyMasterLocalService(
		com.ifli.rapid.service.PremiumFrequencyMasterLocalService premiumFrequencyMasterLocalService) {
		this.premiumFrequencyMasterLocalService = premiumFrequencyMasterLocalService;
	}

	/**
	 * Returns the premium frequency master persistence.
	 *
	 * @return the premium frequency master persistence
	 */
	public PremiumFrequencyMasterPersistence getPremiumFrequencyMasterPersistence() {
		return premiumFrequencyMasterPersistence;
	}

	/**
	 * Sets the premium frequency master persistence.
	 *
	 * @param premiumFrequencyMasterPersistence the premium frequency master persistence
	 */
	public void setPremiumFrequencyMasterPersistence(
		PremiumFrequencyMasterPersistence premiumFrequencyMasterPersistence) {
		this.premiumFrequencyMasterPersistence = premiumFrequencyMasterPersistence;
	}

	/**
	 * Returns the premium type local service.
	 *
	 * @return the premium type local service
	 */
	public com.ifli.rapid.service.PremiumTypeLocalService getPremiumTypeLocalService() {
		return premiumTypeLocalService;
	}

	/**
	 * Sets the premium type local service.
	 *
	 * @param premiumTypeLocalService the premium type local service
	 */
	public void setPremiumTypeLocalService(
		com.ifli.rapid.service.PremiumTypeLocalService premiumTypeLocalService) {
		this.premiumTypeLocalService = premiumTypeLocalService;
	}

	/**
	 * Returns the premium type persistence.
	 *
	 * @return the premium type persistence
	 */
	public PremiumTypePersistence getPremiumTypePersistence() {
		return premiumTypePersistence;
	}

	/**
	 * Sets the premium type persistence.
	 *
	 * @param premiumTypePersistence the premium type persistence
	 */
	public void setPremiumTypePersistence(
		PremiumTypePersistence premiumTypePersistence) {
		this.premiumTypePersistence = premiumTypePersistence;
	}

	/**
	 * Returns the product fund mapping local service.
	 *
	 * @return the product fund mapping local service
	 */
	public com.ifli.rapid.service.ProductFundMappingLocalService getProductFundMappingLocalService() {
		return productFundMappingLocalService;
	}

	/**
	 * Sets the product fund mapping local service.
	 *
	 * @param productFundMappingLocalService the product fund mapping local service
	 */
	public void setProductFundMappingLocalService(
		com.ifli.rapid.service.ProductFundMappingLocalService productFundMappingLocalService) {
		this.productFundMappingLocalService = productFundMappingLocalService;
	}

	/**
	 * Returns the product fund mapping persistence.
	 *
	 * @return the product fund mapping persistence
	 */
	public ProductFundMappingPersistence getProductFundMappingPersistence() {
		return productFundMappingPersistence;
	}

	/**
	 * Sets the product fund mapping persistence.
	 *
	 * @param productFundMappingPersistence the product fund mapping persistence
	 */
	public void setProductFundMappingPersistence(
		ProductFundMappingPersistence productFundMappingPersistence) {
		this.productFundMappingPersistence = productFundMappingPersistence;
	}

	/**
	 * Returns the proof docs local service.
	 *
	 * @return the proof docs local service
	 */
	public com.ifli.rapid.service.ProofDocsLocalService getProofDocsLocalService() {
		return proofDocsLocalService;
	}

	/**
	 * Sets the proof docs local service.
	 *
	 * @param proofDocsLocalService the proof docs local service
	 */
	public void setProofDocsLocalService(
		com.ifli.rapid.service.ProofDocsLocalService proofDocsLocalService) {
		this.proofDocsLocalService = proofDocsLocalService;
	}

	/**
	 * Returns the proof docs persistence.
	 *
	 * @return the proof docs persistence
	 */
	public ProofDocsPersistence getProofDocsPersistence() {
		return proofDocsPersistence;
	}

	/**
	 * Sets the proof docs persistence.
	 *
	 * @param proofDocsPersistence the proof docs persistence
	 */
	public void setProofDocsPersistence(
		ProofDocsPersistence proofDocsPersistence) {
		this.proofDocsPersistence = proofDocsPersistence;
	}

	/**
	 * Returns the q r c status local service.
	 *
	 * @return the q r c status local service
	 */
	public com.ifli.rapid.service.QRCStatusLocalService getQRCStatusLocalService() {
		return qrcStatusLocalService;
	}

	/**
	 * Sets the q r c status local service.
	 *
	 * @param qrcStatusLocalService the q r c status local service
	 */
	public void setQRCStatusLocalService(
		com.ifli.rapid.service.QRCStatusLocalService qrcStatusLocalService) {
		this.qrcStatusLocalService = qrcStatusLocalService;
	}

	/**
	 * Returns the q r c status persistence.
	 *
	 * @return the q r c status persistence
	 */
	public QRCStatusPersistence getQRCStatusPersistence() {
		return qrcStatusPersistence;
	}

	/**
	 * Sets the q r c status persistence.
	 *
	 * @param qrcStatusPersistence the q r c status persistence
	 */
	public void setQRCStatusPersistence(
		QRCStatusPersistence qrcStatusPersistence) {
		this.qrcStatusPersistence = qrcStatusPersistence;
	}

	/**
	 * Returns the q r c sub type master local service.
	 *
	 * @return the q r c sub type master local service
	 */
	public com.ifli.rapid.service.QRCSubTypeMasterLocalService getQRCSubTypeMasterLocalService() {
		return qrcSubTypeMasterLocalService;
	}

	/**
	 * Sets the q r c sub type master local service.
	 *
	 * @param qrcSubTypeMasterLocalService the q r c sub type master local service
	 */
	public void setQRCSubTypeMasterLocalService(
		com.ifli.rapid.service.QRCSubTypeMasterLocalService qrcSubTypeMasterLocalService) {
		this.qrcSubTypeMasterLocalService = qrcSubTypeMasterLocalService;
	}

	/**
	 * Returns the q r c sub type master persistence.
	 *
	 * @return the q r c sub type master persistence
	 */
	public QRCSubTypeMasterPersistence getQRCSubTypeMasterPersistence() {
		return qrcSubTypeMasterPersistence;
	}

	/**
	 * Sets the q r c sub type master persistence.
	 *
	 * @param qrcSubTypeMasterPersistence the q r c sub type master persistence
	 */
	public void setQRCSubTypeMasterPersistence(
		QRCSubTypeMasterPersistence qrcSubTypeMasterPersistence) {
		this.qrcSubTypeMasterPersistence = qrcSubTypeMasterPersistence;
	}

	/**
	 * Returns the q r c team master local service.
	 *
	 * @return the q r c team master local service
	 */
	public com.ifli.rapid.service.QRCTeamMasterLocalService getQRCTeamMasterLocalService() {
		return qrcTeamMasterLocalService;
	}

	/**
	 * Sets the q r c team master local service.
	 *
	 * @param qrcTeamMasterLocalService the q r c team master local service
	 */
	public void setQRCTeamMasterLocalService(
		com.ifli.rapid.service.QRCTeamMasterLocalService qrcTeamMasterLocalService) {
		this.qrcTeamMasterLocalService = qrcTeamMasterLocalService;
	}

	/**
	 * Returns the q r c team master persistence.
	 *
	 * @return the q r c team master persistence
	 */
	public QRCTeamMasterPersistence getQRCTeamMasterPersistence() {
		return qrcTeamMasterPersistence;
	}

	/**
	 * Sets the q r c team master persistence.
	 *
	 * @param qrcTeamMasterPersistence the q r c team master persistence
	 */
	public void setQRCTeamMasterPersistence(
		QRCTeamMasterPersistence qrcTeamMasterPersistence) {
		this.qrcTeamMasterPersistence = qrcTeamMasterPersistence;
	}

	/**
	 * Returns the q r c type master local service.
	 *
	 * @return the q r c type master local service
	 */
	public com.ifli.rapid.service.QRCTypeMasterLocalService getQRCTypeMasterLocalService() {
		return qrcTypeMasterLocalService;
	}

	/**
	 * Sets the q r c type master local service.
	 *
	 * @param qrcTypeMasterLocalService the q r c type master local service
	 */
	public void setQRCTypeMasterLocalService(
		com.ifli.rapid.service.QRCTypeMasterLocalService qrcTypeMasterLocalService) {
		this.qrcTypeMasterLocalService = qrcTypeMasterLocalService;
	}

	/**
	 * Returns the q r c type master persistence.
	 *
	 * @return the q r c type master persistence
	 */
	public QRCTypeMasterPersistence getQRCTypeMasterPersistence() {
		return qrcTypeMasterPersistence;
	}

	/**
	 * Sets the q r c type master persistence.
	 *
	 * @param qrcTypeMasterPersistence the q r c type master persistence
	 */
	public void setQRCTypeMasterPersistence(
		QRCTypeMasterPersistence qrcTypeMasterPersistence) {
		this.qrcTypeMasterPersistence = qrcTypeMasterPersistence;
	}

	/**
	 * Returns the q r c user local service.
	 *
	 * @return the q r c user local service
	 */
	public com.ifli.rapid.service.QRCUserLocalService getQRCUserLocalService() {
		return qrcUserLocalService;
	}

	/**
	 * Sets the q r c user local service.
	 *
	 * @param qrcUserLocalService the q r c user local service
	 */
	public void setQRCUserLocalService(
		com.ifli.rapid.service.QRCUserLocalService qrcUserLocalService) {
		this.qrcUserLocalService = qrcUserLocalService;
	}

	/**
	 * Returns the q r c user persistence.
	 *
	 * @return the q r c user persistence
	 */
	public QRCUserPersistence getQRCUserPersistence() {
		return qrcUserPersistence;
	}

	/**
	 * Sets the q r c user persistence.
	 *
	 * @param qrcUserPersistence the q r c user persistence
	 */
	public void setQRCUserPersistence(QRCUserPersistence qrcUserPersistence) {
		this.qrcUserPersistence = qrcUserPersistence;
	}

	/**
	 * Returns the recommended_ products local service.
	 *
	 * @return the recommended_ products local service
	 */
	public com.ifli.rapid.service.Recommended_ProductsLocalService getRecommended_ProductsLocalService() {
		return recommended_ProductsLocalService;
	}

	/**
	 * Sets the recommended_ products local service.
	 *
	 * @param recommended_ProductsLocalService the recommended_ products local service
	 */
	public void setRecommended_ProductsLocalService(
		com.ifli.rapid.service.Recommended_ProductsLocalService recommended_ProductsLocalService) {
		this.recommended_ProductsLocalService = recommended_ProductsLocalService;
	}

	/**
	 * Returns the recommended_ products persistence.
	 *
	 * @return the recommended_ products persistence
	 */
	public Recommended_ProductsPersistence getRecommended_ProductsPersistence() {
		return recommended_ProductsPersistence;
	}

	/**
	 * Sets the recommended_ products persistence.
	 *
	 * @param recommended_ProductsPersistence the recommended_ products persistence
	 */
	public void setRecommended_ProductsPersistence(
		Recommended_ProductsPersistence recommended_ProductsPersistence) {
		this.recommended_ProductsPersistence = recommended_ProductsPersistence;
	}

	/**
	 * Returns the r e n e w a l_ p r e m i u m local service.
	 *
	 * @return the r e n e w a l_ p r e m i u m local service
	 */
	public com.ifli.rapid.service.RENEWAL_PREMIUMLocalService getRENEWAL_PREMIUMLocalService() {
		return renewal_premiumLocalService;
	}

	/**
	 * Sets the r e n e w a l_ p r e m i u m local service.
	 *
	 * @param renewal_premiumLocalService the r e n e w a l_ p r e m i u m local service
	 */
	public void setRENEWAL_PREMIUMLocalService(
		com.ifli.rapid.service.RENEWAL_PREMIUMLocalService renewal_premiumLocalService) {
		this.renewal_premiumLocalService = renewal_premiumLocalService;
	}

	/**
	 * Returns the r e n e w a l_ p r e m i u m persistence.
	 *
	 * @return the r e n e w a l_ p r e m i u m persistence
	 */
	public RENEWAL_PREMIUMPersistence getRENEWAL_PREMIUMPersistence() {
		return renewal_premiumPersistence;
	}

	/**
	 * Sets the r e n e w a l_ p r e m i u m persistence.
	 *
	 * @param renewal_premiumPersistence the r e n e w a l_ p r e m i u m persistence
	 */
	public void setRENEWAL_PREMIUMPersistence(
		RENEWAL_PREMIUMPersistence renewal_premiumPersistence) {
		this.renewal_premiumPersistence = renewal_premiumPersistence;
	}

	/**
	 * Returns the service master local service.
	 *
	 * @return the service master local service
	 */
	public com.ifli.rapid.service.ServiceMasterLocalService getServiceMasterLocalService() {
		return serviceMasterLocalService;
	}

	/**
	 * Sets the service master local service.
	 *
	 * @param serviceMasterLocalService the service master local service
	 */
	public void setServiceMasterLocalService(
		com.ifli.rapid.service.ServiceMasterLocalService serviceMasterLocalService) {
		this.serviceMasterLocalService = serviceMasterLocalService;
	}

	/**
	 * Returns the service master persistence.
	 *
	 * @return the service master persistence
	 */
	public ServiceMasterPersistence getServiceMasterPersistence() {
		return serviceMasterPersistence;
	}

	/**
	 * Sets the service master persistence.
	 *
	 * @param serviceMasterPersistence the service master persistence
	 */
	public void setServiceMasterPersistence(
		ServiceMasterPersistence serviceMasterPersistence) {
		this.serviceMasterPersistence = serviceMasterPersistence;
	}

	/**
	 * Returns the service request master local service.
	 *
	 * @return the service request master local service
	 */
	public com.ifli.rapid.service.ServiceRequestMasterLocalService getServiceRequestMasterLocalService() {
		return serviceRequestMasterLocalService;
	}

	/**
	 * Sets the service request master local service.
	 *
	 * @param serviceRequestMasterLocalService the service request master local service
	 */
	public void setServiceRequestMasterLocalService(
		com.ifli.rapid.service.ServiceRequestMasterLocalService serviceRequestMasterLocalService) {
		this.serviceRequestMasterLocalService = serviceRequestMasterLocalService;
	}

	/**
	 * Returns the service request master persistence.
	 *
	 * @return the service request master persistence
	 */
	public ServiceRequestMasterPersistence getServiceRequestMasterPersistence() {
		return serviceRequestMasterPersistence;
	}

	/**
	 * Sets the service request master persistence.
	 *
	 * @param serviceRequestMasterPersistence the service request master persistence
	 */
	public void setServiceRequestMasterPersistence(
		ServiceRequestMasterPersistence serviceRequestMasterPersistence) {
		this.serviceRequestMasterPersistence = serviceRequestMasterPersistence;
	}

	/**
	 * Returns the service sub master local service.
	 *
	 * @return the service sub master local service
	 */
	public com.ifli.rapid.service.ServiceSubMasterLocalService getServiceSubMasterLocalService() {
		return serviceSubMasterLocalService;
	}

	/**
	 * Sets the service sub master local service.
	 *
	 * @param serviceSubMasterLocalService the service sub master local service
	 */
	public void setServiceSubMasterLocalService(
		com.ifli.rapid.service.ServiceSubMasterLocalService serviceSubMasterLocalService) {
		this.serviceSubMasterLocalService = serviceSubMasterLocalService;
	}

	/**
	 * Returns the service sub master persistence.
	 *
	 * @return the service sub master persistence
	 */
	public ServiceSubMasterPersistence getServiceSubMasterPersistence() {
		return serviceSubMasterPersistence;
	}

	/**
	 * Sets the service sub master persistence.
	 *
	 * @param serviceSubMasterPersistence the service sub master persistence
	 */
	public void setServiceSubMasterPersistence(
		ServiceSubMasterPersistence serviceSubMasterPersistence) {
		this.serviceSubMasterPersistence = serviceSubMasterPersistence;
	}

	/**
	 * Returns the state details local service.
	 *
	 * @return the state details local service
	 */
	public com.ifli.rapid.service.StateDetailsLocalService getStateDetailsLocalService() {
		return stateDetailsLocalService;
	}

	/**
	 * Sets the state details local service.
	 *
	 * @param stateDetailsLocalService the state details local service
	 */
	public void setStateDetailsLocalService(
		com.ifli.rapid.service.StateDetailsLocalService stateDetailsLocalService) {
		this.stateDetailsLocalService = stateDetailsLocalService;
	}

	/**
	 * Returns the state details persistence.
	 *
	 * @return the state details persistence
	 */
	public StateDetailsPersistence getStateDetailsPersistence() {
		return stateDetailsPersistence;
	}

	/**
	 * Sets the state details persistence.
	 *
	 * @param stateDetailsPersistence the state details persistence
	 */
	public void setStateDetailsPersistence(
		StateDetailsPersistence stateDetailsPersistence) {
		this.stateDetailsPersistence = stateDetailsPersistence;
	}

	/**
	 * Returns the temp customer local service.
	 *
	 * @return the temp customer local service
	 */
	public com.ifli.rapid.service.TempCustomerLocalService getTempCustomerLocalService() {
		return tempCustomerLocalService;
	}

	/**
	 * Sets the temp customer local service.
	 *
	 * @param tempCustomerLocalService the temp customer local service
	 */
	public void setTempCustomerLocalService(
		com.ifli.rapid.service.TempCustomerLocalService tempCustomerLocalService) {
		this.tempCustomerLocalService = tempCustomerLocalService;
	}

	/**
	 * Returns the temp customer persistence.
	 *
	 * @return the temp customer persistence
	 */
	public TempCustomerPersistence getTempCustomerPersistence() {
		return tempCustomerPersistence;
	}

	/**
	 * Sets the temp customer persistence.
	 *
	 * @param tempCustomerPersistence the temp customer persistence
	 */
	public void setTempCustomerPersistence(
		TempCustomerPersistence tempCustomerPersistence) {
		this.tempCustomerPersistence = tempCustomerPersistence;
	}

	/**
	 * Returns the temp customer address local service.
	 *
	 * @return the temp customer address local service
	 */
	public com.ifli.rapid.service.TempCustomerAddressLocalService getTempCustomerAddressLocalService() {
		return tempCustomerAddressLocalService;
	}

	/**
	 * Sets the temp customer address local service.
	 *
	 * @param tempCustomerAddressLocalService the temp customer address local service
	 */
	public void setTempCustomerAddressLocalService(
		com.ifli.rapid.service.TempCustomerAddressLocalService tempCustomerAddressLocalService) {
		this.tempCustomerAddressLocalService = tempCustomerAddressLocalService;
	}

	/**
	 * Returns the temp customer address persistence.
	 *
	 * @return the temp customer address persistence
	 */
	public TempCustomerAddressPersistence getTempCustomerAddressPersistence() {
		return tempCustomerAddressPersistence;
	}

	/**
	 * Sets the temp customer address persistence.
	 *
	 * @param tempCustomerAddressPersistence the temp customer address persistence
	 */
	public void setTempCustomerAddressPersistence(
		TempCustomerAddressPersistence tempCustomerAddressPersistence) {
		this.tempCustomerAddressPersistence = tempCustomerAddressPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.ifli.rapid.model.QRCTeamMaster",
			qrcTeamMasterLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.ifli.rapid.model.QRCTeamMaster");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return QRCTeamMaster.class;
	}

	protected String getModelClassName() {
		return QRCTeamMaster.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = qrcTeamMasterPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.ifli.rapid.service.ActiveServiceRequestsLocalService.class)
	protected com.ifli.rapid.service.ActiveServiceRequestsLocalService activeServiceRequestsLocalService;
	@BeanReference(type = com.ifli.rapid.service.ActiveServiceRequestsService.class)
	protected com.ifli.rapid.service.ActiveServiceRequestsService activeServiceRequestsService;
	@BeanReference(type = ActiveServiceRequestsPersistence.class)
	protected ActiveServiceRequestsPersistence activeServiceRequestsPersistence;
	@BeanReference(type = com.ifli.rapid.service.AddressChangeReqDetailsLocalService.class)
	protected com.ifli.rapid.service.AddressChangeReqDetailsLocalService addressChangeReqDetailsLocalService;
	@BeanReference(type = AddressChangeReqDetailsPersistence.class)
	protected AddressChangeReqDetailsPersistence addressChangeReqDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.AddressTypeLocalService.class)
	protected com.ifli.rapid.service.AddressTypeLocalService addressTypeLocalService;
	@BeanReference(type = AddressTypePersistence.class)
	protected AddressTypePersistence addressTypePersistence;
	@BeanReference(type = com.ifli.rapid.service.BranchDetailsLocalService.class)
	protected com.ifli.rapid.service.BranchDetailsLocalService branchDetailsLocalService;
	@BeanReference(type = BranchDetailsPersistence.class)
	protected BranchDetailsPersistence branchDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.ChequePaymentRequestLocalService.class)
	protected com.ifli.rapid.service.ChequePaymentRequestLocalService chequePaymentRequestLocalService;
	@BeanReference(type = ChequePaymentRequestPersistence.class)
	protected ChequePaymentRequestPersistence chequePaymentRequestPersistence;
	@BeanReference(type = com.ifli.rapid.service.CityDetailsLocalService.class)
	protected com.ifli.rapid.service.CityDetailsLocalService cityDetailsLocalService;
	@BeanReference(type = CityDetailsPersistence.class)
	protected CityDetailsPersistence cityDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.ClosedServiceRequestsLocalService.class)
	protected com.ifli.rapid.service.ClosedServiceRequestsLocalService closedServiceRequestsLocalService;
	@BeanReference(type = ClosedServiceRequestsPersistence.class)
	protected ClosedServiceRequestsPersistence closedServiceRequestsPersistence;
	@BeanReference(type = com.ifli.rapid.service.ConfirmDetailsLocalService.class)
	protected com.ifli.rapid.service.ConfirmDetailsLocalService confirmDetailsLocalService;
	@BeanReference(type = ConfirmDetailsPersistence.class)
	protected ConfirmDetailsPersistence confirmDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.CustomerLocalService.class)
	protected com.ifli.rapid.service.CustomerLocalService customerLocalService;
	@BeanReference(type = CustomerPersistence.class)
	protected CustomerPersistence customerPersistence;
	@BeanReference(type = com.ifli.rapid.service.customerAddressLocalService.class)
	protected com.ifli.rapid.service.customerAddressLocalService customerAddressLocalService;
	@BeanReference(type = customerAddressPersistence.class)
	protected customerAddressPersistence customerAddressPersistence;
	@BeanReference(type = com.ifli.rapid.service.CustomerFamilyDetailsLocalService.class)
	protected com.ifli.rapid.service.CustomerFamilyDetailsLocalService customerFamilyDetailsLocalService;
	@BeanReference(type = CustomerFamilyDetailsPersistence.class)
	protected CustomerFamilyDetailsPersistence customerFamilyDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.customerMailIdsLocalService.class)
	protected com.ifli.rapid.service.customerMailIdsLocalService customerMailIdsLocalService;
	@BeanReference(type = customerMailIdsPersistence.class)
	protected customerMailIdsPersistence customerMailIdsPersistence;
	@BeanReference(type = com.ifli.rapid.service.CustomerMobileNumbersLocalService.class)
	protected com.ifli.rapid.service.CustomerMobileNumbersLocalService customerMobileNumbersLocalService;
	@BeanReference(type = CustomerMobileNumbersPersistence.class)
	protected CustomerMobileNumbersPersistence customerMobileNumbersPersistence;
	@BeanReference(type = com.ifli.rapid.service.CustomerOtpLocalService.class)
	protected com.ifli.rapid.service.CustomerOtpLocalService customerOtpLocalService;
	@BeanReference(type = CustomerOtpPersistence.class)
	protected CustomerOtpPersistence customerOtpPersistence;
	@BeanReference(type = com.ifli.rapid.service.FamilyRelationsLocalService.class)
	protected com.ifli.rapid.service.FamilyRelationsLocalService familyRelationsLocalService;
	@BeanReference(type = FamilyRelationsPersistence.class)
	protected FamilyRelationsPersistence familyRelationsPersistence;
	@BeanReference(type = com.ifli.rapid.service.FundMasterLocalService.class)
	protected com.ifli.rapid.service.FundMasterLocalService fundMasterLocalService;
	@BeanReference(type = FundMasterPersistence.class)
	protected FundMasterPersistence fundMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.LocationDetailsLocalService.class)
	protected com.ifli.rapid.service.LocationDetailsLocalService locationDetailsLocalService;
	@BeanReference(type = LocationDetailsPersistence.class)
	protected LocationDetailsPersistence locationDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.NavHistoryLocalService.class)
	protected com.ifli.rapid.service.NavHistoryLocalService navHistoryLocalService;
	@BeanReference(type = NavHistoryPersistence.class)
	protected NavHistoryPersistence navHistoryPersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentDetailsLocalService.class)
	protected com.ifli.rapid.service.PaymentDetailsLocalService paymentDetailsLocalService;
	@BeanReference(type = PaymentDetailsPersistence.class)
	protected PaymentDetailsPersistence paymentDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentGatewayMasterLocalService.class)
	protected com.ifli.rapid.service.PaymentGatewayMasterLocalService paymentGatewayMasterLocalService;
	@BeanReference(type = PaymentGatewayMasterPersistence.class)
	protected PaymentGatewayMasterPersistence paymentGatewayMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentMethodMasterLocalService.class)
	protected com.ifli.rapid.service.PaymentMethodMasterLocalService paymentMethodMasterLocalService;
	@BeanReference(type = PaymentMethodMasterPersistence.class)
	protected PaymentMethodMasterPersistence paymentMethodMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentMethodTypeLocalService.class)
	protected com.ifli.rapid.service.PaymentMethodTypeLocalService paymentMethodTypeLocalService;
	@BeanReference(type = PaymentMethodTypePersistence.class)
	protected PaymentMethodTypePersistence paymentMethodTypePersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentOptionMasterLocalService.class)
	protected com.ifli.rapid.service.PaymentOptionMasterLocalService paymentOptionMasterLocalService;
	@BeanReference(type = PaymentOptionMasterPersistence.class)
	protected PaymentOptionMasterPersistence paymentOptionMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentOptionTypesLocalService.class)
	protected com.ifli.rapid.service.PaymentOptionTypesLocalService paymentOptionTypesLocalService;
	@BeanReference(type = PaymentOptionTypesPersistence.class)
	protected PaymentOptionTypesPersistence paymentOptionTypesPersistence;
	@BeanReference(type = com.ifli.rapid.service.PaymentTransactionStatusMasterLocalService.class)
	protected com.ifli.rapid.service.PaymentTransactionStatusMasterLocalService paymentTransactionStatusMasterLocalService;
	@BeanReference(type = PaymentTransactionStatusMasterPersistence.class)
	protected PaymentTransactionStatusMasterPersistence paymentTransactionStatusMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.PincodeDetailsLocalService.class)
	protected com.ifli.rapid.service.PincodeDetailsLocalService pincodeDetailsLocalService;
	@BeanReference(type = PincodeDetailsPersistence.class)
	protected PincodeDetailsPersistence pincodeDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.POLICY_DOC_TYPESLocalService.class)
	protected com.ifli.rapid.service.POLICY_DOC_TYPESLocalService policy_doc_typesLocalService;
	@BeanReference(type = POLICY_DOC_TYPESPersistence.class)
	protected POLICY_DOC_TYPESPersistence policy_doc_typesPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyAddressLocalService.class)
	protected com.ifli.rapid.service.PolicyAddressLocalService policyAddressLocalService;
	@BeanReference(type = PolicyAddressPersistence.class)
	protected PolicyAddressPersistence policyAddressPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyFundLocalService.class)
	protected com.ifli.rapid.service.PolicyFundLocalService policyFundLocalService;
	@BeanReference(type = PolicyFundPersistence.class)
	protected PolicyFundPersistence policyFundPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyFundSwitchCounterLocalService.class)
	protected com.ifli.rapid.service.PolicyFundSwitchCounterLocalService policyFundSwitchCounterLocalService;
	@BeanReference(type = PolicyFundSwitchCounterPersistence.class)
	protected PolicyFundSwitchCounterPersistence policyFundSwitchCounterPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyFundSwitchDetailsLocalService.class)
	protected com.ifli.rapid.service.PolicyFundSwitchDetailsLocalService policyFundSwitchDetailsLocalService;
	@BeanReference(type = PolicyFundSwitchDetailsPersistence.class)
	protected PolicyFundSwitchDetailsPersistence policyFundSwitchDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyInfoLocalService.class)
	protected com.ifli.rapid.service.PolicyInfoLocalService policyInfoLocalService;
	@BeanReference(type = PolicyInfoPersistence.class)
	protected PolicyInfoPersistence policyInfoPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyPremPercentageLocalService.class)
	protected com.ifli.rapid.service.PolicyPremPercentageLocalService policyPremPercentageLocalService;
	@BeanReference(type = PolicyPremPercentagePersistence.class)
	protected PolicyPremPercentagePersistence policyPremPercentagePersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalService.class)
	protected com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalService policyPremRedirectionDetailsLocalService;
	@BeanReference(type = PolicyPremRedirectionDetailsPersistence.class)
	protected PolicyPremRedirectionDetailsPersistence policyPremRedirectionDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.PolicyTopupDetailsLocalService.class)
	protected com.ifli.rapid.service.PolicyTopupDetailsLocalService policyTopupDetailsLocalService;
	@BeanReference(type = PolicyTopupDetailsPersistence.class)
	protected PolicyTopupDetailsPersistence policyTopupDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalService.class)
	protected com.ifli.rapid.service.PREMIUM_PAID_CERTIFICATELocalService premium_paid_certificateLocalService;
	@BeanReference(type = PREMIUM_PAID_CERTIFICATEPersistence.class)
	protected PREMIUM_PAID_CERTIFICATEPersistence premium_paid_certificatePersistence;
	@BeanReference(type = com.ifli.rapid.service.PremiumFrequencyMasterLocalService.class)
	protected com.ifli.rapid.service.PremiumFrequencyMasterLocalService premiumFrequencyMasterLocalService;
	@BeanReference(type = PremiumFrequencyMasterPersistence.class)
	protected PremiumFrequencyMasterPersistence premiumFrequencyMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.PremiumTypeLocalService.class)
	protected com.ifli.rapid.service.PremiumTypeLocalService premiumTypeLocalService;
	@BeanReference(type = PremiumTypePersistence.class)
	protected PremiumTypePersistence premiumTypePersistence;
	@BeanReference(type = com.ifli.rapid.service.ProductFundMappingLocalService.class)
	protected com.ifli.rapid.service.ProductFundMappingLocalService productFundMappingLocalService;
	@BeanReference(type = ProductFundMappingPersistence.class)
	protected ProductFundMappingPersistence productFundMappingPersistence;
	@BeanReference(type = com.ifli.rapid.service.ProofDocsLocalService.class)
	protected com.ifli.rapid.service.ProofDocsLocalService proofDocsLocalService;
	@BeanReference(type = ProofDocsPersistence.class)
	protected ProofDocsPersistence proofDocsPersistence;
	@BeanReference(type = com.ifli.rapid.service.QRCStatusLocalService.class)
	protected com.ifli.rapid.service.QRCStatusLocalService qrcStatusLocalService;
	@BeanReference(type = QRCStatusPersistence.class)
	protected QRCStatusPersistence qrcStatusPersistence;
	@BeanReference(type = com.ifli.rapid.service.QRCSubTypeMasterLocalService.class)
	protected com.ifli.rapid.service.QRCSubTypeMasterLocalService qrcSubTypeMasterLocalService;
	@BeanReference(type = QRCSubTypeMasterPersistence.class)
	protected QRCSubTypeMasterPersistence qrcSubTypeMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.QRCTeamMasterLocalService.class)
	protected com.ifli.rapid.service.QRCTeamMasterLocalService qrcTeamMasterLocalService;
	@BeanReference(type = QRCTeamMasterPersistence.class)
	protected QRCTeamMasterPersistence qrcTeamMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.QRCTypeMasterLocalService.class)
	protected com.ifli.rapid.service.QRCTypeMasterLocalService qrcTypeMasterLocalService;
	@BeanReference(type = QRCTypeMasterPersistence.class)
	protected QRCTypeMasterPersistence qrcTypeMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.QRCUserLocalService.class)
	protected com.ifli.rapid.service.QRCUserLocalService qrcUserLocalService;
	@BeanReference(type = QRCUserPersistence.class)
	protected QRCUserPersistence qrcUserPersistence;
	@BeanReference(type = com.ifli.rapid.service.Recommended_ProductsLocalService.class)
	protected com.ifli.rapid.service.Recommended_ProductsLocalService recommended_ProductsLocalService;
	@BeanReference(type = Recommended_ProductsPersistence.class)
	protected Recommended_ProductsPersistence recommended_ProductsPersistence;
	@BeanReference(type = com.ifli.rapid.service.RENEWAL_PREMIUMLocalService.class)
	protected com.ifli.rapid.service.RENEWAL_PREMIUMLocalService renewal_premiumLocalService;
	@BeanReference(type = RENEWAL_PREMIUMPersistence.class)
	protected RENEWAL_PREMIUMPersistence renewal_premiumPersistence;
	@BeanReference(type = com.ifli.rapid.service.ServiceMasterLocalService.class)
	protected com.ifli.rapid.service.ServiceMasterLocalService serviceMasterLocalService;
	@BeanReference(type = ServiceMasterPersistence.class)
	protected ServiceMasterPersistence serviceMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.ServiceRequestMasterLocalService.class)
	protected com.ifli.rapid.service.ServiceRequestMasterLocalService serviceRequestMasterLocalService;
	@BeanReference(type = ServiceRequestMasterPersistence.class)
	protected ServiceRequestMasterPersistence serviceRequestMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.ServiceSubMasterLocalService.class)
	protected com.ifli.rapid.service.ServiceSubMasterLocalService serviceSubMasterLocalService;
	@BeanReference(type = ServiceSubMasterPersistence.class)
	protected ServiceSubMasterPersistence serviceSubMasterPersistence;
	@BeanReference(type = com.ifli.rapid.service.StateDetailsLocalService.class)
	protected com.ifli.rapid.service.StateDetailsLocalService stateDetailsLocalService;
	@BeanReference(type = StateDetailsPersistence.class)
	protected StateDetailsPersistence stateDetailsPersistence;
	@BeanReference(type = com.ifli.rapid.service.TempCustomerLocalService.class)
	protected com.ifli.rapid.service.TempCustomerLocalService tempCustomerLocalService;
	@BeanReference(type = TempCustomerPersistence.class)
	protected TempCustomerPersistence tempCustomerPersistence;
	@BeanReference(type = com.ifli.rapid.service.TempCustomerAddressLocalService.class)
	protected com.ifli.rapid.service.TempCustomerAddressLocalService tempCustomerAddressLocalService;
	@BeanReference(type = TempCustomerAddressPersistence.class)
	protected TempCustomerAddressPersistence tempCustomerAddressPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private QRCTeamMasterLocalServiceClpInvoker _clpInvoker = new QRCTeamMasterLocalServiceClpInvoker();
}