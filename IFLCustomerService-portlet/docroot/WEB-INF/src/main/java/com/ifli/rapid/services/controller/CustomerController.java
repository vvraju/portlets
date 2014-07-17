package com.ifli.rapid.services.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifl.rapid.customer.model.CRM_Trn_Address;
import com.ifl.rapid.customer.model.CRM_Trn_PolicyAddress;
import com.ifl.rapid.customer.model.City;
import com.ifl.rapid.customer.model.QrcTrnHistory;
import com.ifl.rapid.customer.model.QrcTrnServiceRequests;
import com.ifl.rapid.customer.service.CRM_Trn_AddressLocalServiceUtil;
import com.ifl.rapid.customer.service.CRM_Trn_PolicyAddressLocalServiceUtil;
import com.ifl.rapid.customer.model.State;
import com.ifl.rapid.customer.service.QrcTrnHistoryLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcTrnServiceRequestsLocalServiceUtil;
import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.AddressChangeReqDetails;
import com.ifli.rapid.model.AddressType;
import com.ifli.rapid.model.BranchDetails;
import com.ifli.rapid.model.CityDetails;
import com.ifli.rapid.model.ConfirmDetails;
import com.ifli.rapid.model.Customer;
import com.ifli.rapid.model.CustomerFamilyDetails;
import com.ifli.rapid.model.CustomerMobileNumbers;
import com.ifli.rapid.model.CustomerOtp;
import com.ifli.rapid.model.FamilyRelations;
import com.ifli.rapid.model.LocationDetails;
import com.ifli.rapid.model.PolicyAddress;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.ProofDocs;
import com.ifli.rapid.model.QRCSubTypeMaster;
import com.ifli.rapid.model.StateDetails;
import com.ifli.rapid.model.TempCustomer;
import com.ifli.rapid.model.TempCustomerAddress;
import com.ifli.rapid.model.customerAddress;
import com.ifli.rapid.model.customerMailIds;
import com.ifli.rapid.model.impl.ActiveServiceRequestsImpl;
import com.ifli.rapid.model.impl.AddressChangeReqDetailsImpl;
import com.ifli.rapid.model.impl.ConfirmDetailsImpl;
import com.ifli.rapid.model.impl.CustomerFamilyDetailsImpl;
import com.ifli.rapid.model.impl.CustomerMobileNumbersImpl;
import com.ifli.rapid.model.impl.CustomerOtpImpl;
import com.ifli.rapid.model.impl.customerAddressImpl;
import com.ifli.rapid.model.impl.customerAddressModelImpl;
import com.ifli.rapid.model.impl.customerMailIdsImpl;
import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
import com.ifli.rapid.service.AddressChangeReqDetailsLocalServiceUtil;
import com.ifli.rapid.service.AddressTypeLocalServiceUtil;
import com.ifli.rapid.service.BranchDetailsLocalServiceUtil;
import com.ifli.rapid.service.CityDetailsLocalServiceUtil;
import com.ifli.rapid.service.ConfirmDetailsLocalServiceUtil;
import com.ifli.rapid.service.CustomerFamilyDetailsLocalServiceUtil;
import com.ifli.rapid.service.CustomerLocalServiceUtil;
import com.ifli.rapid.service.CustomerMobileNumbersLocalServiceUtil;
import com.ifli.rapid.service.CustomerOtpLocalServiceUtil;
import com.ifli.rapid.service.FamilyRelationsLocalServiceUtil;
import com.ifli.rapid.service.LocationDetailsLocalServiceUtil;
import com.ifli.rapid.service.PolicyAddressLocalServiceUtil;
import com.ifli.rapid.service.ProofDocsLocalServiceUtil;
import com.ifli.rapid.service.StateDetailsLocalServiceUtil;
import com.ifli.rapid.service.TempCustomerLocalServiceUtil;
import com.ifli.rapid.service.customerAddressLocalServiceUtil;
import com.ifli.rapid.service.customerMailIdsLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.CustomerBean;
import com.ifli.rapid.services.helper.beans.CustomerBeanHelper;
import com.ifli.rapid.services.helper.beans.CustomerFamilyBean;
import com.ifli.rapid.services.helper.beans.CustomerMailBean;
import com.ifli.rapid.services.helper.beans.CustomerOfficeAddressBean;
import com.ifli.rapid.services.helper.beans.CustomerVO;
import com.ifli.rapid.services.helper.beans.SRMgmt;
import com.ifli.rapid.services.service.CommonModel;
import com.ifli.rapid.services.service.CustomerService;
import com.ifli.rapid.services.service.IFLCustomerService;
import com.ifli.rapid.services.service.IFLCustomerServiceImpl;
import com.ifli.rapid.services.service.QrcHistoryModel;
import com.ifli.rapid.services.service.RapidServiceImpl;
import com.ifli.rapid.services.util.JsonHelper;
import com.ifli.rapid.services.util.ServiceUtils;
import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.util.PortalUtil;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.mail.internet.InternetAddress;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author Prasad Khode
 * 
 */
@Controller
@RequestMapping("VIEW")
public class CustomerController {
	private static final int CUST_ID = 1;
	private Log logger = LogFactoryUtil.getLog(CustomerController.class);
	
	@Autowired
	IFLCustomerService iflCustomerService;

	@ResourceMapping("getCustomer")
	public void getCustomer(ResourceRequest request, ResourceResponse response) {
		String custId = request.getParameter("custId");

		try {
			Customer customer = CustomerLocalServiceUtil.getCustomer(Integer
					.parseInt(custId));
			response.getWriter().write(JsonHelper.toJson(customer));
		} catch (Exception e) {
			logger.error("Exception in CustomerController - getCustomer() : "
					+ e.getMessage(), e);
		}
	}

	@RenderMapping(params = "action=uploadDocuments")
	public ModelAndView uploadDocuments(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) throws Exception {

		// Iterator<String> itr = request.getFileNames();
		// String applicationRefNo = request.getParameter(APP_REF_NO);
		// MultipartFile mpf = request.getFile(itr.next());

		try {

			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(renderRequest);
			String sourceFileName = uploadRequest.getFileName("uploadbtn");
			String custId = uploadRequest.getParameter("cust");
			String docId = uploadRequest.getParameter("PickupSelDocType");
			String docType = uploadRequest.getParameter("doctype");
			String fileName;
			if (custId != null && docId != null && docType != null)
				fileName = docType + "_" + custId + "_" + docId;
			else
				fileName = sourceFileName;
			File file = uploadRequest.getFile("uploadbtn");
			String ext = FilenameUtils.getExtension(sourceFileName);
			if (ext.equalsIgnoreCase("pdf")) {

			} else {
				ext = "png";
			}
			byte[] bytes = null;
			bytes = FileUtil.getBytes(file);
			File newFile = null;
			if ((bytes != null) && (bytes.length > 0)) {

				File newFolder = null;
				newFolder = new File(renderRequest.getPortletSession()
						.getPortletContext().getRealPath("/")
						+ "//" + "uploaddocs");
				if (!newFolder.exists()) {
					newFolder.mkdir();
				}
				newFile = new File(newFolder + "//" + "" + fileName + "." + ext);
				FileInputStream fileInputStream = new FileInputStream(file);
				FileOutputStream fileOutputStream = new FileOutputStream(
						newFile);
				fileInputStream.read(bytes);
				fileOutputStream.write(bytes, 0, bytes.length);
				fileOutputStream.close();
				fileInputStream.close();
			}
			model.addAttribute("filename", sourceFileName);
			/*
			 * BufferedImage image = ImageIO.read(new File("E:" + File.separator
			 * + "" + sourceFileName));// for getting images
			 * ByteArrayOutputStream baos = new ByteArrayOutputStream();
			 * ImageIO.write(image, "png", baos); String encodedImage =
			 * Base64.encode(baos.toByteArray());
			 * model.addAttribute("imgencode", encodedImage);
			 */

		} catch (Exception e) {

		}

		return new ModelAndView("common");

	}

	@RenderMapping(params = "action=takephoto")
	public ModelAndView takephoto(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) throws Exception {

		try {

			String custId = renderRequest.getParameter("cust");
			String docId = renderRequest.getParameter("PickupSelDocType");
			String docType = renderRequest.getParameter("doctype");
			String fileName = "";
			if (custId != null && docId != null && docType != null)
				fileName = docType + "_" + custId + "_" + docId;
			model.addAttribute("name", fileName);

		} catch (Exception e) {

		}

		return new ModelAndView("takephoto");

	}

	@RenderMapping(params = "action=capturephoto")
	public ModelAndView capturePhoto(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) {

		String image = renderRequest.getParameter("image");
		String name = renderRequest.getParameter("name");
		if (image != null && !"".equals(image)) {
			String byteStr = image.split(",")[1];
			try {
				byte[] bytes1 = Base64.decode(byteStr);

				File newFolder = null;
				newFolder = new File(renderRequest.getPortletSession()
						.getPortletContext().getRealPath("/")
						+ "//" + "uploaddocs");
				if (!newFolder.exists()) {
					newFolder.mkdir();
				}
				// newFile = new File(newFolder+"//" +""+fileName+"."+ext);

				File file1 = new File(newFolder + "//" + "" + name + ".png");

				FileUtils.writeByteArrayToFile(file1, bytes1);

				// request.setAttribute(IMG, UPLOADED_IMAGES + "/" + imageName);
			} catch (Exception e) {
				// rapidLogger.errorMessage("Base64DecodingException", e);
			}
		}

		return new ModelAndView("takephoto");
	}

