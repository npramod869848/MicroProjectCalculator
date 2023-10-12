package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.ModulusInterface;
import com.velocity.microproject.maintest.UserInput;

public class ModulusImplementation  implements ModulusInterface{

	@Override
	public int modulusOfTwoNumbers() {
		UserInput userinput=new UserInput();
		userinput.userInput_TwoNumbers();
		double a= userinput.getA();
		double b= userinput.getB();
		int c= (int) (a%b);
		return c;
	}

}
