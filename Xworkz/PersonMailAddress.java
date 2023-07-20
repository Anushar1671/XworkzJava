class PersonMailAddress{
	static String getEmailByName(String name){
		if(name != null){
			if(name == "Anusha"){
				System.out.println("Name is: "+name);
				return "anusha@gmail.com";
			}
			if(name == "Abhi"){
				System.out.println("Name is: "+name);
				return "abhi9113@gmail.com";
			}
			if(name == "Chandan"){
				System.out.println("Name is: "+name);
				return "chandan@gmail.com";
			}
			if(name == "Jeevan"){
				System.out.println("Name is: "+name);
				return "jeevan@gmail.com";
			}
			if(name == "Namratha"){
				System.out.println("Name is: "+name);
				return "namratha@gmail.com";
			}
			if(name == "Aishu"){
				System.out.println("Name is: "+name);
				return "aishu@gmail.com";
			}
			if(name == "Rachana"){
				System.out.println("Name is: "+name);
				return "rachana@gmail.com";
			}
			if(name == "Anu"){
				System.out.println("Name is: "+name);
				return "anu@gmail.com";
			}
			if(name == "Abhishek"){
				System.out.println("Name is: "+name);
				return "abhi@gmail.com";
			}
			if(name == "Chandu"){
				System.out.println("Name is: "+name);
				return "chandu@gmail.com";
			}
		}
		else{
			System.out.println("Name given is not valid");
		}
		return "Email";
	}
	
	public static void main(String[] args){
		String anusha=PersonMailAddress.getEmailByName("Anusha");
		System.out.println("Reference of mail is: "+anusha);
		
		String abhi=PersonMailAddress.getEmailByName("Abhi");
		System.out.println("Reference of mail is: "+abhi);
		
		String chandan=PersonMailAddress.getEmailByName("Chandan");
		System.out.println("Reference of mail is: "+chandan);
		
		String jeevan=PersonMailAddress.getEmailByName("Jeevan");
		System.out.println("Reference of mail is: "+jeevan);
		
		String namratha=PersonMailAddress.getEmailByName("Namratha");
		System.out.println("Reference of mail is: "+namratha);
		
		String aishu=PersonMailAddress.getEmailByName("Aishwarya");
		System.out.println("Reference of mail is: "+aishu);
		
		String rachana=PersonMailAddress.getEmailByName("Rachana");
		System.out.println("Reference of mail is: "+rachana);
		
		String anu=PersonMailAddress.getEmailByName("Anu");
		System.out.println("Reference of mail is: "+anu);
		
		String abhishek=PersonMailAddress.getEmailByName("Abhishek");
		System.out.println("Reference of mail is: "+abhishek);
		
		String chandu=PersonMailAddress.getEmailByName("Chandu");
		System.out.println("Reference of mail is: "+chandu);
	}
}