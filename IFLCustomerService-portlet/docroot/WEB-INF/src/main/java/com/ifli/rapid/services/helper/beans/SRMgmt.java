package com.ifli.rapid.services.helper.beans;

import com.ifli.rapid.model.ActiveServiceRequests;
import com.ifli.rapid.service.ActiveServiceRequestsLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SRMgmt {
	private Log logger = LogFactoryUtil.getLog(SRMgmt.class);
	private SimpleDateFormat dateFormat = new SimpleDateFormat("YYMMddHHmmss");

	public String createSR(ActiveServiceRequests serviceRequest) {
		Date date = new Date();

		String srNumber = "SR" + dateFormat.format(date);
		serviceRequest.setCUST_SR_NUMBER(srNumber);
		try {
			serviceRequest.setINSERTED_DATE(date);
			ActiveServiceRequestsLocalServiceUtil
					.addActiveServiceRequests(serviceRequest);
		} catch (SystemException e) {
			logger.error(
					"Exception in ServiceRequestController - saveServiceRequest() : "
							+ e.getMessage(), e);
		}

		return serviceRequest.getCUST_SR_NUMBER();
	}

	
}
