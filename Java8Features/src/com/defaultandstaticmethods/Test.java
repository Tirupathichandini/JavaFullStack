package com.defaultandstaticmethods;


public class Test implements Vehicle{
	
	public static void main(String[] args) {
		
		Test T = new Test();
		T.car();
		T.auto();
		Vehicle.changeGear();    //static method
		
	}
	
	public void car() {
		
		System.out.println("Car is vehicle..");
	}
		
}	



