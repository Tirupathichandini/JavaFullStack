package com;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age:");
		
		int age = sc.nextInt();
		
//		try {
		
			if(age>18) {
				
				System.out.println("Eligible to vote");
			}
			else {
				
				throw new InvalidAgeException("Age below 18");
			}
//		}
//		catch(InvalidAgeException ex) {
//			
//			System.out.println(ex.getMessage());
//		}
	}
	
	

}
