package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.AverageInterface;
import com.velocity.microproject.maintest.UserInput;

public class AverageImplementation implements AverageInterface{



	@Override
	public double averageOfNumbers() {
		UserInput userinput=new UserInput();
		userinput.userInput_FiveNumbers();
		double a= userinput.getA();
		double b= userinput.getB();
		double c= userinput.getC();
		double d= userinput.getD();
		double e= userinput.getE();
		
		double sum= a+b+c+d+e;
		System.out.println("Total sum is >> "+sum);
		
		double average= sum/5;
		return average;
	}

}
