class PowerBankMain{
	public static void main(String[] args)
	{
		System.out.println("running main in PowerBankMain");
		PowerBank powerBank=new PowerBank();
		System.out.println(powerBank.use);
		System.out.println(powerBank.connection);
		System.out.println(powerBank.color);
		System.out.println(powerBank.price);
		System.out.println(powerBank.brand);
		System.out.println("----------------------");
		powerBank.use="Charge";
		powerBank.connection="Through USB cable";
		powerBank.color="color";
		powerBank.price=2000;
		powerBank.brand="MI";
		System.out.println(powerBank.use);
		System.out.println(powerBank.connection);
		System.out.println(powerBank.color);
		System.out.println(powerBank.price);
		System.out.println(powerBank.brand);
		System.out.println("======================");
		PowerBank powerBank1=new PowerBank();
		System.out.println(powerBank1.use);
		System.out.println(powerBank1.connection);
		System.out.println(powerBank1.color);
		System.out.println(powerBank1.price);
		System.out.println(powerBank1.brand);
		System.out.println("----------------------");
		powerBank1.use="Charge";
		powerBank1.connection="Through USB cable";
		powerBank1.color="color";
		powerBank1.price=2000;
		powerBank1.brand="MI";
		System.out.println(powerBank1.use);
		System.out.println(powerBank1.connection);
		System.out.println(powerBank1.color);
		System.out.println(powerBank1.price);
		System.out.println(powerBank1.brand);
	}
}