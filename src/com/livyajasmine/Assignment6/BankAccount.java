package com.livyajasmine.Assignment6;

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber,  double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<= 0) {
			throw new InvalidAmountException("Deposit amount must be Positive");
			
		}
		balance+= amount;
		System.out.println("Deposited: " + amount + " | New Balance: " + balance);
	}
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
		if(amount <= 0) {
			throw new InvalidAmountException("Withdrawal amount must be Positive.");
		}
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds. current balance : " + balance);
		}
		balance -= amount;
		System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
		
	}
	public void displayBalance() {
		System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
	}

}
