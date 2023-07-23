class SoilMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Soil in SoilMain");
		Soil soil=new Soil("Wheat",4000);
		soil.printInstance();
		Soil.printStatic();
	}
}