package com;

public class Throws {
	
		  static void checkAge(int age) throws ArithmeticException {
			  
		    if (age < 18) {
		    	
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		    	
		      System.out.println("Access granted!");
		    }
		  }

		  public static void main(String[] args) {
			  
		    checkAge(35); // Set age to 15 (which is below 18...)
		  }

}
