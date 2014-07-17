/**
 * 
 */
package com.ifli.rapid.services.service;

import com.ifl.rapid.customer.model.ApplyTrnApplicationForm;
import com.ifl.rapid.customer.model.ApplyTrnQuoteDetails;
import com.ifl.rapid.customer.model.PrdMstProduct;
import com.ifl.rapid.customer.model.QrcMstSubServices;
import com.ifl.rapid.customer.service.ApplyTrnApplicationFormLocalServiceUtil;
import com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalServiceUtil;
import com.ifl.rapid.customer.service.PrdMstProductLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcMstSubServicesLocalServiceUtil;
import com.ifli.rapid.model.AddressChangeReqDetails;
import com.ifli.rapid.model.AddressType;
import com.ifli.rapid.model.BranchDetails;
import com.ifli.rapid.model.CustomerFamilyDetails;
import com.ifli.rapid.model.CustomerMobileNumbers;
import com.ifli.rapid.model.CustomerOtp;
import com.ifli.rapid.model.FamilyRelations;
import com.ifli.rapid.model.PincodeDetails;
import com.ifli.rapid.model.ProofDocs;
import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.model.ServiceSubMaster;
import com.ifli.rapid.model.TempCustomer;
import com.ifli.rapid.model.TempCustomerAddress;
import com.ifli.rapid.model.customerAddress;
import com.ifli.rapid.model.customerMailIds;
import com.ifli.rapid.service.AddressChangeReqDetailsLocalServiceUtil;
import com.ifli.rapid.service.AddressTypeLocalServiceUtil;
import com.ifli.rapid.service.BranchDetailsLocalServiceUtil;
import com.ifli.rapid.service.CustomerFamilyDetailsLocalServiceUtil;
import com.ifli.rapid.service.CustomerMobileNumbersLocalServiceUtil;
import com.ifli.rapid.service.FamilyRelationsLocalServiceUtil;
import com.ifli.rapid.service.PincodeDetailsLocalServiceUtil;
import com.ifli.rapid.service.ProofDocsLocalServiceUtil;
import com.ifli.rapid.service.QRCSubTypeMasterLocalServiceUtil;
import com.ifli.rapid.service.ServiceSubMasterLocalServiceUtil;
import com.ifli.rapid.service.TempCustomerAddressLocalServiceUtil;
import com.ifli.rapid.service.TempCustomerLocalServiceUtil;
import com.ifli.rapid.service.customerAddressLocalServiceUtil;
import com.ifli.rapid.service.customerMailIdsLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PolicyYears;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author madhu
 * 
 */
public class CustomerService {

