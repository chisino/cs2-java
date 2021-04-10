// Name: Artiom Dolghi
// Assignment: HW1

import java.util.Scanner;

public class SummaryInfo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your last name: ");
		String lastName = keyboard.nextLine();
		System.out.print("Enter your first name: ");
		String firstName = keyboard.nextLine();
		System.out.print("Enter your age: ");
		int age = keyboard.nextInt();
		System.out.print("Enter your Suffolk ID: ");
		long sufID = keyboard.nextLong();
		
		keyboard.close();
		
		System.out.print("\n");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Suffolk ID: " + sufID);

	}

}
