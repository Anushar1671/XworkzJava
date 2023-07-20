class FabricInfo {
	static float getPrice(float price){
	System.out.println("Given price is  valid");
	if(price>=0){
	if (567==price){
		System.out.println("Given price of the cotton "+price);
		return 567;
	}
	if (444==price){
		System.out.println("Given price of the nylon "+price);
		return 444;
	}
	if (987==price){
		System.out.println("Given price of the woolen "+price);
		return 987;
	}
	if (456==price){
		System.out.println("Given price of the linen "+price);
		return 456;
	}
	if (765==price){
		System.out.println("Given price of the polyster "+price);
		return 765;
	}
	if (67==price){
		System.out.println("Given price of the skilk "+price);
		return 67;
	}
	}
	else{
		System.out.println("Given price  is not valid");
	}
	return 76;
}
	
	public static void main(String[] args){
		float cottonPrice=FabricInfo.getPrice(567);
		System.out.println("Reference price is: " +cottonPrice);
		float nylonPrice=FabricInfo.getPrice(444);
		System.out.println("Reference price is: " +nylonPrice);	
		float woolenPrice=FabricInfo.getPrice(987);
		System.out.println("Reference price is: " +woolenPrice);	
		float linenPrice=FabricInfo.getPrice(456);
		System.out.println("Reference price is: " +linenPrice);
		float polysterPrice=FabricInfo.getPrice(765);
		System.out.println("Reference price is: " +polysterPrice);
		float skilkPrice=FabricInfo.getPrice(67);
		System.out.println("Reference price is: " +skilkPrice);
}
}