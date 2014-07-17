/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifl.rapid.customer.model.ApplyTrnApplicationForm;
import com.ifl.rapid.customer.model.ApplyTrnQuoteDetails;
import com.ifl.rapid.customer.model.ApplyTrnQuoteDetailsSoap;
import com.ifl.rapid.customer.model.QrcMstServices;
import com.ifl.rapid.customer.model.QrcMstSubServices;
import com.ifl.rapid.customer.service.ApplyTrnApplicationFormLocalServiceUtil;
import com.ifl.rapid.customer.service.ApplyTrnQuoteDetailsLocalServiceUtil;
import com.ifl.rapid.customer.service.QrcMstServicesLocalServiceUtil;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.Recommended_Products;
import com.ifli.rapid.model.ServiceMaster;
import com.ifli.rapid.model.ServiceSubMaster;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.service.Recommended_ProductsLocalServiceUtil;
import com.ifli.rapid.service.ServiceMasterLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PolicyYears;
import com.ifli.rapid.services.helper.beans.ServiceNamesBean;
import com.ifli.rapid.services.helper.beans.ServiceSubnamesBean;
import com.ifli.rapid.services.service.BaseService;
import com.ifli.rapid.services.service.CommonModel;
import com.ifli.rapid.services.service.CustomerService;
import com.ifli.rapid.services.service.RAPIDContants;
import com.ifli.rapid.services.service.RapidServiceImpl;
import com.ifli.rapid.services.util.ServiceUtils;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portlet.PortletURLUtil;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * @author Prasad Khode
 * 
 */
@Controller
@RequestMapping("VIEW")
public class PageRedirectController {

	private Log logger = LogFactoryUtil.getLog(PageRedirectController.class);

