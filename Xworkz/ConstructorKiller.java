class ConstructorKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking Wood in ConstructorKiller");
		Wood wood=new Wood("Pine","Chair");
		Wood wood1=new Wood("Pine","Door",10000);
		Wood wood2=new Wood("Pine","Door",10000,"Furniture",10);
		System.out.println("------------------------------------------");
		System.out.println("Invoking Mall in ConstructorKiller");
		Mall mall=new Mall("Zara");
		Mall mall1=new Mall("Zara",4,"Banglore",500,"LULU Mall");
		Mall mall2=new Mall("Zara",4,"Banglore",500,"LULU Mall",12,true);
		System.out.println("------------------------------------------");
		System.out.println("Invoking Park in ConstructorKiller");
		Park park=new Park("Gandhi Park",6,"Shimoga");
		Park park1=new Park("Gandhi Park",6,"Shimoga",false,3);
		Park park2=new Park("Gandhi Park",6,"Shimoga",false,3,true,500,false,30);
	}
}
		