package com.loops;

import java.util.Scanner;

public class Tables {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Table:");
		int num=sc.nextInt();
		
		System.out.println("No.of Times:");
		int times=sc.nextInt();
		
		for(int i=1;i<=times;i++) {
			
			System.out.println(num + " "+"X" +" "+ i +" "+ "="+" " +(num * i));	
			
		}
		System.out.println("Reverse Table:");
		
		for(int i=times;i>=1;i--) {
			
			System.out.println(num +" X " + i + " = "+ (num * i));	
			
			
		}
		
		
	}

}
