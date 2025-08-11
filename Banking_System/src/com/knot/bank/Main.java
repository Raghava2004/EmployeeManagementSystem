package com.knot.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        int choice2=0;
        System.out.println("Welcome to ARM bank");
        System.out.println("Enter account details: ");
        
        System.out.println("Enter Name");
        String name= sc.nextLine();
      
        System.out.println("Enter Phone Number");
        String num= sc.nextLine();
        
        System.out.println("Enter Mail ID");
        String mail= sc.nextLine();

        Info user1=new Info(name,num,mail);
        List<Info> ll=new ArrayList<>();
        ll.add(user1);
        
        for(Info info:ll) {
        	System.out.println(info);
        }       

        Account account=new Account(user1.getName(),user1.getNum());// creating an object named account with a parameterized constructor(account number,account type)
        System.out.println("Login successful!!!!!");
        while (choice2!=97){
        System.out.println("How may we help you");
        System.out.println("Our services:");
        System.out.println("1. Withdrawal(Savings or Credit)");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Transaction History");
        System.out.print("Please enter your Service:");
        choice=sc.nextInt();
        switch(choice){ //performing different functions 
            case 1:
                Acs.withdrawMenu(sc,account); 
                break;
            case 2:
                Acs.deposit(sc,account);
                break;
            case 3:
                Acs.showBalance(account);
                break;
            case 4:
                Acs.printTransactionHistory();
                break;
            case 97:
                choice2=97;
                System.out.println("Exiting..........");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("Thank you");
        }
        sc.close();
}}