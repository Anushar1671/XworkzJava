class Bureau{
	static String brand;
	static String material;
	double price;
	String color;
	
	
	Bureau(String color,double price)
	{
		System.out.println("Invoking String,double constructor of Bureau");
		this.color=color;
		this.price=price;
	}
	
	static{
		brand="Ercol";
		material="Wood";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Bureau");
		System.out.println("Bureau brand :"+brand);
		System.out.println("Bureau material :"+material);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Bureau");
		System.out.println("Bureau color :"+color);
		System.out.println("Bureau price :"+price);
	}
}
