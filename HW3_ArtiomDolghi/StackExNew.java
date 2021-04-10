// Name: Artiom Dolghi

import java.util.*;

public class StackExNew {
	
	public static void push(ArrayList <Integer> stack, int x) {
		stack.add(x);
	}
	
	public static int pop(ArrayList <Integer> stack) {
		int element = stack.get(stack.size()-1);
		
		stack.remove(stack.size()-1);
		
		return element;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> stack = new ArrayList<Integer>();
		
		Random numGen = new Random();
		
		int numInts = 10;
		
		for (int i = 0;i < numInts;i++) { // Initial print + push
			int num = numGen.nextInt(50);
			System.out.println(num);
			push(stack, num);
		}
		
		System.out.println();
		
		for (int i = 0;i < numInts;i++) { // Pop + print
			System.out.println(pop(stack));
		}

	}

}
