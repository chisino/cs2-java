// Name: Artiom Dolghi

import java.util.Scanner;

public class VertexPolygon {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of vertexes: ");
		int numVertexes = keyboard.nextInt();
		
		double[] xVertices = new double[numVertexes];
		double[] yVertices = new double[numVertexes];
		
		for(int i = 0;i<numVertexes;i++) { 
			System.out.print("Enter x and y of a point with a space in between: ");
			double xI = keyboard.nextDouble();
			double yI = keyboard.nextDouble();
			xVertices[i] = xI;
			yVertices[i] = yI;
		}
		
		keyboard.close();
		
		// Referenced https://www.mathopenref.com/coordpolygonarea2.html
		// (got there from the "calculate" link in the HW assignment)
		// for this part below
		
		double area = 0.0;
		int j = numVertexes - 1;
		
		for(int i = 0;i<numVertexes;i++) {
			area += (xVertices[j] + xVertices[i]) * (yVertices[j] - yVertices[i]);
			j = i;
		}
		
		area = Math.abs(area / 2.0);
		
		System.out.print("The area of the polygon is: " + area);
	
	}

}
