package com.xworkz.Inheritance;

public class EducationRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in EducationRunner");
		
		Education education=new Education();
		Education education1=new Primary();
		Education education2=new Secondary();
		Education education3=new Engineering();
		Education education4=new Cse();
		Education education5=new Aiml();
		education.educationInfo();
		System.out.println(education.year);
		
		Primary primary=new Primary();
		Primary primary1=new Secondary();
		Primary primary2=new Engineering();
		Primary primary3=new Cse();
		Primary primary4=new Aiml();
		primary.educationInfo();
		System.out.println(primary.studentName);
		
		Secondary secondary=new Secondary();
		Secondary secondary1=new Engineering();
		Secondary secondary2=new Cse();
		Secondary secondary3=new Aiml();
		secondary.secondaryInfo();
		System.out.println(secondary.specification);
		
		Engineering engineering=new Engineering();
		Engineering engineering1=new Cse();
		Engineering engineering2=new Aiml();
		engineering.beInfo();
		System.out.println(engineering.specialization);
		
		Cse cse=new Cse();
		Cse cse1=new Aiml();
		cse.cseInfo();
		System.out.println(cse.duration);
		
		Aiml aiml=new Aiml();
		aiml.aimlInfo();
		System.out.println(aiml.rating);
	}

}
