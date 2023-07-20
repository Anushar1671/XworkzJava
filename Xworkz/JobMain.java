class JobMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Job in JobMain");
		Job.apply();
		Job.apply("Aishu",5);
		Job.apply("jeevan",5,"Abhi");
		Job.apply(5);
		Job.rejectOffer();
		System.out.println("--------------------------------");
		System.out.println("Invoking Resume in JobMain");
		Resume.format();
		Resume.format("profile");
		Resume.format("profile",3);
		Resume.clear();
		Resume.delete();
	}
}
	