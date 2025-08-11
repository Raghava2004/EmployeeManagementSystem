package com.knot.Banking.Model;

import com.knot.Banking.Dto.AccountDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="accounts")
public class AccountModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="account_id")
	private Integer accountId;
	@Column(name="customer_id")
	private Integer customerId;
	@Column(name = "account_type")
	private String accountType;
	@Column (name="account_balance")
	private Integer accountBalance;
	
	
	
	
	public AccountModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountModel(Integer accountId, Integer customerId, String accountType, Integer accountBalance) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public AccountModel(AccountDto accountDto, Integer id) {
		this.customerId=id;
		this.accountBalance=Integer.valueOf(accountDto.getAccountBalance());
		this.accountType=accountDto.getAccountType();
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Integer getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
