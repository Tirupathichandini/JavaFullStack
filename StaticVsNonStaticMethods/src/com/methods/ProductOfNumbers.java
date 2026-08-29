package com.methods;

public class ProductOfNumbers {
	
	public static void main(String[] args) {
		
		ProductOfNumbers n = new ProductOfNumbers();
		
		n.product();
		
		product(5,2);
		
		int res = productOfNum(2,3);
		System.out.println(res);
		
		int res1 = n.productOfNumbers(3,4);
		System.out.println(res1);
		
		
		System.out.println(res1-res);
		
	}

	void product() {		//instance method
		
		int a= 5;
		int b= 4;
		int c= a*b;
		System.out.println(c);
		
	}
	
	static void product(int a, int b) {   //this is static method, we can directly call them,no need to create object for static methods.
		
		int c=a*b;
		System.out.println(c);
	}
	
	static int productOfNum(int a,int b) {
		
		int c=a*b;
		return c;
	}
	
	int productOfNumbers(int a,int b) {		//instance method
		
		int c=a*b;
		return c;
	}
	
}
