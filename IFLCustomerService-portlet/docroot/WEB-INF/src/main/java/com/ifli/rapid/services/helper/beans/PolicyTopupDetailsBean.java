/**
 * 
 */
package com.ifli.rapid.services.helper.beans;

import com.ifli.rapid.model.impl.PolicyTopupDetailsImpl;

import java.util.List;

/**
 * @author Subba Rao ch
 *
 */

public class PolicyTopupDetailsBean {
	List<PolicyTopupDetailsImpl> topupDetails;

	/**
	 * @return the topupDetails
	 */
	public List<PolicyTopupDetailsImpl> getTopupDetails() {
		return topupDetails;
	}

	/**
	 * @param topupDetails the topupDetails to set
	 */
	public void setTopupDetails(List<PolicyTopupDetailsImpl> topupDetails) {
		this.topupDetails = topupDetails;
	}
}
