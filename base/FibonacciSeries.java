package com.gss.base;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int num,num1 = 0,num2=1;
		
		for(int i=0;i<=5;i++) {
		num=num1+num2;
		num1=num2;
		num2=num;	
		System.out.println(num);
		}
		
	}

}
