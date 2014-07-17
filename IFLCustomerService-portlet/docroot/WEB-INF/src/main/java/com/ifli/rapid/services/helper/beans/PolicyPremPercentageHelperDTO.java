package com.ifli.rapid.services.helper.beans;

import com.ifli.rapid.model.impl.PolicyPremPercentageImpl;
import com.ifli.rapid.model.impl.PolicyPremRedirectionDetailsImpl;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rajashekar Yedla
 *
 */
public class PolicyPremPercentageHelperDTO implements Serializable {

	private static final long serialVersionUID = -1276560100678234698L;
	private List<PolicyPremRedirectionDetailsImpl> policyPremRedirectionDetails;
	private List<PolicyPremPercentageImpl> policyPremPercentages;
	private String customerId;
	/**
	 * @return the policyPremRedirectionDetails
	 */
	public List<PolicyPremRedirectionDetailsImpl> getPolicyPremRedirectionDetails() {
		return policyPremRedirectionDetails;
	}
	/**
	 * @param policyPremRedirectionDetails the policyPremRedirectionDetails to set
	 */
	public void setPolicyPremRedirectionDetails(
			List<PolicyPremRedirectionDetailsImpl> policyPremRedirectionDetails) {
		this.policyPremRedirectionDetails = policyPremRedirectionDetails;
	}
	/**
	 * @return the policyPremPercentages
	 */
	public List<PolicyPremPercentageImpl> getPolicyPremPercentages() {
		return policyPremPercentages;
	}
	/**
	 * @param policyPremPercentages the policyPremPercentages to set
	 */
	public void setPolicyPremPercentages(
			List<PolicyPremPercentageImpl> policyPremPercentages) {
		this.policyPremPercentages = policyPremPercentages;
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
}
