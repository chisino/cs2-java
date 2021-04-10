// Name: Artiom Dolghi
// Assignment: HW1

import java.util.Scanner;

public class EllipsoidVol {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter length a: ");
		double a = keyboard.nextDouble();
		System.out.print("Enter length b: ");
		double b = keyboard.nextDouble();
		System.out.print("Enter length c: ");
		double c = keyboard.nextDouble();
		
		keyboard.close();
		
		double vol = (4.0/3.0) * Math.PI * a * b * c;
		
		System.out.println("The volume of the ellipsoid is " + vol);
				
	}

}
