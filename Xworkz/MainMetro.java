class MainMetro{
	public static void main(String[] args)
	{
		System.out.println("running main in MainMetro");
		Metro metro=new Metro();
		System.out.println(metro.lineColor);
		System.out.println(metro.exit);
		System.out.println(metro.station);
		System.out.println(metro.entry);
		System.out.println(metro.trackWidth);
		System.out.println("-------------------");
		metro.lineColor="PurpleLine";
		metro.entry="Door open";
		metro.exit="Door Close";
		metro.station="Rajaji nagar";
		metro.trackWidth=4;
		System.out.println(metro.lineColor);
		System.out.println(metro.exit);
		System.out.println(metro.station);
		System.out.println(metro.entry);
		System.out.println(metro.trackWidth);
		System.out.println("=====================");
		Metro metro1=new Metro();
		System.out.println(metro1.lineColor);
		System.out.println(metro1.exit);
		System.out.println(metro1.station);
		System.out.println(metro1.entry);
		System.out.println(metro1.trackWidth);
		System.out.println("-------------------");
		metro1.lineColor="GreenLine";
		metro1.entry="Door open";
		metro1.exit="Door Close";
		metro1.station="Majestic";
		metro1.trackWidth=4;
		System.out.println(metro1.lineColor);
		System.out.println(metro1.exit);
		System.out.println(metro1.station);
		System.out.println(metro1.entry);
		System.out.println(metro1.trackWidth);
	}
}