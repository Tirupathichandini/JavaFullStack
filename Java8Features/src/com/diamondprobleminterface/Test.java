package com.diamondprobleminterface;

public class Test implements Room1,Room2{
	
	public void laptop() {
		
		
		Room1.super.laptop(); 	//non-static
		Room2.laptop();			//static
		 
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.laptop();
		
	}
	
}
