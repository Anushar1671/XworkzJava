class GoldSmith
{
	static void information(String address,int experience,long contact)
	{
		System.out.println("Invoking information in Camera");
		if(address!=null)
		{
			System.out.println("Condition valid :"+address);
		}
		else
		{
			System.err.println("Condition invalid :"+address);
			return;
		}
		if(experience>10)
		{
			System.out.println("Condition valid :"+experience);
		}
		else
		{
			System.err.println("Condition invalid :"+experience);
			return;
		}
		if(contact==9611965471l)
		{
			System.out.println("Condition valid :"+contact);
		}
		else
		{
			System.err.println("Condition invalid :"+contact);
			return;
		}
		System.out.println("GoldSmith Information");
	}
}
