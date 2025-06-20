package com.gss.basics;


public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		int num1=55, num2=75;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("The Resultant values of num1: "+num1+" The resultant value of num2 is:"+ num2);
		
	}

}
