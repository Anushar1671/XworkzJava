class Job{
	static void apply()
	{
		System.out.println("invoking apply in Job");
		String person="Anusha";
		int experience=3;
		String refName="Chanadan";
		System.out.println("Person Name :"+person);
		System.out.println("Experience :"+experience);
		System.out.println("Reference Name :"+refName);
	}
	static void apply(String personName,int experience)
	{
		System.out.println("invoking apply(String personName,int experience) in Job");
		System.out.println("Person Name :"+personName);
		System.out.println("Experience :"+experience);
	}
	static void apply(String personName,int experience,String refName)
	{
		System.out.println("invoking apply(String personName,int experience,String refName) in Job");
		System.out.println("Person Name :"+personName);
		System.out.println("Experience :"+experience);
		System.out.println("Reference Name :"+refName);
	}
	static void apply(int experience)
	{
		System.out.println("invoking apply(int experience) in Job");
		System.out.println("Experience :"+experience);
	}
	static void rejectOffer()
	{
		System.out.println("invoking Reject Offer in Job");
	}
	
}
