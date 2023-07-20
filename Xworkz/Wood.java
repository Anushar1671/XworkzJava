class Wood{
	String name;
	String material;
	double cost;
	String use;
    float lenght;
	
	
	Wood()
	{
		System.out.println("Invoking no-arg constructor of wood");
	}
	
	Wood(String name)
	{
		this.name=name;
		System.out.println("Invoking String constructor of wood");
	}
	
	Wood(String name,String material)
	{
		this(name);
		this.material=material;
		System.out.println("Invoking String,String constructor of wood");
	}
	
	Wood(String name,String material,double cost)
	{
		this(name,material);		
		this.cost=cost;
		System.out.println("Invoking String,String,double constructor of wood");
	}
	
	Wood(String name,String material,double cost,String use)
	{
		this(name,material,cost);
		this.use=use;
		System.out.println("Invoking String,String,double,String constructor of wood");
	}
	
	Wood(String name,String material,double cost,String use,float lenght)
	{
		this(name,material,cost,use);
		this.lenght=lenght;
		System.out.println("Invoking String,String,double,String,float constructor of wood");
	}
}
	
	
	
	
	
	
	
	