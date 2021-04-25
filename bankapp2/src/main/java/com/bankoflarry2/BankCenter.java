package com.bankoflarry2;

import java.util.Scanner;

/*
Resource: "Java for students", Practice. Menu-Driven "bank account" application,
found: 04/25/2021, url: www.javaforstudents.co.uk/Practice/Bank_account
*/

public class BankCenter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int customerInput;
        boolean exit = false;
        double balance = 0.00;
        do {
            System.out.println("Welcome to Bank of Soularian!");
            System.out.println("=============================");
            System.out.println("1. Make a Deposit");
            System.out.println("2. Make a Withdrawal");
            System.out.println("3. Check Account Balance");
            System.out.println("Please choose between options or 0 to quit: ");
            customerInput = input.nextInt();
            switch (customerInput) {
                case 1:
                    // action will be to deposit funds
                    float cashAmount;
                    System.out.println("How much would you like to deposit? : ");
                    cashAmount = input.nextFloat();
                    if(cashAmount <= 0) {
                        System.out.println("Invalid deposit amount. Please try again.");
                    } else {
                        balance += cashAmount;
                        System.out.println("Amount deposited: " + cashAmount);
                        System.out.println("Current balance: $" + balance);
                        System.out.println("Thank you for Banking with us!");
                    }
                    break;
                case 2:
                    // action will be to withdraw funds
                    System.out.println("How much would you like to withdraw? : ");
                    cashAmount = input.nextFloat();
                    if(cashAmount <= 0 || cashAmount > balance) {
                        System.out.println("Insufficient funds. Please try again.");
                    } else {
                        balance -= cashAmount;
                        System.out.println("Amount withdrawn: " + cashAmount);
                        System.out.println("Current balance: $" + balance);
                        System.out.println("Thank you for Banking with us!");
                    }
                    break;
                case 3:
                    // action will be to check current balance
                    System.out.println("Your balance: $" + balance);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option entered. Please try again.");
            }
            System.out.println();
            if (customerInput == 0) {
                exit = true;
            }
        } while(!exit);
        System.out.println("Thank you for Visiting our Banking Center!");
    }
}
