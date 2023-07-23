class PowerMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Power in PowerMain");
		Power power=new Power("150 Hz",120);
		power.printInstance();
		Power.printStatic();
	}
}