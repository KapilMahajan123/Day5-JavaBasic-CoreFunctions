package com.CoreFunction.java;

/**
 * 
 * @author Kapil
 *
 */
import java.util.Scanner;

public class Distance {
	
	    //that takes two integer command-line arguments x and y
		//And prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
		// formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
		
		public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in); //scanner input
			System.out.println("Enter the value of x");
			 int x = scanner.nextInt();
			System.out.println("Enter the value of y");
			 int y = scanner.nextInt();
			 
			 double distance = Math.sqrt( x * x + y * y ); //formula for distance
			 System.out.println("Euclidean distance : " + distance);
			 
			 scanner.close();
	}

}
