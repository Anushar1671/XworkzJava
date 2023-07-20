class Park{
	String name;
	String location;
	float timing;
	boolean parking;
	boolean game;
	int gate;
	boolean excercise;
	int noOfpeople;
	int entryFees;
	
	
	Park()
	{
		System.out.println("Invoking no-arg constructor of Park");
	}
	
	Park(String name)
	{
		this.name=name;
		System.out.println("Invoking String,float,String,boolean,int,boolean,int,boolean,int constructor of Park");
	}
	
	Park(String name,float timing)
	{
		this(name);
		this.timing=timing;
		System.out.println("Invoking String,float constructor of Park");
	}
	
	Park(String name,float timing,String location)
	{
		this(name,timing);
		this.location=location;
		System.out.println("Invoking String,float,String constructor of Park");
	}
	
	Park(String name,float timing,String location,boolean parking)
	{
		this(name,timing,location);
		this.parking=parking;
		System.out.println("Invoking String,float,String,boolean constructor of Park");
	}
	
	Park(String name,float timing,String location,boolean parking,int gate)
	{
		this(name,timing,location,parking);
		this.gate=gate;
		System.out.println("Invoking String,float,String,boolean,int constructor of Park");
	}
	
	Park(String name,float timing,String location,boolean parking,int gate,boolean game)
	{
		this(name,timing,location,parking,gate);
		this.game=game;
		System.out.println("Invoking String,float,String,boolean,int,boolean constructor of Park");
	}
	
	Park(String name,float timing,String location,boolean parking,int gate,boolean game,int noOfpeople)
	{
		this(name,timing,location,parking,gate,game);
		this.noOfpeople=noOfpeople;
		System.out.println("Invoking String,float,String,boolean,int,boolean,int constructor of Park");
	}
	
	Park(String name,float timing,String location,boolean parking,int gate,boolean game,int noOfpeople,boolean excercise)
	{
		this(name,timing,location,parking,gate,game,noOfpeople);
		this.excercise=excercise;
		System.out.println("Invoking String,float,String,boolean,int,boolean,int,boolean constructor of Park");
	}
	
	Park(String name,float timing,String location,boolean parking,int gate,boolean game,int noOfpeople,boolean excercise,int entryFees)
	{
		this(name,timing,location,parking,gate,game,noOfpeople,excercise);
		this.entryFees=entryFees;
		System.out.println("Invoking String,float,String,boolean,int,boolean,int,boolean,int constructor of Park");
	}
}
	
		
	
	