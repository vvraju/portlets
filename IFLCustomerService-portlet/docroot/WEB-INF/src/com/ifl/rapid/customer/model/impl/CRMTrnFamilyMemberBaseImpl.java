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

import com.ifl.rapid.customer.model.CRMTrnFamilyMember;
import com.ifl.rapid.customer.service.CRMTrnFamilyMemberLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CRMTrnFamilyMember service. Represents a row in the &quot;CRM_Trn_FamilyMember&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CRMTrnFamilyMemberImpl}.
 * </p>
 *
 * @author Satya Kola
 * @see CRMTrnFamilyMemberImpl
 * @see com.ifl.rapid.customer.model.CRMTrnFamilyMember
 * @generated
 */
public abstract class CRMTrnFamilyMemberBaseImpl
	extends CRMTrnFamilyMemberModelImpl implements CRMTrnFamilyMember {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c r m trn family member model instance should use the {@link CRMTrnFamilyMember} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CRMTrnFamilyMemberLocalServiceUtil.addCRMTrnFamilyMember(this);
		}
		else {
			CRMTrnFamilyMemberLocalServiceUtil.updateCRMTrnFamilyMember(this);
		}
	}
}