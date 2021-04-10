// Name: Artiom Dolghi

public class Airport {
	// Attributes
	private String name;
	private double latitude;
	private double longitude;
	
	// Constructors
	public Airport(String name, double latitude, double longitude) {
		if(!validateName(name)) throw new RuntimeException();
		this.name = name;
		
		if ( (latitude < -90) || (latitude > 90) ) throw new RuntimeException();
		this.latitude = latitude;
		
		if ( (longitude < -180) || (longitude > 180) ) throw new RuntimeException();
		this.longitude = longitude;
	}
	
	// Getters
	public String getName()   	   { return name; 	   }
	public double getLatitude()    { return latitude;  }
	public double getLongitude()   { return longitude; }
	
	// Helper methods
	private boolean validateName(String name) {
		if (name.equals("")) {
			return false;
		}
		return true;
	}
	
	// Overridden methods
	public String toString() { 
		return name + ", " + latitude + ", " + longitude;
	}

}
