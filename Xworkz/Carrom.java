class Carrom{
	int price;
	String name;
	int noOfPlayer;
	String material;
	String coinColor;
	
	Carrom()
	{
		System.out.println("Invoking constructor in Carrom");
	}
	
	Carrom(int price)
	{
		System.out.println("Invoking int constructor in Carrom");
		System.out.println("Price of Carrom Board :"+price);
		this.price=price;
	}
	
	Carrom(int price,String name)
	{
		System.out.println("Invoking int,String constructor in Carrom");
		System.out.println("Price of Carrom Board :"+price);
		System.out.println("Name of Carrom Board :"+name);
		this.price=price;
		this.name=name;
	}
	
	Carrom(int price,String name,int noOfPlayers)
	{
		System.out.println("Invoking int,String,int constructor in Carrom");
		System.out.println("Price of Carrom Board :"+price);
		System.out.println("Name of Carrom Board :"+name);
		System.out.println("Number of Players in Carrom :"+noOfPlayer);
		this.price=price;
		this.name=name;
		this.noOfPlayer=noOfPlayer;
	}
	
	Carrom(int price,String name,int noOfPlayers,String material)
	{
		System.out.println("Invoking int,String,int,String,int in constructor");
		System.out.println("Price of Carrom Board :"+price);
		System.out.println("Name of Carrom Board :"+name);
		System.out.println("Number of Players in Carrom :"+noOfPlayer);
		System.out.println("material used for Carrom Board :"+material);
		this.price=price;
		this.name=name;
		this.noOfPlayer=noOfPlayer;
		this.material=material;
	}
	
	Carrom(int price,String name,int noOfPlayers,String material,String coinColor)
	{
		System.out.println("Invoking int,String,int,String,int in constructor");
		System.out.println("Price of Carrom Board :"+price);
		System.out.println("Name of Carrom Board :"+name);
		System.out.println("Number of Players in Carrom :"+noOfPlayer);
		System.out.println("material used for Carrom Board :"+material);
		System.out.println("Coin Color of Carrom :"+coinColor);
		this.price=price;
		this.name=name;
		this.noOfPlayer=noOfPlayer;
		this.material=material;
		this.coinColor=coinColor;
	}
}
	
	