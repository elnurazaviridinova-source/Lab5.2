package org.example.constructor;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber != null && !accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number cannot be null or empty");
            this.accountNumber = "Unknown";
        }
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative");
            this.balance = 0;
        }
    }
    public void info(){
        System.out.println("AccountNumber: "+ accountNumber );
        System.out.println("Balance: "+ balance);
    }
    }
