class Mall{
	String shop;
	String name;
	int gate;
	String address;
	int noOfPeople;
	float timing;
	boolean parkingSpace;
	
	Mall()
	{
		System.out.println("Invoking no-arg constructor of Mall");
	}
	
	Mall(String shop)
	{
		this.shop=shop;
		System.out.println("Invoking String constructor of Mall");
	}
	
	Mall(String shop,int gate)
	{
		this(shop);
		this.gate=gate;
		System.out.println("Invoking String,int constructor of Mall");
	}
	
	Mall(String shop,int gate,String address)
	{
		this(shop,gate);
		this.address=address;
		System.out.println("Invoking String,int,String constructor of Mall");
	}
	
	Mall(String shop,int gate,String address,int noOfPeople)
	{
		this(shop,gate,address);
		this.noOfPeople=noOfPeople;
		System.out.println("Invoking String,int,String,int constructor of Mall");
	}
	
	Mall(String shop,int gate,String address,int noOfPeople,String name)
	{
		this(shop,gate,address,noOfPeople);
		this.name=name;
		System.out.println("Invoking String,int,String,int,String constructor of Mall");
	}
	
	Mall(String shop,int gate,String address,int noOfPeople,String name,float timing)
	{
		this(shop,gate,address,noOfPeople,name);
		this.timing=timing;
		System.out.println("Invoking String,int,String,int,String,float constructor of Mall");
	}
	
	Mall(String shop,int gate,String address,int noOfPeople,String name,float timing,boolean parkingSpace)
	{
		this(shop,gate,address,noOfPeople,name,timing);
		this.parkingSpace=parkingSpace;
		System.out.println("Invoking String,int,String,int,String,float,boolean constructor of Mall");
	}
}
	