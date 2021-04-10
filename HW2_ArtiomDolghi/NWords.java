// Name: Artiom Dolghi

import java.util.Scanner;

public class NWords {

	public static void main(String[] args) {
		int numWords = 5;
		
		Scanner keyboard = new Scanner(System.in);
		String[] words = new String[numWords];
		System.out.print("Enter " + numWords + " words: ");
		
		for (int i = 0;i<numWords;i++) {
			String word = keyboard.next();
			words[i] = word;
		}
		
		keyboard.close();
		
		int iVal = 2;
		
		int length = words[iVal].length();
		
		if (iVal >= (length - 1)) {
			System.out.print(words[iVal].charAt(length-1));
		}
		
		else {
			System.out.print(words[iVal].charAt(iVal));
		}
		
	}

}
