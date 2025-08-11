package com.knot.Banking.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "transactions")
public class TransactionModel {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		
		@Column(name = "transaction_id")
		private Integer TransactionId;
		
		@Column(name = "account_id")
		private Integer AccountId;
		
		@Column(name = "transaction_date")
		private LocalDateTime TransactionDate;
		
		@Column(name = "transaction_amount")
		private Integer TransactionAmount;
		
		@Column(name = "closing_balance")
		private Integer ClosingBalance;
		
		@Column(name = "transaction_type")
		private Integer TransactionType;

		public TransactionModel() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TransactionModel(Integer transactionId, Integer accountId, LocalDateTime transactionDate,
				Integer transactionAmount, Integer closingBalance, Integer transactionType) {
			super();
			TransactionId = transactionId;
			AccountId = accountId;
			TransactionDate = transactionDate;
			TransactionAmount = transactionAmount;
			ClosingBalance = closingBalance;
			TransactionType = transactionType;
		}

		public Integer getTransactionId() {
			return TransactionId;
		}

		public void setTransactionId(Integer transactionId) {
			TransactionId = transactionId;
		}

		public Integer getAccountId() {
			return AccountId;
		}

		public void setAccountId(Integer accountId) {
			AccountId = accountId;
		}

		public LocalDateTime getTransactionDate() {
			return TransactionDate;
		}

		public void setTransactionDate(LocalDateTime transactionDate) {
			TransactionDate = transactionDate;
		}

		public Integer getTransactionAmount() {
			return TransactionAmount;
		}

		public void setTransactionAmount(Integer transactionAmount) {
			TransactionAmount = transactionAmount;
		}

		public Integer getClosingBalance() {
			return ClosingBalance;
		}

		public void setClosingBalance(Integer closingBalance) {
			ClosingBalance = closingBalance;
		}

		public Integer getTransactionType() {
			return TransactionType;
		}

		public void setTransactionType(Integer transactionType) {
			TransactionType = transactionType;
		}		
	
	

}
