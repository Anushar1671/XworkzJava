class CarpenterRunner{
	public static void main(String [] args)
	{
		System.out.println("Running main in CarpenterRunner");
		
		Carpenter1.skill();
	    Carpenter1.skill("plaining");
		Carpenter1.measure(12);
		Carpenter1.measure(12,10);
		Carpenter1.details("Vinay");
		Carpenter1.contact(9620689808l);
		Carpenter1.address("Shivamogga");
		Carpenter1.experience(3);
		
		//calling method inside method i.e repair
		Carpenter1.frame();
		
	}
}