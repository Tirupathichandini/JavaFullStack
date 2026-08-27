package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2{
	
	public static void main(String[] args) {
		
		
		//Scanner sc= null;
		
		try {
			
			//sc= new Scanner(System.in);
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter num1:");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2:");
			
			int num2 = sc.nextInt();
			
			System.out.println(num1/num2);
			
		}
		catch(InputMismatchException ex) {
			
			System.out.println("Only Interger numbers Allowed");
			
		}
		catch(ArithmeticException ex) {
			
			System.out.println("Don't divide by zero");
			
		}
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		finally {
			
			System.out.println("Always Executed");
			//sc.close();
		}
	}

}
