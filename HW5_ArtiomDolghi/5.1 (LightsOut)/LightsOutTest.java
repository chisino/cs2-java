// Name: Artiom Dolghi

import java.util.Scanner;
import java.util.Random;

public class LightsOutTest {

	public static void main(String[] args) {
		
		int m = 0;
		int n = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		m = keyboard.nextInt();
		System.out.println("Enter the number of columns: ");
		n = keyboard.nextInt();
		
		keyboard.close();
		
		LightsOut game = new LightsOut(m,n);
		
		Random nums = new Random();
		
		int i = 0;
		
		while (true) {
			game.togglePatch(nums.nextInt(m), nums.nextInt(n));
			System.out.println("Step " + i);
			i++;
			
			if ( game.isDark() || game.isWhite() ) {
				break;
			}
		}
		
		System.out.print("Game has been completed");
		
	}

}
