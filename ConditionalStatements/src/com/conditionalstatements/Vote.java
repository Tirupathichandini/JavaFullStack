package com.conditionalstatements;

import java.util.Scanner;

public class Vote {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("not eligible");
		}
		
	
}
}
