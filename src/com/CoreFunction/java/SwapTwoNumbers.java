package com.CoreFunction.java;

/**
 * 
 * @author Kapil
 *
 */
import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		//Java Program to Swap Two Numbers
		Scanner scanner = new Scanner(System.in); //scanner input
		System.out.println("Enter first number : ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();
		
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("after swapping number will be : ");
		System.out.println("first number is : " + firstNumber);
		System.out.println("second number is : " + secondNumber);
		
		scanner.close();
	}
	
}
