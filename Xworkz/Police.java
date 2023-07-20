class Police{
	String name="chandan";
	int age=30;
	int experience=2;
	
	Police()
	{
		System.out.println("Police name :"+this.name);
		System.out.println("Police age :"+this.age);
		System.out.println("Police work experience :"+this.experience);
	}
	Police(String name,int age,int experience)
	{
		this.name=name;
		this.age=age;
		this.experience=experience;
		System.out.println("Police name :"+this.name);
		System.out.println("Police age :"+this.age);
		System.out.println("Police work experience :"+this.experience);
	}
}
		