class MainMethod1{
	public static void main(String[] args)
	{
	String model=EngineInfo.getCCByModel("1197cc");
	System.out.println("Reference name is: " +model);
	String model1=EngineInfo.getCCByModel("1498cc");
	System.out.println("Reference name is: " + model1);
	String model2=EngineInfo.getCCByModel("2998cc");
	System.out.println("Reference name is: " + model2);
	String model3=EngineInfo.getCCByModel("1993cc");
	System.out.println("Reference name is: " + model3);
	String model4=EngineInfo.getCCByModel("1197cc");
	System.out.println("Reference name is: " + model4);
	String model5=EngineInfo.getCCByModel("1198cc");
	System.out.println("Reference name is: " + model5);
	
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