class Kulfi{
	static void info(String flavor,int cost,String company)
	{
		System.out.println("Invoking info in Camera");
		if(flavor!=null)
		{
			System.out.println("Condition valid :"+flavor);
		}
		else
		{
			System.err.println("Condition invalid :"+flavor);
			return;
		}
		if(cost>10 && cost<=100)
		{
			System.out.println("Condition valid :"+cost);
		}
		else
		{
			System.err.println("Condition invalid :"+cost);
			return;
		}
		if(company!=null)
		{
			System.out.println("Condition valid :"+company);
		}
		else
		{
			System.err.println("Condition invalid :"+company);
			return;
		}
		System.out.println("Oven Information");
	}
}