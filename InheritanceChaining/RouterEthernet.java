package com.xworkz.InheritanceChaining;

public class RouterEthernet extends Router{
	public RouterEthernet() {
		this("wireless",true,"on","traffic");
		System.out.println("no-arg constructor in RouterEthernet");
	}
	public RouterEthernet(String network,boolean wifi,String button,String type) {
		super(network,wifi,button,type);
		System.out.println("String,boolean,String,STring constructor in RouterEthernet");
		
	}

}
