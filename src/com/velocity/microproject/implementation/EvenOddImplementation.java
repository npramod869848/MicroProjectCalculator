package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.EvenOddInterface;
import com.velocity.microproject.maintest.UserInput;

public class EvenOddImplementation implements EvenOddInterface{

	@Override
	public String checkEverOddNumber() {
		UserInput userinput=new UserInput();
		int a= userinput.userInput_SingleIntNumbers();
		
		if(a%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
		
	}

}
