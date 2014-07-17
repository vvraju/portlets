/**
 * 
 */
package com.ifli.rapid.services.helper.beans;

import java.util.List;

/**
 * @author madhu
 *
 */
public class ServiceNamesBean {
	
	private int serviceId;
	private String serviceName;
	private String serviceDesc;
	private List<ServiceSubnamesBean> serviceSubnamesBeanList;
	private String activeFlag;
	
	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}
	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	/**
	 * @return the serviceDesc
	 */
	public String getServiceDesc() {
		return serviceDesc;
	}
	/**
	 * @param serviceDesc the serviceDesc to set
	 */
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	/**
	 * @return the serviceSubnamesBeanList
	 */
	public List<ServiceSubnamesBean> getServiceSubnamesBeanList() {
		return serviceSubnamesBeanList;
	}
	/**
	 * @param serviceSubnamesBeanList the serviceSubnamesBeanList to set
	 */
	public void setServiceSubnamesBeanList(
			List<ServiceSubnamesBean> serviceSubnamesBeanList) {
		this.serviceSubnamesBeanList = serviceSubnamesBeanList;
	}
	/**
	 * @return the activeFlag
	 */
	public String getActiveFlag() {
		return activeFlag;
	}
	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	

}
