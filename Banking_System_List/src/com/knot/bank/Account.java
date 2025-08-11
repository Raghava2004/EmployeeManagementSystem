package com.knot.bank;

class Account {
	private String accountName;
	private String phoneNum;
    private String accountType;
    private double balance;
    private double creditLimit;
    
    Account(String accountName,String phoneNum){
        this.accountName=accountName;
        this.phoneNum=phoneNum;
        this.accountType="credit"; // getter for the bank type

    }

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}

