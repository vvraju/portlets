package com.ifli.rapid.services.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifl.rapid.customer.NoSuchCRM_Trn_PolicyAddressException;
import com.ifl.rapid.customer.NoSuchConfig_Mst_GenericMasterException;
import com.ifl.rapid.customer.model.CRMTrnContactCommunication;
import com.ifl.rapid.customer.model.CRMTrnFamilyMember;
import com.ifl.rapid.customer.model.CRM_Trn_Address;
import com.ifl.rapid.customer.model.CRM_Trn_Contact;
import com.ifl.rapid.customer.model.CRM_Trn_Phone;
import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;
import com.ifl.rapid.customer.model.City;
import com.ifl.rapid.customer.model.Config_Mst_GenericMaster;
import com.ifl.rapid.customer.model.LocMstBranchLocation;
import com.ifl.rapid.customer.model.LocMstLocation;
import com.ifl.rapid.customer.model.QrcTrnHistory;
import com.ifl.rapid.customer.model.QrcTrnOtp;
import com.ifl.rapid.customer.model.State;
import com.ifl.rapid.customer.model.impl.CRMTrnContactCommunicationImpl;
import com.ifl.rapid.customer.model.impl.CRMTrnFamilyMemberImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_AddressImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_ContactImpl;
import com.ifl.rapid.customer.model.impl.CRM_Trn_PhoneImpl;
import com.ifl.rapid.customer.model.impl.QrcTrnOtpImpl;
import com.ifl.rapid.customer.service.CRMTrnContactCommunicationLocalServiceUtil;
import com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_AddressLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_ContactLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_PhoneLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalServiceUtil;
import com.ifl.rapid.customer.service.CityLocalServiceUtil;
import com.ifl.rapid.customer.service.Config_Mst_GenericMasterLocalServiceUtil;
import com.ifl.rapid.customer.service.LocMstBranchLocationLocalServiceUtil;
import com.ifl.rapid.customer.service.LocMstLocationLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcTrnHistoryLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcTrnOtpLocalServiceUtil;
import com.ifl.rapid.customer.service.StateLocalServiceUtil;
import com.ifli.rapid.model.BranchDetails;
import com.ifli.rapid.model.FamilyRelations;
import com.ifli.rapid.model.impl.FamilyRelationsImpl;
import com.ifli.rapid.service.BranchDetailsLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.CustomerBean;
import com.ifli.rapid.services.helper.beans.CustomerBeanHelper;
import com.ifli.rapid.services.helper.beans.CustomerFamilyBean;
import com.ifli.rapid.services.helper.beans.CustomerMailBean;
import com.ifli.rapid.services.helper.beans.CustomerVO;
import com.ifli.rapid.services.util.CommonUtils;
import com.ifli.rapid.services.util.JsonHelper;
import com.ifli.rapid.services.util.ServiceConstants;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

@Service("iflCustomerService")
public class IFLCustomerServiceImpl implements IFLCustomerService {

	private Log logger = LogFactoryUtil.getLog(IFLCustomerServiceImpl.class
			.getName());

	public CustomerVO getCustomerPersonalDetails(int contactId) {
		// TODO Auto-generated method stub

		Config_Mst_GenericMaster gm = null;
		CRMTrnContactCommunication ccm = null;
		CRM_Trn_Contact crm = null;
		CRM_Trn_Phone cp = null;
		CustomerVO personalDetails = new CustomerVO();

		try {
			crm = CRM_Trn_ContactLocalServiceUtil.findByContactId(contactId);
			gm = Config_Mst_GenericMasterLocalServiceUtil
					.findByGenericMasterId(crm.getOccupationId());
			ccm = CRMTrnContactCommunicationLocalServiceUtil
					.findByContactId(contactId);
			cp = CRM_Trn_PhoneLocalServiceUtil.findByContactId(contactId);

			if (crm != null && gm != null && ccm != null && cp != null) {

				personalDetails.setFirstName(crm.getFirstName());
				personalDetails.setMiddleName(crm.getMiddleName());
				personalDetails.setLastName(crm.getLastName());
				personalDetails.setDateOfBirth(CommonUtils
						.changeDateTimeToFormat(crm.getDateOfBirth()));
				personalDetails.setGender(crm.getGender());
				personalDetails.setPANNo(crm.getPANNo());
				try {
					personalDetails.setDepartment(ResourceManager.getLabels(gm
							.getMasterKey()));
				} catch (Exception e) {

				}
				personalDetails.setEmail(ccm.getCommunicationMediumId());
				personalDetails.setPhoneNumber(cp.getPhoneNumber());

			}

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			logger.error(
					"Error While getting CustomerPersonalDetails Data due to "
							+ e.getMessage(), e);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			logger.error(
					"Error While getting CustomerPersonalDetails Data due to "
							+ e.getMessage(), e);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.error(
					"Error While getting CustomerPersonalDetails Data due to "
							+ e.getMessage(), e);
		} finally {
			gm = null;
			ccm = null;
			crm = null;
			cp = null;
		}

		return personalDetails;
	}

	@Override
	public CustomerVO getCustomerPermanantDetails(int contactId) {
		// TODO Auto-generated method stub

		Config_Mst_GenericMaster gm = null;
		CRM_Trn_Address permDetails = null;
		City city = null;
		State state = null;

		CustomerVO vo = new CustomerVO();

		try {

			gm = Config_Mst_GenericMasterLocalServiceUtil
					.findByMasterTypeAndMasterKey("Address", "permanent");

			if (gm != null) {

				permDetails = CRM_Trn_AddressLocalServiceUtil
						.findByContactIdAndAddressTypeId(contactId,
								gm.getGenericMasterId());
				city = CityLocalServiceUtil.getCity(permDetails.getCityId());
				state = StateLocalServiceUtil
						.getState(permDetails.getStateId());

			}

			if (permDetails != null) {
				vo.setPincode(permDetails.getPincode());
				vo.setCityId(permDetails.getCityId());
				vo.setCity(city.getCityName());
				vo.setState(state.getStateName());
				vo.setAddressLine1(permDetails.getAddressLine1());
				vo.setAddressLine2(permDetails.getAddressLine2());
				vo.setAddressLine3(permDetails.getAddressLine3());
				vo.setAddressId(permDetails.getAddressId());
				vo.setAddressTypeId(permDetails.getAddressTypeId());
			}

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			logger.error("Error While getting CustomerPermanantDetails due to "
					+ e.getMessage(), e);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			logger.error("Error While getting CustomerPermanantDetails due to "
					+ e.getMessage(), e);
		} finally {
			gm = null;
			permDetails = null;
			city = null;
			state = null;
		}

		return vo;
	}

	@Override
	public CustomerVO getCustomerOfficeDetails(int contactId) {
		// TODO Auto-generated method stub

		Config_Mst_GenericMaster gm = null;
		CRM_Trn_Address permDetails = null;
		CustomerVO officeDetails = new CustomerVO();

		try {

			gm = Config_Mst_GenericMasterLocalServiceUtil
					.findByMasterTypeAndMasterKey("Address", "official");

			if (gm != null) {

				permDetails = CRM_Trn_AddressLocalServiceUtil
						.findByContactIdAndAddressTypeId(contactId,
								gm.getGenericMasterId());
			}

			if (permDetails != null) {
				officeDetails.setPincode(permDetails.getPincode());
				officeDetails.setCityId(permDetails.getCityId());
				officeDetails.setCity(getCityName(permDetails.getCityId()));
				officeDetails.setStateId(permDetails.getStateId());
				officeDetails.setState(getStateName(permDetails.getStateId()));
				officeDetails.setAddressLine1(permDetails.getAddressLine1());
				officeDetails.setAddressLine2(permDetails.getAddressLine2());
				officeDetails.setAddressLine3(permDetails.getAddressLine3());
				officeDetails.setAddressId(permDetails.getAddressId());
				officeDetails.setAddressTypeId(permDetails.getAddressTypeId());
			}

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			logger.error("Error While getting CustomerOfficeDetails due to "
					+ e.getMessage(), e);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			logger.error("Error While getting CustomerOfficeDetails due to "
					+ e.getMessage(), e);
		} finally {
			gm = null;
			permDetails = null;
		}

		return officeDetails;
	}

	@SuppressWarnings("unchecked")
	public Config_Mst_GenericMaster getGenericMasterData(String masterType,
			String masterKey) {

		Config_Mst_GenericMaster genericMasters = null;
		DynamicQuery dq = DynamicQueryFactoryUtil
				.forClass(Config_Mst_GenericMaster.class);

		try {
			if (ServiceConstants.MASTER_TYPE_ADDRESS
					.equalsIgnoreCase(masterType)) {

				genericMasters = Config_Mst_GenericMasterLocalServiceUtil
						.findByMasterTypeAndMasterKey(masterType, masterKey);

			}

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			logger.error(
					"Error While getting GenericMaster Data due to "
							+ e.getMessage(), e);
		} catch (NoSuchConfig_Mst_GenericMasterException e) {
			// TODO Auto-generated catch block
			logger.error(
					"Error While getting GenericMaster Data due to "
							+ e.getMessage(), e);
		}
		return genericMasters;
	}

