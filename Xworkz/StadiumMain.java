class StadiumMain{
	public static void main(String[] args)
	{
		System.out.println("running main in StadiumMain");
		Stadium stadium=new Stadium();
		System.out.println(stadium.player);
		System.out.println(stadium.game);
		System.out.println(stadium.audience);
		System.out.println(stadium.camera);
		System.out.println(stadium.gate);
		System.out.println("----------------");
		stadium.player=11;
		stadium.game="Football";
		stadium.audience=15000;
		stadium.camera=25;
		stadium.gate=6;
		System.out.println(stadium.player);
		System.out.println(stadium.game);
		System.out.println(stadium.audience);
		System.out.println(stadium.camera);
		System.out.println(stadium.gate);
		System.out.println("==================");
		Stadium stadium1=new Stadium();
		System.out.println(stadium1.player);
		System.out.println(stadium1.game);
		System.out.println(stadium1.audience);
		System.out.println(stadium1.camera);
		System.out.println(stadium1.gate);
		System.out.println("----------------");
		stadium1.player=11;
		stadium1.game="Cricket";
		stadium1.audience=10000;
		stadium1.camera=20;
		stadium1.gate=5;
		System.out.println(stadium1.player);
		System.out.println(stadium1.game);
		System.out.println(stadium1.audience);
		System.out.println(stadium1.camera);
		System.out.println(stadium1.gate);
	}
}