// Name: Artiom Dolghi

import java.util.Scanner;

public class NumberGetter {
	
	final static String DEFAULT_PROMPT = "Enter a number";
	
	public static double getDouble(Downcounter attempts, String prompt) {
		
		double num = 0.0;
		boolean check = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (check == false) {
			System.out.print(prompt);
			if (keyboard.hasNextDouble()) {
				num = keyboard.nextDouble();
				check = true;
				break;
			} else {
				try {
					if (attempts != null) {
						attempts.downcount();
					}
				} catch(Exception e) {
					keyboard.close();
					System.out.print("No more attempts available");
					System.exit(1);
				}
				
				System.out.println("Invalid value, try again");
			}
			keyboard.nextLine();
		}
		return num;
	}
	
	public static double getDouble(Downcounter attempts, String prompt, double min, double max) {
		
		double num = 0.0;
		boolean check = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (check == false) {
			System.out.print(prompt);
			if (keyboard.hasNextDouble()) {
				num = keyboard.nextDouble();
				if (num >= min && num <= max) {
					check = true;
					break;
				}
			}
				try {
					if (attempts != null) {
						attempts.downcount();
					}
				} catch(Exception e) {
					keyboard.close();
					System.out.print("No more attempts available");
					System.exit(1);
				}
				
				System.out.println("Invalid value, try again");
			
			keyboard.nextLine();
		}
		return num;
	}
	
	
	public static double getDouble(Downcounter attempts) {
		
		String prompt = DEFAULT_PROMPT;
		prompt = prompt + ": ";
		
		double num = 0.0;
		boolean check = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (check == false) {
			System.out.print(prompt);
			if (keyboard.hasNextDouble()) {
				num = keyboard.nextDouble();
				check = true;
				break;
			} else {
				try {
					if (attempts != null) {
						attempts.downcount();
					}
				} catch(Exception e) {
					keyboard.close();
					System.out.print("No more attempts available");
					System.exit(1);
				}
				
				System.out.println("Invalid value, try again");
			}
			keyboard.nextLine();
		}
		return num;
	}
	
	
	public static double getDouble(Downcounter attempts, double min, double max) {
		
		double num = 0.0;
		boolean check = false;
		
		String prompt = DEFAULT_PROMPT;
		prompt = (prompt + " between " + min + " and " + max +": ");
		
		Scanner keyboard = new Scanner(System.in);
		
		while (check == false) {
			System.out.print(prompt);
			if (keyboard.hasNextDouble()) {
				num = keyboard.nextDouble();
				if (num >= min && num <= max) {
					check = true;
					break;
				}
			}
				try {
					if (attempts != null) {
						attempts.downcount();
					}
				} catch(Exception e) {
					keyboard.close();
					System.out.print("No more attempts available");
					System.exit(1);
				}
				
				System.out.println("Invalid value, try again");
			
			keyboard.nextLine();
		}
		return num;
	}
	
	
}
