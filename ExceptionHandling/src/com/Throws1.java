package com;

public class Throws1 {

	    static void test() throws ArithmeticException {
	    	
	    try {
	    		
	        int a = 10 / 2;
	        System.out.println(a);
	    }
	    catch(ArithmeticException ex) {
	    	
	    	System.out.println(ex.getMessage());
	    }
	    
	    }
	    public static void main(String[] args) {
	    	
	        test();
	    }
}


