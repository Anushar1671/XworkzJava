package com.xworkz.Inheritance;

public class Ceo extends Founder{
	public String designature;
	
	public Ceo() {
		System.out.println("no-arg constructor in Ceo");
	}
	
	public void ceoInfo() {
		System.out.println("Invoking ceoInfo in Ceo");
	}
}
