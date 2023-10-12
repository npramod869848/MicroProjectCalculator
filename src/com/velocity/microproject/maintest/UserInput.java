package com.velocity.microproject.maintest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	
	// global variables
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	Scanner scanner;
	int x;
	
	// getter methods to get value of number in other class
	public double getA() {         
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}

    public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}
	

  //  method to enter one double number from user 
	public double userInput_SingleNumbers() {
		
		try {                     // try block             
		scanner = new Scanner(System.in);
		System.out.println("Enter the Number >> ");
		a= scanner.nextDouble();
		}
		// catch block to handle inputMistmatch Exception
		catch(InputMismatchException e) {
			System.out.println("Invalid Input. Please enter numbers in digit again...");
			userInput_SingleNumbers();
		}
		finally {                // finally block to close resources
			scanner.close();
		}
		return a;                // return double number
	}
	
     //  method to enter one integer number from user for choice 9 and 10
	public int userInput_SingleIntNumbers() {
		
		try {
		 scanner = new Scanner(System.in);
		 System.out.println("Enter the Number >> ");
		 x=scanner.nextInt();
		
	
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input. Please enter integer number  again...");
			userInput_SingleIntNumbers();
			
		}
		finally {
			scanner.close();
		}
		return x;
	}

    //  method to enter two double numbers from user
	public void userInput_TwoNumbers() {
		try {                             
		 scanner = new Scanner(System.in);
		System.out.println("Enter First Number >> ");
		a= scanner.nextDouble();
		System.out.println("Enter Second Number >> ");
		b= scanner.nextDouble();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input. Please enter numbers in digit again...");
			userInput_TwoNumbers();
		}
		finally {
			scanner.close();
		}
	}
	
   //  method to enter five double numbers  from user
	public void userInput_FiveNumbers() {
		try {
		scanner = new Scanner(System.in);
		System.out.println("Enter First Number >> ");
		a= scanner.nextDouble();
		System.out.println("Enter Second Number >> ");
		b= scanner.nextDouble();
		System.out.println("Enter Third Number >> ");
		c= scanner.nextDouble();
		System.out.println("Enter Fourth Number >> ");
		d= scanner.nextDouble();
		System.out.println("Enter Fifth Number >> ");
		e= scanner.nextDouble();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input. Please enter numbers in digit again...");
			userInput_FiveNumbers();
		}
		finally {
			scanner.close();
		}
	}

}
