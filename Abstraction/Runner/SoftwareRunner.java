package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.Application;
import com.xworkz.Abstraction.implementation.Development;
import com.xworkz.Abstraction.rule.Software;

public class SoftwareRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SoftwareRunner");
		Software software = new Development();
		Application application = new Application();
		application.setSoftware(software);
		application.program();
	}

}
