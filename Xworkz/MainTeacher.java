class MainTeacher{
	public static void main(String[] args)
	{
		System.out.println("running main in MainTeacher");
		Teacher teacher=new Teacher();
		System.out.println(teacher.name);
		System.out.println(teacher.subject);
		System.out.println(teacher.experience);
		System.out.println(teacher.rating);
		System.out.println(teacher.age);
		System.out.println("-------------------");
		teacher.name="Raghavendra";
		teacher.subject="DBMS";
		teacher.experience=13;
		teacher.rating=5;
		teacher.age=40;
		System.out.println(teacher.name);
		System.out.println(teacher.subject);
		System.out.println(teacher.experience);
		System.out.println(teacher.rating);
		System.out.println(teacher.age);
		System.out.println("===================");
		Teacher teacher1=new Teacher();
		System.out.println(teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.experience);
		System.out.println(teacher1.rating);
		System.out.println(teacher1.age);
		System.out.println("-------------------");
		teacher1.name="Ashwini";
		teacher1.subject="DMS";
		teacher1.experience=8;
		teacher1.rating=5;
		teacher1.age=35;
		System.out.println(teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.experience);
		System.out.println(teacher1.rating);
		System.out.println(teacher1.age);
	}
}