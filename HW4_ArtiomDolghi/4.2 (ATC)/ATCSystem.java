// Name: Artiom Dolghi

import java.time.LocalTime;
import java.util.ArrayList;

public class ATCSystem {

	public static void main(String[] args) {
		
		Airport jfk = new Airport("JFK", 40.64, 73.78);
		Airport lax = new Airport("LAX", 33.94, 118.41);
		Airport bos = new Airport("BOS", 42.37, 71.01);
		Airport ord = new Airport("ORD", 41.98, 87.84);
		
		Aircraft boeing = new Aircraft("Boeing 747", 570, 8357.4);
		Aircraft airbus = new Aircraft("Airbus A340", 541, 8000);
		
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		
		Flight flight1 = new Flight( boeing, jfk, lax, LocalTime.of(2, 15), LocalTime.of(4, 15) );
		Flight flight2 = new Flight( airbus, lax, bos, LocalTime.of(12, 30), LocalTime.of(18, 15) );
		Flight flight3 = new Flight( boeing, bos, ord, LocalTime.of(4, 45), LocalTime.of(7, 5) );
		Flight flight4 = new Flight( airbus, ord, jfk, LocalTime.of(8, 50), LocalTime.of(10, 15) );
		Flight flight5 = new Flight( boeing, bos, jfk, LocalTime.of(15, 10), LocalTime.of(18, 10) );
		
		flightList.add(flight1);
		flightList.add(flight2);
		flightList.add(flight3);
		flightList.add(flight4);
		flightList.add(flight5);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(flightList.get(i)); // printing flights
		}
		
	}
}
