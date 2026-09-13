package com.defaultandstaticmethods;

@FunctionalInterface
public interface Vehicle {
	
	void car();
	
	default void auto() {
		
		System.out.println("Auto is vehicle..");
	}

	static void changeGear() {
		
		System.out.println("vehicle Gear Changed..");
	}
}
