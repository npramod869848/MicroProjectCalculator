package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.SquareInterface;
import com.velocity.microproject.maintest.UserInput;

public class SquareImplementation implements SquareInterface {

	@Override
	public double squareOfNumber() {
		UserInput userinput=new UserInput();
		double a=userinput.userInput_SingleNumbers();
		double c= a*a;
		return c;
	}

}
