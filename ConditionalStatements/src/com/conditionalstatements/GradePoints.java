package com.conditionalstatements;

import java.util.Scanner;

public class GradePoints {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		if(num>90 && num<100) {
			System.out.println("Grade A");
		}
		else if(num>80 && num<90) {
			System.out.println("Grade B");
		}
		else if(num>70 && num<80) {
			System.out.println("Grade C");
		}
		else if(num>60 && num<70) {
			System.out.println("Grade D");
		}
		else if(num>35 && num<60) {
			System.out.println("Grade E");
		}
		else if(num>0 && num<35) {
			System.out.println("failed");
		}
		else {
			System.out.println("Inavlid");
		}
		
	}

}
