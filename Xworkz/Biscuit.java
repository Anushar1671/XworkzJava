class Biscuit{
	public static void main(String[] args)
	{
		System.out.println("Running Biscuit in main...");
		
		String goodDay="Good Day";
		String happyHappy="Happy Happy";
		String darkFantasy="Dark Fantasy";
		String bourBon="Bour Bon";
		String marie="Marie";
		String parleG="Parle-G";
		String crackJack="Crack Jack";
		
		String[] biscuit={goodDay,happyHappy,darkFantasy,bourBon,marie,parleG,crackJack};
		
		int total=biscuit.length;
		
		
		for(int bisct=0;bisct<biscuit.length;bisct++)
		{
			String ref=biscuit[bisct];
			System.out.println("Biscuit at "+ref+" is "+bisct);
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Biscuit at position 6 before change :"+biscuit[5]);
		biscuit[5]="oreo";
		System.out.println("Biscuit at position 6 after change :"+biscuit[5]);
		
		System.out.println("------------------------------------------------");
		
		for(int bisct=biscuit.length-1;bisct>=0;bisct--)
		{
			String ref=biscuit[bisct];
			System.out.println("Biscuit at "+ref+" is "+bisct);
		}
	}
}
