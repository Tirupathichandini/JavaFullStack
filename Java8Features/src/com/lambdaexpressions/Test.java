package com.lambdaexpressions;

public class Test {

	public static void main(String[] args) {
		
		//Lambda Expression
		Sum s = (a,b) -> a+b;
		
		int res = s.add(100,20);
		System.out.println(res);
		
//		System.out.println(s.add(30,20));
		
		
	}
	
}