	@RenderMapping
	public ModelAndView renderPage(RenderRequest request, RenderResponse response, Model model) throws Exception {
		String reqType=request.getParameter("reqtype");
		String policyId=request.getParameter("policyId");
		String historyId=request.getParameter("historyId");
		String currentURL = PortletURLUtil.getCurrent(request, response).toString();
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		if (currentURL.contains("corporate")) {
			
			model.addAttribute("reqtype", reqType);
			model.addAttribute("policyId",policyId);
			return new ModelAndView("corporateHome"); // corporate home page
		}
		if(currentURL.contains("fundswitchactions")){
			return new ModelAndView("fundSwitch");
		}
		if(currentURL.contains("fundswitch")){
			return new ModelAndView("fundSwitchHome");
		}
		if(currentURL.contains("premiumredirectaction")){
			return new ModelAndView("premiumRedirect");
		}
		if(currentURL.contains("premiumredirect")){
			return new ModelAndView("premiumRedirectHome");
		}
		if(currentURL.contains("topupaction")){
			return new ModelAndView("topUp");
		}
		if(currentURL.contains("topup")){
			return new ModelAndView("topUpHome");
		}
		
		
		if(currentURL.contentEquals("downloadpolicyactions")){
			return new ModelAndView("userpolicy");
		}
		if(currentURL.contains("renewalnoticeaction")){
			return new ModelAndView("renewalNotice");
		}
		
		if(currentURL.contains("changeaddressaction")){
			return new ModelAndView("changeOfAddress");
		}
		
		if(currentURL.contains("myprofile")){
			logger.info(" in myprofile page  ");
			return new ModelAndView("addressChange");
		}
		
		if(currentURL.contains("toolsanddownloads")){
			logger.info(" in tools and downloads page");
			return new ModelAndView("toolsanddownloads");
		}
		if(currentURL.contains("trackerstatus")){
			System.out.println("tracker status");
			logger.info(" in tracker status page");
			return new ModelAndView("trackerStatus");
		}
		
		if(currentURL.contains("mypolicydetails")){
			
			
		Integer contactId=1;
			List<PolicyYears> policyDetailsList=new CustomerService().getPoliciesList(contactId);
			
			request.setAttribute("policyDetails", policyDetailsList);
			
			/*try{
				List<PolicyInfo> orgList = PolicyInfoLocalServiceUtil.getPolicyInfos(0, PolicyInfoLocalServiceUtil.getPolicyInfosCount());
				request.setAttribute("policyDetails", orgList);
			} catch (Exception e) {
				logger.error("Exception in PageRedirectController - mypolicyDetails() : " + e.getMessage(), e);
			}*/
			
			return new ModelAndView("policyDetails");
		}
		
		else {
			try {
				RapidServiceImpl recommendedProductList=new RapidServiceImpl();
				
				
				try{
				List<CommonModel> modelList=recommendedProductList.getRecommendedProducts();
					
				model.addAttribute("recommendedProducts", modelList);
				}catch(Exception e){
					
					
					logger.error("Due to Connection Problemm,the recommended Products will not work");
				}
				//int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
				CustomerService customerService=new CustomerService();
		/*		List<ServiceMaster> master=ServiceMasterLocalServiceUtil.getServiceMasters(range, range);
				List<ServiceNamesBean> serviceNamesBeans=new ArrayList<ServiceNamesBean>();
				if(master != null && master.size()>0){
					for(ServiceMaster serviceMaster:master){
						if(serviceMaster.getACTIVE_FLAG().equalsIgnoreCase("Y")){
						ServiceNamesBean namesBean=new ServiceNamesBean();
						namesBean.setServiceId(serviceMaster.getSERVICE_MASTER_ID());
						namesBean.setServiceName(serviceMaster.getSERVICE_MASTER_NAME());
						namesBean.setServiceDesc(serviceMaster.getSERVICE_MASTER_DESC());
						
						List<ServiceSubMaster> subMaster=customerService.getServiceSubMasterDetailsByServiceId(serviceMaster.getSERVICE_MASTER_ID());
						List<ServiceSubnamesBean> subnamesBeanlist=new ArrayList<ServiceSubnamesBean>();
						if(subMaster!=null){
							for(ServiceSubMaster serviceSubMaster:subMaster){
								ServiceSubnamesBean subnamesBean=new ServiceSubnamesBean();
								subnamesBean.setSubMasterId(serviceSubMaster.getSUBMASTER_ID());
								subnamesBean.setSubMasterName(serviceSubMaster.getSUBMASTER_NAME());
								subnamesBean.setSubMasterUrl(serviceSubMaster.getSUBMASTER_URL());
								subnamesBeanlist.add(subnamesBean);
							}
							namesBean.setServiceSubnamesBeanList(subnamesBeanlist);
						}
						
						serviceNamesBeans.add(namesBean);
						}
					}
				}*/
				
				List<QrcMstServices> master=QrcMstServicesLocalServiceUtil.getQrcMstServiceses(range, range);
				List<ServiceNamesBean> serviceNamesBeans=new ArrayList<ServiceNamesBean>();
				if(master != null && master.size()>0){
					for(QrcMstServices serviceMaster:master){
						if(serviceMaster.getIsActive().equalsIgnoreCase("1")){
						ServiceNamesBean namesBean=new ServiceNamesBean();
						namesBean.setServiceId(serviceMaster.getServiceId());
						namesBean.setServiceName(serviceMaster.getServiceName());
						namesBean.setServiceDesc(serviceMaster.getDescription());
						
						List<QrcMstSubServices> subMaster=customerService.getServiceSubMasterDetailsByServiceId(serviceMaster.getServiceId());
						List<ServiceSubnamesBean> subnamesBeanlist=new ArrayList<ServiceSubnamesBean>();
						if(subMaster!=null){
							for(QrcMstSubServices serviceSubMaster:subMaster){
								ServiceSubnamesBean subnamesBean=new ServiceSubnamesBean();
								subnamesBean.setSubMasterId(serviceSubMaster.getSubServiceId());
								subnamesBean.setSubMasterName(serviceSubMaster.getSubServiceName());
								subnamesBean.setSubMasterUrl(serviceSubMaster.getSubServiceUrl());
								subnamesBeanlist.add(subnamesBean);
							}
							namesBean.setServiceSubnamesBeanList(subnamesBeanlist);
						}
						
						serviceNamesBeans.add(namesBean);
						}
					}
				}
				
			
				
				
				
				
				model.addAttribute("serviceNames", serviceNamesBeans);
				} catch (SystemException e) {
				e.printStackTrace();
				}
			return new ModelAndView("view"); // customer home page
		}
	}

