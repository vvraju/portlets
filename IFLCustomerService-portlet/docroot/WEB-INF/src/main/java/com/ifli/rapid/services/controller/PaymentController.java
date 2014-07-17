package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.PaymentDetails;
import com.ifli.rapid.model.PaymentMethodMaster;
import com.ifli.rapid.model.PaymentMethodType;
import com.ifli.rapid.model.PaymentOptionMaster;
import com.ifli.rapid.model.PaymentOptionTypes;
import com.ifli.rapid.service.PaymentDetailsLocalServiceUtil;
import com.ifli.rapid.service.PaymentMethodMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentMethodTypeLocalServiceUtil;
import com.ifli.rapid.service.PaymentOptionMasterLocalServiceUtil;
import com.ifli.rapid.service.PaymentOptionTypesLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PaymentDto;
import com.ifli.rapid.services.util.JsonHelper;
import com.ifli.rapid.services.util.PaymentControllerHelper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.cxf.common.util.StringUtils;
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
public class PaymentController {

	
	private Log logger = LogFactoryUtil.getLog(PaymentController.class);
	
	@ResourceMapping("getPaymentModes")
	public void getPaymentModes(ResourceRequest request, ResourceResponse response) {
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		try {
			List<PaymentMethodMaster> paymentModes = PaymentMethodMasterLocalServiceUtil.getPaymentMethodMasters(range,range);
			response.getWriter().write(JsonHelper.toJson(paymentModes));
		} catch (Exception e) {
			logger.error("Exception in PaymentController - getPaymentModes() : " + e.getMessage(), e);
		}
	} 
	
	@SuppressWarnings("unchecked")
	@ResourceMapping("getPaymentModeTypes")
	public void getPaymentModeTypes(ResourceRequest request, ResourceResponse response) {
		String PaymentMethodID = request.getParameter("PaymentMethodID");
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PaymentMethodType.class);
			query.add(PropertyFactoryUtil.forName("PaymentMethodID").eq(PaymentMethodID));
			
			List<PaymentMethodType> types = null;

