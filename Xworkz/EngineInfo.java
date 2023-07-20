class EngineInfo{
	static String getCCByModel(String CCByModel)
	{
		System.out.println("invoking the getCCByModel by engine");
		if(CCByModel!=null)
		{
			if("1197cc"==CCByModel)
			{
				return "swift";
			}
			if("1498cc"==CCByModel)
			{
				return "rapid";
			}
			if("2998cc"==CCByModel)
			{
				return "bmw";
			}
			if("1993cc"==CCByModel)
			{
				return "benz";
			}
			if("1197cc"==CCByModel)
			{	
				return "audi";
			}
			if("1198cc"==CCByModel)
			{
				return "bently";
			}
		}
		else
		{
			System.out.println("Given cc is not valid");
		}
		return "engine";
	}

public static void main(String[] args)
{
	String model=EngineInfo.getCCByModel("1197cc");
	System.out.println("Reference name is: " +model);
	String model1=EngineInfo.getCCByModel("1498cc");
	System.out.println("Reference name is: " + model1);
	String model2=EngineInfo.getCCByModel("2998cc");
	System.out.println("Reference name is: " + model2);
	String model3=EngineInfo.getCCByModel("1993cc");
	System.out.println("Reference name is: " + model3);
	String model4=EngineInfo.getCCByModel("1197cc");
	System.out.println("Reference name is: " + model4);
	String model5=EngineInfo.getCCByModel("1198cc");
	System.out.println("Reference name is: " + model5);

	}

}