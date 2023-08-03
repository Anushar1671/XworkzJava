package com.xworkz.InheritancePrograms;

public class BrowserUtil {
	public static void speed(Browser browser) {
		System.out.println(browser.name);
		browser.speed();
		if(browser instanceof Chrome) {
			System.out.println("Browser is Chrome");
			Chrome chrome=new Chrome();
			System.out.println(chrome.speed);
			chrome.storage();
		}
		
		if(browser instanceof Opera) {
			System.out.println("Browser is Opera");
			Opera opera=new Opera();
			System.out.println(opera.capacity);
			opera.location();
		}
		
		if(browser instanceof FireFox) {
			System.out.println("Browser is FireFox");
			FireFox fireFox=new FireFox();
			System.out.println(fireFox.cost);
			fireFox.fireFoxInfo();
		}
		
		if(browser instanceof Edge) {
			System.out.println("Browser is Edge");
			Edge edge=new Edge();
			System.out.println(edge.path);
			edge.edgeInfo();
		}
		
	}
}
