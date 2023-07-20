class Ternary{
	public static void main(String[] args)
	{
		int m=25;
		int n=50;
		int p=5;
		int largest=(m>=n)?((m>p)?m:p):((n>=p)?n:p);
		System.out.println("largest number :"+largest);
	}
}