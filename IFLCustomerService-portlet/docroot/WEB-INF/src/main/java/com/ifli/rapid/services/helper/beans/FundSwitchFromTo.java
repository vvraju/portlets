/**
 * 
 */
package com.ifli.rapid.services.helper.beans;

/**
 * @author Subba Rao Ch
 * 
 */
public class FundSwitchFromTo {

	private String fundCode;

	private Double targetFundPercentage;

	/**
	 * @return the fundCode
	 */
	public String getFundCode() {
		return fundCode;
	}

	/**
	 * @param fundCode the fundCode to set
	 */
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	/**
	 * @return the targetFundPercentage
	 */
	public Double getTargetFundPercentage() {
		return targetFundPercentage;
	}

	/**
	 * @param targetFundPercentage the targetFundPercentage to set
	 */
	public void setTargetFundPercentage(Double targetFundPercentage) {
		this.targetFundPercentage = targetFundPercentage;
	}
}
