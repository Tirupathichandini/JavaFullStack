package com.methods;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name1:");
		String name1=sc.next();
		
		System.out.println("enter name2:");
		String name2=sc.next();
		
		
		Test obj=new Test();
		
		String s=obj.addStrings(name1, name2);
		System.out.println(s);
		
	}
	String addStrings(String name1,String name2) {
		
		String res=name1+" "+name2;   //String res=name1+name2;
		return res;

	}

}
