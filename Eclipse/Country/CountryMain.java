package com.xworkz.Country;

public class CountryMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in CountryMain");
		CountryInfo countryInfo=new CountryInfo();
		String info=countryInfo.name;
		Code cCode=countryInfo.code;
		System.out.println(info);
		System.out.println(cCode);
		System.out.println("--------------------------");
		President president=countryInfo.president;
		String presidentinfo=president.from;
		System.out.println(presidentinfo);
		System.out.println("--------------------------");
		PrimeMinister primeMinister=countryInfo.primeMinister;
		String ref=primeMinister.name;
		StateFrom reff=primeMinister.stateFrom;
		System.out.println(ref);
		System.out.println(reff);

		System.out.println("------------------------");
		SecurityHead securityHead=primeMinister.securityHead;
		String ref1=securityHead.securityHeadName;
		Place ref2=securityHead.place;
		System.out.println(ref1);
		System.out.println(ref2);
		
		System.out.println("----------------------");
		PersonalAssistant personalAssistant=primeMinister.personalAssistant;
		String ref3=personalAssistant.nameOfPA;
		Contact ref4=personalAssistant.contact;
		System.out.println(ref3);
		System.out.println(ref4);
		
		System.out.println("----------------------");
		HomeMinister homeMinister=primeMinister.homeMinister;
		String ref5=homeMinister.homeMinisterName;
		PoliticalParty ref6=homeMinister.politicalParty;
		System.out.println(ref5);
		System.out.println(ref6);	
	}

}
