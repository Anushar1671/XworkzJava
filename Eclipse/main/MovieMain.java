package com.xworkz.main;

import javax.tools.JavaFileManager.Location;

import com.xworkz.movie.AadharNo;
import com.xworkz.movie.Auditor;
import com.xworkz.movie.Company;
import com.xworkz.movie.Mobileno;
import com.xworkz.movie.Movie;
import com.xworkz.movie.Producer;
import com.xworkz.movie.language;

public class MovieMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in MovieMain");
		Movie movie=new Movie();
		String ref=movie.name;
		language ref1=movie.language;
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println("----------------------------");
		Producer producer=movie.producer;
		double ref2=producer.budget;
		Mobileno ref3=producer.mobileNo;
		System.out.println(ref2);
		System.out.println(ref3);
		System.out.println("----------------------------");
		Auditor auditor=producer.auditor;
		AadharNo ref4=auditor.aadharNo;
		System.out.println(ref4);
		System.out.println("----------------------------");
		Company company=auditor.company;
		String ref5=company.companyName;
		Location ref6=company.location;
		System.out.println(ref5);
		System.out.println(ref6);
	}

}
