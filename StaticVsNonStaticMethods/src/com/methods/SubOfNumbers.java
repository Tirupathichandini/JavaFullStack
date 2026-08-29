package com.methods;

public class SubOfNumbers {
	
	public static void main(String[] args) {
		
	
	SubOfNumbers res= new SubOfNumbers();
	
	res.sub1();
	
	res.sub2(6,5);
	
	int n = res.sub3();
	System.out.println(n);
	
	int n1=res.sub4(10, 5);
	System.out.println(n1);
	
	sub5();
	
	int n2 = sub6(4,1);
	System.out.println(n2);
	
}
	
	void sub1() {		//void method without parameters		//non-static
					
		int a=40;
		int b=20;
		int c=a-b;
		System.out.println(c);
		
	}
	
	void sub2(int a, int b){		//void with parameters
			
		int c=a-b;
		System.out.println(c);
		
	}
	
	int sub3() {			//int without parameters and it returns value
		
		int m=6;
		int n=3;
		int res=m-n;
		return res;
		
	}
	int sub4(int a,int b) {			//int with parameters	//non-static method
		
		int r=a-b;
		return r;
		
	}
	
	static void sub5() {		//static method
		
		int a=8;
		int b=4;
		int c=a-b;
		System.out.println(c);
		
	}
	static int sub6(int a, int b) {		//static method
		
		int c=a-b;
		return c;
		
	}


}
