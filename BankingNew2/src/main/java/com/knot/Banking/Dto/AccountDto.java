package com.knot.Banking.Dto;

public class AccountDto {
	private String accountType;
	private String accountBalance;
	private CardsDto cards;
	public CardsDto getCards() {
		return cards;
	}
	public void setCards(CardsDto cards) {
		this.cards = cards;
	}
	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDto(String accountType, String accountBalance) {
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
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
	
	
}
