/**
 * 
 */
package com.ifli.rapid.services.helper.beans;

import java.util.List;

/**
 * @author Subba Rao Ch
 * 
 */
public class FundSwitchFromToHelper {

	private FundSwitchFromTo fundFrom;

	private List<FundSwitchFromTo> fundTo;

	/**
	 * @return the fundFrom
	 */
	public FundSwitchFromTo getFundFrom() {
		return fundFrom;
	}

	/**
	 * @param fundFrom the fundFrom to set
	 */
	public void setFundFrom(FundSwitchFromTo fundFrom) {
		this.fundFrom = fundFrom;
	}

	/**
	 * @return the fundTo
	 */
	public List<FundSwitchFromTo> getFundTo() {
		return fundTo;
	}

	/**
	 * @param fundTo the fundTo to set
	 */
	public void setFundTo(List<FundSwitchFromTo> fundTo) {
		this.fundTo = fundTo;
	}
}
