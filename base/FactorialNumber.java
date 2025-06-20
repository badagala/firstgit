package com.gss.base;

public class FactorialNumber {
	
	public static void main(String[] args) {
		int num=2,factorial=1;
		for(int i=1;i<=num;i++) {
			factorial *=i;
		}
		System.out.println("2 Factorial is : "+factorial);
	}

}
