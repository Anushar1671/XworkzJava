//carpenter, electrician,trainer,trainee,contracter  (10 method,2 different methods overloaded,4 methods with parameter,calling method of same class)

class Carpenter1{
	
	//overloading method skill
	static void skill()
	{
		System.out.println("Running skill() in Carpenter");
	}
	
	static void skill(String name)
	{
		System.out.println("Running skill(String) in Carpenter and his name is "+name);
	}
	
	
	//overloading method measure 
	
	static void measure(int length)
	{
		System.out.println("Measuring the length ="+length);
	}
	
	static void measure(int length,int breadth)
	{
		System.out.println("Measuring the length ="+length +"and breadth = "+breadth);
	}
	
	//methods with parameter
	
	static void details(String name)
	{
		System.out.println("The name of the carpenter is "+name);
	}
	
	static void contact(long phoneNumber)
	{
		System.out.println("The contact detail of carpenter is "+phoneNumber);
	}
	
	static void address(String address)
	{
		System.out.println("The address of carpenter is "+address);
	}
	
	static void experience(int exp)
	{
		System.out.println("The experience of carpenter is "+exp);
	}
	
	//method with our wish
	
	static void frame()
	{
		System.out.println("Running frame in carpenter");
		
		//calling method inside a method.
		repair();
	}
	
	static void repair()
	{
		System.out.println("Running repair in Carpenter");
	}
	
	
}