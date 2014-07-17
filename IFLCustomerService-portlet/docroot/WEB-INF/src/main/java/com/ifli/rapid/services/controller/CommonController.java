package com.ifli.rapid.services.controller;

import com.ifli.rapid.model.FundMaster;
import com.ifli.rapid.model.NavHistory;
import com.ifli.rapid.service.FundMasterLocalServiceUtil;
import com.ifli.rapid.service.PolicyFundSwitchCounterLocalServiceUtil;
import com.ifli.rapid.services.util.JsonHelper;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
public class CommonController {

	private Log logger = LogFactoryUtil.getLog(CommonController.class);

	@SuppressWarnings("unchecked")
	@ResourceMapping("getNavHistory")
	public void getNavHistory(ResourceRequest request, ResourceResponse response) {
	  try {
		    int range = com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS;
			List<FundMaster> fundMasters = FundMasterLocalServiceUtil.getFundMasters(range, range);
			List<String> fundCodes =  new ArrayList<String>();
			if(fundMasters != null && !fundMasters.isEmpty()){
				for(FundMaster fm : fundMasters)
				fundCodes.add(fm.getFUND_CODE());
			}
			
			List<NavHistory> navHistory = null;
			
			//Iterate previous five days if nav_history data not found
			for(int i=0; i<5; i++){
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			date1.add(Calendar.DAY_OF_MONTH,  (-1)*i);
			date1.set(Calendar.HOUR, 0);
			date1.set(Calendar.MINUTE, 0);
			date1.set(Calendar.SECOND, 0);
			date1.set(Calendar.MILLISECOND, 0);
	
			date2.add(Calendar.DAY_OF_MONTH,  (-1)*	i);
			date2.set(Calendar.HOUR, 23);
			date2.set(Calendar.MINUTE, 59);
			date2.set(Calendar.SECOND, 59);
			date2.set(Calendar.MILLISECOND, 999);
	
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(NavHistory.class);
			query.add(PropertyFactoryUtil.forName("FUND_CODE").in(fundCodes));
			query.add(PropertyFactoryUtil.forName("DATE").ge(date1.getTime()));
			query.add(PropertyFactoryUtil.forName("DATE").le(date2.getTime()));
			navHistory = PolicyFundSwitchCounterLocalServiceUtil.dynamicQuery(query);
			if(navHistory != null && !navHistory.isEmpty()){
				break;
			}
			}
			response.getWriter().write(JsonHelper.toJson(navHistory));
		} catch (Exception e) {
			logger.error("Exception in FundswitchController - saveFundswitch() : " + e.getMessage(), e);
		}
		
	}
}
