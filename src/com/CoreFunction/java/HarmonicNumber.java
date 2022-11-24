package com.CoreFunction.java;

/**
 * 
 * @author Kapil
 *
 */
import java.util.Scanner;

public class HarmonicNumber {
	
	//This is a main function
	public static void main(String[] args) {
		System.out.println("Enter The number: ");   //print the number till num value
		Scanner scanner = new Scanner(System.in);   //create an object scanner class
		int num = scanner.nextInt();    //Take a Integer and Assigne value variable
		double result = 0.0;
			
		/*
		 * using for loop
		 * calculating Harmonic value
		 * i-- >decrementing numbers	
		 */
		for (int i = num; i > 0; i--) {
		result = result + (double) 1 / num; 
		System.out.println("The Harmonic Series is: " + result);
	     }
		scanner.close();
	 }
}