	@RenderMapping(params = "action=fundSwitchHome")
	public String fundSwitchHome(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("fundSwitchHome");
		System.out.println("*****************************");
		return "fundSwitchHome";
	}

	@RenderMapping(params = "action=fundSwitch")
	public String fundSwitch(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("fundSwitch");
		
		return "fundSwitch";
	}

	@RenderMapping(params = "action=fundSwitchTemplate")
	public String fundSwitchTemplate(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("fundSwitchTemplate");
		return "fundSwitchTemplate";
	}

	@RenderMapping(params = "action=premiumRedirectHome")
	public String premiumRedirectHome(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("premiumRedirectHome");
		return "premiumRedirectHome";
	}

	@RenderMapping(params = "action=premiumRedirect")
	public String premiumRedirect(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("premiumRedirect");
		return "premiumRedirect";
	} 
	
	@RenderMapping(params = "action=topUpHome")
	public String topUpHome(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("topUpHome");
		return "topUpHome";
	}
	
	@RenderMapping(params = "action=topUp")
	public String topUp(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("topUp");
		return "topUp";
	}
	@RenderMapping(params = "action=topUpSuccess")
	public String topUpSuccess(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("topUpSuccess");
		return "topUpSuccess";
	}
	
	
	
	@RenderMapping(params = "action=topUpPayment")
	public String topUpPayment(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("topUpPayment");
		return "topUpPayment";
	}
	
	@RenderMapping(params = "action=topupOnlinePaymentOptions")
	public String topupOnlinePaymentOptions(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("topupOnlinePaymentOptions");
		return "topupOnlinePaymentOptions";
	}
	
	@RenderMapping(params = "action=renewalNoticeHome")
	public String renewalNoticeHome(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("renewalNoticeHome");
		return "renewalNoticeHome";
	}
	
	@RenderMapping(params = "action=renewalNotice")
	public String renewalNotice(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("renewalNotice");
		return "renewalNotice";
	}
	
	@RenderMapping(params = "action=addressChangeHome")
	public String addressChangeHome(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("addressChangeHome");
		return "addressChangeHome";
	}
	
	@RenderMapping(params = "action=addressChange")
	public String addressChange(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("addressChange");
		return "addressChange";
	}
	
	@RenderMapping(params = "action=addressChangeConfirm")
	public String addressChangeConfirm(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("addressChangeConfirm");
		String historyId=renderRequest.getParameter("historyId");
		model.addAttribute("historyId",historyId);
		
		return "addressChangeConfirm";
	}
	@RenderMapping(params = "action=renewalPremiumReceiptHome")
	public String renewalPremiumReceiptHome(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("renewalPremiumReceiptHome");
		return "renewalPremiumReceiptHome";
	}
	
