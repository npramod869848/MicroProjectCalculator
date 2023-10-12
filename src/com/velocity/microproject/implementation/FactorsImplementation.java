package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.FactorInterface;
import com.velocity.microproject.maintest.UserInput;

public class FactorsImplementation  implements FactorInterface{

	@Override
	public void factorsOfNumber() {

		UserInput userinput=new UserInput();
		int number= userinput.userInput_SingleIntNumbers();
		System.out.print("Factors are >> ");
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+ "  ");
			}
			
		}
		
	}

}
