package com.switchstatements;

import java.util.Scanner;

public class DaysOfWeek {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter day:");
		int day=sc.nextInt();
		
		//switch case
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;	
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
		}
		
		
		//if-else-if
		
		if(day==1) {
			
			System.out.println("Monday");
			
		}
		else if(day==2) {
			
			System.out.println("Tuesday");
		}
		else if(day==3) {
			
			System.out.println("Wednesday");
		}
		else if(day==4) {
			
			System.out.println("Thursday");
		}
		else if(day==5) {
			
			System.out.println("Friday");
		}
		else if(day==6) {
			
			System.out.println("Saturday");
		}
		else if(day==7) {
			
			System.out.println("Sunday");
		}
		else {
			
			System.out.println("Invalid day");
		}
		
		
		//ternary operator
		
		String weekdays = day==1?"MOnday":day==2?"Tuesday":
							day==3?"Wednesday":day==4?"Thursday":
							day==5?"Friday":day==6?"Saturday":
							day==7?"Sunday":"Invalid Day";
		
		System.out.println(weekdays);	
		
		
	}

}