			try {
				types = PaymentMethodTypeLocalServiceUtil.dynamicQuery(query);
			} catch (Exception e) {
				logger.error("Exception in PaymentController - getPaymentModeTypes() : " + e.getMessage(), e);
			}
			response.getWriter().write(JsonHelper.toJson(types));
		} catch (Exception e) {
			logger.error("Exception in PaymentController - getPaymentModeTypes() : " + e.getMessage(), e);
		}
	}
	
	
	@ResourceMapping("getPaymentOptions")
	public void getPaymentOptions(ResourceRequest request, ResourceResponse response) {
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		try {
			List<PaymentOptionMaster> paymentModes = PaymentOptionMasterLocalServiceUtil.getPaymentOptionMasters(range,range);
			response.getWriter().write(JsonHelper.toJson(paymentModes));
		} catch (Exception e) {
			logger.error("Exception in PaymentController - getPaymentOptions() : " + e.getMessage(), e);
		}
	} 
	
	@SuppressWarnings("unchecked")
	@ResourceMapping("getPaymentOptionTypes")
	public void getPaymentOptionTypes(ResourceRequest request, ResourceResponse response) {
		String PaymentOptionId = request.getParameter("PaymentOptionId");
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PaymentOptionTypes.class);
			query.add(PropertyFactoryUtil.forName("PaymentOptionId").eq(PaymentOptionId));
			
			List<PaymentOptionTypes> types = null;

			try {
				types = PaymentOptionTypesLocalServiceUtil.dynamicQuery(query);
			} catch (Exception e) {
				logger.error("Exception in PaymentController - getPaymentOptionTypes() : " + e.getMessage(), e);
			}
			response.getWriter().write(JsonHelper.toJson(types));
		} catch (Exception e) {
			logger.error("Exception in PaymentController - getPaymentOptionTypes() : " + e.getMessage(), e);
		}
	}
	
	
	
	@ResourceMapping(value = "savePrePayment")
	public void savePrePayment(ResourceRequest request, ResourceResponse response) {
		PaymentDto paymentDto = null;
		String data = request.getParameter("jsonKey");
		//System.out.println("-----------------------json key from response------------"+data);
		paymentDto = JsonHelper.fromJson(data, PaymentDto.class);
		/*paymentDto = new PaymentDto();
		paymentDto.setContactId("1");
		paymentDto.setPolicyNo("U100000");
		paymentDto.setPaymentOptionId("58909278-a64c-4c20-a954-7bc73b364e5d"); 
		paymentDto.setPaymentMethodId("f7891f05-171c-4b5a-ad52-1db1c44b628e");
		paymentDto.setPaymentMethodDetailsId("9ff043ca-660a-43f2-a88f-7c045a8b579f");
		paymentDto.setPremiumAmount("1.00");
		paymentDto.setPaymentOptionTypeId("ef795123-2bbd-4d05-8110-d45e44f11f21");
		paymentDto.setRedirectURL("http://www.uat.indiafirstlife.com/web/guest/home?p_p_id=IFLCustomerService_WAR_IFLCustomerServiceportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_IFLCustomerService_WAR_IFLCustomerServiceportlet_action=PaymentResponse&_IFLCustomerService_WAR_IFLCustomerServiceportlet");
		*/
		String gatewayUrl[] = null;
		Map<String, String> resultMap = new LinkedHashMap<String, String>();
		try {
		if (paymentDto != null) {
			PaymentControllerHelper paymentHelper = new PaymentControllerHelper(); 
			gatewayUrl = paymentHelper.savePaymentTemp(paymentDto, request, response);
			
			if (!StringUtils.isEmpty(gatewayUrl[0]) && !StringUtils.isEmpty(gatewayUrl[1])) {
				resultMap.put("paymentId", gatewayUrl[0]);
				resultMap.put("requestType", gatewayUrl[3]);
				resultMap.put("paymentRequest", gatewayUrl[1]);
				resultMap.put("paymentURL", gatewayUrl[2]);
				//System.out.println("--------------------------result map1--------------------"+resultMap);
				response.getWriter().write(JsonHelper.toJson(resultMap));
			} else {
				resultMap.put("paymentId", gatewayUrl[0]);
				resultMap.put("requestType", gatewayUrl[3]);
				resultMap.put("message", "Payment URL is not generated");
				if (StringUtils.isEmpty(gatewayUrl[0])) {
					//System.out.println("--------------------------result map2--------------------"+resultMap);
					response.getWriter().write(JsonHelper.toJson(resultMap));
				} else {
					//System.out.println("--------------------------result map3--------------------"+resultMap);
					response.getWriter().write(JsonHelper.toJson(resultMap));
				}
			}
		} else {
			resultMap.put("message", "Payment URL is not generated");
			//System.out.println("--------------------------result map- else-------------------"+resultMap);
			response.getWriter().write(JsonHelper.toJson(resultMap));
		}
		} catch (Exception e) {
			logger.error("Exception in PaymentController - getPaymentModeTypes() : " + e.getMessage(), e);
		}
	}
	
	
	@RenderMapping(params = "action=PaymentResponse")
	public ModelAndView PaymentResponse(RenderRequest request, RenderResponse response, Model model) {
		logger.info("Inside savePostPayment...............");
		PaymentDto paymentDto = new PaymentDto();
		try {
		String msg = request.getParameter("msg");
		//String paymentamount=request.getParameter("paymentamount");
		//System.out.println("-------------------------msg is -----------------"+msg);
		logger.info("msg:::" + msg);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		msg = "INDIAFIRST|U100000|MCMP3366476798|001441-T13535|1.00|CMP|22330747|NA|INR|DIRECT|NA|NA|NA|31-05-2014 01:12:14|0300|NA|Subba Ch|1|BILLDESK|9888888888|4|NA|NA|NA|PGS10001-Success|3334927089";
		if(msg == null || msg.isEmpty()){
			resultMap.put("message", "Payment response is not generated");	
		}else{
		PaymentControllerHelper paymentHelper = new PaymentControllerHelper();
		if (paymentDto.getRequestType() != null && paymentDto.getRequestType().equalsIgnoreCase("BOB")) { // TODO: Need to verify with BOB payment.
			paymentHelper.bobResp(paymentDto, msg);
	}else{
		
		String[] paymentResponse = msg.split("\\|");
		logger.info("paymentResponse[14]::" + paymentResponse[14]);
		
		paymentDto.setPolicyNo(paymentResponse[1]);
		paymentDto.setContactId(paymentResponse[17]);
		paymentDto.setPaymentId(paymentResponse[20]);
		paymentDto.setPremiumAmount(paymentResponse[4]);
		paymentDto.setPaymentResponse(msg);
		
		PaymentDetails paymentDetails = PaymentDetailsLocalServiceUtil.getPaymentDetails(Integer.parseInt(paymentDto.getPaymentId()));
		
		if (paymentDetails != null) {
			logger.info("paymentDetails:::" + paymentDetails);
			String responseData = paymentDto.getPaymentResponse();
			paymentHelper.billDeskResp(paymentDetails, responseData);
		}
		}
		model.addAttribute("paymentDto", paymentDto);
		
		}
		model.addAttribute("paymentamount","true");
		} catch (Exception e) {
		logger.error("Exception in PaymentController - getPaymentModeTypes() : " + e.getMessage(), e);
		}
		return new ModelAndView("topUpSuccess");
	
	}
	
}