	@RenderMapping(params = "action=renewalPremiumReceipt")
	public String renewalPremiumReceipt(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("renewalPremiumReceipt");
		return "renewalPremiumReceipt";
	}
	
	
	@RenderMapping(params = "action=changeOfAddress")
	public String changeOfAddress(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("changeOfAddress");
		return "changeOfAddress";
	}
	
	
	@RenderMapping(params = "action=digitalSignPage")
	public String digitalSignPage(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		logger.info("digitalSignPage");
		return "digitalSign";
	}
	@RenderMapping(params="action=changeOfAddressHome")
	public String changeOfAddressHome(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
		
		return "changeOfAddressHome";
	}
	@RenderMapping(params="action=policyDetails")
	public String mypolicyDetails(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
		
		try{
			List<PolicyInfo> orgList = PolicyInfoLocalServiceUtil.getPolicyInfos(0, PolicyInfoLocalServiceUtil.getPolicyInfosCount());
			renderRequest.setAttribute("policyDetails", orgList);
		} catch (Exception e) {
			logger.error("Exception in PageRedirectController - mypolicyDetails() : " + e.getMessage(), e);
		}
		
		
		return "policyDetails";
	}
	@RenderMapping(params="action=changePersonalDetailsHome")
	public String changePersonalDetails(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
		
		return "changePersonalDetailsHome";
	}
	@RenderMapping(params="action=getRecommendedProducts")
	public String getRecommendedProducts(RenderRequest renderRequest,RenderResponse renderResponse,Model model) {
		String productId = renderRequest.getParameter("productId");
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		try {
		//	List<Recommended_Products> rcmndProducts = Recommended_ProductsLocalServiceUtil.getRecommended_Productses(range, range);
			
			RapidServiceImpl recommendProductService=new RapidServiceImpl();
			
			try{
			List<CommonModel> modelList=recommendProductService.getRecommendedProducts();
		
			model.addAttribute("recommendedProducts", modelList);
			
			
				}catch(Exception e){
					
					
					logger.error("Due to Connection Problemm,the recommended Products will not work");
				}
		} catch (Exception e) {
			logger.error("Exception in CommonController - getRecommendedProducts() : "
					+ e.getMessage(), e);
		}
		return "recomendedProducts";
	}
	@RenderMapping(params="action=getHeaderContent")
	public String getHeaderContent(RenderRequest renderRequest,RenderResponse renderResponse,Model model) throws Exception{
		try {
			String serviceId = renderRequest.getParameter("serviceId");
			String currentURL = PortletURLUtil.getCurrent(renderRequest, renderResponse).toString();
			if (currentURL.contains("mypolicydetails") || currentURL.contains("myprofile")) {
				serviceId="1";
			}else if(currentURL.contains("toolsanddownloads") ){
				serviceId="6";
			}else{
			serviceId="2";
			}
			
			int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
			CustomerService customerService=new CustomerService();
						
			
			
			
			
			
			List<QrcMstServices> master=QrcMstServicesLocalServiceUtil.getQrcMstServiceses(range, range);
			List<ServiceNamesBean> serviceNamesBeans=new ArrayList<ServiceNamesBean>();
			if(master != null && master.size()>0){
				for(QrcMstServices serviceMaster:master){
					if(serviceMaster.getIsActive().equalsIgnoreCase("1")){
					ServiceNamesBean namesBean=new ServiceNamesBean();
					namesBean.setServiceId(serviceMaster.getServiceId());
					namesBean.setServiceName(serviceMaster.getServiceName());
					namesBean.setServiceDesc(serviceMaster.getDescription());
					serviceNamesBeans.add(namesBean);
					}
				}
			}
			model.addAttribute("service", serviceNamesBeans);
			List<QrcMstSubServices> subMaster=customerService.getServiceSubMasterDetailsByServiceId(Integer.parseInt(serviceId));
			List<ServiceSubnamesBean> subnamesBeanlist=new ArrayList<ServiceSubnamesBean>();
			if(subMaster!=null){
				for(QrcMstSubServices serviceSubMaster:subMaster){
					ServiceSubnamesBean subnamesBean=new ServiceSubnamesBean();
					subnamesBean.setSubMasterId(serviceSubMaster.getSubServiceId());
					subnamesBean.setSubMasterName(serviceSubMaster.getSubServiceName());
					if(serviceSubMaster.getSubServiceUrl()!=""){
					subnamesBean.setSubMasterUrl(serviceSubMaster.getSubServiceUrl());
					}else{
						subnamesBean.setSubMasterUrl("#");
					}
					subnamesBean.setServiceId(serviceSubMaster.getServiceId());
					subnamesBeanlist.add(subnamesBean);
				}
			}
					
					
			model.addAttribute("serviceNames", subnamesBeanlist);
			
			
			
			
			} catch (SystemException e) {
			e.printStackTrace();
			}
		return "subHeaderAjax";
	}
	@RenderMapping(params="action=termsAndConditions")
	public String termsAndConditions(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
		
		return "termsandconditions";
	}
	@RenderMapping(params = "action=contactChangeConfirm")
	public String contactChangeConfirm(RenderRequest renderRequest, RenderResponse renderResponse, Model model) throws MalformedURLException {
		
		if(renderRequest.getParameter("jsonkey")!=null){
			String data = renderRequest.getParameter("jsonkey");
			System.out.println("----------data---------------" + data);
			TypeToken<Map<String, String>> serviceToken = new TypeToken<Map<String, String>>() {
			};
			Gson gson = new Gson();
			Map<String, String> map = gson.fromJson(data, serviceToken.getType());
			if(map!=null){
				model.addAttribute("customer", map);
			}
			System.out.println("map-------------------"+map);
		}
		
		logger.info("contactChangeConfirm");
		return "confirmContactDetails";
	}
}