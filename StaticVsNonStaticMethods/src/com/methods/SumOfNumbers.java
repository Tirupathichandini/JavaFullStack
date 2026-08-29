package com.methods;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		
		SumOfNumbers obj= new SumOfNumbers();
		obj.sum();
		obj.sub();							//non-static
		obj.subOfNumbers(10, 5);
		obj.subOfNumbers(20, 10);
		product(2,4);		//static
		product(3,1);		//static
		

		int cc=obj.productOfNumbers();		//non-static
		System.out.println(cc);

		int c=obj.productOfNumbers(4,5);
		System.out.println(c);				//non-static
		int c1=obj.productOfNumbers(3,2);
		System.out.println(c1);
		
		System.out.println(c*c1);
		System.out.println(c+c1);
		System.out.println(c-c1);
		
		int c3=productOfNum(7,1);	//static
		System.out.println(c3);
		
	}
	void sum() {
									//returntype methodName(){.......statements......}
		int a=10;
		int b=20;
		int c=a+b;					//these are non-static methods so we have to create object and call them.
		System.out.println(c);
	}
	void sub() {
		
		int a=6;
		int b=2;
		System.out.println(a-b);
		
	}
	void subOfNumbers(int a,int b) {
		
		int c=a-b;
		System.out.println(c);
		
	}
	static void product(int a, int b) {   //this is static method, we can directly call them,no need to create object for static methods.
		
		int c=a*b;
		System.out.println(c);
	}
	int productOfNumbers() {
		
		int a=3;				//here, returnType is int and it is non-static method, so we have to create object
								//and it is returning c value ,so we have to assign c value to a variable then we have to print c value.
		int b=4;
		int c=a*b;
		return c;
			
	}
	int productOfNumbers(int a,int b) {
		
		int c=a*b;
		return c;
	}
	static int productOfNum(int a,int b) {
		
		int c=a*b;
		return c;
	}
}
