package com.singleinheritance;

public class Test {
	
	public static void main(String[] args) {
		
//		Parent p = new Parent();
//		p.m1();
//		System.out.println(p.a);
//		System.out.println(p.b);
		
		Child c = new Child();
		c.b=12;
		System.out.println(c.b);
		c.m2();
		
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
	}

}
