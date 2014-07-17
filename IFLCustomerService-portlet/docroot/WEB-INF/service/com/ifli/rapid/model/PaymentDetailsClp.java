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

package com.ifli.rapid.model;

import com.ifli.rapid.service.ClpSerializer;
import com.ifli.rapid.service.PaymentDetailsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Satya Kola
 */
public class PaymentDetailsClp extends BaseModelImpl<PaymentDetails>
	implements PaymentDetails {
	public PaymentDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentDetails.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentDetails.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _PaymentId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPaymentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _PaymentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("PaymentId", getPaymentId());
		attributes.put("PremiumFrequencyID", getPremiumFrequencyID());
		attributes.put("TransactionStatusID", getTransactionStatusID());
		attributes.put("RequestTypeID", getRequestTypeID());
		attributes.put("PaymentOptionId", getPaymentOptionId());
		attributes.put("PaymentMethodID", getPaymentMethodID());
		attributes.put("ProductID", getProductID());
		attributes.put("ProposalId", getProposalId());
		attributes.put("PremiumAmount", getPremiumAmount());
		attributes.put("BankName", getBankName());
		attributes.put("CreditCardNo", getCreditCardNo());
		attributes.put("CardType", getCardType());
		attributes.put("NameAsCard", getNameAsCard());
		attributes.put("CVVNo", getCVVNo());
		attributes.put("CardExpiryDate", getCardExpiryDate());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("CreatedDate", getCreatedDate());
		attributes.put("ModifiedBy", getModifiedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ChequePickupRequestId", getChequePickupRequestId());
		attributes.put("TransactionReferenceNo", getTransactionReferenceNo());
		attributes.put("BillDeskMerchantId", getBillDeskMerchantId());
		attributes.put("BobMerchantTxnId", getBobMerchantTxnId());
		attributes.put("PaymentReceiptNo", getPaymentReceiptNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer PaymentId = (Integer)attributes.get("PaymentId");

		if (PaymentId != null) {
			setPaymentId(PaymentId);
		}

		String PremiumFrequencyID = (String)attributes.get("PremiumFrequencyID");

		if (PremiumFrequencyID != null) {
			setPremiumFrequencyID(PremiumFrequencyID);
		}

		Integer TransactionStatusID = (Integer)attributes.get(
				"TransactionStatusID");

		if (TransactionStatusID != null) {
			setTransactionStatusID(TransactionStatusID);
		}

		String RequestTypeID = (String)attributes.get("RequestTypeID");

		if (RequestTypeID != null) {
			setRequestTypeID(RequestTypeID);
		}

		String PaymentOptionId = (String)attributes.get("PaymentOptionId");

		if (PaymentOptionId != null) {
			setPaymentOptionId(PaymentOptionId);
		}

		String PaymentMethodID = (String)attributes.get("PaymentMethodID");

		if (PaymentMethodID != null) {
			setPaymentMethodID(PaymentMethodID);
		}

		String ProductID = (String)attributes.get("ProductID");

		if (ProductID != null) {
			setProductID(ProductID);
		}

		String ProposalId = (String)attributes.get("ProposalId");

		if (ProposalId != null) {
			setProposalId(ProposalId);
		}

		Double PremiumAmount = (Double)attributes.get("PremiumAmount");

		if (PremiumAmount != null) {
			setPremiumAmount(PremiumAmount);
		}

		String BankName = (String)attributes.get("BankName");

		if (BankName != null) {
			setBankName(BankName);
		}

		Long CreditCardNo = (Long)attributes.get("CreditCardNo");

		if (CreditCardNo != null) {
			setCreditCardNo(CreditCardNo);
		}

		String CardType = (String)attributes.get("CardType");

		if (CardType != null) {
			setCardType(CardType);
		}

		String NameAsCard = (String)attributes.get("NameAsCard");

		if (NameAsCard != null) {
			setNameAsCard(NameAsCard);
		}

		Integer CVVNo = (Integer)attributes.get("CVVNo");

		if (CVVNo != null) {
			setCVVNo(CVVNo);
		}

		Date CardExpiryDate = (Date)attributes.get("CardExpiryDate");

		if (CardExpiryDate != null) {
			setCardExpiryDate(CardExpiryDate);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ChequePickupRequestId = (String)attributes.get(
				"ChequePickupRequestId");

		if (ChequePickupRequestId != null) {
			setChequePickupRequestId(ChequePickupRequestId);
		}

		String TransactionReferenceNo = (String)attributes.get(
				"TransactionReferenceNo");

		if (TransactionReferenceNo != null) {
			setTransactionReferenceNo(TransactionReferenceNo);
		}

		String BillDeskMerchantId = (String)attributes.get("BillDeskMerchantId");

		if (BillDeskMerchantId != null) {
			setBillDeskMerchantId(BillDeskMerchantId);
		}

		String BobMerchantTxnId = (String)attributes.get("BobMerchantTxnId");

		if (BobMerchantTxnId != null) {
			setBobMerchantTxnId(BobMerchantTxnId);
		}

		Long PaymentReceiptNo = (Long)attributes.get("PaymentReceiptNo");

		if (PaymentReceiptNo != null) {
			setPaymentReceiptNo(PaymentReceiptNo);
		}
	}

	@Override
	public int getPaymentId() {
		return _PaymentId;
	}

	@Override
	public void setPaymentId(int PaymentId) {
		_PaymentId = PaymentId;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentId", int.class);

				method.invoke(_paymentDetailsRemoteModel, PaymentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPremiumFrequencyID() {
		return _PremiumFrequencyID;
	}

	@Override
	public void setPremiumFrequencyID(String PremiumFrequencyID) {
		_PremiumFrequencyID = PremiumFrequencyID;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumFrequencyID",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, PremiumFrequencyID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTransactionStatusID() {
		return _TransactionStatusID;
	}

	@Override
	public void setTransactionStatusID(int TransactionStatusID) {
		_TransactionStatusID = TransactionStatusID;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTransactionStatusID",
						int.class);

				method.invoke(_paymentDetailsRemoteModel, TransactionStatusID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestTypeID() {
		return _RequestTypeID;
	}

	@Override
	public void setRequestTypeID(String RequestTypeID) {
		_RequestTypeID = RequestTypeID;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestTypeID", String.class);

				method.invoke(_paymentDetailsRemoteModel, RequestTypeID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentOptionId() {
		return _PaymentOptionId;
	}

	@Override
	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptionId",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, PaymentOptionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentMethodID() {
		return _PaymentMethodID;
	}

	@Override
	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentMethodID",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, PaymentMethodID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductID() {
		return _ProductID;
	}

	@Override
	public void setProductID(String ProductID) {
		_ProductID = ProductID;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setProductID", String.class);

				method.invoke(_paymentDetailsRemoteModel, ProductID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProposalId() {
		return _ProposalId;
	}

	@Override
	public void setProposalId(String ProposalId) {
		_ProposalId = ProposalId;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setProposalId", String.class);

				method.invoke(_paymentDetailsRemoteModel, ProposalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPremiumAmount", double.class);

				method.invoke(_paymentDetailsRemoteModel, PremiumAmount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankName() {
		return _BankName;
	}

	@Override
	public void setBankName(String BankName) {
		_BankName = BankName;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBankName", String.class);

				method.invoke(_paymentDetailsRemoteModel, BankName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreditCardNo() {
		return _CreditCardNo;
	}

	@Override
	public void setCreditCardNo(long CreditCardNo) {
		_CreditCardNo = CreditCardNo;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreditCardNo", long.class);

				method.invoke(_paymentDetailsRemoteModel, CreditCardNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCardType() {
		return _CardType;
	}

	@Override
	public void setCardType(String CardType) {
		_CardType = CardType;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCardType", String.class);

				method.invoke(_paymentDetailsRemoteModel, CardType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameAsCard() {
		return _NameAsCard;
	}

	@Override
	public void setNameAsCard(String NameAsCard) {
		_NameAsCard = NameAsCard;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setNameAsCard", String.class);

				method.invoke(_paymentDetailsRemoteModel, NameAsCard);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCVVNo() {
		return _CVVNo;
	}

	@Override
	public void setCVVNo(int CVVNo) {
		_CVVNo = CVVNo;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCVVNo", int.class);

				method.invoke(_paymentDetailsRemoteModel, CVVNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCardExpiryDate() {
		return _CardExpiryDate;
	}

	@Override
	public void setCardExpiryDate(Date CardExpiryDate) {
		_CardExpiryDate = CardExpiryDate;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCardExpiryDate", Date.class);

				method.invoke(_paymentDetailsRemoteModel, CardExpiryDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _CreatedBy;
	}

	@Override
	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_paymentDetailsRemoteModel, CreatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_paymentDetailsRemoteModel, CreatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _ModifiedBy;
	}

	@Override
	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_paymentDetailsRemoteModel, ModifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentDetailsRemoteModel, ModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChequePickupRequestId() {
		return _ChequePickupRequestId;
	}

	@Override
	public void setChequePickupRequestId(String ChequePickupRequestId) {
		_ChequePickupRequestId = ChequePickupRequestId;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setChequePickupRequestId",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, ChequePickupRequestId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransactionReferenceNo() {
		return _TransactionReferenceNo;
	}

	@Override
	public void setTransactionReferenceNo(String TransactionReferenceNo) {
		_TransactionReferenceNo = TransactionReferenceNo;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTransactionReferenceNo",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, TransactionReferenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBillDeskMerchantId() {
		return _BillDeskMerchantId;
	}

	@Override
	public void setBillDeskMerchantId(String BillDeskMerchantId) {
		_BillDeskMerchantId = BillDeskMerchantId;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBillDeskMerchantId",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, BillDeskMerchantId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBobMerchantTxnId() {
		return _BobMerchantTxnId;
	}

	@Override
	public void setBobMerchantTxnId(String BobMerchantTxnId) {
		_BobMerchantTxnId = BobMerchantTxnId;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBobMerchantTxnId",
						String.class);

				method.invoke(_paymentDetailsRemoteModel, BobMerchantTxnId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPaymentReceiptNo() {
		return _PaymentReceiptNo;
	}

	@Override
	public void setPaymentReceiptNo(long PaymentReceiptNo) {
		_PaymentReceiptNo = PaymentReceiptNo;

		if (_paymentDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _paymentDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentReceiptNo",
						long.class);

				method.invoke(_paymentDetailsRemoteModel, PaymentReceiptNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentDetailsRemoteModel() {
		return _paymentDetailsRemoteModel;
	}

	public void setPaymentDetailsRemoteModel(
		BaseModel<?> paymentDetailsRemoteModel) {
		_paymentDetailsRemoteModel = paymentDetailsRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _paymentDetailsRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_paymentDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentDetailsLocalServiceUtil.addPaymentDetails(this);
		}
		else {
			PaymentDetailsLocalServiceUtil.updatePaymentDetails(this);
		}
	}

	@Override
	public PaymentDetails toEscapedModel() {
		return (PaymentDetails)ProxyUtil.newProxyInstance(PaymentDetails.class.getClassLoader(),
			new Class[] { PaymentDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentDetailsClp clone = new PaymentDetailsClp();

		clone.setPaymentId(getPaymentId());
		clone.setPremiumFrequencyID(getPremiumFrequencyID());
		clone.setTransactionStatusID(getTransactionStatusID());
		clone.setRequestTypeID(getRequestTypeID());
		clone.setPaymentOptionId(getPaymentOptionId());
		clone.setPaymentMethodID(getPaymentMethodID());
		clone.setProductID(getProductID());
		clone.setProposalId(getProposalId());
		clone.setPremiumAmount(getPremiumAmount());
		clone.setBankName(getBankName());
		clone.setCreditCardNo(getCreditCardNo());
		clone.setCardType(getCardType());
		clone.setNameAsCard(getNameAsCard());
		clone.setCVVNo(getCVVNo());
		clone.setCardExpiryDate(getCardExpiryDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setChequePickupRequestId(getChequePickupRequestId());
		clone.setTransactionReferenceNo(getTransactionReferenceNo());
		clone.setBillDeskMerchantId(getBillDeskMerchantId());
		clone.setBobMerchantTxnId(getBobMerchantTxnId());
		clone.setPaymentReceiptNo(getPaymentReceiptNo());

		return clone;
	}

	@Override
	public int compareTo(PaymentDetails paymentDetails) {
		int primaryKey = paymentDetails.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentDetailsClp)) {
			return false;
		}

		PaymentDetailsClp paymentDetails = (PaymentDetailsClp)obj;

		int primaryKey = paymentDetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{PaymentId=");
		sb.append(getPaymentId());
		sb.append(", PremiumFrequencyID=");
		sb.append(getPremiumFrequencyID());
		sb.append(", TransactionStatusID=");
		sb.append(getTransactionStatusID());
		sb.append(", RequestTypeID=");
		sb.append(getRequestTypeID());
		sb.append(", PaymentOptionId=");
		sb.append(getPaymentOptionId());
		sb.append(", PaymentMethodID=");
		sb.append(getPaymentMethodID());
		sb.append(", ProductID=");
		sb.append(getProductID());
		sb.append(", ProposalId=");
		sb.append(getProposalId());
		sb.append(", PremiumAmount=");
		sb.append(getPremiumAmount());
		sb.append(", BankName=");
		sb.append(getBankName());
		sb.append(", CreditCardNo=");
		sb.append(getCreditCardNo());
		sb.append(", CardType=");
		sb.append(getCardType());
		sb.append(", NameAsCard=");
		sb.append(getNameAsCard());
		sb.append(", CVVNo=");
		sb.append(getCVVNo());
		sb.append(", CardExpiryDate=");
		sb.append(getCardExpiryDate());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append(", ModifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", ModifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ChequePickupRequestId=");
		sb.append(getChequePickupRequestId());
		sb.append(", TransactionReferenceNo=");
		sb.append(getTransactionReferenceNo());
		sb.append(", BillDeskMerchantId=");
		sb.append(getBillDeskMerchantId());
		sb.append(", BobMerchantTxnId=");
		sb.append(getBobMerchantTxnId());
		sb.append(", PaymentReceiptNo=");
		sb.append(getPaymentReceiptNo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("com.ifli.rapid.model.PaymentDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>PaymentId</column-name><column-value><![CDATA[");
		sb.append(getPaymentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumFrequencyID</column-name><column-value><![CDATA[");
		sb.append(getPremiumFrequencyID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TransactionStatusID</column-name><column-value><![CDATA[");
		sb.append(getTransactionStatusID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RequestTypeID</column-name><column-value><![CDATA[");
		sb.append(getRequestTypeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentOptionId</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentMethodID</column-name><column-value><![CDATA[");
		sb.append(getPaymentMethodID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProductID</column-name><column-value><![CDATA[");
		sb.append(getProductID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProposalId</column-name><column-value><![CDATA[");
		sb.append(getProposalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PremiumAmount</column-name><column-value><![CDATA[");
		sb.append(getPremiumAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BankName</column-name><column-value><![CDATA[");
		sb.append(getBankName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreditCardNo</column-name><column-value><![CDATA[");
		sb.append(getCreditCardNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CardType</column-name><column-value><![CDATA[");
		sb.append(getCardType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NameAsCard</column-name><column-value><![CDATA[");
		sb.append(getNameAsCard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CVVNo</column-name><column-value><![CDATA[");
		sb.append(getCVVNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CardExpiryDate</column-name><column-value><![CDATA[");
		sb.append(getCardExpiryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ChequePickupRequestId</column-name><column-value><![CDATA[");
		sb.append(getChequePickupRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TransactionReferenceNo</column-name><column-value><![CDATA[");
		sb.append(getTransactionReferenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BillDeskMerchantId</column-name><column-value><![CDATA[");
		sb.append(getBillDeskMerchantId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BobMerchantTxnId</column-name><column-value><![CDATA[");
		sb.append(getBobMerchantTxnId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PaymentReceiptNo</column-name><column-value><![CDATA[");
		sb.append(getPaymentReceiptNo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _PaymentId;
	private String _PremiumFrequencyID;
	private int _TransactionStatusID;
	private String _RequestTypeID;
	private String _PaymentOptionId;
	private String _PaymentMethodID;
	private String _ProductID;
	private String _ProposalId;
	private double _PremiumAmount;
	private String _BankName;
	private long _CreditCardNo;
	private String _CardType;
	private String _NameAsCard;
	private int _CVVNo;
	private Date _CardExpiryDate;
	private String _CreatedBy;
	private Date _CreatedDate;
	private String _ModifiedBy;
	private Date _ModifiedDate;
	private String _ChequePickupRequestId;
	private String _TransactionReferenceNo;
	private String _BillDeskMerchantId;
	private String _BobMerchantTxnId;
	private long _PaymentReceiptNo;
	private BaseModel<?> _paymentDetailsRemoteModel;
}