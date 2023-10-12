package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.CubeInterface;
import com.velocity.microproject.maintest.UserInput;

public class CubeImplementation implements CubeInterface{

	@Override
	public double cubeOfNumber() {
		UserInput userinput=new UserInput();
		double a=userinput.userInput_SingleNumbers();
		double c= a*a*a;
		return c;
	}

}
