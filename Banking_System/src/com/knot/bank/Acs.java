package com.knot.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Acs{
    static List<Transaction> transactionHistory=new ArrayList<>();
    //methods or functions in account service
    static void withdrawMenu(Scanner sc,Account account){
        System.out.println("1.Savings");
        System.out.println("2.Credit");
        System.out.println("Enter your account type: ");
        int accountType=sc.nextInt();
        if(accountType== 1 && account.accountType.equalsIgnoreCase("savings")){
            withdrawSavings(sc,account);
        }
        else if(accountType== 2 && account.accountType.equalsIgnoreCase("credit")){
            withdrawCredit(sc,account);
        }
        else{
            System.out.println("Sorry You Chose the Wrong Option");
        }

    }
    static void withdrawSavings(Scanner sc,Account account){
        System.out.print("Enter the amount to be withdrawn....");
        int amount=sc.nextInt();
        if(amount<=account.balance){
            account.balance-=amount;
            System.out.println("Drawing Cash "+ amount);
            System.out.println("Available Balance: "+account.balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    static void withdrawCredit(Scanner sc,Account account){
        System.out.print("Enter the amount to be withdrawn....");
        int creditAmount=sc.nextInt();
        if(creditAmount<=account.creditLimit){
            account.creditLimit-=creditAmount;
            System.out.println("Drawing Cash "+ creditAmount);
            System.out.println("Available Balance: "+account.creditLimit);
        }
        else{
            System.out.println("Credit exceeded");
        }
    }
    static void deposit(Scanner sc,Account account){
        System.out.print("Enter amount to be deposited: ");
        int money=sc.nextInt();
        account.balance+=money;
        System.out.println("New Balance: "+account.balance);
    }
    static void showBalance(Account account){
        System.out.println("Balance"+account.balance);
    }
    static void printTransactionHistory(){

    }
}