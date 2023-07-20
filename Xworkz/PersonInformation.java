class PersonInformation{
	static int getAgeByName(String ageByName)
	{
		if(ageByName!=null)
		{
			if("anu"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 22;
			}
			if("anusha"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 23;
			}
			if("aishu"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 24;
			}
			if("aishwarya"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 25;
			}
			if("rachchu"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 26;
			}
			if("rachana"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 34;
			}
			if("abhi"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 56;
			}
			if("abhishek"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 76;
			}
			if("chandu"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 98;
			}
			if("chandan"==ageByName)
			{
				System.out.println("invoking the is "+ageByName);
				return 53;
				
			}
		}	
	else
	{
		System.out.println("the name is  not valid ");
	}
	return 65;
	}

	public static void main(String[] args)
	{
		int ageanu=PersonInformation.getAgeByName("anu");
		System.out.println("the age is: " +ageanu);
		int ageanusha=PersonInformation.getAgeByName("anusha");
		System.out.println("the age is: " +ageanusha);
		int ageaishu=PersonInformation.getAgeByName("aishu");
		System.out.println("the age is: " +ageaishu);
		int ageashwarya=PersonInformation.getAgeByName("aishwarya");
		System.out.println("the age is: " +ageashwarya);
		int agerachchu=PersonInformation.getAgeByName("rachchu");
		System.out.println("the age is: " +agerachchu);
		int agerachana=PersonInformation.getAgeByName("rachana");
		System.out.println("the age is: " +agerachana);
		int ageabhi=PersonInformation.getAgeByName("abhi");
		System.out.println("the age is: " +ageabhi);
		int ageabhishek=PersonInformation.getAgeByName("abhishek");
		System.out.println("the age is: " +ageabhishek);
		int agechandu=PersonInformation.getAgeByName("chandu");
		System.out.println("the age is: " +agechandu);
		int agechandan=PersonInformation.getAgeByName("chandan");
		System.out.println("the age is: " +agechandan);
}
}