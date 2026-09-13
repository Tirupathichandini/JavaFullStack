package com.lambdaexpressions;

public class TestCar {
	
	public static void main(String[] args) {
		
		//Lambda Expression
		Car c = ()->{System.out.println("4 Wheels");};
		
		c.noOfWheels();
		
	}

}
