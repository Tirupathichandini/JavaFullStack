package com.conditionalstatements;

import java.util.Scanner;

public class DriveCar 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		if(age>18) 
		{
			System.out.println("Do you have license?");
			boolean haslicense=sc.nextBoolean();
			if(haslicense) 
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


