package com.knot.Banking.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class AccountModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private Integer AccountId;
	
	@Column(name = "customer_id")
	private Integer CustomerId;
	
	@Column(name = "account_type")
	private String AccountType;
	
	@Column(name = "account_balance")
	private Integer AccountBalance;

	public AccountModel() {
		super();
	}

	public AccountModel(Integer accountId, Integer customerId, String accountType, Integer accountBalance) {
		super();
		AccountId = accountId;
		CustomerId = customerId;
		AccountType = accountType;
		AccountBalance = accountBalance;
	}

	public Integer getAccountId() {
		return AccountId;
	}

	public void setAccountId(Integer accountId) {
		AccountId = accountId;
	}

	public Integer getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public Integer getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		AccountBalance = accountBalance;
	}
	
	
}
