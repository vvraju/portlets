/**
 * 
 */
package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.model.Customer;
import com.ifli.rapid.model.FundMaster;
import com.ifli.rapid.model.PolicyFund;
import com.ifli.rapid.model.PolicyFundSwitchCounter;
import com.ifli.rapid.model.PolicyFundSwitchDetails;
import com.ifli.rapid.model.PolicyInfo;
import com.ifli.rapid.model.impl.ActiveServiceRequestsImpl;
import com.ifli.rapid.model.impl.PolicyFundSwitchCounterImpl;
import com.ifli.rapid.model.impl.PolicyFundSwitchDetailsImpl;
import com.ifli.rapid.service.CustomerLocalServiceUtil;
import com.ifli.rapid.service.FundMasterLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundSwitchCounterLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundSwitchDetailsLocalServiceUtil;
import com.ifli.rapid.service.PolicyInfoLocalServiceUtil;
import com.ifli.rapid.services.helper.beans.FundSwitchFromTo;
import com.ifli.rapid.services.helper.beans.FundSwitchFromToHelper;
import com.ifli.rapid.services.helper.beans.FundswitchHelperBean;
import com.ifli.rapid.services.service.RapidServiceImpl;
import com.ifli.rapid.services.util.CommonUtils;
import com.ifli.rapid.services.util.JsonHelper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.Calendar;
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
 * @author Prasad Khode
 * 
 */
@Controller
@RequestMapping("VIEW")
public class FundswitchController {

	private Log logger = LogFactoryUtil.getLog(FundswitchController.class);

	@Autowired
	private ServiceRequestController srController;

	@ResourceMapping("getFundMasterById")
	public void getFundMasterById(ResourceRequest request, ResourceResponse response) {
		int fundId = Integer.parseInt(request.getParameter("fundId"));

		try {
			FundMaster fundMaster = FundMasterLocalServiceUtil.getFundMaster(fundId);
			response.getWriter().write(JsonHelper.toJson(fundMaster));
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - getFundMasterById() : " + e.getMessage(), e);
		}
	}

	@ResourceMapping("getFundMasters")
	public void getFundMasters(ResourceRequest request, ResourceResponse response) {
		int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;

		try {
			List<FundMaster> fundMasters = FundMasterLocalServiceUtil.getFundMasters(range, range);
			System.out.println("fmaster========="+fundMasters);
			response.getWriter().write(JsonHelper.toJson(fundMasters));
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - getFundMasters() : " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "getPolicyFunds")
	public void getPolicyFunds(ResourceRequest request, ResourceResponse response) {
		
		
		logger.info("==== in get Policy Funds Action =====");
		String policyNum = request.getParameter("policyNum");
		
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			List<PolicyFundSwitchCounter> counterBeans = getFundswitchCounter(policyNum);
			
		/*	RapidServiceImpl rapidService=new RapidServiceImpl();
			rapidService.getPolicyDetails(policyNum);	*/		
			
			
			
			if (counterBeans != null && !counterBeans.isEmpty()) {
				PolicyFundSwitchCounter counterBean = counterBeans.get(0);

				if (counterBean.getFUND_SWITCH_COUNTER() >= 2) {
					map.put("errorMsg", "Only two Fund Switch transactions are allowed for a policy in a Month");
				}
			}

			PolicyInfo policyInfo = PolicyInfoLocalServiceUtil.getPolicyInfo(policyNum);

			DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyFund.class);
			query.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));

			List<PolicyFund> funds = PolicyFundLocalServiceUtil.dynamicQuery(query);
			
			String dateChange=policyInfo.getNEXT_PREMIUM_DUEDATE();
			String pdob=policyInfo.getPOLICY_HOLDER1_DOB();
			
			policyInfo.setNEXT_PREMIUM_DUEDATE(CommonUtils.changeDateFormat(dateChange));
			policyInfo.setPOLICY_HOLDER1_DOB(CommonUtils.changeDateFormat(pdob));

			map.put("policyInfo", policyInfo);
			map.put("policyFunds", funds);

			if (!policyInfo.getPOLICY_ID().startsWith("U") && !policyInfo.getPOLICY_ID().startsWith("u")) {
				map.put("errorMsg", "Selected policy is not Ulip policy");
			} else if (policyInfo.getCURRENT_STATUS() == null || policyInfo.getCURRENT_STATUS().trim().isEmpty() || !policyInfo.getCURRENT_STATUS().trim().equalsIgnoreCase("In Force")) {
				map.put("errorMsg", "The policy selected is not Inforce, please select the appropriate one. ");
			}

			response.getWriter().write(JsonHelper.toJson(map));
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - getPolicyFunds() : " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	@ResourceMapping(value = "searchPolicy")
	public void searchPolicy(ResourceRequest request, ResourceResponse response) {
		String policyNum = request.getParameter("policyNum");

		Map<String, Object> map = new HashMap<String, Object>();

		try {
			PolicyInfo policyInfo = PolicyInfoLocalServiceUtil.getPolicyInfo(policyNum);

			if (policyInfo != null && policyInfo.getCUSTOMER_ID()!=0) {
				Customer customer = CustomerLocalServiceUtil.getCustomer(policyInfo.getCUSTOMER_ID());

				DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyFund.class);
				query.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));

				List<PolicyFund> funds = PolicyFundLocalServiceUtil.dynamicQuery(query);

