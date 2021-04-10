// Name : Artiom Dolghi

import java.util.*;

public class ForthInterpret {
	
	public static void push(ArrayList <Integer> stack, int x) {
		stack.add(x);
	}
	
	public static int pop(ArrayList <Integer> stack) {
		int element = stack.get(stack.size()-1);
		
		stack.remove(stack.size()-1);
		
		return element;
	}

	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> stack = new ArrayList<Integer>();
		
		Scanner keyboard = new Scanner(System.in);
		
		int valOne = 0;
		int valTwo = 0;
		double sqrConv = 0;
		String cmd = "";
		
		while (true) {
			
			System.out.print("> ");
			cmd = keyboard.next();
			
			if (cmd.compareTo("quit") == 0) {
				keyboard.close();
				break;
			}
		
			switch(cmd) {
		
			case ("+"):
				valOne = pop(stack);
				valTwo = pop(stack);
				push(stack, valOne+valTwo);
				break;
			case ("-"):
				valOne = pop(stack);
				valTwo = pop(stack);
				push(stack, valOne-valTwo);
				break;
			case ("/"):
				valOne = pop(stack);
				valTwo = pop(stack);
				push(stack, valOne/valTwo);
				break;
			case ("*"):
				valOne = pop(stack);
				valTwo = pop(stack);
				push(stack, valOne*valTwo);
				break;
			case ("."):
				System.out.println(pop(stack) + " " + "ok");
				break;
			case ("CR"):
				System.out.println();
				break;
			case ("dup"):
				valOne = stack.get(stack.size()-1);
				push(stack, valOne);
				break;
			case ("sqr"):
				valOne = stack.get(stack.size()-1);
				sqrConv = Math.sqrt(valOne);
				push(stack,(int)Math.round(sqrConv));
				break;
			default:
				int cmdNum = Integer.parseInt(cmd);
				push(stack, cmdNum);
			}
			
		}	
		
	}
	
}
