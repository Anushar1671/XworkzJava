class CricketInformation{
	int noOfPlayers=11;
	String stadiumName="Chinnaswamy";
	String playerName="Virat Kohli";
	
	CricketInformation()
	{
		System.out.println("Number of players :"+this.noOfPlayers);
		System.out.println("Stadium Name :"+this.stadiumName);
		System.out.println("Player Name :"+this.playerName);	
	}
	CricketInformation(int noOfPlayers,String stadiumName,String playerName)
	{
		this.noOfPlayers=noOfPlayers;
		this.stadiumName=stadiumName;
		this.playerName=playerName;
		System.out.println("Number of players :"+this.noOfPlayers);
		System.out.println("Stadium Name :"+this.stadiumName);
		System.out.println("Player Name :"+this.playerName);
	}
	
}