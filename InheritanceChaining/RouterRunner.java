package com.xworkz.InheritanceChaining;

public class RouterRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in RouterRunner");
		Router router=new Router("Wired network", true, "off", "wireless router");
		System.out.println(router.network);
		System.out.println(router.wifi);
		System.out.println(router.button);
		System.out.println(router.type);
		System.out.println("-----------------");
		RouterEthernet routerEthernet=new RouterEthernet();
		System.out.println(routerEthernet.network);
		System.out.println(routerEthernet.wifi);
		System.out.println(routerEthernet.button);
		System.out.println(routerEthernet.type);
		System.out.println("-----------------");
		RouterEthernet routerEthernet1=new RouterEthernet("Guest wireless network", false, "on", "Edge router");
		System.out.println(routerEthernet1.network);
		System.out.println(routerEthernet1.wifi);
		System.out.println(routerEthernet1.button);
		System.out.println(routerEthernet1.type);
	}

}
