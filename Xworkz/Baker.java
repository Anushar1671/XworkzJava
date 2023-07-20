class Baker{
	static void cooking(String foodItem,int noOfPeople,String workingFor,int experience,int duration,int assistance)
	{
		System.out.println("Invoking cooking in Camera");
		if(foodItem!=null)
		{
			System.out.println("Condition valid :"+foodItem);
		}
		else
		{
			System.err.println("Condition invalid :"+foodItem);
		}
		if(noOfPeople>1)
		{
			System.out.println("Condition valid :"+noOfPeople);
		}
		else
		{
			System.err.println("Condition invalid :"+noOfPeople);
		}
		if(workingFor!=null)
		{
			System.out.println("Condition valid :"+workingFor);
		}
		else
		{
			System.err.println("Condition invalid :"+workingFor);
		}
		if(experience>=15)
		{
			System.out.println("Condition valid :"+experience);
		}
		else
		{
			System.err.println("Condition invalid :"+experience);
		}
		if(duration>=10)
		{
			System.out.println("Condition valid :"+duration);
		}
		else
		{
			System.err.println("Condition invalid :"+duration);
		}
		if(assistance>3)
		{
			System.out.println("Condition valid :"+assistance);
		}
		else
		{
			System.err.println("Condition invalid :"+assistance);
		}
		System.out.println("Baker informtion");
	}
}
		
		