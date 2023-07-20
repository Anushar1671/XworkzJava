class PocketKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in PocketKiller");
		Pocket pocket=new Pocket();
		System.out.println(pocket.ref);
		System.out.println(pocket.ref1);
		System.out.println(pocket.ref2);
		System.out.println(pocket.number);
		System.out.println(pocket.money);
		System.out.println("-------------------");
		pocket.ref="Shirt";
		pocket.ref1="Pant";
		pocket.ref2="Bag";
		pocket.number=3;
		pocket.money=3000;
		System.out.println(pocket.ref);
		System.out.println(pocket.ref1);
		System.out.println(pocket.ref2);
		System.out.println(pocket.number);
		System.out.println(pocket.money);
		System.out.println("=====================");
		Pocket pocket1=new Pocket();
		System.out.println(pocket1.ref);
		System.out.println(pocket1.ref1);
		System.out.println(pocket1.ref2);
		System.out.println(pocket1.number);
		System.out.println(pocket1.money);
		System.out.println("-------------------");
		pocket1.ref="Shirt";
		pocket1.ref1="Pant";
		pocket1.ref2="Bag";
		pocket1.number=2;
		pocket1.money=2000;
		System.out.println(pocket1.ref);
		System.out.println(pocket1.ref1);
		System.out.println(pocket1.ref2);
		System.out.println(pocket1.number);
		System.out.println(pocket1.money);
	}
}