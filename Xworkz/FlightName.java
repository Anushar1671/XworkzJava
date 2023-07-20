class FlightName{
		public static void main(String[] args)
		{
			System.out.println("Running Flight Name in main...");
			 String indiGo="IndiGo";
			 String airIndia="Air India";
			 String spiceJet="Spice Jet";
			 String vistara="Vistara";
			 String allianceAir="Alliance Air";
			 String saudia="Saudia";
			 String qatarAirways="Qatar Air Ways";
			 
			 String[] flightName={indiGo,airIndia,spiceJet,vistara,allianceAir,saudia,qatarAirways};
			 
			 int total=flightName.length;
			 
			 for(int flight=0;flight<flightName.length;flight++)
			 {
				 String ref=flightName[flight];
				 System.out.println("Flight name at "+ref+" is "+flight);
			 }
			 System.out.println("----------------------------------------------");
			 System.out.println("Flight name at position 6 before change "+flightName[6]);
			 flightName[6]="Air Arabia";
			 System.out.println("Flight name at position 6 after change "+flightName[6]);
			 System.out.println("----------------------------------------------");
			 for(int flight=flightName.length-1;flight>=0;flight--)
			 {
				 String ref=flightName[flight];
				 System.out.println("Flight name at "+ref+" is "+flight);
			 }
		}
}
