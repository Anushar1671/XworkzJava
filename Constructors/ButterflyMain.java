class ButterflyMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Butterfly in ButterflyMain");
		Butterfly butterfly=new Butterfly("Orange",6);
		butterfly.printInstance();
		Butterfly.printStatic();
	}
}