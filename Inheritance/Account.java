package com.xworkz.Inheritance;

public class Account extends Bank{
	public long accNumber;
	
	public Account() {
		System.out.println("no-arg constructor in Account");
	}
	
	public void credit() {
		System.out.println("Invoking credit in Account");
	}
}
