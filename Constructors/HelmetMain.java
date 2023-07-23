class HelmetMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Helmet in HelmetMain");
		Helmet helmet=new Helmet("Black",1000,"Metallic");
		helmet.printInstance();
		Helmet.printStatic();
	}
}