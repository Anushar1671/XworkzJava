package com.xworkz.Abstraction.Runner;

import java.rmi.server.UnicastRemoteObject;

import com.xworkz.Abstraction.implementation.College;
import com.xworkz.Abstraction.implementation.University;
import com.xworkz.Abstraction.rule.Education;

public class EducationRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in EducationRunner");
		Education education = new College();
		University university = new University();
		university.setEducation(education);
		university.knowledge();
	}

}
