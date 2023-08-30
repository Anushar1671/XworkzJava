package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Education;

public class University {
	Education education;

	public void knowledge() {
		System.out.println("Invoking knowledge in University");
		this.education.knowledge();

	}

	public void setEducation(Education education) {
		System.out.println("Invoking setEducation in University");
		this.education = education;
	}

}
