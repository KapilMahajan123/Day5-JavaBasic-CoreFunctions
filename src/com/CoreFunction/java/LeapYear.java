package com.CoreFunction.java;

/**
 * 
 * @author Kapil
 *
 */
import java.util.Scanner;
public class LeapYear {
	
	public static void main(String[] args) {
       /*
	    *leap year program
		*/
		System.out.println("Enter any year");
		Scanner scanner = new Scanner(System.in);  //Create an object
		
		 //Take integer variable year 
		 //And Assign value to the variable
		int year = scanner.nextInt();     
		
		/*
		 * Check if the year is divisible by 400
		 * check if the year is divisible by 4 but not 100
		 * Display Leap Year Otherwise Not Leap Year
		 */
		if(year % 400 == 0 && year % 100 == 0 || year % 100 != 0 && year % 4 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");	
	
	}
	
}
