class CandleMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Bureau in CandleMain");
		Candle candle=new Candle("White",20);
		candle.printInstance();
		Candle.printStatic();
	}
}