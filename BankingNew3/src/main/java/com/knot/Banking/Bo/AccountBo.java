package com.knot.Banking.Bo;

import com.knot.Banking.Model.AccountModel;

public class AccountBo {
	private String accountType;
	private String accountBalance;
	private TransactionBo transactionBo;
	private CardsBo cardsBo;
	public AccountBo() {
		super();
	}
	public AccountBo(String accountType, String accountBalance) {
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public AccountBo(AccountModel account) {
		this.accountType=account.getAccountType();
		this.accountBalance=account.getAccountBalance().toString();
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public TransactionBo getTransactionBo() {
		return transactionBo;
	}
	public void setTransactionBo(TransactionBo transactionBo) {
		this.transactionBo = transactionBo;
	}
	public CardsBo getCardsBo() {
		return cardsBo;
	}
	public void setCardsBo(CardsBo cardsBo) {
		this.cardsBo = cardsBo;
	} 

}
