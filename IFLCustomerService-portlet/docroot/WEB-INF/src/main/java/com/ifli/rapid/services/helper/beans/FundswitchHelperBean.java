/**
 * 
 */
package com.ifli.rapid.services.helper.beans;

import java.util.List;

/**
 * @author Subba Rao Ch
 *
 */
public class FundswitchHelperBean {

	private String policyId;
	private String customerId;

	private List<FundSwitchFromToHelper> fundFromTo;

	/**
	 * @return the policyId
	 */
	public String getPolicyId() {
		return policyId;
	}

	/**
	 * @param policyId the policyId to set
	 */
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the fundFromTo
	 */
	public List<FundSwitchFromToHelper> getFundFromTo() {
		return fundFromTo;
	}

	/**
	 * @param fundFromTo the fundFromTo to set
	 */
	public void setFundFromTo(List<FundSwitchFromToHelper> fundFromTo) {
		this.fundFromTo = fundFromTo;
	}
}
