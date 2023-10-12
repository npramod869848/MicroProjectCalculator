package com.velocity.microproject.maintest;

import java.util.Scanner;

import com.velocity.microproject.implementation.AdditionImplementation;
import com.velocity.microproject.implementation.AverageImplementation;
import com.velocity.microproject.implementation.CubeImplementation;
import com.velocity.microproject.implementation.DivisionImplementation;
import com.velocity.microproject.implementation.EvenOddImplementation;
import com.velocity.microproject.implementation.FactorsImplementation;
import com.velocity.microproject.implementation.ModulusImplementation;
import com.velocity.microproject.implementation.MultiplicationImplementation;
import com.velocity.microproject.implementation.SquareImplementation;
import com.velocity.microproject.implementation.SubtractionImplementation;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("Welcome to console based application \n");
		System.out.println("\t 1.Addition of two number");
		System.out.println("\t 2.Subtraction of two number");
		System.out.println("\t 3.Multiplication of two number");
		System.out.println("\t 4.Division of two number");
		System.out.println("\t 5.Modulus of two number");
		System.out.println("\t 6.Square of number");
		System.out.println("\t 7.Cube of number");
		System.out.println("\t 8.Average of numbers");
		System.out.println("\t 9.Factors of number");
		System.out.println("\t10.Find out even or odd number\n");
		
		// user input to enter the choice
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Choice- ");
		int choice = scanner.nextInt();
		
    
		switch (choice) { 
		
         case 1 :  AdditionImplementation add= new AdditionImplementation();  // create object of AdditionImplimination class
                   double addition =add.addTwoNumber();                       // method calling
                   System.out.println("Addition is >> "+addition);
                   break;
                   
         case 2:  SubtractionImplementation sub = new SubtractionImplementation();
                  double subtraction =sub.subtractTwoNumbes();
                  System.out.println("Subtraction is >> "+subtraction);
                  break;
                  
         case 3:  MultiplicationImplementation multi=new MultiplicationImplementation();
                  double multiplication =multi.multiplyTwoNumbers();
                  System.out.println("multiplication is >> "+multiplication);
                  break;
                  
         case 4:  DivisionImplementation div = new DivisionImplementation();
                  double division =div.divideTwoNumbers();
                  System.out.println("Division is >> "+division);
                  break; 
                  
         case 5:  ModulusImplementation mod= new ModulusImplementation();
                  int modulus = mod.modulusOfTwoNumbers();
                  System.out.println("Modulus is >> "+modulus);
                  break;
                  
         case 6:  SquareImplementation squareobj = new SquareImplementation();
                  double square = squareobj.squareOfNumber();
                  System.out.println("Square is >> "+square);
                  break;
                  
         case 7:  CubeImplementation cubeobj= new CubeImplementation();
                  double cube = cubeobj.cubeOfNumber();
                  System.out.println("Cube is >> "+cube);
                  break;
                  
         case 8:  AverageImplementation avg = new AverageImplementation();
                  double average = avg.averageOfNumbers();
                  System.out.println("Average is >> "+average);
                  break;
                  
         case 9:  FactorsImplementation factors= new FactorsImplementation();
                  factors.factorsOfNumber(); 
                  break;
                  
         case 10: EvenOddImplementation evenoddobj= new EvenOddImplementation();
                  System.out.println( evenoddobj.checkEverOddNumber());
                  break;
         
         default:  System.out.println("Invalid chioce. Enter choice between 1 to 10");         
    
    
      }
     scanner.close();
   	}

}
