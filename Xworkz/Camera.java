class Camera{
	static void click(String location,int date,int howManyPeople,String resolution,String clarity,String cameraMan)
	{
		System.out.println("Invoking click in Camera");
		if(location!=null)
		{
			System.out.println("Condition valid :"+location);
		}
		else
		{
			System.err.println("Condition invalid :"+location);
			return;
		}
		if(date==16)
		{
			System.out.println("Condition valid :"+date);
		}
		else
		{
			System.err.println("Condition invalid :"+date);
			return;
		}
		if(howManyPeople>=1)
		{
			System.out.println("Condition valid :"+howManyPeople);
		}
		else
		{
			System.err.println("Condition invalid :"+howManyPeople);
			return;
		}
		if(resolution!=null)
		{
			System.out.println("Condition valid :"+resolution);
		}
		else
		{
			System.err.println("Condition invalid :"+resolution);
			return;
		}
		if(clarity!=null)
		{
			System.out.println("Condition valid :"+clarity);
		}
		else
		{
			System.err.println("Condition invalid :"+clarity);
			return;
		}
		if(cameraMan!=null)
		{
			System.out.println("Condition valid :"+cameraMan);
		}
		else
		{
			System.err.println("Condition invalid :"+cameraMan);
			return;
		}		
		System.out.println("Camera information");

	}
}
		