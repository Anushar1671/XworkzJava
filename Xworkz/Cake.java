class Cake{
	static void tasty(String name,String type,String bakeryName,float price,int noOfPieces,String ocassion)
	{
		System.out.println("Invoking tasty in Cake");
		if(name!=null)
		{
			System.out.println("Condition valid :"+name);
		}
		else
		{
			System.err.println("Condition invalid :"+name);
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
		if(bakeryName!=null)
		{
			System.out.println("Condition valid :"+bakeryName);
		}
		else
		{
			System.err.println("Condition invalid :"+bakeryName);
			return;
		}
		if(price>=30)
		{
			System.out.println("Condition valid :"+price);
		}
		else
		{
			System.err.println("Condition invalid :"+price);
			return;
		}
		if(noOfPieces>=1)
		{
			System.out.println("Condition valid :"+noOfPieces);
		}
		else
		{
			System.err.println("Condition invalid :"+noOfPieces);
			return;
		}
		if(ocassion!=null)
		{
			System.out.println("Condition valid :"+ocassion);
		}
		else
		{
			System.err.println("Condition invalid :"+ocassion);
			return;
		}
		System.out.println("Cake information");		
	}
}
		
		