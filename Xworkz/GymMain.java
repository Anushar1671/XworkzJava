class GymMain{
	public static void main(String[] args)
	{
		System.out.println("running main in GymMain");
		Gym gym=new Gym();
		System.out.println(gym.name);
		System.out.println(gym.use);
		System.out.println(gym.workOutType);
		System.out.println(gym.workOutType1);
		System.out.println(gym.fees);
		System.out.println("------------------");
		gym.name="Smart and fit";
		gym.use="General health";
		gym.workOutType="Push-up";
		gym.workOutType1="Squats";
		gym.fees=5000;
		System.out.println(gym.name);
		System.out.println(gym.use);
		System.out.println(gym.workOutType);
		System.out.println(gym.workOutType1);
		System.out.println(gym.fees);
		System.out.println("===================");
		Gym gym1=new Gym();
		System.out.println(gym1.name);
		System.out.println(gym1.use);
		System.out.println(gym1.workOutType);
		System.out.println(gym1.workOutType1);
		System.out.println(gym1.fees);
		System.out.println("------------------");
		gym1.name="Crunch";
		gym1.use="Fitness";
		gym1.workOutType="Cardio";
		gym1.workOutType1="Weight lifting";
		gym1.fees=10000;
		System.out.println(gym1.name);
		System.out.println(gym1.use);
		System.out.println(gym1.workOutType);
		System.out.println(gym1.workOutType1);
		System.out.println(gym1.fees);
	}
}