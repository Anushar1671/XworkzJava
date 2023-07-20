class WeighMachine{
	static void details(String brand,int price,int range)
	{
		System.out.println("Invoking details in Camera");
		if(brand!=null)
		{
			System.out.println("Condition valid :"+brand);
		}
		else
		{
			System.err.println("Condition invalid :"+brand);
			return;
		}
		if(price>10000 && price<=100000)
		{
			System.out.println("Condition valid :"+price);
		}
		else
		{
			System.err.println("Condition invalid :"+price);
			return;
		}
		if(range>10 && range <1000)
		{
			System.out.println("Condition valid :"+range);
		}
		else
		{
			System.err.println("Condition invalid :"+range);
			return;
		}
		System.out.println("WeighMachine Information");
	}
}
			
