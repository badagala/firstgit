package com.gss.basics;

import java.util.Scanner;

public class FactorialOfNumberRecursion {
	
	static int factorial(int n) {
		if(n <=1 )
		return 1;
		
		return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		
		System.out.println("Please enter the factorial of a number :");
		
		int num=value.nextInt();
		value.close();
		
		int result=factorial(num);
		System.out.printf("%d! = %d", num,result);
		
		
	}

}
