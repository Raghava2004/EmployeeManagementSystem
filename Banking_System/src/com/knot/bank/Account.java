package com.knot.bank;

class Account {
	String accountName;
	String phoneNum;
    String accountType;
    double balance;
    double creditLimit;
    
    Account(String accountName,String phoneNum){
        this.accountName=accountName;
        this.phoneNum=phoneNum;
        this.accountType=accountType; // getter for the bank type
        this.balance=accountType.equalsIgnoreCase("savings")?1000.0:0.0; // getter for bank balance
        this.creditLimit=accountType.equalsIgnoreCase("credit")?5000.0:0.0; // getter for credit card balance

    }

}