	@ResourceMapping("getPersonalDetails")
	public void getPersonalDetails(ResourceRequest request,
			ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			CustomerVO personalDetails=iflCustomerService.getCustomerPersonalDetails(1);
			if(personalDetails!=null){
				
				logger.info("personalDetails json string : "+JsonHelper.toJson(personalDetails));
				response.getWriter().write(JsonHelper.toJson(personalDetails));
			}
			
						
		} catch (Exception e) {
			
			logger.error("Exception in CustomerController - getPersonalDetails() : "+ e.getMessage(), e);
			
		} finally {
			map = null;
		}
	}

	@ResourceMapping("updatePersonalDetails")
	public void updatePersonalDetails(ResourceRequest request,
			ResourceResponse response) throws IOException {
		String data = request.getParameter("jsonKey");
		Map<String, Object> map = new HashMap<String, Object>();
		CustomerBean customerBean = JsonHelper.fromJson(data,
				CustomerBean.class);
		map.put("error", "");
		try {
			if (customerBean != null) {
				
			
				CustomerVO personalDetails=iflCustomerService.getCustomerPersonalDetails(1);
				
				QrcHistoryModel qrcHistoryObj=new QrcHistoryModel();
				
						
						if (customerBean.getType().equals("personaldob")&&(customerBean.getDob()!=null)) {
							if(customerBean.getDob().equals(personalDetails.getDateOfBirth())){
							map.put("error", "You haven't change Date of Birth.");
							}
						}else if(customerBean.getFirstName()!=null&& customerBean.getLastName()!=null
								&& customerBean.getMiddleName()!=null&&customerBean.getType().equals("personal")){
							if(customerBean.getFirstName().equals(personalDetails.getFirstName())
									&& customerBean.getLastName().equals(personalDetails.getLastName())
									&& customerBean.getMiddleName().equals(personalDetails.getMiddleName())){
								map.put("error", "You haven't change Personal Information.");
							}
							
						}else if(customerBean.getGender()!=null&&customerBean.getType().equals("personalgender")){
							if(customerBean.getGender().equals(personalDetails.getGender())){
								map.put("error", "You haven't change Gender Information.");
							}
							
						}else if(customerBean.getPancard()!=null&&customerBean.getType().equals("personalpan")){
							if(customerBean.getPancard().equals(personalDetails.getPANNo())){
								map.put("error", "You haven't change Pancard Information.");
							}
							
						}
						
						
						
						if(map!=null && map.get("error").equals("")){
						
			if(customerBean
							.getDob()!=null&&!customerBean
							.getDob().equals("")&&customerBean.getType().equals("personaldob")){
			String dobDate[]=customerBean
			.getDob().split("-");				
		
			qrcHistoryObj.setDob(dobDate[2]+"-"+dobDate[1]+"-"+dobDate[0]);
			qrcHistoryObj.setOldDob(personalDetails.getDateOfBirth());
			qrcHistoryObj.setRequestType("Dob Request");
			
			}else if(customerBean.getType().equals("personal")){
				
				
				qrcHistoryObj.setFirstName(customerBean
						.getFirstName());
				qrcHistoryObj.setLastName(customerBean
						.getLastName());
				qrcHistoryObj.setMiddleName(customerBean
						.getMiddleName());
				
				qrcHistoryObj.setOldFirstName(personalDetails.getFirstName());
				qrcHistoryObj.setOldLastName(personalDetails.getLastName());
				qrcHistoryObj.setOldMiddleName(personalDetails.getMiddleName());
				qrcHistoryObj.setRequestType("Name Request");
				
			}else if(customerBean.getType().equals("personalgender")){
				
				qrcHistoryObj.setGender(customerBean.getGender());
				qrcHistoryObj.setOldGender(personalDetails.getGender());
				qrcHistoryObj.setRequestType("Gender Request");
				
			}else if(customerBean.getType().equals("personalpan")){
			
				qrcHistoryObj.setPancard(customerBean.getPancard());
				qrcHistoryObj.setOldPancard(personalDetails.getPANNo());
				qrcHistoryObj.setRequestType("Pancard Request");
			}

					qrcHistoryObj.setPickupDate(customerBean.getPickupDate());
					qrcHistoryObj.setPickupTime(customerBean.getPickupTime());
					qrcHistoryObj.setBranchId(customerBean.getBranchId());
					qrcHistoryObj.setContactId(1);
					qrcHistoryObj.setCreatedContactId(1);
					qrcHistoryObj.setCreatedBy(1);
					if(customerBean.getPickAddrTypeId()!=null&&customerBean.getPickAddrTypeId().equals("4")){
						
						qrcHistoryObj.setIsNewAddress("true");
						qrcHistoryObj.setPickUpPinCode(customerBean.getNewPincode());
						qrcHistoryObj.setPickUpCity(customerBean.getNewCity());
						qrcHistoryObj.setPickUpState(customerBean.getNewState());
						qrcHistoryObj.setPickUpCityId(customerBean.getNewCityId());
						qrcHistoryObj.setPickUpStateId(customerBean.getNewStateId());
						qrcHistoryObj.setPickUpAddressLine1(customerBean.getNewAddr1());
						qrcHistoryObj.setPickUpAddressLine2(customerBean.getNewAddr2());
						qrcHistoryObj.setPickUpAddressLine3(customerBean.getNewAddr3());
						
					}
					
					
					
					
					String historyId=iflCustomerService.saveHistoryDetails(qrcHistoryObj);
					
					if(historyId!=null&&!historyId.isEmpty()){
						map.put("historyId", historyId);
						map.put("success", "Successfully send details");
					}else{
						map.put("error", "Invalid details");
					}
						
					

					
					}
			} else {
				map.put("error", "No details found for update.");
			}

			System.out.println(JsonHelper.toJson(map));
		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - updatePersonalDetails() : "
							+ e.getMessage(), e);
		}
		response.getWriter().write(JsonHelper.toJson(map));
	}

	@ResourceMapping("getCityStateByPincode")
	public void getCityStateByPincode(ResourceRequest request,
			ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		String pincode = request.getParameter("pincode");
		try {

			if(pincode!=null){
				RapidServiceImpl rapidServie=new RapidServiceImpl();
			CommonModel model=	rapidServie.getCityAndState(pincode);

			map.put("pid", pincode);
			map.put("cityId", model.getCityId());
			map.put("cityName", model.getCityName());
			map.put("stateId", model.getStateId());
			map.put("stateName", model.getStateName());
			}else{
				map.put("error", "Details not found");
			}
			response.getWriter().write(JsonHelper.toJson(map));
			System.out.println(JsonHelper.toJson(map));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getCityDetails() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("getAddressType")
	public void getAddressType(ResourceRequest request,
			ResourceResponse response, Model model) {

		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			List<AddressType> addressType = AddressTypeLocalServiceUtil
					.getAddressTypes(range, range);

			response.getWriter().write(JsonHelper.toJson(addressType));

			System.out.println(JsonHelper.toJson(addressType));
		} catch (SystemException e) {
			logger.error(
					"Exception in CustomerController - getAddressType() : "
							+ e.getMessage(), e);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(
					"Exception in CustomerController - getAddressType() : "
							+ e.getMessage(), e);
		}

		finally {
			map = null;
		}

	}

	@ResourceMapping("getCommunicationAddress")
	public void getCommunicationAddress(ResourceRequest request,
			ResourceResponse response, Model model) {
String policyNo=request.getParameter("policyNo");
		Map<String, Object> map = new HashMap<String, Object>();
		CustomerVO communicationDetails=null;
		try {
			if(policyNo!=null&&!policyNo.isEmpty()){
			communicationDetails=iflCustomerService.getCustomerCommunicationDetails(policyNo);
			if(communicationDetails!=null){
			String jsonString=JsonHelper.toJson(communicationDetails);
			response.getWriter().write(jsonString);
			
			
			/*String custId = request.getParameter("custId");
			String address = request.getParameter("addressType");
			if (custId != null && address != null) {
				AddressType addressType = customerService
						.getIdByAddressTypeName(address);
				customerAddress communicationDetails = customerService
						.getCustomerAddress(Integer.parseInt(custId),
								addressType.getADDRESS_TYPE_ID());
				response.getWriter().write(
						JsonHelper.toJson(communicationDetails));

				System.out.println(JsonHelper.toJson(communicationDetails));*/
			
			} else {
				map.put("error","Error occured while updating the Communication details.");
				response.getWriter().write(JsonHelper.toJson(map));
			}
			}
		} catch (IOException e) {
			logger.error("Exception in CustomerController - getCommunicationAddress() : "+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error("Exception in CustomerController - getCommunicationAddress() : "+ e.getMessage(), e);
		}
		finally{
			communicationDetails=null;
			map=null;
		}

	}

	@ResourceMapping("updateCommunicationAddress")
	public void updateCommunicationAddress(ResourceRequest request,
			ResourceResponse response, Model model) {
		String data = request.getParameter("jsonKey");
		logger.info("Json Key : "+data);
		customerAddressModelImpl communicationAddress = JsonHelper.fromJson(
				data, customerAddressModelImpl.class);

		Map<String, Object> map = new HashMap<String, Object>();
		QrcHistoryModel qrcHistoryObj=new QrcHistoryModel();
		CustomerVO communicationDetails=null;
		communicationDetails=iflCustomerService.getCustomerPermanantDetails(1);
		
		try {
			
            if(communicationAddress!=null){
				
				logger.info("communicationAddress json string : "+JsonHelper.toJson(communicationAddress));
				response.getWriter().write(JsonHelper.toJson(communicationAddress));
			
				/* New details applied here*/
			qrcHistoryObj.setAddrLine1(communicationAddress.getADDRESS_LINE_1());
			qrcHistoryObj.setAddrLine2(communicationAddress.getADDRESS_LINE_2());
			qrcHistoryObj.setAddrLine3(communicationAddress.getADDRESS_LINE_3());
			qrcHistoryObj.setCity(communicationAddress.getCITY());
			qrcHistoryObj.setCityId(String.valueOf(communicationAddress.getCITY_ID()));
			qrcHistoryObj.setState(communicationAddress.getSTATE());
			qrcHistoryObj.setStateId(String.valueOf(communicationAddress.getSTATE_ID()));
			qrcHistoryObj.setPincode(communicationAddress.getPIN_CODE());
			qrcHistoryObj.setPolicyNo(qrcHistoryObj.getPolicyNo());
			qrcHistoryObj.setAddrTypeId("communication");
			qrcHistoryObj.setRequestType("Address Request");
			
			/* Old Details applied here*/
			qrcHistoryObj.setOldAddrLine1(communicationDetails.getAddressLine1());
			qrcHistoryObj.setOldAddrLine2(communicationDetails.getAddressLine2());
			qrcHistoryObj.setOldAddrLine3(communicationDetails.getAddressLine3());
			qrcHistoryObj.setOldCity(communicationDetails.getCity());
			qrcHistoryObj.setOldCityId(String.valueOf(communicationDetails.getCityId()));
			qrcHistoryObj.setOldState(communicationDetails.getState());
			qrcHistoryObj.setOldStateId(String.valueOf(communicationDetails.getStateId()));
			qrcHistoryObj.setOldPincode(communicationDetails.getPincode());
			//qrcHistoryObj.setOldPolicyNo(permDetails.getPolicyNo());
			qrcHistoryObj.setOldAddrTypeId(communicationDetails.getAddrType());
			qrcHistoryObj.setOldRequestType("Address Request");
			

			iflCustomerService.saveHistoryDetails(qrcHistoryObj);
		
		
			String historyId=iflCustomerService.saveHistoryDetails(qrcHistoryObj);
			
			if(historyId!=null&&!historyId.isEmpty()){
				map.put("historyId", historyId);
				map.put("success", "Successfully send details");
			}else{
				map.put("error", "Invalid details");
			}
			
		response.getWriter().write(JsonHelper.toJson(map));
	} else{
		
		map.put("error", "No details found for update.");
		
	}
   }catch (Exception e) {
		
		logger.error("Exception in CustomerController - updateCommunicationAddress() : "+ e.getMessage(), e);
		
	}
	
			
			
			/*if (communicationAddress != null) {
				TempCustomerAddress tempCustomerAddress = null;
				try {
					tempCustomerAddress = TempCustomerAddressLocalServiceUtil
							.getTempCustomerAddress(communicationAddress
									.getCUSTOMER_ADDRESS_ID());
				} catch (Exception e) {
					tempCustomerAddress = null;
				}
				if (tempCustomerAddress != null) {
					tempCustomerAddress.setADDRESS_LINE_1(communicationAddress
							.getADDRESS_LINE_1());
					tempCustomerAddress.setADDRESS_LINE_2(communicationAddress
							.getADDRESS_LINE_2());
					tempCustomerAddress.setADDRESS_LINE_3(communicationAddress
							.getADDRESS_LINE_3());
					tempCustomerAddress.setCITY(communicationAddress.getCITY());
					tempCustomerAddress.setCITY_ID(communicationAddress
							.getCITY_ID());
					tempCustomerAddress.setSTATE(communicationAddress
							.getSTATE());
					tempCustomerAddress.setSTATE_ID(communicationAddress
							.getSTATE_ID());
					tempCustomerAddress.setPIN_CODE(communicationAddress
							.getPIN_CODE());
					tempCustomerAddress.setCUSTOMER_ID(communicationAddress
							.getCUSTOMER_ID());
					tempCustomerAddress.setADDRESS_TYPE_ID(communicationAddress
							.getADDRESS_TYPE_ID());
					tempCustomerAddress.setADDR_STATUS(communicationAddress
							.getADDR_STATUS());
					tempCustomerAddress
							.setCHANGE_REQUEST_FOR(communicationAddress
									.getCHANGE_REQUEST_FOR());
					tempCustomerAddress.setQRC_ASR_ID(1);
					tempCustomerAddress.setCUSTOMER_ID(communicationAddress
							.getCUSTOMER_ID());

					TempCustomerAddress add = TempCustomerAddressLocalServiceUtil
							.updateTempCustomerAddress(tempCustomerAddress);
				} else {
					TempCustomerAddress address = new TempCustomerAddressImpl();
					address.setCUSTOMER_ADDRESS_ID(communicationAddress
							.getCUSTOMER_ADDRESS_ID());
					address.setADDRESS_LINE_1(communicationAddress
							.getADDRESS_LINE_1());
					address.setADDRESS_LINE_2(communicationAddress
							.getADDRESS_LINE_2());
					address.setADDRESS_LINE_3(communicationAddress
							.getADDRESS_LINE_3());
					address.setCITY(communicationAddress.getCITY());
					address.setCITY_ID(communicationAddress.getCITY_ID());
					address.setSTATE(communicationAddress.getSTATE());
					address.setSTATE_ID(communicationAddress.getSTATE_ID());
					address.setPIN_CODE(communicationAddress.getPIN_CODE());
					address.setCUSTOMER_ID(communicationAddress
							.getCUSTOMER_ID());
					address.setADDRESS_TYPE_ID(communicationAddress
							.getADDRESS_TYPE_ID());
					address.setADDR_STATUS(communicationAddress
							.getADDR_STATUS());
					address.setCHANGE_REQUEST_FOR(communicationAddress
							.getCHANGE_REQUEST_FOR());
					address.setQRC_ASR_ID(1);
					address.setCUSTOMER_ID(communicationAddress
							.getCUSTOMER_ID());

					TempCustomerAddressLocalServiceUtil
							.addTempCustomerAddress(address);
				}
				map.put("success", "Communication Address save successfully");
			} else {
				map.put("error",
						"Error occured while updating the Communication Address.");
			}
			response.getWriter().write(JsonHelper.toJson(map));

			System.out.println(JsonHelper.toJson(map));
		} catch (Exception e) {

		}*/
	}

	/*@ResourceMapping("getOfficeAddress")
	public void getOfficeAddress(ResourceRequest request,
			ResourceResponse response, Model model) {

		CustomerService customerService = new CustomerService();
		String custId = request.getParameter("custId");
		String address = request.getParameter("addressType");
		CustomerOfficeAddressBean addressBean = new CustomerOfficeAddressBean();
		try {
			if (custId != null && address != null) {
				AddressType addressType = customerService
						.getIdByAddressTypeName(address);
				customerAddress officeDetails = customerService
						.getCustomerAddress(Integer.parseInt(custId),
								addressType.getADDRESS_TYPE_ID());

				Customer customer = CustomerLocalServiceUtil
						.getCustomer(Integer.parseInt(custId));

				addressBean.setCustId(custId);
				addressBean.setAddressType(address);
				addressBean.setOfcName(customer.getOFFICE_NAME());
				addressBean.setDesignation(customer.getDESIGNATION());
				addressBean.setDepartment(customer.getDEPARTMENT());
				addressBean.setAddress1(officeDetails.getADDRESS_LINE_1());
				addressBean.setAddress2(officeDetails.getADDRESS_LINE_2());
				addressBean.setAddress3(officeDetails.getADDRESS_LINE_3());
				addressBean.setCity(officeDetails.getCITY());
				addressBean.setState(officeDetails.getSTATE());
				addressBean.setPincode(officeDetails.getPIN_CODE());
				addressBean.setAddressTypeId(String.valueOf(officeDetails
						.getADDRESS_TYPE_ID()));
				addressBean.setAddressId(String.valueOf(officeDetails
						.getPrimaryKey()));
				addressBean.setCityId(officeDetails.getCITY_ID());
				addressBean.setStateId(officeDetails.getSTATE_ID());
			} else {
				addressBean.setError("Office details not found");
			}
			response.getWriter().write(JsonHelper.toJson(addressBean));
			System.out.println(JsonHelper.toJson(addressBean));

		} catch (SystemException e) {
			logger.error(
					"Exception in CustomerController - getOfficeAddress() : "
							+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getOfficeAddress() : "
							+ e.getMessage(), e);
		}

	}*/

	@ResourceMapping("updateOfficeAddress")
	public void updateOfficeAddress(ResourceRequest request,
			ResourceResponse response, Model model) throws Exception {

		String data = request.getParameter("jsonKey");
		CustomerOfficeAddressBean officeAddressBean = JsonHelper.fromJson(data,
				CustomerOfficeAddressBean.class);
		Map<String, Object> map = new HashMap<String, Object>();

		QrcHistoryModel qrcHistoryObj=new QrcHistoryModel();
		CustomerVO officeAddress=null;
		officeAddress=iflCustomerService.getCustomerOfficeDetails(1);
		
		
		try{
		
		if(officeAddressBean!=null){
			boolean flag=true;
			if((officeAddress.getOfficeName()!=null&&officeAddress.getOfficeName().equals(officeAddressBean.getOfcName()))&&
					officeAddress.getDepartment().equals(officeAddressBean.getDepartment())&&
					officeAddress.getDesignation().equals(officeAddressBean.getDesignation())&&
					

					officeAddress.getAddressLine1().equals(officeAddressBean
							.getAddress1())&&
							officeAddress.getAddressLine2().equals(officeAddressBean
							.getAddress2())&&
							officeAddress.getAddressLine3().equals(officeAddressBean
							.getAddress3())&&
							officeAddress.getCity().equals(officeAddressBean.getCity())&&
							officeAddress.getState().equals(officeAddressBean.getState())&&
							officeAddress.getPincode().equals(officeAddressBean.getPincode())&&
							officeAddress.getCityId()==officeAddressBean.getCityId()&&
									officeAddress.getStateId()==officeAddressBean.getStateId()){
						flag=false;
					}
					
					if(flag){
			logger.info("officeAddressBean json string : "+JsonHelper.toJson(officeAddressBean));
		
			/* New details applied here*/
			qrcHistoryObj.setContactId(1);
			qrcHistoryObj.setCreatedContactId(1);
			qrcHistoryObj.setCreatedBy(1);
			
		qrcHistoryObj.setAddrLine1(officeAddressBean.getAddress1());
		qrcHistoryObj.setAddrLine2(officeAddressBean.getAddress2());
		qrcHistoryObj.setAddrLine3(officeAddressBean.getAddress3());
		qrcHistoryObj.setCity(officeAddressBean.getCity());
		qrcHistoryObj.setCityId(String.valueOf(officeAddressBean.getCityId()));
		qrcHistoryObj.setState(officeAddressBean.getState());
		qrcHistoryObj.setStateId(String.valueOf(officeAddressBean.getStateId()));
		qrcHistoryObj.setPincode(officeAddressBean.getPincode());
		//qrcHistoryObj.setPolicyNo(communicationAddress.getPolicyNo());
		qrcHistoryObj.setAddrTypeId(officeAddressBean.getAddressType());
		qrcHistoryObj.setRequestType("Address Request");
		qrcHistoryObj.setPickupDate(officeAddressBean.getPickupDate());	
		qrcHistoryObj.setPickupTime(officeAddressBean.getPickupTime());
		qrcHistoryObj.setBranchId(officeAddressBean.getBranchId());
		qrcHistoryObj.setDepartment(officeAddressBean.getDepartment());
		qrcHistoryObj.setDesignation(officeAddressBean.getDesignation());
		qrcHistoryObj.setOff_Business_Name(officeAddressBean.getOfcName());
		
		qrcHistoryObj.setAddrTypeId("Occupation");
		/* Old Details applied here*/
		qrcHistoryObj.setOldAddrLine1(officeAddress.getAddressLine1());
		qrcHistoryObj.setOldAddrLine2(officeAddress.getAddressLine2());
		qrcHistoryObj.setOldAddrLine3(officeAddress.getAddressLine3());
		qrcHistoryObj.setOldCity(officeAddress.getCity());
		qrcHistoryObj.setOldCityId(String.valueOf(officeAddress.getCityId()));
		qrcHistoryObj.setOldState(officeAddress.getState());
		qrcHistoryObj.setOldStateId(String.valueOf(officeAddress.getStateId()));
		qrcHistoryObj.setOldPincode(officeAddress.getPincode());
		qrcHistoryObj.setOldAddrTypeId(officeAddress.getAddrType());
		
		qrcHistoryObj.setOldDepartment(officeAddress.getDepartment());
		qrcHistoryObj.setOldDesignation(officeAddress.getDesignation());
		qrcHistoryObj.setOldOff_Business_Name(officeAddress.getOfficeName());
		
		qrcHistoryObj.setContactId(1);
		qrcHistoryObj.setCreatedContactId(1);
		qrcHistoryObj.setCreatedBy(1);
		
		if(officeAddressBean.getPickAddrTypeId()!=null&&officeAddressBean.getPickAddrTypeId().equals("4")){
			
			qrcHistoryObj.setIsNewAddress("true");
			qrcHistoryObj.setPickUpPinCode(officeAddressBean.getNewPincode());
			qrcHistoryObj.setPickUpCity(officeAddressBean.getNewCity());
			qrcHistoryObj.setPickUpState(officeAddressBean.getNewState());
			qrcHistoryObj.setPickUpCityId(officeAddressBean.getNewCityId());
			qrcHistoryObj.setPickUpStateId(officeAddressBean.getNewStateId());
			qrcHistoryObj.setPickUpAddressLine1(officeAddressBean.getNewAddr1());
			qrcHistoryObj.setPickUpAddressLine2(officeAddressBean.getNewAddr2());
			qrcHistoryObj.setPickUpAddressLine3(officeAddressBean.getNewAddr3());
			
		}
		
		String historyId=iflCustomerService.saveHistoryDetails(qrcHistoryObj);
		
		if(historyId!=null&&!historyId.isEmpty()){
			map.put("historyId", historyId);
			map.put("success", "Successfully send details");
		}else{
			map.put("error", "Invalid details");
		}
		
	
}else{
	
	map.put("error",
			"You have not change address details");
}
}
}catch (Exception e) {
	
	logger.error("Exception in CustomerController - updateOfficeAddress() : "+ e.getMessage(), e);
	
}
		response.getWriter().write(JsonHelper.toJson(map));
}
		/*if (officeAddressBean.getCustId() != null
				&& officeAddressBean.getAddressTypeId() != null
				&& !officeAddressBean.getCustId().isEmpty()
				&& !officeAddressBean.getAddressTypeId().isEmpty()) {

			Customer customer = CustomerLocalServiceUtil.getCustomer(Integer
					.parseInt(officeAddressBean.getCustId()));
			customerAddress officeDetails = customerService.getCustomerAddress(
					Integer.parseInt(officeAddressBean.getCustId()),
					Integer.parseInt(officeAddressBean.getAddressTypeId()));

			int custId = Integer.parseInt(officeAddressBean.getCustId());
			int address = Integer
					.parseInt(officeAddressBean.getAddressTypeId());

			try {
				if (officeAddressBean.getType().equalsIgnoreCase("correction")) {
					customer.setOFFICE_NAME(officeAddressBean.getOfcName());
					customer.setDEPARTMENT(officeAddressBean.getDepartment());
					customer.setDESIGNATION(officeAddressBean.getDesignation());
					CustomerLocalServiceUtil.updateCustomer(customer);

					officeDetails.setADDRESS_LINE_1(officeAddressBean
							.getAddress1());
					officeDetails.setADDRESS_LINE_2(officeAddressBean
							.getAddress2());
					officeDetails.setADDRESS_LINE_3(officeAddressBean
							.getAddress3());
					officeDetails.setCITY(officeAddressBean.getCity());
					officeDetails.setSTATE(officeAddressBean.getState());
					officeDetails.setPIN_CODE(officeAddressBean.getPincode());
					officeDetails.setCITY_ID(officeAddressBean.getCityId());
					officeDetails.setSTATE_ID(officeAddressBean.getStateId());
					customerAddressLocalServiceUtil
							.updatecustomerAddress(officeDetails);

					map.put("success",
							"Occupation/Service Details Correction done successfully");
					map.put("type", "correction");
				} else {

				boolean flag=true;
				
				if(customer.getOFFICE_NAME().equals(officeAddressBean.getOfcName())&&
				customer.getDEPARTMENT().equals(officeAddressBean.getDepartment())&&
				customer.getDESIGNATION().equals(officeAddressBean.getDesignation())&&
				

				officeDetails.getADDRESS_LINE_1().equals(officeAddressBean
						.getAddress1())&&
				officeDetails.getADDRESS_LINE_2().equals(officeAddressBean
						.getAddress2())&&
				officeDetails.getADDRESS_LINE_3().equals(officeAddressBean
						.getAddress3())&&
				officeDetails.getCITY().equals(officeAddressBean.getCity())&&
				officeDetails.getSTATE().equals(officeAddressBean.getState())&&
				officeDetails.getPIN_CODE().equals(officeAddressBean.getPincode())&&
				officeDetails.getCITY_ID()==officeAddressBean.getCityId()&&
				officeDetails.getSTATE_ID()==officeAddressBean.getStateId()){
					flag=false;
				}
				
				if(flag){
				
				
					TempCustomer TempCustomer = TempCustomerLocalServiceUtil
							.getTempCustomer(custId);
					if (TempCustomer != null) {
						TempCustomer.setOFFICE_NAME(officeAddressBean
								.getOfcName());
						TempCustomer.setDEPARTMENT(officeAddressBean
								.getDepartment());
						TempCustomer.setDESIGNATION(officeAddressBean
								.getDesignation());
						TempCustomer.setQRC_ASR_ID(1);
						TempCustomerLocalServiceUtil
								.updateTempCustomer(TempCustomer);
					} else {
						TempCustomer customerTemp = new TempCustomerImpl();
						customerTemp.setCUSTOMER_ID(custId);
						customerTemp.setOFFICE_NAME(officeAddressBean
								.getOfcName());
						customerTemp.setDEPARTMENT(officeAddressBean
								.getDepartment());
						customerTemp.setDESIGNATION(officeAddressBean
								.getDesignation());

						customerTemp.setQRC_ASR_ID(1);
						TempCustomerLocalServiceUtil
								.addTempCustomer(customerTemp);

					}
					TempCustomerAddress tempAddress = customerService
							.getTempCustomerAddress(custId, address);
					if (tempAddress != null) {
						tempAddress.setADDRESS_LINE_1(officeAddressBean
								.getAddress1());
						tempAddress.setADDRESS_LINE_2(officeAddressBean
								.getAddress2());
						tempAddress.setADDRESS_LINE_3(officeAddressBean
								.getAddress3());
						tempAddress.setCITY(officeAddressBean.getCity());
						tempAddress.setSTATE(officeAddressBean.getState());
						tempAddress.setPIN_CODE(officeAddressBean.getPincode());
						tempAddress.setCITY_ID(officeAddressBean.getCityId());
						tempAddress.setSTATE_ID(officeAddressBean.getStateId());
						tempAddress.setQRC_ASR_ID(1);

						TempCustomerAddressLocalServiceUtil
								.updateTempCustomerAddress(tempAddress);

					} else {
						TempCustomerAddress tempCustomerAddress = new TempCustomerAddressImpl();
						tempCustomerAddress
								.setCUSTOMER_ADDRESS_ID(officeDetails
										.getCUSTOMER_ADDRESS_ID());

						tempCustomerAddress.setADDRESS_LINE_1(officeAddressBean
								.getAddress1());
						tempCustomerAddress.setADDRESS_LINE_2(officeAddressBean
								.getAddress2());
						tempCustomerAddress.setADDRESS_LINE_3(officeAddressBean
								.getAddress3());
						tempCustomerAddress
								.setCITY(officeAddressBean.getCity());
						tempCustomerAddress.setSTATE(officeAddressBean
								.getState());
						tempCustomerAddress.setPIN_CODE(officeAddressBean
								.getPincode());
						tempCustomerAddress.setCUSTOMER_ID(custId);
						tempCustomerAddress.setADDRESS_TYPE_ID(address);
						tempCustomerAddress.setCITY_ID(officeAddressBean
								.getCityId());
						tempCustomerAddress.setSTATE_ID(officeAddressBean
								.getStateId());
						tempCustomerAddress.setQRC_ASR_ID(1);
						tempCustomerAddress.setCUSTOMER_ID(custId);
						TempCustomerAddressLocalServiceUtil
								.addTempCustomerAddress(tempCustomerAddress);
					}

					map.put("success",
							"Occupation/Service Details Change done.Please select upload now/pickup required/Branch visit.");
					map.put("type", "change");
				}else{
					
					map.put("error",
							"You have not change address details");
				}
			} catch (Exception e) {
				logger.error(
						"Exception in CustomerController - getOfficeAddress() : "
								+ e.getMessage(), e);
			}
		} else {
			map.put("error", "Error occured while updating the Office details.");
		}
		response.getWriter().write(JsonHelper.toJson(map));

		System.out.println(JsonHelper.toJson(map));
	}*/

	@ResourceMapping("getPermanentAddress")
	public void getPermanentAddress(ResourceRequest request,
			ResourceResponse response, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		//CustomerService customerService = new CustomerService();
		logger.info("In getPermanentAddress ");
		CustomerVO permDetails=null;
		try {
			
			//IFLCustomerService ic=new IFLCustomerServiceImpl();
			//CustomerVO permDetails=ic.getCustomerPermanantDetails(1);
			permDetails=iflCustomerService.getCustomerPermanantDetails(1);
			
			if(permDetails!=null){
				
				String jsonString=JsonHelper.toJson(permDetails);
				response.getWriter().write(jsonString);
				logger.info("PermanentAddress jsonString :  "+jsonString);
			}
			
			/*String custId = request.getParameter("custId");
			String address = request.getParameter("addressType");
			if (custId != null && address != null) {
				AddressType addressType = customerService
						.getIdByAddressTypeName(address);
				customerAddress permenantDetails = customerService
						.getCustomerAddress(Integer.parseInt(custId),
								addressType.getADDRESS_TYPE_ID());

				response.getWriter().write(JsonHelper.toJson(permenantDetails));

				System.out.println(JsonHelper.toJson(permenantDetails));*/
			
			else {
				
				map.put("error","Error occured while getting the Permanent details.");
				response.getWriter().write(JsonHelper.toJson(map));
			}
			
		} catch (IOException e) {
			logger.error("Exception in CustomerController - getPermanentAddress() : "+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error("Exception in CustomerController - getPermanentAddress() : "+ e.getMessage(), e);
		}
		finally{
			permDetails=null;
			map=null;
		}

	}
	
	
	@ResourceMapping("getOfficeAddress")
	public void getOfficeAddress(ResourceRequest request,ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		logger.info("In getOfficeAddress ");
		CustomerVO officeDetails=null;
		try {
			
			//IFLCustomerService ic=new IFLCustomerServiceImpl();
			//CustomerVO permDetails=ic.getCustomerOfficeDetails(1);
			CustomerVO personalDetails=iflCustomerService.getCustomerPersonalDetails(1);
			officeDetails=iflCustomerService.getCustomerOfficeDetails(1);
			
			if(officeDetails!=null){
				officeDetails.setDepartment(personalDetails.getDepartment());
				String jsonString=JsonHelper.toJson(officeDetails);
				response.getWriter().write(jsonString);
				logger.info("OfficeAddress jsonString :  "+jsonString);
			}else{
				
				map.put("error","Error occured while getting Office details.");
				response.getWriter().write(JsonHelper.toJson(map));
			}
			
		} catch (IOException e) {
			logger.error("Exception in CustomerController - getOfficeAddress() : "+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error("Exception in CustomerController - getOfficeAddress() : "+ e.getMessage(), e);
		}
		finally{
			officeDetails=null;
			map=null;
		}

	}

	@ResourceMapping("updatePermanentAddress")
	public void updatePermanentAddress(ResourceRequest request,
			ResourceResponse response, Model model) {
		String data = request.getParameter("jsonKey");

		logger.info("==== JSON key in Address Details===" + data);
		CustomerBean permanentAddress = JsonHelper.fromJson(data,CustomerBean.class);
		Map<String, Object> map = new HashMap<String, Object>();
		QrcHistoryModel qrcHistoryObj=new QrcHistoryModel();
		
	 boolean flag=true;
	 
	 
		try{
			CustomerVO permDetails=null;
			System.out.println("permanent details====="+permanentAddress.getAddrType());
			if(permanentAddress.getAddrType().equals("Permanent")){
				permDetails=iflCustomerService.getCustomerPermanantDetails(1);
				}else if(permanentAddress.getAddrType().equals("Communication")){
					if(permanentAddress.getPolicyNo()!=null && !permanentAddress.getPolicyNo().isEmpty()){

				permDetails=iflCustomerService.getCustomerCommunicationDetails(permanentAddress.getPolicyNo());
					}
				}
			if(permDetails.getAddressLine1().equals(permanentAddress.getAddrLine1())&&
					permDetails.getAddressLine2().equals(permanentAddress.getAddrLine2())&&
					permDetails.getAddressLine3().equals(permanentAddress.getAddrLine3())&&
					permDetails.getCity().equals(permanentAddress.getCity())&&
					permDetails.getCityId()==Integer.parseInt(permanentAddress.getCityId())&&
							permDetails.getState().equals(permanentAddress.getState())&&
							permDetails.getStateId()==Integer.parseInt(permanentAddress.getStateId())&&
									permDetails.getPincode().equals(permanentAddress.getPincode())){
				
				flag=false;
				
			}else{
				
				flag=true;
			}
			
		
			
			
			if(flag){
				
				logger.info("Address Details json string : "+JsonHelper.toJson(permanentAddress));
				
				
				
			
				/* New details applied here*/
			qrcHistoryObj.setAddrLine1(permanentAddress.getAddrLine1());
			qrcHistoryObj.setAddrLine2(permanentAddress.getAddrLine2());
			qrcHistoryObj.setAddrLine3(permanentAddress.getAddrLine3());
			qrcHistoryObj.setCity(permanentAddress.getCity());
			qrcHistoryObj.setCityId(permanentAddress.getCityId());
			qrcHistoryObj.setState(permanentAddress.getState());
			qrcHistoryObj.setStateId(permanentAddress.getStateId());
			qrcHistoryObj.setPincode(permanentAddress.getPincode());
			qrcHistoryObj.setPolicyNo(permanentAddress.getPolicyNo());
			qrcHistoryObj.setAddrTypeId(permanentAddress.getAddrType());
			qrcHistoryObj.setRequestType("Address Request");
			qrcHistoryObj.setPickupDate(permanentAddress.getPickupDate());	
			qrcHistoryObj.setPickupTime(permanentAddress.getPickupTime());
			qrcHistoryObj.setBranchId(permanentAddress.getBranchId());
			
			/* Old Details applied here*/
			qrcHistoryObj.setOldAddrLine1(permDetails.getAddressLine1());
			qrcHistoryObj.setOldAddrLine2(permDetails.getAddressLine2());
			qrcHistoryObj.setOldAddrLine3(permDetails.getAddressLine3());
			qrcHistoryObj.setOldCity(permDetails.getCity());
			qrcHistoryObj.setOldCityId(String.valueOf(permDetails.getCityId()));
			qrcHistoryObj.setOldState(permDetails.getState());
			qrcHistoryObj.setOldStateId(String.valueOf(permDetails.getStateId()));
			qrcHistoryObj.setOldPincode(permDetails.getPincode());
			//qrcHistoryObj.setOldPolicyNo(permDetails.getPolicyNo());
			qrcHistoryObj.setOldAddrTypeId(permDetails.getAddrType());
			qrcHistoryObj.setOldRequestType("Address Request");
			
			if(permanentAddress.getPickAddrTypeId()!=null&&permanentAddress.getPickAddrTypeId().equals("4")){
				
				qrcHistoryObj.setIsNewAddress("true");
				qrcHistoryObj.setPickUpPinCode(permanentAddress.getNewPincode());
				qrcHistoryObj.setPickUpCity(permanentAddress.getNewCity());
				qrcHistoryObj.setPickUpState(permanentAddress.getNewState());
				qrcHistoryObj.setPickUpCityId(permanentAddress.getNewCityId());
				qrcHistoryObj.setPickUpStateId(permanentAddress.getNewStateId());
				qrcHistoryObj.setPickUpAddressLine1(permanentAddress.getNewAddr1());
				qrcHistoryObj.setPickUpAddressLine2(permanentAddress.getNewAddr2());
				qrcHistoryObj.setPickUpAddressLine3(permanentAddress.getNewAddr3());
				
			}

			String historyId=iflCustomerService.saveHistoryDetails(qrcHistoryObj);
		
			if(historyId!=null&&!historyId.isEmpty()){
				map.put("historyId", historyId);
				map.put("success", "Successfully send details");
			}else{
				map.put("error", "Invalid details");
			}
	
		
		}else{
				map.put("error",
						"You have not change address details");
				
			}
			
			response.getWriter().write(JsonHelper.toJson(map));
}catch (Exception e) {
		
		logger.error("Exception in CustomerController - updatePermanentAddress() : "+ e.getMessage(), e);
		
	}
	
		
		
}
		
		
		
		
		/*finally {
		map = null;
	}*/
		
		
		//CustomerService customerService = new CustomerService();
		/*try {
			if (permanentAddress.getType().equalsIgnoreCase("correction")) {
				customerAddress customerAddress = null;
				customerAddress = customerService.getCustomerAddress(
						Integer.parseInt(permanentAddress.getCustId()),
						Integer.parseInt(permanentAddress.getAddrTypeId()));
				customerAddress.setADDRESS_LINE_1(permanentAddress
						.getAddrLine1());
				customerAddress.setADDRESS_LINE_2(permanentAddress
						.getAddrLine2());
				customerAddress.setADDRESS_LINE_3(permanentAddress
						.getAddrLine3());
				customerAddress.setCITY(permanentAddress.getCity());
				customerAddress.setCITY_ID(Integer.parseInt(permanentAddress
						.getCityId()));
				customerAddress.setSTATE(permanentAddress.getState());
				customerAddress.setSTATE_ID(Integer.parseInt(permanentAddress
						.getStateId()));
				customerAddress.setPIN_CODE(permanentAddress.getPincode());
				customerAddress.setADDR_STATUS("Y");
				customerAddress.setCHANGE_REQUEST_FOR(1);
				customerAddress.setUPDATED_BY(permanentAddress.getCityId());
				customerAddress.setUPDATED_DATE(new Date());
				customerAddressLocalServiceUtil
						.updatecustomerAddress(customerAddress);
				map.put("success",
						"Permanent Address Correction done successfully");
				map.put("type", "correction");
			} else {
			
			boolean flag=false;
				if (permanentAddress != null) {
					
					QrcHistoryModel qrcHistoryObj=new QrcHistoryModel();
					
					
					customerAddress customerAddress = null;
					
					customerAddress = customerService.getCustomerAddress(
							Integer.parseInt(permanentAddress.getCustId()),
							Integer.parseInt(permanentAddress.getAddrTypeId()));
					if(customerAddress.getADDRESS_LINE_1().equals(permanentAddress.getAddrLine1())&&
							customerAddress.getADDRESS_LINE_2().equals(permanentAddress.getAddrLine2())&&
							customerAddress.getADDRESS_LINE_3().equals(permanentAddress.getAddrLine3())&&
							customerAddress.getCITY().equals(permanentAddress.getCity())&&
							customerAddress.getCITY_ID()==Integer.parseInt(permanentAddress.getCityId())&&
							customerAddress.getSTATE().equals(permanentAddress.getState())&&
							customerAddress.getSTATE_ID()==Integer.parseInt(permanentAddress.getStateId())&&
							customerAddress.getPIN_CODE().equals(permanentAddress.getPincode())){
						
						flag=false;
						
					}else{
						
						flag=true;
					}
					
				
					
					
					if(flag){
					
					TempCustomerAddress tempCustomerAddress = null;
					try {
						tempCustomerAddress = customerService.getTempCustomerAddress(Integer.parseInt(permanentAddress.getCustId()), Integer.parseInt(permanentAddress.getAddrTypeId()));
					} catch (Exception e) {
						tempCustomerAddress = null;
					}
					if (tempCustomerAddress != null) {
						tempCustomerAddress.setADDRESS_LINE_1(permanentAddress.getAddrLine1());
						tempCustomerAddress.setADDRESS_LINE_2(permanentAddress.getAddrLine2());
						tempCustomerAddress.setADDRESS_LINE_3(permanentAddress.getAddrLine3());
						tempCustomerAddress.setCITY(permanentAddress.getCity());
						tempCustomerAddress.setCITY_ID(Integer.parseInt(permanentAddress.getCityId()));
						tempCustomerAddress.setSTATE(permanentAddress.getState());
						tempCustomerAddress.setSTATE_ID(Integer.parseInt(permanentAddress.getStateId()));
						tempCustomerAddress.setPIN_CODE(permanentAddress.getPincode());
						tempCustomerAddress.setADDR_STATUS("Y");
						tempCustomerAddress.setCHANGE_REQUEST_FOR(1);
						tempCustomerAddress.setQRC_ASR_ID(1);
						tempCustomerAddress.setUPDATED_BY(permanentAddress.getCityId());
						tempCustomerAddress.setUPDATED_DATE(new Date());
						TempCustomerAddressLocalServiceUtil.updateTempCustomerAddress(tempCustomerAddress);
					} else {
						TempCustomerAddress address = new TempCustomerAddressImpl();
						address.setADDRESS_LINE_1(permanentAddress.getAddrLine1());
						address.setADDRESS_LINE_2(permanentAddress.getAddrLine2());
						address.setADDRESS_LINE_3(permanentAddress.getAddrLine3());
						address.setCITY(permanentAddress.getCity());
						address.setCITY_ID(Integer.parseInt(permanentAddress.getCityId()));
						address.setSTATE(permanentAddress.getState());
						address.setSTATE_ID(Integer.parseInt(permanentAddress.getStateId()));
						address.setPIN_CODE(permanentAddress.getPincode());
						address.setCUSTOMER_ID(Integer.parseInt(permanentAddress.getCityId()));
						address.setADDRESS_TYPE_ID(Integer.parseInt(permanentAddress.getAddrTypeId()));
						address.setADDR_STATUS("Y");
						address.setCHANGE_REQUEST_FOR(1);
						address.setQRC_ASR_ID(1);
						address.setINSERTED_BY(permanentAddress.getCityId());
						address.setINSERTED_DATE(new Date());

						TempCustomerAddressLocalServiceUtil.addTempCustomerAddress(address);
					}
						
						qrcHistoryObj.setAddrLine1(permanentAddress.getAddrLine1());
						qrcHistoryObj.setAddrLine2(permanentAddress.getAddrLine2());
						qrcHistoryObj.setAddrLine3(permanentAddress.getAddrLine3());
						qrcHistoryObj.setCity(permanentAddress.getCity());
						qrcHistoryObj.setCityId(permanentAddress.getCityId());
						qrcHistoryObj.setState(permanentAddress.getState());
						qrcHistoryObj.setStateId(permanentAddress.getStateId());
						qrcHistoryObj.setPincode(permanentAddress.getPincode());
						qrcHistoryObj.setPolicyNo(permanentAddress.getPolicyNo());
						qrcHistoryObj.setAddrTypeId("permanent");
						qrcHistoryObj.setRequestType("Address Request");
									

						iflCustomerService.saveHistoryDetails(qrcHistoryObj);
							
						
					map.put("success",
							"Permanent Address change done.Please select upload now/check pickup/branch visit.");
					map.put("type", "change");

				}else{
					
					map.put("error",
							"You have not change address details");
				}
				}
		//	}

			response.getWriter().write(JsonHelper.toJson(map));

			System.out.println(JsonHelper.toJson(map));
		} catch (Exception e) {

		}*/
	

	@ResourceMapping("getContactDetails")
	public void getContactDetails(ResourceRequest request,
			ResourceResponse response) {
		CustomerService customerService=new CustomerService();
		try {
			String custId = request.getParameter("custId");
			//Customer customer = CustomerLocalServiceUtil.getCustomer(Integer.parseInt(custId));
			CustomerBean customerBean=new CustomerBean();
			
			customerBean=iflCustomerService.getContactDetailsByCustomerId(Integer.parseInt(custId));
			/*customerBean.setEmail(customer.getCUSTOMER_EMAIL_ADDR());
			customerBean.setOfcPhone(customer.getPHONE_NUMBER_2());
			customerBean.setResPhone(customer.getPHONE_NUMBER_3());
			customerBean.setMobile(customer.getPHONE_NUMBER_1());
			List<customerMailIds> customerMailIds=customerService.getMailIdsById(Integer.parseInt(custId));
			List<CustomerMobileNumbers> mobileNumbers=customerService.getMobileNumbersById(Integer.parseInt(custId));
			
			List<CustomerMailBean> beanList=new ArrayList<CustomerMailBean>();
			if(customerMailIds !=null && customerMailIds.size() >0){
				
				for(customerMailIds mailIds:customerMailIds){
					CustomerMailBean bean=new CustomerMailBean();
					bean.setCustId(custId);
					bean.setEmail(mailIds.getEMAIL_ID());
					beanList.add(bean);
				}
				customerBean.setMailList(beanList);
			}
			
			List<CustomerMailBean> mobileList=new ArrayList<CustomerMailBean>();
			if(mobileNumbers !=null && mobileNumbers.size() >0){
				
				for(CustomerMobileNumbers mobileNums:mobileNumbers){
					CustomerMailBean bean=new CustomerMailBean();
					bean.setCustId(custId);
					bean.setMobile(mobileNums.getMOBILE_NUMBER());
					mobileList.add(bean);
				}
				customerBean.setMobileList(mobileList);
			}*/
			response.getWriter().write(JsonHelper.toJson(customerBean));
			System.out.println(JsonHelper.toJson(customerBean));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getContctDetails() : "
							+ e.getMessage(), e);
		}
	}

	@ResourceMapping("getTempContactDetails")
	public void getTempContactDetails(ResourceRequest request,
			ResourceResponse response) {
		try {
			String custId = request.getParameter("custId");
			TempCustomer tempCustomer = TempCustomerLocalServiceUtil
					.getTempCustomer(Integer.parseInt(custId));
			response.getWriter().write(JsonHelper.toJson(tempCustomer));
			System.out.println("temp===" + JsonHelper.toJson(tempCustomer));
			

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getContctDetails() : "
							+ e.getMessage(), e);
		}
	}

	@ResourceMapping("getFamilyDetails")
	public void getFamilyDetails(ResourceRequest request,
			ResourceResponse response) {
		List<CustomerFamilyBean> customerFamilylist =null;
		CustomerBeanHelper beanHelper = new CustomerBeanHelper();
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			customerFamilylist=iflCustomerService.getCustomerFamilyDetails(1);
			if(customerFamilylist!=null){
				String jsonString=JsonHelper.toJson(customerFamilylist);
				//beanHelper.setCustomerFamily(customerFamilylist);
				logger.info("Family Details json String "+jsonString); 
				response.getWriter().write(JsonHelper.toJson(jsonString));
			}
			else {
				map.put("error", "Error Occured while Fetching Family Details");
				response.getWriter().write(JsonHelper.toJson(map));
			}
			
			/*String custId=request.getParameter("custId");
			CustomerService customerService = new CustomerService();
			List<CustomerFamilyDetails> customerFamilyDetails = customerService
					.getFamilymembersById(Integer.parseInt(custId));
			if(customerFamilyDetails!=null && customerFamilyDetails.size()>0){
				for (CustomerFamilyDetails customerFamily : customerFamilyDetails) {
					CustomerFamilyBean bean = new CustomerFamilyBean();
					bean.setFamilyMemberId((customerFamily.getCUSTOMER_FAMILY_ID())
							+ "");
					bean.setMemberName(customerFamily.getPERSON_NAME());
					
					FamilyRelations relations=FamilyRelationsLocalServiceUtil.getFamilyRelations(Integer.parseInt(customerFamily.getRELATION()));
					bean.setRelationId(customerFamily.getRELATION());
					bean.setRelation(relations.getRELATION_NAME());
					if (customerFamily.getDEPENDENT().equalsIgnoreCase("Y")) {
						bean.setDependent("Yes");
					} else {
						bean.setDependent("No");
					}
					bean.setAge(customerFamily.getAGE() + "");
					customerFamilylist.add(bean);
				}
			}
			beanHelper.setCustomerFamily(customerFamilylist);
			response.getWriter().write(JsonHelper.toJson(beanHelper));
			System.out.println("**************************");
			System.out.println(JsonHelper.toJson(beanHelper));*/
		} catch (Exception e) {
			logger.error("Exception in CustomerController - getFamilyDetails() : "+ e.getMessage(), e);
		} finally {
			customerFamilylist = null;
			beanHelper=null;
			map=null;
		}
	}

	@ResourceMapping("updateFamilyDetails")
	public void updateFamilyDetails(ResourceRequest request,
			ResourceResponse response) {
		String data = request.getParameter("jsonKey");
		String msg=null;
		System.out.println("---***********---" + data);
		Map<String, String> map = new HashMap<String, String>();
		try {
			
			msg=iflCustomerService.updateCustomerFamilyDetails(data, 1);
			
			if(msg.equals("success")){
				map.put(msg,"Details updated Successfully");
			
			
			
			
			
			
			
			
			/*		CustomerBeanHelper beanHelper = JsonHelper.fromJson(data,
					CustomerBeanHelper.class);

		if (beanHelper.getCustomerFamily() != null
					&& !beanHelper.getCustomerFamily().isEmpty()) {
				for (CustomerFamilyBean familyBean : beanHelper
						.getCustomerFamily()) {
					CustomerService customerService=new CustomerService();
					FamilyRelations familyRelations=customerService.getRelationIdByName(familyBean.getRelation());

					if(familyBean.getFamilyId().equals("")){
						CustomerFamilyDetails details=new CustomerFamilyDetailsImpl();
						details.setCUSTOMER_FAMILY_ID(Integer
								.parseInt(familyBean.getFamilyMemberId()));
						details.setPERSON_NAME(familyBean.getMemberName());
						details.setRELATION(familyRelations.getRELATION_ID()+"");
						details.setAGE(Integer.parseInt(familyBean.getAge()));
						details.setCUSTOMER_ID(Integer.parseInt(familyBean
								.getCustId()));
						if (familyBean.getDependent().equalsIgnoreCase("Yes"))
							details.setDEPENDENT("Y");
						else
							details.setDEPENDENT("N");

						details.setADDED_BY(familyBean.getCustId());
						details.setADDED_DATE(new Date());
						CustomerFamilyDetailsLocalServiceUtil
								.addCustomerFamilyDetails(details);
					}else{
					CustomerFamilyDetails familyDetails = CustomerFamilyDetailsLocalServiceUtil
							.getCustomerFamilyDetails(Integer
									.parseInt(familyBean.getFamilyId()));
					familyDetails.setCUSTOMER_FAMILY_ID(Integer
							.parseInt(familyBean.getFamilyId()));
					familyDetails.setPERSON_NAME(familyBean.getMemberName());
					familyDetails.setRELATION(familyRelations.getRELATION_ID()+"");
					familyDetails.setAGE(Integer.parseInt(familyBean.getAge()));
					familyDetails.setCUSTOMER_ID(Integer.parseInt(familyBean
							.getCustId()));
					if (familyBean.getDependent().equalsIgnoreCase("Yes"))
						familyDetails.setDEPENDENT("Y");
					else
						familyDetails.setDEPENDENT("N");

					familyDetails.setUPDATED_BY(familyBean.getCustId());
					familyDetails.setUPDATED_DATE(new Date());
					CustomerFamilyDetailsLocalServiceUtil
							.updateCustomerFamilyDetails(familyDetails);
					
					}
					map.put("success", "Family Details Updated Successfully");
				}
			*/} else {
				map.put("error", "Error Occured while updating Family Details");
			}
			response.getWriter().write(JsonHelper.toJson(map));
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			map = null;
		}

	}

	@ResourceMapping("getAllBranches")
	public void getAllBranches(ResourceRequest request,
			ResourceResponse response) {
		List<BranchDetails> branchDetails = new ArrayList<BranchDetails>();
		try {
			branchDetails =iflCustomerService.getAllBranches();

			response.getWriter().write(JsonHelper.toJson(branchDetails));

		} catch (Exception e) {
			logger.error("Exception in CustomerController - getBranchs() : "
					+ e.getMessage(), e);
		} finally {
			branchDetails = null;
		}
	}

	@ResourceMapping("getBranchDetails")
	public void getBranchDetails(ResourceRequest request,
			ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BranchDetails branchDetails = BranchDetailsLocalServiceUtil
					.getBranchDetails(1);

			LocationDetails locationDetails = LocationDetailsLocalServiceUtil
					.getLocationDetails(branchDetails.getLOCATION_ID());

			map.put("branchId", branchDetails.getBRANCH_ID());
			map.put("branchName", branchDetails.getBRANCH_NAME());
			map.put("openingTime", branchDetails.getBRANCH_OPENING_TIME());
			map.put("closingTime", branchDetails.getBRANCH_CLOSING_TIME());
			map.put("address1", branchDetails.getADDRESS_FIRST_LINE());
			map.put("address2", branchDetails.getADDRESS_SECOND_LINE());
			map.put("city", branchDetails.getCITY());
			map.put("state", branchDetails.getSTATE());
			map.put("pin", branchDetails.getPIN());
			map.put("primaryContact", branchDetails.getPRIMARY_CONTACT_NO());
			map.put("otherContact", branchDetails.getOTHER_CONTACT_NO());
			map.put("fax", branchDetails.getFAX_NUMBER());
			map.put("branchCode", branchDetails.getBRANCH_CODE());
			map.put("timings", branchDetails.getWORK_TIMINGS());

			response.getWriter().write(JsonHelper.toJson(map));
			System.out.println(JsonHelper.toJson(map));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getBranchDetails() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("getBranchDetailsByCode")
	public void getBranchDetailsByCode(ResourceRequest request,
			ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			// CustomerService customerService = new CustomerService();
			String branchId = request.getParameter("branchCode");
			BranchDetails branchDetails = null;
			try {
				/*
				 * branchDetails = customerService
				 * .getBranchDetailsByCode(branchCode);
				 */
				branchDetails = BranchDetailsLocalServiceUtil
						.getBranchDetails(Integer.parseInt(branchId));
			} catch (Exception e) {
				branchDetails = null;
			}
			if (branchDetails != null) {
				LocationDetails locationDetails = null;
				try {
					locationDetails = LocationDetailsLocalServiceUtil
							.getLocationDetails(branchDetails.getLOCATION_ID());
				} catch (Exception e) {
					locationDetails = null;
				}
				if (locationDetails != null) {
					CityDetails cityDetails = CityDetailsLocalServiceUtil
							.getCityDetails(locationDetails.getCITY_ID());
					StateDetails stateDetails = StateDetailsLocalServiceUtil
							.getStateDetails(locationDetails.getSTATE_ID());

					map.put("city", cityDetails.getCITY_NAME());
					map.put("state", stateDetails.getSTATE_NAME());
				}
				map.put("branchId", branchDetails.getBRANCH_ID());
				map.put("branchName", branchDetails.getBRANCH_NAME());
				map.put("openingTime", branchDetails.getBRANCH_OPENING_TIME());
				map.put("closingTime", branchDetails.getBRANCH_CLOSING_TIME());
				map.put("address1", branchDetails.getADDRESS_FIRST_LINE());
				map.put("address2", branchDetails.getADDRESS_SECOND_LINE());

				map.put("pin", branchDetails.getPIN());
				map.put("primaryContact", branchDetails.getPRIMARY_CONTACT_NO());
				map.put("otherContact", branchDetails.getOTHER_CONTACT_NO());
				map.put("fax", branchDetails.getFAX_NUMBER());
				map.put("branchCode", branchDetails.getBRANCH_CODE());
				map.put("timings", branchDetails.getWORK_TIMINGS());
			} else {
				map.put("error", "Branch details not found");
			}
			response.getWriter().write(JsonHelper.toJson(map));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getBranchDetailsByCode() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	/*
	 * @ResourceMapping("updateContactDetails") public void
	 * updateContactDetails(ResourceRequest request, ResourceResponse response,
	 * Model model) { Map<String, Object> map = new HashMap<String, Object>();
	 * Customer customer = null; try { customer =
	 * CustomerLocalServiceUtil.getCustomer
	 * (Integer.parseInt(request.getParameter("custId"))); CustomerOtp
	 * customerOtp = new CustomerOtpImpl();
	 * 
	 * customerOtp.setCUSTOMER_ID(1); String otp = ServiceUtils.randomOTP();
	 * 
	 * customer.setCUSTOMER_EMAIL_ADDR("madhu.abaka@gmail.com");
	 * customerOtp.setEMAIL_OTP(otp);
	 * 
	 * customerOtp.setID(1);
	 * CustomerOtpLocalServiceUtil.addCustomerOtp(customerOtp);
	 * 
	 * CustomerOtpLocalServiceUtil.updateCustomerOtp(customerOtp);
	 * 
	 * MailMessage mailMessage = new MailMessage(); mailMessage.setTo(new
	 * InternetAddress("madhu.abaka@gmail.com")); mailMessage.setFrom(new
	 * InternetAddress("madhu.abaka@gmail.com"));
	 * mailMessage.setBody("Your OTP password is " + otp);
	 * mailMessage.setSubject("OTP password");
	 * MailServiceUtil.sendEmail(mailMessage); map.put("success",
	 * "Please Enter OTP ");
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } finally { map = null; } }
	 */

	@SuppressWarnings("unchecked")
	@ResourceMapping("otpCheck")
	public void otpCheck(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse, Model model) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			int custId=Integer.parseInt(resourceRequest.getParameter("custId"));
			String otp=resourceRequest.getParameter("otp");
			map=iflCustomerService.otpCheck(otp, custId);
			
				map.put("mail", resourceRequest.getParameter("custEmail"));
				map.put("mobile", resourceRequest.getParameter("custMobile"));
				
			
			resourceResponse.getWriter().write(JsonHelper.toJson(map));
			System.out.println(JsonHelper.toJson(map));
		} catch (Exception e) {

		} finally {
			map = null;
		}
	}

	@ResourceMapping("getDocumentNames")
	public void getDocumentNames(ResourceRequest request,
			ResourceResponse response, Model model) {

		Map<String, Object> map = new HashMap<String, Object>();
		try {

			List<ProofDocs> proofDocs = ProofDocsLocalServiceUtil
					.getProofDocses(0,
							ProofDocsLocalServiceUtil.getProofDocsesCount());
			map.put("docid", proofDocs.get(0).getID());
			map.put("docName", proofDocs.get(0).getDOC_NAME());
			response.getWriter().write(JsonHelper.toJson(map));
			System.out.println(JsonHelper.toJson(map));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getDocumentNames() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("updateContactDetails")
	public void updateContactDetails(ResourceRequest request,
			ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		String data = request.getParameter("jsonKey");
		System.out.println(data + "*****************");
		CustomerBean customerBean = JsonHelper.fromJson(data,
				CustomerBean.class);
		try {
			int custId=Integer.parseInt(customerBean.getCustId());
			CustomerService customerService=new CustomerService();
			
			CustomerBean customer=iflCustomerService.getContactDetailsByCustomerId(custId);
			
			boolean flag=true;
				if(customer.getEmail().equals(customerBean.getEmail()) && customer.getMobile().equals(customerBean.getMobile()) && 
						customer.getOfcPhone().equals(customerBean.getOfcPhone()) && customer.getResPhone().equals(customerBean.getResPhone())){
					
						flag=false;
				}

		if(flag){
			if (customer.getEmail().equals(customerBean.getEmail())	&& customer.getMobile().equals(customerBean.getMobile())) {
				
				iflCustomerService.updateContactDetails(customerBean);
				
				map.put("success", "Details updated successfully");
			} else {

				String otp = ServiceUtils.randomOTP();

				try {
					iflCustomerService.otpCreate(otp, custId);
					
					MailMessage mailMessage = new MailMessage();
					mailMessage.setTo(new InternetAddress(customerBean
							.getEmail()));
					mailMessage.setFrom(new InternetAddress(
							"madhu.abaka@gmail.com"));
					mailMessage.setBody("Your OTP password is " + otp);
					mailMessage.setSubject("OTP password");
					MailServiceUtil.sendEmail(mailMessage);
					map.put("otp", true);
					map.put("success", "OTP sent to your E-Mail.");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
}else{
	
	map.put("error", "You have not change contact details.");
}
			response.getWriter().write(JsonHelper.toJson(map));
			System.out.println(JsonHelper.toJson(map));
		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - updateContactDetails() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("getPersonalDetailsFromTemp")
	public void getPersonalDetailsFromTemp(ResourceRequest request,
			ResourceResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			String historyId=request.getParameter("historyId");
			
			CustomerVO   qrcHistoryObj=new CustomerVO();
			if(historyId!=null && !historyId.isEmpty()){
			
	
			  qrcHistoryObj=iflCustomerService.getHistoryDetails(Integer.parseInt(historyId));
			}
			
			response.getWriter().write(JsonHelper.toJson(qrcHistoryObj));
			System.out.println("qrcHistoryObj======================="+JsonHelper.toJson(qrcHistoryObj));
		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getPersonalDetailsFromTemp() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("saveBranchDetails")
	public void getAddressChangeReq(ResourceRequest request,
			ResourceResponse response) {
		String data = request.getParameter("jsonKey");
		System.out.println("----------data---------------" + data);
		TypeToken<Map<String, String>> serviceToken = new TypeToken<Map<String, String>>() {
		};
		Gson gson = new Gson();
		Map<String, String> map = gson.fromJson(data, serviceToken.getType());

		try {
			AddressChangeReqDetails addressChangeReqDetails = new AddressChangeReqDetailsImpl();
			addressChangeReqDetails.setADDR_CHANGE_DETAILS_ID(1);
			addressChangeReqDetails.setCUSTOMER_ID(Integer.parseInt(map
					.get("custId")));
			addressChangeReqDetails.setREQUEST_SUBMIT_TYPE(map
					.get("reqSubType"));
			addressChangeReqDetails.setSUB_TYPE(Integer.parseInt(map
					.get("subType")));
			addressChangeReqDetails.setSUBMIT_AT_BRANCH(Integer.parseInt(map
					.get("submitBranch")));
			addressChangeReqDetails.setADDRESS_TYPE_ID(Integer.parseInt(map
					.get("addrTypeId")));
			// addressChangeReqDetails.setPICKUP_TIME(map.get("pickupTime"));
			// addressChangeReqDetails.setPICKUP_DATE(map.get("pickupDate"));
			addressChangeReqDetails.setSERVICE_REQUEST_ID(Integer.parseInt(map
					.get("serviceReqId")));

			AddressChangeReqDetailsLocalServiceUtil
					.addAddressChangeReqDetails(addressChangeReqDetails);
			response.getWriter().write(
					JsonHelper.toJson(addressChangeReqDetails));
			System.out.println(JsonHelper.toJson(addressChangeReqDetails));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getPersonalDetails() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("savePickUpDetails")
	public void savePickUpDetails(ResourceRequest request,
			ResourceResponse response) {
		String data = request.getParameter("jsonKey");

		TypeToken<Map<String, String>> serviceToken = new TypeToken<Map<String, String>>() {
		};
		Gson gson = new Gson();
		Map<String, String> map = gson.fromJson(data, serviceToken.getType());
		Map<String, Object> resultMap = new HashMap<String, Object>();

		String addrTypeId = map.get("addrTypeId");
		try {
			AddressChangeReqDetails addressChangeReqDetails = new AddressChangeReqDetailsImpl();
			// addressChangeReqDetails.setADDR_CHANGE_DETAILS_ID(1);
			addressChangeReqDetails.setCUSTOMER_ID(Integer.parseInt(map
					.get("custId")));
			addressChangeReqDetails.setREQUEST_SUBMIT_TYPE(map
					.get("reqSubType"));
			if (map.get("reqSubType").equals("pickup")) {
				if (addrTypeId.equalsIgnoreCase("4")) {
					saveNewAddress(data);
				}

				addressChangeReqDetails.setPICKUP_TIME(map.get("pickupTime"));
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				Date date = formatter.parse(map.get("pickupDate"));
				addressChangeReqDetails.setPICKUP_DATE(date);
				addressChangeReqDetails.setADDRESS_TYPE_ID(Integer.parseInt(map
						.get("addrTypeId")));
			} else if (map.get("reqSubType").equals("branchvisit")) {
				addressChangeReqDetails.setSUBMIT_AT_BRANCH(Integer
						.parseInt(map.get("branchId")));
			}
			CustomerService customerService = new CustomerService();
			QRCSubTypeMaster addressType = customerService
					.getQRCSubTypeMasterDetails(map.get("subType"));

			addressChangeReqDetails.setSUB_TYPE(addressType
					.getQRC_SUB_TYPE_ID());

			addressChangeReqDetails.setINSERTED_BY("1");
			addressChangeReqDetails.setINSERTED_DATE(new Date());

			// addressChangeReqDetails.setSERVICE_REQUEST_ID(Integer.parseInt(map
			// .get("serviceReqId")));
			AddressChangeReqDetailsLocalServiceUtil
					.addAddressChangeReqDetails(addressChangeReqDetails);
			resultMap.put("success", "Details added.");
			response.getWriter().write(JsonHelper.toJson(resultMap));
			System.out.println(JsonHelper.toJson(resultMap));

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getPersonalDetails() : "
							+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}

	@ResourceMapping("confirmRequest")
	public void confirmRequest(ResourceRequest request,
			ResourceResponse response, Model model) {

		CustomerService customerService = new CustomerService();
		Map<String, Object> map = new HashMap<String, Object>();
		String custId = request.getParameter("custId");
		String subType = request.getParameter("subType");
		String comments = request.getParameter("comments");
		String approvalStatus = request.getParameter("approvalStatus");
		String signflag = request.getParameter("signflag");
		String historyId = request.getParameter("historyId");
		if (subType.equals("contact")) {
			Customer customer = null;
			try {
				customer = CustomerLocalServiceUtil.getCustomer(Integer
						.parseInt(custId));

				CustomerOtp customerOtp = null;
				customerOtp = CustomerOtpLocalServiceUtil
						.getCustomerOtp(customer.getCUSTOMER_ID());

				TempCustomer customerTemp = TempCustomerLocalServiceUtil
						.getTempCustomer(Integer.parseInt(custId));

				customer.setCUSTOMER_EMAIL_ADDR(customerTemp
						.getCUSTOMER_EMAIL_ADDR());
				customer.setPHONE_NUMBER_1(customerTemp.getPHONE_NUMBER_1());
				customer.setPHONE_NUMBER_2(customerTemp.getPHONE_NUMBER_2());
				customer.setPHONE_NUMBER_3(customerTemp.getPHONE_NUMBER_3());

				customer = CustomerLocalServiceUtil.updateCustomer(customer);

				customerOtp.setSTATUS("N");
				CustomerOtpLocalServiceUtil.updateCustomerOtp(customerOtp);

				MailMessage mailMessage = new MailMessage();
				mailMessage.setTo(new InternetAddress("madhu.abaka@gmail.com"));
				mailMessage
						.setFrom(new InternetAddress("madhu.abaka@gmail.com"));
				mailMessage.setBody("Your Email change suucessfully");
				mailMessage.setSubject("Email Change Success");
				MailServiceUtil.sendEmail(mailMessage);

				map.put("success", "Details Updated Successfully");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			
			try {
				/*
				SRMgmt srMgmt = new SRMgmt();
				
				if (subType.equals("personal")) {
					subType = "Name Change";
				} else if (subType.equals("permanent")) {
					subType = "Address Change";
				} else if (subType.equals("communication")) {
					subType = "Address Change";
				} else if (subType.equals("occupation")) {
					subType = "Address Change";
				}
				else if (subType.equals("personaldob")) {
					subType = "Dob Change";
				}
				else if (subType.equals("personalgender")) {
					subType = "Gender Change";
				}
				else if (subType.equals("personalpan")) {
					subType = "Pancard Change";
				}
				
				QRCSubTypeMaster qrcDetails = customerService
						.getQRCSubTypeMasterDetails(subType);

				ActiveServiceRequests serviceRequest = new ActiveServiceRequestsImpl();
				serviceRequest.setTYPE_ID(1);
				serviceRequest.setSUB_TYPE_ID(qrcDetails.getQRC_SUB_TYPE_ID());
				serviceRequest.setSTATUS_ID(1);
				serviceRequest.setASSIGNED_TO(1);
				serviceRequest.setHANDLED_BY(1);
				serviceRequest.setCUSTOMER_ID(Integer.parseInt(custId));
				serviceRequest.setUPDATED_DATE(new Date());
				String srNo = srMgmt.createSR(serviceRequest);
				ActiveServiceRequests activeRequest = ActiveServiceRequestsLocalServiceUtil
						.addActiveServiceRequests(serviceRequest);

				ConfirmDetails confirmDetails = new ConfirmDetailsImpl();

				confirmDetails.setComments(comments);

				confirmDetails.setQRC_ASR_ID(activeRequest.getQRC_ASR_ID());

				confirmDetails.setSign_Flag(signflag);
				confirmDetails.setApproval_Status(approvalStatus);
				confirmDetails.setCreatedBy(custId);
				confirmDetails.setCreatedDate(new Date());

				ConfirmDetailsLocalServiceUtil
						.addConfirmDetails(confirmDetails);*/

				QrcTrnHistory  qrcTrnHistoryObj=QrcTrnHistoryLocalServiceUtil.getQrcTrnHistory(Integer.parseInt(historyId));
				
				
				
				QrcTrnServiceRequests qrcServiceReqObj=QrcTrnServiceRequestsLocalServiceUtil.createQrcTrnServiceRequests(0);
				
				
				qrcServiceReqObj.setHistoryId(qrcTrnHistoryObj.getHistoryId());
				qrcServiceReqObj.setAddressTypeId(qrcTrnHistoryObj.getAddressTypeId());
			//	qrcServiceReqObj.setAssignedTo(commonModelObj.geta);  //Need Clarification details
				qrcServiceReqObj.setCaseDetails("");//Need Case details
				qrcServiceReqObj.setChannel("");//Need channel Details
				
				qrcServiceReqObj.setComments(comments);
				qrcServiceReqObj.setContactId(qrcTrnHistoryObj.getContactId());
				qrcServiceReqObj.setCreatedBy(qrcTrnHistoryObj.getCreatedBy());
				
				qrcServiceReqObj.setCreatedContactId(qrcTrnHistoryObj.getCreatedContactId());
				
				qrcServiceReqObj.setCreatedDate(new Date());
				qrcServiceReqObj.setIsActive(1);
				//qrcServiceReqObj.setIsLAUpdated(commonModelObj.getI);
				
			//	qrcServiceReqObj.setIsManual(commonModelObj.getIsManual());  //Need clarification isManual
				
				qrcServiceReqObj.setIsSignVerified(signflag);
				
				//qrcServiceReqObj.setPolicyNo(commonModelObj.getPolicyNo());  //get Policy Number of Incase corporate or communication
				qrcServiceReqObj.setRequestId(1);
				
			//	qrcServiceReqObj.setSource(commonModelObj.getSource());
				
				 SimpleDateFormat dateFormat = new SimpleDateFormat("YYMMddHHmmss");
	
					Date date = new Date();
	
					String srNumber = "SR" + dateFormat.format(date);	
					
				    qrcServiceReqObj.setSrId(srNumber);
				    try{
				    	QrcTrnServiceRequests qrcServiceObj=QrcTrnServiceRequestsLocalServiceUtil.updateQrcTrnServiceRequests(qrcServiceReqObj);				
				if(qrcServiceObj!=null){
					if(qrcServiceObj.getServiceRequestId()!=0){
				    response.getWriter().write(JsonHelper.toJson(srNumber));
					}
				}
				    }catch(Exception e){
				    	
				    }

				System.out.println(JsonHelper.toJson(map));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

	@ResourceMapping("getDocsByName")
	public void getDocsByName(ResourceRequest request,
			ResourceResponse response, Model model) {
		CustomerService customerService = new CustomerService();
		String docName = request.getParameter("docName");
		List<ProofDocs> proofDocs = null;
		try {
			proofDocs = customerService.getDocsByName(docName);

			response.getWriter().write(JsonHelper.toJson(proofDocs));

			System.out.println(JsonHelper.toJson(proofDocs));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@ResourceMapping("getAddressByAddressType")
	public void getAddressByAddressType(ResourceRequest request,
			ResourceResponse response, Model model) {

		Map<String, Object> map = new HashMap<String, Object>();
		CustomerService customerService = new CustomerService();
		try {
			String custId = request.getParameter("custId");
			String addressType = request.getParameter("addressType");
			if (custId != null && addressType != null) {

				customerAddress address = customerService
						.getCustomerAddress(Integer.parseInt(custId),
								Integer.parseInt(addressType));

				response.getWriter().write(JsonHelper.toJson(address));

				System.out.println(JsonHelper.toJson(address));
			} else {
				map.put("error",
						"Error occured while getting the Address details.");
				response.getWriter().write(JsonHelper.toJson(map));
			}

		} catch (SystemException e) {
			logger.error(
					"Exception in CustomerController - getAddressByAddressType() : "
							+ e.getMessage(), e);
		} catch (IOException e) {
			logger.error(
					"Exception in CustomerController - getAddressByAddressType() : "
							+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getAddressByAddressType() : "
							+ e.getMessage(), e);
		}

	}

	@RenderMapping(params = "action=previewPhoto")
	public ModelAndView previewPhoto(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) throws Exception {

		logger.info("in Preview Photo Action ");
		try {

			String custId = renderRequest.getParameter("cust");
			String docId = renderRequest.getParameter("PickupSelDocType");
			String docType = renderRequest.getParameter("doctype");
			String fileName = "";
			if (custId != null && docId != null && docType != null)
				fileName = docType + "_" + custId + "_" + docId;

			File newFolder = null;
			newFolder = new File(renderRequest.getPortletSession()
					.getPortletContext().getRealPath("/")
					+ "//" + "uploaddocs");
			if (!newFolder.exists()) {
				newFolder.mkdir();
			}
			// newFile = new File(newFolder+"//" +""+fileName+"."+ext);

			File fileImage = new File(newFolder + "//" + "" + fileName + ".png");
			if (fileImage.exists() && !fileImage.isDirectory()) {
				BufferedImage image = ImageIO.read(fileImage);// for getting
																// images
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(image, "png", baos);
				String encodedImage = Base64.encode(baos.toByteArray());
				model.addAttribute("imgencode", encodedImage);
			}
			File filePdf = new File(newFolder + "//" + "" + fileName + ".pdf");
			if (filePdf.exists() && !filePdf.isDirectory()) {
				String path = filePdf.getPath();
				model.addAttribute("path", renderRequest.getContextPath()
						+ File.separator + "uploaddocs" + File.separator
						+ fileName + ".pdf");
			}

		} catch (Exception e) {

		}

		return new ModelAndView("common");

	}

	@ResourceMapping("getTempPermanentAddress")
	public void getTempPermanentAddress(ResourceRequest request,
			ResourceResponse response, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		CustomerService customerService = new CustomerService();
		try {
              String historyId=request.getParameter("historyId");
			
			CustomerVO   qrcHistoryObj=new CustomerVO();
			if(historyId!=null && !historyId.isEmpty()){
			
	
			  qrcHistoryObj=iflCustomerService.getHistoryDetails(Integer.parseInt(historyId));
			
			
			response.getWriter().write(JsonHelper.toJson(qrcHistoryObj));
			/*String custId = request.getParameter("custId");
			String address = request.getParameter("addressType");
			if (custId != null && address != null) {
				AddressType addressType = customerService
						.getIdByAddressTypeName(address);
				TempCustomerAddress tempCustomerDetails = customerService
						.getTempCustomerAddress(Integer.parseInt(custId),
								addressType.getADDRESS_TYPE_ID());
				response.getWriter().write(
						JsonHelper.toJson(tempCustomerDetails));

				System.out.println(JsonHelper.toJson(tempCustomerDetails));*/
			} else {
				map.put("error",
						"Error occured while getting the New Permanent details.");
				response.getWriter().write(JsonHelper.toJson(map));
			}
		} catch (IOException e) {
			logger.error(
					"Exception in CustomerController - getTempPermanentAddress() : "
							+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getTempPermanentAddress() : "
							+ e.getMessage(), e);
		}

	}

	@ResourceMapping("getTempOfficeAddress")
	public void getTempOfficeAddress(ResourceRequest request,
			ResourceResponse response, Model model) {

		try {
			  String historyId=request.getParameter("historyId");
				
				CustomerVO   qrcHistoryObj=new CustomerVO();
				if(historyId!=null && !historyId.isEmpty()){
				
		
				  qrcHistoryObj=iflCustomerService.getHistoryDetails(Integer.parseInt(historyId)); 
				  
				
			}
			response.getWriter().write(JsonHelper.toJson(qrcHistoryObj));
			

		} catch (Exception e) {
			logger.error(
					"Exception in CustomerController - getOfficeAddress() : "
							+ e.getMessage(), e);
		}

	}

	public void saveNewAddress(String data) {
		TypeToken<Map<String, String>> serviceToken = new TypeToken<Map<String, String>>() {
		};
		Gson gson = new Gson();
		Map<String, String> map = gson.fromJson(data, serviceToken.getType());
		CustomerService customerService = new CustomerService();
		try {
			int custId = Integer.parseInt(map.get("custId"));
			int addressTypeId = Integer.parseInt(map.get("addrTypeId"));
			String cityId = map.get("cityId");
			String stateId = map.get("stateId");
			customerAddress customerAddress = null;
			try {
				customerAddress = customerService.getCustomerAddress(custId,
						addressTypeId);
			} catch (Exception e) {
				customerAddress = null;
			}
			if (customerAddress != null) {
				customerAddress.setPIN_CODE(map.get("pin"));
				if (cityId != null && stateId != null) {
					customerAddress.setCITY_ID(Integer.parseInt(cityId));
					customerAddress.setSTATE_ID(Integer.parseInt(stateId));
					customerAddress.setCITY(map.get("city"));
					customerAddress.setSTATE(map.get("state"));
				}
				customerAddress.setADDRESS_LINE_1(map.get("addr1"));
				customerAddress.setADDRESS_LINE_2(map.get("addr2"));
				customerAddress.setADDRESS_LINE_3(map.get("addr3"));
				customerAddress.setUPDATED_BY(map.get("custId"));
				customerAddress.setUPDATED_DATE(new Date());
				customerAddress address = customerAddressLocalServiceUtil
						.updatecustomerAddress(customerAddress);
			} else {
				customerAddress newaddress = new customerAddressImpl();
				newaddress.setCUSTOMER_ID(custId);
				newaddress.setADDRESS_TYPE_ID(addressTypeId);
				newaddress.setPIN_CODE(map.get("pin"));
				if (cityId != null && stateId != null) {
					newaddress.setCITY_ID(Integer.parseInt(cityId));
					newaddress.setSTATE_ID(Integer.parseInt(stateId));
					newaddress.setCITY(map.get("city"));
					newaddress.setSTATE(map.get("state"));
				}
				newaddress.setADDRESS_LINE_1(map.get("addr1"));
				newaddress.setADDRESS_LINE_2(map.get("addr2"));
				newaddress.setADDRESS_LINE_3(map.get("addr3"));
				newaddress.setADDR_STATUS("Y");
				newaddress.setINSERTED_BY(map.get("custId"));
				newaddress.setINSERTED_DATE(new Date());
				customerAddress address = customerAddressLocalServiceUtil
						.addcustomerAddress(newaddress);

			}
			// map=null;
			map.put("success", "New Address Added done.");

			System.out.println(JsonHelper.toJson(map));
		} catch (Exception e) {

		}
	}

	@ResourceMapping("getUpadtedDateTime")
	public void getUpadtedDateTime(ResourceRequest request,
			ResourceResponse response, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		String custId = request.getParameter("custId");
		try {
			if (custId != null) {
				CustomerService service = new CustomerService();

				Customer customer = CustomerLocalServiceUtil
						.getCustomer(Integer.parseInt(custId));
				Date dateFromAddressDetails = service
						.getDateTimeFromAddress(Integer.parseInt(custId));
				Date dateFromFamilyDetails = service
						.getDateTimeFromFamily(Integer.parseInt(custId));

				int datecompare = customer.getUPDATED_DATE().compareTo(
						dateFromAddressDetails);
				int datecompare2 = customer.getUPDATED_DATE().compareTo(
						dateFromFamilyDetails);
				int datecompare3 = dateFromAddressDetails
						.compareTo(dateFromFamilyDetails);
				SimpleDateFormat format = new SimpleDateFormat(
						"dd MMMM, yyyy : HH:mm");
				String strDate1 = format.format(customer.getUPDATED_DATE());
				String strDate2 = format.format(dateFromAddressDetails);
				String strDate3 = format.format(dateFromFamilyDetails);
				if (datecompare == 1) {
					if (datecompare2 == 1)
						map.put("date", strDate1);
					else
						map.put("date", strDate3);
				} else {
					if (datecompare3 == 1)
						map.put("date", strDate2);
					else
						map.put("date", strDate3);
				}
				response.getWriter().write(JsonHelper.toJson(map));
				System.out.println(JsonHelper.toJson(map));
			}

		} catch (Exception e) {
			logger.error("Exception in CustomerController - getUpadtedDateTime() : "+ e.getMessage(), e);
		} finally {
			map = null;
		}
	}
	
	@ResourceMapping("getRelationDetails")
	public void getRelationDetails(ResourceRequest request,ResourceResponse response) {
		
		List<FamilyRelations> relationsList = null;
		Map<String, String> map = new HashMap<String, String>();
		
		try{
			
			relationsList=iflCustomerService.getAllFamilyRelations();
			if(relationsList!=null){
				
				response.getWriter().write(JsonHelper.toJson(relationsList));
				logger.info("Relations List Json String : "+JsonHelper.toJson(relationsList));
			}
			else{
				
				map.put("error", "No Family Relations Found");
				response.getWriter().write(JsonHelper.toJson(map));
			}
			
		}catch (Exception e) {
			
			logger.error("Exception in CustomerController - getRelationDetails() : "+ e.getMessage(), e);
			
		} finally {
			relationsList = null;
			map=null;
		}
		
		/*int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		List<FamilyRelations> relationsList = null;
		try {
			relationsList = FamilyRelationsLocalServiceUtil.getFamilyRelationses(range, range);
			for(FamilyRelations f:relationsList){
			}

			response.getWriter().write(JsonHelper.toJson(relationsList));

			System.out.println(JsonHelper.toJson(relationsList));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	@RenderMapping(params = "action=customerDetails")
	public String customerDetails(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		
		String policyId = renderRequest.getParameter("policyId");
		String name = renderRequest.getParameter("cname");
		String mobileNum = renderRequest.getParameter("mobileNum");
		String emailId = renderRequest.getParameter("emailId");

		if(policyId!=null){
		
		ServiceUtils serviceutil = new ServiceUtils();
		
		List<PolicyInfo> policyCustId =serviceutil.getPolicyInfo(policyId);
		
		List<Customer> custList =null;
		
		for(PolicyInfo pidList:policyCustId){
			int cid=pidList.getCUSTOMER_ID();
			custList = serviceutil.getCustomerDetails(cid);
				
			    model.addAttribute("policyList",pidList);
		
		}
		}
		return "customerDetails";
	}
	
	
	@ResourceMapping("getCommunicationDetailsByPolicyId")
	public void getCommunicationDetailsByPolicyId(ResourceRequest request,ResourceResponse response) {
		logger.info(" == getCommunicationDetailsByPolicyId ==");
		
		String policyId=request.getParameter("policyId").trim();
		logger.info(" == PolicyId =="+policyId);
		Map<String, Object> map = new HashMap<String, Object>();
		
		try{
		
			if(policyId!=null){
				
				CRM_Trn_PolicyAddress  pa=CRM_Trn_PolicyAddressLocalServiceUtil.findByPolicyNo(policyId);	
				
				CRM_Trn_Address communicationAddress=CRM_Trn_AddressLocalServiceUtil.getCRM_Trn_Address(pa.getAddressId());
				
				
				response.getWriter().write(JsonHelper.toJson(pa));	
				
			}else{
				
				map.put("error","Error occured while getting the New Permanent details.");
				response.getWriter().write(JsonHelper.toJson(map));
			}
		} catch (SystemException e) {
			logger.error("Exception in CustomerController - getCommunicationDetailsByPolicyId() : "+ e.getMessage(), e);
		} catch (IOException e) {
			logger.error("Exception in CustomerController - getCommunicationDetailsByPolicyId() : "+ e.getMessage(), e);
		} catch (Exception e) {
			logger.error("Exception in CustomerController - getCommunicationDetailsByPolicyId() : "+ e.getMessage(), e);
		}
	}
	
	@ResourceMapping("updateConfirmContactDetails")
	public void updateConfirmContactDetails(ResourceRequest request,ResourceResponse response) throws IOException{
		
		String data = request.getParameter("jsonkey");
		System.out.println("----------data---------------" + data);
		
		Map<String, Object> mapdetails = new HashMap<String, Object>();
		
		try {
			mapdetails=iflCustomerService.updateConfirmContactDetails(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.getWriter().write(JsonHelper.toJson(mapdetails));
		System.out.println(JsonHelper.toJson(mapdetails)+"*******************************");
	}
	
	@ResourceMapping("getCityDetails")
	public void getCityDetails(ResourceRequest request,
			ResourceResponse response, Model model) {
		logger.info("in getCityDetails method=============");
		List<City> cityDetails=iflCustomerService.getCityDetails();
		try {
			response.getWriter().write(JsonHelper.toJson(cityDetails));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	@ResourceMapping("getStateDetails")
		public void getStateDetails(ResourceRequest request, ResourceResponse response, Model model) {
		logger.info("in getStateDetails method=============");
			List<State> cityDetails=iflCustomerService.getStateDetails();
			
					try {
						response.getWriter().write(JsonHelper.toJson(cityDetails));
					} catch (IOException e) {
						e.printStackTrace();
					}
				
	}
	
	@ResourceMapping("getCityDetailsByStateId")
	public void getCityNamesByStateId(ResourceRequest request, ResourceResponse response, Model model){
		
		logger.info("in getCityDetailsByStateId=======Method========");
		
		String state = request.getParameter("state");
		List<City> cityNames = iflCustomerService.getCityNamesByStateId(Integer.parseInt(state));
		try {
			response.getWriter().write(JsonHelper.toJson(cityNames));
			System.out.println(JsonHelper.toJson(cityNames));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