	/*
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public CustomerVO getCustomerDetails() { // TODO Auto-generated
	 * method stub
	 * 
	 * CustomerVO custDetails=new CustomerVO(); CustomerVO permDetails=new
	 * CustomerVO(); List<Config_Mst_GenericMaster>
	 * genericMasters=getGenericMasterData
	 * (ServiceConstants.MASTER_TYPE_ADDRESS);
	 * 
	 * for(Config_Mst_GenericMaster gm:genericMasters){ try {
	 * 
	 * if(ServiceConstants.PERMINANT_ADDRESS.equalsIgnoreCase(gm.getMasterKey()))
	 * {
	 * 
	 * CRM_Trn_Address
	 * custAddr=CRM_Trn_AddressLocalServiceUtil.findByAddressIdAndAddressTypeId
	 * (gm.getMasterId(), gm.getMasterKey());
	 * logger.info("contact id============"+custAddr);
	 * permDetails.setAddressId(custAddr.getAddressId());
	 * //permDetails.setContactContactId(custAddr.getContactId());
	 * permDetails.setAddressTypeId(custAddr.getAddressTypeId());
	 * permDetails.setAddressLine1(custAddr.getAddressLine1());
	 * permDetails.setAddressLine2(custAddr.getAddressLine2());
	 * permDetails.setAddressLine3(custAddr.getAddressLine3());
	 * //permDetails.setDistrict(custAddr.getDistrict());
	 * permDetails.setStateId(custAddr.getStateId());
	 * permDetails.setCityId(custAddr.getCityId());
	 * permDetails.setPincode(custAddr.getPincode());
	 * permDetails.setCountryId(custAddr.getCountryId());
	 * 
	 * try { CRM_Trn_Contact custContact =
	 * CRM_Trn_ContactLocalServiceUtil.fetchCRM_Trn_Contact(ContactId)
	 * logger.info("contact id============"+custContact); } catch
	 * (NoSuchCRM_Trn_ContactException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * if(ServiceConstants.COMMUNICATION_ADDRESS.equalsIgnoreCase(gm.getMasterKey
	 * ())){
	 * 
	 * CRM_Trn_Address custCommunication=CRM_Trn_AddressLocalServiceUtil.
	 * findByAddressIdAndAddressTypeId(gm.getMasterId(), gm.getMasterKey());
	 * custDetails.setAddressId(custCommunication.getAddressId());
	 * custDetails.setContactContactId(custCommunication.getContactId());
	 * custDetails.setAddressTypeId(custCommunication.getAddressTypeId());
	 * custDetails.setAddressLine1(custCommunication.getAddressLine1());
	 * custDetails.setAddressLine2(custCommunication.getAddressLine2());
	 * custDetails.setAddressLine3(custCommunication.getAddressLine3());
	 * custDetails.setDistrict(custCommunication.getDistrict());
	 * custDetails.setStateId(custCommunication.getStateId());
	 * custDetails.setCityId(custCommunication.getCityId());
	 * custDetails.setPincode(custCommunication.getPincode());
	 * custDetails.setCountryId(custCommunication.getCountryId());
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }catch (NoSuchCRM_Trn_AddressException e) { //e.printStackTrace();
	 * logger.
	 * error("Error While getting PERMINANT_ADDRESS Data due to "+e.getMessage
	 * (),e); } catch (SystemException e) { //e.printStackTrace();
	 * logger.error("Error While getting PERMINANT_ADDRESS Data due to "
	 * +e.getMessage(),e); }
	 * 
	 * }
	 */

	/*
	 * DynamicQuery dq=DynamicQueryFactoryUtil.forClass(CRM_Trn_Address.class);
	 * dq.add(PropertyFactoryUtil.forName("AddressTypeId").eq(gMasterId)); try {
	 * customerAddress=CRM_Trn_AddressLocalServiceUtil.dynamicQuery(dq);
	 * logger.info("CustomerPermanentAddress Size : "+customerAddress.size()); }
	 * catch (SystemException e) { // TODO Auto-generated catch block
	 * logger.error
	 * ("Error While getting CustomerAddress Data due to "+e.getMessage(),e); }
	 * 
	 * return customerAddress.get(0);
	 */

