package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		int res = divide();
		System.out.println(res);
		
	}
	static int divide(){
		
		try {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter n1:");
				int num1 = sc.nextInt();
				
				System.out.println("Enter n2:");
				int num2 = sc.nextInt();
				
				
				int res = num1/num2;
				return res;
				
		}
		catch(ArithmeticException ex) {
				
				System.out.println("cannot divide by zero!!!");
				return 9;
				
		}
		catch(InputMismatchException ex) {
			
			System.out.println(ex);
			return 3;
		}
		finally {
			System.out.println("Always Executed");
			//return 5;
		}
		
	}

}
