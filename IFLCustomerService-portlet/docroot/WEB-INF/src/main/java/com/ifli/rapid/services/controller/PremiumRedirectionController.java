/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.PolicyFund;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.PolicyPremPercentage;
import com.ifli.rapid.model.PolicyPremRedirectionDetails;
import com.ifli.rapid.model.impl.ActiveServiceRequestsImpl;
import com.ifli.rapid.model.impl.PolicyPremPercentageImpl;
import com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsImpl;
import com.ifli.rapid.service.PolicyFundLocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.service.PolicyPremPercentageLocalServiceUtil;
import com.ifli.rapid.service.PolicyPremRedirectionDetailsLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.PolicyPremPercentageHelperDTO;
import com.ifli.rapid.services.util.JsonHelper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author Rajashekar Yedla
 * 
 */
@Controller
@RequestMapping("VIEW")
public class PremiumRedirectionController {

	private Log _log = LogFactoryUtil.getLog(PremiumRedirectionController.class);
	
	@Autowired
	private ServiceRequestController controller;
	
	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getPoliciesForPremRedir")
	public void getPoliciesForPremiumRedirection(ResourceRequest request, ResourceResponse response) {
		String custId = request.getParameter("custId");

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyInfo.class);
			query.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(Integer.parseInt(custId)));

			List<PolicyInfo> policies = PolicyInfoLocalServiceUtil.dynamicQuery(query);
			List<PolicyInfo> policiesToView = new ArrayList<PolicyInfo>();
			
			for(PolicyInfo info : policies){
				if(info.getPOLICY_ID().startsWith("U")){
					policiesToView.add(info);
				}
			}
			
			response.getWriter().write(JsonHelper.toJson(policiesToView));
		} catch (Exception e) {
			_log.error("Exception in PremiumRedirectionController - getPoliciesForPremiumRedirection() : " + e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getPolicyFundsForPremRedir")
	public void getPolicyFundsForPremRedir(ResourceRequest request, ResourceResponse response) {
		String policyNum = (String) request.getParameter("policyNum");

		try {
			PolicyInfo policyInfo = PolicyInfoLocalServiceUtil.getPolicyInfo(policyNum);
			
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyFund.class);
			query.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));
			List<PolicyFund> funds = PolicyFundLocalServiceUtil.dynamicQuery(query);
			
			DynamicQuery percentageQuery = DynamicQueryFactoryUtil.forClass(PolicyPremPercentage.class);
			percentageQuery.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));
			List<PolicyPremPercentage> percentages = PolicyPremPercentageLocalServiceUtil.dynamicQuery(percentageQuery);
			
	    	Map<String, Object> map = new HashMap<String, Object>();
	    	
	    	map.put("policyInfo", policyInfo);
        	map.put("policyFunds", funds);
        	map.put("premPercentage", percentages);
        	
        	Date rcd = policyInfo.getRISK_COMMENCEMENT_DATE();
        	Date currentDate = new Date();

        	if(rcd != null){
            	int i = currentDate.compareTo(rcd);
            	if(i < 0){
            		map.put("errorMsg", "The selected policy is not satisfactory for Premium Redirection as it is not  meeting Risk commencement Date conditions.");
            	}        		
        	}
        	
        	if (!policyInfo.getPOLICY_ID().startsWith("U") && !policyInfo.getPOLICY_ID().startsWith("u")) {
        		map.put("errorMsg", "Selected policy is not Ulip policy");
        	} else if (policyInfo.getCURRENT_STATUS() == null || policyInfo.getCURRENT_STATUS().trim().isEmpty() || !policyInfo.getCURRENT_STATUS().trim().equalsIgnoreCase("In Force")) {
        		map.put("errorMsg", " The policy selected is not Inforce, please select the appropriate one. ");
        	}
        	
			response.getWriter().write(JsonHelper.toJson(map));
		} catch (Exception e) {
			_log.error("Exception in PolicyController - getPolicyFundsByPolicyId() : " + e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "savePremRedir")
	public void savePremiumRedirection(ResourceRequest request, ResourceResponse response) {
		String result = "";
		String data = request.getParameter("jsonKey");
		System.out.println("pr data=="+data);
		PolicyPremPercentageHelperDTO dto = JsonHelper.fromJson(data, PolicyPremPercentageHelperDTO.class);
		
		try{
			if(dto != null){
				List<PolicyPremRedirectionDetailsImpl> policyPremRedirectionDetails;
				List<PolicyPremPercentageImpl> policyPremPercentages;
				
				policyPremRedirectionDetails = dto.getPolicyPremRedirectionDetails();
				policyPremPercentages = dto.getPolicyPremPercentages();
				
				if(policyPremRedirectionDetails != null && !policyPremRedirectionDetails.isEmpty()){
					for(PolicyPremRedirectionDetails detailsBean : policyPremRedirectionDetails){
							PolicyPremRedirectionDetailsLocalServiceUtil.addPolicyPremRedirectionDetails(detailsBean);
					}
				}
				
				if(policyPremPercentages != null && !policyPremPercentages.isEmpty()){
					PolicyPremPercentage object = policyPremPercentages.get(0);
					String policyNum = object.getPOLICY_ID();
					
					DynamicQuery percentageQuery = DynamicQueryFactoryUtil.forClass(PolicyPremPercentage.class);
					percentageQuery.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));
					List<PolicyPremPercentage> percentages = PolicyPremPercentageLocalServiceUtil.dynamicQuery(percentageQuery);
					
					if(percentages != null && !percentages.isEmpty()){
						for(PolicyPremPercentage iterator : percentages){
							for(PolicyPremPercentage bean : policyPremPercentages){
								if(iterator.getFUND_ID() == bean.getFUND_ID()){
									bean.setPREM_PERCENTAGE_ID(iterator.getPREM_PERCENTAGE_ID());
								}
							}
						}				
					}
				}
				
				for(PolicyPremPercentage bean : policyPremPercentages){
					if(bean.getPREM_PERCENTAGE_ID() >= 0 ){
						PolicyPremPercentageLocalServiceUtil.updatePolicyPremPercentage(bean);
					} else{
						PolicyPremPercentageLocalServiceUtil.addPolicyPremPercentage(bean);
					}
				}
				
				
				ActiveServiceRequests serviceRequest = new ActiveServiceRequestsImpl();

				serviceRequest.setTYPE_ID(1);
				serviceRequest.setSUB_TYPE_ID(6);
				serviceRequest.setSTATUS_ID(1);
				serviceRequest.setASSIGNED_TO(1);
				serviceRequest.setHANDLED_BY(1);
				serviceRequest.setCUSTOMER_ID(Integer.parseInt(dto.getCustomerId()));

				controller.saveServiceRequest(serviceRequest);
				
				
				response.getWriter().write(JsonHelper.toJson(serviceRequest.getCUST_SR_NUMBER()));
			} else{
				result = "No Input data is available";
				response.getWriter().write(JsonHelper.toJson(result));
			}
		} catch (Exception e){
			_log.error("Exception in PremiumRedirectionController - savePremiumRedirection() : " + e.getMessage(), e);
			e.printStackTrace();
		}
	}
}
