class Butterfly{
	static String feature;
	static String type;
	int leg;
	String color;
	
	
	Butterfly(String color,int leg)
	{
		System.out.println("Invoking String,int constructor of Butterfly");
		this.color=color;
		this.type=type;
	}
	
	static{
		feature="Fly";
		type="Insect";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Butterfly");
		System.out.println("Butterfly feature :"+feature);
		System.out.println("Butterfly type :"+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Butterfly");
		System.out.println("Butterfly color :"+color);
		System.out.println("Legs :"+leg);
	}
}
