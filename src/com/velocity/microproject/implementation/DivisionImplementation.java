package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.DivisionInterface;
import com.velocity.microproject.maintest.UserInput;

public class DivisionImplementation implements DivisionInterface {

	@Override
	public double divideTwoNumbers() {

		UserInput userinput=new UserInput();
		userinput.userInput_TwoNumbers();
		double a= userinput.getA();
		double b= userinput.getB();
		double c= a/b;
		return c;
	}

}
