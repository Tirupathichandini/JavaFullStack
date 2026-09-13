package com.lambdaexpressions;

public class TestProduct {
	
	public static void main(String[] args) {
	
	 Product p = (a,b) -> { 
		 
		 	System.out.println("Starting multiplication...");
			int c = a * b;
			return c;
			
	 };
	
	//System.out.println(p.mul(5,4));
	
	int res = p.mul(2,3);
	System.out.println(res);
	
	}
	
}
