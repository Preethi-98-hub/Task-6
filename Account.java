package com.Task6;

public class Account {
	// Data members
    private String accountNumber;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Test the Account class
        Account acc1 = new Account(); // Using no-argument constructor
        Account acc2 = new Account("123456789", 500.0); // Using two-argument constructor

        acc1.deposit(500.0);
        acc1.checkBalance();
        
        acc2.withdraw(100.0);
        acc2.checkBalance();
        acc2.deposit(500.0);
        acc2.checkBalance();
    }

	}


