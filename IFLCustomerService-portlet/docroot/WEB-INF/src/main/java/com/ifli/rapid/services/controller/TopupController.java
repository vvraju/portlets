/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.PolicyTopupDetails;
import com.ifli.rapid.model.impl.ActiveServiceRequestsImpl;
import com.ifli.rapid.model.impl.PolicyTopupDetailsImpl;
import com.ifli.rapid.service.PolicyTopupDetailsLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PolicyTopupDetailsBean;
import com.ifli.rapid.services.util.JsonHelper;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.util.PortalUtil;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author Subba Rao Ch
 *
 */
@Controller
@RequestMapping("VIEW")
public class TopupController {
	private Log logger = LogFactoryUtil.getLog(FundswitchController.class);
	@Autowired
	private ServiceRequestController srController;
	
	@ResourceMapping(value = "saveTopup")
	public void saveTopup(ResourceRequest request, ResourceResponse response) {
		String data = request.getParameter("jsonKey");
		System.out.println("------------------save top up ---------"+data);
		Integer customer = null;
		if(request.getParameter("custId") != null){
		customer = Integer.parseInt(request.getParameter("custId"));
		}
		
		PolicyTopupDetailsBean bean =JsonHelper.fromJson(data, PolicyTopupDetailsBean.class);
		List<PolicyTopupDetailsImpl> topupDetails =  bean.getTopupDetails();
		String srNumber = "";
		Date date = new Date();

		try {
			if (topupDetails != null) {
				ActiveServiceRequests serviceRequest = new ActiveServiceRequestsImpl();
				serviceRequest.setTYPE_ID(1);
				serviceRequest.setSUB_TYPE_ID(8); 
				serviceRequest.setSTATUS_ID(1);
				serviceRequest.setASSIGNED_TO(1);
				serviceRequest.setHANDLED_BY(1);
				serviceRequest.setCUSTOMER_ID(customer);

				int id=srController.saveServiceRequest(serviceRequest);
				
				for (PolicyTopupDetails iterator : topupDetails) { 
					iterator.setCreatedDate(date);
					iterator.setQRC_ASR_ID(id);
					PolicyTopupDetailsLocalServiceUtil.addPolicyTopupDetails(iterator);
				}
				srNumber = serviceRequest.getCUST_SR_NUMBER();
			}

			response.getWriter().write(JsonHelper.toJson(srNumber));
		} catch (Exception e) {
			logger.error("Exception in TopupController - saveTopup() : " + e.getMessage(), e);
		}
	}
	
	
	@RenderMapping(params = "action=previewtopupPolicyDoc")
	public ModelAndView previewPhoto(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) throws Exception {

		
		logger.info("in Preview Photot top up controller Action ");
		try {
			
			String custId=renderRequest.getParameter("policyId");
		
			String docType=renderRequest.getParameter("docType");
			String fileName="";
			if(custId!=null &&  docType!=null)
				fileName=custId+"_Topup_"+docType;
			
			File newFolder = null;
			newFolder = new File(renderRequest.getPortletSession().getPortletContext().getRealPath("/") +"//" + "uploaddocs");
			if(!newFolder.exists()){
			newFolder.mkdir();
			}
		//newFile = new File(newFolder+"//" +""+fileName+"."+ext);
			File fileImage = new File(newFolder+"//" +""+fileName+".png");
			if(fileImage.exists() && !fileImage.isDirectory()){
				BufferedImage image = ImageIO.read(fileImage);// for getting images
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(image, "png", baos);
				String encodedImage = Base64.encode(baos.toByteArray());
				model.addAttribute("imgencode", encodedImage);
			} 
			File filePdf = new File(newFolder+"//" +""+fileName+".pdf");
				if(filePdf.exists() && !filePdf.isDirectory()){
				String path=filePdf.getPath();
				model.addAttribute("path", renderRequest.getContextPath()+File.separator+"uploaddocs"+File.separator+fileName+".pdf");
			}
			
			

		} catch (Exception e) {

		}

		return new ModelAndView("common");

	}
	@RenderMapping(params = "action=topupUploadDocs")
	public ModelAndView uploadDocuments(RenderRequest renderRequest,
			RenderResponse renderResponse, Model model) throws Exception {

		// Iterator<String> itr = request.getFileNames();
		// String applicationRefNo = request.getParameter(APP_REF_NO);
		// MultipartFile mpf = request.getFile(itr.next());
		 // url:'${topupUploadDocs}&<portlet:namespace/>policyId='+polid+'&doctype='+doctype,
		try {

			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(renderRequest);
			String sourceFileName = uploadRequest.getFileName("uploadTopupImg");
			String custId=uploadRequest.getParameter("policyId");
			
			String docType=uploadRequest.getParameter("docType");
			String fileName;
			if(custId!=null && docType!=null)
				fileName=custId+"_Topup_"+docType;
			else
				fileName=sourceFileName;
			
			File file = uploadRequest.getFile("uploadTopupImg");
			String ext=FilenameUtils.getExtension(sourceFileName);
			if(ext.equalsIgnoreCase("pdf")){
				
			}else{
				ext="png";
			}
			byte[] bytes = null;
			bytes = FileUtil.getBytes(file);
			File newFile = null;
			if ((bytes != null) && (bytes.length > 0)) {

					File newFolder = null;
					newFolder = new File(renderRequest.getPortletSession().getPortletContext().getRealPath("/") +"//" + "uploaddocs");
					if(!newFolder.exists()){
					newFolder.mkdir();
					}
				newFile = new File(newFolder+"//" +""+fileName+"."+ext);
				FileInputStream fileInputStream = new FileInputStream(file);
				FileOutputStream fileOutputStream = new FileOutputStream(
						newFile);
				fileInputStream.read(bytes);
				fileOutputStream.write(bytes, 0, bytes.length);
				fileOutputStream.close();
				fileInputStream.close();
			}

			/*BufferedImage image = ImageIO.read(new File("E:" + File.separator
					+ "" + sourceFileName));// for getting images
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image, "png", baos);
			String encodedImage = Base64.encode(baos.toByteArray());
			model.addAttribute("imgencode", encodedImage);*/

		} catch (Exception e) {

		}

		return new ModelAndView("common");

	}
	
}
