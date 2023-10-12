package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.MultiplicationInterface;
import com.velocity.microproject.maintest.UserInput;

public class MultiplicationImplementation implements MultiplicationInterface {

	@Override
	public double multiplyTwoNumbers() {
		UserInput userinput=new UserInput();
		userinput.userInput_TwoNumbers();
		double a= userinput.getA();
		double b= userinput.getB();
		double c= a*b;
		return c;
	}

}