	public List<customerAddress> getAddresses(String customerId)
			throws Exception {

		List<customerAddress> customerDetailsList = new ArrayList<customerAddress>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					customerAddress.class).add(
					PropertyFactoryUtil.forName("CUSTOMER_ID").eq(customerId));
			customerDetailsList = customerAddressLocalServiceUtil
					.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerDetailsList;
	}

	public List<CustomerFamilyDetails> getFamilymembersById(int customerId)
			throws Exception {

		List<CustomerFamilyDetails> customerFamilyDetails = new ArrayList<CustomerFamilyDetails>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					CustomerFamilyDetails.class).add(
					PropertyFactoryUtil.forName("CUSTOMER_ID").eq(customerId));
			customerFamilyDetails = CustomerFamilyDetailsLocalServiceUtil
					.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerFamilyDetails;
	}

	public customerAddress getCustomerAddress(int customerId, int addressTypeId)
			throws Exception {

		List<customerAddress> customerDetailsList = new ArrayList<customerAddress>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(customerAddress.class)
					.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(
							customerId))
					.add(PropertyFactoryUtil.forName("ADDRESS_TYPE_ID").eq(
							addressTypeId));
			customerDetailsList = customerAddressLocalServiceUtil
					.dynamicQuery(dq);
			System.out.println(customerDetailsList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerDetailsList.get(0);
	}

	public PincodeDetails getStateCity(String pincode) throws Exception {

		List<PincodeDetails> pincodeDetailsList = new ArrayList<PincodeDetails>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					PincodeDetails.class).add(
					PropertyFactoryUtil.forName("PIN_CODE").eq(pincode));
			pincodeDetailsList = PincodeDetailsLocalServiceUtil
					.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(pincodeDetailsList.size()>0){
			return pincodeDetailsList.get(0);
		}
		else{
			return null;
		}
	}

	public BranchDetails getBranchDetailsByCode(String branchCode)
			throws Exception {

		List<BranchDetails> branchDetails = new ArrayList<BranchDetails>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					BranchDetails.class).add(
					PropertyFactoryUtil.forName("BRANCH_ID").eq(
							Integer.parseInt(branchCode)));
			branchDetails = BranchDetailsLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (branchDetails.size() > 0)
			return branchDetails.get(0);
		else {
			return null;
		}

	}

	public List<ProofDocs> getDocumentName(String docType) throws Exception {

		List<ProofDocs> ProofDocsList = new ArrayList<ProofDocs>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(ProofDocs.class)
					.add(PropertyFactoryUtil.forName("DOC_TYPE").eq(docType));
			ProofDocsList = PincodeDetailsLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ProofDocsList;

	}

	public TempCustomerAddress getTempCustomerAddress(int customerId,
			int addressTypeId) throws Exception {

		List<TempCustomerAddress> tempCustomerDetailsList = new ArrayList<TempCustomerAddress>();
		TempCustomerAddress tempCustomerAddress=null;
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(TempCustomerAddress.class)
					.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(
							customerId))
					.add(PropertyFactoryUtil.forName("ADDRESS_TYPE_ID").eq(
							addressTypeId));
			tempCustomerDetailsList = TempCustomerAddressLocalServiceUtil
					.dynamicQuery(dq);
			
			if(tempCustomerDetailsList!=null&&tempCustomerDetailsList.size()!=0){
				
				tempCustomerAddress=tempCustomerDetailsList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempCustomerAddress;
	}

	public AddressType getIdByAddressTypeName(String addressType)
			throws Exception {
		List<AddressType> list = new ArrayList<AddressType>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					AddressType.class).add(
					PropertyFactoryUtil.forName("ADDRESS_TYPE_DESC").like(
							addressType));
			list = AddressTypeLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	public TempCustomer checkCustomerExist(int custId) throws Exception {
		List<TempCustomer> list = new ArrayList<TempCustomer>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					TempCustomer.class).add(
					PropertyFactoryUtil.forName("CUSTOMER_ID").eq(custId));
			list = TempCustomerLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	public CustomerOtp checkOtpExistForCustomer(int custId) throws Exception {
		List<CustomerOtp> list = new ArrayList<CustomerOtp>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					CustomerOtp.class).add(
					PropertyFactoryUtil.forName("CUSTOMER_ID").eq(custId));
			list = TempCustomerLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	public QRCSubTypeMaster getQRCSubTypeMasterDetails(String subType)
			throws Exception {

		List<QRCSubTypeMaster> qRCSubTypeMasterList = new ArrayList<QRCSubTypeMaster>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
					QRCSubTypeMaster.class).add(
					PropertyFactoryUtil.forName("SUB_TYPE_DESC").eq(subType));
			qRCSubTypeMasterList = QRCSubTypeMasterLocalServiceUtil
					.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (qRCSubTypeMasterList != null && qRCSubTypeMasterList.size() > 0)
			return qRCSubTypeMasterList.get(0);
		else
			return null;

	}

	public List<ProofDocs> getDocsByName(String docName) throws Exception {
		List<ProofDocs> list = new ArrayList<ProofDocs>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(ProofDocs.class)
					.add(PropertyFactoryUtil.forName("DOC_TYPE").eq(docName));
			list = ProofDocsLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list;
		else
			return null;
	}

	public AddressChangeReqDetails getAddressChangeReqDetails(int custId,
			int subType) throws Exception {
		List<AddressChangeReqDetails> list = new ArrayList<AddressChangeReqDetails>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(AddressChangeReqDetails.class)
					.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(custId))
					.add(PropertyFactoryUtil.forName("SUB_TYPE").eq(subType));
			list = AddressChangeReqDetailsLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	public Date getDateTimeFromAddress(int custId) throws Exception {
		
		List<customerAddress> list=new ArrayList<customerAddress>();
		DynamicQuery dq = DynamicQueryFactoryUtil
				.forClass(customerAddress.class)
				.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(
						custId));
		Order defaultOrder = OrderFactoryUtil.desc("UPDATED_DATE");
		dq.addOrder(defaultOrder);
				//.add((Criterion) PropertyFactoryUtil.forName("UPDATED_DATE").desc());
		list = customerAddressLocalServiceUtil.dynamicQuery(dq);
		if (list != null && list.size() > 0)
			return list.get(0).getUPDATED_DATE();
		else
			return null;
	}
	
	public Date getDateTimeFromFamily(int custId) throws Exception {
		
		List<CustomerFamilyDetails> list=new ArrayList<CustomerFamilyDetails>();
		DynamicQuery dq = DynamicQueryFactoryUtil
				.forClass(CustomerFamilyDetails.class)
				.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(
						custId));
		Order defaultOrder = OrderFactoryUtil.desc("UPDATED_DATE");
		dq.addOrder(defaultOrder);
				//.add((Criterion) PropertyFactoryUtil.forName("UPDATED_DATE").desc());
		list = customerAddressLocalServiceUtil.dynamicQuery(dq);
		if (list != null && list.size() > 0)
			return list.get(0).getUPDATED_DATE();
		else
			return null;
	}
	
	public List<QrcMstSubServices> getServiceSubMasterDetailsByServiceId(int serviceId) throws Exception {
		List<QrcMstSubServices> list = new ArrayList<QrcMstSubServices>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(QrcMstSubServices.class)
					.add(PropertyFactoryUtil.forName("ServiceId").eq(serviceId))
					.add(PropertyFactoryUtil.forName("IsActive").eq("1"));
			list = QrcMstSubServicesLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list;
		else
			return null;
	}
	
	public FamilyRelations getRelationIdByName(String relName) throws Exception {
		List<FamilyRelations> list = new ArrayList<FamilyRelations>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(FamilyRelations.class)
					.add(PropertyFactoryUtil.forName("RELATION_NAME").eq(relName));
			list = FamilyRelationsLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	public List<customerMailIds> getMailIdsById(int id) throws Exception {
		List<customerMailIds> list = new ArrayList<customerMailIds>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(customerMailIds.class)
					.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(id));
			list = customerMailIdsLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list;
		else
			return null;
	}
	
	public List<CustomerMobileNumbers> getMobileNumbersById(int id) throws Exception {
		List<CustomerMobileNumbers> list = new ArrayList<CustomerMobileNumbers>();
		try {
			DynamicQuery dq = DynamicQueryFactoryUtil
					.forClass(CustomerMobileNumbers.class)
					.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(id));
			list = CustomerMobileNumbersLocalServiceUtil.dynamicQuery(dq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (list != null && list.size() > 0)
			return list;
		else
			return null;
	}
	
	
		
	public List<PolicyYears> getPoliciesList(int contactId) throws Exception {
		List<ApplyTrnApplicationForm> policyinfoList = new ArrayList<ApplyTrnApplicationForm>();
		PolicyYears policyInfo=null;
		List<PolicyYears> policyList = new ArrayList<PolicyYears>();
		try {
			List<ApplyTrnQuoteDetails> list = new ArrayList<ApplyTrnQuoteDetails>();
			
			Map<String,String> productMap=new HashMap<String,String>();
			List<PrdMstProduct> productList=PrdMstProductLocalServiceUtil.getPrdMstProducts(0, PrdMstProductLocalServiceUtil.getPrdMstProductsCount());
			
			for(PrdMstProduct products:productList){
				productMap.put(products.getProductId(),products.getProductKey());
				}
			
				DynamicQuery dq = DynamicQueryFactoryUtil
						.forClass(ApplyTrnQuoteDetails.class)
						.add(PropertyFactoryUtil.forName("ContactId").eq(contactId));
				list = ApplyTrnQuoteDetailsLocalServiceUtil.dynamicQuery(dq);
				
			if(list!=null && list.size()!=0){
				for(ApplyTrnQuoteDetails quote:list){
			
					dq = DynamicQueryFactoryUtil
							.forClass(ApplyTrnApplicationForm.class)
							.add(PropertyFactoryUtil.forName("QuoteId").eq(quote.getQuoteId())).add(PropertyFactoryUtil.forName("PolicyNo").isNotNull()).add(PropertyFactoryUtil.forName("IsActive").eq(1));
					
					policyinfoList = ApplyTrnApplicationFormLocalServiceUtil.dynamicQuery(dq);
					
					for(ApplyTrnApplicationForm policyInfoModel:policyinfoList){
						
						policyInfo=new PolicyYears();
						policyInfo.setPolicyNo(policyInfoModel.getPolicyNo());
						policyInfo.setPolicyStatus(policyInfoModel.getPolicyStatus());
						policyInfo.setProductName(ResourceManager.getLabels(productMap.get(quote.getProductId())+ ".name"));
						policyInfo.setPremiumAmount(""+quote.getPremiumAmount());
						if(policyInfoModel.getPremiumDueDate()!=null){
						policyInfo.setPremiumDueDate(policyInfoModel.getPremiumDueDate().toString());
						}
						
						
						
						policyInfo.setSumAssured(""+quote.getSumAssured());
						policyList.add(policyInfo);
					}
					
				}
				
			}
				
			
			
			
			
			
			
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (policyList != null && policyList.size() > 0)
			return policyList;
		else
			return null;
	}
}
