package com.knot.Banking.Bo;

import com.knot.Banking.Model.TransactionModel;

public class TransactionBo {
	
	private String transactionId;

	private String accountId;

	private String transactionDate;

	private String transactionAmount;

	private String closingBalance;

	private String transactionType;

	public TransactionBo() {
		super();
	}

	public TransactionBo(String transactionId, String accountId, String transactionDate, String transactionAmount,
			String closingBalance, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.closingBalance = closingBalance;
		this.transactionType = transactionType;
	}

	public TransactionBo(TransactionModel singleResult) {
		this.transactionId=singleResult.getTransactionId().toString();
		this.accountId=singleResult.getAccountId().toString();
		this.transactionAmount=singleResult.getTransactionAmount().toString();
		this.transactionDate=singleResult.getTransactionDate().toString();
		this.closingBalance=singleResult.getClosingBalance().toString();
		this.transactionType=singleResult.getTransactionType();
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(String closingBalance) {
		this.closingBalance = closingBalance;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	

}
