class MainMethodJava{
	public static void main(String[] args)
	{
		System.out.println("Invoking cake info in MainMethod");
		String name="Honey cake";
		int price=50;
		int noOfPieces=2;
		Cake.tasty(name,"normal","SLV",price,noOfPieces,"Birthday");
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Camera info in MainMethod");
		String location="Banglore";
		int date=16;
		String resolution="48MP";
		Camera.click(location,date,3,resolution,"HD","Aishu");
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Fridge info in MainMethod");
		Fridge.store("Juice","Ice cream","Vegetables","Fruits","Milk","Curd","Cake","Chocolates","Egg","Sweets");
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Baker info in MainMethod");
		int noOfPeople=5;
		int experience=20;
		Baker.cooking("Cake",noOfPeople,"Bakery",experience,12,5);
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Oven info in MainMethod");
		int cost=50000;
		Oven.info("LG",cost,"Black");
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking WeighMachine info in MainMethod");
		int price1=15000;
		WeighMachine.details("HealthGenie Weighing Machine",price1,200); 
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Kulfi info in MainMethod");
		int amount=15;
		Kulfi.info("Pista",amount,"Arun"); 
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Scanner info in MainMethod");
		int amount1=25000;
		Scanner.information("epson",amount1,"Color");
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking GoldSmith info in MainMethod");
		int experience1=15;
		GoldSmith.information("Banglore",experience1,9611965471l);
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Soda info in MainMethod");
		int amount4=60;
		Soda.drink("lemon",amount4,"drink");		
		
		System.out.println("------------------------------------------");
		System.out.println("Invoking Stove info in MainMethod");
		int price3=5000;
		Stove.information("Prestige",price3,"Electric");
	}	
}