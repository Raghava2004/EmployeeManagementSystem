package com.knot.Banking.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transactions")
public class TransactionModel {
	@Id
	@Column(name = "transaction_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;
	@Column(name = "account_id")
	private Integer accountId;
	@Column(name = "transaction_date")
	private LocalDate transactionDate;
	@Column(name = "transaction_amount")
	private Integer transactionAmount;
	@Column(name = "closing_balance")
	private Integer closingBalance;
	@Column(name = "transaction_type")
	private String transactionType;
	public TransactionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionModel(Integer transactionId, Integer accountId, LocalDate transactionDate,
			Integer transactionAmount, Integer closingBalance, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.closingBalance = closingBalance;
		this.transactionType = transactionType;
	}
	public TransactionModel(Integer withDrawalAmount, Integer accountBalance, Integer accountId2, String string) {
		// TODO Auto-generated constructor stub
		this.accountId=accountId2;
		this.closingBalance=accountBalance;
		this.transactionAmount=withDrawalAmount;
		this.transactionDate=LocalDate.now();
		this.transactionType=string;
	}

	/*
	 * public TransactionModel(BigDecimal depositAmount, BigDecimal accountBalance,
	 * Integer accountId2, String string) { // TODO Auto-generated constructor stub
	 * this.accountId=accountId2;
	 * this.closingBalance=Integer.valueOf(accountBalance);
	 * this.transactionAmount=Integer.valueOf(depositAmount);
	 * this.transactionDate=LocalDate.now(); this.transactionType=string; }
	 */
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Integer getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Integer getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(Integer closingBalance) {
		this.closingBalance = closingBalance;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	

}
