package com.loops;

import java.util.Scanner;

public class ForLoop2 {
	
	public static void main(String[] args) {
		
		//take input from user and print until input is 0
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numberr:");
		int num=sc.nextInt();
		System.out.println(num);
				
		while(num!=0) {
			
			System.out.println("Enter number:");
			num=sc.nextInt();
			System.out.println(num);
			}
				
		
	}

}
