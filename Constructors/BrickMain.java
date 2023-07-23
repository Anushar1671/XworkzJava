class BrickMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Brick in BrickMain");
		Brick brick=new Brick("Clay",20);
		brick.printInstance();
		Brick.printStatic();
	}
}