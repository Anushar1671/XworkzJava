package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Software;

public class Application {
	Software software;

	public void program() {
		System.out.println("Invoking program in Application");
		this.software.program();
	}

	public void setSoftware(Software software) {
		System.out.println("Invoking setSoftware in Application");
		this.software = software;
	}
}
