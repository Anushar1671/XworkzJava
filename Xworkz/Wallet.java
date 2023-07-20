class Wallet{
	int cost=500;
	String brand="Gucci";
	String color="Gray";
	
	Wallet()
	{
		System.out.println("Cost :"+this.cost);
		System.out.println("Brand :"+this.brand);
		System.out.println("Color :"+this.color);
	}
	Wallet(String brand,int cost,String color)
	{
		this.cost=cost;
		this.brand=brand;
		this.color=color;
		System.out.println("Cost :"+this.cost);
		System.out.println("Brand :"+this.brand);
		System.out.println("Color :"+this.color);
	}
}