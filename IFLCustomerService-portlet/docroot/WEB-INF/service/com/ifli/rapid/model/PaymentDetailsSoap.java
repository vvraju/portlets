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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Satya Kola
 * @generated
 */
public class PaymentDetailsSoap implements Serializable {
	public static PaymentDetailsSoap toSoapModel(PaymentDetails model) {
		PaymentDetailsSoap soapModel = new PaymentDetailsSoap();

		soapModel.setPaymentId(model.getPaymentId());
		soapModel.setPremiumFrequencyID(model.getPremiumFrequencyID());
		soapModel.setTransactionStatusID(model.getTransactionStatusID());
		soapModel.setRequestTypeID(model.getRequestTypeID());
		soapModel.setPaymentOptionId(model.getPaymentOptionId());
		soapModel.setPaymentMethodID(model.getPaymentMethodID());
		soapModel.setProductID(model.getProductID());
		soapModel.setProposalId(model.getProposalId());
		soapModel.setPremiumAmount(model.getPremiumAmount());
		soapModel.setBankName(model.getBankName());
		soapModel.setCreditCardNo(model.getCreditCardNo());
		soapModel.setCardType(model.getCardType());
		soapModel.setNameAsCard(model.getNameAsCard());
		soapModel.setCVVNo(model.getCVVNo());
		soapModel.setCardExpiryDate(model.getCardExpiryDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setChequePickupRequestId(model.getChequePickupRequestId());
		soapModel.setTransactionReferenceNo(model.getTransactionReferenceNo());
		soapModel.setBillDeskMerchantId(model.getBillDeskMerchantId());
		soapModel.setBobMerchantTxnId(model.getBobMerchantTxnId());
		soapModel.setPaymentReceiptNo(model.getPaymentReceiptNo());

		return soapModel;
	}

	public static PaymentDetailsSoap[] toSoapModels(PaymentDetails[] models) {
		PaymentDetailsSoap[] soapModels = new PaymentDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentDetailsSoap[][] toSoapModels(PaymentDetails[][] models) {
		PaymentDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentDetailsSoap[] toSoapModels(List<PaymentDetails> models) {
		List<PaymentDetailsSoap> soapModels = new ArrayList<PaymentDetailsSoap>(models.size());

		for (PaymentDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentDetailsSoap[soapModels.size()]);
	}

	public PaymentDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _PaymentId;
	}

	public void setPrimaryKey(int pk) {
		setPaymentId(pk);
	}

	public int getPaymentId() {
		return _PaymentId;
	}

	public void setPaymentId(int PaymentId) {
		_PaymentId = PaymentId;
	}

	public String getPremiumFrequencyID() {
		return _PremiumFrequencyID;
	}

	public void setPremiumFrequencyID(String PremiumFrequencyID) {
		_PremiumFrequencyID = PremiumFrequencyID;
	}

	public int getTransactionStatusID() {
		return _TransactionStatusID;
	}

	public void setTransactionStatusID(int TransactionStatusID) {
		_TransactionStatusID = TransactionStatusID;
	}

	public String getRequestTypeID() {
		return _RequestTypeID;
	}

	public void setRequestTypeID(String RequestTypeID) {
		_RequestTypeID = RequestTypeID;
	}

	public String getPaymentOptionId() {
		return _PaymentOptionId;
	}

	public void setPaymentOptionId(String PaymentOptionId) {
		_PaymentOptionId = PaymentOptionId;
	}

	public String getPaymentMethodID() {
		return _PaymentMethodID;
	}

	public void setPaymentMethodID(String PaymentMethodID) {
		_PaymentMethodID = PaymentMethodID;
	}

	public String getProductID() {
		return _ProductID;
	}

	public void setProductID(String ProductID) {
		_ProductID = ProductID;
	}

	public String getProposalId() {
		return _ProposalId;
	}

	public void setProposalId(String ProposalId) {
		_ProposalId = ProposalId;
	}

	public double getPremiumAmount() {
		return _PremiumAmount;
	}

	public void setPremiumAmount(double PremiumAmount) {
		_PremiumAmount = PremiumAmount;
	}

	public String getBankName() {
		return _BankName;
	}

	public void setBankName(String BankName) {
		_BankName = BankName;
	}

	public long getCreditCardNo() {
		return _CreditCardNo;
	}

	public void setCreditCardNo(long CreditCardNo) {
		_CreditCardNo = CreditCardNo;
	}

	public String getCardType() {
		return _CardType;
	}

	public void setCardType(String CardType) {
		_CardType = CardType;
	}

	public String getNameAsCard() {
		return _NameAsCard;
	}

	public void setNameAsCard(String NameAsCard) {
		_NameAsCard = NameAsCard;
	}

	public int getCVVNo() {
		return _CVVNo;
	}

	public void setCVVNo(int CVVNo) {
		_CVVNo = CVVNo;
	}

	public Date getCardExpiryDate() {
		return _CardExpiryDate;
	}

	public void setCardExpiryDate(Date CardExpiryDate) {
		_CardExpiryDate = CardExpiryDate;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public Date getCreatedDate() {
		return _CreatedDate;
	}

	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getChequePickupRequestId() {
		return _ChequePickupRequestId;
	}

	public void setChequePickupRequestId(String ChequePickupRequestId) {
		_ChequePickupRequestId = ChequePickupRequestId;
	}

	public String getTransactionReferenceNo() {
		return _TransactionReferenceNo;
	}

	public void setTransactionReferenceNo(String TransactionReferenceNo) {
		_TransactionReferenceNo = TransactionReferenceNo;
	}

	public String getBillDeskMerchantId() {
		return _BillDeskMerchantId;
	}

	public void setBillDeskMerchantId(String BillDeskMerchantId) {
		_BillDeskMerchantId = BillDeskMerchantId;
	}

	public String getBobMerchantTxnId() {
		return _BobMerchantTxnId;
	}

	public void setBobMerchantTxnId(String BobMerchantTxnId) {
		_BobMerchantTxnId = BobMerchantTxnId;
	}

	public long getPaymentReceiptNo() {
		return _PaymentReceiptNo;
	}

	public void setPaymentReceiptNo(long PaymentReceiptNo) {
		_PaymentReceiptNo = PaymentReceiptNo;
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
}