	public CustomerVO getCustomerCommunicationDetails(String policyId) {

		CRM_Trn_PolicyAddress policyDetails = null;
		CRM_Trn_Address addressDetails = null;
		CustomerVO commDetails = new CustomerVO();

		try {

			
			policyDetails = CRM_Trn_PolicyAddressLocalServiceUtil
					.findByPolicyNo(policyId);
			try {
				addressDetails = CRM_Trn_AddressLocalServiceUtil
						.getCRM_Trn_Address(policyDetails.getAddressId());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (policyDetails != null && addressDetails != null) {

				commDetails.setPincode(addressDetails.getPincode());
				commDetails.setCity(getCityName(addressDetails.getCityId()));
				commDetails.setState(getStateName(addressDetails.getStateId()));
				commDetails.setAddressLine1(addressDetails.getAddressLine1());
				commDetails.setAddressLine2(addressDetails.getAddressLine2());
				commDetails.setAddressLine3(addressDetails.getAddressLine3());
				commDetails.setAddressId(addressDetails.getAddressId());
				commDetails.setAddressTypeId(addressDetails.getAddressTypeId());
			}

		} catch (NoSuchCRM_Trn_PolicyAddressException e) {

			logger.error(
					"Error While getting CommunicationDetails Data due to "
							+ e.getMessage(), e);

		} catch (SystemException e) {

			logger.error(
					"Error While getting CommunicationDetails Data due to "
							+ e.getMessage(), e);
		} finally {
			policyDetails = null;
			addressDetails = null;
		}

		return commDetails;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerFamilyBean> getCustomerFamilyDetails(int contactId) {
		
			List<CustomerFamilyBean> customerFamilylist=new ArrayList<CustomerFamilyBean>();
			CRMTrnFamilyMember familyMember=null;
			Config_Mst_GenericMaster gm=null;
			List<CRMTrnFamilyMember> familyMembers=null;
			CRM_Trn_Contact contactDetails=null;
			
			DynamicQuery dq=DynamicQueryFactoryUtil.forClass(CRMTrnFamilyMember.class);
			dq.add(PropertyFactoryUtil.forName("ContactId").eq(contactId));
			try {
				
				familyMembers=CRMTrnFamilyMemberLocalServiceUtil.dynamicQuery(dq);
				for(CRMTrnFamilyMember fm: familyMembers){
					
					CustomerFamilyBean cfb=new CustomerFamilyBean();
					gm=Config_Mst_GenericMasterLocalServiceUtil.getConfig_Mst_GenericMaster(fm.getRelationshipId());
					cfb.setFamilyMemberId(fm.getFamilyMemberId());
					cfb.setContactId(fm.getContactId());
					cfb.setMemberId(String.valueOf(fm.getMemberId()));
					cfb.setRelationshipId(String.valueOf(fm.getRelationshipId()));
					cfb.setRelationshipName(gm.getMasterKey());
					contactDetails=CRM_Trn_ContactLocalServiceUtil.findByContactId(fm.getMemberId());
					if(contactDetails!=null){
						
						cfb.setMemberName(contactDetails.getFirstName());
						cfb.setDateOfBirth(CommonUtils.changeDateTimeToFormat(contactDetails.getDateOfBirth()));
						cfb.setAge(CommonUtils.calculateAgeFromDateofBirth(contactDetails.getDateOfBirth()));
						if(fm.getFinanciallyDependent()=="0"){
							cfb.setIsDependant("No");
						}
						else{
							cfb.setIsDependant("Yes");
						}
						customerFamilylist.add(cfb);
					}
					
				
			}
			} catch (Exception e) {
				
				logger.error("Error While getting FamilyDetails Data due to "+e.getMessage(),e);
				
			}
			
			finally{
				familyMembers=null;
				familyMember=null;
				gm=null;
				contactDetails=null;
			}
			/*CustomerVO cb=new CustomerVO();
			List<Config_Mst_GenericMaster> genericMasters=getGenericMasterData(ServiceConstants.DEPENDENT_TYPE);
			List<CRMTrnFamilyMember> familyMember=getDependentDetails(contactId,genericMasters);*/
		
		return customerFamilylist;
	}

	@SuppressWarnings("unchecked")
	public List<CRMTrnFamilyMember> getDependentDetails(String contactId,
			List<Config_Mst_GenericMaster> genericMasters) {

		List<CRMTrnFamilyMember> familyMemberList = new ArrayList<CRMTrnFamilyMember>();
		try {
			for (Config_Mst_GenericMaster gm : genericMasters) {
				DynamicQuery dq = DynamicQueryFactoryUtil
						.forClass(CRMTrnFamilyMember.class)
						.add(PropertyFactoryUtil.forName("ContactId").eq(
								contactId))
						.add(PropertyFactoryUtil.forName("RelationShipId").eq(
								gm.getGenericMasterId()));
				familyMemberList = CRMTrnFamilyMemberLocalServiceUtil
						.dynamicQuery(dq);

				for (CRMTrnFamilyMember familyMember : familyMemberList) {

					familyMemberList.add(familyMember);
				}

			}
		} catch (SystemException e) {
			logger.error(
					"Error While getting Family Members Data due to "
							+ e.getMessage(), e);
		}

		return familyMemberList;
	}

	public String saveHistoryDetails(QrcHistoryModel commonModelObj) {

		QrcTrnHistory qrcTrnHistory = QrcTrnHistoryLocalServiceUtil
				.createQrcTrnHistory(0);
		String historyId = "";
		try {
			String xml = "";
			if (commonModelObj.getRequestType().equals("Name Request")) {

				xml = "<request><request_type>Name Change</request_type>"
						+ "<old_details>" + "<first_name>"
						+ commonModelObj.getOldFirstName() + "</first_name>"
						+ "<middle_name>" + commonModelObj.getOldMiddleName()
						+ "</middle_name>" + "<last_name>"
						+ commonModelObj.getOldLastName() + "</last_name>"
						+ "</old_details>" + "<new_details>" + "<first_name>"
						+ commonModelObj.getFirstName() + "</first_name>"
						+ "<middle_name>" + commonModelObj.getMiddleName()
						+ "</middle_name>" + "<last_name>"
						+ commonModelObj.getLastName() + "</last_name>"
						+ "</new_details>" + "</request>";

			} else if (commonModelObj.getRequestType()
					.equals("Contact Request")) {
				xml = "<request><request_type>Coantact Change</request_type>"
						+ "<old_details>" + "<email>"
						+ commonModelObj.getOldEmail()
						+ "</email>"
						+ "<tel_off>"
						+ commonModelObj.getOldOfcPhone()
						+ "</tel_off>"
						+ "<tel_res>"
						+ commonModelObj.getOldResPhone()
						+ "</tel_res>"
						+ "<mobile>"
						+ commonModelObj.getOldMobile()
						+ "</mobile>"
						+ "</old_details>"
						+ "<new_details>"
						+ "<email>"
						+ commonModelObj.getEmail()
						+ "</email>"
						+ "<tel_off>"
						+ commonModelObj.getOfcPhone()
						+ "</tel_off>"
						+ "<tel_res>"
						+ commonModelObj.getResPhone()
						+ "</tel_res>"
						+ "<mobile>"
						+ commonModelObj.getMobile()
						+ "</mobile>"
						+ "</new_details>" + "</request>";

			} else if (commonModelObj.getRequestType().equals("Gender Request")) {
				xml = "<request><request_type>Gender Change</request_type>"
						+ "<old_details>" + "<Gender>"
						+ commonModelObj.getOldGender() + "</Gender>"
						+ "</old_details>" + "<new_details>" + "<Gender>"
						+ commonModelObj.getGender() + "</Gender>"
						+ "</new_details>" + "</request>";

			} else if (commonModelObj.getRequestType()
					.equals("Pancard Request")) {
				xml = "<request><request_type>Pancard Change</request_type>"
						+ "<old_details>" + "<Pancard>"
						+ commonModelObj.getOldPancard() + "</Pancard>"
						+ "</old_details>" + "<new_details>" + "<Pancard>"
						+ commonModelObj.getPancard() + "</Pancard>"
						+ "</new_details>" + "</request>";

			} else if (commonModelObj.getRequestType().equals("Dob Request")) {

				xml = "<request><request_type>Dob Change</request_type>"
						+ "<old_details>" + "<dob>"
						+ commonModelObj.getOldDob() + "</dob>"
						+ "</old_details>" + "<new_details>" + "<dob>"
						+ commonModelObj.getDob() + "</dob>" + "</new_details>"
						+ "</request>";

			} else if (commonModelObj.getRequestType()
					.equals("Address Request")) {

				if (commonModelObj.getAddrTypeId().equals("Permanent")) {

					Config_Mst_GenericMaster genericMastersList = getGenericMasterData(
							ServiceConstants.MASTER_TYPE_ADDRESS,
							ServiceConstants.PERMINANT_ADDRESS);

					if (genericMastersList != null) {
						qrcTrnHistory.setAddressTypeId(genericMastersList
								.getGenericMasterId());
					}

					xml = "<request><request_type>Address Change</request_type>"
							+ "<address_type>Permanent Address Change</address_type>"
							+ "<old_details>" + "<pincode>"
							+ commonModelObj.getOldPincode()
							+ "</pincode>"
							+ "<city>"
							+ commonModelObj.getOldCity()
							+ "</city>"
							+ "<state>"
							+ commonModelObj.getOldState()
							+ "</state>"
							+ "<address_line1>"
							+ commonModelObj.getOldAddrLine1()
							+ "</address_line1>"
							+ "<address_line2>"
							+ commonModelObj.getOldAddrLine2()
							+ "</address_line2>"
							+ "<address_line3>"
							+ commonModelObj.getOldAddrLine3()
							+ "</address_line3>"
							+ "</old_details>"
							+ "<new_details>"
							+ "<pincode>"
							+ commonModelObj.getPincode()
							+ "</pincode>"
							+ "<city>"
							+ commonModelObj.getCity()
							+ "</city>"
							+ "<state>"
							+ commonModelObj.getState()
							+ "</state>"
							+ "<address_line1>"
							+ commonModelObj.getAddrLine1()
							+ "</address_line1>"
							+ "<address_line2>"
							+ commonModelObj.getAddrLine2()
							+ "</address_line2>"
							+ "<address_line3>"
							+ commonModelObj.getAddrLine3()
							+ "</address_line3>"
							+ "</new_details>"
							+ "</request>";

				} else if (commonModelObj.getAddrTypeId().equals(
						"Communication")) {

					Config_Mst_GenericMaster genericMastersList = getGenericMasterData(
							ServiceConstants.MASTER_TYPE_ADDRESS,
							ServiceConstants.COMMUNICATION_ADDRESS);

					if (genericMastersList != null) {
						qrcTrnHistory.setAddressTypeId(genericMastersList
								.getGenericMasterId());
					}
					xml = "<request><request_type>Address Change</request_type>"
							+ "<address_type>Communication Address Change</address_type>"
							+ "<policy_number>"
							+ commonModelObj.getPolicyNo()
							+ "</policy_number>"
							+ "<old_details>"
							+ "<pincode>"
							+ commonModelObj.getOldPincode()
							+ "</pincode>"
							+ "<city>"
							+ commonModelObj.getOldCity()
							+ "</city>"
							+ "<state>"
							+ commonModelObj.getOldState()
							+ "</state>"
							+ "<address_line1>"
							+ commonModelObj.getOldAddrLine1()
							+ "</address_line1>"
							+ "<address_line2>"
							+ commonModelObj.getOldAddrLine2()
							+ "</address_line2>"
							+ "<address_line3>"
							+ commonModelObj.getOldAddrLine3()
							+ "</address_line3>"
							+ "</old_details>"
							+ "<new_details>"
							+ "<pincode>"
							+ commonModelObj.getPincode()
							+ "</pincode>"
							+ "<city>"
							+ commonModelObj.getCity()
							+ "</city>"
							+ "<state>"
							+ commonModelObj.getState()
							+ "</state>"
							+ "<address_line1>"
							+ commonModelObj.getAddrLine1()
							+ "</address_line1>"
							+ "<address_line2>"
							+ commonModelObj.getAddrLine2()
							+ "</address_line2>"
							+ "<address_line3>"
							+ commonModelObj.getAddrLine3()
							+ "</address_line3>"
							+ "</new_details>"
							+ "</request>";

				} else if (commonModelObj.getAddrTypeId().equals("Occupation")) {
					Config_Mst_GenericMaster genericMastersList = getGenericMasterData(
							ServiceConstants.MASTER_TYPE_ADDRESS,
							ServiceConstants.OFFICIAL_ADDRESS);

					if (genericMastersList != null) {
						qrcTrnHistory.setAddressTypeId(genericMastersList
								.getGenericMasterId());
					}
					xml = "<request><request_type>Address Change</request_type>"
							+ "<address_type>Official Address Change</address_type>"
							+ "<old_details>" + "<office_business_name>"
							+ commonModelObj.getOldOff_Business_Name()
							+ "</office_business_name>"
							+ "<designation>"
							+ commonModelObj.getOldDesignation()
							+ "</designation>"
							+ "<department>"
							+ commonModelObj.getOldDepartment()
							+ "</department>"
							+ "<pincode>"
							+ commonModelObj.getOldPincode()
							+ "</pincode>"
							+ "<city>"
							+ commonModelObj.getOldCity()
							+ "</city>"
							+ "<state>"
							+ commonModelObj.getOldState()
							+ "</state>"
							+ "<address_line1>"
							+ commonModelObj.getOldAddrLine1()
							+ "</address_line1>"
							+ "<address_line2>"
							+ commonModelObj.getOldAddrLine2()
							+ "</address_line2>"
							+ "<address_line3>"
							+ commonModelObj.getOldAddrLine3()
							+ "</address_line3>"
							+ "</old_details>"
							+ "<new_details>"
							+ "<office_business_name>"
							+ commonModelObj.getOff_Business_Name()
							+ "</office_business_name>"
							+ "<designation>"
							+ commonModelObj.getDesignation()
							+ "</designation>"
							+ "<department>"
							+ commonModelObj.getDepartment()
							+ "</department>"
							+ "<pincode>"
							+ commonModelObj.getPincode()
							+ "</pincode>"
							+ "<city>"
							+ commonModelObj.getCity()
							+ "</city>"
							+ "<state>"
							+ commonModelObj.getState()
							+ "</state>"
							+ "<address_line1>"
							+ commonModelObj.getAddrLine1()
							+ "</address_line1>"
							+ "<address_line2>"
							+ commonModelObj.getAddrLine2()
							+ "</address_line2>"
							+ "<address_line3>"
							+ commonModelObj.getAddrLine3()
							+ "</address_line3>"
							+ "</new_details>"
							+ "</request>";

				}

			}/*
			 * else
			 * if(commonModelObj.getRequestType().equals("FamilyDetails Request"
			 * )){
			 * 
			 * xml="<request><request_type>Address Change</request_type>"
			 * +"<address_type>Official Address Change</address_type>" +
			 * "<old_details>" +"<person>" +
			 * "<name>"+commonModelObj.getOldFamily_Mem_Name()+"</name>" +
			 * "<relation>"
			 * +commonModelObj.getOldFamily_Mem_Relation()+"</relation>" +
			 * "<age>"+commonModelObj.getOldFamily_Mem_Age()+"</age>" +
			 * "<dependent>"
			 * +commonModelObj.getOldFamily_Mem_Dependent()+"</dependent>" +
			 * "</person>" + "</old_details>" + "<new_details>" +"<person>" +
			 * "<name>"+commonModelObj.getFamily_Mem_Name()+"</name>" +
			 * "<relation>"
			 * +commonModelObj.getFamily_Mem_Relation()+"</relation>" +
			 * "<age>"+commonModelObj.getFamily_Mem_Age()+"</age>" +
			 * "<dependent>"
			 * +commonModelObj.getFamily_Mem_Dependent()+"</dependent>" +
			 * "</person>" + "</new_details>" + "</request>";
			 * 
			 * }
			 */else if (commonModelObj.getRequestType().equals(
					"FundSwitch Request")) {

				xml = "<request><request_type>Fund Switch Request</request_type>"
						+ "<policy_no>"
						+ commonModelObj.getPolicyNo()
						+ "</policy_no>"
						+ "<product_name>"
						+ commonModelObj.getProduct()
						+ "</product_name>"
						+ "<policy_status>"
						+ commonModelObj.getStatus()
						+ "</policy_status>"
						+ "<email_id>"
						+ commonModelObj.getEmail()
						+ "</email_id>"
						+ "<mobile_no>"
						+ commonModelObj.getMobile()
						+ "</mobile_no>"
						+ "<fund>"
						+ "<fund_name>"
						+ commonModelObj.getFundName()
						+ "</fund_name>"
						+ "<nav_value>"
						+ commonModelObj.getNavValue()
						+ "</nav_value>"
						+ "<num_units>"
						+ commonModelObj.getNumUnits()
						+ "</num_units>"
						+ "<fund_value>"
						+ commonModelObj.getFundValue()
						+ "</fund_value>" + "</fund>" + "</request>";

			} else if (commonModelObj.getRequestType().equals(
					"PremiumRedirection Request")) {

				xml = "<request><request_type>Premium Redirect</request_type>"
						+ "<policy_no>"
						+ commonModelObj.getPolicyNo()
						+ "</policy_no>"
						+ "<product_name>"
						+ commonModelObj.getProduct()
						+ "</product_name>"
						+ "<policy_status>"
						+ commonModelObj.getStatus()
						+ "</policy_status>"
						+ "<email_id>"
						+ commonModelObj.getEmail()
						+ "</email_id>"
						+ "<mobile_no>"
						+ commonModelObj.getMobile()
						+ "</mobile_no>"
						+ "<fund>"
						+ "<fund_name>"
						+ commonModelObj.getPremiumRedirection()
						+ "</fund_name>"
						+ "<nav_value>"
						+ commonModelObj.getNewAllocation()
						+ "</nav_value>"
						+ "<num_units>"
						+ commonModelObj.getPremiumAmountAllocation()
						+ "</num_units>" + "</fund>" + "</request>";

			} else if (commonModelObj.getRequestType().equals("Topup Request")) {

				xml = "<request><request_type>Top Up</request_type>"

				+ "<policy_no>" + commonModelObj.getPolicyNo() + "</policy_no>"
						+ "<product_name>" + commonModelObj.getProduct()
						+ "</product_name>" + "<email_id>"
						+ commonModelObj.getEmail() + "</email_id>"
						+ "<mobile_no>" + commonModelObj.getMobile()
						+ "</mobile_no>" + "<fund_name>"
						+ commonModelObj.getFundName() + "</fund_name>"
						+ "<nav_value>" + commonModelObj.getAllocation()
						+ "</nav_value>" + "<num_units>"
						+ commonModelObj.getFundValue() + "</num_units>"
						+ "</request>";
			}

			if (commonModelObj.getPickupDate() != null
					&& !commonModelObj.getPickupDate().isEmpty()) {
				String dateString1 = commonModelObj.getPickupDate();
				Date date;
				try {
					date = new SimpleDateFormat("dd-MM-yyyy")
							.parse(dateString1);
					String dateString2 = new SimpleDateFormat("yyyy-MM-dd")
							.format(date);

					Date newDate = new SimpleDateFormat("yyyy-MM-dd")
							.parse(dateString2);
					qrcTrnHistory.setPickupDate(newDate);
					qrcTrnHistory.setPickupTime(commonModelObj.getPickupTime());

				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (commonModelObj.getIsNewAddress() != null
					&& !commonModelObj.getIsNewAddress().equals("")) {

				Config_Mst_GenericMaster genericMastersList = getGenericMasterData(
						ServiceConstants.MASTER_TYPE_ADDRESS,
						ServiceConstants.NEW_ADDRESS);

				CRM_Trn_Address  addressObj=new CRM_Trn_AddressImpl();
				
				
				DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
						CRM_Trn_Address.class).add(
						PropertyFactoryUtil.forName("ContactId").eq(commonModelObj.getContactId())).add(PropertyFactoryUtil.forName("AddressTypeId").eq(genericMastersList
								.getGenericMasterId()));
				
				List<CRM_Trn_Address> addressObjList= CRM_Trn_AddressLocalServiceUtil.dynamicQuery(dq);
				
				for(CRM_Trn_Address addressObjModel:addressObjList){
					
					addressObj.setAddressId(addressObjModel.getAddressId());
				}
				
				if (genericMastersList != null) {
					addressObj.setAddressTypeId(genericMastersList
							.getGenericMasterId());
				}

				addressObj.setPincode(commonModelObj.getPickUpPinCode());
				addressObj.setAddressLine1(commonModelObj
						.getPickUpAddressLine1());

				addressObj.setAddressLine2(commonModelObj
						.getPickUpAddressLine2());

				addressObj.setAddressLine3(commonModelObj
						.getPickUpAddressLine3());

				if (commonModelObj.getPickUpCityId() != null) {
					addressObj.setCityId(Integer.parseInt(commonModelObj
							.getPickUpCityId()));
				}
				if (commonModelObj.getPickUpStateId() != null) {
					addressObj.setStateId(Integer.parseInt(commonModelObj
							.getPickUpStateId()));
				}
				if (commonModelObj.getContactId() != null) {
					addressObj.setContactId(commonModelObj.getContactId());
				}

				addressObj.setIsActive("1");
				addressObj.setCreatedBy(String.valueOf(commonModelObj
						.getCreatedContactId()));
				addressObj.setCreatedDate(new Date());

				
					
						
					CRM_Trn_AddressLocalServiceUtil.updateCRM_Trn_Address(addressObj);
				

			}

			qrcTrnHistory.setChangeRequestType(commonModelObj
					.getChangeRequestType());
												
			qrcTrnHistory.setRequestType(commonModelObj.getRequestType()); 
			qrcTrnHistory.setContactId(commonModelObj.getContactId()); 
											
			qrcTrnHistory.setCreatedContactId(commonModelObj.getCreatedContactId()); 
			qrcTrnHistory.setCreatedDate(new Date());
			qrcTrnHistory.setIsActive(1);
			qrcTrnHistory.setXMLData(xml);

			qrcTrnHistory.setCreatedBy(String.valueOf(commonModelObj.getCreatedBy()));
			
			qrcTrnHistory.setBranchId(commonModelObj.getBranchId());			

			QrcTrnHistory qrcTrnHistoryObj = QrcTrnHistoryLocalServiceUtil
					.updateQrcTrnHistory(qrcTrnHistory);

			historyId = String.valueOf(qrcTrnHistoryObj.getHistoryId());

		} catch (SystemException e) {
			logger.error("Error While Store history details " + e.getMessage(),
					e);
		}

		return historyId;

	}

	@Override
	public String getCityName(int cityId) {

		City city = null;
		try {
			city = CityLocalServiceUtil.fetchCity(cityId);

		} catch (SystemException e) {
			logger.error("Error While finding City details " + e.getMessage(),
					e);
		}

		return city.getCityName();
	}

	@Override
	public String getStateName(int stateId) {

		State state = null;
		try {
			state = StateLocalServiceUtil.fetchState(stateId);
		} catch (SystemException e) {
			logger.error("Error While finding State details " + e.getMessage(),
					e);
		}

		return state.getStateName();
	}

	@SuppressWarnings("unchecked")
	@Override
	public CustomerBean getContactDetailsByCustomerId(int custId)
			throws Exception {
		List<Config_Mst_GenericMaster> gmList = null;
		List<Config_Mst_GenericMaster> mailList = null;
		CustomerBean bean = null;
		// gm=Config_Mst_GenericMasterLocalServiceUtil.f
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(
				Config_Mst_GenericMaster.class).add(
				PropertyFactoryUtil.forName("MasterType").eq("Phone-Type"));
		DynamicQuery dqMail = DynamicQueryFactoryUtil.forClass(
				Config_Mst_GenericMaster.class).add(
				PropertyFactoryUtil.forName("MasterType").eq(
						"ContactCommunication"));

		try {
			bean = new CustomerBean();
			LinkedHashMap<String, CRM_Trn_Phone> lhm = new LinkedHashMap<String, CRM_Trn_Phone>();
			gmList = Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dq);
			if (gmList != null) {
				for (Config_Mst_GenericMaster genericMaster : gmList) {

					DynamicQuery newDq = DynamicQueryFactoryUtil
							.forClass(CRM_Trn_Phone.class)
							.add(PropertyFactoryUtil.forName("PhoneType").eq(
									genericMaster.getGenericMasterId()))
							.add(PropertyFactoryUtil.forName("ContactId").eq(
									custId));

					List<CRM_Trn_Phone> phoneList = null;
					phoneList = CRM_Trn_PhoneLocalServiceUtil
							.dynamicQuery(newDq);

					if (genericMaster.getMasterKey().equalsIgnoreCase(
							ServiceConstants.MOBILE)) {
						bean.setMobile(phoneList.get(0).getPhoneNumber());
						List<CustomerMailBean> mobileBeanList = new ArrayList<CustomerMailBean>();
						for (int i = 0; i < phoneList.size(); i++) {
							if (i != 0) {
								CustomerMailBean mobileBean = new CustomerMailBean();
								mobileBean.setMobile(phoneList.get(i)
										.getPhoneNumber());
								mobileBeanList.add(mobileBean);
							}
						}
						bean.setMobileList(mobileBeanList);
					} else if (genericMaster.getMasterKey().equalsIgnoreCase(
							ServiceConstants.HOME)) {
						bean.setResPhone(phoneList.get(0).getPhoneNumber());
					} else if (genericMaster.getMasterKey().equalsIgnoreCase(
							ServiceConstants.OFFICE)) {
						bean.setOfcPhone(phoneList.get(0).getPhoneNumber());
					}

				}

			}
			mailList = Config_Mst_GenericMasterLocalServiceUtil
					.dynamicQuery(dqMail);
			if (mailList != null) {
				DynamicQuery newDq = DynamicQueryFactoryUtil
						.forClass(CRMTrnContactCommunication.class)
						.add(PropertyFactoryUtil.forName("ContactId")
								.eq(custId))
						.add(PropertyFactoryUtil.forName("CommunicationMedium")
								.eq(mailList.get(0).getGenericMasterId()));

				List<CRMTrnContactCommunication> contactCommunications = CRMTrnContactCommunicationLocalServiceUtil
						.dynamicQuery(newDq);
				List<CustomerMailBean> mailBeanList = new ArrayList<CustomerMailBean>();
				for (int i = 0; i < contactCommunications.size(); i++) {
					if (i == 0)
						bean.setEmail(contactCommunications.get(0)
								.getCommunicationMediumId());
					else {
						CustomerMailBean mailBean = new CustomerMailBean();
						mailBean.setEmail(contactCommunications.get(i)
								.getCommunicationMediumId());
						mailBeanList.add(mailBean);
					}
				}
				bean.setMailList(mailBeanList);
			}

		} catch (SystemException e) {
			logger.error(
					"Error While getting Contact details " + e.getMessage(), e);
		} finally {
			gmList = null;
		}
		return bean;
	}

	public CustomerVO getHistoryDetails(Integer historyId) {

		CustomerVO commonModelObj = new CustomerVO();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			QrcTrnHistory qrcHistoryObj = QrcTrnHistoryLocalServiceUtil
					.getQrcTrnHistory(historyId);

			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(qrcHistoryObj.getXMLData()));

			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList newList = doc.getElementsByTagName("new_details");

			for (int temp = 0; temp < newList.getLength(); temp++) {

				Node nNode = newList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					if (qrcHistoryObj.getRequestType().equals("Name Request")) {
						commonModelObj.setFirstName(eElement
								.getElementsByTagName("first_name").item(0)
								.getTextContent());
						commonModelObj.setMiddleName(eElement
								.getElementsByTagName("middle_name").item(0)
								.getTextContent());
						commonModelObj.setLastName(eElement
								.getElementsByTagName("last_name").item(0)
								.getTextContent());

					} else if (qrcHistoryObj.getRequestType().equals(
							"Gender Request")) {

						commonModelObj.setGender(eElement
								.getElementsByTagName("Gender").item(0)
								.getTextContent());

					} else if (qrcHistoryObj.getRequestType().equals(
							"Pancard Request")) {

						commonModelObj.setPANNo(eElement
								.getElementsByTagName("Pancard").item(0)
								.getTextContent());

					} else if (qrcHistoryObj.getRequestType().equals(
							"Dob Request")) {
						commonModelObj.setDateOfBirth(eElement
								.getElementsByTagName("Pancard").item(0)
								.getTextContent());

					} else if (qrcHistoryObj.getRequestType().equals(
							"Address Request")) {

						if (eElement.getElementsByTagName(
								"office_business_name").getLength() != 0) {
							commonModelObj.setOfficeName(eElement
									.getElementsByTagName(
											"office_business_name").item(0)
									.getTextContent());
						}
						if (eElement.getElementsByTagName("designation")
								.getLength() != 0) {
							commonModelObj.setDesignation(eElement
									.getElementsByTagName("designation")
									.item(0).getTextContent());
						}
						if (eElement.getElementsByTagName("department")
								.getLength() != 0) {
							commonModelObj.setDepartment(eElement
									.getElementsByTagName("department").item(0)
									.getTextContent());
						}
						if (eElement.getElementsByTagName("policy_number")
								.getLength() != 0) {
							commonModelObj.setPolicyNo(eElement
									.getElementsByTagName("policy_number")
									.item(0).getTextContent());
						}
						commonModelObj.setPincode(eElement
								.getElementsByTagName("pincode").item(0)
								.getTextContent());
						commonModelObj.setCity(eElement
								.getElementsByTagName("city").item(0)
								.getTextContent());
						commonModelObj.setState(eElement
								.getElementsByTagName("state").item(0)
								.getTextContent());
						commonModelObj.setAddressLine1(eElement
								.getElementsByTagName("address_line1").item(0)
								.getTextContent());
						commonModelObj.setAddressLine2(eElement
								.getElementsByTagName("address_line2").item(0)
								.getTextContent());
						commonModelObj.setAddressLine3(eElement
								.getElementsByTagName("address_line3").item(0)
								.getTextContent());

					} else if (qrcHistoryObj.getRequestType().equals(
							"FundSwitch Request")) {

						/*
						 * xml=
						 * "<request><request_type>Fund Switch Request</request_type>"
						 * +
						 * "<policy_no>"+qrcHistoryObj.getPolicyNo()+"</policy_no>"
						 * + "<product_name>"+qrcHistoryObj.getProduct()+
						 * "</product_name>" +
						 * "<policy_status>"+qrcHistoryObj.getStatus
						 * ()+"</policy_status>" +
						 * "<email_id>"+qrcHistoryObj.getEmail()+"</email_id>" +
						 * "<mobile_no>"
						 * +qrcHistoryObj.getMobile()+"</mobile_no>" +"<fund>" +
						 * "<fund_name>"
						 * +qrcHistoryObj.getFundName()+"</fund_name>" +
						 * "<nav_value>"
						 * +qrcHistoryObj.getNavValue()+"</nav_value>" +
						 * "<num_units>"
						 * +qrcHistoryObj.getNumUnits()+"</num_units>" +
						 * "<fund_value>"
						 * +qrcHistoryObj.getFundValue()+"</fund_value>"
						 * +"</fund>" + "</request>";
						 */

					} else if (qrcHistoryObj.getRequestType().equals(
							"PremiumRedirection Request")) {

						/*
						 * xml=
						 * "<request><request_type>Premium Redirect</request_type>"
						 * +
						 * "<policy_no>"+qrcHistoryObj.getPolicyNo()+"</policy_no>"
						 * + "<product_name>"+qrcHistoryObj.getProduct()+
						 * "</product_name>" +
						 * "<policy_status>"+qrcHistoryObj.getStatus
						 * ()+"</policy_status>" +
						 * "<email_id>"+qrcHistoryObj.getEmail()+"</email_id>" +
						 * "<mobile_no>"
						 * +qrcHistoryObj.getMobile()+"</mobile_no>" +"<fund>" +
						 * "<fund_name>"
						 * +qrcHistoryObj.getPremiumRedirection()+"</fund_name>"
						 * + "<nav_value>"+qrcHistoryObj.getNewAllocation()+
						 * "</nav_value>" +
						 * "<num_units>"+qrcHistoryObj.getPremiumAmountAllocation
						 * ()+"</num_units>" +"</fund>" + "</request>";
						 */

					} else if (qrcHistoryObj.getRequestType().equals(
							"Topup Request")) {

						/*
						 * xml="<request><request_type>Top Up</request_type>"
						 * 
						 * +
						 * "<policy_no>"+qrcHistoryObj.getPolicyNo()+"</policy_no>"
						 * + "<product_name>"+qrcHistoryObj.getProduct()+
						 * "</product_name>" +
						 * "<email_id>"+qrcHistoryObj.getEmail()+"</email_id>" +
						 * "<mobile_no>"
						 * +qrcHistoryObj.getMobile()+"</mobile_no>" +
						 * "<fund_name>"
						 * +qrcHistoryObj.getFundName()+"</fund_name>" +
						 * "<nav_value>"
						 * +qrcHistoryObj.getAllocation()+"</nav_value>" +
						 * "<num_units>"
						 * +qrcHistoryObj.getFundValue()+"</num_units>" +
						 * "</request>";
						 */
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonModelObj;
	}

	@Override
	public List<City> getCityDetails() {
		List<City> cityList=new ArrayList<City>();
		
		try {
			cityList = CityLocalServiceUtil.getCities(0, CityLocalServiceUtil.getCitiesCount());
			
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return cityList;
	}

	@Override
	public List<State> getStateDetails() {
		
		List<State> stateList=new ArrayList<State>();
		
		try {
			stateList=StateLocalServiceUtil.getStates(0, StateLocalServiceUtil.getStatesCount());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return stateList;
	}



	/*@SuppressWarnings("unchecked")
	@Override
	public List<LocMstBranchLocation> getBranchName(int branchId) {
		
		List<LocMstBranchLocation> branchList=new ArrayList<LocMstBranchLocation>();
		
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(LocMstBranchLocation.class).add(PropertyFactoryUtil.forName("BranchName").eq(branchId));
		try {
			branchList=LocMstBranchLocationLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return branchList;
	}*/



	@SuppressWarnings("unchecked")
	@Override
	public List<City> getCityNamesByStateId(int stateId) {
		
		List<City> cityNames = new ArrayList<City>();
		
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(City.class).add(PropertyFactoryUtil.forName("StateId").eq(stateId));
		
		try {
			cityNames = CityLocalServiceUtil.dynamicQuery(dq);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return cityNames;
	}


	
	@Override
	public void updateContactDetails(CustomerBean customerBean) throws Exception {
		List<Config_Mst_GenericMaster> gmList=null;
		List<Config_Mst_GenericMaster> mailList=null;
		//gm=Config_Mst_GenericMasterLocalServiceUtil.f
		DynamicQuery dq=DynamicQueryFactoryUtil.forClass(Config_Mst_GenericMaster.class)
				.add(PropertyFactoryUtil.forName("MasterType").eq("Phone-Type"));
		
		
		DynamicQuery dqMail=DynamicQueryFactoryUtil.forClass(Config_Mst_GenericMaster.class)
				.add(PropertyFactoryUtil.forName("MasterType").eq("ContactCommunication"));
		List<String> mails=new ArrayList<String>();
		mails.add(customerBean.getEmail1());
		mails.add(customerBean.getEmail2());
		mails.add(customerBean.getEmail3());
		mails.add(customerBean.getEmail4());
		
	
		List<String> mobiles=new ArrayList<String>();
		mobiles.add(customerBean.getMobile1());
		mobiles.add(customerBean.getMobile2());
		mobiles.add(customerBean.getMobile3());
		mobiles.add(customerBean.getMobile4());
		
		try {
			gmList=Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dq);
			if(gmList!=null){
				for(Config_Mst_GenericMaster genericMaster:gmList){
					

						DynamicQuery newDq=DynamicQueryFactoryUtil.forClass(CRM_Trn_Phone.class).add(PropertyFactoryUtil.forName("PhoneType").eq(genericMaster.getGenericMasterId()))
								.add(PropertyFactoryUtil.forName("ContactId").eq(Integer.parseInt(customerBean.getCustId())));
						
						
						List<CRM_Trn_Phone>  phoneList=null;
						  phoneList=CRM_Trn_PhoneLocalServiceUtil.dynamicQuery(newDq);
						  if(genericMaster.getMasterKey().equalsIgnoreCase(ServiceConstants.MOBILE)){
							 if(phoneList!=null && phoneList.size()>0){
								  for(int i=0;i<mobiles.size();i++){
										if(i<phoneList.size())
										{
											  if(mobiles.size()<=phoneList.size()){
												  CRM_Trn_Phone phone=phoneList.get(i+1);
												  phone.setPhoneNumber(mobiles.get(i));
												  phone.setModifiedBy(customerBean.getCustId());
												  phone.setModifiedDate(new Date());
												  CRM_Trn_PhoneLocalServiceUtil.updateCRM_Trn_Phone(phone);
											  }else{
												  CRM_Trn_Phone phone=new CRM_Trn_PhoneImpl();
												  phone.setContactId(Integer.parseInt(customerBean.getCustId()));
												  phone.setPhoneType(genericMaster.getGenericMasterId());
												  phone.setPhoneNumber(mobiles.get(i));
												  phone.setCreatedBy(customerBean.getCustId());
												  phone.setCreatedDate(new Date());
												  CRM_Trn_PhoneLocalServiceUtil.addCRM_Trn_Phone(phone);
											  }
										}
								}
							 }else{
									 for(int i=0;i<mobiles.size();i++){
									 CRM_Trn_Phone phone=new CRM_Trn_PhoneImpl();
									  phone.setContactId(Integer.parseInt(customerBean.getCustId()));
									  phone.setPhoneType(genericMaster.getGenericMasterId());
									  phone.setPhoneNumber(mobiles.get(i));
									  phone.setCreatedBy(customerBean.getCustId());
									  phone.setCreatedDate(new Date());
									  CRM_Trn_PhoneLocalServiceUtil.addCRM_Trn_Phone(phone);
								 }
							 }
							}else if(genericMaster.getMasterKey().equalsIgnoreCase(ServiceConstants.HOME)){
								CRM_Trn_Phone phone=phoneList.get(0);
								  phone.setPhoneNumber(customerBean.getResPhone());
								  phone.setModifiedBy(customerBean.getCustId());
								  phone.setModifiedDate(new Date());
								  CRM_Trn_PhoneLocalServiceUtil.updateCRM_Trn_Phone(phone);

							}else if(genericMaster.getMasterKey().equalsIgnoreCase(ServiceConstants.OFFICE)){
									CRM_Trn_Phone phone=phoneList.get(0);
								  phone.setPhoneNumber(customerBean.getOfcPhone());
								  phone.setModifiedBy(customerBean.getCustId());
								  phone.setModifiedDate(new Date());
								  CRM_Trn_PhoneLocalServiceUtil.updateCRM_Trn_Phone(phone);
							}
						  
					
				}
				
			}
			mailList=Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dqMail);
			if(mailList!=null){
				DynamicQuery newDq=DynamicQueryFactoryUtil.forClass(CRMTrnContactCommunication.class).add(PropertyFactoryUtil.forName("ContactId").eq(Integer.parseInt(customerBean.getCustId()))).add(PropertyFactoryUtil.forName("CommunicationMedium").eq(mailList.get(0).getGenericMasterId()));
				
				List<CRMTrnContactCommunication> contactCommunications=CRMTrnContactCommunicationLocalServiceUtil.dynamicQuery(newDq);

				if(contactCommunications!=null && contactCommunications.size()>0){
					  for(int i=0;i<mails.size();i++){
							if(i<contactCommunications.size())
							{
								  if(mails.size()<=contactCommunications.size()){
									  CRMTrnContactCommunication communication=contactCommunications.get(i+1);
									  communication.setCommunicationMediumId(mails.get(i));
									  communication.setModifiedBy(customerBean.getCustId());
									  communication.setModifiedDate(new Date());
									  CRMTrnContactCommunicationLocalServiceUtil.updateCRMTrnContactCommunication(communication);
								  }else{
									  CRMTrnContactCommunication communication=new CRMTrnContactCommunicationImpl();
									  communication.setContactId(Integer.parseInt(customerBean.getCustId()));
									  communication.setCommunicationMedium(mailList.get(0).getGenericMasterId());
									  communication.setCommunicationMediumId(mails.get(i));
									  communication.setCreatedBy(customerBean.getCustId());
									  communication.setCreatedDate(new Date());
									  CRMTrnContactCommunicationLocalServiceUtil.addCRMTrnContactCommunication(communication);
								  }
							}
					}
				 }else{
						 for(int i=0;i<mobiles.size();i++){
							 CRMTrnContactCommunication communication=new CRMTrnContactCommunicationImpl();
							  communication.setContactId(Integer.parseInt(customerBean.getCustId()));
							  communication.setCommunicationMedium(mailList.get(0).getGenericMasterId());
							  communication.setCommunicationMediumId(mails.get(i));
							  communication.setCreatedBy(customerBean.getCustId());
							  communication.setCreatedDate(new Date());
							  CRMTrnContactCommunicationLocalServiceUtil.addCRMTrnContactCommunication(communication);
					 }
				 }
			}
			
		} catch (SystemException e) {
			logger.error("Error While updating Contact details "+e.getMessage(),e);
		}finally{
			gmList=null;
			mailList=null;
		}
	}
	
	@Override
	public void otpCreate(String otp,int custId) throws Exception{
		List<QrcTrnOtp> otpList=null;
		try{
		DynamicQuery dq=DynamicQueryFactoryUtil.forClass(QrcTrnOtp.class).add(PropertyFactoryUtil.forName("ContactId").eq(custId));
		try{
			otpList=QrcTrnOtpLocalServiceUtil.dynamicQuery(dq);
		}catch(Exception e){
			logger.error("Error While getting otp details "+e.getMessage(),e);
		}
		if(otpList!=null && otpList.size()>0){
			QrcTrnOtp trnOtp=otpList.get(0);
			trnOtp.setOtp(otp);
			trnOtp.setModifiedBy(custId+"");
			trnOtp.setModifiedDate(new Date());
			trnOtp.setIsActive("1");
			QrcTrnOtpLocalServiceUtil.updateQrcTrnOtp(trnOtp);
		}else{
			QrcTrnOtp trnOtp=new QrcTrnOtpImpl();
			trnOtp.setOtp(otp);
			trnOtp.setContactId(custId);
			trnOtp.setCreatedBy(custId+"");
			trnOtp.setCreatedDate(new Date());
			trnOtp.setIsActive("1");
			QrcTrnOtpLocalServiceUtil.addQrcTrnOtp(trnOtp);
		}
		}catch(Exception e){
			logger.error("Error While creating otp details "+e.getMessage(),e);
		}finally{
			otpList=null;
		}
	}

	@Override
	public Map otpCheck(String otp,int custId) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<QrcTrnOtp> otpList=null;
		try{
		DynamicQuery dq=DynamicQueryFactoryUtil.forClass(QrcTrnOtp.class).add(PropertyFactoryUtil.forName("ContactId").eq(custId));
		
		try{
			otpList=QrcTrnOtpLocalServiceUtil.dynamicQuery(dq);
		}catch(Exception e){
			logger.error("Error While getting otp details "+e.getMessage(),e);
		}
		if(otpList!=null){
			if(otpList.get(0).getOtp().equals(otp)){
				map.put("success",
						"Details updated successfully.Please Proceed to confirm the details.");
			} else {
				map.put("error", "Wrong OTP");
			}
		}
		
		}catch(Exception e){
			logger.error("Error While checking otp details "+e.getMessage(),e);
		}finally{
			otpList=null;
		}
		return map;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Map updateConfirmContactDetails(String jsonData) throws Exception{
		
		
		TypeToken<Map<String, String>> serviceToken = new TypeToken<Map<String, String>>() {
		};
		Gson gson = new Gson();
		Map<String, String> map = gson.fromJson(jsonData, serviceToken.getType());
		Map<String, Object> mapdetails = new HashMap<String, Object>();
		List<Config_Mst_GenericMaster> gmList=null;
		List<Config_Mst_GenericMaster> mailList=null;
		//gm=Config_Mst_GenericMasterLocalServiceUtil.f
		try{
		DynamicQuery dq=DynamicQueryFactoryUtil.forClass(Config_Mst_GenericMaster.class)
				.add(PropertyFactoryUtil.forName("MasterType").eq("Phone-Type"));
		
		
		DynamicQuery dqMail=DynamicQueryFactoryUtil.forClass(Config_Mst_GenericMaster.class)
				.add(PropertyFactoryUtil.forName("MasterType").eq("ContactCommunication"));
		
		gmList=Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dq);
		mailList=Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dqMail);
		
		DynamicQuery newDq=DynamicQueryFactoryUtil.forClass(CRM_Trn_Phone.class).add(PropertyFactoryUtil.forName("PhoneType").eq(56))
				.add(PropertyFactoryUtil.forName("ContactId").eq(Integer.parseInt(map.get("custId"))));
		List<CRM_Trn_Phone>  phoneList=null;
		  phoneList=CRM_Trn_PhoneLocalServiceUtil.dynamicQuery(newDq);
		
		
		DynamicQuery newDq1=DynamicQueryFactoryUtil.forClass(CRMTrnContactCommunication.class).add(PropertyFactoryUtil.forName("ContactId").eq(Integer.parseInt(map.get("custId")))).add(PropertyFactoryUtil.forName("CommunicationMedium").eq(mailList.get(0).getGenericMasterId()));
		List<CRMTrnContactCommunication> contactCommunications=null;
		 contactCommunications=CRMTrnContactCommunicationLocalServiceUtil.dynamicQuery(newDq1);
		
		 if(contactCommunications!=null){
			 CRMTrnContactCommunication communication=contactCommunications.get(0);
			 communication.setCommunicationMediumId(map.get("email"));
			 communication.setModifiedBy(map.get("custId"));
			 communication.setModifiedDate(new Date());
			 communication.setIsActive("1");
			 CRMTrnContactCommunicationLocalServiceUtil.updateCRMTrnContactCommunication(communication);
		 }
		 if(phoneList!=null){
			 CRM_Trn_Phone phone=phoneList.get(0);
			 phone.setPhoneNumber(map.get("mobile"));
			 phone.setModifiedBy(map.get("custId"));
			 phone.setModifiedDate(new Date());
			 phone.setIsActive("1");
			 CRM_Trn_PhoneLocalServiceUtil.updateCRM_Trn_Phone(phone);
		 }
		 mapdetails.put("success", "Details Updated Successfully");
		} catch (Exception e) {
			mapdetails.put("error", "Details not Updated.");
			e.printStackTrace();
		}
		/*Customer customer=null;
		try {
			customer=CustomerLocalServiceUtil.getCustomer(Integer.parseInt(map.get("custId")));
			if(customer!=null){
				customer.setCUSTOMER_EMAIL_ADDR(map.get("email"));
				customer.setPHONE_NUMBER_1(map.get("mobile"));
				customer.setUPDATED_BY(map.get("custId"));
				customer.setUPDATED_DATE(new Date());
				CustomerLocalServiceUtil.updateCustomer(customer);
				mapdetails.put("success", "Details Updated Successfully");
			}else{
				mapdetails.put("error", "Details not Updated.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return mapdetails;
	}
	
	
	@Override
	public List<FamilyRelations> getAllFamilyRelations() {
		
		List<FamilyRelations> famliyRelationList=new ArrayList<FamilyRelations>();
		List<Config_Mst_GenericMaster> genericMasters=null;
		genericMasters=getGenericMastersByMasterType(ServiceConstants.DEPENDANT_TYPE);
		for(Config_Mst_GenericMaster gm:genericMasters){
			
			FamilyRelations fr=new FamilyRelationsImpl();
			fr.setRELATION_ID(gm.getGenericMasterId());
			fr.setRELATION_NAME(gm.getMasterKey());
			famliyRelationList.add(fr);
		}
		
		return famliyRelationList;
	}
	
public String updateCustomerFamilyDetails(String jsonString,int contactId) {
		
		CustomerBeanHelper beanHelper = JsonHelper.fromJson(jsonString,CustomerBeanHelper.class);
		//CRMTrnFamilyMember cfm=null;
		//List<CRMTrnFamilyMember> familyMembers=null;
		//CRM_Trn_Contact contactDetails=null;
		try {
			if(beanHelper.getCustomerFamily() != null&& !beanHelper.getCustomerFamily().isEmpty()){
				for(CustomerFamilyBean l:beanHelper.getCustomerFamily()){
					
					if(l.getFamilyId().equals("") && l.getMemberId().equals("")){
						
						//adding new family member to contact table						
						CRM_Trn_Contact newContact=new CRM_Trn_ContactImpl();
						newContact.setFirstName(l.getMemberName());
						newContact.setDateOfBirth(CommonUtils.convertStringToDate(l.getDateOfBirth()));
						newContact.setCreatedBy("Manoj");
						newContact.setCreatedDate(new Date());
						newContact.setIsActive("true");
						newContact.setOccupationId(55);
						newContact.setQualificationId(55);
						newContact.setSourceId(55);
						newContact.setCategoryId(55);
						newContact.setReferredBy(55);
						newContact.setContactTypeId(55);
						newContact=CRM_Trn_ContactLocalServiceUtil.addCRM_Trn_Contact(newContact);	
						
						//adding family member to Family member table
						CRMTrnFamilyMember newCFM=new CRMTrnFamilyMemberImpl();
						newCFM.setContactId(contactId);
						newCFM.setMemberId(newContact.getContactId());
						newCFM.setRelationshipId(Integer.parseInt(l.getRelationshipId()));
						if(l.isDependant().equals("Yes")){
							newCFM.setFinanciallyDependent("1");
						}else{
							
							newCFM.setFinanciallyDependent("0");
						}
						newCFM.setIsActive("1");
						newCFM.setCreatedBy("Manoj");
						newCFM.setCreatedDate(new Date());
						CRMTrnFamilyMemberLocalServiceUtil.addCRMTrnFamilyMember(newCFM);
						
					}else{
												
						//updating family details in contact table
						CRM_Trn_Contact updatedContactDetails=new CRM_Trn_ContactImpl();
						updatedContactDetails=CRM_Trn_ContactLocalServiceUtil.findByContactId(Integer.parseInt(l.getMemberId()));
						//updatedContactDetails.setContactId(Integer.parseInt(l.getMemberId()));
						updatedContactDetails.setFirstName(l.getMemberName());
						updatedContactDetails.setDateOfBirth(CommonUtils.convertStringToDate(l.getDateOfBirth()));
						updatedContactDetails.setModifiedBy("Manoj");
						updatedContactDetails.setModifiedDate(new Date());
						updatedContactDetails.setOccupationId(55);
						updatedContactDetails.setQualificationId(55);
						updatedContactDetails.setSourceId(55);
						updatedContactDetails.setCategoryId(55);
						updatedContactDetails.setReferredBy(55);
						updatedContactDetails.setContactTypeId(55);
						CRM_Trn_ContactLocalServiceUtil.updateCRM_Trn_Contact(updatedContactDetails);
						
						// updating familymember table with  modifieddate by customer
						CRMTrnFamilyMember updatedCFM=new CRMTrnFamilyMemberImpl();
						updatedCFM=CRMTrnFamilyMemberLocalServiceUtil.findByContactIdAndMemberId(contactId, Integer.parseInt(l.getMemberId()));
								
						if(l.isDependant().equals("Yes")){
							updatedCFM.setFinanciallyDependent("1");
						}else{
							
							updatedCFM.setFinanciallyDependent("0");
						}
						updatedCFM.setRelationshipId(Integer.parseInt(l.getRelationshipId()));
						//updatedCFM.setMemberId(Integer.parseInt(l.getMemberId()));
						updatedCFM.setModifiedBy("Manoj");
						updatedCFM.setModifiedDate(new Date());
						CRMTrnFamilyMemberLocalServiceUtil.updateCRMTrnFamilyMember(updatedCFM);
									
						}
					
				}//for
			}//if
		}catch (Exception e) {
			
			logger.error("Error While UpdateCustomerFamilyDetails method "+e.getMessage(),e);
		}
		finally{
			//cfm=null;
		}
		return "success";
	}

@SuppressWarnings("unchecked")
public List<Config_Mst_GenericMaster> getGenericMastersByMasterTypeAndMasterKey(String masterType,String masterKey) {
	
	List<Config_Mst_GenericMaster> genericMasters=null;
	DynamicQuery dq=DynamicQueryFactoryUtil.forClass(Config_Mst_GenericMaster.class);
	
	try {
			dq.add(PropertyFactoryUtil.forName("MasterType").eq(masterType));
			dq.add(PropertyFactoryUtil.forName("Masterkey").eq(masterKey));
			genericMasters=Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dq);

		
	} catch (SystemException e) {
		// TODO Auto-generated catch block
		logger.error("Error While getting GenericMaster Data due to "+e.getMessage(),e);
	}
	return genericMasters;
}

@SuppressWarnings("unchecked")
public List<Config_Mst_GenericMaster> getGenericMastersByMasterType(String masterType) {
	
	List<Config_Mst_GenericMaster> genericMasters=null;
	DynamicQuery dq=DynamicQueryFactoryUtil.forClass(Config_Mst_GenericMaster.class);
	
	try {
			dq.add(PropertyFactoryUtil.forName("MasterType").eq(masterType));
			genericMasters=Config_Mst_GenericMasterLocalServiceUtil.dynamicQuery(dq);
		
		
	} catch (SystemException e) {
		// TODO Auto-generated catch block
		logger.error("Error While getting GenericMaster Data due to "+e.getMessage(),e);
	}
	return genericMasters;
}

public int getBrancLocationDetails(int cityId, int stateId, int pinNo) {

    // List<LocMstLocation> locationList= new ArrayList<LocMstLocation>();
	int locationid = 0;
	stateId=6;
	cityId=6;
	pinNo = 160009;

	DynamicQuery dq = DynamicQueryFactoryUtil.forClass(LocMstLocation.class)
			          .add(PropertyFactoryUtil.forName("StateId").eq(stateId))
			          .add(PropertyFactoryUtil.forName("CityId").eq(cityId))
	                  .add(PropertyFactoryUtil.forName("PinCode").eq(pinNo));
	
	try {
		List<LocMstLocation> locationDetails = LocMstLocationLocalServiceUtil.dynamicQuery(dq);
		for(LocMstLocation locationDetailsObj:locationDetails){
			locationid = locationDetailsObj.getLocationId();
			
		}

	} catch (SystemException e) {
		e.printStackTrace();
	}
	return locationid;
	
}

@Override
public List<LocMstBranchLocation> getBranchDetails(int locationId) {

	
   List<LocMstBranchLocation> branchDetails = new ArrayList<LocMstBranchLocation>();
	
	DynamicQuery dq = DynamicQueryFactoryUtil.forClass(LocMstBranchLocation.class).add(PropertyFactoryUtil.forName("LocationId").eq(locationId));
	
	try {
		branchDetails = LocMstBranchLocationLocalServiceUtil.dynamicQuery(dq);
		
		
	} catch (SystemException e) {
		e.printStackTrace();
	}
	
	return branchDetails;
}
public List<BranchDetails> getAllBranches() {
	List<BranchDetails> branchDetails = new ArrayList<BranchDetails>();
	try {
		branchDetails = BranchDetailsLocalServiceUtil.getBranchDetailses(0,
				BranchDetailsLocalServiceUtil.getBranchDetailsesCount());

		

	} catch (Exception e) {
		logger.error("Exception in CustomerController - getBranchs() : "
				+ e.getMessage(), e);
	} finally {
		branchDetails = null;
	}
	
	return branchDetails;
}
}
