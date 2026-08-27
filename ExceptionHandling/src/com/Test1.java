package com;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter num1:");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2:");
			
			int num2 = sc.nextInt();
			
			System.out.println(num1/num2);
			
			System.out.println("hello");
			
		}
		catch(Exception ex) {
			
			System.out.println("Arithmetic Exception");
		}
	}

}
