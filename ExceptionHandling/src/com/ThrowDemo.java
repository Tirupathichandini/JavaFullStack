package com;

public class ThrowDemo {
	
	public static void main(String[] args) {
		
		demo();
		
	}

	static void demo() {
		
		try {
			
			System.out.println("Inside demo()");
			
			throw new NullPointerException("Exception Data");
		}
		catch(Exception ex) {
			
			System.out.println(ex);
		}
	}
}
