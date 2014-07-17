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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentDetails}.
 * </p>
 *
 * @author Satya Kola
 * @see PaymentDetails
 * @generated
 */
public class PaymentDetailsWrapper implements PaymentDetails,
	ModelWrapper<PaymentDetails> {
	public PaymentDetailsWrapper(PaymentDetails paymentDetails) {
		_paymentDetails = paymentDetails;
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

	/**
	* Returns the primary key of this payment details.
	*
	* @return the primary key of this payment details
	*/
	@Override
	public int getPrimaryKey() {
		return _paymentDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment details.
	*
	* @param primaryKey the primary key of this payment details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_paymentDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the payment ID of this payment details.
	*
	* @return the payment ID of this payment details
	*/
	@Override
	public int getPaymentId() {
		return _paymentDetails.getPaymentId();
	}

	/**
	* Sets the payment ID of this payment details.
	*
	* @param PaymentId the payment ID of this payment details
	*/
	@Override
	public void setPaymentId(int PaymentId) {
		_paymentDetails.setPaymentId(PaymentId);
	}

	/**
	* Returns the premium frequency i d of this payment details.
	*
	* @return the premium frequency i d of this payment details
	*/
	@Override
	public java.lang.String getPremiumFrequencyID() {
		return _paymentDetails.getPremiumFrequencyID();
	}

	/**
	* Sets the premium frequency i d of this payment details.
	*
	* @param PremiumFrequencyID the premium frequency i d of this payment details
	*/
	@Override
	public void setPremiumFrequencyID(java.lang.String PremiumFrequencyID) {
		_paymentDetails.setPremiumFrequencyID(PremiumFrequencyID);
	}

	/**
	* Returns the transaction status i d of this payment details.
	*
	* @return the transaction status i d of this payment details
	*/
	@Override
	public int getTransactionStatusID() {
		return _paymentDetails.getTransactionStatusID();
	}

	/**
	* Sets the transaction status i d of this payment details.
	*
	* @param TransactionStatusID the transaction status i d of this payment details
	*/
	@Override
	public void setTransactionStatusID(int TransactionStatusID) {
		_paymentDetails.setTransactionStatusID(TransactionStatusID);
	}

	/**
	* Returns the request type i d of this payment details.
	*
	* @return the request type i d of this payment details
	*/
	@Override
	public java.lang.String getRequestTypeID() {
		return _paymentDetails.getRequestTypeID();
	}

	/**
	* Sets the request type i d of this payment details.
	*
	* @param RequestTypeID the request type i d of this payment details
	*/
	@Override
	public void setRequestTypeID(java.lang.String RequestTypeID) {
		_paymentDetails.setRequestTypeID(RequestTypeID);
	}

	/**
	* Returns the payment option ID of this payment details.
	*
	* @return the payment option ID of this payment details
	*/
	@Override
	public java.lang.String getPaymentOptionId() {
		return _paymentDetails.getPaymentOptionId();
	}

	/**
	* Sets the payment option ID of this payment details.
	*
	* @param PaymentOptionId the payment option ID of this payment details
	*/
	@Override
	public void setPaymentOptionId(java.lang.String PaymentOptionId) {
		_paymentDetails.setPaymentOptionId(PaymentOptionId);
	}

	/**
	* Returns the payment method i d of this payment details.
	*
	* @return the payment method i d of this payment details
	*/
	@Override
	public java.lang.String getPaymentMethodID() {
		return _paymentDetails.getPaymentMethodID();
	}

	/**
	* Sets the payment method i d of this payment details.
	*
	* @param PaymentMethodID the payment method i d of this payment details
	*/
	@Override
	public void setPaymentMethodID(java.lang.String PaymentMethodID) {
		_paymentDetails.setPaymentMethodID(PaymentMethodID);
	}

	/**
	* Returns the product i d of this payment details.
	*
	* @return the product i d of this payment details
	*/
	@Override
	public java.lang.String getProductID() {
		return _paymentDetails.getProductID();
	}

	/**
	* Sets the product i d of this payment details.
	*
	* @param ProductID the product i d of this payment details
	*/
	@Override
	public void setProductID(java.lang.String ProductID) {
		_paymentDetails.setProductID(ProductID);
	}

	/**
	* Returns the proposal ID of this payment details.
	*
	* @return the proposal ID of this payment details
	*/
	@Override
	public java.lang.String getProposalId() {
		return _paymentDetails.getProposalId();
	}

	/**
	* Sets the proposal ID of this payment details.
	*
	* @param ProposalId the proposal ID of this payment details
	*/
	@Override
	public void setProposalId(java.lang.String ProposalId) {
		_paymentDetails.setProposalId(ProposalId);
	}

	/**
	* Returns the premium amount of this payment details.
	*
	* @return the premium amount of this payment details
	*/
	@Override
	public double getPremiumAmount() {
		return _paymentDetails.getPremiumAmount();
	}

	/**
	* Sets the premium amount of this payment details.
	*
	* @param PremiumAmount the premium amount of this payment details
	*/
	@Override
	public void setPremiumAmount(double PremiumAmount) {
		_paymentDetails.setPremiumAmount(PremiumAmount);
	}

	/**
	* Returns the bank name of this payment details.
	*
	* @return the bank name of this payment details
	*/
	@Override
	public java.lang.String getBankName() {
		return _paymentDetails.getBankName();
	}

	/**
	* Sets the bank name of this payment details.
	*
	* @param BankName the bank name of this payment details
	*/
	@Override
	public void setBankName(java.lang.String BankName) {
		_paymentDetails.setBankName(BankName);
	}

	/**
	* Returns the credit card no of this payment details.
	*
	* @return the credit card no of this payment details
	*/
	@Override
	public long getCreditCardNo() {
		return _paymentDetails.getCreditCardNo();
	}

	/**
	* Sets the credit card no of this payment details.
	*
	* @param CreditCardNo the credit card no of this payment details
	*/
	@Override
	public void setCreditCardNo(long CreditCardNo) {
		_paymentDetails.setCreditCardNo(CreditCardNo);
	}

	/**
	* Returns the card type of this payment details.
	*
	* @return the card type of this payment details
	*/
	@Override
	public java.lang.String getCardType() {
		return _paymentDetails.getCardType();
	}

	/**
	* Sets the card type of this payment details.
	*
	* @param CardType the card type of this payment details
	*/
	@Override
	public void setCardType(java.lang.String CardType) {
		_paymentDetails.setCardType(CardType);
	}

	/**
	* Returns the name as card of this payment details.
	*
	* @return the name as card of this payment details
	*/
	@Override
	public java.lang.String getNameAsCard() {
		return _paymentDetails.getNameAsCard();
	}

	/**
	* Sets the name as card of this payment details.
	*
	* @param NameAsCard the name as card of this payment details
	*/
	@Override
	public void setNameAsCard(java.lang.String NameAsCard) {
		_paymentDetails.setNameAsCard(NameAsCard);
	}

	/**
	* Returns the c v v no of this payment details.
	*
	* @return the c v v no of this payment details
	*/
	@Override
	public int getCVVNo() {
		return _paymentDetails.getCVVNo();
	}

	/**
	* Sets the c v v no of this payment details.
	*
	* @param CVVNo the c v v no of this payment details
	*/
	@Override
	public void setCVVNo(int CVVNo) {
		_paymentDetails.setCVVNo(CVVNo);
	}

	/**
	* Returns the card expiry date of this payment details.
	*
	* @return the card expiry date of this payment details
	*/
	@Override
	public java.util.Date getCardExpiryDate() {
		return _paymentDetails.getCardExpiryDate();
	}

	/**
	* Sets the card expiry date of this payment details.
	*
	* @param CardExpiryDate the card expiry date of this payment details
	*/
	@Override
	public void setCardExpiryDate(java.util.Date CardExpiryDate) {
		_paymentDetails.setCardExpiryDate(CardExpiryDate);
	}

	/**
	* Returns the created by of this payment details.
	*
	* @return the created by of this payment details
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _paymentDetails.getCreatedBy();
	}

	/**
	* Sets the created by of this payment details.
	*
	* @param CreatedBy the created by of this payment details
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_paymentDetails.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the created date of this payment details.
	*
	* @return the created date of this payment details
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _paymentDetails.getCreatedDate();
	}

	/**
	* Sets the created date of this payment details.
	*
	* @param CreatedDate the created date of this payment details
	*/
	@Override
	public void setCreatedDate(java.util.Date CreatedDate) {
		_paymentDetails.setCreatedDate(CreatedDate);
	}

	/**
	* Returns the modified by of this payment details.
	*
	* @return the modified by of this payment details
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _paymentDetails.getModifiedBy();
	}

	/**
	* Sets the modified by of this payment details.
	*
	* @param ModifiedBy the modified by of this payment details
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_paymentDetails.setModifiedBy(ModifiedBy);
	}

	/**
	* Returns the modified date of this payment details.
	*
	* @return the modified date of this payment details
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentDetails.getModifiedDate();
	}

	/**
	* Sets the modified date of this payment details.
	*
	* @param ModifiedDate the modified date of this payment details
	*/
	@Override
	public void setModifiedDate(java.util.Date ModifiedDate) {
		_paymentDetails.setModifiedDate(ModifiedDate);
	}

	/**
	* Returns the cheque pickup request ID of this payment details.
	*
	* @return the cheque pickup request ID of this payment details
	*/
	@Override
	public java.lang.String getChequePickupRequestId() {
		return _paymentDetails.getChequePickupRequestId();
	}

	/**
	* Sets the cheque pickup request ID of this payment details.
	*
	* @param ChequePickupRequestId the cheque pickup request ID of this payment details
	*/
	@Override
	public void setChequePickupRequestId(java.lang.String ChequePickupRequestId) {
		_paymentDetails.setChequePickupRequestId(ChequePickupRequestId);
	}

	/**
	* Returns the transaction reference no of this payment details.
	*
	* @return the transaction reference no of this payment details
	*/
	@Override
	public java.lang.String getTransactionReferenceNo() {
		return _paymentDetails.getTransactionReferenceNo();
	}

	/**
	* Sets the transaction reference no of this payment details.
	*
	* @param TransactionReferenceNo the transaction reference no of this payment details
	*/
	@Override
	public void setTransactionReferenceNo(
		java.lang.String TransactionReferenceNo) {
		_paymentDetails.setTransactionReferenceNo(TransactionReferenceNo);
	}

	/**
	* Returns the bill desk merchant ID of this payment details.
	*
	* @return the bill desk merchant ID of this payment details
	*/
	@Override
	public java.lang.String getBillDeskMerchantId() {
		return _paymentDetails.getBillDeskMerchantId();
	}

	/**
	* Sets the bill desk merchant ID of this payment details.
	*
	* @param BillDeskMerchantId the bill desk merchant ID of this payment details
	*/
	@Override
	public void setBillDeskMerchantId(java.lang.String BillDeskMerchantId) {
		_paymentDetails.setBillDeskMerchantId(BillDeskMerchantId);
	}

	/**
	* Returns the bob merchant txn ID of this payment details.
	*
	* @return the bob merchant txn ID of this payment details
	*/
	@Override
	public java.lang.String getBobMerchantTxnId() {
		return _paymentDetails.getBobMerchantTxnId();
	}

	/**
	* Sets the bob merchant txn ID of this payment details.
	*
	* @param BobMerchantTxnId the bob merchant txn ID of this payment details
	*/
	@Override
	public void setBobMerchantTxnId(java.lang.String BobMerchantTxnId) {
		_paymentDetails.setBobMerchantTxnId(BobMerchantTxnId);
	}

	/**
	* Returns the payment receipt no of this payment details.
	*
	* @return the payment receipt no of this payment details
	*/
	@Override
	public long getPaymentReceiptNo() {
		return _paymentDetails.getPaymentReceiptNo();
	}

	/**
	* Sets the payment receipt no of this payment details.
	*
	* @param PaymentReceiptNo the payment receipt no of this payment details
	*/
	@Override
	public void setPaymentReceiptNo(long PaymentReceiptNo) {
		_paymentDetails.setPaymentReceiptNo(PaymentReceiptNo);
	}

	@Override
	public boolean isNew() {
		return _paymentDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentDetailsWrapper((PaymentDetails)_paymentDetails.clone());
	}

	@Override
	public int compareTo(com.ifli.rapid.model.PaymentDetails paymentDetails) {
		return _paymentDetails.compareTo(paymentDetails);
	}

	@Override
	public int hashCode() {
		return _paymentDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ifli.rapid.model.PaymentDetails> toCacheModel() {
		return _paymentDetails.toCacheModel();
	}

	@Override
	public com.ifli.rapid.model.PaymentDetails toEscapedModel() {
		return new PaymentDetailsWrapper(_paymentDetails.toEscapedModel());
	}

	@Override
	public com.ifli.rapid.model.PaymentDetails toUnescapedModel() {
		return new PaymentDetailsWrapper(_paymentDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentDetailsWrapper)) {
			return false;
		}

		PaymentDetailsWrapper paymentDetailsWrapper = (PaymentDetailsWrapper)obj;

		if (Validator.equals(_paymentDetails,
					paymentDetailsWrapper._paymentDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentDetails getWrappedPaymentDetails() {
		return _paymentDetails;
	}

	@Override
	public PaymentDetails getWrappedModel() {
		return _paymentDetails;
	}

	@Override
	public void resetOriginalValues() {
		_paymentDetails.resetOriginalValues();
	}

	private PaymentDetails _paymentDetails;
}