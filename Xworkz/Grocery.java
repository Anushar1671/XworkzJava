class Grocery{
	public static void main(String[] args)
	{
		System.out.println("Running Grocery in main");
		String rice="Rice";
		String oil="Oil";
		String soup="Soup";
		String cereal="Cereals";
		String wheat="Wheat";
		String sugar="Sugar";
		String salt="Salt";
		
		String[] groceryList={rice,oil,soup,cereal,wheat,sugar,salt};
		int total=groceryList.length;
		
		
		for(int grocery=0;grocery<groceryList.length;grocery++)
		{
			String ref=groceryList[grocery];
			System.out.println("Grocery at "+ref+" is "+grocery);
		}
		System.out.println("Grocery item at position 5 before change :"+groceryList[5]);
		System.out.println("+++++++++++++++++++++++++++++++++++");

		groceryList[5]="shampoo";
		System.out.println("Grocery item at position 5 after change :"+groceryList[5]);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");

		for(int grocery=groceryList.length-1;grocery>=0;grocery--)
		{
			String ref=groceryList[grocery];

			System.out.println("Grocery at "+ref+" is "+grocery);
		}
	}
}