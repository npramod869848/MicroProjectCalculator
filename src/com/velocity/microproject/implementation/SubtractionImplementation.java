package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.SubtractionInterface;
import com.velocity.microproject.maintest.UserInput;

public class SubtractionImplementation implements SubtractionInterface{

	@Override
	public double subtractTwoNumbes() {
		UserInput userinput=new UserInput();
		userinput.userInput_TwoNumbers();
		double a= userinput.getA();
		double b= userinput.getB();
		double c= a-b;
		return c;
	}

}
