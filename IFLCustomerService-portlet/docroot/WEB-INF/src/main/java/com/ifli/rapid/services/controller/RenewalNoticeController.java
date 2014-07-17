/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.Customer;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.service.CustomerLocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.services.util.CommonUtils;
import com.ifli.rapid.services.util.JsonHelper;
import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.InternetAddress;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author admin01
 *
 */

@Controller
@RequestMapping("VIEW")
public class RenewalNoticeController {
	
	protected Log _log=LogFactoryUtil.getLog(RenewalNoticeController.class);
	
	/*@RenderMapping
	public ModelAndView renderPage(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
		
		_log.info("in render action");
		
		model.addAttribute("wlcm", "Welcome to Liferay");
		
		return new ModelAndView("view");
	}*/
	
	@RenderMapping(params="action=renewalNoticeHome")
	public String renewalNotice(RenderRequest renderRequest,RenderResponse renderResponse,Model model){
		
		
		return "renewalNotice";
	}
	

	@RenderMapping(params="action=renewalDetails")
	public String renewalDetails(RenderRequest renderRequest,RenderResponse renderResponse,Model model) throws ParseException{
		
		_log.info("=== in renewal Details action ===");
		try {
			List<PolicyInfo> orgList = PolicyInfoLocalServiceUtil.getPolicyInfos(0, PolicyInfoLocalServiceUtil.getPolicyInfosCount());
			List<PolicyInfo> rdetails=new ArrayList<PolicyInfo>();
			
			for(PolicyInfo p:orgList){
				String dateChange=p.getNEXT_PREMIUM_DUEDATE();
				String pdob=p.getPOLICY_HOLDER1_DOB();
				
				p.setNEXT_PREMIUM_DUEDATE(CommonUtils.changeDateFormat(dateChange));
				p.setPOLICY_HOLDER1_DOB(CommonUtils.changeDateFormat(pdob));
				rdetails.add(p);
			}
			model.addAttribute("rdetailslist", rdetails);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("ctxPath", renderRequest.getContextPath());
		return "renewalDetails";
	}
	
	
	@ResourceMapping(value="getRenewalNotice")
	public void getRenewalNotice(ResourceRequest req,ResourceResponse res) throws PortletException, IOException{
		
		try
		{
			//System.out.println("-----------------------calling the get getRenewalNotice--------------");
		PortletContext context=req.getPortletSession().getPortletContext();
		String pdfile=context.getRealPath("/images/10145190_UnitStmt.pdf");
		//System.out.println("000000000000000000000000000"+pdfile);
		 res.setContentType("application/pdf");
		 res.addProperty(HttpHeaders.CACHE_CONTROL, "max-age=3600, must-revalidate");
		 res.addProperty(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename="+ pdfile);
		 //Use this to directly download the file
		// res.addProperty(HttpHeaders.CONTENT_DISPOSITION,"attachment");
		 OutputStream out = res.getPortletOutputStream();
		 //out.write(pdfContentVO.getPdfData());
         File f=new File(pdfile);
         FileInputStream fileInputStream = new FileInputStream(f);
		
		 out.write(FileUtil.getBytes(fileInputStream));
		 out.flush();
		 out.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	} 
	@ResourceMapping(value="getRenewalNoticeData")
	public void renewalDetailsForm(ResourceRequest req,ResourceResponse resourceResponse, Date count, Model model) throws IOException, PortalException{
		
		try {
			String pId=req.getParameter("policy");
			
			PolicyInfo rdetails = PolicyInfoLocalServiceUtil.getPolicyInfo(pId);
			
			Customer cdetails=CustomerLocalServiceUtil.getCustomer(rdetails.getCUSTOMER_ID());
			JSONObject json = JSONFactoryUtil.createJSONObject();
			model.addAttribute("policyDetails", rdetails);
			model.addAttribute("customerDetails", cdetails);
			json.put("email", cdetails.getCUSTOMER_EMAIL_ADDR());
			json.put("num", cdetails.getPHONE_NUMBER_1());
			json.put("pstatus", rdetails.getCURRENT_STATUS());
			json.put("pname", rdetails.getPRODUCT_NAME());
			
			resourceResponse.setContentType("text/json");
			PrintWriter out=resourceResponse.getWriter();
			out.write(json.toString());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		
		//resourceResponse.getWriter().write(json.toString());
		//resourceResponse.getWriter().write(name.toString());
		
	} 

	@ResourceMapping("emailRNpolicyURL")
    public void emailRNpolicyURL(ResourceRequest resourceRequest, ResourceResponse res) throws PortletException, IOException {
		_log.info("In emailpolicyURL: ResourceURL");
		 System.out.println("------------calling emailpolicyURL----------------");
		  Map<String, Object> map = new HashMap<String, Object>();
		String policynumber=resourceRequest.getParameter("policynum");
		String doctype=resourceRequest.getParameter("doctype");
		String fyear=resourceRequest.getParameter("fyear");
		
		System.out.println(policynumber+"-------------------"+doctype+"-----------------------------------------"+fyear);
		PortletContext context=resourceRequest.getPortletSession().getPortletContext();
		String pdfile="D:/agent_welcome12.pdf";
		try {
			 pdfile=context.getRealPath("/images/jvlogo.JPG");
	        //String filename = "D:/agent_welcome12.pdf";
		 	MailMessage mailMessage = new MailMessage();
			mailMessage.setTo(new InternetAddress("nagasatya777@gmail.com"));
			mailMessage.setFrom(new InternetAddress("nagasatya777@gmail.com"));
			mailMessage.setBody("Please find Your "+doctype +" attached.");
			mailMessage.setSubject(doctype +" Statement");
			mailMessage.addFileAttachment(new File(pdfile));
			
			MailServiceUtil.sendEmail(mailMessage);
			map.put("success", "Email sent successfully");
               
			res.getWriter().write(JsonHelper.toJson(map));
				
            } catch (Exception e) {
            	_log.info("Error in " + getClass().getName() + "\n" + e);
            }
      
    }
}
