package com.xworkz.Inheritance;

public class BankRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in BankRunner");
		Bank bank=new Bank();
		Bank bank1=new Account();
		bank.transaction();
		System.out.println(bank.name);
		Account account=new Account();
		account.credit();
		System.out.println(account.accNumber);		
	}
}
