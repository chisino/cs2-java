// Name: Artiom Dolghi

import java.time.LocalTime;

public class Flight {
	// Attributes
	private Aircraft plane;
	private Airport origin;
	private Airport destination;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	
	// Constructors
	public Flight(Aircraft plane, Airport origin, Airport destination, LocalTime departureTime, LocalTime arrivalTime) {
		this.plane = plane;
		
		// Calculating distance
		double latA = (origin.getLatitude() / 180) * Math.PI;
		double longA = (origin.getLongitude() / 180) * Math.PI;
		double latB = (destination.getLatitude() / 180) * Math.PI;
		double longB = (destination.getLongitude() / 180) * Math.PI;
		// 6371 = radius of Earth
		double distance = Math.acos(Math.sin(latA) * Math.sin(latB) + Math.cos(latA) * Math.cos(latB) * Math.cos(longB - longA)) * 6371;
		
		// Checking distance against range
		if (distance > plane.getRange()) throw new RuntimeException();
		
		// Making sure origin != destination
		if (origin.equals(destination)) throw new RuntimeException();
		this.origin = origin;
		this.destination = destination;
		
		// Making sure departure time < arrival time
		if (departureTime.compareTo(arrivalTime) >= 0) throw new RuntimeException();
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	
	// Getters
	public Aircraft getPlane()   	   	{ return plane; 	    }
	public Airport getOrigin()    		{ return origin;        }
	public Airport getDestination()   	{ return destination;   }
	public LocalTime getDepartureTime() { return departureTime; }
	public LocalTime getArrivalTime() 	{ return arrivalTime;   }
	
	// Setters
	public boolean changePlane(Aircraft newPlane) {
		if (!plane.equals(newPlane)) {
			plane = newPlane;
				return true;
		}
		else {
		return false;
		}
	}
	
	public boolean changeOrigin(Airport newOrigin) {
		if (!origin.equals(newOrigin)) {
			origin = newOrigin;
			return true;
		}
		else {
			return false;
			}
	}
	
	public boolean changeDestination(Airport newDestination) {
		if (!destination.equals(newDestination)) {
			destination = newDestination;
			return true;
		}
		else {
			return false;
			}
	}
	
	public boolean changeDepartureTime(LocalTime newDepartureTime) {
		if (!departureTime.equals(newDepartureTime)) {
			departureTime = newDepartureTime;
			return true;
		}
		else {
			return false;
			}
	}
	
	public boolean changeArrival(LocalTime newArrivalTime) {
		if (!arrivalTime.equals(newArrivalTime)) {
			arrivalTime = newArrivalTime;
			return true;
		}
		else {
			return false;
			}
	}
	
	// Overridden methods
	public String toString() { 
		return plane + ", " + origin + ", " + destination + ", " + departureTime + ", " + arrivalTime;
	}
	
}
