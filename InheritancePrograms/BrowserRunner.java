package com.xworkz.InheritancePrograms;

public class BrowserRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in BrowserRunner");
		System.out.println("----------------------");
		Browser browser=new Browser();
		Chrome chrome=new Chrome();
		Opera opera=new Opera();
		FireFox fireFox=new FireFox();
		Edge edge=new Edge();
		BrowserUtil.speed(browser);
		System.out.println("----------------------");
		BrowserUtil.speed(chrome);
		System.out.println("----------------------");
		BrowserUtil.speed(opera);
		System.out.println("----------------------");
		BrowserUtil.speed(fireFox);
		System.out.println("----------------------");
		BrowserUtil.speed(edge);
	}
}
