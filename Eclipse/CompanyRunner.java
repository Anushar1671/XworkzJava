package com.xworkz.Inheritance;

public class CompanyRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in CompanyRunner");
		Company company=new Company();
		Company company1=new Founder();
		Company company2=new Ceo();
		Company company3=new Job();
		Company company4=new JobRole();
		Company company5=new Employee();
		Company company6=new FullTimeEmployee();
		Company company7=new PartTimeEmployee();
		Company company8=new Salary();
		company.info();
		System.out.println(company.name);
		
		Founder founder=new Founder();
		Founder founder1=new Ceo();
		Founder founder2=new Job();
		Founder founder3=new JobRole();
		Founder founder4=new Employee();
		Founder founder5=new FullTimeEmployee();
		Founder founder6=new PartTimeEmployee();
		Founder founder7=new Salary();
		founder.founderInfo();
		System.out.println(founder.founderName);
		
		Ceo ceo=new Ceo();
		Ceo ceo1=new Job();
		Ceo ceo2=new JobRole();
		Ceo ceo3=new Employee();
		Ceo ceo4=new FullTimeEmployee();
		Ceo ceo5=new PartTimeEmployee();
		Ceo ceo6=new Salary();
		ceo.ceoInfo();
		System.out.println(ceo.designature);
		
		Job job=new Job();
		Job job1=new JobRole();
		Job job2=new Employee();
		Job job3=new FullTimeEmployee();
		Job job4=new PartTimeEmployee();
		Job job5=new Salary();
		job.jobInfo();
		System.out.println(job.designature);
		
		JobRole jobRole=new JobRole();
		JobRole jobRole1=new Employee();
		JobRole jobRole2=new FullTimeEmployee();
		JobRole jobRole3=new PartTimeEmployee();
		JobRole jobRole4=new Salary();
		jobRole.jobInfo();
		System.out.println(jobRole.salary);
		
		Employee employee=new Employee();
		Employee employee1=new FullTimeEmployee();
		Employee employee2=new PartTimeEmployee();
		Employee employee3=new Salary();
		employee.rating();
		System.out.println(employee.experience);
		
		FullTimeEmployee fullTimeEmployee=new FullTimeEmployee();
		FullTimeEmployee fullTimeEmployee1=new PartTimeEmployee();
		FullTimeEmployee fullTimeEmployee2=new Salary();
		fullTimeEmployee.year();
		System.out.println(fullTimeEmployee.salary);
		
		PartTimeEmployee partTimeEmployee=new PartTimeEmployee();
		PartTimeEmployee partTimeEmployee1=new Salary();
		partTimeEmployee.salary();
		System.out.println(partTimeEmployee.duration);
		
		Salary salary=new Salary();
		salary.salaryInfo();
		System.out.println(salary.experience);
	}

}
