class Oven{
	static void info(String brand,int cost,String color)
	{
		System.out.println("Invoking info in Camera");
		if(brand!=null)
		{
			System.out.println("Condition valid :"+brand);
		}
		else
		{
			System.err.println("Condition invalid :"+brand);
			return;
		}
		if(cost>10000 && cost<=100000)
		{
			System.out.println("Condition valid :"+cost);
		}
		else
		{
			System.err.println("Condition invalid :"+cost);
			return;
		}
		if(color!=null)
		{
			System.out.println("Condition valid :"+color);
		}
		else
		{
			System.err.println("Condition invalid :"+color);
			return;
		}
		System.out.println("Oven Information");
	}
}