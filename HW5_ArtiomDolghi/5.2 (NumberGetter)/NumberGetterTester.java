// Name: Artiom Dolghi

public class NumberGetterTester {

	public static void main(String[] args) {
		
		Downcounter down = new Downcounter(4);
		
		double val = 0.0;
		double min = 3.0;
		double max = 6.0;
		
		String promptUnlim = "Enter a number: ";
		String promptLim = "Enter a number between " + min + " and " + max + ": ";
		
		val = NumberGetter.getDouble(down, promptUnlim);
		System.out.println(val);
		val = NumberGetter.getDouble(null, promptUnlim);
		System.out.println(val);
		
		val = NumberGetter.getDouble(down, promptLim, min, max);
		System.out.println(val);
		val = NumberGetter.getDouble(null, promptLim, min, max);
		System.out.println(val);
		
		val = NumberGetter.getDouble(down);
		System.out.println(val);
		val = NumberGetter.getDouble(null);
		System.out.println(val);
		
		val = NumberGetter.getDouble(down, min, max);
		System.out.println(val);
		val = NumberGetter.getDouble(null, min, max);
		System.out.println(val);
		
		
	}

}
