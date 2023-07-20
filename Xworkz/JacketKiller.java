class JacketKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in Jacket");
		Jacket jacket=new Jacket();
		System.out.println(jacket.size);
		System.out.println(jacket.color);
		System.out.println(jacket.brand);
		System.out.println(jacket.price);
		System.out.println(jacket.cloth);
		System.out.println("-------------------");
		jacket.size=30;
		jacket.brand="Puma";
		jacket.color="Black";
		jacket.price=5000;
		jacket.cloth="Leather";
		System.out.println(jacket.size);
		System.out.println(jacket.color);
		System.out.println(jacket.brand);
		System.out.println(jacket.price);
		System.out.println(jacket.cloth);
		System.out.println("==========================");
		Jacket jacket1=new Jacket();
		System.out.println(jacket1.size);
		System.out.println(jacket1.color);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.price);
		System.out.println(jacket1.cloth);
		System.out.println("-------------------");
		jacket1.size=40;
		jacket1.brand="Highland";
		jacket1.color="Gray";
		jacket1.price=4000;
		jacket1.cloth="cotton";
		System.out.println(jacket1.size);
		System.out.println(jacket1.color);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.price);
		System.out.println(jacket1.cloth);
	}
}