class Soda{
	static void drink(String flavor,int cost,String type)
	{
		System.out.println("Invoking soda in Camera");
		if(flavor!=null)
		{
			System.out.println("Condition valid :"+flavor);
		}
		else
		{
			System.err.println("Condition invalid :"+flavor);
			return;
		}
		if(cost>=50)
		{
			System.out.println("Condition valid :"+cost);
		}
		else
		{
			System.err.println("Condition invalid :"+cost);
			return;
		}
		if(type!=null)
		{
			System.out.println("Condition valid :"+type);
		}
		else
		{
			System.err.println("Condition invalid :"+type);
			return;
		}
		System.out.println("Soda Information");
	}
}
