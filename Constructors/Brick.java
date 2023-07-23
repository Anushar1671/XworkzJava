class Brick{
	static String use;
	static String state;
	double price;
	String material;
	
	
	Brick(String material,double price)
	{
		System.out.println("Invoking String,double constructor of Brick");
		this.material=material;
		this.price=price;
	}
	
	static{
		use="Construction";
		state="Solid";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Brick");
		System.out.println("Brick use :"+use);
		System.out.println("Brick state :"+state);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Brick");
		System.out.println("Brick material :"+material);
		System.out.println("Brick price :"+price);
	}
}
