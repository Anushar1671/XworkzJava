class Stove{
	static void information(String company,int price,String type)
	{
		System.out.println("Invoking information in Camera");
		if(company!=null)
		{
			System.out.println("Condition valid :"+company);
		}
		else
		{
			System.err.println("Condition invalid :"+company);
			return;
		}
		if(price>1000 && price<50000)
		{
			System.out.println("Condition valid :"+price);
		}
		else
		{
			System.err.println("Condition invalid :"+price);
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
