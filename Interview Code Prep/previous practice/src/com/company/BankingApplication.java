package com.company;

import java.util.Scanner;
//This code developed by AI
class bankaccount {
    private String accountHolderName;
    private String accountId;
    private double balance;
    private double previousTransaction;
    public bankaccount(String name, String id) {
        accountHolderName = name;
        accountId = id;
        balance = 0;
        previousTransaction = 0;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
    public void showPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred.");
        }
    }
    public void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome, " + accountHolderName + "!");
            System.out.println("Your ID is: " + accountId);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("A: Check balance");
            System.out.println("B: Deposit");
            System.out.println("C: Withdraw");
            System.out.println("D: View previous transaction");
            System.out.println("E: Exit");
            System.out.println();
            System.out.print("Enter an option: ");
            option = scanner.next().charAt(0);
            System.out.println();
            switch(option) {
                case 'A':
                    showBalance();
                    break;
                case 'B':
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    System.out.println("Deposited " + depositAmount + ".");
                    System.out.println();
                    break;
                case 'C':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    System.out.println("Withdrawn " + withdrawAmount + ".");
                    System.out.println();
                    break;
                case 'D':
                    showPreviousTransaction();
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid option! Please enter A, B, C, D or E.");
                    System.out.println();
                    break;
            }
        } while(option != 'E');
    }
}
public class BankingApplication {
    public static void main(String[] args) {
        bankaccount account = new bankaccount("John Doe", "1234");
        account.showMenu();
    }
}