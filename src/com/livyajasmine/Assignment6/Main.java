package com.livyajasmine.Assignment6;

public class Main {
	public static void main(String args[]) {
		BankAccount account = new BankAccount(1001, 5000);
		try {
			account.displayBalance();
			account.deposit(2000);
			account.withdraw(1000);
			account.withdraw(10000);
		}
		catch(InvalidAmountException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			System.out.println("Transaction Completed. Final Balance: ");
			account.displayBalance();
		}
	}

}