				map.put("policyInfo", policyInfo);
				map.put("customer", customer);
				map.put("policyFunds", funds);
			} else {
				map.put("errorMsg", "No policy found.");
			}

			response.getWriter().write(JsonHelper.toJson(map));
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - searchPolicy() : " + e.getMessage(), e);
		}
	}

	@ResourceMapping(value = "saveFundswitch")
	public void saveFundswitch(ResourceRequest request, ResourceResponse response) {
		String data = request.getParameter("jsonKey");
		
		FundswitchHelperBean helperBean = JsonHelper.fromJson(data, FundswitchHelperBean.class);

		List<PolicyFundSwitchDetails> details = new ArrayList<PolicyFundSwitchDetails>();

		if (helperBean.getFundFromTo() != null && !helperBean.getFundFromTo().isEmpty()) {
			for (FundSwitchFromToHelper iterator : helperBean.getFundFromTo()) {
				if (iterator.getFundTo() != null && !iterator.getFundTo().isEmpty()) {
					for (FundSwitchFromTo to : iterator.getFundTo()) {
						if (to.getTargetFundPercentage() != null && to.getTargetFundPercentage().doubleValue() > 0) {
							PolicyFundSwitchDetails fundSwitchDetails = new PolicyFundSwitchDetailsImpl();
							fundSwitchDetails.setFUND_FROM(iterator.getFundFrom().getFundCode());
							fundSwitchDetails.setFUND_TO(to.getFundCode());
							fundSwitchDetails.setPRECENTAGE_OF_UNITS(to.getTargetFundPercentage());
							fundSwitchDetails.setPOLICY_ID(helperBean.getPolicyId());
							details.add(fundSwitchDetails);
						}
					}
				}
			}
		}

		String srNumber = "";
		Date date = new Date();

		try {
			if (!details.isEmpty()) {
				ActiveServiceRequests serviceRequest = new ActiveServiceRequestsImpl();
				serviceRequest.setTYPE_ID(1);
				serviceRequest.setSUB_TYPE_ID(1);
				serviceRequest.setSTATUS_ID(1);
				serviceRequest.setASSIGNED_TO(1);
				serviceRequest.setHANDLED_BY(1);
				serviceRequest.setCUSTOMER_ID(Integer.parseInt(helperBean.getCustomerId()));

				int id=srController.saveServiceRequest(serviceRequest);
				
				for (PolicyFundSwitchDetails iterator : details) {
					iterator.setINSERTED_DATE(date);
					iterator.setUPDATED_DATE(date);
					iterator.setQRC_ASR_ID(id);
					PolicyFundSwitchDetailsLocalServiceUtil.addPolicyFundSwitchDetails(iterator);
				}

				PolicyFundSwitchCounter counterBean = null;
				List<PolicyFundSwitchCounter> counterBeans = getFundswitchCounter(helperBean.getPolicyId());

				if (counterBeans != null && !counterBeans.isEmpty()) {
					counterBean = (PolicyFundSwitchCounter) counterBeans.get(0);

					if (counterBean != null && counterBean.getFUND_SWITCH_COUNTER() < 2) {
						counterBean.setFUND_SWITCH_COUNTER(counterBean.getFUND_SWITCH_COUNTER() + 1);
						counterBean.setFUND_SWITCH_YEAR(date);

						if (counterBean.getPOLICY_ID() != null && !counterBean.getPOLICY_ID().trim().isEmpty()) {
							PolicyFundSwitchCounterLocalServiceUtil.updatePolicyFundSwitchCounter(counterBean);
						} else {
							PolicyFundSwitchCounterLocalServiceUtil.addPolicyFundSwitchCounter(counterBean);
						}
					}
				} else {
					counterBean = new PolicyFundSwitchCounterImpl();
					counterBean.setPOLICY_ID(helperBean.getPolicyId());
					counterBean.setFUND_SWITCH_YEAR(date);
					counterBean.setFUND_SWITCH_COUNTER(1);

					PolicyFundSwitchCounterLocalServiceUtil.addPolicyFundSwitchCounter(counterBean);
				}

			

				srNumber = serviceRequest.getCUST_SR_NUMBER();
			}

			response.getWriter().write(JsonHelper.toJson(srNumber));
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - saveFundswitch() : " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<PolicyFundSwitchCounter> getFundswitchCounter(String policyNum) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.set(Calendar.DATE, 1);
		date1.set(Calendar.HOUR, 0);
		date1.set(Calendar.MINUTE, 0);
		date1.set(Calendar.SECOND, 0);
		date1.set(Calendar.MILLISECOND, 0);

		int endDate = date2.getActualMaximum(Calendar.DATE);

		date2.set(Calendar.DATE, endDate);
		date2.set(Calendar.HOUR, 23);
		date2.set(Calendar.MINUTE, 59);
		date2.set(Calendar.SECOND, 59);
		date2.set(Calendar.MILLISECOND, 999);

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(PolicyFundSwitchCounter.class);
		query.add(PropertyFactoryUtil.forName("POLICY_ID").eq(policyNum));
		query.add(PropertyFactoryUtil.forName("FUND_SWITCH_YEAR").ge(date1.getTime()));
		query.add(PropertyFactoryUtil.forName("FUND_SWITCH_YEAR").le(date2.getTime()));

		List<PolicyFundSwitchCounter> counterBeans = null;

		try {
			counterBeans = PolicyFundSwitchCounterLocalServiceUtil.dynamicQuery(query);
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - saveFundswitch() : " + e.getMessage(), e);
		}

		return counterBeans;
	}
}
