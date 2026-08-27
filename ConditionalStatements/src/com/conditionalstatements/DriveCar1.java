package com.conditionalstatements;

import java.util.Scanner;

public class DriveCar1 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
	
		if(age>18) 
		{
			System.out.println("Do you have license?");
			String hasLicense=sc.next();
			if(hasLicense.equals("Yes")) 
			{	
				System.out.println("can drive car");
			}
			else 
			{
				System.out.println("do not have valid license");
			}
			
		}
		else {
		System.out.println("cannot drive car");
		}
	}
}


