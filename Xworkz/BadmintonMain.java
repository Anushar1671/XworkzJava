class BadmintonMain{
	public static void main(String[] args)
	{
		System.out.println("running main in BadmintonMain");
		Badminton badminton=new Badminton();
		System.out.println(badminton.lenght);
		System.out.println(badminton.width);
		System.out.println(badminton.players);
		System.out.println(badminton.numberOfCourts);
		System.out.println(badminton.playerName);
		System.out.println("------------------");
		badminton.lenght=44;
		badminton.width=20;
		badminton.players=4;
		badminton.numberOfCourts=2;
		badminton.playerName="Saniya mirza";
		System.out.println(badminton.lenght);
		System.out.println(badminton.width);
		System.out.println(badminton.players);
		System.out.println(badminton.numberOfCourts);
		System.out.println(badminton.playerName);
		System.out.println("=====================");
		Badminton badminton1=new Badminton();
		System.out.println(badminton1.lenght);
		System.out.println(badminton1.width);
		System.out.println(badminton1.players);
		System.out.println(badminton1.numberOfCourts);
		System.out.println(badminton1.playerName);
		System.out.println("------------------");
		badminton1.lenght=44;
		badminton1.width=20;
		badminton1.players=2;
		badminton1.numberOfCourts=2;
		badminton1.playerName="Saina Nehwal";
		System.out.println(badminton1.lenght);
		System.out.println(badminton1.width);
		System.out.println(badminton1.players);
		System.out.println(badminton1.numberOfCourts);
		System.out.println(badminton1.playerName);
	}
}
		