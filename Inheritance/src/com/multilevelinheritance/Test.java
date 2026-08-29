package com.multilevelinheritance;

public class Test {
	
	public static void main(String[] args) {
		
		EVCar c = new EVCar();
		
		System.out.println(c.batteryCapacity);
		
		c.chargeBattery();
		
		System.out.println("==========");
		
		System.out.println(c.numOfWheels);
		
		c.drive();
		
		System.out.println("==========");
		
		System.out.println(c.price);
		
		c.start();
			
	}

}
