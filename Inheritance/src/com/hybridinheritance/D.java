package com.hybridinheritance;

public class D implements B,C{
	
	
	public static void main(String[] args) {
		
		D d = new D();
		d.m1();
		
	}
	
	@Override
	public void m1() {
		System.out.println("M1");
	}

	@Override
	public void m3() {
		
	}

	@Override
	public void m2() {
		
	}	
		
}
