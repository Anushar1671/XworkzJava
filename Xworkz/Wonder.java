class Wonder{
		public static void main(String[] args)
		{
			System.out.println("Running Wonder in main...");
			String pyramidOfGiza="Great Pyramid of Giza";
			String gardenOfBabylon="Hanging Garden of Babylon";
			String templeOfArtemis="Temple of Artemis at Ephesus";
			String statueOfZeus="Statue of Zeus at Olympia";
			String mausoleum="Mausoleum at Halicarnassus";
			String colossus="Colossus of Rhodes";
			String lightHouse="Light House of Alexandria";
			String[] wonder={pyramidOfGiza,	gardenOfBabylon, templeOfArtemis, statueOfZeus, mausoleum, colossus, lightHouse};
			
			int total=wonder.length;
			
			for(int wonders=0;wonders<wonder.length;wonders++)
			{
				String ref=wonder[wonders];
				System.out.println("Wonder of the world "+ref+" is "+wonders);
			}
			System.out.println("-------------------------------------");
			System.out.println("Wonder at index 2 before change "+wonder[2]);
			wonder[2]="Taj Mahal";
			System.out.println("Wonder at index 2 after change "+wonder[2]);
			System.out.println("-------------------------------------");
			for(int wonders=wonder.length-1;wonders>=0;wonders--)
			{
				String ref=wonder[wonders];
				System.out.println("Wonder of the world "+ref+" is "+wonders);
			}
		}
}
			
