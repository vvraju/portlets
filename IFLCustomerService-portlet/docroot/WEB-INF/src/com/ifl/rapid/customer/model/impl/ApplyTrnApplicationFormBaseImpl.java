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

package com.ifl.rapid.customer.model.impl;

import com.ifl.rapid.customer.model.ApplyTrnApplicationForm;
import com.ifl.rapid.customer.service.ApplyTrnApplicationFormLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ApplyTrnApplicationForm service. Represents a row in the &quot;Apply_Trn_ApplicationForm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ApplyTrnApplicationFormImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see ApplyTrnApplicationFormImpl
 * @see com.ifl.rapid.customer.model.ApplyTrnApplicationForm
 * @generated
 */
public abstract class ApplyTrnApplicationFormBaseImpl
	extends ApplyTrnApplicationFormModelImpl implements ApplyTrnApplicationForm {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a apply trn application form model instance should use the {@link ApplyTrnApplicationForm} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApplyTrnApplicationFormLocalServiceUtil.addApplyTrnApplicationForm(this);
		}
		else {
			ApplyTrnApplicationFormLocalServiceUtil.updateApplyTrnApplicationForm(this);
		}
	}
}