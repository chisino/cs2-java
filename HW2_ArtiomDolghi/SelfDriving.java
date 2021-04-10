// Name : Artiom Dolghi

import java.util.Random;

public class SelfDriving {

	public static void main(String[] args) throws InterruptedException {
		final int YELLOW_DELAY = 1000; // milliseconds (1 and 4 seconds)
		final int RED_DELAY = 4000;
		
		final int SHORT_TRIP_LENGTH = 10;
		final int LONG_TRIP_LENGTH = 20;
		
		final int min = 0;
		final int max = 2;
		
		// Referenced https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
		// for generating random numbers in a range
		
		Random numGen = new Random();
		
		int numTrips = numGen.nextInt((LONG_TRIP_LENGTH - SHORT_TRIP_LENGTH) + 1) + SHORT_TRIP_LENGTH;
		
		for (int i = 0;i < numTrips;i++) {
			
			int randLight = numGen.nextInt((max - min) + 1) + min;
			
			switch (randLight) {
			case 0: System.out.println("Going");
					break;
			
			case 1: System.out.println("Slowing down");
					Thread.sleep(YELLOW_DELAY);
					break;
				
			case 2: System.out.println("Waiting");
					Thread.sleep(RED_DELAY);
					break;
			}

		}
		
	}

}
