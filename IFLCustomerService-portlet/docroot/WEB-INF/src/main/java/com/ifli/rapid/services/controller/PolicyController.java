/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.FundMaster;
import com.ifli.rapid.model.PolicyFund;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.service.FundMasterLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundLocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.services.util.JsonHelper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author Prasad Khode
 * 
 */
@Controller
@RequestMapping("VIEW")
public class PolicyController {

	private Log logger = LogFactoryUtil.getLog(PolicyController.class);

	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getPoliciesByCustId")
	public void getPoliciesByCustId(ResourceRequest request, ResourceResponse response) {
		String custId = request.getParameter("custId");

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyInfo.class);
			query.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(Integer.parseInt(custId)));

			List<PolicyInfo> policies = PolicyInfoLocalServiceUtil.dynamicQuery(query);
			response.getWriter().write(JsonHelper.toJson(policies));
		} catch (Exception e) {
			logger.error("Exception in PolicyController - getPoliciesByCustId() : " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getUlipPoliciesByCustId")
	public void getUlipPoliciesByCustId(ResourceRequest request, ResourceResponse response) {
		String custId = request.getParameter("custId");

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyInfo.class);
			query.add(PropertyFactoryUtil.forName("CUSTOMER_ID").eq(Integer.parseInt(custId)));

			List<PolicyInfo> policies = PolicyInfoLocalServiceUtil.dynamicQuery(query);

			List<PolicyInfo> ulipPolicies = new ArrayList<PolicyInfo>();

			for (PolicyInfo iterator : policies) {
				if (iterator.getPOLICY_ID().startsWith("U") || iterator.getPOLICY_ID().startsWith("u")) {
					ulipPolicies.add(iterator);
				}
			}

			response.getWriter().write(JsonHelper.toJson(ulipPolicies));
		} catch (Exception e) {
			logger.error("Exception in PolicyController - getPoliciesByCustId() : " + e.getMessage(), e);
		}
	}

	@ResourceMapping(value = "getPolicyInfoById")
	public void getPolicyInfoById(ResourceRequest request, ResourceResponse response) {
		String policyNum = request.getParameter("policyNum");

		try {
			PolicyInfo policyInfo = PolicyInfoLocalServiceUtil.getPolicyInfo(policyNum);
			response.getWriter().write(JsonHelper.toJson(policyInfo));
		} catch (Exception e) {
			logger.error("Exception in PolicyController - getPolicyInfoById() : " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getPolicyFundsByPolicyId")
	public void getPolicyFundsByPolicyId(ResourceRequest request, ResourceResponse response) {
		String policyNum = (String) request.getParameter("policyNum");

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyFund.class);
			query.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));
			
			List<PolicyFund> funds = PolicyFundLocalServiceUtil.dynamicQuery(query);
			response.getWriter().write(JsonHelper.toJson(funds));
		} catch (Exception e) {
			logger.error("Exception in PolicyController - getPolicyFundsByPolicyId() : " + e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getPolicyFundsAndFundMasters")
	public void getPolicyFundsAndFundMasters(ResourceRequest request, ResourceResponse response) {
		String policyNum = (String) request.getParameter("policyNum");
		Map<String, Object> map = new HashMap<String, Object>();
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyFund.class);
			query.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));
			List<PolicyFund> funds = PolicyFundLocalServiceUtil.dynamicQuery(query);
			
			List<FundMaster> fundMasters = FundMasterLocalServiceUtil.getFundMasters(range, range);
			map.put("policyFunds", funds);
			map.put("fundMasters", fundMasters);
		
			response.getWriter().write(JsonHelper.toJson(map));
		} catch (Exception e) {
			logger.error("Exception in PolicyController - getPolicyFundsByPolicyId() : " + e.getMessage(), e);
		}
	}
}
