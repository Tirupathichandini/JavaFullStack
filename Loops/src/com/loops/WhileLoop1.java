package com.loops;

import java.util.Scanner;

public class WhileLoop1 {
	
	public static void main(String[] args) {
		
		int i=15;
		while(i>10) {
			
				System.out.println(i+":hai");
				i--;
		}
		
		// take input 5 times and print
		
		Scanner sc = new Scanner(System.in);
		
		for(int j=1;j<=5;j++){
			
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println(num);
		
		}
		
		sc.close();
	}

}
