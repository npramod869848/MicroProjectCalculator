package com.velocity.microproject.implementation;

import com.velocity.microproject.interfaces.AdditionInterface;
import com.velocity.microproject.maintest.UserInput;

public class AdditionImplementation implements AdditionInterface{

	@Override
	public double addTwoNumber() {            // abstract method overridden

     UserInput userinput=new UserInput();     // create object of UserInput class
     userinput.userInput_TwoNumbers();        // method calling take numbers from user
    double a= userinput.getA();               // access first user entered number
    double b= userinput.getB();               // access second user entered number
    double c= a+b;                            //  addition of two numbers
    return c;                                 // return addition of two numbers
    
	}

}
