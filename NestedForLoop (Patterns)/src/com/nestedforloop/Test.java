package com.nestedforloop;

public class Test {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {		//outer for loop
			
			System.out.println("i="+i);
			
			for(int j=1;j<=5 ;j++) {	//inner for loop
				
				System.out.println("j="+j);
			}
		}
	}

}
