package com.xworkz.InheritanceChaining;

public class Router {
	public  boolean wifi;
	public String network;
	public String button;
	public String type;
	
	public Router(String network,boolean wifi,String button,String type) {
		this.wifi=wifi;
		this.network=network;
		this.button=button;
		this.type=type;
		System.out.println("Invoking String,boolean,String,STring constructor in Router");
	}
	

}
