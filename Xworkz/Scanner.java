class Scanner{
	static void information(String brand,int cost,String type)
	{
		System.out.println("Invoking information in Camera");
		if(brand!=null)
		{
			System.out.println("Condition valid :"+brand);
		}
		else
		{
			System.err.println("Condition invalid :"+brand);
			return;
		}
		if(cost>15000 && cost<=100000)
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
		System.out.println("Scanner Information");
	}
}
