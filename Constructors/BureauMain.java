class BureauMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Bureau in BureauMain");
		Bureau bureau=new Bureau("Black",10000);
		bureau.printInstance();
		Bureau.printStatic();
	}
}