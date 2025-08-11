package com.knot.bb;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Acs{
    List<Transaction> transactionHistory=new ArrayList<>();
    //methods or functions in account service
    public void withdrawMenu(Scanner sc,Account account){
        System.out.println("1.Savings");
        System.out.println("2.Credit");
        System.out.println("Enter your account type: ");
        int accountType=sc.nextInt();
        if(accountType== 1 && account.getAccountType().equalsIgnoreCase("savings")){
            withdrawSavings(sc,account);
        }
        else if(accountType== 2 && account.getAccountType().equalsIgnoreCase("credit")){
            withdrawCredit(sc,account);
        }
        else{
            System.out.println("Sorry You Chose the Wrong Option");
        }

    }
    public void withdrawSavings(Scanner sc,Account account){
        System.out.print("Enter the amount to be withdrawn....");
        int amount=sc.nextInt();
        if(amount<=account.getBalance()){
        	double change= account.getBalance();
            change-=amount;
            account.setBalance(change);
            System.out.println("Drawing Cash "+ amount);
            System.out.println("Available Balance: "+account.getBalance());
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void withdrawCredit(Scanner sc,Account account){
        System.out.print("Enter the amount to be withdrawn....");
        int creditAmount=sc.nextInt();
        if(creditAmount<=account.getCreditLimit()){
        	double change=account.getCreditLimit();
        	change-=creditAmount;        	
            account.setCreditLimit(change);
            System.out.println("Drawing Cash "+ creditAmount);
            System.out.println("Available Balance: "+account.getCreditLimit());
        }
        else{
            System.out.println("Credit exceeded");
        }
    }
    public void deposit(Scanner sc,Account account){
        System.out.print("Enter amount to be deposited: ");
        int money=sc.nextInt();
        double change=account.getBalance();
        change+=money;
        account.setBalance(change);
        System.out.println("New Balance: "+account.getBalance());
    }
    public void showBalance(Account account){
        System.out.println("Balance: "+account.getBalance());
    }
    public void printTransactionHistory(){

    }
}