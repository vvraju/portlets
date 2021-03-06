/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.ifli.rapid.model.impl;

import com.ifli.rapid.model.PolicyFundSwitchCounter;
import com.ifli.rapid.service.PolicyFundSwitchCounterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PolicyFundSwitchCounter service. Represents a row in the &quot;policy_fund_switch_counter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PolicyFundSwitchCounterImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see PolicyFundSwitchCounterImpl
 * @see com.ifli.rapid.model.PolicyFundSwitchCounter
 * @generated
 */
public abstract class PolicyFundSwitchCounterBaseImpl
	extends PolicyFundSwitchCounterModelImpl implements PolicyFundSwitchCounter {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a policy fund switch counter model instance should use the {@link PolicyFundSwitchCounter} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PolicyFundSwitchCounterLocalServiceUtil.addPolicyFundSwitchCounter(this);
		}
		else {
			PolicyFundSwitchCounterLocalServiceUtil.updatePolicyFundSwitchCounter(this);
		}
	}
}