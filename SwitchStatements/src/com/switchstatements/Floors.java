package com.switchstatements;

import java.util.Scanner;

public class Floors {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Floor number:");
		
		int floornum = sc.nextInt();
		
		
		//switch by using integers
		
		switch(floornum) {
		
		case 1:
			System.out.println("Floor 1 Reached");
			break;
			
		case 2:
			System.out.println("Floor 2 Reached");
			break;
			
		case 3:
			System.out.println("Floor 3 Reached");
			break;
			
		default:
			System.out.println("Invalid Floor");
		
		}
		
		
		//switch by using characters
		
		
		switch('B') {
		
		case 'A':
			System.out.println("A Letter");
			break;
			
		case 'B':
			System.out.println("B Letter");
			break;
			
		case 'c':
			System.out.println("C Letter");
			break;
		
		default:
			System.out.println("Invalid Case");
		}
			
			
		//switch by using strings
		
		switch("sri") {
		
		case "sri":
			System.out.println("I am sri");
			break;
			
		case "Ramya":
			System.out.println("I am Ramya");
			break;
			
		case "sai":
			System.out.println("I am sai");
			break;
			
		default:
			System.out.println("Invalid name");
		}
		
		
	}

}
