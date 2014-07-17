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

import com.ifli.rapid.model.PaymentDetails;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentDetails in entity cache.
 *
 * @author Satya Kola
 * @see PaymentDetails
 * @generated
 */
public class PaymentDetailsCacheModel implements CacheModel<PaymentDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{PaymentId=");
		sb.append(PaymentId);
		sb.append(", PremiumFrequencyID=");
		sb.append(PremiumFrequencyID);
		sb.append(", TransactionStatusID=");
		sb.append(TransactionStatusID);
		sb.append(", RequestTypeID=");
		sb.append(RequestTypeID);
		sb.append(", PaymentOptionId=");
		sb.append(PaymentOptionId);
		sb.append(", PaymentMethodID=");
		sb.append(PaymentMethodID);
		sb.append(", ProductID=");
		sb.append(ProductID);
		sb.append(", ProposalId=");
		sb.append(ProposalId);
		sb.append(", PremiumAmount=");
		sb.append(PremiumAmount);
		sb.append(", BankName=");
		sb.append(BankName);
		sb.append(", CreditCardNo=");
		sb.append(CreditCardNo);
		sb.append(", CardType=");
		sb.append(CardType);
		sb.append(", NameAsCard=");
		sb.append(NameAsCard);
		sb.append(", CVVNo=");
		sb.append(CVVNo);
		sb.append(", CardExpiryDate=");
		sb.append(CardExpiryDate);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", CreatedDate=");
		sb.append(CreatedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", ChequePickupRequestId=");
		sb.append(ChequePickupRequestId);
		sb.append(", TransactionReferenceNo=");
		sb.append(TransactionReferenceNo);
		sb.append(", BillDeskMerchantId=");
		sb.append(BillDeskMerchantId);
		sb.append(", BobMerchantTxnId=");
		sb.append(BobMerchantTxnId);
		sb.append(", PaymentReceiptNo=");
		sb.append(PaymentReceiptNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentDetails toEntityModel() {
		PaymentDetailsImpl paymentDetailsImpl = new PaymentDetailsImpl();

		paymentDetailsImpl.setPaymentId(PaymentId);

		if (PremiumFrequencyID == null) {
			paymentDetailsImpl.setPremiumFrequencyID(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setPremiumFrequencyID(PremiumFrequencyID);
		}

		paymentDetailsImpl.setTransactionStatusID(TransactionStatusID);

		if (RequestTypeID == null) {
			paymentDetailsImpl.setRequestTypeID(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setRequestTypeID(RequestTypeID);
		}

		if (PaymentOptionId == null) {
			paymentDetailsImpl.setPaymentOptionId(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setPaymentOptionId(PaymentOptionId);
		}

		if (PaymentMethodID == null) {
			paymentDetailsImpl.setPaymentMethodID(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setPaymentMethodID(PaymentMethodID);
		}

		if (ProductID == null) {
			paymentDetailsImpl.setProductID(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setProductID(ProductID);
		}

		if (ProposalId == null) {
			paymentDetailsImpl.setProposalId(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setProposalId(ProposalId);
		}

		paymentDetailsImpl.setPremiumAmount(PremiumAmount);

		if (BankName == null) {
			paymentDetailsImpl.setBankName(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setBankName(BankName);
		}

		paymentDetailsImpl.setCreditCardNo(CreditCardNo);

		if (CardType == null) {
			paymentDetailsImpl.setCardType(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setCardType(CardType);
		}

		if (NameAsCard == null) {
			paymentDetailsImpl.setNameAsCard(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setNameAsCard(NameAsCard);
		}

		paymentDetailsImpl.setCVVNo(CVVNo);

		if (CardExpiryDate == Long.MIN_VALUE) {
			paymentDetailsImpl.setCardExpiryDate(null);
		}
		else {
			paymentDetailsImpl.setCardExpiryDate(new Date(CardExpiryDate));
		}

		if (CreatedBy == null) {
			paymentDetailsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setCreatedBy(CreatedBy);
		}

		if (CreatedDate == Long.MIN_VALUE) {
			paymentDetailsImpl.setCreatedDate(null);
		}
		else {
			paymentDetailsImpl.setCreatedDate(new Date(CreatedDate));
		}

		if (ModifiedBy == null) {
			paymentDetailsImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setModifiedBy(ModifiedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			paymentDetailsImpl.setModifiedDate(null);
		}
		else {
			paymentDetailsImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ChequePickupRequestId == null) {
			paymentDetailsImpl.setChequePickupRequestId(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setChequePickupRequestId(ChequePickupRequestId);
		}

		if (TransactionReferenceNo == null) {
			paymentDetailsImpl.setTransactionReferenceNo(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setTransactionReferenceNo(TransactionReferenceNo);
		}

		if (BillDeskMerchantId == null) {
			paymentDetailsImpl.setBillDeskMerchantId(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setBillDeskMerchantId(BillDeskMerchantId);
		}

		if (BobMerchantTxnId == null) {
			paymentDetailsImpl.setBobMerchantTxnId(StringPool.BLANK);
		}
		else {
			paymentDetailsImpl.setBobMerchantTxnId(BobMerchantTxnId);
		}

		paymentDetailsImpl.setPaymentReceiptNo(PaymentReceiptNo);

		paymentDetailsImpl.resetOriginalValues();

		return paymentDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		PaymentId = objectInput.readInt();
		PremiumFrequencyID = objectInput.readUTF();
		TransactionStatusID = objectInput.readInt();
		RequestTypeID = objectInput.readUTF();
		PaymentOptionId = objectInput.readUTF();
		PaymentMethodID = objectInput.readUTF();
		ProductID = objectInput.readUTF();
		ProposalId = objectInput.readUTF();
		PremiumAmount = objectInput.readDouble();
		BankName = objectInput.readUTF();
		CreditCardNo = objectInput.readLong();
		CardType = objectInput.readUTF();
		NameAsCard = objectInput.readUTF();
		CVVNo = objectInput.readInt();
		CardExpiryDate = objectInput.readLong();
		CreatedBy = objectInput.readUTF();
		CreatedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		ChequePickupRequestId = objectInput.readUTF();
		TransactionReferenceNo = objectInput.readUTF();
		BillDeskMerchantId = objectInput.readUTF();
		BobMerchantTxnId = objectInput.readUTF();
		PaymentReceiptNo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(PaymentId);

		if (PremiumFrequencyID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PremiumFrequencyID);
		}

		objectOutput.writeInt(TransactionStatusID);

		if (RequestTypeID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RequestTypeID);
		}

		if (PaymentOptionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentOptionId);
		}

		if (PaymentMethodID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PaymentMethodID);
		}

		if (ProductID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProductID);
		}

		if (ProposalId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProposalId);
		}

		objectOutput.writeDouble(PremiumAmount);

		if (BankName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BankName);
		}

		objectOutput.writeLong(CreditCardNo);

		if (CardType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CardType);
		}

		if (NameAsCard == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NameAsCard);
		}

		objectOutput.writeInt(CVVNo);
		objectOutput.writeLong(CardExpiryDate);

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(CreatedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}

		objectOutput.writeLong(ModifiedDate);

		if (ChequePickupRequestId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ChequePickupRequestId);
		}

		if (TransactionReferenceNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TransactionReferenceNo);
		}

		if (BillDeskMerchantId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BillDeskMerchantId);
		}

		if (BobMerchantTxnId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(BobMerchantTxnId);
		}

		objectOutput.writeLong(PaymentReceiptNo);
	}

	public int PaymentId;
	public String PremiumFrequencyID;
	public int TransactionStatusID;
	public String RequestTypeID;
	public String PaymentOptionId;
	public String PaymentMethodID;
	public String ProductID;
	public String ProposalId;
	public double PremiumAmount;
	public String BankName;
	public long CreditCardNo;
	public String CardType;
	public String NameAsCard;
	public int CVVNo;
	public long CardExpiryDate;
	public String CreatedBy;
	public long CreatedDate;
	public String ModifiedBy;
	public long ModifiedDate;
	public String ChequePickupRequestId;
	public String TransactionReferenceNo;
	public String BillDeskMerchantId;
	public String BobMerchantTxnId;
	public long PaymentReceiptNo;
}