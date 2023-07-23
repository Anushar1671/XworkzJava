class Soil{
	static String color;
	static String region;
	double pricePerTon;
	String crop;
	
	
	Soil(String crop,double pricePerTon)
	{
		System.out.println("Invoking String,double constructor of Soil");
		this.crop=crop;
		this.pricePerTon=pricePerTon;
	}
	
	static{
		color="Red";
		region="region";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Soil");
		System.out.println("Soil color :"+color);
		System.out.println("Region :"+region);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Soil");
		System.out.println("Crop :"+crop);
		System.out.println("Soil price per ton :"+pricePerTon);
	}
}
