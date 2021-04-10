// Name: Artiom Dolghi

public class Aircraft {
	// Attributes
	private String make;
	private double cruisingSpeed;
	private double range;
	
	// Constructors
	public Aircraft(String make, double cruisingSpeed, double range) {
		initialize3(make, cruisingSpeed, range);
	}
	
	// Getters
	public String getMake()   	   		{ return make; 	        }
	public double getcruisingSpeed()    { return cruisingSpeed; }
	public double getRange()   			{ return range;         }
	
	// Helper methods
	private boolean validateMake(String make) {
		if (make.equals("")) {
			return false;
		}
		return true;
	}
	
	private void initialize3(String make, double cruisingSpeed, double range) {
		if(!validateMake(make)) throw new RuntimeException();
		this.make = make;
		
		if ( (cruisingSpeed < 100) || (cruisingSpeed > 1000) ) throw new RuntimeException();
		this.cruisingSpeed = cruisingSpeed;
		
		if ( (range < 10) || (range > 10000) ) throw new RuntimeException();
		this.range = range;
	}
	
	// Overridden methods
	public String toString() { 
		return make + ", " + cruisingSpeed + ", " + range;
	}
	
}
