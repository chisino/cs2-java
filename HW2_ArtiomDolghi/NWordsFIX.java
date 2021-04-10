// Name: Artiom Dolghi

import java.util.Scanner;

public class NWordsFIX {

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

		for (int i = 0;i < numWords;i++) {
			String word = words[i];

			if (i < word.length()) {
				System.out.println("char #" + i + " = " + word.charAt(i));
			} else {
				System.out.println("Word + " + word + " is too short to get char #" + i);
			}
		}

	}

}
