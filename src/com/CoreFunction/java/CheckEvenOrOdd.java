package com.CoreFunction.java;

/**
 * 
 * @author Kapil
 *
 */
import java.util.Scanner;

public class CheckEvenOrOdd {
	
	public static void main(String[] args) {
		
		//Java Program to Check Whether a Number is Even or Odd
		Scanner scanner = new Scanner(System.in); // scanner input
		System.out.println("Enter the number : ");
		int number = scanner.nextInt(); 
		 if(number % 2 == 0) // if number is divisble by 2
		System.out.println("Even number");
		 else
			 System.out.println("odd number");
		 
		 scanner.close();
		

	 }

}
